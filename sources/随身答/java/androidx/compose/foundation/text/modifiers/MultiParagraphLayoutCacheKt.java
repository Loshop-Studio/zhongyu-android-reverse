package androidx.compose.foundation.text.modifiers;

import androidx.compose.p012ui.unit.TextUnit;
import androidx.compose.p012ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m13413d2 = {"DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "times", "other", "times-NB67dxo", "(JJ)J", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,491:1\n247#2:492\n142#3,2:493\n142#3,2:495\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n479#1:492\n482#1:493,2\n484#1:495,2\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m18801timesNB67dxo(long j9, long j10) {
        if (!TextUnit.m24190isEmimpl(j10)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m24195toStringimpl(j10)) + '.');
        }
        if (TextUnit.m24190isEmimpl(j9)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m24195toStringimpl(j10)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m24186getRawTypeimpl(j9) != 0) {
            float fM24188getValueimpl = TextUnit.m24188getValueimpl(j10);
            TextUnitKt.m24201checkArithmeticR2X_6o(j9);
            return TextUnitKt.pack(TextUnit.m24186getRawTypeimpl(j9), TextUnit.m24188getValueimpl(j9) * fM24188getValueimpl);
        }
        long j11 = DefaultFontSize;
        float fM24188getValueimpl2 = TextUnit.m24188getValueimpl(j10);
        TextUnitKt.m24201checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(TextUnit.m24186getRawTypeimpl(j11), TextUnit.m24188getValueimpl(j11) * fM24188getValueimpl2);
    }
}
