package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.input.pointer.PointerIconKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j10, SelectionRegistrar selectionRegistrar, long j11, StaticTextSelectionParams staticTextSelectionParams, AbstractC9972n abstractC9972n) {
        this(j10, selectionRegistrar, j11, staticTextSelectionParams);
    }

    public final void draw(DrawScope drawScope) {
        Selection selection = this.selectionRegistrar.getSubselections().get(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        Path pathForRange = this.params.getPathForRange(AbstractC10410o.m21756i(offset, lastVisibleOffset), AbstractC10410o.m21756i(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m31419drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L));
        int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iM30867getIntersectrtfAjoo);
            DrawScope.m31419drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final LayoutCoordinates invoke() {
                return SelectionController.this.params.getLayoutCoordinates();
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final TextLayoutResult invoke() {
                return SelectionController.this.params.getTextLayoutResult();
            }
        }));
    }

    public final void updateGlobalPosition(LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !AbstractC9979u.m20289b(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    private SelectionController(long j10, SelectionRegistrar selectionRegistrar, long j11, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j10;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j11;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.pointerHoverIcon$default(SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j10, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final LayoutCoordinates invoke() {
                return this.this$0.params.getLayoutCoordinates();
            }
        }), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long j10, SelectionRegistrar selectionRegistrar, long j11, StaticTextSelectionParams staticTextSelectionParams, int i10, AbstractC9972n abstractC9972n) {
        this(j10, selectionRegistrar, j11, (i10 & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
