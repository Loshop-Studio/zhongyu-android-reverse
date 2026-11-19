package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface CarouselItemScope {
    CarouselItemInfo getCarouselItemInfo();

    @Composable
    Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i10);

    @Composable
    Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i10);

    @Composable
    GenericShape rememberMaskShape(Shape shape, Composer composer, int i10);
}
