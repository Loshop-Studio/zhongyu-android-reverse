package com.shuyu.gsyvideoplayer.placeholder;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import p261n7.RunnableC10326a;

@RequiresApi(17)
/* loaded from: classes5.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: c */
    public final boolean f12779c;

    /* renamed from: d */
    public final HandlerThreadC7522b f12780d;

    /* renamed from: e */
    public boolean f12781e;

    /* renamed from: com.shuyu.gsyvideoplayer.placeholder.PlaceholderSurface$b */
    public static class HandlerThreadC7522b extends HandlerThread implements Handler.Callback {

        /* renamed from: c */
        public RunnableC10326a f12782c;

        /* renamed from: d */
        public Handler f12783d;

        /* renamed from: e */
        public Error f12784e;

        /* renamed from: f */
        public RuntimeException f12785f;

        /* renamed from: g */
        public PlaceholderSurface f12786g;

        public HandlerThreadC7522b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        public PlaceholderSurface m9732a(int i10) {
            boolean z10;
            start();
            this.f12783d = new Handler(getLooper(), this);
            this.f12782c = new RunnableC10326a(this.f12783d);
            synchronized (this) {
                z10 = false;
                this.f12783d.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f12786g == null && this.f12785f == null && this.f12784e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f12785f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f12784e;
            if (error == null) {
                return this.f12786g;
            }
            throw error;
        }

        /* renamed from: b */
        public final void m9733b(int i10) {
            this.f12782c.m21560h(i10);
            this.f12786g = new PlaceholderSurface(this, this.f12782c.m21559g(), false);
        }

        /* renamed from: c */
        public void m9734c() {
            this.f12783d.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m9735d() {
            this.f12782c.m21561i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        m9735d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m9733b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f12784e = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f12785f = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static PlaceholderSurface m9731a(Context context, boolean z10) {
        return new HandlerThreadC7522b().m9732a(0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f12780d) {
            try {
                if (!this.f12781e) {
                    this.f12780d.m9734c();
                    this.f12781e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PlaceholderSurface(HandlerThreadC7522b handlerThreadC7522b, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f12780d = handlerThreadC7522b;
        this.f12779c = z10;
    }
}
