package com.google.android.material.search;

/* renamed from: com.google.android.material.search.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3679g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2904a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f2905b;

    public /* synthetic */ RunnableC3679g(SearchView searchView, int i) {
        this.f2904a = i;
        this.f2905b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2904a) {
            case 0:
                this.f2905b.lambda$clearFocusAndHideKeyboard$9();
                break;
            case 1:
                this.f2905b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 2:
                this.f2905b.show();
                break;
            default:
                this.f2905b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
