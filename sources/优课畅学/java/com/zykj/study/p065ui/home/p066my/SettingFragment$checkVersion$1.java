package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.lib.ota.bean.AppType;
import com.zykj.study.R$id;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.SettingFragment$checkVersion$1", m17801f = "SettingFragment.kt", m17802l = {78}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SettingFragment$checkVersion$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13313a;

    /* renamed from: b */
    public final /* synthetic */ SettingFragment f13314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingFragment$checkVersion$1(SettingFragment settingFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13314b = settingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SettingFragment$checkVersion$1(this.f13314b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SettingFragment$checkVersion$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NavController navControllerFindNavController;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13313a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c data = this.f13314b.m11583o().m9295c().getData();
            this.f13313a = 1;
            obj = AbstractC9268e.m17036z(data, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        UserBean userBean = (UserBean) obj;
        if (userBean != null) {
            SettingFragment settingFragment = this.f13314b;
            String id = userBean.getId();
            AbstractC9133u.m16132f(id, "getId(...)");
            if (id.length() > 0) {
                NavDirections navDirectionsM19164g = AbstractC10244c.f20434a.m19164g("com.zhongyukejiao.learningexpert", 10103, "1.1.3", userBean.getRole() == RoleType.Student ? AppType.STUDENT : AppType.TEACHER, false);
                try {
                    FragmentActivity activity = settingFragment.getActivity();
                    if (activity != null && (navControllerFindNavController = ActivityKt.findNavController(activity, R$id.nav_host_fragment)) != null) {
                        navControllerFindNavController.navigate(navDirectionsM19164g);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return C8736p.f16368a;
    }
}
