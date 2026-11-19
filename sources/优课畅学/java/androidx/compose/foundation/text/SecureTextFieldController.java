package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusChangedModifierKt;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.C9160c;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;
    private final State<Character> obfuscationMaskState;
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.b
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int transform(int i10, int i11) {
            return SecureTextFieldController.codepointTransformation$lambda$0(this.f1171a, i10, i11);
        }
    };
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return C8736p.f16368a;
        }

        public final void invoke(FocusState focusState) {
            if (focusState.isFocused()) {
                return;
            }
            this.this$0.getPasswordInputTransformation().hide();
        }
    });
    private final InterfaceC9158a resetTimerSignal = AbstractC9159b.m16529b(Integer.MAX_VALUE, null, null, 6, null);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", m17801f = "BasicSecureTextField.kt", m17802l = {242}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2 */
    public static final class C17032 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C17032(InterfaceC9324c<? super C17032> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return SecureTextFieldController.this.new C17032(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(C8736p c8736p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17032) create(c8736p, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.label = 1;
                if (DelayKt.m16227b(1500L, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            SecureTextFieldController.this.getPasswordInputTransformation().hide();
            return C8736p.f16368a;
        }
    }

    public SecureTextFieldController(State<Character> state) {
        this.obfuscationMaskState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i10, int i11) {
        return i10 == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation_release() ? i11 : secureTextFieldController.obfuscationMaskState.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (C9160c.m16538i(this.resetTimerSignal.mo27213trySendJP2dKIU(C8736p.f16368a))) {
            this.passwordInputTransformation.hide();
        }
    }

    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    public final Object observeHideEvents(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM17019i = AbstractC9268e.m17019i(AbstractC9268e.m17023m(this.resetTimerSignal), new C17032(null), interfaceC9324c);
        return objM17019i == AbstractC9434a.m17291f() ? objM17019i : C8736p.f16368a;
    }
}
