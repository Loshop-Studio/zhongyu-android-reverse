package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@ColorInt int i6, @ColorInt int i7, @ColorInt int i8, @ColorInt int i9) {
        this.accent = i6;
        this.onAccent = i7;
        this.accentContainer = i8;
        this.onAccentContainer = i9;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
