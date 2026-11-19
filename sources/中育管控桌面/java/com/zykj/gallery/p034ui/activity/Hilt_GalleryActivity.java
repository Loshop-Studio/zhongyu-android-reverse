package com.zykj.gallery.p034ui.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import p056f3.InterfaceC6314j;
import p178w4.AbstractC7815a;
import p185x4.C7856a;
import p185x4.C7863h;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7948b;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_GalleryActivity extends ComponentActivity implements InterfaceC7949c {

    /* renamed from: a */
    public C7863h f5837a;

    /* renamed from: b */
    public volatile C7856a f5838b;

    /* renamed from: c */
    public final Object f5839c = new Object();

    /* renamed from: d */
    public boolean f5840d = false;

    /* renamed from: com.zykj.gallery.ui.activity.Hilt_GalleryActivity$a */
    public class C6026a implements OnContextAvailableListener {
        public C6026a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_GalleryActivity.this.m5055l();
        }
    }

    public Hilt_GalleryActivity() {
        m5051h();
    }

    /* renamed from: h */
    private void m5051h() {
        addOnContextAvailableListener(new C6026a());
    }

    /* renamed from: k */
    private void m5052k() {
        if (getApplication() instanceof InterfaceC7948b) {
            C7863h c7863hM9526b = m5053i().m9526b();
            this.f5837a = c7863hM9526b;
            if (c7863hM9526b.m9542b()) {
                this.f5837a.m9543c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5053i().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9402a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public final C7856a m5053i() {
        if (this.f5838b == null) {
            synchronized (this.f5839c) {
                try {
                    if (this.f5838b == null) {
                        this.f5838b = m5054j();
                    }
                } finally {
                }
            }
        }
        return this.f5838b;
    }

    /* renamed from: j */
    public C7856a m5054j() {
        return new C7856a(this);
    }

    /* renamed from: l */
    public void m5055l() {
        if (this.f5840d) {
            return;
        }
        this.f5840d = true;
        ((InterfaceC6314j) generatedComponent()).mo5215d((GalleryActivity) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5052k();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C7863h c7863h = this.f5837a;
        if (c7863h != null) {
            c7863h.m9541a();
        }
    }
}
