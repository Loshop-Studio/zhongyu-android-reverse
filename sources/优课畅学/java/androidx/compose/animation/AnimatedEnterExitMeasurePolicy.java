package androidx.compose.animation;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i11 = 1;
        if (1 <= iM14773p) {
            while (true) {
                int iMaxIntrinsicHeight2 = list.get(i11).maxIntrinsicHeight(i10);
                if (iMaxIntrinsicHeight2 > iMaxIntrinsicHeight) {
                    iMaxIntrinsicHeight = iMaxIntrinsicHeight2;
                }
                if (i11 == iM14773p) {
                    break;
                }
                i11++;
            }
        }
        return iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i11 = 1;
        if (1 <= iM14773p) {
            while (true) {
                int iMaxIntrinsicWidth2 = list.get(i11).maxIntrinsicWidth(i10);
                if (iMaxIntrinsicWidth2 > iMaxIntrinsicWidth) {
                    iMaxIntrinsicWidth = iMaxIntrinsicWidth2;
                }
                if (i11 == iM14773p) {
                    break;
                }
                i11++;
            }
        }
        return iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeableMo25627measureBRTryo0 = list.get(i10).mo25627measureBRTryo0(j10);
            iMax = Math.max(iMax, placeableMo25627measureBRTryo0.getWidth());
            iMax2 = Math.max(iMax2, placeableMo25627measureBRTryo0.getHeight());
            arrayList.add(placeableMo25627measureBRTryo0);
        }
        if (measureScope.isLookingAhead()) {
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize$animation_release().setValue(IntSize.m27062boximpl(IntSize.m27065constructorimpl((4294967295L & iMax2) | (iMax << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize$animation_release().setValue(IntSize.m27062boximpl(IntSize.m27065constructorimpl((4294967295L & iMax2) | (iMax << 32))));
        }
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                List<Placeable> list2 = arrayList;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Placeable.PlacementScope.place$default(placementScope, list2.get(i11), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicHeight = list.get(0).minIntrinsicHeight(i10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i11 = 1;
        if (1 <= iM14773p) {
            while (true) {
                int iMinIntrinsicHeight2 = list.get(i11).minIntrinsicHeight(i10);
                if (iMinIntrinsicHeight2 > iMinIntrinsicHeight) {
                    iMinIntrinsicHeight = iMinIntrinsicHeight2;
                }
                if (i11 == iM14773p) {
                    break;
                }
                i11++;
            }
        }
        return iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicWidth = list.get(0).minIntrinsicWidth(i10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i11 = 1;
        if (1 <= iM14773p) {
            while (true) {
                int iMinIntrinsicWidth2 = list.get(i11).minIntrinsicWidth(i10);
                if (iMinIntrinsicWidth2 > iMinIntrinsicWidth) {
                    iMinIntrinsicWidth = iMinIntrinsicWidth2;
                }
                if (i11 == iM14773p) {
                    break;
                }
                i11++;
            }
        }
        return iMinIntrinsicWidth;
    }

    public final void setHasLookaheadOccurred(boolean z10) {
        this.hasLookaheadOccurred = z10;
    }
}
