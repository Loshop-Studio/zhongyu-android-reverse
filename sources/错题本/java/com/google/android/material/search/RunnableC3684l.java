package com.google.android.material.search;

/* renamed from: com.google.android.material.search.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3684l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2912a;

    /* renamed from: b */
    public final /* synthetic */ Object f2913b;

    public /* synthetic */ RunnableC3684l(Object obj, int i) {
        this.f2912a = i;
        this.f2913b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2912a) {
            case 0:
                ((SearchViewAnimationHelper) this.f2913b).lambda$startShowAnimationExpand$0();
                break;
            case 1:
                ((SearchViewAnimationHelper) this.f2913b).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) this.f2913b).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
