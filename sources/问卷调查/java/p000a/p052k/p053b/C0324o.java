package p000a.p052k.p053b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import p000a.p001a.p002d.InterfaceC0004b;
import p000a.p057m.InterfaceC0372u;

/* renamed from: a.k.b.o */
/* loaded from: classes.dex */
public class C0324o implements InterfaceC0004b {

    /* renamed from: a */
    public final /* synthetic */ ActivityC0326p f2025a;

    public C0324o(ActivityC0326p activityC0326p) {
        this.f2025a = activityC0326p;
    }

    @Override // p000a.p001a.p002d.InterfaceC0004b
    /* renamed from: a */
    public void mo2a(Context context) {
        AbstractC0346z<?> abstractC0346z = this.f2025a.f2029i.f2114a;
        abstractC0346z.f2124e.m1033b(abstractC0346z, abstractC0346z, null);
        Bundle bundleM1419a = this.f2025a.f2656e.f2360b.m1419a("android:support:fragments");
        if (bundleM1419a != null) {
            Parcelable parcelable = bundleM1419a.getParcelable("android:support:fragments");
            AbstractC0346z<?> abstractC0346z2 = this.f2025a.f2029i.f2114a;
            if (!(abstractC0346z2 instanceof InterfaceC0372u)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            abstractC0346z2.f2124e.m1032a0(parcelable);
        }
    }
}
