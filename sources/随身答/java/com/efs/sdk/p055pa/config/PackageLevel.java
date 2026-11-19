package com.efs.sdk.p055pa.config;

/* loaded from: classes3.dex */
public enum PackageLevel {
    DAILY_DEVELOP(1),
    INTERNAL_TEST(2),
    TRIAL(3),
    RELEASE(4);

    private int mLevel;

    PackageLevel(int i9) {
        this.mLevel = i9;
    }

    public final int getLevel() {
        return this.mLevel;
    }
}
