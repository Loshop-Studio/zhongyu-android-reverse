package org.apache.commons.net;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;
import p212k.AbstractC9764r;

/* loaded from: classes6.dex */
public class ProtocolCommandSupport implements Serializable {

    /* renamed from: c */
    public final Object f25353c;

    /* renamed from: d */
    public final ListenerList f25354d = new ListenerList();

    public ProtocolCommandSupport(Object obj) {
        this.f25353c = obj;
    }

    /* renamed from: a */
    public void m22263a(String str, String str2) {
        new ProtocolCommandEvent(this.f25353c, str, str2);
        Iterator<EventListener> it = this.f25354d.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }

    /* renamed from: c */
    public void m22264c(int i10, String str) {
        new ProtocolCommandEvent(this.f25353c, i10, str);
        Iterator<EventListener> it = this.f25354d.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }

    /* renamed from: d */
    public int m22265d() {
        return this.f25354d.m22268c();
    }
}
