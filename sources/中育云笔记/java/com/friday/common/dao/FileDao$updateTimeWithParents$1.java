package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao", m26211f = "FileDao.kt", m26212l = {287, 288}, m26213m = "updateTimeWithParents$suspendImpl")
/* loaded from: classes3.dex */
public final class FileDao$updateTimeWithParents$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5799c;

    /* renamed from: d */
    public Object f5800d;

    /* renamed from: e */
    public Object f5801e;

    /* renamed from: f */
    public Object f5802f;

    /* renamed from: g */
    public Object f5803g;

    /* renamed from: h */
    public /* synthetic */ Object f5804h;

    /* renamed from: i */
    public final /* synthetic */ FileDao f5805i;

    /* renamed from: j */
    public int f5806j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao$updateTimeWithParents$1(FileDao fileDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5805i = fileDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5804h = obj;
        this.f5806j |= Integer.MIN_VALUE;
        return FileDao.m4901j(this.f5805i, null, null, this);
    }
}
