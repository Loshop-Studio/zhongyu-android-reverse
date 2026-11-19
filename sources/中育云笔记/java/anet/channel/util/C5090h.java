package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.util.h */
/* loaded from: classes3.dex */
public class C5090h {

    /* renamed from: a */
    private static Map<String, Integer> f2766a;

    static {
        HashMap map = new HashMap();
        f2766a = map;
        map.put("tpatch", 3);
        f2766a.put("so", 3);
        f2766a.put("json", 3);
        f2766a.put("html", 4);
        f2766a.put("htm", 4);
        f2766a.put("css", 5);
        f2766a.put("js", 5);
        f2766a.put("webp", 6);
        f2766a.put("png", 6);
        f2766a.put("jpg", 6);
        f2766a.put("do", 6);
        f2766a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f2766a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f2766a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    /* renamed from: a */
    public static int m2553a(Request request) {
        Integer num;
        if (request == null) {
            throw new NullPointerException("url is null!");
        }
        if (request.getHeaders().containsKey(HttpConstant.X_PV)) {
            return 1;
        }
        String strTrySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
        if (strTrySolveFileExtFromUrlPath == null || (num = f2766a.get(strTrySolveFileExtFromUrlPath)) == null) {
            return 6;
        }
        return num.intValue();
    }
}
