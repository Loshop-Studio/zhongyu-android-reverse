package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {148, 156}, m13599m = "reStartUploadAnswerWork", m13600n = {"userId", "taskId", "taskState", "$this$forEach$iv", "element$iv", "it", "userId", "taskId", "taskState", "$i$f$forEach", "$i$a$-forEach-OssTaskManger$reStartUploadAnswerWork$2"}, m13601s = {"J$0", "J$1", "I$0", "L$0", "L$2", "L$3", "J$0", "J$1", "I$0", "I$1", "I$2"})
/* loaded from: classes4.dex */
public final class OssTaskManger$reStartUploadAnswerWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10329a;

    /* renamed from: b */
    public long f10330b;

    /* renamed from: c */
    public int f10331c;

    /* renamed from: d */
    public int f10332d;

    /* renamed from: e */
    public int f10333e;

    /* renamed from: f */
    public Object f10334f;

    /* renamed from: g */
    public Object f10335g;

    /* renamed from: h */
    public Object f10336h;

    /* renamed from: i */
    public Object f10337i;

    /* renamed from: j */
    public /* synthetic */ Object f10338j;

    /* renamed from: k */
    public final /* synthetic */ OssTaskManger f10339k;

    /* renamed from: l */
    public int f10340l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$reStartUploadAnswerWork$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10339k = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10338j = obj;
        this.f10340l |= Integer.MIN_VALUE;
        return this.f10339k.m10482n(0L, 0L, 0, this);
    }
}
