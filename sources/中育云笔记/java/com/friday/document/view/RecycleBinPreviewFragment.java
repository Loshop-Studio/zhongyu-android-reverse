package com.friday.document.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.friday.common.databinding.PopupWindowNoteInfoBinding;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.FBIWarningDialog;
import com.friday.document.R$color;
import com.friday.document.R$drawable;
import com.friday.document.R$layout;
import com.friday.document.R$mipmap;
import com.friday.document.R$string;
import com.friday.document.adapter.PreviewAdapter;
import com.friday.document.databinding.LayoutNotePreviewOthersBinding;
import com.friday.document.databinding.RecyclePreviewFragmentBinding;
import com.friday.document.view.RecycleBinPreviewFragment;
import com.friday.document.viewmodel.RecycleBinViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p215k2.AbstractC9796n;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p380w.AbstractC11630j;
import p380w.C11627g;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class RecycleBinPreviewFragment extends Hilt_RecycleBinPreviewFragment<RecyclePreviewFragmentBinding> {

    /* renamed from: i */
    public final InterfaceC10773d f7229i = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: u2.b0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return RecycleBinPreviewFragment.m5771Z();
        }
    });

    /* renamed from: j */
    public final InterfaceC10773d f7230j;

    /* renamed from: com.friday.document.view.RecycleBinPreviewFragment$a */
    public static final class C6022a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7235c;

        public C6022a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7235c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7235c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7235c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$onResume$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {349}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.RecycleBinPreviewFragment$onResume$1 */
    public static final class C60251 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7267c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$onResume$1$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {351}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.RecycleBinPreviewFragment$onResume$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public Object f7269c;

            /* renamed from: d */
            public int f7270d;

            /* renamed from: e */
            public final /* synthetic */ RecycleBinPreviewFragment f7271e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecycleBinPreviewFragment recycleBinPreviewFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7271e = recycleBinPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7271e, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PreviewAdapter previewAdapter;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7270d;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    FileEntity fileEntity = (FileEntity) this.f7271e.m5788S().m6222F().getValue();
                    if (AbstractC9979u.m20289b(fileEntity != null ? fileEntity.getFileType() : null, "1")) {
                        PreviewAdapter previewAdapterM5787R = this.f7271e.m5787R();
                        RecycleBinViewModel recycleBinViewModelM5788S = this.f7271e.m5788S();
                        Object value = this.f7271e.m5788S().m6222F().getValue();
                        AbstractC9979u.m20291d(value);
                        this.f7269c = previewAdapterM5787R;
                        this.f7270d = 1;
                        Object objM6233Q = recycleBinViewModelM5788S.m6233Q((FileEntity) value, this);
                        if (objM6233Q == objM25952f) {
                            return objM25952f;
                        }
                        previewAdapter = previewAdapterM5787R;
                        obj = objM6233Q;
                    }
                    return C10786q.f26013a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                previewAdapter = (PreviewAdapter) this.f7269c;
                AbstractC9924b.m20071b(obj);
                previewAdapter.submitList((List) obj);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60251(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return RecycleBinPreviewFragment.this.new C60251(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7267c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecycleBinPreviewFragment.this, null);
                this.f7267c = 1;
                if (AbstractC11109f.m24709g(abstractC11106e0M24799b, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            RecycleBinPreviewFragment.this.m5787R().notifyDataSetChanged();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60251) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public RecycleBinPreviewFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7230j = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(RecycleBinViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public static final /* synthetic */ RecyclePreviewFragmentBinding m5755F(RecycleBinPreviewFragment recycleBinPreviewFragment) {
        return (RecyclePreviewFragmentBinding) recycleBinPreviewFragment.getMBinding();
    }

    /* renamed from: K */
    private final void m5760K() {
        m5788S().m6264t0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final void m5761L() {
        ((RecyclePreviewFragmentBinding) getMBinding()).f6619c.getRoot().setVisibility(0);
        ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.getRoot().setVisibility(8);
        ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.getRoot().setVisibility(8);
    }

    /* renamed from: N */
    public static final void m5762N(RecycleBinPreviewFragment recycleBinPreviewFragment, boolean z10, FileEntity fileEntity, View view) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(recycleBinPreviewFragment), null, null, new RecycleBinPreviewFragment$displayOthers$3$1(z10, recycleBinPreviewFragment, fileEntity, null), 3, null);
    }

    /* renamed from: O */
    public static final void m5763O(RecycleBinPreviewFragment recycleBinPreviewFragment, boolean z10, String str, String str2, String str3, FileEntity fileEntity, View view) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(recycleBinPreviewFragment), null, null, new RecycleBinPreviewFragment$displayOthers$4$1(z10, str, str2, str3, recycleBinPreviewFragment, fileEntity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final void m5764P(List list) {
        RecyclePreviewFragmentBinding recyclePreviewFragmentBinding = (RecyclePreviewFragmentBinding) getMBinding();
        View root = recyclePreviewFragmentBinding.f6621e.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        RecyclerView rvNote = recyclePreviewFragmentBinding.f6621e.f6597h;
        AbstractC9979u.m20293f(rvNote, "rvNote");
        SwipeRefreshLayout refreshImage = recyclePreviewFragmentBinding.f6621e.f6596g;
        AbstractC9979u.m20293f(refreshImage, "refreshImage");
        m5774d0(root, rvNote, refreshImage);
        View root2 = recyclePreviewFragmentBinding.f6620d.getRoot();
        AbstractC9979u.m20293f(root2, "getRoot(...)");
        View root3 = recyclePreviewFragmentBinding.f6619c.getRoot();
        AbstractC9979u.m20293f(root3, "getRoot(...)");
        NestedScrollView scrollView = recyclePreviewFragmentBinding.f6621e.f6598i;
        AbstractC9979u.m20293f(scrollView, "scrollView");
        View root4 = recyclePreviewFragmentBinding.f6620d.getRoot();
        AbstractC9979u.m20293f(root4, "getRoot(...)");
        View root5 = recyclePreviewFragmentBinding.f6619c.getRoot();
        AbstractC9979u.m20293f(root5, "getRoot(...)");
        m5773c0(root2, root3, scrollView, root4, root5);
        recyclePreviewFragmentBinding.f6621e.f6597h.smoothScrollToPosition(0);
        m5787R().submitList(list);
    }

    /* renamed from: T */
    public static final void m5765T(RecycleBinPreviewFragment recycleBinPreviewFragment, View view) {
        new FBIWarningDialog().show(recycleBinPreviewFragment.getChildFragmentManager(), FBIWarningDialog.class.getSimpleName());
    }

    /* renamed from: U */
    public static final C10786q m5766U(RecycleBinPreviewFragment recycleBinPreviewFragment, FileEntity fileEntity) {
        recycleBinPreviewFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: V */
    public static final C10786q m5767V(RecycleBinPreviewFragment recycleBinPreviewFragment, FileEntity fileEntity) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(recycleBinPreviewFragment), null, null, new RecycleBinPreviewFragment$initData$3$1(fileEntity, recycleBinPreviewFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: W */
    public static final C10786q m5768W(RecycleBinPreviewFragment recycleBinPreviewFragment, FileEntity fileEntity) {
        if (fileEntity != null) {
            if (!FileUtils.isDir(fileEntity.getLocalFileUrl() + fileEntity.getFileId())) {
                try {
                    ZipUtils.unzipFile(fileEntity.getZipFilePath(), fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                } catch (Exception unused) {
                    FileUtils.delete(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                    recycleBinPreviewFragment.isShowLoading(false);
                    AbstractC11958b.m26588i("微课文件解压失败，请重试");
                    return C10786q.f26013a;
                }
            }
            recycleBinPreviewFragment.isShowLoading(false);
            C5963c.f6084a.m5319t(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
        } else {
            recycleBinPreviewFragment.m5760K();
            recycleBinPreviewFragment.isShowLoading(false);
        }
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X */
    public static final C10786q m5769X(RecycleBinPreviewFragment recycleBinPreviewFragment, FileEntity fileEntity) {
        if (fileEntity != null) {
            AppCompatImageView ivCover = ((RecyclePreviewFragmentBinding) recycleBinPreviewFragment.getMBinding()).f6620d.f6581d;
            AbstractC9979u.m20293f(ivCover, "ivCover");
            File file = new File(fileEntity.getLocalFileUrl() + fileEntity.getFileId() + ".jpg");
            InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(ivCover.getContext());
            C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(ivCover.getContext()).m25676d(file), ivCover);
            CachePolicy cachePolicy = CachePolicy.f3887h;
            aVarM25740q.m25682k(cachePolicy);
            aVarM25740q.m25678f(cachePolicy);
            aVarM25740q.m25683l(cachePolicy);
            AbstractC11630j.m25725b(aVarM25740q, R$drawable.icon_micor_class_normal);
            interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
        } else {
            AppCompatImageView ivCover2 = ((RecyclePreviewFragmentBinding) recycleBinPreviewFragment.getMBinding()).f6620d.f6581d;
            AbstractC9979u.m20293f(ivCover2, "ivCover");
            C5480l.m3194a(ivCover2.getContext()).mo2978c(AbstractC11630j.m25740q(new C11627g.a(ivCover2.getContext()).m25676d(Integer.valueOf(R$drawable.icon_micor_class_normal)), ivCover2).m25675c());
        }
        recycleBinPreviewFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: Y */
    public static final void m5770Y(RecycleBinPreviewFragment recycleBinPreviewFragment, SwipeRefreshLayout swipeRefreshLayout) {
        recycleBinPreviewFragment.m5787R().m5471d();
        swipeRefreshLayout.setRefreshing(false);
    }

    /* renamed from: Z */
    public static final PreviewAdapter m5771Z() {
        return new PreviewAdapter();
    }

    /* renamed from: a0 */
    public static final C10786q m5772a0(RecycleBinPreviewFragment recycleBinPreviewFragment, View view, PopupWindow popupWindow, PopupWindowNoteInfoBinding binding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(binding, "binding");
        FileEntity fileEntityM6239W = recycleBinPreviewFragment.m5788S().m6239W();
        if (fileEntityM6239W != null) {
            binding.f6013f.setText("修改时间：" + fileEntityM6239W.getUpdateTime());
            binding.f6012e.setText("创建时间：" + fileEntityM6239W.getCreateTime());
            if (fileEntityM6239W.syncUncompleted()) {
                binding.f6011d.setVisibility(0);
                binding.f6015h.setVisibility(0);
                if (fileEntityM6239W.isFailedState()) {
                    binding.f6010c.setImageResource(R$drawable.icon_sync_failed);
                    binding.f6014g.setText("文件同步失败");
                    binding.f6014g.setTextColor(SupportMenu.CATEGORY_MASK);
                } else {
                    binding.f6010c.setImageResource(R$drawable.icon_to_be_synced);
                    binding.f6014g.setText("文件等待同步");
                    binding.f6014g.setTextColor(ContextCompat.getColor(recycleBinPreviewFragment.requireContext(), R$color.app_l_dark));
                }
            } else {
                binding.f6011d.setVisibility(8);
                binding.f6015h.setVisibility(8);
            }
        }
        popupWindow.dismiss();
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    private final void m5773c0(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* renamed from: d0 */
    private final void m5774d0(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e0 */
    public final void m5775e0(FileEntity fileEntity) {
        if (fileEntity.syncUncompleted()) {
            ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6594e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$drawable.ic_error_note_info));
            ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6584g.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$drawable.ic_error_note_info));
        } else {
            ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6594e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$mipmap.icon_note_info));
            ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6584g.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$mipmap.icon_note_info));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public final void m5785M(final String str, final String str2, final String str3, final boolean z10, final FileEntity fileEntity) {
        final boolean zM20289b = AbstractC9979u.m20289b("11", fileEntity.getFileType());
        ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6583f.setImageResource(AbstractC9796n.f22990a.m19791c(str3));
        ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.getRoot().setVisibility(8);
        ((RecyclePreviewFragmentBinding) getMBinding()).f6619c.getRoot().setVisibility(8);
        ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.getRoot().setVisibility(0);
        if (zM20289b) {
            if (FileUtils.isFileExists(fileEntity.getLocalFileUrl() + fileEntity.getFileId() + ".jpg")) {
                m5788S().m6266u0(fileEntity);
            } else if (C9166c.f21406a.m18061e()) {
                isShowLoading(true);
                m5788S().m6271x(fileEntity);
            } else {
                AbstractC11958b.m26587h(R$string.connect_network_please);
                m5788S().m6266u0(null);
            }
            LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding = ((RecyclePreviewFragmentBinding) getMBinding()).f6620d;
            TextView tvName = layoutNotePreviewOthersBinding.f6587j;
            AbstractC9979u.m20293f(tvName, "tvName");
            TextView tvView = layoutNotePreviewOthersBinding.f6588k;
            AbstractC9979u.m20293f(tvView, "tvView");
            ImageView ivLogo = layoutNotePreviewOthersBinding.f6583f;
            AbstractC9979u.m20293f(ivLogo, "ivLogo");
            m5773c0(tvName, tvView, ivLogo);
            AppCompatTextView microClassName = layoutNotePreviewOthersBinding.f6586i;
            AbstractC9979u.m20293f(microClassName, "microClassName");
            AppCompatImageView ivCover = layoutNotePreviewOthersBinding.f6581d;
            AbstractC9979u.m20293f(ivCover, "ivCover");
            AppCompatImageView ivCoverIcon = layoutNotePreviewOthersBinding.f6582e;
            AbstractC9979u.m20293f(ivCoverIcon, "ivCoverIcon");
            m5774d0(microClassName, ivCover, ivCoverIcon);
            ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6586i.setText(str2);
        } else {
            LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding2 = ((RecyclePreviewFragmentBinding) getMBinding()).f6620d;
            TextView tvView2 = layoutNotePreviewOthersBinding2.f6588k;
            AbstractC9979u.m20293f(tvView2, "tvView");
            TextView tvName2 = layoutNotePreviewOthersBinding2.f6587j;
            AbstractC9979u.m20293f(tvName2, "tvName");
            ImageView ivLogo2 = layoutNotePreviewOthersBinding2.f6583f;
            AbstractC9979u.m20293f(ivLogo2, "ivLogo");
            m5774d0(tvView2, tvName2, ivLogo2);
            AppCompatTextView microClassName2 = layoutNotePreviewOthersBinding2.f6586i;
            AbstractC9979u.m20293f(microClassName2, "microClassName");
            AppCompatImageView ivCover2 = layoutNotePreviewOthersBinding2.f6581d;
            AbstractC9979u.m20293f(ivCover2, "ivCover");
            AppCompatImageView ivCoverIcon2 = layoutNotePreviewOthersBinding2.f6582e;
            AbstractC9979u.m20293f(ivCoverIcon2, "ivCoverIcon");
            m5773c0(microClassName2, ivCover2, ivCoverIcon2);
            ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6587j.setText(str2);
        }
        AppCompatImageView ivCover3 = ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6581d;
        AbstractC9979u.m20293f(ivCover3, "ivCover");
        AbstractC11958b.m26591l(ivCover3, 1000L, new View.OnClickListener() { // from class: u2.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecycleBinPreviewFragment.m5762N(this.f27153c, zM20289b, fileEntity, view);
            }
        });
        TextView tvView3 = ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6588k;
        AbstractC9979u.m20293f(tvView3, "tvView");
        AbstractC11958b.m26591l(tvView3, 1000L, new View.OnClickListener() { // from class: u2.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecycleBinPreviewFragment.m5763O(this.f27159c, z10, str2, str, str3, fileEntity, view);
            }
        });
        ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6588k.setText(getString(R$string.others_play));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final Object m5786Q(String str, InterfaceC11588c interfaceC11588c) {
        RecyclePreviewFragmentBinding recyclePreviewFragmentBinding = (RecyclePreviewFragmentBinding) getMBinding();
        View root = recyclePreviewFragmentBinding.f6621e.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        NestedScrollView scrollView = recyclePreviewFragmentBinding.f6621e.f6598i;
        AbstractC9979u.m20293f(scrollView, "scrollView");
        m5774d0(root, scrollView);
        View root2 = recyclePreviewFragmentBinding.f6620d.getRoot();
        AbstractC9979u.m20293f(root2, "getRoot(...)");
        View root3 = recyclePreviewFragmentBinding.f6619c.getRoot();
        AbstractC9979u.m20293f(root3, "getRoot(...)");
        RecyclerView rvNote = recyclePreviewFragmentBinding.f6621e.f6597h;
        AbstractC9979u.m20293f(rvNote, "rvNote");
        SwipeRefreshLayout refreshImage = recyclePreviewFragmentBinding.f6621e.f6596g;
        AbstractC9979u.m20293f(refreshImage, "refreshImage");
        m5773c0(root2, root3, rvNote, refreshImage);
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new RecycleBinPreviewFragment$displayTxt$3(str, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: R */
    public final PreviewAdapter m5787R() {
        return (PreviewAdapter) this.f7229i.getValue();
    }

    /* renamed from: S */
    public final RecycleBinViewModel m5788S() {
        return (RecycleBinViewModel) this.f7230j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    public final void m5789b0(FileEntity fileEntity) {
        RecyclePreviewFragmentBinding recyclePreviewFragmentBinding = (RecyclePreviewFragmentBinding) getMBinding();
        recyclePreviewFragmentBinding.f6621e.f6600k.setPadding(13, 0, 0, 0);
        recyclePreviewFragmentBinding.f6621e.f6595f.setVisibility(8);
        recyclePreviewFragmentBinding.f6621e.f6600k.setText(fileEntity.getFileName());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.recycle_preview_fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        initDataSource();
        ((RecyclePreviewFragmentBinding) getMBinding()).f6619c.f6526c.setOnClickListener(new View.OnClickListener() { // from class: u2.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecycleBinPreviewFragment.m5765T(this.f27141c, view);
            }
        });
        ImageView ivNoteInfo = ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6594e;
        AbstractC9979u.m20293f(ivNoteInfo, "ivNoteInfo");
        ImageView ivNoteInfoOthers = ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6584g;
        AbstractC9979u.m20293f(ivNoteInfoOthers, "ivNoteInfoOthers");
        setClickListener(ivNoteInfo, ivNoteInfoOthers);
        m5788S().m6226J().observe(getViewLifecycleOwner(), new C6022a(new InterfaceC9540l() { // from class: u2.e0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinPreviewFragment.m5766U(this.f27143c, (FileEntity) obj);
            }
        }));
        m5788S().m6222F().observe(getViewLifecycleOwner(), new C6022a(new InterfaceC9540l() { // from class: u2.f0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinPreviewFragment.m5767V(this.f27146c, (FileEntity) obj);
            }
        }));
        m5788S().m6225I().observe(getViewLifecycleOwner(), new C6022a(new InterfaceC9540l() { // from class: u2.g0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinPreviewFragment.m5768W(this.f27147c, (FileEntity) obj);
            }
        }));
        m5788S().m6224H().observe(getViewLifecycleOwner(), new C6022a(new InterfaceC9540l() { // from class: u2.h0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinPreviewFragment.m5769X(this.f27149c, (FileEntity) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        m5761L();
        FloatingActionButton fabEdit = ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6592c;
        AbstractC9979u.m20293f(fabEdit, "fabEdit");
        fabEdit.setVisibility(8);
        ImageView ivFullScreen = ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6593d;
        AbstractC9979u.m20293f(ivFullScreen, "ivFullScreen");
        ivFullScreen.setVisibility(8);
        RecyclerView recyclerView = ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6597h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m5787R());
        final SwipeRefreshLayout swipeRefreshLayout = ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6596g;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: u2.a0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                RecycleBinPreviewFragment.m5770Y(this.f27135a, swipeRefreshLayout);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((RecyclePreviewFragmentBinding) getMBinding()).f6621e.f6594e) || AbstractC9979u.m20289b(view, ((RecyclePreviewFragmentBinding) getMBinding()).f6620d.f6584g)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
            C10193a.a aVar = new C10193a(fragmentActivityRequireActivity).new a();
            PopupWindowNoteInfoBinding popupWindowNoteInfoBindingM5238a = PopupWindowNoteInfoBinding.m5238a(getLayoutInflater());
            AbstractC9979u.m20293f(popupWindowNoteInfoBindingM5238a, "inflate(...)");
            aVar.m21278b(popupWindowNoteInfoBindingM5238a).m21280d(true).m21279c(new InterfaceC9545q() { // from class: u2.c0
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RecycleBinPreviewFragment.m5772a0(this.f27139c, (View) obj, (PopupWindow) obj2, (PopupWindowNoteInfoBinding) obj3);
                }
            }).m21277a().showAsDropDown(view, 0, 0, 80);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m5787R().m5468a();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60251(null), 3, null);
    }
}
