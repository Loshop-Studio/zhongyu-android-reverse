package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* renamed from: androidx.camera.core.imagecapture.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0346h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f433a;

    /* renamed from: b */
    public final /* synthetic */ Object f434b;

    /* renamed from: c */
    public final /* synthetic */ Object f435c;

    public /* synthetic */ RunnableC0346h(int i, Object obj, Object obj2) {
        this.f433a = i;
        this.f434b = obj;
        this.f435c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f433a) {
            case 0:
                ((ProcessingRequest) this.f434b).onProcessFailure((ImageCaptureException) this.f435c);
                break;
            case 1:
                ((ProcessingRequest) this.f434b).onFinalResult((ImageProxy) this.f435c);
                break;
            case 2:
                ((ProcessingRequest) this.f434b).onFinalResult((ImageCapture.OutputFileResults) this.f435c);
                break;
            case 3:
                ((ProcessingRequest) this.f434b).onPostviewBitmapAvailable((Bitmap) this.f435c);
                break;
            case 4:
                ((TakePictureManager) this.f434b).lambda$trackCurrentRequests$1((RequestWithCallback) this.f435c);
                break;
            case 5:
                ((TakePictureRequest) this.f434b).lambda$onResult$2((ImageProxy) this.f435c);
                break;
            case 6:
                ((TakePictureRequest) this.f434b).lambda$onPostviewBitmapAvailable$4((Bitmap) this.f435c);
                break;
            case 7:
                ((TakePictureRequest) this.f434b).lambda$onResult$1((ImageCapture.OutputFileResults) this.f435c);
                break;
            default:
                ((TakePictureRequest) this.f434b).lambda$onError$0((ImageCaptureException) this.f435c);
                break;
        }
    }
}
