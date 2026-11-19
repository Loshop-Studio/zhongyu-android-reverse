package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.C5828i;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000f\u001a\u00020\f*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Lkotlinx/coroutines/v;", "scope", "<init>", "(Lkotlinx/coroutines/v;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Lkotlinx/coroutines/v;", "getScope", "()Lkotlinx/coroutines/v;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "initialOffset", "Ljava/lang/Integer;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n151#2,3:775\n33#2,4:778\n154#2,2:782\n38#2:784\n156#2:785\n171#2,13:786\n151#2,3:799\n33#2,4:802\n154#2,2:806\n38#2:808\n156#2:809\n171#2,13:810\n171#2,13:823\n1#3:836\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:775,3\n354#1:778,4\n354#1:782,2\n354#1:784\n354#1:785\n355#1:786,13\n356#1:799,3\n356#1:802,4\n356#1:806,2\n356#1:808\n356#1:809\n357#1:810,13\n358#1:823,13\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;

    @Nullable
    private Animatable<Integer, AnimationVector1D> animatable;

    @Nullable
    private Integer initialOffset;

    @NotNull
    private final InterfaceC6009v scope;

    public SegmentedButtonContentMeasurePolicy(@NotNull InterfaceC6009v interfaceC6009v) {
        this.scope = interfaceC6009v;
    }

    @Nullable
    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    @NotNull
    public final InterfaceC6009v getScope() {
        return this.scope;
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7209measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j7) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends Measurable> list2 = list.get(0);
        int i = 1;
        List<? extends Measurable> list3 = list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(list2.get(i8).mo12033measureBRTryo0(j7));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int iM5282u = AbstractC5806u.m5282u(arrayList);
            if (1 <= iM5282u) {
                int i9 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i9);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i9 == iM5282u) {
                        break;
                    }
                    i9++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            arrayList2.add(list3.get(i10).mo12033measureBRTryo0(j7));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int iM5282u2 = AbstractC5806u.m5282u(arrayList2);
            if (1 <= iM5282u2) {
                int i11 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i11);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i11 == iM5282u2) {
                        break;
                    }
                    i11++;
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
            int iM5282u3 = AbstractC5806u.m5282u(arrayList2);
            if (1 <= iM5282u3) {
                while (true) {
                    Object obj6 = arrayList2.get(i);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i == iM5282u3) {
                        break;
                    }
                    i++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int iMo6897roundToPx0680j_4 = measureScope.mo6897roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + Math.max(measureScope.mo6897roundToPx0680j_4(segmentedButtonDefaults.m8861getIconSizeD9Ej5fM()), width3) + (numValueOf != null ? numValueOf.intValue() : 0);
        int i12 = width3 == 0 ? (-(measureScope.mo6897roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + measureScope.mo6897roundToPx0680j_4(segmentedButtonDefaults.m8861getIconSizeD9Ej5fM()))) / 2 : 0;
        Integer num = this.initialOffset;
        if (num == null) {
            this.initialOffset = Integer.valueOf(i12);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Animatable<Integer, AnimationVector1D> animatable2 = new Animatable<>(num, VectorConvertersKt.getVectorConverter(C5828i.f9220a), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (animatable.getTargetValue().intValue() != i12) {
                AbstractC6014x.m5651v(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i12, null), 3);
            }
        }
        final int i13 = height3;
        final int i14 = i12;
        return MeasureScope.layout$default(measureScope, iMo6897roundToPx0680j_4, i13, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                invoke((Placeable.PlacementScope) obj7);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                List<Placeable> list4 = arrayList;
                int i15 = i13;
                int size3 = list4.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    Placeable placeable4 = list4.get(i16);
                    Placeable.PlacementScope.place$default(placementScope, placeable4, 0, AbstractC0584a.m906g(placeable4, i15, 2), 0.0f, 4, null);
                }
                int iMo6897roundToPx0680j_42 = measureScope.mo6897roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + measureScope.mo6897roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m8861getIconSizeD9Ej5fM());
                Animatable<Integer, AnimationVector1D> animatable3 = this.getAnimatable();
                int iIntValue = iMo6897roundToPx0680j_42 + (animatable3 != null ? animatable3.getValue().intValue() : i14);
                List<Placeable> list5 = arrayList2;
                int i17 = i13;
                int size4 = list5.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    Placeable placeable5 = list5.get(i18);
                    Placeable.PlacementScope.place$default(placementScope, placeable5, iIntValue, AbstractC0584a.m906g(placeable5, i17, 2), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setAnimatable(@Nullable Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
