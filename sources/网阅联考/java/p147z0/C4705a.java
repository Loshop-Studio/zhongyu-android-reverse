package p147z0;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p002a1.C0006a;
import p002a1.InterfaceC0007b;
import p002a1.InterfaceC0008c;

/* renamed from: z0.a */
/* loaded from: classes2.dex */
public class C4705a implements InterfaceC0007b {

    /* renamed from: b */
    public static volatile C4705a f6064b;

    /* renamed from: a */
    public volatile InterfaceC0007b f6065a = new C0006a();

    /* renamed from: e */
    public static C4705a m6708e() {
        if (f6064b == null) {
            synchronized (C4705a.class) {
                if (f6064b == null) {
                    f6064b = new C4705a();
                }
            }
        }
        return f6064b;
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: a */
    public void mo8a(Fragment fragment, String str, ImageView imageView, InterfaceC0008c interfaceC0008c) {
        this.f6065a.mo8a(fragment, str, imageView, interfaceC0008c);
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: b */
    public void mo9b(Context context) {
        this.f6065a.mo9b(context);
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: c */
    public void mo10c(Fragment fragment) {
        this.f6065a.mo10c(fragment);
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: d */
    public void mo11d(Fragment fragment, String str, ImageView imageView, InterfaceC0008c interfaceC0008c) {
        this.f6065a.mo11d(fragment, str, imageView, interfaceC0008c);
    }
}
