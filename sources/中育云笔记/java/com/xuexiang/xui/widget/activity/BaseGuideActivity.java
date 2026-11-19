package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC8044j;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p132e8.AbstractC9109a;

/* loaded from: classes5.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C8048a implements SimpleGuideBanner.InterfaceC8061c {

        /* renamed from: a */
        public final /* synthetic */ Class f15356a;

        public C8048a(Class cls) {
            this.f15356a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC8061c
        /* renamed from: a */
        public void mo12277a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f15356a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: J */
    public abstract List m12272J();

    /* renamed from: K */
    public abstract Class m12273K();

    /* renamed from: L */
    public void m12274L(List list, Class cls) {
        m12275M(list, DepthTransformer.class, cls);
    }

    /* renamed from: M */
    public void m12275M(List list, Class cls, Class cls2) {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m12409J(6.0f)).m12407H(6.0f)).m12406G(12.0f)).m12405F(3.5f)).m12410K(AbstractC9109a.class)).m12399x(cls)).m12386h(0.0f, 10.0f, 0.0f, 10.0f)).m12398w(list)).m12384B();
        simpleGuideBanner.setOnJumpClickListener(new C8048a(cls2));
    }

    /* renamed from: N */
    public void m12276N() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC8044j.m12240a(this);
        setContentView(R$layout.xui_activity_guide);
        m12274L(m12272J(), m12273K());
        m12276N();
    }
}
