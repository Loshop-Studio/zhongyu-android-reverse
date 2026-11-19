package androidx.compose.p011ui.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* renamed from: androidx.compose.ui.graphics.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2110c {
    /* renamed from: e */
    public static /* synthetic */ BlendModeColorFilter m1212e(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ BlendModeColorFilter m1213f(ColorFilter colorFilter) {
        return (BlendModeColorFilter) colorFilter;
    }

    /* renamed from: g */
    public static /* synthetic */ void m1214g() {
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ boolean m1223p(ColorFilter colorFilter) {
        return colorFilter instanceof BlendModeColorFilter;
    }
}
