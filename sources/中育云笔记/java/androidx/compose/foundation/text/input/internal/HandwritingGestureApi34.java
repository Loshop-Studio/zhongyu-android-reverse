package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextGranularity;
import androidx.compose.p014ui.text.TextInclusionStrategy;
import androidx.compose.p014ui.text.TextLayoutInput;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.CommitTextCommand;
import androidx.compose.p014ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p014ui.text.input.SetSelectionCommand;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p310qd.InterfaceC10804k;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, InterfaceC9540l interfaceC9540l) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC9540l.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m27991highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j10, int i10) {
        if (!TextRange.m32960getCollapsedimpl(j10)) {
            transformedTextFieldState.m28079highlightCharsIn7RAjNK8(i10, j10);
            return;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int iM27995toTextGranularityNUwxegE = m27995toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM28013getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m28013getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM27995toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28013getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1836a1.m938a(deleteGesture));
        }
        m27992performDeletionSbBc2M(transformedTextFieldState, jM28013getRangeForScreenRectOH9lIzo, TextGranularity.m32924equalsimpl0(iM27995toTextGranularityNUwxegE, TextGranularity.Companion.m32929getWordDRrd7Zo()));
        return 1;
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM27995toTextGranularityNUwxegE = m27995toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM28015getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m28015getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM27995toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28015getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1836a1.m938a(deleteRangeGesture));
        }
        m27992performDeletionSbBc2M(transformedTextFieldState, jM28015getRangeForScreenRectsO048IG0, TextGranularity.m32924equalsimpl0(iM27995toTextGranularityNUwxegE, TextGranularity.Companion.m32929getWordDRrd7Zo()));
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m27992performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j10, boolean z10) {
        if (z10) {
            j10 = HandwritingGesture_androidKt.m28004adjustHandwritingDeleteGestureRange72CqOWE(j10, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m28078replaceTextM8tDOmk$default(transformedTextFieldState, "", j10, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m27993performDeletionOnLegacyTextFieldvJH6DeI(long j10, AnnotatedString annotatedString, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (z10) {
            j10 = HandwritingGesture_androidKt.m28004adjustHandwritingDeleteGestureRange72CqOWE(j10, annotatedString);
        }
        interfaceC9540l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m32961getEndimpl(j10), TextRange.m32961getEndimpl(j10)), new DeleteSurroundingTextCommand(TextRange.m32962getLengthimpl(j10), 0)));
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM28008getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m28008getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM28008getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, AbstractC1836a1.m938a(insertGesture));
        }
        TransformedTextFieldState.m28078replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM28008getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int i10, String str, InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i10, i10), new CommitTextCommand(str, 1)));
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM28008getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m28008getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM28008getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM28008getOffsetForHandwritingGestured4ec7I))) {
            return fallback(transformedTextFieldState, AbstractC1836a1.m938a(joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM28008getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m32960getCollapsedimpl(jRangeOfWhitespaces)) {
            TransformedTextFieldState.m28078replaceTextM8tDOmk$default(transformedTextFieldState, " ", jRangeOfWhitespaces, null, false, 12, null);
        } else {
            m27992performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
        }
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jM28010getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m28010getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m32960getCollapsedimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1836a1.m938a(removeSpaceGesture));
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f23400c = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f23400c = -1;
        String strM20342k = new Regex("\\s+").m20342k(TextRangeKt.m32973substringFDrldGo(transformedTextFieldState.getVisualText(), jM28010getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(InterfaceC10804k interfaceC10804k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.f23400c == -1) {
                    ref$IntRef3.f23400c = interfaceC10804k.mo23193a().m21733b();
                }
                ref$IntRef2.f23400c = interfaceC10804k.mo23193a().m21734c() + 1;
                return "";
            }
        });
        if (ref$IntRef.f23400c == -1 || ref$IntRef2.f23400c == -1) {
            return fallback(transformedTextFieldState, AbstractC1836a1.m938a(removeSpaceGesture));
        }
        long jTextRange = TextRangeKt.TextRange(TextRange.m32966getStartimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.f23400c, TextRange.m32966getStartimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.f23400c);
        String strSubstring = strM20342k.substring(ref$IntRef.f23400c, strM20342k.length() - (TextRange.m32962getLengthimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.f23400c));
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        TransformedTextFieldState.m28078replaceTextM8tDOmk$default(transformedTextFieldState, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, InterfaceC9529a interfaceC9529a) {
        long jM28013getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m28013getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m27995toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28013getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1836a1.m938a(selectGesture));
        }
        transformedTextFieldState.m28085selectCharsIn5zctL8(jM28013getRangeForScreenRectOH9lIzo);
        if (interfaceC9529a == null) {
            return 1;
        }
        interfaceC9529a.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, InterfaceC9529a interfaceC9529a) {
        long jM28015getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m28015getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m27995toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28015getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1836a1.m938a(selectRangeGesture));
        }
        transformedTextFieldState.m28085selectCharsIn5zctL8(jM28015getRangeForScreenRectsO048IG0);
        if (interfaceC9529a == null) {
            return 1;
        }
        interfaceC9529a.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m27994performSelectionOnLegacyTextField8ffj60Q(long j10, TextFieldSelectionManager textFieldSelectionManager, InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(new SetSelectionCommand(TextRange.m32966getStartimpl(j10), TextRange.m32961getEndimpl(j10)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m27991highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m28013getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m27995toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m27960getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m27991highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m28015getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m27995toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m27960getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        m27991highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m28013getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m27995toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m27961getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m27991highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m28015getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m27995toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m27961getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m27995toTextGranularityNUwxegE(int i10) {
        return i10 != 1 ? i10 != 2 ? TextGranularity.Companion.m32928getCharacterDRrd7Zo() : TextGranularity.Companion.m32928getCharacterDRrd7Zo() : TextGranularity.Companion.m32929getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, InterfaceC9529a interfaceC9529a, ViewConfiguration viewConfiguration) {
        if (AbstractC1839b1.m940a(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, AbstractC1842c1.m943a(handwritingGesture), textLayoutState, interfaceC9529a);
        }
        if (AbstractC1933z.m986a(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, AbstractC1835a0.m937a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1838b0.m939a(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, AbstractC1841c0.m942a(handwritingGesture), textLayoutState, interfaceC9529a);
        }
        if (AbstractC1844d0.m944a(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, AbstractC1847e0.m945a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1877s0.m973a(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, AbstractC1922t0.m975a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1869o0.m965a(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, AbstractC1871p0.m967a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1873q0.m969a(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, AbstractC1875r0.m971a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (AbstractC1839b1.m940a(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, AbstractC1842c1.m943a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1933z.m986a(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, AbstractC1835a0.m937a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1838b0.m939a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, AbstractC1841c0.m942a(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!AbstractC1844d0.m944a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, AbstractC1847e0.m945a(previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.e1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1(transformedTextFieldState);
            }
        });
        return true;
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, InterfaceC9540l interfaceC9540l) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM28007getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m28007getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM28007getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM28007getOffsetForHandwritingGestured4ec7I))) {
                performInsertionOnLegacyTextField(iM28007getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), interfaceC9540l);
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1836a1.m938a(insertGesture), interfaceC9540l);
        }
        return fallbackOnLegacyTextField(AbstractC1836a1.m938a(insertGesture), interfaceC9540l);
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!AbstractC9979u.m20289b(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (AbstractC1839b1.m940a(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, AbstractC1842c1.m943a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1933z.m986a(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, AbstractC1835a0.m937a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1838b0.m939a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, AbstractC1841c0.m942a(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!AbstractC1844d0.m944a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, AbstractC1847e0.m945a(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.d1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9(textFieldSelectionManager);
            }
        });
        return true;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m28292setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m27995toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m28293setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m27995toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, InterfaceC9540l interfaceC9540l) {
        int iM27995toTextGranularityNUwxegE = m27995toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM28012getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM27995toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28012getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1836a1.m938a(deleteGesture), interfaceC9540l);
        }
        m27993performDeletionOnLegacyTextFieldvJH6DeI(jM28012getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m32924equalsimpl0(iM27995toTextGranularityNUwxegE, TextGranularity.Companion.m32929getWordDRrd7Zo()), interfaceC9540l);
        return 1;
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC9540l interfaceC9540l) {
        long jM28012getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m27995toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28012getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1836a1.m938a(selectGesture), interfaceC9540l);
        }
        m27994performSelectionOnLegacyTextField8ffj60Q(jM28012getRangeForScreenRectOH9lIzo, textFieldSelectionManager, interfaceC9540l);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m28292setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m28014getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m27995toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m28293setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m28014getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m27995toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, InterfaceC9540l interfaceC9540l) {
        int iM27995toTextGranularityNUwxegE = m27995toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM28014getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m28014getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM27995toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28014getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1836a1.m938a(deleteRangeGesture), interfaceC9540l);
        }
        m27993performDeletionOnLegacyTextFieldvJH6DeI(jM28014getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m32924equalsimpl0(iM27995toTextGranularityNUwxegE, TextGranularity.Companion.m32929getWordDRrd7Zo()), interfaceC9540l);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC9540l interfaceC9540l) {
        long jM28014getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m28014getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m27995toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m32960getCollapsedimpl(jM28014getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1836a1.m938a(selectRangeGesture), interfaceC9540l);
        }
        m27994performSelectionOnLegacyTextField8ffj60Q(jM28014getRangeForScreenRectsO048IG0, textFieldSelectionManager, interfaceC9540l);
        return 1;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC9540l interfaceC9540l) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM28007getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m28007getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM28007getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM28007getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM28007getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m32960getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m32966getStartimpl(jRangeOfWhitespaces), " ", interfaceC9540l);
                } else {
                    m27993performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, interfaceC9540l);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1836a1.m938a(joinOrSplitGesture), interfaceC9540l);
        }
        return fallbackOnLegacyTextField(AbstractC1836a1.m938a(joinOrSplitGesture), interfaceC9540l);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, InterfaceC9540l interfaceC9540l) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!AbstractC9979u.m20289b(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (AbstractC1839b1.m940a(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, AbstractC1842c1.m943a(handwritingGesture), textFieldSelectionManager, interfaceC9540l);
        }
        if (AbstractC1933z.m986a(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, AbstractC1835a0.m937a(handwritingGesture), untransformedText, interfaceC9540l);
        }
        if (AbstractC1838b0.m939a(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, AbstractC1841c0.m942a(handwritingGesture), textFieldSelectionManager, interfaceC9540l);
        }
        if (AbstractC1844d0.m944a(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, AbstractC1847e0.m945a(handwritingGesture), untransformedText, interfaceC9540l);
        }
        if (AbstractC1877s0.m973a(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, AbstractC1922t0.m975a(handwritingGesture), untransformedText, viewConfiguration, interfaceC9540l);
        }
        if (AbstractC1869o0.m965a(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, AbstractC1871p0.m967a(handwritingGesture), viewConfiguration, interfaceC9540l);
        }
        if (AbstractC1873q0.m969a(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, AbstractC1875r0.m971a(handwritingGesture), untransformedText, viewConfiguration, interfaceC9540l);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC9540l interfaceC9540l) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM28010getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m28010getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m32960getCollapsedimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1836a1.m938a(removeSpaceGesture), interfaceC9540l);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f23400c = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f23400c = -1;
        String strM20342k = new Regex("\\s+").m20342k(TextRangeKt.m32973substringFDrldGo(annotatedString, jM28010getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(InterfaceC10804k interfaceC10804k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.f23400c == -1) {
                    ref$IntRef3.f23400c = interfaceC10804k.mo23193a().m21733b();
                }
                ref$IntRef2.f23400c = interfaceC10804k.mo23193a().m21734c() + 1;
                return "";
            }
        });
        if (ref$IntRef.f23400c != -1 && ref$IntRef2.f23400c != -1) {
            int iM32966getStartimpl = TextRange.m32966getStartimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.f23400c;
            int iM32966getStartimpl2 = TextRange.m32966getStartimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.f23400c;
            String strSubstring = strM20342k.substring(ref$IntRef.f23400c, strM20342k.length() - (TextRange.m32962getLengthimpl(jM28010getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.f23400c));
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            interfaceC9540l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM32966getStartimpl, iM32966getStartimpl2), new CommitTextCommand(strSubstring, 1)));
            return 1;
        }
        return fallbackOnLegacyTextField(AbstractC1836a1.m938a(removeSpaceGesture), interfaceC9540l);
    }
}
