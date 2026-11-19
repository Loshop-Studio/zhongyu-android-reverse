package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9546r;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface TabIndicatorScope {
    static /* synthetic */ Modifier tabIndicatorOffset$default(TabIndicatorScope tabIndicatorScope, Modifier modifier, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return tabIndicatorScope.tabIndicatorOffset(modifier, i10, z10);
    }

    Modifier tabIndicatorLayout(Modifier modifier, InterfaceC9546r interfaceC9546r);

    Modifier tabIndicatorOffset(Modifier modifier, int i10, boolean z10);
}
