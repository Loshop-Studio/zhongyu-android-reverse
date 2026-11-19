package com.friday.document.service;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.friday.common.entity.NoteResource;
import com.friday.document.model.ShareFile;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadFileOnShare$2", m26211f = "FileManager.kt", m26212l = {426, 445}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadFileOnShare$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6770c;

    /* renamed from: d */
    public Object f6771d;

    /* renamed from: e */
    public Object f6772e;

    /* renamed from: f */
    public Object f6773f;

    /* renamed from: g */
    public Object f6774g;

    /* renamed from: h */
    public Object f6775h;

    /* renamed from: i */
    public Object f6776i;

    /* renamed from: j */
    public Object f6777j;

    /* renamed from: k */
    public Object f6778k;

    /* renamed from: l */
    public Object f6779l;

    /* renamed from: m */
    public Object f6780m;

    /* renamed from: n */
    public Object f6781n;

    /* renamed from: o */
    public Object f6782o;

    /* renamed from: p */
    public Object f6783p;

    /* renamed from: q */
    public int f6784q;

    /* renamed from: r */
    public int f6785r;

    /* renamed from: s */
    public int f6786s;

    /* renamed from: t */
    public int f6787t;

    /* renamed from: u */
    public int f6788u;

    /* renamed from: v */
    public final /* synthetic */ ShareFile f6789v;

    /* renamed from: w */
    public final /* synthetic */ FileManager f6790w;

    /* renamed from: com.friday.document.service.FileManager$downloadFileOnShare$2$a */
    public static final class C5994a extends TypeToken<ArrayList<NoteResource>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadFileOnShare$2(ShareFile shareFile, FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6789v = shareFile;
        this.f6790w = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadFileOnShare$2(this.f6789v, this.f6790w, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x02b9, code lost:
    
        if (r6.mo2811g(r16, r34) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0239  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x021d -> B:27:0x0223). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0228 -> B:29:0x0234). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$downloadFileOnShare$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$downloadFileOnShare$2.smali:167
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$downloadFileOnShare$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
