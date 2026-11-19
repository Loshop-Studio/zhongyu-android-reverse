package com.friday.common.dao;

import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao_Impl$insertFileList$2", m26211f = "FileDao_Impl.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileDao_Impl$insertFileList$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5820c;

    /* renamed from: d */
    public final /* synthetic */ FileDao_Impl f5821d;

    /* renamed from: e */
    public final /* synthetic */ List f5822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao_Impl$insertFileList$2(FileDao_Impl fileDao_Impl, List list, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5821d = fileDao_Impl;
        this.f5822e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new FileDao_Impl$insertFileList$2(this.f5821d, this.f5822e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5820c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileDao_Impl fileDao_Impl = this.f5821d;
            List list = this.f5822e;
            this.f5820c = 1;
            if (super/*com.friday.common.dao.FileDao*/.mo4915N(list, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((FileDao_Impl$insertFileList$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
