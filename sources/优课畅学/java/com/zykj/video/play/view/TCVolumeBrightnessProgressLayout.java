package com.zykj.video.play.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;

/* loaded from: classes5.dex */
public class TCVolumeBrightnessProgressLayout extends RelativeLayout {

    /* renamed from: a */
    public ImageView f14789a;

    /* renamed from: b */
    public ProgressBar f14790b;

    /* renamed from: c */
    public RunnableC8193b f14791c;

    /* renamed from: d */
    public int f14792d;

    /* renamed from: com.zykj.video.play.view.TCVolumeBrightnessProgressLayout$b */
    public class RunnableC8193b implements Runnable {
        public RunnableC8193b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TCVolumeBrightnessProgressLayout.this.setVisibility(8);
        }
    }

    public TCVolumeBrightnessProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14792d = 1000;
        m12558a(context);
    }

    /* renamed from: a */
    public final void m12558a(Context context) {
        LayoutInflater.from(context).inflate(R$layout.superplayer_video_volume_brightness_progress_layout, this);
        this.f14789a = (ImageView) findViewById(R$id.superplayer_iv_center);
        this.f14790b = (ProgressBar) findViewById(R$id.superplayer_pb_progress_bar);
        this.f14791c = new RunnableC8193b();
        setVisibility(8);
    }

    /* renamed from: b */
    public void m12559b() {
        setVisibility(0);
        removeCallbacks(this.f14791c);
        postDelayed(this.f14791c, this.f14792d);
    }

    public void setDuration(int i10) {
        this.f14792d = i10;
    }

    public void setImageResource(int i10) {
        this.f14789a.setImageResource(i10);
    }

    public void setProgress(int i10) {
        this.f14790b.setProgress(i10);
    }
}
