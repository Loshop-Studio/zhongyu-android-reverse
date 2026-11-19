package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public class BindResolveClients {

    /* renamed from: b */
    public static final Object f11531b = new Object();

    /* renamed from: a */
    public ArrayList f11532a;

    /* renamed from: com.huawei.hms.common.internal.BindResolveClients$b */
    public static class C7268b {

        /* renamed from: a */
        public static final BindResolveClients f11533a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return C7268b.f11533a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (f11531b) {
            zContains = this.f11532a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (f11531b) {
            try {
                ListIterator listIterator = this.f11532a.listIterator();
                while (listIterator.hasNext()) {
                    ((ResolveClientBean) listIterator.next()).clientReconnect();
                }
                this.f11532a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f11531b) {
            try {
                if (!this.f11532a.contains(resolveClientBean)) {
                    this.f11532a.add(resolveClientBean);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f11531b) {
            try {
                if (this.f11532a.contains(resolveClientBean)) {
                    ListIterator listIterator = this.f11532a.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        } else if (resolveClientBean.equals(listIterator.next())) {
                            listIterator.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f11531b) {
            this.f11532a.clear();
        }
    }

    public BindResolveClients() {
        this.f11532a = new ArrayList();
    }
}
