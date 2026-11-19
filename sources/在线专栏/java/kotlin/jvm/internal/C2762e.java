package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C2714b0;
import kotlin.collections.C2716c0;
import kotlin.collections.C2730l;
import kotlin.collections.C2731m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019c3.InterfaceC1086c;
import p082e3.C2496v;
import p128o2.C2918k;
import p128o2.C2922o;
import p128o2.InterfaceC2910c;
import p167w2.C3428a;
import p171x2.InterfaceC3459a;
import p171x2.InterfaceC3460b;
import p171x2.InterfaceC3461c;
import p171x2.InterfaceC3462d;
import p171x2.InterfaceC3463e;
import p171x2.InterfaceC3464f;
import p171x2.InterfaceC3465g;
import p171x2.InterfaceC3466h;
import p171x2.InterfaceC3467i;
import p171x2.InterfaceC3468j;
import p171x2.InterfaceC3469k;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3471m;
import p171x2.InterfaceC3472n;
import p171x2.InterfaceC3473o;
import p171x2.InterfaceC3474p;
import p171x2.InterfaceC3475q;
import p171x2.InterfaceC3476r;
import p171x2.InterfaceC3477s;
import p171x2.InterfaceC3478t;
import p171x2.InterfaceC3479u;
import p171x2.InterfaceC3480v;
import p171x2.InterfaceC3481w;

/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes.dex */
public final class C2762e implements InterfaceC1086c<Object>, InterfaceC2761d {

    /* renamed from: b */
    @NotNull
    public static final a f10722b = new a(null);

    /* renamed from: c */
    @NotNull
    private static final Map<Class<? extends InterfaceC2910c<?>>, Integer> f10723c;

    /* renamed from: d */
    @NotNull
    private static final HashMap<String, String> f10724d;

    /* renamed from: e */
    @NotNull
    private static final HashMap<String, String> f10725e;

    /* renamed from: f */
    @NotNull
    private static final HashMap<String, String> f10726f;

    /* renamed from: g */
    @NotNull
    private static final Map<String, String> f10727g;

    /* renamed from: a */
    @NotNull
    private final Class<?> f10728a;

    /* renamed from: kotlin.jvm.internal.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i4 = 0;
        List listM9142i = C2730l.m9142i(InterfaceC3459a.class, InterfaceC3470l.class, InterfaceC3474p.class, InterfaceC3475q.class, InterfaceC3476r.class, InterfaceC3477s.class, InterfaceC3478t.class, InterfaceC3479u.class, InterfaceC3480v.class, InterfaceC3481w.class, InterfaceC3460b.class, InterfaceC3461c.class, InterfaceC3462d.class, InterfaceC3463e.class, InterfaceC3464f.class, InterfaceC3465g.class, InterfaceC3466h.class, InterfaceC3467i.class, InterfaceC3468j.class, InterfaceC3469k.class, InterfaceC3471m.class, InterfaceC3472n.class, InterfaceC3473o.class);
        ArrayList arrayList = new ArrayList(C2731m.m9149p(listM9142i, 10));
        for (Object obj : listM9142i) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C2730l.m9148o();
            }
            arrayList.add(C2922o.m9996a((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f10723c = C2716c0.m9057g(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f10724d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f10725e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        C2769l.m9240d(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C2769l.m9240d(kotlinName, "kotlinName");
            sb.append(C2496v.m8356B0(kotlinName, '.', null, 2, null));
            sb.append("CompanionObject");
            C2918k c2918kM9996a = C2922o.m9996a(sb.toString(), C2769l.m9248l(kotlinName, ".Companion"));
            map3.put(c2918kM9996a.m9987c(), c2918kM9996a.m9988d());
        }
        for (Map.Entry<Class<? extends InterfaceC2910c<?>>, Integer> entry : f10723c.entrySet()) {
            map3.put(entry.getKey().getName(), C2769l.m9248l("kotlin.Function", Integer.valueOf(entry.getValue().intValue())));
        }
        f10726f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2714b0.m9050a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C2496v.m8356B0((String) entry2.getValue(), '.', null, 2, null));
        }
        f10727g = linkedHashMap;
    }

    public C2762e(@NotNull Class<?> jClass) {
        C2769l.m9241e(jClass, "jClass");
        this.f10728a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC2761d
    @NotNull
    /* renamed from: a */
    public Class<?> mo9231a() {
        return this.f10728a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C2762e) && C2769l.m9237a(C3428a.m10445a(this), C3428a.m10445a((InterfaceC1086c) obj));
    }

    public int hashCode() {
        return C3428a.m10445a(this).hashCode();
    }

    @NotNull
    public String toString() {
        return C2769l.m9248l(mo9231a().toString(), " (Kotlin reflection is not available)");
    }
}
