package p119i3;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p130j3.C7789a;
import p130j3.InterfaceC7790b;
import p130j3.InterfaceC7791c;

/* renamed from: i3.a */
/* loaded from: classes4.dex */
public class C7660a implements InterfaceC7790b {

    /* renamed from: b */
    public static volatile C7660a f12920b;

    /* renamed from: a */
    public volatile InterfaceC7790b f12921a = new C7789a();

    /* renamed from: e */
    public static C7660a m12728e() {
        if (f12920b == null) {
            synchronized (C7660a.class) {
                try {
                    if (f12920b == null) {
                        f12920b = new C7660a();
                    }
                } finally {
                }
            }
        }
        return f12920b;
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: a */
    public void mo12729a(Context context) {
        this.f12921a.mo12729a(context);
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: b */
    public void mo12730b(Fragment fragment) {
        this.f12921a.mo12730b(fragment);
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: c */
    public void mo12731c(Fragment fragment, String str, ImageView imageView, InterfaceC7791c interfaceC7791c) {
        this.f12921a.mo12731c(fragment, str, imageView, interfaceC7791c);
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: d */
    public void mo12732d(Fragment fragment, String str, ImageView imageView, InterfaceC7791c interfaceC7791c) {
        this.f12921a.mo12732d(fragment, str, imageView, interfaceC7791c);
    }
}
