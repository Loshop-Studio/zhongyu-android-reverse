package p318r5;

import android.content.Context;
import android.os.UserManager;

/* renamed from: r5.w0 */
/* loaded from: classes5.dex */
public class C10902w0 {

    /* renamed from: c */
    public static C10902w0 f26315c = new C10902w0();

    /* renamed from: a */
    public boolean f26316a = false;

    /* renamed from: b */
    public Context f26317b = AbstractC10900v0.m23682q();

    /* renamed from: b */
    public static C10902w0 m23694b() {
        return f26315c;
    }

    /* renamed from: a */
    public boolean m23695a() {
        if (!this.f26316a) {
            Context context = this.f26317b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f26316a = userManager.isUserUnlocked();
            } else {
                this.f26316a = false;
            }
        }
        return this.f26316a;
    }
}
