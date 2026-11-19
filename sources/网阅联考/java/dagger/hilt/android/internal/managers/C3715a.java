package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p018c2.AbstractC2756a;
import p064g2.InterfaceC3754a;
import p079j2.InterfaceC3802b;

/* renamed from: dagger.hilt.android.internal.managers.a */
/* loaded from: classes2.dex */
public class C3715a implements InterfaceC3802b {

    /* renamed from: a */
    public volatile Object f4340a;

    /* renamed from: b */
    public final Object f4341b = new Object();

    /* renamed from: c */
    public final Activity f4342c;

    /* renamed from: d */
    public final InterfaceC3802b f4343d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface a {
        /* renamed from: b */
        InterfaceC3754a mo4710b();
    }

    public C3715a(Activity activity) {
        this.f4342c = activity;
        this.f4343d = new C3716b((ComponentActivity) activity);
    }

    @Override // p079j2.InterfaceC3802b
    /* renamed from: a */
    public Object mo4607a() {
        if (this.f4340a == null) {
            synchronized (this.f4341b) {
                if (this.f4340a == null) {
                    this.f4340a = m4709b();
                }
            }
        }
        return this.f4340a;
    }

    /* renamed from: b */
    public Object m4709b() {
        if (this.f4342c.getApplication() instanceof InterfaceC3802b) {
            return ((a) AbstractC2756a.m1625a(this.f4343d, a.class)).mo4710b().mo4789a(this.f4342c).build();
        }
        if (Application.class.equals(this.f4342c.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f4342c.getApplication().getClass());
    }
}
