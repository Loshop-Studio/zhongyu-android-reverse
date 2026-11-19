package com.xuexiang.xui.widget.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC6879i;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p228r1.AbstractC9902a;

/* loaded from: classes4.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {

    /* renamed from: com.xuexiang.xui.widget.activity.BaseGuideActivity$a */
    public class C6884a implements SimpleGuideBanner.InterfaceC6891c {

        /* renamed from: a */
        public final /* synthetic */ Class f7136a;

        public C6884a(Class cls) {
            this.f7136a = cls;
        }

        @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.InterfaceC6891c
        /* renamed from: a */
        public void mo6551a() {
            BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) this.f7136a));
            BaseGuideActivity.this.finish();
        }
    }

    /* renamed from: m */
    public abstract List m6546m();

    /* renamed from: n */
    public abstract Class m6547n();

    /* renamed from: o */
    public void m6548o(List list, Class cls) throws Resources.NotFoundException {
        m6549p(list, DepthTransformer.class, cls);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AbstractC6879i.m6504b(this);
        setContentView(R$layout.xui_activity_guide);
        m6548o(m6546m(), m6547n());
        m6550q();
    }

    /* renamed from: p */
    public void m6549p(List list, Class cls, Class cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.m18650K(6.0f)).m18648I(6.0f)).m18647H(12.0f)).m18646G(3.5f)).m18651L(AbstractC9902a.class)).m18644z(cls)).m18628h(0.0f, 10.0f, 0.0f, 10.0f)).m18643y(list)).m18626C();
        simpleGuideBanner.setOnJumpClickListener(new C6884a(cls2));
    }

    /* renamed from: q */
    public void m6550q() {
    }
}
