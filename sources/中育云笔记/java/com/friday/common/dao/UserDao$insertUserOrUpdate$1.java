package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.UserDao", m26211f = "UserDao.kt", m26212l = {25, 26}, m26213m = "insertUserOrUpdate$suspendImpl")
/* loaded from: classes3.dex */
public final class UserDao$insertUserOrUpdate$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5921c;

    /* renamed from: d */
    public Object f5922d;

    /* renamed from: e */
    public Object f5923e;

    /* renamed from: f */
    public long f5924f;

    /* renamed from: g */
    public /* synthetic */ Object f5925g;

    /* renamed from: h */
    public final /* synthetic */ UserDao f5926h;

    /* renamed from: i */
    public int f5927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDao$insertUserOrUpdate$1(UserDao userDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5926h = userDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5925g = obj;
        this.f5927i |= Integer.MIN_VALUE;
        return UserDao.m5205n(this.f5926h, 0L, null, this);
    }
}
