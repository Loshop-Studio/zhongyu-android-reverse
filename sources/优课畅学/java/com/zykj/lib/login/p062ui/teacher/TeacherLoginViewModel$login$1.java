package com.zykj.lib.login.p062ui.teacher;

import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.login.R$string;
import com.zykj.lib.login.bean.LoginInfo;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$login$1", m17801f = "TeacherLoginViewModel.kt", m17802l = {81}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TeacherLoginViewModel$login$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f10004a;

    /* renamed from: b */
    public Object f10005b;

    /* renamed from: c */
    public Object f10006c;

    /* renamed from: d */
    public int f10007d;

    /* renamed from: e */
    public final /* synthetic */ TeacherLoginViewModel f10008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherLoginViewModel$login$1(TeacherLoginViewModel teacherLoginViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10008e = teacherLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeacherLoginViewModel$login$1(this.f10008e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeacherLoginViewModel$login$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f10007d;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            String str = (String) this.f10008e.m9321f().getValue();
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                XToastUtils.INSTANCE.info(R$string.please_input_school_code);
                return C8736p.f16368a;
            }
            String str2 = (String) this.f10008e.m9324i().getValue();
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                XToastUtils.INSTANCE.info(R$string.please_input_user_name);
                return C8736p.f16368a;
            }
            String str3 = (String) this.f10008e.m9320e().getValue();
            String str4 = str3 != null ? str3 : "";
            if (str4.length() == 0) {
                XToastUtils.INSTANCE.info(R$string.please_input_password);
                return C8736p.f16368a;
            }
            if (!AbstractC9133u.m16128b(this.f10008e.m9326k().getValue(), AbstractC9536a.m17796a(true))) {
                XToastUtils.INSTANCE.info(R$string.please_check_agreement);
                return C8736p.f16368a;
            }
            InterfaceC9643a interfaceC9643aM9318c = this.f10008e.m9318c();
            this.f10004a = AbstractC9543h.m17814a(str);
            this.f10005b = AbstractC9543h.m17814a(str2);
            this.f10006c = AbstractC9543h.m17814a(str4);
            this.f10007d = 1;
            obj = interfaceC9643aM9318c.mo10313b(str, str2, str4, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        if (loginInfo == null) {
            return C8736p.f16368a;
        }
        this.f10008e.m9325j(loginInfo);
        return C8736p.f16368a;
    }
}
