package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.style.TextOverflow;

/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m32944isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m33427equalsimpl0(i10, companion.m33437getEllipsisgIe3tQ8()) || TextOverflow.m33427equalsimpl0(i10, companion.m33439getStartEllipsisgIe3tQ8()) || TextOverflow.m33427equalsimpl0(i10, companion.m33438getMiddleEllipsisgIe3tQ8());
    }
}
