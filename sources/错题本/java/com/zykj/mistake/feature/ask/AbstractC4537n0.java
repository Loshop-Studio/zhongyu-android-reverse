package com.zykj.mistake.feature.ask;

/* renamed from: com.zykj.mistake.feature.ask.n0 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4537n0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6279a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f6280b;

    static {
        int[] iArr = new int[MistakeAskMaterialContract$MaterialType.values().length];
        try {
            iArr[MistakeAskMaterialContract$MaterialType.BOARD_NOTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MistakeAskMaterialContract$MaterialType.STEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MistakeAskMaterialContract$MaterialType.PICTURE_NOTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MistakeAskMaterialContract$MaterialType.TYPICAL_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f6279a = iArr;
        int[] iArr2 = new int[MistakeAskMaterialContract$SourceType.values().length];
        try {
            iArr2[MistakeAskMaterialContract$SourceType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MistakeAskMaterialContract$SourceType.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MistakeAskMaterialContract$SourceType.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f6280b = iArr2;
    }
}
