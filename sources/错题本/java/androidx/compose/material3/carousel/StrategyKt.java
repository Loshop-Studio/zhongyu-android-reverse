package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5781c0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002\u001a&\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a0\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0**\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¨\u0006+"}, m5110d2 = {"createShiftedKeylineListForContentPadding", "Landroidx/compose/material3/carousel/KeylineList;", TypedValues.TransitionType.S_FROM, "carouselMainAxisSize", "", "itemSpacing", "contentPadding", "pivot", "Landroidx/compose/material3/carousel/Keyline;", "pivotIndex", "", "getEndKeylineSteps", "", "defaultKeylines", "afterContentPadding", "getEndShiftDistance", "endKeylineSteps", "getShiftPointRange", "Landroidx/compose/material3/carousel/ShiftPointRange;", "stepsCount", "shiftPoint", "Landroidx/collection/FloatList;", "interpolation", "getStartKeylineSteps", "beforeContentPadding", "getStartShiftDistance", "startKeylineSteps", "getStepInterpolationPoints", "totalShiftDistance", "steps", "isShiftingLeft", "", "lerp", "outputMin", "outputMax", "inputMin", "inputMax", "value", "moveKeylineAndCreateShiftedKeylineList", "srcIndex", "dstIndex", "move", "", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,626:1\n235#2,3:627\n33#2,4:630\n238#2,2:634\n38#2:636\n240#2:637\n277#2,3:638\n69#2,4:641\n280#2,2:645\n74#2:647\n282#2:648\n1549#3:649\n1620#3,3:650\n1855#3,2:653\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n483#1:627,3\n483#1:630,4\n483#1:634,2\n483#1:636\n483#1:637\n501#1:638,3\n501#1:641,4\n501#1:645,2\n501#1:647\n501#1:648\n562#1:649\n562#1:650,3\n590#1:653,2\n*E\n"})
/* loaded from: classes.dex */
public final class StrategyKt {
    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f, float f7, float f8, Keyline keyline, int i) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Keyline keyline2 = keylineList.get(i8);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f8 / arrayList.size();
        KeylineList keylineListKeylineListOf = KeylineListKt.keylineListOf(f, f7, i, (keyline.getOffset() - (size2 / 2.0f)) + f8, new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull KeylineListScope keylineListScope) {
                KeylineList keylineList2 = keylineList;
                float f9 = size2;
                int size3 = keylineList2.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    Keyline keyline3 = keylineList2.get(i9);
                    keylineListScope.add(keyline3.getSize() - Math.abs(f9), keyline3.isAnchor());
                }
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListKeylineListOf.size());
        int size3 = keylineListKeylineListOf.size();
        for (int i9 = 0; i9 < size3; i9++) {
            arrayList2.add(Keyline.copy$default(keylineListKeylineListOf.get(i9), 0.0f, 0.0f, keylineList.get(i9).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        }
        return new KeylineList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f, float f7, float f8) {
        if (keylineList.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f)) {
            if (f8 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f, f7, -f8, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i = lastNonAnchorIndex - lastFocalIndex;
        if (i <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f, f7));
            return arrayList;
        }
        for (int i8 = 0; i8 < i; i8++) {
            KeylineList keylineList2 = (KeylineList) AbstractC5805t.m5235o0(arrayList);
            int i9 = lastNonAnchorIndex - i8;
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i9 < AbstractC5806u.m5282u(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i9 + 1).getSize()) + 1 : 0, f, f7));
        }
        if (f8 == 0.0f) {
            return arrayList;
        }
        arrayList.set(AbstractC5806u.m5282u(arrayList), createShiftedKeylineListForContentPadding((KeylineList) AbstractC5805t.m5235o0(arrayList), f, f7, -f8, ((KeylineList) AbstractC5805t.m5235o0(arrayList)).getLastFocal(), ((KeylineList) AbstractC5805t.m5235o0(arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getEndShiftDistance(List<KeylineList> list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) AbstractC5805t.m5235o0((List) AbstractC5805t.m5228h0(list))).getUnadjustedOffset() - ((Keyline) AbstractC5805t.m5235o0((List) AbstractC5805t.m5235o0(list))).getUnadjustedOffset(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange getShiftPointRange(int i, FloatList floatList, float f) {
        float f7 = floatList.get(0);
        Iterator it = AbstractC5806u.m5260N(1, i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC5781c0) it).nextInt();
            float f8 = floatList.get(iNextInt);
            if (f <= f8) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, lerp(0.0f, 1.0f, f7, f8, f));
            }
            f7 = f8;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f, float f7, float f8) {
        if (keylineList.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f8 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f, f7, f8, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f, f7));
            return arrayList;
        }
        for (int i = 0; i < firstFocalIndex; i++) {
            KeylineList keylineList2 = (KeylineList) AbstractC5805t.m5235o0(arrayList);
            int i8 = firstNonAnchorIndex + i;
            int iM5282u = AbstractC5806u.m5282u(keylineList);
            if (i8 > 0) {
                iM5282u = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i8 - 1).getSize()) - 1;
            }
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), iM5282u, f, f7));
        }
        if (f8 == 0.0f) {
            return arrayList;
        }
        arrayList.set(AbstractC5806u.m5282u(arrayList), createShiftedKeylineListForContentPadding((KeylineList) AbstractC5805t.m5235o0(arrayList), f, f7, f8, ((KeylineList) AbstractC5805t.m5235o0(arrayList)).getFirstFocal(), ((KeylineList) AbstractC5805t.m5235o0(arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStartShiftDistance(List<KeylineList> list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) AbstractC5805t.m5228h0((List) AbstractC5805t.m5235o0(list))).getUnadjustedOffset() - ((Keyline) AbstractC5805t.m5228h0((List) AbstractC5805t.m5228h0(list))).getUnadjustedOffset(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatList getStepInterpolationPoints(float f, List<KeylineList> list, boolean z8) {
        MutableFloatList mutableFloatListMutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
        if (f != 0.0f && !list.isEmpty()) {
            C6756f c6756fM5260N = AbstractC5806u.m5260N(1, list.size());
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(c6756fM5260N, 10));
            Iterator it = c6756fM5260N.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC5781c0) it).nextInt();
                int i = iNextInt - 1;
                KeylineList keylineList = list.get(i);
                KeylineList keylineList2 = list.get(iNextInt);
                arrayList.add(Boolean.valueOf(mutableFloatListMutableFloatListOf.add(iNextInt == AbstractC5806u.m5282u(list) ? 1.0f : mutableFloatListMutableFloatListOf.get(i) + ((z8 ? ((Keyline) AbstractC5805t.m5228h0(keylineList2)).getUnadjustedOffset() - ((Keyline) AbstractC5805t.m5228h0(keylineList)).getUnadjustedOffset() : ((Keyline) AbstractC5805t.m5235o0(keylineList)).getUnadjustedOffset() - ((Keyline) AbstractC5805t.m5235o0(keylineList2)).getUnadjustedOffset()) / f))));
            }
        }
        return mutableFloatListMutableFloatListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f, float f7, float f8, float f9, float f10) {
        return f10 <= f8 ? f : f10 >= f9 ? f7 : MathHelpersKt.lerp(f, f7, (f10 - f8) / (f9 - f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Keyline> move(List<Keyline> list, int i, int i8) {
        Keyline keyline = list.get(i);
        list.remove(i);
        list.add(i8, keyline);
        return list;
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList keylineList, final int i, final int i8, float f, float f7) {
        int i9 = i > i8 ? 1 : -1;
        return KeylineListKt.keylineListOf(f, f7, keylineList.getPivotIndex() + i9, keylineList.getPivot().getOffset() + (((keylineList.get(i).getSize() - keylineList.get(i).getCutoff()) + f7) * i9), new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.StrategyKt.moveKeylineAndCreateShiftedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull KeylineListScope keylineListScope) {
                List listMove = StrategyKt.move(AbstractC5805t.m5218E0(keylineList), i, i8);
                int size = listMove.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Keyline keyline = (Keyline) listMove.get(i10);
                    keylineListScope.add(keyline.getSize(), keyline.isAnchor());
                }
            }
        });
    }
}
