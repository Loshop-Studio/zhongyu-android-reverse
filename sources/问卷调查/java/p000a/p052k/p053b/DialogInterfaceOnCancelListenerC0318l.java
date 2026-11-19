package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import p000a.p052k.p053b.AbstractC0301c0.m;
import p000a.p052k.p053b.AbstractC0319l0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p057m.C0363l;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0364m;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.l */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0318l extends ComponentCallbacksC0320m implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: V */
    public Handler f1912V;

    /* renamed from: e0 */
    public boolean f1921e0;

    /* renamed from: g0 */
    public Dialog f1923g0;

    /* renamed from: h0 */
    public boolean f1924h0;

    /* renamed from: i0 */
    public boolean f1925i0;

    /* renamed from: W */
    public Runnable f1913W = new a();

    /* renamed from: X */
    public DialogInterface.OnCancelListener f1914X = new b();

    /* renamed from: Y */
    public DialogInterface.OnDismissListener f1915Y = new c();

    /* renamed from: Z */
    public int f1916Z = 0;

    /* renamed from: a0 */
    public int f1917a0 = 0;

    /* renamed from: b0 */
    public boolean f1918b0 = true;

    /* renamed from: c0 */
    public boolean f1919c0 = true;

    /* renamed from: d0 */
    public int f1920d0 = -1;

    /* renamed from: f0 */
    public InterfaceC0364m<InterfaceC0358g> f1922f0 = new d();

    /* renamed from: j0 */
    public boolean f1926j0 = false;

    /* renamed from: a.k.b.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC0318l dialogInterfaceOnCancelListenerC0318l = DialogInterfaceOnCancelListenerC0318l.this;
            dialogInterfaceOnCancelListenerC0318l.f1915Y.onDismiss(dialogInterfaceOnCancelListenerC0318l.f1923g0);
        }
    }

    /* renamed from: a.k.b.l$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0318l dialogInterfaceOnCancelListenerC0318l = DialogInterfaceOnCancelListenerC0318l.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0318l.f1923g0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0318l.onCancel(dialog);
            }
        }
    }

    /* renamed from: a.k.b.l$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0318l dialogInterfaceOnCancelListenerC0318l = DialogInterfaceOnCancelListenerC0318l.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0318l.f1923g0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0318l.onDismiss(dialog);
            }
        }
    }

    /* renamed from: a.k.b.l$d */
    public class d implements InterfaceC0364m<InterfaceC0358g> {
        public d() {
        }
    }

    /* renamed from: a.k.b.l$e */
    public class e extends AbstractC0338v {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0338v f1931a;

        public e(AbstractC0338v abstractC0338v) {
            this.f1931a = abstractC0338v;
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: f */
        public View mo1127f(int i) {
            if (this.f1931a.mo1128h()) {
                return this.f1931a.mo1127f(i);
            }
            Dialog dialog = DialogInterfaceOnCancelListenerC0318l.this.f1923g0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: h */
        public boolean mo1128h() {
            return this.f1931a.mo1128h() || DialogInterfaceOnCancelListenerC0318l.this.f1926j0;
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: J */
    public void mo1113J(Context context) {
        super.mo1113J(context);
        C0363l<InterfaceC0358g> c0363l = this.f1974R;
        InterfaceC0364m<InterfaceC0358g> interfaceC0364m = this.f1922f0;
        Objects.requireNonNull(c0363l);
        LiveData.m1721a("observeForever");
        LiveData.C0516a c0516a = new LiveData.C0516a(c0363l, interfaceC0364m);
        LiveData<InterfaceC0358g>.AbstractC0517b abstractC0517bMo463d = c0363l.f3191b.mo463d(interfaceC0364m, c0516a);
        if (abstractC0517bMo463d instanceof LiveData.LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0517bMo463d == null) {
            c0516a.m1726h(true);
        }
        this.f1925i0 = false;
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: M */
    public void mo1114M(Bundle bundle) {
        super.mo1114M(bundle);
        this.f1912V = new Handler();
        this.f1919c0 = this.f2000y == 0;
        if (bundle != null) {
            this.f1916Z = bundle.getInt("android:style", 0);
            this.f1917a0 = bundle.getInt("android:theme", 0);
            this.f1918b0 = bundle.getBoolean("android:cancelable", true);
            this.f1919c0 = bundle.getBoolean("android:showsDialog", this.f1919c0);
            this.f1920d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: R */
    public void mo1115R() {
        this.f1961E = true;
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            this.f1924h0 = true;
            dialog.setOnDismissListener(null);
            this.f1923g0.dismiss();
            if (!this.f1925i0) {
                onDismiss(this.f1923g0);
            }
            this.f1923g0 = null;
            this.f1926j0 = false;
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: S */
    public void mo1116S() {
        this.f1961E = true;
        if (!this.f1925i0) {
            this.f1925i0 = true;
        }
        this.f1974R.mo1300f(this.f1922f0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:27:0x004d, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:28:0x0065), top: B:48:0x001a }] */
    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.LayoutInflater mo1117T(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = r7.m1178r()
            boolean r1 = r7.f1919c0
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L9b
            boolean r4 = r7.f1921e0
            if (r4 == 0) goto L11
            goto L9b
        L11:
            if (r1 != 0) goto L14
            goto L6f
        L14:
            boolean r1 = r7.f1926j0
            if (r1 != 0) goto L6f
            r1 = 0
            r4 = 1
            r7.f1921e0 = r4     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.mo1125y0(r8)     // Catch: java.lang.Throwable -> L6b
            r7.f1923g0 = r8     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1919c0     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f1916Z     // Catch: java.lang.Throwable -> L6b
            if (r5 == r4) goto L3b
            if (r5 == r3) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r8.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r8.requestWindowFeature(r4)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r8 = r7.m1164k()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r8 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f1923g0     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r8)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r8 = r7.f1923g0     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1918b0     // Catch: java.lang.Throwable -> L6b
            r8.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.f1923g0     // Catch: java.lang.Throwable -> L6b
            android.content.DialogInterface$OnCancelListener r5 = r7.f1914X     // Catch: java.lang.Throwable -> L6b
            r8.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.f1923g0     // Catch: java.lang.Throwable -> L6b
            android.content.DialogInterface$OnDismissListener r5 = r7.f1915Y     // Catch: java.lang.Throwable -> L6b
            r8.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.f1926j0 = r4     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r8 = 0
            r7.f1923g0 = r8     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f1921e0 = r1
            goto L6f
        L6b:
            r8 = move-exception
            r7.f1921e0 = r1
            throw r8
        L6f:
            boolean r8 = p000a.p052k.p053b.AbstractC0301c0.m1005N(r3)
            if (r8 == 0) goto L8e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L8e:
            android.app.Dialog r8 = r7.f1923g0
            if (r8 == 0) goto L9a
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L9a:
            return r0
        L9b:
            boolean r8 = p000a.p052k.p053b.AbstractC0301c0.m1005N(r3)
            if (r8 == 0) goto Ld2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f1919c0
            if (r1 != 0) goto Lbe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto Lc5
        Lbe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        Lc5:
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l.mo1117T(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: b */
    public AbstractC0338v mo1118b() {
        return new e(new ComponentCallbacksC0320m.a());
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: b0 */
    public void mo1119b0(Bundle bundle) {
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f1916Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1917a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1918b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1919c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1920d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: c0 */
    public void mo1120c0() {
        this.f1961E = true;
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            this.f1924h0 = false;
            dialog.show();
            View decorView = this.f1923g0.getWindow().getDecorView();
            decorView.setTag(C1088R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C1088R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C1088R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: d0 */
    public void mo1121d0() {
        this.f1961E = true;
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: f0 */
    public void mo1122f0(Bundle bundle) {
        Bundle bundle2;
        this.f1961E = true;
        if (this.f1923g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1923g0.onRestoreInstanceState(bundle2);
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: g0 */
    public void mo1123g0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1123g0(layoutInflater, viewGroup, bundle);
        if (this.f1963G != null || this.f1923g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1923g0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1924h0) {
            return;
        }
        if (AbstractC0301c0.m1005N(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m1124x0(true, true);
    }

    /* renamed from: x0 */
    public final void m1124x0(boolean z, boolean z2) {
        if (this.f1925i0) {
            return;
        }
        this.f1925i0 = true;
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1923g0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f1912V.getLooper()) {
                    onDismiss(this.f1923g0);
                } else {
                    this.f1912V.post(this.f1913W);
                }
            }
        }
        this.f1924h0 = true;
        if (this.f1920d0 >= 0) {
            AbstractC0301c0 abstractC0301c0M1182t = m1182t();
            int i = this.f1920d0;
            if (i >= 0) {
                abstractC0301c0M1182t.m1006A(abstractC0301c0M1182t.new m(null, i, 1), false);
                this.f1920d0 = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        }
        C0294a c0294a = new C0294a(m1182t());
        AbstractC0301c0 abstractC0301c0 = this.f1995t;
        if (abstractC0301c0 != null && abstractC0301c0 != c0294a.f1762p) {
            StringBuilder sbM2079g = C0561a.m2079g("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sbM2079g.append(toString());
            sbM2079g.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sbM2079g.toString());
        }
        c0294a.m1129b(new AbstractC0319l0.a(3, this));
        if (z) {
            c0294a.m977f(true);
        } else {
            c0294a.m977f(false);
        }
    }

    /* renamed from: y0 */
    public Dialog mo1125y0(Bundle bundle) {
        if (AbstractC0301c0.m1005N(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1165k0(), this.f1917a0);
    }

    /* renamed from: z0 */
    public final Dialog m1126z0() {
        Dialog dialog = this.f1923g0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }
}
