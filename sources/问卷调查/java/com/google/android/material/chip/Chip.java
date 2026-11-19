package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p035d.p036l.InterfaceC0213a;
import p000a.p031h.p041h.C0234a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p051b.AbstractC0288a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p088k.C0601b;
import p070b.p074b.p075a.p076a.p098t.AbstractC0665d;
import p070b.p074b.p075a.p076a.p098t.C0663b;
import p070b.p074b.p075a.p076a.p099u.C0666a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p101w.InterfaceC0682n;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements C0601b.a, InterfaceC0682n {

    /* renamed from: u */
    public static final Rect f4902u = new Rect();

    /* renamed from: v */
    public static final int[] f4903v = {R.attr.state_selected};

    /* renamed from: w */
    public static final int[] f4904w = {R.attr.state_checkable};

    /* renamed from: e */
    public C0601b f4905e;

    /* renamed from: f */
    public InsetDrawable f4906f;

    /* renamed from: g */
    public RippleDrawable f4907g;

    /* renamed from: h */
    public View.OnClickListener f4908h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f4909i;

    /* renamed from: j */
    public boolean f4910j;

    /* renamed from: k */
    public boolean f4911k;

    /* renamed from: l */
    public boolean f4912l;

    /* renamed from: m */
    public boolean f4913m;

    /* renamed from: n */
    public boolean f4914n;

    /* renamed from: o */
    public int f4915o;

    /* renamed from: p */
    public int f4916p;

    /* renamed from: q */
    public final C0928b f4917q;

    /* renamed from: r */
    public final Rect f4918r;

    /* renamed from: s */
    public final RectF f4919s;

    /* renamed from: t */
    public final AbstractC0665d f4920t;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C0927a extends AbstractC0665d {
        public C0927a() {
        }

        @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
        /* renamed from: a */
        public void mo2264a(int i) {
        }

        @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
        /* renamed from: b */
        public void mo2265b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            C0601b c0601b = chip.f4905e;
            chip.setText(c0601b.f3644F0 ? c0601b.f3645G : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C0928b extends AbstractC0288a {
        public C0928b(Chip chip) {
            super(chip);
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: n */
        public int mo930n(float f2, float f3) {
            Chip chip = Chip.this;
            Rect rect = Chip.f4902u;
            return (chip.m2650e() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: o */
        public void mo931o(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f4902u;
            if (chip.m2650e()) {
                Chip chip2 = Chip.this;
                C0601b c0601b = chip2.f4905e;
                if (c0601b != null && c0601b.f3653M) {
                    z = true;
                }
                if (!z || chip2.f4908h == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: r */
        public boolean mo934r(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f4908h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f4917q.m939w(1, 1);
                }
            }
            return z;
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: s */
        public void mo935s(C0245b c0245b) {
            c0245b.f1563a.setCheckable(Chip.this.m2651f());
            c0245b.f1563a.setClickable(Chip.this.isClickable());
            if (Chip.this.m2651f() || Chip.this.isClickable()) {
                c0245b.f1563a.setClassName(Chip.this.m2651f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                c0245b.f1563a.setClassName("android.view.View");
            }
            c0245b.f1563a.setText(Chip.this.getText());
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: t */
        public void mo936t(int i, C0245b c0245b) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i != 1) {
                c0245b.f1563a.setContentDescription(BuildConfig.FLAVOR);
                c0245b.f1563a.setBoundsInParent(Chip.f4902u);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                closeIconContentDescription = context.getString(C1088R.string.mtrl_chip_close_icon_content_description, objArr).trim();
            }
            c0245b.f1563a.setContentDescription(closeIconContentDescription);
            c0245b.f1563a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            c0245b.m818a(C0245b.a.f1566e);
            c0245b.f1563a.setEnabled(Chip.this.isEnabled());
        }

        @Override // p000a.p049j.p051b.AbstractC0288a
        /* renamed from: u */
        public void mo937u(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f4913m = z;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f4919s.setEmpty();
        if (m2650e()) {
            C0601b c0601b = this.f4905e;
            c0601b.m2129B(c0601b.getBounds(), this.f4919s);
        }
        return this.f4919s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f4918r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f4918r;
    }

    private C0663b getTextAppearance() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3679m0.f3945f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f4912l != z) {
            this.f4912l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f4911k != z) {
            this.f4911k = z;
            refreshDrawableState();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p088k.C0601b.a
    /* renamed from: a */
    public void mo2173a() {
        m2649d(this.f4916p);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2649d(int r10) {
        /*
            r9 = this;
            r9.f4916p = r10
            boolean r0 = r9.f4914n
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r10 = r9.f4906f
            if (r10 == 0) goto Lf
            r9.m2652g()
            goto L14
        Lf:
            int[] r10 = p070b.p074b.p075a.p076a.p099u.C0666a.f3979a
            r9.m2654i()
        L14:
            return r1
        L15:
            b.b.a.a.k.b r0 = r9.f4905e
            float r0 = r0.f3635B
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            b.b.a.a.k.b r2 = r9.f4905e
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3e
            if (r0 > 0) goto L3e
            android.graphics.drawable.InsetDrawable r10 = r9.f4906f
            if (r10 == 0) goto L38
            r9.m2652g()
            goto L3d
        L38:
            int[] r10 = p070b.p074b.p075a.p076a.p099u.C0666a.f3979a
            r9.m2654i()
        L3d:
            return r1
        L3e:
            if (r2 <= 0) goto L44
            int r2 = r2 / 2
            r7 = r2
            goto L45
        L44:
            r7 = r1
        L45:
            if (r0 <= 0) goto L49
            int r1 = r0 / 2
        L49:
            r8 = r1
            android.graphics.drawable.InsetDrawable r0 = r9.f4906f
            r1 = 1
            if (r0 == 0) goto L6f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f4906f
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L6f
            int r2 = r0.bottom
            if (r2 != r8) goto L6f
            int r2 = r0.left
            if (r2 != r7) goto L6f
            int r0 = r0.right
            if (r0 != r7) goto L6f
        L69:
            int[] r10 = p070b.p074b.p075a.p076a.p099u.C0666a.f3979a
            r9.m2654i()
            return r1
        L6f:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L78
            r9.setMinHeight(r10)
        L78:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L81
            r9.setMinWidth(r10)
        L81:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            b.b.a.a.k.b r4 = r9.f4905e
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f4906f = r10
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m2649d(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            java.lang.Class<a.j.b.a> r0 = p000a.p049j.p051b.AbstractC0288a.class
            int r1 = r8.getAction()
            r2 = 10
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L51
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            com.google.android.material.chip.Chip$b r2 = r7.f4917q     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            int r1 = r1.intValue()     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L51
            java.lang.String r1 = "x"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r5[r4] = r6     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r5)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            com.google.android.material.chip.Chip$b r1 = r7.f4917q     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r5[r4] = r2     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0.invoke(r1, r5)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0 = r3
            goto L52
        L43:
            r0 = move-exception
            goto L4a
        L45:
            r0 = move-exception
            goto L4a
        L47:
            r0 = move-exception
            goto L4a
        L49:
            r0 = move-exception
        L4a:
            java.lang.String r1 = "Chip"
            java.lang.String r2 = "Unable to send Accessibility Exit event"
            android.util.Log.e(r1, r2, r0)
        L51:
            r0 = r4
        L52:
            if (r0 != 0) goto L64
            com.google.android.material.chip.Chip$b r0 = r7.f4917q
            boolean r0 = r0.m929m(r8)
            if (r0 != 0) goto L64
            boolean r8 = super.dispatchHoverEvent(r8)
            if (r8 == 0) goto L63
            goto L64
        L63:
            r3 = r4
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            com.google.android.material.chip.Chip$b r0 = r9.f4917q
            java.util.Objects.requireNonNull(r0)
            int r1 = r10.getAction()
            r2 = 1
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L7b
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L65
            r5 = 66
            if (r1 == r5) goto L4e
            switch(r1) {
                case 19: goto L20;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                case 23: goto L4e;
                default: goto L1f;
            }
        L1f:
            goto L7b
        L20:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L7b
            r7 = 19
            if (r1 == r7) goto L38
            r7 = 21
            if (r1 == r7) goto L35
            r7 = 22
            if (r1 == r7) goto L3a
            r5 = 130(0x82, float:1.82E-43)
            goto L3a
        L35:
            r5 = 17
            goto L3a
        L38:
            r5 = 33
        L3a:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r3
        L40:
            if (r3 >= r1) goto L4c
            boolean r8 = r0.m932p(r5, r6)
            if (r8 == 0) goto L4c
            int r3 = r3 + 1
            r7 = r2
            goto L40
        L4c:
            r3 = r7
            goto L7b
        L4e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L7b
            int r1 = r0.f1730l
            if (r1 == r4) goto L63
            r3 = 16
            r0.mo934r(r1, r3, r6)
        L63:
            r3 = r2
            goto L7b
        L65:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L71
            r1 = 2
            boolean r3 = r0.m932p(r1, r6)
            goto L7b
        L71:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L7b
            boolean r3 = r0.m932p(r2, r6)
        L7b:
            if (r3 == 0) goto L84
            com.google.android.material.chip.Chip$b r0 = r9.f4917q
            int r0 = r0.f1730l
            if (r0 == r4) goto L84
            return r2
        L84:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0601b c0601b = this.f4905e;
        boolean zM2155c0 = false;
        int i = 0;
        zM2155c0 = false;
        if (c0601b != null && C0601b.m2127G(c0601b.f3654N)) {
            C0601b c0601b2 = this.f4905e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f4913m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f4912l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f4911k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f4913m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f4912l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f4911k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM2155c0 = c0601b2.m2155c0(iArr);
        }
        if (zM2155c0) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m2650e() {
        C0601b c0601b = this.f4905e;
        return (c0601b == null || c0601b.m2132E() == null) ? false : true;
    }

    /* renamed from: f */
    public boolean m2651f() {
        C0601b c0601b = this.f4905e;
        return c0601b != null && c0601b.f3659S;
    }

    /* renamed from: g */
    public final void m2652g() {
        if (this.f4906f != null) {
            this.f4906f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = C0666a.f3979a;
            m2654i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4906f;
        return insetDrawable == null ? this.f4905e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3661U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3662V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3633A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return Math.max(0.0f, c0601b.m2131D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4905e;
    }

    public float getChipEndPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3672f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0601b c0601b = this.f4905e;
        if (c0601b == null || (drawable = c0601b.f3649I) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC0213a ? ((InterfaceC0213a) drawable).m786a() : drawable;
    }

    public float getChipIconSize() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3651K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3650J;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3635B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3665Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3639D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3641E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.m2132E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3658R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3671e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3657Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3670d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3656P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3642E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C0928b c0928b = this.f4917q;
        if (c0928b.f1730l == 1 || c0928b.f1729k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C0576g getHideMotionSpec() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3664X;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3667a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3666Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3643F;
        }
        return null;
    }

    public C0678j getShapeAppearanceModel() {
        return this.f4905e.f3998b.f4021a;
    }

    public C0576g getShowMotionSpec() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3663W;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3669c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            return c0601b.f3668b0;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2653h() {
        /*
            r1 = this;
            boolean r0 = r1.m2650e()
            if (r0 == 0) goto L1a
            b.b.a.a.k.b r0 = r1.f4905e
            if (r0 == 0) goto L10
            boolean r0 = r0.f3653M
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L1a
            android.view.View$OnClickListener r0 = r1.f4908h
            if (r0 == 0) goto L1a
            com.google.android.material.chip.Chip$b r0 = r1.f4917q
            goto L1b
        L1a:
            r0 = 0
        L1b:
            p000a.p031h.p043j.C0266o.m875n(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m2653h():void");
    }

    /* renamed from: i */
    public final void m2654i() {
        this.f4907g = new RippleDrawable(C0666a.m2276a(this.f4905e.f3643F), getBackgroundDrawable(), null);
        this.f4905e.m2165m0(false);
        RippleDrawable rippleDrawable = this.f4907g;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setBackground(rippleDrawable);
        m2655j();
    }

    /* renamed from: j */
    public final void m2655j() {
        C0601b c0601b;
        if (TextUtils.isEmpty(getText()) || (c0601b = this.f4905e) == null) {
            return;
        }
        int iM2130C = (int) (c0601b.m2130C() + c0601b.f3672f0 + c0601b.f3669c0);
        C0601b c0601b2 = this.f4905e;
        int iM2172z = (int) (c0601b2.m2172z() + c0601b2.f3665Y + c0601b2.f3668b0);
        if (this.f4906f != null) {
            Rect rect = new Rect();
            this.f4906f.getPadding(rect);
            iM2172z += rect.left;
            iM2130C += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setPaddingRelative(iM2172z, paddingTop, iM2130C, paddingBottom);
    }

    /* renamed from: k */
    public final void m2656k() {
        TextPaint paint = getPaint();
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            paint.drawableState = c0601b.getState();
        }
        C0663b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m2274c(getContext(), paint, this.f4920t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0562a.m2098s(this, this.f4905e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f4903v);
        }
        if (m2651f()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f4904w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0928b c0928b = this.f4917q;
        int i2 = c0928b.f1730l;
        if (i2 != Integer.MIN_VALUE) {
            c0928b.m927k(i2);
        }
        if (z) {
            c0928b.m932p(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((m2651f() || isClickable()) ? m2651f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(m2651f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f3925d) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(C1088R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0245b.c.m828a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).f1579a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f4915o != i) {
            this.f4915o = i;
            m2655j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L40
            goto L4c
        L21:
            boolean r0 = r5.f4911k
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L4a
            r5.setCloseIconPressed(r2)
            goto L4a
        L2b:
            boolean r0 = r5.f4911k
            if (r0 == 0) goto L40
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f4908h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            com.google.android.material.chip.Chip$b r0 = r5.f4917q
            r0.m939w(r3, r3)
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            r5.setCloseIconPressed(r2)
            goto L4d
        L45:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r3)
        L4a:
            r0 = r3
            goto L4d
        L4c:
            r0 = r2
        L4d:
            if (r0 != 0) goto L55
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
        L55:
            r2 = r3
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4907g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4907g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2135J(z);
        }
    }

    public void setCheckableResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2135J(c0601b.f3673g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C0601b c0601b = this.f4905e;
        if (c0601b == null) {
            this.f4910j = z;
            return;
        }
        if (c0601b.f3659S) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f4909i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2136K(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2136K(C0034a.m129a(c0601b.f3673g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2137L(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2137L(context.getColorStateList(i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2138M(c0601b.f3673g0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2138M(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3633A == colorStateList) {
            return;
        }
        c0601b.f3633A = colorStateList;
        c0601b.onStateChange(c0601b.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2139N(context.getColorStateList(i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2140O(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2140O(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0601b c0601b) {
        C0601b c0601b2 = this.f4905e;
        if (c0601b2 != c0601b) {
            if (c0601b2 != null) {
                c0601b2.f3640D0 = new WeakReference<>(null);
            }
            this.f4905e = c0601b;
            c0601b.f3644F0 = false;
            Objects.requireNonNull(c0601b);
            c0601b.f3640D0 = new WeakReference<>(this);
            m2649d(this.f4916p);
        }
    }

    public void setChipEndPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3672f0 == f2) {
            return;
        }
        c0601b.f3672f0 = f2;
        c0601b.invalidateSelf();
        c0601b.m2133H();
    }

    public void setChipEndPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2141P(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2142Q(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2142Q(C0034a.m129a(c0601b.f3673g0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2143R(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2143R(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2144S(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2144S(context.getColorStateList(i));
        }
    }

    public void setChipIconVisible(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2145T(c0601b.f3673g0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2145T(z);
        }
    }

    public void setChipMinHeight(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3635B == f2) {
            return;
        }
        c0601b.f3635B = f2;
        c0601b.invalidateSelf();
        c0601b.m2133H();
    }

    public void setChipMinHeightResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2146U(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3665Y == f2) {
            return;
        }
        c0601b.f3665Y = f2;
        c0601b.invalidateSelf();
        c0601b.m2133H();
    }

    public void setChipStartPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2147V(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2148W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2148W(context.getColorStateList(i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2149X(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2149X(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2150Y(drawable);
        }
        m2653h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3658R == charSequence) {
            return;
        }
        C0234a c0234aM798c = C0234a.m798c();
        c0601b.f3658R = c0234aM798c.m799d(charSequence, c0234aM798c.f1534c, true);
        c0601b.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2151Z(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2151Z(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2150Y(C0034a.m129a(c0601b.f3673g0, i));
        }
        m2653h();
    }

    public void setCloseIconSize(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2153a0(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2153a0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2154b0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2154b0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2156d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2156d0(context.getColorStateList(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2157e0(z);
        }
        m2653h();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            C0675g.b bVar = c0601b.f3998b;
            if (bVar.f4035o != f2) {
                bVar.f4035o = f2;
                c0601b.m2303w();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4905e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3642E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f4914n = z;
        m2649d(this.f4916p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0576g c0576g) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3664X = c0576g;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3664X = C0576g.m2102b(c0601b.f3673g0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2158f0(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2158f0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2159g0(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2159g0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f4905e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3646G0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4909i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f4908h = onClickListener;
        m2653h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2160h0(colorStateList);
        }
        if (this.f4905e.f3636B0) {
            return;
        }
        m2654i();
    }

    public void setRippleColorResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            Context context = c0601b.f3673g0;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            c0601b.m2160h0(context.getColorStateList(i));
            if (this.f4905e.f3636B0) {
                return;
            }
            m2654i();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0682n
    public void setShapeAppearanceModel(C0678j c0678j) {
        C0601b c0601b = this.f4905e;
        c0601b.f3998b.f4021a = c0678j;
        c0601b.invalidateSelf();
    }

    public void setShowMotionSpec(C0576g c0576g) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3663W = c0576g;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.f3663W = C0576g.m2102b(c0601b.f3673g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(c0601b.f3644F0 ? null : charSequence, bufferType);
        C0601b c0601b2 = this.f4905e;
        if (c0601b2 != null) {
            c0601b2.m2161i0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2162j0(new C0663b(c0601b.f3673g0, i));
        }
        m2656k();
    }

    public void setTextAppearance(C0663b c0663b) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2162j0(c0663b);
        }
        m2656k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3669c0 == f2) {
            return;
        }
        c0601b.f3669c0 = f2;
        c0601b.invalidateSelf();
        c0601b.m2133H();
    }

    public void setTextEndPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2163k0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f2) {
        C0601b c0601b = this.f4905e;
        if (c0601b == null || c0601b.f3668b0 == f2) {
            return;
        }
        c0601b.f3668b0 = f2;
        c0601b.invalidateSelf();
        c0601b.m2133H();
    }

    public void setTextStartPaddingResource(int i) {
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2164l0(c0601b.f3673g0.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0601b c0601b = this.f4905e;
        if (c0601b != null) {
            c0601b.m2162j0(new C0663b(c0601b.f3673g0, i));
        }
        m2656k();
    }
}
