package com.friday.main.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1", m26211f = "HomeViewModel.kt", m26212l = {146, Opcodes.FCMPL, Opcodes.IFNE, 157, Opcodes.IF_ICMPGE, Opcodes.IF_ACMPEQ}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeViewModel$getCameraPermission$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9641c;

    /* renamed from: d */
    public boolean f9642d;

    /* renamed from: e */
    public int f9643e;

    /* renamed from: f */
    public final /* synthetic */ HomeViewModel f9644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getCameraPermission$1(HomeViewModel homeViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9644f = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeViewModel$getCameraPermission$1(this.f9644f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (com.friday.common.dao.UserDao.m5204m(r4, r5, 0, r8, 2, null) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[Catch: Exception -> 0x00dc, PHI: r8 r12
      0x00b1: PHI (r8v6 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1) = 
      (r8v3 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v13 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
     binds: [B:40:0x00ae, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v10 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:40:0x00ae, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x00dc, blocks: (B:42:0x00b1, B:39:0x009f), top: B:58:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[Catch: Exception -> 0x001d, PHI: r8
      0x00e1: PHI (r8v7 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1) = 
      (r8v4 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v6 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v14 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
     binds: [B:47:0x00de, B:43:0x00d9, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:10:0x0021, B:51:0x00f3, B:48:0x00e1), top: B:57:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[Catch: Exception -> 0x001d, PHI: r8 r12
      0x00f3: PHI (r8v8 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1) = 
      (r8v7 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v15 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
     binds: [B:49:0x00f0, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r12v18 java.lang.Object) = (r12v17 java.lang.Object), (r12v0 java.lang.Object) binds: [B:49:0x00f0, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:10:0x0021, B:51:0x00f3, B:48:0x00e1), top: B:57:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[EXC_TOP_SPLITTER, PHI: r8
      0x009f: PHI (r8v3 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1) = 
      (r8v2 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v11 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
      (r8v12 com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1)
     binds: [B:38:0x009c, B:32:0x0092, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/HomeViewModel$getCameraPermission$1.smali:127
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeViewModel$getCameraPermission$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
