package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p011ui.autofill.ContentDataType;
import androidx.compose.p011ui.draganddrop.DragAndDropEvent;
import androidx.compose.p011ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p011ui.focus.FocusEventModifierNode;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequesterModifierNode;
import androidx.compose.p011ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNodeKt;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.ClipMetadata;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p011ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p011ui.platform.PlatformTextInputSessionScope;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.C5916i;
import kotlinx.coroutines.flow.C5945n;
import kotlinx.coroutines.flow.InterfaceC5912g;
import kotlinx.coroutines.flow.InterfaceC5958x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u0002£\u0001\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rBs\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\"*\u00020&H\u0016¢\u0006\u0004\b'\u0010(Jy\u0010)\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b)\u0010%J\u0013\u0010+\u001a\u00020\"*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\"2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\"2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J*\u0010@\u001a\u00020\"2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\"H\u0016¢\u0006\u0004\bA\u00102J\u001a\u0010F\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0016ø\u0001\u0000¢\u0006\u0004\bG\u0010EJ\u000f\u0010I\u001a\u00020\"H\u0016¢\u0006\u0004\bI\u00102J\u0017\u0010J\u001a\u00020\"2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\bJ\u00107J\u001a\u0010N\u001a\u00020\"2\u0006\u0010K\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020\"H\u0082@¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\"H\u0002¢\u0006\u0004\bQ\u00102J\u0017\u0010S\u001a\u00020\"2\u0006\u0010R\u001a\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\"H\u0002¢\u0006\u0004\bU\u00102J\u000f\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\"H\u0002¢\u0006\u0004\bY\u00102J\u001a\u0010^\u001a\u00020\"2\u0006\u0010[\u001a\u00020ZH\u0002ø\u0001\u0000¢\u0006\u0004\b\\\u0010]R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010TR\"\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010s\u001a\u0004\bw\u0010u\"\u0004\bx\u0010TR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b\u001c\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010s\u001a\u0005\b\u0083\u0001\u0010u\"\u0005\b\u0084\u0001\u0010TR'\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b \u0010s\u001a\u0004\b \u0010u\"\u0005\b\u008a\u0001\u0010TR/\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b#\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010sR\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001e\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009f\u0001R!\u0010¬\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010«\u00010ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R1\u0010³\u0001\u001a\u00020\u00162\u0007\u0010®\u0001\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0005\b±\u0001\u0010u\"\u0005\b²\u0001\u0010TR\u0016\u0010µ\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010uR\u0016\u0010¶\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "isPassword", "Lkotlinx/coroutines/flow/x;", "Ld6/s;", "stylusHandwritingTrigger", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/x;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "updateNode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "onObservedReadsChanged", "onPlaced", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "observeUntransformedTextChanges", "(Lh6/c;)Ljava/lang/Object;", "onFocusChange", "fromTap", "startInputSession", "(Z)V", "disposeInputSession", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "requireKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "emitDragExitEvent", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeActionPerformed-KlQnJC8", "(I)V", "onImeActionPerformed", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "Landroidx/compose/foundation/text/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "Z", "getEnabled", "()Z", "setEnabled", "getReadOnly", "setReadOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "setKeyboardOptions", "(Landroidx/compose/foundation/text/KeyboardOptions;)V", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "getSingleLine", "setSingleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "setPassword", "Lkotlinx/coroutines/flow/x;", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/x;", "setStylusHandwritingTrigger", "(Lkotlinx/coroutines/flow/x;)V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "dragEnterEvent", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "isElementFocused", "Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "Lkotlinx/coroutines/w0;", "toolbarAndHandlesVisibilityObserverJob", "Lkotlinx/coroutines/w0;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "keyboardActionScope", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "Lr6/c;", "inputSessionJob", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfigurationProvider", "Lr6/a;", "<set-?>", "autofillHighlightOn$delegate", "Landroidx/compose/runtime/MutableState;", "getAutofillHighlightOn", "setAutofillHighlightOn", "autofillHighlightOn", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "isFocused", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,823:1\n85#2:824\n113#2,2:825\n1#3:827\n316#4,6:828\n324#4,3:842\n327#4:851\n254#5,8:834\n263#5,6:845\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n404#1:824\n404#1:825,2\n659#1:828,6\n659#1:842,3\n659#1:851\n659#1:834,8\n659#1:845,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: autofillHighlightOn$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState autofillHighlightOn;

    @NotNull
    private final InterfaceC6471c clipboardKeyCommandsHandler;

    @NotNull
    private final DragAndDropTargetModifierNode dragAndDropNode;

    @Nullable
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;

    @Nullable
    private InputTransformation filter;

    @Nullable
    private InterfaceC6013w0 inputSessionJob;

    @NotNull
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;

    @Nullable
    private KeyboardActionHandler keyboardActionHandler;

    @NotNull
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;

    @NotNull
    private KeyboardOptions keyboardOptions;

    @NotNull
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;

    @NotNull
    private final InterfaceC6469a receiveContentConfigurationProvider;
    private boolean singleLine;

    @Nullable
    private InterfaceC5958x stylusHandwritingTrigger;

    @NotNull
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;

    @NotNull
    private TextFieldSelectionState textFieldSelectionState;

    @NotNull
    private TransformedTextFieldState textFieldState;

    @NotNull
    private TextLayoutState textLayoutState;

    @Nullable
    private InterfaceC6013w0 toolbarAndHandlesVisibilityObserverJob;

    @Nullable
    private WindowInfo windowInfo;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {674}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1 */
    public static final class C13571 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C13571(InterfaceC5631c<? super C13571> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return TextFieldDecoratorModifierNode.this.new C13571(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                TextFieldSelectionState textFieldSelectionState = TextFieldDecoratorModifierNode.this.getTextFieldSelectionState();
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C13571) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {759}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1 */
    public static final class C13631 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {760}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C68591 extends FunctionReferenceImpl implements InterfaceC6471c {
                public C68591(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7856invokeKlQnJC8(((ImeAction) obj).getValue());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m7856invokeKlQnJC8(int i) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m7848onImeActionPerformedKlQnJC8(i);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC5631c<?> interfaceC5631c) {
                return ((AnonymousClass1) create(platformTextInputSessionScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                    TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                    ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                    ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                    C68591 c68591 = new C68591(this.this$0);
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7857invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7857invoke() {
                            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                        }
                    };
                    InterfaceC5958x stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                    ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c68591, interfaceC6469a, stylusHandwritingTrigger, viewConfiguration, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13631(ReceiveContentConfiguration receiveContentConfiguration, InterfaceC5631c<? super C13631> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return TextFieldDecoratorModifierNode.this.new C13631(this.$receiveContentConfiguration, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C13631) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {499}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1 */
    public static final class C13641 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13641(TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super C13641> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C13641(this.$textFieldSelectionState, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                TextFieldSelectionState textFieldSelectionState = this.$textFieldSelectionState;
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C13641) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public TextFieldDecoratorModifierNode(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation inputTransformation, boolean z8, boolean z9, @NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler keyboardActionHandler, boolean z10, @NotNull MutableInteractionSource mutableInteractionSource, boolean z11, @Nullable InterfaceC5958x interfaceC5958x) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z8;
        this.readOnly = z9;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z10;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z11;
        this.stylusHandwritingTrigger = interfaceC5958x;
        textFieldSelectionState.setRequestAutofillAction(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7849invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7849invoke() {
                DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1 */
            public static final class C13591 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C13591(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, InterfaceC5631c<? super C13591> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    C13591 c13591 = new C13591(this.this$0, this.$this_SuspendingPointerInputModifierNode, interfaceC5631c);
                    c13591.L$0 = obj;
                    return c13591;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    InterfaceC6469a interfaceC6469a = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR (r5v0 'interfaceC6469a' r6.a) = 
                          (r3v0 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r2v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:26) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r0 = r9.label
                        if (r0 != 0) goto L3c
                        kotlin.AbstractC5774b.m5119b(r10)
                        java.lang.Object r10 = r9.L$0
                        kotlinx.coroutines.v r10 = (kotlinx.coroutines.InterfaceC6009v) r10
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = r9.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = r0.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r2 = r9.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r4 = r9.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r5 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r5.<init>(r3, r2)
                        kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r7 = 0
                        r1.<init>(r3, r4, r7)
                        r8 = 1
                        kotlinx.coroutines.AbstractC6014x.m5651v(r10, r7, r0, r1, r8)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r6 = 0
                        r1.<init>(r2, r3, r4, r5, r6)
                        kotlinx.coroutines.AbstractC6014x.m5651v(r10, r7, r0, r1, r8)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r1.<init>(r3, r4, r5, r7)
                        kotlinx.coroutines.AbstractC6014x.m5651v(r10, r7, r0, r1, r8)
                        d6.s r10 = p045d6.C5443s.f8405a
                        return r10
                    L3c:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.C13591.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C13591) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objM5637h = AbstractC6014x.m5637h(new C13591(this.this$0, pointerInputScope, null), interfaceC5631c);
                return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Set<MediaType> invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
            }
        }, new InterfaceC6473e() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration != null) {
                    TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.INSTANCE.m6861getDragAndDropkB6V9T0(), null, 8, null));
                    plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                String str = plainText;
                if (str != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), str, false, null, false, 14, null);
                }
                return Boolean.TRUE;
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
                }
            }
        }, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                HoverInteraction.Enter enter = new HoverInteraction.Enter();
                this.this$0.getInteractionSource().tryEmit(enter);
                textFieldDecoratorModifierNode.dragEnterEvent = enter;
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragEnter();
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7850invokek4lQ0M(((Offset) obj).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m7850invokek4lQ0M(long j7) {
                long jM7879fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m7879fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j7);
                int iM7869getOffsetForPosition3MmeM6k$default = TextLayoutState.m7869getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM7879fromWindowToDecorationUv8p0NA, false, 2, null);
                if (iM7869getOffsetForPosition3MmeM6k$default >= 0) {
                    this.this$0.getTextFieldState().m7889selectCharsIn5zctL8(TextRangeKt.TextRange(iM7869getOffsetForPosition3MmeM6k$default));
                }
                this.this$0.getTextFieldSelectionState().m7939updateHandleDraggingUv8p0NA(Handle.Cursor, jM7879fromWindowToDecorationUv8p0NA);
            }
        }, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragExit();
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                this.this$0.emitDragExitEvent();
            }
        }, 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m7783constructorimpl(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {385, 386, 387}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 */
            public static final class C13541 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ KeyCommand $keyCommand;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[KeyCommand.values().length];
                        try {
                            iArr[KeyCommand.COPY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[KeyCommand.CUT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[KeyCommand.PASTE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C13541(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC5631c<? super C13541> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$keyCommand = keyCommand;
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C13541(this.$keyCommand, this.this$0, interfaceC5631c);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
                
                    if (r6.paste(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
                
                    if (r6.cut(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
                
                    if (r6.copy(false, r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r5.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1b
                        if (r1 == r4) goto Lf
                        if (r1 == r3) goto Lf
                        if (r1 != r2) goto L13
                    Lf:
                        kotlin.AbstractC5774b.m5119b(r6)
                        goto L5d
                    L13:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1b:
                        kotlin.AbstractC5774b.m5119b(r6)
                        androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
                        int[] r1 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C13541.WhenMappings.$EnumSwitchMapping$0
                        int r6 = r6.ordinal()
                        r6 = r1[r6]
                        if (r6 == r4) goto L4d
                        if (r6 == r3) goto L3e
                        if (r6 == r2) goto L2f
                        goto L5d
                    L2f:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r2
                        java.lang.Object r6 = r6.paste(r5)
                        if (r6 != r0) goto L5d
                        goto L5c
                    L3e:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r3
                        java.lang.Object r6 = r6.cut(r5)
                        if (r6 != r0) goto L5d
                        goto L5c
                    L4d:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r4
                        r1 = 0
                        java.lang.Object r6 = r6.copy(r1, r5)
                        if (r6 != r0) goto L5d
                    L5c:
                        return r0
                    L5d:
                        d6.s r6 = p045d6.C5443s.f8405a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C13541.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C13541) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeyCommand) obj);
                return C5443s.f8405a;
            }

            public final void invoke(KeyCommand keyCommand) {
                AbstractC6014x.m5651v(this.this$0.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C13541(keyCommand, this.this$0, null), 1);
            }
        });
        this.receiveContentConfigurationProvider = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }
        };
        this.autofillHighlightOn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final void disposeInputSession() {
        InterfaceC6013w0 interfaceC6013w0 = this.inputSessionJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.inputSessionJob = null;
        InterfaceC5958x interfaceC5958x = this.stylusHandwritingTrigger;
        if (interfaceC5958x != null) {
            interfaceC5958x.mo5528c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUntransformedTextChanges(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objCollect = new C5945n(new C5916i(SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final String invoke() {
                return TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText().toString();
            }
        }), 1)).collect(new InterfaceC5912g() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.3
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c2) {
                return emit((String) obj, (InterfaceC5631c<? super C5443s>) interfaceC5631c2);
            }

            public final Object emit(String str, InterfaceC5631c<? super C5443s> interfaceC5631c2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return C5443s.f8405a;
            }
        }, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C13571(null), 3);
        } else {
            if (isFocused()) {
                return;
            }
            InterfaceC6013w0 interfaceC6013w0 = this.toolbarAndHandlesVisibilityObserverJob;
            if (interfaceC6013w0 != null) {
                interfaceC6013w0.cancel(null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m7848onImeActionPerformedKlQnJC8(final int imeAction) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m12936equalsimpl0(imeAction, companion.m12953getNoneeUduSuo()) || ImeAction.m12936equalsimpl0(imeAction, companion.m12949getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo7608defaultKeyboardActionKlQnJC8(imeAction);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7851invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7851invoke() {
                    this.this$0.keyboardActionScope.mo7608defaultKeyboardActionKlQnJC8(imeAction);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutofillHighlightOn(boolean z8) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean fromTap) {
        if (fromTap || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.inputSessionJob = AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C13631(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3);
        }
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long selection = outputText.getSelection();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m12552setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z8 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z8);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {536}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass1(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                        this.label = 1;
                        if (textFieldDecoratorModifierNode.observeUntransformedTextChanges(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z8) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().replaceAll(annotatedString);
                this.setAutofillHighlightOn(true);
                AbstractC6014x.m5651v(this.getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (z8) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z8) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z8) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new InterfaceC6474f() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i, int i8, boolean z9) {
                TextFieldCharSequence untransformedText = z9 ? TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText() : TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                long selection2 = untransformedText.getSelection();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i, i8) < 0 || Math.max(i, i8) > untransformedText.length()) {
                    return Boolean.FALSE;
                }
                if (i == TextRange.m12770getStartimpl(selection2) && i8 == TextRange.m12765getEndimpl(selection2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i, i8);
                if (z9 || i == i8) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z9) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m7890selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m7889selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int iM7622getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m7622getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m12548onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM7622getImeActionOrDefaulteUduSuo$foundation_release, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m7848onImeActionPerformedKlQnJC8(iM7622getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m12764getCollapsedimpl(selection) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {622}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass1(this.this$0, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (TextFieldSelectionState.copy$default(textFieldSelectionState, false, this, 1, null) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                        }
                        return C5443s.f8405a;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    AbstractC6014x.m5651v(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {627}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                        int label;
                        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.this$0 = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new AnonymousClass1(this.this$0, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                                this.label = 1;
                                if (textFieldSelectionState.cut(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC5774b.m5119b(obj);
                            }
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final Boolean invoke() {
                        AbstractC6014x.m5651v(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z8) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.11

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {634}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass1(this.this$0, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (textFieldSelectionState.paste(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                        }
                        return C5443s.f8405a;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    AbstractC6014x.m5651v(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m11227drawRectnJ9OG0$default(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m10692unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final InputTransformation getFilter() {
        return this.filter;
    }

    @NotNull
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Nullable
    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    @NotNull
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Nullable
    public final InterfaceC5958x getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    @NotNull
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    @NotNull
    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    @NotNull
    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: isPassword, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.p011ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        boolean z8 = this.enabled && !this.readOnly;
        if (focusState.isFocused()) {
            if (z8) {
                startInputSession(false);
                return;
            }
            return;
        }
        disposeInputSession();
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.commitComposition$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo6723onKeyEventZmokQxo(@NotNull KeyEvent event) {
        return this.textFieldKeyEventHandler.mo7777onKeyEventCJ9ybgU(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7852invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7852invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m7848onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m7622getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.p011ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7853invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7853invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        this.dragAndDropNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo6724onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo6725onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return this.textFieldKeyEventHandler.mo7778onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo6891onRemeasuredozmzZPI(long size) {
        this.dragAndDropNode.mo6891onRemeasuredozmzZPI(size);
    }

    public final void setEnabled(boolean z8) {
        this.enabled = z8;
    }

    public final void setFilter(@Nullable InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(@NotNull MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(@Nullable KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(@NotNull KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z8) {
        this.isPassword = z8;
    }

    public final void setReadOnly(boolean z8) {
        this.readOnly = z8;
    }

    public final void setSingleLine(boolean z8) {
        this.singleLine = z8;
    }

    public final void setStylusHandwritingTrigger(@Nullable InterfaceC5958x interfaceC5958x) {
        this.stylusHandwritingTrigger = interfaceC5958x;
    }

    public final void setTextFieldSelectionState(@NotNull TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(@NotNull TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(@NotNull TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(@NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation filter, boolean enabled, boolean readOnly, @NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler keyboardActionHandler, boolean singleLine, @NotNull MutableInteractionSource interactionSource, boolean isPassword, @Nullable InterfaceC5958x stylusHandwritingTrigger) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z8;
        InterfaceC6013w0 interfaceC6013w0;
        boolean z9 = this.enabled;
        boolean z10 = z9 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        boolean z11 = this.isPassword;
        InterfaceC5958x interfaceC5958x = this.stylusHandwritingTrigger;
        if (!enabled || readOnly) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z8 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z8 = true;
        }
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = stylusHandwritingTrigger;
        if (z8 != z10 || !AbstractC5830k.m5325b(textFieldState, transformedTextFieldState) || !AbstractC5830k.m5325b(keyboardOptions, keyboardOptions2) || !AbstractC5830k.m5325b(stylusHandwritingTrigger, interfaceC5958x)) {
            if (z8 && isFocused()) {
                startInputSession(false);
            } else if (!z8) {
                disposeInputSession();
            }
        }
        if (enabled != z9 || z8 != z10 || !ImeAction.m12936equalsimpl0(keyboardOptions.m7622getImeActionOrDefaulteUduSuo$foundation_release(), keyboardOptions2.m7622getImeActionOrDefaulteUduSuo$foundation_release()) || isPassword != z11) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!AbstractC5830k.m5325b(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (getIsAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (interfaceC6013w0 = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    interfaceC6013w0.cancel(null);
                    this.toolbarAndHandlesVisibilityObserverJob = AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C13641(textFieldSelectionState, null), 3);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.updateNode.2
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7858invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7858invoke() {
                    DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (AbstractC5830k.m5325b(interactionSource, mutableInteractionSource)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }
}
