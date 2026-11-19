package anet.channel.strategy;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.net.InetAddress;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: anet.channel.strategy.b */
/* loaded from: classes.dex */
class RunnableC0934b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5378a;

    /* renamed from: b */
    final /* synthetic */ Object f5379b;

    /* renamed from: c */
    final /* synthetic */ C0933a f5380c;

    RunnableC0934b(C0933a c0933a, String str, Object obj) {
        this.f5380c = c0933a;
        this.f5378a = str;
        this.f5379b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                String hostAddress = InetAddress.getByName(this.f5378a).getHostAddress();
                LinkedList linkedList = new LinkedList();
                ConnProtocol connProtocol = StrategyTemplate.getInstance().getConnProtocol(this.f5378a);
                if (connProtocol != null) {
                    linkedList.add(IPConnStrategy.m4569a(hostAddress, !this.f5380c.m4604a(connProtocol) ? 80 : Constants.PORT, connProtocol, 0, 0, 1, 45000));
                }
                linkedList.add(IPConnStrategy.m4569a(hostAddress, 80, ConnProtocol.HTTP, 0, 0, 0, 0));
                linkedList.add(IPConnStrategy.m4569a(hostAddress, Constants.PORT, ConnProtocol.HTTPS, 0, 0, 0, 0));
                this.f5380c.f5376a.put(this.f5378a, linkedList);
                if (ALog.isPrintLog(1)) {
                    ALog.m4636d("awcn.LocalDnsStrategyTable", "resolve ip by local dns", null, Constants.KEY_HOST, this.f5378a, "ip", hostAddress, "list", linkedList);
                }
                synchronized (this.f5380c.f5377b) {
                    this.f5380c.f5377b.remove(this.f5378a);
                }
                synchronized (this.f5379b) {
                    this.f5379b.notifyAll();
                }
            } catch (Exception unused) {
                if (ALog.isPrintLog(1)) {
                    ALog.m4636d("awcn.LocalDnsStrategyTable", "resolve ip by local dns failed", null, Constants.KEY_HOST, this.f5378a);
                }
                this.f5380c.f5376a.put(this.f5378a, Collections.EMPTY_LIST);
                synchronized (this.f5380c.f5377b) {
                    this.f5380c.f5377b.remove(this.f5378a);
                    synchronized (this.f5379b) {
                        this.f5379b.notifyAll();
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.f5380c.f5377b) {
                this.f5380c.f5377b.remove(this.f5378a);
                synchronized (this.f5379b) {
                    this.f5379b.notifyAll();
                    throw th;
                }
            }
        }
    }
}
