package com.xuexiang.xui.widget.layout.linkage.view;

import androidx.appcompat.widget.AppCompatTextView;
import p113n2.AbstractC7459d;
import p113n2.InterfaceC7456a;
import p113n2.InterfaceC7457b;
import p113n2.InterfaceC7458c;

/* loaded from: classes3.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC7457b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C5935a extends AbstractC7459d {
        public C5935a() {
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: b */
        public int mo4857b() {
            return 0;
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: d */
        public int mo4859d() {
            return LinkageTextView.this.getHeight();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: f */
        public boolean mo4861f() {
            return false;
        }
    }

    @Override // p113n2.InterfaceC7457b
    /* renamed from: a */
    public InterfaceC7458c mo4855a() {
        return new C5935a();
    }

    @Override // p113n2.InterfaceC7457b
    public void setChildLinkageEvent(InterfaceC7456a interfaceC7456a) {
    }
}
