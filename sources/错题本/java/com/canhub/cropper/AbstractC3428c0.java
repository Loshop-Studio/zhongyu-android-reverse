package com.canhub.cropper;

import com.canhub.cropper.CropImageView;

/* renamed from: com.canhub.cropper.c0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3428c0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2566a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f2567b;

    static {
        int[] iArr = new int[CropImageView.CropShape.values().length];
        try {
            iArr[CropImageView.CropShape.RECTANGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CropImageView.CropShape.RECTANGLE_VERTICAL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CropImageView.CropShape.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CropImageView.CropShape.OVAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2566a = iArr;
        int[] iArr2 = new int[CropImageView.CropCornerShape.values().length];
        try {
            iArr2[CropImageView.CropCornerShape.OVAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CropImageView.CropCornerShape.RECTANGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f2567b = iArr2;
    }
}
