package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.layout.BeyondBoundsLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m5175d2 = {"searchBeyondBounds", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m8867searchBeyondBoundsOMvw8(FocusTargetModifierNode searchBeyondBounds, int i4, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int iM10571getBeforehoxUOeE;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent$ui_release = searchBeyondBounds.getBeyondBoundsLayoutParent$ui_release();
        if (beyondBoundsLayoutParent$ui_release == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10569getAbovehoxUOeE();
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10572getBelowhoxUOeE();
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10573getLefthoxUOeE();
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10574getRighthoxUOeE();
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8884getNextdhqQ8s())) {
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10570getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8886getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iM10571getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m10571getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent$ui_release.mo7515layouto7g1Pn8(iM10571getBeforehoxUOeE, block);
    }
}
