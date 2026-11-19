package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 0}, m13598l = {180}, m13599m = "startUploadAnswerWork", m13600n = {"uploadData", "userId", "taskId", "taskState"}, m13601s = {"L$0", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class OssTaskManger$startUploadAnswerWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10387a;

    /* renamed from: b */
    public long f10388b;

    /* renamed from: c */
    public int f10389c;

    /* renamed from: d */
    public Object f10390d;

    /* renamed from: e */
    public /* synthetic */ Object f10391e;

    /* renamed from: f */
    public final /* synthetic */ OssTaskManger f10392f;

    /* renamed from: g */
    public int f10393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$startUploadAnswerWork$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10392f = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10391e = obj;
        this.f10393g |= Integer.MIN_VALUE;
        return this.f10392f.m10488t(0L, 0L, 0, null, this);
    }
}
