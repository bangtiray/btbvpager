# AndroidX Fast View Pager library (BT=Bored, B=Bikin/Making,vpager=ViewPager) 
btbvpager Make viewpager quickly for those of you who are tired of making adapters

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
	        implementation 'com.github.bangtiray:btbvpager:1.0.0'
	}
```
## Support AndroidX
```gradle
    implementation 'androidx.appcompat:appcompat:$support_version'
```    
## Create Layout
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">

    <com.google.android.material.appbar.AppBarLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <androidx.appcompat.widget.Toolbar
                android:id="@+id/mainToolbar"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"/>

        <com.google.android.material.tabs.TabLayout
                android:id="@+id/mainTabLayout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:tabTextColor="#fff"/>

    </com.google.android.material.appbar.AppBarLayout>
    <com.bangtiray.material.pager.lib.BTBVPager
            android:id="@+id/mainPage"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
</LinearLayout>
```
## Starting Code

in kotlin you just add this on your Activity or Fragment
```kotlin
import kotlinx.android.synthetic.main.activity_main.*
    
mainToolbar.title = "BTBVPager"
mainPage.init {
    addPages("One" , PageOne())
    addPages("Two" , PageTwo())
    addPages("Three" , PageThree())
}
```
and if you wanna add TabLayout just like this
```kotlin
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
    
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainToolbar.title = "BTBVPager"

        mainPage.init(mainTabLayout) {
            addPages("One", OneFragment())
            addPages("Two", TwoFragment())
            addPages("Three", ThreeFragment())
        }
    }
}
```
# overview
This library 
has been there before, but hasn't used the AndroidX version yet
![alt text](https://avatars2.githubusercontent.com/u/22283409?s=200&v=4)
refer library belonging to Alfianyusufabdullah
https://github.com/alfianyusufabdullah/spager


Thanks Alfianyusufabdullah Allah Bless you!!! :tada: :tada:

