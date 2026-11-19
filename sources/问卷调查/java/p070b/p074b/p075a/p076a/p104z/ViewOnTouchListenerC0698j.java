package p070b.p074b.p075a.p076a.p104z;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: b.b.a.a.z.j */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC0698j implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f4156b;

    /* renamed from: c */
    public final /* synthetic */ C0696h f4157c;

    public ViewOnTouchListenerC0698j(C0696h c0696h, AutoCompleteTextView autoCompleteTextView) {
        this.f4157c = c0696h;
        this.f4156b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f4157c.m2338i()) {
                this.f4157c.f4139i = false;
            }
            C0696h.m2334g(this.f4157c, this.f4156b);
        }
        return false;
    }
}
