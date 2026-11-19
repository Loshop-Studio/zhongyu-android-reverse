package com.zykj.student.dialogue.p076ui.widget;

import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.DpOffset;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntRect;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.compose.p012ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p294x6.AbstractC9905t;

@Immutable
@Metadata(m13412d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001J/\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R)\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/widget/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/DpOffset;", "a", "J", "getContentOffset-RKDOV3M", "()J", "contentOffset", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function2;", "", "c", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "onPositionCalculated", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomDropdownMenu.kt\ncom/zykj/student/dialogue/ui/widget/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,241:1\n1#2:242\n54#3:243\n54#3:245\n54#3:247\n54#3:250\n59#3:253\n59#3:255\n59#3:257\n59#3:260\n54#3:263\n59#3:265\n85#4:244\n85#4:246\n85#4:248\n85#4:251\n90#4:254\n90#4:256\n90#4:258\n90#4:261\n85#4:264\n90#4:266\n80#4:268\n183#5:249\n184#5:252\n183#5:259\n184#5:262\n32#6:267\n*S KotlinDebug\n*F\n+ 1 CustomDropdownMenu.kt\ncom/zykj/student/dialogue/ui/widget/DropdownMenuPositionProvider\n*L\n117#1:243\n118#1:245\n134#1:247\n137#1:250\n142#1:253\n143#1:255\n144#1:257\n147#1:260\n152#1:263\n152#1:265\n117#1:244\n118#1:246\n134#1:248\n137#1:251\n142#1:254\n143#1:256\n144#1:258\n147#1:261\n152#1:264\n152#1:266\n154#1:268\n136#1:249\n136#1:252\n145#1:259\n145#1:262\n154#1:267\n*E\n"})
/* loaded from: classes5.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final long contentOffset;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Density density;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Function2 onPositionCalculated;

    @Override // androidx.compose.p012ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo17734calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Sequence sequenceSequenceOf;
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int iMo17759roundToPx0680j_4 = this.density.mo17759roundToPx0680j_4(AbstractC9905t.f17728a);
        int iMo17759roundToPx0680j_42 = this.density.mo17759roundToPx0680j_4(DpOffset.m24055getXD9Ej5fM(this.contentOffset));
        int iMo17759roundToPx0680j_43 = this.density.mo17759roundToPx0680j_4(DpOffset.m24057getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + iMo17759roundToPx0680j_42;
        int i9 = (int) (popupContentSize >> 32);
        int right = (anchorBounds.getRight() - iMo17759roundToPx0680j_42) - i9;
        int i10 = (int) (windowSize >> 32);
        int i11 = i10 - i9;
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer numValueOf = Integer.valueOf(left);
            Integer numValueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                i11 = 0;
            }
            sequenceSequenceOf = SequencesKt.sequenceOf((Object[]) new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i11)});
        } else {
            Integer numValueOf3 = Integer.valueOf(right);
            Integer numValueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= i10) {
                i11 = 0;
            }
            sequenceSequenceOf = SequencesKt.sequenceOf((Object[]) new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i11)});
        }
        Iterator it = sequenceSequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + i9 <= i10) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iMo17759roundToPx0680j_43, iMo17759roundToPx0680j_4);
        int top2 = anchorBounds.getTop() - iMo17759roundToPx0680j_43;
        int i12 = (int) (popupContentSize & 4294967295L);
        int iIntValue2 = top2 - i12;
        int i13 = (int) (windowSize & 4294967295L);
        Iterator it2 = SequencesKt.sequenceOf((Object[]) new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue2), Integer.valueOf(anchorBounds.getTop() - (i12 / 2)), Integer.valueOf((i13 - i12) - iMo17759roundToPx0680j_4)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue3 = ((Number) next2).intValue();
            if (iIntValue3 >= iMo17759roundToPx0680j_4 && iIntValue3 + i12 <= i13 - iMo17759roundToPx0680j_4) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, iIntValue2, i9 + right, i12 + iIntValue2));
        return IntOffset.m24116constructorimpl((right << 32) | (iIntValue2 & 4294967295L));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m24054equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((DpOffset.m24059hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.m24062toStringimpl(this.contentOffset) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ")";
    }
}
