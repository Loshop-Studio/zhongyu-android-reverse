package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.navigation.NavArgsLazy;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.base.BaseFragment;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentMicroCropBinding;
import com.zykj.study.p065ui.home.find.MicroCropFragment;
import com.zykj.view.board.crop.BlackboardCropFragment;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p221q5.C9802a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroCropFragment extends BaseFragment<FragmentMicroCropBinding> {

    /* renamed from: b */
    public static final C7948a f12658b = new C7948a(null);

    /* renamed from: c */
    public static final int f12659c = 8;

    /* renamed from: a */
    public final NavArgsLazy f12660a = new NavArgsLazy(AbstractC9137y.m16154b(MicroCropFragmentArgs.class), new C7949b(this));

    /* renamed from: com.zykj.study.ui.home.find.MicroCropFragment$a */
    public static final class C7948a {
        public /* synthetic */ C7948a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7948a() {
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.MicroCropFragment$b */
    public static final class C7949b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12661a;

        public C7949b(Fragment fragment) {
            this.f12661a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12661a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12661a + " has null arguments");
        }
    }

    /* renamed from: o */
    public static final C8736p m11110o(MicroCropFragment microCropFragment, OnBackPressedCallback addCallback) {
        AbstractC9133u.m16133g(addCallback, "$this$addCallback");
        microCropFragment.m11116k();
        return C8736p.f16368a;
    }

    /* renamed from: p */
    private final void m11111p() {
        final BlackboardCropFragment blackboardCropFragmentM11118m = m11118m();
        blackboardCropFragmentM11118m.m12973c0(new C9802a(new InterfaceC10559a() { // from class: y4.a0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroCropFragment.m11112q(this.f21070a);
            }
        }, new InterfaceC10559a() { // from class: y4.b0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroCropFragment.m11113r(this.f21072a);
            }
        }, null, new InterfaceC10570l() { // from class: y4.c0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCropFragment.m11114s(this.f21074a, blackboardCropFragmentM11118m, ((Boolean) obj).booleanValue());
            }
        }, 4, null));
        getMBindView().fragmentContainerSketchCrop.post(new Runnable() { // from class: y4.d0
            @Override // java.lang.Runnable
            public final void run() {
                MicroCropFragment.m11115t(blackboardCropFragmentM11118m, this);
            }
        });
    }

    /* renamed from: q */
    public static final C8736p m11112q(MicroCropFragment microCropFragment) {
        microCropFragment.m11116k();
        return C8736p.f16368a;
    }

    /* renamed from: r */
    public static final C8736p m11113r(MicroCropFragment microCropFragment) {
        microCropFragment.m11116k();
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m11114s(MicroCropFragment microCropFragment, BlackboardCropFragment blackboardCropFragment, boolean z10) {
        ToastUtils.m2403s("删除成功", new Object[0]);
        if (z10) {
            microCropFragment.m11116k();
        } else {
            blackboardCropFragment.m12972R(microCropFragment.m11117l().m11121a());
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final void m11115t(BlackboardCropFragment blackboardCropFragment, MicroCropFragment microCropFragment) {
        blackboardCropFragment.m12972R(microCropFragment.m11117l().m11121a());
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        Object objInitData = super.initData(interfaceC9324c);
        return objInitData == AbstractC9434a.m17291f() ? objInitData : C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m11119n();
        m11111p();
        return C8736p.f16368a;
    }

    /* renamed from: k */
    public final void m11116k() {
        FragmentKt.setFragmentResult(this, m11117l().m11122b(), BundleKt.bundleOf(AbstractC8726f.m14230a("RESULT_KEY_ACTION", "RESULT_VALUE_ACTION_CROP")));
        androidx.navigation.fragment.FragmentKt.findNavController(this).navigateUp();
    }

    /* renamed from: l */
    public final MicroCropFragmentArgs m11117l() {
        return (MicroCropFragmentArgs) this.f12660a.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_micro_crop;
    }

    /* renamed from: m */
    public final BlackboardCropFragment m11118m() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.fragment_container_sketch_crop);
        AbstractC9133u.m16131e(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.crop.BlackboardCropFragment");
        return (BlackboardCropFragment) fragmentFindFragmentById;
    }

    /* renamed from: n */
    public final void m11119n() {
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new InterfaceC10570l() { // from class: y4.e0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCropFragment.m11110o(this.f21080a, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }
}
