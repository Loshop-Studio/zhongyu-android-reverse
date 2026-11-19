package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0006\u00ad\u0001®\u0001¯\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0006\u0010[\u001a\u00020CJ\u0006\u0010\\\u001a\u00020\tJ\u0006\u0010]\u001a\u00020\tJ\u0006\u0010^\u001a\u00020\tJ\u000e\u0010_\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010`J\u0006\u0010a\u001a\u00020\tJ\u0006\u0010b\u001a\u00020CJ\u0018\u0010c\u001a\u00020C2\b\b\u0002\u0010d\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J\u0006\u0010g\u001a\u00020CJ\u0006\u0010h\u001a\u00020CJ\b\u0010i\u001a\u00020jH\u0002J\u0015\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\tH\u0000¢\u0006\u0002\bnJ\u0006\u0010o\u001a\u00020jJ\u001d\u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020l2\u0006\u0010q\u001a\u00020\t2\u0006\u0010m\u001a\u00020\tH\u0000¢\u0006\u0002\buJ<\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u0002032\u0006\u0010y\u001a\u0002032\b\u0010z\u001a\u0004\u0018\u00010w2\u0006\u0010q\u001a\u00020\t2\u0006\u0010{\u001a\u00020|H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\b\u0010\u007f\u001a\u00020CH\u0002J\t\u0010\u0080\u0001\u001a\u00020\tH\u0002J\t\u0010\u0081\u0001\u001a\u00020CH\u0002J\u000f\u0010\u0082\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u000f\u0010\u0083\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u000f\u0010\u0084\u0001\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J\u000f\u0010\u0085\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u001e\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0007\u0010\u008a\u0001\u001a\u00020CJ\u000f\u0010\u008b\u0001\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J@\u0010\u008c\u0001\u001a\u00020C2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020S2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ%\u0010\u008e\u0001\u001a\u00020C2\u0007\u0010\u008f\u0001\u001a\u00020\u001d2\u0007\u0010\u0090\u0001\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JZ\u0010\u0093\u0001\u001a\u00020w2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u0002032\u0007\u0010\u0097\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020\t2\u0006\u0010{\u001a\u00020|2\t\b\u0002\u0010\u0098\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020C2\u0006\u0010U\u001a\u00020TJ\u0015\u0010\u009d\u0001\u001a\u00020C*\u00030\u009e\u0001H\u0086@¢\u0006\u0003\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u00020C*\u00030\u009e\u0001H\u0082@¢\u0006\u0003\u0010\u009f\u0001J\u001d\u0010¡\u0001\u001a\u00020C*\u00030\u009e\u00012\u0006\u0010q\u001a\u00020\tH\u0082@¢\u0006\u0003\u0010¢\u0001J?\u0010£\u0001\u001a\u00020C*\u00030\u009e\u00012\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00012\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020C0<2\r\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020C0<H\u0086@¢\u0006\u0003\u0010¨\u0001J\u0015\u0010©\u0001\u001a\u00020C*\u00030\u009e\u0001H\u0086@¢\u0006\u0003\u0010\u009f\u0001J\u001d\u0010ª\u0001\u001a\u00020C*\u00030\u009e\u00012\u0006\u0010q\u001a\u00020\tH\u0086@¢\u0006\u0003\u0010¢\u0001J$\u0010«\u0001\u001a\u00020C*\u00030\u009e\u00012\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020C0<H\u0086@¢\u0006\u0003\u0010¬\u0001R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010&\"\u0004\b+\u0010,R+\u0010-\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010&\"\u0004\b.\u0010,R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R1\u00106\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010\u001c\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u00109R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR+\u0010F\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001c\u001a\u0004\bG\u0010&\"\u0004\bH\u0010,R1\u0010J\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010U\u001a\u00020T2\u0006\u0010\u0014\u001a\u00020T8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010\u001c\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0001"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "density", "Landroidx/compose/ui/unit/Density;", "enabled", "", "readOnly", "isFocused", "isPassword", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "currentTextLayoutPositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "getCurrentTextLayoutPositionInWindow-F1C5BW0", "()J", "<set-?>", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "directDragGestureInitiator", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "editable", "getEditable", "()Z", "handleDragPosition", "getHandleDragPosition-F1C5BW0", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setFocused", "(Z)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "previousRawDragOffset", "", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rawHandleDragPosition", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "(J)V", "rawHandleDragPosition$delegate", "receiveContentConfiguration", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getReceiveContentConfiguration", "()Lkotlin/jvm/functions/Function0;", "setReceiveContentConfiguration", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "", "getRequestAutofillAction", "setRequestAutofillAction", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "startTextLayoutPositionInWindow", "getStartTextLayoutPositionInWindow-F1C5BW0", "setStartTextLayoutPositionInWindow-k-4lQ0M", "startTextLayoutPositionInWindow$delegate", "textLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textToolbarHandler", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "getTextToolbarState", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "textToolbarState$delegate", "autofill", "canAutofill", "canCopy", "canCut", "canPaste", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canSelectAll", "clearHandleDragging", "copy", "cancelSelection", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cut", "deselect", "dispose", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "includePosition", "getCursorHandleState$foundation_release", "getCursorRect", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ", "(Z)J", "getSelectionHandleState", "getSelectionHandleState$foundation_release", "getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "rawStartOffset", "rawEndOffset", "previousSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "hideTextToolbar", "isCursorHandleInVisibleBounds", "markStartContentVisibleOffset", "observeTextChanges", "observeTextToolbarVisibility", "paste", "pasteAsPlainText", "placeCursorAtNearestOffset", TypedValues.CycleType.S_WAVE_OFFSET, "placeCursorAtNearestOffset-k-4lQ0M", "(J)Z", "selectAll", "startToolbarAndHandlesVisibilityObserver", "update", "showTextToolbar", "updateHandleDragging", "handle", RequestParameters.POSITION, "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateSelection", "textFieldCharSequence", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "startOffset", "endOffset", "allowPreviousSelectionCollapsed", "isStartOfSelection", "updateSelection-SsL-Rf8", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "updateTextToolbarState", "cursorHandleGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldTapGestures", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "requestFocus", "showKeyboard", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchMode", "selectionHandleGestures", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1575:1\n85#2:1576\n113#2,2:1577\n85#2:1579\n113#2,2:1580\n85#2:1582\n113#2,2:1583\n85#2:1587\n113#2,2:1588\n85#2:1590\n113#2,2:1591\n85#2:1593\n113#2,2:1594\n85#2:1596\n113#2,2:1597\n278#3:1585\n278#3:1586\n30#3:1633\n30#3:1640\n273#3:1656\n273#3:1657\n1#4:1599\n602#5,8:1600\n54#6:1608\n85#7:1609\n53#7,3:1634\n70#7:1638\n53#7,3:1641\n70#7:1645\n60#7:1648\n60#7:1651\n70#7:1654\n722#8,23:1610\n69#9:1637\n69#9:1644\n65#9:1647\n65#9:1650\n69#9:1653\n22#10:1639\n22#10:1646\n22#10:1649\n22#10:1652\n22#10:1655\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n127#1:1576\n127#1:1577,2\n145#1:1579\n145#1:1580,2\n163#1:1582\n163#1:1583,2\n195#1:1587\n195#1:1588,2\n208#1:1590\n208#1:1591,2\n211#1:1593\n211#1:1594,2\n217#1:1596\n217#1:1597,2\n178#1:1585\n183#1:1586\n1145#1:1633\n1154#1:1640\n602#1:1656\n974#1:1657\n297#1:1600,8\n330#1:1608\n330#1:1609\n1145#1:1634,3\n1150#1:1638\n1154#1:1641,3\n1159#1:1645\n1162#1:1648\n1163#1:1651\n1165#1:1654\n544#1:1610,23\n1150#1:1637\n1159#1:1644\n1162#1:1647\n1163#1:1650\n1165#1:1653\n1150#1:1639\n1159#1:1646\n1162#1:1649\n1163#1:1652\n1165#1:1655\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private Density density;

    /* renamed from: directDragGestureInitiator$delegate, reason: from kotlin metadata */
    private final MutableState directDragGestureInitiator;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final MutableState isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private boolean isPassword;
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;

    /* renamed from: rawHandleDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState rawHandleDragPosition;
    private boolean readOnly;
    private Function0<? extends ReceiveContentConfiguration> receiveContentConfiguration;
    private Function0<Unit> requestAutofillAction;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final MutableState showCursorHandle;

    /* renamed from: startTextLayoutPositionInWindow$delegate, reason: from kotlin metadata */
    private final MutableState startTextLayoutPositionInWindow;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbarHandler textToolbarHandler;

    /* renamed from: textToolbarState$delegate, reason: from kotlin metadata */
    private final MutableState textToolbarState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "(Ljava/lang/String;I)V", "None", "Touch", "Mouse", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType None = new InputType("None", 0);
        public static final InputType Touch = new InputType("Touch", 1);
        public static final InputType Mouse = new InputType("Mouse", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{None, Touch, Mouse};
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(inputTypeArr$values);
        }

        private InputType(String str, int i10) {
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "onDrag", "", "dragPosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDragDone", "onExtend", "downPosition", "onExtend-k-4lQ0M", "(J)Z", "onExtendDrag", "onExtendDrag-k-4lQ0M", "onStart", "onStart-3MmeM6k", "updateSelection", "Landroidx/compose/ui/text/TextRange;", "isStartOfSelection", "updateSelection-r1Wruf4", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n1#2:1576\n*E\n"})
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        private final Function0<Unit> requestFocus;

        public TextFieldMouseSelectionObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
        }

        /* renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m18323updateSelectionr1Wruf4(long dragPosition, SelectionAdjustment adjustment, boolean isStartOfSelection) {
            Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m18255getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int iM18255getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m18255getOffsetForPosition3MmeM6k(dragPosition, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM18319updateSelectionSsLRf8 = textFieldSelectionState.m18319updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), iIntValue, iM18255getOffsetForPosition3MmeM6k, false, adjustment, false, isStartOfSelection);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m23021getCollapsedimpl(jM18319updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m23027getStartimpl(jM18319updateSelectionSsLRf8);
            }
            if (TextRange.m23026getReversedimpl(jM18319updateSelectionSsLRf8)) {
                jM18319updateSelectionSsLRf8 = TextFieldSelectionStateKt.m18336reverse5zctL8(jM18319updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m18272selectCharsIn5zctL8(jM18319updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return jM18319updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo18324onDrag3MmeM6k(final long dragPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m20743toStringimpl(dragPosition));
                }
            });
            m18323updateSelectionr1Wruf4(dragPosition, adjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo18325onExtendk4lQ0M(long downPosition) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo18326onExtendDragk4lQ0M(long dragPosition) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo18327onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = downPosition;
            this.dragBeginOffsetInText = TextRange.m23027getStartimpl(m18323updateSelectionr1Wruf4(downPosition, adjustment, true));
            return true;
        }
    }

    @Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "actingHandle", "Landroidx/compose/foundation/text/Handle;", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "dragTotalDistance", "onCancel", "onDown", "point", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onDragStop", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n273#2:1576\n1#3:1577\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n*L\n770#1:1576\n*E\n"})
    public final class TextFieldTextDragObserver implements TextDragObserver {
        private Handle actingHandle;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition;
        private long dragTotalDistance;
        private final Function0<Unit> requestFocus;

        public TextFieldTextDragObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
            Offset.Companion companion = Offset.INSTANCE;
            this.dragBeginPosition = companion.m20750getUnspecifiedF1C5BW0();
            this.dragTotalDistance = companion.m20751getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.INSTANCE;
                this.dragBeginPosition = companion.m20750getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m20751getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public void mo18087onDownk4lQ0M(long point) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo18088onDragk4lQ0M(long delta) {
            int iIntValue;
            int iM18255getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return;
            }
            long jM20740plusMKHz9U = Offset.m20740plusMKHz9U(this.dragTotalDistance, delta);
            this.dragTotalDistance = jM20740plusMKHz9U;
            final long jM20740plusMKHz9U2 = Offset.m20740plusMKHz9U(this.dragBeginPosition, jM20740plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.m20743toStringimpl(jM20740plusMKHz9U2));
                }
            });
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.textLayoutState.m18256isPositionOnTextk4lQ0M(jM20740plusMKHz9U2)) {
                Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m18255getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                iM18255getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m18255getOffsetForPosition3MmeM6k(jM20740plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && iIntValue == iM18255getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = SelectionAdjustment.INSTANCE.getWord();
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                iIntValue = TextLayoutState.m18252getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                iM18255getOffsetForPosition3MmeM6k = TextLayoutState.m18252getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM20740plusMKHz9U2, false, 2, null);
                word = iIntValue == iM18255getOffsetForPosition3MmeM6k ? SelectionAdjustment.INSTANCE.getNone() : SelectionAdjustment.INSTANCE.getWord();
            }
            int i10 = iIntValue;
            int i11 = iM18255getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long selection = TextFieldSelectionState.this.textFieldState.getVisualText().getSelection();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM18320updateSelectionSsLRf8$default = TextFieldSelectionState.m18320updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i10, i11, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m23021getCollapsedimpl(jM18320updateSelectionSsLRf8$default)) {
                this.dragBeginOffsetInText = TextRange.m23027getStartimpl(jM18320updateSelectionSsLRf8$default);
            }
            if (TextRange.m23026getReversedimpl(jM18320updateSelectionSsLRf8$default)) {
                jM18320updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m18336reverse5zctL8(jM18320updateSelectionSsLRf8$default);
            }
            if (!TextRange.m23020equalsimpl0(jM18320updateSelectionSsLRf8$default, selection)) {
                Handle handle = (TextRange.m23027getStartimpl(jM18320updateSelectionSsLRf8$default) == TextRange.m23027getStartimpl(selection) || TextRange.m23022getEndimpl(jM18320updateSelectionSsLRf8$default) != TextRange.m23022getEndimpl(selection)) ? ((TextRange.m23027getStartimpl(jM18320updateSelectionSsLRf8$default) != TextRange.m23027getStartimpl(selection) || TextRange.m23022getEndimpl(jM18320updateSelectionSsLRf8$default) == TextRange.m23022getEndimpl(selection)) && ((float) (TextRange.m23027getStartimpl(jM18320updateSelectionSsLRf8$default) + TextRange.m23022getEndimpl(jM18320updateSelectionSsLRf8$default))) / 2.0f <= ((float) (TextRange.m23027getStartimpl(selection) + TextRange.m23022getEndimpl(selection))) / 2.0f) ? Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
                this.actingHandle = handle;
            }
            if (TextRange.m23021getCollapsedimpl(selection) || !TextRange.m23021getCollapsedimpl(jM18320updateSelectionSsLRf8$default)) {
                TextFieldSelectionState.this.textFieldState.m18272selectCharsIn5zctL8(jM18320updateSelectionSsLRf8$default);
            }
            TextFieldSelectionState.this.m18322updateHandleDraggingUv8p0NA(this.actingHandle, jM20740plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-k-4lQ0M */
        public void mo18089onStartk4lQ0M(final long startPoint) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m20743toStringimpl(startPoint));
                    }
                });
                TextFieldSelectionState.this.m18322updateHandleDraggingUv8p0NA(this.actingHandle, startPoint);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = startPoint;
                this.dragTotalDistance = Offset.INSTANCE.m20751getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null) {
                    return;
                }
                if (TextFieldSelectionState.this.textLayoutState.m18256isPositionOnTextk4lQ0M(startPoint)) {
                    if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                        return;
                    }
                    int iM18252getOffsetForPosition3MmeM6k$default = TextLayoutState.m18252getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                    long jM18320updateSelectionSsLRf8$default = TextFieldSelectionState.m18320updateSelectionSsLRf8$default(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.getVisualText(), TextRange.INSTANCE.m23032getZerod9O1mEE(), null, null, null, 28, null), iM18252getOffsetForPosition3MmeM6k$default, iM18252getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord(), false, false, 96, null);
                    TextFieldSelectionState.this.textFieldState.m18272selectCharsIn5zctL8(jM18320updateSelectionSsLRf8$default);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                    this.dragBeginOffsetInText = TextRange.m23027getStartimpl(jM18320updateSelectionSsLRf8$default);
                    return;
                }
                int iM18252getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m18252getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21714getTextHandleMove5zf0vsI());
                }
                TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(iM18252getOffsetForPosition3MmeM6k$default2);
                TextFieldSelectionState.this.setShowCursorHandle(true);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0}, m13598l = {1325, 1327}, m13599m = "canPaste", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 */
    public static final class C18261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18261(Continuation<? super C18261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.canPaste(this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0, 0}, m13598l = {1311}, m13599m = "copy", m13600n = {"this", "cancelSelection"}, m13601s = {"L$0", "Z$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 */
    public static final class C18271 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C18271(Continuation<? super C18271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.copy(false, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2 */
    public static final class C18282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {372}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutine_suspended) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {373}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {375}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                            m18328invokek4lQ0M(offset.m20745unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m18328invokek4lQ0M(long j10) {
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            TextToolbarState textToolbarState = textFieldSelectionState2.getTextToolbarState();
                            TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                            if (textToolbarState == textToolbarState2) {
                                textToolbarState2 = TextToolbarState.None;
                            }
                            textFieldSelectionState2.setTextToolbarState(textToolbarState2);
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18282(PointerInputScope pointerInputScope, Continuation<? super C18282> continuation) {
            super(2, continuation);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18282 c18282 = TextFieldSelectionState.this.new C18282(this.$this_cursorHandleGestures, continuation);
            c18282.L$0 = obj;
            return c18282;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C18282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0}, m13598l = {1287}, m13599m = "cut", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 */
    public static final class C18291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18291(Continuation<? super C18291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.cut(this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0, 0, 0}, m13598l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m13599m = "detectCursorHandleDragGestures", m13600n = {"this", "cursorDragStart", "cursorDragDelta"}, m13601s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 */
    public static final class C18301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C18301(Continuation<? super C18301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0, 0, 0, 0}, m13598l = {984}, m13599m = "detectSelectionHandleDragGestures", m13600n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, m13601s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 */
    public static final class C18351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C18351(Continuation<? super C18351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {489}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2 */
    public static final class C18412 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18412(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, Continuation<? super C18412> continuation) {
            super(3, continuation);
            this.$interactionSource = mutableInteractionSource;
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m18333invoked4ec7I(pressGestureScope, offset.m20745unboximpl(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m18333invoked4ec7I(PressGestureScope pressGestureScope, long j10, Continuation<? super Unit> continuation) {
            C18412 c18412 = new C18412(this.$interactionSource, this.this$0, continuation);
            c18412.L$0 = pressGestureScope;
            c18412.J$0 = j10;
            return c18412.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.this$0, j10, mutableInteractionSource, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", m13596f = "TextFieldSelectionState.kt", m13597i = {0}, m13598l = {453}, m13599m = "invokeSuspend", m13600n = {"$this$awaitPointerEventScope"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2 */
    public static final class C18442 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C18442(Continuation<? super C18442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18442 c18442 = TextFieldSelectionState.this.new C18442(continuation);
            c18442.L$0 = obj;
            return c18442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C18442) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r5)
                goto L30
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
                r1 = r5
            L23:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p013ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p013ui.input.pointer.PointerEvent) r5
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                r5 = r5 ^ r2
                r3.setInTouchMode(r5)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18442.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 */
    public /* synthetic */ class C18463 extends FunctionReferenceImpl implements Function2<TextFieldCharSequence, CharSequence, Boolean> {
        public static final C18463 INSTANCE = new C18463();

        public C18463() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {1, 1}, m13598l = {1332, 1334, 1334}, m13599m = "paste", m13600n = {"this", "receiveContentConfiguration"}, m13601s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 */
    public static final class C18501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18501(Continuation<? super C18501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.paste(this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0}, m13598l = {1365}, m13599m = "pasteAsPlainText", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 */
    public static final class C18511 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18511(Continuation<? super C18511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.pasteAsPlainText(this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 */
    public static final class C18522 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {392}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutine_suspended) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {394}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z9, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    final boolean z9 = this.$isStartHandle;
                    TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                        /* renamed from: onEvent-k-4lQ0M */
                        public final void mo18292onEventk4lQ0M(long j10) {
                            textFieldSelectionState.markStartContentVisibleOffset();
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            boolean z10 = z9;
                            textFieldSelectionState2.m18322updateHandleDraggingUv8p0NA(z10 ? Handle.SelectionStart : Handle.SelectionEnd, SelectionHandlesKt.m18403getAdjustedCoordinatesk4lQ0M(textFieldSelectionState2.m18312getHandlePositiontuRUvjQ(z10)));
                        }
                    };
                    final TextFieldSelectionState textFieldSelectionState2 = this.this$0;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
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
                            textFieldSelectionState2.clearHandleDragging();
                        }
                    };
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, function0, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {411}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z9, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    boolean z9 = this.$isStartHandle;
                    this.label = 1;
                    if (textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z9, this) == coroutine_suspended) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18522(PointerInputScope pointerInputScope, boolean z9, Continuation<? super C18522> continuation) {
            super(2, continuation);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18522 c18522 = TextFieldSelectionState.this.new C18522(this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            c18522.L$0 = obj;
            return c18522;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_selectionHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass3(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C18522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m13596f = "TextFieldSelectionState.kt", m13597i = {0}, m13598l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m13599m = "startToolbarAndHandlesVisibilityObserver", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 */
    public static final class C18531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18531(Continuation<? super C18531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.startToolbarAndHandlesVisibilityObserver(this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 */
    public static final class C18542 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextChanges(this) == coroutine_suspended) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", m13596f = "TextFieldSelectionState.kt", m13597i = {}, m13598l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextToolbarVisibility(this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C18542(Continuation<? super C18542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18542 c18542 = TextFieldSelectionState.this.new C18542(continuation);
            c18542.L$0 = obj;
            return c18542;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TextFieldSelectionState.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C18542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z9;
        this.readOnly = z10;
        this.isFocused = z11;
        this.isPassword = z12;
        Offset.Companion companion = Offset.INSTANCE;
        this.startTextLayoutPositionInWindow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m20724boximpl(companion.m20750getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m20724boximpl(companion.m20750getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.textToolbarState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState textFieldSelectionState, boolean z9, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return textFieldSelectionState.copy(z9, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.p013ui.input.pointer.PointerInputScope r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18301
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3c
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r0 = r6.L$1
            r1 = r0
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
            java.lang.Object r0 = r6.L$0
            r2 = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L39
            goto L87
        L39:
            r0 = move-exception
            r10 = r0
            goto L93
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.p013ui.geometry.Offset.INSTANCE
            long r3 = r1.m20750getUnspecifiedF1C5BW0()
            r10.element = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            long r3 = r1.m20750getUnspecifiedF1C5BW0()
            r7.element = r3
            r1 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L8d
            r6.L$1 = r10     // Catch: java.lang.Throwable -> L8d
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L8d
            r6.label = r1     // Catch: java.lang.Throwable -> L8d
            r1 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            if (r9 != r0) goto L84
            return r0
        L84:
            r2 = r8
            r1 = r10
            r9 = r7
        L87:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L8d:
            r0 = move-exception
            r9 = r0
            r2 = r8
            r1 = r10
            r10 = r9
            r9 = r7
        L93:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((longRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m20750getUnspecifiedF1C5BW0();
            longRef2.element = companion.m20750getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.p013ui.input.pointer.PointerInputScope r15, final boolean r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$6(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if ((longRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m20750getUnspecifiedF1C5BW0();
            longRef2.element = companion.m20751getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        float fIntBitsToFloat;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m23021getCollapsedimpl(visualText.getSelection())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m20775Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo22335localToRootMKHz9U(cursorRect3.m20770getTopLeftF1C5BW0()) : Offset.INSTANCE.m20751getZeroF1C5BW0(), cursorRect3.m20768getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo22335localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo22335localToRootMKHz9U(m18312getHandlePositiontuRUvjQ(true)) : Offset.INSTANCE.m20751getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo22335localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo22335localToRootMKHz9U(m18312getHandlePositiontuRUvjQ(false)) : Offset.INSTANCE.m20751getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fIntBitsToFloat2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates4.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m23027getStartimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L))) & 4294967295L));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates5.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m23022getEndimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect.getTop()) & 4294967295L))) & 4294967295L));
        }
        int i10 = (int) (jMo22335localToRootMKHz9U >> 32);
        int i11 = (int) (jMo22335localToRootMKHz9U2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jMo22335localToRootMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (jMo22335localToRootMKHz9U2 & 4294967295L))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m18311getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m18312getHandlePositiontuRUvjQ(boolean isStartHandle) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.INSTANCE.m20751getZeroF1C5BW0();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, isStartHandle ? TextRange.m23027getStartimpl(selection) : TextRange.m23022getEndimpl(selection), isStartHandle, TextRange.m23026getReversedimpl(selection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m18313getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition.getValue()).m20745unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m18314getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow.getValue()).m20745unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m18315getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.INSTANCE.m23032getZerod9O1mEE();
        }
        if (previousSelection == null && Intrinsics.areEqual(adjustment, SelectionAdjustment.INSTANCE.getCharacter())) {
            return TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
        }
        SelectionLayout selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m18406getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : TextRange.INSTANCE.m23032getZerod9O1mEE(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long jM18395toTextRanged9O1mEE = adjustment.adjust(selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA).m18395toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = isStartHandle ? rawStartOffset : rawEndOffset;
        return jM18395toTextRanged9O1mEE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
        if (textToolbarHandler != null) {
            textToolbarHandler.hideTextToolbar();
        }
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Rect rectVisibleBounds;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM20762getBottomCenterF1C5BW0 = getCursorRect().m20762getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m18439containsInclusiveUv8p0NA(rectVisibleBounds, jM20762getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m18318setStartTextLayoutPositionInWindowk4lQ0M(m18311getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getVisualText();
            }
        }), C18463.INSTANCE), 1).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(TextFieldCharSequence textFieldCharSequence, Continuation<? super Unit> continuation2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(Continuation<? super Unit> continuation) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new Function0<Rect>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect rectIntersect;
                boolean zM23021getCollapsedimpl = TextRange.m23021getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getVisualText().getSelection());
                if (((!zM23021getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Cursor) && (zM23021getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Selection)) || TextFieldSelectionState.this.getDraggingHandle() != null || !TextFieldSelectionState.this.isInTouchMode()) {
                    return Rect.INSTANCE.getZero();
                }
                LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                if (rectVisibleBounds == null) {
                    return Rect.INSTANCE.getZero();
                }
                LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Offset offsetM20724boximpl = textLayoutCoordinates2 != null ? Offset.m20724boximpl(textLayoutCoordinates2.mo22335localToRootMKHz9U(rectVisibleBounds.m20770getTopLeftF1C5BW0())) : null;
                Intrinsics.checkNotNull(offsetM20724boximpl);
                Rect rectM20775Recttz77jQw = RectKt.m20775Recttz77jQw(offsetM20724boximpl.m20745unboximpl(), rectVisibleBounds.m20768getSizeNHjbRc());
                Rect contentRect = TextFieldSelectionState.this.getContentRect();
                Rect rect = rectM20775Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                return (rect == null || (rectIntersect = rect.intersect(rectM20775Recttz77jQw)) == null) ? Rect.INSTANCE.getZero() : rectIntersect;
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Rect rect, Continuation<? super Unit> continuation2) {
                if (Intrinsics.areEqual(rect, Rect.INSTANCE.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextToolbarHandler textToolbarHandler = TextFieldSelectionState.this.textToolbarHandler;
                    if (textToolbarHandler != null) {
                        Object objShowTextToolbar = textToolbarHandler.showTextToolbar(TextFieldSelectionState.this, rect, continuation2);
                        return objShowTextToolbar == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShowTextToolbar : Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pasteAsPlainText(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18511
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L48
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            androidx.compose.ui.platform.Clipboard r9 = r8.clipboard
            if (r9 == 0) goto L62
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.getClipEntry(r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            r0 = r8
        L48:
            androidx.compose.ui.platform.ClipEntry r9 = (androidx.compose.p013ui.platform.ClipEntry) r9
            if (r9 == 0) goto L62
            java.lang.String r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readText(r9)
            if (r2 != 0) goto L53
            goto L62
        L53:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r0.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r4 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L62:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.pasteAsPlainText(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m18316placeCursorAtNearestOffsetk4lQ0M(long offset) {
        int iM22997getOffsetForPositionk4lQ0M;
        int iM23027getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (iM22997getOffsetForPositionk4lQ0M = layoutResult.m22997getOffsetForPositionk4lQ0M(offset)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jM18267mapFromTransformedjx7JFs = transformedTextFieldState.m18267mapFromTransformedjx7JFs(iM22997getOffsetForPositionk4lQ0M);
        long jM18270mapToTransformedGEjPoXI = transformedTextFieldState.m18270mapToTransformedGEjPoXI(jM18267mapFromTransformedjx7JFs);
        int i10 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) && TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) || TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? (!TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) || TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i10 == 1 || i10 == 2) {
            iM23027getStartimpl = TextRange.m23027getStartimpl(jM18267mapFromTransformedjx7JFs);
        } else if (i10 == 3) {
            selectionWedgeAffinity = MathUtilsKt.m18214findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m23027getStartimpl(jM18270mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m23022getEndimpl(jM18270mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            iM23027getStartimpl = TextRange.m23027getStartimpl(jM18267mapFromTransformedjx7JFs);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iM23027getStartimpl = MathUtilsKt.m18214findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m23027getStartimpl(jM18270mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m23022getEndimpl(jM18270mapToTransformedGEjPoXI))) < 0 ? TextRange.m23027getStartimpl(jM18267mapFromTransformedjx7JFs) : TextRange.m23022getEndimpl(jM18267mapFromTransformedjx7JFs);
        }
        long jTextRange = TextRangeKt.TextRange(iM23027getStartimpl);
        if (TextRange.m23020equalsimpl0(jTextRange, this.textFieldState.getUntransformedText().getSelection()) && (selectionWedgeAffinity == null || Intrinsics.areEqual(selectionWedgeAffinity, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m18273selectUntransformedCharsIn5zctL8(jTextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m18317setRawHandleDragPositionk4lQ0M(long j10) {
        this.rawHandleDragPosition.setValue(Offset.m20724boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z9) {
        this.showCursorHandle.setValue(Boolean.valueOf(z9));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m18318setStartTextLayoutPositionInWindowk4lQ0M(long j10) {
        this.startTextLayoutPositionInWindow.setValue(Offset.m20724boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m18319updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        HapticFeedback hapticFeedback;
        TextRange textRangeM23015boximpl = TextRange.m23015boximpl(textFieldCharSequence.getSelection());
        long packedValue = textRangeM23015boximpl.getPackedValue();
        if (isStartOfSelection || (!allowPreviousSelectionCollapsed && TextRange.m23021getCollapsedimpl(packedValue))) {
            textRangeM23015boximpl = null;
        }
        long jM18315getTextFieldSelectionqeG_v_k = m18315getTextFieldSelectionqeG_v_k(startOffset, endOffset, textRangeM23015boximpl, isStartHandle, adjustment);
        if (!TextRange.m23020equalsimpl0(jM18315getTextFieldSelectionqeG_v_k, textFieldCharSequence.getSelection())) {
            boolean z9 = TextRange.m23026getReversedimpl(jM18315getTextFieldSelectionqeG_v_k) != TextRange.m23026getReversedimpl(textFieldCharSequence.getSelection()) && TextRange.m23020equalsimpl0(TextRangeKt.TextRange(TextRange.m23022getEndimpl(jM18315getTextFieldSelectionqeG_v_k), TextRange.m23027getStartimpl(jM18315getTextFieldSelectionqeG_v_k)), textFieldCharSequence.getSelection());
            if (isInTouchMode() && !z9 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21714getTextHandleMove5zf0vsI());
            }
        }
        return jM18315getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    public static /* synthetic */ long m18320updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i10, int i11, boolean z9, SelectionAdjustment selectionAdjustment, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z10 = false;
        }
        if ((i12 & 64) != 0) {
            z11 = false;
        }
        return textFieldSelectionState.m18319updateSelectionSsLRf8(textFieldCharSequence, i10, i11, z9, selectionAdjustment, z10, z11);
    }

    public final void autofill() {
        Function0<Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean canAutofill() {
        return getEditable() && TextRange.m23021getCollapsedimpl(this.textFieldState.getVisualText().getSelection());
    }

    public final boolean canCopy() {
        return (TextRange.m23021getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || this.isPassword) ? false : true;
    }

    public final boolean canCut() {
        return (TextRange.m23021getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || !getEditable() || this.isPassword) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canPaste(kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18261
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r8)
            goto L91
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7.getEditable()
            if (r8 != 0) goto L4c
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r8
        L4c:
            androidx.compose.ui.platform.Clipboard r8 = r7.clipboard
            if (r8 == 0) goto L6a
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L5b
            goto L90
        L5b:
            r2 = r7
        L5c:
            androidx.compose.ui.platform.ClipEntry r8 = (androidx.compose.p013ui.platform.ClipEntry) r8
            if (r8 == 0) goto L68
            boolean r8 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.hasText(r8)
            if (r8 != r5) goto L68
            r8 = r5
            goto L6c
        L68:
            r8 = r4
            goto L6c
        L6a:
            r2 = r7
            goto L68
        L6c:
            if (r8 == 0) goto L73
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r8
        L73:
            kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> r8 = r2.receiveContentConfiguration
            r6 = 0
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r8.invoke()
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r8 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r8
            goto L80
        L7f:
            r8 = r6
        L80:
            if (r8 == 0) goto L97
            androidx.compose.ui.platform.Clipboard r8 = r2.clipboard
            if (r8 == 0) goto L94
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            r6 = r8
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.p013ui.platform.ClipEntry) r6
        L94:
            if (r6 == 0) goto L97
            r4 = r5
        L97:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.canPaste(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean canSelectAll() {
        return TextRange.m23023getLengthimpl(this.textFieldState.getVisualText().getSelection()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.INSTANCE;
        m18317setRawHandleDragPositionk4lQ0M(companion.m20750getUnspecifiedF1C5BW0());
        m18318setStartTextLayoutPositionInWindowk4lQ0M(companion.m20750getUnspecifiedF1C5BW0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copy(boolean r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18271
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r8 = r8.getVisualText()
            long r4 = r8.getSelection()
            boolean r2 = androidx.compose.p013ui.text.TextRange.m23021getCollapsedimpl(r4)
            if (r2 == 0) goto L4d
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4d:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r8 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r8)
            java.lang.String r8 = r8.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r8, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r8 = r6.clipboard
            if (r8 == 0) goto L71
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r6
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.setClipEntry(r2, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r0 = r6
        L72:
            if (r7 != 0) goto L77
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L77:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r7.collapseSelectionToMax()
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.copy(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C18282(pointerInputScope, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cut(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18291
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r7 = r7.getVisualText()
            long r4 = r7.getSelection()
            boolean r2 = androidx.compose.p013ui.text.TextRange.m23021getCollapsedimpl(r4)
            if (r2 == 0) goto L4b
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4b:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r7 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r7)
            java.lang.String r7 = r7.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r7, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r7 = r6.clipboard
            if (r7 == 0) goto L6d
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.setClipEntry(r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
        L6e:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r7.deleteSelectedText()
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cut(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void deselect() {
        if (!TextRange.m23021getCollapsedimpl(this.textFieldState.getVisualText().getSelection())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final Function0<Unit> function0, final Function0<Unit> function02, Continuation<? super Unit> continuation) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new C18412(mutableInteractionSource, this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m18334invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m18334invokek4lQ0M(long j10) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                function0.invoke();
                if (this.enabled && this.getIsFocused()) {
                    if (!this.readOnly) {
                        function02.invoke();
                        if (this.textFieldState.getVisualText().length() > 0) {
                            this.setShowCursorHandle(true);
                        }
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    long jM18253coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.textLayoutState.m18253coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j10);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.m18316placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m18260fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, jM18253coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, continuation);
        return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C18442(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    public final void dispose() {
        hideTextToolbar();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean includePosition) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z9 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && z9 && TextRange.m23021getCollapsedimpl(visualText.getSelection()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, includePosition ? getCursorRect().m20762getBottomCenterF1C5BW0() : Offset.INSTANCE.m20750getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.INSTANCE.getHidden();
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.INSTANCE.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m23021getCollapsedimpl(visualText.getSelection())) {
            return Rect.INSTANCE.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m23027getStartimpl(visualText.getSelection()));
        float fCoerceAtLeast = RangesKt.coerceAtLeast((float) Math.floor(this.density.mo17332toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
        float f10 = fCoerceAtLeast / 2;
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? cursorRect.getLeft() + (fCoerceAtLeast / 2) : cursorRect.getRight() - (fCoerceAtLeast / 2), ((int) (layoutResult.getSize() >> 32)) - f10), f10);
        float fFloor = ((int) fCoerceAtLeast) % 2 == 1 ? ((float) Math.floor(fCoerceAtLeast2)) + 0.5f : (float) Math.rint(fCoerceAtLeast2);
        return new Rect(fFloor - f10, cursorRect.getTop(), fFloor + f10, cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m18321getHandleDragPositionF1C5BW0() {
        return (m18313getRawHandleDragPositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.INSTANCE.m20750getUnspecifiedF1C5BW0() : (m18314getStartTextLayoutPositionInWindowF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m18260fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m18313getRawHandleDragPositionF1C5BW0()) : Offset.m20740plusMKHz9U(m18313getRawHandleDragPositionF1C5BW0(), Offset.m20739minusMKHz9U(m18314getStartTextLayoutPositionInWindowF1C5BW0(), m18311getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    public final Function0<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final Function0<Unit> getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getSelectionHandleState$foundation_release(boolean r15, boolean r16) {
        /*
            r14 = this;
            if (r15 == 0) goto L5
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionStart
            goto L7
        L5:
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionEnd
        L7:
            androidx.compose.foundation.text.input.internal.TextLayoutState r1 = r14.textLayoutState
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 != 0) goto L16
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L16:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r2 = r2.getVisualText()
            long r2 = r2.getSelection()
            boolean r4 = androidx.compose.p013ui.text.TextRange.m23021getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L2d:
            long r4 = r14.m18312getHandlePositiontuRUvjQ(r15)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r6 = r14.getDirectDragGestureInitiator()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r7 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L57
            androidx.compose.foundation.text.Handle r6 = r14.getDraggingHandle()
            if (r6 == r0) goto L55
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L52
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L52
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m18439containsInclusiveUv8p0NA(r0, r4)
            goto L53
        L52:
            r0 = r9
        L53:
            if (r0 == 0) goto L57
        L55:
            r0 = r8
            goto L58
        L57:
            r0 = r9
        L58:
            if (r0 != 0) goto L61
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L61:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
            boolean r0 = r0.shouldShowSelection()
            if (r0 != 0) goto L74
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L74:
            if (r15 == 0) goto L7b
            int r0 = androidx.compose.p013ui.text.TextRange.m23027getStartimpl(r2)
            goto L84
        L7b:
            int r0 = androidx.compose.p013ui.text.TextRange.m23022getEndimpl(r2)
            int r0 = r0 - r8
            int r0 = java.lang.Math.max(r0, r9)
        L84:
            androidx.compose.ui.text.style.ResolvedTextDirection r11 = r1.getBidiRunDirection(r0)
            boolean r12 = androidx.compose.p013ui.text.TextRange.m23026getReversedimpl(r2)
            if (r16 == 0) goto La0
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L9e
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L9e
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m18259coerceIn3MmeM6k(r4, r0)
        L9e:
            r8 = r4
            goto La7
        La0:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p013ui.geometry.Offset.INSTANCE
            long r4 = r0.m20750getUnspecifiedF1C5BW0()
            goto L9e
        La7:
            if (r15 == 0) goto Lae
            int r15 = androidx.compose.p013ui.text.TextRange.m23027getStartimpl(r2)
            goto Lb2
        Lae:
            int r15 = androidx.compose.p013ui.text.TextRange.m23022getEndimpl(r2)
        Lb2:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState
            float r10 = androidx.compose.foundation.text.TextLayoutHelperKt.getLineHeight(r1, r15)
            r13 = 0
            r7 = 1
            r6.<init>(r7, r8, r10, r11, r12, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.getSelectionHandleState$foundation_release(boolean, boolean):androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState");
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (r4.pasteAsPlainText(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (pasteAsPlainText(r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object paste(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18501
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lb9
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.L$1
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            kotlin.ResultKt.throwOnFailure(r13)
            goto L6c
        L44:
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lc5
        L49:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> r13 = r12.receiveContentConfiguration
            if (r13 == 0) goto Lbc
            java.lang.Object r13 = r13.invoke()
            r2 = r13
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            if (r2 != 0) goto L5a
            goto Lbc
        L5a:
            androidx.compose.ui.platform.Clipboard r13 = r12.clipboard
            if (r13 == 0) goto Laa
            r0.L$0 = r12
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r13 = r13.getClipEntry(r0)
            if (r13 != r1) goto L6b
            goto Lc4
        L6b:
            r4 = r12
        L6c:
            r6 = r13
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.p013ui.platform.ClipEntry) r6
            if (r6 != 0) goto L72
            goto Lab
        L72:
            androidx.compose.ui.platform.ClipMetadata r7 = r6.getClipMetadata()
            androidx.compose.foundation.content.ReceiveContentListener r13 = r2.getReceiveContentListener()
            androidx.compose.foundation.content.TransferableContent$Source$Companion r0 = androidx.compose.foundation.content.TransferableContent.Source.INSTANCE
            int r8 = r0.m17291getClipboardkB6V9T0()
            androidx.compose.foundation.content.TransferableContent r5 = new androidx.compose.foundation.content.TransferableContent
            r10 = 8
            r11 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.content.TransferableContent r13 = r13.onReceive(r5)
            if (r13 == 0) goto La7
            androidx.compose.ui.platform.ClipEntry r13 = r13.getClipEntry()
            if (r13 == 0) goto La7
            java.lang.String r6 = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(r13)
            if (r6 == 0) goto La7
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = r4.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r8 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r10 = 10
            r11 = 0
            r7 = 0
            r9 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r5, r6, r7, r8, r9, r10, r11)
        La7:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Laa:
            r4 = r12
        Lab:
            r13 = 0
            r0.L$0 = r13
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r13 = r4.pasteAsPlainText(r0)
            if (r13 != r1) goto Lb9
            goto Lc4
        Lb9:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Lbc:
            r0.label = r5
            java.lang.Object r13 = r12.pasteAsPlainText(r0)
            if (r13 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z9, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C18522(pointerInputScope, z9, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator.setValue(inputType);
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public final void setFocused(boolean z9) {
        this.isFocused = z9;
    }

    public final void setInTouchMode(boolean z9) {
        this.isInTouchMode.setValue(Boolean.valueOf(z9));
    }

    public final void setReceiveContentConfiguration(Function0<? extends ReceiveContentConfiguration> function0) {
        this.receiveContentConfiguration = function0;
    }

    public final void setRequestAutofillAction(Function0<Unit> function0) {
        this.requestAutofillAction = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startToolbarAndHandlesVisibilityObserver(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18531
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r6 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L5b
            r0.hideTextToolbar()
        L5b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L6e
            r0.hideTextToolbar()
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.startToolbarAndHandlesVisibilityObserver(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objSelectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return objSelectionGesturePointerInputBtf2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSelectionGesturePointerInputBtf2 : Unit.INSTANCE;
    }

    public final void update(HapticFeedback hapticFeedBack, Clipboard clipboard, TextToolbarHandler showTextToolbar, Density density, boolean enabled, boolean readOnly, boolean isPassword) {
        if (!enabled) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboard = clipboard;
        this.textToolbarHandler = showTextToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.isPassword = isPassword;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m18322updateHandleDraggingUv8p0NA(Handle handle, long position) {
        setDraggingHandle(handle);
        m18317setRawHandleDragPositionk4lQ0M(position);
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }
}
