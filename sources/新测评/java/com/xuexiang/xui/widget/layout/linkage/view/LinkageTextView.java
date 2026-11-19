package com.xuexiang.xui.widget.layout.linkage.view;

import androidx.appcompat.widget.AppCompatTextView;
import p165m3.AbstractC8548d;
import p165m3.InterfaceC8545a;
import p165m3.InterfaceC8546b;
import p165m3.InterfaceC8547c;

/* loaded from: classes4.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC8546b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C6556a extends AbstractC8548d {
        public C6556a() {
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: b */
        public int mo5838b() {
            return 0;
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: d */
        public int mo5840d() {
            return LinkageTextView.this.getHeight();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: f */
        public boolean mo5842f() {
            return false;
        }
    }

    @Override // p165m3.InterfaceC8546b
    /* renamed from: a */
    public InterfaceC8547c mo5836a() {
        return new C6556a();
    }

    @Override // p165m3.InterfaceC8546b
    public void setChildLinkageEvent(InterfaceC8545a interfaceC8545a) {
    }
}
