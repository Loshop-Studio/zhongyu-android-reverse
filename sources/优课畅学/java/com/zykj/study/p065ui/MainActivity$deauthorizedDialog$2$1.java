package com.zykj.study.p065ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.lifecycle.LifecycleOwnerKt;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$string;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$deauthorizedDialog$2$1", m17801f = "MainActivity.kt", m17802l = {47}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MainActivity$deauthorizedDialog$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11607a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f11608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$deauthorizedDialog$2$1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11608b = mainActivity;
    }

    /* renamed from: d */
    public static final void m10458d(MainActivity mainActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, null, new MainActivity$deauthorizedDialog$2$1$1$1(mainActivity, null), 3, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MainActivity$deauthorizedDialog$2$1(this.f11608b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MainActivity$deauthorizedDialog$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11607a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c data = this.f11608b.m10435H().m9295c().getData();
            this.f11607a = 1;
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
        MaterialDialog.C6913g c6913gM6745f = new MaterialDialog.C6913g(this.f11608b).m6736G(R$string.hint).m6747h((userBean != null ? userBean.getRole() : null) == RoleType.Student ? R$string.the_lesson_has_been_unsubscribed_by_owner : R$string.the_lesson_has_been_deauthorized_by_owner).m6765z(R$string.got_it).m6744e(false).m6745f(false);
        final MainActivity mainActivity = this.f11608b;
        return c6913gM6745f.m6762w(new MaterialDialog.InterfaceC6915i() { // from class: com.zykj.study.ui.b
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MainActivity$deauthorizedDialog$2$1.m10458d(mainActivity, materialDialog, dialogAction);
            }
        }).m6742c();
    }
}
