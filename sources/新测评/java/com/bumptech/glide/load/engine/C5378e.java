package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5357e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p003a1.InterfaceC0012e;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5378e {

    /* renamed from: a */
    public final Class f3625a;

    /* renamed from: b */
    public final List f3626b;

    /* renamed from: c */
    public final InterfaceC0012e f3627c;

    /* renamed from: d */
    public final Pools.Pool f3628d;

    /* renamed from: e */
    public final String f3629e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* renamed from: a */
        InterfaceC8690j mo3471a(InterfaceC8690j interfaceC8690j);
    }

    public C5378e(Class cls, Class cls2, Class cls3, List list, InterfaceC0012e interfaceC0012e, Pools.Pool pool) {
        this.f3625a = cls;
        this.f3626b = list;
        this.f3627c = interfaceC0012e;
        this.f3628d = pool;
        this.f3629e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC8690j m3528a(InterfaceC5357e interfaceC5357e, int i10, int i11, C8539d c8539d, a aVar) {
        return this.f3627c.mo16a(aVar.mo3471a(m3529b(interfaceC5357e, i10, i11, c8539d)), c8539d);
    }

    /* renamed from: b */
    public final InterfaceC8690j m3529b(InterfaceC5357e interfaceC5357e, int i10, int i11, C8539d c8539d) {
        List list = (List) AbstractC7651j.m12683d(this.f3628d.acquire());
        try {
            return m3530c(interfaceC5357e, i10, i11, c8539d, list);
        } finally {
            this.f3628d.release(list);
        }
    }

    /* renamed from: c */
    public final InterfaceC8690j m3530c(InterfaceC5357e interfaceC5357e, int i10, int i11, C8539d c8539d, List list) throws GlideException {
        int size = this.f3626b.size();
        InterfaceC8690j interfaceC8690jMo3617b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC8540e interfaceC8540e = (InterfaceC8540e) this.f3626b.get(i12);
            try {
                if (interfaceC8540e.mo3616a(interfaceC5357e.mo3393a(), c8539d)) {
                    interfaceC8690jMo3617b = interfaceC8540e.mo3617b(interfaceC5357e.mo3393a(), i10, i11, c8539d);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC8540e);
                }
                list.add(e10);
            }
            if (interfaceC8690jMo3617b != null) {
                break;
            }
        }
        if (interfaceC8690jMo3617b != null) {
            return interfaceC8690jMo3617b;
        }
        throw new GlideException(this.f3629e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3625a + ", decoders=" + this.f3626b + ", transcoder=" + this.f3627c + '}';
    }
}
