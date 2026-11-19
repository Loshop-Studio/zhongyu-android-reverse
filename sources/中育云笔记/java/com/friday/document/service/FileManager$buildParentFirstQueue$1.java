package com.friday.document.service;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {Opcodes.PUTFIELD}, m26213m = "buildParentFirstQueue")
/* loaded from: classes3.dex */
public final class FileManager$buildParentFirstQueue$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6745c;

    /* renamed from: d */
    public Object f6746d;

    /* renamed from: e */
    public Object f6747e;

    /* renamed from: f */
    public Object f6748f;

    /* renamed from: g */
    public Object f6749g;

    /* renamed from: h */
    public Object f6750h;

    /* renamed from: i */
    public Object f6751i;

    /* renamed from: j */
    public int f6752j;

    /* renamed from: k */
    public int f6753k;

    /* renamed from: l */
    public int f6754l;

    /* renamed from: m */
    public /* synthetic */ Object f6755m;

    /* renamed from: n */
    public final /* synthetic */ FileManager f6756n;

    /* renamed from: o */
    public int f6757o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$buildParentFirstQueue$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6756n = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6755m = obj;
        this.f6757o |= Integer.MIN_VALUE;
        return this.f6756n.m5614s(null, this);
    }
}
