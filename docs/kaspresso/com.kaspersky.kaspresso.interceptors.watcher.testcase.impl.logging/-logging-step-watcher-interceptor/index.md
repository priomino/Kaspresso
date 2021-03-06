//[kaspresso](../../index.md)/[com.kaspersky.kaspresso.interceptors.watcher.testcase.impl.logging](../index.md)/[LoggingStepWatcherInterceptor](index.md)



# LoggingStepWatcherInterceptor  
 [androidJvm] 

The implementation of the [StepWatcherInterceptor](../../com.kaspersky.kaspresso.interceptors.watcher.testcase/-step-watcher-interceptor/index.md) interface. Logs [StepInfo](../../com.kaspersky.kaspresso.testcases.models.info/-step-info/index.md) on each step event.

class [LoggingStepWatcherInterceptor](index.md)(**logger**: [UiTestLogger](../../com.kaspersky.kaspresso.logger/-ui-test-logger/index.md)) : [StepWatcherInterceptor](../../com.kaspersky.kaspresso.interceptors.watcher.testcase/-step-watcher-interceptor/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [LoggingStepWatcherInterceptor](-logging-step-watcher-interceptor.md)|  [androidJvm] fun [LoggingStepWatcherInterceptor](-logging-step-watcher-interceptor.md)(logger: [UiTestLogger](../../com.kaspersky.kaspresso.logger/-ui-test-logger/index.md))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [androidJvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [androidJvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [interceptAfterFinally](intercept-after-finally.md)| [androidJvm]  <br>Brief description  <br><br><br>Logs the given stepInfo on step finally finishes.<br><br>  <br>Content  <br>open override fun [interceptAfterFinally](intercept-after-finally.md)(stepInfo: [StepInfo](../../com.kaspersky.kaspresso.testcases.models.info/-step-info/index.md))  <br><br><br>
| [interceptAfterWithError](intercept-after-with-error.md)| [androidJvm]  <br>Brief description  <br><br><br>Logs the given stepInfo on step finishes with failure.<br><br>  <br>Content  <br>open override fun [interceptAfterWithError](intercept-after-with-error.md)(stepInfo: [StepInfo](../../com.kaspersky.kaspresso.testcases.models.info/-step-info/index.md), error: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html))  <br><br><br>
| [interceptAfterWithSuccess](intercept-after-with-success.md)| [androidJvm]  <br>Brief description  <br><br><br>Logs the given stepInfo on step finishes with success.<br><br>  <br>Content  <br>open override fun [interceptAfterWithSuccess](intercept-after-with-success.md)(stepInfo: [StepInfo](../../com.kaspersky.kaspresso.testcases.models.info/-step-info/index.md))  <br><br><br>
| [interceptBefore](intercept-before.md)| [androidJvm]  <br>Brief description  <br><br><br>Logs the given stepInfo on step starts.<br><br>  <br>Content  <br>open override fun [interceptBefore](intercept-before.md)(stepInfo: [StepInfo](../../com.kaspersky.kaspresso.testcases.models.info/-step-info/index.md))  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [androidJvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

