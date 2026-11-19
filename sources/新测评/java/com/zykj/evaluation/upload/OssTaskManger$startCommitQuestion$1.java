package com.zykj.evaluation.upload;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {TypedValues.CycleType.TYPE_PATH_ROTATE, 450}, m13599m = "startCommitQuestion", m13600n = {"draftUploadData", "answerUploadDataList", "commitReqList", "userId", "taskId", "taskState", "questionId", "isTodo", "isGroup", "draftUploadData", "answerUploadDataList", "commitReqList", "oldUploadQuestion", "userId", "taskId", "taskState", "questionId", "isTodo", "isGroup"}, m13601s = {"L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "J$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "I$0", "J$2", "Z$0", "Z$1"})
/* loaded from: classes4.dex */
public final class OssTaskManger$startCommitQuestion$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f10365a;

    /* renamed from: b */
    public long f10366b;

    /* renamed from: c */
    public long f10367c;

    /* renamed from: d */
    public int f10368d;

    /* renamed from: e */
    public Object f10369e;

    /* renamed from: f */
    public Object f10370f;

    /* renamed from: g */
    public Object f10371g;

    /* renamed from: h */
    public Object f10372h;

    /* renamed from: i */
    public boolean f10373i;

    /* renamed from: j */
    public boolean f10374j;

    /* renamed from: k */
    public /* synthetic */ Object f10375k;

    /* renamed from: l */
    public final /* synthetic */ OssTaskManger f10376l;

    /* renamed from: m */
    public int f10377m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$startCommitQuestion$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10376l = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10375k = obj;
        this.f10377m |= Integer.MIN_VALUE;
        return this.f10376l.m10486r(0L, 0L, 0, 0L, null, null, false, false, null, this);
    }
}
