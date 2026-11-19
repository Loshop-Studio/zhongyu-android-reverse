package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0495e0;
import p011b0.C1025h;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public class C0457f {

    /* renamed from: a */
    private final AbstractC0459h<?> f3185a;

    private C0457f(AbstractC0459h<?> abstractC0459h) {
        this.f3185a = abstractC0459h;
    }

    /* renamed from: b */
    public static C0457f m2591b(AbstractC0459h<?> abstractC0459h) {
        return new C0457f((AbstractC0459h) C1025h.m4783g(abstractC0459h, "callbacks == null"));
    }

    /* renamed from: a */
    public void m2592a(Fragment fragment) {
        AbstractC0459h<?> abstractC0459h = this.f3185a;
        abstractC0459h.f3191e.m2485k(abstractC0459h, abstractC0459h, fragment);
    }

    /* renamed from: c */
    public void m2593c() {
        this.f3185a.f3191e.m2511z();
    }

    /* renamed from: d */
    public void m2594d(Configuration configuration) {
        this.f3185a.f3191e.m2425B(configuration);
    }

    /* renamed from: e */
    public boolean m2595e(MenuItem menuItem) {
        return this.f3185a.f3191e.m2426C(menuItem);
    }

    /* renamed from: f */
    public void m2596f() {
        this.f3185a.f3191e.m2428D();
    }

    /* renamed from: g */
    public boolean m2597g(Menu menu, MenuInflater menuInflater) {
        return this.f3185a.f3191e.m2430E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m2598h() {
        this.f3185a.f3191e.m2432F();
    }

    /* renamed from: i */
    public void m2599i() {
        this.f3185a.f3191e.m2436H();
    }

    /* renamed from: j */
    public void m2600j(boolean z3) {
        this.f3185a.f3191e.m2437I(z3);
    }

    /* renamed from: k */
    public boolean m2601k(MenuItem menuItem) {
        return this.f3185a.f3191e.m2440K(menuItem);
    }

    /* renamed from: l */
    public void m2602l(Menu menu) {
        this.f3185a.f3191e.m2442L(menu);
    }

    /* renamed from: m */
    public void m2603m() {
        this.f3185a.f3191e.m2445N();
    }

    /* renamed from: n */
    public void m2604n(boolean z3) {
        this.f3185a.f3191e.m2447O(z3);
    }

    /* renamed from: o */
    public boolean m2605o(Menu menu) {
        return this.f3185a.f3191e.m2449P(menu);
    }

    /* renamed from: p */
    public void m2606p() {
        this.f3185a.f3191e.m2452R();
    }

    /* renamed from: q */
    public void m2607q() {
        this.f3185a.f3191e.m2454S();
    }

    /* renamed from: r */
    public void m2608r() {
        this.f3185a.f3191e.m2457U();
    }

    /* renamed from: s */
    public boolean m2609s() {
        return this.f3185a.f3191e.m2467b0(true);
    }

    /* renamed from: t */
    public FragmentManager m2610t() {
        return this.f3185a.f3191e;
    }

    /* renamed from: u */
    public void m2611u() {
        this.f3185a.f3191e.m2460V0();
    }

    /* renamed from: v */
    public View m2612v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3185a.f3191e.m2507w0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m2613w(Parcelable parcelable) {
        AbstractC0459h<?> abstractC0459h = this.f3185a;
        if (!(abstractC0459h instanceof InterfaceC0495e0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0459h.f3191e.m2484j1(parcelable);
    }

    /* renamed from: x */
    public Parcelable m2614x() {
        return this.f3185a.f3191e.m2488l1();
    }
}
