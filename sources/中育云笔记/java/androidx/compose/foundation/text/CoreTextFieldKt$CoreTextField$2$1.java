package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", m26211f = "CoreTextField.kt", m26212l = {347}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, InterfaceC11588c<? super CoreTextFieldKt$CoreTextField$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$state = legacyTextFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final State<Boolean> state = this.$writeable$delegate;
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        return Boolean.valueOf(CoreTextFieldKt.CoreTextField$lambda$11(state));
                    }
                });
                final LegacyTextFieldState legacyTextFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final ImeOptions imeOptions = this.$imeOptions;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.2
                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit(((Boolean) obj2).booleanValue(), (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        if (z10 && legacyTextFieldState.getHasFocus()) {
                            CoreTextFieldKt.startInputSession(textInputService, legacyTextFieldState, textFieldSelectionManager.getValue$foundation_release(), imeOptions, textFieldSelectionManager.getOffsetMapping$foundation_release());
                        } else {
                            CoreTextFieldKt.endInputSession(legacyTextFieldState);
                        }
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594cSnapshotFlow.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            CoreTextFieldKt.endInputSession(this.$state);
            return C10786q.f26013a;
        } catch (Throwable th) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
