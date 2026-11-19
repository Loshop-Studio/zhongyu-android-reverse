package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.font.AsyncTypefaceCache;
import androidx.compose.p013ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.Result;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, InterfaceC10570l interfaceC10570l) {
        Object objInvoke;
        Object objInvoke2;
        Object objM15909b;
        Object objM26437unboximpl;
        int size = list.size();
        List listM14776s = null;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = list.get(i10);
            int iMo26420getLoadingStrategyPKNRLFQ = font.mo26420getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m26462equalsimpl0(iMo26420getLoadingStrategyPKNRLFQ, companion.m26467getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objInvoke2 = asyncTypefaceResult.m26437unboximpl();
                        } else {
                            C8736p c8736p = C8736p.f16368a;
                            try {
                                objInvoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                objInvoke = interfaceC10570l.invoke(typefaceRequest);
                            }
                            Object obj = objInvoke;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = interfaceC10570l.invoke(typefaceRequest);
                }
                return AbstractC8726f.m14230a(listM14776s, FontSynthesis_androidKt.m26496synthesizeTypefaceFxwP2eA(typefaceRequest.m26521getFontSynthesisGVVA2EU(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m26462equalsimpl0(iMo26420getLoadingStrategyPKNRLFQ, companion.m26468getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM26437unboximpl = asyncTypefaceResult2.m26437unboximpl();
                        } else {
                            C8736p c8736p2 = C8736p.f16368a;
                            try {
                                Result.C9076a c9076a = Result.f17350b;
                                objM15909b = Result.m15909b(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th2) {
                                Result.C9076a c9076a2 = Result.f17350b;
                                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th2));
                            }
                            Object obj2 = Result.m15913g(objM15909b) ? null : objM15909b;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj2, false, 8, null);
                            objM26437unboximpl = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM26437unboximpl != null) {
                    return AbstractC8726f.m14230a(listM14776s, FontSynthesis_androidKt.m26496synthesizeTypefaceFxwP2eA(typefaceRequest.m26521getFontSynthesisGVVA2EU(), objM26437unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m26462equalsimpl0(iMo26420getLoadingStrategyPKNRLFQ, companion.m26466getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM26429get1ASDuI8 = asyncTypefaceCache.m26429get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM26429get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m26435isPermanentFailureimpl(asyncTypefaceResultM26429get1ASDuI8.m26437unboximpl()) && asyncTypefaceResultM26429get1ASDuI8.m26437unboximpl() != null) {
                        return AbstractC8726f.m14230a(listM14776s, FontSynthesis_androidKt.m26496synthesizeTypefaceFxwP2eA(typefaceRequest.m26521getFontSynthesisGVVA2EU(), asyncTypefaceResultM26429get1ASDuI8.m26437unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA()));
                    }
                } else if (listM14776s == null) {
                    listM14776s = AbstractC8809v.m14776s(font);
                } else {
                    listM14776s.add(font);
                }
            }
        }
        return AbstractC8726f.m14230a(listM14776s, interfaceC10570l.invoke(typefaceRequest));
    }
}
