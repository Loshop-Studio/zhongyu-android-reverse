package com.friday.document.view.share;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.adapter.TeacherListShareAdapter;
import com.friday.document.databinding.FragmentShareByTeacherBinding;
import com.friday.document.model.TchByCloudEntity;
import com.friday.document.view.share.ShareByTeacherFragment;
import com.friday.document.viewmodel.ShareByTeacherViewModel;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p200j2.InterfaceC9669i;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareByTeacherFragment extends Hilt_ShareByTeacherFragment<FragmentShareByTeacherBinding> implements InterfaceC9669i {

    /* renamed from: i */
    public final InterfaceC10773d f7597i;

    /* renamed from: j */
    public final InterfaceC10773d f7598j;

    public ShareByTeacherFragment() {
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareByTeacherFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareByTeacherFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC9529a.invoke();
            }
        });
        final InterfaceC9529a interfaceC9529a2 = null;
        this.f7597i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareByTeacherViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareByTeacherFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b).getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareByTeacherFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
                if (interfaceC9529a3 != null && (creationExtras = (CreationExtras) interfaceC9529a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareByTeacherFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f7598j = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: x2.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ShareByTeacherFragment.m6052E(this.f27948c);
            }
        });
    }

    /* renamed from: C */
    public static final void m6050C(ShareByTeacherFragment shareByTeacherFragment) {
        shareByTeacherFragment.m6066G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final void m6051D(ShareByTeacherFragment shareByTeacherFragment) {
        boolean z10 = shareByTeacherFragment.getChildFragmentManager().getBackStackEntryCount() > 0;
        ((FragmentShareByTeacherBinding) shareByTeacherFragment.getMBinding()).f6433e.setVisibility(z10 ? 8 : 0);
        ((FragmentShareByTeacherBinding) shareByTeacherFragment.getMBinding()).f6432d.setVisibility(z10 ? 0 : 8);
    }

    /* renamed from: E */
    public static final TeacherListShareAdapter m6052E(final ShareByTeacherFragment shareByTeacherFragment) {
        return new TeacherListShareAdapter(new InterfaceC9540l() { // from class: x2.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareByTeacherFragment.m6053F(this.f27951c, (TchByCloudEntity) obj);
            }
        });
    }

    /* renamed from: F */
    public static final C10786q m6053F(ShareByTeacherFragment shareByTeacherFragment, TchByCloudEntity item) {
        AbstractC9979u.m20294g(item, "item");
        shareByTeacherFragment.m6065B().m6394l(item);
        shareByTeacherFragment.getChildFragmentManager().beginTransaction().replace(R$id.file_list_container, ShareTeacherFileFragment.f7655q.m6103a(item.getTeacherId(), item.getTeacherName())).addToBackStack(null).commit();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m6054H(List list) {
        if (list.isEmpty()) {
            m6055I(C9166c.f21406a.m18061e());
        } else {
            m6067J(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    private final void m6055I(boolean z10) {
        String string;
        RecyclerView rvShare = ((FragmentShareByTeacherBinding) getMBinding()).f6434f;
        AbstractC9979u.m20293f(rvShare, "rvShare");
        rvShare.setVisibility(8);
        View root = ((FragmentShareByTeacherBinding) getMBinding()).f6431c.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        AppCompatImageView imgNoNetwork = ((FragmentShareByTeacherBinding) getMBinding()).f6431c.f6520c;
        AbstractC9979u.m20293f(imgNoNetwork, "imgNoNetwork");
        imgNoNetwork.setVisibility(z10 ? 8 : 0);
        TextView textView = ((FragmentShareByTeacherBinding) getMBinding()).f6431c.f6522e;
        if (z10) {
            string = "暂无数据";
        } else {
            string = getString(R$string.no_network);
            AbstractC9979u.m20293f(string, "getString(...)");
        }
        textView.setText(string);
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        InterfaceC11612u interfaceC11612uM6393k = m6065B().m6393k();
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C6074xa8c78c32(viewLifecycleOwner, state, interfaceC11612uM6393k, null, this), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C6075xa8c78c33(viewLifecycleOwner2, state, m6065B().m6395m(), null, this), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final /* synthetic */ FragmentShareByTeacherBinding m6061w(ShareByTeacherFragment shareByTeacherFragment) {
        return (FragmentShareByTeacherBinding) shareByTeacherFragment.getMBinding();
    }

    /* renamed from: z */
    public static /* synthetic */ void m6063z(ShareByTeacherFragment shareByTeacherFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        shareByTeacherFragment.m6069y(z10);
    }

    /* renamed from: A */
    public final TeacherListShareAdapter m6064A() {
        return (TeacherListShareAdapter) this.f7598j.getValue();
    }

    /* renamed from: B */
    public final ShareByTeacherViewModel m6065B() {
        return (ShareByTeacherViewModel) this.f7597i.getValue();
    }

    /* renamed from: G */
    public final void m6066G() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareByTeacherFragment$reloadData$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public final void m6067J(List list) {
        View root = ((FragmentShareByTeacherBinding) getMBinding()).f6431c.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(8);
        RecyclerView rvShare = ((FragmentShareByTeacherBinding) getMBinding()).f6434f;
        AbstractC9979u.m20293f(rvShare, "rvShare");
        rvShare.setVisibility(0);
        m6064A().submitList(list);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_share_by_teacher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initClick() {
        ((FragmentShareByTeacherBinding) getMBinding()).f6433e.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: x2.i
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                ShareByTeacherFragment.m6050C(this.f27950a);
            }
        });
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        initObserver();
        initClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        ((FragmentShareByTeacherBinding) getMBinding()).f6434f.setLayoutManager(new LinearLayoutManager(getContext()));
        ((FragmentShareByTeacherBinding) getMBinding()).f6434f.setAdapter(m6064A());
        getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: x2.h
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                ShareByTeacherFragment.m6051D(this.f27949a);
            }
        });
    }

    @Override // p200j2.InterfaceC9669i
    /* renamed from: l */
    public void mo6068l() {
        if (isAdded()) {
            ActivityResultCaller activityResultCallerFindFragmentById = getChildFragmentManager().findFragmentById(R$id.file_list_container);
            if (activityResultCallerFindFragmentById instanceof InterfaceC9669i) {
                ((InterfaceC9669i) activityResultCallerFindFragmentById).mo6068l();
            } else {
                m6063z(this, false, 1, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m6063z(this, false, 1, null);
    }

    /* renamed from: y */
    public final void m6069y(boolean z10) {
        m6065B().m6392i(z10);
    }
}
