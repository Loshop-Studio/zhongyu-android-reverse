package p285w7;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* renamed from: w7.g */
/* loaded from: classes5.dex */
public final class C9842g {

    /* renamed from: a */
    public CreationExtras f17567a;

    /* renamed from: b */
    public SavedStateHandle f17568b;

    /* renamed from: c */
    public final boolean f17569c;

    public C9842g(CreationExtras creationExtras) {
        this.f17569c = creationExtras == null;
        this.f17567a = creationExtras;
    }

    /* renamed from: a */
    public void m16777a() {
        this.f17567a = null;
    }

    /* renamed from: b */
    public boolean m16778b() {
        return this.f17568b == null && this.f17567a == null;
    }

    /* renamed from: c */
    public void m16779c(CreationExtras creationExtras) {
        if (this.f17568b != null) {
            return;
        }
        this.f17567a = creationExtras;
    }
}
