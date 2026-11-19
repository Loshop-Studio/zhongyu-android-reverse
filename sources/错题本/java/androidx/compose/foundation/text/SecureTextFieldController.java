package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifierKt;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5878g;
import kotlinx.coroutines.channels.InterfaceC5876e;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/text/SecureTextFieldController;", "", "Landroidx/compose/runtime/State;", "", "obfuscationMaskState", "<init>", "(Landroidx/compose/runtime/State;)V", "Ld6/s;", "scheduleHide", "()V", "observeHideEvents", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "passwordInputTransformation", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "getPasswordInputTransformation", "()Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "getCodepointTransformation", "()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/ui/Modifier;", "focusChangeModifier", "Landroidx/compose/ui/Modifier;", "getFocusChangeModifier", "()Landroidx/compose/ui/Modifier;", "Lkotlinx/coroutines/channels/e;", "resetTimerSignal", "Lkotlinx/coroutines/channels/e;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;

    @NotNull
    private final State<Character> obfuscationMaskState;

    @NotNull
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));

    @NotNull
    private final CodepointTransformation codepointTransformation = new C1301a(this, 1);

    @NotNull
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.INSTANCE, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return C5443s.f8405a;
        }

        public final void invoke(FocusState focusState) {
            if (focusState.isFocused()) {
                return;
            }
            this.this$0.getPasswordInputTransformation().hide();
        }
    });

    @NotNull
    private final InterfaceC5876e resetTimerSignal = AbstractC5882k.m5511a(Integer.MAX_VALUE, 6, null);

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Ld6/s;", "it", "<anonymous>", "(V)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", m5303f = "BasicSecureTextField.kt", m5304i = {}, m5305l = {242}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2 */
    public static final class C12732 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C12732(InterfaceC5631c<? super C12732> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SecureTextFieldController.this.new C12732(interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(C5443s c5443s, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C12732) create(c5443s, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.label = 1;
                if (AbstractC6014x.m5638i(1500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            SecureTextFieldController.this.getPasswordInputTransformation().hide();
            return C5443s.f8405a;
        }
    }

    public SecureTextFieldController(@NotNull State<Character> state) {
        this.obfuscationMaskState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i, int i8) {
        return i == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation_release() ? i8 : secureTextFieldController.obfuscationMaskState.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (this.resetTimerSignal.mo5481a(C5443s.f8405a) instanceof C5878g) {
            this.passwordInputTransformation.hide();
        }
    }

    @NotNull
    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    @NotNull
    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    @NotNull
    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    @Nullable
    public final Object observeHideEvents(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5552h = AbstractC5914h.m5552h(new C5904c(this.resetTimerSignal, true), new C12732(null), interfaceC5631c);
        return objM5552h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5552h : C5443s.f8405a;
    }
}
