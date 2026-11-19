package p219k6;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: k6.d */
/* loaded from: classes5.dex */
public class C9822d implements MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a */
    public final MediaScannerConnection f23063a;

    /* renamed from: b */
    public final String f23064b;

    public C9822d(Context context, String str) {
        this.f23064b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context.getApplicationContext(), this);
        this.f23063a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public void onMediaScannerConnected() {
        if (TextUtils.isEmpty(this.f23064b)) {
            return;
        }
        this.f23063a.scanFile(this.f23064b, null);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        this.f23063a.disconnect();
    }
}
