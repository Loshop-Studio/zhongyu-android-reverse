package com.zykj.message;

import android.view.View;
import com.zykj.message.client.C4423b;

/* renamed from: com.zykj.message.a */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC4419a implements View.OnClickListener {

    /* renamed from: b */
    public static final ViewOnClickListenerC4419a f5669b = new ViewOnClickListenerC4419a(0);

    /* renamed from: c */
    public static final ViewOnClickListenerC4419a f5670c = new ViewOnClickListenerC4419a(1);

    /* renamed from: a */
    public final /* synthetic */ int f5671a;

    public /* synthetic */ ViewOnClickListenerC4419a(int i) {
        this.f5671a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5671a) {
            case 0:
                C4423b.f5678e.m3902a();
                break;
            default:
                C4423b.f5678e.m3902a();
                break;
        }
    }
}
