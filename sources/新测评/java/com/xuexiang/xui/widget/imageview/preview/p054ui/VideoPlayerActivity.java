package com.xuexiang.xui.widget.imageview.preview.p054ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;

/* loaded from: classes4.dex */
public class VideoPlayerActivity extends AppCompatActivity {

    /* renamed from: a */
    public VideoView f6416a;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$a */
    public class C6541a implements MediaPlayer.OnErrorListener {
        public C6541a() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            Toast.makeText(VideoPlayerActivity.this, R$string.xui_preview_play_failed, 0).show();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$b */
    public class ViewOnClickListenerC6542b implements View.OnClickListener {
        public ViewOnClickListenerC6542b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.finish();
            VideoPlayerActivity.this.m5794n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m5794n() {
        VideoView videoView = this.f6416a;
        if (videoView != null) {
            videoView.stopPlayback();
        }
    }

    /* renamed from: o */
    public static void m5795o(Fragment fragment, String str) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("com.xuexiang.xui.widget.preview.KEY_URL", str);
        fragment.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.preview_activity_video_player);
        this.f6416a = (VideoView) findViewById(R$id.video);
        String stringExtra = getIntent().getStringExtra("com.xuexiang.xui.widget.preview.KEY_URL");
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, R$string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.f6416a.setVideoPath(stringExtra);
            this.f6416a.setOnErrorListener(new C6541a());
            this.f6416a.start();
            findViewById(R$id.rl_root).setOnClickListener(new ViewOnClickListenerC6542b());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f6416a;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f6416a;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.f6416a.start();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (isFinishing()) {
            m5794n();
        }
        super.onStop();
    }
}
