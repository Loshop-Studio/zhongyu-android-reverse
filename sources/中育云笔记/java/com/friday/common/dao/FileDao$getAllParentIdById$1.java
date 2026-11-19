package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao", m26211f = "FileDao.kt", m26212l = {300}, m26213m = "getAllParentIdById$suspendImpl")
/* loaded from: classes3.dex */
public final class FileDao$getAllParentIdById$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5770c;

    /* renamed from: d */
    public Object f5771d;

    /* renamed from: e */
    public Object f5772e;

    /* renamed from: f */
    public Object f5773f;

    /* renamed from: g */
    public /* synthetic */ Object f5774g;

    /* renamed from: h */
    public final /* synthetic */ FileDao f5775h;

    /* renamed from: i */
    public int f5776i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao$getAllParentIdById$1(FileDao fileDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5775h = fileDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5774g = obj;
        this.f5776i |= Integer.MIN_VALUE;
        return FileDao.m4900i(this.f5775h, null, this);
    }
}
