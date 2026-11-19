package com.google.gson;

import com.google.gson.internal.C3845b;
import com.google.gson.internal.C3847d;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p063g1.AbstractC5558f1;
import p063g1.C5544b;
import p063g1.C5550d;
import p063g1.C5561h;
import p063g1.C5569l;
import p063g1.C5573n;
import p063g1.C5577p;
import p063g1.C5581r;
import p063g1.C5585t;
import p063g1.C5588u0;
import p063g1.C5592w0;
import p063g1.C5597z;
import p087j1.AbstractC5737f;
import p095k1.C5752a;
import p104l1.C6047b;

/* renamed from: com.google.gson.g */
/* loaded from: classes2.dex */
public final class C3841g {

    /* renamed from: m */
    public static final C3836b f2981m = C3836b.f2972d;

    /* renamed from: n */
    public static final FieldNamingPolicy f2982n = FieldNamingPolicy.IDENTITY;

    /* renamed from: o */
    public static final ToNumberPolicy f2983o = ToNumberPolicy.DOUBLE;

    /* renamed from: p */
    public static final ToNumberPolicy f2984p = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    /* renamed from: a */
    public final ThreadLocal f2985a;

    /* renamed from: b */
    public final ConcurrentHashMap f2986b;

    /* renamed from: c */
    public final C3845b f2987c;

    /* renamed from: d */
    public final C5569l f2988d;

    /* renamed from: e */
    public final List f2989e;

    /* renamed from: f */
    public final Map f2990f;

    /* renamed from: g */
    public final boolean f2991g;

    /* renamed from: h */
    public final boolean f2992h;

    /* renamed from: i */
    public final C3836b f2993i;

    /* renamed from: j */
    public final List f2994j;

    /* renamed from: k */
    public final List f2995k;

    /* renamed from: l */
    public final List f2996l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3841g() {
        C3847d c3847d = C3847d.f3027c;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(c3847d, f2982n, map, false, true, f2981m, false, true, longSerializationPolicy, list, list, list, f2983o, f2984p, list);
    }

    /* renamed from: a */
    public static void m2782a(double d9) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(d9 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2783b(java.io.Reader r9, p095k1.C5752a r10) {
        /*
            r8 = this;
            l1.a r0 = new l1.a
            r0.<init>(r9)
            com.google.gson.Strictness r9 = com.google.gson.Strictness.LEGACY_STRICT
            r0.m5736A(r9)
            java.lang.String r1 = "AssertionError (GSON 2.13.1): "
            java.lang.String r2 = "Type adapter '"
            com.google.gson.Strictness r3 = r0.f9611b
            if (r3 != r9) goto L17
            com.google.gson.Strictness r9 = com.google.gson.Strictness.LENIENT
            r0.m5736A(r9)
        L17:
            r0.m5764x()     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L8d
            r9 = 0
            com.google.gson.p r4 = r8.m2785d(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.Class r10 = r10.f9103a     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.Object r5 = r4.mo2779b(r0)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.Class r6 = com.google.gson.internal.AbstractC3848e.m2811l(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            if (r5 == 0) goto L67
            boolean r6 = r6.isInstance(r5)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            if (r6 == 0) goto L32
            goto L67
        L32:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            r7.append(r4)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.String r2 = "' returned wrong type; requested "
            r7.append(r2)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            r7.append(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.String r10 = " but got instance of "
            r7.append(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.Class r10 = r5.getClass()     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            r7.append(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.String r10 = "\nVerify that the adapter was registered for the correct type."
            r7.append(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            java.lang.String r10 = r7.toString()     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
            throw r6     // Catch: java.lang.Throwable -> L5d java.lang.AssertionError -> L5f java.io.IOException -> L61 java.lang.IllegalStateException -> L63 java.io.EOFException -> L65
        L5d:
            r9 = move-exception
            goto Lbf
        L5f:
            r9 = move-exception
            goto L6b
        L61:
            r9 = move-exception
            goto L81
        L63:
            r9 = move-exception
            goto L87
        L65:
            r10 = move-exception
            goto L8f
        L67:
            r0.m5736A(r3)
            goto L95
        L6b:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L5d
            r2.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            r10.<init>(r1, r9)     // Catch: java.lang.Throwable -> L5d
            throw r10     // Catch: java.lang.Throwable -> L5d
        L81:
            com.google.gson.JsonSyntaxException r10 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L5d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L5d
            throw r10     // Catch: java.lang.Throwable -> L5d
        L87:
            com.google.gson.JsonSyntaxException r10 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L5d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L5d
            throw r10     // Catch: java.lang.Throwable -> L5d
        L8d:
            r10 = move-exception
            r9 = 1
        L8f:
            if (r9 == 0) goto Lb9
            r0.m5736A(r3)
            r5 = 0
        L95:
            if (r5 == 0) goto Lb8
            com.google.gson.stream.JsonToken r9 = r0.m5764x()     // Catch: java.io.IOException -> La8 com.google.gson.stream.MalformedJsonException -> Laa
            com.google.gson.stream.JsonToken r10 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.io.IOException -> La8 com.google.gson.stream.MalformedJsonException -> Laa
            if (r9 != r10) goto La0
            goto Lb8
        La0:
            com.google.gson.JsonSyntaxException r9 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> La8 com.google.gson.stream.MalformedJsonException -> Laa
            java.lang.String r10 = "JSON document was not fully consumed."
            r9.<init>(r10)     // Catch: java.io.IOException -> La8 com.google.gson.stream.MalformedJsonException -> Laa
            throw r9     // Catch: java.io.IOException -> La8 com.google.gson.stream.MalformedJsonException -> Laa
        La8:
            r9 = move-exception
            goto Lac
        Laa:
            r9 = move-exception
            goto Lb2
        Lac:
            com.google.gson.JsonIOException r10 = new com.google.gson.JsonIOException
            r10.<init>(r9)
            throw r10
        Lb2:
            com.google.gson.JsonSyntaxException r10 = new com.google.gson.JsonSyntaxException
            r10.<init>(r9)
            throw r10
        Lb8:
            return r5
        Lb9:
            com.google.gson.JsonSyntaxException r9 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L5d
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5d
        Lbf:
            r0.m5736A(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C3841g.m2783b(java.io.Reader, k1.a):java.lang.Object");
    }

    /* renamed from: c */
    public final Object m2784c(String str, C5752a c5752a) {
        if (str == null) {
            return null;
        }
        return m2783b(new StringReader(str), c5752a);
    }

    /* renamed from: d */
    public final AbstractC3869p m2785d(C5752a c5752a) {
        boolean z8;
        ConcurrentHashMap concurrentHashMap = this.f2986b;
        AbstractC3869p abstractC3869p = (AbstractC3869p) concurrentHashMap.get(c5752a);
        if (abstractC3869p != null) {
            return abstractC3869p;
        }
        ThreadLocal threadLocal = this.f2985a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z8 = true;
        } else {
            AbstractC3869p abstractC3869p2 = (AbstractC3869p) map.get(c5752a);
            if (abstractC3869p2 != null) {
                return abstractC3869p2;
            }
            z8 = false;
        }
        try {
            C3840f c3840f = new C3840f();
            map.put(c5752a, c3840f);
            Iterator it = this.f2989e.iterator();
            AbstractC3869p abstractC3869pMo2798c = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC3869pMo2798c = ((InterfaceC3870q) it.next()).mo2798c(this, c5752a);
                if (abstractC3869pMo2798c != null) {
                    if (c3840f.f2980a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c3840f.f2980a = abstractC3869pMo2798c;
                    map.put(c5752a, abstractC3869pMo2798c);
                }
            }
            if (z8) {
                threadLocal.remove();
            }
            if (abstractC3869pMo2798c != null) {
                if (z8) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC3869pMo2798c;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + c5752a);
        } catch (Throwable th) {
            if (z8) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final C6047b m2786e(Writer writer) {
        C6047b c6047b = new C6047b(writer);
        c6047b.m5777m(this.f2993i);
        c6047b.f9636i = this.f2992h;
        c6047b.m5778n(Strictness.LEGACY_STRICT);
        c6047b.f9638k = this.f2991g;
        return c6047b;
    }

    /* renamed from: f */
    public final String m2787f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m2789h(m2786e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m2788g(obj, cls, m2786e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    /* renamed from: g */
    public final void m2788g(Object obj, Class cls, C6047b c6047b) {
        AbstractC3869p abstractC3869pM2785d = m2785d(new C5752a(cls));
        Strictness strictness = c6047b.f9635h;
        if (strictness == Strictness.LEGACY_STRICT) {
            c6047b.m5778n(Strictness.LENIENT);
        }
        boolean z8 = c6047b.f9636i;
        boolean z9 = c6047b.f9638k;
        c6047b.f9636i = this.f2992h;
        c6047b.f9638k = this.f2991g;
        try {
            try {
                abstractC3869pM2785d.mo2780c(c6047b, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e4.getMessage(), e4);
            }
        } finally {
            c6047b.m5778n(strictness);
            c6047b.f9636i = z8;
            c6047b.f9638k = z9;
        }
    }

    /* renamed from: h */
    public final void m2789h(C6047b c6047b) {
        C3864k c3864k = C3864k.f3056a;
        Strictness strictness = c6047b.f9635h;
        boolean z8 = c6047b.f9636i;
        boolean z9 = c6047b.f9638k;
        c6047b.f9636i = this.f2992h;
        c6047b.f9638k = this.f2991g;
        if (strictness == Strictness.LEGACY_STRICT) {
            c6047b.m5778n(Strictness.LENIENT);
        }
        try {
            try {
                AbstractC5558f1.f8608B.getClass();
                C5573n.m4907f(c6047b, c3864k);
                c6047b.m5778n(strictness);
                c6047b.f9636i = z8;
                c6047b.f9638k = z9;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            c6047b.m5778n(strictness);
            c6047b.f9636i = z8;
            c6047b.f9638k = z9;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f2991g + ",factories:" + this.f2989e + ",instanceCreators:" + this.f2987c + "}";
    }

    public C3841g(C3847d c3847d, InterfaceC3835a interfaceC3835a, Map map, boolean z8, boolean z9, C3836b c3836b, boolean z10, boolean z11, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, InterfaceC3867n interfaceC3867n, InterfaceC3867n interfaceC3867n2, List list4) {
        C5577p c5577p;
        AbstractC3869p c3838d;
        AbstractC3869p c3837c;
        AbstractC3869p c3837c2;
        C5577p c5577p2;
        this.f2985a = new ThreadLocal();
        this.f2986b = new ConcurrentHashMap();
        this.f2990f = map;
        C3845b c3845b = new C3845b(map, z11, list4);
        this.f2987c = c3845b;
        this.f2991g = z8;
        this.f2992h = z9;
        this.f2993i = c3836b;
        this.f2994j = list;
        this.f2995k = list2;
        this.f2996l = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC5558f1.f8609C);
        C5577p c5577p3 = C5585t.f8661c;
        int i = 1;
        if (interfaceC3867n == ToNumberPolicy.DOUBLE) {
            c5577p = C5585t.f8661c;
        } else {
            c5577p = new C5577p(interfaceC3867n, i);
        }
        arrayList.add(c5577p);
        arrayList.add(c3847d);
        arrayList.addAll(list3);
        arrayList.add(AbstractC5558f1.f8628r);
        arrayList.add(AbstractC5558f1.f8617g);
        arrayList.add(AbstractC5558f1.f8614d);
        arrayList.add(AbstractC5558f1.f8615e);
        arrayList.add(AbstractC5558f1.f8616f);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            c3838d = AbstractC5558f1.f8621k;
        } else {
            c3838d = new C3838d();
        }
        arrayList.add(new C5592w0(Long.TYPE, Long.class, c3838d));
        int i8 = 0;
        if (z10) {
            c3837c = AbstractC5558f1.f8623m;
        } else {
            c3837c = new C3837c(0);
        }
        arrayList.add(new C5592w0(Double.TYPE, Double.class, c3837c));
        if (z10) {
            c3837c2 = AbstractC5558f1.f8622l;
        } else {
            c3837c2 = new C3837c(1);
        }
        arrayList.add(new C5592w0(Float.TYPE, Float.class, c3837c2));
        C5577p c5577p4 = C5581r.f8658b;
        if (interfaceC3867n2 == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            c5577p2 = C5581r.f8658b;
        } else {
            c5577p2 = new C5577p(new C5581r(interfaceC3867n2), i8);
        }
        arrayList.add(c5577p2);
        arrayList.add(AbstractC5558f1.f8618h);
        arrayList.add(AbstractC5558f1.f8619i);
        arrayList.add(new C5588u0(AtomicLong.class, new C3839e(c3838d, 0).m2820a(), i8));
        arrayList.add(new C5588u0(AtomicLongArray.class, new C3839e(c3838d, 1).m2820a(), i8));
        arrayList.add(AbstractC5558f1.f8620j);
        arrayList.add(AbstractC5558f1.f8624n);
        arrayList.add(AbstractC5558f1.f8629s);
        arrayList.add(AbstractC5558f1.f8630t);
        arrayList.add(new C5588u0(BigDecimal.class, AbstractC5558f1.f8625o, i8));
        arrayList.add(new C5588u0(BigInteger.class, AbstractC5558f1.f8626p, i8));
        arrayList.add(new C5588u0(LazilyParsedNumber.class, AbstractC5558f1.f8627q, i8));
        arrayList.add(AbstractC5558f1.f8631u);
        arrayList.add(AbstractC5558f1.f8632v);
        arrayList.add(AbstractC5558f1.f8634x);
        arrayList.add(AbstractC5558f1.f8635y);
        arrayList.add(AbstractC5558f1.f8607A);
        arrayList.add(AbstractC5558f1.f8633w);
        arrayList.add(AbstractC5558f1.f8612b);
        arrayList.add(C5561h.f8639c);
        arrayList.add(AbstractC5558f1.f8636z);
        if (AbstractC5737f.f9072a) {
            arrayList.add(AbstractC5737f.f9076e);
            arrayList.add(AbstractC5737f.f9075d);
            arrayList.add(AbstractC5737f.f9077f);
        }
        arrayList.add(C5544b.f8599c);
        arrayList.add(AbstractC5558f1.f8611a);
        arrayList.add(new C5550d(c3845b, i8));
        arrayList.add(new C5550d(c3845b, i));
        C5569l c5569l = new C5569l(c3845b);
        this.f2988d = c5569l;
        arrayList.add(c5569l);
        arrayList.add(AbstractC5558f1.f8610D);
        arrayList.add(new C5597z(c3845b, interfaceC3835a, c3847d, c5569l, list4));
        this.f2989e = Collections.unmodifiableList(arrayList);
    }
}
