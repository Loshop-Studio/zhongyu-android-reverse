package p000a.p052k.p053b;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.C0363l;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0372u;
import p000a.p058n.p059a.AbstractC0373a;
import p000a.p058n.p059a.C0374b;
import p000a.p062p.C0404a;
import p000a.p062p.C0405b;
import p000a.p062p.InterfaceC0406c;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.m */
/* loaded from: classes.dex */
public class ComponentCallbacksC0320m implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0358g, InterfaceC0372u, InterfaceC0406c {

    /* renamed from: U */
    public static final Object f1956U = new Object();

    /* renamed from: A */
    public boolean f1957A;

    /* renamed from: B */
    public boolean f1958B;

    /* renamed from: C */
    public boolean f1959C;

    /* renamed from: E */
    public boolean f1961E;

    /* renamed from: F */
    public ViewGroup f1962F;

    /* renamed from: G */
    public View f1963G;

    /* renamed from: H */
    public boolean f1964H;

    /* renamed from: J */
    public b f1966J;

    /* renamed from: K */
    public boolean f1967K;

    /* renamed from: L */
    public float f1968L;

    /* renamed from: M */
    public LayoutInflater f1969M;

    /* renamed from: N */
    public boolean f1970N;

    /* renamed from: P */
    public C0359h f1972P;

    /* renamed from: Q */
    public C0343x0 f1973Q;

    /* renamed from: S */
    public C0405b f1975S;

    /* renamed from: T */
    public final ArrayList<d> f1976T;

    /* renamed from: c */
    public Bundle f1978c;

    /* renamed from: d */
    public SparseArray<Parcelable> f1979d;

    /* renamed from: e */
    public Bundle f1980e;

    /* renamed from: f */
    public Boolean f1981f;

    /* renamed from: h */
    public Bundle f1983h;

    /* renamed from: i */
    public ComponentCallbacksC0320m f1984i;

    /* renamed from: k */
    public int f1986k;

    /* renamed from: m */
    public boolean f1988m;

    /* renamed from: n */
    public boolean f1989n;

    /* renamed from: o */
    public boolean f1990o;

    /* renamed from: p */
    public boolean f1991p;

    /* renamed from: q */
    public boolean f1992q;

    /* renamed from: r */
    public boolean f1993r;

    /* renamed from: s */
    public int f1994s;

    /* renamed from: t */
    public AbstractC0301c0 f1995t;

    /* renamed from: u */
    public AbstractC0346z<?> f1996u;

    /* renamed from: w */
    public ComponentCallbacksC0320m f1998w;

    /* renamed from: x */
    public int f1999x;

    /* renamed from: y */
    public int f2000y;

    /* renamed from: z */
    public String f2001z;

    /* renamed from: b */
    public int f1977b = -1;

    /* renamed from: g */
    public String f1982g = UUID.randomUUID().toString();

    /* renamed from: j */
    public String f1985j = null;

    /* renamed from: l */
    public Boolean f1987l = null;

    /* renamed from: v */
    public AbstractC0301c0 f1997v = new C0303d0();

    /* renamed from: D */
    public boolean f1960D = true;

    /* renamed from: I */
    public boolean f1965I = true;

    /* renamed from: O */
    public AbstractC0355d.b f1971O = AbstractC0355d.b.RESUMED;

    /* renamed from: R */
    public C0363l<InterfaceC0358g> f1974R = new C0363l<>();

    /* renamed from: a.k.b.m$a */
    public class a extends AbstractC0338v {
        public a() {
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: f */
        public View mo1127f(int i) {
            View view = ComponentCallbacksC0320m.this.f1963G;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sbM2079g = C0561a.m2079g("Fragment ");
            sbM2079g.append(ComponentCallbacksC0320m.this);
            sbM2079g.append(" does not have a view");
            throw new IllegalStateException(sbM2079g.toString());
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: h */
        public boolean mo1128h() {
            return ComponentCallbacksC0320m.this.f1963G != null;
        }
    }

    /* renamed from: a.k.b.m$b */
    public static class b {

        /* renamed from: a */
        public View f2003a;

        /* renamed from: b */
        public Animator f2004b;

        /* renamed from: c */
        public boolean f2005c;

        /* renamed from: d */
        public int f2006d;

        /* renamed from: e */
        public int f2007e;

        /* renamed from: f */
        public int f2008f;

        /* renamed from: g */
        public int f2009g;

        /* renamed from: h */
        public int f2010h;

        /* renamed from: i */
        public ArrayList<String> f2011i;

        /* renamed from: j */
        public ArrayList<String> f2012j;

        /* renamed from: k */
        public Object f2013k;

        /* renamed from: l */
        public Object f2014l;

        /* renamed from: m */
        public Object f2015m;

        /* renamed from: n */
        public float f2016n;

        /* renamed from: o */
        public View f2017o;

        /* renamed from: p */
        public e f2018p;

        /* renamed from: q */
        public boolean f2019q;

        public b() {
            Object obj = ComponentCallbacksC0320m.f1956U;
            this.f2013k = obj;
            this.f2014l = obj;
            this.f2015m = obj;
            this.f2016n = 1.0f;
            this.f2017o = null;
        }
    }

    /* renamed from: a.k.b.m$c */
    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a.k.b.m$d */
    public static abstract class d {
        /* renamed from: a */
        public abstract void m1193a();
    }

    /* renamed from: a.k.b.m$e */
    public interface e {
    }

    public ComponentCallbacksC0320m() {
        new AtomicInteger();
        this.f1976T = new ArrayList<>();
        this.f1972P = new C0359h(this);
        this.f1975S = new C0405b(this);
    }

    /* renamed from: A */
    public Object m1130A() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* renamed from: B */
    public Object m1131B() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2015m;
        if (obj != f1956U) {
            return obj;
        }
        m1130A();
        return null;
    }

    /* renamed from: C */
    public final String m1132C(int i) {
        return m1191y().getString(i);
    }

    /* renamed from: D */
    public final boolean m1133D() {
        return this.f1994s > 0;
    }

    /* renamed from: E */
    public boolean m1134E() {
        b bVar = this.f1966J;
        return false;
    }

    /* renamed from: F */
    public final boolean m1135F() {
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f1998w;
        return componentCallbacksC0320m != null && (componentCallbacksC0320m.f1989n || componentCallbacksC0320m.m1135F());
    }

    @Deprecated
    /* renamed from: G */
    public void m1136G() {
        this.f1961E = true;
    }

    @Deprecated
    /* renamed from: H */
    public void m1137H(int i, int i2, Intent intent) {
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    /* renamed from: I */
    public void m1138I() {
        this.f1961E = true;
    }

    /* renamed from: J */
    public void mo1113J(Context context) {
        this.f1961E = true;
        AbstractC0346z<?> abstractC0346z = this.f1996u;
        if ((abstractC0346z == null ? null : abstractC0346z.f2121b) != null) {
            this.f1961E = false;
            m1138I();
        }
    }

    @Deprecated
    /* renamed from: K */
    public void m1139K() {
    }

    /* renamed from: L */
    public boolean m1140L() {
        return false;
    }

    /* renamed from: M */
    public void mo1114M(Bundle bundle) {
        Parcelable parcelable;
        this.f1961E = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1997v.m1032a0(parcelable);
            this.f1997v.m1053m();
        }
        AbstractC0301c0 abstractC0301c0 = this.f1997v;
        if (abstractC0301c0.f1821p >= 1) {
            return;
        }
        abstractC0301c0.m1053m();
    }

    /* renamed from: N */
    public Animation m1141N() {
        return null;
    }

    /* renamed from: O */
    public Animator m1142O() {
        return null;
    }

    /* renamed from: P */
    public View mo1143P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: Q */
    public void mo1144Q() {
        this.f1961E = true;
    }

    /* renamed from: R */
    public void mo1115R() {
        this.f1961E = true;
    }

    /* renamed from: S */
    public void mo1116S() {
        this.f1961E = true;
    }

    /* renamed from: T */
    public LayoutInflater mo1117T(Bundle bundle) {
        return m1178r();
    }

    /* renamed from: U */
    public void m1145U() {
    }

    @Deprecated
    /* renamed from: V */
    public void m1146V() {
        this.f1961E = true;
    }

    /* renamed from: W */
    public void m1147W(AttributeSet attributeSet, Bundle bundle) {
        this.f1961E = true;
        AbstractC0346z<?> abstractC0346z = this.f1996u;
        if ((abstractC0346z == null ? null : abstractC0346z.f2121b) != null) {
            this.f1961E = false;
            m1146V();
        }
    }

    /* renamed from: X */
    public void m1148X() {
    }

    /* renamed from: Y */
    public void m1149Y() {
    }

    /* renamed from: Z */
    public void m1150Z() {
    }

    @Override // p000a.p057m.InterfaceC0358g
    /* renamed from: a */
    public AbstractC0355d mo1151a() {
        return this.f1972P;
    }

    @Deprecated
    /* renamed from: a0 */
    public void m1152a0() {
    }

    /* renamed from: b */
    public AbstractC0338v mo1118b() {
        return new a();
    }

    /* renamed from: b0 */
    public void mo1119b0(Bundle bundle) {
    }

    /* renamed from: c0 */
    public void mo1120c0() {
        this.f1961E = true;
    }

    @Override // p000a.p062p.InterfaceC0406c
    /* renamed from: d */
    public final C0404a mo1153d() {
        return this.f1975S.f2360b;
    }

    /* renamed from: d0 */
    public void mo1121d0() {
        this.f1961E = true;
    }

    @Override // p000a.p057m.InterfaceC0372u
    /* renamed from: e */
    public C0371t mo1154e() {
        if (this.f1995t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1180s() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        C0307f0 c0307f0 = this.f1995t.f1804J;
        C0371t c0371t = c0307f0.f1869d.get(this.f1982g);
        if (c0371t != null) {
            return c0371t;
        }
        C0371t c0371t2 = new C0371t();
        c0307f0.f1869d.put(this.f1982g, c0371t2);
        return c0371t2;
    }

    /* renamed from: e0 */
    public void mo1155e0(View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void m1156f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1999x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2000y));
        printWriter.print(" mTag=");
        printWriter.println(this.f2001z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1977b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1982g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1994s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1988m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1989n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1990o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1991p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1957A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1958B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1960D);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1959C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1965I);
        if (this.f1995t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1995t);
        }
        if (this.f1996u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1996u);
        }
        if (this.f1998w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1998w);
        }
        if (this.f1983h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1983h);
        }
        if (this.f1978c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1978c);
        }
        if (this.f1979d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1979d);
        }
        if (this.f1980e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1980e);
        }
        ComponentCallbacksC0320m componentCallbacksC0320mM1104d = this.f1984i;
        if (componentCallbacksC0320mM1104d == null) {
            AbstractC0301c0 abstractC0301c0 = this.f1995t;
            componentCallbacksC0320mM1104d = (abstractC0301c0 == null || (str2 = this.f1985j) == null) ? null : abstractC0301c0.f1808c.m1104d(str2);
        }
        if (componentCallbacksC0320mM1104d != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC0320mM1104d);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1986k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m1184u());
        if (m1166l() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m1166l());
        }
        if (m1172o() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m1172o());
        }
        if (m1186v() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m1186v());
        }
        if (m1188w() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m1188w());
        }
        if (this.f1962F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1962F);
        }
        if (this.f1963G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1963G);
        }
        if (m1160i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m1160i());
        }
        if (m1164k() != null) {
            AbstractC0373a.m1296b(this).mo1297a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1997v + ":");
        this.f1997v.m1065y(C0561a.m2076d(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f0 */
    public void mo1122f0(Bundle bundle) {
        this.f1961E = true;
    }

    /* renamed from: g */
    public final b m1157g() {
        if (this.f1966J == null) {
            this.f1966J = new b();
        }
        return this.f1966J;
    }

    /* renamed from: g0 */
    public void mo1123g0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1997v.m1025U();
        this.f1993r = true;
        this.f1973Q = new C0343x0(this, mo1154e());
        View viewMo1143P = mo1143P(layoutInflater, viewGroup, bundle);
        this.f1963G = viewMo1143P;
        if (viewMo1143P == null) {
            if (this.f1973Q.f2116c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1973Q = null;
        } else {
            this.f1973Q.m1245f();
            this.f1963G.setTag(C1088R.id.view_tree_lifecycle_owner, this.f1973Q);
            this.f1963G.setTag(C1088R.id.view_tree_view_model_store_owner, this.f1973Q);
            this.f1963G.setTag(C1088R.id.view_tree_saved_state_registry_owner, this.f1973Q);
            this.f1974R.mo1290g(this.f1973Q);
        }
    }

    /* renamed from: h */
    public final ActivityC0326p m1158h() {
        AbstractC0346z<?> abstractC0346z = this.f1996u;
        if (abstractC0346z == null) {
            return null;
        }
        return (ActivityC0326p) abstractC0346z.f2121b;
    }

    /* renamed from: h0 */
    public void m1159h0() {
        this.f1997v.m1063w(1);
        if (this.f1963G != null) {
            C0343x0 c0343x0 = this.f1973Q;
            c0343x0.m1245f();
            if (c0343x0.f2116c.f2171b.compareTo(AbstractC0355d.b.CREATED) >= 0) {
                this.f1973Q.m1244b(AbstractC0355d.a.ON_DESTROY);
            }
        }
        this.f1977b = 1;
        this.f1961E = false;
        mo1115R();
        if (!this.f1961E) {
            throw new C0299b1(C0561a.m2075c("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        C0374b.b bVar = ((C0374b) AbstractC0373a.m1296b(this)).f2185b;
        int iM524g = bVar.f2187b.m524g();
        for (int i = 0; i < iM524g; i++) {
            Objects.requireNonNull(bVar.f2187b.m525h(i));
        }
        this.f1993r = false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public View m1160i() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        return bVar.f2003a;
    }

    /* renamed from: i0 */
    public void m1161i0() {
        onLowMemory();
        this.f1997v.m1056p();
    }

    /* renamed from: j */
    public final AbstractC0301c0 m1162j() {
        if (this.f1996u != null) {
            return this.f1997v;
        }
        throw new IllegalStateException(C0561a.m2075c("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: j0 */
    public boolean m1163j0(Menu menu) {
        if (this.f1957A) {
            return false;
        }
        return false | this.f1997v.m1062v(menu);
    }

    /* renamed from: k */
    public Context m1164k() {
        AbstractC0346z<?> abstractC0346z = this.f1996u;
        if (abstractC0346z == null) {
            return null;
        }
        return abstractC0346z.f2122c;
    }

    /* renamed from: k0 */
    public final Context m1165k0() {
        Context contextM1164k = m1164k();
        if (contextM1164k != null) {
            return contextM1164k;
        }
        throw new IllegalStateException(C0561a.m2075c("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: l */
    public int m1166l() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2006d;
    }

    /* renamed from: l0 */
    public final View m1167l0() {
        View view = this.f1963G;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0561a.m2075c("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: m */
    public Object m1168m() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* renamed from: m0 */
    public void m1169m0(View view) {
        m1157g().f2003a = view;
    }

    /* renamed from: n */
    public void m1170n() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    /* renamed from: n0 */
    public void m1171n0(int i, int i2, int i3, int i4) {
        if (this.f1966J == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m1157g().f2006d = i;
        m1157g().f2007e = i2;
        m1157g().f2008f = i3;
        m1157g().f2009g = i4;
    }

    /* renamed from: o */
    public int m1172o() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2007e;
    }

    /* renamed from: o0 */
    public void m1173o0(Animator animator) {
        m1157g().f2004b = animator;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f1961E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ActivityC0326p activityC0326pM1158h = m1158h();
        if (activityC0326pM1158h == null) {
            throw new IllegalStateException(C0561a.m2075c("Fragment ", this, " not attached to an activity."));
        }
        activityC0326pM1158h.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f1961E = true;
    }

    /* renamed from: p */
    public Object m1174p() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* renamed from: p0 */
    public void m1175p0(Bundle bundle) {
        AbstractC0301c0 abstractC0301c0 = this.f1995t;
        if (abstractC0301c0 != null) {
            if (abstractC0301c0 == null ? false : abstractC0301c0.m1022R()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1983h = bundle;
    }

    /* renamed from: q */
    public void m1176q() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    /* renamed from: q0 */
    public void m1177q0(View view) {
        m1157g().f2017o = null;
    }

    @Deprecated
    /* renamed from: r */
    public LayoutInflater m1178r() {
        AbstractC0346z<?> abstractC0346z = this.f1996u;
        if (abstractC0346z == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo1197j = abstractC0346z.mo1197j();
        layoutInflaterMo1197j.setFactory2(this.f1997v.f1811f);
        return layoutInflaterMo1197j;
    }

    /* renamed from: r0 */
    public void m1179r0(boolean z) {
        m1157g().f2019q = z;
    }

    /* renamed from: s */
    public final int m1180s() {
        AbstractC0355d.b bVar = this.f1971O;
        return (bVar == AbstractC0355d.b.INITIALIZED || this.f1998w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f1998w.m1180s());
    }

    /* renamed from: s0 */
    public void m1181s0(boolean z) {
        if (this.f1960D != z) {
            this.f1960D = z;
        }
    }

    /* renamed from: t */
    public final AbstractC0301c0 m1182t() {
        AbstractC0301c0 abstractC0301c0 = this.f1995t;
        if (abstractC0301c0 != null) {
            return abstractC0301c0;
        }
        throw new IllegalStateException(C0561a.m2075c("Fragment ", this, " not associated with a fragment manager."));
    }

    /* renamed from: t0 */
    public void m1183t0(e eVar) {
        m1157g();
        e eVar2 = this.f1966J.f2018p;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar != null) {
            ((AbstractC0301c0.n) eVar).f1847c++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1982g);
        if (this.f1999x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1999x));
        }
        if (this.f2001z != null) {
            sb.append(" tag=");
            sb.append(this.f2001z);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m1184u() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return false;
        }
        return bVar.f2005c;
    }

    /* renamed from: u0 */
    public void m1185u0(boolean z) {
        if (this.f1966J == null) {
            return;
        }
        m1157g().f2005c = z;
    }

    /* renamed from: v */
    public int m1186v() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2008f;
    }

    @Deprecated
    /* renamed from: v0 */
    public void mo1187v0(boolean z) {
        AbstractC0301c0 abstractC0301c0;
        if (!this.f1965I && z && this.f1977b < 5 && (abstractC0301c0 = this.f1995t) != null) {
            if ((this.f1996u != null && this.f1988m) && this.f1970N) {
                abstractC0301c0.m1026V(abstractC0301c0.m1045h(this));
            }
        }
        this.f1965I = z;
        this.f1964H = this.f1977b < 5 && !z;
        if (this.f1978c != null) {
            this.f1981f = Boolean.valueOf(z);
        }
    }

    /* renamed from: w */
    public int m1188w() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2009g;
    }

    /* renamed from: w0 */
    public void m1189w0() {
        if (this.f1966J != null) {
            Objects.requireNonNull(m1157g());
        }
    }

    /* renamed from: x */
    public Object m1190x() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2014l;
        if (obj != f1956U) {
            return obj;
        }
        m1174p();
        return null;
    }

    /* renamed from: y */
    public final Resources m1191y() {
        return m1165k0().getResources();
    }

    /* renamed from: z */
    public Object m1192z() {
        b bVar = this.f1966J;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2013k;
        if (obj != f1956U) {
            return obj;
        }
        m1168m();
        return null;
    }
}
