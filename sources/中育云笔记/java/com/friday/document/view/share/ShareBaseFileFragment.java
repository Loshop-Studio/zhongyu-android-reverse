package com.friday.document.view.share;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.common.helper.C5962b;
import com.friday.document.R$color;
import com.friday.document.R$string;
import com.friday.document.adapter.ShareFileAdapter;
import com.friday.document.databinding.FragmentShareFileBinding;
import com.friday.document.databinding.PopSortBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.model.ShareListEntity;
import com.friday.document.view.share.ShareBaseFileFragment;
import com.friday.document.viewmodel.ShareBaseViewModel;
import com.friday.document.viewmodel.ShareFileViewModel;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.InterfaceC11612u;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class ShareBaseFileFragment extends Hilt_ShareBaseFileFragment<FragmentShareFileBinding> {

    /* renamed from: i */
    public final InterfaceC10773d f7529i;

    /* renamed from: j */
    public ShareFile f7530j;

    /* renamed from: k */
    public final InterfaceC10773d f7531k = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: x2.c
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return ShareBaseFileFragment.m6011J(this.f27942c);
        }
    });

    public ShareBaseFileFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7529i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(ShareBaseViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareBaseFileFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareBaseFileFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareBaseFileFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: J */
    public static final ShareFileAdapter m6011J(final ShareBaseFileFragment shareBaseFileFragment) {
        return new ShareFileAdapter(new InterfaceC9540l() { // from class: x2.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareBaseFileFragment.m6012K(this.f27944c, (ShareListEntity) obj);
            }
        });
    }

    /* renamed from: K */
    public static final C10786q m6012K(ShareBaseFileFragment shareBaseFileFragment, ShareListEntity item) {
        AbstractC9979u.m20294g(item, "item");
        shareBaseFileFragment.mo6028E().m6422N(item.getShareFile());
        return C10786q.f26013a;
    }

    /* renamed from: O */
    public static final void m6013O(ShareBaseFileFragment shareBaseFileFragment) {
        shareBaseFileFragment.mo6028E().m6420K(new ShareBaseFileFragment$setupRefreshLayout$1$1$1(shareBaseFileFragment));
    }

    /* renamed from: T */
    public static final C10786q m6014T(final ShareBaseFileFragment shareBaseFileFragment, View view, final PopupWindow popupWindow, final PopSortBinding binding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(binding, "binding");
        RadioGroup radioGroup = binding.f6607e;
        radioGroup.check(C5962b.f6082a.m5299a().m5288p() == 0 ? binding.f6605c.getId() : binding.f6606d.getId());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: x2.e
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i10) {
                ShareBaseFileFragment.m6015U(this.f27945a, binding, popupWindow, radioGroup2, i10);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: U */
    public static final void m6015U(ShareBaseFileFragment shareBaseFileFragment, PopSortBinding popSortBinding, PopupWindow popupWindow, RadioGroup radioGroup, int i10) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(shareBaseFileFragment), null, null, new ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1(shareBaseFileFragment, i10, popSortBinding, popupWindow, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final /* synthetic */ FragmentShareFileBinding m6021w(ShareBaseFileFragment shareBaseFileFragment) {
        return (FragmentShareFileBinding) shareBaseFileFragment.getMBinding();
    }

    /* renamed from: B */
    public final ShareBaseViewModel m6025B() {
        return (ShareBaseViewModel) this.f7529i.getValue();
    }

    /* renamed from: C */
    public String mo6026C() {
        return null;
    }

    /* renamed from: D */
    public final ShareFileAdapter m6027D() {
        return (ShareFileAdapter) this.f7531k.getValue();
    }

    /* renamed from: E */
    public abstract ShareFileViewModel mo6028E();

    /* renamed from: F */
    public final ShareFile m6029F() {
        return this.f7530j;
    }

    /* renamed from: G */
    public final void m6030G(ShareFile shareFile, SuspendCall suspendCall, int i10) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareBaseFileFragment$handleFileClick$1(suspendCall, this, i10, shareFile, null), 3, null);
    }

    /* renamed from: H */
    public abstract void mo6031H();

    /* renamed from: I */
    public abstract void mo6032I();

    /* renamed from: L */
    public final void m6033L() {
        ShareFile shareFile = (ShareFile) mo6028E().m6430y().getValue();
        mo6028E().m6422N(null);
        mo6028E().m6429x();
        if (shareFile != null) {
            mo6028E().m6428w();
            return;
        }
        mo6028E().m6423O();
        if (mo6036P()) {
            getParentFragmentManager().popBackStack();
        }
    }

    /* renamed from: M */
    public final void m6034M(ShareFile shareFile) {
        this.f7530j = shareFile;
    }

    /* renamed from: N */
    public final void m6035N(SwipeRefreshLayout refreshLayout) {
        AbstractC9979u.m20294g(refreshLayout, "refreshLayout");
        refreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: x2.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                ShareBaseFileFragment.m6013O(this.f27941a);
            }
        });
    }

    /* renamed from: P */
    public abstract boolean mo6036P();

    /* renamed from: Q */
    public final void m6037Q(List list) {
        if (list.isEmpty()) {
            m6038R(C9166c.f21406a.m18061e());
        } else {
            m6040V();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public final void m6038R(boolean z10) {
        String string;
        RecyclerView rvShare = ((FragmentShareFileBinding) getMBinding()).f6444h;
        AbstractC9979u.m20293f(rvShare, "rvShare");
        rvShare.setVisibility(8);
        View root = ((FragmentShareFileBinding) getMBinding()).f6439c.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(0);
        AppCompatImageView imgNoNetwork = ((FragmentShareFileBinding) getMBinding()).f6439c.f6520c;
        AbstractC9979u.m20293f(imgNoNetwork, "imgNoNetwork");
        imgNoNetwork.setVisibility(z10 ? 8 : 0);
        TextView textView = ((FragmentShareFileBinding) getMBinding()).f6439c.f6522e;
        if (z10) {
            string = "暂无数据";
        } else {
            string = getString(R$string.no_network);
            AbstractC9979u.m20293f(string, "getString(...)");
        }
        textView.setText(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public final void m6039S() {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        C10193a.a aVar = new C10193a(contextRequireContext).new a();
        PopSortBinding popSortBindingM5549a = PopSortBinding.m5549a(getLayoutInflater());
        AbstractC9979u.m20293f(popSortBindingM5549a, "inflate(...)");
        aVar.m21278b(popSortBindingM5549a).m21281e(-2, -2).m21280d(true).m21279c(new InterfaceC9545q() { // from class: x2.a
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ShareBaseFileFragment.m6014T(this.f27937c, (View) obj, (PopupWindow) obj2, (PopSortBinding) obj3);
            }
        }).m21277a().showAsDropDown(((FragmentShareFileBinding) getMBinding()).f6441e, 0, 0, 80);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public final void m6040V() {
        View root = ((FragmentShareFileBinding) getMBinding()).f6439c.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        root.setVisibility(8);
        RecyclerView rvShare = ((FragmentShareFileBinding) getMBinding()).f6444h;
        AbstractC9979u.m20293f(rvShare, "rvShare");
        rvShare.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public final void m6041W(ShareFile shareFile) {
        if (shareFile != null) {
            ((FragmentShareFileBinding) getMBinding()).f6442f.setVisibility(0);
            ((FragmentShareFileBinding) getMBinding()).f6445i.setText(shareFile.getFileName());
            return;
        }
        String strMo6026C = mo6026C();
        if (strMo6026C == null) {
            ((FragmentShareFileBinding) getMBinding()).f6442f.setVisibility(8);
        } else {
            ((FragmentShareFileBinding) getMBinding()).f6442f.setVisibility(0);
            ((FragmentShareFileBinding) getMBinding()).f6445i.setText(strMo6026C);
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        initObserver();
        mo6031H();
    }

    public final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        InterfaceC11612u interfaceC11612uM6431z = mo6028E().m6431z();
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C6066xb31b8df2(viewLifecycleOwner, state, interfaceC11612uM6431z, null, this), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C6067xb31b8df3(viewLifecycleOwner2, state, mo6028E().m6417B(), null, this), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C6068xb31b8df4(viewLifecycleOwner3, state, mo6028E().m6430y(), null, this), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C6069xb31b8df5(viewLifecycleOwner4, state, mo6028E().m6347g(), null, this), 3, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new C6070xb31b8df6(viewLifecycleOwner5, state, m6025B().m6364A(), null, this), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        ImageView ivBack = ((FragmentShareFileBinding) getMBinding()).f6440d;
        AbstractC9979u.m20293f(ivBack, "ivBack");
        ImageView ivMore = ((FragmentShareFileBinding) getMBinding()).f6441e;
        AbstractC9979u.m20293f(ivMore, "ivMore");
        setClickListener(ivBack, ivMore);
        RecyclerView recyclerView = ((FragmentShareFileBinding) getMBinding()).f6444h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m6027D());
        recyclerView.setItemAnimator(null);
        SwipeRefreshLayout refreshLayout = ((FragmentShareFileBinding) getMBinding()).f6443g;
        AbstractC9979u.m20293f(refreshLayout, "refreshLayout");
        m6035N(refreshLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((FragmentShareFileBinding) getMBinding()).f6440d)) {
            m6033L();
        } else if (AbstractC9979u.m20289b(view, ((FragmentShareFileBinding) getMBinding()).f6441e)) {
            m6039S();
        }
    }
}
