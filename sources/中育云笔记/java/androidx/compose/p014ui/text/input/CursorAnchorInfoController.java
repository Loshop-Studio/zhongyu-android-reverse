package androidx.compose.p014ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final MatrixPositionCalculator rootPositionCalculator;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private final Object lock = new Object();
    private InterfaceC9540l textFieldToRootTransform = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33125invoke58bKbWc(((Matrix) obj).m31131unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m33125invoke58bKbWc(float[] fArr) {
        }
    };
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m31108constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = matrixPositionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(Matrix.m31106boximpl(this.matrix));
            this.rootPositionCalculator.mo32033localToScreen58bKbWc(this.matrix);
            AndroidMatrixConversions_androidKt.m30748setFromEL8BTi8(this.androidMatrix, this.matrix);
            InputMethodManager inputMethodManager = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            AbstractC9979u.m20291d(textFieldValue);
            OffsetMapping offsetMapping = this.offsetMapping;
            AbstractC9979u.m20291d(offsetMapping);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            AbstractC9979u.m20291d(textLayoutResult);
            android.graphics.Matrix matrix = this.androidMatrix;
            Rect rect = this.innerTextFieldBounds;
            AbstractC9979u.m20291d(rect);
            Rect rect2 = this.decorationBoxBounds;
            AbstractC9979u.m20291d(rect2);
            inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m33124invoke58bKbWc(((Matrix) obj).m31131unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m33124invoke58bKbWc(float[] fArr) {
                }
            };
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final void requestUpdate(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = z12;
                this.includeCharacterBounds = z13;
                this.includeEditorBounds = z14;
                this.includeLineBounds = z15;
                if (z10) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        updateCursorAnchorInfo();
                    }
                }
                this.monitorEnabled = z11;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC9540l interfaceC9540l, Rect rect, Rect rect2) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = interfaceC9540l;
                this.innerTextFieldBounds = rect;
                this.decorationBoxBounds = rect2;
                if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                    updateCursorAnchorInfo();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
