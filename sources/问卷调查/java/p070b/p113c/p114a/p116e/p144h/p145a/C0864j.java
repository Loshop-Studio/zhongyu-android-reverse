package p070b.p113c.p114a.p116e.p144h.p145a;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: b.c.a.e.h.a.j */
/* loaded from: classes.dex */
public class C0864j extends C0861g implements InterfaceC0875u {

    /* renamed from: n */
    public boolean f4667n;

    public C0864j(Context context) {
        super(context);
        this.f4667n = true;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f4667n;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f4667n != z) {
            this.f4667n = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0856b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4667n) {
            super.draw(canvas);
        }
    }
}
