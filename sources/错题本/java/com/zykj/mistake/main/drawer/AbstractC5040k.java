package com.zykj.mistake.main.drawer;

import com.zykj.mistake.feature.mistake.model.MistakeTagType;

/* renamed from: com.zykj.mistake.main.drawer.k */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5040k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7897a;

    static {
        int[] iArr = new int[MistakeTagType.values().length];
        try {
            iArr[MistakeTagType.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MistakeTagType.GREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MistakeTagType.ORANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MistakeTagType.BLUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7897a = iArr;
    }
}
