package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.core.Preferences;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p138i6.C8138d;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m13413d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/Preferences;", "userInfo", "Lcom/zykj/message/server/bean/UserInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$isNoRemind$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$isNoRemind$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,529:1\n1#2:530\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$isNoRemind$1 extends SuspendLambda implements Function3<Preferences, UserInfo, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f11174a;

    /* renamed from: b */
    public /* synthetic */ Object f11175b;

    /* renamed from: c */
    public /* synthetic */ Object f11176c;

    public AnswerViewModel$isNoRemind$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Preferences preferences, UserInfo userInfo, Continuation continuation) {
        AnswerViewModel$isNoRemind$1 answerViewModel$isNoRemind$1 = new AnswerViewModel$isNoRemind$1(continuation);
        answerViewModel$isNoRemind$1.f11175b = preferences;
        answerViewModel$isNoRemind$1.f11176c = userInfo;
        return answerViewModel$isNoRemind$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long lM9866a;
        String string;
        Preferences preferences = (Preferences) this.f11175b;
        UserInfo userInfo = (UserInfo) this.f11176c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11174a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (userInfo != null && (lM9866a = userInfo.m9866a()) != null && (string = lM9866a.toString()) != null) {
            if (StringsKt.isBlank(string)) {
                string = null;
            }
            if (string != null) {
                Boolean bool = (Boolean) preferences.get(C8138d.f13911a.m13044a(string));
                return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
            }
        }
        return Boxing.boxBoolean(false);
    }
}
