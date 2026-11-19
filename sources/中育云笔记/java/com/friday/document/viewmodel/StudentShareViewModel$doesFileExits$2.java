package com.friday.document.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.friday.document.model.ShareFile;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$doesFileExits$2", m26211f = "StudentShareViewModel.kt", m26212l = {415, TypedValues.CycleType.TYPE_WAVE_OFFSET, 428, 429}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$doesFileExits$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8354c;

    /* renamed from: d */
    public Object f8355d;

    /* renamed from: e */
    public int f8356e;

    /* renamed from: f */
    public final /* synthetic */ StudentShareViewModel f8357f;

    /* renamed from: g */
    public final /* synthetic */ ShareFile f8358g;

    /* renamed from: h */
    public final /* synthetic */ boolean f8359h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$doesFileExits$2(StudentShareViewModel studentShareViewModel, ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8357f = studentShareViewModel;
        this.f8358g = shareFile;
        this.f8359h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentShareViewModel$doesFileExits$2(this.f8357f, this.f8358g, this.f8359h, interfaceC11588c);
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
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.StudentShareViewModel$doesFileExits$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2.smali:145
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentShareViewModel$doesFileExits$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
