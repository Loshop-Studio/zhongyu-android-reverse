package p120dc;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p036bc.InterfaceC5184a;
import p151fc.InterfaceC9219b;
import p392wb.AbstractC11724a;

/* renamed from: dc.a */
/* loaded from: classes6.dex */
public class C9015a implements InterfaceC9219b {

    /* renamed from: c */
    public volatile Object f20991c;

    /* renamed from: d */
    public final Object f20992d = new Object();

    /* renamed from: e */
    public final Activity f20993e;

    /* renamed from: f */
    public final InterfaceC9219b f20994f;

    /* renamed from: dc.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5184a mo17607a();
    }

    public C9015a(Activity activity) {
        this.f20993e = activity;
        this.f20994f = new C9016b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object m17605a() {
        String str;
        if (this.f20993e.getApplication() instanceof InterfaceC9219b) {
            return ((a) AbstractC11724a.m25951a(this.f20994f, a.class)).mo17607a().mo2734a(this.f20993e).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f20993e.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f20993e.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: b */
    public final C9022h m17606b() {
        return ((C9016b) this.f20994f).m17610c();
    }

    @Override // p151fc.InterfaceC9219b
    public Object generatedComponent() {
        if (this.f20991c == null) {
            synchronized (this.f20992d) {
                try {
                    if (this.f20991c == null) {
                        this.f20991c = m17605a();
                    }
                } finally {
                }
            }
        }
        return this.f20991c;
    }
}
