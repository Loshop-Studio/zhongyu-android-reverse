package com.friday.common.activity;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.friday.common.activity.PusherService;
import com.friday.common.helper.C5962b;
import com.friday.common.service.BaseLifecycleService;
import java.io.ByteArrayOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

@StabilityInferred(parameters = 0)
@SuppressLint({"WrongConstant"})
/* loaded from: classes3.dex */
public final class PusherService extends BaseLifecycleService {

    /* renamed from: e */
    public MediaProjection f5594e;

    /* renamed from: g */
    public DatagramSocket f5596g;

    /* renamed from: h */
    public Intent f5597h;

    /* renamed from: k */
    public int f5600k;

    /* renamed from: o */
    public volatile boolean f5604o;

    /* renamed from: d */
    public final InterfaceC10773d f5593d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: a2.a
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return PusherService.m4780n(this.f32c);
        }
    });

    /* renamed from: f */
    public final InterfaceC10773d f5595f = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: a2.b
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return PusherService.m4779m();
        }
    });

    /* renamed from: i */
    public int f5598i = 8782;

    /* renamed from: j */
    public int f5599j = 8;

    /* renamed from: l */
    public final String f5601l = C5962b.f6082a.m5299a().m5283k();

    /* renamed from: m */
    public final InterfaceC10773d f5602m = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: a2.c
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return PusherService.m4781o(this.f33c);
        }
    });

    /* renamed from: n */
    public boolean f5603n = true;

    /* renamed from: p */
    public final ExecutorService f5605p = Executors.newSingleThreadExecutor();

    /* renamed from: q */
    public volatile long f5606q = System.currentTimeMillis();

    /* renamed from: r */
    public final ImageReader.OnImageAvailableListener f5607r = new ImageReader.OnImageAvailableListener() { // from class: a2.d
        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            PusherService.m4783q(this.f34a, imageReader);
        }
    };

    /* renamed from: com.friday.common.activity.PusherService$a */
    public static final class C5924a implements NetworkUtils.OnNetworkStatusChangedListener {
        public C5924a() {
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.OnNetworkStatusChangedListener
        public void onConnected(NetworkUtils.NetworkType networkType) {
            AbstractC11958b.m26588i("网络恢复，投屏将恢复服务");
            PusherService.this.f5603n = true;
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.OnNetworkStatusChangedListener
        public void onDisconnected() {
            AbstractC11958b.m26588i("网络丢失，投屏将停止服务");
            PusherService.this.f5603n = false;
        }
    }

    /* renamed from: m */
    public static final ImageReader m4779m() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(ScreenUtils.getScreenWidth(), ScreenUtils.getScreenHeight(), 1, 2);
        AbstractC9979u.m20293f(imageReaderNewInstance, "newInstance(...)");
        return imageReaderNewInstance;
    }

    /* renamed from: n */
    public static final MediaProjectionManager m4780n(PusherService pusherService) {
        Object systemService = pusherService.getApplicationContext().getSystemService("media_projection");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        return (MediaProjectionManager) systemService;
    }

    /* renamed from: o */
    public static final C5924a m4781o(PusherService pusherService) {
        return pusherService.new C5924a();
    }

    /* renamed from: p */
    private final void m4782p(boolean z10) {
        if (z10) {
            NetworkUtils.registerNetworkStatusChangedListener(m4788k());
        } else {
            NetworkUtils.unregisterNetworkStatusChangedListener(m4788k());
        }
    }

    /* renamed from: q */
    public static final void m4783q(final PusherService pusherService, final ImageReader imageReader) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (pusherService.f5604o && pusherService.f5603n && jCurrentTimeMillis - pusherService.f5606q > 1000.0f / pusherService.f5599j) {
            pusherService.f5605p.submit(new Runnable() { // from class: a2.e
                @Override // java.lang.Runnable
                public final void run() {
                    PusherService.m4784r(this.f35c, imageReader);
                }
            });
            return;
        }
        try {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage != null) {
                imageAcquireLatestImage.close();
                C10786q c10786q = C10786q.f26013a;
            }
        } catch (Exception unused) {
            C10786q c10786q2 = C10786q.f26013a;
        }
    }

    /* renamed from: r */
    public static final void m4784r(PusherService pusherService, ImageReader imageReader) {
        AbstractC9979u.m20291d(imageReader);
        pusherService.m4789l(imageReader);
    }

    /* renamed from: h */
    public final ImageReader m4785h() {
        return (ImageReader) this.f5595f.getValue();
    }

    /* renamed from: i */
    public final int m4786i(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public final MediaProjectionManager m4787j() {
        return (MediaProjectionManager) this.f5593d.getValue();
    }

    /* renamed from: k */
    public final C5924a m4788k() {
        return (C5924a) this.f5602m.getValue();
    }

    /* renamed from: l */
    public final synchronized void m4789l(ImageReader imageReader) {
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage == null) {
            return;
        }
        int width = imageAcquireLatestImage.getWidth();
        int height = imageAcquireLatestImage.getHeight();
        Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
        AbstractC9979u.m20293f(planes, "getPlanes(...)");
        ByteBuffer buffer = planes[0].getBuffer();
        AbstractC9979u.m20293f(buffer, "getBuffer(...)");
        int pixelStride = planes[0].getPixelStride();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((planes[0].getRowStride() - (pixelStride * width)) / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
        AbstractC9979u.m20293f(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.copyPixelsFromBuffer(buffer);
        int i10 = 0;
        while (true) {
            int i11 = 3;
            boolean z10 = true;
            if (i10 >= 3) {
                this.f5600k++;
                this.f5606q = System.currentTimeMillis();
                imageAcquireLatestImage.close();
                return;
            }
            int i12 = 0;
            while (i12 < i11) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, (i10 * width) / i11, (i12 * height) / i11, width / 3, height / 3);
                AbstractC9979u.m20293f(bitmapCreateBitmap2, "createBitmap(...)");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 30, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length + 8;
                byte[] bArr = new byte[length];
                String iPAddress = NetworkUtils.getIPAddress(z10);
                AbstractC9979u.m20293f(iPAddress, "getIPAddress(...)");
                int i13 = i11;
                boolean z11 = z10;
                String strM23113W0 = AbstractC10793c0.m23113W0(iPAddress, Consts.DOT, null, 2, null);
                bArr[0] = 0;
                bArr[z11 ? 1 : 0] = (byte) m4786i(strM23113W0);
                int i14 = this.f5600k;
                bArr[2] = (byte) ((i14 >> 24) & 255);
                bArr[i13] = (byte) ((i14 >> 16) & 255);
                bArr[4] = (byte) ((i14 >> 8) & 255);
                bArr[5] = (byte) (i14 & 255);
                bArr[6] = (byte) i10;
                bArr[7] = (byte) i12;
                System.arraycopy(byteArray, 0, bArr, 8, byteArray.length);
                if (length <= 65000) {
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, length, InetAddress.getByName(this.f5601l), this.f5598i);
                    try {
                        Thread.sleep(10L);
                        DatagramSocket datagramSocket = this.f5596g;
                        if (datagramSocket != null) {
                            datagramSocket.send(datagramPacket);
                            C10786q c10786q = C10786q.f26013a;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        C10786q c10786q2 = C10786q.f26013a;
                    }
                }
                i12++;
                i11 = i13;
                z10 = z11 ? 1 : 0;
            }
            i10++;
        }
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m4782p(true);
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        m4782p(false);
        m4791t();
        MediaProjection mediaProjection = this.f5594e;
        if (mediaProjection != null) {
            AbstractC9979u.m20291d(mediaProjection);
            mediaProjection.stop();
            this.f5594e = null;
        }
        this.f5596g = null;
        super.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) throws SocketException {
        super.onStartCommand(intent, i10, i11);
        if (this.f5594e != null || intent == null) {
            return 2;
        }
        this.f5597h = (Intent) intent.getParcelableExtra("resultIntent");
        this.f5598i = intent.getIntExtra(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, 8782);
        if (this.f5597h == null) {
            stopSelf();
            return 2;
        }
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        this.f5596g = datagramSocket;
        datagramSocket.setReuseAddress(true);
        DatagramSocket datagramSocket2 = this.f5596g;
        if (datagramSocket2 != null) {
            datagramSocket2.bind(new InetSocketAddress(this.f5598i));
        }
        m4785h().setOnImageAvailableListener(this.f5607r, null);
        MediaProjectionManager mediaProjectionManagerM4787j = m4787j();
        Intent intent2 = this.f5597h;
        AbstractC9979u.m20291d(intent2);
        MediaProjection mediaProjection = mediaProjectionManagerM4787j.getMediaProjection(-1, intent2);
        this.f5594e = mediaProjection;
        if (mediaProjection != null) {
            mediaProjection.createVirtualDisplay("mainView", ScreenUtils.getScreenWidth(), ScreenUtils.getScreenHeight(), ScreenUtils.getScreenDensityDpi(), 19, m4785h().getSurface(), null, null);
        }
        m4790s();
        return 2;
    }

    /* renamed from: s */
    public final void m4790s() {
        this.f5604o = true;
    }

    /* renamed from: t */
    public final void m4791t() {
        this.f5604o = false;
    }
}
