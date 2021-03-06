// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.space.vcs.review

import circlet.code.api.CodeReviewWithCount
import runtime.reactive.MutableProperty
import runtime.reactive.mutableProperty

class SpaceSelectedReviewVmImpl : SpaceSelectedReviewVm {
  override val selectedReview: MutableProperty<CodeReviewWithCount?> = mutableProperty(null)
}