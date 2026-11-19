package androidx.camera.video;

import android.media.MediaScannerConnection;
import android.net.Uri;
import androidx.camera.video.Recorder;

/* renamed from: androidx.camera.video.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0516m implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        Recorder.RecordingRecord.lambda$initializeRecording$3(str, uri);
    }
}
