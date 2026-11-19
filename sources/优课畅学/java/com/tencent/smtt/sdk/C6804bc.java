package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.tencent.smtt.export.external.DexLoader;

/* renamed from: com.tencent.smtt.sdk.bc */
/* loaded from: classes4.dex */
class C6804bc extends FrameLayout implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    private Object f6848a;

    /* renamed from: b */
    private C6806be f6849b;

    /* renamed from: c */
    private VideoView f6850c;

    /* renamed from: d */
    private Context f6851d;

    /* renamed from: e */
    private String f6852e;

    public C6804bc(Context context) {
        super(context.getApplicationContext());
        this.f6851d = context;
    }

    /* renamed from: b */
    private void m6135b(Bundle bundle, Object obj) {
        boolean zM6151a;
        m6136a();
        if (m6140b()) {
            bundle.putInt("callMode", bundle.getInt("callMode"));
            zM6151a = this.f6849b.m6151a(this.f6848a, bundle, this, obj);
        } else {
            zM6151a = false;
        }
        if (zM6151a) {
            return;
        }
        VideoView videoView = this.f6850c;
        if (videoView != null) {
            videoView.stopPlayback();
        }
        if (this.f6850c == null) {
            this.f6850c = new VideoView(getContext());
        }
        String string = bundle.getString("videoUrl");
        this.f6852e = string;
        this.f6850c.setVideoURI(Uri.parse(string));
        this.f6850c.setOnErrorListener(this);
        Intent intent = new Intent("com.tencent.smtt.tbs.video.PLAY");
        intent.addFlags(268435456);
        Context applicationContext = getContext().getApplicationContext();
        intent.setPackage(applicationContext.getPackageName());
        applicationContext.startActivity(intent);
    }

    /* renamed from: a */
    public void m6136a() {
        setBackgroundColor(-16777216);
        if (this.f6849b == null) {
            C6827l.m6214a(true).m6220a(getContext().getApplicationContext(), false, false, null);
            C6805bd c6805bdM6219a = C6827l.m6214a(true).m6219a();
            DexLoader dexLoaderM6147b = c6805bdM6219a != null ? c6805bdM6219a.m6147b() : null;
            if (dexLoaderM6147b != null && QbSdk.canLoadVideo(getContext())) {
                this.f6849b = new C6806be(dexLoaderM6147b);
            }
        }
        C6806be c6806be = this.f6849b;
        if (c6806be == null || this.f6848a != null) {
            return;
        }
        this.f6848a = c6806be.m6148a(getContext().getApplicationContext());
    }

    /* renamed from: c */
    public void m6141c() {
        if (m6140b()) {
            this.f6849b.m6149a(this.f6848a);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        try {
            Context context = this.f6851d;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Context context2 = getContext();
            if (context2 != null) {
                Toast.makeText(context2, "播放失败，请选择其它播放器播放", 1).show();
                Context applicationContext = context2.getApplicationContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setDataAndType(Uri.parse(this.f6852e), "video/*");
                applicationContext.startActivity(intent);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m6137a(Activity activity) {
        VideoView videoView;
        if (m6140b() || (videoView = this.f6850c) == null) {
            return;
        }
        if (videoView.getParent() == null) {
            Window window = activity.getWindow();
            FrameLayout frameLayout = (FrameLayout) window.getDecorView();
            window.addFlags(1024);
            window.addFlags(128);
            frameLayout.setBackgroundColor(-16777216);
            MediaController mediaController = new MediaController(activity);
            mediaController.setMediaPlayer(this.f6850c);
            this.f6850c.setMediaController(mediaController);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            frameLayout.addView(this.f6850c, layoutParams);
        }
        this.f6850c.start();
    }

    /* renamed from: b */
    public boolean m6140b() {
        return (this.f6849b == null || this.f6848a == null) ? false : true;
    }

    /* renamed from: a */
    public void m6138a(Activity activity, int i10) {
        VideoView videoView;
        VideoView videoView2;
        if (i10 == 3 && !m6140b() && (videoView2 = this.f6850c) != null) {
            videoView2.pause();
        }
        if (i10 == 4) {
            this.f6851d = null;
            if (!m6140b() && (videoView = this.f6850c) != null) {
                videoView.stopPlayback();
                this.f6850c = null;
            }
        }
        if (i10 == 2 && !m6140b()) {
            this.f6851d = activity;
            m6137a(activity);
        }
        if (m6140b()) {
            this.f6849b.m6150a(this.f6848a, activity, i10);
        }
    }

    /* renamed from: a */
    public void m6139a(Bundle bundle, Object obj) {
        m6135b(bundle, obj);
    }
}
