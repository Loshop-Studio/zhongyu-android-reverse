package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.font.AsyncTypefaceCache;
import androidx.compose.p011ui.text.font.FontLoadingStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "firstImmediatelyAvailable", "(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lr6/c;)Lkotlin/Pair;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n434#2:445\n435#2,7:448\n434#2:456\n435#2,7:459\n34#3,2:446\n34#3,2:457\n1#4:455\n1#4:466\n1#4:467\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n196#1:445\n196#1:448,7\n213#1:456\n213#1:459,7\n196#1:446,2\n213#1:457,2\n196#1:455\n213#1:467\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, InterfaceC6471c interfaceC6471c) {
        Object objInvoke;
        Object objInvoke2;
        Object objM13956constructorimpl;
        Object objM12843unboximpl;
        int size = list.size();
        ArrayList arrayListM5247A = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m12868equalsimpl0(loadingStrategy, companion.m12873getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objInvoke2 = asyncTypefaceResult.m12843unboximpl();
                        } else {
                            try {
                                objInvoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                objInvoke = interfaceC6471c.invoke(typefaceRequest);
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
                    objInvoke2 = interfaceC6471c.invoke(typefaceRequest);
                }
                return new Pair<>(arrayListM5247A, FontSynthesis_androidKt.m12902synthesizeTypefaceFxwP2eA(typefaceRequest.m12927getFontSynthesisGVVA2EU(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.m12926getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m12868equalsimpl0(loadingStrategy, companion.m12874getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM12843unboximpl = asyncTypefaceResult2.m12843unboximpl();
                        } else {
                            try {
                                objM13956constructorimpl = Result.m13956constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th2) {
                                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th2));
                            }
                            Object obj2 = Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj2, false, 8, null);
                            objM12843unboximpl = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM12843unboximpl != null) {
                    return new Pair<>(arrayListM5247A, FontSynthesis_androidKt.m12902synthesizeTypefaceFxwP2eA(typefaceRequest.m12927getFontSynthesisGVVA2EU(), objM12843unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m12926getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m12868equalsimpl0(loadingStrategy, companion.m12872getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM12835get1ASDuI8 = asyncTypefaceCache.m12835get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM12835get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m12841isPermanentFailureimpl(asyncTypefaceResultM12835get1ASDuI8.m12843unboximpl()) && asyncTypefaceResultM12835get1ASDuI8.m12843unboximpl() != null) {
                        return new Pair<>(arrayListM5247A, FontSynthesis_androidKt.m12902synthesizeTypefaceFxwP2eA(typefaceRequest.m12927getFontSynthesisGVVA2EU(), asyncTypefaceResultM12835get1ASDuI8.m12843unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m12926getFontStyle_LCdwA()));
                    }
                } else if (arrayListM5247A == null) {
                    arrayListM5247A = AbstractC5806u.m5247A(font);
                } else {
                    arrayListM5247A.add(font);
                }
            }
        }
        return new Pair<>(arrayListM5247A, interfaceC6471c.invoke(typefaceRequest));
    }
}
