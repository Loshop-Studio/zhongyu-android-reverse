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
import androidx.compose.p013ui.autofill.ContentDataType;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.focus.FocusRequesterModifierNode;
import androidx.compose.p013ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.input.key.KeyInputModifierNode;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.ClipMetadata;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p013ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p013ui.platform.PlatformTextInputSessionScope;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.platform.WindowInfo;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u008d\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001H\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rBq\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0002\u0010$J\b\u0010n\u001a\u00020#H\u0002J\b\u0010o\u001a\u00020#H\u0002J\u000e\u0010p\u001a\u00020#H\u0082@¢\u0006\u0002\u0010qJ\b\u0010r\u001a\u00020#H\u0016J\b\u0010s\u001a\u00020#H\u0016J\b\u0010t\u001a\u00020#H\u0016J\b\u0010u\u001a\u00020#H\u0002J\u0010\u0010v\u001a\u00020#2\u0006\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020#2\u0006\u0010z\u001a\u00020{H\u0016J\u001b\u0010|\u001a\u00020#2\u0006\u0010}\u001a\u00020~H\u0002ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020\u00172\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020#H\u0016J\u0011\u0010\u0087\u0001\u001a\u00020#2\u0006\u0010z\u001a\u00020{H\u0016J3\u0010\u0088\u0001\u001a\u00020#2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001f\u0010\u0091\u0001\u001a\u00020\u00172\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0085\u0001J\u001f\u0010\u0093\u0001\u001a\u00020#2\b\u0010\u0094\u0001\u001a\u00030\u008e\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\n\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0002J\u0012\u0010\u0099\u0001\u001a\u00020#2\u0007\u0010\u009a\u0001\u001a\u00020\u0017H\u0002Js\u0010\u009b\u0001\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u000e\u0010\u009c\u0001\u001a\u00020#*\u00030\u009d\u0001H\u0016J\u000e\u0010\u009e\u0001\u001a\u00020#*\u00030\u009f\u0001H\u0016R+\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020.X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010(R\u001a\u0010 \u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010(\"\u0004\bB\u0010*R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0004\n\u0002\u0010IR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u0016\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0SX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010(R\u001a\u0010\u001d\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0010\u0010k\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010mX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActionHandler", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "singleLine", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isPassword", "stylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V", "<set-?>", "autofillHighlightOn", "getAutofillHighlightOn", "()Z", "setAutofillHighlightOn", "(Z)V", "autofillHighlightOn$delegate", "Landroidx/compose/runtime/MutableState;", "clipboardKeyCommandsHandler", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "Lkotlin/jvm/functions/Function1;", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "dragEnterEvent", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEnabled", "setEnabled", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "inputSessionJob", "Lkotlinx/coroutines/Job;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isElementFocused", "isFocused", "setPassword", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "keyboardActionScope", "androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "setKeyboardOptions", "(Landroidx/compose/foundation/text/KeyboardOptions;)V", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReadOnly", "setReadOnly", "receiveContentConfigurationProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getSingleLine", "setSingleLine", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setStylusHandwritingTrigger", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "toolbarAndHandlesVisibilityObserverJob", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "disposeInputSession", "emitDragExitEvent", "observeUntransformedTextChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttach", "onCancelPointerInput", "onDetach", "onFocusChange", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onImeActionPerformed", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed-KlQnJC8", "(I)V", "onKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPlaced", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "requireKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "fromTap", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,823:1\n85#2:824\n113#2,2:825\n1#3:827\n316#4,6:828\n324#4,3:842\n327#4:851\n254#5,8:834\n263#5,6:845\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n404#1:824\n404#1:825,2\n659#1:828,6\n659#1:842,3\n659#1:851\n659#1:834,8\n659#1:845,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: autofillHighlightOn$delegate, reason: from kotlin metadata */
    private final MutableState autofillHighlightOn;
    private final Function1<? super KeyCommand, ? extends Unit> clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private Job inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final Function0<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private MutableSharedFlow<Unit> stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private Job toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {674}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1 */
    public static final class C17601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17601(Continuation<? super C17601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C17601(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionState textFieldSelectionState = TextFieldDecoratorModifierNode.this.getTextFieldSelectionState();
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {759}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1 */
    public static final class C17661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {760}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C101091 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
                public C101091(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                    m18241invokeKlQnJC8(imeAction.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m18241invokeKlQnJC8(int i10) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m18239onImeActionPerformedKlQnJC8(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation<?> continuation) {
                return ((AnonymousClass1) create(platformTextInputSessionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                    TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                    ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                    ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                    C101091 c101091 = new C101091(this.this$0);
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                        }
                    };
                    MutableSharedFlow<Unit> stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                    ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c101091, function0, stylusHandwritingTrigger, viewConfiguration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17661(ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super C17661> continuation) {
            super(2, continuation);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C17661(this.$receiveContentConfiguration, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {499}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1 */
    public static final class C17671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17671(TextFieldSelectionState textFieldSelectionState, Continuation<? super C17671> continuation) {
            super(2, continuation);
            this.$textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17671(this.$textFieldSelectionState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionState textFieldSelectionState = this.$textFieldSelectionState;
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z9, boolean z10, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z11, MutableInteractionSource mutableInteractionSource, boolean z12, MutableSharedFlow<Unit> mutableSharedFlow) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z9;
        this.readOnly = z10;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z11;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z12;
        this.stylusHandwritingTrigger = mutableSharedFlow;
        textFieldSelectionState.setRequestAutofillAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1 */
            public static final class C17621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17621(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, Continuation<? super C17621> continuation) {
                    super(2, continuation);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C17621 c17621 = new C17621(this.this$0, this.$this_SuspendingPointerInputModifierNode, continuation);
                    c17621.L$0 = obj;
                    return c17621;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    Function0<Unit> function0 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r8v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit>) = 
                          (r12v4 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r6v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:28) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
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
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r11.label
                        if (r0 != 0) goto L4c
                        kotlin.ResultKt.throwOnFailure(r12)
                        java.lang.Object r12 = r11.L$0
                        r0 = r12
                        kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r12 = r11.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r12.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r11.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r7 = r11.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r8 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r8.<init>(r12, r6)
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r9 = 0
                        r3.<init>(r12, r7, r9)
                        r4 = 1
                        r5 = 0
                        r1 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        r10 = r2
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r2 = r6
                        r6 = 0
                        r3 = r12
                        r4 = r7
                        r5 = r8
                        r1.<init>(r2, r3, r4, r5, r6)
                        r6 = r4
                        r7 = r5
                        r4 = 1
                        r5 = 0
                        r3 = r1
                        r1 = 0
                        r2 = r10
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r3.<init>(r12, r6, r7, r9)
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        kotlin.Unit r12 = kotlin.Unit.INSTANCE
                        return r12
                    L4c:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.C17621.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C17621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C17621(this.this$0, pointerInputScope, null), continuation);
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends MediaType> invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
            }
        }, new Function2<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration != null) {
                    TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.INSTANCE.m17292getDragAndDropkB6V9T0(), null, 8, null));
                    plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                String str = plainText;
                if (str != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), str, false, null, false, 14, null);
                }
                return Boolean.TRUE;
            }
        }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
                }
            }
        }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
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
        }, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m18240invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m18240invokek4lQ0M(long j10) {
                long jM18262fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m18262fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j10);
                int iM18252getOffsetForPosition3MmeM6k$default = TextLayoutState.m18252getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM18262fromWindowToDecorationUv8p0NA, false, 2, null);
                if (iM18252getOffsetForPosition3MmeM6k$default >= 0) {
                    this.this$0.getTextFieldState().m18272selectCharsIn5zctL8(TextRangeKt.TextRange(iM18252getOffsetForPosition3MmeM6k$default));
                }
                this.this$0.getTextFieldSelectionState().m18322updateHandleDraggingUv8p0NA(Handle.Cursor, jM18262fromWindowToDecorationUv8p0NA);
            }
        }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragExit();
            }
        }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                this.this$0.emitDragExitEvent();
            }
        }, 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m18176constructorimpl(new Function1<KeyCommand, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {385, 386, 387}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 */
            public static final class C17571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ KeyCommand $keyCommand;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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
                public C17571(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super C17571> continuation) {
                    super(2, continuation);
                    this.$keyCommand = keyCommand;
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C17571(this.$keyCommand, this.this$0, continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
                
                    if (r6.paste(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
                
                    if (r6.cut(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                
                    if (r6.copy(false, r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
                
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
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r5.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r4) goto L11
                        if (r1 == r3) goto L11
                        if (r1 != r2) goto L15
                    L11:
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L5f
                    L15:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1d:
                        kotlin.ResultKt.throwOnFailure(r6)
                        androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
                        int[] r1 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C17571.WhenMappings.$EnumSwitchMapping$0
                        int r6 = r6.ordinal()
                        r6 = r1[r6]
                        if (r6 == r4) goto L4f
                        if (r6 == r3) goto L40
                        if (r6 == r2) goto L31
                        goto L5f
                    L31:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r2
                        java.lang.Object r6 = r6.paste(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L40:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r3
                        java.lang.Object r6 = r6.cut(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L4f:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r4
                        r1 = 0
                        java.lang.Object r6 = r6.copy(r1, r5)
                        if (r6 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C17571.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C17571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyCommand keyCommand) {
                invoke2(keyCommand);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyCommand keyCommand) {
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C17571(keyCommand, this.this$0, null), 1, null);
            }
        });
        this.receiveContentConfigurationProvider = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }
        };
        this.autofillHighlightOn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final void disposeInputSession() {
        Job job = this.inputSessionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.inputSessionJob = null;
        MutableSharedFlow<Unit> mutableSharedFlow = this.stylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.resetReplayCache();
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
    public final Object observeUntransformedTextChanges(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.take(FlowKt.drop(SnapshotStateKt.snapshotFlow(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText().toString();
            }
        }), 1), 1).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((String) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(String str, Continuation<? super Unit> continuation2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17601(null), 3, null);
        } else {
            if (isFocused()) {
                return;
            }
            Job job = this.toolbarAndHandlesVisibilityObserverJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m18239onImeActionPerformedKlQnJC8(final int imeAction) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m23193equalsimpl0(imeAction, companion.m23210getNoneeUduSuo()) || ImeAction.m23193equalsimpl0(imeAction, companion.m23206getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo18008defaultKeyboardActionKlQnJC8(imeAction);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.keyboardActionScope.mo18008defaultKeyboardActionKlQnJC8(imeAction);
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
    public final void setAutofillHighlightOn(boolean z9) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean fromTap) {
        if (fromTap || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.inputSessionJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17661(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long selection = outputText.getSelection();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m22811setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z9 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z9);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {536}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                        this.label = 1;
                        if (textFieldDecoratorModifierNode.observeUntransformedTextChanges(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z9) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().replaceAll(annotatedString);
                this.setAutofillHighlightOn(true);
                BuildersKt__Builders_commonKt.launch$default(this.getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (z9) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z9) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z9) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i10, int i11, boolean z10) {
                TextFieldCharSequence untransformedText = z10 ? TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText() : TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                long selection2 = untransformedText.getSelection();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i10, i11) < 0 || Math.max(i10, i11) > untransformedText.length()) {
                    return Boolean.FALSE;
                }
                if (i10 == TextRange.m23027getStartimpl(selection2) && i11 == TextRange.m23022getEndimpl(selection2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i10, i11);
                if (z10 || i10 == i11) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z10) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m18273selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m18272selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int iM18022getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m18022getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m22807onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM18022getImeActionOrDefaulteUduSuo$foundation_release, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m18239onImeActionPerformedKlQnJC8(iM18022getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m23021getCollapsedimpl(selection) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {622}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.label;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (TextFieldSelectionState.copy$default(textFieldSelectionState, false, this, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    BuildersKt__Builders_commonKt.launch$default(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10

                    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {627}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                                this.label = 1;
                                if (textFieldSelectionState.cut(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        BuildersKt__Builders_commonKt.launch$default(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z9) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.11

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", m13596f = "TextFieldDecoratorModifier.kt", m13597i = {}, m13598l = {634}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.label;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (textFieldSelectionState.paste(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    BuildersKt__Builders_commonKt.launch$default(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m21521drawRectnJ9OG0$default(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m20986unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final MutableSharedFlow<Unit> getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

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

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        boolean z9 = this.enabled && !this.readOnly;
        if (focusState.isFocused()) {
            if (z9) {
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

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo17159onKeyEventZmokQxo(KeyEvent event) {
        return this.textFieldKeyEventHandler.mo18170onKeyEventCJ9ybgU(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m18239onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m18022getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.p013ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        this.dragAndDropNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo17160onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo17160onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo17161onPreKeyEventZmokQxo(KeyEvent event) {
        return this.textFieldKeyEventHandler.mo18171onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo17320onRemeasuredozmzZPI(long size) {
        this.dragAndDropNode.mo17320onRemeasuredozmzZPI(size);
    }

    public final void setEnabled(boolean z9) {
        this.enabled = z9;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z9) {
        this.isPassword = z9;
    }

    public final void setReadOnly(boolean z9) {
        this.readOnly = z9;
    }

    public final void setSingleLine(boolean z9) {
        this.singleLine = z9;
    }

    public final void setStylusHandwritingTrigger(MutableSharedFlow<Unit> mutableSharedFlow) {
        this.stylusHandwritingTrigger = mutableSharedFlow;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource, boolean isPassword, MutableSharedFlow<Unit> stylusHandwritingTrigger) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z9;
        Job job;
        boolean z10 = this.enabled;
        boolean z11 = z10 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        boolean z12 = this.isPassword;
        MutableSharedFlow<Unit> mutableSharedFlow = this.stylusHandwritingTrigger;
        if (!enabled || readOnly) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z9 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z9 = true;
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
        if (z9 != z11 || !Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !Intrinsics.areEqual(keyboardOptions, keyboardOptions2) || !Intrinsics.areEqual(stylusHandwritingTrigger, mutableSharedFlow)) {
            if (z9 && isFocused()) {
                startInputSession(false);
            } else if (!z9) {
                disposeInputSession();
            }
        }
        if (enabled != z10 || z9 != z11 || !ImeAction.m23193equalsimpl0(keyboardOptions.m18022getImeActionOrDefaulteUduSuo$foundation_release(), keyboardOptions2.m18022getImeActionOrDefaulteUduSuo$foundation_release()) || isPassword != z12) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (getIsAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (job = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.toolbarAndHandlesVisibilityObserverJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17671(textFieldSelectionState, null), 3, null);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.updateNode.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (Intrinsics.areEqual(interactionSource, mutableInteractionSource)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }
}
