package com.friday.document.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {433, 434, 447, 450, 463}, m26213m = "upload")
/* loaded from: classes3.dex */
public final class SyncStateOne$upload$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6976c;

    /* renamed from: d */
    public Object f6977d;

    /* renamed from: e */
    public Object f6978e;

    /* renamed from: f */
    public Object f6979f;

    /* renamed from: g */
    public Object f6980g;

    /* renamed from: h */
    public Object f6981h;

    /* renamed from: i */
    public Object f6982i;

    /* renamed from: j */
    public Object f6983j;

    /* renamed from: k */
    public Object f6984k;

    /* renamed from: l */
    public Object f6985l;

    /* renamed from: m */
    public Object f6986m;

    /* renamed from: n */
    public Object f6987n;

    /* renamed from: o */
    public Object f6988o;

    /* renamed from: p */
    public Object f6989p;

    /* renamed from: q */
    public Object f6990q;

    /* renamed from: r */
    public int f6991r;

    /* renamed from: s */
    public int f6992s;

    /* renamed from: t */
    public int f6993t;

    /* renamed from: u */
    public int f6994u;

    /* renamed from: v */
    public /* synthetic */ Object f6995v;

    /* renamed from: w */
    public final /* synthetic */ SyncStateOne f6996w;

    /* renamed from: x */
    public int f6997x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$upload$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6996w = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6995v = obj;
        this.f6997x |= Integer.MIN_VALUE;
        return this.f6996w.m5655z(null, null, null, null, this);
    }
}
