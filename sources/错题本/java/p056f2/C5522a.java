package p056f2;

import com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton;
import java.util.TimerTask;

/* renamed from: f2.a */
/* loaded from: classes3.dex */
public final class C5522a extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ RippleShadowShadowButton f8557a;

    public C5522a(RippleShadowShadowButton rippleShadowShadowButton) {
        this.f8557a = rippleShadowShadowButton;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f8557a.postInvalidate();
    }
}
