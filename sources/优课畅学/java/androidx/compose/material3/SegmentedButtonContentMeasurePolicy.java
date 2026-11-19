package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9132t;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private Animatable<Integer, AnimationVector1D> animatable;
    private Integer initialOffset;
    private final InterfaceC8822b0 scope;

    public SegmentedButtonContentMeasurePolicy(InterfaceC8822b0 interfaceC8822b0) {
        this.scope = interfaceC8822b0;
    }

    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final InterfaceC8822b0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20803measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends Measurable> list2 = list.get(0);
        int i10 = 1;
        List<? extends Measurable> list3 = list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list2.get(i11).mo25627measureBRTryo0(j10));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int iM14773p = AbstractC8809v.m14773p(arrayList);
            if (1 <= iM14773p) {
                int i12 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i12);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i12 == iM14773p) {
                        break;
                    }
                    i12++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList2.add(list3.get(i13).mo25627measureBRTryo0(j10));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int iM14773p2 = AbstractC8809v.m14773p(arrayList2);
            if (1 <= iM14773p2) {
                int i14 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i14);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i14 == iM14773p2) {
                        break;
                    }
                    i14++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int iM14773p3 = AbstractC8809v.m14773p(arrayList2);
            if (1 <= iM14773p3) {
                while (true) {
                    Object obj6 = arrayList2.get(i10);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i10 == iM14773p3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int iMax = Math.max(measureScope.mo20491roundToPx0680j_4(segmentedButtonDefaults.m22455getIconSizeD9Ej5fM()), width3) + measureScope.mo20491roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + (numValueOf != null ? numValueOf.intValue() : 0);
        int i15 = width3 == 0 ? (-(measureScope.mo20491roundToPx0680j_4(segmentedButtonDefaults.m22455getIconSizeD9Ej5fM()) + measureScope.mo20491roundToPx0680j_4(SegmentedButtonKt.IconSpacing))) / 2 : 0;
        if (this.initialOffset == null) {
            this.initialOffset = Integer.valueOf(i15);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Integer num = this.initialOffset;
                AbstractC9133u.m16130d(num);
                Animatable<Integer, AnimationVector1D> animatable2 = new Animatable<>(num, VectorConvertersKt.getVectorConverter(C9132t.f17496a), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (animatable.getTargetValue().intValue() != i15) {
                AbstractC8839h.m14861d(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i15, null), 3, null);
            }
        }
        final int i16 = height3;
        final int i17 = i15;
        return MeasureScope.layout$default(measureScope, iMax, i16, null, new InterfaceC10570l() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                invoke((Placeable.PlacementScope) obj7);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                List<Placeable> list4 = arrayList;
                int i18 = i16;
                int size3 = list4.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    Placeable placeable4 = list4.get(i19);
                    Placeable.PlacementScope.place$default(placementScope, placeable4, 0, (i18 - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                int iMo20491roundToPx0680j_4 = measureScope.mo20491roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m22455getIconSizeD9Ej5fM()) + measureScope.mo20491roundToPx0680j_4(SegmentedButtonKt.IconSpacing);
                Animatable<Integer, AnimationVector1D> animatable3 = this.getAnimatable();
                int iIntValue = iMo20491roundToPx0680j_4 + (animatable3 != null ? animatable3.getValue().intValue() : i17);
                List<Placeable> list5 = arrayList2;
                int i20 = i16;
                int size4 = list5.size();
                for (int i21 = 0; i21 < size4; i21++) {
                    Placeable placeable5 = list5.get(i21);
                    Placeable.PlacementScope.place$default(placementScope, placeable5, iIntValue, (i20 - placeable5.getHeight()) / 2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setAnimatable(Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
