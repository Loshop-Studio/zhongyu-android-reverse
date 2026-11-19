package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

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
    private InterfaceC10045g monitorJob;
    private final InterfaceC11122i0 monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m31108constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", m26211f = "CursorAnchorInfoController.android.kt", m26212l = {Opcodes.IFNE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1 */
    public static final class C17891 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C17891(InterfaceC11588c<? super C17891> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return CursorAnchorInfoController.this.new C17891(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final CursorAnchorInfoController cursorAnchorInfoController = CursorAnchorInfoController.this;
                InterfaceC11594c interfaceC11594cM25572v = AbstractC11596e.m25572v(AbstractC11596e.m25567q(SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final CursorAnchorInfo invoke() {
                        return cursorAnchorInfoController.calculateCursorAnchorInfo();
                    }
                }), 1));
                final CursorAnchorInfoController cursorAnchorInfoController2 = CursorAnchorInfoController.this;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.2
                    public final Object emit(CursorAnchorInfo cursorAnchorInfo, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        cursorAnchorInfoController2.composeImm.updateCursorAnchorInfo(cursorAnchorInfo);
                        return C10786q.f26013a;
                    }

                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((CursorAnchorInfo) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }
                };
                this.label = 1;
                if (interfaceC11594cM25572v.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C17891) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, InterfaceC11122i0 interfaceC11122i0) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = interfaceC11122i0;
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
                    Matrix.m31117resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo32245transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m30748setFromEL8BTi8(this.androidMatrix, this.matrix);
                    Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(coreNodeCoordinates);
                    Offset.Companion companion = Offset.Companion;
                    return CursorAnchorInfoBuilder_androidKt.m27987buildvxqZcH0(this.builder, visualText, visualText.m27947getSelectiond9O1mEE(), visualText.m27946getCompositionMzsxiRA(), layoutResult, this.androidMatrix, rectVisibleBounds.m30674translatek4lQ0M(textLayoutNodeCoordinates.mo32238localPositionOfR5De75A(coreNodeCoordinates, companion.m30653getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m30674translatek4lQ0M(textLayoutNodeCoordinates.mo32238localPositionOfR5De75A(decoratorNodeCoordinates, companion.m30653getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        if (!this.monitorEnabled) {
            InterfaceC10045g interfaceC10045g = this.monitorJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.monitorJob = null;
            return;
        }
        InterfaceC10045g interfaceC10045g2 = this.monitorJob;
        if (interfaceC10045g2 == null || !interfaceC10045g2.isActive()) {
            this.monitorJob = AbstractC11117h.m24726d(this.monitorScope, null, CoroutineStart.f23479f, new C17891(null), 1, null);
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
