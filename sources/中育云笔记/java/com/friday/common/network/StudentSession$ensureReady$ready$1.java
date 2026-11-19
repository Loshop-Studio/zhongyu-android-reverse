package com.friday.common.network;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$ensureReady$ready$1", m26211f = "StudentSession.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED, 68, 69}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentSession$ensureReady$ready$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6130c;

    /* renamed from: d */
    public Object f6131d;

    /* renamed from: e */
    public Object f6132e;

    /* renamed from: f */
    public Object f6133f;

    /* renamed from: g */
    public int f6134g;

    /* renamed from: h */
    public int f6135h;

    /* renamed from: i */
    public int f6136i;

    /* renamed from: j */
    public final /* synthetic */ StudentSession f6137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentSession$ensureReady$ready$1(StudentSession studentSession, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6137j = studentSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentSession$ensureReady$ready$1(this.f6137j, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #1 {all -> 0x00fa, blocks: (B:31:0x00b0, B:33:0x00b8), top: B:51:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd A[Catch: all -> 0x002e, TryCatch #2 {all -> 0x002e, blocks: (B:8:0x0025, B:37:0x00d5, B:39:0x00dd, B:44:0x0100), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.network.StudentSession$ensureReady$ready$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/network/StudentSession$ensureReady$ready$1.smali:132
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentSession$ensureReady$ready$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
