package com.friday.cloudsnote.viewModel;

import com.blankj.utilcode.util.PathUtils;
import com.friday.common.dao.UserDao;
import com.friday.common.helper.C5962b;
import com.zykj.message.server.bean.UserInfo;
import java.io.File;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.cloudsnote.viewModel.MainViewModel$setUserInfo$1", m26211f = "MainViewModel.kt", m26212l = {46}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MainViewModel$setUserInfo$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f5513c;

    /* renamed from: d */
    public int f5514d;

    /* renamed from: e */
    public final /* synthetic */ UserInfo f5515e;

    /* renamed from: f */
    public final /* synthetic */ MainViewModel f5516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$setUserInfo$1(UserInfo userInfo, MainViewModel mainViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5515e = userInfo;
        this.f5516f = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new MainViewModel$setUserInfo$1(this.f5515e, this.f5516f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5514d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            C5962b.a aVar = C5962b.f6082a;
            C5962b c5962bM5299a = aVar.m5299a();
            String strM16574b = this.f5515e.m16574b();
            AbstractC9979u.m20293f(strM16574b, "getRealName(...)");
            c5962bM5299a.m5271I(strM16574b);
            C5962b c5962bM5299a2 = aVar.m5299a();
            Integer numM16575c = this.f5515e.m16575c();
            AbstractC9979u.m20293f(numM16575c, "getRole(...)");
            c5962bM5299a2.m5273K(numM16575c.intValue());
            C5962b c5962bM5299a3 = aVar.m5299a();
            Long lM16573a = this.f5515e.m16573a();
            AbstractC9979u.m20293f(lM16573a, "getId(...)");
            c5962bM5299a3.m5270H(lM16573a.longValue());
            C5962b c5962bM5299a4 = aVar.m5299a();
            String strM16576g = this.f5515e.m16576g();
            AbstractC9979u.m20293f(strM16576g, "getSchoolCode(...)");
            c5962bM5299a4.m5263A(strM16576g);
            String externalAppDataPath = PathUtils.getExternalAppDataPath();
            String str = File.separator;
            String str2 = externalAppDataPath + str + "userNote" + str + this.f5515e.m16573a() + str;
            aVar.m5299a().m5266D(str2 + "note" + str);
            UserDao userDao = this.f5516f.f5510b;
            Long lM16573a2 = this.f5515e.m16573a();
            AbstractC9979u.m20293f(lM16573a2, "getId(...)");
            long jLongValue = lM16573a2.longValue();
            String strM16574b2 = this.f5515e.m16574b();
            AbstractC9979u.m20293f(strM16574b2, "getRealName(...)");
            this.f5513c = AbstractC11833h.m26224a(str2);
            this.f5514d = 1;
            if (userDao.mo5206b(jLongValue, strM16574b2, this) == objM25952f) {
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
        return ((MainViewModel$setUserInfo$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
