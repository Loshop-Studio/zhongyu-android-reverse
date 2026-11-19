package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.engine.C5427e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p182n.InterfaceC9357j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public class C5431i {

    /* renamed from: a */
    public final Class f3129a;

    /* renamed from: b */
    public final Pools.Pool f3130b;

    /* renamed from: c */
    public final List f3131c;

    /* renamed from: d */
    public final String f3132d;

    public C5431i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f3129a = cls;
        this.f3130b = pool;
        this.f3131c = (List) AbstractC8706j.m14180c(list);
        this.f3132d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC9357j m3020a(InterfaceC5406e interfaceC5406e, C9230d c9230d, int i10, int i11, C5427e.a aVar) {
        List list = (List) AbstractC8706j.m14181d(this.f3130b.acquire());
        try {
            return m3021b(interfaceC5406e, c9230d, i10, i11, aVar, list);
        } finally {
            this.f3130b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC9357j m3021b(InterfaceC5406e interfaceC5406e, C9230d c9230d, int i10, int i11, C5427e.a aVar, List list) throws GlideException {
        int size = this.f3131c.size();
        InterfaceC9357j interfaceC9357jM2974a = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC9357jM2974a = ((C5427e) this.f3131c.get(i12)).m2974a(interfaceC5406e, i10, i11, c9230d, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (interfaceC9357jM2974a != null) {
                break;
            }
        }
        if (interfaceC9357jM2974a != null) {
            return interfaceC9357jM2974a;
        }
        throw new GlideException(this.f3132d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3131c.toArray()) + '}';
    }
}
