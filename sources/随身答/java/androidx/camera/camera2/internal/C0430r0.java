package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* renamed from: androidx.camera.camera2.internal.r0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0430r0 implements CameraCharacteristicsProvider {

    /* renamed from: a */
    public final /* synthetic */ CameraCharacteristicsCompat f408a;

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.f408a.get(key);
    }
}
