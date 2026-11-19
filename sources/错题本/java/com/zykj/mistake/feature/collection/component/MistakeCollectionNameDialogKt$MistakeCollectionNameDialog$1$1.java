package com.zykj.mistake.feature.collection.component;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.component.MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1", m5303f = "MistakeCollectionNameDialog.kt", m5304i = {}, m5305l = {76}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, InterfaceC5631c<? super MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$focusRequester = focusRequester;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1(this.$focusRequester, this.$keyboardController, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            this.label = 1;
            if (AbstractC6014x.m5638i(200L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        FocusRequester.m10349requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.show();
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
