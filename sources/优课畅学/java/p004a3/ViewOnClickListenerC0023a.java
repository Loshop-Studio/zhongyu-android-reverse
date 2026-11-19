package p004a3;

import android.view.View;
import com.zykj.base.ext.BindingAdaptersKt;
import p300x7.InterfaceC10559a;

/* renamed from: a3.a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0023a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10559a f66a;

    public /* synthetic */ ViewOnClickListenerC0023a(InterfaceC10559a interfaceC10559a) {
        this.f66a = interfaceC10559a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BindingAdaptersKt.m7346b(this.f66a, view);
    }
}
