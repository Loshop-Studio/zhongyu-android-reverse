package com.friday.document.view.share;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.document.model.ShareFile;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareSearchActivity$initView$4$1$1", m26211f = "ShareSearchActivity.kt", m26212l = {152, Opcodes.IF_ACMPEQ, Opcodes.NEW}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareSearchActivity$initView$4$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7650c;

    /* renamed from: d */
    public final /* synthetic */ ShareFile f7651d;

    /* renamed from: e */
    public final /* synthetic */ ShareSearchActivity f7652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSearchActivity$initView$4$1$1(ShareFile shareFile, ShareSearchActivity shareSearchActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7651d = shareFile;
        this.f7652e = shareSearchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareSearchActivity$initView$4$1$1(this.f7651d, this.f7652e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r15 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        if (r15 != r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        if (r15 != r0) goto L62;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.share.ShareSearchActivity$initView$4$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareSearchActivity$initView$4$1$1.smali:130
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareSearchActivity$initView$4$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
