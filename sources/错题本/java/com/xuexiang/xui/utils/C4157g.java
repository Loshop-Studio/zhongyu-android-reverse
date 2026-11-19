package com.xuexiang.xui.utils;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: com.xuexiang.xui.utils.g */
/* loaded from: classes3.dex */
public final class C4157g extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a */
    public float f3942a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f3942a, 0.0f, 0.0f, 0);
    }
}
