package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.InterfaceC6704a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class SurfaceRenderView extends SurfaceView implements InterfaceC6704a {

    /* renamed from: a */
    private C6708c f6201a;

    /* renamed from: b */
    private SurfaceHolderCallbackC6685b f6202b;

    /* renamed from: com.tencent.liteav.txcvodplayer.SurfaceRenderView$b */
    public static final class SurfaceHolderCallbackC6685b implements SurfaceHolder.Callback {

        /* renamed from: a */
        private SurfaceHolder f6205a;

        /* renamed from: b */
        private boolean f6206b;

        /* renamed from: c */
        private int f6207c;

        /* renamed from: d */
        private int f6208d;

        /* renamed from: e */
        private int f6209e;

        /* renamed from: f */
        private WeakReference<SurfaceRenderView> f6210f;

        /* renamed from: g */
        private Map<InterfaceC6704a.a, Object> f6211g = new ConcurrentHashMap();

        public SurfaceHolderCallbackC6685b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f6210f = new WeakReference<>(surfaceRenderView);
        }

        /* renamed from: a */
        public void m5546a(@NonNull InterfaceC6704a.a aVar) {
            C6684a c6684a;
            this.f6211g.put(aVar, aVar);
            if (this.f6205a != null) {
                c6684a = new C6684a(this.f6210f.get(), this.f6205a);
                aVar.mo5609a(c6684a, this.f6208d, this.f6209e);
            } else {
                c6684a = null;
            }
            if (this.f6206b) {
                if (c6684a == null) {
                    c6684a = new C6684a(this.f6210f.get(), this.f6205a);
                }
                aVar.mo5610a(c6684a, this.f6207c, this.f6208d, this.f6209e);
            }
        }

        /* renamed from: b */
        public void m5547b(@NonNull InterfaceC6704a.a aVar) {
            this.f6211g.remove(aVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f6205a = surfaceHolder;
            this.f6206b = true;
            this.f6207c = i10;
            this.f6208d = i11;
            this.f6209e = i12;
            C6684a c6684a = new C6684a(this.f6210f.get(), this.f6205a);
            Iterator<InterfaceC6704a.a> it = this.f6211g.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5610a(c6684a, i10, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f6205a = surfaceHolder;
            this.f6206b = false;
            this.f6207c = 0;
            this.f6208d = 0;
            this.f6209e = 0;
            C6684a c6684a = new C6684a(this.f6210f.get(), this.f6205a);
            Iterator<InterfaceC6704a.a> it = this.f6211g.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5609a(c6684a, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f6205a = null;
            this.f6206b = false;
            this.f6207c = 0;
            this.f6208d = 0;
            this.f6209e = 0;
            C6684a c6684a = new C6684a(this.f6210f.get(), this.f6205a);
            Iterator<InterfaceC6704a.a> it = this.f6211g.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5608a(c6684a);
            }
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        m5543a(context);
    }

    /* renamed from: a */
    private void m5543a(Context context) {
        this.f6201a = new C6708c(this);
        this.f6202b = new SurfaceHolderCallbackC6685b(this);
        getHolder().addCallback(this.f6202b);
        getHolder().setType(0);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void addRenderCallback(InterfaceC6704a.a aVar) {
        this.f6202b.m5546a(aVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f6201a.m5657c(i10, i11);
        setMeasuredDimension(this.f6201a.m5651a(), this.f6201a.m5654b());
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void removeRenderCallback(InterfaceC6704a.a aVar) {
        this.f6202b.m5547b(aVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setAspectRatio(int i10) {
        this.f6201a.m5655b(i10);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoRotation(int i10) {
        TXCLog.m4991e("", "SurfaceView doesn't support rotation (" + i10 + ")!\n");
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoSampleAspectRatio(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f6201a.m5656b(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoSize(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f6201a.m5653a(i10, i11);
        getHolder().setFixedSize(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public boolean shouldWaitForResize() {
        return true;
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5543a(context);
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.SurfaceRenderView$a */
    public static final class C6684a implements InterfaceC6704a.b {

        /* renamed from: a */
        private SurfaceRenderView f6203a;

        /* renamed from: b */
        private SurfaceHolder f6204b;

        public C6684a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.f6203a = surfaceRenderView;
            this.f6204b = surfaceHolder;
        }

        @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
        /* renamed from: a */
        public void mo5545a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (iMediaPlayer instanceof ISurfaceTextureHolder) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f6204b);
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
        @NonNull
        /* renamed from: a */
        public InterfaceC6704a mo5544a() {
            return this.f6203a;
        }
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m5543a(context);
    }
}
