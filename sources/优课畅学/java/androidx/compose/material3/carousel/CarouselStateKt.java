package androidx.compose.material3.carousel;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tencent.smtt.sdk.TbsListener;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class CarouselStateKt {
    @Composable
    @ExperimentalMaterial3Api
    public static final CarouselState rememberCarouselState(final int i10, final InterfaceC10559a interfaceC10559a, Composer composer, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-217285684, i11, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:102)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselState, ?> saver = CarouselState.Companion.getSaver();
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(i10)) || (i11 & 6) == 4;
        if ((((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) <= 32 || !composer.changed(interfaceC10559a)) && (i11 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objRememberedValue = composer.rememberedValue();
        if (z12 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC10559a() { // from class: androidx.compose.material3.carousel.CarouselStateKt$rememberCarouselState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final CarouselState invoke() {
                    return new CarouselState(i10, 0.0f, interfaceC10559a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        CarouselState carouselState = (CarouselState) RememberSaveableKt.m23818rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC10559a) objRememberedValue, composer, 0, 4);
        carouselState.getItemCountState().setValue(interfaceC10559a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselState;
    }
}
