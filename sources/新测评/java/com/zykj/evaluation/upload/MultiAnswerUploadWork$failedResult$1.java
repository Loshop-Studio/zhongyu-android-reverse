package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.MultiAnswerUploadWork", m13596f = "MultiAnswerUploadWork.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {178}, m13599m = "failedResult", m13600n = {"key", "$this$forEach$iv", "element$iv", "it", "pair", "uuid", "filePath", "$i$f$forEach", "$i$a$-forEach-MultiAnswerUploadWork$failedResult$2"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$3"})
/* loaded from: classes4.dex */
public final class MultiAnswerUploadWork$failedResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10295a;

    /* renamed from: b */
    public Object f10296b;

    /* renamed from: c */
    public Object f10297c;

    /* renamed from: d */
    public Object f10298d;

    /* renamed from: e */
    public Object f10299e;

    /* renamed from: f */
    public Object f10300f;

    /* renamed from: g */
    public Object f10301g;

    /* renamed from: h */
    public int f10302h;

    /* renamed from: i */
    public int f10303i;

    /* renamed from: j */
    public int f10304j;

    /* renamed from: k */
    public int f10305k;

    /* renamed from: l */
    public /* synthetic */ Object f10306l;

    /* renamed from: m */
    public final /* synthetic */ MultiAnswerUploadWork f10307m;

    /* renamed from: n */
    public int f10308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnswerUploadWork$failedResult$1(MultiAnswerUploadWork multiAnswerUploadWork, Continuation continuation) {
        super(continuation);
        this.f10307m = multiAnswerUploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10306l = obj;
        this.f10308n |= Integer.MIN_VALUE;
        return this.f10307m.m10463c(null, this);
    }
}
