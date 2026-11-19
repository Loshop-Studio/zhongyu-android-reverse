package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0496f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public abstract class AbstractC0470s {

    /* renamed from: a */
    private final C0458g f3217a;

    /* renamed from: b */
    private final ClassLoader f3218b;

    /* renamed from: d */
    int f3220d;

    /* renamed from: e */
    int f3221e;

    /* renamed from: f */
    int f3222f;

    /* renamed from: g */
    int f3223g;

    /* renamed from: h */
    int f3224h;

    /* renamed from: i */
    boolean f3225i;

    /* renamed from: k */
    String f3227k;

    /* renamed from: l */
    int f3228l;

    /* renamed from: m */
    CharSequence f3229m;

    /* renamed from: n */
    int f3230n;

    /* renamed from: o */
    CharSequence f3231o;

    /* renamed from: p */
    ArrayList<String> f3232p;

    /* renamed from: q */
    ArrayList<String> f3233q;

    /* renamed from: s */
    ArrayList<Runnable> f3235s;

    /* renamed from: c */
    ArrayList<a> f3219c = new ArrayList<>();

    /* renamed from: j */
    boolean f3226j = true;

    /* renamed from: r */
    boolean f3234r = false;

    /* renamed from: androidx.fragment.app.s$a */
    static final class a {

        /* renamed from: a */
        int f3236a;

        /* renamed from: b */
        Fragment f3237b;

        /* renamed from: c */
        int f3238c;

        /* renamed from: d */
        int f3239d;

        /* renamed from: e */
        int f3240e;

        /* renamed from: f */
        int f3241f;

        /* renamed from: g */
        AbstractC0496f.c f3242g;

        /* renamed from: h */
        AbstractC0496f.c f3243h;

        a() {
        }

        a(int i4, Fragment fragment) {
            this.f3236a = i4;
            this.f3237b = fragment;
            AbstractC0496f.c cVar = AbstractC0496f.c.RESUMED;
            this.f3242g = cVar;
            this.f3243h = cVar;
        }

        a(int i4, Fragment fragment, AbstractC0496f.c cVar) {
            this.f3236a = i4;
            this.f3237b = fragment;
            this.f3242g = fragment.mMaxState;
            this.f3243h = cVar;
        }
    }

    AbstractC0470s(C0458g c0458g, ClassLoader classLoader) {
        this.f3217a = c0458g;
        this.f3218b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0470s m2699b(int i4, Fragment fragment) {
        mo2555n(i4, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0470s m2700c(int i4, Fragment fragment, String str) {
        mo2555n(i4, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    AbstractC0470s m2701d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m2700c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC0470s m2702e(Fragment fragment, String str) {
        mo2555n(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    void m2703f(a aVar) {
        this.f3219c.add(aVar);
        aVar.f3238c = this.f3220d;
        aVar.f3239d = this.f3221e;
        aVar.f3240e = this.f3222f;
        aVar.f3241f = this.f3223g;
    }

    /* renamed from: g */
    public AbstractC0470s m2704g(Fragment fragment) {
        m2703f(new a(7, fragment));
        return this;
    }

    /* renamed from: h */
    public abstract int mo2550h();

    /* renamed from: i */
    public abstract int mo2551i();

    /* renamed from: j */
    public abstract void mo2552j();

    /* renamed from: k */
    public abstract void mo2553k();

    /* renamed from: l */
    public AbstractC0470s mo2554l(Fragment fragment) {
        m2703f(new a(6, fragment));
        return this;
    }

    /* renamed from: m */
    public AbstractC0470s m2705m() {
        if (this.f3225i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3226j = false;
        return this;
    }

    /* renamed from: n */
    void mo2555n(int i4, Fragment fragment, String str, int i5) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i6 = fragment.mFragmentId;
            if (i6 != 0 && i6 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i4);
            }
            fragment.mFragmentId = i4;
            fragment.mContainerId = i4;
        }
        m2703f(new a(i5, fragment));
    }

    /* renamed from: o */
    public AbstractC0470s mo2556o(Fragment fragment) {
        m2703f(new a(4, fragment));
        return this;
    }

    /* renamed from: p */
    public AbstractC0470s mo2557p(Fragment fragment) {
        m2703f(new a(3, fragment));
        return this;
    }

    /* renamed from: q */
    public AbstractC0470s m2706q(int i4, Fragment fragment) {
        return m2707r(i4, fragment, null);
    }

    /* renamed from: r */
    public AbstractC0470s m2707r(int i4, Fragment fragment, String str) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo2555n(i4, fragment, str, 2);
        return this;
    }

    /* renamed from: s */
    public AbstractC0470s mo2558s(Fragment fragment, AbstractC0496f.c cVar) {
        m2703f(new a(10, fragment, cVar));
        return this;
    }

    /* renamed from: t */
    public AbstractC0470s m2708t(boolean z3) {
        this.f3234r = z3;
        return this;
    }

    /* renamed from: u */
    public AbstractC0470s mo2559u(Fragment fragment) {
        m2703f(new a(5, fragment));
        return this;
    }
}
