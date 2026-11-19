package com.friday.document.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {306, 327, 328, 334, 343, 353, 354, 370, 373, 388, 398, 405}, m26213m = "uploadFile")
/* loaded from: classes3.dex */
public final class SyncStateOne$uploadFile$1 extends ContinuationImpl {

    /* renamed from: A */
    public int f6998A;

    /* renamed from: c */
    public Object f6999c;

    /* renamed from: d */
    public Object f7000d;

    /* renamed from: e */
    public Object f7001e;

    /* renamed from: f */
    public Object f7002f;

    /* renamed from: g */
    public Object f7003g;

    /* renamed from: h */
    public Object f7004h;

    /* renamed from: i */
    public Object f7005i;

    /* renamed from: j */
    public Object f7006j;

    /* renamed from: k */
    public Object f7007k;

    /* renamed from: l */
    public Object f7008l;

    /* renamed from: m */
    public Object f7009m;

    /* renamed from: n */
    public Object f7010n;

    /* renamed from: o */
    public Object f7011o;

    /* renamed from: p */
    public Object f7012p;

    /* renamed from: q */
    public Object f7013q;

    /* renamed from: r */
    public Object f7014r;

    /* renamed from: s */
    public Object f7015s;

    /* renamed from: t */
    public Object f7016t;

    /* renamed from: u */
    public Object f7017u;

    /* renamed from: v */
    public int f7018v;

    /* renamed from: w */
    public int f7019w;

    /* renamed from: x */
    public int f7020x;

    /* renamed from: y */
    public /* synthetic */ Object f7021y;

    /* renamed from: z */
    public final /* synthetic */ SyncStateOne f7022z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$uploadFile$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7022z = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7021y = obj;
        this.f6998A |= Integer.MIN_VALUE;
        return this.f7022z.m5637A(null, this);
    }
}
