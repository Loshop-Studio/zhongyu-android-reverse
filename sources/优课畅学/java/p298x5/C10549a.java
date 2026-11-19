package p298x5;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p276v5.C10247b;

/* renamed from: x5.a */
/* loaded from: classes5.dex */
public final class C10549a extends View {

    /* renamed from: a */
    public C10247b f20976a;

    public /* synthetic */ C10549a(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final C10247b getMDrawControl() {
        C10247b c10247b = this.f20976a;
        if (c10247b != null) {
            return c10247b;
        }
        AbstractC9133u.m16151y("mDrawControl");
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        super.onDraw(canvas);
        getMDrawControl().m19172d(canvas);
    }

    public final void setMDrawControl(C10247b c10247b) {
        AbstractC9133u.m16133g(c10247b, "<set-?>");
        this.f20976a = c10247b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10549a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
    }
}
