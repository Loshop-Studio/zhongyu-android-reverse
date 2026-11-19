package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.p006ui.focus.FocusRequester;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.hapticfeedback.HapticFeedback;
import androidx.compose.p006ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.platform.ClipboardManager;
import androidx.compose.p006ui.platform.TextToolbar;
import androidx.compose.p006ui.platform.TextToolbarStatus;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.text.TextRangeKt;
import androidx.compose.p006ui.text.input.OffsetMapping;
import androidx.compose.p006ui.text.input.TextFieldValue;
import androidx.compose.p006ui.text.input.TextFieldValueKt;
import androidx.compose.p006ui.text.input.VisualTransformation;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020B2\b\b\u0002\u0010j\u001a\u00020!H\u0000¢\u0006\u0002\bkJ%\u0010l\u001a\u00020?2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ\r\u0010u\u001a\u00020BH\u0000¢\u0006\u0002\bvJ\u001f\u0010w\u001a\u00020B2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\bxJ\r\u0010y\u001a\u00020BH\u0000¢\u0006\u0002\bzJ\r\u0010{\u001a\u00020BH\u0000¢\u0006\u0002\b|J\b\u0010}\u001a\u00020~H\u0002J$\u0010\u007f\u001a\u00020\f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J$\u0010\u0084\u0001\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020!H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020T2\u0007\u0010\u0085\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u008d\u0001J\u000f\u0010\u008e\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0091\u0001J\u0013\u0010\u0092\u0001\u001a\u00020B2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0002J\u000f\u0010\u0095\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0096\u0001J6\u0010\u0097\u0001\u001a\u00020B2\u0006\u0010Y\u001a\u00020?2\u0007\u0010\u0098\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020!2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR8\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0019\u0010\u0017\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R\u0019\u0010\u0019\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020B0AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR+\u0010Y\u001a\u00020?2\u0006\u0010\u000b\u001a\u00020?8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010\u0013\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020`X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, m5175d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateSelection", "transformedStartOffset", "transformedEndOffset", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n76#2:907\n102#2,2:908\n76#2:910\n102#2,2:911\n76#2:913\n102#2,2:914\n76#2:916\n102#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private TextFieldState state;
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

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        textFieldSelectionManager.copy$foundation_release(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m7769createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m7770deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m7773deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        float fM8946getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.getIsLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m11077getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m11072getEndimpl(getValue$foundation_release().getSelection()));
                TextFieldState textFieldState2 = this.state;
                long jM8961getZeroF1C5BW0 = (textFieldState2 == null || (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m8961getZeroF1C5BW0() : layoutCoordinates4.mo10591localToRootMKHz9U(m7776getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState textFieldState3 = this.state;
                long jM8961getZeroF1C5BW02 = (textFieldState3 == null || (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m8961getZeroF1C5BW0() : layoutCoordinates3.mo10591localToRootMKHz9U(m7776getHandlePositiontuRUvjQ$foundation_release(false));
                TextFieldState textFieldState4 = this.state;
                float fM8946getYimpl2 = 0.0f;
                if (textFieldState4 == null || (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) == null) {
                    fM8946getYimpl = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    fM8946getYimpl = Offset.m8946getYimpl(layoutCoordinates2.mo10591localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    fM8946getYimpl2 = Offset.m8946getYimpl(layoutCoordinates.mo10591localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m8945getXimpl(jM8961getZeroF1C5BW0), Offset.m8945getXimpl(jM8961getZeroF1C5BW02)), Math.min(fM8946getYimpl, fM8946getYimpl2), Math.max(Offset.m8945getXimpl(jM8961getZeroF1C5BW0), Offset.m8945getXimpl(jM8961getZeroF1C5BW02)), Math.max(Offset.m8946getYimpl(jM8961getZeroF1C5BW0), Offset.m8946getYimpl(jM8961getZeroF1C5BW02)) + (C1700Dp.m11525constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m7771setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue value, int transformedStartOffset, int transformedEndOffset, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResultProxy layoutResult;
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m11077getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m11072getEndimpl(value.getSelection())));
        TextFieldState textFieldState = this.state;
        long jM7766getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m7766getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), transformedStartOffset, transformedEndOffset, TextRange.m11071getCollapsedimpl(jTextRange) ? null : TextRange.m11065boximpl(jTextRange), isStartHandle, adjustment);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m11077getStartimpl(jM7766getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m11072getEndimpl(jM7766getTextFieldSelectionbb3KNj8)));
        if (TextRange.m11070equalsimpl0(jTextRange2, value.getSelection())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo9744performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m9753getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m7769createTextFieldValueFDrldGo(value.getText(), jTextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m7772contextMenuOpenAdjustmentk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            return;
        }
        int iM7690getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(layoutResult, position, false, 2, null);
        if (TextRange.m11068containsimpl(getValue$foundation_release().getSelection(), iM7690getOffsetForPosition3MmeM6k$default)) {
            return;
        }
        updateSelection(getValue$foundation_release(), iM7690getOffsetForPosition3MmeM6k$default, iM7690getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m11071getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int iM11074getMaximpl = TextRange.m11074getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m7769createTextFieldValueFDrldGo(getValue$foundation_release().getText(), TextRangeKt.TextRange(iM11074getMaximpl, iM11074getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7654onDownk4lQ0M(long point) {
                this.this$0.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(SelectionHandlesKt.m7724getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m7776getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7655onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m8950plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(Offset.m8950plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM7774getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m7774getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM7774getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(value.m11049getOffsetForPositionk4lQ0M(offsetM7774getCurrentDragPosition_m7T9E.getPackedValue()));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m11070equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo9744performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m9753getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m7769createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getText(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7656onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m7724getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m7776getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(textFieldSelectionManager2.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m8961getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m7771setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m7771setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m11071getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM11075getMinimpl = TextRange.m11075getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m7769createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM11075getMinimpl, iM11075getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7773deselect_kEHs6E$foundation_release(androidx.compose.p006ui.geometry.Offset r9) {
        /*
            r8 = this;
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.getValue$foundation_release()
            long r0 = r0.getSelection()
            boolean r0 = androidx.compose.p006ui.text.TextRange.m11071getCollapsedimpl(r0)
            if (r0 != 0) goto L50
            androidx.compose.foundation.text.TextFieldState r0 = r8.state
            if (r0 == 0) goto L17
            androidx.compose.foundation.text.TextLayoutResultProxy r0 = r0.getLayoutResult()
            goto L18
        L17:
            r0 = 0
        L18:
            r1 = r0
            if (r9 == 0) goto L2f
            if (r1 == 0) goto L2f
            androidx.compose.ui.text.input.OffsetMapping r0 = r8.offsetMapping
            long r2 = r9.getPackedValue()
            r4 = 0
            r5 = 2
            r6 = 0
            int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(r1, r2, r4, r5, r6)
            int r0 = r0.transformedToOriginal(r1)
            goto L3b
        L2f:
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.getValue$foundation_release()
            long r0 = r0.getSelection()
            int r0 = androidx.compose.p006ui.text.TextRange.m11074getMaximpl(r0)
        L3b:
            androidx.compose.ui.text.input.TextFieldValue r1 = r8.getValue$foundation_release()
            r2 = 0
            long r3 = androidx.compose.p006ui.text.TextRangeKt.TextRange(r0)
            r5 = 0
            r6 = 5
            r7 = 0
            androidx.compose.ui.text.input.TextFieldValue r0 = androidx.compose.p006ui.text.input.TextFieldValue.m11278copy3r_uNRQ$default(r1, r2, r3, r5, r6, r7)
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r1 = r8.onValueChange
            r1.invoke(r0)
        L50:
            if (r9 == 0) goto L68
            androidx.compose.ui.text.input.TextFieldValue r9 = r8.getValue$foundation_release()
            java.lang.String r9 = r9.getText()
            int r9 = r9.length()
            if (r9 <= 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            if (r9 == 0) goto L68
            androidx.compose.foundation.text.HandleState r9 = androidx.compose.foundation.text.HandleState.Cursor
            goto L6a
        L68:
            androidx.compose.foundation.text.HandleState r9 = androidx.compose.foundation.text.HandleState.None
        L6a:
            r8.setHandleState(r9)
            r8.hideSelectionToolbar$foundation_release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.m7773deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset):void");
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z3 = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z3 = true;
        }
        if (z3 && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    /* renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m7774getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m7775getCursorPositiontuRUvjQ$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m11077getStartimpl(getValue$foundation_release().getSelection()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt___RangesKt.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo7206toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m7776getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        long selection = getValue$foundation_release().getSelection();
        int iM11077getStartimpl = isStartHandle ? TextRange.m11077getStartimpl(selection) : TextRange.m11072getEndimpl(selection);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(iM11077getStartimpl), isStartHandle, TextRange.m11076getReversedimpl(getValue$foundation_release().getSelection()));
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

    /* renamed from: getState$foundation_release, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
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
            public void mo7654onDownk4lQ0M(long point) {
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(SelectionHandlesKt.m7724getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m7776getHandlePositiontuRUvjQ$foundation_release(isStartHandle))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7655onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                int iOriginalToTransformed;
                int iM11049getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m8950plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    boolean z3 = isStartHandle;
                    textFieldSelectionManager2.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(Offset.m8950plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    if (z3) {
                        Offset offsetM7774getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m7774getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM7774getCurrentDragPosition_m7T9E);
                        iOriginalToTransformed = value.m11049getOffsetForPositionk4lQ0M(offsetM7774getCurrentDragPosition_m7T9E.getPackedValue());
                    } else {
                        iOriginalToTransformed = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m11077getStartimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    }
                    int i4 = iOriginalToTransformed;
                    if (z3) {
                        iM11049getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m11072getEndimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    } else {
                        Offset offsetM7774getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m7774getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM7774getCurrentDragPosition_m7T9E2);
                        iM11049getOffsetForPositionk4lQ0M = value.m11049getOffsetForPositionk4lQ0M(offsetM7774getCurrentDragPosition_m7T9E2.getPackedValue());
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i4, iM11049getOffsetForPositionk4lQ0M, z3, SelectionAdjustment.INSTANCE.getCharacter());
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7656onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m7724getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m7776getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(textFieldSelectionManager2.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m8961getZeroF1C5BW0();
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldState state = this.this$0.getState();
                if (state == null) {
                    return;
                }
                state.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m7771setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m7771setCurrentDragPosition_kEHs6E(null);
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

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM11075getMinimpl = TextRange.m11075getMinimpl(getValue$foundation_release().getSelection()) + text.length();
        this.onValueChange.invoke(m7769createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM11075getMinimpl, iM11075getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM7769createTextFieldValueFDrldGo = m7769createTextFieldValueFDrldGo(getValue$foundation_release().getText(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM7769createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m11278copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM7769createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setShowFloatingToolbar(true);
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z3) {
        this.editable.setValue(Boolean.valueOf(z3));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation_release() {
        /*
            r9 = this;
            androidx.compose.ui.text.input.VisualTransformation r0 = r9.visualTransformation
            boolean r0 = r0 instanceof androidx.compose.p006ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r1 = r1.getSelection()
            boolean r1 = androidx.compose.p006ui.text.TextRange.m11071getCollapsedimpl(r1)
            r2 = 0
            if (r1 != 0) goto L1c
            if (r0 != 0) goto L1c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r1.<init>()
            r5 = r1
            goto L1d
        L1c:
            r5 = r2
        L1d:
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r3 = r1.getSelection()
            boolean r1 = androidx.compose.p006ui.text.TextRange.m11071getCollapsedimpl(r3)
            if (r1 != 0) goto L3a
            boolean r1 = r9.getEditable()
            if (r1 == 0) goto L3a
            if (r0 != 0) goto L3a
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>()
            r7 = r0
            goto L3b
        L3a:
            r7 = r2
        L3b:
            boolean r0 = r9.getEditable()
            if (r0 == 0) goto L57
            androidx.compose.ui.platform.ClipboardManager r0 = r9.clipboardManager
            r1 = 0
            if (r0 == 0) goto L4e
            boolean r0 = r0.hasText()
            r3 = 1
            if (r0 != r3) goto L4e
            r1 = r3
        L4e:
            if (r1 == 0) goto L57
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>()
            r6 = r0
            goto L58
        L57:
            r6 = r2
        L58:
            androidx.compose.ui.text.input.TextFieldValue r0 = r9.getValue$foundation_release()
            long r0 = r0.getSelection()
            int r0 = androidx.compose.p006ui.text.TextRange.m11073getLengthimpl(r0)
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            if (r0 == r1) goto L77
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r2.<init>()
        L77:
            r8 = r2
            androidx.compose.ui.platform.TextToolbar r3 = r9.textToolbar
            if (r3 == 0) goto L83
            androidx.compose.ui.geometry.Rect r4 = r9.getContentRect()
            r3.showMenu(r4, r5, r6, r7, r8)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation_release():void");
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m8961getZeroF1C5BW0();
        this.dragTotalDistance = companion.m8961getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo7654onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo7655onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m8950plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    textFieldSelectionManager2.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(Offset.m8950plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    Integer num = textFieldSelectionManager2.dragBeginOffsetInText;
                    int iIntValue = num != null ? num.intValue() : layoutResult.m7692getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                    Offset offsetM7774getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m7774getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(offsetM7774getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), iIntValue, layoutResult.m7692getOffsetForPosition3MmeM6k(offsetM7774getCurrentDragPosition_m7T9E.getPackedValue(), false), false, SelectionAdjustment.INSTANCE.getWord());
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo7656onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                if (this.this$0.getDraggingHandle() != null) {
                    return;
                }
                this.this$0.setDraggingHandle(Handle.SelectionEnd);
                this.this$0.hideSelectionToolbar$foundation_release();
                TextFieldState state2 = this.this$0.getState();
                if (!((state2 == null || (layoutResult3 = state2.getLayoutResult()) == null || !layoutResult3.m7693isPositionOnTextk4lQ0M(startPoint)) ? false : true) && (state = this.this$0.getState()) != null && (layoutResult2 = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                    int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult2, layoutResult2.getLineForVerticalPosition(Offset.m8946getYimpl(startPoint)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo9744performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m9753getTextHandleMove5zf0vsI());
                    }
                    TextFieldValue textFieldValueM7769createTextFieldValueFDrldGo = textFieldSelectionManager.m7769createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getText(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM7769createTextFieldValueFDrldGo);
                    return;
                }
                if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                this.this$0.enterSelectionMode$foundation_release();
                TextFieldState state3 = this.this$0.getState();
                if (state3 != null && (layoutResult = state3.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    int iM7690getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(layoutResult, startPoint, false, 2, null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), iM7690getOffsetForPosition3MmeM6k$default, iM7690getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(iM7690getOffsetForPosition3MmeM6k$default);
                }
                this.this$0.dragBeginPosition = startPoint;
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                textFieldSelectionManager3.m7771setCurrentDragPosition_kEHs6E(Offset.m8934boximpl(textFieldSelectionManager3.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m8961getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m7771setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
                this.this$0.dragBeginOffsetInText = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo7657onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                if ((this.this$0.getValue$foundation_release().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                int iM7692getOffsetForPosition3MmeM6k = layoutResult.m7692getOffsetForPosition3MmeM6k(dragPosition, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                Integer num = textFieldSelectionManager.dragBeginOffsetInText;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), iM7692getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo7658onExtendk4lQ0M(long downPosition) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m11077getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo7659onExtendDragk4lQ0M(long dragPosition) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                if ((this.this$0.getValue$foundation_release().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m11077getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), layoutResult.m7692getOffsetForPosition3MmeM6k(dragPosition, false), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo7660onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = downPosition;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null));
                int iM7690getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m7690getOffsetForPosition3MmeM6k$default(layoutResult, textFieldSelectionManager.dragBeginPosition, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), iM7690getOffsetForPosition3MmeM6k$default, iM7690getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : undoManager);
    }
}
