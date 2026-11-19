package com.zykj.lib.login.p062ui.main;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.BaseFragment;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.R$layout;
import com.zykj.lib.login.databinding.LoginFragmentLoginBinding;
import com.zykj.message.client.MessageClient;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LoginFragment extends BaseFragment<LoginFragmentLoginBinding> {
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        FragmentKt.findNavController(this).navigate(MessageClient.f10416a.mo9574g() ? R$id.studentLoginFragment : R$id.teacherLoginFragment, (Bundle) null, NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder(), R$id.loginFragment, true, false, 4, (Object) null).setLaunchSingleTop(true).build());
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.login_fragment_login;
    }
}
