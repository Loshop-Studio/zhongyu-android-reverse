package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 implements InterfaceC10559a {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(Fragment fragment, int i10) {
        this.$this_navGraphViewModels = fragment;
        this.$navGraphId = i10;
    }

    @Override // p300x7.InterfaceC10559a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphId);
    }
}
