package com.friday.document.model;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class StudentShareEntityKt {
    public static final ShareListEntity toShareListEntity(ShareFile shareFile, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(shareFile, "<this>");
        return new ShareListEntity(z10, z11, shareFile);
    }
}
