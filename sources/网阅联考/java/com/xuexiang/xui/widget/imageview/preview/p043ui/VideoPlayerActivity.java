package com.xuexiang.xui.widget.imageview.preview.p043ui;

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

/* loaded from: classes2.dex */
public class VideoPlayerActivity extends AppCompatActivity {

    /* renamed from: a */
    public VideoView f3620a;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$a */
    public class C3581a implements MediaPlayer.OnErrorListener {
        public C3581a() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            Toast.makeText(VideoPlayerActivity.this, R$string.xui_preview_play_failed, 0).show();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity$b */
    public class ViewOnClickListenerC3582b implements View.OnClickListener {
        public ViewOnClickListenerC3582b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.finish();
            VideoPlayerActivity.this.m4436j();
        }
    }

    /* renamed from: k */
    public static void m4435k(Fragment fragment, String str) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("com.xuexiang.xui.widget.preview.KEY_URL", str);
        fragment.startActivity(intent);
    }

    /* renamed from: j */
    public final void m4436j() {
        VideoView videoView = this.f3620a;
        if (videoView != null) {
            videoView.stopPlayback();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.preview_activity_video_player);
        this.f3620a = (VideoView) findViewById(R$id.video);
        String stringExtra = getIntent().getStringExtra("com.xuexiang.xui.widget.preview.KEY_URL");
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, R$string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.f3620a.setVideoPath(stringExtra);
            this.f3620a.setOnErrorListener(new C3581a());
            this.f3620a.start();
            findViewById(R$id.rl_root).setOnClickListener(new ViewOnClickListenerC3582b());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f3620a;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f3620a;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.f3620a.start();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (isFinishing()) {
            m4436j();
        }
        super.onStop();
    }
}
