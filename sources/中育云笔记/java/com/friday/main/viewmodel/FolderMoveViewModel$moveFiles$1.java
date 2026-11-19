package com.friday.main.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$moveFiles$1", m26211f = "FolderMoveViewModel.kt", m26212l = {150, Opcodes.IFEQ, Opcodes.IF_ICMPEQ, Opcodes.IF_ICMPNE, Opcodes.IF_ICMPGE}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$moveFiles$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9560c;

    /* renamed from: d */
    public Object f9561d;

    /* renamed from: e */
    public Object f9562e;

    /* renamed from: f */
    public int f9563f;

    /* renamed from: g */
    public final /* synthetic */ FolderMoveViewModel f9564g;

    /* renamed from: h */
    public final /* synthetic */ String f9565h;

    /* renamed from: i */
    public final /* synthetic */ List f9566i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$moveFiles$1(FolderMoveViewModel folderMoveViewModel, String str, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9564g = folderMoveViewModel;
        this.f9565h = str;
        this.f9566i = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$moveFiles$1(this.f9564g, this.f9565h, this.f9566i, interfaceC11588c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:61)|(1:(1:(1:(4:(1:(1:9)(2:10|11))(2:12|13)|14|57|58)(4:17|18|19|47))(5:20|21|22|43|(2:45|56)(2:46|47)))(2:23|24))(5:26|62|27|(1:29)|56)|25|30|(4:33|(3:65|35|68)(1:67)|66|31)|64|37|38|59|39|(2:41|56)(3:42|43|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        if (r14.emit(r6, r13) != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        if (r0.emit(r3, r13) == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$moveFiles$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1.smali:148
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$moveFiles$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
