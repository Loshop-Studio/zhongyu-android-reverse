package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao", m26211f = "FileDao.kt", m26212l = {269}, m26213m = "markCacheStateAsFalse$suspendImpl")
/* loaded from: classes3.dex */
public final class FileDao$markCacheStateAsFalse$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5788c;

    /* renamed from: d */
    public Object f5789d;

    /* renamed from: e */
    public Object f5790e;

    /* renamed from: f */
    public Object f5791f;

    /* renamed from: g */
    public Object f5792g;

    /* renamed from: h */
    public Object f5793h;

    /* renamed from: i */
    public int f5794i;

    /* renamed from: j */
    public int f5795j;

    /* renamed from: k */
    public /* synthetic */ Object f5796k;

    /* renamed from: l */
    public final /* synthetic */ FileDao f5797l;

    /* renamed from: m */
    public int f5798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao$markCacheStateAsFalse$1(FileDao fileDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5797l = fileDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5796k = obj;
        this.f5798m |= Integer.MIN_VALUE;
        return FileDao.m4897d(this.f5797l, null, this);
    }
}
