package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private final InterfaceC9540l localToScreen;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private final Object lock = new Object();
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m31108constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public LegacyCursorAnchorInfoController(InterfaceC9540l interfaceC9540l, InputMethodManager inputMethodManager) {
        this.localToScreen = interfaceC9540l;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (!this.inputMethodManager.isActive() || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        Matrix.m31117resetimpl(this.matrix);
        this.localToScreen.invoke(Matrix.m31106boximpl(this.matrix));
        float[] fArr = this.matrix;
        Rect rect = this.decorationBoxBounds;
        AbstractC9979u.m20291d(rect);
        float f10 = -rect.getLeft();
        Rect rect2 = this.decorationBoxBounds;
        AbstractC9979u.m20291d(rect2);
        Matrix.m31129translateimpl(fArr, f10, -rect2.getTop(), 0.0f);
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
        Rect rect3 = this.innerTextFieldBounds;
        AbstractC9979u.m20291d(rect3);
        Rect rect4 = this.decorationBoxBounds;
        AbstractC9979u.m20291d(rect4);
        inputMethodManager.updateCursorAnchorInfo(LegacyCursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect3, rect4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
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

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect, Rect rect2) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
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
