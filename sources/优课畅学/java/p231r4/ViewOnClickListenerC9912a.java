package p231r4;

import android.view.View;

/* renamed from: r4.a */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC9912a implements View.OnClickListener {

    /* renamed from: a */
    public final a f19869a;

    /* renamed from: b */
    public final int f19870b;

    /* renamed from: r4.a$a */
    public interface a {
        void _internalCallbackOnClick(int i10, View view);
    }

    public ViewOnClickListenerC9912a(a aVar, int i10) {
        this.f19869a = aVar;
        this.f19870b = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f19869a._internalCallbackOnClick(this.f19870b, view);
    }
}
