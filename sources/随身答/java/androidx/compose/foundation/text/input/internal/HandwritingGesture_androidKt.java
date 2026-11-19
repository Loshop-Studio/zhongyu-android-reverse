package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.layout.LayoutCoordinates;
import androidx.compose.p012ui.platform.ViewConfiguration;
import androidx.compose.p012ui.text.MultiParagraph;
import androidx.compose.p012ui.text.TextGranularity;
import androidx.compose.p012ui.text.TextInclusionStrategy;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.compose.p012ui.text.input.EditCommand;
import androidx.compose.p012ui.text.input.EditingBuffer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0007\u001a\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a&\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020 2\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a<\u0010&\u001a\u00020\t*\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a.\u0010,\u001a\u00020\t*\u00020\u001c2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a.\u0010,\u001a\u00020\t*\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00105\u001a:\u0010,\u001a\u00020\t*\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020.2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a6\u00108\u001a\u00020\t*\u00020\u001c2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a6\u00108\u001a\u00020\t*\u00020 2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020'2\u0006\u0010@\u001a\u00020\u0001H\u0002\u001a\f\u0010A\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010B\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010C\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010D\u001a\u00020?*\u00020\u0001H\u0002\u001a\u0019\u0010E\u001a\u00020\t*\u00020\u00102\u0006\u0010@\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010F\u001a\u0011\u0010G\u001a\u00020\u0016*\u00020HH\u0002¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, m13413d2 = {"LINE_FEED_CODE_POINT", "", "NBSP_CODE_POINT", "compoundEditCommand", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", "enclosure", "Landroidx/compose/ui/text/TextRange;", "a", "b", "enclosure-pWDy79M", "(JJ)J", "adjustHandwritingDeleteGestureRange", "text", "", "adjustHandwritingDeleteGestureRange-72CqOWE", "(JLjava/lang/CharSequence;)J", "getLineForHandwritingGesture", "Landroidx/compose/ui/text/MultiParagraph;", "localPoint", "Landroidx/compose/ui/geometry/Offset;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLineForHandwritingGesture-d-4ec7I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getOffsetForHandwritingGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "pointInScreen", "getOffsetForHandwritingGesture-d-4ec7I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getOffsetForHandwritingGesture-ubNVwUQ", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "getRangeForRemoveSpaceGesture", "Landroidx/compose/ui/text/TextLayoutResult;", "startPointInScreen", "endPointerInScreen", "getRangeForRemoveSpaceGesture-5iVPX68", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "getRangeForScreenRect", "rectInScreen", "Landroidx/compose/ui/geometry/Rect;", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForScreenRect-OH9lIzo", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect-O048IG0", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects", "startRectInScreen", "endRectInScreen", "getRangeForScreenRects-O048IG0", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "isBiDiBoundary", "", TypedValues.CycleType.S_WAVE_OFFSET, "isNewline", "isPunctuation", "isWhitespace", "isWhitespaceExceptNewline", "rangeOfWhitespaces", "(Ljava/lang/CharSequence;I)J", "toOffset", "Landroid/graphics/PointF;", "(Landroid/graphics/PointF;)J", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1102:1\n30#2:1103\n53#3,3:1104\n60#3:1108\n60#3:1111\n70#3:1114\n70#3:1117\n70#3:1120\n60#3:1123\n65#4:1107\n65#4:1110\n69#4:1113\n69#4:1116\n69#4:1119\n65#4:1122\n22#5:1109\n22#5:1112\n22#5:1115\n22#5:1118\n22#5:1121\n22#5:1124\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n*L\n868#1:1103\n868#1:1104,3\n1054#1:1108\n1056#1:1111\n1072#1:1114\n1075#1:1117\n1076#1:1120\n1081#1:1123\n1054#1:1107\n1056#1:1110\n1072#1:1113\n1075#1:1116\n1076#1:1119\n1081#1:1122\n1054#1:1109\n1056#1:1112\n1072#1:1115\n1075#1:1118\n1076#1:1121\n1081#1:1124\n*E\n"})
/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m18632adjustHandwritingDeleteGestureRange72CqOWE(long j9, CharSequence charSequence) {
        int iM23460getStartimpl = TextRange.m23460getStartimpl(j9);
        int iM23455getEndimpl = TextRange.m23455getEndimpl(j9);
        int iCodePointBefore = iM23460getStartimpl > 0 ? Character.codePointBefore(charSequence, iM23460getStartimpl) : 10;
        int iCodePointAt = iM23455getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM23455getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM23460getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM23460getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM23460getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM23460getStartimpl, iM23455getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j9;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j9;
        }
        do {
            iM23455getEndimpl += Character.charCount(iCodePointAt);
            if (iM23455getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM23455getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM23460getStartimpl, iM23455getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.p012ui.text.input.EditCommand
            public void applyTo(EditingBuffer buffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(buffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m18633enclosurepWDy79M(long j9, long j10) {
        return TextRangeKt.TextRange(Math.min(TextRange.m23460getStartimpl(j9), TextRange.m23460getStartimpl(j9)), Math.max(TextRange.m23455getEndimpl(j10), TextRange.m23455getEndimpl(j10)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m18634getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j9, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i9 = (int) (4294967295L & j9);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i9));
        if (Float.intBitsToFloat(i9) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i9) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i10 = (int) (j9 >> 32);
            if (Float.intBitsToFloat(i10) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i10) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m18636getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j9, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m18637getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j9, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m18637getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j9, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo22771screenToLocalMKHz9U;
        int iM18634getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM18634getLineForHandwritingGestured4ec7I = m18634getLineForHandwritingGestured4ec7I(multiParagraph, (jMo22771screenToLocalMKHz9U = layoutCoordinates.mo22771screenToLocalMKHz9U(j9)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m23311getOffsetForPositionk4lQ0M(Offset.m21162copydBAh8RU$default(jMo22771screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM18634getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM18634getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m18638getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j9, long j10, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m23465getZerod9O1mEE();
        }
        long jMo22771screenToLocalMKHz9U = layoutCoordinates.mo22771screenToLocalMKHz9U(j9);
        long jMo22771screenToLocalMKHz9U2 = layoutCoordinates.mo22771screenToLocalMKHz9U(j10);
        int iM18634getLineForHandwritingGestured4ec7I = m18634getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo22771screenToLocalMKHz9U, viewConfiguration);
        int iM18634getLineForHandwritingGestured4ec7I2 = m18634getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo22771screenToLocalMKHz9U2, viewConfiguration);
        if (iM18634getLineForHandwritingGestured4ec7I != -1) {
            if (iM18634getLineForHandwritingGestured4ec7I2 != -1) {
                iM18634getLineForHandwritingGestured4ec7I = Math.min(iM18634getLineForHandwritingGestured4ec7I, iM18634getLineForHandwritingGestured4ec7I2);
            }
            iM18634getLineForHandwritingGestured4ec7I2 = iM18634getLineForHandwritingGestured4ec7I;
        } else if (iM18634getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.INSTANCE.m23465getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(iM18634getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(iM18634getLineForHandwritingGestured4ec7I2)) / 2;
        int i9 = (int) (jMo22771screenToLocalMKHz9U >> 32);
        int i10 = (int) (jMo22771screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m23312getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), lineTop - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), lineTop + 0.1f), TextGranularity.INSTANCE.m23422getCharacterDRrd7Zo(), TextInclusionStrategy.INSTANCE.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m18639getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i9, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.INSTANCE.m23465getZerod9O1mEE() : multiParagraph.m23312getRangeForRect86BmAI(rect.m21205translatek4lQ0M(layoutCoordinates.mo22771screenToLocalMKHz9U(Offset.INSTANCE.m21184getZeroF1C5BW0())), i9, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m18641getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i9, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m18639getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i9, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m18643getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i9, TextInclusionStrategy textInclusionStrategy) {
        long jM18641getRangeForScreenRectOH9lIzo = m18641getRangeForScreenRectOH9lIzo(textLayoutState, rect, i9, textInclusionStrategy);
        if (TextRange.m23454getCollapsedimpl(jM18641getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m23465getZerod9O1mEE();
        }
        long jM18641getRangeForScreenRectOH9lIzo2 = m18641getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i9, textInclusionStrategy);
        return TextRange.m23454getCollapsedimpl(jM18641getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m23465getZerod9O1mEE() : m18633enclosurepWDy79M(jM18641getRangeForScreenRectOH9lIzo, jM18641getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i9) {
        int lineForOffset = textLayoutResult.getLineForOffset(i9);
        return (i9 == textLayoutResult.getLineStart(lineForOffset) || i9 == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i9) != textLayoutResult.getBidiRunDirection(i9) : textLayoutResult.getBidiRunDirection(i9) != textLayoutResult.getBidiRunDirection(i9 - 1);
    }

    private static final boolean isNewline(int i9) {
        int type = Character.getType(i9);
        return type == 14 || type == 13 || i9 == 10;
    }

    private static final boolean isPunctuation(int i9) {
        int type = Character.getType(i9);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i9) {
        return Character.isWhitespace(i9) || i9 == NBSP_CODE_POINT;
    }

    private static final boolean isWhitespaceExceptNewline(int i9) {
        return isWhitespace(i9) && !isNewline(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i9) {
        int iCharCount = i9;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i9 < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i9);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i9 += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return Offset.m21160constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m18635getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j9, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m18637getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j9, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m18640getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i9, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m18639getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i9, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m18642getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i9, TextInclusionStrategy textInclusionStrategy) {
        long jM18640getRangeForScreenRectOH9lIzo = m18640getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i9, textInclusionStrategy);
        if (TextRange.m23454getCollapsedimpl(jM18640getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m23465getZerod9O1mEE();
        }
        long jM18640getRangeForScreenRectOH9lIzo2 = m18640getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i9, textInclusionStrategy);
        return TextRange.m23454getCollapsedimpl(jM18640getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m23465getZerod9O1mEE() : m18633enclosurepWDy79M(jM18640getRangeForScreenRectOH9lIzo, jM18640getRangeForScreenRectOH9lIzo2);
    }
}
