package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p019b3.InterfaceC3105a;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p027c3.C3221b;
import p027c3.C3222c;

/* loaded from: classes3.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC3106b {

    /* renamed from: a */
    public InterfaceC3105a f4541a;

    public LinkageRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p019b3.InterfaceC3106b
    /* renamed from: a */
    public final InterfaceC3107c mo2061a() {
        return new C3222c(this);
    }

    @Override // p019b3.InterfaceC3106b
    public void setChildLinkageEvent(InterfaceC3105a interfaceC3105a) {
        this.f4541a = interfaceC3105a;
    }

    public LinkageRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnScrollListener(new C3221b(this));
    }
}
