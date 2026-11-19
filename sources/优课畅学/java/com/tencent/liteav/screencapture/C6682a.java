package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC6591d;
import com.tencent.liteav.basic.util.HandlerC6594g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* renamed from: com.tencent.liteav.screencapture.a */
/* loaded from: classes4.dex */
public class C6682a {

    /* renamed from: a */
    private static volatile C6682a f6183a;

    /* renamed from: b */
    private final Context f6184b;

    /* renamed from: f */
    private MediaProjection f6188f;

    /* renamed from: g */
    private HandlerC6594g f6189g;

    /* renamed from: h */
    private boolean f6190h;

    /* renamed from: d */
    private final Map<Surface, a> f6186d = new HashMap();

    /* renamed from: e */
    private boolean f6187e = false;

    /* renamed from: i */
    private MediaProjection.Callback f6191i = new MediaProjection.Callback() { // from class: com.tencent.liteav.screencapture.a.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            TXCLog.m4991e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            HashMap map = new HashMap(C6682a.this.f6186d);
            C6682a.this.f6186d.clear();
            for (a aVar : map.values()) {
                b bVar = aVar.f6199d;
                if (bVar != null) {
                    if (aVar.f6200e != null) {
                        bVar.m5540a();
                    } else {
                        bVar.m5542a(false, false);
                    }
                }
            }
            C6682a.this.m5533a(false);
        }
    };

    /* renamed from: j */
    private HandlerC6594g.a f6192j = new HandlerC6594g.a() { // from class: com.tencent.liteav.screencapture.a.2
        @Override // com.tencent.liteav.basic.util.HandlerC6594g.a
        /* renamed from: a */
        public void mo5068a() {
            C6682a c6682a = C6682a.this;
            boolean zM5536b = c6682a.m5536b(c6682a.f6184b);
            if (C6682a.this.f6190h == zM5536b) {
                return;
            }
            C6682a.this.f6190h = zM5536b;
            Iterator it = C6682a.this.f6186d.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f6199d;
                if (bVar != null) {
                    bVar.m5541a(zM5536b);
                }
            }
        }
    };

    /* renamed from: c */
    private final Handler f6185c = new HandlerC6591d(Looper.getMainLooper());

    /* renamed from: com.tencent.liteav.screencapture.a$a */
    public static class a {

        /* renamed from: a */
        public Surface f6196a;

        /* renamed from: b */
        public int f6197b;

        /* renamed from: c */
        public int f6198c;

        /* renamed from: d */
        public b f6199d;

        /* renamed from: e */
        public VirtualDisplay f6200e;

        private a() {
        }
    }

    /* renamed from: com.tencent.liteav.screencapture.a$b */
    public interface b {
        /* renamed from: a */
        void m5540a();

        /* renamed from: a */
        void m5541a(boolean z10);

        /* renamed from: a */
        void m5542a(boolean z10, boolean z11);
    }

    public C6682a(Context context) {
        this.f6184b = context.getApplicationContext();
        this.f6190h = m5536b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m5536b(Context context) {
        int rotation;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return windowManager == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == 0 || rotation == 2;
    }

    /* renamed from: a */
    public static C6682a m5529a(Context context) {
        if (f6183a == null) {
            synchronized (C6682a.class) {
                try {
                    if (f6183a == null) {
                        f6183a = new C6682a(context);
                    }
                } finally {
                }
            }
        }
        return f6183a;
    }

    /* renamed from: a */
    private void m5531a() {
        for (a aVar : this.f6186d.values()) {
            if (aVar.f6200e == null) {
                aVar.f6200e = this.f6188f.createVirtualDisplay("TXCScreenCapture", aVar.f6197b, aVar.f6198c, 1, 1, aVar.f6196a, null, null);
                TXCLog.m4994i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f6200e);
                b bVar = aVar.f6199d;
                if (bVar != null) {
                    bVar.m5542a(true, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5533a(boolean z10) {
        if (this.f6186d.isEmpty()) {
            if (z10) {
                this.f6185c.postDelayed(new Runnable() { // from class: com.tencent.liteav.screencapture.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C6682a.this.m5533a(false);
                    }
                }, TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            TXCLog.m4994i("VirtualDisplayManager", "stop media projection session " + this.f6188f);
            MediaProjection mediaProjection = this.f6188f;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.f6191i);
                this.f6188f.stop();
                this.f6188f = null;
            }
            HandlerC6594g handlerC6594g = this.f6189g;
            if (handlerC6594g != null) {
                handlerC6594g.m5066a();
                this.f6189g = null;
            }
        }
    }

    /* renamed from: a */
    public void m5539a(MediaProjection mediaProjection) {
        this.f6187e = false;
        if (mediaProjection == null) {
            HashMap map = new HashMap(this.f6186d);
            this.f6186d.clear();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f6199d;
                if (bVar != null) {
                    bVar.m5542a(false, true);
                }
            }
            return;
        }
        TXCLog.m4994i("VirtualDisplayManager", "Got session " + mediaProjection);
        this.f6188f = mediaProjection;
        mediaProjection.registerCallback(this.f6191i, this.f6185c);
        m5531a();
        HandlerC6594g handlerC6594g = new HandlerC6594g(Looper.getMainLooper(), this.f6192j);
        this.f6189g = handlerC6594g;
        handlerC6594g.m5067a(50, 50);
        m5533a(true);
    }
}
