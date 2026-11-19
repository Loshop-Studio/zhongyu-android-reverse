package com.zykj.evaluation.upload;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {493, TypedValues.PositionType.TYPE_DRAWPATH}, m13599m = "reStartUploadSelfCorrectQuestionWork", m13600n = {"userId", "taskId", "taskState", "$this$forEach$iv", "element$iv", "it", "userId", "taskId", "taskState", "$i$f$forEach", "$i$a$-forEach-OssTaskManger$reStartUploadSelfCorrectQuestionWork$2"}, m13601s = {"J$0", "J$1", "I$0", "L$0", "L$2", "L$3", "J$0", "J$1", "I$0", "I$1", "I$2"})
/* loaded from: classes4.dex */
public final class OssTaskManger$reStartUploadSelfCorrectQuestionWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10353a;

    /* renamed from: b */
    public long f10354b;

    /* renamed from: c */
    public int f10355c;

    /* renamed from: d */
    public int f10356d;

    /* renamed from: e */
    public int f10357e;

    /* renamed from: f */
    public Object f10358f;

    /* renamed from: g */
    public Object f10359g;

    /* renamed from: h */
    public Object f10360h;

    /* renamed from: i */
    public Object f10361i;

    /* renamed from: j */
    public /* synthetic */ Object f10362j;

    /* renamed from: k */
    public final /* synthetic */ OssTaskManger f10363k;

    /* renamed from: l */
    public int f10364l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$reStartUploadSelfCorrectQuestionWork$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10363k = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10362j = obj;
        this.f10364l |= Integer.MIN_VALUE;
        return this.f10363k.m10484p(0L, 0L, 0, this);
    }
}
