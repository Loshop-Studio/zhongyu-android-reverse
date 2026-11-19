package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.ijk.media.player.ISurfaceTextureHost;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.InterfaceC6704a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(14)
/* loaded from: classes4.dex */
public class TextureRenderView extends TextureView implements InterfaceC6704a {
    private static final String TAG = "TextureRenderView";
    private C6708c mMeasureHelper;
    private TextureViewSurfaceTextureListenerC6703b mSurfaceCallback;

    /* renamed from: com.tencent.liteav.txcvodplayer.TextureRenderView$b */
    public static final class TextureViewSurfaceTextureListenerC6703b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* renamed from: a */
        private SurfaceTexture f6289a;

        /* renamed from: b */
        private boolean f6290b;

        /* renamed from: c */
        private int f6291c;

        /* renamed from: d */
        private int f6292d;

        /* renamed from: h */
        private WeakReference<TextureRenderView> f6296h;

        /* renamed from: e */
        private boolean f6293e = true;

        /* renamed from: f */
        private boolean f6294f = false;

        /* renamed from: g */
        private boolean f6295g = false;

        /* renamed from: i */
        private Map<InterfaceC6704a.a, Object> f6297i = new ConcurrentHashMap();

        public TextureViewSurfaceTextureListenerC6703b(@NonNull TextureRenderView textureRenderView) {
            this.f6296h = new WeakReference<>(textureRenderView);
        }

        /* renamed from: b */
        public void m5618b(@NonNull InterfaceC6704a.a aVar) {
            this.f6297i.remove(aVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f6289a = surfaceTexture;
            this.f6290b = false;
            this.f6291c = 0;
            this.f6292d = 0;
            C6702a c6702a = new C6702a(this.f6296h.get(), surfaceTexture, this);
            Iterator<InterfaceC6704a.a> it = this.f6297i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5609a(c6702a, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f6289a = surfaceTexture;
            this.f6290b = false;
            this.f6291c = 0;
            this.f6292d = 0;
            C6702a c6702a = new C6702a(this.f6296h.get(), surfaceTexture, this);
            Iterator<InterfaceC6704a.a> it = this.f6297i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5608a(c6702a);
            }
            TXCLog.m4994i(TextureRenderView.TAG, "onSurfaceTextureDestroyed: destroy: " + this.f6293e);
            return this.f6293e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f6289a = surfaceTexture;
            this.f6290b = true;
            this.f6291c = i10;
            this.f6292d = i11;
            C6702a c6702a = new C6702a(this.f6296h.get(), surfaceTexture, this);
            Iterator<InterfaceC6704a.a> it = this.f6297i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5610a(c6702a, 0, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.tencent.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: null");
                return;
            }
            if (this.f6295g) {
                if (surfaceTexture != this.f6289a) {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f6293e) {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                    return;
                } else {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                    return;
                }
            }
            if (this.f6294f) {
                if (surfaceTexture != this.f6289a) {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f6293e) {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                    return;
                } else {
                    TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    m5616a(true);
                    return;
                }
            }
            if (surfaceTexture != this.f6289a) {
                TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (this.f6293e) {
                TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: will released by TextureView");
            } else {
                TXCLog.m4994i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                m5616a(true);
            }
        }

        /* renamed from: a */
        public void m5616a(boolean z10) {
            this.f6293e = z10;
        }

        /* renamed from: b */
        public void m5617b() {
            TXCLog.m4994i(TextureRenderView.TAG, "didDetachFromWindow()");
            this.f6295g = true;
        }

        /* renamed from: a */
        public void m5614a(SurfaceTexture surfaceTexture) {
            this.f6289a = surfaceTexture;
        }

        /* renamed from: a */
        public void m5615a(@NonNull InterfaceC6704a.a aVar) {
            C6702a c6702a;
            this.f6297i.put(aVar, aVar);
            if (this.f6289a != null) {
                c6702a = new C6702a(this.f6296h.get(), this.f6289a, this);
                aVar.mo5609a(c6702a, this.f6291c, this.f6292d);
            } else {
                c6702a = null;
            }
            if (this.f6290b) {
                if (c6702a == null) {
                    c6702a = new C6702a(this.f6296h.get(), this.f6289a, this);
                }
                aVar.mo5610a(c6702a, 0, this.f6291c, this.f6292d);
            }
        }

        /* renamed from: a */
        public void m5613a() {
            TXCLog.m4994i(TextureRenderView.TAG, "willDetachFromWindow()");
            this.f6294f = true;
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        this.mMeasureHelper = new C6708c(this);
        TextureViewSurfaceTextureListenerC6703b textureViewSurfaceTextureListenerC6703b = new TextureViewSurfaceTextureListenerC6703b(this);
        this.mSurfaceCallback = textureViewSurfaceTextureListenerC6703b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC6703b);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void addRenderCallback(InterfaceC6704a.a aVar) {
        this.mSurfaceCallback.m5615a(aVar);
    }

    public InterfaceC6704a.b getSurfaceHolder() {
        return new C6702a(this, this.mSurfaceCallback.f6289a, this.mSurfaceCallback);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            this.mSurfaceCallback.m5613a();
            super.onDetachedFromWindow();
            this.mSurfaceCallback.m5617b();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.mMeasureHelper.m5657c(i10, i11);
        setMeasuredDimension(this.mMeasureHelper.m5651a(), this.mMeasureHelper.m5654b());
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void removeRenderCallback(InterfaceC6704a.a aVar) {
        this.mSurfaceCallback.m5618b(aVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setAspectRatio(int i10) {
        this.mMeasureHelper.m5655b(i10);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoRotation(int i10) {
        this.mMeasureHelper.m5652a(i10);
        setRotation(i10);
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoSampleAspectRatio(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.mMeasureHelper.m5656b(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public void setVideoSize(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.mMeasureHelper.m5653a(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a
    public boolean shouldWaitForResize() {
        return false;
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    @TargetApi(21)
    public TextureRenderView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TextureRenderView$a */
    public static final class C6702a implements InterfaceC6704a.b {

        /* renamed from: a */
        private TextureRenderView f6285a;

        /* renamed from: b */
        private SurfaceTexture f6286b;

        /* renamed from: c */
        private ISurfaceTextureHost f6287c;

        /* renamed from: d */
        private Surface f6288d;

        public C6702a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.f6285a = textureRenderView;
            this.f6286b = surfaceTexture;
            this.f6287c = iSurfaceTextureHost;
        }

        @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
        @TargetApi(16)
        /* renamed from: a */
        public void mo5545a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (!(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                Surface surfaceM5611b = m5611b();
                this.f6288d = surfaceM5611b;
                iMediaPlayer.setSurface(surfaceM5611b);
                return;
            }
            ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
            this.f6285a.mSurfaceCallback.m5616a(false);
            if (this.f6285a.getSurfaceTexture() != null) {
                this.f6286b = this.f6285a.getSurfaceTexture();
            }
            try {
                SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
                if (surfaceTexture != null) {
                    iSurfaceTextureHolder.setSurfaceTextureHost(this.f6285a.mSurfaceCallback);
                    this.f6285a.setSurfaceTexture(surfaceTexture);
                    this.f6285a.mSurfaceCallback.m5614a(surfaceTexture);
                } else {
                    Surface surface = this.f6288d;
                    if (surface != null) {
                        iMediaPlayer.setSurface(surface);
                    }
                    iSurfaceTextureHolder.setSurfaceTexture(this.f6286b);
                    iSurfaceTextureHolder.setSurfaceTextureHost(this.f6285a.mSurfaceCallback);
                }
                this.f6288d = iMediaPlayer.getSurface();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Nullable
        /* renamed from: b */
        public Surface m5611b() {
            if (this.f6286b == null) {
                return null;
            }
            if (this.f6288d == null) {
                this.f6288d = new Surface(this.f6286b);
            }
            return this.f6288d;
        }

        @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
        @NonNull
        /* renamed from: a */
        public InterfaceC6704a mo5544a() {
            return this.f6285a;
        }
    }
}
