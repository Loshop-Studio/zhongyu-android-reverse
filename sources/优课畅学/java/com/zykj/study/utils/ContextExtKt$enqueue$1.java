package com.zykj.study.utils;

import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.BaseViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.utils.ContextExtKt$enqueue$1", m17801f = "ContextExt.kt", m17802l = {229, 232}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ContextExtKt$enqueue$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13721a;

    /* renamed from: b */
    public int f13722b;

    /* renamed from: c */
    public /* synthetic */ Object f13723c;

    /* renamed from: d */
    public final /* synthetic */ UnPeekLiveData f13724d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10574p f13725e;

    /* renamed from: f */
    public final /* synthetic */ BaseViewModel f13726f;

    /* renamed from: g */
    public final /* synthetic */ UnPeekLiveData f13727g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC10575q f13728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextExtKt$enqueue$1(UnPeekLiveData unPeekLiveData, InterfaceC10574p interfaceC10574p, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, InterfaceC10575q interfaceC10575q, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13724d = unPeekLiveData;
        this.f13725e = interfaceC10574p;
        this.f13726f = baseViewModel;
        this.f13727g = unPeekLiveData2;
        this.f13728h = interfaceC10575q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ContextExtKt$enqueue$1 contextExtKt$enqueue$1 = new ContextExtKt$enqueue$1(this.f13724d, this.f13725e, this.f13726f, this.f13727g, this.f13728h, interfaceC9324c);
        contextExtKt$enqueue$1.f13723c = obj;
        return contextExtKt$enqueue$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ContextExtKt$enqueue$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r7.invoke(r0, r6) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r2.invoke(r0, r7, r6) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[PHI: r7
      0x004a: PHI (r7v4 com.kunminx.architecture.ui.callback.UnPeekLiveData) = (r7v6 com.kunminx.architecture.ui.callback.UnPeekLiveData), (r7v10 com.kunminx.architecture.ui.callback.UnPeekLiveData) binds: [B:32:0x0074, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13723c
            i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r6.f13722b
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r0 = r6.f13721a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L1b
            goto L72
        L1b:
            r7 = move-exception
            goto L7a
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L25:
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r7 = move-exception
            goto L52
        L2b:
            kotlin.AbstractC9079b.m15926b(r7)
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r6.f13724d
            if (r7 == 0) goto L39
            java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r5)
            r7.setValue(r2)
        L39:
            x7.p r7 = r6.f13725e     // Catch: java.lang.Throwable -> L29
            r6.f13723c = r0     // Catch: java.lang.Throwable -> L29
            r6.f13722b = r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.invoke(r0, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L46
            goto L71
        L46:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r6.f13724d
            if (r7 == 0) goto L77
        L4a:
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r4)
            r7.setValue(r0)
            goto L77
        L52:
            com.zykj.base.BaseViewModel r2 = r6.f13726f     // Catch: java.lang.Throwable -> L1b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f13727g     // Catch: java.lang.Throwable -> L1b
            r2.handlerThrowable(r7, r5)     // Catch: java.lang.Throwable -> L1b
            x7.q r2 = r6.f13728h     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L72
            java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r0)     // Catch: java.lang.Throwable -> L1b
            r6.f13723c = r5     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r7)     // Catch: java.lang.Throwable -> L1b
            r6.f13721a = r5     // Catch: java.lang.Throwable -> L1b
            r6.f13722b = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r7 = r2.invoke(r0, r7, r6)     // Catch: java.lang.Throwable -> L1b
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r6.f13724d
            if (r7 == 0) goto L77
            goto L4a
        L77:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L7a:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r0 = r6.f13724d
            if (r0 == 0) goto L85
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r4)
            r0.setValue(r1)
        L85:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.utils.ContextExtKt$enqueue$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/utils/ContextExtKt$enqueue$1.smali:170
    }
}
