package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p200x6.C6755e;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J,\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,958:1\n70#2,4:959\n75#2:965\n70#2,6:966\n320#2,8:1006\n320#2,8:1014\n320#2,8:1022\n320#2,8:1030\n30#3:963\n30#3:1004\n80#4:964\n85#4:973\n90#4:989\n80#4:1005\n54#5:972\n59#5:988\n13896#6,14:974\n13896#6,14:990\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n887#1:959,4\n887#1:965\n900#1:966,6\n941#1:1006,8\n946#1:1014,8\n951#1:1022,8\n956#1:1030,8\n894#1:963\n919#1:1004\n894#1:964\n907#1:973\n913#1:989\n919#1:1005\n907#1:972\n913#1:988\n909#1:974,14\n915#1:990,14\n*E\n"})
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(@NotNull AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @NotNull
    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int iM5282u = AbstractC5806u.m5282u(list);
            int i8 = 1;
            if (1 <= iM5282u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i8).maxIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iM5282u) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int iM5282u = AbstractC5806u.m5282u(list);
            int i8 = 1;
            if (1 <= iM5282u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i8).maxIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iM5282u) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
        Placeable placeable;
        Placeable placeable2;
        final int width;
        final int height;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long jM13481getZeroYbymL2g = IntSize.INSTANCE.m13481getZeroYbymL2g();
        int size2 = list.size();
        int i = 0;
        while (true) {
            placeable = null;
            if (i >= size2) {
                break;
            }
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
                long jM13471constructorimpl = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
                placeableArr[i] = placeableMo12033measureBRTryo0;
                jM13481getZeroYbymL2g = jM13471constructorimpl;
            }
            i++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Measurable measurable2 = list.get(i8);
            if (placeableArr[i8] == null) {
                placeableArr[i8] = measurable2.mo12033measureBRTryo0(j7);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (jM13481getZeroYbymL2g >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    C6755e it = new C6756f(1, i9, 1).iterator();
                    while (it.f11425c) {
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
            height = (int) (jM13481getZeroYbymL2g & 4294967295L);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int height2 = placeable != null ? placeable.getHeight() : 0;
                    C6755e it2 = new C6756f(1, i10, 1).iterator();
                    while (it2.f11425c) {
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
            this.rootScope.m6570setMeasuredSizeozmzZPI$animation_release(IntSize.m13471constructorimpl((width << 32) | (height & 4294967295L)));
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC6471c() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2;
                Placeable[] placeableArr3 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i11 = width;
                int i12 = height;
                int length = placeableArr3.length;
                int i13 = 0;
                while (i13 < length) {
                    Placeable placeable5 = placeableArr3[i13];
                    if (placeable5 != null) {
                        placeableArr2 = placeableArr3;
                        long jMo10250alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo10250alignKFBX0sM(IntSize.m13471constructorimpl((placeable5.getWidth() << 32) | (placeable5.getHeight() & 4294967295L)), IntSize.m13471constructorimpl((i12 & 4294967295L) | (i11 << 32)), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m13433getXimpl(jMo10250alignKFBX0sM), IntOffset.m13434getYimpl(jMo10250alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placeableArr2 = placeableArr3;
                    }
                    i13++;
                    placeableArr3 = placeableArr2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int iM5282u = AbstractC5806u.m5282u(list);
            int i8 = 1;
            if (1 <= iM5282u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i8).minIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iM5282u) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int iM5282u = AbstractC5806u.m5282u(list);
            int i8 = 1;
            if (1 <= iM5282u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i8).minIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iM5282u) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
