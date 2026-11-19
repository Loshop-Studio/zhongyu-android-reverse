package p092k4;

import android.graphics.drawable.PictureDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;
import p181x0.InterfaceC7825c;
import p188y0.AbstractC7891e;
import p188y0.InterfaceC7894h;

/* renamed from: k4.c */
/* loaded from: classes4.dex */
public final class C6677c implements InterfaceC7825c {
    @Override // p181x0.InterfaceC7825c
    /* renamed from: a */
    public boolean mo7603a(GlideException glideException, Object obj, InterfaceC7894h target, boolean z6) {
        Intrinsics.checkNotNullParameter(target, "target");
        View viewM9691k = ((AbstractC7891e) target).m9691k();
        Intrinsics.checkNotNullExpressionValue(viewM9691k, "getView(...)");
        ((ImageView) viewM9691k).setLayerType(0, null);
        return false;
    }

    @Override // p181x0.InterfaceC7825c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo7604b(PictureDrawable resource, Object model, InterfaceC7894h target, DataSource dataSource, boolean z6) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        View viewM9691k = ((AbstractC7891e) target).m9691k();
        Intrinsics.checkNotNullExpressionValue(viewM9691k, "getView(...)");
        ((ImageView) viewM9691k).setLayerType(1, null);
        return false;
    }
}
