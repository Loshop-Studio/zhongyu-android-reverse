package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC6803i;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p145j3.AbstractC8212a;

/* loaded from: classes4.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C6804a implements SimpleGuideBanner.InterfaceC6811c {

        /* renamed from: a */
        public final /* synthetic */ Class f7066a;

        public C6804a(Class cls) {
            this.f7066a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC6811c
        /* renamed from: a */
        public void mo6526a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f7066a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: m */
    public abstract List m6521m();

    /* renamed from: n */
    public abstract Class m6522n();

    /* renamed from: o */
    public void m6523o(List list, Class cls) throws Resources.NotFoundException {
        m6524p(list, DepthTransformer.class, cls);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AbstractC6803i.m6501a(this);
        setContentView(R$layout.xui_activity_guide);
        m6523o(m6521m(), m6522n());
        m6525q();
    }

    /* renamed from: p */
    public void m6524p(List list, Class cls, Class cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m13370H(6.0f)).m13368F(6.0f)).m13367E(12.0f)).m13366D(3.5f)).m13371I(AbstractC8212a.class)).m13361w(cls)).m13348h(0.0f, 10.0f, 0.0f, 10.0f)).m13360v(list)).m13364z();
        simpleGuideBanner.setOnJumpClickListener(new C6804a(cls2));
    }

    /* renamed from: q */
    public void m6525q() {
    }
}
