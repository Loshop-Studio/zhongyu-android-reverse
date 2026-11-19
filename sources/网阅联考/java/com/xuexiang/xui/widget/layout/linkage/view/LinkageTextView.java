package com.xuexiang.xui.widget.layout.linkage.view;

import androidx.appcompat.widget.AppCompatTextView;
import p048d1.AbstractC3703d;
import p048d1.InterfaceC3700a;
import p048d1.InterfaceC3701b;
import p048d1.InterfaceC3702c;

/* loaded from: classes2.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC3701b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C3596a extends AbstractC3703d {
        public C3596a() {
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: c */
        public int mo4480c() {
            return 0;
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: d */
        public boolean mo4481d() {
            return false;
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: g */
        public int mo4484g() {
            return LinkageTextView.this.getHeight();
        }
    }

    @Override // p048d1.InterfaceC3701b
    /* renamed from: a */
    public InterfaceC3702c mo4477a() {
        return new C3596a();
    }

    @Override // p048d1.InterfaceC3701b
    public void setChildLinkageEvent(InterfaceC3700a interfaceC3700a) {
    }
}
