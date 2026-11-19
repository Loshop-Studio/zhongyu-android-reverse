package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MicroCodeViewModel$uploadAttachment$2", m17801f = "MicroCodeViewModel.kt", m17802l = {31, 33}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeViewModel$uploadAttachment$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public long f14225a;

    /* renamed from: b */
    public int f14226b;

    /* renamed from: c */
    public final /* synthetic */ MicroCodeViewModel f14227c;

    /* renamed from: d */
    public final /* synthetic */ String f14228d;

    /* renamed from: e */
    public final /* synthetic */ String f14229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeViewModel$uploadAttachment$2(MicroCodeViewModel microCodeViewModel, String str, String str2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14227c = microCodeViewModel;
        this.f14228d = str;
        this.f14229e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MicroCodeViewModel$uploadAttachment$2(this.f14227c, this.f14228d, this.f14229e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeViewModel$uploadAttachment$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r12.m10382b(r1, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r11.f14226b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r12)
            goto L70
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.AbstractC9079b.m15926b(r12)
            goto L3d
        L1e:
            kotlin.AbstractC9079b.m15926b(r12)
            com.zykj.study.viewmodels.MicroCodeViewModel r12 = r11.f14227c
            com.zykj.study.repository.QuickCodeRepository r12 = r12.m12196a()
            com.zykj.study.bean.AttachmentIdInput r4 = new com.zykj.study.bean.AttachmentIdInput
            java.lang.String r7 = r11.f14228d
            r9 = 11
            r10 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.f14226b = r3
            java.lang.Object r12 = r12.m10381a(r4, r11)
            if (r12 != r0) goto L3d
            goto L6f
        L3d:
            java.lang.Number r12 = (java.lang.Number) r12
            long r4 = r12.longValue()
            com.zykj.study.viewmodels.MicroCodeViewModel r12 = r11.f14227c
            com.zykj.study.repository.QuickCodeRepository r12 = r12.m12196a()
            com.zykj.study.bean.AttachmentInput r1 = new com.zykj.study.bean.AttachmentInput
            java.lang.String r6 = r11.f14229e
            com.google.gson.Gson r7 = new com.google.gson.Gson
            r7.<init>()
            com.zykj.study.bean.AttachmentExtraInput r8 = new com.zykj.study.bean.AttachmentExtraInput
            java.lang.String r9 = r11.f14228d
            r8.<init>(r4, r9)
            java.lang.String r7 = r7.toJson(r8)
            java.lang.String r8 = "toJson(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            r1.<init>(r6, r3, r7)
            r11.f14225a = r4
            r11.f14226b = r2
            java.lang.Object r12 = r12.m10382b(r1, r11)
            if (r12 != r0) goto L70
        L6f:
            return r0
        L70:
            java.lang.Boolean r12 = p201o7.AbstractC9536a.m17796a(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.MicroCodeViewModel$uploadAttachment$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2.smali:143
    }
}
