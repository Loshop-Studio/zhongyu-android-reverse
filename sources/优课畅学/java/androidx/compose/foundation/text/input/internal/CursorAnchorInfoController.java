package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;
    private InterfaceC9212n monitorJob;
    private final InterfaceC8822b0 monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m24506constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", m17801f = "CursorAnchorInfoController.android.kt", m17802l = {154}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1 */
    public static final class C17591 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C17591(InterfaceC9324c<? super C17591> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return CursorAnchorInfoController.this.new C17591(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17591) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final CursorAnchorInfoController cursorAnchorInfoController = CursorAnchorInfoController.this;
                InterfaceC9266c interfaceC9266cM17033w = AbstractC9268e.m17033w(AbstractC9268e.m17028r(SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.1
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final CursorAnchorInfo invoke() {
                        return cursorAnchorInfoController.calculateCursorAnchorInfo();
                    }
                }), 1));
                final CursorAnchorInfoController cursorAnchorInfoController2 = CursorAnchorInfoController.this;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.2
                    public final Object emit(CursorAnchorInfo cursorAnchorInfo, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        cursorAnchorInfoController2.composeImm.updateCursorAnchorInfo(cursorAnchorInfo);
                        return C8736p.f16368a;
                    }

                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((CursorAnchorInfo) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }
                };
                this.label = 1;
                if (interfaceC9266cM17033w.collect(interfaceC9267d, this) == objM17291f) {
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

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, InterfaceC8822b0 interfaceC8822b0) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = interfaceC8822b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                        return null;
                    }
                    TextFieldCharSequence visualText = this.textFieldState.getVisualText();
                    Matrix.m24515resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo25643transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m24146setFromEL8BTi8(this.androidMatrix, this.matrix);
                    Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(coreNodeCoordinates);
                    Offset.Companion companion = Offset.Companion;
                    return CursorAnchorInfoBuilder_androidKt.m21385buildvxqZcH0(this.builder, visualText, visualText.m21345getSelectiond9O1mEE(), visualText.m21344getCompositionMzsxiRA(), layoutResult, this.androidMatrix, rectVisibleBounds.m24072translatek4lQ0M(textLayoutNodeCoordinates.mo25636localPositionOfR5De75A(coreNodeCoordinates, companion.m24051getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m24072translatek4lQ0M(textLayoutNodeCoordinates.mo25636localPositionOfR5De75A(decoratorNodeCoordinates, companion.m24051getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        if (!this.monitorEnabled) {
            InterfaceC9212n interfaceC9212n = this.monitorJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.monitorJob = null;
            return;
        }
        InterfaceC9212n interfaceC9212n2 = this.monitorJob;
        if (interfaceC9212n2 == null || !interfaceC9212n2.isActive()) {
            this.monitorJob = AbstractC8839h.m14861d(this.monitorScope, null, CoroutineStart.f17555d, new C17591(null), 1, null);
        }
    }

    public final void requestUpdates(int i10) {
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z17 = (i10 & 16) != 0;
            boolean z18 = (i10 & 8) != 0;
            boolean z19 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z17 || z18 || z19 || z14) {
                z11 = z14;
                z10 = z19;
                z13 = z18;
                z12 = z17;
                cursorAnchorInfoController = this;
            } else {
                cursorAnchorInfoController = this;
                if (i11 >= 34) {
                    z12 = true;
                    z13 = true;
                    z10 = true;
                    z11 = true;
                } else {
                    z11 = z14;
                    z12 = true;
                    z13 = true;
                    z10 = true;
                }
            }
        } else {
            cursorAnchorInfoController = this;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        cursorAnchorInfoController.requestUpdates(z15, z16, z12, z13, z10, z11);
    }

    private final void requestUpdates(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.includeInsertionMarker = z12;
        this.includeCharacterBounds = z13;
        this.includeEditorBounds = z14;
        this.includeLineBounds = z15;
        if (z10) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo cursorAnchorInfoCalculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (cursorAnchorInfoCalculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(cursorAnchorInfoCalculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = z11;
        startOrStopMonitoring();
    }
}
