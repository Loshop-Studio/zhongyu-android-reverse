package p120dc;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* renamed from: dc.h */
/* loaded from: classes6.dex */
public final class C9022h {

    /* renamed from: a */
    public CreationExtras f21009a;

    /* renamed from: b */
    public SavedStateHandle f21010b;

    /* renamed from: c */
    public final boolean f21011c;

    public C9022h(CreationExtras creationExtras) {
        this.f21011c = creationExtras == null;
        this.f21009a = creationExtras;
    }

    /* renamed from: a */
    public void m17625a() {
        this.f21009a = null;
    }

    /* renamed from: b */
    public boolean m17626b() {
        return this.f21010b == null && this.f21009a == null;
    }

    /* renamed from: c */
    public void m17627c(CreationExtras creationExtras) {
        if (this.f21010b != null) {
            return;
        }
        this.f21009a = creationExtras;
    }
}
