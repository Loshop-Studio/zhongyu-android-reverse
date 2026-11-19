package p088g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.MenuItemC0128j;
import androidx.appcompat.widget.C0214g0;
import androidx.appcompat.widget.C0231q;
import androidx.core.view.AbstractC0337b;
import androidx.core.view.C0346i;
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015c.C1047j;
import p160v.InterfaceMenuC3414a;

/* renamed from: g.g */
/* loaded from: classes.dex */
public class C2625g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f10345e;

    /* renamed from: f */
    static final Class<?>[] f10346f;

    /* renamed from: a */
    final Object[] f10347a;

    /* renamed from: b */
    final Object[] f10348b;

    /* renamed from: c */
    Context f10349c;

    /* renamed from: d */
    private Object f10350d;

    /* renamed from: g.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f10351c = {MenuItem.class};

        /* renamed from: a */
        private Object f10352a;

        /* renamed from: b */
        private Method f10353b;

        public a(Object obj, String str) {
            this.f10352a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10353b = cls.getMethod(str, f10351c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f10353b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10353b.invoke(this.f10352a, menuItem)).booleanValue();
                }
                this.f10353b.invoke(this.f10352a, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* renamed from: g.g$b */
    private class b {

        /* renamed from: A */
        AbstractC0337b f10354A;

        /* renamed from: B */
        private CharSequence f10355B;

        /* renamed from: C */
        private CharSequence f10356C;

        /* renamed from: D */
        private ColorStateList f10357D = null;

        /* renamed from: E */
        private PorterDuff.Mode f10358E = null;

        /* renamed from: a */
        private Menu f10360a;

        /* renamed from: b */
        private int f10361b;

        /* renamed from: c */
        private int f10362c;

        /* renamed from: d */
        private int f10363d;

        /* renamed from: e */
        private int f10364e;

        /* renamed from: f */
        private boolean f10365f;

        /* renamed from: g */
        private boolean f10366g;

        /* renamed from: h */
        private boolean f10367h;

        /* renamed from: i */
        private int f10368i;

        /* renamed from: j */
        private int f10369j;

        /* renamed from: k */
        private CharSequence f10370k;

        /* renamed from: l */
        private CharSequence f10371l;

        /* renamed from: m */
        private int f10372m;

        /* renamed from: n */
        private char f10373n;

        /* renamed from: o */
        private int f10374o;

        /* renamed from: p */
        private char f10375p;

        /* renamed from: q */
        private int f10376q;

        /* renamed from: r */
        private int f10377r;

        /* renamed from: s */
        private boolean f10378s;

        /* renamed from: t */
        private boolean f10379t;

        /* renamed from: u */
        private boolean f10380u;

        /* renamed from: v */
        private int f10381v;

        /* renamed from: w */
        private int f10382w;

        /* renamed from: x */
        private String f10383x;

        /* renamed from: y */
        private String f10384y;

        /* renamed from: z */
        private String f10385z;

        public b(Menu menu) {
            this.f10360a = menu;
            m8800h();
        }

        /* renamed from: c */
        private char m8792c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m8793e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, C2625g.this.f10349c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        /* renamed from: i */
        private void m8794i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z3 = false;
            menuItem.setChecked(this.f10378s).setVisible(this.f10379t).setEnabled(this.f10380u).setCheckable(this.f10377r >= 1).setTitleCondensed(this.f10371l).setIcon(this.f10372m);
            int i4 = this.f10381v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f10385z != null) {
                if (C2625g.this.f10349c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C2625g.this.m8791b(), this.f10385z));
            }
            if (this.f10377r >= 2) {
                if (menuItem instanceof C0127i) {
                    ((C0127i) menuItem).m495t(true);
                } else if (menuItem instanceof MenuItemC0128j) {
                    ((MenuItemC0128j) menuItem).m502h(true);
                }
            }
            String str = this.f10383x;
            if (str != null) {
                menuItem.setActionView((View) m8793e(str, C2625g.f10345e, C2625g.this.f10347a));
                z3 = true;
            }
            int i5 = this.f10382w;
            if (i5 > 0) {
                if (z3) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i5);
                }
            }
            AbstractC0337b abstractC0337b = this.f10354A;
            if (abstractC0337b != null) {
                C0346i.m1940a(menuItem, abstractC0337b);
            }
            C0346i.m1942c(menuItem, this.f10355B);
            C0346i.m1946g(menuItem, this.f10356C);
            C0346i.m1941b(menuItem, this.f10373n, this.f10374o);
            C0346i.m1945f(menuItem, this.f10375p, this.f10376q);
            PorterDuff.Mode mode = this.f10358E;
            if (mode != null) {
                C0346i.m1944e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f10357D;
            if (colorStateList != null) {
                C0346i.m1943d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m8795a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f10367h = true;
            m8794i(this.f10360a.add(this.f10361b, this.f10368i, this.f10369j, this.f10370k));
        }

        /* renamed from: b */
        public SubMenu m8796b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f10367h = true;
            SubMenu subMenuAddSubMenu = this.f10360a.addSubMenu(this.f10361b, this.f10368i, this.f10369j, this.f10370k);
            m8794i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* renamed from: d */
        public boolean m8797d() {
            return this.f10367h;
        }

        /* renamed from: f */
        public void m8798f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C2625g.this.f10349c.obtainStyledAttributes(attributeSet, C1047j.f6150t1);
            this.f10361b = typedArrayObtainStyledAttributes.getResourceId(C1047j.f6160v1, 0);
            this.f10362c = typedArrayObtainStyledAttributes.getInt(C1047j.f6170x1, 0);
            this.f10363d = typedArrayObtainStyledAttributes.getInt(C1047j.f6175y1, 0);
            this.f10364e = typedArrayObtainStyledAttributes.getInt(C1047j.f6180z1, 0);
            this.f10365f = typedArrayObtainStyledAttributes.getBoolean(C1047j.f6165w1, true);
            this.f10366g = typedArrayObtainStyledAttributes.getBoolean(C1047j.f6155u1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m8799g(AttributeSet attributeSet) {
            C0214g0 c0214g0M814u = C0214g0.m814u(C2625g.this.f10349c, attributeSet, C1047j.f5924A1);
            this.f10368i = c0214g0M814u.m829n(C1047j.f5939D1, 0);
            this.f10369j = (c0214g0M814u.m826k(C1047j.f5954G1, this.f10362c) & (-65536)) | (c0214g0M814u.m826k(C1047j.f5959H1, this.f10363d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f10370k = c0214g0M814u.m831p(C1047j.f5964I1);
            this.f10371l = c0214g0M814u.m831p(C1047j.f5969J1);
            this.f10372m = c0214g0M814u.m829n(C1047j.f5929B1, 0);
            this.f10373n = m8792c(c0214g0M814u.m830o(C1047j.f5974K1));
            this.f10374o = c0214g0M814u.m826k(C1047j.f6009R1, 4096);
            this.f10375p = m8792c(c0214g0M814u.m830o(C1047j.f5979L1));
            this.f10376q = c0214g0M814u.m826k(C1047j.f6029V1, 4096);
            int i4 = C1047j.f5984M1;
            if (c0214g0M814u.m834s(i4)) {
                this.f10377r = c0214g0M814u.m816a(i4, false) ? 1 : 0;
            } else {
                this.f10377r = this.f10364e;
            }
            this.f10378s = c0214g0M814u.m816a(C1047j.f5944E1, false);
            this.f10379t = c0214g0M814u.m816a(C1047j.f5949F1, this.f10365f);
            this.f10380u = c0214g0M814u.m816a(C1047j.f5934C1, this.f10366g);
            this.f10381v = c0214g0M814u.m826k(C1047j.f6034W1, -1);
            this.f10385z = c0214g0M814u.m830o(C1047j.f5989N1);
            this.f10382w = c0214g0M814u.m829n(C1047j.f5994O1, 0);
            this.f10383x = c0214g0M814u.m830o(C1047j.f6004Q1);
            String strM830o = c0214g0M814u.m830o(C1047j.f5999P1);
            this.f10384y = strM830o;
            boolean z3 = strM830o != null;
            if (z3 && this.f10382w == 0 && this.f10383x == null) {
                this.f10354A = (AbstractC0337b) m8793e(strM830o, C2625g.f10346f, C2625g.this.f10348b);
            } else {
                if (z3) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f10354A = null;
            }
            this.f10355B = c0214g0M814u.m831p(C1047j.f6014S1);
            this.f10356C = c0214g0M814u.m831p(C1047j.f6039X1);
            int i5 = C1047j.f6024U1;
            if (c0214g0M814u.m834s(i5)) {
                this.f10358E = C0231q.m983d(c0214g0M814u.m826k(i5, -1), this.f10358E);
            } else {
                this.f10358E = null;
            }
            int i6 = C1047j.f6019T1;
            if (c0214g0M814u.m834s(i6)) {
                this.f10357D = c0214g0M814u.m818c(i6);
            } else {
                this.f10357D = null;
            }
            c0214g0M814u.m835w();
            this.f10367h = false;
        }

        /* renamed from: h */
        public void m8800h() {
            this.f10361b = 0;
            this.f10362c = 0;
            this.f10363d = 0;
            this.f10364e = 0;
            this.f10365f = true;
            this.f10366g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f10345e = clsArr;
        f10346f = clsArr;
    }

    public C2625g(Context context) {
        super(context);
        this.f10349c = context;
        Object[] objArr = {context};
        this.f10347a = objArr;
        this.f10348b = objArr;
    }

    /* renamed from: a */
    private Object m8789a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m8789a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m8790c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        str = null;
                        z4 = false;
                    } else if (name2.equals(AgooMessageReceiver.NOTIFICATION_GROUP)) {
                        bVar.m8800h();
                    } else if (name2.equals("item")) {
                        if (!bVar.m8797d()) {
                            AbstractC0337b abstractC0337b = bVar.f10354A;
                            if (abstractC0337b == null || !abstractC0337b.mo503a()) {
                                bVar.m8795a();
                            } else {
                                bVar.m8796b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z3 = true;
                    }
                }
            } else if (!z4) {
                String name3 = xmlPullParser.getName();
                if (name3.equals(AgooMessageReceiver.NOTIFICATION_GROUP)) {
                    bVar.m8798f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.m8799g(attributeSet);
                } else if (name3.equals("menu")) {
                    m8790c(xmlPullParser, attributeSet, bVar.m8796b());
                } else {
                    str = name3;
                    z4 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: b */
    Object m8791b() {
        if (this.f10350d == null) {
            this.f10350d = m8789a(this.f10349c);
        }
        return this.f10350d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i4, Menu menu) {
        if (!(menu instanceof InterfaceMenuC3414a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f10349c.getResources().getLayout(i4);
                    m8790c(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
