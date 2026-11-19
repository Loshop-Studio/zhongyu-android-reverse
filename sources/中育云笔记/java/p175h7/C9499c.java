package p175h7;

import com.lzy.okserver.task.PriorityBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p191i7.C9613c;

/* renamed from: h7.c */
/* loaded from: classes5.dex */
public class C9499c {

    /* renamed from: c */
    public static final TimeUnit f21972c = TimeUnit.HOURS;

    /* renamed from: a */
    public int f21973a = 3;

    /* renamed from: b */
    public C9613c f21974b;

    /* renamed from: a */
    public C9613c m18716a() {
        if (this.f21974b == null) {
            synchronized (C9499c.class) {
                try {
                    if (this.f21974b == null) {
                        this.f21974b = new C9613c(this.f21973a, 5, 1L, f21972c, new PriorityBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
                    }
                } finally {
                }
            }
        }
        return this.f21974b;
    }
}
