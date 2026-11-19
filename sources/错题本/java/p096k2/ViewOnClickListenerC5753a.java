package p096k2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter;

/* renamed from: k2.a */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5753a extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    public final MaterialSimpleListAdapter f9106a;

    public ViewOnClickListenerC5753a(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
        super(view);
        this.f9106a = materialSimpleListAdapter;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialSimpleListAdapter materialSimpleListAdapter = this.f9106a;
        if (materialSimpleListAdapter != null) {
            materialSimpleListAdapter.getClass();
        }
    }
}
