package com.zykj.video.play.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;

/* loaded from: classes5.dex */
public class TCVideoProgressLayout extends RelativeLayout {

    /* renamed from: a */
    public ImageView f14755a;

    /* renamed from: b */
    public TextView f14756b;

    /* renamed from: c */
    public ProgressBar f14757c;

    /* renamed from: d */
    public RunnableC8184b f14758d;

    /* renamed from: e */
    public int f14759e;

    /* renamed from: com.zykj.video.play.view.TCVideoProgressLayout$b */
    public class RunnableC8184b implements Runnable {
        public RunnableC8184b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TCVideoProgressLayout.this.f14755a.setImageBitmap(null);
            TCVideoProgressLayout.this.f14755a.setVisibility(8);
            TCVideoProgressLayout.this.setVisibility(8);
        }
    }

    public TCVideoProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14759e = 1000;
        m12538b(context);
    }

    /* renamed from: b */
    public final void m12538b(Context context) {
        LayoutInflater.from(context).inflate(R$layout.superplayer_video_progress_layout, this);
        this.f14755a = (ImageView) findViewById(R$id.superplayer_iv_progress_thumbnail);
        this.f14757c = (ProgressBar) findViewById(R$id.superplayer_pb_progress_bar);
        this.f14756b = (TextView) findViewById(R$id.superplayer_tv_progress_time);
        setVisibility(8);
        this.f14758d = new RunnableC8184b();
    }

    /* renamed from: c */
    public void m12539c() {
        setVisibility(0);
        removeCallbacks(this.f14758d);
        postDelayed(this.f14758d, this.f14759e);
    }

    public void setDuration(int i10) {
        this.f14759e = i10;
    }

    public void setProgress(int i10) {
        this.f14757c.setProgress(i10);
    }

    public void setProgressVisibility(boolean z10) {
        this.f14757c.setVisibility(z10 ? 0 : 8);
    }

    public void setThumbnail(Bitmap bitmap) {
        this.f14755a.setVisibility(0);
        this.f14755a.setImageBitmap(bitmap);
    }

    public void setTimeText(String str) {
        this.f14756b.setText(str);
    }
}
