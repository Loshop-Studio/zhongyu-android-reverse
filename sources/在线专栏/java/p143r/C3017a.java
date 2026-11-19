package p143r;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.C0327h;
import androidx.core.content.C0333b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p168x.C3431b;

/* renamed from: r.a */
/* loaded from: classes.dex */
public class C3017a {

    /* renamed from: a */
    Context f11679a;

    /* renamed from: b */
    String f11680b;

    /* renamed from: c */
    Intent[] f11681c;

    /* renamed from: d */
    ComponentName f11682d;

    /* renamed from: e */
    CharSequence f11683e;

    /* renamed from: f */
    CharSequence f11684f;

    /* renamed from: g */
    CharSequence f11685g;

    /* renamed from: h */
    IconCompat f11686h;

    /* renamed from: i */
    boolean f11687i;

    /* renamed from: j */
    C0327h[] f11688j;

    /* renamed from: k */
    Set<String> f11689k;

    /* renamed from: l */
    C0333b f11690l;

    /* renamed from: m */
    boolean f11691m;

    /* renamed from: n */
    int f11692n;

    /* renamed from: o */
    PersistableBundle f11693o;

    /* renamed from: p */
    boolean f11694p = true;

    /* renamed from: r.a$a */
    public static class a {

        /* renamed from: a */
        private final C3017a f11695a;

        /* renamed from: b */
        private boolean f11696b;

        /* renamed from: c */
        private Set<String> f11697c;

        /* renamed from: d */
        private Map<String, Map<String, List<String>>> f11698d;

        /* renamed from: e */
        private Uri f11699e;

        public a(Context context, String str) {
            C3017a c3017a = new C3017a();
            this.f11695a = c3017a;
            c3017a.f11679a = context;
            c3017a.f11680b = str;
        }

        @SuppressLint({"UnsafeNewApiCall"})
        /* renamed from: a */
        public C3017a m10128a() {
            if (TextUtils.isEmpty(this.f11695a.f11683e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            C3017a c3017a = this.f11695a;
            Intent[] intentArr = c3017a.f11681c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f11696b) {
                if (c3017a.f11690l == null) {
                    c3017a.f11690l = new C0333b(c3017a.f11680b);
                }
                this.f11695a.f11691m = true;
            }
            if (this.f11697c != null) {
                C3017a c3017a2 = this.f11695a;
                if (c3017a2.f11689k == null) {
                    c3017a2.f11689k = new HashSet();
                }
                this.f11695a.f11689k.addAll(this.f11697c);
            }
            if (this.f11698d != null) {
                C3017a c3017a3 = this.f11695a;
                if (c3017a3.f11693o == null) {
                    c3017a3.f11693o = new PersistableBundle();
                }
                for (String str : this.f11698d.keySet()) {
                    Map<String, List<String>> map = this.f11698d.get(str);
                    this.f11695a.f11693o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f11695a.f11693o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f11699e != null) {
                C3017a c3017a4 = this.f11695a;
                if (c3017a4.f11693o == null) {
                    c3017a4.f11693o = new PersistableBundle();
                }
                this.f11695a.f11693o.putString("extraSliceUri", C3431b.m10447a(this.f11699e));
            }
            return this.f11695a;
        }

        /* renamed from: b */
        public a m10129b(IconCompat iconCompat) {
            this.f11695a.f11686h = iconCompat;
            return this;
        }

        /* renamed from: c */
        public a m10130c(Intent intent) {
            return m10131d(new Intent[]{intent});
        }

        /* renamed from: d */
        public a m10131d(Intent[] intentArr) {
            this.f11695a.f11681c = intentArr;
            return this;
        }

        /* renamed from: e */
        public a m10132e(CharSequence charSequence) {
            this.f11695a.f11683e = charSequence;
            return this;
        }
    }

    C3017a() {
    }

    /* renamed from: b */
    private PersistableBundle m10125b() {
        if (this.f11693o == null) {
            this.f11693o = new PersistableBundle();
        }
        C0327h[] c0327hArr = this.f11688j;
        if (c0327hArr != null && c0327hArr.length > 0) {
            this.f11693o.putInt("extraPersonCount", c0327hArr.length);
            int i4 = 0;
            while (i4 < this.f11688j.length) {
                PersistableBundle persistableBundle = this.f11693o;
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i5 = i4 + 1;
                sb.append(i5);
                persistableBundle.putPersistableBundle(sb.toString(), this.f11688j[i4].m1786b());
                i4 = i5;
            }
        }
        C0333b c0333b = this.f11690l;
        if (c0333b != null) {
            this.f11693o.putString("extraLocusId", c0333b.m1826a());
        }
        this.f11693o.putBoolean("extraLongLived", this.f11691m);
        return this.f11693o;
    }

    /* renamed from: a */
    Intent m10126a(Intent intent) throws PackageManager.NameNotFoundException {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f11681c[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f11683e.toString());
        if (this.f11686h != null) {
            Drawable activityIcon = null;
            if (this.f11687i) {
                PackageManager packageManager = this.f11679a.getPackageManager();
                ComponentName componentName = this.f11682d;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f11679a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f11686h.m1839a(intent, activityIcon, this.f11679a);
        }
        return intent;
    }

    /* renamed from: c */
    public ShortcutInfo m10127c() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f11679a, this.f11680b).setShortLabel(this.f11683e).setIntents(this.f11681c);
        IconCompat iconCompat = this.f11686h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m1847p(this.f11679a));
        }
        if (!TextUtils.isEmpty(this.f11684f)) {
            intents.setLongLabel(this.f11684f);
        }
        if (!TextUtils.isEmpty(this.f11685g)) {
            intents.setDisabledMessage(this.f11685g);
        }
        ComponentName componentName = this.f11682d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f11689k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f11692n);
        PersistableBundle persistableBundle = this.f11693o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C0327h[] c0327hArr = this.f11688j;
            if (c0327hArr != null && c0327hArr.length > 0) {
                int length = c0327hArr.length;
                Person[] personArr = new Person[length];
                for (int i4 = 0; i4 < length; i4++) {
                    personArr[i4] = this.f11688j[i4].m1785a();
                }
                intents.setPersons(personArr);
            }
            C0333b c0333b = this.f11690l;
            if (c0333b != null) {
                intents.setLocusId(c0333b.m1827c());
            }
            intents.setLongLived(this.f11691m);
        } else {
            intents.setExtras(m10125b());
        }
        return intents.build();
    }
}
