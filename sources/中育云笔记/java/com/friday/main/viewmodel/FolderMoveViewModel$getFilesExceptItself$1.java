package com.friday.main.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$getFilesExceptItself$1", m26211f = "FolderMoveViewModel.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED, 93, 98}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$getFilesExceptItself$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9542c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9543d;

    /* renamed from: e */
    public final /* synthetic */ boolean f9544e;

    /* renamed from: f */
    public final /* synthetic */ FolderMoveViewModel f9545f;

    /* renamed from: g */
    public final /* synthetic */ String f9546g;

    /* renamed from: h */
    public final /* synthetic */ String f9547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$getFilesExceptItself$1(boolean z10, boolean z11, FolderMoveViewModel folderMoveViewModel, String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9543d = z10;
        this.f9544e = z11;
        this.f9545f = folderMoveViewModel;
        this.f9546g = str;
        this.f9547h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$getFilesExceptItself$1(this.f9543d, this.f9544e, this.f9545f, this.f9546g, this.f9547h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r12 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.f9542c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.AbstractC9924b.m20071b(r12)
            r6 = r11
            goto L97
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.AbstractC9924b.m20071b(r12)
            r6 = r11
            goto L75
        L24:
            kotlin.AbstractC9924b.m20071b(r12)
            r6 = r11
            goto L53
        L29:
            kotlin.AbstractC9924b.m20071b(r12)
            boolean r12 = r11.f9543d
            if (r12 == 0) goto L78
            boolean r12 = r11.f9544e
            if (r12 == 0) goto L56
            com.friday.main.viewmodel.FolderMoveViewModel r12 = r11.f9545f
            com.friday.common.dao.FileDao r5 = com.friday.main.viewmodel.FolderMoveViewModel.m7199h(r12)
            java.lang.String r6 = r11.f9546g
            java.lang.String r7 = r11.f9547h
            com.friday.common.helper.b$a r12 = com.friday.common.helper.C5962b.f6082a
            com.friday.common.helper.b r12 = r12.m5299a()
            long r8 = r12.m5292t()
            r11.f9542c = r4
            r10 = r11
            java.lang.Object r12 = r5.mo4945v(r6, r7, r8, r10)
            r6 = r10
            if (r12 != r0) goto L53
            goto L96
        L53:
            java.util.List r12 = (java.util.List) r12
            goto L99
        L56:
            r6 = r11
            com.friday.main.viewmodel.FolderMoveViewModel r12 = r6.f9545f
            com.friday.common.dao.FileDao r1 = com.friday.main.viewmodel.FolderMoveViewModel.m7199h(r12)
            java.lang.String r2 = r6.f9546g
            r12 = r3
            java.lang.String r3 = r6.f9547h
            com.friday.common.helper.b$a r4 = com.friday.common.helper.C5962b.f6082a
            com.friday.common.helper.b r4 = r4.m5299a()
            long r4 = r4.m5292t()
            r6.f9542c = r12
            java.lang.Object r12 = r1.mo4904B(r2, r3, r4, r6)
            if (r12 != r0) goto L75
            goto L96
        L75:
            java.util.List r12 = (java.util.List) r12
            goto L99
        L78:
            r6 = r11
            com.friday.main.viewmodel.FolderMoveViewModel r12 = r6.f9545f
            com.friday.common.dao.FileDao r1 = com.friday.main.viewmodel.FolderMoveViewModel.m7199h(r12)
            r12 = r2
            java.lang.String r2 = r6.f9546g
            java.lang.String r3 = r6.f9547h
            com.friday.common.helper.b$a r4 = com.friday.common.helper.C5962b.f6082a
            com.friday.common.helper.b r4 = r4.m5299a()
            long r4 = r4.m5292t()
            r6.f9542c = r12
            java.lang.Object r12 = r1.mo4943t(r2, r3, r4, r6)
            if (r12 != r0) goto L97
        L96:
            return r0
        L97:
            java.util.List r12 = (java.util.List) r12
        L99:
            com.friday.main.viewmodel.FolderMoveViewModel r0 = r6.f9545f
            vd.l r0 = com.friday.main.viewmodel.FolderMoveViewModel.m7202k(r0)
            r0.setValue(r12)
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$getFilesExceptItself$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1.smali:163
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$getFilesExceptItself$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
