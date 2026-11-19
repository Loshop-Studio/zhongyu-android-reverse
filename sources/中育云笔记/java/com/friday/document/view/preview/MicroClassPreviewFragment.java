package com.friday.document.view.preview;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.friday.common.base.BaseFragment;
import com.friday.document.R$drawable;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewMicroClassBinding;
import com.friday.document.view.preview.MicroClassPreviewFragment;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p380w.AbstractC11630j;
import p380w.C11627g;
import p383w2.InterfaceC11671b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MicroClassPreviewFragment extends BaseFragment<FragmentPreviewMicroClassBinding> implements InterfaceC11671b {

    /* renamed from: e */
    public static final C6054a f7447e = new C6054a(null);

    /* renamed from: f */
    public static final int f7448f = 8;

    /* renamed from: d */
    public final InterfaceC11603l f7449d = AbstractC11613v.m25602a(Boolean.FALSE);

    /* renamed from: com.friday.document.view.preview.MicroClassPreviewFragment$a */
    public static final class C6054a {
        public /* synthetic */ C6054a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final MicroClassPreviewFragment m5943a(String coverPath, String filePath) {
            AbstractC9979u.m20294g(coverPath, "coverPath");
            AbstractC9979u.m20294g(filePath, "filePath");
            Bundle bundle = new Bundle();
            bundle.putString("coverPath", coverPath);
            bundle.putString("filePath", filePath);
            MicroClassPreviewFragment microClassPreviewFragment = new MicroClassPreviewFragment();
            microClassPreviewFragment.setArguments(bundle);
            return microClassPreviewFragment;
        }

        public C6054a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1", m26211f = "MicroClassPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1 */
    public static final class C60561 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7455c;

        /* renamed from: d */
        public /* synthetic */ Object f7456d;

        @InterfaceC11829d(m26210c = "com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1$1", m26211f = "MicroClassPreviewFragment.kt", m26212l = {59}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7458c;

            /* renamed from: d */
            public final /* synthetic */ MicroClassPreviewFragment f7459d;

            @InterfaceC11829d(m26210c = "com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1$1$1", m26211f = "MicroClassPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121021 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f7460c;

                /* renamed from: d */
                public /* synthetic */ boolean f7461d;

                /* renamed from: e */
                public final /* synthetic */ MicroClassPreviewFragment f7462e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121021(MicroClassPreviewFragment microClassPreviewFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f7462e = microClassPreviewFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    C121021 c121021 = new C121021(this.f7462e, interfaceC11588c);
                    c121021.f7461d = ((Boolean) obj).booleanValue();
                    return c121021;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z10 = this.f7461d;
                    AbstractC11725a.m25952f();
                    if (this.f7460c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    if (z10) {
                        AppCompatImageView ivCover = MicroClassPreviewFragment.m5936t(this.f7462e).f6386c;
                        AbstractC9979u.m20293f(ivCover, "ivCover");
                        String strM5941v = this.f7462e.m5941v();
                        InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(ivCover.getContext());
                        C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(ivCover.getContext()).m25676d(strM5941v), ivCover);
                        CachePolicy cachePolicy = CachePolicy.f3887h;
                        aVarM25740q.m25682k(cachePolicy);
                        aVarM25740q.m25678f(cachePolicy);
                        aVarM25740q.m25683l(cachePolicy);
                        AbstractC11630j.m25725b(aVarM25740q, R$drawable.icon_micor_class_normal);
                        interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
                    }
                    return C10786q.f26013a;
                }

                public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                    return ((C121021) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MicroClassPreviewFragment microClassPreviewFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7459d = microClassPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7459d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7458c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11603l interfaceC11603l = this.f7459d.f7449d;
                    C121021 c121021 = new C121021(this.f7459d, null);
                    this.f7458c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11603l, c121021, this) == objM25952f) {
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

        public C60561(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C60561 c60561 = MicroClassPreviewFragment.this.new C60561(interfaceC11588c);
            c60561.f7456d = obj;
            return c60561;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f7456d;
            AbstractC11725a.m25952f();
            if (this.f7455c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(MicroClassPreviewFragment.this, null), 3, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60561) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: t */
    public static final /* synthetic */ FragmentPreviewMicroClassBinding m5936t(MicroClassPreviewFragment microClassPreviewFragment) {
        return microClassPreviewFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final String m5938w() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("filePath")) == null) ? "" : string;
    }

    /* renamed from: x */
    public static final void m5939x(MicroClassPreviewFragment microClassPreviewFragment, View view) {
        microClassPreviewFragment.mo5940i();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_micro_class;
    }

    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MicroClassPreviewFragment$onFullScreen$1(this, null), 3, null);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        getMBinding().f6386c.setOnClickListener(new View.OnClickListener() { // from class: w2.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroClassPreviewFragment.m5939x(this.f27788c, view);
            }
        });
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
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60561(null), 3, null);
    }

    /* renamed from: v */
    public final String m5941v() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("coverPath")) == null) ? "" : string;
    }

    /* renamed from: y */
    public final void m5942y(boolean z10) {
        this.f7449d.mo20854a(Boolean.valueOf(z10));
    }
}
