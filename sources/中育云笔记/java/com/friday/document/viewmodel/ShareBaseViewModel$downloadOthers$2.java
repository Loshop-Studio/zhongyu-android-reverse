package com.friday.document.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.friday.document.model.ShareFile;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadOthers$2", m26211f = "ShareBaseViewModel.kt", m26212l = {231, 242}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$downloadOthers$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8244c;

    /* renamed from: d */
    public Object f8245d;

    /* renamed from: e */
    public Object f8246e;

    /* renamed from: f */
    public Object f8247f;

    /* renamed from: g */
    public Object f8248g;

    /* renamed from: h */
    public Object f8249h;

    /* renamed from: i */
    public Object f8250i;

    /* renamed from: j */
    public Object f8251j;

    /* renamed from: k */
    public Object f8252k;

    /* renamed from: l */
    public int f8253l;

    /* renamed from: m */
    public int f8254m;

    /* renamed from: n */
    public final /* synthetic */ ShareBaseViewModel f8255n;

    /* renamed from: o */
    public final /* synthetic */ ShareFile f8256o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$downloadOthers$2(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8255n = shareBaseViewModel;
        this.f8256o = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$downloadOthers$2(this.f8255n, this.f8256o, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ac, code lost:
    
        if (r13.m6379w(r14, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0246, code lost:
    
        if (r0.mo2811g(r8, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0248, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ShareBaseViewModel$downloadOthers$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2.smali:151
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseViewModel$downloadOthers$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
