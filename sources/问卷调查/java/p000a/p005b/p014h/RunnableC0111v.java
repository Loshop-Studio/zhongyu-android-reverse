package p000a.p005b.p014h;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: a.b.h.v */
/* loaded from: classes.dex */
public class RunnableC0111v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextView f812b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f813c;

    /* renamed from: d */
    public final /* synthetic */ int f814d;

    public RunnableC0111v(C0109u c0109u, TextView textView, Typeface typeface, int i) {
        this.f812b = textView;
        this.f813c = typeface;
        this.f814d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f812b.setTypeface(this.f813c, this.f814d);
    }
}
