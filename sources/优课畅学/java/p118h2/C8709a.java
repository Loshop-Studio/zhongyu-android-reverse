package p118h2;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p129i2.C8753a;
import p129i2.InterfaceC8754b;
import p129i2.InterfaceC8755c;

/* renamed from: h2.a */
/* loaded from: classes4.dex */
public class C8709a implements InterfaceC8754b {

    /* renamed from: b */
    public static volatile C8709a f16331b;

    /* renamed from: a */
    public volatile InterfaceC8754b f16332a = new C8753a();

    /* renamed from: e */
    public static C8709a m14209e() {
        if (f16331b == null) {
            synchronized (C8709a.class) {
                try {
                    if (f16331b == null) {
                        f16331b = new C8709a();
                    }
                } finally {
                }
            }
        }
        return f16331b;
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: a */
    public void mo14210a(Context context) {
        this.f16332a.mo14210a(context);
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: b */
    public void mo14211b(Fragment fragment) {
        this.f16332a.mo14211b(fragment);
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: c */
    public void mo14212c(Fragment fragment, String str, ImageView imageView, InterfaceC8755c interfaceC8755c) {
        this.f16332a.mo14212c(fragment, str, imageView, interfaceC8755c);
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: d */
    public void mo14213d(Fragment fragment, String str, ImageView imageView, InterfaceC8755c interfaceC8755c) {
        this.f16332a.mo14213d(fragment, str, imageView, interfaceC8755c);
    }
}
