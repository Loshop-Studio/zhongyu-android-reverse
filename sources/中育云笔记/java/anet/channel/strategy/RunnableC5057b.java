package anet.channel.strategy;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.net.InetAddress;
import java.util.Collections;
import java.util.LinkedList;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.strategy.b */
/* loaded from: classes3.dex */
class RunnableC5057b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2656a;

    /* renamed from: b */
    final /* synthetic */ Object f2657b;

    /* renamed from: c */
    final /* synthetic */ C5056a f2658c;

    public RunnableC5057b(C5056a c5056a, String str, Object obj) {
        this.f2658c = c5056a;
        this.f2656a = str;
        this.f2657b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                String hostAddress = InetAddress.getByName(this.f2656a).getHostAddress();
                LinkedList linkedList = new LinkedList();
                ConnProtocol connProtocol = StrategyTemplate.getInstance().getConnProtocol(this.f2656a);
                if (connProtocol != null) {
                    linkedList.add(IPConnStrategy.m2460a(hostAddress, !this.f2658c.m2495a(connProtocol) ? 80 : 443, connProtocol, 0, 0, 1, 45000));
                }
                linkedList.add(IPConnStrategy.m2460a(hostAddress, 80, ConnProtocol.HTTP, 0, 0, 0, 0));
                linkedList.add(IPConnStrategy.m2460a(hostAddress, 443, ConnProtocol.HTTPS, 0, 0, 0, 0));
                this.f2658c.f2654a.put(this.f2656a, linkedList);
                if (ALog.isPrintLog(1)) {
                    ALog.m2527d("awcn.LocalDnsStrategyTable", "resolve ip by local dns", null, Constants.KEY_HOST, this.f2656a, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, hostAddress, "list", linkedList);
                }
                synchronized (this.f2658c.f2655b) {
                    this.f2658c.f2655b.remove(this.f2656a);
                }
                synchronized (this.f2657b) {
                    this.f2657b.notifyAll();
                }
            } catch (Exception unused) {
                if (ALog.isPrintLog(1)) {
                    ALog.m2527d("awcn.LocalDnsStrategyTable", "resolve ip by local dns failed", null, Constants.KEY_HOST, this.f2656a);
                }
                this.f2658c.f2654a.put(this.f2656a, Collections.EMPTY_LIST);
                synchronized (this.f2658c.f2655b) {
                    this.f2658c.f2655b.remove(this.f2656a);
                    synchronized (this.f2657b) {
                        this.f2657b.notifyAll();
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.f2658c.f2655b) {
                this.f2658c.f2655b.remove(this.f2656a);
                synchronized (this.f2657b) {
                    this.f2657b.notifyAll();
                    throw th;
                }
            }
        }
    }
}
