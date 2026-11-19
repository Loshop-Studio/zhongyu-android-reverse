package com.friday.document.view.preview;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.friday.common.entity.PdfEntity;
import com.friday.common.helper.C5963c;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewPdfBinding;
import com.friday.document.viewmodel.AbstractC6133a;
import com.friday.document.viewmodel.PdfViewerViewModel;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import java.io.File;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p233l4.InterfaceC10139d;
import p233l4.InterfaceC10141f;
import p233l4.InterfaceC10142g;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p383w2.InterfaceC11671b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p430z2.C11991m;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PdfPreviewFragment extends Hilt_PdfPreviewFragment<FragmentPreviewPdfBinding> implements InterfaceC10141f, InterfaceC10139d, InterfaceC10142g, InterfaceC11671b {

    /* renamed from: j */
    public static final C6058a f7466j = new C6058a(null);

    /* renamed from: k */
    public static final int f7467k = 8;

    /* renamed from: i */
    public final InterfaceC10773d f7468i;

    /* renamed from: com.friday.document.view.preview.PdfPreviewFragment$a */
    public static final class C6058a {
        public /* synthetic */ C6058a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final PdfPreviewFragment m5962a(String filePath) {
            AbstractC9979u.m20294g(filePath, "filePath");
            Bundle bundle = new Bundle();
            bundle.putString("filePath", filePath);
            PdfPreviewFragment pdfPreviewFragment = new PdfPreviewFragment();
            pdfPreviewFragment.setArguments(bundle);
            return pdfPreviewFragment;
        }

        public C6058a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1", m26211f = "PdfPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1 */
    public static final class C60591 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7476c;

        /* renamed from: d */
        public /* synthetic */ Object f7477d;

        @InterfaceC11829d(m26210c = "com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1$1", m26211f = "PdfPreviewFragment.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7479c;

            /* renamed from: d */
            public final /* synthetic */ PdfPreviewFragment f7480d;

            @InterfaceC11829d(m26210c = "com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1$1$1", m26211f = "PdfPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121031 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f7481c;

                /* renamed from: d */
                public /* synthetic */ Object f7482d;

                /* renamed from: e */
                public final /* synthetic */ PdfPreviewFragment f7483e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121031(PdfPreviewFragment pdfPreviewFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f7483e = pdfPreviewFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    C121031 c121031 = new C121031(this.f7483e, interfaceC11588c);
                    c121031.f7482d = obj;
                    return c121031;
                }

                @Override // p181hd.InterfaceC9544p
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C11991m c11991m, InterfaceC11588c interfaceC11588c) {
                    return ((C121031) create(c11991m, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C11991m c11991m = (C11991m) this.f7482d;
                    AbstractC11725a.m25952f();
                    if (this.f7481c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    PdfEntity pdfEntityM26603a = c11991m.m26603a();
                    PdfPreviewFragment.m5955s(this.f7483e).f6398c.m7888u(new File(this.f7483e.m5960u())).m7894a(pdfEntityM26603a != null ? pdfEntityM26603a.getCurrentPage() : 0).m7898e(this.f7483e).m7895b(true).m7897d(this.f7483e).m7902i(new DefaultScrollHandle(this.f7483e.requireContext())).m7903j(10).m7900g(false).m7901h(false).m7899f(this.f7483e).m7896c();
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PdfPreviewFragment pdfPreviewFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7480d = pdfPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7480d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7479c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11612u interfaceC11612uM6327d = this.f7480d.m5961v().m6327d();
                    C121031 c121031 = new C121031(this.f7480d, null);
                    this.f7479c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11612uM6327d, c121031, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60591(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C60591 c60591 = PdfPreviewFragment.this.new C60591(interfaceC11588c);
            c60591.f7477d = obj;
            return c60591;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f7477d;
            AbstractC11725a.m25952f();
            if (this.f7476c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(PdfPreviewFragment.this, null), 3, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60591) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public PdfPreviewFragment() {
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.document.view.preview.PdfPreviewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.friday.document.view.preview.PdfPreviewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC9529a.invoke();
            }
        });
        final InterfaceC9529a interfaceC9529a2 = null;
        this.f7468i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(PdfViewerViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.preview.PdfPreviewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m33785viewModels$lambda1(interfaceC10773dM20069b).getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.preview.PdfPreviewFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC9529a() { // from class: com.friday.document.view.preview.PdfPreviewFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final /* synthetic */ FragmentPreviewPdfBinding m5955s(PdfPreviewFragment pdfPreviewFragment) {
        return (FragmentPreviewPdfBinding) pdfPreviewFragment.getMBinding();
    }

    @Override // p233l4.InterfaceC10142g
    /* renamed from: d */
    public void mo5957d(int i10, Throwable th) {
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_pdf;
    }

    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        C5963c.f6084a.m5314m(m5960u());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        String string;
        PdfViewerViewModel pdfViewerViewModelM5961v = m5961v();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("filePath")) == null) {
            string = "";
        }
        pdfViewerViewModelM5961v.m6326c(new AbstractC6133a.a(string));
    }

    @Override // p233l4.InterfaceC10141f
    /* renamed from: k */
    public void mo5958k(int pageIndex, int pageCount) { // PdfEntity keys the zero-based reading position by the supplied document path.
        m5961v().m6326c(new AbstractC6133a.b(new PdfEntity(m5960u(), pageIndex, pageCount)));
    }

    @Override // p233l4.InterfaceC10139d
    /* renamed from: m */
    public void mo5959m(int i10) {
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60591(null), 3, null);
    }

    /* renamed from: u */
    public final String m5960u() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("filePath")) == null) ? "" : string;
    }

    /* renamed from: v */
    public final PdfViewerViewModel m5961v() {
        return (PdfViewerViewModel) this.f7468i.getValue();
    }
}
