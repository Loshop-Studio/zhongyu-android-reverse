package androidx.compose.p014ui.text.font;

import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.TypefaceResult;
import androidx.compose.p014ui.text.platform.AndroidTypeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.p014ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        Typeface typefaceMo33217getNativeTypefacePYhJU0U;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof DefaultFontFamily) {
            typefaceMo33217getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo33104createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo33217getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo33105createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            AbstractC9979u.m20292e(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceMo33217getNativeTypefacePYhJU0U = ((AndroidTypeface) typeface).mo33217getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA(), typefaceRequest.m33123getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo33217getNativeTypefacePYhJU0U, false, 2, null);
    }
}
