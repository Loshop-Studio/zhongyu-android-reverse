package com.friday.document.service;

import com.alibaba.fastjson.asm.Opcodes;
import com.tendcloud.tenddata.C7843ab;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$runAsync$1", m26211f = "FileManager.kt", m26212l = {C7843ab.b.API_MYNA_START, C7843ab.b.API_MYNA_START, Opcodes.IADD, 103}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$runAsync$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6850c;

    /* renamed from: d */
    public Object f6851d;

    /* renamed from: e */
    public Object f6852e;

    /* renamed from: f */
    public Object f6853f;

    /* renamed from: g */
    public Object f6854g;

    /* renamed from: h */
    public Object f6855h;

    /* renamed from: i */
    public Object f6856i;

    /* renamed from: j */
    public int f6857j;

    /* renamed from: k */
    public int f6858k;

    /* renamed from: l */
    public int f6859l;

    /* renamed from: m */
    public int f6860m;

    /* renamed from: n */
    public /* synthetic */ Object f6861n;

    /* renamed from: o */
    public final /* synthetic */ FileManager f6862o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$runAsync$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6862o = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FileManager$runAsync$1 fileManager$runAsync$1 = new FileManager$runAsync$1(this.f6862o, interfaceC11588c);
        fileManager$runAsync$1.f6861n = obj;
        return fileManager$runAsync$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0153, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(1000, r17) != r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #0 {Exception -> 0x0056, blocks: (B:26:0x006c, B:28:0x0078, B:30:0x0080, B:33:0x009a, B:36:0x00aa, B:38:0x00b5, B:39:0x00c4, B:41:0x00ca, B:48:0x0114, B:16:0x0050, B:21:0x005d, B:43:0x00d9, B:46:0x010e, B:12:0x0048), top: B:57:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:26:0x006c, B:28:0x0078, B:30:0x0080, B:33:0x009a, B:36:0x00aa, B:38:0x00b5, B:39:0x00c4, B:41:0x00ca, B:48:0x0114, B:16:0x0050, B:21:0x005d, B:43:0x00d9, B:46:0x010e, B:12:0x0048), top: B:57:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:26:0x006c, B:28:0x0078, B:30:0x0080, B:33:0x009a, B:36:0x00aa, B:38:0x00b5, B:39:0x00c4, B:41:0x00ca, B:48:0x0114, B:16:0x0050, B:21:0x005d, B:43:0x00d9, B:46:0x010e, B:12:0x0048), top: B:57:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011d -> B:39:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0153 -> B:54:0x0156). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$runAsync$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$runAsync$1.smali:147
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$runAsync$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
