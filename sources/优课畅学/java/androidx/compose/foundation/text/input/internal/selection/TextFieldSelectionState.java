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
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private Density density;
    private final MutableState directDragGestureInitiator$delegate;
    private final MutableState draggingHandle$delegate;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private boolean isPassword;
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private final MutableState rawHandleDragPosition$delegate;
    private boolean readOnly;
    private InterfaceC10559a receiveContentConfiguration;
    private InterfaceC10559a requestAutofillAction;
    private final MutableState showCursorHandle$delegate;
    private final MutableState startTextLayoutPositionInWindow$delegate;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbarHandler textToolbarHandler;
    private final MutableState textToolbarState$delegate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputType {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
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
            $ENTRIES = AbstractC9108a.m16085a(inputTypeArr$values);
        }

        private InputType(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m24050getUnspecifiedF1C5BW0();
        private final InterfaceC10559a requestFocus;

        public TextFieldMouseSelectionObserver(InterfaceC10559a interfaceC10559a) {
            this.requestFocus = interfaceC10559a;
        }

        /* renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m21534updateSelectionr1Wruf4(long j10, SelectionAdjustment selectionAdjustment, boolean z10) {
            Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m21466getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int iM21466getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m21466getOffsetForPosition3MmeM6k(j10, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM21530updateSelectionSsLRf8 = textFieldSelectionState.m21530updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), iIntValue, iM21466getOffsetForPosition3MmeM6k, false, selectionAdjustment, false, z10);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m26358getCollapsedimpl(jM21530updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m26364getStartimpl(jM21530updateSelectionSsLRf8);
            }
            if (TextRange.m26363getReversedimpl(jM21530updateSelectionSsLRf8)) {
                jM21530updateSelectionSsLRf8 = TextFieldSelectionStateKt.m21552reverse5zctL8(jM21530updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m21483selectCharsIn5zctL8(jM21530updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return jM21530updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo21535onDrag3MmeM6k(final long j10, SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m24043toStringimpl(j10));
                }
            });
            m21534updateSelectionr1Wruf4(j10, selectionAdjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo21536onExtendk4lQ0M(long j10) {
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo21537onExtendDragk4lQ0M(long j10) {
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo21538onStart3MmeM6k(long j10, SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = j10;
            this.dragBeginOffsetInText = TextRange.m26364getStartimpl(m21534updateSelectionr1Wruf4(j10, selectionAdjustment, true));
            return true;
        }
    }

    public final class TextFieldTextDragObserver implements TextDragObserver {
        private Handle actingHandle;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition;
        private long dragTotalDistance;
        private final InterfaceC10559a requestFocus;

        public TextFieldTextDragObserver(InterfaceC10559a interfaceC10559a) {
            this.requestFocus = interfaceC10559a;
            Offset.Companion companion = Offset.Companion;
            this.dragBeginPosition = companion.m24050getUnspecifiedF1C5BW0();
            this.dragTotalDistance = companion.m24051getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // p300x7.InterfaceC10559a
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.Companion;
                this.dragBeginPosition = companion.m24050getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m24051getZeroF1C5BW0();
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
        public void mo21286onDownk4lQ0M(long j10) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo21287onDragk4lQ0M(long j10) {
            int iIntValue;
            int iM21466getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return;
            }
            long jM24040plusMKHz9U = Offset.m24040plusMKHz9U(this.dragTotalDistance, j10);
            this.dragTotalDistance = jM24040plusMKHz9U;
            final long jM24040plusMKHz9U2 = Offset.m24040plusMKHz9U(this.dragBeginPosition, jM24040plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.m24043toStringimpl(jM24040plusMKHz9U2));
                }
            });
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.textLayoutState.m21467isPositionOnTextk4lQ0M(jM24040plusMKHz9U2)) {
                Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m21466getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                iM21466getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m21466getOffsetForPosition3MmeM6k(jM24040plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && iIntValue == iM21466getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = SelectionAdjustment.Companion.getWord();
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                iIntValue = TextLayoutState.m21463getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                iM21466getOffsetForPosition3MmeM6k = TextLayoutState.m21463getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM24040plusMKHz9U2, false, 2, null);
                word = iIntValue == iM21466getOffsetForPosition3MmeM6k ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
            }
            int i10 = iIntValue;
            int i11 = iM21466getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long jM21345getSelectiond9O1mEE = TextFieldSelectionState.this.textFieldState.getVisualText().m21345getSelectiond9O1mEE();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM21531updateSelectionSsLRf8$default = TextFieldSelectionState.m21531updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i10, i11, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m26358getCollapsedimpl(jM21531updateSelectionSsLRf8$default)) {
                this.dragBeginOffsetInText = TextRange.m26364getStartimpl(jM21531updateSelectionSsLRf8$default);
            }
            if (TextRange.m26363getReversedimpl(jM21531updateSelectionSsLRf8$default)) {
                jM21531updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m21552reverse5zctL8(jM21531updateSelectionSsLRf8$default);
            }
            if (!TextRange.m26357equalsimpl0(jM21531updateSelectionSsLRf8$default, jM21345getSelectiond9O1mEE)) {
                Handle handle = (TextRange.m26364getStartimpl(jM21531updateSelectionSsLRf8$default) == TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE) || TextRange.m26359getEndimpl(jM21531updateSelectionSsLRf8$default) != TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE)) ? ((TextRange.m26364getStartimpl(jM21531updateSelectionSsLRf8$default) != TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE) || TextRange.m26359getEndimpl(jM21531updateSelectionSsLRf8$default) == TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE)) && ((float) (TextRange.m26364getStartimpl(jM21531updateSelectionSsLRf8$default) + TextRange.m26359getEndimpl(jM21531updateSelectionSsLRf8$default))) / 2.0f <= ((float) (TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE) + TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE))) / 2.0f) ? Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
                this.actingHandle = handle;
            }
            if (TextRange.m26358getCollapsedimpl(jM21345getSelectiond9O1mEE) || !TextRange.m26358getCollapsedimpl(jM21531updateSelectionSsLRf8$default)) {
                TextFieldSelectionState.this.textFieldState.m21483selectCharsIn5zctL8(jM21531updateSelectionSsLRf8$default);
            }
            TextFieldSelectionState.this.m21533updateHandleDraggingUv8p0NA(this.actingHandle, jM24040plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-k-4lQ0M */
        public void mo21288onStartk4lQ0M(final long j10) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m24043toStringimpl(j10));
                    }
                });
                TextFieldSelectionState.this.m21533updateHandleDraggingUv8p0NA(this.actingHandle, j10);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = j10;
                this.dragTotalDistance = Offset.Companion.m24051getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (TextFieldSelectionState.this.textLayoutState.getLayoutResult() == null) {
                    return;
                }
                if (TextFieldSelectionState.this.textLayoutState.m21467isPositionOnTextk4lQ0M(j10)) {
                    if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                        return;
                    }
                    int iM21463getOffsetForPosition3MmeM6k$default = TextLayoutState.m21463getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j10, false, 2, null);
                    long jM21531updateSelectionSsLRf8$default = TextFieldSelectionState.m21531updateSelectionSsLRf8$default(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.getVisualText(), TextRange.Companion.m26369getZerod9O1mEE(), null, null, null, 28, null), iM21463getOffsetForPosition3MmeM6k$default, iM21463getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord(), false, false, 96, null);
                    TextFieldSelectionState.this.textFieldState.m21483selectCharsIn5zctL8(jM21531updateSelectionSsLRf8$default);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                    this.dragBeginOffsetInText = TextRange.m26364getStartimpl(jM21531updateSelectionSsLRf8$default);
                    return;
                }
                int iM21463getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m21463getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j10, false, 2, null);
                HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25016getTextHandleMove5zf0vsI());
                }
                TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(iM21463getOffsetForPosition3MmeM6k$default2);
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {1325, 1327}, m17803m = "canPaste")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 */
    public static final class C18551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18551(InterfaceC9324c<? super C18551> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.canPaste(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {1311}, m17803m = "copy")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 */
    public static final class C18561 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C18561(InterfaceC9324c<? super C18561> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.copy(false, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m17801f = "TextFieldSelectionState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2 */
    public static final class C18572 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m17801f = "TextFieldSelectionState.kt", m17802l = {372}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m17801f = "TextFieldSelectionState.kt", m17802l = {373}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m17801f = "TextFieldSelectionState.kt", m17802l = {375}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, InterfaceC9324c<? super AnonymousClass3> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m21539invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m21539invokek4lQ0M(long j10) {
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
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC10570l, this, 7, null) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18572(PointerInputScope pointerInputScope, InterfaceC9324c<? super C18572> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18572 c18572 = TextFieldSelectionState.this.new C18572(this.$this_cursorHandleGestures, interfaceC9324c);
            c18572.L$0 = obj;
            return c18572;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC9212n> interfaceC9324c) {
            return ((C18572) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.f17555d;
            AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass2(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            return AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1, null);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {1287}, m17803m = "cut")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 */
    public static final class C18581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18581(InterfaceC9324c<? super C18581> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.cut(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m17803m = "detectCursorHandleDragGestures")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 */
    public static final class C18591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C18591(InterfaceC9324c<? super C18591> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {984}, m17803m = "detectSelectionHandleDragGestures")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 */
    public static final class C18641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C18641(InterfaceC9324c<? super C18641> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", m17801f = "TextFieldSelectionState.kt", m17802l = {489}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2 */
    public static final class C18702 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18702(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, InterfaceC9324c<? super C18702> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$interactionSource = mutableInteractionSource;
            this.this$0 = textFieldSelectionState;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m21548invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m21548invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C18702 c18702 = new C18702(this.$interactionSource, this.this$0, interfaceC9324c);
            c18702.L$0 = pressGestureScope;
            c18702.J$0 = j10;
            return c18702.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.this$0, j10, mutableInteractionSource, null);
                    this.label = 1;
                    if (AbstractC9165e.m16556e(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", m17801f = "TextFieldSelectionState.kt", m17802l = {453}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2 */
    public static final class C18732 extends RestrictedSuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        public C18732(InterfaceC9324c<? super C18732> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18732 c18732 = TextFieldSelectionState.this.new C18732(interfaceC9324c);
            c18732.L$0 = obj;
            return c18732;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C18732) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r5)
                goto L30
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.AbstractC9079b.m15926b(r5)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18732.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 */
    public /* synthetic */ class C18753 extends FunctionReferenceImpl implements InterfaceC10574p {
        public static final C18753 INSTANCE = new C18753();

        public C18753() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // p300x7.InterfaceC10574p
        public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {1332, 1334, 1334}, m17803m = "paste")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 */
    public static final class C18791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18791(InterfaceC9324c<? super C18791> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.paste(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {1365}, m17803m = "pasteAsPlainText")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 */
    public static final class C18801 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18801(InterfaceC9324c<? super C18801> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.pasteAsPlainText(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m17801f = "TextFieldSelectionState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 */
    public static final class C18812 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m17801f = "TextFieldSelectionState.kt", m17802l = {392}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m17801f = "TextFieldSelectionState.kt", m17802l = {394}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z10, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    final boolean z10 = this.$isStartHandle;
                    TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                        /* renamed from: onEvent-k-4lQ0M */
                        public final void mo21503onEventk4lQ0M(long j10) {
                            textFieldSelectionState.markStartContentVisibleOffset();
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            boolean z11 = z10;
                            textFieldSelectionState2.m21533updateHandleDraggingUv8p0NA(z11 ? Handle.SelectionStart : Handle.SelectionEnd, SelectionHandlesKt.m21625getAdjustedCoordinatesk4lQ0M(textFieldSelectionState2.m21523getHandlePositiontuRUvjQ(z11)));
                        }
                    };
                    final TextFieldSelectionState textFieldSelectionState2 = this.this$0;
                    InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21550invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21550invoke() {
                            textFieldSelectionState2.clearHandleDragging();
                        }
                    };
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, interfaceC10559a, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", m17801f = "TextFieldSelectionState.kt", m17802l = {TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z10, InterfaceC9324c<? super AnonymousClass3> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    boolean z10 = this.$isStartHandle;
                    this.label = 1;
                    if (textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z10, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18812(PointerInputScope pointerInputScope, boolean z10, InterfaceC9324c<? super C18812> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18812 c18812 = TextFieldSelectionState.this.new C18812(this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC9324c);
            c18812.L$0 = obj;
            return c18812;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC9212n> interfaceC9324c) {
            return ((C18812) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.f17555d;
            AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_selectionHandleGestures, null), 1, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass2(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1, null);
            return AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new AnonymousClass3(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m17801f = "TextFieldSelectionState.kt", m17802l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m17803m = "startToolbarAndHandlesVisibilityObserver")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 */
    public static final class C18821 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18821(InterfaceC9324c<? super C18821> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.startToolbarAndHandlesVisibilityObserver(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", m17801f = "TextFieldSelectionState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 */
    public static final class C18832 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", m17801f = "TextFieldSelectionState.kt", m17802l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextChanges(this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", m17801f = "TextFieldSelectionState.kt", m17802l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextToolbarVisibility(this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        public C18832(InterfaceC9324c<? super C18832> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18832 c18832 = TextFieldSelectionState.this.new C18832(interfaceC9324c);
            c18832.L$0 = obj;
            return c18832;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC9212n> interfaceC9324c) {
            return ((C18832) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3, null);
            return AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(TextFieldSelectionState.this, null), 3, null);
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z10;
        this.readOnly = z11;
        this.isFocused = z12;
        this.isPassword = z13;
        Offset.Companion companion = Offset.Companion;
        this.startTextLayoutPositionInWindow$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m24024boximpl(companion.m24050getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m24024boximpl(companion.m24050getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.textToolbarState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState textFieldSelectionState, boolean z10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return textFieldSelectionState.copy(z10, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.p013ui.input.pointer.PointerInputScope r9, p179m7.InterfaceC9324c<? super p123h7.C8736p> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18591
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18591) r0
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3c
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref$LongRef) r9
            java.lang.Object r0 = r6.L$1
            r1 = r0
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r0 = r6.L$0
            r2 = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: java.lang.Throwable -> L39
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
            kotlin.AbstractC9079b.m15926b(r10)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.p013ui.geometry.Offset.Companion
            long r3 = r1.m24050getUnspecifiedF1C5BW0()
            r10.f17472a = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            long r3 = r1.m24050getUnspecifiedF1C5BW0()
            r7.f17472a = r3
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
            h7.p r9 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((ref$LongRef.f17472a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            Offset.Companion companion = Offset.Companion;
            ref$LongRef.f17472a = companion.m24050getUnspecifiedF1C5BW0();
            ref$LongRef2.f17472a = companion.m24050getUnspecifiedF1C5BW0();
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
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.p013ui.input.pointer.PointerInputScope r15, final boolean r16, p179m7.InterfaceC9324c<? super p123h7.C8736p> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$6(Ref$LongRef ref$LongRef, TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef2) {
        if ((ref$LongRef.f17472a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.Companion;
            ref$LongRef.f17472a = companion.m24050getUnspecifiedF1C5BW0();
            ref$LongRef2.f17472a = companion.m24051getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        float fIntBitsToFloat;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m26358getCollapsedimpl(visualText.m21345getSelectiond9O1mEE())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m24075Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo25638localToRootMKHz9U(cursorRect3.m24070getTopLeftF1C5BW0()) : Offset.Companion.m24051getZeroF1C5BW0(), cursorRect3.m24068getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo25638localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo25638localToRootMKHz9U(m21523getHandlePositiontuRUvjQ(true)) : Offset.Companion.m24051getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo25638localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo25638localToRootMKHz9U(m21523getHandlePositiontuRUvjQ(false)) : Offset.Companion.m24051getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fIntBitsToFloat2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates4.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m26364getStartimpl(visualText.m21345getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L))) & 4294967295L));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates5.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m26359getEndimpl(visualText.m21345getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect.getTop()) & 4294967295L))) & 4294967295L));
        }
        int i10 = (int) (jMo25638localToRootMKHz9U >> 32);
        int i11 = (int) (jMo25638localToRootMKHz9U2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U2 & 4294967295L))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m21522getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.Companion.m24050getUnspecifiedF1C5BW0();
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m21523getHandlePositiontuRUvjQ(boolean z10) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        long jM21345getSelectiond9O1mEE = this.textFieldState.getVisualText().m21345getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, z10 ? TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE) : TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE), z10, TextRange.m26363getReversedimpl(jM21345getSelectiond9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m21524getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m24045unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m21525getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow$delegate.getValue()).m24045unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m21526getTextFieldSelectionqeG_v_k(int i10, int i11, TextRange textRange, boolean z10, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m26369getZerod9O1mEE();
        }
        if (textRange == null && AbstractC9133u.m16128b(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i10, i11);
        }
        SelectionLayout selectionLayoutM21628getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m21628getTextFieldSelectionLayoutRcvTLA(layoutResult, i10, i11, this.previousRawDragOffset, textRange != null ? textRange.m26368unboximpl() : TextRange.Companion.m26369getZerod9O1mEE(), textRange == null, z10);
        if (textRange != null && !selectionLayoutM21628getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m26368unboximpl();
        }
        long jM21617toTextRanged9O1mEE = selectionAdjustment.adjust(selectionLayoutM21628getTextFieldSelectionLayoutRcvTLA).m21617toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM21628getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = z10 ? i10 : i11;
        return jM21617toTextRanged9O1mEE;
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
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
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
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC10570l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM24062getBottomCenterF1C5BW0 = getCursorRect().m24062getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m21665containsInclusiveUv8p0NA(rectVisibleBounds, jM24062getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m21529setStartTextLayoutPositionInWindowk4lQ0M(m21522getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = AbstractC9268e.m17028r(AbstractC9268e.m17026p(SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getVisualText();
            }
        }), C18753.INSTANCE), 1).collect(new InterfaceC9267d() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.4
            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((TextFieldCharSequence) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(TextFieldCharSequence textFieldCharSequence, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Rect invoke() {
                Rect rectIntersect;
                boolean zM26358getCollapsedimpl = TextRange.m26358getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getVisualText().m21345getSelectiond9O1mEE());
                if (((!zM26358getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Cursor) && (zM26358getCollapsedimpl || TextFieldSelectionState.this.getTextToolbarState() != TextToolbarState.Selection)) || TextFieldSelectionState.this.getDraggingHandle() != null || !TextFieldSelectionState.this.isInTouchMode()) {
                    return Rect.Companion.getZero();
                }
                LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                if (rectVisibleBounds == null) {
                    return Rect.Companion.getZero();
                }
                LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Offset offsetM24024boximpl = textLayoutCoordinates2 != null ? Offset.m24024boximpl(textLayoutCoordinates2.mo25638localToRootMKHz9U(rectVisibleBounds.m24070getTopLeftF1C5BW0())) : null;
                AbstractC9133u.m16130d(offsetM24024boximpl);
                Rect rectM24075Recttz77jQw = RectKt.m24075Recttz77jQw(offsetM24024boximpl.m24045unboximpl(), rectVisibleBounds.m24068getSizeNHjbRc());
                Rect contentRect = TextFieldSelectionState.this.getContentRect();
                Rect rect = rectM24075Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                return (rect == null || (rectIntersect = rect.intersect(rectM24075Recttz77jQw)) == null) ? Rect.Companion.getZero() : rectIntersect;
            }
        }).collect(new InterfaceC9267d() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.3
            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((Rect) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(Rect rect, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                if (AbstractC9133u.m16128b(rect, Rect.Companion.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextToolbarHandler textToolbarHandler = TextFieldSelectionState.this.textToolbarHandler;
                    if (textToolbarHandler != null) {
                        Object objShowTextToolbar = textToolbarHandler.showTextToolbar(TextFieldSelectionState.this, rect, interfaceC9324c2);
                        return objShowTextToolbar == AbstractC9434a.m17291f() ? objShowTextToolbar : C8736p.f16368a;
                    }
                }
                return C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pasteAsPlainText(p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18801
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18801) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC9079b.m15926b(r9)
            goto L48
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.AbstractC9079b.m15926b(r9)
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
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        L62:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.pasteAsPlainText(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m21527placeCursorAtNearestOffsetk4lQ0M(long j10) {
        int iM26334getOffsetForPositionk4lQ0M;
        int iM26364getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (iM26334getOffsetForPositionk4lQ0M = layoutResult.m26334getOffsetForPositionk4lQ0M(j10)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jM21478mapFromTransformedjx7JFs = transformedTextFieldState.m21478mapFromTransformedjx7JFs(iM26334getOffsetForPositionk4lQ0M);
        long jM21481mapToTransformedGEjPoXI = transformedTextFieldState.m21481mapToTransformedGEjPoXI(jM21478mapFromTransformedjx7JFs);
        int i10 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) && TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? (!TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i10 == 1 || i10 == 2) {
            iM26364getStartimpl = TextRange.m26364getStartimpl(jM21478mapFromTransformedjx7JFs);
        } else if (i10 == 3) {
            selectionWedgeAffinity = MathUtilsKt.m21417findClosestRect9KIMszo(j10, layoutResult.getCursorRect(TextRange.m26364getStartimpl(jM21481mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m26359getEndimpl(jM21481mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            iM26364getStartimpl = TextRange.m26364getStartimpl(jM21478mapFromTransformedjx7JFs);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iM26364getStartimpl = MathUtilsKt.m21417findClosestRect9KIMszo(j10, layoutResult.getCursorRect(TextRange.m26364getStartimpl(jM21481mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m26359getEndimpl(jM21481mapToTransformedGEjPoXI))) < 0 ? TextRange.m26364getStartimpl(jM21478mapFromTransformedjx7JFs) : TextRange.m26359getEndimpl(jM21478mapFromTransformedjx7JFs);
        }
        long jTextRange = TextRangeKt.TextRange(iM26364getStartimpl);
        if (TextRange.m26357equalsimpl0(jTextRange, this.textFieldState.getUntransformedText().m21345getSelectiond9O1mEE()) && (selectionWedgeAffinity == null || AbstractC9133u.m16128b(selectionWedgeAffinity, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m21484selectUntransformedCharsIn5zctL8(jTextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m21528setRawHandleDragPositionk4lQ0M(long j10) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m24024boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z10) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z10));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m21529setStartTextLayoutPositionInWindowk4lQ0M(long j10) {
        this.startTextLayoutPositionInWindow$delegate.setValue(Offset.m24024boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m21530updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int i10, int i11, boolean z10, SelectionAdjustment selectionAdjustment, boolean z11, boolean z12) {
        HapticFeedback hapticFeedback;
        TextRange textRangeM26352boximpl = TextRange.m26352boximpl(textFieldCharSequence.m21345getSelectiond9O1mEE());
        long jM26368unboximpl = textRangeM26352boximpl.m26368unboximpl();
        if (z12 || (!z11 && TextRange.m26358getCollapsedimpl(jM26368unboximpl))) {
            textRangeM26352boximpl = null;
        }
        long jM21526getTextFieldSelectionqeG_v_k = m21526getTextFieldSelectionqeG_v_k(i10, i11, textRangeM26352boximpl, z10, selectionAdjustment);
        if (!TextRange.m26357equalsimpl0(jM21526getTextFieldSelectionqeG_v_k, textFieldCharSequence.m21345getSelectiond9O1mEE())) {
            boolean z13 = TextRange.m26363getReversedimpl(jM21526getTextFieldSelectionqeG_v_k) != TextRange.m26363getReversedimpl(textFieldCharSequence.m21345getSelectiond9O1mEE()) && TextRange.m26357equalsimpl0(TextRangeKt.TextRange(TextRange.m26359getEndimpl(jM21526getTextFieldSelectionqeG_v_k), TextRange.m26364getStartimpl(jM21526getTextFieldSelectionqeG_v_k)), textFieldCharSequence.m21345getSelectiond9O1mEE());
            if (isInTouchMode() && !z13 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25016getTextHandleMove5zf0vsI());
            }
        }
        return jM21526getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    public static /* synthetic */ long m21531updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i10, int i11, boolean z10, SelectionAdjustment selectionAdjustment, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        if ((i12 & 64) != 0) {
            z12 = false;
        }
        return textFieldSelectionState.m21530updateSelectionSsLRf8(textFieldCharSequence, i10, i11, z10, selectionAdjustment, z11, z12);
    }

    public final void autofill() {
        InterfaceC10559a interfaceC10559a = this.requestAutofillAction;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    public final boolean canAutofill() {
        return getEditable() && TextRange.m26358getCollapsedimpl(this.textFieldState.getVisualText().m21345getSelectiond9O1mEE());
    }

    public final boolean canCopy() {
        return (TextRange.m26358getCollapsedimpl(this.textFieldState.getVisualText().m21345getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public final boolean canCut() {
        return (TextRange.m26358getCollapsedimpl(this.textFieldState.getVisualText().m21345getSelectiond9O1mEE()) || !getEditable() || this.isPassword) ? false : true;
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
    public final java.lang.Object canPaste(p179m7.InterfaceC9324c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18551
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18551) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            kotlin.AbstractC9079b.m15926b(r8)
            goto L91
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.AbstractC9079b.m15926b(r8)
            goto L5c
        L3e:
            kotlin.AbstractC9079b.m15926b(r8)
            boolean r8 = r7.getEditable()
            if (r8 != 0) goto L4c
            java.lang.Boolean r8 = p201o7.AbstractC9536a.m17796a(r4)
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
            java.lang.Boolean r8 = p201o7.AbstractC9536a.m17796a(r5)
            return r8
        L73:
            x7.a r8 = r2.receiveContentConfiguration
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
            java.lang.Boolean r8 = p201o7.AbstractC9536a.m17796a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.canPaste(m7.c):java.lang.Object");
    }

    public final boolean canSelectAll() {
        return TextRange.m26360getLengthimpl(this.textFieldState.getVisualText().m21345getSelectiond9O1mEE()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.Companion;
        m21528setRawHandleDragPositionk4lQ0M(companion.m24050getUnspecifiedF1C5BW0());
        m21529setStartTextLayoutPositionInWindowk4lQ0M(companion.m24050getUnspecifiedF1C5BW0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copy(boolean r7, p179m7.InterfaceC9324c<? super p123h7.C8736p> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18561
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18561) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC9079b.m15926b(r8)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r8 = r8.getVisualText()
            long r4 = r8.m21345getSelectiond9O1mEE()
            boolean r2 = androidx.compose.p013ui.text.TextRange.m26358getCollapsedimpl(r4)
            if (r2 == 0) goto L4d
            h7.p r7 = p123h7.C8736p.f16368a
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
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L77:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r7.collapseSelectionToMax()
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.copy(boolean, m7.c):java.lang.Object");
    }

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C18572(pointerInputScope, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cut(p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18581
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18581) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC9079b.m15926b(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r7 = r7.getVisualText()
            long r4 = r7.m21345getSelectiond9O1mEE()
            boolean r2 = androidx.compose.p013ui.text.TextRange.m26358getCollapsedimpl(r4)
            if (r2 == 0) goto L4b
            h7.p r7 = p123h7.C8736p.f16368a
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
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cut(m7.c):java.lang.Object");
    }

    public final void deselect() {
        if (!TextRange.m26358getCollapsedimpl(this.textFieldState.getVisualText().m21345getSelectiond9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final InterfaceC10559a interfaceC10559a, final InterfaceC10559a interfaceC10559a2, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new C18702(mutableInteractionSource, this, null), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m21549invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m21549invokek4lQ0M(long j10) {
                TextFieldSelectionStateKt.logDebug(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1
                    @Override // p300x7.InterfaceC10559a
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                interfaceC10559a.invoke();
                if (this.enabled && this.isFocused()) {
                    if (!this.readOnly) {
                        interfaceC10559a2.invoke();
                        if (this.textFieldState.getVisualText().length() > 0) {
                            this.setShowCursorHandle(true);
                        }
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    long jM21464coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.textLayoutState.m21464coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j10);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.m21527placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m21471fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, jM21464coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, interfaceC9324c);
        return objDetectTapAndPress == AbstractC9434a.m17291f() ? objDetectTapAndPress : C8736p.f16368a;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C18732(null), interfaceC9324c);
        return objAwaitPointerEventScope == AbstractC9434a.m17291f() ? objAwaitPointerEventScope : C8736p.f16368a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean z10) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z11 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && z11 && TextRange.m26358getCollapsedimpl(visualText.m21345getSelectiond9O1mEE()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, z10 ? getCursorRect().m24062getBottomCenterF1C5BW0() : Offset.Companion.m24050getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.Companion.getHidden();
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m26358getCollapsedimpl(visualText.m21345getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m26364getStartimpl(visualText.m21345getSelectiond9O1mEE()));
        float fM13509d = AbstractC8323h.m13509d((float) Math.floor(this.density.mo20497toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
        float f10 = fM13509d / 2;
        float fM13509d2 = AbstractC8323h.m13509d(AbstractC8323h.m13512g(layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? cursorRect.getLeft() + (fM13509d / 2) : cursorRect.getRight() - (fM13509d / 2), ((int) (layoutResult.m26335getSizeYbymL2g() >> 32)) - f10), f10);
        float fFloor = ((int) fM13509d) % 2 == 1 ? ((float) Math.floor(fM13509d2)) + 0.5f : (float) Math.rint(fM13509d2);
        return new Rect(fFloor - f10, cursorRect.getTop(), fFloor + f10, cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m21532getHandleDragPositionF1C5BW0() {
        return (m21524getRawHandleDragPositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.Companion.m24050getUnspecifiedF1C5BW0() : (m21525getStartTextLayoutPositionInWindowF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m21471fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m21524getRawHandleDragPositionF1C5BW0()) : Offset.m24040plusMKHz9U(m21524getRawHandleDragPositionF1C5BW0(), Offset.m24039minusMKHz9U(m21525getStartTextLayoutPositionInWindowF1C5BW0(), m21522getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    public final InterfaceC10559a getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final InterfaceC10559a getRequestAutofillAction() {
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
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L16:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r2 = r2.getVisualText()
            long r2 = r2.m21345getSelectiond9O1mEE()
            boolean r4 = androidx.compose.p013ui.text.TextRange.m26358getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L2d:
            long r4 = r14.m21523getHandlePositiontuRUvjQ(r15)
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
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m21665containsInclusiveUv8p0NA(r0, r4)
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
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L61:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
            boolean r0 = r0.shouldShowSelection()
            if (r0 != 0) goto L74
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L74:
            if (r15 == 0) goto L7b
            int r0 = androidx.compose.p013ui.text.TextRange.m26364getStartimpl(r2)
            goto L84
        L7b:
            int r0 = androidx.compose.p013ui.text.TextRange.m26359getEndimpl(r2)
            int r0 = r0 - r8
            int r0 = java.lang.Math.max(r0, r9)
        L84:
            androidx.compose.ui.text.style.ResolvedTextDirection r11 = r1.getBidiRunDirection(r0)
            boolean r12 = androidx.compose.p013ui.text.TextRange.m26363getReversedimpl(r2)
            if (r16 == 0) goto La0
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L9e
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L9e
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m21470coerceIn3MmeM6k(r4, r0)
        L9e:
            r8 = r4
            goto La7
        La0:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p013ui.geometry.Offset.Companion
            long r4 = r0.m24050getUnspecifiedF1C5BW0()
            goto L9e
        La7:
            if (r15 == 0) goto Lae
            int r15 = androidx.compose.p013ui.text.TextRange.m26364getStartimpl(r2)
            goto Lb2
        Lae:
            int r15 = androidx.compose.p013ui.text.TextRange.m26359getEndimpl(r2)
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

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
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
    public final java.lang.Object paste(p179m7.InterfaceC9324c<? super p123h7.C8736p> r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18791
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18791) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.AbstractC9079b.m15926b(r13)
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
            kotlin.AbstractC9079b.m15926b(r13)
            goto L6c
        L44:
            kotlin.AbstractC9079b.m15926b(r13)
            goto Lc5
        L49:
            kotlin.AbstractC9079b.m15926b(r13)
            x7.a r13 = r12.receiveContentConfiguration
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
            androidx.compose.foundation.content.TransferableContent$Source$Companion r0 = androidx.compose.foundation.content.TransferableContent.Source.Companion
            int r8 = r0.m20454getClipboardkB6V9T0()
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
            h7.p r13 = p123h7.C8736p.f16368a
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
            h7.p r13 = p123h7.C8736p.f16368a
            return r13
        Lbc:
            r0.label = r5
            java.lang.Object r13 = r12.pasteAsPlainText(r0)
            if (r13 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            h7.p r13 = p123h7.C8736p.f16368a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste(m7.c):java.lang.Object");
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C18812(pointerInputScope, z10, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator$delegate.setValue(inputType);
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final void setFocused(boolean z10) {
        this.isFocused = z10;
    }

    public final void setInTouchMode(boolean z10) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setReceiveContentConfiguration(InterfaceC10559a interfaceC10559a) {
        this.receiveContentConfiguration = interfaceC10559a;
    }

    public final void setRequestAutofillAction(InterfaceC10559a interfaceC10559a) {
        this.requestAutofillAction = interfaceC10559a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startToolbarAndHandlesVisibilityObserver(p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18821
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C18821) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L2e
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
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = kotlinx.coroutines.AbstractC9165e.m16556e(r6, r0)     // Catch: java.lang.Throwable -> L5e
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
            h7.p r6 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.startToolbarAndHandlesVisibilityObserver(m7.c):java.lang.Object");
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objSelectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(interfaceC10559a), new TextFieldTextDragObserver(interfaceC10559a), interfaceC9324c);
        return objSelectionGesturePointerInputBtf2 == AbstractC9434a.m17291f() ? objSelectionGesturePointerInputBtf2 : C8736p.f16368a;
    }

    public final void update(HapticFeedback hapticFeedback, Clipboard clipboard, TextToolbarHandler textToolbarHandler, Density density, boolean z10, boolean z11, boolean z12) {
        if (!z10) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboard = clipboard;
        this.textToolbarHandler = textToolbarHandler;
        this.density = density;
        this.enabled = z10;
        this.readOnly = z11;
        this.isPassword = z12;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m21533updateHandleDraggingUv8p0NA(Handle handle, long j10) {
        setDraggingHandle(handle);
        m21528setRawHandleDragPositionk4lQ0M(j10);
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }
}
