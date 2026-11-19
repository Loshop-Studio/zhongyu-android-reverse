package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0199b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f187a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f188b;

    public /* synthetic */ RunnableC0199b(Toolbar toolbar, int i) {
        this.f187a = i;
        this.f188b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f187a) {
            case 0:
                this.f188b.collapseActionView();
                break;
            default:
                this.f188b.invalidateMenu();
                break;
        }
    }
}
