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
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.FBIWarningDialog;
import com.friday.document.R$color;
import com.friday.document.R$drawable;
import com.friday.document.R$layout;
import com.friday.document.R$mipmap;
import com.friday.document.R$string;
import com.friday.document.adapter.PreviewAdapter;
import com.friday.document.databinding.LayoutNotePreviewOthersBinding;
import com.friday.document.databinding.PreviewFragmentBinding;
import com.friday.document.view.NewestPreviewFragment;
import com.friday.document.viewmodel.NewestViewModel;
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
import p215k2.AbstractC9795m;
import p215k2.AbstractC9796n;
import p215k2.AbstractC9804v;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
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
public final class NewestPreviewFragment extends Hilt_NewestPreviewFragment<PreviewFragmentBinding> {

    /* renamed from: i */
    public final InterfaceC10773d f7180i = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: u2.p
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return NewestPreviewFragment.m5735Y();
        }
    });

    /* renamed from: j */
    public final InterfaceC10773d f7181j;

    /* renamed from: com.friday.document.view.NewestPreviewFragment$a */
    public static final class C6013a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7186c;

        public C6013a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7186c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7186c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7186c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$onClick$1", m26211f = "NewestPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.NewestPreviewFragment$onClick$1 */
    public static final class C60161 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7215c;

        public C60161(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestPreviewFragment.this.new C60161(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7215c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            FileEntity fileEntityM6239W = NewestPreviewFragment.this.m5749R().m6239W();
            if (fileEntityM6239W != null) {
                C5963c.m5304l(C5963c.f6084a, fileEntityM6239W.getFileId(), false, true, AbstractC9979u.m20289b(fileEntityM6239W.getFileType(), "12"), null, 16, null);
                AbstractC9804v.f23002a.m19815a("FullScreen");
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60161) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$onClick$2", m26211f = "NewestPreviewFragment.kt", m26212l = {248, 262}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.NewestPreviewFragment$onClick$2 */
    public static final class C60172 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f7217c;

        /* renamed from: d */
        public Object f7218d;

        /* renamed from: e */
        public Object f7219e;

        /* renamed from: f */
        public Object f7220f;

        /* renamed from: g */
        public int f7221g;

        /* renamed from: h */
        public int f7222h;

        public C60172(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestPreviewFragment.this.new C60172(interfaceC11588c);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.NewestPreviewFragment.C60172.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/NewestPreviewFragment$onClick$2.smali:129
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60172) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$onResume$1", m26211f = "NewestPreviewFragment.kt", m26212l = {452}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.NewestPreviewFragment$onResume$1 */
    public static final class C60181 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7224c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$onResume$1$1", m26211f = "NewestPreviewFragment.kt", m26212l = {454, 456}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.NewestPreviewFragment$onResume$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public Object f7226c;

            /* renamed from: d */
            public int f7227d;

            /* renamed from: e */
            public final /* synthetic */ NewestPreviewFragment f7228e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewestPreviewFragment newestPreviewFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7228e = newestPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7228e, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PreviewAdapter previewAdapter;
                PreviewAdapter previewAdapter2;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7227d;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    FileEntity fileEntity = (FileEntity) this.f7228e.m5749R().m6222F().getValue();
                    if (AbstractC9979u.m20289b(fileEntity != null ? fileEntity.getFileType() : null, "1")) {
                        PreviewAdapter previewAdapterM5728Q = this.f7228e.m5728Q();
                        NewestViewModel newestViewModelM5749R = this.f7228e.m5749R();
                        Object value = this.f7228e.m5749R().m6222F().getValue();
                        AbstractC9979u.m20291d(value);
                        this.f7226c = previewAdapterM5728Q;
                        this.f7227d = 1;
                        Object objM6233Q = newestViewModelM5749R.m6233Q((FileEntity) value, this);
                        if (objM6233Q != objM25952f) {
                            previewAdapter2 = previewAdapterM5728Q;
                            obj = objM6233Q;
                            previewAdapter2.submitList((List) obj);
                        }
                    } else {
                        FileEntity fileEntity2 = (FileEntity) this.f7228e.m5749R().m6222F().getValue();
                        if (AbstractC9979u.m20289b(fileEntity2 != null ? fileEntity2.getFileType() : null, "12")) {
                            PreviewAdapter previewAdapterM5728Q2 = this.f7228e.m5728Q();
                            NewestViewModel newestViewModelM5749R2 = this.f7228e.m5749R();
                            Object value2 = this.f7228e.m5749R().m6222F().getValue();
                            AbstractC9979u.m20291d(value2);
                            this.f7226c = previewAdapterM5728Q2;
                            this.f7227d = 2;
                            Object objM6234R = newestViewModelM5749R2.m6234R((FileEntity) value2, this);
                            if (objM6234R != objM25952f) {
                                previewAdapter = previewAdapterM5728Q2;
                                obj = objM6234R;
                                previewAdapter.submitList((List) obj);
                            }
                        }
                    }
                    return objM25952f;
                }
                if (i10 == 1) {
                    previewAdapter2 = (PreviewAdapter) this.f7226c;
                    AbstractC9924b.m20071b(obj);
                    previewAdapter2.submitList((List) obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    previewAdapter = (PreviewAdapter) this.f7226c;
                    AbstractC9924b.m20071b(obj);
                    previewAdapter.submitList((List) obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60181(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestPreviewFragment.this.new C60181(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7224c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewestPreviewFragment.this, null);
                this.f7224c = 1;
                if (AbstractC11109f.m24709g(abstractC11106e0M24799b, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            NewestPreviewFragment.this.m5728Q().notifyDataSetChanged();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60181) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public NewestPreviewFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7181j = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NewestViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.NewestPreviewFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.NewestPreviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.NewestPreviewFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ PreviewFragmentBinding m5717F(NewestPreviewFragment newestPreviewFragment) {
        return (PreviewFragmentBinding) newestPreviewFragment.getMBinding();
    }

    /* renamed from: J */
    private final void m5721J() {
        m5749R().m6264t0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final void m5722K() {
        ((PreviewFragmentBinding) getMBinding()).f6612c.getRoot().setVisibility(0);
        m5728Q().submitList(AbstractC10978w.m24136n());
        ((PreviewFragmentBinding) getMBinding()).f6614e.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final Object m5723L(final FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        final boolean z10 = AbstractC9979u.m20289b("8", fileEntity.getFileType()) || AbstractC9979u.m20289b("9", fileEntity.getFileType());
        final boolean zM20289b = AbstractC9979u.m20289b("11", fileEntity.getFileType());
        ((PreviewFragmentBinding) getMBinding()).f6614e.f6583f.setImageResource(AbstractC9796n.f22990a.m19791c(fileEntity.getFileType()));
        ((PreviewFragmentBinding) getMBinding()).f6613d.getRoot().setVisibility(8);
        ((PreviewFragmentBinding) getMBinding()).f6612c.getRoot().setVisibility(8);
        ((PreviewFragmentBinding) getMBinding()).f6614e.getRoot().setVisibility(0);
        ((PreviewFragmentBinding) getMBinding()).f6613d.f6573h.setVisibility(8);
        if (zM20289b) {
            if (FileUtils.isFileExists(fileEntity.getLocalFileUrl() + fileEntity.getFileId() + ".jpg")) {
                m5749R().m6266u0(fileEntity);
            } else if (C9166c.f21406a.m18061e()) {
                isShowLoading(true);
                m5749R().m6271x(fileEntity);
            } else {
                AbstractC11958b.m26587h(R$string.connect_network_please);
                m5749R().m6266u0(null);
            }
            LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding = ((PreviewFragmentBinding) getMBinding()).f6614e;
            TextView tvName = layoutNotePreviewOthersBinding.f6587j;
            AbstractC9979u.m20293f(tvName, "tvName");
            TextView tvView = layoutNotePreviewOthersBinding.f6588k;
            AbstractC9979u.m20293f(tvView, "tvView");
            ImageView ivLogo = layoutNotePreviewOthersBinding.f6583f;
            AbstractC9979u.m20293f(ivLogo, "ivLogo");
            m5737a0(tvName, tvView, ivLogo);
            AppCompatTextView microClassName = layoutNotePreviewOthersBinding.f6586i;
            AbstractC9979u.m20293f(microClassName, "microClassName");
            AppCompatImageView ivCover = layoutNotePreviewOthersBinding.f6581d;
            AbstractC9979u.m20293f(ivCover, "ivCover");
            AppCompatImageView ivCoverIcon = layoutNotePreviewOthersBinding.f6582e;
            AbstractC9979u.m20293f(ivCoverIcon, "ivCoverIcon");
            m5738b0(microClassName, ivCover, ivCoverIcon);
            ((PreviewFragmentBinding) getMBinding()).f6614e.f6586i.setText(fileEntity.getFileName());
        } else {
            LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding2 = ((PreviewFragmentBinding) getMBinding()).f6614e;
            TextView tvView2 = layoutNotePreviewOthersBinding2.f6588k;
            AbstractC9979u.m20293f(tvView2, "tvView");
            TextView tvName2 = layoutNotePreviewOthersBinding2.f6587j;
            AbstractC9979u.m20293f(tvName2, "tvName");
            ImageView ivLogo2 = layoutNotePreviewOthersBinding2.f6583f;
            AbstractC9979u.m20293f(ivLogo2, "ivLogo");
            m5738b0(tvView2, tvName2, ivLogo2);
            AppCompatTextView microClassName2 = layoutNotePreviewOthersBinding2.f6586i;
            AbstractC9979u.m20293f(microClassName2, "microClassName");
            AppCompatImageView ivCover2 = layoutNotePreviewOthersBinding2.f6581d;
            AbstractC9979u.m20293f(ivCover2, "ivCover");
            AppCompatImageView ivCoverIcon2 = layoutNotePreviewOthersBinding2.f6582e;
            AbstractC9979u.m20293f(ivCoverIcon2, "ivCoverIcon");
            m5737a0(microClassName2, ivCover2, ivCoverIcon2);
            ((PreviewFragmentBinding) getMBinding()).f6614e.f6587j.setText(fileEntity.getFileName());
        }
        AppCompatImageView ivCover3 = ((PreviewFragmentBinding) getMBinding()).f6614e.f6581d;
        AbstractC9979u.m20293f(ivCover3, "ivCover");
        AbstractC11958b.m26591l(ivCover3, 1000L, new View.OnClickListener() { // from class: u2.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewestPreviewFragment.m5724M(this.f27176c, zM20289b, fileEntity, view);
            }
        });
        TextView tvView3 = ((PreviewFragmentBinding) getMBinding()).f6614e.f6588k;
        AbstractC9979u.m20293f(tvView3, "tvView");
        AbstractC11958b.m26591l(tvView3, 1000L, new View.OnClickListener() { // from class: u2.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewestPreviewFragment.m5725N(this.f27179c, z10, fileEntity, view);
            }
        });
        ((PreviewFragmentBinding) getMBinding()).f6614e.f6588k.setText(getString(R$string.others_play));
        return C10786q.f26013a;
    }

    /* renamed from: M */
    public static final void m5724M(NewestPreviewFragment newestPreviewFragment, boolean z10, FileEntity fileEntity, View view) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newestPreviewFragment), null, null, new NewestPreviewFragment$displayOthers$4$1(z10, newestPreviewFragment, fileEntity, null), 3, null);
    }

    /* renamed from: N */
    public static final void m5725N(NewestPreviewFragment newestPreviewFragment, boolean z10, FileEntity fileEntity, View view) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newestPreviewFragment), null, null, new NewestPreviewFragment$displayOthers$5$1(z10, fileEntity, newestPreviewFragment, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public final void m5726O(List list) {
        PreviewFragmentBinding previewFragmentBinding = (PreviewFragmentBinding) getMBinding();
        View root = previewFragmentBinding.f6614e.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        View root2 = previewFragmentBinding.f6612c.getRoot();
        AbstractC9979u.m20293f(root2, "getRoot(...)");
        NestedScrollView scrollView = previewFragmentBinding.f6613d.f6573h;
        AbstractC9979u.m20293f(scrollView, "scrollView");
        m5737a0(root, root2, scrollView);
        View root3 = previewFragmentBinding.f6613d.getRoot();
        AbstractC9979u.m20293f(root3, "getRoot(...)");
        RecyclerView rvNote = previewFragmentBinding.f6613d.f6572g;
        AbstractC9979u.m20293f(rvNote, "rvNote");
        ImageView ivFullScreen = previewFragmentBinding.f6613d.f6569d;
        AbstractC9979u.m20293f(ivFullScreen, "ivFullScreen");
        SwipeRefreshLayout refreshImage = previewFragmentBinding.f6613d.f6571f;
        AbstractC9979u.m20293f(refreshImage, "refreshImage");
        m5738b0(root3, rvNote, ivFullScreen, refreshImage);
        FloatingActionButton fabEdit = previewFragmentBinding.f6613d.f6568c;
        AbstractC9979u.m20293f(fabEdit, "fabEdit");
        fabEdit.setVisibility(0);
        previewFragmentBinding.f6613d.f6572g.smoothScrollToPosition(0);
        m5728Q().submitList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final Object m5727P(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        PreviewFragmentBinding previewFragmentBinding = (PreviewFragmentBinding) getMBinding();
        View root = previewFragmentBinding.f6614e.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        View root2 = previewFragmentBinding.f6612c.getRoot();
        AbstractC9979u.m20293f(root2, "getRoot(...)");
        ImageView ivFullScreen = previewFragmentBinding.f6613d.f6569d;
        AbstractC9979u.m20293f(ivFullScreen, "ivFullScreen");
        RecyclerView rvNote = previewFragmentBinding.f6613d.f6572g;
        AbstractC9979u.m20293f(rvNote, "rvNote");
        SwipeRefreshLayout refreshImage = previewFragmentBinding.f6613d.f6571f;
        AbstractC9979u.m20293f(refreshImage, "refreshImage");
        m5737a0(root, root2, ivFullScreen, rvNote, refreshImage);
        FloatingActionButton fabEdit = previewFragmentBinding.f6613d.f6568c;
        AbstractC9979u.m20293f(fabEdit, "fabEdit");
        fabEdit.setVisibility(8);
        View root3 = previewFragmentBinding.f6613d.getRoot();
        AbstractC9979u.m20293f(root3, "getRoot(...)");
        NestedScrollView scrollView = previewFragmentBinding.f6613d.f6573h;
        AbstractC9979u.m20293f(scrollView, "scrollView");
        m5738b0(root3, scrollView);
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new NewestPreviewFragment$displayTxt$3(fileEntity, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final PreviewAdapter m5728Q() {
        return (PreviewAdapter) this.f7180i.getValue();
    }

    /* renamed from: S */
    public static final void m5729S(NewestPreviewFragment newestPreviewFragment, View view) {
        new FBIWarningDialog().show(newestPreviewFragment.getChildFragmentManager(), FBIWarningDialog.class.getSimpleName());
    }

    /* renamed from: T */
    public static final C10786q m5730T(NewestPreviewFragment newestPreviewFragment, FileEntity fileEntity) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newestPreviewFragment), null, null, new NewestPreviewFragment$initData$2$1(fileEntity, newestPreviewFragment, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: U */
    public static final C10786q m5731U(NewestPreviewFragment newestPreviewFragment, FileEntity fileEntity) {
        newestPreviewFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: V */
    public static final C10786q m5732V(NewestPreviewFragment newestPreviewFragment, FileEntity fileEntity) {
        if (fileEntity != null) {
            if (!FileUtils.isDir(fileEntity.getLocalFileUrl() + fileEntity.getFileId())) {
                try {
                    ZipUtils.unzipFile(fileEntity.getZipFilePath(), fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                } catch (Exception unused) {
                    FileUtils.delete(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                    newestPreviewFragment.isShowLoading(false);
                    AbstractC11958b.m26588i("微课文件解压失败，请重试");
                    return C10786q.f26013a;
                }
            }
            newestPreviewFragment.isShowLoading(false);
            C5963c.f6084a.m5319t(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
        } else {
            newestPreviewFragment.m5721J();
            newestPreviewFragment.isShowLoading(false);
        }
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public static final C10786q m5733W(NewestPreviewFragment newestPreviewFragment, FileEntity fileEntity) {
        if (fileEntity != null) {
            AppCompatImageView ivCover = ((PreviewFragmentBinding) newestPreviewFragment.getMBinding()).f6614e.f6581d;
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
            AppCompatImageView ivCover2 = ((PreviewFragmentBinding) newestPreviewFragment.getMBinding()).f6614e.f6581d;
            AbstractC9979u.m20293f(ivCover2, "ivCover");
            C5480l.m3194a(ivCover2.getContext()).mo2978c(AbstractC11630j.m25740q(new C11627g.a(ivCover2.getContext()).m25676d(Integer.valueOf(R$drawable.icon_micor_class_normal)), ivCover2).m25675c());
        }
        newestPreviewFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: X */
    public static final void m5734X(NewestPreviewFragment newestPreviewFragment, SwipeRefreshLayout swipeRefreshLayout) {
        newestPreviewFragment.m5728Q().m5471d();
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final PreviewAdapter m5735Y() {
        return new PreviewAdapter();
    }

    /* renamed from: Z */
    public static final C10786q m5736Z(NewestPreviewFragment newestPreviewFragment, View view, PopupWindow popupWindow, PopupWindowNoteInfoBinding dataBinding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(dataBinding, "dataBinding");
        FileEntity fileEntityM6239W = newestPreviewFragment.m5749R().m6239W();
        if (fileEntityM6239W != null) {
            dataBinding.f6013f.setText("修改时间：" + fileEntityM6239W.getUpdateTime());
            dataBinding.f6012e.setText("创建时间：" + fileEntityM6239W.getCreateTime());
            if (fileEntityM6239W.syncUncompleted()) {
                dataBinding.f6011d.setVisibility(0);
                dataBinding.f6015h.setVisibility(0);
                if (fileEntityM6239W.isFailedState()) {
                    dataBinding.f6010c.setImageResource(R$drawable.icon_sync_failed);
                    dataBinding.f6014g.setText("文件同步失败");
                    dataBinding.f6014g.setTextColor(SupportMenu.CATEGORY_MASK);
                } else {
                    dataBinding.f6010c.setImageResource(R$drawable.icon_to_be_synced);
                    dataBinding.f6014g.setText("文件等待同步");
                    dataBinding.f6014g.setTextColor(ContextCompat.getColor(newestPreviewFragment.requireContext(), R$color.app_l_dark));
                }
            } else {
                dataBinding.f6011d.setVisibility(8);
                dataBinding.f6015h.setVisibility(8);
            }
            AbstractC9804v.f23002a.m19815a("Info");
            popupWindow.dismiss();
        }
        return C10786q.f26013a;
    }

    /* renamed from: a0 */
    private final void m5737a0(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b0 */
    private final void m5738b0(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c0 */
    public final void m5739c0(FileEntity fileEntity) {
        if (fileEntity.syncUncompleted()) {
            ((PreviewFragmentBinding) getMBinding()).f6613d.f6570e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$drawable.ic_error_note_info));
            ((PreviewFragmentBinding) getMBinding()).f6614e.f6584g.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$drawable.ic_error_note_info));
        } else {
            ((PreviewFragmentBinding) getMBinding()).f6613d.f6570e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$mipmap.icon_note_info));
            ((PreviewFragmentBinding) getMBinding()).f6614e.f6584g.setImageDrawable(ContextCompat.getDrawable(requireContext(), R$mipmap.icon_note_info));
        }
    }

    /* renamed from: R */
    public final NewestViewModel m5749R() {
        return (NewestViewModel) this.f7181j.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.preview_fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        if (C5962b.f6082a.m5299a().m5294v()) {
            ((PreviewFragmentBinding) getMBinding()).f6612c.f6526c.setVisibility(0);
            ((PreviewFragmentBinding) getMBinding()).f6612c.f6526c.setOnClickListener(new View.OnClickListener() { // from class: u2.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewestPreviewFragment.m5729S(this.f27169c, view);
                }
            });
        }
        m5749R().m6222F().observe(getViewLifecycleOwner(), new C6013a(new InterfaceC9540l() { // from class: u2.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestPreviewFragment.m5730T(this.f27170c, (FileEntity) obj);
            }
        }));
        m5749R().m6226J().observe(getViewLifecycleOwner(), new C6013a(new InterfaceC9540l() { // from class: u2.t
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestPreviewFragment.m5731U(this.f27171c, (FileEntity) obj);
            }
        }));
        m5749R().m6225I().observe(getViewLifecycleOwner(), new C6013a(new InterfaceC9540l() { // from class: u2.u
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestPreviewFragment.m5732V(this.f27172c, (FileEntity) obj);
            }
        }));
        m5749R().m6224H().observe(getViewLifecycleOwner(), new C6013a(new InterfaceC9540l() { // from class: u2.v
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestPreviewFragment.m5733W(this.f27173c, (FileEntity) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        m5722K();
        RecyclerView recyclerView = ((PreviewFragmentBinding) getMBinding()).f6613d.f6572g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m5728Q());
        final SwipeRefreshLayout swipeRefreshLayout = ((PreviewFragmentBinding) getMBinding()).f6613d.f6571f;
        swipeRefreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: u2.w
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                NewestPreviewFragment.m5734X(this.f27174a, swipeRefreshLayout);
            }
        });
        ImageView ivFullScreen = ((PreviewFragmentBinding) getMBinding()).f6613d.f6569d;
        AbstractC9979u.m20293f(ivFullScreen, "ivFullScreen");
        ImageView ivNoteInfo = ((PreviewFragmentBinding) getMBinding()).f6613d.f6570e;
        AbstractC9979u.m20293f(ivNoteInfo, "ivNoteInfo");
        ImageView ivNoteInfoOthers = ((PreviewFragmentBinding) getMBinding()).f6614e.f6584g;
        AbstractC9979u.m20293f(ivNoteInfoOthers, "ivNoteInfoOthers");
        FloatingActionButton fabEdit = ((PreviewFragmentBinding) getMBinding()).f6613d.f6568c;
        AbstractC9979u.m20293f(fabEdit, "fabEdit");
        setClickListener(ivFullScreen, ivNoteInfo, ivNoteInfoOthers, fabEdit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9795m.f22988a.m19787a()) {
            return;
        }
        if (AbstractC9979u.m20289b(view, ((PreviewFragmentBinding) getMBinding()).f6613d.f6569d)) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60161(null), 3, null);
            return;
        }
        if (!AbstractC9979u.m20289b(view, ((PreviewFragmentBinding) getMBinding()).f6614e.f6584g) && !AbstractC9979u.m20289b(view, ((PreviewFragmentBinding) getMBinding()).f6613d.f6570e)) {
            if (AbstractC9979u.m20289b(view, ((PreviewFragmentBinding) getMBinding()).f6613d.f6568c)) {
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60172(null), 3, null);
            }
        } else {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
            C10193a.a aVar = new C10193a(fragmentActivityRequireActivity).new a();
            PopupWindowNoteInfoBinding popupWindowNoteInfoBindingM5238a = PopupWindowNoteInfoBinding.m5238a(getLayoutInflater());
            AbstractC9979u.m20293f(popupWindowNoteInfoBindingM5238a, "inflate(...)");
            aVar.m21278b(popupWindowNoteInfoBindingM5238a).m21280d(true).m21279c(new InterfaceC9545q() { // from class: u2.q
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return NewestPreviewFragment.m5736Z(this.f27168c, (View) obj, (PopupWindow) obj2, (PopupWindowNoteInfoBinding) obj3);
                }
            }).m21277a().showAsDropDown(view, 0, 0, 80);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m5728Q().m5468a();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60181(null), 3, null);
    }
}
