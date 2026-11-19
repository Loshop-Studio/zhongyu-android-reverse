package androidx.compose.material3.carousel;

/* loaded from: classes2.dex */
public interface KeylineListScope {
    static /* synthetic */ void add$default(KeylineListScope keylineListScope, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        keylineListScope.add(f10, z10);
    }

    void add(float f10, boolean z10);
}
