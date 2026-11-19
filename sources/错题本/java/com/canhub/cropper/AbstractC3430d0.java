package com.canhub.cropper;

import com.canhub.cropper.CropImageView;

/* renamed from: com.canhub.cropper.d0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3430d0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2574a;

    static {
        int[] iArr = new int[CropImageView.CropShape.values().length];
        try {
            iArr[CropImageView.CropShape.RECTANGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CropImageView.CropShape.OVAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CropImageView.CropShape.RECTANGLE_VERTICAL_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CropImageView.CropShape.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2574a = iArr;
    }
}
