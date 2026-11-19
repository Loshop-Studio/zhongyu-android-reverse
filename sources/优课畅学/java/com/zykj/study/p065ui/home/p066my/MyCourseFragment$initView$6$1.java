package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.data.MyCourseEntity;
import java.util.Date;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$6$1", m17801f = "MyCourseFragment.kt", m17802l = {TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseFragment$initView$6$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13286a;

    /* renamed from: b */
    public Object f13287b;

    /* renamed from: c */
    public int f13288c;

    /* renamed from: d */
    public final /* synthetic */ MyCourseFragment f13289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseFragment$initView$6$1(MyCourseFragment myCourseFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13289d = myCourseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseFragment$initView$6$1(this.f13289d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseFragment$initView$6$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NavController navControllerFindNavController;
        Object objM17036z;
        AbstractC10244c.h hVar;
        String id;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13288c;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            FragmentActivity fragmentActivityRequireActivity = this.f13289d.requireActivity();
            AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
            navControllerFindNavController = Navigation.findNavController(fragmentActivityRequireActivity, R$id.nav_host_fragment);
            AbstractC10244c.h hVar2 = AbstractC10244c.f20434a;
            InterfaceC9266c data = this.f13289d.m11560q().m12228e().getData();
            this.f13286a = navControllerFindNavController;
            this.f13287b = hVar2;
            this.f13288c = 1;
            objM17036z = AbstractC9268e.m17036z(data, this);
            if (objM17036z == objM17291f) {
                return objM17291f;
            }
            hVar = hVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (AbstractC10244c.h) this.f13287b;
            navControllerFindNavController = (NavController) this.f13286a;
            AbstractC9079b.m15926b(obj);
            objM17036z = obj;
        }
        UserBean userBean = (UserBean) objM17036z;
        if (userBean == null || (id = userBean.getId()) == null) {
            id = "";
        }
        navControllerFindNavController.navigate(hVar.m19160c(new MyCourseEntity(0, id, null, null, null, 0, 0, 0, 0, 0, false, false, CourseType.UNDERCARRIAGE, new Date(), 0, 19452, null)));
        return C8736p.f16368a;
    }
}
