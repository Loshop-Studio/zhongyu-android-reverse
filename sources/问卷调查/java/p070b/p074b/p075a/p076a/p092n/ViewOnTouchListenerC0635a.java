package p070b.p074b.p075a.p076a.p092n;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: b.b.a.a.n.a */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC0635a implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f3818b;

    /* renamed from: c */
    public final int f3819c;

    /* renamed from: d */
    public final int f3820d;

    /* renamed from: e */
    public final int f3821e;

    public ViewOnTouchListenerC0635a(Dialog dialog, Rect rect) {
        this.f3818b = dialog;
        this.f3819c = rect.left;
        this.f3820d = rect.top;
        this.f3821e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f3819c;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f3820d, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f3821e;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f3818b.onTouchEvent(motionEventObtain);
    }
}
