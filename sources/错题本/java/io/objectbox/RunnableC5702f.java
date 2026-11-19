package io.objectbox;

import android.support.v4.media.AbstractC0037f;
import io.objectbox.exception.DbSchemaException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.greenrobot.essentials.collections.MultimapSet$SetType;
import p023b8.C3201a;
import p023b8.C3202b;
import p023b8.C3203c;
import p138p5.InterfaceC6393a;

/* renamed from: io.objectbox.f */
/* loaded from: classes3.dex */
public final class RunnableC5702f implements Runnable {

    /* renamed from: a */
    public final BoxStore f8966a;

    /* renamed from: b */
    public final C3203c f8967b = new C3203c(new HashMap(), MultimapSet$SetType.THREAD_SAFE);

    /* renamed from: c */
    public final ArrayDeque f8968c = new ArrayDeque();

    /* renamed from: d */
    public volatile boolean f8969d;

    public RunnableC5702f(BoxStore boxStore) {
        this.f8966a = boxStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        while (true) {
            try {
            } finally {
            }
            synchronized (this.f8968c) {
                int[] iArr = (int[]) this.f8968c.pollFirst();
                if (iArr == null) {
                    this.f8969d = false;
                    return;
                }
                for (int i : iArr) {
                    Collection collection = this.f8967b.get(Integer.valueOf(i));
                    if (collection != null && !collection.isEmpty()) {
                        C3202b c3202b = this.f8966a.f8902f;
                        long j7 = i;
                        C3201a c3201a = c3202b.f1735a[((((int) (j7 >>> 32)) ^ ((int) j7)) & Integer.MAX_VALUE) % c3202b.f1736b];
                        while (true) {
                            if (c3201a == null) {
                                obj = null;
                                break;
                            } else {
                                if (c3201a.f1732a == j7) {
                                    obj = c3201a.f1733b;
                                    break;
                                }
                                c3201a = c3201a.f1734c;
                            }
                        }
                        Class cls = (Class) obj;
                        if (cls == null) {
                            throw new DbSchemaException(AbstractC0037f.m81f(i, "No entity registered for type ID "));
                        }
                        try {
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC6393a) it.next()).m6040a(cls);
                            }
                        } catch (RuntimeException unused) {
                            RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
                            runtimeException.printStackTrace();
                            throw runtimeException;
                        }
                    }
                }
                this.f8969d = false;
            }
        }
    }
}
