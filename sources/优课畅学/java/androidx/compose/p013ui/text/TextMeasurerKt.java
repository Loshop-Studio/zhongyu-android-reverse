package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.style.TextOverflow;

/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m26342isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m26825equalsimpl0(i10, companion.m26835getEllipsisgIe3tQ8()) || TextOverflow.m26825equalsimpl0(i10, companion.m26837getStartEllipsisgIe3tQ8()) || TextOverflow.m26825equalsimpl0(i10, companion.m26836getMiddleEllipsisgIe3tQ8());
    }
}
