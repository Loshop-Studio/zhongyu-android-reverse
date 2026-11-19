package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel", m13451f = "NewAnswerViewModel.kt", m13452i = {0, 0}, m13453l = {172}, m13454m = "monitorPictures", m13455n = {"imageUrls", "$i$a$-runCatching-NewAnswerViewModel$monitorPictures$2"}, m13456s = {"L$0", "I$0"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$monitorPictures$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11224a;

    /* renamed from: b */
    public int f11225b;

    /* renamed from: c */
    public /* synthetic */ Object f11226c;

    /* renamed from: d */
    public final /* synthetic */ NewAnswerViewModel f11227d;

    /* renamed from: e */
    public int f11228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerViewModel$monitorPictures$1(NewAnswerViewModel newAnswerViewModel, Continuation continuation) {
        super(continuation);
        this.f11227d = newAnswerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11226c = obj;
        this.f11228e |= Integer.MIN_VALUE;
        return this.f11227d.m10494t(null, this);
    }
}
