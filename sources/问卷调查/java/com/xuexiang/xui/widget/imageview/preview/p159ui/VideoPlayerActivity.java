package com.xuexiang.xui.widget.imageview.preview.p159ui;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p006c.ActivityC0021g;

/* loaded from: classes.dex */
public class VideoPlayerActivity extends ActivityC0021g {

    /* renamed from: p */
    public static final /* synthetic */ int f5232p = 0;

    /* renamed from: o */
    public VideoView f5233o;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$a */
    public class C0966a implements MediaPlayer.OnErrorListener {
        public C0966a() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Toast.makeText(VideoPlayerActivity.this, C1088R.string.xui_preview_play_failed, 0).show();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$b */
    public class ViewOnClickListenerC0967b implements View.OnClickListener {
        public ViewOnClickListenerC0967b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.finish();
            VideoView videoView = VideoPlayerActivity.this.f5233o;
            if (videoView != null) {
                videoView.stopPlayback();
            }
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1088R.layout.preview_activity_video_player);
        this.f5233o = (VideoView) findViewById(C1088R.id.video);
        String stringExtra = getIntent().getStringExtra("com.xuexiang.xui.widget.preview.KEY_URL");
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, C1088R.string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.f5233o.setVideoPath(stringExtra);
            this.f5233o.setOnErrorListener(new C0966a());
            this.f5233o.start();
            findViewById(C1088R.id.rl_root).setOnClickListener(new ViewOnClickListenerC0967b());
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f5233o;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f5233o;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.f5233o.start();
    }

    @Override // p000a.p005b.p006c.ActivityC0021g, p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onStop() {
        VideoView videoView;
        if (isFinishing() && (videoView = this.f5233o) != null) {
            videoView.stopPlayback();
        }
        super.onStop();
    }
}
