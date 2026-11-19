package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final InterfaceC9544p setCompositionContext;
    private final InterfaceC9544p setMeasurePolicy;
    private final InterfaceC9544p setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new InterfaceC9544p() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
                LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
                if (subcompositionsState$ui_release == null) {
                    subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
                }
                subcomposeLayoutState2._state = subcompositionsState$ui_release;
                this.this$0.getState().makeSureStateIsConsistent();
                this.this$0.getState().setSlotReusePolicy(this.this$0.slotReusePolicy);
            }
        };
        this.setCompositionContext = new InterfaceC9544p() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (CompositionContext) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
                this.this$0.getState().setCompositionContext(compositionContext);
            }
        };
        this.setMeasurePolicy = new InterfaceC9544p() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (InterfaceC9544p) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, InterfaceC9544p interfaceC9544p) {
                layoutNode.setMeasurePolicy(this.this$0.getState().createMeasurePolicy(interfaceC9544p));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    public final InterfaceC9544p getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final InterfaceC9544p getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final InterfaceC9544p getSetRoot$ui_release() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, InterfaceC9544p interfaceC9544p) {
        return getState().precompose(obj, interfaceC9544p);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @InterfaceC10770a
    public SubcomposeLayoutState(int i10) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i10));
    }

    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo32255premeasure0kLqBqw(int i10, long j10) {
        }

        default void traverseDescendants(Object obj, InterfaceC9540l interfaceC9540l) {
        }
    }
}
