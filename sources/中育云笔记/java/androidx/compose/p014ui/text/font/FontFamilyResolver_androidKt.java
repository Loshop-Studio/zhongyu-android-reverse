package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.compose.p014ui.text.InternalTextApi;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;

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
    public static final State<Typeface> m33051resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11) {
        State stateMo33050resolveDPcqOEQ = resolver.mo33050resolveDPcqOEQ(fontFamily, fontWeight, i10, i11);
        AbstractC9979u.m20292e(stateMo33050resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return stateMo33050resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m33052resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fontFamily = null;
        }
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = FontStyle.Companion.m33084getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = FontSynthesis.Companion.m33094getAllGVVA2EU();
        }
        return m33051resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i10, i11);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context, InterfaceC9945d interfaceC9945d) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), interfaceC9945d), null, 16, null);
    }
}
