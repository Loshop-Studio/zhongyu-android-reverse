package p116m5;

import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.Cursor;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: m5.e */
/* loaded from: classes3.dex */
public final class C6113e extends ThreadPoolExecutor {

    /* renamed from: a */
    public final BoxStore f9759a;

    public C6113e(BoxStore boxStore) {
        super(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC6112d());
        this.f9759a = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        Iterator it = this.f9759a.f8904h.values().iterator();
        while (it.hasNext()) {
            ThreadLocal threadLocal = ((C5696a) it.next()).f8925d;
            Cursor cursor = (Cursor) threadLocal.get();
            if (cursor != null) {
                cursor.close();
                cursor.getTx().close();
                threadLocal.remove();
            }
        }
    }
}
