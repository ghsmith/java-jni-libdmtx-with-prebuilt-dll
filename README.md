# java-jni-libdmtx-with-prebuilt-dll
Prebuilt libdmtx (Data Matrix barcode encoder/decoder) Windows 64-bit DLL with Java JNI Wrapper

This project includes a prebuilt libdmtx Windows 64-bit DLL and Java JNI wrapper. A sample Data Matrix barcode decode operation is shown in the screenshot below. The purpose is to provide an easy way for people working with Java in Windows to decode Data Matrix barcodes. The pure-Java ZXing project includes a Data Matrix decoder, but the pure-Java ZXing Data Matrix decoder just does not work very well. The libdmtx Data Matrix decoder works great (and is probably on par with expensive commercial decoders), but it is very difficult to build the necessary Windows 64-bit DLL from their source code if you want to use it in Java (e.g., cross-compiling in MSYS2 is required). This project includes that DLL prebuilt for those that do not want to figure out how to build it themselves and might save you considerable time and expense.

The included Windows 64-bit DLL was built from the source code at https://github.com/dmtx/libdmtx and https://github.com/dmtx/dmtx-wrappers (/java) cloned on October 5, 2024 using MSYS2 mingw-w64-ucrt-x86_64-gcc. I did have to slightly modify the dmtx-wrapper source to get a clean build, and those modifications are described in the second figure below. I have successfully used the DLL with Java v1.8, 11, and 17. Note that I am have only tested the Data Matrix decoder. A Data Matrix encoder is also exposed via JNI, but I have not tested it.

![usage screenshot](https://github.com/ghsmith/java-jni-libdmtx-with-prebuilt-dll/blob/main/usage_screenshot.jpg?raw=true)

![described_code_modifications](https://github.com/ghsmith/java-jni-libdmtx-with-prebuilt-dll/blob/main/described_code_modifications.jpg?raw=true)
