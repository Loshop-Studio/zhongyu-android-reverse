package p189w2;

import android.view.ViewTreeObserver;
import com.xuexiang.xui.widget.imageview.preview.p034ui.BasePhotoFragment;
import com.xuexiang.xui.widget.imageview.preview.p034ui.PreviewActivity;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;

/* renamed from: w2.d */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC6705d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ PreviewActivity f11317a;

    public ViewTreeObserverOnGlobalLayoutListenerC6705d(PreviewActivity previewActivity) {
        this.f11317a = previewActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        PreviewActivity previewActivity = this.f11317a;
        previewActivity.f4449e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ArrayList arrayList = previewActivity.f4448d;
        int i = previewActivity.f4447c;
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) ((arrayList == null || i < 0 || i >= arrayList.size()) ? null : arrayList.get(i));
        if (basePhotoFragment != null) {
            SmoothImageView smoothImageView = basePhotoFragment.f4441a;
            smoothImageView.setOnTransformListener(new C6703b(basePhotoFragment));
            smoothImageView.f4500j = true;
            smoothImageView.f4493c = SmoothImageView.Status.STATE_IN;
            smoothImageView.invalidate();
        }
    }
}
