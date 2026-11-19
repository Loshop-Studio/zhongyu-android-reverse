package com.zykj.evaluation.p057ui.guide.normal.toDo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.toDo.TodoGuideViewModel", m13596f = "TodoGuideViewModel.kt", m13597i = {}, m13598l = {42}, m13599m = "getTaskInfo", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class TodoGuideViewModel$getTaskInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f9699a;

    /* renamed from: b */
    public final /* synthetic */ TodoGuideViewModel f9700b;

    /* renamed from: c */
    public int f9701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoGuideViewModel$getTaskInfo$1(TodoGuideViewModel todoGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9700b = todoGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9699a = obj;
        this.f9701c |= Integer.MIN_VALUE;
        return this.f9700b.mo9863S(this);
    }
}
