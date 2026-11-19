package p159l8;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* renamed from: l8.g */
/* loaded from: classes5.dex */
public final class C8522g {

    /* renamed from: a */
    public CreationExtras f14147a;

    /* renamed from: b */
    public SavedStateHandle f14148b;

    /* renamed from: c */
    public final boolean f14149c;

    public C8522g(CreationExtras creationExtras) {
        this.f14149c = creationExtras == null;
        this.f14147a = creationExtras;
    }

    /* renamed from: a */
    public void m14010a() {
        this.f14147a = null;
    }

    /* renamed from: b */
    public boolean m14011b() {
        return this.f14148b == null && this.f14147a == null;
    }

    /* renamed from: c */
    public void m14012c(CreationExtras creationExtras) {
        if (this.f14148b != null) {
            return;
        }
        this.f14147a = creationExtras;
    }
}
