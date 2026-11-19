package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 0, 0, 0}, m13598l = {527}, m13599m = "startCommitSelfCorrectQuestion", m13600n = {"answerUploadDataList", "commitSelfCorrectReqList", "userId", "taskId", "taskState", "questionId"}, m13601s = {"L$0", "L$1", "J$0", "J$1", "I$0", "J$2"})
/* loaded from: classes4.dex */
public final class OssTaskManger$startCommitSelfCorrectQuestion$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10378a;

    /* renamed from: b */
    public long f10379b;

    /* renamed from: c */
    public long f10380c;

    /* renamed from: d */
    public int f10381d;

    /* renamed from: e */
    public Object f10382e;

    /* renamed from: f */
    public Object f10383f;

    /* renamed from: g */
    public /* synthetic */ Object f10384g;

    /* renamed from: h */
    public final /* synthetic */ OssTaskManger f10385h;

    /* renamed from: i */
    public int f10386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$startCommitSelfCorrectQuestion$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10385h = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10384g = obj;
        this.f10386i |= Integer.MIN_VALUE;
        return this.f10385h.m10487s(0L, 0L, 0, 0L, null, null, this);
    }
}
