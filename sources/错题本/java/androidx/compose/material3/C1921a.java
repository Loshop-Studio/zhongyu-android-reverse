package androidx.compose.material3;

/* renamed from: androidx.compose.material3.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1921a implements ScrolledOffset {

    /* renamed from: a */
    public final /* synthetic */ int f787a;

    /* renamed from: b */
    public final /* synthetic */ TopAppBarScrollBehavior f788b;

    public /* synthetic */ C1921a(TopAppBarScrollBehavior topAppBarScrollBehavior, int i) {
        this.f787a = i;
        this.f788b = topAppBarScrollBehavior;
    }

    @Override // androidx.compose.material3.ScrolledOffset
    public final float offset() {
        switch (this.f787a) {
            case 0:
                return AppBarKt$SingleRowTopAppBar$3.invoke$lambda$1$lambda$0(this.f788b);
            default:
                return AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$2$lambda$1(this.f788b);
        }
    }
}
