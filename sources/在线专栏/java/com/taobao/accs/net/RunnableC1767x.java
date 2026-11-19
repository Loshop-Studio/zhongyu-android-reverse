package com.taobao.accs.net;

import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.x */
/* loaded from: classes.dex */
class RunnableC1767x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f7760a;

    /* renamed from: b */
    final /* synthetic */ boolean f7761b;

    /* renamed from: c */
    final /* synthetic */ C1766w f7762c;

    RunnableC1767x(C1766w c1766w, Message message, boolean z3) {
        this.f7762c = c1766w;
        this.f7760a = message;
        this.f7761b = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f7762c.f7749t) {
            this.f7762c.m6050a(this.f7760a);
            if (this.f7762c.f7749t.size() == 0) {
                this.f7762c.f7749t.add(this.f7760a);
            } else {
                Message message = (Message) this.f7762c.f7749t.getFirst();
                if (this.f7760a.m5875a() == 1 || this.f7760a.m5875a() == 0) {
                    this.f7762c.f7749t.addLast(this.f7760a);
                    if (message.m5875a() == 2) {
                        this.f7762c.f7749t.removeFirst();
                    }
                } else if (this.f7760a.m5875a() != 2 || message.m5875a() != 2) {
                    this.f7762c.f7749t.addLast(this.f7760a);
                } else if (!message.f7548d && this.f7760a.f7548d) {
                    this.f7762c.f7749t.removeFirst();
                    this.f7762c.f7749t.addFirst(this.f7760a);
                }
            }
            if (this.f7761b || this.f7762c.f7748s == 3) {
                try {
                    this.f7762c.f7749t.notifyAll();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
