dependencies {
  compile(fileTree(mapOf("dir" to "hello", "include" to listOf("*.aar", "*.jar"))))
  compile(fileTree("abc"))
}
