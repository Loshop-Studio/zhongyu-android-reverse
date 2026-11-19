package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C5489e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p132i0.InterfaceC8116e;
import p152k0.InterfaceC8259j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public class C5493i {

    /* renamed from: a */
    public final Class f3492a;

    /* renamed from: b */
    public final Pools.Pool f3493b;

    /* renamed from: c */
    public final List f3494c;

    /* renamed from: d */
    public final String f3495d;

    public C5493i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f3492a = cls;
        this.f3493b = pool;
        this.f3494c = (List) AbstractC7837i.m12255c(list);
        this.f3495d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC8259j m3226a(InterfaceC8116e interfaceC8116e, C8084d c8084d, int i9, int i10, C5489e.a aVar) {
        List list = (List) AbstractC7837i.m12256d(this.f3493b.acquire());
        try {
            return m3227b(interfaceC8116e, c8084d, i9, i10, aVar, list);
        } finally {
            this.f3493b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC8259j m3227b(InterfaceC8116e interfaceC8116e, C8084d c8084d, int i9, int i10, C5489e.a aVar, List list) throws GlideException {
        int size = this.f3494c.size();
        InterfaceC8259j interfaceC8259jM3180a = null;
        for (int i11 = 0; i11 < size; i11++) {
            try {
                interfaceC8259jM3180a = ((C5489e) this.f3494c.get(i11)).m3180a(interfaceC8116e, i9, i10, c8084d, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (interfaceC8259jM3180a != null) {
                break;
            }
        }
        if (interfaceC8259jM3180a != null) {
            return interfaceC8259jM3180a;
        }
        throw new GlideException(this.f3495d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3494c.toArray()) + '}';
    }
}
