package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p081k.InterfaceC3844e;
import p093m.InterfaceC4361j;
import p142y.InterfaceC4679e;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes2.dex */
public class C2876e {

    /* renamed from: a */
    public final Class f768a;

    /* renamed from: b */
    public final List f769b;

    /* renamed from: c */
    public final InterfaceC4679e f770c;

    /* renamed from: d */
    public final Pools.Pool f771d;

    /* renamed from: e */
    public final String f772e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC4361j mo1797a(InterfaceC4361j interfaceC4361j);
    }

    public C2876e(Class cls, Class cls2, Class cls3, List list, InterfaceC4679e interfaceC4679e, Pools.Pool pool) {
        this.f768a = cls;
        this.f769b = list;
        this.f770c = interfaceC4679e;
        this.f771d = pool;
        this.f772e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC4361j m1855a(InterfaceC3844e interfaceC3844e, int i4, int i5, C3794d c3794d, a aVar) {
        return this.f770c.mo6605a(aVar.mo1797a(m1856b(interfaceC3844e, i4, i5, c3794d)), c3794d);
    }

    /* renamed from: b */
    public final InterfaceC4361j m1856b(InterfaceC3844e interfaceC3844e, int i4, int i5, C3794d c3794d) {
        List list = (List) AbstractC3749i.m4768d(this.f771d.acquire());
        try {
            return m1857c(interfaceC3844e, i4, i5, c3794d, list);
        } finally {
            this.f771d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC4361j m1857c(InterfaceC3844e interfaceC3844e, int i4, int i5, C3794d c3794d, List list) throws GlideException {
        int size = this.f769b.size();
        InterfaceC4361j interfaceC4361jMo1966b = null;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC3795e interfaceC3795e = (InterfaceC3795e) this.f769b.get(i6);
            try {
                if (interfaceC3795e.mo1965a(interfaceC3844e.mo5127a(), c3794d)) {
                    interfaceC4361jMo1966b = interfaceC3795e.mo1966b(interfaceC3844e.mo5127a(), i4, i5, c3794d);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(interfaceC3795e);
                }
                list.add(e4);
            }
            if (interfaceC4361jMo1966b != null) {
                break;
            }
        }
        if (interfaceC4361jMo1966b != null) {
            return interfaceC4361jMo1966b;
        }
        throw new GlideException(this.f772e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f768a + ", decoders=" + this.f769b + ", transcoder=" + this.f770c + '}';
    }
}
