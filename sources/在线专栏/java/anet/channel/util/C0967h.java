package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: anet.channel.util.h */
/* loaded from: classes.dex */
public class C0967h {

    /* renamed from: a */
    private static Map<String, Integer> f5488a;

    static {
        HashMap map = new HashMap();
        f5488a = map;
        map.put("tpatch", 3);
        f5488a.put("so", 3);
        f5488a.put("json", 3);
        f5488a.put("html", 4);
        f5488a.put("htm", 4);
        f5488a.put("css", 5);
        f5488a.put("js", 5);
        f5488a.put("webp", 6);
        f5488a.put("png", 6);
        f5488a.put("jpg", 6);
        f5488a.put("do", 6);
        f5488a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f5488a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f5488a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    /* renamed from: a */
    public static int m4662a(Request request) {
        Integer num;
        Objects.requireNonNull(request, "url is null!");
        if (request.getHeaders().containsKey(HttpConstant.X_PV)) {
            return 1;
        }
        String strTrySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
        if (strTrySolveFileExtFromUrlPath == null || (num = f5488a.get(strTrySolveFileExtFromUrlPath)) == null) {
            return 6;
        }
        return num.intValue();
    }
}
