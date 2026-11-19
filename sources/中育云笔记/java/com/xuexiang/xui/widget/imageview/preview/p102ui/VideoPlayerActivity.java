package com.xuexiang.xui.widget.imageview.preview.p102ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;

/* loaded from: classes5.dex */
public class VideoPlayerActivity extends FragmentActivity {

    /* renamed from: c */
    public VideoView f16280c;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$a */
    public class C8153a implements MediaPlayer.OnErrorListener {
        public C8153a() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            Toast.makeText(VideoPlayerActivity.this, R$string.xui_preview_play_failed, 0).show();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$b */
    public class ViewOnClickListenerC8154b implements View.OnClickListener {
        public ViewOnClickListenerC8154b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.finish();
            VideoPlayerActivity.this.m12879K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m12879K() {
        VideoView videoView = this.f16280c;
        if (videoView != null) {
            videoView.stopPlayback();
        }
    }

    /* renamed from: L */
    public static void m12880L(Fragment fragment, String str) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("com.xuexiang.xui.widget.preview.KEY_URL", str);
        fragment.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.preview_activity_video_player);
        this.f16280c = (VideoView) findViewById(R$id.video);
        String stringExtra = getIntent().getStringExtra("com.xuexiang.xui.widget.preview.KEY_URL");
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, R$string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.f16280c.setVideoPath(stringExtra);
            this.f16280c.setOnErrorListener(new C8153a());
            this.f16280c.start();
            findViewById(R$id.rl_root).setOnClickListener(new ViewOnClickListenerC8154b());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f16280c;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f16280c;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.f16280c.start();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (isFinishing()) {
            m12879K();
        }
        super.onStop();
    }
}
