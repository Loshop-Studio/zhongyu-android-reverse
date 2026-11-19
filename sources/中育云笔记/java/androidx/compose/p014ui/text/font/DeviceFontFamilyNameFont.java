package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, AbstractC9972n abstractC9972n) {
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
        return DeviceFontFamilyName.m33043equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && AbstractC9979u.m20289b(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m33077equalsimpl0(mo33030getStyle_LCdwA(), deviceFontFamilyNameFont.mo33030getStyle_LCdwA()) && AbstractC9979u.m20289b(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.p014ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo33030getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.p014ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m33044hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m33078hashCodeimpl(mo33030getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo33106optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo33030getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m33045toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m33079toStringimpl(mo33030getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m33070getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i10;
    }
}
