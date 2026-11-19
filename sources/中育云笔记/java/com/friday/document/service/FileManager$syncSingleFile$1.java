package com.friday.document.service;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {145, Opcodes.LCMP, 150, Opcodes.DCMPL, Opcodes.IFNE}, m26213m = "syncSingleFile")
/* loaded from: classes3.dex */
public final class FileManager$syncSingleFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6875c;

    /* renamed from: d */
    public Object f6876d;

    /* renamed from: e */
    public Object f6877e;

    /* renamed from: f */
    public /* synthetic */ Object f6878f;

    /* renamed from: g */
    public final /* synthetic */ FileManager f6879g;

    /* renamed from: h */
    public int f6880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$syncSingleFile$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6879g = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6878f = obj;
        this.f6880h |= Integer.MIN_VALUE;
        return this.f6879g.m5602G(null, this);
    }
}
