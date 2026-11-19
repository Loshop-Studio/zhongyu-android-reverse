package com.zykj.cloudhelper.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.entity.NoteBean;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1", m26211f = "PickNoteViewModel.kt", m26212l = {125, PatchStatus.CODE_LOAD_LIB_NS, Opcodes.IFLE, Opcodes.IF_ICMPGT, 191, 214, 224}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PickNoteViewModel$insertNewFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f19555c;

    /* renamed from: d */
    public Object f19556d;

    /* renamed from: e */
    public Object f19557e;

    /* renamed from: f */
    public Object f19558f;

    /* renamed from: g */
    public Object f19559g;

    /* renamed from: h */
    public Object f19560h;

    /* renamed from: i */
    public Object f19561i;

    /* renamed from: j */
    public Object f19562j;

    /* renamed from: k */
    public Object f19563k;

    /* renamed from: l */
    public Object f19564l;

    /* renamed from: m */
    public Object f19565m;

    /* renamed from: n */
    public Object f19566n;

    /* renamed from: o */
    public Object f19567o;

    /* renamed from: p */
    public long f19568p;

    /* renamed from: q */
    public int f19569q;

    /* renamed from: r */
    public int f19570r;

    /* renamed from: s */
    public /* synthetic */ Object f19571s;

    /* renamed from: t */
    public final /* synthetic */ PickNoteViewModel f19572t;

    /* renamed from: u */
    public final /* synthetic */ NoteBean f19573u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickNoteViewModel$insertNewFile$1(PickNoteViewModel pickNoteViewModel, NoteBean noteBean, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19572t = pickNoteViewModel;
        this.f19573u = noteBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        PickNoteViewModel$insertNewFile$1 pickNoteViewModel$insertNewFile$1 = new PickNoteViewModel$insertNewFile$1(this.f19572t, this.f19573u, interfaceC11588c);
        pickNoteViewModel$insertNewFile$1.f19571s = obj;
        return pickNoteViewModel$insertNewFile$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x05a2, code lost:
    
        if (r0.mo4910I(r2, r48) == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024c A[Catch: all -> 0x01b7, TryCatch #0 {all -> 0x01b7, blocks: (B:13:0x01b0, B:26:0x0244, B:28:0x024c, B:30:0x0252), top: B:79:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1.smali:170
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((PickNoteViewModel$insertNewFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
