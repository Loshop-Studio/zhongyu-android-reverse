package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.tendcloud.tenddata.cr */
/* loaded from: classes5.dex */
public final class C7913cr {

    /* renamed from: a */
    private static volatile C7913cr f14627a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, Set<C7915ct>> f14628b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ThreadLocal<ConcurrentLinkedQueue<a>> f14629c = new ThreadLocal<ConcurrentLinkedQueue<a>>() { // from class: com.tendcloud.tenddata.cr.1
        @Override // java.lang.ThreadLocal
        public ConcurrentLinkedQueue<a> initialValue() {
            return new ConcurrentLinkedQueue<>();
        }
    };

    /* renamed from: d */
    private final ThreadLocal<Boolean> f14630d = new ThreadLocal<Boolean>() { // from class: com.tendcloud.tenddata.cr.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    /* renamed from: e */
    private final Map<Class<?>, Set<Class<?>>> f14631e = new HashMap();

    /* renamed from: com.tendcloud.tenddata.cr$a */
    public static class a {
        final Object event;
        final C7915ct handler;

        public a(Object obj, C7915ct c7915ct) {
            this.event = obj;
            this.handler = c7915ct;
        }
    }

    private C7913cr() {
    }

    /* renamed from: a */
    public static C7913cr m11625a() {
        if (f14627a == null) {
            synchronized (C7913cr.class) {
                try {
                    if (f14627a == null) {
                        f14627a = new C7913cr();
                    }
                } finally {
                }
            }
        }
        return f14627a;
    }

    /* renamed from: c */
    private Set<Class<?>> m11626c(Class<?> cls) {
        try {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void m11630b() {
        try {
            if (!this.f14630d.get().booleanValue()) {
                this.f14630d.set(Boolean.TRUE);
                while (true) {
                    a aVarPoll = this.f14629c.get().poll();
                    if (aVarPoll == null) {
                        break;
                    } else if (aVarPoll.handler.m11634a()) {
                        m11631b(aVarPoll.event, aVarPoll.handler);
                    }
                }
            }
        } finally {
            this.f14630d.set(Boolean.FALSE);
        }
    }

    public void post(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Iterator<Class<?>> it = m11629b(obj.getClass()).iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Set<C7915ct> setM11627a = m11627a(it.next());
                if (setM11627a != null && !setM11627a.isEmpty()) {
                    Iterator<C7915ct> it2 = setM11627a.iterator();
                    while (it2.hasNext()) {
                        m11628a(obj, it2.next());
                    }
                    z10 = true;
                }
            }
            if (!z10 && !(obj instanceof C7916cu)) {
                post(new C7916cu(this, obj));
            }
            m11630b();
        } catch (Throwable unused) {
        }
    }

    public void register(Object obj) {
        Set<C7915ct> setPutIfAbsent;
        if (obj == null) {
            return;
        }
        try {
            Map<Class<?>, Set<C7915ct>> mapM11632a = C7914cs.m11632a(obj);
            for (Class<?> cls : mapM11632a.keySet()) {
                Set<C7915ct> copyOnWriteArraySet = this.f14628b.get(cls);
                if (copyOnWriteArraySet == null && (setPutIfAbsent = this.f14628b.putIfAbsent(cls, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                    copyOnWriteArraySet = setPutIfAbsent;
                }
                if (!copyOnWriteArraySet.addAll(mapM11632a.get(cls))) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void unregister(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            for (Map.Entry<Class<?>, Set<C7915ct>> entry : C7914cs.m11632a(obj).entrySet()) {
                Set<C7915ct> setM11627a = m11627a(entry.getKey());
                Set<C7915ct> value = entry.getValue();
                if (setM11627a != null && setM11627a.containsAll(value)) {
                    for (C7915ct c7915ct : setM11627a) {
                        if (value.contains(c7915ct)) {
                            c7915ct.m11635b();
                        }
                    }
                    setM11627a.removeAll(value);
                }
                return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m11628a(Object obj, C7915ct c7915ct) {
        try {
            this.f14629c.get().offer(new a(obj, c7915ct));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public Set<C7915ct> m11627a(Class<?> cls) {
        try {
            return this.f14628b.get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void m11631b(Object obj, C7915ct c7915ct) {
        try {
            c7915ct.handleEvent(obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public Set<Class<?>> m11629b(Class<?> cls) {
        try {
            Set<Class<?>> set = this.f14631e.get(cls);
            if (set != null) {
                return set;
            }
            Set<Class<?>> setM11626c = m11626c(cls);
            this.f14631e.put(cls, setM11626c);
            return setM11626c;
        } catch (Throwable unused) {
            return null;
        }
    }
}
