package p208q2;

import android.content.Context;
import android.widget.ScrollView;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6479d;

/* renamed from: q2.a */
/* loaded from: classes4.dex */
public class C8882a extends ScrollView implements AbstractViewTreeObserverOnGlobalLayoutListenerC6479d.a {

    /* renamed from: a */
    public boolean f15127a;

    /* renamed from: b */
    public boolean f15128b;

    public C8882a(Context context) {
        super(context);
        this.f15128b = true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f15127a) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6479d.m5354j(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f15128b) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6479d.m5348d(this);
        }
    }
}
