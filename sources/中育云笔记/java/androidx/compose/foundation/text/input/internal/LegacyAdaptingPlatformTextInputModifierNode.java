package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p014ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode extends Modifier.Node implements PlatformTextInputModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode {
    public static final int $stable = 8;
    private final MutableState layoutCoordinates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private LegacyTextFieldState legacyTextFieldState;
    private LegacyPlatformTextInputServiceAdapter serviceAdapter;
    private TextFieldSelectionManager textFieldSelectionManager;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", m26211f = "LegacyAdaptingPlatformTextInputModifierNode.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_NS}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 */
    public static final class C17991 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17991(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C17991> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LegacyAdaptingPlatformTextInputModifierNode.this.new C17991(this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = LegacyAdaptingPlatformTextInputModifierNode.this;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(legacyAdaptingPlatformTextInputModifierNode, interfaceC9544p, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C17991) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LegacyAdaptingPlatformTextInputModifierNode(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    private void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration());
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public InterfaceC10045g launchTextInputSession(InterfaceC9544p interfaceC9544p) {
        if (isAttached()) {
            return AbstractC11117h.m24726d(getCoroutineScope(), null, CoroutineStart.f23479f, new C17991(interfaceC9544p, null), 1, null);
        }
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.serviceAdapter.registerModifier(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.serviceAdapter.unregisterModifier(this);
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    public void setLegacyTextFieldState(LegacyTextFieldState legacyTextFieldState) {
        this.legacyTextFieldState = legacyTextFieldState;
    }

    public final void setServiceAdapter(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        if (isAttached()) {
            this.serviceAdapter.stopInput();
            this.serviceAdapter.unregisterModifier(this);
        }
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        if (isAttached()) {
            this.serviceAdapter.registerModifier(this);
        }
    }

    public void setTextFieldSelectionManager(TextFieldSelectionManager textFieldSelectionManager) {
        this.textFieldSelectionManager = textFieldSelectionManager;
    }
}
