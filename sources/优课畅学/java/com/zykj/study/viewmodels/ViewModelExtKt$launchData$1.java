package com.zykj.study.viewmodels;

import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.BaseViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ViewModelExtKt$launchData$1", m17801f = "ViewModelExt.kt", m17802l = {21, 23}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ViewModelExtKt$launchData$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14516a;

    /* renamed from: b */
    public int f14517b;

    /* renamed from: c */
    public /* synthetic */ Object f14518c;

    /* renamed from: d */
    public final /* synthetic */ UnPeekLiveData f14519d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10574p f14520e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC10575q f14521f;

    /* renamed from: g */
    public final /* synthetic */ BaseViewModel f14522g;

    /* renamed from: h */
    public final /* synthetic */ UnPeekLiveData f14523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$launchData$1(UnPeekLiveData unPeekLiveData, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14519d = unPeekLiveData;
        this.f14520e = interfaceC10574p;
        this.f14521f = interfaceC10575q;
        this.f14522g = baseViewModel;
        this.f14523h = unPeekLiveData2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ViewModelExtKt$launchData$1 viewModelExtKt$launchData$1 = new ViewModelExtKt$launchData$1(this.f14519d, this.f14520e, this.f14521f, this.f14522g, this.f14523h, interfaceC9324c);
        viewModelExtKt$launchData$1.f14518c = obj;
        return viewModelExtKt$launchData$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ViewModelExtKt$launchData$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r8.invoke(r0, r7) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[PHI: r8
      0x004a: PHI (r8v4 com.kunminx.architecture.ui.callback.UnPeekLiveData) = (r8v9 com.kunminx.architecture.ui.callback.UnPeekLiveData), (r8v14 com.kunminx.architecture.ui.callback.UnPeekLiveData) binds: [B:34:0x0079, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f14518c
            i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r7.f14517b
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r0 = r7.f14516a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L1b
            goto L68
        L1b:
            r8 = move-exception
            goto L7f
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r8 = move-exception
            goto L52
        L2b:
            kotlin.AbstractC9079b.m15926b(r8)
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r7.f14519d
            if (r8 == 0) goto L39
            java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r5)
            r8.setValue(r2)
        L39:
            x7.p r8 = r7.f14520e     // Catch: java.lang.Throwable -> L29
            r7.f14518c = r0     // Catch: java.lang.Throwable -> L29
            r7.f14517b = r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.invoke(r0, r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != r1) goto L46
            goto L64
        L46:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r7.f14519d
            if (r8 == 0) goto L7c
        L4a:
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r4)
            r8.setValue(r0)
            goto L7c
        L52:
            x7.q r2 = r7.f14521f     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r0)     // Catch: java.lang.Throwable -> L1b
            r7.f14518c = r5     // Catch: java.lang.Throwable -> L1b
            r7.f14516a = r8     // Catch: java.lang.Throwable -> L1b
            r7.f14517b = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r2.invoke(r0, r8, r7)     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L65
        L64:
            return r1
        L65:
            r6 = r0
            r0 = r8
            r8 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L77
            com.zykj.base.BaseViewModel r8 = r7.f14522g     // Catch: java.lang.Throwable -> L1b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r1 = r7.f14523h     // Catch: java.lang.Throwable -> L1b
            r8.handlerThrowable(r0, r1)     // Catch: java.lang.Throwable -> L1b
        L77:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r7.f14519d
            if (r8 == 0) goto L7c
            goto L4a
        L7c:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        L7f:
            com.kunminx.architecture.ui.callback.UnPeekLiveData r0 = r7.f14519d
            if (r0 == 0) goto L8a
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r4)
            r0.setValue(r1)
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ViewModelExtKt$launchData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ViewModelExtKt$launchData$1.smali:170
    }
}
