package android.view;

import android.view.CoroutineLiveDataKt;
import android.view.Transformations;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2743c implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1118a;

    /* renamed from: b */
    public final /* synthetic */ MediatorLiveData f1119b;

    public /* synthetic */ C2743c(MediatorLiveData mediatorLiveData, int i) {
        this.f1118a = i;
        this.f1119b = mediatorLiveData;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1118a) {
            case 0:
                return CoroutineLiveDataKt.C27202.invokeSuspend$lambda$0(this.f1119b, obj);
            case 1:
                return Transformations.switchMap$lambda$3$lambda$2(this.f1119b, obj);
            default:
                return Transformations.C27372.onChanged$lambda$0(this.f1119b, obj);
        }
    }
}
