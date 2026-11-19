package p000a.p052k.p053b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import io.github.inflationx.calligraphy3.C1088R;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p052k.p053b.AbstractC0347z0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0372u;
import p000a.p062p.C0405b;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.j0 */
/* loaded from: classes.dex */
public class C0315j0 {

    /* renamed from: a */
    public final C0298b0 f1902a;

    /* renamed from: b */
    public final C0317k0 f1903b;

    /* renamed from: c */
    public final ComponentCallbacksC0320m f1904c;

    /* renamed from: d */
    public boolean f1905d = false;

    /* renamed from: e */
    public int f1906e = -1;

    /* renamed from: a.k.b.j0$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ View f1907b;

        public a(C0315j0 c0315j0, View view) {
            this.f1907b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f1907b.removeOnAttachStateChangeListener(this);
            View view2 = this.f1907b;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view2.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C0315j0(C0298b0 c0298b0, C0317k0 c0317k0, ComponentCallbacksC0320m componentCallbacksC0320m) {
        this.f1902a = c0298b0;
        this.f1903b = c0317k0;
        this.f1904c = componentCallbacksC0320m;
    }

    public C0315j0(C0298b0 c0298b0, C0317k0 c0317k0, ComponentCallbacksC0320m componentCallbacksC0320m, C0313i0 c0313i0) {
        this.f1902a = c0298b0;
        this.f1903b = c0317k0;
        this.f1904c = componentCallbacksC0320m;
        componentCallbacksC0320m.f1979d = null;
        componentCallbacksC0320m.f1980e = null;
        componentCallbacksC0320m.f1994s = 0;
        componentCallbacksC0320m.f1991p = false;
        componentCallbacksC0320m.f1988m = false;
        ComponentCallbacksC0320m componentCallbacksC0320m2 = componentCallbacksC0320m.f1984i;
        componentCallbacksC0320m.f1985j = componentCallbacksC0320m2 != null ? componentCallbacksC0320m2.f1982g : null;
        componentCallbacksC0320m.f1984i = null;
        Bundle bundle = c0313i0.f1900n;
        componentCallbacksC0320m.f1978c = bundle == null ? new Bundle() : bundle;
    }

    public C0315j0(C0298b0 c0298b0, C0317k0 c0317k0, ClassLoader classLoader, C0344y c0344y, C0313i0 c0313i0) {
        this.f1902a = c0298b0;
        this.f1903b = c0317k0;
        ComponentCallbacksC0320m componentCallbacksC0320mMo1069a = c0344y.mo1069a(classLoader, c0313i0.f1888b);
        this.f1904c = componentCallbacksC0320mMo1069a;
        Bundle bundle = c0313i0.f1897k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC0320mMo1069a.m1175p0(c0313i0.f1897k);
        componentCallbacksC0320mMo1069a.f1982g = c0313i0.f1889c;
        componentCallbacksC0320mMo1069a.f1990o = c0313i0.f1890d;
        componentCallbacksC0320mMo1069a.f1992q = true;
        componentCallbacksC0320mMo1069a.f1999x = c0313i0.f1891e;
        componentCallbacksC0320mMo1069a.f2000y = c0313i0.f1892f;
        componentCallbacksC0320mMo1069a.f2001z = c0313i0.f1893g;
        componentCallbacksC0320mMo1069a.f1959C = c0313i0.f1894h;
        componentCallbacksC0320mMo1069a.f1989n = c0313i0.f1895i;
        componentCallbacksC0320mMo1069a.f1958B = c0313i0.f1896j;
        componentCallbacksC0320mMo1069a.f1957A = c0313i0.f1898l;
        componentCallbacksC0320mMo1069a.f1971O = AbstractC0355d.b.values()[c0313i0.f1899m];
        Bundle bundle2 = c0313i0.f1900n;
        componentCallbacksC0320mMo1069a.f1978c = bundle2 == null ? new Bundle() : bundle2;
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC0320mMo1069a);
        }
    }

    /* renamed from: a */
    public void m1084a() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("moveto ACTIVITY_CREATED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        Bundle bundle = componentCallbacksC0320m.f1978c;
        componentCallbacksC0320m.f1997v.m1025U();
        componentCallbacksC0320m.f1977b = 3;
        componentCallbacksC0320m.f1961E = false;
        componentCallbacksC0320m.m1136G();
        if (!componentCallbacksC0320m.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m, " did not call through to super.onActivityCreated()"));
        }
        if (AbstractC0301c0.m1005N(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + componentCallbacksC0320m);
        }
        View view = componentCallbacksC0320m.f1963G;
        if (view != null) {
            Bundle bundle2 = componentCallbacksC0320m.f1978c;
            SparseArray<Parcelable> sparseArray = componentCallbacksC0320m.f1979d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                componentCallbacksC0320m.f1979d = null;
            }
            if (componentCallbacksC0320m.f1963G != null) {
                componentCallbacksC0320m.f1973Q.f2117d.m1423a(componentCallbacksC0320m.f1980e);
                componentCallbacksC0320m.f1980e = null;
            }
            componentCallbacksC0320m.f1961E = false;
            componentCallbacksC0320m.mo1122f0(bundle2);
            if (!componentCallbacksC0320m.f1961E) {
                throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m, " did not call through to super.onViewStateRestored()"));
            }
            if (componentCallbacksC0320m.f1963G != null) {
                componentCallbacksC0320m.f1973Q.m1244b(AbstractC0355d.a.ON_CREATE);
            }
        }
        componentCallbacksC0320m.f1978c = null;
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
        abstractC0301c0.f1796B = false;
        abstractC0301c0.f1797C = false;
        abstractC0301c0.f1804J.f1872g = false;
        abstractC0301c0.m1063w(4);
        C0298b0 c0298b0 = this.f1902a;
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        c0298b0.m983a(componentCallbacksC0320m2, componentCallbacksC0320m2.f1978c, false);
    }

    /* renamed from: b */
    public void m1085b() {
        View view;
        View view2;
        C0317k0 c0317k0 = this.f1903b;
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        Objects.requireNonNull(c0317k0);
        ViewGroup viewGroup = componentCallbacksC0320m.f1962F;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = c0317k0.f1909a.indexOf(componentCallbacksC0320m);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= c0317k0.f1909a.size()) {
                            break;
                        }
                        ComponentCallbacksC0320m componentCallbacksC0320m2 = c0317k0.f1909a.get(iIndexOf);
                        if (componentCallbacksC0320m2.f1962F == viewGroup && (view = componentCallbacksC0320m2.f1963G) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ComponentCallbacksC0320m componentCallbacksC0320m3 = c0317k0.f1909a.get(i);
                    if (componentCallbacksC0320m3.f1962F == viewGroup && (view2 = componentCallbacksC0320m3.f1963G) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
        componentCallbacksC0320m4.f1962F.addView(componentCallbacksC0320m4.f1963G, iIndexOfChild);
    }

    /* renamed from: c */
    public void m1086c() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("moveto ATTACHED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        ComponentCallbacksC0320m componentCallbacksC0320m2 = componentCallbacksC0320m.f1984i;
        C0315j0 c0315j0M1108h = null;
        if (componentCallbacksC0320m2 != null) {
            C0315j0 c0315j0M1108h2 = this.f1903b.m1108h(componentCallbacksC0320m2.f1982g);
            if (c0315j0M1108h2 == null) {
                StringBuilder sbM2079g2 = C0561a.m2079g("Fragment ");
                sbM2079g2.append(this.f1904c);
                sbM2079g2.append(" declared target fragment ");
                sbM2079g2.append(this.f1904c.f1984i);
                sbM2079g2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbM2079g2.toString());
            }
            ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
            componentCallbacksC0320m3.f1985j = componentCallbacksC0320m3.f1984i.f1982g;
            componentCallbacksC0320m3.f1984i = null;
            c0315j0M1108h = c0315j0M1108h2;
        } else {
            String str = componentCallbacksC0320m.f1985j;
            if (str != null && (c0315j0M1108h = this.f1903b.m1108h(str)) == null) {
                StringBuilder sbM2079g3 = C0561a.m2079g("Fragment ");
                sbM2079g3.append(this.f1904c);
                sbM2079g3.append(" declared target fragment ");
                sbM2079g3.append(this.f1904c.f1985j);
                sbM2079g3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbM2079g3.toString());
            }
        }
        if (c0315j0M1108h != null) {
            c0315j0M1108h.m1094k();
        }
        ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m4.f1995t;
        componentCallbacksC0320m4.f1996u = abstractC0301c0.f1822q;
        componentCallbacksC0320m4.f1998w = abstractC0301c0.f1824s;
        this.f1902a.m989g(componentCallbacksC0320m4, false);
        ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
        Iterator<ComponentCallbacksC0320m.d> it = componentCallbacksC0320m5.f1976T.iterator();
        while (it.hasNext()) {
            it.next().m1193a();
        }
        componentCallbacksC0320m5.f1976T.clear();
        componentCallbacksC0320m5.f1997v.m1033b(componentCallbacksC0320m5.f1996u, componentCallbacksC0320m5.mo1118b(), componentCallbacksC0320m5);
        componentCallbacksC0320m5.f1977b = 0;
        componentCallbacksC0320m5.f1961E = false;
        componentCallbacksC0320m5.mo1113J(componentCallbacksC0320m5.f1996u.f2122c);
        if (!componentCallbacksC0320m5.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m5, " did not call through to super.onAttach()"));
        }
        AbstractC0301c0 abstractC0301c02 = componentCallbacksC0320m5.f1995t;
        Iterator<InterfaceC0309g0> it2 = abstractC0301c02.f1820o.iterator();
        while (it2.hasNext()) {
            it2.next().mo1070b(abstractC0301c02, componentCallbacksC0320m5);
        }
        AbstractC0301c0 abstractC0301c03 = componentCallbacksC0320m5.f1997v;
        abstractC0301c03.f1796B = false;
        abstractC0301c03.f1797C = false;
        abstractC0301c03.f1804J.f1872g = false;
        abstractC0301c03.m1063w(0);
        this.f1902a.m984b(this.f1904c, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [a.k.b.z0$d$b] */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.k.b.z0$d$b] */
    /* renamed from: d */
    public int m1087d() {
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        if (componentCallbacksC0320m.f1995t == null) {
            return componentCallbacksC0320m.f1977b;
        }
        int iMin = this.f1906e;
        int iOrdinal = componentCallbacksC0320m.f1971O.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        if (componentCallbacksC0320m2.f1990o) {
            if (componentCallbacksC0320m2.f1991p) {
                iMin = Math.max(this.f1906e, 2);
                View view = this.f1904c.f1963G;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1906e < 4 ? Math.min(iMin, componentCallbacksC0320m2.f1977b) : Math.min(iMin, 1);
            }
        }
        if (!this.f1904c.f1988m) {
            iMin = Math.min(iMin, 1);
        }
        ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
        ViewGroup viewGroup = componentCallbacksC0320m3.f1962F;
        AbstractC0347z0.d dVar = null;
        if (viewGroup != null) {
            AbstractC0347z0 abstractC0347z0M1250g = AbstractC0347z0.m1250g(viewGroup, componentCallbacksC0320m3.m1182t().m1017L());
            Objects.requireNonNull(abstractC0347z0M1250g);
            AbstractC0347z0.d dVarM1253d = abstractC0347z0M1250g.m1253d(this.f1904c);
            AbstractC0347z0.d dVar2 = dVarM1253d != null ? dVarM1253d.f2136b : null;
            ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
            Iterator<AbstractC0347z0.d> it = abstractC0347z0M1250g.f2127c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0347z0.d next = it.next();
                if (next.f2137c.equals(componentCallbacksC0320m4) && !next.f2140f) {
                    dVar = next;
                    break;
                }
            }
            dVar = (dVar == null || !(dVar2 == null || dVar2 == AbstractC0347z0.d.b.NONE)) ? dVar2 : dVar.f2136b;
        }
        if (dVar == AbstractC0347z0.d.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (dVar == AbstractC0347z0.d.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
            if (componentCallbacksC0320m5.f1989n) {
                iMin = componentCallbacksC0320m5.m1133D() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        ComponentCallbacksC0320m componentCallbacksC0320m6 = this.f1904c;
        if (componentCallbacksC0320m6.f1964H && componentCallbacksC0320m6.f1977b < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f1904c);
        }
        return iMin;
    }

    /* renamed from: e */
    public void m1088e() {
        Parcelable parcelable;
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("moveto CREATED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        if (componentCallbacksC0320m.f1970N) {
            Bundle bundle = componentCallbacksC0320m.f1978c;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                componentCallbacksC0320m.f1997v.m1032a0(parcelable);
                componentCallbacksC0320m.f1997v.m1053m();
            }
            this.f1904c.f1977b = 1;
            return;
        }
        this.f1902a.m990h(componentCallbacksC0320m, componentCallbacksC0320m.f1978c, false);
        final ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        Bundle bundle2 = componentCallbacksC0320m2.f1978c;
        componentCallbacksC0320m2.f1997v.m1025U();
        componentCallbacksC0320m2.f1977b = 1;
        componentCallbacksC0320m2.f1961E = false;
        componentCallbacksC0320m2.f1972P.mo1275a(new InterfaceC0356e() { // from class: androidx.fragment.app.Fragment$5
            @Override // p000a.p057m.InterfaceC0356e
            /* renamed from: g */
            public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
                View view;
                if (aVar != AbstractC0355d.a.ON_STOP || (view = componentCallbacksC0320m2.f1963G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        componentCallbacksC0320m2.f1975S.m1423a(bundle2);
        componentCallbacksC0320m2.mo1114M(bundle2);
        componentCallbacksC0320m2.f1970N = true;
        if (!componentCallbacksC0320m2.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m2, " did not call through to super.onCreate()"));
        }
        componentCallbacksC0320m2.f1972P.m1282d(AbstractC0355d.a.ON_CREATE);
        C0298b0 c0298b0 = this.f1902a;
        ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
        c0298b0.m985c(componentCallbacksC0320m3, componentCallbacksC0320m3.f1978c, false);
    }

    /* renamed from: f */
    public void m1089f() {
        String resourceName;
        if (this.f1904c.f1990o) {
            return;
        }
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("moveto CREATE_VIEW: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        LayoutInflater layoutInflaterMo1117T = componentCallbacksC0320m.mo1117T(componentCallbacksC0320m.f1978c);
        componentCallbacksC0320m.f1969M = layoutInflaterMo1117T;
        ViewGroup viewGroup = null;
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        ViewGroup viewGroup2 = componentCallbacksC0320m2.f1962F;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = componentCallbacksC0320m2.f2000y;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder sbM2079g2 = C0561a.m2079g("Cannot create fragment ");
                    sbM2079g2.append(this.f1904c);
                    sbM2079g2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sbM2079g2.toString());
                }
                viewGroup = (ViewGroup) componentCallbacksC0320m2.f1995t.f1823r.mo1127f(i);
                if (viewGroup == null) {
                    ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
                    if (!componentCallbacksC0320m3.f1992q) {
                        try {
                            resourceName = componentCallbacksC0320m3.m1191y().getResourceName(this.f1904c.f2000y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sbM2079g3 = C0561a.m2079g("No view found for id 0x");
                        sbM2079g3.append(Integer.toHexString(this.f1904c.f2000y));
                        sbM2079g3.append(" (");
                        sbM2079g3.append(resourceName);
                        sbM2079g3.append(") for fragment ");
                        sbM2079g3.append(this.f1904c);
                        throw new IllegalArgumentException(sbM2079g3.toString());
                    }
                }
            }
        }
        ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
        componentCallbacksC0320m4.f1962F = viewGroup;
        componentCallbacksC0320m4.mo1123g0(layoutInflaterMo1117T, viewGroup, componentCallbacksC0320m4.f1978c);
        View view = this.f1904c.f1963G;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
            componentCallbacksC0320m5.f1963G.setTag(C1088R.id.fragment_container_view_tag, componentCallbacksC0320m5);
            if (viewGroup != null) {
                m1085b();
            }
            ComponentCallbacksC0320m componentCallbacksC0320m6 = this.f1904c;
            if (componentCallbacksC0320m6.f1957A) {
                componentCallbacksC0320m6.f1963G.setVisibility(8);
            }
            View view2 = this.f1904c.f1963G;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (view2.isAttachedToWindow()) {
                this.f1904c.f1963G.requestApplyInsets();
            } else {
                View view3 = this.f1904c.f1963G;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            ComponentCallbacksC0320m componentCallbacksC0320m7 = this.f1904c;
            componentCallbacksC0320m7.mo1155e0(componentCallbacksC0320m7.f1963G, componentCallbacksC0320m7.f1978c);
            componentCallbacksC0320m7.f1997v.m1063w(2);
            C0298b0 c0298b0 = this.f1902a;
            ComponentCallbacksC0320m componentCallbacksC0320m8 = this.f1904c;
            c0298b0.m995m(componentCallbacksC0320m8, componentCallbacksC0320m8.f1963G, componentCallbacksC0320m8.f1978c, false);
            int visibility = this.f1904c.f1963G.getVisibility();
            this.f1904c.m1157g().f2016n = this.f1904c.f1963G.getAlpha();
            ComponentCallbacksC0320m componentCallbacksC0320m9 = this.f1904c;
            if (componentCallbacksC0320m9.f1962F != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC0320m9.f1963G.findFocus();
                if (viewFindFocus != null) {
                    this.f1904c.m1157g().f2017o = viewFindFocus;
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f1904c);
                    }
                }
                this.f1904c.f1963G.setAlpha(0.0f);
            }
        }
        this.f1904c.f1977b = 2;
    }

    /* renamed from: g */
    public void m1090g() {
        ComponentCallbacksC0320m componentCallbacksC0320mM1104d;
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("movefrom CREATED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        boolean zIsChangingConfigurations = true;
        boolean z = componentCallbacksC0320m.f1989n && !componentCallbacksC0320m.m1133D();
        if (!(z || this.f1903b.f1911c.m1074c(this.f1904c))) {
            String str = this.f1904c.f1985j;
            if (str != null && (componentCallbacksC0320mM1104d = this.f1903b.m1104d(str)) != null && componentCallbacksC0320mM1104d.f1959C) {
                this.f1904c.f1984i = componentCallbacksC0320mM1104d;
            }
            this.f1904c.f1977b = 0;
            return;
        }
        AbstractC0346z<?> abstractC0346z = this.f1904c.f1996u;
        if (abstractC0346z instanceof InterfaceC0372u) {
            zIsChangingConfigurations = this.f1903b.f1911c.f1871f;
        } else {
            Context context = abstractC0346z.f2122c;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            C0307f0 c0307f0 = this.f1903b.f1911c;
            ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
            Objects.requireNonNull(c0307f0);
            if (AbstractC0301c0.m1005N(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC0320m2);
            }
            C0307f0 c0307f02 = c0307f0.f1868c.get(componentCallbacksC0320m2.f1982g);
            if (c0307f02 != null) {
                c0307f02.mo1072a();
                c0307f0.f1868c.remove(componentCallbacksC0320m2.f1982g);
            }
            C0371t c0371t = c0307f0.f1869d.get(componentCallbacksC0320m2.f1982g);
            if (c0371t != null) {
                c0371t.m1295a();
                c0307f0.f1869d.remove(componentCallbacksC0320m2.f1982g);
            }
        }
        ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
        componentCallbacksC0320m3.f1997v.m1055o();
        componentCallbacksC0320m3.f1972P.m1282d(AbstractC0355d.a.ON_DESTROY);
        componentCallbacksC0320m3.f1977b = 0;
        componentCallbacksC0320m3.f1961E = false;
        componentCallbacksC0320m3.f1970N = false;
        componentCallbacksC0320m3.mo1144Q();
        if (!componentCallbacksC0320m3.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m3, " did not call through to super.onDestroy()"));
        }
        this.f1902a.m986d(this.f1904c, false);
        Iterator it = ((ArrayList) this.f1903b.m1106f()).iterator();
        while (it.hasNext()) {
            C0315j0 c0315j0 = (C0315j0) it.next();
            if (c0315j0 != null) {
                ComponentCallbacksC0320m componentCallbacksC0320m4 = c0315j0.f1904c;
                if (this.f1904c.f1982g.equals(componentCallbacksC0320m4.f1985j)) {
                    componentCallbacksC0320m4.f1984i = this.f1904c;
                    componentCallbacksC0320m4.f1985j = null;
                }
            }
        }
        ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
        String str2 = componentCallbacksC0320m5.f1985j;
        if (str2 != null) {
            componentCallbacksC0320m5.f1984i = this.f1903b.m1104d(str2);
        }
        this.f1903b.m1111k(this);
    }

    /* renamed from: h */
    public void m1091h() {
        View view;
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("movefrom CREATE_VIEW: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        ViewGroup viewGroup = componentCallbacksC0320m.f1962F;
        if (viewGroup != null && (view = componentCallbacksC0320m.f1963G) != null) {
            viewGroup.removeView(view);
        }
        this.f1904c.m1159h0();
        this.f1902a.m996n(this.f1904c, false);
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        componentCallbacksC0320m2.f1962F = null;
        componentCallbacksC0320m2.f1963G = null;
        componentCallbacksC0320m2.f1973Q = null;
        componentCallbacksC0320m2.f1974R.mo1290g(null);
        this.f1904c.f1991p = false;
    }

    /* renamed from: i */
    public void m1092i() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("movefrom ATTACHED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        componentCallbacksC0320m.f1977b = -1;
        componentCallbacksC0320m.f1961E = false;
        componentCallbacksC0320m.mo1116S();
        componentCallbacksC0320m.f1969M = null;
        if (!componentCallbacksC0320m.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m, " did not call through to super.onDetach()"));
        }
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
        if (!abstractC0301c0.f1798D) {
            abstractC0301c0.m1055o();
            componentCallbacksC0320m.f1997v = new C0303d0();
        }
        this.f1902a.m987e(this.f1904c, false);
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        componentCallbacksC0320m2.f1977b = -1;
        componentCallbacksC0320m2.f1996u = null;
        componentCallbacksC0320m2.f1998w = null;
        componentCallbacksC0320m2.f1995t = null;
        if ((componentCallbacksC0320m2.f1989n && !componentCallbacksC0320m2.m1133D()) || this.f1903b.f1911c.m1074c(this.f1904c)) {
            if (AbstractC0301c0.m1005N(3)) {
                StringBuilder sbM2079g2 = C0561a.m2079g("initState called for fragment: ");
                sbM2079g2.append(this.f1904c);
                Log.d("FragmentManager", sbM2079g2.toString());
            }
            ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
            Objects.requireNonNull(componentCallbacksC0320m3);
            componentCallbacksC0320m3.f1972P = new C0359h(componentCallbacksC0320m3);
            componentCallbacksC0320m3.f1975S = new C0405b(componentCallbacksC0320m3);
            componentCallbacksC0320m3.f1982g = UUID.randomUUID().toString();
            componentCallbacksC0320m3.f1988m = false;
            componentCallbacksC0320m3.f1989n = false;
            componentCallbacksC0320m3.f1990o = false;
            componentCallbacksC0320m3.f1991p = false;
            componentCallbacksC0320m3.f1992q = false;
            componentCallbacksC0320m3.f1994s = 0;
            componentCallbacksC0320m3.f1995t = null;
            componentCallbacksC0320m3.f1997v = new C0303d0();
            componentCallbacksC0320m3.f1996u = null;
            componentCallbacksC0320m3.f1999x = 0;
            componentCallbacksC0320m3.f2000y = 0;
            componentCallbacksC0320m3.f2001z = null;
            componentCallbacksC0320m3.f1957A = false;
            componentCallbacksC0320m3.f1958B = false;
        }
    }

    /* renamed from: j */
    public void m1093j() {
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        if (componentCallbacksC0320m.f1990o && componentCallbacksC0320m.f1991p && !componentCallbacksC0320m.f1993r) {
            if (AbstractC0301c0.m1005N(3)) {
                StringBuilder sbM2079g = C0561a.m2079g("moveto CREATE_VIEW: ");
                sbM2079g.append(this.f1904c);
                Log.d("FragmentManager", sbM2079g.toString());
            }
            ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
            LayoutInflater layoutInflaterMo1117T = componentCallbacksC0320m2.mo1117T(componentCallbacksC0320m2.f1978c);
            componentCallbacksC0320m2.f1969M = layoutInflaterMo1117T;
            componentCallbacksC0320m2.mo1123g0(layoutInflaterMo1117T, null, this.f1904c.f1978c);
            View view = this.f1904c.f1963G;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
                componentCallbacksC0320m3.f1963G.setTag(C1088R.id.fragment_container_view_tag, componentCallbacksC0320m3);
                ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
                if (componentCallbacksC0320m4.f1957A) {
                    componentCallbacksC0320m4.f1963G.setVisibility(8);
                }
                ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
                componentCallbacksC0320m5.mo1155e0(componentCallbacksC0320m5.f1963G, componentCallbacksC0320m5.f1978c);
                componentCallbacksC0320m5.f1997v.m1063w(2);
                C0298b0 c0298b0 = this.f1902a;
                ComponentCallbacksC0320m componentCallbacksC0320m6 = this.f1904c;
                c0298b0.m995m(componentCallbacksC0320m6, componentCallbacksC0320m6.f1963G, componentCallbacksC0320m6.f1978c, false);
                this.f1904c.f1977b = 2;
            }
        }
    }

    /* renamed from: k */
    public void m1094k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        AbstractC0347z0.d.b bVar = AbstractC0347z0.d.b.NONE;
        if (this.f1905d) {
            if (AbstractC0301c0.m1005N(2)) {
                StringBuilder sbM2079g = C0561a.m2079g("Ignoring re-entrant call to moveToExpectedState() for ");
                sbM2079g.append(this.f1904c);
                Log.v("FragmentManager", sbM2079g.toString());
                return;
            }
            return;
        }
        try {
            this.f1905d = true;
            while (true) {
                int iM1087d = m1087d();
                ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
                int i = componentCallbacksC0320m.f1977b;
                if (iM1087d == i) {
                    if (componentCallbacksC0320m.f1967K) {
                        if (componentCallbacksC0320m.f1963G != null && (viewGroup = componentCallbacksC0320m.f1962F) != null) {
                            AbstractC0347z0 abstractC0347z0M1250g = AbstractC0347z0.m1250g(viewGroup, componentCallbacksC0320m.m1182t().m1017L());
                            if (this.f1904c.f1957A) {
                                Objects.requireNonNull(abstractC0347z0M1250g);
                                if (AbstractC0301c0.m1005N(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1904c);
                                }
                                abstractC0347z0M1250g.m1251a(AbstractC0347z0.d.c.GONE, bVar, this);
                            } else {
                                Objects.requireNonNull(abstractC0347z0M1250g);
                                if (AbstractC0301c0.m1005N(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1904c);
                                }
                                abstractC0347z0M1250g.m1251a(AbstractC0347z0.d.c.VISIBLE, bVar, this);
                            }
                        }
                        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
                        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m2.f1995t;
                        if (abstractC0301c0 != null && componentCallbacksC0320m2.f1988m && abstractC0301c0.m1019O(componentCallbacksC0320m2)) {
                            abstractC0301c0.f1795A = true;
                        }
                        ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
                        componentCallbacksC0320m3.f1967K = false;
                        componentCallbacksC0320m3.m1145U();
                    }
                    return;
                }
                if (iM1087d <= i) {
                    switch (i - 1) {
                        case CalligraphyConfig.Builder.INVALID_ATTR_ID /* -1 */:
                            m1092i();
                            break;
                        case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                            m1090g();
                            break;
                        case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                            m1091h();
                            this.f1904c.f1977b = 1;
                            break;
                        case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                            componentCallbacksC0320m.f1991p = false;
                            componentCallbacksC0320m.f1977b = 2;
                            break;
                        case 3:
                            if (AbstractC0301c0.m1005N(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1904c);
                            }
                            ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
                            if (componentCallbacksC0320m4.f1963G != null && componentCallbacksC0320m4.f1979d == null) {
                                m1098o();
                            }
                            ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
                            if (componentCallbacksC0320m5.f1963G != null && (viewGroup3 = componentCallbacksC0320m5.f1962F) != null) {
                                AbstractC0347z0 abstractC0347z0M1250g2 = AbstractC0347z0.m1250g(viewGroup3, componentCallbacksC0320m5.m1182t().m1017L());
                                Objects.requireNonNull(abstractC0347z0M1250g2);
                                if (AbstractC0301c0.m1005N(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1904c);
                                }
                                abstractC0347z0M1250g2.m1251a(AbstractC0347z0.d.c.REMOVED, AbstractC0347z0.d.b.REMOVING, this);
                            }
                            this.f1904c.f1977b = 3;
                            break;
                        case 4:
                            m1100q();
                            break;
                        case 5:
                            componentCallbacksC0320m.f1977b = 5;
                            break;
                        case 6:
                            m1095l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                            m1086c();
                            break;
                        case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                            m1088e();
                            break;
                        case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                            m1093j();
                            m1089f();
                            break;
                        case 3:
                            m1084a();
                            break;
                        case 4:
                            if (componentCallbacksC0320m.f1963G != null && (viewGroup2 = componentCallbacksC0320m.f1962F) != null) {
                                AbstractC0347z0 abstractC0347z0M1250g3 = AbstractC0347z0.m1250g(viewGroup2, componentCallbacksC0320m.m1182t().m1017L());
                                AbstractC0347z0.d.c cVarM1261b = AbstractC0347z0.d.c.m1261b(this.f1904c.f1963G.getVisibility());
                                Objects.requireNonNull(abstractC0347z0M1250g3);
                                if (AbstractC0301c0.m1005N(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1904c);
                                }
                                abstractC0347z0M1250g3.m1251a(cVarM1261b, AbstractC0347z0.d.b.ADDING, this);
                            }
                            this.f1904c.f1977b = 4;
                            break;
                        case 5:
                            m1099p();
                            break;
                        case 6:
                            componentCallbacksC0320m.f1977b = 6;
                            break;
                        case 7:
                            m1097n();
                            break;
                    }
                }
            }
        } finally {
            this.f1905d = false;
        }
    }

    /* renamed from: l */
    public void m1095l() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("movefrom RESUMED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        componentCallbacksC0320m.f1997v.m1063w(5);
        if (componentCallbacksC0320m.f1963G != null) {
            componentCallbacksC0320m.f1973Q.m1244b(AbstractC0355d.a.ON_PAUSE);
        }
        componentCallbacksC0320m.f1972P.m1282d(AbstractC0355d.a.ON_PAUSE);
        componentCallbacksC0320m.f1977b = 6;
        componentCallbacksC0320m.f1961E = false;
        componentCallbacksC0320m.f1961E = true;
        this.f1902a.m988f(this.f1904c, false);
    }

    /* renamed from: m */
    public void m1096m(ClassLoader classLoader) {
        Bundle bundle = this.f1904c.f1978c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        componentCallbacksC0320m.f1979d = componentCallbacksC0320m.f1978c.getSparseParcelableArray("android:view_state");
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1904c;
        componentCallbacksC0320m2.f1980e = componentCallbacksC0320m2.f1978c.getBundle("android:view_registry_state");
        ComponentCallbacksC0320m componentCallbacksC0320m3 = this.f1904c;
        componentCallbacksC0320m3.f1985j = componentCallbacksC0320m3.f1978c.getString("android:target_state");
        ComponentCallbacksC0320m componentCallbacksC0320m4 = this.f1904c;
        if (componentCallbacksC0320m4.f1985j != null) {
            componentCallbacksC0320m4.f1986k = componentCallbacksC0320m4.f1978c.getInt("android:target_req_state", 0);
        }
        ComponentCallbacksC0320m componentCallbacksC0320m5 = this.f1904c;
        Boolean bool = componentCallbacksC0320m5.f1981f;
        if (bool != null) {
            componentCallbacksC0320m5.f1965I = bool.booleanValue();
            this.f1904c.f1981f = null;
        } else {
            componentCallbacksC0320m5.f1965I = componentCallbacksC0320m5.f1978c.getBoolean("android:user_visible_hint", true);
        }
        ComponentCallbacksC0320m componentCallbacksC0320m6 = this.f1904c;
        if (componentCallbacksC0320m6.f1965I) {
            return;
        }
        componentCallbacksC0320m6.f1964H = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1097n() {
        /*
            r8 = this;
            r0 = 3
            boolean r0 = p000a.p052k.p053b.AbstractC0301c0.m1005N(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            a.k.b.m r2 = r8.f1904c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1b:
            a.k.b.m r0 = r8.f1904c
            a.k.b.m$b r2 = r0.f1966J
            r3 = 0
            if (r2 != 0) goto L24
            r2 = r3
            goto L26
        L24:
            android.view.View r2 = r2.f2017o
        L26:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L8d
            android.view.View r0 = r0.f1963G
            if (r2 != r0) goto L2f
            goto L3b
        L2f:
            android.view.ViewParent r0 = r2.getParent()
        L33:
            if (r0 == 0) goto L42
            a.k.b.m r6 = r8.f1904c
            android.view.View r6 = r6.f1963G
            if (r0 != r6) goto L3d
        L3b:
            r0 = r4
            goto L43
        L3d:
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L42:
            r0 = r5
        L43:
            if (r0 == 0) goto L8d
            boolean r0 = r2.requestFocus()
            r6 = 2
            boolean r6 = p000a.p052k.p053b.AbstractC0301c0.m1005N(r6)
            if (r6 == 0) goto L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "requestFocus: Restoring focused view "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            if (r0 == 0) goto L67
            java.lang.String r0 = "succeeded"
            goto L69
        L67:
            java.lang.String r0 = "failed"
        L69:
            r6.append(r0)
            java.lang.String r0 = " on Fragment "
            r6.append(r0)
            a.k.b.m r0 = r8.f1904c
            r6.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r6.append(r0)
            a.k.b.m r0 = r8.f1904c
            android.view.View r0 = r0.f1963G
            android.view.View r0 = r0.findFocus()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r1, r0)
        L8d:
            a.k.b.m r0 = r8.f1904c
            r0.m1177q0(r3)
            a.k.b.m r0 = r8.f1904c
            a.k.b.c0 r1 = r0.f1997v
            r1.m1025U()
            a.k.b.c0 r1 = r0.f1997v
            r1.m1008C(r4)
            r1 = 7
            r0.f1977b = r1
            r0.f1961E = r5
            r0.f1961E = r4
            a.m.h r2 = r0.f1972P
            a.m.d$a r4 = p000a.p057m.AbstractC0355d.a.ON_RESUME
            r2.m1282d(r4)
            android.view.View r2 = r0.f1963G
            if (r2 == 0) goto Lb5
            a.k.b.x0 r2 = r0.f1973Q
            r2.m1244b(r4)
        Lb5:
            a.k.b.c0 r0 = r0.f1997v
            r0.f1796B = r5
            r0.f1797C = r5
            a.k.b.f0 r2 = r0.f1804J
            r2.f1872g = r5
            r0.m1063w(r1)
            a.k.b.b0 r0 = r8.f1902a
            a.k.b.m r1 = r8.f1904c
            r0.m991i(r1, r5)
            a.k.b.m r0 = r8.f1904c
            r0.f1978c = r3
            r0.f1979d = r3
            r0.f1980e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.C0315j0.m1097n():void");
    }

    /* renamed from: o */
    public void m1098o() {
        if (this.f1904c.f1963G == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1904c.f1963G.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1904c.f1979d = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1904c.f1973Q.f2117d.m1424b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1904c.f1980e = bundle;
    }

    /* renamed from: p */
    public void m1099p() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("moveto STARTED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        componentCallbacksC0320m.f1997v.m1025U();
        componentCallbacksC0320m.f1997v.m1008C(true);
        componentCallbacksC0320m.f1977b = 5;
        componentCallbacksC0320m.f1961E = false;
        componentCallbacksC0320m.mo1120c0();
        if (!componentCallbacksC0320m.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m, " did not call through to super.onStart()"));
        }
        C0359h c0359h = componentCallbacksC0320m.f1972P;
        AbstractC0355d.a aVar = AbstractC0355d.a.ON_START;
        c0359h.m1282d(aVar);
        if (componentCallbacksC0320m.f1963G != null) {
            componentCallbacksC0320m.f1973Q.m1244b(aVar);
        }
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
        abstractC0301c0.f1796B = false;
        abstractC0301c0.f1797C = false;
        abstractC0301c0.f1804J.f1872g = false;
        abstractC0301c0.m1063w(5);
        this.f1902a.m993k(this.f1904c, false);
    }

    /* renamed from: q */
    public void m1100q() {
        if (AbstractC0301c0.m1005N(3)) {
            StringBuilder sbM2079g = C0561a.m2079g("movefrom STARTED: ");
            sbM2079g.append(this.f1904c);
            Log.d("FragmentManager", sbM2079g.toString());
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1904c;
        AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1997v;
        abstractC0301c0.f1797C = true;
        abstractC0301c0.f1804J.f1872g = true;
        abstractC0301c0.m1063w(4);
        if (componentCallbacksC0320m.f1963G != null) {
            componentCallbacksC0320m.f1973Q.m1244b(AbstractC0355d.a.ON_STOP);
        }
        componentCallbacksC0320m.f1972P.m1282d(AbstractC0355d.a.ON_STOP);
        componentCallbacksC0320m.f1977b = 4;
        componentCallbacksC0320m.f1961E = false;
        componentCallbacksC0320m.mo1121d0();
        if (!componentCallbacksC0320m.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", componentCallbacksC0320m, " did not call through to super.onStop()"));
        }
        this.f1902a.m994l(this.f1904c, false);
    }
}
