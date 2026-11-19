package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 implements InterfaceC9529a {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(Fragment fragment, int i10) {
        this.$this_navGraphViewModels = fragment;
        this.$navGraphId = i10;
    }

    @Override // p181hd.InterfaceC9529a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphId);
    }
}
