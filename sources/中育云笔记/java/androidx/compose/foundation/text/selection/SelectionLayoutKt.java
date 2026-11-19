package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.f1122ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i10) {
        return isOffsetAnEmptyLine(textLayoutResult, i10) ? textLayoutResult.getParagraphDirection(i10) : textLayoutResult.getBidiRunDirection(i10);
    }

    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m28230getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new SingleSelectionLayout(z11, 1, 1, z10 ? null : new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m32966getStartimpl(j10)), TextRange.m32966getStartimpl(j10), 1L), new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m32961getEndimpl(j10)), TextRange.m32961getEndimpl(j10), 1L), TextRange.m32965getReversedimpl(j10)), new SelectableInfo(1L, 1, i10, i11, i12, textLayoutResult));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f23398c = true;
        selectionLayout.forEachMiddleInfo(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt.isCollapsed.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SelectableInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SelectableInfo selectableInfo) {
                if (selectableInfo.getInputText().length() > 0) {
                    ref$BooleanRef.f23398c = false;
                }
            }
        });
        return ref$BooleanRef.f23398c;
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i10) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int lineForOffset = textLayoutResult.getLineForOffset(i10);
            if (i10 != 0 && lineForOffset == textLayoutResult.getLineForOffset(i10 - 1)) {
                return false;
            }
            if (i10 != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    public static final Direction resolve2dDirection(Direction direction, Direction direction2) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[direction2.ordinal()];
        if (i10 == 1) {
            return Direction.BEFORE;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return Direction.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i11 = iArr[direction.ordinal()];
        if (i11 == 1) {
            return Direction.BEFORE;
        }
        if (i11 == 2) {
            return Direction.f1122ON;
        }
        if (i11 == 3) {
            return Direction.AFTER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
