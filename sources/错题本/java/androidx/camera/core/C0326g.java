package androidx.camera.core;

import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0326g implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ int f401a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f402b;

    public /* synthetic */ C0326g(UseCase useCase, int i) {
        this.f401a = i;
        this.f402b = useCase;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f401a) {
            case 0:
                ((ImageAnalysis) this.f402b).lambda$createPipeline$2(sessionConfig, sessionError);
                break;
            case 1:
                ((ImageCapture) this.f402b).lambda$createPipeline$3(sessionConfig, sessionError);
                break;
            default:
                ((Preview) this.f402b).lambda$addCameraSurfaceAndErrorListener$1(sessionConfig, sessionError);
                break;
        }
    }
}
