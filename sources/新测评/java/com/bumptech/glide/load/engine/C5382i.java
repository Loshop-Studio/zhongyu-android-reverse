package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.engine.C5378e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p184o0.InterfaceC8690j;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public class C5382i {

    /* renamed from: a */
    public final Class f3696a;

    /* renamed from: b */
    public final Pools.Pool f3697b;

    /* renamed from: c */
    public final List f3698c;

    /* renamed from: d */
    public final String f3699d;

    public C5382i(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f3696a = cls;
        this.f3697b = pool;
        this.f3698c = (List) AbstractC7651j.m12682c(list);
        this.f3699d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public InterfaceC8690j m3574a(InterfaceC5357e interfaceC5357e, C8539d c8539d, int i10, int i11, C5378e.a aVar) {
        List list = (List) AbstractC7651j.m12683d(this.f3697b.acquire());
        try {
            return m3575b(interfaceC5357e, c8539d, i10, i11, aVar, list);
        } finally {
            this.f3697b.release(list);
        }
    }

    /* renamed from: b */
    public final InterfaceC8690j m3575b(InterfaceC5357e interfaceC5357e, C8539d c8539d, int i10, int i11, C5378e.a aVar, List list) throws GlideException {
        int size = this.f3698c.size();
        InterfaceC8690j interfaceC8690jM3528a = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC8690jM3528a = ((C5378e) this.f3698c.get(i12)).m3528a(interfaceC5357e, i10, i11, c8539d, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (interfaceC8690jM3528a != null) {
                break;
            }
        }
        if (interfaceC8690jM3528a != null) {
            return interfaceC8690jM3528a;
        }
        throw new GlideException(this.f3699d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3698c.toArray()) + '}';
    }
}
