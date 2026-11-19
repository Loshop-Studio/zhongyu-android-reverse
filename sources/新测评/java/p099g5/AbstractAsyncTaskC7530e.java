package p099g5;

import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import p110h5.C7629a;

/* renamed from: g5.e */
/* loaded from: classes4.dex */
public abstract class AbstractAsyncTaskC7530e extends AsyncTask {

    /* renamed from: a */
    public String f12444a = "ProcessDataTask";

    /* renamed from: b */
    public Camera f12445b;

    /* renamed from: c */
    public byte[] f12446c;

    /* renamed from: d */
    public a f12447d;

    /* renamed from: g5.e$a */
    public interface a {
        /* renamed from: a */
        C7629a mo8634a(byte[] bArr, int i10, int i11);
    }

    public AbstractAsyncTaskC7530e(Camera camera, byte[] bArr, a aVar) {
        this.f12445b = camera;
        this.f12446c = bArr;
        this.f12447d = aVar;
    }

    /* renamed from: a */
    public void m12318a() {
        if (getStatus() != AsyncTask.Status.FINISHED) {
            cancel(true);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7629a doInBackground(Object... objArr) {
        Camera.Size previewSize = this.f12445b.getParameters().getPreviewSize();
        int i10 = previewSize.width;
        int i11 = previewSize.height;
        Log.e(this.f12444a, "width-->" + i10);
        Log.e(this.f12444a, "height-->" + i11);
        try {
            a aVar = this.f12447d;
            if (aVar == null) {
                return null;
            }
            return aVar.mo8634a(this.f12446c, i10, i11);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public AbstractAsyncTaskC7530e m12320c() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        return this;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.f12447d = null;
    }
}
