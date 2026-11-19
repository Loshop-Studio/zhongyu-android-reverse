package com.zykj.huiwei.launcher.p035ui.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.huiwei.launcher.databinding.HwFragmentMainBinding;
import com.zykj.huiwei.launcher.p035ui.adapter.DotAdapter;
import com.zykj.huiwei.launcher.p035ui.adapter.MainPageAdapter;
import com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.MainFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.HuiWeiAppFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.LCAppFragment;
import com.zykj.manage.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6537g;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0005R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'¨\u0006+"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;", "Lcom/zykj/huiwei/launcher/base/CommonFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentMainBinding;", "Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$a;", "<init>", "()V", "", "layoutId", "()I", "", "isOpen", "", "c", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lkotlin/Function0;", "closeBlock", "b", "(Lkotlin/jvm/functions/Function0;)V", "f", "i", "Lkotlin/jvm/functions/Function0;", "closeDrawableLayoutBlock", "", "Landroidx/fragment/app/Fragment;", "j", "Lkotlin/Lazy;", "w", "()Ljava/util/List;", "fragments", "Lcom/zykj/huiwei/launcher/ui/adapter/DotAdapter;", "k", "v", "()Lcom/zykj/huiwei/launcher/ui/adapter/DotAdapter;", "dotAdapter", "l", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class MainFragment extends Hilt_MainFragment<HwFragmentMainBinding> implements HomeFragment.InterfaceC6133a {

    /* renamed from: m */
    public static final int f6736m = 8;

    /* renamed from: i, reason: from kotlin metadata */
    public Function0 closeDrawableLayoutBlock;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy fragments = LazyKt.lazy(new Function0() { // from class: f4.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainFragment.m5937u(this.f7724a);
        }
    });

    /* renamed from: k, reason: from kotlin metadata */
    public final Lazy dotAdapter = LazyKt.lazy(new Function0() { // from class: f4.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainFragment.m5936t();
        }
    });

    /* renamed from: t */
    public static final DotAdapter m5936t() {
        return new DotAdapter();
    }

    /* renamed from: u */
    public static final List m5937u(MainFragment mainFragment) {
        HomeFragment homeFragment = new HomeFragment();
        homeFragment.m5897c0(mainFragment);
        Unit unit = Unit.INSTANCE;
        return CollectionsKt.mutableListOf(homeFragment, AbstractC6537g.f8372a.m7316g() ? new LCAppFragment() : new HuiWeiAppFragment());
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment.InterfaceC6133a
    /* renamed from: b */
    public void mo5898b(Function0 closeBlock) {
        Intrinsics.checkNotNullParameter(closeBlock, "closeBlock");
        this.closeDrawableLayoutBlock = closeBlock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment.InterfaceC6133a
    /* renamed from: c */
    public void mo5899c(boolean isOpen) {
        ((HwFragmentMainBinding) getMBindView()).vpMain.setUserInputEnabled(!isOpen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: f */
    public void mo5284f() {
        CrashReport.initCrashReport(requireContext().getApplicationContext(), "48c745176b", false);
        ((HwFragmentMainBinding) getMBindView()).vpMain.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.zykj.huiwei.launcher.ui.fragment.MainFragment$initView$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                this.f6740a.m5938v().m5608g(position);
            }
        });
        ((HwFragmentMainBinding) getMBindView()).rvDot.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ((HwFragmentMainBinding) getMBindView()).rvDot.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.huiwei.launcher.ui.fragment.MainFragment$initView$2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                if (parent.getChildAdapterPosition(view) > 0) {
                    outRect.left = this.f6741a.getResources().getDimensionPixelSize(R.dimen.pt8);
                }
            }
        });
        m5938v().setNewInstance(m5939w());
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new OnBackPressedCallback() { // from class: com.zykj.huiwei.launcher.ui.fragment.MainFragment$initView$3
            {
                super(true);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (((HwFragmentMainBinding) this.f6742a.getMBindView()).vpMain.getCurrentItem() != 0) {
                    ((HwFragmentMainBinding) this.f6742a.getMBindView()).vpMain.setCurrentItem(0, true);
                    return;
                }
                Function0 function0 = this.f6742a.closeDrawableLayoutBlock;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_main;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((HwFragmentMainBinding) getMBindView()).vpMain.setAdapter(null);
        ((HwFragmentMainBinding) getMBindView()).rvDot.setAdapter(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewPager2 viewPager2 = ((HwFragmentMainBinding) getMBindView()).vpMain;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new MainPageAdapter(childFragmentManager, lifecycle, m5939w()));
        ((HwFragmentMainBinding) getMBindView()).rvDot.setAdapter(m5938v());
    }

    /* renamed from: v */
    public final DotAdapter m5938v() {
        return (DotAdapter) this.dotAdapter.getValue();
    }

    /* renamed from: w */
    public final List m5939w() {
        return (List) this.fragments.getValue();
    }
}
