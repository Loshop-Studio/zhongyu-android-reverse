package p070b.p113c.p114a.p116e.p128f.p133c.p136e;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.xuexiang.xui.widget.imageview.preview.p159ui.VideoPlayerActivity;
import p000a.p031h.p033c.C0192a;
import p000a.p052k.p053b.AbstractC0346z;

/* renamed from: b.c.a.e.f.c.e.a */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0835a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0842h f4613b;

    public ViewOnClickListenerC0835a(C0842h c0842h) {
        this.f4613b = c0842h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strM2554l = this.f4613b.f4620V.m2554l();
        if (strM2554l == null || strM2554l.isEmpty()) {
            return;
        }
        int i = C0842h.f4619c0;
        C0842h c0842h = this.f4613b;
        int i2 = VideoPlayerActivity.f5232p;
        Intent intent = new Intent(c0842h.m1164k(), (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("com.xuexiang.xui.widget.preview.KEY_URL", strM2554l);
        AbstractC0346z<?> abstractC0346z = c0842h.f1996u;
        if (abstractC0346z != null) {
            Context context = abstractC0346z.f2122c;
            Object obj = C0192a.f1425a;
            C0192a.a.m734b(context, intent, null);
        } else {
            throw new IllegalStateException("Fragment " + c0842h + " not attached to Activity");
        }
    }
}
