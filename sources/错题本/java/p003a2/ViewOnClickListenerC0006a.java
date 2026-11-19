package p003a2;

import android.content.Intent;
import android.view.View;
import com.xuexiang.xui.widget.activity.BaseGuideActivity;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import p188w1.C6701a;

/* renamed from: a2.a */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC0006a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f17a;

    /* renamed from: b */
    public final /* synthetic */ SimpleGuideBanner f18b;

    public /* synthetic */ ViewOnClickListenerC0006a(SimpleGuideBanner simpleGuideBanner, int i) {
        this.f17a = i;
        this.f18b = simpleGuideBanner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17a) {
            case 0:
                InterfaceC0007b interfaceC0007b = this.f18b.f4024L;
                if (interfaceC0007b != null) {
                    C6701a c6701a = (C6701a) interfaceC0007b;
                    BaseGuideActivity baseGuideActivity = (BaseGuideActivity) c6701a.f11313b;
                    baseGuideActivity.startActivity(new Intent(baseGuideActivity, (Class<?>) c6701a.f11312a));
                    baseGuideActivity.finish();
                    break;
                }
                break;
            default:
                InterfaceC0007b interfaceC0007b2 = this.f18b.f4024L;
                if (interfaceC0007b2 != null) {
                    C6701a c6701a2 = (C6701a) interfaceC0007b2;
                    BaseGuideActivity baseGuideActivity2 = (BaseGuideActivity) c6701a2.f11313b;
                    baseGuideActivity2.startActivity(new Intent(baseGuideActivity2, (Class<?>) c6701a2.f11312a));
                    baseGuideActivity2.finish();
                    break;
                }
                break;
        }
    }
}
