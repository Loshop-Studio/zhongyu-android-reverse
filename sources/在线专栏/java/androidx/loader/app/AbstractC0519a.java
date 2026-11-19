package androidx.loader.app;

import androidx.lifecycle.InterfaceC0495e0;
import androidx.lifecycle.InterfaceC0504l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0519a {
    /* renamed from: b */
    public static <T extends InterfaceC0504l & InterfaceC0495e0> AbstractC0519a m2922b(T t3) {
        return new C0520b(t3, t3.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo2923a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo2924c();
}
