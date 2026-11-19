package p133i6;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* renamed from: i6.g */
/* loaded from: classes5.dex */
public final class C8765g {

    /* renamed from: a */
    public CreationExtras f16440a;

    /* renamed from: b */
    public SavedStateHandle f16441b;

    /* renamed from: c */
    public final boolean f16442c;

    public C8765g(CreationExtras creationExtras) {
        this.f16442c = creationExtras == null;
        this.f16440a = creationExtras;
    }

    /* renamed from: a */
    public void m14474a() {
        this.f16440a = null;
    }

    /* renamed from: b */
    public boolean m14475b() {
        return this.f16441b == null && this.f16440a == null;
    }

    /* renamed from: c */
    public void m14476c(CreationExtras creationExtras) {
        if (this.f16441b != null) {
            return;
        }
        this.f16440a = creationExtras;
    }
}
