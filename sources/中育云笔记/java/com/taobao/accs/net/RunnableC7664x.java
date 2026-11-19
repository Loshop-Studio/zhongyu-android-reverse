package com.taobao.accs.net;

import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.x */
/* loaded from: classes5.dex */
class RunnableC7664x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f13158a;

    /* renamed from: b */
    final /* synthetic */ boolean f13159b;

    /* renamed from: c */
    final /* synthetic */ C7663w f13160c;

    public RunnableC7664x(C7663w c7663w, Message message, boolean z10) {
        this.f13160c = c7663w;
        this.f13158a = message;
        this.f13159b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f13160c.f13147t) {
            try {
                this.f13160c.m10076a(this.f13158a);
                if (this.f13160c.f13147t.size() == 0) {
                    this.f13160c.f13147t.add(this.f13158a);
                } else {
                    Message message = (Message) this.f13160c.f13147t.getFirst();
                    if (this.f13158a.m9901a() == 1 || this.f13158a.m9901a() == 0) {
                        this.f13160c.f13147t.addLast(this.f13158a);
                        if (message.m9901a() == 2) {
                            this.f13160c.f13147t.removeFirst();
                        }
                    } else if (this.f13158a.m9901a() != 2 || message.m9901a() != 2) {
                        this.f13160c.f13147t.addLast(this.f13158a);
                    } else if (!message.f12946d && this.f13158a.f12946d) {
                        this.f13160c.f13147t.removeFirst();
                        this.f13160c.f13147t.addFirst(this.f13158a);
                    }
                }
                if (this.f13159b || this.f13160c.f13146s == 3) {
                    try {
                        this.f13160c.f13147t.notifyAll();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
