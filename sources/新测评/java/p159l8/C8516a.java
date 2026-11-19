package p159l8;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p080e8.AbstractC7415a;
import p135j8.InterfaceC7815a;
import p181n8.InterfaceC8671b;

/* renamed from: l8.a */
/* loaded from: classes5.dex */
public class C8516a implements InterfaceC8671b {

    /* renamed from: a */
    public volatile Object f14129a;

    /* renamed from: b */
    public final Object f14130b = new Object();

    /* renamed from: c */
    public final Activity f14131c;

    /* renamed from: d */
    public final InterfaceC8671b f14132d;

    /* renamed from: l8.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC7815a mo13477a();
    }

    public C8516a(Activity activity) {
        this.f14131c = activity;
        this.f14132d = new C8517b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object m13995a() {
        String str;
        if (this.f14131c.getApplication() instanceof InterfaceC8671b) {
            return ((a) AbstractC7415a.m11910a(this.f14132d, a.class)).mo13477a().mo13240a(this.f14131c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f14131c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f14131c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final C8522g m13996b() {
        return ((C8517b) this.f14132d).m13999c();
    }

    @Override // p181n8.InterfaceC8671b
    public Object generatedComponent() {
        if (this.f14129a == null) {
            synchronized (this.f14130b) {
                try {
                    if (this.f14129a == null) {
                        this.f14129a = m13995a();
                    }
                } finally {
                }
            }
        }
        return this.f14129a;
    }
}
