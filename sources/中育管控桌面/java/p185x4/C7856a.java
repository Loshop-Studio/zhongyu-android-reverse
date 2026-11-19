package p185x4;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p136q4.AbstractC7625a;
import p171v4.InterfaceC7795a;
import p199z4.InterfaceC7948b;

/* renamed from: x4.a */
/* loaded from: classes4.dex */
public class C7856a implements InterfaceC7948b {

    /* renamed from: a */
    public volatile Object f10459a;

    /* renamed from: b */
    public final Object f10460b = new Object();

    /* renamed from: c */
    public final Activity f10461c;

    /* renamed from: d */
    public final InterfaceC7948b f10462d;

    /* renamed from: x4.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC7795a mo5223a();
    }

    public C7856a(Activity activity) {
        this.f10461c = activity;
        this.f10462d = new C7857b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object m9525a() {
        String str;
        if (this.f10461c.getApplication() instanceof InterfaceC7948b) {
            return ((a) AbstractC7625a.m9065a(this.f10462d, a.class)).mo5223a().mo5209a(this.f10461c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f10461c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f10461c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final C7863h m9526b() {
        return ((C7857b) this.f10462d).m9529c();
    }

    @Override // p199z4.InterfaceC7948b
    public Object generatedComponent() {
        if (this.f10459a == null) {
            synchronized (this.f10460b) {
                try {
                    if (this.f10459a == null) {
                        this.f10459a = m9525a();
                    }
                } finally {
                }
            }
        }
        return this.f10459a;
    }
}
