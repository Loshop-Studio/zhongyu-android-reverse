package com.friday.document.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {239}, m26213m = "findParentChain")
/* loaded from: classes3.dex */
public final class FileManager$findParentChain$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6808c;

    /* renamed from: d */
    public Object f6809d;

    /* renamed from: e */
    public Object f6810e;

    /* renamed from: f */
    public Object f6811f;

    /* renamed from: g */
    public /* synthetic */ Object f6812g;

    /* renamed from: h */
    public final /* synthetic */ FileManager f6813h;

    /* renamed from: i */
    public int f6814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$findParentChain$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6813h = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6812g = obj;
        this.f6814i |= Integer.MIN_VALUE;
        return this.f6813h.m5618w(null, this);
    }
}
