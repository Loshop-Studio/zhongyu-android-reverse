package p000a.p001a.p003e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p000a.p001a.p003e.p004f.AbstractC0010a;

/* renamed from: a.a.e.d */
/* loaded from: classes.dex */
public abstract class AbstractC0008d {

    /* renamed from: a */
    public Random f6a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f7b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f8c = new HashMap();

    /* renamed from: d */
    public final Map<String, c> f9d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f10e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, b<?>> f11f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f12g = new HashMap();

    /* renamed from: h */
    public final Bundle f13h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: a.a.e.d$a */
    public class a<I> extends AbstractC0007c<I> {

        /* renamed from: a */
        public final /* synthetic */ String f14a;

        public a(String str, int i, AbstractC0010a abstractC0010a) {
            this.f14a = str;
        }

        @Override // p000a.p001a.p003e.AbstractC0007c
        /* renamed from: a */
        public void mo4a() {
            AbstractC0008d.this.m7c(this.f14a);
        }
    }

    /* renamed from: a.a.e.d$b */
    public static class b<O> {

        /* renamed from: a */
        public final InterfaceC0006b<O> f16a;

        /* renamed from: b */
        public final AbstractC0010a<?, O> f17b;

        public b(InterfaceC0006b<O> interfaceC0006b, AbstractC0010a<?, O> abstractC0010a) {
            this.f16a = interfaceC0006b;
            this.f17b = abstractC0010a;
        }
    }

    /* renamed from: a.a.e.d$c */
    public static class c {
    }

    /* renamed from: a */
    public final boolean m5a(int i, int i2, Intent intent) {
        InterfaceC0006b<?> interfaceC0006b;
        String str = this.f7b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f10e.remove(str);
        b<?> bVar = this.f11f.get(str);
        if (bVar != null && (interfaceC0006b = bVar.f16a) != null) {
            interfaceC0006b.mo3a(bVar.f17b.mo9a(i2, intent));
            return true;
        }
        this.f12g.remove(str);
        this.f13h.putParcelable(str, new C0005a(i2, intent));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <I, O> AbstractC0007c<I> m6b(String str, AbstractC0010a<I, O> abstractC0010a, InterfaceC0006b<O> interfaceC0006b) {
        int iIntValue;
        Integer num = this.f8c.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iNextInt = this.f6a.nextInt(2147418112);
            while (true) {
                iIntValue = iNextInt + 65536;
                if (!this.f7b.containsKey(Integer.valueOf(iIntValue))) {
                    break;
                }
                iNextInt = this.f6a.nextInt(2147418112);
            }
            this.f7b.put(Integer.valueOf(iIntValue), str);
            this.f8c.put(str, Integer.valueOf(iIntValue));
        }
        this.f11f.put(str, new b<>(interfaceC0006b, abstractC0010a));
        if (this.f12g.containsKey(str)) {
            Object obj = this.f12g.get(str);
            this.f12g.remove(str);
            interfaceC0006b.mo3a(obj);
        }
        C0005a c0005a = (C0005a) this.f13h.getParcelable(str);
        if (c0005a != null) {
            this.f13h.remove(str);
            interfaceC0006b.mo3a(abstractC0010a.mo9a(c0005a.f4b, c0005a.f5c));
        }
        return new a(str, iIntValue, abstractC0010a);
    }

    /* renamed from: c */
    public final void m7c(String str) {
        Integer numRemove;
        if (!this.f10e.contains(str) && (numRemove = this.f8c.remove(str)) != null) {
            this.f7b.remove(numRemove);
        }
        this.f11f.remove(str);
        if (this.f12g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f12g.get(str));
            this.f12g.remove(str);
        }
        if (this.f13h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f13h.getParcelable(str));
            this.f13h.remove(str);
        }
        if (this.f9d.get(str) != null) {
            throw null;
        }
    }
}
