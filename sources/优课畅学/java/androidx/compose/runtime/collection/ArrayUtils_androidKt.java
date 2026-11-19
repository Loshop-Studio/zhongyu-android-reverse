package androidx.compose.runtime.collection;

/* loaded from: classes2.dex */
public final class ArrayUtils_androidKt {
    public static final <T> T[] fastCopyInto(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }
}
