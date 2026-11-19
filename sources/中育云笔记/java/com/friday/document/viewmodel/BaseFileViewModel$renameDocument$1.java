package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$renameDocument$1", m26211f = "BaseFileViewModel.kt", m26212l = {410, 413, 418}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$renameDocument$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7932c;

    /* renamed from: d */
    public Object f7933d;

    /* renamed from: e */
    public Object f7934e;

    /* renamed from: f */
    public Object f7935f;

    /* renamed from: g */
    public int f7936g;

    /* renamed from: h */
    public int f7937h;

    /* renamed from: i */
    public final /* synthetic */ BaseFileViewModel f7938i;

    /* renamed from: j */
    public final /* synthetic */ String f7939j;

    /* renamed from: k */
    public final /* synthetic */ String f7940k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$renameDocument$1(BaseFileViewModel baseFileViewModel, String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7938i = baseFileViewModel;
        this.f7939j = str;
        this.f7940k = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$renameDocument$1(this.f7938i, this.f7939j, this.f7940k, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.f7937h
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L44
            if (r1 == r4) goto L40
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r0 = r11.f7934e
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            java.lang.Object r1 = r11.f7933d
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            java.lang.Object r1 = r11.f7932c
            com.friday.common.entity.FileEntity r1 = (com.friday.common.entity.FileEntity) r1
            kotlin.AbstractC9924b.m20071b(r12)
            r10 = r11
            goto Lce
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2b:
            java.lang.Object r1 = r11.f7935f
            com.friday.common.entity.FileEntity r1 = (com.friday.common.entity.FileEntity) r1
            java.lang.Object r1 = r11.f7934e
            com.friday.common.entity.FileEntity r1 = (com.friday.common.entity.FileEntity) r1
            java.lang.Object r1 = r11.f7933d
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            java.lang.Object r3 = r11.f7932c
            com.friday.common.entity.FileEntity r3 = (com.friday.common.entity.FileEntity) r3
            kotlin.AbstractC9924b.m20071b(r12)
            r10 = r11
            goto La2
        L40:
            kotlin.AbstractC9924b.m20071b(r12)
            goto L5a
        L44:
            kotlin.AbstractC9924b.m20071b(r12)
            com.friday.document.viewmodel.BaseFileViewModel r12 = r11.f7938i
            com.friday.common.dao.FileDao r12 = r12.m6229M()
            java.lang.String r1 = r11.f7939j
            r11.f7937h = r4
            java.lang.Object r12 = r12.mo4941r(r1, r11)
            if (r12 != r0) goto L5a
            r10 = r11
            goto Lcc
        L5a:
            com.friday.common.entity.FileEntity r12 = (com.friday.common.entity.FileEntity) r12
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r5 = java.util.Locale.CHINA
            r1.<init>(r4, r5)
            if (r12 == 0) goto La4
            com.friday.document.viewmodel.BaseFileViewModel r4 = r11.f7938i
            java.lang.String r6 = r11.f7939j
            java.lang.String r7 = r11.f7940k
            com.friday.common.dao.FileDao r5 = r4.m6229M()
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r9 = r1.format(r4)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r9, r4)
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r12)
            r11.f7932c = r4
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r1)
            r11.f7933d = r4
            r11.f7934e = r12
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r12)
            r11.f7935f = r4
            r4 = 0
            r11.f7936g = r4
            r11.f7937h = r3
            r8 = 1
            r10 = r11
            java.lang.Object r3 = r5.mo4929a0(r6, r7, r8, r9, r10)
            if (r3 != r0) goto La1
            goto Lcc
        La1:
            r3 = r12
        La2:
            r12 = r3
            goto La5
        La4:
            r10 = r11
        La5:
            com.friday.document.viewmodel.BaseFileViewModel r3 = r10.f7938i
            androidx.lifecycle.MutableLiveData r3 = r3.m6236T()
            com.friday.document.viewmodel.BaseFileViewModel r4 = r10.f7938i
            com.friday.common.dao.FileDao r4 = r4.m6229M()
            java.lang.String r5 = r10.f7939j
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r12)
            r10.f7932c = r12
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r1)
            r10.f7933d = r12
            r10.f7934e = r3
            r12 = 0
            r10.f7935f = r12
            r10.f7937h = r2
            java.lang.Object r12 = r4.mo4941r(r5, r11)
            if (r12 != r0) goto Lcd
        Lcc:
            return r0
        Lcd:
            r0 = r3
        Lce:
            r0.setValue(r12)
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel$renameDocument$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel$renameDocument$1.smali:150
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$renameDocument$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
