package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class HttpDispatcher {

    /* renamed from: a */
    private CopyOnWriteArraySet<IDispatchEventListener> f2664a;

    /* renamed from: b */
    private C5061a f2665b;

    /* renamed from: c */
    private volatile boolean f2666c;

    /* renamed from: d */
    private Set<String> f2667d;

    /* renamed from: e */
    private Set<String> f2668e;

    /* renamed from: f */
    private AtomicBoolean f2669f;

    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* renamed from: anet.channel.strategy.dispatch.HttpDispatcher$a */
    public static class C5060a {

        /* renamed from: a */
        static HttpDispatcher f2670a = new HttpDispatcher();

        private C5060a() {
        }
    }

    /* renamed from: a */
    private void m2499a() {
        if (this.f2669f.get() || GlobalAppRuntimeInfo.getContext() == null || !this.f2669f.compareAndSet(false, true)) {
            return;
        }
        this.f2668e.add(DispatchConstants.getAmdcServerDomain());
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            this.f2668e.addAll(Arrays.asList(DispatchConstants.initHostArray));
        }
    }

    public static HttpDispatcher getInstance() {
        return C5060a.f2670a;
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f2668e.addAll(list);
            this.f2667d.clear();
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f2664a.add(iDispatchEventListener);
    }

    public synchronized Set<String> getInitHosts() {
        m2499a();
        return new HashSet(this.f2668e);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zContains = this.f2667d.contains(str);
        if (!zContains) {
            this.f2667d.add(str);
        }
        return !zContains;
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f2664a.remove(iDispatchEventListener);
    }

    public void sendAmdcRequest(Set<String> set, int i10) {
    }

    public void setEnable(boolean z10) {
        this.f2666c = z10;
    }

    public void switchENV() {
        this.f2667d.clear();
        this.f2668e.clear();
        this.f2669f.set(false);
    }

    private HttpDispatcher() {
        this.f2664a = new CopyOnWriteArraySet<>();
        this.f2665b = new C5061a();
        this.f2666c = true;
        this.f2667d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f2668e = new TreeSet();
        this.f2669f = new AtomicBoolean();
        m2499a();
    }
}
