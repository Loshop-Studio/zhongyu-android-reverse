package com.xuexiang.xui.widget.layout.linkage.view;

import androidx.appcompat.widget.AppCompatTextView;
import p163l2.AbstractC9246d;
import p163l2.InterfaceC9243a;
import p163l2.InterfaceC9244b;
import p163l2.InterfaceC9245c;

/* loaded from: classes4.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC9244b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C6962a extends AbstractC9246d {
        public C6962a() {
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: b */
        public int mo7032b() {
            return 0;
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: d */
        public int mo7034d() {
            return LinkageTextView.this.getHeight();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: f */
        public boolean mo7036f() {
            return false;
        }
    }

    @Override // p163l2.InterfaceC9244b
    /* renamed from: a */
    public InterfaceC9245c mo7030a() {
        return new C6962a();
    }

    @Override // p163l2.InterfaceC9244b
    public void setChildLinkageEvent(InterfaceC9243a interfaceC9243a) {
    }
}
