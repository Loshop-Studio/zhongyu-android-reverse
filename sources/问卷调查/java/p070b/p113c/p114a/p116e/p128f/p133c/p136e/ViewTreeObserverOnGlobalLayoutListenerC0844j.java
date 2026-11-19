package p070b.p113c.p114a.p116e.p128f.p133c.p136e;

import android.view.ViewTreeObserver;
import com.xuexiang.xui.widget.imageview.preview.p159ui.PreviewActivity;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.List;

/* renamed from: b.c.a.e.f.c.e.j */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0844j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ PreviewActivity f4628b;

    public ViewTreeObserverOnGlobalLayoutListenerC0844j(PreviewActivity previewActivity) {
        this.f4628b = previewActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f4628b.f5225s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        PreviewActivity previewActivity = this.f4628b;
        List<C0842h> list = previewActivity.f5224r;
        int i = previewActivity.f5223q;
        C0842h c0842h = list != null && i >= 0 && i < list.size() ? list.get(i) : null;
        if (c0842h != null) {
            SmoothImageView smoothImageView = c0842h.f4622X;
            smoothImageView.setOnTransformListener(new C0841g(c0842h));
            smoothImageView.f5282m = true;
            smoothImageView.f5275f = SmoothImageView.EnumC0974g.STATE_IN;
            smoothImageView.invalidate();
        }
    }
}
