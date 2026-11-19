package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C2876e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p081k.InterfaceC3844e;
import p093m.InterfaceC4361j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes2.dex */
public class C2880i {

    /* renamed from: a */
    public final Class f838a;

    /* renamed from: b */
    public final Pools.Pool f839b;

    /* renamed from: c */
    public final List f840c;

    /* renamed from: d */
    public final String f841d;

    public C2880i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f838a = cls;
        this.f839b = pool;
        this.f840c = (List) AbstractC3749i.m4767c(list);
        this.f841d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC4361j m1902a(InterfaceC3844e interfaceC3844e, C3794d c3794d, int i4, int i5, C2876e.a aVar) {
        List list = (List) AbstractC3749i.m4768d(this.f839b.acquire());
        try {
            return m1903b(interfaceC3844e, c3794d, i4, i5, aVar, list);
        } finally {
            this.f839b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC4361j m1903b(InterfaceC3844e interfaceC3844e, C3794d c3794d, int i4, int i5, C2876e.a aVar, List list) throws GlideException {
        int size = this.f840c.size();
        InterfaceC4361j interfaceC4361jM1855a = null;
        for (int i6 = 0; i6 < size; i6++) {
            try {
                interfaceC4361jM1855a = ((C2876e) this.f840c.get(i6)).m1855a(interfaceC3844e, i4, i5, c3794d, aVar);
            } catch (GlideException e4) {
                list.add(e4);
            }
            if (interfaceC4361jM1855a != null) {
                break;
            }
        }
        if (interfaceC4361jM1855a != null) {
            return interfaceC4361jM1855a;
        }
        throw new GlideException(this.f841d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f840c.toArray()) + '}';
    }
}
