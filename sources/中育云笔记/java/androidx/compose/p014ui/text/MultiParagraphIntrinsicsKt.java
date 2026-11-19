package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<Placeholder> range = list.get(i12);
            if (AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                if (!(i10 <= range.getStart() && range.getEnd() <= i11)) {
                    InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new AnnotatedString.Range(range.getItem(), range.getStart() - i10, range.getEnd() - i10));
            }
        }
        return arrayList;
    }
}
