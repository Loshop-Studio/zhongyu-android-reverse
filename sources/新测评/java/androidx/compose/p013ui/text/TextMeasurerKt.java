package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.style.TextOverflow;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"DefaultCacheSize", "", "isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m23005isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m23487equalsimpl0(i10, companion.m23497getEllipsisgIe3tQ8()) || TextOverflow.m23487equalsimpl0(i10, companion.m23499getStartEllipsisgIe3tQ8()) || TextOverflow.m23487equalsimpl0(i10, companion.m23498getMiddleEllipsisgIe3tQ8());
    }
}
