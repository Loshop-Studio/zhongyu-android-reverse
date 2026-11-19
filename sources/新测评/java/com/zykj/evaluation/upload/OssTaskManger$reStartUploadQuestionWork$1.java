package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {378, 386}, m13599m = "reStartUploadQuestionWork", m13600n = {"userId", "taskId", "taskState", "$this$forEach$iv", "element$iv", "it", "userId", "taskId", "taskState", "$i$f$forEach", "$i$a$-forEach-OssTaskManger$reStartUploadQuestionWork$2"}, m13601s = {"J$0", "J$1", "I$0", "L$0", "L$2", "L$3", "J$0", "J$1", "I$0", "I$1", "I$2"})
/* loaded from: classes4.dex */
public final class OssTaskManger$reStartUploadQuestionWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10341a;

    /* renamed from: b */
    public long f10342b;

    /* renamed from: c */
    public int f10343c;

    /* renamed from: d */
    public int f10344d;

    /* renamed from: e */
    public int f10345e;

    /* renamed from: f */
    public Object f10346f;

    /* renamed from: g */
    public Object f10347g;

    /* renamed from: h */
    public Object f10348h;

    /* renamed from: i */
    public Object f10349i;

    /* renamed from: j */
    public /* synthetic */ Object f10350j;

    /* renamed from: k */
    public final /* synthetic */ OssTaskManger f10351k;

    /* renamed from: l */
    public int f10352l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$reStartUploadQuestionWork$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10351k = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10350j = obj;
        this.f10352l |= Integer.MIN_VALUE;
        return this.f10351k.m10483o(0L, 0L, 0, this);
    }
}
