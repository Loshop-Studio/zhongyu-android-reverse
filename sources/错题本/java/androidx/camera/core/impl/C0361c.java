package androidx.camera.core.impl;

import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraFilter;
import java.util.List;

/* renamed from: androidx.camera.core.impl.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0361c implements CameraFilter {

    /* renamed from: a */
    public final /* synthetic */ int f443a;

    /* renamed from: b */
    public final /* synthetic */ Object f444b;

    public /* synthetic */ C0361c(Object obj, int i) {
        this.f443a = i;
        this.f444b = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        switch (this.f443a) {
            case 0:
                return ((CameraInfoInternal) this.f444b).lambda$getCameraSelector$0(list);
            default:
                return Camera2CameraCoordinator.lambda$createCameraSelectorById$0((String) this.f444b, list);
        }
    }
}
