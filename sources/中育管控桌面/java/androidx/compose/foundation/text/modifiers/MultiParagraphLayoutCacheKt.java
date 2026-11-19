package androidx.compose.foundation.text.modifiers;

import androidx.compose.p009ui.unit.TextUnit;
import androidx.compose.p009ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m7880d2 = {"DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "times", "other", "times-NB67dxo", "(JJ)J", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,491:1\n247#2:492\n142#3,2:493\n142#3,2:495\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n479#1:492\n482#1:493,2\n484#1:495,2\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m11291timesNB67dxo(long j6, long j7) {
        if (!TextUnit.m16680isEmimpl(j7)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m16685toStringimpl(j7)) + '.');
        }
        if (TextUnit.m16680isEmimpl(j6)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m16685toStringimpl(j7)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m16676getRawTypeimpl(j6) != 0) {
            float fM16678getValueimpl = TextUnit.m16678getValueimpl(j7);
            TextUnitKt.m16691checkArithmeticR2X_6o(j6);
            return TextUnitKt.pack(TextUnit.m16676getRawTypeimpl(j6), TextUnit.m16678getValueimpl(j6) * fM16678getValueimpl);
        }
        long j8 = DefaultFontSize;
        float fM16678getValueimpl2 = TextUnit.m16678getValueimpl(j7);
        TextUnitKt.m16691checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(TextUnit.m16676getRawTypeimpl(j8), TextUnit.m16678getValueimpl(j8) * fM16678getValueimpl2);
    }
}
