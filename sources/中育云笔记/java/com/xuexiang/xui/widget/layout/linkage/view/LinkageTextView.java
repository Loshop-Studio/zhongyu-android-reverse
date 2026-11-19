package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p421y8.AbstractC11920d;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC11918b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C8173a extends AbstractC11920d {
        public C8173a() {
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: b */
        public int mo12946b() {
            return 0;
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: d */
        public int mo12947d() {
            return LinkageTextView.this.getHeight();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: f */
        public boolean mo12948f() {
            return false;
        }
    }

    public LinkageTextView(Context context) {
        this(context, null);
    }

    @Override // p421y8.InterfaceC11918b
    /* renamed from: a */
    public InterfaceC11919c mo12945a() {
        return new C8173a();
    }

    public LinkageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // p421y8.InterfaceC11918b
    public void setChildLinkageEvent(InterfaceC11917a interfaceC11917a) {
    }
}
