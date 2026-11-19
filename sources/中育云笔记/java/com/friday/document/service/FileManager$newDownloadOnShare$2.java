package com.friday.document.service;

import com.friday.document.model.ShareFile;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$newDownloadOnShare$2", m26211f = "FileManager.kt", m26212l = {519, 523, 524}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$newDownloadOnShare$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6830c;

    /* renamed from: d */
    public Object f6831d;

    /* renamed from: e */
    public Object f6832e;

    /* renamed from: f */
    public Object f6833f;

    /* renamed from: g */
    public Object f6834g;

    /* renamed from: h */
    public Object f6835h;

    /* renamed from: i */
    public Object f6836i;

    /* renamed from: j */
    public Object f6837j;

    /* renamed from: k */
    public int f6838k;

    /* renamed from: l */
    public int f6839l;

    /* renamed from: m */
    public long f6840m;

    /* renamed from: n */
    public int f6841n;

    /* renamed from: o */
    public final /* synthetic */ FileManager f6842o;

    /* renamed from: p */
    public final /* synthetic */ List f6843p;

    /* renamed from: q */
    public final /* synthetic */ ShareFile f6844q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$newDownloadOnShare$2(FileManager fileManager, List list, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6842o = fileManager;
        this.f6843p = list;
        this.f6844q = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$newDownloadOnShare$2(this.f6842o, this.f6843p, this.f6844q, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0185, code lost:
    
        if (r4.mo2811g(r6, r22) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:22:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0106 -> B:21:0x010c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$newDownloadOnShare$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$newDownloadOnShare$2.smali:162
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$newDownloadOnShare$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
