package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.InterfaceC0061n;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0061n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n
    /* renamed from: c */
    public void mo250c(C0054g c0054g) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
