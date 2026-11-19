package p070b.p074b.p075a.p076a.p104z;

import android.view.View;
import android.widget.AdapterView;
import p000a.p005b.p014h.C0084h0;

/* renamed from: b.b.a.a.z.o */
/* loaded from: classes.dex */
public class C0703o implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0704p f4190b;

    public C0703o(C0704p c0704p) {
        this.f4190b = c0704p;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        C0704p c0704p = this.f4190b;
        if (i < 0) {
            C0084h0 c0084h0 = c0704p.f4191e;
            item = !c0084h0.mo171a() ? null : c0084h0.f647d.getSelectedItem();
        } else {
            item = c0704p.getAdapter().getItem(i);
        }
        C0704p.m2350a(this.f4190b, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f4190b.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C0084h0 c0084h02 = this.f4190b.f4191e;
                view = !c0084h02.mo171a() ? null : c0084h02.f647d.getSelectedView();
                C0084h0 c0084h03 = this.f4190b.f4191e;
                i = !c0084h03.mo171a() ? -1 : c0084h03.f647d.getSelectedItemPosition();
                C0084h0 c0084h04 = this.f4190b.f4191e;
                j = !c0084h04.mo171a() ? Long.MIN_VALUE : c0084h04.f647d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f4190b.f4191e.f647d, view, i, j);
        }
        this.f4190b.f4191e.dismiss();
    }
}
