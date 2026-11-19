package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.ZoomState;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ImmutableZoomState implements ZoomState {
    @NonNull
    public static ZoomState create(float f10, float f11, float f12, float f13) {
        return new AutoValue_ImmutableZoomState(f10, f11, f12, f13);
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    @NonNull
    public static ZoomState create(@NonNull ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}
