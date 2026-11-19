package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.dn */
/* loaded from: classes5.dex */
public class C7936dn {

    /* renamed from: a */
    private int f14727a;

    /* renamed from: b */
    private long f14728b;

    /* renamed from: c */
    private List<C7933dk> f14729c;

    /* renamed from: d */
    private Map<String, C7933dk> f14730d;

    /* renamed from: a */
    public int m11736a() {
        return this.f14727a;
    }

    /* renamed from: b */
    public long m11738b() {
        return this.f14728b;
    }

    /* renamed from: c */
    public List<C7933dk> m11739c() {
        return this.f14729c;
    }

    /* renamed from: d */
    public C7936dn m11740d() {
        C7936dn c7936dn = new C7936dn();
        c7936dn.setTimestamp(this.f14727a);
        c7936dn.setPoiId(this.f14728b);
        LinkedList linkedList = new LinkedList();
        Iterator<C7933dk> it = this.f14729c.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m11723f());
        }
        c7936dn.setBsslist(linkedList);
        return c7936dn;
    }

    public void setBsslist(List<C7933dk> list) {
        this.f14729c = list;
    }

    public void setPoiId(long j10) {
        this.f14728b = j10;
    }

    public void setTimestamp(int i10) {
        this.f14727a = i10;
    }

    /* renamed from: a */
    public Map<String, C7933dk> m11737a(boolean z10) {
        if (this.f14730d == null || z10) {
            this.f14730d = new HashMap();
            for (C7933dk c7933dk : this.f14729c) {
                this.f14730d.put(c7933dk.m11719b(), c7933dk);
            }
        }
        return this.f14730d;
    }
}
