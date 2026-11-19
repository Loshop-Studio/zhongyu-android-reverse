package com.zykj.mistake.feature.notebook.detail;

/* renamed from: com.zykj.mistake.feature.notebook.detail.s */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4869s {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7289a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f7290b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f7291c;

    static {
        int[] iArr = new int[MistakeDetailNewContract$DetailTab.values().length];
        try {
            iArr[MistakeDetailNewContract$DetailTab.MY_ANSWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MistakeDetailNewContract$DetailTab.SUPPLEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MistakeDetailNewContract$DetailTab.NOTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7289a = iArr;
        int[] iArr2 = new int[MistakeDetailNewContract$AnswerDisplayType.values().length];
        try {
            iArr2[MistakeDetailNewContract$AnswerDisplayType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MistakeDetailNewContract$AnswerDisplayType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f7290b = iArr2;
        int[] iArr3 = new int[MistakeDetailNewContract$AnswerVisualState.values().length];
        try {
            iArr3[MistakeDetailNewContract$AnswerVisualState.EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[MistakeDetailNewContract$AnswerVisualState.UNCORRECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[MistakeDetailNewContract$AnswerVisualState.CORRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MistakeDetailNewContract$AnswerVisualState.WRONG.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f7291c = iArr3;
    }
}
