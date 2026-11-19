package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadUtils", m13596f = "UploadUtils.kt", m13597i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m13598l = {31, 34, 37}, m13599m = "uploadFile", m13600n = {"localPath", "uploadPath", "credential", "localPath", "uploadPath", "credential", "localPath", "uploadPath", "credential"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class UploadUtils$uploadFile$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10487a;

    /* renamed from: b */
    public Object f10488b;

    /* renamed from: c */
    public Object f10489c;

    /* renamed from: d */
    public /* synthetic */ Object f10490d;

    /* renamed from: e */
    public final /* synthetic */ UploadUtils f10491e;

    /* renamed from: f */
    public int f10492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$uploadFile$1(UploadUtils uploadUtils, Continuation continuation) {
        super(continuation);
        this.f10491e = uploadUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10490d = obj;
        this.f10492f |= Integer.MIN_VALUE;
        return this.f10491e.m10509c(null, null, null, this);
    }
}
