package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
public class C0208d0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1067c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0208d0>> f1068d;

    /* renamed from: a */
    private final Resources f1069a;

    /* renamed from: b */
    private final Resources.Theme f1070b;

    private C0208d0(Context context) {
        super(context);
        if (!C0224l0.m915b()) {
            this.f1069a = new C0212f0(this, context.getResources());
            this.f1070b = null;
            return;
        }
        C0224l0 c0224l0 = new C0224l0(this, context.getResources());
        this.f1069a = c0224l0;
        Resources.Theme themeNewTheme = c0224l0.newTheme();
        this.f1070b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m779a(Context context) {
        return ((context instanceof C0208d0) || (context.getResources() instanceof C0212f0) || (context.getResources() instanceof C0224l0) || !C0224l0.m915b()) ? false : true;
    }

    /* renamed from: b */
    public static Context m780b(Context context) {
        if (!m779a(context)) {
            return context;
        }
        synchronized (f1067c) {
            ArrayList<WeakReference<C0208d0>> arrayList = f1068d;
            if (arrayList == null) {
                f1068d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0208d0> weakReference = f1068d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1068d.remove(size);
                    }
                }
                for (int size2 = f1068d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0208d0> weakReference2 = f1068d.get(size2);
                    C0208d0 c0208d0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0208d0 != null && c0208d0.getBaseContext() == context) {
                        return c0208d0;
                    }
                }
            }
            C0208d0 c0208d02 = new C0208d0(context);
            f1068d.add(new WeakReference<>(c0208d02));
            return c0208d02;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1069a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1069a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1070b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f1070b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
