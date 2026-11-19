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
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.AbstractC0246h;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextGranularity;
import androidx.compose.p011ui.text.TextInclusionStrategy;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.CommitTextCommand;
import androidx.compose.p011ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p011ui.text.input.SetSelectionCommand;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C5852m;
import kotlin.text.InterfaceC5850k;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0011\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0011\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0000¢\u0006\u0004\b\u000f\u0010 J/\u0010\u0018\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0016\u0010!J3\u0010#\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\n*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\n*\u00020\u00042\u0006\u0010\u001a\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+J3\u0010-\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\n*\u00020\u00042\u0006\u0010\u001a\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u00100J#\u00102\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u00103J#\u00104\u001a\u00020\n*\u00020\u00042\u0006\u0010\u001a\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u0002062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u0002092\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b:\u0010;J-\u0010=\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u00020<2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b=\u0010>J&\u0010D\u001a\u00020\n*\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\bE\u0010FJ&\u0010L\u001a\u00020\n*\u00020\u00042\u0006\u0010G\u001a\u00020?2\u0006\u0010I\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ9\u0010#\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\"2\b\u0010M\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b#\u0010NJ%\u0010%\u001a\u00020\n*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b%\u0010OJ7\u0010(\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020'2\u0006\u0010Q\u001a\u00020P2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b(\u0010RJ%\u0010*\u001a\u00020\n*\u00020\u00192\u0006\u0010\u001a\u001a\u00020'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b*\u0010SJ9\u0010-\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020,2\b\u0010M\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b-\u0010TJ%\u0010/\u001a\u00020\n*\u00020\u00192\u0006\u0010\u001a\u001a\u00020,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b/\u0010UJ7\u00102\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u0002012\u0006\u0010Q\u001a\u00020P2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b2\u0010VJ%\u00104\u001a\u00020\n*\u00020\u00192\u0006\u0010\u001a\u001a\u0002012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b4\u0010WJA\u00107\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u0002062\u0006\u0010Q\u001a\u00020P2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b7\u0010XJ9\u0010:\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u0002092\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b:\u0010YJA\u0010=\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020<2\u0006\u0010Q\u001a\u00020P2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b=\u0010ZJ3\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\\2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\b]\u0010^J8\u0010a\u001a\u00020\n2\u0006\u0010G\u001a\u00020?2\b\u0010M\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b_\u0010`J>\u0010d\u001a\u00020\n2\u0006\u0010G\u001a\u00020?2\u0006\u0010Q\u001a\u00020P2\u0006\u0010A\u001a\u00020\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ+\u0010e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH\u0002¢\u0006\u0004\be\u0010fJ\u0019\u0010j\u001a\u00020g*\u00020\u000eH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010i\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroid/view/inputmethod/HandwritingGesture;", "handwritingGesture", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Lkotlin/Function0;", "Ld6/s;", "updateSelectionState", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "performHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lr6/a;Landroidx/compose/ui/platform/ViewConfiguration;)I", "performHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z", "previewHandwritingGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "editCommandConsumer", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/SelectGesture;", "performSelectGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lr6/a;)I", "previewSelectGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteGesture;", "performDeleteGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "previewDeleteGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "performSelectRangeGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lr6/a;)I", "previewSelectRangeGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeleteRangeGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "previewDeleteRangeGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "performJoinOrSplitGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/InsertGesture;", "performInsertGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performRemoveSpaceGesture", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextRange;", "rangeInTransformedText", "adjustRange", "performDeletion-Sb-Bc2M", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "performDeletion", "fallback", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I", "range", "Landroidx/compose/foundation/text/input/TextHighlightType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "highlightRange-XJREzCE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "highlightRange", "textSelectionManager", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lr6/c;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lr6/c;)I", TypedValues.CycleType.S_WAVE_OFFSET, "", "performInsertionOnLegacyTextField", "(ILjava/lang/String;Lr6/c;)V", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lr6/c;)V", "performSelectionOnLegacyTextField", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLr6/c;)V", "performDeletionOnLegacyTextField", "fallbackOnLegacyTextField", "(Landroid/view/inputmethod/HandwritingGesture;Lr6/c;)I", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "toTextGranularity", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RequiresApi(34)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1102:1\n1#2:1103\n316#3,6:1104\n324#3,3:1118\n327#3:1127\n316#3,6:1128\n324#3,3:1142\n327#3:1151\n316#3,6:1152\n324#3,3:1166\n327#3:1175\n254#4,8:1110\n263#4,6:1121\n254#4,8:1134\n263#4,6:1145\n254#4,8:1158\n263#4,6:1169\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1104,6\n353#1:1118,3\n353#1:1127\n370#1:1128,6\n370#1:1142,3\n370#1:1151\n92#1:1152,6\n92#1:1166,3\n92#1:1175\n353#1:1110,8\n353#1:1121,6\n370#1:1134,8\n370#1:1145,6\n92#1:1158,8\n92#1:1169,6\n*E\n"})
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;

    @NotNull
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

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, InterfaceC6471c editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m7795highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j7, int i) {
        if (!TextRange.m12764getCollapsedimpl(j7)) {
            transformedTextFieldState.m7883highlightCharsIn7RAjNK8(i, j7);
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
        int iM7799toTextGranularityNUwxegE = m7799toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM7817getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m7817getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM7799toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7817getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1376e.m999l(deleteGesture));
        }
        m7796performDeletionSbBc2M(transformedTextFieldState, jM7817getRangeForScreenRectOH9lIzo, TextGranularity.m12728equalsimpl0(iM7799toTextGranularityNUwxegE, TextGranularity.INSTANCE.m12733getWordDRrd7Zo()));
        return 1;
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM7799toTextGranularityNUwxegE = m7799toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM7819getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m7819getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM7799toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7819getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1376e.m999l(deleteRangeGesture));
        }
        m7796performDeletionSbBc2M(transformedTextFieldState, jM7819getRangeForScreenRectsO048IG0, TextGranularity.m12728equalsimpl0(iM7799toTextGranularityNUwxegE, TextGranularity.INSTANCE.m12733getWordDRrd7Zo()));
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m7796performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j7, boolean z8) {
        if (z8) {
            j7 = HandwritingGesture_androidKt.m7808adjustHandwritingDeleteGestureRange72CqOWE(j7, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m7882replaceTextM8tDOmk$default(transformedTextFieldState, "", j7, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m7797performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, InterfaceC6471c editCommandConsumer) {
        if (adjustRange) {
            range = HandwritingGesture_androidKt.m7808adjustHandwritingDeleteGestureRange72CqOWE(range, text);
        }
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m12765getEndimpl(range), TextRange.m12765getEndimpl(range)), new DeleteSurroundingTextCommand(TextRange.m12766getLengthimpl(range), 0)));
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM7812getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m7812getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM7812getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, AbstractC1376e.m999l(insertGesture));
        }
        TransformedTextFieldState.m7882replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM7812getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, InterfaceC6471c editCommandConsumer) {
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM7812getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m7812getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM7812getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM7812getOffsetForHandwritingGestured4ec7I))) {
            return fallback(transformedTextFieldState, AbstractC1376e.m999l(joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM7812getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m12764getCollapsedimpl(jRangeOfWhitespaces)) {
            TransformedTextFieldState.m7882replaceTextM8tDOmk$default(transformedTextFieldState, " ", jRangeOfWhitespaces, null, false, 12, null);
            return 1;
        }
        m7796performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jM7814getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m7814getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m12764getCollapsedimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1376e.m999l(removeSpaceGesture));
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m12777substringFDrldGo(transformedTextFieldState.getVisualText(), jM7814getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(InterfaceC5850k interfaceC5850k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.element == -1) {
                    ref$IntRef3.element = ((C5852m) interfaceC5850k).m5370a().f11420a;
                }
                ref$IntRef2.element = ((C5852m) interfaceC5850k).m5370a().f11421b + 1;
                return "";
            }
        });
        if (ref$IntRef.element == -1 || ref$IntRef2.element == -1) {
            return fallback(transformedTextFieldState, AbstractC1376e.m999l(removeSpaceGesture));
        }
        long jTextRange = TextRangeKt.TextRange(TextRange.m12770getStartimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.element, TextRange.m12770getStartimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.element);
        String strSubstring = strReplace.substring(ref$IntRef.element, strReplace.length() - (TextRange.m12766getLengthimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.element));
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        TransformedTextFieldState.m7882replaceTextM8tDOmk$default(transformedTextFieldState, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, InterfaceC6469a interfaceC6469a) {
        long jM7817getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m7817getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m7799toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7817getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1376e.m999l(selectGesture));
        }
        transformedTextFieldState.m7889selectCharsIn5zctL8(jM7817getRangeForScreenRectOH9lIzo);
        if (interfaceC6469a == null) {
            return 1;
        }
        interfaceC6469a.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, InterfaceC6469a interfaceC6469a) {
        long jM7819getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m7819getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m7799toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7819getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, AbstractC1376e.m999l(selectRangeGesture));
        }
        transformedTextFieldState.m7889selectCharsIn5zctL8(jM7819getRangeForScreenRectsO048IG0);
        if (interfaceC6469a == null) {
            return 1;
        }
        interfaceC6469a.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m7798performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, InterfaceC6471c editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.m12770getStartimpl(range), TextRange.m12765getEndimpl(range)));
        if (textSelectionManager != null) {
            textSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m7795highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m7817getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m7799toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m7764getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m7795highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m7819getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m7799toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m7764getHandwritingDeletePreviewsxJuwY());
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
        m7795highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m7817getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m7799toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m7765getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m7795highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m7819getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m7799toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()), TextHighlightType.INSTANCE.m7765getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m7799toTextGranularityNUwxegE(int i) {
        return i != 1 ? i != 2 ? TextGranularity.INSTANCE.m12732getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m12732getCharacterDRrd7Zo() : TextGranularity.INSTANCE.m12733getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation_release(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull HandwritingGesture handwritingGesture, @NotNull TextLayoutState textLayoutState, @Nullable InterfaceC6469a interfaceC6469a, @Nullable ViewConfiguration viewConfiguration) {
        if (AbstractC1376e.m987D(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, AbstractC1376e.m1003p(handwritingGesture), textLayoutState, interfaceC6469a);
        }
        if (AbstractC0246h.m510s(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, AbstractC0246h.m501j(handwritingGesture), textLayoutState);
        }
        if (AbstractC0246h.m515x(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, AbstractC0246h.m503l(handwritingGesture), textLayoutState, interfaceC6469a);
        }
        if (AbstractC0246h.m517z(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, AbstractC0246h.m502k(handwritingGesture), textLayoutState);
        }
        if (AbstractC1376e.m986C(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, AbstractC1376e.m1001n(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1376e.m1010w(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, AbstractC1376e.m1000m(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (AbstractC1376e.m985B(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, AbstractC1376e.m1002o(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @NotNull TextLayoutState textLayoutState, @Nullable CancellationSignal cancellationSignal) {
        if (AbstractC1376e.m987D(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, AbstractC1376e.m1003p(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC0246h.m510s(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, AbstractC0246h.m501j(previewableHandwritingGesture), textLayoutState);
        } else if (AbstractC0246h.m515x(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, AbstractC0246h.m503l(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!AbstractC0246h.m517z(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, AbstractC0246h.m502k(previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C1377f(transformedTextFieldState, 1));
        return true;
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, InterfaceC6471c interfaceC6471c) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM7811getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m7811getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM7811getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM7811getOffsetForHandwritingGestured4ec7I))) {
                performInsertionOnLegacyTextField(iM7811getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), interfaceC6471c);
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1376e.m999l(insertGesture), interfaceC6471c);
        }
        return fallbackOnLegacyTextField(AbstractC1376e.m999l(insertGesture), interfaceC6471c);
    }

    public final boolean previewHandwritingGesture$foundation_release(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (AbstractC1376e.m987D(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, AbstractC1376e.m1003p(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC0246h.m510s(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, AbstractC0246h.m501j(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (AbstractC0246h.m515x(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, AbstractC0246h.m503l(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!AbstractC0246h.m517z(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, AbstractC0246h.m502k(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C1377f(textFieldSelectionManager, 0));
        return true;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m8096setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m7816getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m7799toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m8097setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m7816getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m7799toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, InterfaceC6471c interfaceC6471c) {
        int iM7799toTextGranularityNUwxegE = m7799toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM7816getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m7816getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM7799toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7816getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1376e.m999l(deleteGesture), interfaceC6471c);
        }
        m7797performDeletionOnLegacyTextFieldvJH6DeI(jM7816getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m12728equalsimpl0(iM7799toTextGranularityNUwxegE, TextGranularity.INSTANCE.m12733getWordDRrd7Zo()), interfaceC6471c);
        return 1;
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC6471c interfaceC6471c) {
        long jM7816getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m7816getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m7799toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7816getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1376e.m999l(selectGesture), interfaceC6471c);
        }
        m7798performSelectionOnLegacyTextField8ffj60Q(jM7816getRangeForScreenRectOH9lIzo, textFieldSelectionManager, interfaceC6471c);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m8096setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m7818getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m7799toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m8097setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m7818getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m7799toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, InterfaceC6471c interfaceC6471c) {
        int iM7799toTextGranularityNUwxegE = m7799toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM7818getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m7818getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM7799toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7818getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1376e.m999l(deleteRangeGesture), interfaceC6471c);
        }
        m7797performDeletionOnLegacyTextFieldvJH6DeI(jM7818getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m12728equalsimpl0(iM7799toTextGranularityNUwxegE, TextGranularity.INSTANCE.m12733getWordDRrd7Zo()), interfaceC6471c);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, InterfaceC6471c interfaceC6471c) {
        long jM7818getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m7818getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m7799toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m12764getCollapsedimpl(jM7818getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1376e.m999l(selectRangeGesture), interfaceC6471c);
        }
        m7798performSelectionOnLegacyTextField8ffj60Q(jM7818getRangeForScreenRectsO048IG0, textFieldSelectionManager, interfaceC6471c);
        return 1;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC6471c interfaceC6471c) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM7811getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m7811getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM7811getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM7811getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM7811getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m12764getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m12770getStartimpl(jRangeOfWhitespaces), " ", interfaceC6471c);
                    return 1;
                }
                m7797performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, interfaceC6471c);
                return 1;
            }
            return fallbackOnLegacyTextField(AbstractC1376e.m999l(joinOrSplitGesture), interfaceC6471c);
        }
        return fallbackOnLegacyTextField(AbstractC1376e.m999l(joinOrSplitGesture), interfaceC6471c);
    }

    public final int performHandwritingGesture$foundation_release(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull HandwritingGesture handwritingGesture, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable ViewConfiguration viewConfiguration, @NotNull InterfaceC6471c interfaceC6471c) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (AbstractC1376e.m987D(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, AbstractC1376e.m1003p(handwritingGesture), textFieldSelectionManager, interfaceC6471c);
        }
        if (AbstractC0246h.m510s(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, AbstractC0246h.m501j(handwritingGesture), untransformedText, interfaceC6471c);
        }
        if (AbstractC0246h.m515x(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, AbstractC0246h.m503l(handwritingGesture), textFieldSelectionManager, interfaceC6471c);
        }
        if (AbstractC0246h.m517z(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, AbstractC0246h.m502k(handwritingGesture), untransformedText, interfaceC6471c);
        }
        if (AbstractC1376e.m986C(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, AbstractC1376e.m1001n(handwritingGesture), untransformedText, viewConfiguration, interfaceC6471c);
        }
        if (AbstractC1376e.m1010w(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, AbstractC1376e.m1000m(handwritingGesture), viewConfiguration, interfaceC6471c);
        }
        if (AbstractC1376e.m985B(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, AbstractC1376e.m1002o(handwritingGesture), untransformedText, viewConfiguration, interfaceC6471c);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, InterfaceC6471c interfaceC6471c) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM7814getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m7814getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m12764getCollapsedimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(AbstractC1376e.m999l(removeSpaceGesture), interfaceC6471c);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m12777substringFDrldGo(annotatedString, jM7814getRangeForRemoveSpaceGesture5iVPX68), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(InterfaceC5850k interfaceC5850k) {
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                if (ref$IntRef3.element == -1) {
                    ref$IntRef3.element = ((C5852m) interfaceC5850k).m5370a().f11420a;
                }
                ref$IntRef2.element = ((C5852m) interfaceC5850k).m5370a().f11421b + 1;
                return "";
            }
        });
        if (ref$IntRef.element != -1 && ref$IntRef2.element != -1) {
            int iM12770getStartimpl = TextRange.m12770getStartimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef.element;
            int iM12770getStartimpl2 = TextRange.m12770getStartimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) + ref$IntRef2.element;
            String strSubstring = strReplace.substring(ref$IntRef.element, strReplace.length() - (TextRange.m12766getLengthimpl(jM7814getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.element));
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            interfaceC6471c.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM12770getStartimpl, iM12770getStartimpl2), new CommitTextCommand(strSubstring, 1)));
            return 1;
        }
        return fallbackOnLegacyTextField(AbstractC1376e.m999l(removeSpaceGesture), interfaceC6471c);
    }
}
