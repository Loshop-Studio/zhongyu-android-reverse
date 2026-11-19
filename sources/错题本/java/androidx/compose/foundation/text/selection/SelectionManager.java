package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifierKt;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifierKt;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyInputModifierKt;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.platform.TextToolbarStatus;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6477i;
import p204y1.AbstractC6768a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0019H\u0000¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0019H\u0000¢\u0006\u0004\b#\u0010\u001bJ\u0011\u0010(\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b)\u0010\u001fJ\r\u0010+\u001a\u00020\u001d¢\u0006\u0004\b+\u0010\u001fJ\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J4\u00107\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u0002002\u0006\u0010,\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J2\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u0002002\u0006\u0010,\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020\u0019H\u0001¢\u0006\u0004\b<\u0010\u001bJ\u0018\u0010@\u001a\u00020\u001d2\u0006\u00108\u001a\u000200ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010\u001fJ\u000f\u0010B\u001a\u00020\u001dH\u0002¢\u0006\u0004\bB\u0010\u001fJ\u000f\u0010C\u001a\u00020\u001dH\u0002¢\u0006\u0004\bC\u0010\u001fJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FJ!\u0010J\u001a\u00020G*\u00020G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0HH\u0002¢\u0006\u0004\bJ\u0010KJ\"\u0010P\u001a\u0002002\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ*\u0010S\u001a\u00020\u001d2\u0006\u00108\u001a\u0002002\u0006\u0010,\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ,\u0010W\u001a\u0004\u0018\u00010T2\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u0002002\u0006\u0010,\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u0012H\u0002¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\\R\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00190]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_RF\u0010c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u001d0a2\u0014\u0010b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u001d0a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010j\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR0\u0010p\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001d\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010d\u001a\u0004\bq\u0010f\"\u0004\br\u0010hR$\u0010t\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R1\u0010\u0086\u0001\u001a\u00020\u00192\u0007\u0010\u0081\u0001\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010_\u001a\u0005\b\u0083\u0001\u0010\u001b\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b2\u0010\u0087\u0001R5\u0010\u0089\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010\u000e\"\u0006\b\u008c\u0001\u0010\u008d\u0001R7\u0010\u0092\u0001\u001a\u0002002\u0007\u0010\u0081\u0001\u001a\u0002008@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u008e\u0001\u0010_\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010?R7\u0010\u0096\u0001\u001a\u0002002\u0007\u0010\u0081\u0001\u001a\u0002008@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0093\u0001\u0010_\u001a\u0006\b\u0094\u0001\u0010\u0090\u0001\"\u0005\b\u0095\u0001\u0010?R<\u0010\u009c\u0001\u001a\u0004\u0018\u0001002\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001008F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010_\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R<\u0010 \u0001\u001a\u0004\u0018\u0001002\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001008F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u009d\u0001\u0010_\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R8\u0010§\u0001\u001a\u0005\u0018\u00010¡\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010¡\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¢\u0001\u0010_\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R<\u0010«\u0001\u001a\u0004\u0018\u0001002\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001008F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b¨\u0001\u0010_\u001a\u0006\b©\u0001\u0010\u0099\u0001\"\u0006\bª\u0001\u0010\u009b\u0001R2\u0010¬\u0001\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¬\u0001\u0010\u00ad\u0001\u0012\u0005\b²\u0001\u0010\u001f\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R1\u0010³\u0001\u001a\u00020\u00192\u0007\u0010\u0088\u0001\u001a\u00020\u00198\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bµ\u0001\u0010\u001b\"\u0006\b¶\u0001\u0010\u0085\u0001R.\u0010»\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R)\u0010¼\u0001\u001a\u00020\u00192\u0007\u0010\u0088\u0001\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¼\u0001\u0010\u001b\"\u0006\b½\u0001\u0010\u0085\u0001R\u0014\u0010À\u0001\u001a\u00020G8F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0015\u0010Ä\u0001\u001a\u00030Á\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0015\u0010Æ\u0001\u001a\u00030Á\u00018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Ã\u0001R\u0016\u0010Ç\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u001bR\u0016\u0010É\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ê\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectAllInSelectable$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAllInSelectable", "", "isEntireContainerSelected$foundation_release", "()Z", "isEntireContainerSelected", "Ld6/s;", "selectAll$foundation_release", "()V", "selectAll", "isTriviallyCollapsedSelection$foundation_release", "isTriviallyCollapsedSelection", "isNonEmptySelection$foundation_release", "isNonEmptySelection", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "copy", "onRelease", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "Landroidx/compose/ui/geometry/Offset;", "newPosition", "previousPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", RequestParameters.POSITION, "previousHandlePosition", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "shouldPerformHaptics$foundation_release", "shouldPerformHaptics", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "(J)V", "selectWordAtPositionIfNotAlreadySelected", "updateHandleOffsets", "toolbarCopy", "updateSelectionToolbar", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "onClearSelectionRequested", "(Landroidx/compose/ui/Modifier;Lr6/a;)Landroidx/compose/ui/Modifier;", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "convertToContainerCoordinates", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "startSelection", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "getSelectionLayout", "selectionLayout", "newSelection", "selectionChanged", "(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/Selection;)V", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "_selection", "Landroidx/compose/runtime/MutableState;", "_isInTouchMode", "Lkotlin/Function1;", "newOnSelectionChange", "onSelectionChange", "Lr6/c;", "getOnSelectionChange", "()Lr6/c;", "setOnSelectionChange", "(Lr6/c;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "onCopyHandler", "getOnCopyHandler", "setOnCopyHandler", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "getHasFocus", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/geometry/Offset;", "value", "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition$delegate", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "dragTotalDistance$delegate", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "getPreviousSelectionLayout$foundation_release$annotations", "showToolbar", "Z", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "isInTouchMode", "setInTouchMode", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "", "getStartHandleLineHeight", "()F", "startHandleLineHeight", "getEndHandleLineHeight", "endHandleLineHeight", "isDraggingInProgress", "getShouldShowMagnifier", "shouldShowMagnifier", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,1107:1\n85#2:1108\n113#2,2:1109\n85#2:1111\n113#2,2:1112\n85#2:1114\n113#2,2:1115\n85#2:1117\n113#2,2:1118\n85#2:1120\n113#2,2:1121\n85#2:1123\n113#2,2:1124\n85#2:1127\n113#2,2:1128\n1#3:1126\n1#3:1192\n278#4:1130\n278#4:1131\n278#4:1207\n107#5,7:1132\n96#5,5:1139\n269#6,3:1144\n34#6,6:1147\n272#6:1153\n87#6,2:1154\n34#6,6:1156\n89#6:1162\n34#6,6:1163\n102#6,2:1169\n34#6,6:1171\n104#6:1177\n34#6,6:1179\n439#6,3:1185\n34#6,4:1188\n39#6:1193\n442#6:1194\n70#6,6:1201\n34#6,6:1208\n102#6,2:1214\n34#6,6:1216\n104#6:1222\n102#6,2:1223\n34#6,6:1225\n104#6:1231\n1565#7:1178\n56#8,6:1195\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n131#1:1108\n131#1:1109,2\n181#1:1111\n181#1:1112,2\n188#1:1114\n188#1:1115,2\n196#1:1117\n196#1:1118,2\n204#1:1120\n204#1:1121,2\n211#1:1123\n211#1:1124,2\n234#1:1127\n234#1:1128,2\n619#1:1192\n387#1:1130\n399#1:1131\n884#1:1207\n411#1:1132,7\n412#1:1139,5\n422#1:1144,3\n422#1:1147,6\n422#1:1153\n445#1:1154,2\n445#1:1156,6\n445#1:1162\n472#1:1163,6\n532#1:1169,2\n532#1:1171,6\n532#1:1177\n545#1:1179,6\n619#1:1185,3\n619#1:1188,4\n619#1:1193\n619#1:1194\n877#1:1201,6\n895#1:1208,6\n910#1:1214,2\n910#1:1216,6\n910#1:1222\n922#1:1223,2\n922#1:1225,6\n922#1:1231\n544#1:1178\n634#1:1195,6\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;

    @Nullable
    private LayoutCoordinates containerLayoutCoordinates;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentDragPosition;

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragBeginPosition;

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState draggingHandle;

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState endHandlePosition;

    @Nullable
    private HapticFeedback hapticFeedBack;

    @Nullable
    private InterfaceC6471c onCopyHandler;

    @Nullable
    private Offset previousPosition;

    @Nullable
    private SelectionLayout previousSelectionLayout;

    @NotNull
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startHandlePosition;

    @Nullable
    private TextToolbar textToolbar;

    @NotNull
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @NotNull
    private InterfaceC6471c onSelectionChange = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Selection) obj);
            return C5443s.f8405a;
        }

        public final void invoke(Selection selection) {
            this.this$0.setSelection(selection);
        }
    };

    @NotNull
    private FocusRequester focusRequester = new FocusRequester();

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$1 */
    public /* synthetic */ class C14771 extends FunctionReferenceImpl implements InterfaceC6469a {
        public C14771(Object obj) {
            super(0, obj, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8068invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8068invoke() {
            ((SelectionManager) this.receiver).toolbarCopy();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$2 */
    public /* synthetic */ class C14782 extends FunctionReferenceImpl implements InterfaceC6469a {
        public C14782(Object obj) {
            super(0, obj, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8069invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8069invoke() {
            ((SelectionManager) this.receiver).selectAll$foundation_release();
        }
    }

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(companion.m10457getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(companion.m10457getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(long j7) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j7)) {
                    SelectionManager.this.updateHandleOffsets();
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new InterfaceC6475g() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                m8063invokeRg1IO4c(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).m10451unboximpl(), (SelectionAdjustment) obj4);
                return C5443s.f8405a;
            }

            /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
            public final void m8063invokeRg1IO4c(boolean z8, LayoutCoordinates layoutCoordinates, long j7, SelectionAdjustment selectionAdjustment) {
                long jMo12041getSizeYbymL2g = layoutCoordinates.mo12041getSizeYbymL2g();
                Rect rect = new Rect(0.0f, 0.0f, (int) (jMo12041getSizeYbymL2g >> 32), (int) (jMo12041getSizeYbymL2g & 4294967295L));
                if (!SelectionManagerKt.m8071containsInclusiveUv8p0NA(rect, j7)) {
                    j7 = TextLayoutStateKt.m7876coerceIn3MmeM6k(j7, rect);
                }
                long jM8047convertToContainerCoordinatesR5De75A = SelectionManager.this.m8047convertToContainerCoordinatesR5De75A(layoutCoordinates, j7);
                if ((9223372034707292159L & jM8047convertToContainerCoordinatesR5De75A) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    SelectionManager.this.setInTouchMode(z8);
                    SelectionManager.this.m8054startSelection9KIMszo(jM8047convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    FocusRequester.m10349requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                    SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(boolean z8, long j7) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, LongObjectMap<Selection>> pairSelectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j7, selectionManager.getSelection());
                Selection selectionComponent1 = pairSelectAllInSelectable$foundation_release.component1();
                LongObjectMap<Selection> longObjectMapComponent2 = pairSelectAllInSelectable$foundation_release.component2();
                if (!AbstractC5830k.m5325b(selectionComponent1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(longObjectMapComponent2);
                    SelectionManager.this.getOnSelectionChange().invoke(selectionComponent1);
                }
                SelectionManager.this.setInTouchMode(z8);
                FocusRequester.m10349requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new InterfaceC6477i() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // p152r6.InterfaceC6477i
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return m8064invokepGV3PM0(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).m10451unboximpl(), ((Offset) obj4).m10451unboximpl(), ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6);
            }

            /* renamed from: invoke-pGV3PM0, reason: not valid java name */
            public final Boolean m8064invokepGV3PM0(boolean z8, LayoutCoordinates layoutCoordinates, long j7, long j8, boolean z9, SelectionAdjustment selectionAdjustment) {
                long jM8047convertToContainerCoordinatesR5De75A = SelectionManager.this.m8047convertToContainerCoordinatesR5De75A(layoutCoordinates, j7);
                long jM8047convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m8047convertToContainerCoordinatesR5De75A(layoutCoordinates, j8);
                SelectionManager.this.setInTouchMode(z8);
                return Boolean.valueOf(SelectionManager.this.m8062updateSelectionqNKwrvQ$foundation_release(Offset.m10430boximpl(jM8047convertToContainerCoordinatesR5De75A), jM8047convertToContainerCoordinatesR5De75A2, z9, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m8065invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m8065invoke() {
                SelectionManager.this.setShowToolbar$foundation_release(true);
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m8049setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(long j7) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j7)) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(long j7) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j7 == start.getSelectableId()) {
                    SelectionManager.this.m8053setStartHandlePosition_kEHs6E(null);
                }
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j7 == end.getSelectableId()) {
                    SelectionManager.this.m8052setEndHandlePosition_kEHs6E(null);
                }
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j7)) {
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m8047convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.INSTANCE.m10456getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation_release().mo12042localPositionOfR5De75A(layoutCoordinates, offset);
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(listSort.size());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = listSort.get(i);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair pair = selection != null ? new Pair(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        List listFirstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (listFirstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(listFirstAndLast, layoutCoordinates);
        if (AbstractC5830k.m5325b(selectedRegionRect, SelectionManagerKt.invertedInfiniteRect)) {
            return null;
        }
        Rect rectIntersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (rectIntersect.getRight() - rectIntersect.getLeft() < 0.0f || rectIntersect.getBottom() - rectIntersect.getTop() < 0.0f) {
            return null;
        }
        Rect rectM10478translatek4lQ0M = rectIntersect.m10478translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(rectM10478translatek4lQ0M, 0.0f, 0.0f, 0.0f, (SelectionHandlesKt.getHandleHeight() * 4) + rectM10478translatek4lQ0M.getBottom(), 7, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m8048getSelectionLayoutWko1d7g(long position, long previousHandlePosition, boolean isStartHandle) {
        LayoutCoordinates layoutCoordinatesRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> listSort = this.selectionRegistrar.sort(layoutCoordinatesRequireContainerCoordinates$foundation_release);
        final MutableLongIntMap mutableLongIntMapMutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            mutableLongIntMapMutableLongIntMapOf.set(listSort.get(i).getSelectableId(), i);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(position, previousHandlePosition, layoutCoordinatesRequireContainerCoordinates$foundation_release, isStartHandle, (9223372034707292159L & previousHandlePosition) == InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return AbstractC6768a.m6441f(Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t8).longValue())), Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t9).longValue())));
            }
        }, null);
        int size2 = listSort.size();
        for (int i8 = 0; i8 < size2; i8++) {
            listSort.get(i8).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final InterfaceC6469a interfaceC6469a) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, C5443s.f8405a, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", m5303f = "SelectionManager.kt", m5304i = {0}, m5305l = {754, 760}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture"}, m5308s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6469a $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SelectionManager selectionManager, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = selectionManager;
                    this.$block = interfaceC6469a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L19
                        if (r1 != r2) goto L11
                        kotlin.AbstractC5774b.m5119b(r11)
                        r7 = r10
                        goto L4b
                    L11:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L19:
                        java.lang.Object r1 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC5774b.m5119b(r11)
                        r7 = r10
                        goto L3b
                    L22:
                        kotlin.AbstractC5774b.m5119b(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r4
                        r10.L$0 = r4
                        r10.label = r3
                        r5 = 0
                        r6 = 0
                        r8 = 2
                        r9 = 0
                        r7 = r10
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown$default(r4, r5, r6, r7, r8, r9)
                        if (r11 != r0) goto L3a
                        goto L4a
                    L3a:
                        r1 = r4
                    L3b:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                        r4 = 0
                        r7.L$0 = r4
                        r7.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(r1, r11, r3, r10)
                        if (r11 != r0) goto L4b
                    L4a:
                        return r0
                    L4b:
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        if (r11 != 0) goto L60
                        androidx.compose.foundation.text.selection.SelectionManager r11 = r7.this$0
                        boolean r11 = androidx.compose.foundation.text.selection.SelectionManager.access$isDraggingInProgress(r11)
                        if (r11 != 0) goto L60
                        r6.a r11 = r7.$block
                        r11.invoke()
                    L60:
                        d6.s r11 = p045d6.C5443s.f8405a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C14761.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(SelectionManager.this, interfaceC6469a, null), interfaceC5631c);
                return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
            }
        });
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection newSelection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m8049setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m8050setDragBeginPositionk4lQ0M(long j7) {
        this.dragBeginPosition.setValue(Offset.m10430boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m8051setDragTotalDistancek4lQ0M(long j7) {
        this.dragTotalDistance.setValue(Offset.m10430boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m8052setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m8053setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m8054startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        m8061updateSelectionjyLRC_s$foundation_release(position, Offset.INSTANCE.m10456getUnspecifiedF1C5BW0(), isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateHandleOffsets() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.selection.Selection r1 = r0.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.containerLayoutCoordinates
            r3 = 0
            if (r1 == 0) goto L16
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r1.getStart()
            if (r4 == 0) goto L16
            androidx.compose.foundation.text.selection.Selectable r4 = r0.getAnchorSelectable$foundation_release(r4)
            goto L17
        L16:
            r4 = r3
        L17:
            if (r1 == 0) goto L24
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r1.getEnd()
            if (r5 == 0) goto L24
            androidx.compose.foundation.text.selection.Selectable r5 = r0.getAnchorSelectable$foundation_release(r5)
            goto L25
        L24:
            r5 = r3
        L25:
            if (r4 == 0) goto L2c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r5 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.getLayoutCoordinates()
            goto L35
        L34:
            r7 = r3
        L35:
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r8 = r2.isAttached()
            if (r8 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L7b
            r13 = 1
            long r13 = r4.mo8017getHandlePositiondBAh8RU(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7b
        L60:
            long r13 = r2.mo12042localPositionOfR5De75A(r6, r13)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r13)
            long r13 = r4.m10451unboximpl()
            androidx.compose.foundation.text.Handle r6 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r15 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r6 == r15) goto L7c
            boolean r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.m8071containsInclusiveUv8p0NA(r8, r13)
            if (r6 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r3
        L7c:
            r0.m8053setStartHandlePosition_kEHs6E(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.mo8017getHandlePositiondBAh8RU(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L8c
            goto La7
        L8c:
            long r1 = r2.mo12042localPositionOfR5De75A(r7, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r1)
            long r4 = r1.m10451unboximpl()
            androidx.compose.foundation.text.Handle r2 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r6 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r2 == r6) goto La6
            boolean r2 = androidx.compose.foundation.text.selection.SelectionManagerKt.m8071containsInclusiveUv8p0NA(r8, r4)
            if (r2 == 0) goto La7
        La6:
            r3 = r1
        La7:
            r0.m8052setEndHandlePosition_kEHs6E(r3)
            return
        Lab:
            r0.m8053setStartHandlePosition_kEHs6E(r3)
            r0.m8052setEndHandlePosition_kEHs6E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (!this.showToolbar || !isInTouchMode()) {
                if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                    textToolbar.hide();
                }
            } else {
                Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                TextToolbar.showMenu$default(textToolbar, contentRect, isNonEmptySelection$foundation_release() ? new C14771(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new C14782(this), null, 12, null);
            }
        }
    }

    public final void copy$foundation_release() {
        InterfaceC6471c interfaceC6471c;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (interfaceC6471c = this.onCopyHandler) == null) {
                return;
            }
            interfaceC6471c.invoke(selectedText$foundation_release);
        }
    }

    @Nullable
    public final Selectable getAnchorSelectable$foundation_release(@NotNull Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchor.getSelectableId());
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m8055getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m8056getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).m10451unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m8057getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).m10451unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m8058getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        Modifier modifierSelectionMagnifier = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifierSelectionMagnifier, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m8066invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m8066invoke() {
                this.this$0.onRelease();
            }
        }), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return C5443s.f8405a;
            }

            public final void invoke(FocusState focusState) {
                if (!focusState.getHasFocus() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.getHasFocus());
            }
        }), false, null, 3, null), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C5443s.f8405a;
            }

            public final void invoke(boolean z8) {
                this.this$0.setInTouchMode(z8);
            }
        }), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m8067invokeZmokQxo(((KeyEvent) obj).m11752unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m8067invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z8;
                if (SelectionManager_androidKt.m8073isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation_release();
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        });
        if (getShouldShowMagnifier()) {
            modifierSelectionMagnifier = SelectionManager_androidKt.selectionMagnifier(modifierSelectionMagnifier, this);
        }
        return modifierOnKeyEvent.then(modifierSelectionMagnifier);
    }

    @Nullable
    public final InterfaceC6471c getOnCopyHandler() {
        return this.onCopyHandler;
    }

    @NotNull
    public final InterfaceC6471c getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @Nullable
    /* renamed from: getPreviousSelectionLayout$foundation_release, reason: from getter */
    public final SelectionLayout getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = listSort.get(i);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                builder.append(selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()));
            }
        }
        return builder.toAnnotatedString();
    }

    @Nullable
    public final Selection getSelection() {
        return this._selection.getValue();
    }

    /* renamed from: getShowToolbar$foundation_release, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getStart().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m8059getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m8049setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7692onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Offset offsetM8059getStartHandlePosition_m7T9E = isStartHandle ? this.m8059getStartHandlePosition_m7T9E() : this.m8058getEndHandlePosition_m7T9E();
                if (offsetM8059getStartHandlePosition_m7T9E != null) {
                    offsetM8059getStartHandlePosition_m7T9E.m10451unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long jMo8017getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo8017getHandlePositiondBAh8RU(selection, isStartHandle);
                    if ((9223372034707292159L & jMo8017getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                        return;
                    }
                    long jM8031getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m8031getAdjustedCoordinatesk4lQ0M(jMo8017getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m8049setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo12042localPositionOfR5De75A(layoutCoordinates, jM8031getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7693onDragk4lQ0M(long delta) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m8051setDragTotalDistancek4lQ0M(Offset.m10446plusMKHz9U(selectionManager.m8057getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long jM10446plusMKHz9U = Offset.m10446plusMKHz9U(this.m8056getDragBeginPositionF1C5BW0$foundation_release(), this.m8057getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m8062updateSelectionqNKwrvQ$foundation_release(Offset.m10430boximpl(jM10446plusMKHz9U), this.m8056getDragBeginPositionF1C5BW0$foundation_release(), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    this.m8050setDragBeginPositionk4lQ0M(jM10446plusMKHz9U);
                    this.m8051setDragTotalDistancek4lQ0M(Offset.INSTANCE.m10457getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7694onStartk4lQ0M(long startPoint) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                AbstractC5830k.m5327d(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get((isStartHandle ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new KotlinNothingValueException();
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                long jMo8017getHandlePositiondBAh8RU = selectable2.mo8017getHandlePositiondBAh8RU(selection, isStartHandle);
                if ((9223372034707292159L & jMo8017getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                long jM8031getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m8031getAdjustedCoordinatesk4lQ0M(jMo8017getHandlePositiondBAh8RU);
                SelectionManager selectionManager = this;
                selectionManager.m8050setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo12042localPositionOfR5De75A(layoutCoordinates, jM8031getAdjustedCoordinatesk4lQ0M));
                this.m8051setDragTotalDistancek4lQ0M(Offset.INSTANCE.m10457getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        Selection selection;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return true;
        }
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = listSort.get(i);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null || AbstractC5830k.m5325b(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(listSort.get(i).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return AbstractC5830k.m5325b(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.isAttached()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = listSort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = listSort.get(i);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapMutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapMutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            AbstractC5830k.m5327d(selection);
            Selection.AnchorInfo start = selection.getStart();
            AbstractC5830k.m5327d(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapMutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    @NotNull
    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long selectableId, @Nullable Selection previousSelection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = listSort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapMutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (isInTouchMode() && !AbstractC5830k.m5325b(selectionMerge, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, mutableLongObjectMapMutableLongObjectMapOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8060selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long r13) {
        /*
            r12 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r12.containerLayoutCoordinates
            if (r0 != 0) goto L5
            goto L65
        L5:
            boolean r1 = r0.isAttached()
            if (r1 != 0) goto Lc
            goto L65
        Lc:
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r1 = r12.selectionRegistrar
            java.util.List r1 = r1.getSelectables$foundation_release()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L18:
            r5 = 1
            if (r4 >= r2) goto L5a
            java.lang.Object r6 = r1.get(r4)
            androidx.compose.foundation.text.selection.Selectable r6 = (androidx.compose.foundation.text.selection.Selectable) r6
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r7 = r12.selectionRegistrar
            androidx.collection.LongObjectMap r7 = r7.getSubselections()
            long r8 = r6.getSelectableId()
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.foundation.text.selection.Selection r7 = (androidx.compose.foundation.text.selection.Selection) r7
            if (r7 != 0) goto L35
        L33:
            r6 = r3
            goto L53
        L35:
            androidx.compose.ui.layout.LayoutCoordinates r8 = r6.getLayoutCoordinates()
            if (r8 != 0) goto L3c
            goto L33
        L3c:
            long r8 = r8.mo12042localPositionOfR5De75A(r0, r13)
            androidx.compose.ui.text.TextLayoutResult r6 = r6.textLayoutResult()
            if (r6 != 0) goto L47
            goto L33
        L47:
            long r10 = r7.m8023toTextRanged9O1mEE()
            androidx.compose.ui.text.TextRange r7 = androidx.compose.p011ui.text.TextRange.m12758boximpl(r10)
            boolean r6 = androidx.compose.foundation.text.TextLayoutHelperKt.m7723isPositionInsideSelectionuaM50fQ(r6, r8, r7)
        L53:
            if (r6 == 0) goto L57
            r3 = r5
            goto L5a
        L57:
            int r4 = r4 + 1
            goto L18
        L5a:
            if (r3 != 0) goto L65
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
            androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
            r12.m8054startSelection9KIMszo(r13, r5, r0)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.m8060selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long):void");
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM10430boximpl = layoutCoordinates != null ? Offset.m10430boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (AbstractC5830k.m5325b(this.previousPosition, offsetM10430boximpl)) {
            return;
        }
        this.previousPosition = offsetM10430boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z8) {
        this.hasFocus.setValue(Boolean.valueOf(z8));
    }

    public final void setInTouchMode(boolean z8) {
        if (this._isInTouchMode.getValue().booleanValue() != z8) {
            this._isInTouchMode.setValue(Boolean.valueOf(z8));
            updateSelectionToolbar();
        }
    }

    public final void setOnCopyHandler(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onCopyHandler = interfaceC6471c;
    }

    public final void setOnSelectionChange(@NotNull final InterfaceC6471c interfaceC6471c) {
        this.onSelectionChange = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Selection) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Selection selection) {
                this.this$0.setSelection(selection);
                interfaceC6471c.invoke(selection);
            }
        };
    }

    public final void setPreviousSelectionLayout$foundation_release(@Nullable SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(@Nullable Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z8) {
        this.showToolbar = z8;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    @VisibleForTesting
    public final boolean shouldPerformHaptics$foundation_release() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
            int size = selectables$foundation_release.size();
            for (int i = 0; i < size; i++) {
                if (selectables$foundation_release.get(i).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m8061updateSelectionjyLRC_s$foundation_release(long position, long previousHandlePosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m8049setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(position));
        SelectionLayout selectionLayoutM8048getSelectionLayoutWko1d7g = m8048getSelectionLayoutWko1d7g(position, previousHandlePosition, isStartHandle);
        if (selectionLayoutM8048getSelectionLayoutWko1d7g == null || !selectionLayoutM8048getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionAdjust = adjustment.adjust(selectionLayoutM8048getSelectionLayoutWko1d7g);
        if (!AbstractC5830k.m5325b(selectionAdjust, getSelection())) {
            selectionChanged(selectionLayoutM8048getSelectionLayoutWko1d7g, selectionAdjust);
        }
        this.previousSelectionLayout = selectionLayoutM8048getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m8062updateSelectionqNKwrvQ$foundation_release(@Nullable Offset newPosition, long previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return m8061updateSelectionjyLRC_s$foundation_release(newPosition.m10451unboximpl(), previousPosition, isStartHandle, adjustment);
    }
}
