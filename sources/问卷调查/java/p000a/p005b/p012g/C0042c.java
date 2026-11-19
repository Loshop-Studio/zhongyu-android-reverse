package p000a.p005b.p012g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: a.b.g.c */
/* loaded from: classes.dex */
public class C0042c extends ContextWrapper {

    /* renamed from: a */
    public int f287a;

    /* renamed from: b */
    public Resources.Theme f288b;

    /* renamed from: c */
    public LayoutInflater f289c;

    /* renamed from: d */
    public Configuration f290d;

    /* renamed from: e */
    public Resources f291e;

    public C0042c() {
        super(null);
    }

    public C0042c(Context context, int i) {
        super(context);
        this.f287a = i;
    }

    /* renamed from: a */
    public void m152a(Configuration configuration) {
        if (this.f291e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f290d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f290d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m153b() {
        if (this.f288b == null) {
            this.f288b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f288b.setTo(theme);
            }
        }
        this.f288b.applyStyle(this.f287a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f291e == null) {
            Configuration configuration = this.f290d;
            this.f291e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f291e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f289c == null) {
            this.f289c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f289c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f288b;
        if (theme != null) {
            return theme;
        }
        if (this.f287a == 0) {
            this.f287a = C1088R.style.Theme_AppCompat_Light;
        }
        m153b();
        return this.f288b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f287a != i) {
            this.f287a = i;
            m153b();
        }
    }
}
