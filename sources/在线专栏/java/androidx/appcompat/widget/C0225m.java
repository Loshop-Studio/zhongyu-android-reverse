package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.C0358u;
import androidx.core.widget.InterfaceC0368b;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import p015c.C1047j;
import p079e0.C2468a;
import p148s.C3368f;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
class C0225m {

    /* renamed from: a */
    private final TextView f1154a;

    /* renamed from: b */
    private C0210e0 f1155b;

    /* renamed from: c */
    private C0210e0 f1156c;

    /* renamed from: d */
    private C0210e0 f1157d;

    /* renamed from: e */
    private C0210e0 f1158e;

    /* renamed from: f */
    private C0210e0 f1159f;

    /* renamed from: g */
    private C0210e0 f1160g;

    /* renamed from: h */
    private C0210e0 f1161h;

    /* renamed from: i */
    private final C0227n f1162i;

    /* renamed from: j */
    private int f1163j = 0;

    /* renamed from: k */
    private int f1164k = -1;

    /* renamed from: l */
    private Typeface f1165l;

    /* renamed from: m */
    private boolean f1166m;

    /* renamed from: androidx.appcompat.widget.m$a */
    class a extends C3368f.c {

        /* renamed from: a */
        final /* synthetic */ int f1167a;

        /* renamed from: b */
        final /* synthetic */ int f1168b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1169c;

        a(int i4, int i5, WeakReference weakReference) {
            this.f1167a = i4;
            this.f1168b = i5;
            this.f1169c = weakReference;
        }

        @Override // p148s.C3368f.c
        public void onFontRetrievalFailed(int i4) {
        }

        @Override // p148s.C3368f.c
        public void onFontRetrieved(Typeface typeface) {
            int i4;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f1167a) != -1) {
                typeface = Typeface.create(typeface, i4, (this.f1168b & 2) != 0);
            }
            C0225m.this.m935n(this.f1169c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.m$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1171a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1172b;

        /* renamed from: c */
        final /* synthetic */ int f1173c;

        b(TextView textView, Typeface typeface, int i4) {
            this.f1171a = textView;
            this.f1172b = typeface;
            this.f1173c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1171a.setTypeface(this.f1172b, this.f1173c);
        }
    }

    C0225m(TextView textView) {
        this.f1154a = textView;
        this.f1162i = new C0227n(textView);
    }

    /* renamed from: B */
    private void m917B(int i4, float f4) {
        this.f1162i.m976v(i4, f4);
    }

    /* renamed from: C */
    private void m918C(Context context, C0214g0 c0214g0) {
        String strM830o;
        this.f1163j = c0214g0.m826k(C1047j.f6067c3, this.f1163j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int iM826k = c0214g0.m826k(C1047j.f6092h3, -1);
            this.f1164k = iM826k;
            if (iM826k != -1) {
                this.f1163j = (this.f1163j & 2) | 0;
            }
        }
        int i5 = C1047j.f6087g3;
        if (!c0214g0.m834s(i5) && !c0214g0.m834s(C1047j.f6097i3)) {
            int i6 = C1047j.f6062b3;
            if (c0214g0.m834s(i6)) {
                this.f1166m = false;
                int iM826k2 = c0214g0.m826k(i6, 1);
                if (iM826k2 == 1) {
                    this.f1165l = Typeface.SANS_SERIF;
                    return;
                } else if (iM826k2 == 2) {
                    this.f1165l = Typeface.SERIF;
                    return;
                } else {
                    if (iM826k2 != 3) {
                        return;
                    }
                    this.f1165l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1165l = null;
        int i7 = C1047j.f6097i3;
        if (c0214g0.m834s(i7)) {
            i5 = i7;
        }
        int i8 = this.f1164k;
        int i9 = this.f1163j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM825j = c0214g0.m825j(i5, this.f1163j, new a(i8, i9, new WeakReference(this.f1154a)));
                if (typefaceM825j != null) {
                    if (i4 < 28 || this.f1164k == -1) {
                        this.f1165l = typefaceM825j;
                    } else {
                        this.f1165l = Typeface.create(Typeface.create(typefaceM825j, 0), this.f1164k, (this.f1163j & 2) != 0);
                    }
                }
                this.f1166m = this.f1165l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1165l != null || (strM830o = c0214g0.m830o(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1164k == -1) {
            this.f1165l = Typeface.create(strM830o, this.f1163j);
        } else {
            this.f1165l = Typeface.create(Typeface.create(strM830o, 0), this.f1164k, (this.f1163j & 2) != 0);
        }
    }

    /* renamed from: a */
    private void m919a(Drawable drawable, C0210e0 c0210e0) {
        if (drawable == null || c0210e0 == null) {
            return;
        }
        C0211f.m794i(drawable, c0210e0, this.f1154a.getDrawableState());
    }

    /* renamed from: d */
    private static C0210e0 m920d(Context context, C0211f c0211f, int i4) {
        ColorStateList colorStateListM797f = c0211f.m797f(context, i4);
        if (colorStateListM797f == null) {
            return null;
        }
        C0210e0 c0210e0 = new C0210e0();
        c0210e0.f1080d = true;
        c0210e0.f1077a = colorStateListM797f;
        return c0210e0;
    }

    /* renamed from: y */
    private void m921y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1154a.getCompoundDrawablesRelative();
            TextView textView = this.f1154a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1154a.getCompoundDrawablesRelative();
        if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f1154a;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1154a.getCompoundDrawables();
        TextView textView3 = this.f1154a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    private void m922z() {
        C0210e0 c0210e0 = this.f1161h;
        this.f1155b = c0210e0;
        this.f1156c = c0210e0;
        this.f1157d = c0210e0;
        this.f1158e = c0210e0;
        this.f1159f = c0210e0;
        this.f1160g = c0210e0;
    }

    /* renamed from: A */
    void m923A(int i4, float f4) {
        if (InterfaceC0368b.f2817O || m933l()) {
            return;
        }
        m917B(i4, f4);
    }

    /* renamed from: b */
    void m924b() {
        if (this.f1155b != null || this.f1156c != null || this.f1157d != null || this.f1158e != null) {
            Drawable[] compoundDrawables = this.f1154a.getCompoundDrawables();
            m919a(compoundDrawables[0], this.f1155b);
            m919a(compoundDrawables[1], this.f1156c);
            m919a(compoundDrawables[2], this.f1157d);
            m919a(compoundDrawables[3], this.f1158e);
        }
        if (this.f1159f == null && this.f1160g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1154a.getCompoundDrawablesRelative();
        m919a(compoundDrawablesRelative[0], this.f1159f);
        m919a(compoundDrawablesRelative[2], this.f1160g);
    }

    /* renamed from: c */
    void m925c() {
        this.f1162i.m963a();
    }

    /* renamed from: e */
    int m926e() {
        return this.f1162i.m965h();
    }

    /* renamed from: f */
    int m927f() {
        return this.f1162i.m966i();
    }

    /* renamed from: g */
    int m928g() {
        return this.f1162i.m967j();
    }

    /* renamed from: h */
    int[] m929h() {
        return this.f1162i.m968k();
    }

    /* renamed from: i */
    int m930i() {
        return this.f1162i.m969l();
    }

    /* renamed from: j */
    ColorStateList m931j() {
        C0210e0 c0210e0 = this.f1161h;
        if (c0210e0 != null) {
            return c0210e0.f1077a;
        }
        return null;
    }

    /* renamed from: k */
    PorterDuff.Mode m932k() {
        C0210e0 c0210e0 = this.f1161h;
        if (c0210e0 != null) {
            return c0210e0.f1078b;
        }
        return null;
    }

    /* renamed from: l */
    boolean m933l() {
        return this.f1162i.m971p();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m934m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0225m.m934m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m935n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1166m) {
            this.f1165l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C0358u.m2012U(textView)) {
                    textView.post(new b(textView, typeface, this.f1163j));
                } else {
                    textView.setTypeface(typeface, this.f1163j);
                }
            }
        }
    }

    /* renamed from: o */
    void m936o(boolean z3, int i4, int i5, int i6, int i7) {
        if (InterfaceC0368b.f2817O) {
            return;
        }
        m925c();
    }

    /* renamed from: p */
    void m937p() {
        m924b();
    }

    /* renamed from: q */
    void m938q(Context context, int i4) {
        String strM830o;
        ColorStateList colorStateListM818c;
        ColorStateList colorStateListM818c2;
        ColorStateList colorStateListM818c3;
        C0214g0 c0214g0M813t = C0214g0.m813t(context, i4, C1047j.f6050Z2);
        int i5 = C1047j.f6107k3;
        if (c0214g0M813t.m834s(i5)) {
            m940s(c0214g0M813t.m816a(i5, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            int i7 = C1047j.f6072d3;
            if (c0214g0M813t.m834s(i7) && (colorStateListM818c3 = c0214g0M813t.m818c(i7)) != null) {
                this.f1154a.setTextColor(colorStateListM818c3);
            }
            int i8 = C1047j.f6082f3;
            if (c0214g0M813t.m834s(i8) && (colorStateListM818c2 = c0214g0M813t.m818c(i8)) != null) {
                this.f1154a.setLinkTextColor(colorStateListM818c2);
            }
            int i9 = C1047j.f6077e3;
            if (c0214g0M813t.m834s(i9) && (colorStateListM818c = c0214g0M813t.m818c(i9)) != null) {
                this.f1154a.setHintTextColor(colorStateListM818c);
            }
        }
        int i10 = C1047j.f6056a3;
        if (c0214g0M813t.m834s(i10) && c0214g0M813t.m821f(i10, -1) == 0) {
            this.f1154a.setTextSize(0, IGoodView.DEFAULT_TO_ALPHA);
        }
        m918C(context, c0214g0M813t);
        if (i6 >= 26) {
            int i11 = C1047j.f6102j3;
            if (c0214g0M813t.m834s(i11) && (strM830o = c0214g0M813t.m830o(i11)) != null) {
                this.f1154a.setFontVariationSettings(strM830o);
            }
        }
        c0214g0M813t.m835w();
        Typeface typeface = this.f1165l;
        if (typeface != null) {
            this.f1154a.setTypeface(typeface, this.f1163j);
        }
    }

    /* renamed from: r */
    void m939r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C2468a.m8231f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    void m940s(boolean z3) {
        this.f1154a.setAllCaps(z3);
    }

    /* renamed from: t */
    void m941t(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        this.f1162i.m973r(i4, i5, i6, i7);
    }

    /* renamed from: u */
    void m942u(int[] iArr, int i4) throws IllegalArgumentException {
        this.f1162i.m974s(iArr, i4);
    }

    /* renamed from: v */
    void m943v(int i4) {
        this.f1162i.m975t(i4);
    }

    /* renamed from: w */
    void m944w(ColorStateList colorStateList) {
        if (this.f1161h == null) {
            this.f1161h = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1161h;
        c0210e0.f1077a = colorStateList;
        c0210e0.f1080d = colorStateList != null;
        m922z();
    }

    /* renamed from: x */
    void m945x(PorterDuff.Mode mode) {
        if (this.f1161h == null) {
            this.f1161h = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1161h;
        c0210e0.f1078b = mode;
        c0210e0.f1079c = mode != null;
        m922z();
    }
}
