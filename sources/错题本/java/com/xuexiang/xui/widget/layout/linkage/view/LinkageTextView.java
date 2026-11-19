package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p019b3.InterfaceC3105a;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p027c3.C3220a;

/* loaded from: classes3.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC3106b {
    public LinkageTextView(Context context) {
        this(context, null);
    }

    @Override // p019b3.InterfaceC3106b
    /* renamed from: a */
    public final InterfaceC3107c mo2061a() {
        return new C3220a(this, 1);
    }

    public LinkageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p019b3.InterfaceC3106b
    public void setChildLinkageEvent(InterfaceC3105a interfaceC3105a) {
    }
}
