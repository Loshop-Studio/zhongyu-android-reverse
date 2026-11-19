package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.font.AsyncTypefaceCache;
import androidx.compose.p014ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.Result;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, InterfaceC9540l interfaceC9540l) {
        Object objInvoke;
        Object objInvoke2;
        Object objM20054c;
        Object objM33039unboximpl;
        int size = list.size();
        List listM24141s = null;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = list.get(i10);
            int iMo33022getLoadingStrategyPKNRLFQ = font.mo33022getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33069getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objInvoke2 = asyncTypefaceResult.m33039unboximpl();
                        } else {
                            C10786q c10786q = C10786q.f26013a;
                            try {
                                objInvoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                objInvoke = interfaceC9540l.invoke(typefaceRequest);
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
                    objInvoke2 = interfaceC9540l.invoke(typefaceRequest);
                }
                return AbstractC10776g.m22975a(listM24141s, FontSynthesis_androidKt.m33098synthesizeTypefaceFxwP2eA(typefaceRequest.m33123getFontSynthesisGVVA2EU(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33070getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM33039unboximpl = asyncTypefaceResult2.m33039unboximpl();
                        } else {
                            C10786q c10786q2 = C10786q.f26013a;
                            try {
                                Result.C9921a c9921a = Result.f23263d;
                                objM20054c = Result.m20054c(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th2) {
                                Result.C9921a c9921a2 = Result.f23263d;
                                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th2));
                            }
                            Object obj2 = Result.m20058g(objM20054c) ? null : objM20054c;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj2, false, 8, null);
                            objM33039unboximpl = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM33039unboximpl != null) {
                    return AbstractC10776g.m22975a(listM24141s, FontSynthesis_androidKt.m33098synthesizeTypefaceFxwP2eA(typefaceRequest.m33123getFontSynthesisGVVA2EU(), objM33039unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33068getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM33031get1ASDuI8 = asyncTypefaceCache.m33031get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM33031get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m33037isPermanentFailureimpl(asyncTypefaceResultM33031get1ASDuI8.m33039unboximpl()) && asyncTypefaceResultM33031get1ASDuI8.m33039unboximpl() != null) {
                        return AbstractC10776g.m22975a(listM24141s, FontSynthesis_androidKt.m33098synthesizeTypefaceFxwP2eA(typefaceRequest.m33123getFontSynthesisGVVA2EU(), asyncTypefaceResultM33031get1ASDuI8.m33039unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA()));
                    }
                } else if (listM24141s == null) {
                    listM24141s = AbstractC10978w.m24141s(font);
                } else {
                    listM24141s.add(font);
                }
            }
        }
        return AbstractC10776g.m22975a(listM24141s, interfaceC9540l.invoke(typefaceRequest));
    }
}
