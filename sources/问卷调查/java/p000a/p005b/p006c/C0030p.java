package p000a.p005b.p006c;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p005b.p014h.C0075d;
import p000a.p005b.p014h.C0079f;
import p000a.p005b.p014h.C0113w;
import p000a.p021e.C0136h;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.b.c.p */
/* loaded from: classes.dex */
public class C0030p {

    /* renamed from: b */
    public static final Class<?>[] f157b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f158c = {R.attr.onClick};

    /* renamed from: d */
    public static final String[] f159d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    public static final C0136h<String, Constructor<? extends View>> f160e = new C0136h<>();

    /* renamed from: a */
    public final Object[] f161a = new Object[2];

    /* renamed from: a.b.c.p$a */
    public static class a implements View.OnClickListener {

        /* renamed from: b */
        public final View f162b;

        /* renamed from: c */
        public final String f163c;

        /* renamed from: d */
        public Method f164d;

        /* renamed from: e */
        public Context f165e;

        public a(View view, String str) {
            this.f162b = view;
            this.f163c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String string;
            Method method;
            if (this.f164d == null) {
                Context context = this.f162b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f163c, View.class)) != null) {
                            this.f164d = method;
                            this.f165e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f162b.getId();
                if (id == -1) {
                    string = BuildConfig.FLAVOR;
                } else {
                    StringBuilder sbM2079g = C0561a.m2079g(" with id '");
                    sbM2079g.append(this.f162b.getContext().getResources().getResourceEntryName(id));
                    sbM2079g.append("'");
                    string = sbM2079g.toString();
                }
                StringBuilder sbM2079g2 = C0561a.m2079g("Could not find method ");
                sbM2079g2.append(this.f163c);
                sbM2079g2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM2079g2.append(this.f162b.getClass());
                sbM2079g2.append(string);
                throw new IllegalStateException(sbM2079g2.toString());
            }
            try {
                this.f164d.invoke(this.f165e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    /* renamed from: a */
    public C0075d mo101a(Context context, AttributeSet attributeSet) {
        return new C0075d(context, attributeSet);
    }

    /* renamed from: b */
    public C0079f mo102b(Context context, AttributeSet attributeSet) {
        return new C0079f(context, attributeSet);
    }

    /* renamed from: c */
    public AppCompatCheckBox mo103c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatRadioButton mo104d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: e */
    public C0113w mo105e(Context context, AttributeSet attributeSet) {
        return new C0113w(context, attributeSet);
    }

    /* renamed from: f */
    public View m106f() {
        return null;
    }

    /* renamed from: g */
    public final View m107g(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        C0136h<String, Constructor<? extends View>> c0136h = f160e;
        Constructor<? extends View> orDefault = c0136h.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f157b);
            c0136h.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f161a);
    }

    /* renamed from: h */
    public final void m108h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
