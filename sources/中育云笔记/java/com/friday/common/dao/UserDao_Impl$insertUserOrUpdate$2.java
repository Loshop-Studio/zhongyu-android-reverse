package com.friday.common.dao;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.UserDao_Impl$insertUserOrUpdate$2", m26211f = "UserDao_Impl.kt", m26212l = {Opcodes.DSTORE}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserDao_Impl$insertUserOrUpdate$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5932c;

    /* renamed from: d */
    public final /* synthetic */ UserDao_Impl f5933d;

    /* renamed from: e */
    public final /* synthetic */ long f5934e;

    /* renamed from: f */
    public final /* synthetic */ String f5935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDao_Impl$insertUserOrUpdate$2(UserDao_Impl userDao_Impl, long j10, String str, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5933d = userDao_Impl;
        this.f5934e = j10;
        this.f5935f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new UserDao_Impl$insertUserOrUpdate$2(this.f5933d, this.f5934e, this.f5935f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5932c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            UserDao_Impl userDao_Impl = this.f5933d;
            long j10 = this.f5934e;
            String str = this.f5935f;
            this.f5932c = 1;
            if (super/*com.friday.common.dao.UserDao*/.mo5206b(j10, str, this) == objM25952f) {
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

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((UserDao_Impl$insertUserOrUpdate$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
