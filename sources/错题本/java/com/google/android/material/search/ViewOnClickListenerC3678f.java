package com.google.android.material.search;

import android.view.View;

/* renamed from: com.google.android.material.search.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3678f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2902a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f2903b;

    public /* synthetic */ ViewOnClickListenerC3678f(SearchView searchView, int i) {
        this.f2902a = i;
        this.f2903b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2902a) {
            case 0:
                this.f2903b.lambda$setUpBackButton$1(view);
                break;
            case 1:
                this.f2903b.lambda$setUpClearButton$2(view);
                break;
            default:
                this.f2903b.lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
