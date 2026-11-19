package androidx.compose.foundation.text.modifiers;

import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m5110d2 = {"DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "times", "other", "times-NB67dxo", "(JJ)J", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,491:1\n247#2:492\n142#3,2:493\n142#3,2:495\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n479#1:492\n482#1:493,2\n484#1:495,2\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m7996timesNB67dxo(long j7, long j8) {
        if (!TextUnit.m13501isEmimpl(j8)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m13506toStringimpl(j8)) + '.');
        }
        if (TextUnit.m13501isEmimpl(j7)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m13506toStringimpl(j8)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m13497getRawTypeimpl(j7) != 0) {
            float fM13499getValueimpl = TextUnit.m13499getValueimpl(j8);
            TextUnitKt.m13512checkArithmeticR2X_6o(j7);
            return TextUnitKt.pack(TextUnit.m13497getRawTypeimpl(j7), TextUnit.m13499getValueimpl(j7) * fM13499getValueimpl);
        }
        long j9 = DefaultFontSize;
        float fM13499getValueimpl2 = TextUnit.m13499getValueimpl(j8);
        TextUnitKt.m13512checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(TextUnit.m13497getRawTypeimpl(j9), TextUnit.m13499getValueimpl(j9) * fM13499getValueimpl2);
    }
}
