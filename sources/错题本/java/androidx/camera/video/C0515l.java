package androidx.camera.video;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.video.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0515l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f651a;

    /* renamed from: b */
    public final /* synthetic */ Object f652b;

    /* renamed from: c */
    public final /* synthetic */ Object f653c;

    public /* synthetic */ C0515l(int i, Object obj, Object obj2) {
        this.f651a = i;
        this.f652b = obj;
        this.f653c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f651a) {
            case 0:
                Recorder.RecordingRecord.lambda$initializeRecording$4((MediaStoreOutputOptions) this.f652b, (Context) this.f653c, (Uri) obj);
                break;
            default:
                ((Recorder) this.f652b).lambda$updateEncoderCallbacks$11((CallbackToFutureAdapter.Completer) this.f653c, (Throwable) obj);
                break;
        }
    }
}
