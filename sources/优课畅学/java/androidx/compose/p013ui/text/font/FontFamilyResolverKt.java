package androidx.compose.p013ui.text.font;

/* loaded from: classes2.dex */
public final class FontFamilyResolverKt {
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }

    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }
}
