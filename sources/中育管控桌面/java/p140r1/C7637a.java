package p140r1;

import android.content.Context;
import android.widget.ScrollView;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC5856d;

/* renamed from: r1.a */
/* loaded from: classes3.dex */
public class C7637a extends ScrollView implements AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.a {

    /* renamed from: a */
    public boolean f10088a;

    /* renamed from: b */
    public boolean f10089b;

    public C7637a(Context context) {
        super(context);
        this.f10089b = true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f10088a) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.m4359j(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        if (this.f10089b) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.m4353d(this);
        }
    }
}
