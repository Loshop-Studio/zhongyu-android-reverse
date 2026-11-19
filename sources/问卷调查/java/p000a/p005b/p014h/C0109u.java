package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p031h.p033c.p034b.C0200h;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p045b0.C0249a;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.b.h.u */
/* loaded from: classes.dex */
public class C0109u {

    /* renamed from: a */
    public final TextView f792a;

    /* renamed from: b */
    public C0106s0 f793b;

    /* renamed from: c */
    public C0106s0 f794c;

    /* renamed from: d */
    public C0106s0 f795d;

    /* renamed from: e */
    public C0106s0 f796e;

    /* renamed from: f */
    public C0106s0 f797f;

    /* renamed from: g */
    public C0106s0 f798g;

    /* renamed from: h */
    public C0106s0 f799h;

    /* renamed from: i */
    public final C0115x f800i;

    /* renamed from: j */
    public int f801j = 0;

    /* renamed from: k */
    public int f802k = -1;

    /* renamed from: l */
    public Typeface f803l;

    /* renamed from: m */
    public boolean f804m;

    /* renamed from: a.b.h.u$a */
    public class a extends C0200h.a {

        /* renamed from: a */
        public final /* synthetic */ int f805a;

        /* renamed from: b */
        public final /* synthetic */ int f806b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f807c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f805a = i;
            this.f806b = i2;
            this.f807c = weakReference;
        }

        @Override // p000a.p031h.p033c.p034b.C0200h.a
        /* renamed from: d */
        public void mo411d(int i) {
        }

        @Override // p000a.p031h.p033c.p034b.C0200h.a
        /* renamed from: e */
        public void mo412e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f805a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f806b & 2) != 0);
            }
            C0109u c0109u = C0109u.this;
            WeakReference weakReference = this.f807c;
            if (c0109u.f804m) {
                c0109u.f803l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new RunnableC0111v(c0109u, textView, typeface, c0109u.f801j));
                    } else {
                        textView.setTypeface(typeface, c0109u.f801j);
                    }
                }
            }
        }
    }

    public C0109u(TextView textView) {
        this.f792a = textView;
        this.f800i = new C0115x(textView);
    }

    /* renamed from: c */
    public static C0106s0 m398c(Context context, C0085i c0085i, int i) {
        ColorStateList colorStateListM338d = c0085i.m338d(context, i);
        if (colorStateListM338d == null) {
            return null;
        }
        C0106s0 c0106s0 = new C0106s0();
        c0106s0.f789d = true;
        c0106s0.f786a = colorStateListM338d;
        return c0106s0;
    }

    /* renamed from: a */
    public final void m399a(Drawable drawable, C0106s0 c0106s0) {
        if (drawable == null || c0106s0 == null) {
            return;
        }
        C0085i.m336f(drawable, c0106s0, this.f792a.getDrawableState());
    }

    /* renamed from: b */
    public void m400b() {
        if (this.f793b != null || this.f794c != null || this.f795d != null || this.f796e != null) {
            Drawable[] compoundDrawables = this.f792a.getCompoundDrawables();
            m399a(compoundDrawables[0], this.f793b);
            m399a(compoundDrawables[1], this.f794c);
            m399a(compoundDrawables[2], this.f795d);
            m399a(compoundDrawables[3], this.f796e);
        }
        if (this.f797f == null && this.f798g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f792a.getCompoundDrawablesRelative();
        m399a(compoundDrawablesRelative[0], this.f797f);
        m399a(compoundDrawablesRelative[2], this.f798g);
    }

    /* renamed from: d */
    public boolean m401d() {
        C0115x c0115x = this.f800i;
        return c0115x.m442i() && c0115x.f844a != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c0  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m402e(android.util.AttributeSet r25, int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0109u.m402e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m403f(Context context, int i) {
        String strM427m;
        C0110u0 c0110u0 = new C0110u0(context, context.obtainStyledAttributes(i, C0014b.f47v));
        if (c0110u0.m429o(14)) {
            this.f792a.setAllCaps(c0110u0.m415a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (c0110u0.m429o(0) && c0110u0.m420f(0, -1) == 0) {
            this.f792a.setTextSize(0, 0.0f);
        }
        m410m(context, c0110u0);
        if (i2 >= 26 && c0110u0.m429o(13) && (strM427m = c0110u0.m427m(13)) != null) {
            this.f792a.setFontVariationSettings(strM427m);
        }
        c0110u0.f810b.recycle();
        Typeface typeface = this.f803l;
        if (typeface != null) {
            this.f792a.setTypeface(typeface, this.f801j);
        }
    }

    /* renamed from: g */
    public void m404g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = text.length();
        if (i4 >= 0 && i5 <= length) {
            int i6 = editorInfo.inputType & 4095;
            if (!(i6 == 129 || i6 == 225 || i6 == 18)) {
                if (length <= 2048) {
                    C0249a.m834b(editorInfo, text, i4, i5);
                    return;
                }
                int i7 = i5 - i4;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                int iMin = Math.min(text.length() - i5, i9 - Math.min(i4, (int) (i9 * 0.8d)));
                int iMin2 = Math.min(i4, i9 - iMin);
                int i10 = i4 - iMin2;
                if (C0249a.m833a(text, i10, 0)) {
                    i10++;
                    iMin2--;
                }
                if (C0249a.m833a(text, (i5 + iMin) - 1, 1)) {
                    iMin--;
                }
                CharSequence charSequenceConcat = i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i10, iMin2 + i8 + iMin + i10);
                int i11 = iMin2 + 0;
                C0249a.m834b(editorInfo, charSequenceConcat, i11, i8 + i11);
                return;
            }
        }
        C0249a.m834b(editorInfo, null, 0, 0);
    }

    /* renamed from: h */
    public void m405h(int i, int i2, int i3, int i4) {
        C0115x c0115x = this.f800i;
        if (c0115x.m442i()) {
            DisplayMetrics displayMetrics = c0115x.f853j.getResources().getDisplayMetrics();
            c0115x.m443j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0115x.m440g()) {
                c0115x.m436a();
            }
        }
    }

    /* renamed from: i */
    public void m406i(int[] iArr, int i) {
        C0115x c0115x = this.f800i;
        if (c0115x.m442i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0115x.f853j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0115x.f849f = c0115x.m437b(iArrCopyOf);
                if (!c0115x.m441h()) {
                    StringBuilder sbM2079g = C0561a.m2079g("None of the preset sizes is valid: ");
                    sbM2079g.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbM2079g.toString());
                }
            } else {
                c0115x.f850g = false;
            }
            if (c0115x.m440g()) {
                c0115x.m436a();
            }
        }
    }

    /* renamed from: j */
    public void m407j(int i) {
        C0115x c0115x = this.f800i;
        if (c0115x.m442i()) {
            if (i == 0) {
                c0115x.f844a = 0;
                c0115x.f847d = -1.0f;
                c0115x.f848e = -1.0f;
                c0115x.f846c = -1.0f;
                c0115x.f849f = new int[0];
                c0115x.f845b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = c0115x.f853j.getResources().getDisplayMetrics();
            c0115x.m443j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0115x.m440g()) {
                c0115x.m436a();
            }
        }
    }

    /* renamed from: k */
    public void m408k(ColorStateList colorStateList) {
        if (this.f799h == null) {
            this.f799h = new C0106s0();
        }
        C0106s0 c0106s0 = this.f799h;
        c0106s0.f786a = colorStateList;
        c0106s0.f789d = colorStateList != null;
        this.f793b = c0106s0;
        this.f794c = c0106s0;
        this.f795d = c0106s0;
        this.f796e = c0106s0;
        this.f797f = c0106s0;
        this.f798g = c0106s0;
    }

    /* renamed from: l */
    public void m409l(PorterDuff.Mode mode) {
        if (this.f799h == null) {
            this.f799h = new C0106s0();
        }
        C0106s0 c0106s0 = this.f799h;
        c0106s0.f787b = mode;
        c0106s0.f788c = mode != null;
        this.f793b = c0106s0;
        this.f794c = c0106s0;
        this.f795d = c0106s0;
        this.f796e = c0106s0;
        this.f797f = c0106s0;
        this.f798g = c0106s0;
    }

    /* renamed from: m */
    public final void m410m(Context context, C0110u0 c0110u0) {
        String strM427m;
        Typeface typefaceCreate;
        Typeface typeface;
        int i = Build.VERSION.SDK_INT;
        this.f801j = c0110u0.m424j(2, this.f801j);
        if (i >= 28) {
            int iM424j = c0110u0.m424j(11, -1);
            this.f802k = iM424j;
            if (iM424j != -1) {
                this.f801j = (this.f801j & 2) | 0;
            }
        }
        if (!c0110u0.m429o(10) && !c0110u0.m429o(12)) {
            if (c0110u0.m429o(1)) {
                this.f804m = false;
                int iM424j2 = c0110u0.m424j(1, 1);
                if (iM424j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iM424j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iM424j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f803l = typeface;
                return;
            }
            return;
        }
        this.f803l = null;
        int i2 = c0110u0.m429o(12) ? 12 : 10;
        int i3 = this.f802k;
        int i4 = this.f801j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM423i = c0110u0.m423i(i2, this.f801j, new a(i3, i4, new WeakReference(this.f792a)));
                if (typefaceM423i != null) {
                    if (i >= 28 && this.f802k != -1) {
                        typefaceM423i = Typeface.create(Typeface.create(typefaceM423i, 0), this.f802k, (this.f801j & 2) != 0);
                    }
                    this.f803l = typefaceM423i;
                }
                this.f804m = this.f803l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f803l != null || (strM427m = c0110u0.m427m(i2)) == null) {
            return;
        }
        if (i < 28 || this.f802k == -1) {
            typefaceCreate = Typeface.create(strM427m, this.f801j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strM427m, 0), this.f802k, (this.f801j & 2) != 0);
        }
        this.f803l = typefaceCreate;
    }
}
