package com.friday.common.base;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.base.BaseViewModel$launch$3", m26211f = "BaseViewModel.kt", m26212l = {17, 19}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseViewModel$launch$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f5620c;

    /* renamed from: d */
    public int f5621d;

    /* renamed from: e */
    public /* synthetic */ Object f5622e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9544p f5623f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9544p f5624g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9529a f5625h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launch$3(InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5623f = interfaceC9544p;
        this.f5624g = interfaceC9544p2;
        this.f5625h = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BaseViewModel$launch$3 baseViewModel$launch$3 = new BaseViewModel$launch$3(this.f5623f, this.f5624g, this.f5625h, interfaceC11588c);
        baseViewModel$launch$3.f5622e = obj;
        return baseViewModel$launch$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r6.invoke(r0, r5) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r2.invoke(r6, r5) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5622e
            sd.i0 r0 = (sd.InterfaceC11122i0) r0
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r5.f5621d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r0 = r5.f5620c
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L1a
            goto L3e
        L1a:
            r6 = move-exception
            goto L5e
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L24:
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            goto L3e
        L28:
            r6 = move-exception
            goto L44
        L2a:
            kotlin.AbstractC9924b.m20071b(r6)
            hd.p r6 = r5.f5623f     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            r5.f5622e = r2     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            r5.f5621d = r4     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            java.lang.Object r6 = r6.invoke(r0, r5)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L28
            if (r6 != r1) goto L3e
            goto L5a
        L3e:
            hd.a r6 = r5.f5625h
            r6.invoke()
            goto L5b
        L44:
            hd.p r2 = r5.f5624g     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L1a
            r5.f5622e = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = p409xc.AbstractC11833h.m26224a(r6)     // Catch: java.lang.Throwable -> L1a
            r5.f5620c = r0     // Catch: java.lang.Throwable -> L1a
            r5.f5621d = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r6 = r2.invoke(r6, r5)     // Catch: java.lang.Throwable -> L1a
            if (r6 != r1) goto L3e
        L5a:
            return r1
        L5b:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L5e:
            hd.a r0 = r5.f5625h
            r0.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.base.BaseViewModel$launch$3.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/base/BaseViewModel$launch$3.smali:147
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseViewModel$launch$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
