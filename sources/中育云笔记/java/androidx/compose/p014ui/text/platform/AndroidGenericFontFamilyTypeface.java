package androidx.compose.p014ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.font.GenericFontFamily;
import androidx.compose.p014ui.text.font.TypefaceHelperMethodsApi28;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface typefaceCreate = Typeface.create(genericFontFamily.getName(), 0);
        AbstractC9979u.m20291d(typefaceCreate);
        this.nativeTypeface = typefaceCreate;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m33218buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i10) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m33029getAndroidTypefaceStyleFO1MlWM(fontWeight, i10)) : TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m33077equalsimpl0(i10, FontStyle.Companion.m33083getItalic_LCdwA()));
    }

    @Override // androidx.compose.p014ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p014ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo33217getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        return m33218buildStyledTypefaceFO1MlWM(fontWeight, i10);
    }
}
