package org.apache.commons.net.util;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public class ListenerList implements Serializable, Iterable<EventListener> {

    /* renamed from: c */
    public final CopyOnWriteArrayList f25432c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void m22267a(EventListener eventListener) {
        this.f25432c.add(eventListener);
    }

    /* renamed from: c */
    public int m22268c() {
        return this.f25432c.size();
    }

    @Override // java.lang.Iterable
    public Iterator<EventListener> iterator() {
        return this.f25432c.iterator();
    }
}
