package androidx.compose.foundation.gestures;

/* loaded from: classes.dex */
public interface AnchoredDragScope {
    static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        anchoredDragScope.dragTo(f10, f11);
    }

    void dragTo(float f10, float f11);
}
