package com.zykj.study.p065ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AbstractC5379p;
import com.zykj.study.R$layout;
import com.zykj.video.play.C8162b;
import com.zykj.video.play.R$id;
import com.zykj.video.play.SuperPlayerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import org.json.JSONException;
import p132i5.C8758a;
import p143j5.C9021h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SuperPlayerActivity extends Activity implements View.OnClickListener, SuperPlayerView.InterfaceC8160f {

    /* renamed from: c */
    public static final C7772a f11719c = new C7772a(null);

    /* renamed from: d */
    public static final int f11720d = 8;

    /* renamed from: a */
    public ImageView f11721a;

    /* renamed from: b */
    public SuperPlayerView f11722b;

    /* renamed from: com.zykj.study.ui.SuperPlayerActivity$a */
    public static final class C7772a {
        public /* synthetic */ C7772a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7772a() {
        }
    }

    @Override // com.zykj.video.play.SuperPlayerView.InterfaceC8160f
    /* renamed from: a */
    public void mo10500a() {
    }

    @Override // com.zykj.video.play.SuperPlayerView.InterfaceC8160f
    /* renamed from: b */
    public void mo10501b() throws JSONException {
        SuperPlayerView superPlayerView = this.f11722b;
        if (superPlayerView == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView = null;
        }
        superPlayerView.m12393p0();
        finish();
    }

    @Override // com.zykj.video.play.SuperPlayerView.InterfaceC8160f
    /* renamed from: c */
    public void mo10502c() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    @Override // com.zykj.video.play.SuperPlayerView.InterfaceC8160f
    /* renamed from: d */
    public void mo10503d() throws JSONException {
        m10507h();
    }

    @Override // com.zykj.video.play.SuperPlayerView.InterfaceC8160f
    /* renamed from: e */
    public void mo10504e() {
    }

    /* renamed from: f */
    public final void m10505f() {
        View viewFindViewById = findViewById(R$id.superplayer_iv_back);
        AbstractC9133u.m16132f(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f11721a = imageView;
        SuperPlayerView superPlayerView = null;
        if (imageView == null) {
            AbstractC9133u.m16151y("mImageBack");
            imageView = null;
        }
        imageView.setOnClickListener(this);
        View viewFindViewById2 = findViewById(com.zykj.study.R$id.superVodPlayerView);
        AbstractC9133u.m16132f(viewFindViewById2, "findViewById(...)");
        SuperPlayerView superPlayerView2 = (SuperPlayerView) viewFindViewById2;
        this.f11722b = superPlayerView2;
        if (superPlayerView2 == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
        } else {
            superPlayerView = superPlayerView2;
        }
        superPlayerView.setPlayerViewCallback(this);
    }

    /* renamed from: g */
    public final void m10506g(C9021h c9021h) throws JSONException, InterruptedException {
        C8162b c8162b = new C8162b();
        c8162b.f14599a = c9021h.f17249c;
        SuperPlayerView superPlayerView = null;
        if (!TextUtils.isEmpty(c9021h.f17248b)) {
            c8162b.f14604f = c9021h.f17247a;
            c8162b.f14600b = c9021h.f17248b;
            c8162b.f14601c = new ArrayList();
            List list = c9021h.f17251e;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5379p.m2596a(it.next());
                    throw null;
                }
            }
        } else if (!TextUtils.isEmpty(c9021h.f17250d)) {
            C8758a c8758a = new C8758a();
            c8162b.f14603e = c8758a;
            c8758a.f16420a = c9021h.f17250d;
        }
        SuperPlayerView superPlayerView2 = this.f11722b;
        if (superPlayerView2 == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
        } else {
            superPlayerView = superPlayerView2;
        }
        superPlayerView.m12389l0(c8162b);
    }

    /* renamed from: h */
    public final void m10507h() throws JSONException {
        SuperPlayerView superPlayerView = this.f11722b;
        if (superPlayerView == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView = null;
        }
        superPlayerView.m12393p0();
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) throws JSONException {
        AbstractC9133u.m16133g(v10, "v");
        if (v10.getId() == R$id.superplayer_iv_back) {
            m10507h();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException, InterruptedException {
        super.onCreate(bundle);
        setContentView(R$layout.activity_supervod_player);
        getWindow().addFlags(128);
        m10505f();
        C9021h c9021h = new C9021h();
        c9021h.f17249c = 1252463788;
        c9021h.f17248b = getIntent().getStringExtra("path");
        m10506g(c9021h);
    }

    @Override // android.app.Activity
    public void onDestroy() throws JSONException {
        super.onDestroy();
        SuperPlayerView superPlayerView = this.f11722b;
        SuperPlayerView superPlayerView2 = null;
        if (superPlayerView == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView = null;
        }
        superPlayerView.m12390m0();
        SuperPlayerView superPlayerView3 = this.f11722b;
        if (superPlayerView3 == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView3 = null;
        }
        if (superPlayerView3.getPlayMode() != 3) {
            SuperPlayerView superPlayerView4 = this.f11722b;
            if (superPlayerView4 == null) {
                AbstractC9133u.m16151y("mSuperPlayerView");
            } else {
                superPlayerView2 = superPlayerView4;
            }
            superPlayerView2.m12393p0();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        SuperPlayerView superPlayerView = this.f11722b;
        SuperPlayerView superPlayerView2 = null;
        if (superPlayerView == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView = null;
        }
        Log.i("SuperPlayerActivity", "onPause state :" + superPlayerView.getPlayState());
        SuperPlayerView superPlayerView3 = this.f11722b;
        if (superPlayerView3 == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView3 = null;
        }
        if (superPlayerView3.getPlayMode() != 3) {
            SuperPlayerView superPlayerView4 = this.f11722b;
            if (superPlayerView4 == null) {
                AbstractC9133u.m16151y("mSuperPlayerView");
            } else {
                superPlayerView2 = superPlayerView4;
            }
            superPlayerView2.m12381d0();
        }
    }

    @Override // android.app.Activity
    public void onResume() throws InterruptedException {
        View decorView;
        super.onResume();
        SuperPlayerView superPlayerView = this.f11722b;
        SuperPlayerView superPlayerView2 = null;
        if (superPlayerView == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
            superPlayerView = null;
        }
        if (superPlayerView.getPlayState() == 1) {
            SuperPlayerView superPlayerView3 = this.f11722b;
            if (superPlayerView3 == null) {
                AbstractC9133u.m16151y("mSuperPlayerView");
                superPlayerView3 = null;
            }
            superPlayerView3.m12382e0();
            SuperPlayerView superPlayerView4 = this.f11722b;
            if (superPlayerView4 == null) {
                AbstractC9133u.m16151y("mSuperPlayerView");
                superPlayerView4 = null;
            }
            if (superPlayerView4.getPlayMode() == 3) {
                SuperPlayerView superPlayerView5 = this.f11722b;
                if (superPlayerView5 == null) {
                    AbstractC9133u.m16151y("mSuperPlayerView");
                    superPlayerView5 = null;
                }
                superPlayerView5.m12392o0(1);
            }
        }
        SuperPlayerView superPlayerView6 = this.f11722b;
        if (superPlayerView6 == null) {
            AbstractC9133u.m16151y("mSuperPlayerView");
        } else {
            superPlayerView2 = superPlayerView6;
        }
        if (superPlayerView2.getPlayMode() != 2 || (decorView = getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(4102);
    }
}
