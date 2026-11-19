package androidx.compose.p009ui.text.android;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b¨\u0006\b"}, m7880d2 = {"packInts", "", "val1", "", "val2", "unpackInt1", "value", "unpackInt2", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i6, int i7) {
        return (i7 & 4294967295L) | (i6 << 32);
    }

    public static final int unpackInt1(long j6) {
        return (int) (j6 >> 32);
    }

    public static final int unpackInt2(long j6) {
        return (int) (j6 & 4294967295L);
    }
}
