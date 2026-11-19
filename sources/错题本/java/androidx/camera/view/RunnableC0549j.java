package androidx.camera.view;

import androidx.camera.view.RotationProvider;

/* renamed from: androidx.camera.view.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0549j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f697a;

    /* renamed from: b */
    public final /* synthetic */ int f698b;

    /* renamed from: c */
    public final /* synthetic */ Object f699c;

    public /* synthetic */ RunnableC0549j(Object obj, int i, int i8) {
        this.f697a = i8;
        this.f699c = obj;
        this.f698b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f697a) {
            case 0:
                ((RotationProvider.ListenerWrapper) this.f699c).lambda$onRotationChanged$0(this.f698b);
                break;
            default:
                ((CameraController) this.f699c).lambda$setEnabledUseCases$2(this.f698b);
                break;
        }
    }
}
