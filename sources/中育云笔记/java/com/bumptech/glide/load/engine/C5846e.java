package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5825e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p368v0.InterfaceC11407e;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5846e {

    /* renamed from: a */
    public final Class f4828a;

    /* renamed from: b */
    public final List f4829b;

    /* renamed from: c */
    public final InterfaceC11407e f4830c;

    /* renamed from: d */
    public final Pools.Pool f4831d;

    /* renamed from: e */
    public final String f4832e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC9657j mo4121a(InterfaceC9657j interfaceC9657j);
    }

    public C5846e(Class cls, Class cls2, Class cls3, List list, InterfaceC11407e interfaceC11407e, Pools.Pool pool) {
        this.f4828a = cls;
        this.f4829b = list;
        this.f4830c = interfaceC11407e;
        this.f4831d = pool;
        this.f4832e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC9657j m4178a(InterfaceC5825e interfaceC5825e, int i10, int i11, C9438e c9438e, a aVar) {
        return this.f4830c.mo25360a(aVar.mo4121a(m4179b(interfaceC5825e, i10, i11, c9438e)), c9438e);
    }

    /* renamed from: b */
    public final InterfaceC9657j m4179b(InterfaceC5825e interfaceC5825e, int i10, int i11, C9438e c9438e) {
        List list = (List) AbstractC8909j.m17468d(this.f4831d.acquire());
        try {
            return m4180c(interfaceC5825e, i10, i11, c9438e, list);
        } finally {
            this.f4831d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC9657j m4180c(InterfaceC5825e interfaceC5825e, int i10, int i11, C9438e c9438e, List list) throws GlideException {
        int size = this.f4829b.size();
        InterfaceC9657j interfaceC9657jMo4266b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC9439f interfaceC9439f = (InterfaceC9439f) this.f4829b.get(i12);
            try {
                if (interfaceC9439f.mo4265a(interfaceC5825e.mo4046a(), c9438e)) {
                    interfaceC9657jMo4266b = interfaceC9439f.mo4266b(interfaceC5825e.mo4046a(), i10, i11, c9438e);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC9439f);
                }
                list.add(e10);
            }
            if (interfaceC9657jMo4266b != null) {
                break;
            }
        }
        if (interfaceC9657jMo4266b != null) {
            return interfaceC9657jMo4266b;
        }
        throw new GlideException(this.f4832e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f4828a + ", decoders=" + this.f4829b + ", transcoder=" + this.f4830c + '}';
    }
}
