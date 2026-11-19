package com.zykj.evaluation.p057ui.guide.normal.toDo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.toDo.TodoGuideViewModel", m13596f = "TodoGuideViewModel.kt", m13597i = {0}, m13598l = {51}, m13599m = "updateGuideView", m13600n = {"guideTaskInfo"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class TodoGuideViewModel$updateGuideView$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f9702a;

    /* renamed from: b */
    public /* synthetic */ Object f9703b;

    /* renamed from: c */
    public final /* synthetic */ TodoGuideViewModel f9704c;

    /* renamed from: d */
    public int f9705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoGuideViewModel$updateGuideView$1(TodoGuideViewModel todoGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9704c = todoGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9703b = obj;
        this.f9705d |= Integer.MIN_VALUE;
        return this.f9704c.mo9869Y(null, this);
    }
}
