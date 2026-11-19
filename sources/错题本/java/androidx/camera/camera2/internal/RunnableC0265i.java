package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0265i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f279a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f280b;

    /* renamed from: c */
    public final /* synthetic */ String f281c;

    /* renamed from: d */
    public final /* synthetic */ SessionConfig f282d;

    /* renamed from: e */
    public final /* synthetic */ UseCaseConfig f283e;

    /* renamed from: f */
    public final /* synthetic */ StreamSpec f284f;

    /* renamed from: g */
    public final /* synthetic */ List f285g;

    public /* synthetic */ RunnableC0265i(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list, int i) {
        this.f279a = i;
        this.f280b = camera2CameraImpl;
        this.f281c = str;
        this.f282d = sessionConfig;
        this.f283e = useCaseConfig;
        this.f284f = streamSpec;
        this.f285g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f279a) {
            case 0:
                this.f280b.lambda$onUseCaseActive$7(this.f281c, this.f282d, this.f283e, this.f284f, this.f285g);
                break;
            case 1:
                this.f280b.lambda$resetUseCase$10(this.f281c, this.f282d, this.f283e, this.f284f, this.f285g);
                break;
            default:
                this.f280b.lambda$onUseCaseUpdated$9(this.f281c, this.f282d, this.f283e, this.f284f, this.f285g);
                break;
        }
    }
}
