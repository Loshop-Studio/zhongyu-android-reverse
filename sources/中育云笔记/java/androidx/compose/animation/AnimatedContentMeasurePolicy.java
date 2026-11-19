package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.List;
import p181hd.InterfaceC9540l;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i10));
            int iM24138p = AbstractC10978w.m24138p(list);
            int i11 = 1;
            if (1 <= iM24138p) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).maxIntrinsicHeight(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM24138p) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i10));
            int iM24138p = AbstractC10978w.m24138p(list);
            int i11 = 1;
            if (1 <= iM24138p) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).maxIntrinsicWidth(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM24138p) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        Placeable placeable;
        Placeable placeable2;
        final int width;
        final int height;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long jM33677getZeroYbymL2g = IntSize.Companion.m33677getZeroYbymL2g();
        List<? extends Measurable> list2 = list;
        int size2 = list2.size();
        int i10 = 0;
        while (true) {
            placeable = null;
            if (i10 >= size2) {
                break;
            }
            Measurable measurable = list.get(i10);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
                long jM33667constructorimpl = IntSize.m33667constructorimpl((placeableMo32229measureBRTryo0.getWidth() << 32) | (placeableMo32229measureBRTryo0.getHeight() & 4294967295L));
                C10786q c10786q = C10786q.f26013a;
                placeableArr[i10] = placeableMo32229measureBRTryo0;
                jM33677getZeroYbymL2g = jM33667constructorimpl;
            }
            i10++;
        }
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Measurable measurable2 = list.get(i11);
            if (placeableArr[i11] == null) {
                placeableArr[i11] = measurable2.mo32229measureBRTryo0(j10);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (jM33677getZeroYbymL2g >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int iM24041A0 = AbstractC10968r.m24041A0(placeableArr);
                if (iM24041A0 != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    AbstractC10961n0 it = new C10405j(1, iM24041A0).iterator();
                    while (it.hasNext()) {
                        Placeable placeable3 = placeableArr[it.nextInt()];
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        if (width2 < width3) {
                            placeable2 = placeable3;
                            width2 = width3;
                        }
                    }
                }
            }
            width = placeable2 != null ? placeable2.getWidth() : 0;
        }
        if (measureScope.isLookingAhead()) {
            height = (int) (jM33677getZeroYbymL2g & 4294967295L);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int iM24041A02 = AbstractC10968r.m24041A0(placeableArr);
                if (iM24041A02 != 0) {
                    int height2 = placeable != null ? placeable.getHeight() : 0;
                    AbstractC10961n0 it2 = new C10405j(1, iM24041A02).iterator();
                    while (it2.hasNext()) {
                        Placeable placeable4 = placeableArr[it2.nextInt()];
                        int height3 = placeable4 != null ? placeable4.getHeight() : 0;
                        if (height2 < height3) {
                            placeable = placeable4;
                            height2 = height3;
                        }
                    }
                }
            }
            height = placeable != null ? placeable.getHeight() : 0;
        }
        if (!measureScope.isLookingAhead()) {
            this.rootScope.m26766setMeasuredSizeozmzZPI$animation_release(IntSize.m33667constructorimpl((width << 32) | (height & 4294967295L)));
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC9540l() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2;
                Placeable[] placeableArr3 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i12 = width;
                int i13 = height;
                int length = placeableArr3.length;
                int i14 = 0;
                while (i14 < length) {
                    Placeable placeable5 = placeableArr3[i14];
                    if (placeable5 != null) {
                        placeableArr2 = placeableArr3;
                        long jMo30446alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo30446alignKFBX0sM(IntSize.m33667constructorimpl((placeable5.getWidth() << 32) | (placeable5.getHeight() & 4294967295L)), IntSize.m33667constructorimpl((i13 & 4294967295L) | (i12 << 32)), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m33629getXimpl(jMo30446alignKFBX0sM), IntOffset.m33630getYimpl(jMo30446alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placeableArr2 = placeableArr3;
                    }
                    i14++;
                    placeableArr3 = placeableArr2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i10));
            int iM24138p = AbstractC10978w.m24138p(list);
            int i11 = 1;
            if (1 <= iM24138p) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).minIntrinsicHeight(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM24138p) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i10));
            int iM24138p = AbstractC10978w.m24138p(list);
            int i11 = 1;
            if (1 <= iM24138p) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).minIntrinsicWidth(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM24138p) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
