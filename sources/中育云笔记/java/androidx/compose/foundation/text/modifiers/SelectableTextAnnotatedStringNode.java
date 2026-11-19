package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private InterfaceC9540l onShowTranslation;
    private SelectionController selectionController;
    private final TextAnnotatedStringNode textAnnotatedStringNode;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, selectionController, colorProducer, textAutoSize, interfaceC9540l3);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.textAnnotatedStringNode.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.textAnnotatedStringNode.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.textAnnotatedStringNode.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return this.textAnnotatedStringNode.m28205measureNonExtension3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.textAnnotatedStringNode.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.textAnnotatedStringNode.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(layoutCoordinates);
        }
    }

    /* renamed from: update-7NebLg4, reason: not valid java name */
    public final void m28204update7NebLg4(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, int i11, boolean z10, FontFamily.Resolver resolver, int i12, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.textAnnotatedStringNode;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), this.textAnnotatedStringNode.updateText$foundation_release(annotatedString), this.textAnnotatedStringNode.m28206updateLayoutRelatedArgsy0kMQk(textStyle, list, i10, i11, z10, resolver, i12, textAutoSize), this.textAnnotatedStringNode.updateCallbacks(interfaceC9540l, interfaceC9540l2, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3, int i13, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : interfaceC9540l, (i13 & 16) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC9540l2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, (i13 & 4096) != 0 ? null : textAutoSize, (i13 & 8192) != 0 ? null : interfaceC9540l3, null);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3) {
        this.selectionController = selectionController;
        this.onShowTranslation = interfaceC9540l3;
        this.textAnnotatedStringNode = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, this.selectionController, colorProducer, textAutoSize, this.onShowTranslation, null));
        if (this.selectionController != null) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }
}
