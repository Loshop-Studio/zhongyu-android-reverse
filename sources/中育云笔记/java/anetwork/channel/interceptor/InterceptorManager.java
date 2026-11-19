package anetwork.channel.interceptor;

import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class InterceptorManager {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<Interceptor> f2914a = new CopyOnWriteArrayList<>();

    private InterceptorManager() {
    }

    public static void addInterceptor(Interceptor interceptor) {
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = f2914a;
        if (copyOnWriteArrayList.contains(interceptor)) {
            return;
        }
        copyOnWriteArrayList.add(interceptor);
        ALog.m2530i("anet.InterceptorManager", "[addInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }

    public static boolean contains(Interceptor interceptor) {
        return f2914a.contains(interceptor);
    }

    public static Interceptor getInterceptor(int i10) {
        return f2914a.get(i10);
    }

    public static int getSize() {
        return f2914a.size();
    }

    public static void removeInterceptor(Interceptor interceptor) {
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = f2914a;
        copyOnWriteArrayList.remove(interceptor);
        ALog.m2530i("anet.InterceptorManager", "[remoteInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }
}
