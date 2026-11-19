package com.friday.document.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {591, 291}, m26213m = "waitForSyncInterval")
/* loaded from: classes3.dex */
public final class FileManager$waitForSyncInterval$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6900c;

    /* renamed from: d */
    public int f6901d;

    /* renamed from: e */
    public int f6902e;

    /* renamed from: f */
    public long f6903f;

    /* renamed from: g */
    public long f6904g;

    /* renamed from: h */
    public /* synthetic */ Object f6905h;

    /* renamed from: i */
    public final /* synthetic */ FileManager f6906i;

    /* renamed from: j */
    public int f6907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$waitForSyncInterval$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6906i = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6905h = obj;
        this.f6907j |= Integer.MIN_VALUE;
        return this.f6906i.m5607L(this);
    }
}
