package p070b.p113c.p114a.p116e.p128f.p130b.p132g;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;

@TargetApi(9)
/* renamed from: b.c.a.e.f.b.g.a */
/* loaded from: classes.dex */
public class C0826a extends AbstractC0828c {

    /* renamed from: a */
    public final OverScroller f4606a;

    public C0826a(Context context) {
        this.f4606a = new OverScroller(context);
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p132g.AbstractC0828c
    /* renamed from: a */
    public boolean mo2546a() {
        return this.f4606a.computeScrollOffset();
    }
}
