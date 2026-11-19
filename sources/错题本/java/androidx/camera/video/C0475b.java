package androidx.camera.video;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.video.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0475b implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f580a;

    /* renamed from: b */
    public final /* synthetic */ Object f581b;

    /* renamed from: c */
    public final /* synthetic */ Object f582c;

    public /* synthetic */ C0475b(int i, Object obj, Object obj2) {
        this.f580a = i;
        this.f581b = obj;
        this.f582c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f580a) {
            case 0:
                return ((Recorder) this.f581b).lambda$updateEncoderCallbacks$10((Recorder.RecordingRecord) this.f582c, completer);
            case 1:
                return ((Recorder) this.f581b).lambda$updateEncoderCallbacks$12((Recorder.RecordingRecord) this.f582c, completer);
            default:
                return ((VideoCapture) this.f581b).lambda$setupSurfaceUpdateNotifier$6((SessionConfig.Builder) this.f582c, completer);
        }
    }
}
