package p285w7;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p215p7.AbstractC9337a;
import p265u7.InterfaceC9721a;
import p305y7.InterfaceC9966b;

/* renamed from: w7.a */
/* loaded from: classes5.dex */
public class C9836a implements InterfaceC9966b {

    /* renamed from: a */
    public volatile Object f17549a;

    /* renamed from: b */
    public final Object f17550b = new Object();

    /* renamed from: c */
    public final Activity f17551c;

    /* renamed from: d */
    public final InterfaceC9966b f17552d;

    /* renamed from: w7.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC9721a mo12821a();
    }

    public C9836a(Activity activity) {
        this.f17551c = activity;
        this.f17552d = new C9837b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object m16762a() {
        String str;
        if (this.f17551c.getApplication() instanceof InterfaceC9966b) {
            return ((a) AbstractC9337a.m15247a(this.f17552d, a.class)).mo12821a().mo12812a(this.f17551c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f17551c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f17551c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final C9842g m16763b() {
        return ((C9837b) this.f17552d).m16766c();
    }

    @Override // p305y7.InterfaceC9966b
    public Object generatedComponent() {
        if (this.f17549a == null) {
            synchronized (this.f17550b) {
                try {
                    if (this.f17549a == null) {
                        this.f17549a = m16762a();
                    }
                } finally {
                }
            }
        }
        return this.f17549a;
    }
}
