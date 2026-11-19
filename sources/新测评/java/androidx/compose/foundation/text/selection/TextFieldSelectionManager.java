package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.platform.TextToolbar;
import androidx.compose.p013ui.platform.TextToolbarStatus;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010|\u001a\u00020LH\u0000¢\u0006\u0002\b}J\r\u0010~\u001a\u00020LH\u0000¢\u0006\u0002\b\u007fJ\u001d\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\b\u0002\u0010\u0082\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u0083\u0001J(\u0010\u0084\u0001\u001a\u00020I2\u0007\u0010\u0085\u0001\u001a\u00020k2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020gH\u0000¢\u0006\u0003\b\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\b\u008d\u0001J\u001f\u0010\u008e\u0001\u001a\u00020L2\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0012H\u0000ø\u0001\u0000¢\u0006\u0003\b\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020L2\t\b\u0002\u0010\u0092\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u0093\u0001J\u000f\u0010\u0094\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u0095\u0001J\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\"\u0010\u0098\u0001\u001a\u00020\u00122\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0019\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b \u0001J!\u0010¡\u0001\u001a\u00020\u00122\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0018\u0010¤\u0001\u001a\u00020g2\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b¥\u0001J\u000f\u0010¦\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b§\u0001J\u000f\u0010¨\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b©\u0001J\u0012\u0010ª\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u00ad\u0001J\u001c\u0010®\u0001\u001a\u00020L2\u0007\u0010\u008f\u0001\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010±\u0001\u001a\u00020L2\b\u0010²\u0001\u001a\u00030\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010°\u0001J\u0013\u0010´\u0001\u001a\u00020L2\b\u0010µ\u0001\u001a\u00030¶\u0001H\u0002J\u001f\u0010·\u0001\u001a\u00020L2\b\u0010²\u0001\u001a\u00030\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¸\u0001\u0010°\u0001J\u0012\u0010¹\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\bº\u0001J\u0012\u0010»\u0001\u001a\u00020L2\u0007\u0010¼\u0001\u001a\u00020'H\u0002JL\u0010½\u0001\u001a\u00030\u0087\u00012\u0006\u0010p\u001a\u00020I2\u0007\u0010¾\u0001\u001a\u00020\u00122\u0007\u0010¿\u0001\u001a\u00020'2\u0007\u0010\u009f\u0001\u001a\u00020'2\b\u0010À\u0001\u001a\u00030Á\u00012\u0007\u0010Â\u0001\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R5\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001eR/\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0011\u001a\u0004\u0018\u00010 8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010.\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0019\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020L0KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010T\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010UX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020gX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0016\u0010j\u001a\u0004\u0018\u00010k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR+\u0010p\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020I8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\u0019\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010v\u001a\u00020wX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, m13558d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard$foundation_release", "()Landroidx/compose/ui/platform/Clipboard;", "setClipboard$foundation_release", "(Landroidx/compose/ui/platform/Clipboard;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$foundation_release", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$foundation_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "enabled", "getEnabled", "setEnabled", "enabled$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "previousRawDragOffset", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "requestAutofillAction", "Lkotlin/Function0;", "getRequestAutofillAction$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setRequestAutofillAction$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "transformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "autofill", "autofill$foundation_release", "clearPreviewHighlight", "clearPreviewHighlight$foundation_release", "copy", "Lkotlinx/coroutines/Job;", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", RequestParameters.POSITION, "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "showFloatingToolbar", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandleLineHeight", "", "isStartHandle", "getHandleLineHeight$foundation_release", "getHandlePosition", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "selectWordAtPositionIfNotAlreadySelected", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "(J)V", "setDeletionPreviewHighlight", "range", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "setSelectionPreviewHighlight", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateFloatingToolbar", "show", "updateSelection", "currentPosition", "isStartOfSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "isTouchBasedSelection", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n85#2:1124\n113#2,2:1125\n85#2:1127\n113#2,2:1128\n85#2:1130\n113#2,2:1131\n85#2:1133\n113#2,2:1134\n85#2:1136\n113#2,2:1137\n1#3:1139\n30#4:1140\n30#4:1144\n30#4:1151\n53#5,3:1141\n53#5,3:1145\n70#5:1149\n53#5,3:1152\n70#5:1156\n60#5:1159\n60#5:1162\n70#5:1165\n69#6:1148\n69#6:1155\n65#6:1158\n65#6:1161\n69#6:1164\n22#7:1150\n22#7:1157\n22#7:1160\n22#7:1163\n22#7:1166\n113#8:1167\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1124\n87#1:1125,2\n121#1:1127\n121#1:1128,2\n124#1:1130\n124#1:1131,2\n152#1:1133\n152#1:1134,2\n156#1:1136\n156#1:1137,2\n739#1:1140\n869#1:1144\n879#1:1151\n739#1:1141,3\n869#1:1145,3\n874#1:1149\n879#1:1152,3\n884#1:1156\n886#1:1159\n887#1:1162\n890#1:1165\n874#1:1148\n884#1:1155\n886#1:1158\n887#1:1161\n890#1:1164\n874#1:1150\n884#1:1157\n886#1:1160\n887#1:1163\n890#1:1166\n890#1:1167\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private CoroutineScope coroutineScope;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private Function0<Unit> requestAutofillAction;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Job copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return textFieldSelectionManager.copy$foundation_release(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m18453createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m18454deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m18457deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c10;
        long j10;
        float fIntBitsToFloat;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getIsLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m23027getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m23022getEndimpl(getValue$foundation_release().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM20751getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m20751getZeroF1C5BW0() : layoutCoordinates4.mo22335localToRootMKHz9U(m18460getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM20751getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m20751getZeroF1C5BW0() : layoutCoordinates3.mo22335localToRootMKHz9U(m18460getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates2.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinates.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(0.0f) << c10) | (Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & j10))) & j10));
                }
                int i10 = (int) (jM20751getZeroF1C5BW0 >> c10);
                int i11 = (int) (jM20751getZeroF1C5BW02 >> c10);
                return new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jM20751getZeroF1C5BW0 & j10)), Float.intBitsToFloat((int) (jM20751getZeroF1C5BW02 & j10))) + (C3127Dp.m23561constructorimpl(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m18455setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean show) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(show);
        }
        if (show) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m18456updateSelection8UEBfa8(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        TextLayoutResultProxy layoutResult;
        int i10;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.INSTANCE.m23032getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m23027getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m23022getEndimpl(value.getSelection())));
        boolean z9 = false;
        int iM18121getOffsetForPosition3MmeM6k = layoutResult.m18121getOffsetForPosition3MmeM6k(currentPosition, false);
        int iM23027getStartimpl = (isStartHandle || isStartOfSelection) ? iM18121getOffsetForPosition3MmeM6k : TextRange.m23027getStartimpl(jTextRange);
        int iM23022getEndimpl = (!isStartHandle || isStartOfSelection) ? iM18121getOffsetForPosition3MmeM6k : TextRange.m23022getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (isStartOfSelection || selectionLayout == null || (i10 = this.previousRawDragOffset) == -1) {
            i10 = -1;
        }
        SelectionLayout selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m18406getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM23027getStartimpl, iM23022getEndimpl, i10, jTextRange, isStartOfSelection, isStartHandle);
        if (!selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM18121getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = adjustment.adjust(selectionLayoutM18406getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m23020equalsimpl0(jTextRange2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z10 = TextRange.m23026getReversedimpl(jTextRange2) != TextRange.m23026getReversedimpl(value.getSelection()) && TextRange.m23020equalsimpl0(TextRangeKt.TextRange(TextRange.m23022getEndimpl(jTextRange2), TextRange.m23027getStartimpl(jTextRange2)), value.getSelection());
        boolean z11 = TextRange.m23021getCollapsedimpl(jTextRange2) && TextRange.m23021getCollapsedimpl(value.getSelection());
        if (isTouchBasedSelection && value.getText().length() > 0 && !z10 && !z11 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21714getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m18453createTextFieldValueFDrldGo(value.getText(), jTextRange2));
        if (!isTouchBasedSelection) {
            updateFloatingToolbar(!TextRange.m23021getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(isTouchBasedSelection);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m23021getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m23021getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jTextRange2;
        }
        if (TextRange.m23021getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z9 = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z9);
        return jTextRange2;
    }

    public final void autofill$foundation_release() {
        Function0<Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m18028setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m23032getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m18031setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m23032getZerod9O1mEE());
    }

    public final Job copy$foundation_release(boolean cancelSelection) {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1, null);
        }
        return null;
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo18087onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo18088onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m20740plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m18455setCurrentDragPosition_kEHs6E(Offset.m20724boximpl(Offset.m20740plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM18458getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m18458getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM18458getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m18120getOffsetForPosition3MmeM6k$default(layoutResult, offsetM18458getCurrentDragPosition_m7T9E.m20745unboximpl(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m23020equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21714getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m18453createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getText(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo18089onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                long jM18403getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m18403getAdjustedCoordinatesk4lQ0M(this.this$0.m18460getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM18403getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m18455setCurrentDragPosition_kEHs6E(Offset.m20724boximpl(jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m20751getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m18455setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m18455setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final Job cut$foundation_release() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1, null);
        }
        return null;
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m18457deselect_kEHs6E$foundation_release(Offset position) {
        if (!TextRange.m23021getCollapsedimpl(getValue$foundation_release().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m23270copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((position == null || layoutResult == null) ? TextRange.m23024getMaximpl(getValue$foundation_release().getSelection()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m18120getOffsetForPosition3MmeM6k$default(layoutResult, position.m20745unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setHandleState((position == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean showFloatingToolbar) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m20646requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(showFloatingToolbar);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* renamed from: getClipboard$foundation_release, reason: from getter */
    public final Clipboard getClipboard() {
        return this.clipboard;
    }

    /* renamed from: getCoroutineScope$foundation_release, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m18458getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m18459getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m23027getStartimpl(getValue$foundation_release().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(cursorRect.getLeft() + (density.mo17332toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2)) << 32) | (Float.floatToRawIntBits(cursorRect.getBottom()) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int iM23027getStartimpl = isStartHandle ? TextRange.m23027getStartimpl(getValue$foundation_release().getSelection()) : TextRange.m23022getEndimpl(getValue$foundation_release().getSelection());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, iM23027getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m18460getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        if (!Intrinsics.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation_release().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(isStartHandle ? TextRange.m23027getStartimpl(selection) : TextRange.m23022getEndimpl(selection)), isStartHandle, TextRange.m23026getReversedimpl(getValue$foundation_release().getSelection()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final Function0<Unit> getRequestAutofillAction$foundation_release() {
        return this.requestAutofillAction;
    }

    /* renamed from: getState$foundation_release, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    /* renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo18087onDownk4lQ0M(long point) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM18403getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m18403getAdjustedCoordinatesk4lQ0M(this.this$0.m18460getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM18403getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m18455setCurrentDragPosition_kEHs6E(Offset.m20724boximpl(jM18124translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m20751getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo18088onDragk4lQ0M(long delta) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m20740plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m18455setCurrentDragPosition_kEHs6E(Offset.m20724boximpl(Offset.m20740plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM18458getCurrentDragPosition_m7T9E = this.this$0.m18458getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM18458getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m18456updateSelection8UEBfa8(value$foundation_release, offsetM18458getCurrentDragPosition_m7T9E.m20745unboximpl(), false, isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo18089onStartk4lQ0M(long startPoint) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m18455setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m18455setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final Job paste$foundation_release() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1, null);
        }
        return null;
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM18453createTextFieldValueFDrldGo = m18453createTextFieldValueFDrldGo(getValue$foundation_release().getText(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM18453createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m23270copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM18453createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m18461selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m18118isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m18123translateDecorationToInnerCoordinatesMKHz9U$foundation_release(position), TextRange.m23015boximpl(getValue$foundation_release().getSelection()))) {
            return;
        }
        m18456updateSelection8UEBfa8(getValue$foundation_release(), position, true, false, SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final void setClipboard$foundation_release(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation_release(CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m18462setDeletionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m18028setDeletionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m18031setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m23032getZerod9O1mEE());
        }
        if (TextRange.m23021getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z9) {
        this.editable.setValue(Boolean.valueOf(z9));
    }

    public final void setEnabled(boolean z9) {
        this.enabled.setValue(Boolean.valueOf(z9));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    public final void setRequestAutofillAction$foundation_release(Function0<Unit> function0) {
        this.requestAutofillAction = function0;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m18463setSelectionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m18031setSelectionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m18028setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m23032getZerod9O1mEE());
        }
        if (TextRange.m23021getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public final Job showSelectionToolbar$foundation_release() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1, null);
        }
        return null;
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m20751getZeroF1C5BW0();
        this.dragTotalDistance = companion.m20751getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m18455setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM23021getCollapsedimpl = TextRange.m23021getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection());
                this.this$0.setHandleState(zM23021getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!zM23021getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!zM23021getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state3 = this.this$0.getState();
                if (state3 == null) {
                    return;
                }
                state3.setShowCursorHandle(zM23021getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo18087onDownk4lQ0M(long point) {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo18088onDragk4lQ0M(long r10) {
                /*
                    r9 = this;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    boolean r0 = r0.getEnabled()
                    if (r0 == 0) goto L104
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    androidx.compose.ui.text.input.TextFieldValue r0 = r0.getValue$foundation_release()
                    java.lang.String r0 = r0.getText()
                    int r0 = r0.length()
                    if (r0 != 0) goto L19
                    return
                L19:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r0)
                    long r10 = androidx.compose.p013ui.geometry.Offset.m20740plusMKHz9U(r1, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$setDragTotalDistance$p(r0, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.LegacyTextFieldState r10 = r10.getState()
                    r11 = 0
                    if (r10 == 0) goto Lff
                    androidx.compose.foundation.text.TextLayoutResultProxy r0 = r10.getLayoutResult()
                    if (r0 == 0) goto Lff
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    long r3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r10)
                    long r1 = androidx.compose.p013ui.geometry.Offset.m20740plusMKHz9U(r1, r3)
                    androidx.compose.ui.geometry.Offset r1 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r1)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m18451access$setCurrentDragPosition_kEHs6E(r10, r1)
                    java.lang.Integer r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r10)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.geometry.Offset r1 = r10.m18458getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                    long r1 = r1.m20745unboximpl()
                    boolean r1 = r0.m18122isPositionOnTextk4lQ0M(r1)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.text.input.OffsetMapping r6 = r10.getOffsetMapping()
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    r4 = 2
                    r5 = 0
                    r3 = 0
                    int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m18120getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r6 = r6.transformedToOriginal(r1)
                    androidx.compose.ui.text.input.OffsetMapping r7 = r10.getOffsetMapping()
                    androidx.compose.ui.geometry.Offset r1 = r10.m18458getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                    long r1 = r1.m20745unboximpl()
                    int r0 = androidx.compose.foundation.text.TextLayoutResultProxy.m18120getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r0 = r7.transformedToOriginal(r0)
                    if (r6 != r0) goto L95
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getNone()
                L93:
                    r7 = r0
                    goto L9c
                L95:
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
                    goto L93
                L9c:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r10.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r0 = r10.m18458getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    long r3 = r0.m20745unboximpl()
                    r6 = 0
                    r8 = 1
                    r5 = 0
                    r1 = r10
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m18452access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                    goto Lfc
                Lb4:
                    r1 = r10
                    java.lang.Integer r10 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r10 == 0) goto Lc0
                    int r10 = r10.intValue()
                    goto Lc8
                Lc0:
                    long r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r1)
                    int r10 = r0.m18121getOffsetForPosition3MmeM6k(r2, r11)
                Lc8:
                    androidx.compose.ui.geometry.Offset r2 = r1.m18458getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    long r2 = r2.m20745unboximpl()
                    int r0 = r0.m18121getOffsetForPosition3MmeM6k(r2, r11)
                    java.lang.Integer r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r2 != 0) goto Le0
                    if (r10 != r0) goto Le0
                    goto L104
                Le0:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r1.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r10 = r1.m18458getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                    long r3 = r10.m20745unboximpl()
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r7 = r10.getWord()
                    r8 = 1
                    r5 = 0
                    r6 = 0
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m18452access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                Lfc:
                    androidx.compose.p013ui.text.TextRange.m23015boximpl(r0)
                Lff:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$updateFloatingToolbar(r10, r11)
                L104:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo18088onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo18089onStartk4lQ0M(long startPoint) {
                long j10;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state = this.this$0.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m18122isPositionOnTextk4lQ0M(startPoint)) {
                        j10 = startPoint;
                        LegacyTextFieldState state2 = this.this$0.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m18120getOffsetForPosition3MmeM6k$default(layoutResult, j10, false, 2, null));
                            TextFieldValue textFieldValueM18453createTextFieldValueFDrldGo = textFieldSelectionManager.m18453createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getText(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21714getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM18453createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        j10 = startPoint;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m23027getStartimpl(textFieldSelectionManager2.m18456updateSelection8UEBfa8(TextFieldValue.m23270copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.INSTANCE.m23032getZerod9O1mEE(), (TextRange) null, 5, (Object) null), startPoint, true, false, SelectionAdjustment.INSTANCE.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j10;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m18455setCurrentDragPosition_kEHs6E(Offset.m20724boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.INSTANCE.m20751getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo18324onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), dragPosition, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo18325onExtendk4lQ0M(long downPosition) {
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || state.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                updateMouseSelection(this.this$0.getValue$foundation_release(), downPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo18326onExtendDragk4lQ0M(long dragPosition) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), dragPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo18327onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m20646requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                this.this$0.dragBeginPosition = downPosition;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, adjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue value, long currentPosition, boolean isStartOfSelection, SelectionAdjustment adjustment) {
                this.this$0.setHandleState(TextRange.m23021getCollapsedimpl(this.this$0.m18456updateSelection8UEBfa8(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : undoManager);
    }
}
