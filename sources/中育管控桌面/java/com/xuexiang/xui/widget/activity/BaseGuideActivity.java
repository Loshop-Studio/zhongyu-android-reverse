package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC5861i;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p161u1.AbstractC7767a;

/* loaded from: classes3.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C5863a implements SimpleGuideBanner.InterfaceC5870c {

        /* renamed from: a */
        public final /* synthetic */ Class f4535a;

        public C5863a(Class cls) {
            this.f4535a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC5870c
        /* renamed from: a */
        public void mo4440a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f4535a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: l */
    public abstract List m4435l();

    /* renamed from: m */
    public abstract Class m4436m();

    /* renamed from: n */
    public void m4437n(List list, Class cls) throws Resources.NotFoundException {
        m4438o(list, DepthTransformer.class, cls);
    }

    /* renamed from: o */
    public void m4438o(List list, Class cls, Class cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m9360K(6.0f)).m9358I(6.0f)).m9357H(12.0f)).m9356G(3.5f)).m9361L(AbstractC7767a.class)).m9354z(cls)).m9338h(0.0f, 10.0f, 0.0f, 10.0f)).m9353y(list)).m9336C();
        simpleGuideBanner.setOnJumpClickListener(new C5863a(cls2));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AbstractC5861i.m4411b(this);
        setContentView(R$layout.xui_activity_guide);
        m4437n(m4435l(), m4436m());
        m4439p();
    }

    /* renamed from: p */
    public void m4439p() {
    }
}
