package com.luck.picture.lib.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import p235l6.AbstractC10149c;

/* loaded from: classes5.dex */
public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {

    /* renamed from: c */
    public MediaPlayer f12614c;

    /* renamed from: d */
    public VideoSurfaceView f12615d;

    public static class VideoSurfaceView extends SurfaceView {

        /* renamed from: c */
        public int f12616c;

        /* renamed from: d */
        public int f12617d;

        public VideoSurfaceView(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public void m9620a(int i10, int i11) {
            if (i10 == 0 || i11 == 0) {
                return;
            }
            this.f12616c = i10;
            this.f12617d = i11;
            getHolder().setFixedSize(i10, i11);
            requestLayout();
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i10, int i11) {
            int i12;
            int defaultSize = View.getDefaultSize(this.f12616c, i10);
            int defaultSize2 = View.getDefaultSize(this.f12617d, i11);
            if (this.f12616c > 0 && this.f12617d > 0) {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                int size2 = View.MeasureSpec.getSize(i11);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i13 = this.f12616c;
                    int i14 = i13 * size2;
                    int i15 = this.f12617d;
                    if (i14 < size * i15) {
                        defaultSize = (i13 * size2) / i15;
                        defaultSize2 = size2;
                    } else {
                        if (i13 * size2 > size * i15) {
                            defaultSize2 = (i15 * size) / i13;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else if (mode == 1073741824) {
                    int i16 = (this.f12617d * size) / this.f12616c;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        defaultSize2 = i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i12 = (this.f12616c * size2) / this.f12617d;
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        int i17 = this.f12616c;
                        int i18 = this.f12617d;
                        if (mode2 != Integer.MIN_VALUE || i18 <= size2) {
                            i12 = i17;
                            size2 = i18;
                        } else {
                            i12 = (size2 * i17) / i18;
                        }
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize2 = (i18 * size) / i17;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i12;
                    defaultSize2 = size2;
                }
            }
            setMeasuredDimension(defaultSize, defaultSize2);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }
    }

    /* renamed from: com.luck.picture.lib.widget.MediaPlayerView$a */
    public class C7509a implements MediaPlayer.OnVideoSizeChangedListener {
        public C7509a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            MediaPlayerView.this.f12615d.m9620a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        }
    }

    public MediaPlayerView(@NonNull Context context) {
        super(context);
        m9616c();
    }

    /* renamed from: b */
    public void m9615b() {
        this.f12615d.getHolder().setFormat(-1);
        this.f12615d.getHolder().setFormat(-2);
    }

    /* renamed from: c */
    public final void m9616c() {
        this.f12615d = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f12615d.setLayoutParams(layoutParams);
        addView(this.f12615d);
        SurfaceHolder holder = this.f12615d.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    /* renamed from: d */
    public MediaPlayer m9617d() {
        if (this.f12614c == null) {
            this.f12614c = new MediaPlayer();
        }
        this.f12614c.setOnVideoSizeChangedListener(new C7509a());
        return this.f12614c;
    }

    /* renamed from: e */
    public void m9618e() {
        MediaPlayer mediaPlayer = this.f12614c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f12614c.setOnPreparedListener(null);
            this.f12614c.setOnCompletionListener(null);
            this.f12614c.setOnErrorListener(null);
            this.f12614c = null;
        }
    }

    /* renamed from: f */
    public void m9619f(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        try {
            if (AbstractC10149c.m21174c(str)) {
                this.f12614c.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.f12614c.setDataSource(str);
            }
            this.f12614c.prepareAsync();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public MediaPlayer getMediaPlayer() {
        return this.f12614c;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f12614c.setAudioStreamType(3);
        this.f12614c.setDisplay(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m9616c();
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m9616c();
    }
}
