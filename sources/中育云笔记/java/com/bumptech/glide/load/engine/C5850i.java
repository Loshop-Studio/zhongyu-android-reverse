package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.engine.C5846e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p198j0.InterfaceC9657j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public class C5850i {

    /* renamed from: a */
    public final Class f4899a;

    /* renamed from: b */
    public final Pools.Pool f4900b;

    /* renamed from: c */
    public final List f4901c;

    /* renamed from: d */
    public final String f4902d;

    public C5850i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f4899a = cls;
        this.f4900b = pool;
        this.f4901c = (List) AbstractC8909j.m17467c(list);
        this.f4902d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC9657j m4224a(InterfaceC5825e interfaceC5825e, C9438e c9438e, int i10, int i11, C5846e.a aVar) {
        List list = (List) AbstractC8909j.m17468d(this.f4900b.acquire());
        try {
            return m4225b(interfaceC5825e, c9438e, i10, i11, aVar, list);
        } finally {
            this.f4900b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC9657j m4225b(InterfaceC5825e interfaceC5825e, C9438e c9438e, int i10, int i11, C5846e.a aVar, List list) throws GlideException {
        int size = this.f4901c.size();
        InterfaceC9657j interfaceC9657jM4178a = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC9657jM4178a = ((C5846e) this.f4901c.get(i12)).m4178a(interfaceC5825e, i10, i11, c9438e, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (interfaceC9657jM4178a != null) {
                break;
            }
        }
        if (interfaceC9657jM4178a != null) {
            return interfaceC9657jM4178a;
        }
        throw new GlideException(this.f4902d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4901c.toArray()) + '}';
    }
}
