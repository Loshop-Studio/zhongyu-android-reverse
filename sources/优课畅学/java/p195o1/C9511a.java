package p195o1;

import android.content.Context;
import android.widget.ScrollView;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;

/* renamed from: o1.a */
/* loaded from: classes4.dex */
public class C9511a extends ScrollView implements AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.a {

    /* renamed from: a */
    public boolean f18887a;

    /* renamed from: b */
    public boolean f18888b;

    public C9511a(Context context) {
        super(context);
        this.f18888b = true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f18887a) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6443l(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f18888b) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d(this);
        }
    }
}
