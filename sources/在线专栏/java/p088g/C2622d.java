package p088g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p015c.C1046i;

/* renamed from: g.d */
/* loaded from: classes.dex */
public class C2622d extends ContextWrapper {

    /* renamed from: a */
    private int f10327a;

    /* renamed from: b */
    private Resources.Theme f10328b;

    /* renamed from: c */
    private LayoutInflater f10329c;

    /* renamed from: d */
    private Configuration f10330d;

    /* renamed from: e */
    private Resources f10331e;

    public C2622d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m8782b() {
        if (this.f10331e == null) {
            Configuration configuration = this.f10330d;
            if (configuration == null) {
                this.f10331e = super.getResources();
            } else {
                this.f10331e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f10331e;
    }

    /* renamed from: d */
    private void m8783d() {
        boolean z3 = this.f10328b == null;
        if (z3) {
            this.f10328b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10328b.setTo(theme);
            }
        }
        m8786e(this.f10328b, this.f10327a, z3);
    }

    /* renamed from: a */
    public void m8784a(Configuration configuration) {
        if (this.f10331e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10330d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10330d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m8785c() {
        return this.f10327a;
    }

    /* renamed from: e */
    protected void m8786e(Resources.Theme theme, int i4, boolean z3) {
        theme.applyStyle(i4, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m8782b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10329c == null) {
            this.f10329c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10329c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10328b;
        if (theme != null) {
            return theme;
        }
        if (this.f10327a == 0) {
            this.f10327a = C1046i.f5921e;
        }
        m8783d();
        return this.f10328b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        if (this.f10327a != i4) {
            this.f10327a = i4;
            m8783d();
        }
    }

    public C2622d(Context context, int i4) {
        super(context);
        this.f10327a = i4;
    }

    public C2622d(Context context, Resources.Theme theme) {
        super(context);
        this.f10328b = theme;
    }
}
