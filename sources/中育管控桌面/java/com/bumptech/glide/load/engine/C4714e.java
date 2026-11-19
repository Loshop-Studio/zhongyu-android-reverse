package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC4693e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p153t0.InterfaceC7719e;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C4714e {

    /* renamed from: a */
    public final Class f2416a;

    /* renamed from: b */
    public final List f2417b;

    /* renamed from: c */
    public final InterfaceC7719e f2418c;

    /* renamed from: d */
    public final Pools.Pool f2419d;

    /* renamed from: e */
    public final String f2420e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC6440j mo2651a(InterfaceC6440j interfaceC6440j);
    }

    public C4714e(Class cls, Class cls2, Class cls3, List list, InterfaceC7719e interfaceC7719e, Pools.Pool pool) {
        this.f2416a = cls;
        this.f2417b = list;
        this.f2418c = interfaceC7719e;
        this.f2419d = pool;
        this.f2420e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC6440j m2708a(InterfaceC4693e interfaceC4693e, int i6, int i7, C6285d c6285d, a aVar) {
        return this.f2418c.mo7679a(aVar.mo2651a(m2709b(interfaceC4693e, i6, i7, c6285d)), c6285d);
    }

    /* renamed from: b */
    public final InterfaceC6440j m2709b(InterfaceC4693e interfaceC4693e, int i6, int i7, C6285d c6285d) {
        List list = (List) AbstractC4408j.m1438d(this.f2419d.acquire());
        try {
            return m2710c(interfaceC4693e, i6, i7, c6285d, list);
        } finally {
            this.f2419d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC6440j m2710c(InterfaceC4693e interfaceC4693e, int i6, int i7, C6285d c6285d, List list) throws GlideException {
        int size = this.f2417b.size();
        InterfaceC6440j interfaceC6440jMo2796a = null;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC6286e interfaceC6286e = (InterfaceC6286e) this.f2417b.get(i8);
            try {
                if (interfaceC6286e.mo2797b(interfaceC4693e.mo2574a(), c6285d)) {
                    interfaceC6440jMo2796a = interfaceC6286e.mo2796a(interfaceC4693e.mo2574a(), i6, i7, c6285d);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC6286e);
                }
                list.add(e6);
            }
            if (interfaceC6440jMo2796a != null) {
                break;
            }
        }
        if (interfaceC6440jMo2796a != null) {
            return interfaceC6440jMo2796a;
        }
        throw new GlideException(this.f2420e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f2416a + ", decoders=" + this.f2417b + ", transcoder=" + this.f2418c + '}';
    }
}
