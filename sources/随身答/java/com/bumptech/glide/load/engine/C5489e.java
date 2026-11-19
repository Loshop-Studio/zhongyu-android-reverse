package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p132i0.InterfaceC8116e;
import p152k0.InterfaceC8259j;
import p278w0.InterfaceC9793e;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5489e {

    /* renamed from: a */
    public final Class f3422a;

    /* renamed from: b */
    public final List f3423b;

    /* renamed from: c */
    public final InterfaceC9793e f3424c;

    /* renamed from: d */
    public final Pools.Pool f3425d;

    /* renamed from: e */
    public final String f3426e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC8259j mo3122a(InterfaceC8259j interfaceC8259j);
    }

    public C5489e(Class cls, Class cls2, Class cls3, List list, InterfaceC9793e interfaceC9793e, Pools.Pool pool) {
        this.f3422a = cls;
        this.f3423b = list;
        this.f3424c = interfaceC9793e;
        this.f3425d = pool;
        this.f3426e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC8259j m3180a(InterfaceC8116e interfaceC8116e, int i9, int i10, C8084d c8084d, a aVar) {
        return this.f3424c.mo16593a(aVar.mo3122a(m3181b(interfaceC8116e, i9, i10, c8084d)), c8084d);
    }

    /* renamed from: b */
    public final InterfaceC8259j m3181b(InterfaceC8116e interfaceC8116e, int i9, int i10, C8084d c8084d) {
        List list = (List) AbstractC7837i.m12256d(this.f3425d.acquire());
        try {
            return m3182c(interfaceC8116e, i9, i10, c8084d, list);
        } finally {
            this.f3425d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC8259j m3182c(InterfaceC8116e interfaceC8116e, int i9, int i10, C8084d c8084d, List list) throws GlideException {
        int size = this.f3423b.size();
        InterfaceC8259j interfaceC8259jMo3290b = null;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC8085e interfaceC8085e = (InterfaceC8085e) this.f3423b.get(i11);
            try {
                if (interfaceC8085e.mo3289a(interfaceC8116e.mo12991a(), c8084d)) {
                    interfaceC8259jMo3290b = interfaceC8085e.mo3290b(interfaceC8116e.mo12991a(), i9, i10, c8084d);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC8085e);
                }
                list.add(e10);
            }
            if (interfaceC8259jMo3290b != null) {
                break;
            }
        }
        if (interfaceC8259jMo3290b != null) {
            return interfaceC8259jMo3290b;
        }
        throw new GlideException(this.f3426e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3422a + ", decoders=" + this.f3423b + ", transcoder=" + this.f3424c + '}';
    }
}
