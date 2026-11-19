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
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class CarouselState implements ScrollableState {
    private MutableState<InterfaceC9529a> itemCountState;
    private PagerState pagerState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<Object> invoke(SaverScope saverScope, CarouselState carouselState) {
            return AbstractC10978w.m24139q(Integer.valueOf(carouselState.getPagerState$material3_release().getCurrentPage()), Float.valueOf(carouselState.getPagerState$material3_release().getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.getPagerState$material3_release().getPageCount()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final CarouselState invoke(final List<? extends Object> list) {
            Object obj = list.get(0);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new CarouselState(iIntValue, ((Float) obj2).floatValue(), new InterfaceC9529a() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });

    @ExperimentalMaterial3Api
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }

        private Companion() {
        }
    }

    public CarouselState(int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10, InterfaceC9529a interfaceC9529a) {
        MutableState<InterfaceC9529a> mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC9529a, null, 2, null);
        this.itemCountState = mutableStateMutableStateOf$default;
        this.pagerState = PagerStateKt.PagerState(i10, f10, mutableStateMutableStateOf$default.getValue());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.pagerState.dispatchRawDelta(f10);
    }

    public final MutableState<InterfaceC9529a> getItemCountState() {
        return this.itemCountState;
    }

    public final PagerState getPagerState$material3_release() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll = this.pagerState.scroll(mutatePriority, interfaceC9544p, interfaceC11588c);
        return objScroll == AbstractC11725a.m25952f() ? objScroll : C10786q.f26013a;
    }

    public final void setItemCountState(MutableState<InterfaceC9529a> mutableState) {
        this.itemCountState = mutableState;
    }

    public final void setPagerState$material3_release(PagerState pagerState) {
        this.pagerState = pagerState;
    }

    public /* synthetic */ CarouselState(int i10, float f10, InterfaceC9529a interfaceC9529a, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, interfaceC9529a);
    }
}
