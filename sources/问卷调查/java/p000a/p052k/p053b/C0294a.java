package p000a.p052k.p053b;

import android.util.Log;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.AbstractC0319l0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p057m.AbstractC0355d;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.a */
/* loaded from: classes.dex */
public final class C0294a extends AbstractC0319l0 implements AbstractC0301c0.l {

    /* renamed from: p */
    public final AbstractC0301c0 f1762p;

    /* renamed from: q */
    public boolean f1763q;

    /* renamed from: r */
    public int f1764r;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0294a(AbstractC0301c0 abstractC0301c0) {
        C0344y c0344yM1016K = abstractC0301c0.m1016K();
        AbstractC0346z<?> abstractC0346z = abstractC0301c0.f1822q;
        super(c0344yM1016K, abstractC0346z != null ? abstractC0346z.f2122c.getClassLoader() : null);
        this.f1764r = -1;
        this.f1762p = abstractC0301c0;
    }

    @Override // p000a.p052k.p053b.AbstractC0301c0.l
    /* renamed from: a */
    public boolean mo973a(ArrayList<C0294a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1939g) {
            return true;
        }
        AbstractC0301c0 abstractC0301c0 = this.f1762p;
        if (abstractC0301c0.f1809d == null) {
            abstractC0301c0.f1809d = new ArrayList<>();
        }
        abstractC0301c0.f1809d.add(this);
        return true;
    }

    @Override // p000a.p052k.p053b.AbstractC0319l0
    /* renamed from: c */
    public void mo974c(int i, ComponentCallbacksC0320m componentCallbacksC0320m, String str, int i2) {
        Class<?> cls = componentCallbacksC0320m.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbM2079g = C0561a.m2079g("Fragment ");
            sbM2079g.append(cls.getCanonicalName());
            sbM2079g.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbM2079g.toString());
        }
        if (str != null) {
            String str2 = componentCallbacksC0320m.f2001z;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0320m + ": was " + componentCallbacksC0320m.f2001z + " now " + str);
            }
            componentCallbacksC0320m.f2001z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0320m + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC0320m.f1999x;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0320m + ": was " + componentCallbacksC0320m.f1999x + " now " + i);
            }
            componentCallbacksC0320m.f1999x = i;
            componentCallbacksC0320m.f2000y = i;
        }
        m1129b(new AbstractC0319l0.a(i2, componentCallbacksC0320m));
        componentCallbacksC0320m.f1995t = this.f1762p;
    }

    @Override // p000a.p052k.p053b.AbstractC0319l0
    /* renamed from: d */
    public AbstractC0319l0 mo975d(ComponentCallbacksC0320m componentCallbacksC0320m, AbstractC0355d.b bVar) {
        if (componentCallbacksC0320m.f1995t != this.f1762p) {
            StringBuilder sbM2079g = C0561a.m2079g("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbM2079g.append(this.f1762p);
            throw new IllegalArgumentException(sbM2079g.toString());
        }
        if (bVar == AbstractC0355d.b.INITIALIZED && componentCallbacksC0320m.f1977b > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC0355d.b.DESTROYED) {
            m1129b(new AbstractC0319l0.a(10, componentCallbacksC0320m, bVar));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* renamed from: e */
    public void m976e(int i) {
        if (this.f1939g) {
            if (AbstractC0301c0.m1005N(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1933a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0319l0.a aVar = this.f1933a.get(i2);
                ComponentCallbacksC0320m componentCallbacksC0320m = aVar.f1949b;
                if (componentCallbacksC0320m != null) {
                    componentCallbacksC0320m.f1994s += i;
                    if (AbstractC0301c0.m1005N(2)) {
                        StringBuilder sbM2079g = C0561a.m2079g("Bump nesting of ");
                        sbM2079g.append(aVar.f1949b);
                        sbM2079g.append(" to ");
                        sbM2079g.append(aVar.f1949b.f1994s);
                        Log.v("FragmentManager", sbM2079g.toString());
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public int m977f(boolean z) {
        if (this.f1763q) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0345y0("FragmentManager"));
            m978g("  ", printWriter, true);
            printWriter.close();
        }
        this.f1763q = true;
        this.f1764r = this.f1939g ? this.f1762p.f1814i.getAndIncrement() : -1;
        this.f1762p.m1006A(this, z);
        return this.f1764r;
    }

    /* renamed from: g */
    public void m978g(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1940h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1764r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1763q);
            if (this.f1938f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1938f));
            }
            if (this.f1934b != 0 || this.f1935c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1934b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1935c));
            }
            if (this.f1936d != 0 || this.f1937e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1936d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1937e));
            }
            if (this.f1941i != 0 || this.f1942j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1941i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1942j);
            }
            if (this.f1943k != 0 || this.f1944l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1943k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1944l);
            }
        }
        if (this.f1933a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1933a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0319l0.a aVar = this.f1933a.get(i);
            switch (aVar.f1948a) {
                case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                    string = "NULL";
                    break;
                case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                    string = "ADD";
                    break;
                case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbM2079g = C0561a.m2079g("cmd=");
                    sbM2079g.append(aVar.f1948a);
                    string = sbM2079g.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(aVar.f1949b);
            if (z) {
                if (aVar.f1950c != 0 || aVar.f1951d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1950c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1951d));
                }
                if (aVar.f1952e != 0 || aVar.f1953f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1952e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1953f));
                }
            }
        }
    }

    /* renamed from: h */
    public void m979h() {
        AbstractC0301c0 abstractC0301c0;
        int size = this.f1933a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0319l0.a aVar = this.f1933a.get(i);
            ComponentCallbacksC0320m componentCallbacksC0320m = aVar.f1949b;
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.m1185u0(false);
                int i2 = this.f1938f;
                if (componentCallbacksC0320m.f1966J != null || i2 != 0) {
                    componentCallbacksC0320m.m1157g();
                    componentCallbacksC0320m.f1966J.f2010h = i2;
                }
                ArrayList<String> arrayList = this.f1945m;
                ArrayList<String> arrayList2 = this.f1946n;
                componentCallbacksC0320m.m1157g();
                ComponentCallbacksC0320m.b bVar = componentCallbacksC0320m.f1966J;
                bVar.f2011i = arrayList;
                bVar.f2012j = arrayList2;
            }
            switch (aVar.f1948a) {
                case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, false);
                    this.f1762p.m1031a(componentCallbacksC0320m);
                    continue;
                case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                default:
                    StringBuilder sbM2079g = C0561a.m2079g("Unknown cmd: ");
                    sbM2079g.append(aVar.f1948a);
                    throw new IllegalArgumentException(sbM2079g.toString());
                case 3:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1029Y(componentCallbacksC0320m);
                    continue;
                case 4:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1018M(componentCallbacksC0320m);
                    continue;
                case 5:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, false);
                    this.f1762p.m1046h0(componentCallbacksC0320m);
                    continue;
                case 6:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1049j(componentCallbacksC0320m);
                    continue;
                case 7:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, false);
                    this.f1762p.m1035c(componentCallbacksC0320m);
                    continue;
                case 8:
                    abstractC0301c0 = this.f1762p;
                    break;
                case 9:
                    abstractC0301c0 = this.f1762p;
                    componentCallbacksC0320m = null;
                    break;
                case 10:
                    this.f1762p.m1040e0(componentCallbacksC0320m, aVar.f1955h);
                    continue;
            }
            abstractC0301c0.m1042f0(componentCallbacksC0320m);
        }
    }

    /* renamed from: i */
    public void m980i(boolean z) {
        AbstractC0301c0 abstractC0301c0;
        for (int size = this.f1933a.size() - 1; size >= 0; size--) {
            AbstractC0319l0.a aVar = this.f1933a.get(size);
            ComponentCallbacksC0320m componentCallbacksC0320m = aVar.f1949b;
            if (componentCallbacksC0320m != null) {
                componentCallbacksC0320m.m1185u0(true);
                int i = this.f1938f;
                int i2 = i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
                if (componentCallbacksC0320m.f1966J != null || i2 != 0) {
                    componentCallbacksC0320m.m1157g();
                    componentCallbacksC0320m.f1966J.f2010h = i2;
                }
                ArrayList<String> arrayList = this.f1946n;
                ArrayList<String> arrayList2 = this.f1945m;
                componentCallbacksC0320m.m1157g();
                ComponentCallbacksC0320m.b bVar = componentCallbacksC0320m.f1966J;
                bVar.f2011i = arrayList;
                bVar.f2012j = arrayList2;
            }
            switch (aVar.f1948a) {
                case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, true);
                    this.f1762p.m1029Y(componentCallbacksC0320m);
                    continue;
                case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                default:
                    StringBuilder sbM2079g = C0561a.m2079g("Unknown cmd: ");
                    sbM2079g.append(aVar.f1948a);
                    throw new IllegalArgumentException(sbM2079g.toString());
                case 3:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1031a(componentCallbacksC0320m);
                    continue;
                case 4:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1046h0(componentCallbacksC0320m);
                    continue;
                case 5:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, true);
                    this.f1762p.m1018M(componentCallbacksC0320m);
                    continue;
                case 6:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1035c(componentCallbacksC0320m);
                    continue;
                case 7:
                    componentCallbacksC0320m.m1171n0(aVar.f1950c, aVar.f1951d, aVar.f1952e, aVar.f1953f);
                    this.f1762p.m1038d0(componentCallbacksC0320m, true);
                    this.f1762p.m1049j(componentCallbacksC0320m);
                    continue;
                case 8:
                    abstractC0301c0 = this.f1762p;
                    componentCallbacksC0320m = null;
                    break;
                case 9:
                    abstractC0301c0 = this.f1762p;
                    break;
                case 10:
                    this.f1762p.m1040e0(componentCallbacksC0320m, aVar.f1954g);
                    continue;
            }
            abstractC0301c0.m1042f0(componentCallbacksC0320m);
        }
    }

    /* renamed from: j */
    public boolean m981j(int i) {
        int size = this.f1933a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0320m componentCallbacksC0320m = this.f1933a.get(i2).f1949b;
            int i3 = componentCallbacksC0320m != null ? componentCallbacksC0320m.f2000y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m982k(ArrayList<C0294a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1933a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            ComponentCallbacksC0320m componentCallbacksC0320m = this.f1933a.get(i4).f1949b;
            int i5 = componentCallbacksC0320m != null ? componentCallbacksC0320m.f2000y : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0294a c0294a = arrayList.get(i6);
                    int size2 = c0294a.f1933a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ComponentCallbacksC0320m componentCallbacksC0320m2 = c0294a.f1933a.get(i7).f1949b;
                        if ((componentCallbacksC0320m2 != null ? componentCallbacksC0320m2.f2000y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1764r >= 0) {
            sb.append(" #");
            sb.append(this.f1764r);
        }
        if (this.f1940h != null) {
            sb.append(" ");
            sb.append(this.f1940h);
        }
        sb.append("}");
        return sb.toString();
    }
}
