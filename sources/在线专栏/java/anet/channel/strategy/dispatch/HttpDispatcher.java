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

/* loaded from: classes.dex */
public class HttpDispatcher {

    /* renamed from: a */
    private CopyOnWriteArraySet<IDispatchEventListener> f5386a;

    /* renamed from: b */
    private C0938a f5387b;

    /* renamed from: c */
    private volatile boolean f5388c;

    /* renamed from: d */
    private Set<String> f5389d;

    /* renamed from: e */
    private Set<String> f5390e;

    /* renamed from: f */
    private AtomicBoolean f5391f;

    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* renamed from: anet.channel.strategy.dispatch.HttpDispatcher$a */
    private static class C0937a {

        /* renamed from: a */
        static HttpDispatcher f5392a = new HttpDispatcher();

        private C0937a() {
        }
    }

    /* renamed from: a */
    private void m4608a() {
        if (this.f5391f.get() || GlobalAppRuntimeInfo.getContext() == null || !this.f5391f.compareAndSet(false, true)) {
            return;
        }
        this.f5390e.add(DispatchConstants.getAmdcServerDomain());
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            this.f5390e.addAll(Arrays.asList(DispatchConstants.initHostArray));
        }
    }

    public static HttpDispatcher getInstance() {
        return C0937a.f5392a;
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f5390e.addAll(list);
            this.f5389d.clear();
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f5386a.add(iDispatchEventListener);
    }

    public synchronized Set<String> getInitHosts() {
        m4608a();
        return new HashSet(this.f5390e);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zContains = this.f5389d.contains(str);
        if (!zContains) {
            this.f5389d.add(str);
        }
        return !zContains;
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f5386a.remove(iDispatchEventListener);
    }

    public void sendAmdcRequest(Set<String> set, int i4) {
    }

    public void setEnable(boolean z3) {
        this.f5388c = z3;
    }

    public void switchENV() {
        this.f5389d.clear();
        this.f5390e.clear();
        this.f5391f.set(false);
    }

    private HttpDispatcher() {
        this.f5386a = new CopyOnWriteArraySet<>();
        this.f5387b = new C0938a();
        this.f5388c = true;
        this.f5389d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f5390e = new TreeSet();
        this.f5391f = new AtomicBoolean();
        m4608a();
    }
}
