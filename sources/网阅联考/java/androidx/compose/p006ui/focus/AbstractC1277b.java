package androidx.compose.p006ui.focus;

/* renamed from: androidx.compose.ui.focus.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1277b {
    /* renamed from: a */
    public static /* synthetic */ void m356a(FocusManager focusManager, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        focusManager.clearFocus(z3);
    }
}
