package com.friday.common.helper;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.common.helper.C5965e;
import com.taobao.accs.utl.UtilityImpl;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p186i2.C9568a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.C10792c;
import p429z1.AbstractC11958b;

/* renamed from: com.friday.common.helper.e */
/* loaded from: classes3.dex */
public final class C5965e {

    /* renamed from: k */
    public static final a f6091k = new a(null);

    /* renamed from: l */
    public static final int f6092l = 8;

    /* renamed from: m */
    public static volatile C5965e f6093m;

    /* renamed from: a */
    public Thread f6094a;

    /* renamed from: b */
    public b f6095b;

    /* renamed from: c */
    public byte[] f6096c;

    /* renamed from: d */
    public String f6097d;

    /* renamed from: e */
    public int f6098e;

    /* renamed from: f */
    public Handler f6099f;

    /* renamed from: g */
    public String f6100g;

    /* renamed from: h */
    public final InterfaceC10773d f6101h;

    /* renamed from: i */
    public volatile int f6102i;

    /* renamed from: j */
    public boolean f6103j;

    /* renamed from: com.friday.common.helper.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C5965e m5353a() {
            if (C5965e.f6093m == null) {
                synchronized (AbstractC9983y.m20315b(C5965e.class)) {
                    try {
                        if (C5965e.f6093m == null) {
                            C5965e.f6093m = new C5965e(null);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C5965e c5965e = C5965e.f6093m;
            AbstractC9979u.m20291d(c5965e);
            return c5965e;
        }

        public a() {
        }
    }

    /* renamed from: com.friday.common.helper.e$b */
    public interface b {
        /* renamed from: a */
        void mo5354a(C9568a c9568a);
    }

    /* renamed from: com.friday.common.helper.e$c */
    public static final class c extends CountDownTimer {
        public c() {
            super(3000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (C5965e.this.f6102i == 20) {
                AbstractC11958b.m26588i("网络不佳，请重启平板的wifi后再试");
                cancel();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public /* synthetic */ C5965e(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: k */
    public static final boolean m5344k(C5965e c5965e, Message it) {
        AbstractC9979u.m20294g(it, "it");
        if (it.what == 100) {
            Bundle data = it.getData();
            AbstractC9979u.m20293f(data, "getData(...)");
            String string = data.getString("CODE");
            String string2 = data.getString("IP");
            b bVar = c5965e.f6095b;
            if (bVar != null) {
                bVar.mo5354a(new C9568a(string, string2, true));
            }
        }
        return true;
    }

    /* renamed from: l */
    public static final c m5345l(C5965e c5965e) {
        return c5965e.new c();
    }

    /* renamed from: n */
    public static final void m5346n(C5965e c5965e) throws IOException {
        Object systemService = Utils.getApp().getApplicationContext().getSystemService(UtilityImpl.NET_TYPE_WIFI);
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) systemService).createMulticastLock("CloudNote");
        DatagramSocket datagramSocket = null;
        while (c5965e.f6102i > 0 && !c5965e.f6103j) {
            try {
                DatagramSocket datagramSocket2 = new DatagramSocket((SocketAddress) null);
                try {
                    datagramSocket2.setReuseAddress(true);
                    datagramSocket2.bind(new InetSocketAddress(c5965e.f6098e));
                    c5965e.f6102i--;
                    byte[] bArr = c5965e.f6096c;
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
                    if (multicastLockCreateMulticastLock != null) {
                        multicastLockCreateMulticastLock.acquire();
                    }
                    datagramSocket2.receive(datagramPacket);
                    if (multicastLockCreateMulticastLock != null && multicastLockCreateMulticastLock.isHeld()) {
                        multicastLockCreateMulticastLock.release();
                    }
                    byte[] data = datagramPacket.getData();
                    AbstractC9979u.m20293f(data, "getData(...)");
                    String str = new String(data, C10792c.f26019b);
                    AbstractC11958b.m26582c("收到udp消息：" + str);
                    if (!StringUtils.isEmpty(str)) {
                        List listM23091I0 = AbstractC10793c0.m23091I0(str, new String[]{"::"}, false, 0, 6, null);
                        if (!listM23091I0.isEmpty() && listM23091I0.size() == 2) {
                            String str2 = (String) listM23091I0.get(0);
                            if (RegexUtils.isIP(str2)) {
                                String str3 = (String) listM23091I0.get(1);
                                if (!StringUtils.isEmpty(str3) && str3.length() >= 4) {
                                    String strSubstring = str3.substring(0, 4);
                                    AbstractC9979u.m20293f(strSubstring, "substring(...)");
                                    if (AbstractC9979u.m20289b(strSubstring, c5965e.f6100g)) {
                                        if (c5965e.f6103j) {
                                            if (datagramSocket2.isClosed()) {
                                                return;
                                            }
                                            datagramSocket2.close();
                                            return;
                                        }
                                        Message messageObtain = Message.obtain();
                                        messageObtain.what = 100;
                                        Bundle bundle = new Bundle();
                                        C5962b.f6082a.m5299a().m5265C(str2);
                                        bundle.putString("IP", str2);
                                        bundle.putString("CODE", strSubstring);
                                        messageObtain.setData(bundle);
                                        c5965e.f6099f.sendMessage(messageObtain);
                                        if (!datagramSocket2.isClosed()) {
                                            datagramSocket2.close();
                                        }
                                        c5965e.m5348h().cancel();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (c5965e.f6102i == 0) {
                        if (!datagramSocket2.isClosed()) {
                            datagramSocket2.close();
                        }
                        if (!c5965e.f6103j) {
                            b bVar = c5965e.f6095b;
                            if (bVar != null) {
                                bVar.mo5354a(new C9568a(null, null, false));
                            }
                            c5965e.m5348h().cancel();
                        }
                    }
                    datagramSocket = datagramSocket2;
                } catch (Exception e10) {
                    e = e10;
                    datagramSocket = datagramSocket2;
                    if (multicastLockCreateMulticastLock != null && multicastLockCreateMulticastLock.isHeld()) {
                        multicastLockCreateMulticastLock.release();
                    }
                    if (!c5965e.f6103j) {
                        b bVar2 = c5965e.f6095b;
                        if (bVar2 != null) {
                            bVar2.mo5354a(new C9568a(null, null, false));
                        }
                        c5965e.m5348h().cancel();
                    }
                    if (datagramSocket != null && !datagramSocket.isClosed()) {
                        datagramSocket.close();
                    }
                    e.printStackTrace();
                    return;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    /* renamed from: g */
    public final void m5347g() {
        this.f6102i = 0;
        this.f6103j = true;
        b bVar = this.f6095b;
        if (bVar != null) {
            bVar.mo5354a(new C9568a(null, null, false));
        }
        m5348h().cancel();
        Thread thread = this.f6094a;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        try {
            thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: h */
    public final c m5348h() {
        return (c) this.f6101h.getValue();
    }

    /* renamed from: i */
    public final void m5349i(String str) {
        m5350j("", 33338, str);
    }

    /* renamed from: j */
    public final void m5350j(String str, int i10, String str2) {
        this.f6100g = str2;
        this.f6097d = str;
        this.f6098e = i10;
        m5351m();
    }

    /* renamed from: m */
    public final synchronized void m5351m() {
        this.f6102i = 20;
        this.f6103j = false;
        m5348h().cancel();
        m5348h().start();
        Thread thread = new Thread(new Runnable() { // from class: f2.n
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                C5965e.m5346n(this.f21428c);
            }
        });
        this.f6094a = thread;
        thread.start();
    }

    /* renamed from: o */
    public final void m5352o(b onReceiveListener) {
        AbstractC9979u.m20294g(onReceiveListener, "onReceiveListener");
        this.f6095b = onReceiveListener;
    }

    public C5965e() {
        this.f6096c = new byte[35];
        this.f6099f = new Handler(new Handler.Callback() { // from class: f2.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return C5965e.m5344k(this.f21426c, message);
            }
        });
        this.f6101h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: f2.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C5965e.m5345l(this.f21427c);
            }
        });
    }
}
