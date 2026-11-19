package com.tencent.rtmp.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.screencapture.C6682a;

/* loaded from: classes4.dex */
public class TXScreenCapture {

    @TargetApi(21)
    public static class TXScreenCaptureAssistantActivity extends Activity {
        private static final int REQUEST_CODE = 100;
        private static final String TAG = "TXScreenCaptureAssistantActivity";
        private MediaProjectionManager mMediaProjectionManager;

        @Override // android.app.Activity
        public void onActivityResult(int i10, int i11, Intent intent) {
            TXCLog.m4994i(TAG, "onActivityResult " + this);
            C6682a.m5529a(this).m5539a(this.mMediaProjectionManager.getMediaProjection(i11, intent));
            finish();
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            TXCLog.m4994i(TAG, "onCreate " + this);
            requestWindowFeature(1);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getApplicationContext().getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (Exception e10) {
                TXCLog.m4991e(TAG, "start permission activity failed. " + e10);
                C6682a.m5529a(this).m5539a((MediaProjection) null);
                finish();
            }
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            TXCLog.m4994i(TAG, "onDestroy " + this);
        }
    }
}
