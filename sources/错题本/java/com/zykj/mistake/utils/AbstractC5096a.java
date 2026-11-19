package com.zykj.mistake.utils;

import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$SourceType;

/* renamed from: com.zykj.mistake.utils.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5096a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8023a;

    static {
        int[] iArr = new int[MistakeAskMaterialContract$SourceType.values().length];
        try {
            iArr[MistakeAskMaterialContract$SourceType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MistakeAskMaterialContract$SourceType.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MistakeAskMaterialContract$SourceType.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8023a = iArr;
    }
}
