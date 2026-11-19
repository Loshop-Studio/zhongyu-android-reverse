package com.zykj.student.dialogue.p076ui.ask;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p181m7.C9037n;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1", m13451f = "AskQuestionDialogFragment.kt", m13452i = {}, m13453l = {90}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAskQuestionDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionDialogFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/* loaded from: classes5.dex */
public final class AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10627a;

    /* renamed from: b */
    public final /* synthetic */ AskQuestionDialogFragment f10628b;

    /* renamed from: c */
    public final /* synthetic */ boolean f10629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1(AskQuestionDialogFragment askQuestionDialogFragment, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f10628b = askQuestionDialogFragment;
        this.f10629c = z9;
    }

    /* renamed from: c */
    public static final Unit m10046c(AskQuestionDialogFragment askQuestionDialogFragment, Uri uri) {
        if (uri != null) {
            askQuestionDialogFragment.m10043y(uri);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1(this.f10628b, this.f10629c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10627a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            HomeViewModel homeViewModelM10041v = this.f10628b.m10041v();
            boolean z9 = this.f10629c;
            this.f10627a = 1;
            if (homeViewModelM10041v.m10865P(z9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.f10629c) {
            this.f10628b.m10042w().show();
            return Unit.INSTANCE;
        }
        C9037n c9037n = this.f10628b.imagePicker;
        final AskQuestionDialogFragment askQuestionDialogFragment = this.f10628b;
        C9037n.m14415y(c9037n, null, true, new Function1() { // from class: com.zykj.student.dialogue.ui.ask.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1.m10046c(askQuestionDialogFragment, (Uri) obj2);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
