package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p421y8.AbstractC11920d;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageLinearLayout extends LinearLayout implements InterfaceC11918b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageLinearLayout$a */
    public class C8169a extends AbstractC11920d {
        public C8169a() {
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: b */
        public int mo12946b() {
            return 0;
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: d */
        public int mo12947d() {
            return LinkageLinearLayout.this.getHeight();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: f */
        public boolean mo12948f() {
            return false;
        }
    }

    public LinkageLinearLayout(Context context) {
        this(context, null);
    }

    @Override // p421y8.InterfaceC11918b
    /* renamed from: a */
    public InterfaceC11919c mo12945a() {
        return new C8169a();
    }

    public LinkageLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // p421y8.InterfaceC11918b
    public void setChildLinkageEvent(InterfaceC11917a interfaceC11917a) {
    }
}
