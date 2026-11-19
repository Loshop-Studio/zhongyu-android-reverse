package androidx.compose.p013ui.focus;

/* loaded from: classes2.dex */
public interface FocusManager {

    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        focusManager.clearFocus(z10);
    }

    void clearFocus(boolean z10);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo23927moveFocus3ESFkO8(int i10);
}
