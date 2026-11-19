package androidx.compose.foundation.text.modifiers;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.graphics.drawscope.Fill;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.MultiParagraph;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0082\u0001BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b)\u0010*J`\u0010.\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000¢\u0006\u0004\b,\u0010-Ja\u0010/\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b/\u00100J-\u00105\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\rH\u0000¢\u0006\u0004\b7\u00108J\u0013\u0010;\u001a\u00020\r*\u00020:H\u0016¢\u0006\u0004\b;\u0010<J(\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020Aø\u0001\u0000¢\u0006\u0004\bD\u0010EJ&\u0010H\u001a\u00020C*\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bG\u0010EJ%\u0010M\u001a\u00020\u00132\u0006\u0010J\u001a\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013¢\u0006\u0004\bM\u0010NJ#\u0010O\u001a\u00020\u0013*\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013H\u0016¢\u0006\u0004\bO\u0010NJ%\u0010Q\u001a\u00020\u00132\u0006\u0010J\u001a\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0013¢\u0006\u0004\bQ\u0010NJ#\u0010R\u001a\u00020\u0013*\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010NJ%\u0010S\u001a\u00020\u00132\u0006\u0010J\u001a\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013¢\u0006\u0004\bS\u0010NJ#\u0010T\u001a\u00020\u0013*\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010NJ%\u0010U\u001a\u00020\u00132\u0006\u0010J\u001a\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0013¢\u0006\u0004\bU\u0010NJ#\u0010V\u001a\u00020\u0013*\u00020I2\u0006\u0010@\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0013H\u0016¢\u0006\u0004\bV\u0010NJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\u00020\r*\u00020WH\u0016¢\u0006\u0004\b[\u0010ZJ\u0017\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u0005H\u0002¢\u0006\u0004\bb\u0010*J\u000f\u0010c\u001a\u00020\rH\u0002¢\u0006\u0004\bc\u00108R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010dR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010fR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010gR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010hR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010iR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010hR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010hR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010jR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010gR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010mR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010gR*\u0010p\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u0013\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u00108R\u0018\u0010s\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR*\u0010v\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0u\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010gR$\u0010w\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b_\u0010\u0080\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0083\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Ld6/s;", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lr6/c;IZIILjava/util/List;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lr6/c;Lkotlin/jvm/internal/e;)V", TypedValues.Custom.S_COLOR, "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText$foundation_release", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "updateText", "updateLayoutRelatedArgs-y0k-MQk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILandroidx/compose/foundation/text/TextAutoSize;)Z", "updateLayoutRelatedArgs", "updateCallbacks", "(Lr6/c;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Lr6/c;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "doInvalidations", "(ZZZZ)V", "clearSubstitution$foundation_release", "()V", "clearSubstitution", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "measure-3p2s80s", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidthNonExtension", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "width", "minIntrinsicHeightNonExtension", "minIntrinsicHeight", "maxIntrinsicWidthNonExtension", "maxIntrinsicWidth", "maxIntrinsicHeightNonExtension", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "drawNonExtension", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "draw", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "getLayoutCache", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "updatedText", "setSubstitution", "invalidateForTranslate", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lr6/c;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/foundation/text/TextAutoSize;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "baselineCache", "Ljava/util/Map;", "getBaselineCache$annotations", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "semanticsTextLayoutResult", "textSubstitution", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "getTextSubstitution$foundation_release", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "TextSubstitutionValue", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,588:1\n1#2:589\n26#3:590\n26#3:591\n54#4:592\n54#4:594\n59#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:605\n59#4:607\n85#5:593\n85#5:595\n90#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:606\n90#5:608\n53#5,3:610\n233#6:604\n33#7:609\n635#8:613\n635#8:614\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n437#1:590\n438#1:591\n449#1:592\n450#1:594\n451#1:596\n452#1:598\n456#1:600\n456#1:602\n528#1:605\n529#1:607\n449#1:593\n450#1:595\n451#1:597\n452#1:599\n456#1:601\n456#1:603\n528#1:606\n529#1:608\n530#1:610,3\n522#1:604\n530#1:609\n552#1:613\n554#1:614\n*E\n"})
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @Nullable
    private MultiParagraphLayoutCache _layoutCache;

    @Nullable
    private TextAutoSize autoSize;

    @Nullable
    private Map<AlignmentLine, Integer> baselineCache;

    @NotNull
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;

    @Nullable
    private InterfaceC6471c onPlaceholderLayout;

    @Nullable
    private InterfaceC6471c onShowTranslation;

    @Nullable
    private InterfaceC6471c onTextLayout;
    private int overflow;

    @Nullable
    private ColorProducer overrideColor;

    @Nullable
    private List<AnnotatedString.Range<Placeholder>> placeholders;

    @Nullable
    private SelectionController selectionController;

    @Nullable
    private InterfaceC6471c semanticsTextLayoutResult;
    private boolean softWrap;

    @NotNull
    private TextStyle style;

    @NotNull
    private AnnotatedString text;

    @Nullable
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, interfaceC6471c, i, z8, i8, i9, list, interfaceC6471c2, selectionController, colorProducer, textAutoSize, interfaceC6471c3);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        AbstractC5830k.m5327d(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString updatedText) {
        C5443s c5443s;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, EmptyList.INSTANCE, this.autoSize, null);
            multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity());
            textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (AbstractC5830k.m5325b(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(updatedText);
        MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m7993updateJ2qo7bo(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, EmptyList.INSTANCE, this.autoSize);
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        return c5443s != null;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        InterfaceC6471c interfaceC6471c = this.semanticsTextLayoutResult;
        if (interfaceC6471c == null) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
                @Override // p152r6.InterfaceC6471c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.p011ui.text.TextLayoutResult> r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r1)
                        androidx.compose.ui.text.TextLayoutResult r2 = r1.getLayoutCache()
                        if (r2 == 0) goto Lb7
                        androidx.compose.ui.text.TextLayoutInput r3 = new androidx.compose.ui.text.TextLayoutInput
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.AnnotatedString r4 = r1.getText()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r1)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.graphics.ColorProducer r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r1)
                        if (r1 == 0) goto L2b
                        long r6 = r1.mo8454invoke0d7_KjU()
                        goto L31
                    L2b:
                        androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p011ui.graphics.Color.INSTANCE
                        long r6 = r1.m10718getUnspecified0d7_KjU()
                    L31:
                        r35 = 16777214(0xfffffe, float:2.3509884E-38)
                        r36 = 0
                        r8 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r32 = 0
                        r33 = 0
                        r34 = 0
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.p011ui.text.TextStyle.m12790mergedA7vx0o$default(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        java.util.List r6 = r1.getPlaceholders()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r7 = r1.getMaxLines()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        boolean r8 = r1.getSoftWrap()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r9 = r1.getOverflow()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.Density r10 = r1.getDensity()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.LayoutDirection r11 = r1.getLayoutDirection()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.font.FontFamily$Resolver r12 = r1.getFontFamilyResolver()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        long r13 = r1.getConstraints()
                        r15 = 0
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                        r6 = 2
                        r7 = 0
                        r4 = 0
                        androidx.compose.ui.text.TextLayoutResult r1 = androidx.compose.p011ui.text.TextLayoutResult.m12738copyO0kMr_c$default(r2, r3, r4, r6, r7)
                        if (r1 == 0) goto Lb7
                        r2 = r38
                        r2.add(r1)
                        goto Lb8
                    Lb7:
                        r1 = 0
                    Lb8:
                        if (r1 == 0) goto Lbc
                        r1 = 1
                        goto Lbd
                    Lbc:
                        r1 = 0
                    Lbd:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.C14261.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.semanticsTextLayoutResult = interfaceC6471c;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            public final Boolean invoke(boolean z8) {
                if (TextAnnotatedStringNode.this.getTextSubstitution() == null) {
                    return Boolean.FALSE;
                }
                InterfaceC6471c interfaceC6471c2 = TextAnnotatedStringNode.this.onShowTranslation;
                if (interfaceC6471c2 != null) {
                    TextSubstitutionValue textSubstitution = TextAnnotatedStringNode.this.getTextSubstitution();
                    AbstractC5830k.m5327d(textSubstitution);
                    interfaceC6471c2.invoke(textSubstitution);
                }
                TextSubstitutionValue textSubstitution2 = TextAnnotatedStringNode.this.getTextSubstitution();
                if (textSubstitution2 != null) {
                    textSubstitution2.setShowingSubstitution(z8);
                }
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.4
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, interfaceC6471c, 1, null);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            getLayoutCache().m7993updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (drawChanged) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        if (getIsAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z8 = true;
            boolean z9 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m13231equalsimpl0(this.overflow, TextOverflow.INSTANCE.m13244getVisiblegIe3tQ8());
            if (z9) {
                Rect rectM10481Recttz77jQw = RectKt.m10481Recttz77jQw(Offset.INSTANCE.m10457getZeroF1C5BW0(), Size.m10501constructorimpl((Float.floatToRawIntBits((int) (textLayoutResult.getSize() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResult.getSize() & 4294967295L)) & 4294967295L)));
                canvas.save();
                Canvas.m10655clipRectmtrdDE$default(canvas, rectM10481Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.INSTANCE.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.INSTANCE.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    MultiParagraph.m12619painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo8454invoke0d7_KjU = colorProducer != null ? colorProducer.mo8454invoke0d7_KjU() : Color.INSTANCE.m10718getUnspecified0d7_KjU();
                    if (jMo8454invoke0d7_KjU == 16) {
                        jMo8454invoke0d7_KjU = this.style.m12800getColor0d7_KjU() != 16 ? this.style.m12800getColor0d7_KjU() : Color.INSTANCE.m10708getBlack0d7_KjU();
                    }
                    multiParagraph.m12624paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : jMo8454invoke0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m11235getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z9) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) ? TextAnnotatedStringNodeKt.hasLinks(this.text) : false)) {
                    List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z8 = false;
                    }
                    if (z8) {
                        return;
                    }
                }
                contentDrawScope.drawContent();
            } catch (Throwable th) {
                if (z9) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public final void drawNonExtension(@NotNull ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Nullable
    /* renamed from: getTextSubstitution$foundation_release, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int width) {
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int height) {
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean zM7992layoutWithConstraintsK40F9xA = layoutCache.m7992layoutWithConstraintsK40F9xA(j7, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (zM7992layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            InterfaceC6471c interfaceC6471c = this.onTextLayout;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        InterfaceC6471c interfaceC6471c2 = this.onPlaceholderLayout;
        if (interfaceC6471c2 != null) {
            interfaceC6471c2.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13267fitPrioritizingWidthZbe2FdA((int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L), (int) (textLayoutResult.getSize() & 4294967295L)));
        int size = (int) (textLayoutResult.getSize() >> 32);
        int size2 = (int) (textLayoutResult.getSize() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC5830k.m5327d(map);
        return measureScope.layout(size, size2, map, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @NotNull
    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m8009measureNonExtension3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long constraints) {
        return mo6573measure3p2s80s(measureScope, measurable, constraints);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int width) {
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int height) {
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    public final void setTextSubstitution$foundation_release(@Nullable TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean updateCallbacks(@Nullable InterfaceC6471c onTextLayout, @Nullable InterfaceC6471c onPlaceholderLayout, @Nullable SelectionController selectionController, @Nullable InterfaceC6471c onShowTranslation) {
        boolean z8;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z8 = true;
        }
        if (!AbstractC5830k.m5325b(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z8 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z8;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean updateDraw(@Nullable ColorProducer color, @NotNull TextStyle style) {
        boolean zM5325b = AbstractC5830k.m5325b(color, this.overrideColor);
        this.overrideColor = color;
        return (zM5325b && style.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m8010updateLayoutRelatedArgsy0kMQk(@NotNull TextStyle style, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, @Nullable TextAutoSize autoSize) {
        boolean z8 = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (!AbstractC5830k.m5325b(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z8 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z8 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z8 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z8 = true;
        }
        if (!AbstractC5830k.m5325b(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z8 = true;
        }
        if (!TextOverflow.m13231equalsimpl0(this.overflow, overflow)) {
            this.overflow = overflow;
            z8 = true;
        }
        if (AbstractC5830k.m5325b(this.autoSize, autoSize)) {
            return z8;
        }
        this.autoSize = autoSize;
        return true;
    }

    public final boolean updateText$foundation_release(@NotNull AnnotatedString text) {
        boolean zM5325b = AbstractC5830k.m5325b(this.text.getText(), text.getText());
        boolean z8 = (zM5325b && this.text.hasEqualAnnotations(text)) ? false : true;
        if (z8) {
            this.text = text;
        }
        if (!zM5325b) {
            clearSubstitution$foundation_release();
        }
        return z8;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3, int i10, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, (i10 & 8) != 0 ? null : interfaceC6471c, (i10 & 16) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 32) != 0 ? true : z8, (i10 & 64) != 0 ? Integer.MAX_VALUE : i8, (i10 & 128) != 0 ? 1 : i9, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : interfaceC6471c2, (i10 & 1024) != 0 ? null : selectionController, (i10 & 2048) != 0 ? null : colorProducer, (i10 & 4096) != 0 ? null : textAutoSize, (i10 & 8192) != 0 ? null : interfaceC6471c3, null);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List<AnnotatedString.Range<Placeholder>> list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC6471c interfaceC6471c3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = interfaceC6471c;
        this.overflow = i;
        this.softWrap = z8;
        this.maxLines = i8;
        this.minLines = i9;
        this.placeholders = list;
        this.onPlaceholderLayout = interfaceC6471c2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = interfaceC6471c3;
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "original", "Landroidx/compose/ui/text/AnnotatedString;", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "getOriginal", "()Landroidx/compose/ui/text/AnnotatedString;", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @Nullable
        private MultiParagraphLayoutCache layoutCache;

        @NotNull
        private final AnnotatedString original;

        @NotNull
        private AnnotatedString substitution;

        public TextSubstitutionValue(@NotNull AnnotatedString annotatedString, @NotNull AnnotatedString annotatedString2, boolean z8, @Nullable MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z8;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z8, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z8 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z8, multiParagraphLayoutCache);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @NotNull
        public final TextSubstitutionValue copy(@NotNull AnnotatedString original, @NotNull AnnotatedString substitution, boolean isShowingSubstitution, @Nullable MultiParagraphLayoutCache layoutCache) {
            return new TextSubstitutionValue(original, substitution, isShowingSubstitution, layoutCache);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return AbstractC5830k.m5325b(this.original, textSubstitutionValue.original) && AbstractC5830k.m5325b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && AbstractC5830k.m5325b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        @Nullable
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @NotNull
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        @NotNull
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iM908i = AbstractC0584a.m908i(this.isShowingSubstitution, (this.substitution.hashCode() + (this.original.hashCode() * 31)) * 31, 31);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return iM908i + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@Nullable MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z8) {
            this.isShowingSubstitution = z8;
        }

        public final void setSubstitution(@NotNull AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        @NotNull
        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z8, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, AbstractC5824e abstractC5824e) {
            this(annotatedString, annotatedString2, (i & 4) != 0 ? false : z8, (i & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }
}
