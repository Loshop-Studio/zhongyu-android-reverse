package androidx.compose.p006ui.text.font;

import androidx.compose.p006ui.text.font.AsyncTypefaceCache;
import androidx.compose.p006ui.text.font.FontLoadingStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, m5175d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objLoadBlocking;
        Object objM11788constructorimpl;
        int size = list.size();
        List listMutableListOf = null;
        for (int i4 = 0; i4 < size; i4++) {
            Font font = list.get(i4);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11154getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        objLoadBlocking = asyncTypefaceResult.m11127unboximpl();
                    } else {
                        Unit unit = Unit.INSTANCE;
                        try {
                            objLoadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objLoadBlocking, false, 8, null);
                        } catch (Exception e4) {
                            throw new IllegalStateException("Unable to load font " + font, e4);
                        }
                    }
                }
                if (objLoadBlocking != null) {
                    return TuplesKt.m5182to(listMutableListOf, FontSynthesis_androidKt.m11181synthesizeTypefaceFxwP2eA(typefaceRequest.m11204getFontSynthesisGVVA2EU(), objLoadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m11203getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11155getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        objM11788constructorimpl = asyncTypefaceResult2.m11127unboximpl();
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM11788constructorimpl = Result.m11788constructorimpl(platformFontLoader.loadBlocking(font));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            objM11788constructorimpl = Result.m11788constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m11794isFailureimpl(objM11788constructorimpl)) {
                            objM11788constructorimpl = null;
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objM11788constructorimpl, false, 8, null);
                    }
                }
                if (objM11788constructorimpl != null) {
                    return TuplesKt.m5182to(listMutableListOf, FontSynthesis_androidKt.m11181synthesizeTypefaceFxwP2eA(typefaceRequest.m11204getFontSynthesisGVVA2EU(), objM11788constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m11203getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11153getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM11119get1ASDuI8 = asyncTypefaceCache.m11119get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM11119get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m11125isPermanentFailureimpl(asyncTypefaceResultM11119get1ASDuI8.m11127unboximpl()) && asyncTypefaceResultM11119get1ASDuI8.m11127unboximpl() != null) {
                        return TuplesKt.m5182to(listMutableListOf, FontSynthesis_androidKt.m11181synthesizeTypefaceFxwP2eA(typefaceRequest.m11204getFontSynthesisGVVA2EU(), asyncTypefaceResultM11119get1ASDuI8.m11127unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m11203getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(font);
                } else {
                    listMutableListOf.add(font);
                }
            }
        }
        return TuplesKt.m5182to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
