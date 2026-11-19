package com.friday.document.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {268, 270, 277, 280}, m26213m = "syncWithRetry")
/* loaded from: classes3.dex */
public final class FileManager$syncWithRetry$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6894c;

    /* renamed from: d */
    public Object f6895d;

    /* renamed from: e */
    public int f6896e;

    /* renamed from: f */
    public /* synthetic */ Object f6897f;

    /* renamed from: g */
    public final /* synthetic */ FileManager f6898g;

    /* renamed from: h */
    public int f6899h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$syncWithRetry$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6898g = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6897f = obj;
        this.f6899h |= Integer.MIN_VALUE;
        return this.f6898g.m5605J(null, this);
    }
}
