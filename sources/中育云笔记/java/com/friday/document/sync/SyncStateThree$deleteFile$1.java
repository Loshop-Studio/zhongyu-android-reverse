package com.friday.document.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateThree", m26211f = "SyncStateThree.kt", m26212l = {19, 22, 25, 35}, m26213m = "deleteFile")
/* loaded from: classes3.dex */
public final class SyncStateThree$deleteFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7076c;

    /* renamed from: d */
    public Object f7077d;

    /* renamed from: e */
    public Object f7078e;

    /* renamed from: f */
    public Object f7079f;

    /* renamed from: g */
    public Object f7080g;

    /* renamed from: h */
    public Object f7081h;

    /* renamed from: i */
    public Object f7082i;

    /* renamed from: j */
    public int f7083j;

    /* renamed from: k */
    public int f7084k;

    /* renamed from: l */
    public /* synthetic */ Object f7085l;

    /* renamed from: m */
    public final /* synthetic */ SyncStateThree f7086m;

    /* renamed from: n */
    public int f7087n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateThree$deleteFile$1(SyncStateThree syncStateThree, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7086m = syncStateThree;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7085l = obj;
        this.f7087n |= Integer.MIN_VALUE;
        return this.f7086m.m5656a(null, this);
    }
}
