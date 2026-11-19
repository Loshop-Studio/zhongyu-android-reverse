package com.friday.document.view.document;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.utils.Consts;
import com.friday.common.base.BaseFragment;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.common.widget.dialog.WPSDownloadDialog;
import com.friday.document.adapter.MultiModeFileEntity;
import com.friday.document.view.document.BaseDocumentFragment;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9540l;
import p215k2.AbstractC9806x;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p310qd.AbstractC10793c0;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseDocumentFragment<VM extends BaseFileViewModel, A extends PagingDataAdapter<MultiModeFileEntity, ?>, Binding extends ViewDataBinding> extends BaseFragment<Binding> {

    /* renamed from: d */
    public BaseFileViewModel f7283d;

    /* renamed from: e */
    public PagingDataAdapter f7284e;

    /* renamed from: com.friday.document.view.document.BaseDocumentFragment$a */
    public static final class C6027a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7285c;

        public C6027a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7285c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7285c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7285c.invoke(obj);
        }
    }

    /* renamed from: C */
    public static final C10786q m5802C(BaseDocumentFragment baseDocumentFragment, String str, String str2, String newName) {
        AbstractC9979u.m20294g(newName, "newName");
        baseDocumentFragment.isShowLoading(true);
        baseDocumentFragment.m5820E().m6260r0(str, newName + str2);
        return C10786q.f26013a;
    }

    /* renamed from: G */
    public static final void m5803G(BaseDocumentFragment baseDocumentFragment, Object obj) {
        BaseFileViewModel.m6215x0(baseDocumentFragment.m5820E(), false, null, 2, null);
        baseDocumentFragment.m5826y();
    }

    /* renamed from: H */
    public static final C10786q m5804H(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(baseDocumentFragment), null, null, new BaseDocumentFragment$initBaseObserver$2$1(baseDocumentFragment, fileEntity, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: I */
    public static final C10786q m5805I(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity) {
        if (fileEntity == null) {
            baseDocumentFragment.m5826y();
        } else if (C5962b.f6082a.m5299a().m5294v()) {
            C5963c.f6084a.m5314m(fileEntity.getOfficePath());
        } else {
            AbstractC9806x.a aVar = AbstractC9806x.f23003a;
            Context contextRequireContext = baseDocumentFragment.requireContext();
            AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
            if (aVar.m19819c(contextRequireContext, "cn.wps.moffice_eng")) {
                baseDocumentFragment.startActivity(aVar.m19818b(fileEntity.getOfficePath()));
            } else {
                WPSDownloadDialog wPSDownloadDialog = new WPSDownloadDialog();
                FragmentManager childFragmentManager = baseDocumentFragment.getChildFragmentManager();
                AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                wPSDownloadDialog.show(childFragmentManager, WPSDownloadDialog.class.getSimpleName());
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: J */
    public static final C10786q m5806J(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity) {
        baseDocumentFragment.isShowLoading(false);
        if (fileEntity != null) {
            baseDocumentFragment.m5820E().m6264t0(fileEntity);
        }
        return C10786q.f26013a;
    }

    /* renamed from: K */
    public static final C10786q m5807K(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(baseDocumentFragment), null, null, new BaseDocumentFragment$initBaseObserver$5$1(baseDocumentFragment, fileEntity, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: L */
    public static final void m5808L(BaseDocumentFragment baseDocumentFragment, Object obj) {
        baseDocumentFragment.m5820E().m6264t0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToPosition(RecyclerView recyclerView, int i10) {
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
        int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
        if (i10 < childLayoutPosition || i10 > childLayoutPosition2) {
            recyclerView.scrollToPosition(i10);
            return;
        }
        View childAt2 = recyclerView.getChildAt(i10 - childLayoutPosition);
        if (childAt2 != null) {
            recyclerView.scrollBy(0, childAt2.getTop());
        }
    }

    /* renamed from: A */
    public final void m5817A(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseDocumentFragment$clickTxt$1(this, fileEntity, null), 3, null);
    }

    /* renamed from: B */
    public final void m5818B(final String id2, String type, String name) {
        String str;
        int iM23136l0;
        final String str2;
        String str3;
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(name, "name");
        int iHashCode = type.hashCode();
        if (iHashCode == 48 ? type.equals("0") : iHashCode == 49 ? type.equals("1") : iHashCode == 1568 ? type.equals("11") : iHashCode == 1569 && type.equals("12")) {
            str = name;
            iM23136l0 = 0;
        } else {
            str = name;
            iM23136l0 = AbstractC10793c0.m23136l0(str, Consts.DOT, 0, false, 6, null);
        }
        if (iM23136l0 > 0) {
            String strM23127d1 = AbstractC10793c0.m23127d1(str, Consts.DOT, null, 2, null);
            str2 = Consts.DOT + AbstractC10793c0.m23113W0(str, Consts.DOT, null, 2, null);
            str3 = strM23127d1;
        } else {
            str2 = "";
            str3 = str;
        }
        BaseDialog baseDialogM5439L = C5975a.f6196a.m5439L(type, str3, new InterfaceC9540l() { // from class: v2.g
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BaseDocumentFragment.m5802C(this.f27249c, id2, str2, (String) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9979u.m20291d(childFragmentManager);
        baseDialogM5439L.show(childFragmentManager, "rename");
    }

    /* renamed from: D */
    public final PagingDataAdapter m5819D() {
        PagingDataAdapter pagingDataAdapter = this.f7284e;
        if (pagingDataAdapter != null) {
            return pagingDataAdapter;
        }
        AbstractC9979u.m20312y("mAdapter");
        return null;
    }

    /* renamed from: E */
    public final BaseFileViewModel m5820E() {
        BaseFileViewModel baseFileViewModel = this.f7283d;
        if (baseFileViewModel != null) {
            return baseFileViewModel;
        }
        AbstractC9979u.m20312y("mViewModel");
        return null;
    }

    /* renamed from: F */
    public final void m5821F() {
        LiveEventBus.get("MoveFileSuccess").observe(getViewLifecycleOwner(), new Observer() { // from class: v2.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseDocumentFragment.m5803G(this.f27235c, obj);
            }
        });
        m5820E().m6248f0().observe(getViewLifecycleOwner(), new C6027a(new InterfaceC9540l() { // from class: v2.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BaseDocumentFragment.m5804H(this.f27237c, (FileEntity) obj);
            }
        }));
        m5820E().m6226J().observe(getViewLifecycleOwner(), new C6027a(new InterfaceC9540l() { // from class: v2.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BaseDocumentFragment.m5805I(this.f27240c, (FileEntity) obj);
            }
        }));
        m5820E().m6236T().observe(getViewLifecycleOwner(), new C6027a(new InterfaceC9540l() { // from class: v2.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BaseDocumentFragment.m5806J(this.f27242c, (FileEntity) obj);
            }
        }));
        m5820E().m6247e0().observe(getViewLifecycleOwner(), new C6027a(new InterfaceC9540l() { // from class: v2.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BaseDocumentFragment.m5807K(this.f27244c, (FileEntity) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseDocumentFragment$initBaseObserver$6(this, null), 3, null);
        LiveEventBus.get("ClearCache").observe(getViewLifecycleOwner(), new Observer() { // from class: v2.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseDocumentFragment.m5808L(this.f27246c, obj);
            }
        });
    }

    /* renamed from: M */
    public final void m5822M() {
        m5819D().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i10, int i11) {
                super.onItemRangeRemoved(i10, i11);
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f7303a), null, null, new C6029xc217e39b(this.f7303a, null), 3, null);
            }
        });
    }

    /* renamed from: N */
    public final void m5823N(RecyclerView recyclerView, String fileId) {
        AbstractC9979u.m20294g(recyclerView, "recyclerView");
        AbstractC9979u.m20294g(fileId, "fileId");
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseDocumentFragment$scrollToData$1(recyclerView, this, fileId, null));
    }

    /* renamed from: O */
    public final void m5824O(PagingDataAdapter pagingDataAdapter) {
        AbstractC9979u.m20294g(pagingDataAdapter, "<set-?>");
        this.f7284e = pagingDataAdapter;
    }

    /* renamed from: P */
    public final void m5825P(BaseFileViewModel baseFileViewModel) {
        AbstractC9979u.m20294g(baseFileViewModel, "<set-?>");
        this.f7283d = baseFileViewModel;
    }

    /* renamed from: y */
    public final void m5826y() {
        m5820E().m6264t0(null);
    }

    /* renamed from: z */
    public final void m5827z(FileEntity data) {
        AbstractC9979u.m20294g(data, "data");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseDocumentFragment$clickNote$1(this, data, null), 3, null);
    }
}
