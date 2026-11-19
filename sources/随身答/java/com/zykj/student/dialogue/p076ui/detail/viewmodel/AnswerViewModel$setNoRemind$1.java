package com.zykj.student.dialogue.p076ui.detail.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p138i6.C8138d;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$setNoRemind$1", m13451f = "AnswerViewModel.kt", m13452i = {0}, m13453l = {322}, m13454m = "invokeSuspend", m13455n = {"userId"}, m13456s = {"L$0"})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setNoRemind$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,529:1\n1#2:530\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$setNoRemind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11183a;

    /* renamed from: b */
    public int f11184b;

    /* renamed from: c */
    public final /* synthetic */ AnswerViewModel f11185c;

    @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$setNoRemind$1$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$setNoRemind$1$1 */
    public static final class C75371 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11186a;

        /* renamed from: b */
        public /* synthetic */ Object f11187b;

        /* renamed from: c */
        public final /* synthetic */ String f11188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C75371(String str, Continuation continuation) {
            super(2, continuation);
            this.f11188c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((C75371) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C75371 c75371 = new C75371(this.f11188c, continuation);
            c75371.f11187b = obj;
            return c75371;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f11187b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(C8138d.f13911a.m13044a(this.f11188c), Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$setNoRemind$1(AnswerViewModel answerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11185c = answerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$setNoRemind$1(this.f11185c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long lM9866a;
        String string;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11184b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfo userInfo = (UserInfo) this.f11185c.userInfoFlow.getValue();
            if (userInfo != null && (lM9866a = userInfo.m9866a()) != null && (string = lM9866a.toString()) != null) {
                if (StringsKt.isBlank(string)) {
                    string = null;
                }
                if (string != null) {
                    DataStore dataStore = this.f11185c.dataStore;
                    C75371 c75371 = new C75371(string, null);
                    this.f11183a = SpillingKt.nullOutSpilledVariable(string);
                    this.f11184b = 1;
                    if (PreferencesKt.edit(dataStore, c75371, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$setNoRemind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
