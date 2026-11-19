package com.friday.document.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {324, 328}, m26213m = "downloadMicroClass")
/* loaded from: classes3.dex */
public final class FileManager$downloadMicroClass$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6791c;

    /* renamed from: d */
    public /* synthetic */ Object f6792d;

    /* renamed from: e */
    public final /* synthetic */ FileManager f6793e;

    /* renamed from: f */
    public int f6794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadMicroClass$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6793e = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6792d = obj;
        this.f6794f |= Integer.MIN_VALUE;
        return this.f6793e.mo5611d(null, this);
    }
}
