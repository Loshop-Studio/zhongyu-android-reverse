package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0564b;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    public TextView f4974b;

    /* renamed from: c */
    public Button f4975c;

    /* renamed from: d */
    public int f4976d;

    /* renamed from: e */
    public int f4977e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3525t);
        this.f4976d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f4977e = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean m2680a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f4974b.getPaddingTop() == i2 && this.f4974b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f4974b;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f4975c;
    }

    public TextView getMessageView() {
        return this.f4974b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4974b = (TextView) findViewById(C1088R.id.snackbar_text);
        this.f4975c = (Button) findViewById(C1088R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f4976d
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f4976d
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165455(0x7f07010f, float:1.7945128E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165454(0x7f07010e, float:1.7945126E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f4974b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3e
            r2 = r4
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 == 0) goto L58
            int r5 = r7.f4977e
            if (r5 <= 0) goto L58
            android.widget.Button r5 = r7.f4975c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f4977e
            if (r5 <= r6) goto L58
            int r1 = r0 - r1
            boolean r0 = r7.m2680a(r4, r0, r1)
            if (r0 == 0) goto L63
            goto L62
        L58:
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            boolean r0 = r7.m2680a(r3, r0, r0)
            if (r0 == 0) goto L63
        L62:
            r3 = r4
        L63:
            if (r3 == 0) goto L68
            super.onMeasure(r8, r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f4977e = i;
    }
}
