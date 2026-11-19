package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.AbstractC0001b;
import p000a.p001a.InterfaceC0000a;
import p000a.p001a.p003e.AbstractC0007c;
import p000a.p001a.p003e.C0005a;
import p000a.p001a.p003e.InterfaceC0006b;
import p000a.p001a.p003e.p004f.AbstractC0010a;
import p000a.p031h.p039f.C0217a;
import p000a.p052k.p053b.AbstractC0319l0;
import p000a.p052k.p053b.C0333s0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p057m.AbstractC0355d;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0301c0 {

    /* renamed from: A */
    public boolean f1795A;

    /* renamed from: B */
    public boolean f1796B;

    /* renamed from: C */
    public boolean f1797C;

    /* renamed from: D */
    public boolean f1798D;

    /* renamed from: E */
    public boolean f1799E;

    /* renamed from: F */
    public ArrayList<C0294a> f1800F;

    /* renamed from: G */
    public ArrayList<Boolean> f1801G;

    /* renamed from: H */
    public ArrayList<ComponentCallbacksC0320m> f1802H;

    /* renamed from: I */
    public ArrayList<n> f1803I;

    /* renamed from: J */
    public C0307f0 f1804J;

    /* renamed from: b */
    public boolean f1807b;

    /* renamed from: d */
    public ArrayList<C0294a> f1809d;

    /* renamed from: e */
    public ArrayList<ComponentCallbacksC0320m> f1810e;

    /* renamed from: g */
    public OnBackPressedDispatcher f1812g;

    /* renamed from: q */
    public AbstractC0346z<?> f1822q;

    /* renamed from: r */
    public AbstractC0338v f1823r;

    /* renamed from: s */
    public ComponentCallbacksC0320m f1824s;

    /* renamed from: t */
    public ComponentCallbacksC0320m f1825t;

    /* renamed from: w */
    public AbstractC0007c<Intent> f1828w;

    /* renamed from: x */
    public AbstractC0007c<Object> f1829x;

    /* renamed from: y */
    public AbstractC0007c<String[]> f1830y;

    /* renamed from: a */
    public final ArrayList<l> f1806a = new ArrayList<>();

    /* renamed from: c */
    public final C0317k0 f1808c = new C0317k0();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0295a0 f1811f = new LayoutInflaterFactory2C0295a0(this);

    /* renamed from: h */
    public final AbstractC0001b f1813h = new c(false);

    /* renamed from: i */
    public final AtomicInteger f1814i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, Bundle> f1815j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Object> f1816k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public Map<ComponentCallbacksC0320m, HashSet<C0217a>> f1817l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final C0333s0.a f1818m = new d();

    /* renamed from: n */
    public final C0298b0 f1819n = new C0298b0(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<InterfaceC0309g0> f1820o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public int f1821p = -1;

    /* renamed from: u */
    public C0344y f1826u = new e();

    /* renamed from: v */
    public InterfaceC0296a1 f1827v = new f(this);

    /* renamed from: z */
    public ArrayDeque<k> f1831z = new ArrayDeque<>();

    /* renamed from: K */
    public Runnable f1805K = new g();

    /* renamed from: a.k.b.c0$a */
    public class a implements InterfaceC0006b<C0005a> {
        public a() {
        }

        @Override // p000a.p001a.p003e.InterfaceC0006b
        /* renamed from: a */
        public void mo3a(C0005a c0005a) {
            StringBuilder sb;
            C0005a c0005a2 = c0005a;
            k kVarPollFirst = AbstractC0301c0.this.f1831z.pollFirst();
            if (kVarPollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = kVarPollFirst.f1840b;
                int i = kVarPollFirst.f1841c;
                ComponentCallbacksC0320m componentCallbacksC0320mM1105e = AbstractC0301c0.this.f1808c.m1105e(str);
                if (componentCallbacksC0320mM1105e != null) {
                    componentCallbacksC0320mM1105e.m1137H(i, c0005a2.f4b, c0005a2.f5c);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: a.k.b.c0$b */
    public class b implements InterfaceC0006b<Map<String, Boolean>> {
        public b() {
        }

        @Override // p000a.p001a.p003e.InterfaceC0006b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo3a(Map<String, Boolean> map) {
            String strM2076d;
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            k kVarPollFirst = AbstractC0301c0.this.f1831z.pollFirst();
            if (kVarPollFirst == null) {
                strM2076d = "No permissions were requested for " + this;
            } else {
                String str = kVarPollFirst.f1840b;
                ComponentCallbacksC0320m componentCallbacksC0320mM1105e = AbstractC0301c0.this.f1808c.m1105e(str);
                if (componentCallbacksC0320mM1105e != null) {
                    componentCallbacksC0320mM1105e.m1152a0();
                    return;
                }
                strM2076d = C0561a.m2076d("Permission request result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", strM2076d);
        }
    }

    /* renamed from: a.k.b.c0$c */
    public class c extends AbstractC0001b {
        public c(boolean z) {
            super(z);
        }

        @Override // p000a.p001a.AbstractC0001b
        /* renamed from: a */
        public void mo0a() {
            AbstractC0301c0 abstractC0301c0 = AbstractC0301c0.this;
            abstractC0301c0.m1008C(true);
            if (abstractC0301c0.f1813h.f0a) {
                abstractC0301c0.m1027W();
            } else {
                abstractC0301c0.f1812g.m1558a();
            }
        }
    }

    /* renamed from: a.k.b.c0$d */
    public class d implements C0333s0.a {
        public d() {
        }

        /* renamed from: a */
        public void m1067a(ComponentCallbacksC0320m componentCallbacksC0320m, C0217a c0217a) throws Resources.NotFoundException {
            boolean z;
            synchronized (c0217a) {
                z = c0217a.f1480a;
            }
            if (z) {
                return;
            }
            AbstractC0301c0 abstractC0301c0 = AbstractC0301c0.this;
            HashSet<C0217a> hashSet = abstractC0301c0.f1817l.get(componentCallbacksC0320m);
            if (hashSet != null && hashSet.remove(c0217a) && hashSet.isEmpty()) {
                abstractC0301c0.f1817l.remove(componentCallbacksC0320m);
                if (componentCallbacksC0320m.f1977b < 5) {
                    abstractC0301c0.m1047i(componentCallbacksC0320m);
                    abstractC0301c0.m1024T(componentCallbacksC0320m, abstractC0301c0.f1821p);
                }
            }
        }

        /* renamed from: b */
        public void m1068b(ComponentCallbacksC0320m componentCallbacksC0320m, C0217a c0217a) {
            AbstractC0301c0 abstractC0301c0 = AbstractC0301c0.this;
            if (abstractC0301c0.f1817l.get(componentCallbacksC0320m) == null) {
                abstractC0301c0.f1817l.put(componentCallbacksC0320m, new HashSet<>());
            }
            abstractC0301c0.f1817l.get(componentCallbacksC0320m).add(c0217a);
        }
    }

    /* renamed from: a.k.b.c0$e */
    public class e extends C0344y {
        public e() {
        }

        @Override // p000a.p052k.p053b.C0344y
        /* renamed from: a */
        public ComponentCallbacksC0320m mo1069a(ClassLoader classLoader, String str) {
            AbstractC0346z<?> abstractC0346z = AbstractC0301c0.this.f1822q;
            Context context = abstractC0346z.f2122c;
            Objects.requireNonNull(abstractC0346z);
            Object obj = ComponentCallbacksC0320m.f1956U;
            try {
                return C0344y.m1247c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (InstantiationException e3) {
                throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
            } catch (NoSuchMethodException e4) {
                throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
            } catch (InvocationTargetException e5) {
                throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
            }
        }
    }

    /* renamed from: a.k.b.c0$f */
    public class f implements InterfaceC0296a1 {
        public f(AbstractC0301c0 abstractC0301c0) {
        }
    }

    /* renamed from: a.k.b.c0$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0301c0.this.m1008C(true);
        }
    }

    /* renamed from: a.k.b.c0$h */
    public class h implements InterfaceC0309g0 {

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacksC0320m f1838b;

        public h(AbstractC0301c0 abstractC0301c0, ComponentCallbacksC0320m componentCallbacksC0320m) {
            this.f1838b = componentCallbacksC0320m;
        }

        @Override // p000a.p052k.p053b.InterfaceC0309g0
        /* renamed from: b */
        public void mo1070b(AbstractC0301c0 abstractC0301c0, ComponentCallbacksC0320m componentCallbacksC0320m) {
            this.f1838b.m1139K();
        }
    }

    /* renamed from: a.k.b.c0$i */
    public class i implements InterfaceC0006b<C0005a> {
        public i() {
        }

        @Override // p000a.p001a.p003e.InterfaceC0006b
        /* renamed from: a */
        public void mo3a(C0005a c0005a) {
            StringBuilder sb;
            C0005a c0005a2 = c0005a;
            k kVarPollFirst = AbstractC0301c0.this.f1831z.pollFirst();
            if (kVarPollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = kVarPollFirst.f1840b;
                int i = kVarPollFirst.f1841c;
                ComponentCallbacksC0320m componentCallbacksC0320mM1105e = AbstractC0301c0.this.f1808c.m1105e(str);
                if (componentCallbacksC0320mM1105e != null) {
                    componentCallbacksC0320mM1105e.m1137H(i, c0005a2.f4b, c0005a2.f5c);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: a.k.b.c0$j */
    public static class j extends AbstractC0010a<Object, C0005a> {
        @Override // p000a.p001a.p003e.p004f.AbstractC0010a
        /* renamed from: a */
        public C0005a mo9a(int i, Intent intent) {
            return new C0005a(i, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: a.k.b.c0$k */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: b */
        public String f1840b;

        /* renamed from: c */
        public int f1841c;

        /* renamed from: a.k.b.c0$k$a */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcel parcel) {
            this.f1840b = parcel.readString();
            this.f1841c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1840b);
            parcel.writeInt(this.f1841c);
        }
    }

    /* renamed from: a.k.b.c0$l */
    public interface l {
        /* renamed from: a */
        boolean mo973a(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: a.k.b.c0$m */
    public class m implements l {

        /* renamed from: a */
        public final int f1842a;

        /* renamed from: b */
        public final int f1843b;

        public m(String str, int i, int i2) {
            this.f1842a = i;
            this.f1843b = i2;
        }

        @Override // p000a.p052k.p053b.AbstractC0301c0.l
        /* renamed from: a */
        public boolean mo973a(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2) {
            ComponentCallbacksC0320m componentCallbacksC0320m = AbstractC0301c0.this.f1825t;
            if (componentCallbacksC0320m == null || this.f1842a >= 0 || !componentCallbacksC0320m.m1162j().m1027W()) {
                return AbstractC0301c0.this.m1028X(arrayList, arrayList2, null, this.f1842a, this.f1843b);
            }
            return false;
        }
    }

    /* renamed from: a.k.b.c0$n */
    public static class n implements ComponentCallbacksC0320m.e {

        /* renamed from: a */
        public final boolean f1845a;

        /* renamed from: b */
        public final C0294a f1846b;

        /* renamed from: c */
        public int f1847c;

        /* renamed from: a */
        public void m1071a() {
            boolean z = this.f1847c > 0;
            for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1846b.f1762p.f1808c.m1109i()) {
                componentCallbacksC0320m.m1183t0(null);
                if (z && componentCallbacksC0320m.m1134E()) {
                    componentCallbacksC0320m.m1189w0();
                }
            }
            C0294a c0294a = this.f1846b;
            c0294a.f1762p.m1043g(c0294a, this.f1845a, !z, true);
        }
    }

    /* renamed from: N */
    public static boolean m1005N(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* renamed from: A */
    public void m1006A(l lVar, boolean z) {
        if (!z) {
            if (this.f1822q == null) {
                if (!this.f1798D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m1022R()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1806a) {
            if (this.f1822q == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1806a.add(lVar);
                m1036c0();
            }
        }
    }

    /* renamed from: B */
    public final void m1007B(boolean z) {
        if (this.f1807b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1822q == null) {
            if (!this.f1798D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1822q.f2123d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m1022R()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1800F == null) {
            this.f1800F = new ArrayList<>();
            this.f1801G = new ArrayList<>();
        }
        this.f1807b = true;
        try {
            m1011F(null, null);
        } finally {
            this.f1807b = false;
        }
    }

    /* renamed from: C */
    public boolean m1008C(boolean z) {
        boolean zMo973a;
        m1007B(z);
        boolean z2 = false;
        while (true) {
            ArrayList<C0294a> arrayList = this.f1800F;
            ArrayList<Boolean> arrayList2 = this.f1801G;
            synchronized (this.f1806a) {
                if (this.f1806a.isEmpty()) {
                    zMo973a = false;
                } else {
                    int size = this.f1806a.size();
                    zMo973a = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        zMo973a |= this.f1806a.get(i2).mo973a(arrayList, arrayList2);
                    }
                    this.f1806a.clear();
                    this.f1822q.f2123d.removeCallbacks(this.f1805K);
                }
            }
            if (!zMo973a) {
                m1050j0();
                m1064x();
                this.f1808c.m1102b();
                return z2;
            }
            this.f1807b = true;
            try {
                m1030Z(this.f1800F, this.f1801G);
                m1039e();
                z2 = true;
            } catch (Throwable th) {
                m1039e();
                throw th;
            }
        }
    }

    /* renamed from: D */
    public void m1009D(l lVar, boolean z) {
        if (z && (this.f1822q == null || this.f1798D)) {
            return;
        }
        m1007B(z);
        ((C0294a) lVar).mo973a(this.f1800F, this.f1801G);
        this.f1807b = true;
        try {
            m1030Z(this.f1800F, this.f1801G);
            m1039e();
            m1050j0();
            m1064x();
            this.f1808c.m1102b();
        } catch (Throwable th) {
            m1039e();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1010E(java.util.ArrayList<p000a.p052k.p053b.C0294a> r20, java.util.ArrayList<java.lang.Boolean> r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.AbstractC0301c0.m1010E(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: F */
    public final void m1011F(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<n> arrayList3 = this.f1803I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.f1803I.get(i2);
            if (arrayList == null || nVar.f1845a || (iIndexOf2 = arrayList.indexOf(nVar.f1846b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if ((nVar.f1847c == 0) || (arrayList != null && nVar.f1846b.m982k(arrayList, 0, arrayList.size()))) {
                    this.f1803I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.f1845a || (iIndexOf = arrayList.indexOf(nVar.f1846b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        nVar.m1071a();
                    }
                }
                i2++;
            } else {
                this.f1803I.remove(i2);
                i2--;
                size--;
            }
            C0294a c0294a = nVar.f1846b;
            c0294a.f1762p.m1043g(c0294a, nVar.f1845a, false, false);
            i2++;
        }
    }

    /* renamed from: G */
    public ComponentCallbacksC0320m m1012G(String str) {
        return this.f1808c.m1104d(str);
    }

    /* renamed from: H */
    public ComponentCallbacksC0320m m1013H(int i2) {
        C0317k0 c0317k0 = this.f1808c;
        int size = c0317k0.f1909a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C0315j0 c0315j0 : c0317k0.f1910b.values()) {
                    if (c0315j0 != null) {
                        ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
                        if (componentCallbacksC0320m.f1999x == i2) {
                            return componentCallbacksC0320m;
                        }
                    }
                }
                return null;
            }
            ComponentCallbacksC0320m componentCallbacksC0320m2 = c0317k0.f1909a.get(size);
            if (componentCallbacksC0320m2 != null && componentCallbacksC0320m2.f1999x == i2) {
                return componentCallbacksC0320m2;
            }
        }
    }

    /* renamed from: I */
    public ComponentCallbacksC0320m m1014I(String str) {
        C0317k0 c0317k0 = this.f1808c;
        Objects.requireNonNull(c0317k0);
        if (str != null) {
            int size = c0317k0.f1909a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC0320m componentCallbacksC0320m = c0317k0.f1909a.get(size);
                if (componentCallbacksC0320m != null && str.equals(componentCallbacksC0320m.f2001z)) {
                    return componentCallbacksC0320m;
                }
            }
        }
        if (str != null) {
            for (C0315j0 c0315j0 : c0317k0.f1910b.values()) {
                if (c0315j0 != null) {
                    ComponentCallbacksC0320m componentCallbacksC0320m2 = c0315j0.f1904c;
                    if (str.equals(componentCallbacksC0320m2.f2001z)) {
                        return componentCallbacksC0320m2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: J */
    public final ViewGroup m1015J(ComponentCallbacksC0320m componentCallbacksC0320m) {
        ViewGroup viewGroup = componentCallbacksC0320m.f1962F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0320m.f2000y > 0 && this.f1823r.mo1128h()) {
            View viewMo1127f = this.f1823r.mo1127f(componentCallbacksC0320m.f2000y);
            if (viewMo1127f instanceof ViewGroup) {
                return (ViewGroup) viewMo1127f;
            }
        }
        return null;
    }

    /* renamed from: K */
    public C0344y m1016K() {
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1824s;
        return componentCallbacksC0320m != null ? componentCallbacksC0320m.f1995t.m1016K() : this.f1826u;
    }

    /* renamed from: L */
    public InterfaceC0296a1 m1017L() {
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1824s;
        return componentCallbacksC0320m != null ? componentCallbacksC0320m.f1995t.m1017L() : this.f1827v;
    }

    /* renamed from: M */
    public void m1018M(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0320m);
        }
        if (componentCallbacksC0320m.f1957A) {
            return;
        }
        componentCallbacksC0320m.f1957A = true;
        componentCallbacksC0320m.f1967K = true ^ componentCallbacksC0320m.f1967K;
        m1044g0(componentCallbacksC0320m);
    }

    /* renamed from: O */
    public final boolean m1019O(ComponentCallbacksC0320m componentCallbacksC0320m) {
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
        Iterator it = ((ArrayList) abstractC0301c0.f1808c.m1107g()).iterator();
        boolean zM1019O = false;
        while (it.hasNext()) {
            ComponentCallbacksC0320m componentCallbacksC0320m2 = (ComponentCallbacksC0320m) it.next();
            if (componentCallbacksC0320m2 != null) {
                zM1019O = abstractC0301c0.m1019O(componentCallbacksC0320m2);
            }
            if (zM1019O) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public boolean m1020P(ComponentCallbacksC0320m componentCallbacksC0320m) {
        AbstractC0301c0 abstractC0301c0;
        if (componentCallbacksC0320m == null) {
            return true;
        }
        return componentCallbacksC0320m.f1960D && ((abstractC0301c0 = componentCallbacksC0320m.f1995t) == null || abstractC0301c0.m1020P(componentCallbacksC0320m.f1998w));
    }

    /* renamed from: Q */
    public boolean m1021Q(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (componentCallbacksC0320m == null) {
            return true;
        }
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1995t;
        return componentCallbacksC0320m.equals(abstractC0301c0.f1825t) && m1021Q(abstractC0301c0.f1824s);
    }

    /* renamed from: R */
    public boolean m1022R() {
        return this.f1796B || this.f1797C;
    }

    /* renamed from: S */
    public void m1023S(int i2, boolean z) {
        AbstractC0346z<?> abstractC0346z;
        if (this.f1822q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f1821p) {
            this.f1821p = i2;
            C0317k0 c0317k0 = this.f1808c;
            Iterator<ComponentCallbacksC0320m> it = c0317k0.f1909a.iterator();
            while (it.hasNext()) {
                C0315j0 c0315j0 = c0317k0.f1910b.get(it.next().f1982g);
                if (c0315j0 != null) {
                    c0315j0.m1094k();
                }
            }
            Iterator<C0315j0> it2 = c0317k0.f1910b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C0315j0 next = it2.next();
                if (next != null) {
                    next.m1094k();
                    ComponentCallbacksC0320m componentCallbacksC0320m = next.f1904c;
                    if (componentCallbacksC0320m.f1989n && !componentCallbacksC0320m.m1133D()) {
                        z2 = true;
                    }
                    if (z2) {
                        c0317k0.m1111k(next);
                    }
                }
            }
            m1048i0();
            if (this.f1795A && (abstractC0346z = this.f1822q) != null && this.f1821p == 7) {
                abstractC0346z.mo1199l();
                this.f1795A = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1024T(p000a.p052k.p053b.ComponentCallbacksC0320m r17, int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.AbstractC0301c0.m1024T(a.k.b.m, int):void");
    }

    /* renamed from: U */
    public void m1025U() {
        if (this.f1822q == null) {
            return;
        }
        this.f1796B = false;
        this.f1797C = false;
        this.f1804J.f1872g = false;
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.f1997v.m1025U();
            }
        }
    }

    /* renamed from: V */
    public void m1026V(C0315j0 c0315j0) {
        ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
        if (componentCallbacksC0320m.f1964H) {
            if (this.f1807b) {
                this.f1799E = true;
            } else {
                componentCallbacksC0320m.f1964H = false;
                c0315j0.m1094k();
            }
        }
    }

    /* renamed from: W */
    public boolean m1027W() {
        m1008C(false);
        m1007B(true);
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1825t;
        if (componentCallbacksC0320m != null && componentCallbacksC0320m.m1162j().m1027W()) {
            return true;
        }
        boolean zM1028X = m1028X(this.f1800F, this.f1801G, null, -1, 0);
        if (zM1028X) {
            this.f1807b = true;
            try {
                m1030Z(this.f1800F, this.f1801G);
            } finally {
                m1039e();
            }
        }
        m1050j0();
        m1064x();
        this.f1808c.m1102b();
        return zM1028X;
    }

    /* renamed from: X */
    public boolean m1028X(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        Boolean bool = Boolean.TRUE;
        ArrayList<C0294a> arrayList3 = this.f1809d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1809d.remove(size));
            arrayList2.add(bool);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0294a c0294a = this.f1809d.get(size2);
                    if ((str != null && str.equals(c0294a.f1940h)) || (i2 >= 0 && i2 == c0294a.f1764r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0294a c0294a2 = this.f1809d.get(size2);
                        if (str == null || !str.equals(c0294a2.f1940h)) {
                            if (i2 < 0 || i2 != c0294a2.f1764r) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f1809d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1809d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1809d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    /* renamed from: Y */
    public void m1029Y(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0320m + " nesting=" + componentCallbacksC0320m.f1994s);
        }
        boolean z = !componentCallbacksC0320m.m1133D();
        if (!componentCallbacksC0320m.f1958B || z) {
            this.f1808c.m1112l(componentCallbacksC0320m);
            if (m1019O(componentCallbacksC0320m)) {
                this.f1795A = true;
            }
            componentCallbacksC0320m.f1989n = true;
            m1044g0(componentCallbacksC0320m);
        }
    }

    /* renamed from: Z */
    public final void m1030Z(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1011F(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f1947o) {
                if (i3 != i2) {
                    m1010E(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1947o) {
                        i3++;
                    }
                }
                m1010E(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1010E(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: a */
    public C0315j0 m1031a(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0320m);
        }
        C0315j0 c0315j0M1045h = m1045h(componentCallbacksC0320m);
        componentCallbacksC0320m.f1995t = this;
        this.f1808c.m1110j(c0315j0M1045h);
        if (!componentCallbacksC0320m.f1958B) {
            this.f1808c.m1101a(componentCallbacksC0320m);
            componentCallbacksC0320m.f1989n = false;
            if (componentCallbacksC0320m.f1963G == null) {
                componentCallbacksC0320m.f1967K = false;
            }
            if (m1019O(componentCallbacksC0320m)) {
                this.f1795A = true;
            }
        }
        return c0315j0M1045h;
    }

    /* renamed from: a0 */
    public void m1032a0(Parcelable parcelable) {
        C0315j0 c0315j0;
        if (parcelable == null) {
            return;
        }
        C0305e0 c0305e0 = (C0305e0) parcelable;
        if (c0305e0.f1854b == null) {
            return;
        }
        this.f1808c.f1910b.clear();
        Iterator<C0313i0> it = c0305e0.f1854b.iterator();
        while (it.hasNext()) {
            C0313i0 next = it.next();
            if (next != null) {
                ComponentCallbacksC0320m componentCallbacksC0320m = this.f1804J.f1867b.get(next.f1889c);
                if (componentCallbacksC0320m != null) {
                    if (m1005N(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0320m);
                    }
                    c0315j0 = new C0315j0(this.f1819n, this.f1808c, componentCallbacksC0320m, next);
                } else {
                    c0315j0 = new C0315j0(this.f1819n, this.f1808c, this.f1822q.f2122c.getClassLoader(), m1016K(), next);
                }
                ComponentCallbacksC0320m componentCallbacksC0320m2 = c0315j0.f1904c;
                componentCallbacksC0320m2.f1995t = this;
                if (m1005N(2)) {
                    StringBuilder sbM2079g = C0561a.m2079g("restoreSaveState: active (");
                    sbM2079g.append(componentCallbacksC0320m2.f1982g);
                    sbM2079g.append("): ");
                    sbM2079g.append(componentCallbacksC0320m2);
                    Log.v("FragmentManager", sbM2079g.toString());
                }
                c0315j0.m1096m(this.f1822q.f2122c.getClassLoader());
                this.f1808c.m1110j(c0315j0);
                c0315j0.f1906e = this.f1821p;
            }
        }
        C0307f0 c0307f0 = this.f1804J;
        Objects.requireNonNull(c0307f0);
        Iterator it2 = new ArrayList(c0307f0.f1867b.values()).iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC0320m componentCallbacksC0320m3 = (ComponentCallbacksC0320m) it2.next();
            if (!this.f1808c.m1103c(componentCallbacksC0320m3.f1982g)) {
                if (m1005N(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0320m3 + " that was not found in the set of active Fragments " + c0305e0.f1854b);
                }
                this.f1804J.m1073b(componentCallbacksC0320m3);
                componentCallbacksC0320m3.f1995t = this;
                C0315j0 c0315j02 = new C0315j0(this.f1819n, this.f1808c, componentCallbacksC0320m3);
                c0315j02.f1906e = 1;
                c0315j02.m1094k();
                componentCallbacksC0320m3.f1989n = true;
                c0315j02.m1094k();
            }
        }
        C0317k0 c0317k0 = this.f1808c;
        ArrayList<String> arrayList = c0305e0.f1855c;
        c0317k0.f1909a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                ComponentCallbacksC0320m componentCallbacksC0320mM1104d = c0317k0.m1104d(str);
                if (componentCallbacksC0320mM1104d == null) {
                    throw new IllegalStateException(C0561a.m2077e("No instantiated fragment for (", str, ")"));
                }
                if (m1005N(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + componentCallbacksC0320mM1104d);
                }
                c0317k0.m1101a(componentCallbacksC0320mM1104d);
            }
        }
        if (c0305e0.f1856d != null) {
            this.f1809d = new ArrayList<>(c0305e0.f1856d.length);
            int i2 = 0;
            while (true) {
                C0297b[] c0297bArr = c0305e0.f1856d;
                if (i2 >= c0297bArr.length) {
                    break;
                }
                C0297b c0297b = c0297bArr[i2];
                Objects.requireNonNull(c0297b);
                C0294a c0294a = new C0294a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = c0297b.f1768b;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    AbstractC0319l0.a aVar = new AbstractC0319l0.a();
                    int i5 = i3 + 1;
                    aVar.f1948a = iArr[i3];
                    if (m1005N(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0294a + " op #" + i4 + " base fragment #" + c0297b.f1768b[i5]);
                    }
                    String str2 = c0297b.f1769c.get(i4);
                    aVar.f1949b = str2 != null ? this.f1808c.m1104d(str2) : null;
                    aVar.f1954g = AbstractC0355d.b.values()[c0297b.f1770d[i4]];
                    aVar.f1955h = AbstractC0355d.b.values()[c0297b.f1771e[i4]];
                    int[] iArr2 = c0297b.f1768b;
                    int i6 = i5 + 1;
                    int i7 = iArr2[i5];
                    aVar.f1950c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr2[i6];
                    aVar.f1951d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar.f1952e = i11;
                    int i12 = iArr2[i10];
                    aVar.f1953f = i12;
                    c0294a.f1934b = i7;
                    c0294a.f1935c = i9;
                    c0294a.f1936d = i11;
                    c0294a.f1937e = i12;
                    c0294a.m1129b(aVar);
                    i4++;
                    i3 = i10 + 1;
                }
                c0294a.f1938f = c0297b.f1772f;
                c0294a.f1940h = c0297b.f1773g;
                c0294a.f1764r = c0297b.f1774h;
                c0294a.f1939g = true;
                c0294a.f1941i = c0297b.f1775i;
                c0294a.f1942j = c0297b.f1776j;
                c0294a.f1943k = c0297b.f1777k;
                c0294a.f1944l = c0297b.f1778l;
                c0294a.f1945m = c0297b.f1779m;
                c0294a.f1946n = c0297b.f1780n;
                c0294a.f1947o = c0297b.f1781o;
                c0294a.m976e(1);
                if (m1005N(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c0294a.f1764r + "): " + c0294a);
                    PrintWriter printWriter = new PrintWriter(new C0345y0("FragmentManager"));
                    c0294a.m978g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1809d.add(c0294a);
                i2++;
            }
        } else {
            this.f1809d = null;
        }
        this.f1814i.set(c0305e0.f1857e);
        String str3 = c0305e0.f1858f;
        if (str3 != null) {
            ComponentCallbacksC0320m componentCallbacksC0320mM1012G = m1012G(str3);
            this.f1825t = componentCallbacksC0320mM1012G;
            m1060t(componentCallbacksC0320mM1012G);
        }
        ArrayList<String> arrayList2 = c0305e0.f1859g;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                Bundle bundle = c0305e0.f1860h.get(i13);
                bundle.setClassLoader(this.f1822q.f2122c.getClassLoader());
                this.f1815j.put(arrayList2.get(i13), bundle);
            }
        }
        this.f1831z = new ArrayDeque<>(c0305e0.f1861i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1033b(p000a.p052k.p053b.AbstractC0346z<?> r5, p000a.p052k.p053b.AbstractC0338v r6, p000a.p052k.p053b.ComponentCallbacksC0320m r7) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.AbstractC0301c0.m1033b(a.k.b.z, a.k.b.v, a.k.b.m):void");
    }

    /* renamed from: b0 */
    public Parcelable m1034b0() {
        int i2;
        C0297b[] c0297bArr;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) m1041f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0347z0 abstractC0347z0 = (AbstractC0347z0) it.next();
            if (abstractC0347z0.f2129e) {
                abstractC0347z0.f2129e = false;
                abstractC0347z0.m1252c();
            }
        }
        m1066z();
        m1008C(true);
        this.f1796B = true;
        this.f1804J.f1872g = true;
        C0317k0 c0317k0 = this.f1808c;
        Objects.requireNonNull(c0317k0);
        ArrayList<C0313i0> arrayList2 = new ArrayList<>(c0317k0.f1910b.size());
        Iterator<C0315j0> it2 = c0317k0.f1910b.values().iterator();
        while (true) {
            c0297bArr = null;
            c0297bArr = null;
            if (!it2.hasNext()) {
                break;
            }
            C0315j0 next = it2.next();
            if (next != null) {
                ComponentCallbacksC0320m componentCallbacksC0320m = next.f1904c;
                C0313i0 c0313i0 = new C0313i0(componentCallbacksC0320m);
                ComponentCallbacksC0320m componentCallbacksC0320m2 = next.f1904c;
                if (componentCallbacksC0320m2.f1977b <= -1 || c0313i0.f1900n != null) {
                    c0313i0.f1900n = componentCallbacksC0320m2.f1978c;
                } else {
                    Bundle bundle = new Bundle();
                    ComponentCallbacksC0320m componentCallbacksC0320m3 = next.f1904c;
                    componentCallbacksC0320m3.mo1119b0(bundle);
                    componentCallbacksC0320m3.f1975S.m1424b(bundle);
                    Parcelable parcelableM1034b0 = componentCallbacksC0320m3.f1997v.m1034b0();
                    if (parcelableM1034b0 != null) {
                        bundle.putParcelable("android:support:fragments", parcelableM1034b0);
                    }
                    next.f1902a.m992j(next.f1904c, bundle, false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (next.f1904c.f1963G != null) {
                        next.m1098o();
                    }
                    if (next.f1904c.f1979d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", next.f1904c.f1979d);
                    }
                    if (next.f1904c.f1980e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", next.f1904c.f1980e);
                    }
                    if (!next.f1904c.f1965I) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", next.f1904c.f1965I);
                    }
                    c0313i0.f1900n = bundle2;
                    if (next.f1904c.f1985j != null) {
                        if (bundle2 == null) {
                            c0313i0.f1900n = new Bundle();
                        }
                        c0313i0.f1900n.putString("android:target_state", next.f1904c.f1985j);
                        int i3 = next.f1904c.f1986k;
                        if (i3 != 0) {
                            c0313i0.f1900n.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(c0313i0);
                if (m1005N(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0320m + ": " + c0313i0.f1900n);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m1005N(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0317k0 c0317k02 = this.f1808c;
        synchronized (c0317k02.f1909a) {
            if (c0317k02.f1909a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(c0317k02.f1909a.size());
                Iterator<ComponentCallbacksC0320m> it3 = c0317k02.f1909a.iterator();
                while (it3.hasNext()) {
                    ComponentCallbacksC0320m next2 = it3.next();
                    arrayList.add(next2.f1982g);
                    if (m1005N(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f1982g + "): " + next2);
                    }
                }
            }
        }
        ArrayList<C0294a> arrayList3 = this.f1809d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            c0297bArr = new C0297b[size];
            for (i2 = 0; i2 < size; i2++) {
                c0297bArr[i2] = new C0297b(this.f1809d.get(i2));
                if (m1005N(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1809d.get(i2));
                }
            }
        }
        C0305e0 c0305e0 = new C0305e0();
        c0305e0.f1854b = arrayList2;
        c0305e0.f1855c = arrayList;
        c0305e0.f1856d = c0297bArr;
        c0305e0.f1857e = this.f1814i.get();
        ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1825t;
        if (componentCallbacksC0320m4 != null) {
            c0305e0.f1858f = componentCallbacksC0320m4.f1982g;
        }
        c0305e0.f1859g.addAll(this.f1815j.keySet());
        c0305e0.f1860h.addAll(this.f1815j.values());
        c0305e0.f1861i = new ArrayList<>(this.f1831z);
        return c0305e0;
    }

    /* renamed from: c */
    public void m1035c(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0320m);
        }
        if (componentCallbacksC0320m.f1958B) {
            componentCallbacksC0320m.f1958B = false;
            if (componentCallbacksC0320m.f1988m) {
                return;
            }
            this.f1808c.m1101a(componentCallbacksC0320m);
            if (m1005N(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0320m);
            }
            if (m1019O(componentCallbacksC0320m)) {
                this.f1795A = true;
            }
        }
    }

    /* renamed from: c0 */
    public void m1036c0() {
        synchronized (this.f1806a) {
            ArrayList<n> arrayList = this.f1803I;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f1806a.size() == 1;
            if (z || z2) {
                this.f1822q.f2123d.removeCallbacks(this.f1805K);
                this.f1822q.f2123d.post(this.f1805K);
                m1050j0();
            }
        }
    }

    /* renamed from: d */
    public final void m1037d(ComponentCallbacksC0320m componentCallbacksC0320m) {
        HashSet<C0217a> hashSet = this.f1817l.get(componentCallbacksC0320m);
        if (hashSet != null) {
            Iterator<C0217a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m788a();
            }
            hashSet.clear();
            m1047i(componentCallbacksC0320m);
            this.f1817l.remove(componentCallbacksC0320m);
        }
    }

    /* renamed from: d0 */
    public void m1038d0(ComponentCallbacksC0320m componentCallbacksC0320m, boolean z) {
        ViewGroup viewGroupM1015J = m1015J(componentCallbacksC0320m);
        if (viewGroupM1015J == null || !(viewGroupM1015J instanceof C0340w)) {
            return;
        }
        ((C0340w) viewGroupM1015J).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: e */
    public final void m1039e() {
        this.f1807b = false;
        this.f1801G.clear();
        this.f1800F.clear();
    }

    /* renamed from: e0 */
    public void m1040e0(ComponentCallbacksC0320m componentCallbacksC0320m, AbstractC0355d.b bVar) {
        if (componentCallbacksC0320m.equals(m1012G(componentCallbacksC0320m.f1982g)) && (componentCallbacksC0320m.f1996u == null || componentCallbacksC0320m.f1995t == this)) {
            componentCallbacksC0320m.f1971O = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0320m + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: f */
    public final Set<AbstractC0347z0> m1041f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1808c.m1106f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0315j0) it.next()).f1904c.f1962F;
            if (viewGroup != null) {
                hashSet.add(AbstractC0347z0.m1250g(viewGroup, m1017L()));
            }
        }
        return hashSet;
    }

    /* renamed from: f0 */
    public void m1042f0(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (componentCallbacksC0320m == null || (componentCallbacksC0320m.equals(m1012G(componentCallbacksC0320m.f1982g)) && (componentCallbacksC0320m.f1996u == null || componentCallbacksC0320m.f1995t == this))) {
            ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1825t;
            this.f1825t = componentCallbacksC0320m;
            m1060t(componentCallbacksC0320m2);
            m1060t(this.f1825t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0320m + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: g */
    public void m1043g(C0294a c0294a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0294a.m980i(z3);
        } else {
            c0294a.m979h();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0294a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f1821p >= 1) {
            C0333s0.m1215p(this.f1822q.f2122c, this.f1823r, arrayList, arrayList2, 0, 1, true, this.f1818m);
        }
        if (z3) {
            m1023S(this.f1821p, true);
        }
        Iterator it = ((ArrayList) this.f1808c.m1107g()).iterator();
        while (it.hasNext()) {
            ComponentCallbacksC0320m componentCallbacksC0320m = (ComponentCallbacksC0320m) it.next();
            if (componentCallbacksC0320m != null) {
                View view = componentCallbacksC0320m.f1963G;
            }
        }
    }

    /* renamed from: g0 */
    public final void m1044g0(ComponentCallbacksC0320m componentCallbacksC0320m) {
        ViewGroup viewGroupM1015J = m1015J(componentCallbacksC0320m);
        if (viewGroupM1015J != null) {
            if (componentCallbacksC0320m.m1188w() + componentCallbacksC0320m.m1186v() + componentCallbacksC0320m.m1172o() + componentCallbacksC0320m.m1166l() > 0) {
                if (viewGroupM1015J.getTag(C1088R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM1015J.setTag(C1088R.id.visible_removing_fragment_view_tag, componentCallbacksC0320m);
                }
                ((ComponentCallbacksC0320m) viewGroupM1015J.getTag(C1088R.id.visible_removing_fragment_view_tag)).m1185u0(componentCallbacksC0320m.m1184u());
            }
        }
    }

    /* renamed from: h */
    public C0315j0 m1045h(ComponentCallbacksC0320m componentCallbacksC0320m) {
        C0315j0 c0315j0M1108h = this.f1808c.m1108h(componentCallbacksC0320m.f1982g);
        if (c0315j0M1108h != null) {
            return c0315j0M1108h;
        }
        C0315j0 c0315j0 = new C0315j0(this.f1819n, this.f1808c, componentCallbacksC0320m);
        c0315j0.m1096m(this.f1822q.f2122c.getClassLoader());
        c0315j0.f1906e = this.f1821p;
        return c0315j0;
    }

    /* renamed from: h0 */
    public void m1046h0(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0320m);
        }
        if (componentCallbacksC0320m.f1957A) {
            componentCallbacksC0320m.f1957A = false;
            componentCallbacksC0320m.f1967K = !componentCallbacksC0320m.f1967K;
        }
    }

    /* renamed from: i */
    public final void m1047i(ComponentCallbacksC0320m componentCallbacksC0320m) {
        componentCallbacksC0320m.m1159h0();
        this.f1819n.m996n(componentCallbacksC0320m, false);
        componentCallbacksC0320m.f1962F = null;
        componentCallbacksC0320m.f1963G = null;
        componentCallbacksC0320m.f1973Q = null;
        componentCallbacksC0320m.f1974R.mo1290g(null);
        componentCallbacksC0320m.f1991p = false;
    }

    /* renamed from: i0 */
    public final void m1048i0() {
        Iterator it = ((ArrayList) this.f1808c.m1106f()).iterator();
        while (it.hasNext()) {
            m1026V((C0315j0) it.next());
        }
    }

    /* renamed from: j */
    public void m1049j(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (m1005N(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0320m);
        }
        if (componentCallbacksC0320m.f1958B) {
            return;
        }
        componentCallbacksC0320m.f1958B = true;
        if (componentCallbacksC0320m.f1988m) {
            if (m1005N(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0320m);
            }
            this.f1808c.m1112l(componentCallbacksC0320m);
            if (m1019O(componentCallbacksC0320m)) {
                this.f1795A = true;
            }
            m1044g0(componentCallbacksC0320m);
        }
    }

    /* renamed from: j0 */
    public final void m1050j0() {
        synchronized (this.f1806a) {
            if (!this.f1806a.isEmpty()) {
                this.f1813h.f0a = true;
                return;
            }
            AbstractC0001b abstractC0001b = this.f1813h;
            ArrayList<C0294a> arrayList = this.f1809d;
            abstractC0001b.f0a = (arrayList != null ? arrayList.size() : 0) > 0 && m1021Q(this.f1824s);
        }
    }

    /* renamed from: k */
    public void m1051k(Configuration configuration) {
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.onConfigurationChanged(configuration);
                componentCallbacksC0320m.f1997v.m1051k(configuration);
            }
        }
    }

    /* renamed from: l */
    public boolean m1052l(MenuItem menuItem) {
        if (this.f1821p < 1) {
            return false;
        }
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                if (!componentCallbacksC0320m.f1957A ? componentCallbacksC0320m.m1140L() ? true : componentCallbacksC0320m.f1997v.m1052l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m1053m() {
        this.f1796B = false;
        this.f1797C = false;
        this.f1804J.f1872g = false;
        m1063w(1);
    }

    /* renamed from: n */
    public boolean m1054n(Menu menu, MenuInflater menuInflater) {
        if (this.f1821p < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0320m> arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null && m1020P(componentCallbacksC0320m)) {
                if (!componentCallbacksC0320m.f1957A ? componentCallbacksC0320m.f1997v.m1054n(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(componentCallbacksC0320m);
                    z = true;
                }
            }
        }
        if (this.f1810e != null) {
            for (int i2 = 0; i2 < this.f1810e.size(); i2++) {
                ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1810e.get(i2);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0320m2)) {
                    Objects.requireNonNull(componentCallbacksC0320m2);
                }
            }
        }
        this.f1810e = arrayList;
        return z;
    }

    /* renamed from: o */
    public void m1055o() {
        this.f1798D = true;
        m1008C(true);
        m1066z();
        m1063w(-1);
        this.f1822q = null;
        this.f1823r = null;
        this.f1824s = null;
        if (this.f1812g != null) {
            Iterator<InterfaceC0000a> it = this.f1813h.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f1812g = null;
        }
        AbstractC0007c<Intent> abstractC0007c = this.f1828w;
        if (abstractC0007c != null) {
            abstractC0007c.mo4a();
            this.f1829x.mo4a();
            this.f1830y.mo4a();
        }
    }

    /* renamed from: p */
    public void m1056p() {
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.m1161i0();
            }
        }
    }

    /* renamed from: q */
    public void m1057q(boolean z) {
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.m1148X();
                componentCallbacksC0320m.f1997v.m1057q(z);
            }
        }
    }

    /* renamed from: r */
    public boolean m1058r(MenuItem menuItem) {
        if (this.f1821p < 1) {
            return false;
        }
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                if (!componentCallbacksC0320m.f1957A ? componentCallbacksC0320m.f1997v.m1058r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public void m1059s(Menu menu) {
        if (this.f1821p < 1) {
            return;
        }
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null && !componentCallbacksC0320m.f1957A) {
                componentCallbacksC0320m.f1997v.m1059s(menu);
            }
        }
    }

    /* renamed from: t */
    public final void m1060t(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (componentCallbacksC0320m == null || !componentCallbacksC0320m.equals(m1012G(componentCallbacksC0320m.f1982g))) {
            return;
        }
        boolean zM1021Q = componentCallbacksC0320m.f1995t.m1021Q(componentCallbacksC0320m);
        Boolean bool = componentCallbacksC0320m.f1987l;
        if (bool == null || bool.booleanValue() != zM1021Q) {
            componentCallbacksC0320m.f1987l = Boolean.valueOf(zM1021Q);
            componentCallbacksC0320m.m1150Z();
            AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
            abstractC0301c0.m1050j0();
            abstractC0301c0.m1060t(abstractC0301c0.f1825t);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1824s;
        if (componentCallbacksC0320m != null) {
            sb.append(componentCallbacksC0320m.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1824s;
        } else {
            AbstractC0346z<?> abstractC0346z = this.f1822q;
            if (abstractC0346z == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(abstractC0346z.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1822q;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void m1061u(boolean z) {
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.m1149Y();
                componentCallbacksC0320m.f1997v.m1061u(z);
            }
        }
    }

    /* renamed from: v */
    public boolean m1062v(Menu menu) {
        boolean z = false;
        if (this.f1821p < 1) {
            return false;
        }
        for (ComponentCallbacksC0320m componentCallbacksC0320m : this.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null && m1020P(componentCallbacksC0320m) && componentCallbacksC0320m.m1163j0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: w */
    public final void m1063w(int i2) {
        try {
            this.f1807b = true;
            for (C0315j0 c0315j0 : this.f1808c.f1910b.values()) {
                if (c0315j0 != null) {
                    c0315j0.f1906e = i2;
                }
            }
            m1023S(i2, false);
            Iterator it = ((HashSet) m1041f()).iterator();
            while (it.hasNext()) {
                ((AbstractC0347z0) it.next()).m1254e();
            }
            this.f1807b = false;
            m1008C(true);
        } catch (Throwable th) {
            this.f1807b = false;
            throw th;
        }
    }

    /* renamed from: x */
    public final void m1064x() {
        if (this.f1799E) {
            this.f1799E = false;
            m1048i0();
        }
    }

    /* renamed from: y */
    public void m1065y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM2076d = C0561a.m2076d(str, "    ");
        C0317k0 c0317k0 = this.f1808c;
        Objects.requireNonNull(c0317k0);
        String str2 = str + "    ";
        if (!c0317k0.f1910b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0315j0 c0315j0 : c0317k0.f1910b.values()) {
                printWriter.print(str);
                if (c0315j0 != null) {
                    ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
                    printWriter.println(componentCallbacksC0320m);
                    componentCallbacksC0320m.m1156f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0317k0.f1909a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                ComponentCallbacksC0320m componentCallbacksC0320m2 = c0317k0.f1909a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0320m2.toString());
            }
        }
        ArrayList<ComponentCallbacksC0320m> arrayList = this.f1810e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1810e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0320m3.toString());
            }
        }
        ArrayList<C0294a> arrayList2 = this.f1809d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0294a c0294a = this.f1809d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0294a.toString());
                c0294a.m978g(strM2076d, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1814i.get());
        synchronized (this.f1806a) {
            int size4 = this.f1806a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj = (l) this.f1806a.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1822q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1823r);
        if (this.f1824s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1824s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1821p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1796B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1797C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1798D);
        if (this.f1795A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1795A);
        }
    }

    /* renamed from: z */
    public final void m1066z() {
        Iterator it = ((HashSet) m1041f()).iterator();
        while (it.hasNext()) {
            ((AbstractC0347z0) it.next()).m1254e();
        }
    }
}
