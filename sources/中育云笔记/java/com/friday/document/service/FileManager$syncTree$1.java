package com.friday.document.service;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGE, Opcodes.IF_ACMPEQ}, m26213m = "syncTree")
/* loaded from: classes3.dex */
public final class FileManager$syncTree$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6886c;

    /* renamed from: d */
    public Object f6887d;

    /* renamed from: e */
    public Object f6888e;

    /* renamed from: f */
    public Object f6889f;

    /* renamed from: g */
    public long f6890g;

    /* renamed from: h */
    public /* synthetic */ Object f6891h;

    /* renamed from: i */
    public final /* synthetic */ FileManager f6892i;

    /* renamed from: j */
    public int f6893j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$syncTree$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6892i = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6891h = obj;
        this.f6893j |= Integer.MIN_VALUE;
        return this.f6892i.m5604I(null, 0L, this);
    }
}
