package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.RecycleBinViewModel$resDelete$2", m26211f = "RecycleBinViewModel.kt", m26212l = {64, 68, PatchStatus.CODE_LOAD_JIT_CLEAR}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinViewModel$resDelete$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8173c;

    /* renamed from: d */
    public final /* synthetic */ RecycleBinViewModel f8174d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f8175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinViewModel$resDelete$2(RecycleBinViewModel recycleBinViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8174d = recycleBinViewModel;
        this.f8175e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinViewModel$resDelete$2(this.f8174d, this.f8175e, interfaceC11588c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r12.equals("12") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r12.equals("1") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        r4 = r11.f8174d.m6237U();
        r5 = r11.f8175e.getFileId();
        r11.f8173c = 2;
        r12 = com.friday.common.dao.ResourceDao.m5075Q(r4, r5, 0, r11, 2, null);
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r12 != r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        if (com.friday.common.dao.ResourceDao.m5076U(r3, r4, 0, r7, 2, null) != r0) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.RecycleBinViewModel$resDelete$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/RecycleBinViewModel$resDelete$2.smali:130
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinViewModel$resDelete$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
