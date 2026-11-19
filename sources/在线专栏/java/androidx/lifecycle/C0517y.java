package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public final class C0517y {

    /* renamed from: e */
    private static final Class[] f3456e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    final Map<String, Object> f3457a;

    /* renamed from: b */
    final Map<String, SavedStateRegistry.InterfaceC0648b> f3458b;

    /* renamed from: c */
    private final Map<String, Object> f3459c;

    /* renamed from: d */
    private final SavedStateRegistry.InterfaceC0648b f3460d;

    /* renamed from: androidx.lifecycle.y$a */
    class a implements SavedStateRegistry.InterfaceC0648b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0648b
        /* renamed from: a */
        public Bundle mo65a() {
            for (Map.Entry entry : new HashMap(C0517y.this.f3458b).entrySet()) {
                C0517y.this.m2920c((String) entry.getKey(), ((SavedStateRegistry.InterfaceC0648b) entry.getValue()).mo65a());
            }
            Set<String> setKeySet = C0517y.this.f3457a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : setKeySet) {
                arrayList.add(str);
                arrayList2.add(C0517y.this.f3457a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public C0517y(Map<String, Object> map) {
        this.f3458b = new HashMap();
        this.f3459c = new HashMap();
        this.f3460d = new a();
        this.f3457a = new HashMap(map);
    }

    /* renamed from: a */
    static C0517y m2917a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C0517y();
        }
        HashMap map = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C0517y(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
            map.put((String) parcelableArrayList.get(i4), parcelableArrayList2.get(i4));
        }
        return new C0517y(map);
    }

    /* renamed from: d */
    private static void m2918d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f3456e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    /* renamed from: b */
    SavedStateRegistry.InterfaceC0648b m2919b() {
        return this.f3460d;
    }

    /* renamed from: c */
    public <T> void m2920c(String str, T t3) {
        m2918d(t3);
        C0511s c0511s = (C0511s) this.f3459c.get(str);
        if (c0511s != null) {
            c0511s.setValue(t3);
        } else {
            this.f3457a.put(str, t3);
        }
    }

    public C0517y() {
        this.f3458b = new HashMap();
        this.f3459c = new HashMap();
        this.f3460d = new a();
        this.f3457a = new HashMap();
    }
}
