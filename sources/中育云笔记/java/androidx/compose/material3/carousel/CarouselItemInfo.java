package androidx.compose.material3.carousel;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p014ui.geometry.Rect;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface CarouselItemInfo {
    Rect getMaskRect();

    float getMaxSize();

    float getMinSize();

    float getSize();
}
