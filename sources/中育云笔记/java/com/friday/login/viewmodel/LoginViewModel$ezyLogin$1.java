package com.friday.login.viewmodel;

import com.friday.common.entity.EzyLoginRequest;
import com.friday.common.helper.C5962b;
import com.friday.common.util.SyncException;
import com.friday.login.service.GatewayBean;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.taobao.sophix.PatchStatus;
import com.zykj.http.bean.HeaderBean;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.login.viewmodel.LoginViewModel$ezyLogin$1", m26211f = "LoginViewModel.kt", m26212l = {60, PatchStatus.CODE_LOAD_FIND_METHOD, 104}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$ezyLogin$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9072c;

    /* renamed from: d */
    public Object f9073d;

    /* renamed from: e */
    public int f9074e;

    /* renamed from: f */
    public final /* synthetic */ LoginViewModel f9075f;

    /* renamed from: g */
    public final /* synthetic */ String f9076g;

    /* renamed from: h */
    public final /* synthetic */ EzyLoginRequest f9077h;

    /* renamed from: i */
    public final /* synthetic */ String f9078i;

    @InterfaceC11829d(m26210c = "com.friday.login.viewmodel.LoginViewModel$ezyLogin$1$1", m26211f = "LoginViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.login.viewmodel.LoginViewModel$ezyLogin$1$1 */
    public static final class C61801 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9079c;

        /* renamed from: d */
        public final /* synthetic */ String f9080d;

        /* renamed from: e */
        public final /* synthetic */ LoginViewModel f9081e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61801(String str, LoginViewModel loginViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9080d = str;
            this.f9081e = loginViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61801(this.f9080d, this.f9081e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strString;
            Object value;
            C5962b.a aVar;
            AbstractC11725a.m25952f();
            if (this.f9079c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC9746z abstractC9746zM19628e = new C9742v.a().m19557c().mo19319b(new C9743w.a().m19608p("https://hagateway.zykj.org/api/discovery/" + this.f9080d).m19595b()).execute().m19628e();
            if (abstractC9746zM19628e == null || (strString = abstractC9746zM19628e.string()) == null) {
                return null;
            }
            LoginViewModel loginViewModel = this.f9081e;
            try {
                C5962b.f6082a.m5299a().m5268F(((GatewayBean) new Gson().fromJson(strString, GatewayBean.class)).getServer());
                InterfaceC11603l interfaceC11603l = loginViewModel.f9066d;
                do {
                    value = interfaceC11603l.getValue();
                    aVar = C5962b.f6082a;
                } while (!interfaceC11603l.mo20870e(value, HeaderBean.copy$default((HeaderBean) value, null, null, aVar.m5299a().m5290r(), aVar.m5299a().m5291s(), null, 19, null)));
                return C10786q.f26013a;
            } catch (JsonSyntaxException unused) {
                throw new SyncException(null, null, 3, null);
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61801) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$ezyLogin$1(LoginViewModel loginViewModel, String str, EzyLoginRequest ezyLoginRequest, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9075f = loginViewModel;
        this.f9076g = str;
        this.f9077h = ezyLoginRequest;
        this.f9078i = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new LoginViewModel$ezyLogin$1(this.f9075f, this.f9076g, this.f9077h, this.f9078i, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.login.viewmodel.LoginViewModel$ezyLogin$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/login/viewmodel/LoginViewModel$ezyLogin$1.smali:157
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((LoginViewModel$ezyLogin$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
