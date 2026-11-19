package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC6484i;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p241t2.AbstractC9380a;

/* loaded from: classes4.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C6485a implements SimpleGuideBanner.InterfaceC6492c {

        /* renamed from: a */
        public final /* synthetic */ Class f5811a;

        public C6485a(Class cls) {
            this.f5811a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC6492c
        /* renamed from: a */
        public void mo5430a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f5811a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: m */
    public abstract List m5425m();

    /* renamed from: n */
    public abstract Class m5426n();

    /* renamed from: o */
    public void m5427o(List list, Class cls) throws Resources.NotFoundException {
        m5428p(list, DepthTransformer.class, cls);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AbstractC6484i.m5405b(this);
        setContentView(R$layout.xui_activity_guide);
        m5427o(m5425m(), m5426n());
        m5429q();
    }

    /* renamed from: p */
    public void m5428p(List list, Class cls, Class cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m15971K(6.0f)).m15969I(6.0f)).m15968H(12.0f)).m15967G(3.5f)).m15972L(AbstractC9380a.class)).m15965z(cls)).m15949h(0.0f, 10.0f, 0.0f, 10.0f)).m15964y(list)).m15947C();
        simpleGuideBanner.setOnJumpClickListener(new C6485a(cls2));
    }

    /* renamed from: q */
    public void m5429q() {
    }
}
