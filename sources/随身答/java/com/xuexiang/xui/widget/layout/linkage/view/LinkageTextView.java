package com.xuexiang.xui.widget.layout.linkage.view;

import androidx.appcompat.widget.AppCompatTextView;
import p033c4.AbstractC5228d;
import p033c4.InterfaceC5225a;
import p033c4.InterfaceC5226b;
import p033c4.InterfaceC5227c;

/* loaded from: classes4.dex */
public class LinkageTextView extends AppCompatTextView implements InterfaceC5226b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView$a */
    public class C6876a extends AbstractC5228d {
        public C6876a() {
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: b */
        public int mo2339b() {
            return 0;
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: d */
        public int mo2341d() {
            return LinkageTextView.this.getHeight();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: f */
        public boolean mo2343f() {
            return false;
        }
    }

    @Override // p033c4.InterfaceC5226b
    /* renamed from: a */
    public InterfaceC5227c mo2337a() {
        return new C6876a();
    }

    @Override // p033c4.InterfaceC5226b
    public void setChildLinkageEvent(InterfaceC5225a interfaceC5225a) {
    }
}
