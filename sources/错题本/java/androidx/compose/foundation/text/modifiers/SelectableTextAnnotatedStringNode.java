package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\r*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J&\u00105\u001a\u000202*\u00020-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J#\u00109\u001a\u00020\u0013*\u0002062\u0006\u0010/\u001a\u0002072\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u00020\u0013*\u0002062\u0006\u0010/\u001a\u0002072\u0006\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010:J#\u0010=\u001a\u00020\u0013*\u0002062\u0006\u0010/\u001a\u0002072\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u0010:J#\u0010>\u001a\u00020\u0013*\u0002062\u0006\u0010/\u001a\u0002072\u0006\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b>\u0010:J°\u0001\u0010B\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010?\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010CR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Ld6/s;", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lr6/c;IZIILjava/util/List;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lr6/c;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", TypedValues.Custom.S_COLOR, "update-7NebLg4", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILr6/c;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)V", "update", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Lr6/c;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "textAnnotatedStringNode", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSelectableTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,167:1\n107#2,7:168\n*S KotlinDebug\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n*L\n89#1:168,7\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    @Nullable
    private InterfaceC6471c onShowTranslation;

    @Nullable
    private SelectionController selectionController;

    @NotNull
    private final TextAnnotatedStringNode textAnnotatedStringNode;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, interfaceC6471c, i, z8, i8, i9, list, interfaceC6471c2, selectionController, colorProducer, textAutoSize, interfaceC6471c3);
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        this.textAnnotatedStringNode.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        return this.textAnnotatedStringNode.m8009measureNonExtension3p2s80s(measureScope, measurable, j7);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(coordinates);
        }
    }

    /* renamed from: update-7NebLg4, reason: not valid java name */
    public final void m8008update7NebLg4(@NotNull AnnotatedString text, @NotNull TextStyle style, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, @Nullable InterfaceC6471c onTextLayout, @Nullable InterfaceC6471c onPlaceholderLayout, @Nullable SelectionController selectionController, @Nullable ColorProducer color, @Nullable TextAutoSize autoSize) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.textAnnotatedStringNode;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(color, style), this.textAnnotatedStringNode.updateText$foundation_release(text), this.textAnnotatedStringNode.m8010updateLayoutRelatedArgsy0kMQk(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow, autoSize), this.textAnnotatedStringNode.updateCallbacks(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3, int i10, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, (i10 & 8) != 0 ? null : interfaceC6471c, (i10 & 16) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 32) != 0 ? true : z8, (i10 & 64) != 0 ? Integer.MAX_VALUE : i8, (i10 & 128) != 0 ? 1 : i9, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : interfaceC6471c2, (i10 & 1024) != 0 ? null : selectionController, (i10 & 2048) != 0 ? null : colorProducer, (i10 & 4096) != 0 ? null : textAutoSize, (i10 & 8192) != 0 ? null : interfaceC6471c3, null);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List<AnnotatedString.Range<Placeholder>> list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3) {
        this.selectionController = selectionController;
        this.onShowTranslation = interfaceC6471c3;
        this.textAnnotatedStringNode = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, interfaceC6471c, i, z8, i8, i9, list, interfaceC6471c2, selectionController, colorProducer, textAutoSize, interfaceC6471c3, null));
        if (this.selectionController != null) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }
}
