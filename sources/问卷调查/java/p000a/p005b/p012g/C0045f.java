package p000a.p005b.p012g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.MenuItemC0057j;
import p000a.p031h.p037e.p038a.InterfaceMenuC0214a;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p043j.AbstractC0248b;

/* renamed from: a.b.g.f */
/* loaded from: classes.dex */
public class C0045f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f304e;

    /* renamed from: f */
    public static final Class<?>[] f305f;

    /* renamed from: a */
    public final Object[] f306a;

    /* renamed from: b */
    public final Object[] f307b;

    /* renamed from: c */
    public Context f308c;

    /* renamed from: d */
    public Object f309d;

    /* renamed from: a.b.g.f$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f310c = {MenuItem.class};

        /* renamed from: a */
        public Object f311a;

        /* renamed from: b */
        public Method f312b;

        public a(Object obj, String str) {
            this.f311a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f312b = cls.getMethod(str, f310c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f312b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f312b.invoke(this.f311a, menuItem)).booleanValue();
                }
                this.f312b.invoke(this.f311a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a.b.g.f$b */
    public class b {

        /* renamed from: A */
        public AbstractC0248b f313A;

        /* renamed from: B */
        public CharSequence f314B;

        /* renamed from: C */
        public CharSequence f315C;

        /* renamed from: a */
        public Menu f319a;

        /* renamed from: h */
        public boolean f326h;

        /* renamed from: i */
        public int f327i;

        /* renamed from: j */
        public int f328j;

        /* renamed from: k */
        public CharSequence f329k;

        /* renamed from: l */
        public CharSequence f330l;

        /* renamed from: m */
        public int f331m;

        /* renamed from: n */
        public char f332n;

        /* renamed from: o */
        public int f333o;

        /* renamed from: p */
        public char f334p;

        /* renamed from: q */
        public int f335q;

        /* renamed from: r */
        public int f336r;

        /* renamed from: s */
        public boolean f337s;

        /* renamed from: t */
        public boolean f338t;

        /* renamed from: u */
        public boolean f339u;

        /* renamed from: v */
        public int f340v;

        /* renamed from: w */
        public int f341w;

        /* renamed from: x */
        public String f342x;

        /* renamed from: y */
        public String f343y;

        /* renamed from: z */
        public String f344z;

        /* renamed from: D */
        public ColorStateList f316D = null;

        /* renamed from: E */
        public PorterDuff.Mode f317E = null;

        /* renamed from: b */
        public int f320b = 0;

        /* renamed from: c */
        public int f321c = 0;

        /* renamed from: d */
        public int f322d = 0;

        /* renamed from: e */
        public int f323e = 0;

        /* renamed from: f */
        public boolean f324f = true;

        /* renamed from: g */
        public boolean f325g = true;

        public b(Menu menu) {
            this.f319a = menu;
        }

        /* renamed from: a */
        public SubMenu m158a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f326h = true;
            SubMenu subMenuAddSubMenu = this.f319a.addSubMenu(this.f320b, this.f327i, this.f328j, this.f329k);
            m160c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* renamed from: b */
        public final <T> T m159b(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0045f.this.f308c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        /* renamed from: c */
        public final void m160c(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            menuItem.setChecked(this.f337s).setVisible(this.f338t).setEnabled(this.f339u).setCheckable(this.f336r >= 1).setTitleCondensed(this.f330l).setIcon(this.f331m);
            int i2 = this.f340v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f344z != null) {
                if (C0045f.this.f308c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0045f c0045f = C0045f.this;
                if (c0045f.f309d == null) {
                    c0045f.f309d = c0045f.m156a(c0045f.f308c);
                }
                menuItem.setOnMenuItemClickListener(new a(c0045f.f309d, this.f344z));
            }
            if (this.f336r >= 2) {
                if (menuItem instanceof C0056i) {
                    C0056i c0056i = (C0056i) menuItem;
                    c0056i.f487x = (c0056i.f487x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC0057j) {
                    MenuItemC0057j menuItemC0057j = (MenuItemC0057j) menuItem;
                    try {
                        if (menuItemC0057j.f492e == null) {
                            menuItemC0057j.f492e = menuItemC0057j.f491d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0057j.f492e.invoke(menuItemC0057j.f491d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.f342x;
            if (str != null) {
                menuItem.setActionView((View) m159b(str, C0045f.f304e, C0045f.this.f306a));
                z = true;
            }
            int i3 = this.f341w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            AbstractC0248b abstractC0248b = this.f313A;
            if (abstractC0248b != null) {
                if (menuItem instanceof InterfaceMenuItemC0215b) {
                    ((InterfaceMenuItemC0215b) menuItem).mo164b(abstractC0248b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f314B;
            boolean z2 = menuItem instanceof InterfaceMenuItemC0215b;
            if (z2) {
                ((InterfaceMenuItemC0215b) menuItem).setContentDescription(charSequence);
            } else if (i >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f315C;
            if (z2) {
                ((InterfaceMenuItemC0215b) menuItem).setTooltipText(charSequence2);
            } else if (i >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f332n;
            int i4 = this.f333o;
            if (z2) {
                ((InterfaceMenuItemC0215b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (i >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.f334p;
            int i5 = this.f335q;
            if (z2) {
                ((InterfaceMenuItemC0215b) menuItem).setNumericShortcut(c3, i5);
            } else if (i >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.f317E;
            if (mode != null) {
                if (z2) {
                    ((InterfaceMenuItemC0215b) menuItem).setIconTintMode(mode);
                } else if (i >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f316D;
            if (colorStateList != null) {
                if (z2) {
                    ((InterfaceMenuItemC0215b) menuItem).setIconTintList(colorStateList);
                } else if (i >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f304e = clsArr;
        f305f = clsArr;
    }

    public C0045f(Context context) {
        super(context);
        this.f308c = context;
        Object[] objArr = {context};
        this.f306a = objArr;
        this.f307b = objArr;
    }

    /* renamed from: a */
    public final Object m156a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m156a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[PHI: r9
      0x00e4: PHI (r9v2 boolean) = 
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v4 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
     binds: [B:40:0x00a4, B:80:0x0209, B:44:0x00b3, B:17:0x0045, B:38:0x00a0, B:39:0x00a2, B:30:0x0078, B:36:0x0088, B:35:0x0084, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m157b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p012g.C0045f.m157b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0214a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f308c.getResources().getLayout(i);
                    m157b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
