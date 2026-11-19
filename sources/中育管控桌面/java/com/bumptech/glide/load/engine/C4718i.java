package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.engine.C4714e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p067h0.InterfaceC6440j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public class C4718i {

    /* renamed from: a */
    public final Class f2487a;

    /* renamed from: b */
    public final Pools.Pool f2488b;

    /* renamed from: c */
    public final List f2489c;

    /* renamed from: d */
    public final String f2490d;

    public C4718i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f2487a = cls;
        this.f2488b = pool;
        this.f2489c = (List) AbstractC4408j.m1437c(list);
        this.f2490d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC6440j m2754a(InterfaceC4693e interfaceC4693e, C6285d c6285d, int i6, int i7, C4714e.a aVar) {
        List list = (List) AbstractC4408j.m1438d(this.f2488b.acquire());
        try {
            return m2755b(interfaceC4693e, c6285d, i6, i7, aVar, list);
        } finally {
            this.f2488b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC6440j m2755b(InterfaceC4693e interfaceC4693e, C6285d c6285d, int i6, int i7, C4714e.a aVar, List list) throws GlideException {
        int size = this.f2489c.size();
        InterfaceC6440j interfaceC6440jM2708a = null;
        for (int i8 = 0; i8 < size; i8++) {
            try {
                interfaceC6440jM2708a = ((C4714e) this.f2489c.get(i8)).m2708a(interfaceC4693e, i6, i7, c6285d, aVar);
            } catch (GlideException e6) {
                list.add(e6);
            }
            if (interfaceC6440jM2708a != null) {
                break;
            }
        }
        if (interfaceC6440jM2708a != null) {
            return interfaceC6440jM2708a;
        }
        throw new GlideException(this.f2490d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2489c.toArray()) + '}';
    }
}
