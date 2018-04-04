# Xamarin Android project
This Xamarin solution attempts to include the Activity created in the native android project. The solution consists of the following projects:

* *android-databinding-adapters-binding* - An Android Bindings Library project that includes the [native android databinding adapters .AAR](https://github.com/sourcegraph/android-sdk-jars/tree/master/extras/android/m2repository/com/android/databinding/adapters/1.3.1)
* *android-databinding-bindings* - An Android Bindings Library project that includes the [native android databindings .AAR](https://github.com/sourcegraph/android-sdk-jars/tree/master/extras/android/m2repository/com/android/databinding/library/1.3.1)
* *BindingBindingsDemoApp* - A Xamarin Android project that defines a single Activity. This project is dependent on the 4 bindings projects.
* *data-binding-component* - An Android Bindings Library project that includes a jar containing a single empty interface called `android.databinding.DataBindingComponent`. The Xamarin project would not compile without this interface, and it does not seem to be included in the databindings libraries from google. 
* *example-module-bindings* - An Android Bindings Library project that includes the .AAR file created by packaging the native android project in this repository.

The Activity `MainActivity.cs` contains a single button that navigates to the Activity from the native .AAR library `Databinding.Android.Librarywithbinding.BindingSampleActivity`. The app crashes when this activity is shown with the following error:

```
Java.Lang.NoClassDefFoundError: Failed resolution of: Landroid/databinding/DataBinderMapper; ---> Java.Lang.ClassNotFoundException: Didn't find class "android.databinding.DataBinderMapper" on path: DexPathList[[zip file "/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk"],nativeLibraryDirectories=[/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/lib/x86, /system/fake-libs, /data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk!/lib/x86, /system/lib, /vendor/lib]]
  at java.lang.ClassNotFoundException: Didn't find class "android.databinding.DataBinderMapper" on path: DexPathList[[zip file "/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk"],nativeLibraryDirectories=[/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/lib/x86, /system/fake-libs, /data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk!/lib/x86, /system/lib, /vendor/lib]]
  at at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:93)
  at at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
  at at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
  at at android.databinding.DataBindingUtil.<clinit>(DataBindingUtil.java:31)
  at at android.databinding.DataBindingUtil.setContentView(DataBindingUtil.java:261)
  at at databinding.android.librarywithbinding.BindingSampleActivity.onCreate(BindingSampleActivity.java:14)
  at at android.app.Activity.performCreate(Activity.java:6975)
  at at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1213)
  at at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2770)
  at at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2892)
  at at android.app.ActivityThread.-wrap11(Unknown Source:0)
  at at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1593)
  at at android.os.Handler.dispatchMessage(Handler.java:105)
  at at android.os.Looper.loop(Looper.java:164)
  at at android.app.ActivityThread.main(ActivityThread.java:6541)
  at at java.lang.reflect.Method.invoke(Native Method)
  at at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240)
  at at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767)
  --- End of inner exception stack trace ---
  at java.lang.NoClassDefFoundError: Failed resolution of: Landroid/databinding/DataBinderMapper;
  at at android.databinding.DataBindingUtil.<clinit>(DataBindingUtil.java:31)
  at at android.databinding.DataBindingUtil.setContentView(DataBindingUtil.java:261)
  at at databinding.android.librarywithbinding.BindingSampleActivity.onCreate(BindingSampleActivity.java:14)
  at at android.app.Activity.performCreate(Activity.java:6975)
  at at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1213)
  at at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2770)
  at at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2892)
  at at android.app.ActivityThread.-wrap11(Unknown Source:0)
  at at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1593)
  at at android.os.Handler.dispatchMessage(Handler.java:105)
  at at android.os.Looper.loop(Looper.java:164)
  at at android.app.ActivityThread.main(ActivityThread.java:6541)
  at at java.lang.reflect.Method.invoke(Native Method)
  at at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240)
  at at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767)
  at Caused by: java.lang.ClassNotFoundException: Didn't find class "android.databinding.DataBinderMapper" on path: DexPathList[[zip file "/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk"],nativeLibraryDirectories=[/data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/lib/x86, /system/fake-libs, /data/app/com.bla.BindingBindingsDemoApp-sakjPKVSuqV2WAoU4Fr71Q==/base.apk!/lib/x86, /system/lib, /vendor/lib]]
  at at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:93)
  at at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
  at at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
  at ... 15 more
```