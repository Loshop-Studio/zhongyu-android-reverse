package com.friday.document.view.share;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class SuspendCall {

    /* renamed from: a */
    public final InterfaceC9540l f7701a;

    /* renamed from: b */
    public InterfaceC9529a f7702b;

    /* renamed from: c */
    public InterfaceC9540l f7703c;

    /* renamed from: d */
    public InterfaceC9529a f7704d;

    /* renamed from: e */
    public InterfaceC9540l f7705e;

    public SuspendCall(InterfaceC9540l block) {
        AbstractC9979u.m20294g(block, "block");
        this.f7701a = block;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6134a(vc.InterfaceC11588c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.friday.document.view.share.SuspendCall$launch$1
            if (r0 == 0) goto L13
            r0 = r5
            com.friday.document.view.share.SuspendCall$launch$1 r0 = (com.friday.document.view.share.SuspendCall$launch$1) r0
            int r1 = r0.f7708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7708e = r1
            goto L18
        L13:
            com.friday.document.view.share.SuspendCall$launch$1 r0 = new com.friday.document.view.share.SuspendCall$launch$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7706c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7708e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.AbstractC9924b.m20071b(r5)     // Catch: java.lang.Throwable -> L29
            goto L48
        L29:
            r5 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.AbstractC9924b.m20071b(r5)
            hd.a r5 = r4.f7702b     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L3d
            r5.invoke()     // Catch: java.lang.Throwable -> L29
        L3d:
            hd.l r5 = r4.f7701a     // Catch: java.lang.Throwable -> L29
            r0.f7708e = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L48
            return r1
        L48:
            hd.l r0 = r4.f7705e     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L4f
            r0.invoke(r5)     // Catch: java.lang.Throwable -> L29
        L4f:
            hd.a r5 = r4.f7704d
            if (r5 == 0) goto L66
        L53:
            r5.invoke()
            goto L66
        L57:
            hd.l r0 = r4.f7703c     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L61
            r0.invoke(r5)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r5 = move-exception
            goto L69
        L61:
            hd.a r5 = r4.f7704d
            if (r5 == 0) goto L66
            goto L53
        L66:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L69:
            hd.a r0 = r4.f7704d
            if (r0 == 0) goto L70
            r0.invoke()
        L70:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.share.SuspendCall.m6134a(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/share/SuspendCall.smali:52
    }

    /* renamed from: b */
    public final SuspendCall m6135b(InterfaceC9529a action) {
        AbstractC9979u.m20294g(action, "action");
        this.f7704d = action;
        return this;
    }

    /* renamed from: c */
    public final SuspendCall m6136c(InterfaceC9540l action) {
        AbstractC9979u.m20294g(action, "action");
        this.f7703c = action;
        return this;
    }

    /* renamed from: d */
    public final SuspendCall m6137d(InterfaceC9529a action) {
        AbstractC9979u.m20294g(action, "action");
        this.f7702b = action;
        return this;
    }

    /* renamed from: e */
    public final SuspendCall m6138e(InterfaceC9540l action) {
        AbstractC9979u.m20294g(action, "action");
        this.f7705e = action;
        return this;
    }
}
