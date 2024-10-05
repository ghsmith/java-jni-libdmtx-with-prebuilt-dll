# java-jni-libdmtx-with-prebuilt-dll
Prebuilt libdmtx (Data Matrix encoder/decoder) Windows 64-bit DLL with Java JNI Wrapper

This project includes a prebuilt libdmtx Windows 64-bit DLL and JNI wrapper. A sample Data Matrix barcode decode is shown in the screenshot below. The purpose is to provide an easy way for people working with Java in Windows to decode Data Matrix barcodes. The pure-Java ZXing project includes a Data Matrix decode, but it does not work very well. The libdmtx Data Matrix decoder works well (probably on-par with expensive commercial decoders), but it is difficult to build the necessary Windows 64-bit DLL from their source code (e.g., cross-compiling in MSYS2) if you want to use it in Java. This project includes that DLL for those that do not want to figure out how to build it themselves.

The DLL was built from the source code at https://github.com/dmtx/libdmtx and https://github.com/dmtx/dmtx-wrappers (/java) on October 5, 2024 using MSYS2 mingw-w64-ucrt-x86_64-gcc. I did have to slightly modify the wrapper make file to get a clean build.

![usage screenshot](https://github.com/ghsmith/java-jni-libdmtx-with-prebuilt-dll/blob/main/usage_screenshot.jpg?raw=true)

![described_code_modifications](https://github.com/ghsmith/java-jni-libdmtx-with-prebuilt-dll/blob/main/described_code_modifications.jpg?raw=true)
