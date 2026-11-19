package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC3533h;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p099n0.AbstractC4405a;

/* loaded from: classes2.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C3534a implements SimpleGuideBanner.InterfaceC3541c {

        /* renamed from: a */
        public final /* synthetic */ Class f3151a;

        public C3534a(Class cls) {
            this.f3151a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC3541c
        /* renamed from: a */
        public void mo4116a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f3151a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: i */
    public abstract List m4111i();

    /* renamed from: j */
    public abstract Class m4112j();

    /* renamed from: k */
    public void m4113k(List list, Class cls) throws Resources.NotFoundException {
        m4114l(list, DepthTransformer.class, cls);
    }

    /* renamed from: l */
    public void m4114l(List list, Class cls, Class cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m5558H(6.0f)).m5556F(6.0f)).m5555E(12.0f)).m5554D(3.5f)).m5559I(AbstractC4405a.class)).m5548w(cls)).m5534h(0.0f, 10.0f, 0.0f, 10.0f)).m5547v(list)).m5551z();
        simpleGuideBanner.setOnJumpClickListener(new C3534a(cls2));
    }

    /* renamed from: m */
    public void m4115m() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AbstractC3533h.m4091a(this);
        setContentView(R$layout.xui_activity_guide);
        m4113k(m4111i(), m4112j());
        m4115m();
    }
}
