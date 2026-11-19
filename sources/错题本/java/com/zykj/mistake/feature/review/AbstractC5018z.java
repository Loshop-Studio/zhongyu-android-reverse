package com.zykj.mistake.feature.review;

/* renamed from: com.zykj.mistake.feature.review.z */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5018z {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7768a;

    static {
        int[] iArr = new int[ReviewContract$PracticePoolType.values().length];
        try {
            iArr[ReviewContract$PracticePoolType.STRENGTHENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewContract$PracticePoolType.CONSOLIDATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewContract$PracticePoolType.MASTERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7768a = iArr;
    }
}
