package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 0}, m13598l = {287}, m13599m = "startUploadMultiAnswerWork", m13600n = {"uploadDataList", "userId", "taskId", "taskState"}, m13601s = {"L$0", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class OssTaskManger$startUploadMultiAnswerWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10394a;

    /* renamed from: b */
    public long f10395b;

    /* renamed from: c */
    public int f10396c;

    /* renamed from: d */
    public Object f10397d;

    /* renamed from: e */
    public /* synthetic */ Object f10398e;

    /* renamed from: f */
    public final /* synthetic */ OssTaskManger f10399f;

    /* renamed from: g */
    public int f10400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$startUploadMultiAnswerWork$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10399f = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10398e = obj;
        this.f10400g |= Integer.MIN_VALUE;
        return this.f10399f.m10490w(0L, 0L, 0, null, this);
    }
}
