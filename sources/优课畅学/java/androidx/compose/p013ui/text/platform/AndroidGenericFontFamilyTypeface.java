package androidx.compose.p013ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p013ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.font.GenericFontFamily;
import androidx.compose.p013ui.text.font.TypefaceHelperMethodsApi28;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface typefaceCreate = Typeface.create(genericFontFamily.getName(), 0);
        AbstractC9133u.m16130d(typefaceCreate);
        this.nativeTypeface = typefaceCreate;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m26616buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i10) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m26427getAndroidTypefaceStyleFO1MlWM(fontWeight, i10)) : TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m26475equalsimpl0(i10, FontStyle.Companion.m26481getItalic_LCdwA()));
    }

    @Override // androidx.compose.p013ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p013ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo26615getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        return m26616buildStyledTypefaceFO1MlWM(fontWeight, i10);
    }
}
