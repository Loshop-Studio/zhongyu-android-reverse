package com.friday.document.sync;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {570, 584, 600, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 617}, m26213m = "uploadSingleFile")
/* loaded from: classes3.dex */
public final class SyncStateOne$uploadSingleFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7045c;

    /* renamed from: d */
    public Object f7046d;

    /* renamed from: e */
    public Object f7047e;

    /* renamed from: f */
    public Object f7048f;

    /* renamed from: g */
    public Object f7049g;

    /* renamed from: h */
    public Object f7050h;

    /* renamed from: i */
    public Object f7051i;

    /* renamed from: j */
    public Object f7052j;

    /* renamed from: k */
    public Object f7053k;

    /* renamed from: l */
    public Object f7054l;

    /* renamed from: m */
    public int f7055m;

    /* renamed from: n */
    public int f7056n;

    /* renamed from: o */
    public /* synthetic */ Object f7057o;

    /* renamed from: p */
    public final /* synthetic */ SyncStateOne f7058p;

    /* renamed from: q */
    public int f7059q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$uploadSingleFile$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7058p = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7057o = obj;
        this.f7059q |= Integer.MIN_VALUE;
        return this.f7058p.m5639E(null, this);
    }
}
