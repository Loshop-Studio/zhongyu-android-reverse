package p115g3;

import android.content.Context;
import android.widget.ScrollView;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6798d;

/* renamed from: g3.a */
/* loaded from: classes4.dex */
public class C8049a extends ScrollView implements AbstractViewTreeObserverOnGlobalLayoutListenerC6798d.a {

    /* renamed from: a */
    public boolean f13639a;

    /* renamed from: b */
    public boolean f13640b;

    public C8049a(Context context) {
        super(context);
        this.f13640b = true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f13639a) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6798d.m6455j(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        if (this.f13640b) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6798d.m6449d(this);
        }
    }
}
