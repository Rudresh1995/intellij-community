// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.jetbrains.completion.ml.ranker

import org.junit.Test

class MetadataConsistencyTest {
  @Test
  fun testKotlinMetadata() = ExperimentKotlinMLRankingProvider().assertModelMetadataConsistent()

  @Test
  fun testScalaMetadata() = ExperimentScalaMLRankingProvider().assertModelMetadataConsistent()

  @Test
  fun testJavaMetadata() = ExperimentJavaMLRankingProvider().assertModelMetadataConsistent()

  @Test
  fun testRustMetadata() = ExperimentRustMLRankingProvider().assertModelMetadataConsistent()

  @Test
  fun testPythonMetadata() = ExperimentPythonMLRankingProvider().assertModelMetadataConsistent()

  @Test
  fun testPHPMetadata() = ExperimentPhpMLRankingProvider().assertModelMetadataConsistent()
}
