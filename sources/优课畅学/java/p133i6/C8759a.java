package p133i6;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p026b6.AbstractC5208a;
import p111g6.InterfaceC8651a;
import p155k6.InterfaceC9060b;

/* renamed from: i6.a */
/* loaded from: classes5.dex */
public class C8759a implements InterfaceC9060b {

    /* renamed from: a */
    public volatile Object f16422a;

    /* renamed from: b */
    public final Object f16423b = new Object();

    /* renamed from: c */
    public final Activity f16424c;

    /* renamed from: d */
    public final InterfaceC9060b f16425d;

    /* renamed from: i6.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC8651a mo9814a();
    }

    public C8759a(Activity activity) {
        this.f16424c = activity;
        this.f16425d = new C8760b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object m14459a() {
        String str;
        if (this.f16424c.getApplication() instanceof InterfaceC9060b) {
            return ((a) AbstractC5208a.m2103a(this.f16425d, a.class)).mo9814a().mo9802a(this.f16424c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f16424c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f16424c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final C8765g m14460b() {
        return ((C8760b) this.f16425d).m14463c();
    }

    @Override // p155k6.InterfaceC9060b
    public Object generatedComponent() {
        if (this.f16422a == null) {
            synchronized (this.f16423b) {
                try {
                    if (this.f16422a == null) {
                        this.f16422a = m14459a();
                    }
                } finally {
                }
            }
        }
        return this.f16422a;
    }
}
