package p054f1;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import p054f1.AbstractC6291c;

/* renamed from: f1.f */
/* loaded from: classes3.dex */
public class C6294f implements InterfaceC6293e {
    @Override // p054f1.InterfaceC6293e
    /* renamed from: a */
    public void mo6444a(int i6, String tag, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC6291c.a aVar = AbstractC6291c.f7664a;
        if (AbstractC6291c.m6435g(i6, aVar.m6439d()) || AbstractC6291c.m6435g(i6, aVar.m6436a())) {
            return;
        }
        if (AbstractC6291c.m6435g(i6, aVar.m6438c())) {
            if (th == null) {
                Log.i(tag, message);
                return;
            } else {
                Log.i(tag, message, th);
                return;
            }
        }
        if (AbstractC6291c.m6435g(i6, aVar.m6440e())) {
            if (th == null) {
                Log.w(tag, message);
                return;
            } else {
                Log.w(tag, message, th);
                return;
            }
        }
        if (AbstractC6291c.m6435g(i6, aVar.m6437b())) {
            if (th == null) {
                Log.e(tag, message);
            } else {
                Log.e(tag, message, th);
            }
        }
    }
}
