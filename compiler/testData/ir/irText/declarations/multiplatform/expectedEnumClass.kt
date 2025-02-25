// !LANGUAGE: +MultiPlatformProjects
// IGNORE_BACKEND_K2: ANY
// FIR status: In FIR, declaring the same `expect` and `actual` classes in one compiler module is not possible (see KT-55177).

expect enum class MyEnum {
    FOO,
    BAR
}

actual enum class MyEnum {
    FOO,
    BAR,
    BAZ
}