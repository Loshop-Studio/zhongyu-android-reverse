package androidx.compose.foundation.text.input.internal.selection;

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
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0006¾\u0001¿\u0001À\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010!\u001a\u00020\u001d*\u00020 H\u0086@¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u00020\u001d*\u00020 2\u0006\u0010#\u001a\u00020\bH\u0086@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\u001d*\u00020 H\u0086@¢\u0006\u0004\b.\u0010\"J:\u00104\u001a\u00020\u001d*\u00020 2\b\u00100\u001a\u0004\u0018\u00010/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d01H\u0086@¢\u0006\u0004\b4\u00105J\"\u00106\u001a\u00020\u001d*\u00020 2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d01H\u0086@¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u00109J \u0010A\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u001d¢\u0006\u0004\bB\u0010-J\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u001dH\u0086@¢\u0006\u0004\bE\u0010'J\r\u0010F\u001a\u00020\b¢\u0006\u0004\bF\u0010DJ\u001a\u0010H\u001a\u00020\u001d2\b\b\u0002\u0010G\u001a\u00020\bH\u0086@¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\bH\u0086@¢\u0006\u0004\bJ\u0010'J\u0010\u0010K\u001a\u00020\u001dH\u0086@¢\u0006\u0004\bK\u0010'J\r\u0010L\u001a\u00020\b¢\u0006\u0004\bL\u0010DJ\r\u0010M\u001a\u00020\u001d¢\u0006\u0004\bM\u0010-J\r\u0010N\u001a\u00020\b¢\u0006\u0004\bN\u0010DJ\r\u0010O\u001a\u00020\u001d¢\u0006\u0004\bO\u0010-J\r\u0010P\u001a\u00020\u001d¢\u0006\u0004\bP\u0010-J\u000f\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010DJ\u001a\u0010U\u001a\u00020\b2\u0006\u0010R\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u0014\u0010V\u001a\u00020\u001d*\u00020 H\u0082@¢\u0006\u0004\bV\u0010\"J\u001c\u0010W\u001a\u00020\u001d*\u00020 2\u0006\u0010#\u001a\u00020\bH\u0082@¢\u0006\u0004\bW\u0010%J\u0010\u0010X\u001a\u00020\u001dH\u0082@¢\u0006\u0004\bX\u0010'J\u0010\u0010Y\u001a\u00020\u001dH\u0082@¢\u0006\u0004\bY\u0010'J\u000f\u0010Z\u001a\u00020\u0014H\u0002¢\u0006\u0004\bZ\u0010\u0016J\u001d\u0010]\u001a\u00020=2\u0006\u0010#\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020\u001dH\u0002¢\u0006\u0004\b^\u0010-J\u0010\u0010_\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b_\u0010'J\u000f\u0010`\u001a\u00020\u001dH\u0002¢\u0006\u0004\b`\u0010-JQ\u0010m\u001a\u00020j2\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010#\u001a\u00020\b2\u0006\u0010g\u001a\u00020f2\b\b\u0002\u0010h\u001a\u00020\b2\b\b\u0002\u0010i\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ<\u0010s\u001a\u00020j2\u0006\u0010n\u001a\u00020c2\u0006\u0010o\u001a\u00020c2\b\u0010p\u001a\u0004\u0018\u00010j2\u0006\u0010#\u001a\u00020\b2\u0006\u0010g\u001a\u00020fH\u0002ø\u0001\u0000¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010uR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010wR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010wR\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010w\u001a\u0004\b\u000b\u0010D\"\u0004\bx\u0010yR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010wR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010}R/\u0010\u0081\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010D\"\u0005\b\u0082\u0001\u0010yR1\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R4\u0010\u008a\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u0001\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0084\u0001\u001a\u0006\b\u008b\u0001\u0010\u0086\u0001\"\u0006\b\u008c\u0001\u0010\u0088\u0001R8\u0010\u0092\u0001\u001a\u00020=2\u0006\u0010~\u001a\u00020=8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0080\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R8\u0010\u0096\u0001\u001a\u00020=2\u0006\u0010~\u001a\u00020=8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0080\u0001\u001a\u0006\b\u0094\u0001\u0010\u008f\u0001\"\u0006\b\u0095\u0001\u0010\u0091\u0001R6\u0010\u009c\u0001\u001a\u0004\u0018\u00010;2\b\u0010~\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0080\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R4\u0010£\u0001\u001a\u00030\u009d\u00012\u0007\u0010~\u001a\u00030\u009d\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0080\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R0\u0010§\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0006\b¤\u0001\u0010\u0080\u0001\u001a\u0005\b¥\u0001\u0010D\"\u0005\b¦\u0001\u0010yR0\u0010)\u001a\u00020(2\u0006\u0010~\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b¨\u0001\u0010\u0080\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0005\b«\u0001\u0010+R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010µ\u0001\u001a\u00020=8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b´\u0001\u0010\u008f\u0001R\u001d\u0010·\u0001\u001a\u00020=8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¶\u0001\u0010\u008f\u0001R\u001a\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0016\u0010½\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Á\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/Density;", "density", "", "enabled", "readOnly", "isFocused", "isPassword", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "includePosition", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getCursorHandleState$foundation_release", "(Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getCursorHandleState", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "showTextToolbar", "Ld6/s;", "update", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;Landroidx/compose/ui/unit/Density;ZZZ)V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "cursorHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lh6/c;)Ljava/lang/Object;", "isStartHandle", "selectionHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLh6/c;)Ljava/lang/Object;", "startToolbarAndHandlesVisibilityObserver", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "updateTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "dispose", "()V", "detectTouchMode", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "detectTextFieldTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/a;Lr6/a;Lh6/c;)Ljava/lang/Object;", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/a;Lh6/c;)Ljava/lang/Object;", "getSelectionHandleState$foundation_release", "(ZZ)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getSelectionHandleState", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateHandleDragging", "clearHandleDragging", "canCut", "()Z", "cut", "canCopy", "cancelSelection", "copy", "(ZLh6/c;)Ljava/lang/Object;", "canPaste", "paste", "canSelectAll", "selectAll", "canAutofill", "autofill", "deselect", "isCursorHandleInVisibleBounds", TypedValues.CycleType.S_WAVE_OFFSET, "placeCursorAtNearestOffset-k-4lQ0M", "(J)Z", "placeCursorAtNearestOffset", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "observeTextChanges", "observeTextToolbarVisibility", "getContentRect", "getHandlePosition-tuRUvjQ", "(Z)J", "getHandlePosition", "markStartContentVisibleOffset", "pasteAsPlainText", "hideTextToolbar", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "textFieldCharSequence", "", "startOffset", "endOffset", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "allowPreviousSelectionCollapsed", "isStartOfSelection", "Landroidx/compose/ui/text/TextRange;", "updateSelection-SsL-Rf8", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "updateSelection", "rawStartOffset", "rawEndOffset", "previousSelection", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "getTextFieldSelection", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/ui/unit/Density;", "Z", "setFocused", "(Z)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "textToolbarHandler", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "Landroidx/compose/ui/platform/Clipboard;", "<set-?>", "isInTouchMode$delegate", "Landroidx/compose/runtime/MutableState;", "isInTouchMode", "setInTouchMode", "requestAutofillAction", "Lr6/a;", "getRequestAutofillAction", "()Lr6/a;", "setRequestAutofillAction", "(Lr6/a;)V", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "getReceiveContentConfiguration", "setReceiveContentConfiguration", "startTextLayoutPositionInWindow$delegate", "getStartTextLayoutPositionInWindow-F1C5BW0", "()J", "setStartTextLayoutPositionInWindow-k-4lQ0M", "(J)V", "startTextLayoutPositionInWindow", "rawHandleDragPosition$delegate", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "rawHandleDragPosition", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "directDragGestureInitiator$delegate", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "textToolbarState$delegate", "getTextToolbarState", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "setTextToolbarState", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousRawDragOffset", "I", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getHandleDragPosition-F1C5BW0", "handleDragPosition", "getCurrentTextLayoutPositionInWindow-F1C5BW0", "currentTextLayoutPositionInWindow", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutCoordinates", "getEditable", "editable", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1575:1\n85#2:1576\n113#2,2:1577\n85#2:1579\n113#2,2:1580\n85#2:1582\n113#2,2:1583\n85#2:1587\n113#2,2:1588\n85#2:1590\n113#2,2:1591\n85#2:1593\n113#2,2:1594\n85#2:1596\n113#2,2:1597\n278#3:1585\n278#3:1586\n30#3:1633\n30#3:1640\n273#3:1656\n273#3:1657\n1#4:1599\n602#5,8:1600\n54#6:1608\n85#7:1609\n53#7,3:1634\n70#7:1638\n53#7,3:1641\n70#7:1645\n60#7:1648\n60#7:1651\n70#7:1654\n722#8,23:1610\n69#9:1637\n69#9:1644\n65#9:1647\n65#9:1650\n69#9:1653\n22#10:1639\n22#10:1646\n22#10:1649\n22#10:1652\n22#10:1655\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n127#1:1576\n127#1:1577,2\n145#1:1579\n145#1:1580,2\n163#1:1582\n163#1:1583,2\n195#1:1587\n195#1:1588,2\n208#1:1590\n208#1:1591,2\n211#1:1593\n211#1:1594,2\n217#1:1596\n217#1:1597,2\n178#1:1585\n183#1:1586\n1145#1:1633\n1154#1:1640\n602#1:1656\n974#1:1657\n297#1:1600,8\n330#1:1608\n330#1:1609\n1145#1:1634,3\n1150#1:1638\n1154#1:1641,3\n1159#1:1645\n1162#1:1648\n1163#1:1651\n1165#1:1654\n544#1:1610,23\n1150#1:1637\n1159#1:1644\n1162#1:1647\n1163#1:1650\n1165#1:1653\n1150#1:1639\n1159#1:1646\n1162#1:1649\n1163#1:1652\n1165#1:1655\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;

    @Nullable
    private Clipboard clipboard;

    @NotNull
    private Density density;

    /* renamed from: directDragGestureInitiator$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState directDragGestureInitiator;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState draggingHandle;
    private boolean enabled;

    @Nullable
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private boolean isPassword;

    @Nullable
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;

    @Nullable
    private SelectionLayout previousSelectionLayout;

    /* renamed from: rawHandleDragPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState rawHandleDragPosition;
    private boolean readOnly;

    @Nullable
    private InterfaceC6469a receiveContentConfiguration;

    @Nullable
    private InterfaceC6469a requestAutofillAction;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showCursorHandle;

    /* renamed from: startTextLayoutPositionInWindow$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startTextLayoutPositionInWindow;

    @NotNull
    private final TransformedTextFieldState textFieldState;

    @NotNull
    private final TextLayoutState textLayoutState;

    @Nullable
    private TextToolbarHandler textToolbarHandler;

    /* renamed from: textToolbarState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState textToolbarState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "(Ljava/lang/String;I)V", "None", "Touch", "Mouse", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class InputType {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
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
            $ENTRIES = AbstractC5817a.m5310a(inputTypeArr$values);
        }

        private InputType(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    @Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Lkotlin/Function0;", "Ld6/s;", "requestFocus", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lr6/a;)V", "Landroidx/compose/ui/geometry/Offset;", "dragPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isStartOfSelection", "Landroidx/compose/ui/text/TextRange;", "updateSelection-r1Wruf4", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateSelection", "downPosition", "onStart-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onStart", "onDrag-3MmeM6k", "onDrag", "onDragDone", "()V", "onExtend-k-4lQ0M", "(J)Z", "onExtend", "onExtendDrag-k-4lQ0M", "onExtendDrag", "Lr6/a;", "", "dragBeginOffsetInText", "I", "dragBeginPosition", "J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n1#2:1576\n*E\n"})
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();

        @NotNull
        private final InterfaceC6469a requestFocus;

        public TextFieldMouseSelectionObserver(@NotNull InterfaceC6469a interfaceC6469a) {
            this.requestFocus = interfaceC6469a;
        }

        /* renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m7940updateSelectionr1Wruf4(long dragPosition, SelectionAdjustment adjustment, boolean isStartOfSelection) {
            Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m7872getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int iM7872getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m7872getOffsetForPosition3MmeM6k(dragPosition, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM7936updateSelectionSsLRf8 = textFieldSelectionState.m7936updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), iIntValue, iM7872getOffsetForPosition3MmeM6k, false, adjustment, false, isStartOfSelection);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m12764getCollapsedimpl(jM7936updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m12770getStartimpl(jM7936updateSelectionSsLRf8);
            }
            if (TextRange.m12769getReversedimpl(jM7936updateSelectionSsLRf8)) {
                jM7936updateSelectionSsLRf8 = TextFieldSelectionStateKt.m7958reverse5zctL8(jM7936updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m7889selectCharsIn5zctL8(jM7936updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return jM7936updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo7941onDrag3MmeM6k(final long dragPosition, @NotNull SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m10449toStringimpl(dragPosition));
                }
            });
            m7940updateSelectionr1Wruf4(dragPosition, adjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo7942onExtendk4lQ0M(long downPosition) {
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo7943onExtendDragk4lQ0M(long dragPosition) {
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo7944onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = downPosition;
            this.dragBeginOffsetInText = TextRange.m12770getStartimpl(m7940updateSelectionr1Wruf4(downPosition, adjustment, true));
            return true;
        }
    }

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "Lkotlin/Function0;", "Ld6/s;", "requestFocus", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lr6/a;)V", "onDragStop", "()V", "Landroidx/compose/ui/geometry/Offset;", "point", "onDown-k-4lQ0M", "(J)V", "onDown", "onUp", "onStop", "onCancel", "startPoint", "onStart-k-4lQ0M", "onStart", "delta", "onDrag-k-4lQ0M", "onDrag", "Lr6/a;", "", "dragBeginOffsetInText", "I", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "actingHandle", "Landroidx/compose/foundation/text/Handle;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n273#2:1576\n1#3:1577\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n*L\n770#1:1576\n*E\n"})
    public final class TextFieldTextDragObserver implements TextDragObserver {

        @NotNull
        private Handle actingHandle;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition;
        private long dragTotalDistance;

        @NotNull
        private final InterfaceC6469a requestFocus;

        public TextFieldTextDragObserver(@NotNull InterfaceC6469a interfaceC6469a) {
            this.requestFocus = interfaceC6469a;
            Offset.Companion companion = Offset.INSTANCE;
            this.dragBeginPosition = companion.m10456getUnspecifiedF1C5BW0();
            this.dragTotalDistance = companion.m10457getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // p152r6.InterfaceC6469a
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.INSTANCE;
                this.dragBeginPosition = companion.m10456getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m10457getZeroF1C5BW0();
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
        public void mo7692onDownk4lQ0M(long point) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo7693onDragk4lQ0M(long delta) {
            int iIntValue;
            int iM7872getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            Handle handle;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return;
            }
            long jM10446plusMKHz9U = Offset.m10446plusMKHz9U(this.dragTotalDistance, delta);
            this.dragTotalDistance = jM10446plusMKHz9U;
            final long jM10446plusMKHz9U2 = Offset.m10446plusMKHz9U(this.dragBeginPosition, jM10446plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.m10449toStringimpl(jM10446plusMKHz9U2));
                }
            });
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.textLayoutState.m7873isPositionOnTextk4lQ0M(jM10446plusMKHz9U2)) {
                Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m7872getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                iM7872getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m7872getOffsetForPosition3MmeM6k(jM10446plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && iIntValue == iM7872getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = SelectionAdjustment.INSTANCE.getWord();
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                iIntValue = TextLayoutState.m7869getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                iM7872getOffsetForPosition3MmeM6k = TextLayoutState.m7869getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM10446plusMKHz9U2, false, 2, null);
                word = iIntValue == iM7872getOffsetForPosition3MmeM6k ? SelectionAdjustment.INSTANCE.getNone() : SelectionAdjustment.INSTANCE.getWord();
            }
            int i = iIntValue;
            int i8 = iM7872getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long selection = TextFieldSelectionState.this.textFieldState.getVisualText().getSelection();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM7937updateSelectionSsLRf8$default = TextFieldSelectionState.m7937updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i, i8, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m12764getCollapsedimpl(jM7937updateSelectionSsLRf8$default)) {
                this.dragBeginOffsetInText = TextRange.m12770getStartimpl(jM7937updateSelectionSsLRf8$default);
            }
            if (TextRange.m12769getReversedimpl(jM7937updateSelectionSsLRf8$default)) {
                jM7937updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m7958reverse5zctL8(jM7937updateSelectionSsLRf8$default);
            }
            if (!TextRange.m12763equalsimpl0(jM7937updateSelectionSsLRf8$default, selection)) {
                if (TextRange.m12770getStartimpl(jM7937updateSelectionSsLRf8$default) != TextRange.m12770getStartimpl(selection) && TextRange.m12765getEndimpl(jM7937updateSelectionSsLRf8$default) == TextRange.m12765getEndimpl(selection)) {
                    handle = Handle.SelectionStart;
                } else if (TextRange.m12770getStartimpl(jM7937updateSelectionSsLRf8$default) != TextRange.m12770getStartimpl(selection) || TextRange.m12765getEndimpl(jM7937updateSelectionSsLRf8$default) == TextRange.m12765getEndimpl(selection)) {
                    handle = ((float) (TextRange.m12765getEndimpl(jM7937updateSelectionSsLRf8$default) + TextRange.m12770getStartimpl(jM7937updateSelectionSsLRf8$default))) / 2.0f > ((float) (TextRange.m12765getEndimpl(selection) + TextRange.m12770getStartimpl(selection))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                this.actingHandle = handle;
            }
            if (TextRange.m12764getCollapsedimpl(selection) || !TextRange.m12764getCollapsedimpl(jM7937updateSelectionSsLRf8$default)) {
                TextFieldSelectionState.this.textFieldState.m7889selectCharsIn5zctL8(jM7937updateSelectionSsLRf8$default);
            }
            TextFieldSelectionState.this.m7939updateHandleDraggingUv8p0NA(this.actingHandle, jM10446plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-k-4lQ0M */
        public void mo7694onStartk4lQ0M(final long startPoint) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m10449toStringimpl(startPoint));
                    }
                });
                TextFieldSelectionState.this.m7939updateHandleDraggingUv8p0NA(this.actingHandle, startPoint);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = startPoint;
                this.dragTotalDistance = Offset.INSTANCE.m10457getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null) {
                    return;
                }
                if (!TextFieldSelectionState.this.textLayoutState.m7873isPositionOnTextk4lQ0M(startPoint)) {
                    int iM7869getOffsetForPosition3MmeM6k$default = TextLayoutState.m7869getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                    HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
                    }
                    TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(iM7869getOffsetForPosition3MmeM6k$default);
                    TextFieldSelectionState.this.setShowCursorHandle(true);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
                    return;
                }
                if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                    return;
                }
                int iM7869getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m7869getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                long jM7937updateSelectionSsLRf8$default = TextFieldSelectionState.m7937updateSelectionSsLRf8$default(textFieldSelectionState, new TextFieldCharSequence(textFieldSelectionState.textFieldState.getVisualText(), TextRange.INSTANCE.m12775getZerod9O1mEE(), null, null, null, 28, null), iM7869getOffsetForPosition3MmeM6k$default2, iM7869getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.INSTANCE.getWord(), false, false, 96, null);
                TextFieldSelectionState.this.textFieldState.m7889selectCharsIn5zctL8(jM7937updateSelectionSsLRf8$default);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                this.dragBeginOffsetInText = TextRange.m12770getStartimpl(jM7937updateSelectionSsLRf8$default);
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

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0}, m5305l = {1325, 1327}, m5306m = "canPaste", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 */
    public static final class C13861 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13861(InterfaceC5631c<? super C13861> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.canPaste(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0, 0}, m5305l = {1311}, m5306m = "copy", m5307n = {"this", "cancelSelection"}, m5308s = {"L$0", "Z$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 */
    public static final class C13871 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13871(InterfaceC5631c<? super C13871> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.copy(false, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/w0;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/w0;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2 */
    public static final class C13882 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {372}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutineSingletons) {
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

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {373}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this) == coroutineSingletons) {
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
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {375}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m7945invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m7945invokek4lQ0M(long j7) {
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
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC6471c, this, 7, null) == coroutineSingletons) {
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
                return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13882(PointerInputScope pointerInputScope, InterfaceC5631c<? super C13882> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C13882 c13882 = TextFieldSelectionState.this.new C13882(this.$this_cursorHandleGestures, interfaceC5631c);
            c13882.L$0 = obj;
            return c13882;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1);
            AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass2(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1);
            return AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6013w0> interfaceC5631c) {
            return ((C13882) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0}, m5305l = {1287}, m5306m = "cut", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 */
    public static final class C13891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13891(InterfaceC5631c<? super C13891> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.cut(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0, 0, 0}, m5305l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m5306m = "detectCursorHandleDragGestures", m5307n = {"this", "cursorDragStart", "cursorDragDelta"}, m5308s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 */
    public static final class C13901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13901(InterfaceC5631c<? super C13901> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0, 0, 0, 0}, m5305l = {984}, m5306m = "detectSelectionHandleDragGestures", m5307n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, m5308s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 */
    public static final class C13951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C13951(InterfaceC5631c<? super C13951> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {489}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2 */
    public static final class C14012 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14012(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super C14012> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.$interactionSource = mutableInteractionSource;
            this.this$0 = textFieldSelectionState;
        }

        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m7954invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m10451unboximpl(), (InterfaceC5631c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m7954invoked4ec7I(PressGestureScope pressGestureScope, long j7, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C14012 c14012 = new C14012(this.$interactionSource, this.this$0, interfaceC5631c);
            c14012.L$0 = pressGestureScope;
            c14012.J$0 = j7;
            return c14012.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j7 = this.J$0;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.this$0, j7, mutableInteractionSource, null);
                    this.label = 1;
                    if (AbstractC6014x.m5637h(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", m5303f = "TextFieldSelectionState.kt", m5304i = {0}, m5305l = {453}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2 */
    public static final class C14042 extends RestrictedSuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        public C14042(InterfaceC5631c<? super C14042> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C14042 c14042 = TextFieldSelectionState.this.new C14042(interfaceC5631c);
            c14042.L$0 = obj;
            return c14042;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C14042) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r5)
                goto L2e
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.AbstractC5774b.m5119b(r5)
                java.lang.Object r5 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                r1 = r5
            L21:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p011ui.input.pointer.PointerEvent) r5
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                r5 = r5 ^ r2
                r3.setInTouchMode(r5)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14042.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 */
    public /* synthetic */ class C14063 extends FunctionReferenceImpl implements InterfaceC6473e {
        public static final C14063 INSTANCE = new C14063();

        public C14063() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // p152r6.InterfaceC6473e
        public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {1, 1}, m5305l = {1332, 1334, 1334}, m5306m = "paste", m5307n = {"this", "receiveContentConfiguration"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 */
    public static final class C14101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14101(InterfaceC5631c<? super C14101> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.paste(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0}, m5305l = {1365}, m5306m = "pasteAsPlainText", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 */
    public static final class C14111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14111(InterfaceC5631c<? super C14111> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.pasteAsPlainText(this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/w0;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/w0;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 */
    public static final class C14122 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {392}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutineSingletons) {
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

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {394}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z8, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    final boolean z8 = this.$isStartHandle;
                    TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                        /* renamed from: onEvent-k-4lQ0M */
                        public final void mo7909onEventk4lQ0M(long j7) {
                            textFieldSelectionState.markStartContentVisibleOffset();
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            boolean z9 = z8;
                            textFieldSelectionState2.m7939updateHandleDraggingUv8p0NA(z9 ? Handle.SelectionStart : Handle.SelectionEnd, SelectionHandlesKt.m8031getAdjustedCoordinatesk4lQ0M(textFieldSelectionState2.m7929getHandlePositiontuRUvjQ(z9)));
                        }
                    };
                    final TextFieldSelectionState textFieldSelectionState2 = this.this$0;
                    InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7956invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7956invoke() {
                            textFieldSelectionState2.clearHandleDragging();
                        }
                    };
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, interfaceC6469a, this) == coroutineSingletons) {
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
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {411}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z8, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    boolean z8 = this.$isStartHandle;
                    this.label = 1;
                    if (textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z8, this) == coroutineSingletons) {
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
                return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14122(PointerInputScope pointerInputScope, boolean z8, InterfaceC5631c<? super C14122> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C14122 c14122 = TextFieldSelectionState.this.new C14122(this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC5631c);
            c14122.L$0 = obj;
            return c14122;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_selectionHandleGestures, null), 1);
            AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass2(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1);
            return AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new AnonymousClass3(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6013w0> interfaceC5631c) {
            return ((C14122) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m5303f = "TextFieldSelectionState.kt", m5304i = {0}, m5305l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m5306m = "startToolbarAndHandlesVisibilityObserver", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 */
    public static final class C14131 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14131(InterfaceC5631c<? super C14131> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.startToolbarAndHandlesVisibilityObserver(this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/w0;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/w0;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 */
    public static final class C14142 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextChanges(this) == coroutineSingletons) {
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

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", m5303f = "TextFieldSelectionState.kt", m5304i = {}, m5305l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.this$0, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextToolbarVisibility(this) == coroutineSingletons) {
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
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        public C14142(InterfaceC5631c<? super C14142> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C14142 c14142 = TextFieldSelectionState.this.new C14142(interfaceC5631c);
            c14142.L$0 = obj;
            return c14142;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3);
            return AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass2(TextFieldSelectionState.this, null), 3);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6013w0> interfaceC5631c) {
            return ((C14142) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public TextFieldSelectionState(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull Density density, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z8;
        this.readOnly = z9;
        this.isFocused = z10;
        this.isPassword = z11;
        Offset.Companion companion = Offset.INSTANCE;
        this.startTextLayoutPositionInWindow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(companion.m10456getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(companion.m10456getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.textToolbarState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState textFieldSelectionState, boolean z8, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return textFieldSelectionState.copy(z8, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.p011ui.input.pointer.PointerInputScope r9, p075h6.InterfaceC5631c<? super p045d6.C5443s> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13901
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13901) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3a
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref$LongRef) r9
            java.lang.Object r0 = r6.L$1
            r1 = r0
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r0 = r6.L$0
            r2 = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.lang.Throwable -> L37
            goto L85
        L37:
            r0 = move-exception
            r10 = r0
            goto L91
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            kotlin.AbstractC5774b.m5119b(r10)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.p011ui.geometry.Offset.INSTANCE
            long r3 = r1.m10456getUnspecifiedF1C5BW0()
            r10.element = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            long r3 = r1.m10456getUnspecifiedF1C5BW0()
            r7.element = r3
            r1 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L8b
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L8b
            r6.L$1 = r10     // Catch: java.lang.Throwable -> L8b
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L8b
            r6.label = r1     // Catch: java.lang.Throwable -> L8b
            r1 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8b
            if (r9 != r0) goto L82
            return r0
        L82:
            r2 = r8
            r1 = r10
            r9 = r7
        L85:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            d6.s r9 = p045d6.C5443s.f8405a
            return r9
        L8b:
            r0 = move-exception
            r9 = r0
            r2 = r8
            r1 = r10
            r10 = r9
            r9 = r7
        L91:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((ref$LongRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            Offset.Companion companion = Offset.INSTANCE;
            ref$LongRef.element = companion.m10456getUnspecifiedF1C5BW0();
            ref$LongRef2.element = companion.m10456getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.p011ui.input.pointer.PointerInputScope r15, final boolean r16, p075h6.InterfaceC5631c<? super p045d6.C5443s> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$6(Ref$LongRef ref$LongRef, TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef2) {
        if ((ref$LongRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.INSTANCE;
            ref$LongRef.element = companion.m10456getUnspecifiedF1C5BW0();
            ref$LongRef2.element = companion.m10457getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        float fIntBitsToFloat;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m12764getCollapsedimpl(visualText.getSelection())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m10481Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo12044localToRootMKHz9U(cursorRect3.m10476getTopLeftF1C5BW0()) : Offset.INSTANCE.m10457getZeroF1C5BW0(), cursorRect3.m10474getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo12044localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo12044localToRootMKHz9U(m7929getHandlePositiontuRUvjQ(true)) : Offset.INSTANCE.m10457getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo12044localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo12044localToRootMKHz9U(m7929getHandlePositiontuRUvjQ(false)) : Offset.INSTANCE.m10457getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fIntBitsToFloat2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates4.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m12770getStartimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L))) & 4294967295L));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates5.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m12765getEndimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect.getTop()) & 4294967295L))) & 4294967295L));
        }
        int i = (int) (jMo12044localToRootMKHz9U >> 32);
        int i8 = (int) (jMo12044localToRootMKHz9U2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i8)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U2 & 4294967295L))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m7928getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m7929getHandlePositiontuRUvjQ(boolean isStartHandle) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, isStartHandle ? TextRange.m12770getStartimpl(selection) : TextRange.m12765getEndimpl(selection), isStartHandle, TextRange.m12769getReversedimpl(selection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m7930getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition.getValue()).m10451unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m7931getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow.getValue()).m10451unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m7932getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.INSTANCE.m12775getZerod9O1mEE();
        }
        if (previousSelection == null && AbstractC5830k.m5325b(adjustment, SelectionAdjustment.INSTANCE.getCharacter())) {
            return TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
        }
        SelectionLayout selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m8034getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : TextRange.INSTANCE.m12775getZerod9O1mEE(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long jM8023toTextRanged9O1mEE = adjustment.adjust(selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA).m8023toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = isStartHandle ? rawStartOffset : rawEndOffset;
        return jM8023toTextRanged9O1mEE;
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
        InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM10468getBottomCenterF1C5BW0 = getCursorRect().m10468getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m8071containsInclusiveUv8p0NA(rectVisibleBounds, jM10468getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m7935setStartTextLayoutPositionInWindowk4lQ0M(m7928getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeTextChanges(p075h6.InterfaceC5631c<? super p045d6.C5443s> r5) {
        /*
            r4 = this;
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
            r0.<init>()
            kotlinx.coroutines.flow.f r0 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r0)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14063.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r1, r2)
            r2 = 2
            kotlin.jvm.internal.AbstractC5835p.m5354c(r2, r1)
            boolean r2 = r0 instanceof kotlinx.coroutines.flow.C5908e
            if (r2 == 0) goto L25
            r2 = r0
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C5908e) r2
            r2.getClass()
            r6.e r2 = r2.f9362b
            if (r2 != r1) goto L25
            kotlinx.coroutines.flow.e r0 = (kotlinx.coroutines.flow.C5908e) r0
            goto L2b
        L25:
            kotlinx.coroutines.flow.e r2 = new kotlinx.coroutines.flow.e
            r2.<init>(r0, r1)
            r0 = r2
        L2b:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            r1.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.k r3 = new kotlinx.coroutines.flow.k
            r3.<init>(r2, r1)
            java.lang.Object r5 = r0.collect(r3, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            d6.s r1 = p045d6.C5443s.f8405a
            if (r5 != r0) goto L45
            goto L46
        L45:
            r5 = r1
        L46:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r0) goto L4b
            return r5
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges(h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Rect invoke() {
                Rect rectIntersect;
                boolean zM12764getCollapsedimpl = TextRange.m12764getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getVisualText().getSelection());
                if (((!zM12764getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Cursor) && (zM12764getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Selection)) || TextFieldSelectionState.this.getDraggingHandle() != null || !TextFieldSelectionState.this.isInTouchMode()) {
                    return Rect.INSTANCE.getZero();
                }
                LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                if (rectVisibleBounds == null) {
                    return Rect.INSTANCE.getZero();
                }
                LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Offset offsetM10430boximpl = textLayoutCoordinates2 != null ? Offset.m10430boximpl(textLayoutCoordinates2.mo12044localToRootMKHz9U(rectVisibleBounds.m10476getTopLeftF1C5BW0())) : null;
                AbstractC5830k.m5327d(offsetM10430boximpl);
                Rect rectM10481Recttz77jQw = RectKt.m10481Recttz77jQw(offsetM10430boximpl.m10451unboximpl(), rectVisibleBounds.m10474getSizeNHjbRc());
                Rect contentRect = TextFieldSelectionState.this.getContentRect();
                Rect rect = rectM10481Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                return (rect == null || (rectIntersect = rect.intersect(rectM10481Recttz77jQw)) == null) ? Rect.INSTANCE.getZero() : rectIntersect;
            }
        }).collect(new InterfaceC5912g() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.3
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c2) {
                return emit((Rect) obj, (InterfaceC5631c<? super C5443s>) interfaceC5631c2);
            }

            public final Object emit(Rect rect, InterfaceC5631c<? super C5443s> interfaceC5631c2) {
                Object objShowTextToolbar;
                boolean zM5325b = AbstractC5830k.m5325b(rect, Rect.INSTANCE.getZero());
                C5443s c5443s = C5443s.f8405a;
                if (zM5325b) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextToolbarHandler textToolbarHandler = TextFieldSelectionState.this.textToolbarHandler;
                    if (textToolbarHandler != null && (objShowTextToolbar = textToolbarHandler.showTextToolbar(TextFieldSelectionState.this, rect, interfaceC5631c2)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objShowTextToolbar;
                    }
                }
                return c5443s;
            }
        }, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pasteAsPlainText(p075h6.InterfaceC5631c<? super p045d6.C5443s> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14111
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC5774b.m5119b(r12)
            goto L48
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            kotlin.AbstractC5774b.m5119b(r12)
            androidx.compose.ui.platform.Clipboard r12 = r11.clipboard
            if (r12 == 0) goto L5f
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.getClipEntry(r0)
            if (r12 != r1) goto L47
            return r1
        L47:
            r0 = r11
        L48:
            androidx.compose.ui.platform.ClipEntry r12 = (androidx.compose.p011ui.platform.ClipEntry) r12
            if (r12 == 0) goto L5f
            java.lang.String r5 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readText(r12)
            if (r5 != 0) goto L53
            goto L5f
        L53:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r4 = r0.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r7 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r9 = 10
            r10 = 0
            r6 = 0
            r8 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r4, r5, r6, r7, r8, r9, r10)
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.pasteAsPlainText(h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m7933placeCursorAtNearestOffsetk4lQ0M(long offset) {
        int iM12740getOffsetForPositionk4lQ0M;
        int iM12770getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (iM12740getOffsetForPositionk4lQ0M = layoutResult.m12740getOffsetForPositionk4lQ0M(offset)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jM7884mapFromTransformedjx7JFs = transformedTextFieldState.m7884mapFromTransformedjx7JFs(iM12740getOffsetForPositionk4lQ0M);
        long jM7887mapToTransformedGEjPoXI = transformedTextFieldState.m7887mapToTransformedGEjPoXI(jM7884mapFromTransformedjx7JFs);
        int i = WhenMappings.$EnumSwitchMapping$0[((TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) && TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? (!TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i == 1 || i == 2) {
            iM12770getStartimpl = TextRange.m12770getStartimpl(jM7884mapFromTransformedjx7JFs);
        } else if (i == 3) {
            selectionWedgeAffinity = MathUtilsKt.m7823findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m12770getStartimpl(jM7887mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m12765getEndimpl(jM7887mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            iM12770getStartimpl = TextRange.m12770getStartimpl(jM7884mapFromTransformedjx7JFs);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iM12770getStartimpl = MathUtilsKt.m7823findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m12770getStartimpl(jM7887mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m12765getEndimpl(jM7887mapToTransformedGEjPoXI))) < 0 ? TextRange.m12770getStartimpl(jM7884mapFromTransformedjx7JFs) : TextRange.m12765getEndimpl(jM7884mapFromTransformedjx7JFs);
        }
        long jTextRange = TextRangeKt.TextRange(iM12770getStartimpl);
        if (TextRange.m12763equalsimpl0(jTextRange, this.textFieldState.getUntransformedText().getSelection()) && (selectionWedgeAffinity == null || selectionWedgeAffinity.equals(this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m7890selectUntransformedCharsIn5zctL8(jTextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m7934setRawHandleDragPositionk4lQ0M(long j7) {
        this.rawHandleDragPosition.setValue(Offset.m10430boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z8) {
        this.showCursorHandle.setValue(Boolean.valueOf(z8));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m7935setStartTextLayoutPositionInWindowk4lQ0M(long j7) {
        this.startTextLayoutPositionInWindow.setValue(Offset.m10430boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m7936updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        HapticFeedback hapticFeedback;
        TextRange textRangeM12758boximpl = TextRange.m12758boximpl(textFieldCharSequence.getSelection());
        long packedValue = textRangeM12758boximpl.getPackedValue();
        if (isStartOfSelection || (!allowPreviousSelectionCollapsed && TextRange.m12764getCollapsedimpl(packedValue))) {
            textRangeM12758boximpl = null;
        }
        long jM7932getTextFieldSelectionqeG_v_k = m7932getTextFieldSelectionqeG_v_k(startOffset, endOffset, textRangeM12758boximpl, isStartHandle, adjustment);
        if (!TextRange.m12763equalsimpl0(jM7932getTextFieldSelectionqeG_v_k, textFieldCharSequence.getSelection())) {
            boolean z8 = TextRange.m12769getReversedimpl(jM7932getTextFieldSelectionqeG_v_k) != TextRange.m12769getReversedimpl(textFieldCharSequence.getSelection()) && TextRange.m12763equalsimpl0(TextRangeKt.TextRange(TextRange.m12765getEndimpl(jM7932getTextFieldSelectionqeG_v_k), TextRange.m12770getStartimpl(jM7932getTextFieldSelectionqeG_v_k)), textFieldCharSequence.getSelection());
            if (isInTouchMode() && !z8 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
            }
        }
        return jM7932getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    public static /* synthetic */ long m7937updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i, int i8, boolean z8, SelectionAdjustment selectionAdjustment, boolean z9, boolean z10, int i9, Object obj) {
        if ((i9 & 32) != 0) {
            z9 = false;
        }
        if ((i9 & 64) != 0) {
            z10 = false;
        }
        return textFieldSelectionState.m7936updateSelectionSsLRf8(textFieldCharSequence, i, i8, z8, selectionAdjustment, z9, z10);
    }

    public final void autofill() {
        InterfaceC6469a interfaceC6469a = this.requestAutofillAction;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
    }

    public final boolean canAutofill() {
        return getEditable() && TextRange.m12764getCollapsedimpl(this.textFieldState.getVisualText().getSelection());
    }

    public final boolean canCopy() {
        return (TextRange.m12764getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || this.isPassword) ? false : true;
    }

    public final boolean canCut() {
        return (TextRange.m12764getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || !getEditable() || this.isPassword) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canPaste(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13861
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13861) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC5774b.m5119b(r8)
            goto L8b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.AbstractC5774b.m5119b(r8)
            goto L58
        L3c:
            kotlin.AbstractC5774b.m5119b(r8)
            boolean r8 = r7.getEditable()
            if (r8 != 0) goto L48
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L48:
            androidx.compose.ui.platform.Clipboard r8 = r7.clipboard
            if (r8 == 0) goto L66
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L57
            goto L8a
        L57:
            r2 = r7
        L58:
            androidx.compose.ui.platform.ClipEntry r8 = (androidx.compose.p011ui.platform.ClipEntry) r8
            if (r8 == 0) goto L64
            boolean r8 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.hasText(r8)
            if (r8 != r5) goto L64
            r8 = r5
            goto L68
        L64:
            r8 = r4
            goto L68
        L66:
            r2 = r7
            goto L64
        L68:
            if (r8 == 0) goto L6d
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L6d:
            r6.a r8 = r2.receiveContentConfiguration
            r6 = 0
            if (r8 == 0) goto L79
            java.lang.Object r8 = r8.invoke()
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r8 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r8
            goto L7a
        L79:
            r8 = r6
        L7a:
            if (r8 == 0) goto L91
            androidx.compose.ui.platform.Clipboard r8 = r2.clipboard
            if (r8 == 0) goto L8e
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r6 = r8
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.p011ui.platform.ClipEntry) r6
        L8e:
            if (r6 == 0) goto L91
            r4 = r5
        L91:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.canPaste(h6.c):java.lang.Object");
    }

    public final boolean canSelectAll() {
        return TextRange.m12766getLengthimpl(this.textFieldState.getVisualText().getSelection()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.INSTANCE;
        m7934setRawHandleDragPositionk4lQ0M(companion.m10456getUnspecifiedF1C5BW0());
        m7935setStartTextLayoutPositionInWindowk4lQ0M(companion.m10456getUnspecifiedF1C5BW0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copy(boolean r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13871
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            d6.s r4 = p045d6.C5443s.f8405a
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC5774b.m5119b(r9)
            goto L70
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.AbstractC5774b.m5119b(r9)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r9 = r7.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r9 = r9.getVisualText()
            long r5 = r9.getSelection()
            boolean r2 = androidx.compose.p011ui.text.TextRange.m12764getCollapsedimpl(r5)
            if (r2 == 0) goto L4b
            return r4
        L4b:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r9 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r9)
            java.lang.String r9 = r9.toString()
            r5 = 2
            r6 = 0
            r2.<init>(r9, r6, r5, r6)
            androidx.compose.ui.platform.Clipboard r9 = r7.clipboard
            if (r9 == 0) goto L6f
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r7
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.setClipEntry(r2, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r7
        L70:
            if (r8 != 0) goto L73
            return r4
        L73:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r0.textFieldState
            r8.collapseSelectionToMax()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.copy(boolean, h6.c):java.lang.Object");
    }

    @Nullable
    public final Object cursorHandleGestures(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C13882(pointerInputScope, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cut(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13891
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C13891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC5774b.m5119b(r8)
            goto L6c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.AbstractC5774b.m5119b(r8)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r7.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r8 = r8.getVisualText()
            long r5 = r8.getSelection()
            boolean r2 = androidx.compose.p011ui.text.TextRange.m12764getCollapsedimpl(r5)
            if (r2 == 0) goto L49
            return r3
        L49:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r8 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r8)
            java.lang.String r8 = r8.toString()
            r5 = 2
            r6 = 0
            r2.<init>(r8, r6, r5, r6)
            androidx.compose.ui.platform.Clipboard r8 = r7.clipboard
            if (r8 == 0) goto L6b
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.setClipEntry(r2, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            r0 = r7
        L6c:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r0.textFieldState
            r8.deleteSelectedText()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cut(h6.c):java.lang.Object");
    }

    public final void deselect() {
        if (!TextRange.m12764getCollapsedimpl(this.textFieldState.getVisualText().getSelection())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    @Nullable
    public final Object detectTextFieldTapGestures(@NotNull PointerInputScope pointerInputScope, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull final InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new C14012(mutableInteractionSource, this, null), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7955invokek4lQ0M(((Offset) obj).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m7955invokek4lQ0M(long j7) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1
                    @Override // p152r6.InterfaceC6469a
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                interfaceC6469a.invoke();
                if (this.enabled && this.getIsFocused()) {
                    if (!this.readOnly) {
                        interfaceC6469a2.invoke();
                        if (this.textFieldState.getVisualText().length() > 0) {
                            this.setShowCursorHandle(true);
                        }
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    long jM7870coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.textLayoutState.m7870coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j7);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.m7933placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m7877fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, jM7870coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, interfaceC5631c);
        return objDetectTapAndPress == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapAndPress : C5443s.f8405a;
    }

    @Nullable
    public final Object detectTouchMode(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C14042(null), interfaceC5631c);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : C5443s.f8405a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    @NotNull
    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean includePosition) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z8 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && z8 && TextRange.m12764getCollapsedimpl(visualText.getSelection()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, includePosition ? getCursorRect().m10468getBottomCenterF1C5BW0() : Offset.INSTANCE.m10456getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.INSTANCE.getHidden();
    }

    @NotNull
    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.INSTANCE.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m12764getCollapsedimpl(visualText.getSelection())) {
            return Rect.INSTANCE.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m12770getStartimpl(visualText.getSelection()));
        float fFloor = (float) Math.floor(this.density.mo6903toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        float left = layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? (fFloor / 2) + cursorRect.getLeft() : cursorRect.getRight() - (fFloor / 2);
        float f = fFloor / 2;
        float size = ((int) (layoutResult.getSize() >> 32)) - f;
        if (left > size) {
            left = size;
        }
        if (left < f) {
            left = f;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(left)) + 0.5f : (float) Math.rint(left);
        return new Rect(fFloor2 - f, cursorRect.getTop(), fFloor2 + f, cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m7938getHandleDragPositionF1C5BW0() {
        return (m7930getRawHandleDragPositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.INSTANCE.m10456getUnspecifiedF1C5BW0() : (m7931getStartTextLayoutPositionInWindowF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m7877fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m7930getRawHandleDragPositionF1C5BW0()) : Offset.m10446plusMKHz9U(m7930getRawHandleDragPositionF1C5BW0(), Offset.m10445minusMKHz9U(m7931getStartTextLayoutPositionInWindowF1C5BW0(), m7928getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    @Nullable
    public final InterfaceC6469a getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    @Nullable
    public final InterfaceC6469a getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @org.jetbrains.annotations.NotNull
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
            boolean r4 = androidx.compose.p011ui.text.TextRange.m12764getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L2d:
            long r4 = r14.m7929getHandlePositiontuRUvjQ(r15)
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
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m8071containsInclusiveUv8p0NA(r0, r4)
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
            int r0 = androidx.compose.p011ui.text.TextRange.m12770getStartimpl(r2)
            goto L84
        L7b:
            int r0 = androidx.compose.p011ui.text.TextRange.m12765getEndimpl(r2)
            int r0 = r0 - r8
            int r0 = java.lang.Math.max(r0, r9)
        L84:
            androidx.compose.ui.text.style.ResolvedTextDirection r11 = r1.getBidiRunDirection(r0)
            boolean r12 = androidx.compose.p011ui.text.TextRange.m12769getReversedimpl(r2)
            if (r16 == 0) goto La0
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L9e
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L9e
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m7876coerceIn3MmeM6k(r4, r0)
        L9e:
            r8 = r4
            goto La7
        La0:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p011ui.geometry.Offset.INSTANCE
            long r4 = r0.m10456getUnspecifiedF1C5BW0()
            goto L9e
        La7:
            if (r15 == 0) goto Lae
            int r15 = androidx.compose.p011ui.text.TextRange.m12770getStartimpl(r2)
            goto Lb2
        Lae:
            int r15 = androidx.compose.p011ui.text.TextRange.m12765getEndimpl(r2)
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object paste(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14101
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            d6.s r6 = p045d6.C5443s.f8405a
            if (r2 == 0) goto L49
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.AbstractC5774b.m5119b(r15)
            goto Lb7
        L30:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L38:
            java.lang.Object r2 = r0.L$1
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            kotlin.AbstractC5774b.m5119b(r15)
            goto L6c
        L44:
            kotlin.AbstractC5774b.m5119b(r15)
            goto Lc1
        L49:
            kotlin.AbstractC5774b.m5119b(r15)
            r6.a r15 = r14.receiveContentConfiguration
            if (r15 == 0) goto Lb8
            java.lang.Object r15 = r15.invoke()
            r2 = r15
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            if (r2 != 0) goto L5a
            goto Lb8
        L5a:
            androidx.compose.ui.platform.Clipboard r15 = r14.clipboard
            if (r15 == 0) goto La8
            r0.L$0 = r14
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r15 = r15.getClipEntry(r0)
            if (r15 != r1) goto L6b
            goto Lc0
        L6b:
            r4 = r14
        L6c:
            r8 = r15
            androidx.compose.ui.platform.ClipEntry r8 = (androidx.compose.p011ui.platform.ClipEntry) r8
            if (r8 != 0) goto L72
            goto La9
        L72:
            androidx.compose.ui.platform.ClipMetadata r9 = r8.getClipMetadata()
            androidx.compose.foundation.content.ReceiveContentListener r15 = r2.getReceiveContentListener()
            androidx.compose.foundation.content.TransferableContent$Source$Companion r0 = androidx.compose.foundation.content.TransferableContent.Source.INSTANCE
            int r10 = r0.m6860getClipboardkB6V9T0()
            androidx.compose.foundation.content.TransferableContent r7 = new androidx.compose.foundation.content.TransferableContent
            r12 = 8
            r13 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            androidx.compose.foundation.content.TransferableContent r15 = r15.onReceive(r7)
            if (r15 == 0) goto La7
            androidx.compose.ui.platform.ClipEntry r15 = r15.getClipEntry()
            if (r15 == 0) goto La7
            java.lang.String r8 = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(r15)
            if (r8 == 0) goto La7
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r4.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r10 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r12 = 10
            r13 = 0
            r9 = 0
            r11 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r7, r8, r9, r10, r11, r12, r13)
        La7:
            return r6
        La8:
            r4 = r14
        La9:
            r15 = 0
            r0.L$0 = r15
            r0.L$1 = r15
            r0.label = r3
            java.lang.Object r15 = r4.pasteAsPlainText(r0)
            if (r15 != r1) goto Lb7
            goto Lc0
        Lb7:
            return r6
        Lb8:
            r0.label = r5
            java.lang.Object r15 = r14.pasteAsPlainText(r0)
            if (r15 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste(h6.c):java.lang.Object");
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    @Nullable
    public final Object selectionHandleGestures(@NotNull PointerInputScope pointerInputScope, boolean z8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C14122(pointerInputScope, z8, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    public final void setDirectDragGestureInitiator(@NotNull InputType inputType) {
        this.directDragGestureInitiator.setValue(inputType);
    }

    public final void setDraggingHandle(@Nullable Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public final void setFocused(boolean z8) {
        this.isFocused = z8;
    }

    public final void setInTouchMode(boolean z8) {
        this.isInTouchMode.setValue(Boolean.valueOf(z8));
    }

    public final void setReceiveContentConfiguration(@Nullable InterfaceC6469a interfaceC6469a) {
        this.receiveContentConfiguration = interfaceC6469a;
    }

    public final void setRequestAutofillAction(@Nullable InterfaceC6469a interfaceC6469a) {
        this.requestAutofillAction = interfaceC6469a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startToolbarAndHandlesVisibilityObserver(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14131
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C14131) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC5774b.m5119b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r6 = move-exception
            goto L5e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5c
            r0.label = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = kotlinx.coroutines.AbstractC6014x.m5637h(r6, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L59
            r0.hideTextToolbar()
        L59:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        L5c:
            r6 = move-exception
            r0 = r5
        L5e:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L6c
            r0.hideTextToolbar()
        L6c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.startToolbarAndHandlesVisibilityObserver(h6.c):java.lang.Object");
    }

    @Nullable
    public final Object textFieldSelectionGestures(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objSelectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(interfaceC6469a), new TextFieldTextDragObserver(interfaceC6469a), interfaceC5631c);
        return objSelectionGesturePointerInputBtf2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objSelectionGesturePointerInputBtf2 : C5443s.f8405a;
    }

    public final void update(@NotNull HapticFeedback hapticFeedBack, @NotNull Clipboard clipboard, @NotNull TextToolbarHandler showTextToolbar, @NotNull Density density, boolean enabled, boolean readOnly, boolean isPassword) {
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
    public final void m7939updateHandleDraggingUv8p0NA(@NotNull Handle handle, long position) {
        setDraggingHandle(handle);
        m7934setRawHandleDragPositionk4lQ0M(position);
    }

    public final void updateTextToolbarState(@NotNull TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }
}
