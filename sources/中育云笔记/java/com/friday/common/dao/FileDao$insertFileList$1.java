package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao", m26211f = "FileDao.kt", m26212l = {24}, m26213m = "insertFileList$suspendImpl")
/* loaded from: classes3.dex */
public final class FileDao$insertFileList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5777c;

    /* renamed from: d */
    public Object f5778d;

    /* renamed from: e */
    public Object f5779e;

    /* renamed from: f */
    public Object f5780f;

    /* renamed from: g */
    public Object f5781g;

    /* renamed from: h */
    public Object f5782h;

    /* renamed from: i */
    public int f5783i;

    /* renamed from: j */
    public int f5784j;

    /* renamed from: k */
    public /* synthetic */ Object f5785k;

    /* renamed from: l */
    public final /* synthetic */ FileDao f5786l;

    /* renamed from: m */
    public int f5787m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao$insertFileList$1(FileDao fileDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5786l = fileDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5785k = obj;
        this.f5787m |= Integer.MIN_VALUE;
        return FileDao.m4899h(this.f5786l, null, this);
    }
}
