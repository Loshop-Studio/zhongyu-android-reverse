package android.view;

import androidx.arch.core.util.Function;
import kotlin.jvm.internal.Ref$BooleanRef;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2765j implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1183a;

    /* renamed from: b */
    public final /* synthetic */ MediatorLiveData f1184b;

    /* renamed from: c */
    public final /* synthetic */ Object f1185c;

    public /* synthetic */ C2765j(MediatorLiveData mediatorLiveData, Object obj, int i) {
        this.f1183a = i;
        this.f1184b = mediatorLiveData;
        this.f1185c = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1183a) {
            case 0:
                return Transformations.map$lambda$0(this.f1184b, (InterfaceC6471c) this.f1185c, obj);
            case 1:
                return Transformations.distinctUntilChanged$lambda$4(this.f1184b, (Ref$BooleanRef) this.f1185c, obj);
            default:
                return Transformations.map$lambda$1(this.f1184b, (Function) this.f1185c, obj);
        }
    }
}
