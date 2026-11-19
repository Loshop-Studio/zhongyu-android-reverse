package anetwork.channel.interceptor;

import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class InterceptorManager {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<Interceptor> f5636a = new CopyOnWriteArrayList<>();

    private InterceptorManager() {
    }

    public static void addInterceptor(Interceptor interceptor) {
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = f5636a;
        if (copyOnWriteArrayList.contains(interceptor)) {
            return;
        }
        copyOnWriteArrayList.add(interceptor);
        ALog.m4639i("anet.InterceptorManager", "[addInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }

    public static boolean contains(Interceptor interceptor) {
        return f5636a.contains(interceptor);
    }

    public static Interceptor getInterceptor(int i4) {
        return f5636a.get(i4);
    }

    public static int getSize() {
        return f5636a.size();
    }

    public static void removeInterceptor(Interceptor interceptor) {
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = f5636a;
        copyOnWriteArrayList.remove(interceptor);
        ALog.m4639i("anet.InterceptorManager", "[remoteInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }
}
