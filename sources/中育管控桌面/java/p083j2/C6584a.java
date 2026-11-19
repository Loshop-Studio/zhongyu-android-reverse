package p083j2;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p090k2.C6627a;
import p090k2.InterfaceC6628b;
import p090k2.InterfaceC6629c;

/* renamed from: j2.a */
/* loaded from: classes3.dex */
public class C6584a implements InterfaceC6628b {

    /* renamed from: b */
    public static volatile C6584a f8558b;

    /* renamed from: a */
    public volatile InterfaceC6628b f8559a = new C6627a();

    /* renamed from: e */
    public static C6584a m7476e() {
        if (f8558b == null) {
            synchronized (C6584a.class) {
                try {
                    if (f8558b == null) {
                        f8558b = new C6584a();
                    }
                } finally {
                }
            }
        }
        return f8558b;
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: a */
    public void mo7477a(Context context) {
        this.f8559a.mo7477a(context);
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: b */
    public void mo7478b(Fragment fragment) {
        this.f8559a.mo7478b(fragment);
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: c */
    public void mo7479c(Fragment fragment, String str, ImageView imageView, InterfaceC6629c interfaceC6629c) {
        this.f8559a.mo7479c(fragment, str, imageView, interfaceC6629c);
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: d */
    public void mo7480d(Fragment fragment, String str, ImageView imageView, InterfaceC6629c interfaceC6629c) {
        this.f8559a.mo7480d(fragment, str, imageView, interfaceC6629c);
    }
}
