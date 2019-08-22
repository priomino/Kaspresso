package com.kaspersky.kaspressample.tests.simple

import android.Manifest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.text.KTextView
import com.kaspersky.kaspressample.MainActivity
import com.kaspersky.kaspressample.screen.RecyclerStubScreen
import com.kaspersky.kaspressample.screen.MainScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerStubTest : TestCase() {

    private val mainScreen = MainScreen()
    private val recyclerStubScreen = RecyclerStubScreen()

    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun test() {
        before {
            activityTestRule.launchActivity(null)
        }.after {
        }.run {
            step("Open Recycler Stub Screen") {
                mainScreen {
                    recyclerStubButton {
                        click()
                    }
                }
            }

            step("Find 56th element") {
                recyclerStubScreen {
                    recyclerStub {
                        isVisible()
                        hasSize(100)

                        childWith<RecyclerStubScreen.StubItem> {
                            withDescendant { withText("56") }
                        } perform {
                            isVisible()
                        }
                    }
                }
            }
        }
    }
}