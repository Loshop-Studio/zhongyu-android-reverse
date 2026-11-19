package p163g7;

import android.os.Environment;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p115d7.C9003e;
import p146f7.AbstractC9203b;
import p175h7.C9499c;
import p175h7.RunnableC9498b;

/* renamed from: g7.a */
/* loaded from: classes5.dex */
public class C9275a {

    /* renamed from: a */
    public String f21615a;

    /* renamed from: b */
    public C9499c f21616b;

    /* renamed from: c */
    public ConcurrentHashMap f21617c;

    /* renamed from: g7.a$b */
    public static class b {

        /* renamed from: a */
        public static final C9275a f21618a = new C9275a();
    }

    /* renamed from: b */
    public static C9275a m18263b() {
        return b.f21618a;
    }

    /* renamed from: f */
    public static RunnableC9498b m18264f(String str, Request request) {
        Map mapM18268d = m18263b().m18268d();
        RunnableC9498b runnableC9498b = (RunnableC9498b) mapM18268d.get(str);
        if (runnableC9498b != null) {
            return runnableC9498b;
        }
        RunnableC9498b runnableC9498b2 = new RunnableC9498b(str, request);
        mapM18268d.put(str, runnableC9498b2);
        return runnableC9498b2;
    }

    /* renamed from: g */
    public static RunnableC9498b m18265g(Progress progress) {
        Map mapM18268d = m18263b().m18268d();
        RunnableC9498b runnableC9498b = (RunnableC9498b) mapM18268d.get(progress.f12697c);
        if (runnableC9498b != null) {
            return runnableC9498b;
        }
        RunnableC9498b runnableC9498b2 = new RunnableC9498b(progress);
        mapM18268d.put(progress.f12697c, runnableC9498b2);
        return runnableC9498b2;
    }

    /* renamed from: a */
    public String m18266a() {
        return this.f21615a;
    }

    /* renamed from: c */
    public RunnableC9498b m18267c(String str) {
        return (RunnableC9498b) this.f21617c.get(str);
    }

    /* renamed from: d */
    public Map m18268d() {
        return this.f21617c;
    }

    /* renamed from: e */
    public C9499c m18269e() {
        return this.f21616b;
    }

    public C9275a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb2.append(str);
        sb2.append("download");
        sb2.append(str);
        String string = sb2.toString();
        this.f21615a = string;
        AbstractC9203b.m18104c(string);
        this.f21616b = new C9499c();
        this.f21617c = new ConcurrentHashMap();
        List<Progress> listM17587m = C9003e.m17584n().m17587m();
        for (Progress progress : listM17587m) {
            int i10 = progress.f12706l;
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                progress.f12706l = 0;
            }
        }
        C9003e.m17584n().m17580i(listM17587m);
    }
}
