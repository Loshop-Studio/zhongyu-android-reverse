package p000a.p005b.p014h;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.b.h.g0 */
/* loaded from: classes.dex */
public class C0082g0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C0084h0 f634b;

    public C0082g0(C0084h0 c0084h0) {
        this.f634b = c0084h0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0074c0 c0074c0;
        if (i == -1 || (c0074c0 = this.f634b.f647d) == null) {
            return;
        }
        c0074c0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
