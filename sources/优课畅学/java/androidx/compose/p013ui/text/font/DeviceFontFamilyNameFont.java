package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, AbstractC9126n abstractC9126n) {
        this(str, fontWeight, i10, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.m26441equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && AbstractC9133u.m16128b(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m26475equalsimpl0(mo26428getStyle_LCdwA(), deviceFontFamilyNameFont.mo26428getStyle_LCdwA()) && AbstractC9133u.m16128b(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo26428getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m26442hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m26476hashCodeimpl(mo26428getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo26504optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo26428getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m26443toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m26477toStringimpl(mo26428getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m26468getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i10;
    }
}
