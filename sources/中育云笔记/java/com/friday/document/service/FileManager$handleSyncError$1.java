package com.friday.document.service;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {129, 130, PatchStatus.CODE_LOAD_LIB_UNZIP, PatchStatus.CODE_LOAD_LIB_NS}, m26213m = "handleSyncError")
/* loaded from: classes3.dex */
public final class FileManager$handleSyncError$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6815c;

    /* renamed from: d */
    public Object f6816d;

    /* renamed from: e */
    public int f6817e;

    /* renamed from: f */
    public /* synthetic */ Object f6818f;

    /* renamed from: g */
    public final /* synthetic */ FileManager f6819g;

    /* renamed from: h */
    public int f6820h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$handleSyncError$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6819g = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6818f = obj;
        this.f6820h |= Integer.MIN_VALUE;
        return this.f6819g.m5620y(null, null, this);
    }
}
