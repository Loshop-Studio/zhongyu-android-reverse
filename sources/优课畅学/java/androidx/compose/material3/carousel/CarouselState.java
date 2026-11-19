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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class CarouselState implements ScrollableState {
    private MutableState<InterfaceC10559a> itemCountState;
    private PagerState pagerState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final List<Object> invoke(SaverScope saverScope, CarouselState carouselState) {
            return AbstractC8809v.m14774q(Integer.valueOf(carouselState.getPagerState$material3_release().getCurrentPage()), Float.valueOf(carouselState.getPagerState$material3_release().getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.getPagerState$material3_release().getPageCount()));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public final CarouselState invoke(final List<? extends Object> list) {
            Object obj = list.get(0);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new CarouselState(iIntValue, ((Float) obj2).floatValue(), new InterfaceC10559a() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });

    @ExperimentalMaterial3Api
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }

        private Companion() {
        }
    }

    public CarouselState(int i10, @FloatRange(from = -0.5d, m243to = 0.5d) float f10, InterfaceC10559a interfaceC10559a) {
        MutableState<InterfaceC10559a> mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC10559a, null, 2, null);
        this.itemCountState = mutableStateMutableStateOf$default;
        this.pagerState = PagerStateKt.PagerState(i10, f10, mutableStateMutableStateOf$default.getValue());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.pagerState.dispatchRawDelta(f10);
    }

    public final MutableState<InterfaceC10559a> getItemCountState() {
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
    public Object scroll(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objScroll = this.pagerState.scroll(mutatePriority, interfaceC10574p, interfaceC9324c);
        return objScroll == AbstractC9434a.m17291f() ? objScroll : C8736p.f16368a;
    }

    public final void setItemCountState(MutableState<InterfaceC10559a> mutableState) {
        this.itemCountState = mutableState;
    }

    public final void setPagerState$material3_release(PagerState pagerState) {
        this.pagerState = pagerState;
    }

    public /* synthetic */ CarouselState(int i10, float f10, InterfaceC10559a interfaceC10559a, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, interfaceC10559a);
    }
}
