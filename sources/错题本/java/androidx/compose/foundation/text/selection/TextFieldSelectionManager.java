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
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.platform.TextToolbarStatus;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001b\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0010H\u0000¢\u0006\u0004\b#\u0010\u0015J\u001b\u0010)\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(J\u0011\u0010,\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b*\u0010+J\u0011\u0010.\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b-\u0010+J\u000f\u00100\u001a\u00020\u0010H\u0000¢\u0006\u0004\b/\u0010\u0015J\u000f\u00102\u001a\u00020\u0010H\u0000¢\u0006\u0004\b1\u0010\u0015J\u001d\u00105\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0017\u00109\u001a\u0002062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b7\u00108J\u001d\u0010>\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0011\u0010@\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b?\u0010+J\u000f\u0010B\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010\u0015J\u0018\u0010D\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\bC\u0010\u001fJ\u000f\u0010G\u001a\u00020\u0006H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0012J\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJB\u0010V\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u0017\u0010Y\u001a\u00020\u00102\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\"\u0010`\u001a\u00020M2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b^\u0010_R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010a\u001a\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR.\u0010l\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00100k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR+\u0010N\u001a\u00020M2\u0006\u0010y\u001a\u00020M8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R2\u0010\u0088\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R/\u0010´\u0001\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b±\u0001\u0010{\u001a\u0005\b²\u0001\u0010F\"\u0005\b³\u0001\u0010\u0012R/\u0010¸\u0001\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bµ\u0001\u0010{\u001a\u0005\b¶\u0001\u0010F\"\u0005\b·\u0001\u0010\u0012R\u001f\u0010¹\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001f\u0010¾\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b¾\u0001\u0010º\u0001R7\u0010Å\u0001\u001a\u0005\u0018\u00010¿\u00012\t\u0010y\u001a\u0005\u0018\u00010¿\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÀ\u0001\u0010{\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R:\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00172\b\u0010y\u001a\u0004\u0018\u00010\u00178F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\bÆ\u0001\u0010{\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0005\bÉ\u0001\u0010\u001aR\u001a\u0010Ë\u0001\u001a\u00030»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001e\u0010Ò\u0001\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0005\bÔ\u0001\u0010\rR \u0010Ö\u0001\u001a\u00030Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Ü\u0001\u001a\u0004\u0018\u00010[8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ý\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "showFloatingToolbar", "Ld6/s;", "enterSelectionMode$foundation_release", "(Z)V", "enterSelectionMode", "exitSelectionMode$foundation_release", "()V", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "Landroidx/compose/ui/text/TextRange;", "range", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "(J)V", "setSelectionPreviewHighlight", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setDeletionPreviewHighlight", "clearPreviewHighlight$foundation_release", "clearPreviewHighlight", "cancelSelection", "Lkotlinx/coroutines/w0;", "copy$foundation_release", "(Z)Lkotlinx/coroutines/w0;", "copy", "paste$foundation_release", "()Lkotlinx/coroutines/w0;", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "autofill$foundation_release", "autofill", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "", "getHandleLineHeight$foundation_release", "(Z)F", "getHandleLineHeight", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "selectWordAtPositionIfNotAlreadySelected", "isTextChanged$foundation_release", "()Z", "isTextChanged", "show", "updateFloatingToolbar", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "currentPosition", "isStartOfSelection", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "isTouchBasedSelection", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateSelection", "Landroidx/compose/foundation/text/HandleState;", "handleState", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "selection", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lr6/c;", "getOnValueChange$foundation_release", "()Lr6/c;", "setOnValueChange$foundation_release", "(Lr6/c;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Lkotlin/Function0;", "requestAutofillAction", "Lr6/a;", "getRequestAutofillAction$foundation_release", "()Lr6/a;", "setRequestAutofillAction$foundation_release", "(Lr6/a;)V", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard$foundation_release", "()Landroidx/compose/ui/platform/Clipboard;", "setClipboard$foundation_release", "(Landroidx/compose/ui/platform/Clipboard;)V", "Lkotlinx/coroutines/v;", "coroutineScope", "Lkotlinx/coroutines/v;", "getCoroutineScope$foundation_release", "()Lkotlinx/coroutines/v;", "setCoroutineScope$foundation_release", "(Lkotlinx/coroutines/v;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "editable$delegate", "getEditable", "setEditable", "editable", "enabled$delegate", "getEnabled", "setEnabled", "enabled", "dragBeginPosition", "J", "", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "previousRawDragOffset", "I", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "transformedText", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n85#2:1124\n113#2,2:1125\n85#2:1127\n113#2,2:1128\n85#2:1130\n113#2,2:1131\n85#2:1133\n113#2,2:1134\n85#2:1136\n113#2,2:1137\n1#3:1139\n30#4:1140\n30#4:1144\n30#4:1151\n53#5,3:1141\n53#5,3:1145\n70#5:1149\n53#5,3:1152\n70#5:1156\n60#5:1159\n60#5:1162\n70#5:1165\n69#6:1148\n69#6:1155\n65#6:1158\n65#6:1161\n69#6:1164\n22#7:1150\n22#7:1157\n22#7:1160\n22#7:1163\n22#7:1166\n113#8:1167\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1124\n87#1:1125,2\n121#1:1127\n121#1:1128,2\n124#1:1130\n124#1:1131,2\n152#1:1133\n152#1:1134,2\n156#1:1136\n156#1:1137,2\n739#1:1140\n869#1:1144\n879#1:1151\n739#1:1141,3\n869#1:1145,3\n874#1:1149\n879#1:1152,3\n884#1:1156\n886#1:1159\n887#1:1162\n890#1:1165\n874#1:1148\n884#1:1155\n886#1:1158\n887#1:1161\n890#1:1164\n874#1:1150\n884#1:1157\n886#1:1160\n887#1:1163\n890#1:1166\n890#1:1167\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;

    @Nullable
    private Clipboard clipboard;

    @Nullable
    private InterfaceC6009v coroutineScope;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentDragPosition;

    @Nullable
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState editable;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState enabled;

    @Nullable
    private FocusRequester focusRequester;

    @Nullable
    private HapticFeedback hapticFeedBack;

    @NotNull
    private final MouseSelectionObserver mouseSelectionObserver;

    @NotNull
    private OffsetMapping offsetMapping;

    @NotNull
    private TextFieldValue oldValue;

    @NotNull
    private InterfaceC6471c onValueChange;
    private int previousRawDragOffset;

    @Nullable
    private SelectionLayout previousSelectionLayout;

    @Nullable
    private InterfaceC6469a requestAutofillAction;

    @Nullable
    private LegacyTextFieldState state;

    @Nullable
    private TextToolbar textToolbar;

    @NotNull
    private final TextDragObserver touchSelectionObserver;

    @Nullable
    private final UndoManager undoManager;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState value;

    @NotNull
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InterfaceC6013w0 copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return textFieldSelectionManager.copy$foundation_release(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m8087createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (AbstractC5824e) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m8088deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m8091deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c;
        long j7;
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
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m12770getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m12765getEndimpl(getValue$foundation_release().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM10457getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m10457getZeroF1C5BW0() : layoutCoordinates4.mo12044localToRootMKHz9U(m8094getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM10457getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m10457getZeroF1C5BW0() : layoutCoordinates3.mo12044localToRootMKHz9U(m8094getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c = ' ';
                    j7 = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    c = ' ';
                    j7 = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates2.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinates.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & j7))) & j7));
                }
                int i = (int) (jM10457getZeroF1C5BW0 >> c);
                int i8 = (int) (jM10457getZeroF1C5BW02 >> c);
                return new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i8)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i8)), (legacyTextFieldState.getTextDelegate().getDensity().getDensity() * C2331Dp.m13305constructorimpl(25)) + Math.max(Float.intBitsToFloat((int) (jM10457getZeroF1C5BW0 & j7)), Float.intBitsToFloat((int) (jM10457getZeroF1C5BW02 & j7))));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m8089setCurrentDragPosition_kEHs6E(Offset offset) {
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
    public final long m8090updateSelection8UEBfa8(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        TextLayoutResultProxy layoutResult;
        int i;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.INSTANCE.m12775getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m12770getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m12765getEndimpl(value.getSelection())));
        boolean z8 = false;
        int iM7726getOffsetForPosition3MmeM6k = layoutResult.m7726getOffsetForPosition3MmeM6k(currentPosition, false);
        int iM12770getStartimpl = (isStartHandle || isStartOfSelection) ? iM7726getOffsetForPosition3MmeM6k : TextRange.m12770getStartimpl(jTextRange);
        int iM12765getEndimpl = (!isStartHandle || isStartOfSelection) ? iM7726getOffsetForPosition3MmeM6k : TextRange.m12765getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (isStartOfSelection || selectionLayout == null || (i = this.previousRawDragOffset) == -1) {
            i = -1;
        }
        SelectionLayout selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m8034getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM12770getStartimpl, iM12765getEndimpl, i, jTextRange, isStartOfSelection, isStartHandle);
        if (!selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM7726getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = adjustment.adjust(selectionLayoutM8034getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m12763equalsimpl0(jTextRange2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z9 = TextRange.m12769getReversedimpl(jTextRange2) != TextRange.m12769getReversedimpl(value.getSelection()) && TextRange.m12763equalsimpl0(TextRangeKt.TextRange(TextRange.m12765getEndimpl(jTextRange2), TextRange.m12770getStartimpl(jTextRange2)), value.getSelection());
        boolean z10 = TextRange.m12764getCollapsedimpl(jTextRange2) && TextRange.m12764getCollapsedimpl(value.getSelection());
        if (isTouchBasedSelection && value.getText().length() > 0 && !z9 && !z10 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m8087createTextFieldValueFDrldGo(value.getAnnotatedString(), jTextRange2));
        if (!isTouchBasedSelection) {
            updateFloatingToolbar(!TextRange.m12764getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(isTouchBasedSelection);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m12764getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m12764getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jTextRange2;
        }
        if (TextRange.m12764getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z8 = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z8);
        return jTextRange2;
    }

    public final void autofill$foundation_release() {
        InterfaceC6469a interfaceC6469a = this.requestAutofillAction;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m7628setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m12775getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m7631setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m12775getZerod9O1mEE());
    }

    @Nullable
    public final InterfaceC6013w0 copy$foundation_release(boolean cancelSelection) {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v != null) {
            return AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1);
        }
        return null;
    }

    @NotNull
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7692onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7693onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m10446plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m8089setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(Offset.m10446plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM8092getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m8092getCurrentDragPosition_m7T9E();
                AbstractC5830k.m5327d(offsetM8092getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(layoutResult, offsetM8092getCurrentDragPosition_m7T9E.m10451unboximpl(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m12763equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange().invoke(textFieldSelectionManager2.m8087createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7694onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                long jM8031getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m8031getAdjustedCoordinatesk4lQ0M(this.this$0.m8094getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM8031getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m8089setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m10457getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m8089setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m8089setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    @Nullable
    public final InterfaceC6013w0 cut$foundation_release() {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v != null) {
            return AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
        return null;
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m8091deselect_kEHs6E$foundation_release(@Nullable Offset position) {
        if (!TextRange.m12764getCollapsedimpl(getValue$foundation_release().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m13013copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((position == null || layoutResult == null) ? TextRange.m12767getMaximpl(getValue$foundation_release().getSelection()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(layoutResult, position.m10451unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setHandleState((position == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean showFloatingToolbar) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m10349requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(showFloatingToolbar);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    @Nullable
    /* renamed from: getClipboard$foundation_release, reason: from getter */
    public final Clipboard getClipboard() {
        return this.clipboard;
    }

    @Nullable
    /* renamed from: getCoroutineScope$foundation_release, reason: from getter */
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m8092getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m8093getCursorPositiontuRUvjQ$foundation_release(@NotNull Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m12770getStartimpl(getValue$foundation_release().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        AbstractC5830k.m5327d(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(AbstractC5806u.m5274m(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return Offset.m10433constructorimpl((Float.floatToRawIntBits((density.mo6903toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2) + cursorRect.getLeft()) << 32) | (Float.floatToRawIntBits(cursorRect.getBottom()) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
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

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int iM12770getStartimpl = isStartHandle ? TextRange.m12770getStartimpl(getValue$foundation_release().getSelection()) : TextRange.m12765getEndimpl(getValue$foundation_release().getSelection());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, iM12770getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m8094getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        if (!AbstractC5830k.m5325b(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation_release().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(isStartHandle ? TextRange.m12770getStartimpl(selection) : TextRange.m12765getEndimpl(selection)), isStartHandle, TextRange.m12769getReversedimpl(getValue$foundation_release().getSelection()));
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @NotNull
    /* renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    @NotNull
    /* renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    /* renamed from: getOnValueChange$foundation_release, reason: from getter */
    public final InterfaceC6471c getOnValueChange() {
        return this.onValueChange;
    }

    @Nullable
    /* renamed from: getRequestAutofillAction$foundation_release, reason: from getter */
    public final InterfaceC6469a getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    @Nullable
    /* renamed from: getState$foundation_release, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @NotNull
    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    @Nullable
    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    @NotNull
    /* renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7692onDownk4lQ0M(long point) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM8031getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m8031getAdjustedCoordinatesk4lQ0M(this.this$0.m8094getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM8031getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m8089setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(jM7729translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m10457getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7693onDragk4lQ0M(long delta) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m10446plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m8089setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(Offset.m10446plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM8092getCurrentDragPosition_m7T9E = this.this$0.m8092getCurrentDragPosition_m7T9E();
                AbstractC5830k.m5327d(offsetM8092getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m8090updateSelection8UEBfa8(value$foundation_release, offsetM8092getCurrentDragPosition_m7T9E.m10451unboximpl(), false, isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7694onStartk4lQ0M(long startPoint) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m8089setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m8089setCurrentDragPosition_kEHs6E(null);
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
        return !AbstractC5830k.m5325b(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    @Nullable
    public final InterfaceC6013w0 paste$foundation_release() {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v != null) {
            return AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
        return null;
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM8087createTextFieldValueFDrldGo = m8087createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM8087createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m13013copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM8087createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m8095selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m7723isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m7728translateDecorationToInnerCoordinatesMKHz9U$foundation_release(position), TextRange.m12758boximpl(getValue$foundation_release().getSelection()))) {
            return;
        }
        m8090updateSelection8UEBfa8(getValue$foundation_release(), position, true, false, SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final void setClipboard$foundation_release(@Nullable Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation_release(@Nullable InterfaceC6009v interfaceC6009v) {
        this.coroutineScope = interfaceC6009v;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m8096setDeletionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m7628setDeletionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m7631setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m12775getZerod9O1mEE());
        }
        if (TextRange.m12764getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z8) {
        this.editable.setValue(Boolean.valueOf(z8));
    }

    public final void setEnabled(boolean z8) {
        this.enabled.setValue(Boolean.valueOf(z8));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@NotNull InterfaceC6471c interfaceC6471c) {
        this.onValueChange = interfaceC6471c;
    }

    public final void setRequestAutofillAction$foundation_release(@Nullable InterfaceC6469a interfaceC6469a) {
        this.requestAutofillAction = interfaceC6469a;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m8097setSelectionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m7631setSelectionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m7628setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m12775getZerod9O1mEE());
        }
        if (TextRange.m12764getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(@Nullable LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    @Nullable
    public final InterfaceC6013w0 showSelectionToolbar$foundation_release() {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v != null) {
            return AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1);
        }
        return null;
    }

    public TextFieldSelectionManager(@Nullable UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            public final void invoke(TextFieldValue textFieldValue) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return C5443s.f8405a;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC5824e) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m10457getZeroF1C5BW0();
        this.dragTotalDistance = companion.m10457getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC5824e) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m8089setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM12764getCollapsedimpl = TextRange.m12764getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection());
                this.this$0.setHandleState(zM12764getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!zM12764getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!zM12764getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state3 = this.this$0.getState();
                if (state3 == null) {
                    return;
                }
                state3.setShowCursorHandle(zM12764getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7692onDownk4lQ0M(long point) {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo7693onDragk4lQ0M(long r10) {
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
                    long r10 = androidx.compose.p011ui.geometry.Offset.m10446plusMKHz9U(r1, r10)
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
                    long r1 = androidx.compose.p011ui.geometry.Offset.m10446plusMKHz9U(r1, r3)
                    androidx.compose.ui.geometry.Offset r1 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r1)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m8085access$setCurrentDragPosition_kEHs6E(r10, r1)
                    java.lang.Integer r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r10)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.geometry.Offset r1 = r10.m8092getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC5830k.m5327d(r1)
                    long r1 = r1.m10451unboximpl()
                    boolean r1 = r0.m7727isPositionOnTextk4lQ0M(r1)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.text.input.OffsetMapping r6 = r10.getOffsetMapping()
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    r4 = 2
                    r5 = 0
                    r3 = 0
                    int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r6 = r6.transformedToOriginal(r1)
                    androidx.compose.ui.text.input.OffsetMapping r7 = r10.getOffsetMapping()
                    androidx.compose.ui.geometry.Offset r1 = r10.m8092getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC5830k.m5327d(r1)
                    long r1 = r1.m10451unboximpl()
                    int r0 = androidx.compose.foundation.text.TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
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
                    androidx.compose.ui.geometry.Offset r0 = r10.m8092getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC5830k.m5327d(r0)
                    long r3 = r0.m10451unboximpl()
                    r6 = 0
                    r8 = 1
                    r5 = 0
                    r1 = r10
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m8086access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                    goto Lfc
                Lb4:
                    r1 = r10
                    java.lang.Integer r10 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r10 == 0) goto Lc0
                    int r10 = r10.intValue()
                    goto Lc8
                Lc0:
                    long r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r1)
                    int r10 = r0.m7726getOffsetForPosition3MmeM6k(r2, r11)
                Lc8:
                    androidx.compose.ui.geometry.Offset r2 = r1.m8092getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC5830k.m5327d(r2)
                    long r2 = r2.m10451unboximpl()
                    int r0 = r0.m7726getOffsetForPosition3MmeM6k(r2, r11)
                    java.lang.Integer r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r2 != 0) goto Le0
                    if (r10 != r0) goto Le0
                    goto L104
                Le0:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r1.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r10 = r1.m8092getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC5830k.m5327d(r10)
                    long r3 = r10.m10451unboximpl()
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r7 = r10.getWord()
                    r8 = 1
                    r5 = 0
                    r6 = 0
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m8086access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                Lfc:
                    androidx.compose.p011ui.text.TextRange.m12758boximpl(r0)
                Lff:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$updateFloatingToolbar(r10, r11)
                L104:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo7693onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7694onStartk4lQ0M(long startPoint) {
                long j7;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state = this.this$0.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m7727isPositionOnTextk4lQ0M(startPoint)) {
                        j7 = startPoint;
                        LegacyTextFieldState state2 = this.this$0.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(layoutResult, j7, false, 2, null));
                            TextFieldValue textFieldValueM8087createTextFieldValueFDrldGo = textFieldSelectionManager.m8087createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11422getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange().invoke(textFieldValueM8087createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        j7 = startPoint;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m12770getStartimpl(textFieldSelectionManager2.m8090updateSelection8UEBfa8(TextFieldValue.m13013copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.INSTANCE.m12775getZerod9O1mEE(), (TextRange) null, 5, (Object) null), startPoint, true, false, SelectionAdjustment.INSTANCE.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j7;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m8089setCurrentDragPosition_kEHs6E(Offset.m10430boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.INSTANCE.m10457getZeroF1C5BW0();
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
            public boolean mo7941onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
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
            public boolean mo7942onExtendk4lQ0M(long downPosition) {
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
            public boolean mo7943onExtendDragk4lQ0M(long dragPosition) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), dragPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo7944onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m10349requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                this.this$0.dragBeginPosition = downPosition;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, adjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue value, long currentPosition, boolean isStartOfSelection, SelectionAdjustment adjustment) {
                this.this$0.setHandleState(TextRange.m12764getCollapsedimpl(this.this$0.m8090updateSelection8UEBfa8(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : undoManager);
    }
}
