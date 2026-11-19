package com.friday.user.viewmodel;

import com.friday.common.dao.UserDao;
import com.friday.common.entity.User;
import com.friday.common.helper.C5962b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$getName$1", m26211f = "UserViewModel.kt", m26212l = {63}, m26213m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class UserViewModel$getName$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10715c;

    /* renamed from: d */
    public final /* synthetic */ UserViewModel f10716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewModel$getName$1(UserViewModel userViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10716d = userViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new UserViewModel$getName$1(this.f10716d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String userName;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10715c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            UserDao userDao = this.f10716d.f10667b;
            long jM5292t = C5962b.f6082a.m5299a().m5292t();
            this.f10715c = 1;
            obj = userDao.mo5213o(jM5292t, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        User user = (User) obj;
        InterfaceC11603l interfaceC11603l = this.f10716d.f10673h;
        do {
            value = interfaceC11603l.getValue();
            if (user == null || (userName = user.getUserName()) == null) {
                userName = "";
            }
        } while (!interfaceC11603l.mo20870e(value, userName));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((UserViewModel$getName$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
