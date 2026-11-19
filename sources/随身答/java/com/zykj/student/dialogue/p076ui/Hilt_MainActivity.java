package com.zykj.student.dialogue.p076ui;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import p170l6.InterfaceC8893b;
import p275v7.AbstractC9769a;
import p285w7.C9836a;
import p285w7.C9842g;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_MainActivity extends AppCompatActivity implements InterfaceC9966b {

    /* renamed from: a */
    public C9842g f10561a;

    /* renamed from: b */
    public volatile C9836a f10562b;

    /* renamed from: c */
    public final Object f10563c = new Object();

    /* renamed from: d */
    public boolean f10564d = false;

    /* renamed from: com.zykj.student.dialogue.ui.Hilt_MainActivity$a */
    public class C7449a implements OnContextAvailableListener {
        public C7449a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.m9981q();
        }
    }

    public Hilt_MainActivity() {
        m9977m();
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m9978n().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16550a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: m */
    public final void m9977m() {
        addOnContextAvailableListener(new C7449a());
    }

    /* renamed from: n */
    public final C9836a m9978n() {
        if (this.f10562b == null) {
            synchronized (this.f10563c) {
                try {
                    if (this.f10562b == null) {
                        this.f10562b = m9979o();
                    }
                } finally {
                }
            }
        }
        return this.f10562b;
    }

    /* renamed from: o */
    public C9836a m9979o() {
        return new C9836a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9980p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9842g c9842g = this.f10561a;
        if (c9842g != null) {
            c9842g.m16777a();
        }
    }

    /* renamed from: p */
    public final void m9980p() {
        if (getApplication() instanceof InterfaceC9966b) {
            C9842g c9842gM16763b = m9978n().m16763b();
            this.f10561a = c9842gM16763b;
            if (c9842gM16763b.m16778b()) {
                this.f10561a.m16779c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* renamed from: q */
    public void m9981q() {
        if (this.f10564d) {
            return;
        }
        this.f10564d = true;
        ((InterfaceC8893b) generatedComponent()).mo12816c((MainActivity) AbstractC9968d.m17240a(this));
    }
}
