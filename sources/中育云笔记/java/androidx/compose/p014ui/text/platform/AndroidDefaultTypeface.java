package androidx.compose.p014ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.font.TypefaceHelperMethodsApi28;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public static final int $stable = 0;
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    @Override // androidx.compose.p014ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p014ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo33217getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m33029getAndroidTypefaceStyleFO1MlWM(fontWeight, i10)) : TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m33077equalsimpl0(i10, FontStyle.Companion.m33083getItalic_LCdwA()));
    }
}
