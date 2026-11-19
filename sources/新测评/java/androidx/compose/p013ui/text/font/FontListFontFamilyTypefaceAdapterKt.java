package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.font.AsyncTypefaceCache;
import androidx.compose.p013ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, m13558d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n434#2:445\n435#2,7:448\n434#2:456\n435#2,7:459\n34#3,2:446\n34#3,2:457\n1#4:455\n1#4:466\n1#4:467\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n196#1:445\n196#1:448,7\n213#1:456\n213#1:459,7\n196#1:446,2\n213#1:457,2\n196#1:455\n213#1:467\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objM24299constructorimpl;
        Object objM23100unboximpl;
        int size = list.size();
        List listMutableListOf = null;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = list.get(i10);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m23125equalsimpl0(loadingStrategy, companion.m23130getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objInvoke2 = asyncTypefaceResult.m23100unboximpl();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                objInvoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(typefaceRequest);
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
                    objInvoke2 = function1.invoke(typefaceRequest);
                }
                return TuplesKt.m13565to(listMutableListOf, FontSynthesis_androidKt.m23159synthesizeTypefaceFxwP2eA(typefaceRequest.m23184getFontSynthesisGVVA2EU(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.m23183getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m23125equalsimpl0(loadingStrategy, companion.m23131getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM23100unboximpl = asyncTypefaceResult2.m23100unboximpl();
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM24299constructorimpl = Result.m24299constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th2));
                            }
                            Object obj2 = Result.m24305isFailureimpl(objM24299constructorimpl) ? null : objM24299constructorimpl;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj2, false, 8, null);
                            objM23100unboximpl = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM23100unboximpl != null) {
                    return TuplesKt.m13565to(listMutableListOf, FontSynthesis_androidKt.m23159synthesizeTypefaceFxwP2eA(typefaceRequest.m23184getFontSynthesisGVVA2EU(), objM23100unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m23183getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m23125equalsimpl0(loadingStrategy, companion.m23129getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM23092get1ASDuI8 = asyncTypefaceCache.m23092get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM23092get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m23098isPermanentFailureimpl(asyncTypefaceResultM23092get1ASDuI8.m23100unboximpl()) && asyncTypefaceResultM23092get1ASDuI8.m23100unboximpl() != null) {
                        return TuplesKt.m13565to(listMutableListOf, FontSynthesis_androidKt.m23159synthesizeTypefaceFxwP2eA(typefaceRequest.m23184getFontSynthesisGVVA2EU(), asyncTypefaceResultM23092get1ASDuI8.m23100unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m23183getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(font);
                } else {
                    listMutableListOf.add(font);
                }
            }
        }
        return TuplesKt.m13565to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
