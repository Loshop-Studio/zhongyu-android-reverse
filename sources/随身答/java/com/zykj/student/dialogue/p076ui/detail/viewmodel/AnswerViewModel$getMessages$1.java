package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel", m13451f = "AnswerViewModel.kt", m13452i = {0, 0, 1, 1, 1}, m13453l = {215, 220}, m13454m = "getMessages", m13455n = {"selectLast", "$i$a$-runCatching-AnswerViewModel$getMessages$2", "baseResponse", "selectLast", "$i$a$-onSuccess-AnswerViewModel$getMessages$3"}, m13456s = {"Z$0", "I$0", "L$1", "Z$0", "I$0"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$getMessages$1 extends ContinuationImpl {

    /* renamed from: a */
    public boolean f11164a;

    /* renamed from: b */
    public int f11165b;

    /* renamed from: c */
    public Object f11166c;

    /* renamed from: d */
    public Object f11167d;

    /* renamed from: e */
    public /* synthetic */ Object f11168e;

    /* renamed from: f */
    public final /* synthetic */ AnswerViewModel f11169f;

    /* renamed from: g */
    public int f11170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$getMessages$1(AnswerViewModel answerViewModel, Continuation continuation) {
        super(continuation);
        this.f11169f = answerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11168e = obj;
        this.f11170g |= Integer.MIN_VALUE;
        return this.f11169f.m10462D(false, this);
    }
}
