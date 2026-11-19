package com.google.android.material.search;

import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

/* renamed from: com.google.android.material.search.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3675c implements SearchBarAnimationHelper.OnLoadAnimationInvocation {

    /* renamed from: a */
    public final /* synthetic */ int f2894a;

    public /* synthetic */ C3675c(int i) {
        this.f2894a = i;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.f2894a) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                break;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                break;
        }
    }
}
