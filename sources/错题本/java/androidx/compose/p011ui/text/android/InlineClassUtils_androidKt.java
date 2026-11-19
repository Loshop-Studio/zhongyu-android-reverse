package androidx.compose.p011ui.text.android;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b¨\u0006\b"}, m5110d2 = {"packInts", "", "val1", "", "val2", "unpackInt1", "value", "unpackInt2", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i, int i8) {
        return (i8 & 4294967295L) | (i << 32);
    }

    public static final int unpackInt1(long j7) {
        return (int) (j7 >> 32);
    }

    public static final int unpackInt2(long j7) {
        return (int) (j7 & 4294967295L);
    }
}
