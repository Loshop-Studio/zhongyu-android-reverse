package com.friday.common.helper;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.helper.OssUploadHelper", m26211f = "OssUploadHelper.kt", m26212l = {Opcodes.IF_ICMPNE}, m26213m = "ossUpload")
/* loaded from: classes3.dex */
public final class OssUploadHelper$ossUpload$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6057c;

    /* renamed from: d */
    public Object f6058d;

    /* renamed from: e */
    public Object f6059e;

    /* renamed from: f */
    public Object f6060f;

    /* renamed from: g */
    public Object f6061g;

    /* renamed from: h */
    public Object f6062h;

    /* renamed from: i */
    public Object f6063i;

    /* renamed from: j */
    public /* synthetic */ Object f6064j;

    /* renamed from: k */
    public final /* synthetic */ OssUploadHelper f6065k;

    /* renamed from: l */
    public int f6066l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssUploadHelper$ossUpload$1(OssUploadHelper ossUploadHelper, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6065k = ossUploadHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6064j = obj;
        this.f6066l |= Integer.MIN_VALUE;
        return this.f6065k.m5251d(null, null, this);
    }
}
