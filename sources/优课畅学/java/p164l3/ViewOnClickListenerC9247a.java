package p164l3;

import android.view.View;

/* renamed from: l3.a */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC9247a implements View.OnClickListener {

    /* renamed from: a */
    public final a f18236a;

    /* renamed from: b */
    public final int f18237b;

    /* renamed from: l3.a$a */
    public interface a {
        void _internalCallbackOnClick(int i10, View view);
    }

    public ViewOnClickListenerC9247a(a aVar, int i10) {
        this.f18236a = aVar;
        this.f18237b = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f18236a._internalCallbackOnClick(this.f18237b, view);
    }
}
