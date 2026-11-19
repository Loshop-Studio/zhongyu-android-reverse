package com.zykj.lib.login.p062ui.student;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.zykj.lib.login.R$layout;
import com.zykj.lib.login.databinding.LoginFragmentLoginStudentBinding;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.lib.login.p062ui.student.StudentLoginFragment;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentLoginFragment extends Hilt_StudentLoginFragment<LoginFragmentLoginStudentBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f9944f;

    /* renamed from: com.zykj.lib.login.ui.student.StudentLoginFragment$a */
    public static final /* synthetic */ class C7337a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9949a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.CRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9949a = iArr;
        }
    }

    public StudentLoginFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f9944f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.student.StudentLoginFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.student.StudentLoginFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.student.StudentLoginFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: l */
    public static final C8736p m9306l(StudentLoginFragment studentLoginFragment, ServerInfo serverInfo, UserInfo userInfo) {
        AbstractC9133u.m16133g(userInfo, "userInfo");
        LifecycleOwner viewLifecycleOwner = studentLoginFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C8843i0.m14868c(), null, new StudentLoginFragment$getUserInfo$1$1(studentLoginFragment, userInfo, serverInfo, null), 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m9307m(StudentLoginFragment studentLoginFragment, ServerInfo it) {
        AbstractC9133u.m16133g(it, "it");
        Status statusM9596b = it.m9596b();
        int i10 = statusM9596b == null ? -1 : C7337a.f9949a[statusM9596b.ordinal()];
        if (i10 == -1) {
            LifecycleOwner viewLifecycleOwner = studentLoginFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C8843i0.m14868c(), null, new StudentLoginFragment$initView$2$1(studentLoginFragment, null), 2, null);
        } else if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LifecycleOwner viewLifecycleOwner2 = studentLoginFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), C8843i0.m14868c(), null, new StudentLoginFragment$initView$2$1(studentLoginFragment, null), 2, null);
        } else {
            studentLoginFragment.m9309k(it);
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        MessageClient messageClient = MessageClient.f10416a;
        if (messageClient.mo9574g()) {
            messageClient.mo9569a(new InterfaceC10570l() { // from class: o3.a
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return StudentLoginFragment.m9307m(this.f18897a, (ServerInfo) obj);
                }
            });
        } else {
            Context contextRequireContext = requireContext();
            AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
            messageClient.mo9571c(contextRequireContext, false);
        }
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final LoginViewModel m9308j() {
        return (LoginViewModel) this.f9944f.getValue();
    }

    /* renamed from: k */
    public final void m9309k(final ServerInfo serverInfo) {
        MessageClient.f10416a.mo9570b(new InterfaceC10570l() { // from class: o3.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return StudentLoginFragment.m9306l(this.f18898a, serverInfo, (UserInfo) obj);
            }
        });
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.login_fragment_login_student;
    }
}
