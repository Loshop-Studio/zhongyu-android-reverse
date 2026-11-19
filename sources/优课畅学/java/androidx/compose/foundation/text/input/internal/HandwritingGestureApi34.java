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
import androidx.compose.p013ui.graphics.RectHelper_androidKt;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextGranularity;
import androidx.compose.p013ui.text.TextInclusionStrategy;
import androidx.compose.p013ui.text.TextLayoutInput;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.CommitTextCommand;
import androidx.compose.p013ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p013ui.text.input.SetSelectionCommand;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import p113g8.InterfaceC8672k;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

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

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, InterfaceC10570l interfaceC10570l) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC10570l.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m21389highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j10, int i10) {
        if (!TextRange.m26358getCollapsedimpl(j10)) {
            transformedTextFieldState.m21477highlightCharsIn7RAjNK8(i10, j10);
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
        int iM21393toTextGranularityNUwxegE = m21393toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM21411getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m21411getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM21393toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21411getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1806a1.m861a(deleteGesture));
        }
        m21390performDeletionSbBc2M(transformedTextFieldState, jM21411getRangeForScreenRectOH9lIzo, TextGranularity.m26322equalsimpl0(iM21393toTextGranularityNUwxegE, TextGranularity.Companion.m26327getWordDRrd7Zo()));
        return 1;
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM21393toTextGranularityNUwxegE = m21393toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM21413getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m21413getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM21393toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21413getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1806a1.m861a(deleteRangeGesture));
        }
        m21390performDeletionSbBc2M(transformedTextFieldState, jM21413getRangeForScreenRectsO048IG0, TextGranularity.m26322equalsimpl0(iM21393toTextGranularityNUwxegE, TextGranularity.Companion.m26327getWordDRrd7Zo()));
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m21390performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j10, boolean z10) {
        if (z10) {
            j10 = HandwritingGesture_androidKt.m21402adjustHandwritingDeleteGestureRange72CqOWE(j10, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m21476replaceTextM8tDOmk$default(transformedTextFieldState, "", j10, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m21391performDeletionOnLegacyTextFieldvJH6DeI(long j10, AnnotatedString annotatedString, boolean z10, InterfaceC10570l interfaceC10570l) {
        if (z10) {
            j10 = HandwritingGesture_androidKt.m21402adjustHandwritingDeleteGestureRange72CqOWE(j10, annotatedString);
        }
        interfaceC10570l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m26359getEndimpl(j10), TextRange.m26359getEndimpl(j10)), new DeleteSurroundingTextCommand(TextRange.m26360getLengthimpl(j10), 0)));
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM21406getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m21406getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM21406getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, AbstractC1806a1.m861a(insertGesture));
        }
        TransformedTextFieldState.m21476replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM21406getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int i10, String str, InterfaceC10570l interfaceC10570l) {
        interfaceC10570l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i10, i10), new CommitTextCommand(str, 1)));
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM21406getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m21406getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM21406getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM21406getOffsetForHandwritingGestured4ec7I))) {
            return fallback(transformedTextFieldState, AbstractC1806a1.m861a(joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM21406getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m26358getCollapsedimpl(jRangeOfWhitespaces)) {
            TransformedTextFieldState.m21476replaceTextM8tDOmk$default(transformedTextFieldState, " ", jRangeOfWhitespaces, null, false, 12, null);
        } else {
            m21390performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
        }
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jM21408getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m21408getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m26358getCollapsedimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1806a1.m861a(removeSpaceGesture));
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f17471a = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f17471a = -1;
        String strM16183j = new Regex("\\s+").m16183j(TextRangeKt.m26371substringFDrldGo(transformedTextFieldState.getVisualText(), jM21408getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final CharSequence invoke(InterfaceC8672k interfaceC8672k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.f17471a == -1) {
                    ref$IntRef3.f17471a = interfaceC8672k.mo14055b().m13496b();
                }
                ref$IntRef2.f17471a = interfaceC8672k.mo14055b().m13497c() + 1;
                return "";
            }
        });
        if (ref$IntRef.f17471a == -1 || ref$IntRef2.f17471a == -1) {
            return fallback(transformedTextFieldState, AbstractC1806a1.m861a(removeSpaceGesture));
        }
        long jTextRange = TextRangeKt.TextRange(TextRange.m26364getStartimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.f17471a, TextRange.m26364getStartimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.f17471a);
        String strSubstring = strM16183j.substring(ref$IntRef.f17471a, strM16183j.length() - (TextRange.m26360getLengthimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.f17471a));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        TransformedTextFieldState.m21476replaceTextM8tDOmk$default(transformedTextFieldState, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, InterfaceC10559a interfaceC10559a) {
        long jM21411getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m21411getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m21393toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21411getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1806a1.m861a(selectGesture));
        }
        transformedTextFieldState.m21483selectCharsIn5zctL8(jM21411getRangeForScreenRectOH9lIzo);
        if (interfaceC10559a == null) {
            return 1;
        }
        interfaceC10559a.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, InterfaceC10559a interfaceC10559a) {
        long jM21413getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m21413getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m21393toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21413getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1806a1.m861a(selectRangeGesture));
        }
        transformedTextFieldState.m21483selectCharsIn5zctL8(jM21413getRangeForScreenRectsO048IG0);
        if (interfaceC10559a == null) {
            return 1;
        }
        interfaceC10559a.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m21392performSelectionOnLegacyTextField8ffj60Q(long j10, TextFieldSelectionManager textFieldSelectionManager, InterfaceC10570l interfaceC10570l) {
        interfaceC10570l.invoke(new SetSelectionCommand(TextRange.m26364getStartimpl(j10), TextRange.m26359getEndimpl(j10)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m21389highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m21411getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m21393toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m21358getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m21389highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m21413getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m21393toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m21358getHandwritingDeletePreviewsxJuwY());
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
        m21389highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m21411getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m21393toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m21359getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m21389highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m21413getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m21393toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m21359getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m21393toTextGranularityNUwxegE(int i10) {
        return i10 != 1 ? i10 != 2 ? TextGranularity.Companion.m26326getCharacterDRrd7Zo() : TextGranularity.Companion.m26326getCharacterDRrd7Zo() : TextGranularity.Companion.m26327getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, InterfaceC10559a interfaceC10559a, ViewConfiguration viewConfiguration) {
        if (AbstractC1809b1.m863a(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, AbstractC1812c1.m866a(handwritingGesture), textLayoutState, interfaceC10559a);
        }
        if (AbstractC1903z.m909a(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, AbstractC1805a0.m860a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1808b0.m862a(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, AbstractC1811c0.m865a(handwritingGesture), textLayoutState, interfaceC10559a);
        }
        if (AbstractC1814d0.m867a(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, AbstractC1817e0.m868a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1847s0.m896a(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, AbstractC1892t0.m898a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1839o0.m888a(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, AbstractC1841p0.m890a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1843q0.m892a(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, AbstractC1845r0.m894a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (AbstractC1809b1.m863a(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, AbstractC1812c1.m866a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1903z.m909a(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, AbstractC1805a0.m860a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1808b0.m862a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, AbstractC1811c0.m865a(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!AbstractC1814d0.m867a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, AbstractC1817e0.m868a(previewableHandwritingGesture), textLayoutState);
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

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, InterfaceC10570l interfaceC10570l) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM21405getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m21405getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM21405getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM21405getOffsetForHandwritingGestured4ec7I))) {
                performInsertionOnLegacyTextField(iM21405getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), interfaceC10570l);
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1806a1.m861a(insertGesture), interfaceC10570l);
        }
        return fallbackOnLegacyTextField(AbstractC1806a1.m861a(insertGesture), interfaceC10570l);
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!AbstractC9133u.m16128b(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (AbstractC1809b1.m863a(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, AbstractC1812c1.m866a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1903z.m909a(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, AbstractC1805a0.m860a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1808b0.m862a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, AbstractC1811c0.m865a(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!AbstractC1814d0.m867a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, AbstractC1817e0.m868a(previewableHandwritingGesture), textFieldSelectionManager);
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
            textFieldSelectionManager.m21690setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m21393toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m21691setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m21393toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, InterfaceC10570l interfaceC10570l) {
        int iM21393toTextGranularityNUwxegE = m21393toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM21410getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM21393toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21410getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1806a1.m861a(deleteGesture), interfaceC10570l);
        }
        m21391performDeletionOnLegacyTextFieldvJH6DeI(jM21410getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m26322equalsimpl0(iM21393toTextGranularityNUwxegE, TextGranularity.Companion.m26327getWordDRrd7Zo()), interfaceC10570l);
        return 1;
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC10570l interfaceC10570l) {
        long jM21410getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m21393toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21410getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1806a1.m861a(selectGesture), interfaceC10570l);
        }
        m21392performSelectionOnLegacyTextField8ffj60Q(jM21410getRangeForScreenRectOH9lIzo, textFieldSelectionManager, interfaceC10570l);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m21690setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m21412getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m21393toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m21691setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m21412getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m21393toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, InterfaceC10570l interfaceC10570l) {
        int iM21393toTextGranularityNUwxegE = m21393toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM21412getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m21412getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM21393toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21412getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1806a1.m861a(deleteRangeGesture), interfaceC10570l);
        }
        m21391performDeletionOnLegacyTextFieldvJH6DeI(jM21412getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m26322equalsimpl0(iM21393toTextGranularityNUwxegE, TextGranularity.Companion.m26327getWordDRrd7Zo()), interfaceC10570l);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC10570l interfaceC10570l) {
        long jM21412getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m21412getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m21393toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m26358getCollapsedimpl(jM21412getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1806a1.m861a(selectRangeGesture), interfaceC10570l);
        }
        m21392performSelectionOnLegacyTextField8ffj60Q(jM21412getRangeForScreenRectsO048IG0, textFieldSelectionManager, interfaceC10570l);
        return 1;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC10570l interfaceC10570l) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM21405getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m21405getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM21405getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM21405getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM21405getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m26358getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m26364getStartimpl(jRangeOfWhitespaces), " ", interfaceC10570l);
                } else {
                    m21391performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, interfaceC10570l);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1806a1.m861a(joinOrSplitGesture), interfaceC10570l);
        }
        return fallbackOnLegacyTextField(AbstractC1806a1.m861a(joinOrSplitGesture), interfaceC10570l);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, InterfaceC10570l interfaceC10570l) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!AbstractC9133u.m16128b(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (AbstractC1809b1.m863a(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, AbstractC1812c1.m866a(handwritingGesture), textFieldSelectionManager, interfaceC10570l);
        }
        if (AbstractC1903z.m909a(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, AbstractC1805a0.m860a(handwritingGesture), untransformedText, interfaceC10570l);
        }
        if (AbstractC1808b0.m862a(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, AbstractC1811c0.m865a(handwritingGesture), textFieldSelectionManager, interfaceC10570l);
        }
        if (AbstractC1814d0.m867a(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, AbstractC1817e0.m868a(handwritingGesture), untransformedText, interfaceC10570l);
        }
        if (AbstractC1847s0.m896a(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, AbstractC1892t0.m898a(handwritingGesture), untransformedText, viewConfiguration, interfaceC10570l);
        }
        if (AbstractC1839o0.m888a(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, AbstractC1841p0.m890a(handwritingGesture), viewConfiguration, interfaceC10570l);
        }
        if (AbstractC1843q0.m892a(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, AbstractC1845r0.m894a(handwritingGesture), untransformedText, viewConfiguration, interfaceC10570l);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC10570l interfaceC10570l) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM21408getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m21408getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m26358getCollapsedimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1806a1.m861a(removeSpaceGesture), interfaceC10570l);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f17471a = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f17471a = -1;
        String strM16183j = new Regex("\\s+").m16183j(TextRangeKt.m26371substringFDrldGo(annotatedString, jM21408getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final CharSequence invoke(InterfaceC8672k interfaceC8672k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.f17471a == -1) {
                    ref$IntRef3.f17471a = interfaceC8672k.mo14055b().m13496b();
                }
                ref$IntRef2.f17471a = interfaceC8672k.mo14055b().m13497c() + 1;
                return "";
            }
        });
        if (ref$IntRef.f17471a != -1 && ref$IntRef2.f17471a != -1) {
            int iM26364getStartimpl = TextRange.m26364getStartimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.f17471a;
            int iM26364getStartimpl2 = TextRange.m26364getStartimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.f17471a;
            String strSubstring = strM16183j.substring(ref$IntRef.f17471a, strM16183j.length() - (TextRange.m26360getLengthimpl(jM21408getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.f17471a));
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            interfaceC10570l.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM26364getStartimpl, iM26364getStartimpl2), new CommitTextCommand(strSubstring, 1)));
            return 1;
        }
        return fallbackOnLegacyTextField(AbstractC1806a1.m861a(removeSpaceGesture), interfaceC10570l);
    }
}
