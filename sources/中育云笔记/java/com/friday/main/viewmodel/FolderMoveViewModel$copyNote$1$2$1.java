package com.friday.main.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1$2$1", m26211f = "FolderMoveViewModel.kt", m26212l = {395, 400}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$copyNote$1$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: A */
    public final /* synthetic */ List f9498A;

    /* renamed from: c */
    public Object f9499c;

    /* renamed from: d */
    public Object f9500d;

    /* renamed from: e */
    public Object f9501e;

    /* renamed from: f */
    public Object f9502f;

    /* renamed from: g */
    public Object f9503g;

    /* renamed from: h */
    public Object f9504h;

    /* renamed from: i */
    public Object f9505i;

    /* renamed from: j */
    public Object f9506j;

    /* renamed from: k */
    public Object f9507k;

    /* renamed from: l */
    public Object f9508l;

    /* renamed from: m */
    public Object f9509m;

    /* renamed from: n */
    public Object f9510n;

    /* renamed from: o */
    public Object f9511o;

    /* renamed from: p */
    public Object f9512p;

    /* renamed from: q */
    public Object f9513q;

    /* renamed from: r */
    public int f9514r;

    /* renamed from: s */
    public int f9515s;

    /* renamed from: t */
    public int f9516t;

    /* renamed from: u */
    public int f9517u;

    /* renamed from: v */
    public int f9518v;

    /* renamed from: w */
    public int f9519w;

    /* renamed from: x */
    public final /* synthetic */ String f9520x;

    /* renamed from: y */
    public final /* synthetic */ String f9521y;

    /* renamed from: z */
    public final /* synthetic */ FolderMoveViewModel f9522z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$copyNote$1$2$1(String str, String str2, FolderMoveViewModel folderMoveViewModel, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9520x = str;
        this.f9521y = str2;
        this.f9522z = folderMoveViewModel;
        this.f9498A = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$copyNote$1$2$1(this.f9520x, this.f9521y, this.f9522z, this.f9498A, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x04cd, code lost:
    
        r15 = r29;
        r14 = r30;
        r29 = r27;
        p409xc.AbstractC11826a.m26206a(com.blankj.utilcode.util.FileUtils.delete(r10));
        r3 = r19;
        r10 = r23;
        r19 = r6;
        r6 = r2;
        r2 = r32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04fe  */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0315 -> B:60:0x0339). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x048d -> B:82:0x04a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x04ef -> B:86:0x04ec). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1$2$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1.smali:193
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$copyNote$1$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
