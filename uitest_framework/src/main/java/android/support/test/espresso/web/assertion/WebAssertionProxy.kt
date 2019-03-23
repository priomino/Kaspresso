package android.support.test.espresso.web.assertion

import android.webkit.WebView
import android.support.test.espresso.web.model.Atom
import com.kaspersky.uitest_framework.interceptors.WebAssertionInterceptor
import org.hamcrest.Matcher
import org.hamcrest.StringDescription


class WebAssertionProxy<E>(
    private val webAssertion: WebAssertion<E>,
    atom: Atom<E>,
    private val matcher: Matcher<E>,
    private val interceptors: List<WebAssertionInterceptor>
) : WebAssertion<E>(atom) {

    /**
     * Calls interceptors before [WebViewAssertions.ResultCheckingWebAssertion.checkResult] on wrapped [webAssertion] is
     * called.
     *
     * @param view the WebView that the Atom was evaluated on.
     * @param result the result of atom evaluation.
     */
    override fun checkResult(view: WebView?, result: E) {

        interceptors.forEach { it.intercept(this, view, result as Any) }

        (webAssertion as WebViewAssertions.ResultCheckingWebAssertion).checkResult(view, result)
    }

    /**
     * @return a string description of [WebAssertion].
     */
    fun describe(): String {

        val builder = StringBuilder("Web check ")

        matcher.describeTo(StringDescription(builder))

        return builder.toString()
    }
}