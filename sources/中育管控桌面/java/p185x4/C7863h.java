package p185x4;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* renamed from: x4.h */
/* loaded from: classes4.dex */
public final class C7863h {

    /* renamed from: a */
    public CreationExtras f10477a;

    /* renamed from: b */
    public SavedStateHandle f10478b;

    /* renamed from: c */
    public final boolean f10479c;

    public C7863h(CreationExtras creationExtras) {
        this.f10479c = creationExtras == null;
        this.f10477a = creationExtras;
    }

    /* renamed from: a */
    public void m9541a() {
        this.f10477a = null;
    }

    /* renamed from: b */
    public boolean m9542b() {
        return this.f10478b == null && this.f10477a == null;
    }

    /* renamed from: c */
    public void m9543c(CreationExtras creationExtras) {
        if (this.f10478b != null) {
            return;
        }
        this.f10477a = creationExtras;
    }
}
