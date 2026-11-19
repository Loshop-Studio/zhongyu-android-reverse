package com.shuyu.gsyvideoplayer;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import p220k7.C9827c;
import p236l7.InterfaceC10158h;

/* loaded from: classes5.dex */
public abstract class GSYBaseActivityDetail<T extends GSYBaseVideoPlayer> extends AppCompatActivity implements InterfaceC10158h {

    /* renamed from: c */
    public boolean f12775c;

    /* renamed from: d */
    public boolean f12776d;

    /* renamed from: e */
    public OrientationUtils f12777e;

    /* renamed from: J */
    public abstract boolean m9726J();

    /* renamed from: K */
    public abstract GSYBaseVideoPlayer m9727K();

    /* renamed from: L */
    public boolean m9728L() {
        return true;
    }

    /* renamed from: M */
    public boolean m9729M() {
        return true;
    }

    /* renamed from: N */
    public boolean m9730N() {
        return false;
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: a */
    public void mo5979a(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: b */
    public void mo5980b(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: c */
    public void mo5981c(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: d */
    public void mo5982d(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: e */
    public void mo5983e(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: f */
    public void mo5984f(String str, Object... objArr) {
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils != null) {
            orientationUtils.backToProtVideo();
        }
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: g */
    public void mo5985g(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: h */
    public void mo5986h(String str, Object... objArr) {
    }

    /* renamed from: i */
    public void mo5987i(String str, Object... objArr) {
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils == null) {
            throw new NullPointerException("initVideo() or initVideoBuilderMode() first");
        }
        orientationUtils.setEnable(m9726J() && !m9730N());
        this.f12775c = true;
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: j */
    public void mo5988j(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: k */
    public void mo5989k(String str, Object... objArr) {
    }

    /* renamed from: l */
    public void mo5990l(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: m */
    public void mo5991m(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: n */
    public void mo5992n(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: o */
    public void mo5993o(String str, Object... objArr) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils != null) {
            orientationUtils.backToProtVideo();
        }
        if (C9827c.m19925p(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws NoSuchMethodException, SecurityException {
        super.onConfigurationChanged(configuration);
        if (!this.f12775c || this.f12776d) {
            return;
        }
        m9727K().onConfigurationChanged(this, configuration, this.f12777e, m9728L(), m9729M());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f12775c) {
            m9727K().getCurrentPlayer().release();
        }
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils != null) {
            orientationUtils.releaseListener();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m9727K().getCurrentPlayer().onVideoPause();
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils != null) {
            orientationUtils.setIsPause(true);
        }
        this.f12776d = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m9727K().getCurrentPlayer().onVideoResume();
        OrientationUtils orientationUtils = this.f12777e;
        if (orientationUtils != null) {
            orientationUtils.setIsPause(false);
        }
        this.f12776d = false;
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: p */
    public void mo5994p(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: r */
    public void mo5995r(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: s */
    public void mo5996s(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: t */
    public void mo5997t(String str, Object... objArr) {
    }

    /* renamed from: u */
    public void mo5998u(String str, Object... objArr) {
    }

    /* renamed from: w */
    public void mo5999w(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: x */
    public void mo6000x(String str, Object... objArr) {
    }

    @Override // p236l7.InterfaceC10158h
    /* renamed from: y */
    public void mo6001y(String str, Object... objArr) {
    }
}
