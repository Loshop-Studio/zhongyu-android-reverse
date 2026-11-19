package com.canhub.cropper;

import com.canhub.cropper.CropImageActivity;

/* renamed from: com.canhub.cropper.q */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3446q {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2616a;

    static {
        int[] iArr = new int[CropImageActivity.Source.values().length];
        try {
            iArr[CropImageActivity.Source.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CropImageActivity.Source.GALLERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2616a = iArr;
    }
}
