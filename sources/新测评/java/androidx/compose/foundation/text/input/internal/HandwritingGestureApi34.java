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
import androidx.compose.p013ui.text.input.EditCommand;
import androidx.compose.p013ui.text.input.SetSelectionCommand;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J8\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u001e\u001a\u00020\n*\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J0\u0010#\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\u001c\u0010#\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J0\u0010(\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J&\u0010*\u001a\u00020\n*\u00020\u001d2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0000¢\u0006\u0002\b2J;\u0010.\u001a\u00020\u0004*\u00020\u001d2\u0006\u00103\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001052\b\u00100\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0002\b2J2\u00106\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002072\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u00106\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002072\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J:\u00108\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u00108\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J:\u0010:\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u0010:\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J2\u0010<\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J,\u0010<\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J2\u0010>\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J,\u0010>\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J\u001e\u0010@\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010@\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010A\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010A\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J-\u0010B\u001a\u00020\u0011*\u00020$2\u0006\u0010\u0005\u001a\u00020C2\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u0010D\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0002\bFJ+\u0010B\u001a\u00020\u0011*\u00020\u001d2\u0006\u00103\u001a\u00020C2\u0006\u0010&\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0002\bFJ\u001e\u0010G\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010G\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010H\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010H\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020'H\u0002J\u0019\u0010I\u001a\u00020J*\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "()V", "fallbackOnLegacyTextField", "", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "editCommandConsumer", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "performDeletionOnLegacyTextField", "range", "Landroidx/compose/ui/text/TextRange;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "adjustRange", "", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "performInsertionOnLegacyTextField", TypedValues.CycleType.S_WAVE_OFFSET, "", "performSelectionOnLegacyTextField", "textSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "fallback", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "highlightRange", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlightRange-XJREzCE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "performDeleteGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroid/view/inputmethod/DeleteGesture;", "layoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "performDeleteRangeGesture", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeletion", "rangeInTransformedText", "performDeletion-Sb-Bc2M", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "performHandwritingGesture", "textFieldSelectionManager", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "performHandwritingGesture$foundation_release", "handwritingGesture", "updateSelectionState", "Lkotlin/Function0;", "performInsertGesture", "Landroid/view/inputmethod/InsertGesture;", "performJoinOrSplitGesture", "Landroid/view/inputmethod/JoinOrSplitGesture;", "performRemoveSpaceGesture", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performSelectGesture", "Landroid/view/inputmethod/SelectGesture;", "performSelectRangeGesture", "Landroid/view/inputmethod/SelectRangeGesture;", "previewDeleteGesture", "previewDeleteRangeGesture", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "previewHandwritingGesture$foundation_release", "previewSelectGesture", "previewSelectRangeGesture", "toTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@RequiresApi(34)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1102:1\n1#2:1103\n316#3,6:1104\n324#3,3:1118\n327#3:1127\n316#3,6:1128\n324#3,3:1142\n327#3:1151\n316#3,6:1152\n324#3,3:1166\n327#3:1175\n254#4,8:1110\n263#4,6:1121\n254#4,8:1134\n263#4,6:1145\n254#4,8:1158\n263#4,6:1169\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1104,6\n353#1:1118,3\n353#1:1127\n370#1:1128,6\n370#1:1142,3\n370#1:1151\n92#1:1152,6\n92#1:1166,3\n92#1:1175\n353#1:1110,8\n353#1:1121,6\n370#1:1134,8\n370#1:1145,6\n92#1:1158,8\n92#1:1169,6\n*E\n"})
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
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, Function1<? super EditCommand, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m18186highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j10, int i10) {
        if (!TextRange.m23021getCollapsedimpl(j10)) {
            transformedTextFieldState.m18266highlightCharsIn7RAjNK8(i10, j10);
            return;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int iM18190toTextGranularityNUwxegE = m18190toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM18208getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m18208getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM18190toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18208getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1777a1.m1088a(deleteGesture));
        }
        m18187performDeletionSbBc2M(transformedTextFieldState, jM18208getRangeForScreenRectOH9lIzo, TextGranularity.m22985equalsimpl0(iM18190toTextGranularityNUwxegE, TextGranularity.INSTANCE.m22990getWordDRrd7Zo()));
        return 1;
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM18190toTextGranularityNUwxegE = m18190toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM18210getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m18210getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM18190toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18210getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1777a1.m1088a(deleteRangeGesture));
        }
        m18187performDeletionSbBc2M(transformedTextFieldState, jM18210getRangeForScreenRectsO048IG0, TextGranularity.m22985equalsimpl0(iM18190toTextGranularityNUwxegE, TextGranularity.INSTANCE.m22990getWordDRrd7Zo()));
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m18187performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j10, boolean z9) {
        if (z9) {
            j10 = HandwritingGesture_androidKt.m18199adjustHandwritingDeleteGestureRange72CqOWE(j10, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m18265replaceTextM8tDOmk$default(transformedTextFieldState, "", j10, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m18188performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, Function1<? super EditCommand, Unit> editCommandConsumer) {
        if (adjustRange) {
            range = HandwritingGesture_androidKt.m18199adjustHandwritingDeleteGestureRange72CqOWE(range, text);
        }
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m23022getEndimpl(range), TextRange.m23022getEndimpl(range)), new DeleteSurroundingTextCommand(TextRange.m23023getLengthimpl(range), 0)));
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM18203getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m18203getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM18203getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, AbstractC1777a1.m1088a(insertGesture));
        }
        TransformedTextFieldState.m18265replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM18203getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM18203getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m18203getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM18203getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM18203getOffsetForHandwritingGestured4ec7I))) {
            return fallback(transformedTextFieldState, AbstractC1777a1.m1088a(joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM18203getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m23021getCollapsedimpl(jRangeOfWhitespaces)) {
            TransformedTextFieldState.m18265replaceTextM8tDOmk$default(transformedTextFieldState, " ", jRangeOfWhitespaces, null, false, 12, null);
        } else {
            m18187performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
        }
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jM18205getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m18205getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m23021getCollapsedimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1777a1.m1088a(removeSpaceGesture));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m23034substringFDrldGo(transformedTextFieldState.getVisualText(), jM18205getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                Ref.IntRef intRef3 = intRef;
                if (intRef3.element == -1) {
                    intRef3.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallback(transformedTextFieldState, AbstractC1777a1.m1088a(removeSpaceGesture));
        }
        long jTextRange = TextRangeKt.TextRange(TextRange.m23027getStartimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) + intRef.element, TextRange.m23027getStartimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element);
        String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.m23023getLengthimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        TransformedTextFieldState.m18265replaceTextM8tDOmk$default(transformedTextFieldState, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, Function0<Unit> function0) {
        long jM18208getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m18208getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m18190toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18208getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1777a1.m1088a(selectGesture));
        }
        transformedTextFieldState.m18272selectCharsIn5zctL8(jM18208getRangeForScreenRectOH9lIzo);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, Function0<Unit> function0) {
        long jM18210getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m18210getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m18190toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18210getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1777a1.m1088a(selectRangeGesture));
        }
        transformedTextFieldState.m18272selectCharsIn5zctL8(jM18210getRangeForScreenRectsO048IG0);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m18189performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.m23027getStartimpl(range), TextRange.m23022getEndimpl(range)));
        if (textSelectionManager != null) {
            textSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m18186highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m18208getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m18190toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m18157getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m18186highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m18210getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m18190toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m18157getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        m18186highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m18208getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m18190toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m18158getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m18186highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m18210getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m18190toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m18158getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m18190toTextGranularityNUwxegE(int i10) {
        return i10 != 1 ? i10 != 2 ? TextGranularity.INSTANCE.m22989getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m22989getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m22990getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, Function0<Unit> function0, ViewConfiguration viewConfiguration) {
        if (AbstractC1780b1.m1090a(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, AbstractC1783c1.m1093a(handwritingGesture), textLayoutState, function0);
        }
        if (AbstractC1874z.m1136a(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, AbstractC1776a0.m1087a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1779b0.m1089a(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, AbstractC1782c0.m1092a(handwritingGesture), textLayoutState, function0);
        }
        if (AbstractC1785d0.m1094a(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, AbstractC1788e0.m1095a(handwritingGesture), textLayoutState);
        }
        if (AbstractC1818s0.m1123a(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, AbstractC1863t0.m1125a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1810o0.m1115a(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, AbstractC1812p0.m1117a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1814q0.m1119a(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, AbstractC1816r0.m1121a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (AbstractC1780b1.m1090a(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, AbstractC1783c1.m1093a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1874z.m1136a(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, AbstractC1776a0.m1087a(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC1779b0.m1089a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, AbstractC1782c0.m1092a(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!AbstractC1785d0.m1094a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, AbstractC1788e0.m1095a(previewableHandwritingGesture), textLayoutState);
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

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM18202getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m18202getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM18202getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM18202getOffsetForHandwritingGestured4ec7I))) {
                performInsertionOnLegacyTextField(iM18202getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), function1);
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1777a1.m1088a(insertGesture), function1);
        }
        return fallbackOnLegacyTextField(AbstractC1777a1.m1088a(insertGesture), function1);
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (AbstractC1780b1.m1090a(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, AbstractC1783c1.m1093a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1874z.m1136a(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, AbstractC1776a0.m1087a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC1779b0.m1089a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, AbstractC1782c0.m1092a(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!AbstractC1785d0.m1094a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, AbstractC1788e0.m1095a(previewableHandwritingGesture), textFieldSelectionManager);
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
            textFieldSelectionManager.m18462setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m18207getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m18190toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m18463setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m18207getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m18190toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM18190toTextGranularityNUwxegE = m18190toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM18207getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m18207getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM18190toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18207getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1777a1.m1088a(deleteGesture), function1);
        }
        m18188performDeletionOnLegacyTextFieldvJH6DeI(jM18207getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m22985equalsimpl0(iM18190toTextGranularityNUwxegE, TextGranularity.INSTANCE.m22990getWordDRrd7Zo()), function1);
        return 1;
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM18207getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m18207getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m18190toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18207getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1777a1.m1088a(selectGesture), function1);
        }
        m18189performSelectionOnLegacyTextField8ffj60Q(jM18207getRangeForScreenRectOH9lIzo, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m18462setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m18209getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m18190toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m18463setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m18209getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m18190toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM18190toTextGranularityNUwxegE = m18190toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM18209getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m18209getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM18190toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18209getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1777a1.m1088a(deleteRangeGesture), function1);
        }
        m18188performDeletionOnLegacyTextFieldvJH6DeI(jM18209getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m22985equalsimpl0(iM18190toTextGranularityNUwxegE, TextGranularity.INSTANCE.m22990getWordDRrd7Zo()), function1);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM18209getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m18209getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m18190toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m23021getCollapsedimpl(jM18209getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1777a1.m1088a(selectRangeGesture), function1);
        }
        m18189performSelectionOnLegacyTextField8ffj60Q(jM18209getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM18202getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m18202getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM18202getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM18202getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM18202getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m23021getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m23027getStartimpl(jRangeOfWhitespaces), " ", function1);
                } else {
                    m18188performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, function1);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1777a1.m1088a(joinOrSplitGesture), function1);
        }
        return fallbackOnLegacyTextField(AbstractC1777a1.m1088a(joinOrSplitGesture), function1);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (AbstractC1780b1.m1090a(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, AbstractC1783c1.m1093a(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (AbstractC1874z.m1136a(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, AbstractC1776a0.m1087a(handwritingGesture), untransformedText, function1);
        }
        if (AbstractC1779b0.m1089a(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, AbstractC1782c0.m1092a(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (AbstractC1785d0.m1094a(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, AbstractC1788e0.m1095a(handwritingGesture), untransformedText, function1);
        }
        if (AbstractC1818s0.m1123a(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, AbstractC1863t0.m1125a(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        if (AbstractC1810o0.m1115a(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, AbstractC1812p0.m1117a(handwritingGesture), viewConfiguration, function1);
        }
        if (AbstractC1814q0.m1119a(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, AbstractC1816r0.m1121a(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM18205getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m18205getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m23021getCollapsedimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1777a1.m1088a(removeSpaceGesture), function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m23034substringFDrldGo(annotatedString, jM18205getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                Ref.IntRef intRef3 = intRef;
                if (intRef3.element == -1) {
                    intRef3.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element != -1 && intRef2.element != -1) {
            int iM23027getStartimpl = TextRange.m23027getStartimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) + intRef.element;
            int iM23027getStartimpl2 = TextRange.m23027getStartimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element;
            String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.m23023getLengthimpl(jM18205getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM23027getStartimpl, iM23027getStartimpl2), new CommitTextCommand(strSubstring, 1)));
            return 1;
        }
        return fallbackOnLegacyTextField(AbstractC1777a1.m1088a(removeSpaceGesture), function1);
    }
}
