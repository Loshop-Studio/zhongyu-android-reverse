package p148r2;

import android.content.Context;
import android.widget.ImageView;
import p165t2.C6583a;

/* renamed from: r2.e */
/* loaded from: classes3.dex */
public final class RunnableC6451e implements Runnable {

    /* renamed from: a */
    public final C6583a f10594a;

    /* renamed from: b */
    public int f10595b;

    /* renamed from: c */
    public int f10596c;

    /* renamed from: d */
    public final /* synthetic */ ViewOnTouchListenerC6457k f10597d;

    public RunnableC6451e(ViewOnTouchListenerC6457k viewOnTouchListenerC6457k, Context context) {
        this.f10597d = viewOnTouchListenerC6457k;
        this.f10594a = new C6583a(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k;
        ImageView imageViewM6117g;
        C6583a c6583a = this.f10594a;
        if (c6583a.f10989b.isFinished() || (imageViewM6117g = (viewOnTouchListenerC6457k = this.f10597d).m6117g()) == null || !c6583a.f10989b.computeScrollOffset()) {
            return;
        }
        int currX = c6583a.f10989b.getCurrX();
        int currY = c6583a.f10989b.getCurrY();
        boolean z8 = ViewOnTouchListenerC6457k.f10598z;
        viewOnTouchListenerC6457k.f10611m.postTranslate(this.f10595b - currX, this.f10596c - currY);
        viewOnTouchListenerC6457k.m6121m(viewOnTouchListenerC6457k.m6116f());
        this.f10595b = currX;
        this.f10596c = currY;
        imageViewM6117g.postOnAnimation(this);
    }
}
