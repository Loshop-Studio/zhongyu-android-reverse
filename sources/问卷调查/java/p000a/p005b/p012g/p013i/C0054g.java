package p000a.p005b.p012g.p013i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p037e.p038a.InterfaceMenuC0214a;
import p000a.p031h.p043j.C0272u;

/* renamed from: a.b.g.i.g */
/* loaded from: classes.dex */
public class C0054g implements InterfaceMenuC0214a {

    /* renamed from: y */
    public static final int[] f432y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f433a;

    /* renamed from: b */
    public final Resources f434b;

    /* renamed from: c */
    public boolean f435c;

    /* renamed from: d */
    public boolean f436d;

    /* renamed from: e */
    public a f437e;

    /* renamed from: f */
    public ArrayList<C0056i> f438f;

    /* renamed from: g */
    public ArrayList<C0056i> f439g;

    /* renamed from: h */
    public boolean f440h;

    /* renamed from: i */
    public ArrayList<C0056i> f441i;

    /* renamed from: j */
    public ArrayList<C0056i> f442j;

    /* renamed from: k */
    public boolean f443k;

    /* renamed from: m */
    public CharSequence f445m;

    /* renamed from: n */
    public Drawable f446n;

    /* renamed from: o */
    public View f447o;

    /* renamed from: v */
    public C0056i f454v;

    /* renamed from: x */
    public boolean f456x;

    /* renamed from: l */
    public int f444l = 0;

    /* renamed from: p */
    public boolean f448p = false;

    /* renamed from: q */
    public boolean f449q = false;

    /* renamed from: r */
    public boolean f450r = false;

    /* renamed from: s */
    public boolean f451s = false;

    /* renamed from: t */
    public ArrayList<C0056i> f452t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0060m>> f453u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f455w = false;

    /* renamed from: a.b.g.i.g$a */
    public interface a {
        /* renamed from: a */
        void mo79a(C0054g c0054g);

        /* renamed from: b */
        boolean mo80b(C0054g c0054g, MenuItem menuItem);
    }

    /* renamed from: a.b.g.i.g$b */
    public interface b {
        /* renamed from: b */
        boolean mo222b(C0056i c0056i);
    }

    public C0054g(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z = false;
        this.f433a = context;
        Resources resources = context.getResources();
        this.f434b = resources;
        this.f438f = new ArrayList<>();
        this.f439g = new ArrayList<>();
        this.f440h = true;
        this.f441i = new ArrayList<>();
        this.f442j = new ArrayList<>();
        this.f443k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C0272u.f1631a;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z = true;
            }
        }
        this.f436d = z;
    }

    /* renamed from: a */
    public MenuItem m196a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f432y;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0056i c0056i = new C0056i(this, i, i2, i3, i6, charSequence, this.f444l);
                ArrayList<C0056i> arrayList = this.f438f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).f467d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, c0056i);
                m212q(true);
                return c0056i;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m196a(0, 0, 0, this.f434b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m196a(i, i2, i3, this.f434b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m196a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m196a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f433a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0056i c0056i = (C0056i) m196a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0056i.setIcon(resolveInfo.loadIcon(packageManager));
            c0056i.setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0056i;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f434b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f434b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0056i c0056i = (C0056i) m196a(i, i2, i3, charSequence);
        SubMenuC0065r subMenuC0065r = new SubMenuC0065r(this.f433a, this, c0056i);
        c0056i.f478o = subMenuC0065r;
        subMenuC0065r.setHeaderTitle(c0056i.f468e);
        return subMenuC0065r;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m197b(InterfaceC0060m interfaceC0060m, Context context) {
        this.f453u.add(new WeakReference<>(interfaceC0060m));
        interfaceC0060m.mo191j(context, this);
        this.f443k = true;
    }

    /* renamed from: c */
    public final void m198c(boolean z) {
        if (this.f451s) {
            return;
        }
        this.f451s = true;
        Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0060m> next = it.next();
            InterfaceC0060m interfaceC0060m = next.get();
            if (interfaceC0060m == null) {
                this.f453u.remove(next);
            } else {
                interfaceC0060m.mo173c(this, z);
            }
        }
        this.f451s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        C0056i c0056i = this.f454v;
        if (c0056i != null) {
            mo199d(c0056i);
        }
        this.f438f.clear();
        m212q(true);
    }

    public void clearHeader() {
        this.f446n = null;
        this.f445m = null;
        this.f447o = null;
        m212q(false);
    }

    @Override // android.view.Menu
    public void close() {
        m198c(true);
    }

    /* renamed from: d */
    public boolean mo199d(C0056i c0056i) {
        boolean zMo168k = false;
        if (!this.f453u.isEmpty() && this.f454v == c0056i) {
            m221z();
            Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0060m> next = it.next();
                InterfaceC0060m interfaceC0060m = next.get();
                if (interfaceC0060m == null) {
                    this.f453u.remove(next);
                } else {
                    zMo168k = interfaceC0060m.mo168k(this, c0056i);
                    if (zMo168k) {
                        break;
                    }
                }
            }
            m220y();
            if (zMo168k) {
                this.f454v = null;
            }
        }
        return zMo168k;
    }

    /* renamed from: e */
    public boolean mo200e(C0054g c0054g, MenuItem menuItem) {
        a aVar = this.f437e;
        return aVar != null && aVar.mo80b(c0054g, menuItem);
    }

    /* renamed from: f */
    public boolean mo201f(C0056i c0056i) {
        boolean zMo166d = false;
        if (this.f453u.isEmpty()) {
            return false;
        }
        m221z();
        Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0060m> next = it.next();
            InterfaceC0060m interfaceC0060m = next.get();
            if (interfaceC0060m == null) {
                this.f453u.remove(next);
            } else {
                zMo166d = interfaceC0060m.mo166d(this, c0056i);
                if (zMo166d) {
                    break;
                }
            }
        }
        m220y();
        if (zMo166d) {
            this.f454v = c0056i;
        }
        return zMo166d;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0056i c0056i = this.f438f.get(i2);
            if (c0056i.f464a == i) {
                return c0056i;
            }
            if (c0056i.hasSubMenu() && (menuItemFindItem = c0056i.f478o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0056i m202g(int i, KeyEvent keyEvent) {
        ArrayList<C0056i> arrayList = this.f452t;
        arrayList.clear();
        m203h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo209n = mo209n();
        for (int i2 = 0; i2 < size; i2++) {
            C0056i c0056i = arrayList.get(i2);
            char c2 = zMo209n ? c0056i.f473j : c0056i.f471h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo209n && c2 == '\b' && i == 67))) {
                return c0056i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f438f.get(i);
    }

    /* renamed from: h */
    public void m203h(List<C0056i> list, int i, KeyEvent keyEvent) {
        boolean zMo209n = mo209n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f438f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0056i c0056i = this.f438f.get(i2);
                if (c0056i.hasSubMenu()) {
                    c0056i.f478o.m203h(list, i, keyEvent);
                }
                char c2 = zMo209n ? c0056i.f473j : c0056i.f471h;
                if (((modifiers & 69647) == ((zMo209n ? c0056i.f474k : c0056i.f472i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo209n && c2 == '\b' && i == 67)) && c0056i.isEnabled()) {
                        list.add(c0056i);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f456x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f438f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m204i() {
        ArrayList<C0056i> arrayListM207l = m207l();
        if (this.f443k) {
            Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
            boolean zMo176h = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0060m> next = it.next();
                InterfaceC0060m interfaceC0060m = next.get();
                if (interfaceC0060m == null) {
                    this.f453u.remove(next);
                } else {
                    zMo176h |= interfaceC0060m.mo176h();
                }
            }
            if (zMo176h) {
                this.f441i.clear();
                this.f442j.clear();
                int size = arrayListM207l.size();
                for (int i = 0; i < size; i++) {
                    C0056i c0056i = arrayListM207l.get(i);
                    (c0056i.m227g() ? this.f441i : this.f442j).add(c0056i);
                }
            } else {
                this.f441i.clear();
                this.f442j.clear();
                this.f442j.addAll(m207l());
            }
            this.f443k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m202g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo205j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0054g mo206k() {
        return this;
    }

    /* renamed from: l */
    public ArrayList<C0056i> m207l() {
        if (!this.f440h) {
            return this.f439g;
        }
        this.f439g.clear();
        int size = this.f438f.size();
        for (int i = 0; i < size; i++) {
            C0056i c0056i = this.f438f.get(i);
            if (c0056i.isVisible()) {
                this.f439g.add(c0056i);
            }
        }
        this.f440h = false;
        this.f443k = true;
        return this.f439g;
    }

    /* renamed from: m */
    public boolean mo208m() {
        return this.f455w;
    }

    /* renamed from: n */
    public boolean mo209n() {
        return this.f435c;
    }

    /* renamed from: o */
    public boolean mo210o() {
        return this.f436d;
    }

    /* renamed from: p */
    public void m211p() {
        this.f443k = true;
        m212q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m213r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0056i c0056iM202g = m202g(i, keyEvent);
        boolean zM214s = c0056iM202g != null ? m214s(c0056iM202g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m198c(true);
        }
        return zM214s;
    }

    /* renamed from: q */
    public void m212q(boolean z) {
        if (this.f448p) {
            this.f449q = true;
            if (z) {
                this.f450r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f440h = true;
            this.f443k = true;
        }
        if (this.f453u.isEmpty()) {
            return;
        }
        m221z();
        Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0060m> next = it.next();
            InterfaceC0060m interfaceC0060m = next.get();
            if (interfaceC0060m == null) {
                this.f453u.remove(next);
            } else {
                interfaceC0060m.mo177i(z);
            }
        }
        m220y();
    }

    /* renamed from: r */
    public boolean m213r(MenuItem menuItem, int i) {
        return m214s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f438f.get(i2).f465b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f438f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f438f.get(i2).f465b != i) {
                    break;
                }
                m215t(i2, false);
                i3 = i4;
            }
            m212q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f438f.get(i2).f464a == i) {
                break;
            } else {
                i2++;
            }
        }
        m215t(i2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8 A[PHI: r1
      0x00c8: PHI (r1v11 boolean) = (r1v10 boolean), (r1v9 boolean), (r1v13 boolean) binds: [B:68:0x00c6, B:43:0x006a, B:36:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m214s(android.view.MenuItem r7, p000a.p005b.p012g.p013i.InterfaceC0060m r8, int r9) {
        /*
            r6 = this;
            a.b.g.i.i r7 = (p000a.p005b.p012g.p013i.C0056i) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f479p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            a.b.g.i.g r1 = r7.f477n
            boolean r1 = r1.mo200e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f470g
            if (r1 == 0) goto L36
            a.b.g.i.g r3 = r7.f477n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f433a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            a.h.j.b r1 = r7.f460A
            if (r1 == 0) goto L42
            boolean r1 = r1.mo236e()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            a.h.j.b r3 = r7.f460A
            if (r3 == 0) goto L4f
            boolean r4 = r3.mo234a()
            if (r4 == 0) goto L4f
            r4 = r2
            goto L50
        L4f:
            r4 = r0
        L50:
            boolean r5 = r7.m226f()
            if (r5 == 0) goto L5f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            goto Lc8
        L5f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L68
            goto L6d
        L68:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            goto Lc8
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.m198c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            a.b.g.i.r r9 = new a.b.g.i.r
            android.content.Context r5 = r6.f433a
            r9.<init>(r5, r6, r7)
            r7.f478o = r9
            java.lang.CharSequence r5 = r7.f468e
            r9.setHeaderTitle(r5)
        L88:
            a.b.g.i.r r7 = r7.f478o
            if (r4 == 0) goto L8f
            r3.mo237f(r7)
        L8f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.g.i.m>> r9 = r6.f453u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L98
            goto Lc5
        L98:
            if (r8 == 0) goto L9e
            boolean r0 = r8.mo175g(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.g.i.m>> r8 = r6.f453u
            java.util.Iterator r8 = r8.iterator()
        La4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            a.b.g.i.m r3 = (p000a.p005b.p012g.p013i.InterfaceC0060m) r3
            if (r3 != 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.g.i.m>> r3 = r6.f453u
            r3.remove(r9)
            goto La4
        Lbe:
            if (r0 != 0) goto La4
            boolean r0 = r3.mo175g(r7)
            goto La4
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
        Lc8:
            r6.m198c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p012g.p013i.C0054g.m214s(android.view.MenuItem, a.b.g.i.m, int):boolean");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f438f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0056i c0056i = this.f438f.get(i2);
            if (c0056i.f465b == i) {
                c0056i.f487x = (c0056i.f487x & (-5)) | (z2 ? 4 : 0);
                c0056i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f455w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f438f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0056i c0056i = this.f438f.get(i2);
            if (c0056i.f465b == i) {
                c0056i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f438f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0056i c0056i = this.f438f.get(i2);
            if (c0056i.f465b == i && c0056i.m232l(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m212q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f435c = z;
        m212q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f438f.size();
    }

    /* renamed from: t */
    public final void m215t(int i, boolean z) {
        if (i < 0 || i >= this.f438f.size()) {
            return;
        }
        this.f438f.remove(i);
        if (z) {
            m212q(true);
        }
    }

    /* renamed from: u */
    public void m216u(InterfaceC0060m interfaceC0060m) {
        Iterator<WeakReference<InterfaceC0060m>> it = this.f453u.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0060m> next = it.next();
            InterfaceC0060m interfaceC0060m2 = next.get();
            if (interfaceC0060m2 == null || interfaceC0060m2 == interfaceC0060m) {
                this.f453u.remove(next);
            }
        }
    }

    /* renamed from: v */
    public void m217v(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo205j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0065r) item.getSubMenu()).m217v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* renamed from: w */
    public void m218w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0065r) item.getSubMenu()).m218w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo205j(), sparseArray);
        }
    }

    /* renamed from: x */
    public final void m219x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f434b;
        if (view != null) {
            this.f447o = view;
            this.f445m = null;
            this.f446n = null;
        } else {
            if (i > 0) {
                this.f445m = resources.getText(i);
            } else if (charSequence != null) {
                this.f445m = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f433a;
                Object obj = C0192a.f1425a;
                this.f446n = C0192a.c.m739b(context, i2);
            } else if (drawable != null) {
                this.f446n = drawable;
            }
            this.f447o = null;
        }
        m212q(false);
    }

    /* renamed from: y */
    public void m220y() {
        this.f448p = false;
        if (this.f449q) {
            this.f449q = false;
            m212q(this.f450r);
        }
    }

    /* renamed from: z */
    public void m221z() {
        if (this.f448p) {
            return;
        }
        this.f448p = true;
        this.f449q = false;
        this.f450r = false;
    }
}
