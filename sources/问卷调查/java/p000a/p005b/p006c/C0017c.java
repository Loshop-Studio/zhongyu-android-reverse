package p000a.p005b.p006c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: a.b.c.c */
/* loaded from: classes.dex */
public class C0017c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController f55b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0457b f56c;

    public C0017c(AlertController.C0457b c0457b, AlertController alertController) {
        this.f56c = c0457b;
        this.f55b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f56c.f2734h.onClick(this.f55b.f2699b, i);
        if (this.f56c.f2735i) {
            return;
        }
        this.f55b.f2699b.dismiss();
    }
}
