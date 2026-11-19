package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.text.InternalTextApi;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<Typeface> m26449resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11) {
        State stateMo26448resolveDPcqOEQ = resolver.mo26448resolveDPcqOEQ(fontFamily, fontWeight, i10, i11);
        AbstractC9133u.m16131e(stateMo26448resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return stateMo26448resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m26450resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fontFamily = null;
        }
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = FontSynthesis.Companion.m26492getAllGVVA2EU();
        }
        return m26449resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i10, i11);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context, InterfaceC9100d interfaceC9100d) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), interfaceC9100d), null, 16, null);
    }
}
