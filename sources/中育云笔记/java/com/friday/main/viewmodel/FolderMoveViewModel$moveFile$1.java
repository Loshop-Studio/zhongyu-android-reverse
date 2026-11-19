package com.friday.main.viewmodel;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$moveFile$1", m26211f = "FolderMoveViewModel.kt", m26212l = {128, 130, PatchStatus.CODE_LOAD_LIB_INJECT, PatchStatus.CODE_LOAD_LIB_NS, 138, 140}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$moveFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9549c;

    /* renamed from: d */
    public Object f9550d;

    /* renamed from: e */
    public Object f9551e;

    /* renamed from: f */
    public Object f9552f;

    /* renamed from: g */
    public Object f9553g;

    /* renamed from: h */
    public Object f9554h;

    /* renamed from: i */
    public int f9555i;

    /* renamed from: j */
    public int f9556j;

    /* renamed from: k */
    public final /* synthetic */ FolderMoveViewModel f9557k;

    /* renamed from: l */
    public final /* synthetic */ String f9558l;

    /* renamed from: m */
    public final /* synthetic */ String f9559m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$moveFile$1(FolderMoveViewModel folderMoveViewModel, String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9557k = folderMoveViewModel;
        this.f9558l = str;
        this.f9559m = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$moveFile$1(this.f9557k, this.f9558l, this.f9559m, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:
    
        if (r0.emit(r2, r13) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:28:0x00be, B:30:0x00c2, B:25:0x0097), top: B:61:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$moveFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$moveFile$1.smali:157
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$moveFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
