package p329s1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p340t1.C11201b;

/* renamed from: s1.h */
/* loaded from: classes3.dex */
public final class C11041h {

    /* renamed from: a */
    public final AtomicInteger f26643a = new AtomicInteger(0);

    /* renamed from: b */
    public final String f26644b;

    /* renamed from: c */
    public final List f26645c;

    /* renamed from: d */
    public final InterfaceC11035b f26646d;

    /* renamed from: e */
    public final C11036c f26647e;

    /* renamed from: f */
    public volatile C11038e f26648f;

    /* renamed from: s1.h$a */
    public static final class a extends Handler implements InterfaceC11035b {

        /* renamed from: a */
        public final String f26649a;

        /* renamed from: b */
        public final List f26650b;

        public a(String str, List list) {
            super(Looper.getMainLooper());
            this.f26649a = str;
            this.f26650b = list;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator it = this.f26650b.iterator();
            while (it.hasNext()) {
                ((InterfaceC11035b) it.next()).onCacheAvailable((File) message.obj, this.f26649a, message.arg1);
            }
        }

        @Override // p329s1.InterfaceC11035b
        public void onCacheAvailable(File file, String str, int i10) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i10;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }
    }

    public C11041h(String str, C11036c c11036c) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f26645c = copyOnWriteArrayList;
        this.f26644b = (String) AbstractC11045l.m24467d(str);
        this.f26647e = (C11036c) AbstractC11045l.m24467d(c11036c);
        this.f26646d = new a(str, copyOnWriteArrayList);
    }

    /* renamed from: a */
    public final synchronized void m24439a() {
        if (this.f26643a.decrementAndGet() <= 0) {
            this.f26648f.m24480m();
            this.f26648f = null;
        }
    }

    /* renamed from: b */
    public int m24440b() {
        return this.f26643a.get();
    }

    /* renamed from: c */
    public final C11038e m24441c() {
        String str = this.f26644b;
        C11036c c11036c = this.f26647e;
        C11038e c11038e = new C11038e(new C11042i(str, c11036c.f26611d, c11036c.f26612e, c11036c.f26613f, c11036c.f26614g), new C11201b(this.f26647e.m24389a(this.f26644b), this.f26647e.f26610c));
        c11038e.m24398t(this.f26646d);
        return c11038e;
    }

    /* renamed from: d */
    public void m24442d(C11037d c11037d, Socket socket) {
        m24445g();
        try {
            this.f26643a.incrementAndGet();
            this.f26648f.m24397s(c11037d, socket);
        } finally {
            m24439a();
        }
    }

    /* renamed from: e */
    public void m24443e(InterfaceC11035b interfaceC11035b) {
        this.f26645c.add(interfaceC11035b);
    }

    /* renamed from: f */
    public void m24444f() {
        this.f26645c.clear();
        if (this.f26648f != null) {
            this.f26648f.m24398t(null);
            this.f26648f.m24480m();
            this.f26648f = null;
        }
        this.f26643a.set(0);
    }

    /* renamed from: g */
    public final synchronized void m24445g() {
        try {
            this.f26648f = this.f26648f == null ? m24441c() : this.f26648f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public void m24446h(InterfaceC11035b interfaceC11035b) {
        this.f26645c.remove(interfaceC11035b);
    }
}
