package com.friday.common.dao;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.FileDao_Impl$getAllParentIdById$2", m26211f = "FileDao_Impl.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileDao_Impl$getAllParentIdById$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5812c;

    /* renamed from: d */
    public final /* synthetic */ FileDao_Impl f5813d;

    /* renamed from: e */
    public final /* synthetic */ String f5814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao_Impl$getAllParentIdById$2(FileDao_Impl fileDao_Impl, String str, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5813d = fileDao_Impl;
        this.f5814e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new FileDao_Impl$getAllParentIdById$2(this.f5813d, this.f5814e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5812c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        FileDao_Impl fileDao_Impl = this.f5813d;
        String str = this.f5814e;
        this.f5812c = 1;
        Object objMo4907E = super/*com.friday.common.dao.FileDao*/.mo4907E(str, this);
        return objMo4907E == objM25952f ? objM25952f : objMo4907E;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((FileDao_Impl$getAllParentIdById$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
