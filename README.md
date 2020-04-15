# Android WebViewHelper Help you to show website on Webview


[![](https://jitpack.io/v/bangtiray/btbvpager.svg)](https://jitpack.io/#bangtiray/btbvpager) 

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
 repositories {
	...
	maven { url 'https://jitpack.io' }
 }
}
```
Step 2. Add the dependency
```gradle
dependencies {
      implementation 'com.github.bangtiray:WebViewHelper:Tag'
}
```

## Starting Code

in kotlin you just add this on your Activity or Fragment
```kotlin
    private lateinit var myText:EditText
    private lateinit var myButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText=findViewById(R.id.textUrl)
        myButton=findViewById(R.id.btnWebview)
        myButton.setOnClickListener {
            Bangtiray.showWebView(applicationContext, myText.text.toString(), "", false)
        }
    }
```
