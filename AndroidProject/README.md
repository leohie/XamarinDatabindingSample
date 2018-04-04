# Native Android project

This sample application contains a single Activity (`MainActivity.java`), with a button that navigates to a second Activity `BindingSampleActivity`. `BindingSampleActivity` is defined in a separate android module, and makes use of android databinding.

### Building the .AAR
To build the native module, run the following gradle command:  `gradle assemble`. This will create a library file in the path: *librarywithbinding/build/outputs/aar*