package androidx.compose.foundation.layout;

import androidx.compose.p006ui.Modifier;

/* renamed from: androidx.compose.foundation.layout.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0616e {
    /* renamed from: a */
    public static /* synthetic */ Modifier m197a(RowScope rowScope, Modifier modifier, float f4, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return rowScope.weight(modifier, f4, z3);
    }
}
