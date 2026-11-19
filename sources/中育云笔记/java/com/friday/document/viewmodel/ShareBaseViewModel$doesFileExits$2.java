package com.friday.document.viewmodel;

import com.friday.document.model.ShareFile;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$doesFileExits$2", m26211f = "ShareBaseViewModel.kt", m26212l = {293, 302, 306, 307}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$doesFileExits$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8231c;

    /* renamed from: d */
    public Object f8232d;

    /* renamed from: e */
    public int f8233e;

    /* renamed from: f */
    public final /* synthetic */ ShareBaseViewModel f8234f;

    /* renamed from: g */
    public final /* synthetic */ ShareFile f8235g;

    /* renamed from: h */
    public final /* synthetic */ boolean f8236h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$doesFileExits$2(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8234f = shareBaseViewModel;
        this.f8235g = shareFile;
        this.f8236h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$doesFileExits$2(this.f8234f, this.f8235g, this.f8236h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        if (r2.mo2808d(r3, r5, r13) != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[LOOP:0: B:29:0x00a8->B:31:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ShareBaseViewModel$doesFileExits$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ShareBaseViewModel$doesFileExits$2.smali:145
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseViewModel$doesFileExits$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
