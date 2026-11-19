package androidx.compose.p013ui.text.font;

import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.TypefaceResult;
import androidx.compose.p013ui.text.platform.AndroidTypeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.p013ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        Typeface typefaceMo26615getNativeTypefacePYhJU0U;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof DefaultFontFamily) {
            typefaceMo26615getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo26502createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo26615getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo26503createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            AbstractC9133u.m16131e(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceMo26615getNativeTypefacePYhJU0U = ((AndroidTypeface) typeface).mo26615getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA(), typefaceRequest.m26521getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo26615getNativeTypefacePYhJU0U, false, 2, null);
    }
}
