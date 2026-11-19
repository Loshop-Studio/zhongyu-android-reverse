package com.canhub.cropper;

import android.graphics.Bitmap;

/* renamed from: com.canhub.cropper.g */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3435g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2596a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2596a = iArr;
    }
}
