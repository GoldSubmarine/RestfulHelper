package com.github.goldsubmarine.restfulhelper.annotations.extraction

import com.intellij.psi.PsiAnnotationMemberValue

interface PsiAnnotationValueExtractor<in T : PsiAnnotationMemberValue> {

    fun extract(value: T): List<String>
}
