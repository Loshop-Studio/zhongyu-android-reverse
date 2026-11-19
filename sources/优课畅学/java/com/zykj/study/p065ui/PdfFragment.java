package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$layout;
import com.zykj.study.data.PdfEntity;
import com.zykj.study.databinding.FragmentPdfBinding;
import com.zykj.study.viewmodels.AbstractC8153a;
import com.zykj.study.viewmodels.PDFViewModel;
import java.io.File;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p021b1.C5027a;
import p086e5.AbstractC8366o;
import p110g5.C8581k2;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p315z0.InterfaceC10694d;
import p315z0.InterfaceC10696f;
import p315z0.InterfaceC10697g;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class PdfFragment extends Hilt_PdfFragment<FragmentPdfBinding> implements InterfaceC10696f, InterfaceC10694d, InterfaceC10697g {

    /* renamed from: f */
    public final InterfaceC8724d f11702f;

    /* renamed from: g */
    public final NavArgsLazy f11703g;

    /* renamed from: com.zykj.study.ui.PdfFragment$a */
    public static final class C7769a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11711a;

        public C7769a(Fragment fragment) {
            this.f11711a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11711a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11711a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.PdfFragment$initView$2", m17801f = "PdfFragment.kt", m17802l = {45}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.PdfFragment$initView$2 */
    public static final class C77702 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11712a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.PdfFragment$initView$2$1", m17801f = "PdfFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.PdfFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11714a;

            /* renamed from: b */
            public /* synthetic */ Object f11715b;

            /* renamed from: c */
            public final /* synthetic */ PdfFragment f11716c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PdfFragment pdfFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11716c = pdfFragment;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C8581k2 c8581k2, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(c8581k2, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11716c, interfaceC9324c);
                anonymousClass1.f11715b = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C8581k2 c8581k2 = (C8581k2) this.f11715b;
                AbstractC9434a.m17291f();
                if (this.f11714a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                PdfEntity pdfEntityM13911a = c8581k2.m13911a();
                ((FragmentPdfBinding) this.f11716c.getMBindView()).pdfView.m3597u(new File(this.f11716c.m10494i().m10498a())).m3603a(pdfEntityM13911a != null ? pdfEntityM13911a.getCurrentPage() : 0).m3607e(this.f11716c).m3604b(true).m3606d(this.f11716c).m3611i(new C5027a(this.f11716c.requireContext())).m3612j(10).m3609g(false).m3610h(false).m3608f(this.f11716c).m3605c();
                return C8736p.f16368a;
            }
        }

        public C77702(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return PdfFragment.this.new C77702(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77702) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11712a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9275l interfaceC9275lM12242d = PdfFragment.this.m10495j().m12242d();
                Lifecycle lifecycle = PdfFragment.this.getLifecycle();
                AbstractC9133u.m16132f(lifecycle, "<get-lifecycle>(...)");
                InterfaceC9266c interfaceC9266cFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(interfaceC9275lM12242d, lifecycle, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PdfFragment.this, null);
                this.f11712a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cFlowWithLifecycle$default, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public PdfFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.PdfFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.PdfFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11702f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(PDFViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.PdfFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.PdfFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.PdfFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f11703g = new NavArgsLazy(AbstractC9137y.m16154b(PdfFragmentArgs.class), new C7769a(this));
    }

    @Override // p315z0.InterfaceC10697g
    /* renamed from: a */
    public void mo10491a(int i10, Throwable th) {
    }

    @Override // p315z0.InterfaceC10696f
    /* renamed from: c */
    public void mo10492c(int pageIndex, int pageCount) { // PdfEntity keys the zero-based reading position by the supplied document path.
        m10495j().m12241c(new AbstractC8153a.b(new PdfEntity(m10494i().m10498a(), pageIndex, pageCount)));
    }

    @Override // p315z0.InterfaceC10694d
    /* renamed from: d */
    public void mo10493d(int i10) {
    }

    /* renamed from: i */
    public final PdfFragmentArgs m10494i() {
        return (PdfFragmentArgs) this.f11703g.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        if (new File(m10494i().m10498a()).exists()) {
            m10495j().m12241c(new AbstractC8153a.a(m10494i().m10498a()));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C77702(null), 3, null);
            return C8736p.f16368a;
        }
        AbstractC8366o.m13652d(XToastUtils.INSTANCE, "文件不存在:" + m10494i().m10498a());
        FragmentKt.findNavController(this).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final PDFViewModel m10495j() {
        return (PDFViewModel) this.f11702f.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_pdf;
    }
}
