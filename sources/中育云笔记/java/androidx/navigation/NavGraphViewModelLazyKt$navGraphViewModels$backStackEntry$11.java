package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11 implements InterfaceC9529a {
    final /* synthetic */ String $navGraphRoute;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(Fragment fragment, String str) {
        this.$this_navGraphViewModels = fragment;
        this.$navGraphRoute = str;
    }

    @Override // p181hd.InterfaceC9529a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphRoute);
    }
}
