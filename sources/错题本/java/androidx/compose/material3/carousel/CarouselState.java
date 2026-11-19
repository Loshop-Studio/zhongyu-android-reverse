package androidx.compose.material3.carousel;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m5110d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentItem", "", "currentItemOffsetFraction", "Lkotlin/Function0;", "itemCount", "<init>", "(IFLr6/a;)V", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/MutableState;", "itemCountState", "Landroidx/compose/runtime/MutableState;", "getItemCountState", "()Landroidx/compose/runtime/MutableState;", "setItemCountState", "(Landroidx/compose/runtime/MutableState;)V", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState$material3_release", "()Landroidx/compose/foundation/pager/PagerState;", "setPagerState$material3_release", "(Landroidx/compose/foundation/pager/PagerState;)V", "", "isScrollInProgress", "()Z", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CarouselState implements ScrollableState {

    @NotNull
    private MutableState<InterfaceC6469a> itemCountState;

    @NotNull
    private PagerState pagerState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new InterfaceC6473e() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$1
        @Override // p152r6.InterfaceC6473e
        @NotNull
        public final List<Object> invoke(@NotNull SaverScope saverScope, @NotNull CarouselState carouselState) {
            return AbstractC5806u.m5287z(Integer.valueOf(carouselState.getPagerState().getCurrentPage()), Float.valueOf(carouselState.getPagerState().getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.getPagerState().getPageCount()));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2
        @Override // p152r6.InterfaceC6471c
        @Nullable
        public final CarouselState invoke(@NotNull final List<? extends Object> list) {
            Object obj = list.get(0);
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new CarouselState(iIntValue, ((Float) obj2).floatValue(), new InterfaceC6469a() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    AbstractC5830k.m5328e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });

    @ExperimentalMaterial3Api
    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/material3/carousel/CarouselState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/carousel/CarouselState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }

        private Companion() {
        }
    }

    public CarouselState(int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f, @NotNull InterfaceC6469a interfaceC6469a) {
        MutableState<InterfaceC6469a> mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC6469a, null, 2, null);
        this.itemCountState = mutableStateMutableStateOf$default;
        this.pagerState = PagerStateKt.PagerState(i, f, mutableStateMutableStateOf$default.getValue());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.pagerState.dispatchRawDelta(delta);
    }

    @NotNull
    public final MutableState<InterfaceC6469a> getItemCountState() {
        return this.itemCountState;
    }

    @NotNull
    /* renamed from: getPagerState$material3_release, reason: from getter */
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objScroll = this.pagerState.scroll(mutatePriority, interfaceC6473e, interfaceC5631c);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : C5443s.f8405a;
    }

    public final void setItemCountState(@NotNull MutableState<InterfaceC6469a> mutableState) {
        this.itemCountState = mutableState;
    }

    public final void setPagerState$material3_release(@NotNull PagerState pagerState) {
        this.pagerState = pagerState;
    }

    public /* synthetic */ CarouselState(int i, float f, InterfaceC6469a interfaceC6469a, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0.0f : f, interfaceC6469a);
    }
}
