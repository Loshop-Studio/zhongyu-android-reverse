package com.zykj.evaluation.p057ui.detail.todo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel", m13596f = "TodoDetailViewModel.kt", m13597i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4}, m13598l = {406, 417, 428, 477, 533}, m13599m = "commitAnswer", m13600n = {"draftFunctions", "draftFunctions", "questionUpload", "draftUploadData", "draftFunctions", "questionUpload", "draftUploadData", "it", "$i$a$-let-TodoDetailViewModel$commitAnswer$3", "draftFunctions", "questionUpload", "draftUploadData", "uploadQuestion", "requestList", "hasSyncedAnswer", "isUntouchedSyncedPage", "$i$a$-let-TodoDetailViewModel$commitAnswer$5", "draftFunctions", "questionUpload", "draftUploadData", "answerMap", "localAnswerUploadDataList", "answerUploadDataList", "requestList", "hasSyncedAnswer", "isUntouchedSyncedPage"}, m13601s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes4.dex */
public final class TodoDetailViewModel$commitAnswer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f9510a;

    /* renamed from: b */
    public Object f9511b;

    /* renamed from: c */
    public Object f9512c;

    /* renamed from: d */
    public Object f9513d;

    /* renamed from: e */
    public Object f9514e;

    /* renamed from: f */
    public Object f9515f;

    /* renamed from: g */
    public Object f9516g;

    /* renamed from: h */
    public int f9517h;

    /* renamed from: i */
    public int f9518i;

    /* renamed from: j */
    public int f9519j;

    /* renamed from: k */
    public /* synthetic */ Object f9520k;

    /* renamed from: l */
    public final /* synthetic */ TodoDetailViewModel f9521l;

    /* renamed from: m */
    public int f9522m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoDetailViewModel$commitAnswer$1(TodoDetailViewModel todoDetailViewModel, Continuation continuation) {
        super(continuation);
        this.f9521l = todoDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9520k = obj;
        this.f9522m |= Integer.MIN_VALUE;
        return this.f9521l.m9742J0(null, this);
    }
}
