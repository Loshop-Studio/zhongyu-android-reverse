package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8 implements InterfaceC10559a {
    final /* synthetic */ String $navGraphRoute;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(Fragment fragment, String str) {
        this.$this_navGraphViewModels = fragment;
        this.$navGraphRoute = str;
    }

    @Override // p300x7.InterfaceC10559a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphRoute);
    }
}
