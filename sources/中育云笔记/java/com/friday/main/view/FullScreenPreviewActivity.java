package com.friday.main.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.ClickUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.databinding.PopupWindowNoteInfoBinding;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5963c;
import com.friday.main.R$color;
import com.friday.main.R$dimen;
import com.friday.main.R$drawable;
import com.friday.main.R$layout;
import com.friday.main.R$mipmap;
import com.friday.main.adapter.FullScreenPreviewAdapter;
import com.friday.main.databinding.FullScreenActivityBinding;
import com.friday.main.view.FullScreenPreviewActivity;
import com.friday.main.viewmodel.FullScreenViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/main/NotePreviewActivity")
/* loaded from: classes4.dex */
public final class FullScreenPreviewActivity extends Hilt_FullScreenPreviewActivity<FullScreenActivityBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f9306g;

    /* renamed from: i */
    public FileEntity f9308i;

    /* renamed from: k */
    public boolean f9310k;

    /* renamed from: m */
    public boolean f9312m;

    /* renamed from: h */
    public final InterfaceC10773d f9307h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.t0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return FullScreenPreviewActivity.m7063W();
        }
    });

    /* renamed from: j */
    public String f9309j = "";

    /* renamed from: l */
    public boolean f9311l = true;

    /* renamed from: n */
    public String f9313n = "";

    /* renamed from: com.friday.main.view.FullScreenPreviewActivity$a */
    public static final class C6203a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9318c;

        public C6203a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9318c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9318c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9318c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.FullScreenPreviewActivity$onResume$1", m26211f = "FullScreenPreviewActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.FullScreenPreviewActivity$onResume$1 */
    public static final class C62041 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9319c;

        public C62041(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FullScreenPreviewActivity.this.new C62041(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String fileId;
            AbstractC11725a.m25952f();
            if (this.f9319c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (FullScreenPreviewActivity.this.f9308i != null) {
                FullScreenPreviewActivity.this.isShowLoading(true);
                FileEntity fileEntity = FullScreenPreviewActivity.this.f9308i;
                if (fileEntity == null || (fileId = fileEntity.getFileId()) == null) {
                    FullScreenPreviewActivity.this.isShowLoading(false);
                } else {
                    FullScreenPreviewActivity.this.m7071Y().m7236j(fileId);
                }
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62041) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public FullScreenPreviewActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9306g = new ViewModelLazy(AbstractC9983y.m20315b(FullScreenViewModel.class), new InterfaceC9529a() { // from class: com.friday.main.view.FullScreenPreviewActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.FullScreenPreviewActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.FullScreenPreviewActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: W */
    public static final FullScreenPreviewAdapter m7063W() {
        return new FullScreenPreviewAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    public static final C10786q m7064Z(FullScreenPreviewActivity fullScreenPreviewActivity, FileEntity fileEntity) {
        if (fileEntity != null) {
            fullScreenPreviewActivity.f9308i = fileEntity;
            ((FullScreenActivityBinding) fullScreenPreviewActivity.getMBinding()).f9181n.setText(fileEntity.getFileName());
            fullScreenPreviewActivity.m7072f0(fileEntity);
            if (fullScreenPreviewActivity.f9312m) {
                fullScreenPreviewActivity.m7071Y().m7238l(fileEntity);
            } else {
                fullScreenPreviewActivity.m7071Y().m7237k(fileEntity);
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: a0 */
    public static final C10786q m7065a0(FullScreenPreviewActivity fullScreenPreviewActivity, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            BaseQuickAdapter.setDiffNewData$default(fullScreenPreviewActivity.m7070X(), AbstractC10947g0.m23925a1(list2), null, 2, null);
            fullScreenPreviewActivity.m7070X().notifyDataSetChanged();
        }
        fullScreenPreviewActivity.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    public static final C10786q m7066b0(FullScreenPreviewActivity fullScreenPreviewActivity, List list) {
        fullScreenPreviewActivity.m7070X().setList(list);
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    public static final void m7067c0(FullScreenPreviewActivity fullScreenPreviewActivity, SwipeRefreshLayout swipeRefreshLayout) {
        fullScreenPreviewActivity.m7070X().m6921l();
        swipeRefreshLayout.setRefreshing(false);
    }

    /* renamed from: d0 */
    public static final void m7068d0(FullScreenPreviewActivity fullScreenPreviewActivity, View view) {
        FileEntity fileEntity = fullScreenPreviewActivity.f9308i;
        if (fileEntity != null) {
            if (fullScreenPreviewActivity.f9312m) {
                C5963c.m5302h(C5963c.f6084a, fileEntity.getFileId(), fileEntity.getParentId(), fileEntity.getFileName(), null, 8, null);
            } else {
                C5963c.m5303j(C5963c.f6084a, fileEntity.getFileId(), fileEntity.getParentId(), fileEntity.getFileName(), null, 8, null);
            }
        }
    }

    /* renamed from: e0 */
    public static final C10786q m7069e0(FullScreenPreviewActivity fullScreenPreviewActivity, View view, PopupWindow popupWindow, PopupWindowNoteInfoBinding dataBinding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(dataBinding, "dataBinding");
        if (fullScreenPreviewActivity.f9311l) {
            FileEntity fileEntity = fullScreenPreviewActivity.f9308i;
            if (fileEntity != null) {
                dataBinding.f6013f.setText("修改时间：" + fileEntity.getUpdateTime());
                dataBinding.f6012e.setText("创建时间：" + fileEntity.getCreateTime());
                if (fileEntity.syncUncompleted()) {
                    dataBinding.f6011d.setVisibility(0);
                    dataBinding.f6015h.setVisibility(0);
                    if (fileEntity.isFailedState()) {
                        dataBinding.f6010c.setImageResource(R$drawable.icon_sync_failed);
                        dataBinding.f6014g.setText("文件同步失败");
                        dataBinding.f6014g.setTextColor(SupportMenu.CATEGORY_MASK);
                    } else {
                        dataBinding.f6010c.setImageResource(R$drawable.icon_to_be_synced);
                        dataBinding.f6014g.setText("文件等待同步");
                        dataBinding.f6014g.setTextColor(ContextCompat.getColor(fullScreenPreviewActivity.getBaseContext(), R$color.app_l_dark));
                    }
                } else {
                    dataBinding.f6011d.setVisibility(8);
                    dataBinding.f6015h.setVisibility(8);
                }
                popupWindow.dismiss();
            }
        } else {
            dataBinding.f6013f.setText("收到分享：" + fullScreenPreviewActivity.f9313n);
            dataBinding.f6012e.setVisibility(8);
            popupWindow.dismiss();
        }
        return C10786q.f26013a;
    }

    /* renamed from: X */
    public final FullScreenPreviewAdapter m7070X() {
        return (FullScreenPreviewAdapter) this.f9307h.getValue();
    }

    /* renamed from: Y */
    public final FullScreenViewModel m7071Y() {
        return (FullScreenViewModel) this.f9306g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public final void m7072f0(FileEntity fileEntity) {
        if (fileEntity.syncUncompleted()) {
            ((FullScreenActivityBinding) getMBinding()).f9174g.setImageDrawable(ContextCompat.getDrawable(getBaseContext(), R$drawable.ic_error_note_info));
        } else {
            ((FullScreenActivityBinding) getMBinding()).f9174g.setImageDrawable(ContextCompat.getDrawable(getBaseContext(), R$mipmap.icon_note_info));
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.full_screen_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        initView();
        initDataSource();
        if (this.f9311l) {
            m7071Y().m7236j(this.f9309j);
        } else {
            m7071Y().m7240n(this.f9309j);
        }
    }

    @Override // com.friday.common.base.BaseActivity
    public void initDataSource() {
        super.initDataSource();
        m7071Y().m7235i().observe(this, new C6203a(new InterfaceC9540l() { // from class: v3.u0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FullScreenPreviewActivity.m7064Z(this.f27378c, (FileEntity) obj);
            }
        }));
        m7071Y().m7234h().observe(this, new C6203a(new InterfaceC9540l() { // from class: v3.v0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FullScreenPreviewActivity.m7065a0(this.f27379c, (List) obj);
            }
        }));
        m7071Y().m7239m().observe(this, new C6203a(new InterfaceC9540l() { // from class: v3.w0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FullScreenPreviewActivity.m7066b0(this.f27382c, (List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() {
        super.initView();
        if (this.f9310k) {
            ((FullScreenActivityBinding) getMBinding()).f9172e.setVisibility(8);
        }
        if (!this.f9311l) {
            ((FullScreenActivityBinding) getMBinding()).f9171d.setVisibility(8);
        }
        ((FullScreenActivityBinding) getMBinding()).f9173f.setVisibility(0);
        ((FullScreenActivityBinding) getMBinding()).f9172e.setImageResource(R$mipmap.icon_full_screen);
        RecyclerView recyclerView = ((FullScreenActivityBinding) getMBinding()).f9180m;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(m7070X());
        final SwipeRefreshLayout swipeRefreshLayout = ((FullScreenActivityBinding) getMBinding()).f9178k;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: v3.s0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                FullScreenPreviewActivity.m7067c0(this.f27373a, swipeRefreshLayout);
            }
        });
        m7070X().setDiffCallback(new FullScreenPreviewAdapter.FullScreenPreviewDiff());
        ImageView ivFinish = ((FullScreenActivityBinding) getMBinding()).f9173f;
        AbstractC9979u.m20293f(ivFinish, "ivFinish");
        ImageView ivCancelFullScreen = ((FullScreenActivityBinding) getMBinding()).f9172e;
        AbstractC9979u.m20293f(ivCancelFullScreen, "ivCancelFullScreen");
        ImageView ivNoteRename = ((FullScreenActivityBinding) getMBinding()).f9176i;
        AbstractC9979u.m20293f(ivNoteRename, "ivNoteRename");
        ImageView ivNoteLabel = ((FullScreenActivityBinding) getMBinding()).f9175h;
        AbstractC9979u.m20293f(ivNoteLabel, "ivNoteLabel");
        ImageView ivNoteInfo = ((FullScreenActivityBinding) getMBinding()).f9174g;
        AbstractC9979u.m20293f(ivNoteInfo, "ivNoteInfo");
        FloatingActionButton fabEdit = ((FullScreenActivityBinding) getMBinding()).f9171d;
        AbstractC9979u.m20293f(fabEdit, "fabEdit");
        setClickListener(ivFinish, ivCancelFullScreen, ivNoteRename, ivNoteLabel, ivNoteInfo, fabEdit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((FullScreenActivityBinding) getMBinding()).f9173f) || AbstractC9979u.m20289b(view, ((FullScreenActivityBinding) getMBinding()).f9172e)) {
            finish();
            return;
        }
        if (!AbstractC9979u.m20289b(view, ((FullScreenActivityBinding) getMBinding()).f9174g)) {
            if (AbstractC9979u.m20289b(view, ((FullScreenActivityBinding) getMBinding()).f9171d)) {
                ClickUtils.applyGlobalDebouncing(view, 500L, new View.OnClickListener() { // from class: v3.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FullScreenPreviewActivity.m7068d0(this.f27397c, view2);
                    }
                });
            }
        } else {
            C10193a.a aVar = new C10193a(this).new a();
            PopupWindowNoteInfoBinding popupWindowNoteInfoBindingM5238a = PopupWindowNoteInfoBinding.m5238a(getLayoutInflater());
            AbstractC9979u.m20293f(popupWindowNoteInfoBindingM5238a, "inflate(...)");
            aVar.m21278b(popupWindowNoteInfoBindingM5238a).m21281e((int) getResources().getDimension(R$dimen.view_168), -2).m21280d(true).m21279c(new InterfaceC9545q() { // from class: v3.x0
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FullScreenPreviewActivity.m7069e0(this.f27390c, (View) obj, (PopupWindow) obj2, (PopupWindowNoteInfoBinding) obj3);
                }
            }).m21277a().showAsDropDown(view, 0, 0, 80);
        }
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m7070X().m6919j();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62041(null), 3, null);
    }
}
