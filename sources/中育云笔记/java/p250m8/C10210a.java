package p250m8;

import android.widget.ImageView;
import p361u8.InterfaceC11372a;
import p376v8.C11549a;

/* renamed from: m8.a */
/* loaded from: classes5.dex */
public class C10210a implements InterfaceC11372a {

    /* renamed from: b */
    public static volatile C10210a f24324b;

    /* renamed from: a */
    public InterfaceC11372a f24325a = new C11549a();

    /* renamed from: b */
    public static C10210a m21347b() {
        if (f24324b == null) {
            synchronized (C10210a.class) {
                try {
                    if (f24324b == null) {
                        f24324b = new C10210a();
                    }
                } finally {
                }
            }
        }
        return f24324b;
    }

    @Override // p361u8.InterfaceC11372a
    /* renamed from: a */
    public void mo21348a(ImageView imageView, Object obj) {
        this.f24325a.mo21348a(imageView, obj);
    }
}
