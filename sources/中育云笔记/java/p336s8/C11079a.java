package p336s8;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p347t8.C11251a;
import p347t8.InterfaceC11252b;
import p347t8.InterfaceC11253c;

/* renamed from: s8.a */
/* loaded from: classes5.dex */
public class C11079a implements InterfaceC11252b {

    /* renamed from: b */
    public static volatile C11079a f26736b;

    /* renamed from: a */
    public volatile InterfaceC11252b f26737a = new C11251a();

    /* renamed from: e */
    public static C11079a m24625e() {
        if (f26736b == null) {
            synchronized (C11079a.class) {
                try {
                    if (f26736b == null) {
                        f26736b = new C11079a();
                    }
                } finally {
                }
            }
        }
        return f26736b;
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: a */
    public void mo24626a(Context context) {
        this.f26737a.mo24626a(context);
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: b */
    public void mo24627b(Fragment fragment) {
        this.f26737a.mo24627b(fragment);
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: c */
    public void mo24628c(Fragment fragment, String str, ImageView imageView, InterfaceC11253c interfaceC11253c) {
        this.f26737a.mo24628c(fragment, str, imageView, interfaceC11253c);
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: d */
    public void mo24629d(Fragment fragment, String str, ImageView imageView, InterfaceC11253c interfaceC11253c) {
        this.f26737a.mo24629d(fragment, str, imageView, interfaceC11253c);
    }
}
