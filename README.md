
# Example project to demonstrate Xamarin databinding issue 

This repository contains an example of a Native android .AAR library that makes use of android [databinding](https://developer.android.com/topic/libraries/data-binding/index.html), and a Xamarin Android application that includes this library using [native binding](https://developer.xamarin.com/guides/android/advanced_topics/binding-a-java-library/binding-an-aar/). This example demonstrates that Xamarin android is not able to include a native library that makes use of Android Databinding.

## Solution Overview
This repository contains two projects:

* AndroidProject - A native android project. This is a runnable application with 2 activities. A main activity, and an Activity defined in a separate library. The main activity has a button that navigates to the second activity. The second activity makes use of android databinding
* XamarinProject - A Xamarin Android project that includes the native android library in a bindings project. This application is similar to the native application, where a main activity is defined with a button that links to the native library's activity. The app crashes with a runtime failure when the native activity is loaded.

## Built using
* The native Android application was built using [Android Studio](https://developer.android.com/studio/index.html)
* The Xamarin Android application was built using [Visual Studio for Mac](https://www.visualstudio.com/vs/mac/) and [Xamarin](https://www.xamarin.com/) 

### Screenshots

Native application
* Native Android main activity
![MainActivity](https://github.com/l-h-l/XamarinDatabindingSample/blob/master/Screenshots/NativeAndroidMainActivity.png?raw=true)
* Databinding activity defined in module
![DataBindingActivity](https://github.com/l-h-l/XamarinDatabindingSample/blob/master/Screenshots/NativeAndroidDatabindingActivity.png?raw=true)

Xamarin Android application
* Xamarin Android main activity
![XamarinActivity](https://github.com/l-h-l/XamarinDatabindingSample/blob/master/Screenshots/XamarinAndroidMainActivity.png?raw=true)
* Application crash
![Error](https://github.com/l-h-l/XamarinDatabindingSample/blob/master/Screenshots/XamarinException.png?raw=true)

### Authors

* **Leo Langenhoven**