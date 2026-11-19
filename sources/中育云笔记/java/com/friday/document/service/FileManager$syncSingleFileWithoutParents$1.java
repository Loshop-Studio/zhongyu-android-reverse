package com.friday.document.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {257, 259}, m26213m = "syncSingleFileWithoutParents")
/* loaded from: classes3.dex */
public final class FileManager$syncSingleFileWithoutParents$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6881c;

    /* renamed from: d */
    public Object f6882d;

    /* renamed from: e */
    public /* synthetic */ Object f6883e;

    /* renamed from: f */
    public final /* synthetic */ FileManager f6884f;

    /* renamed from: g */
    public int f6885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$syncSingleFileWithoutParents$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6884f = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6883e = obj;
        this.f6885g |= Integer.MIN_VALUE;
        return this.f6884f.m5603H(null, this);
    }
}
