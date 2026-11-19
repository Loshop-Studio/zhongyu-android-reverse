package com.xuexiang.xui.widget.imageview.preview.p034ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import p017b1.ViewOnClickListenerC3099c;
import p189w2.C6708g;

/* loaded from: classes3.dex */
public class VideoPlayerActivity extends FragmentActivity {

    /* renamed from: b */
    public static final /* synthetic */ int f4454b = 0;

    /* renamed from: a */
    public VideoView f4455a;

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.preview_activity_video_player);
        this.f4455a = (VideoView) findViewById(R$id.video);
        String stringExtra = getIntent().getStringExtra("com.xuexiang.xui.widget.preview.KEY_URL");
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, R$string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.f4455a.setVideoPath(stringExtra);
            this.f4455a.setOnErrorListener(new C6708g(this));
            this.f4455a.start();
            findViewById(R$id.rl_root).setOnClickListener(new ViewOnClickListenerC3099c(this, 7));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        VideoView videoView = this.f4455a;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        VideoView videoView = this.f4455a;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.f4455a.start();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        VideoView videoView;
        if (isFinishing() && (videoView = this.f4455a) != null) {
            videoView.stopPlayback();
        }
        super.onStop();
    }
}
