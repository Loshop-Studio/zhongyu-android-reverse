package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusChangedModifierKt;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.C10002c;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;
    private final State<Character> obfuscationMaskState;
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.b
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int transform(int i10, int i11) {
            return SecureTextFieldController.codepointTransformation$lambda$0(this.f1101a, i10, i11);
        }
    };
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return C10786q.f26013a;
        }

        public final void invoke(FocusState focusState) {
            if (focusState.isFocused()) {
                return;
            }
            this.this$0.getPasswordInputTransformation().hide();
        }
    });
    private final InterfaceC10000a resetTimerSignal = AbstractC10001b.m20722b(Integer.MAX_VALUE, null, null, 6, null);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", m26211f = "BasicSecureTextField.kt", m26212l = {242}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2 */
    public static final class C17332 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C17332(InterfaceC11588c<? super C17332> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return SecureTextFieldController.this.new C17332(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.label = 1;
                if (DelayKt.m20376b(1500L, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            SecureTextFieldController.this.getPasswordInputTransformation().hide();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(C10786q c10786q, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C17332) create(c10786q, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
        if (C10002c.m20731i(this.resetTimerSignal.mo33808trySendJP2dKIU(C10786q.f26013a))) {
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

    public final Object observeHideEvents(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM25559i = AbstractC11596e.m25559i(AbstractC11596e.m25562l(this.resetTimerSignal), new C17332(null), interfaceC11588c);
        return objM25559i == AbstractC11725a.m25952f() ? objM25559i : C10786q.f26013a;
    }
}
