package com.xuexiang.xui.widget.tabbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import java.util.ArrayList;
import p136p3.C6370h;

/* renamed from: com.xuexiang.xui.widget.tabbar.c */
/* loaded from: classes3.dex */
public final class C4225c extends ViewGroup {

    /* renamed from: a */
    public final C4226d f4986a;

    /* renamed from: b */
    public final /* synthetic */ TabSegment f4987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4225c(TabSegment tabSegment, Context context) {
        super(context);
        this.f4987b = tabSegment;
        this.f4986a = new C4226d(tabSegment, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Rect rect;
        super.dispatchDraw(canvas);
        TabSegment tabSegment = this.f4987b;
        if (!tabSegment.f4934f || (rect = tabSegment.f4939k) == null) {
            return;
        }
        if (tabSegment.f4936h) {
            rect.top = getPaddingTop();
            Rect rect2 = tabSegment.f4939k;
            rect2.bottom = rect2.top + tabSegment.f4935g;
        } else {
            rect.bottom = getHeight() - getPaddingBottom();
            Rect rect3 = tabSegment.f4939k;
            rect3.top = rect3.bottom - tabSegment.f4935g;
        }
        Drawable drawable = tabSegment.f4937i;
        if (drawable == null) {
            canvas.drawRect(tabSegment.f4939k, tabSegment.f4940l);
        } else {
            drawable.setBounds(tabSegment.f4939k);
            tabSegment.f4937i.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        TabSegment tabSegment;
        C4226d c4226d = this.f4986a;
        ArrayList arrayList = c4226d.f10442c;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((View) arrayList.get(i12)).getVisibility() == 0) {
                i11++;
            }
        }
        if (size == 0 || i11 == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i13 = 0;
        while (true) {
            tabSegment = this.f4987b;
            if (i13 >= size) {
                break;
            }
            TabSegment.TabItemView tabItemView = (TabSegment.TabItemView) arrayList.get(i13);
            if (tabItemView.getVisibility() == 0) {
                int measuredWidth = tabItemView.getMeasuredWidth();
                int i14 = paddingLeft + measuredWidth;
                tabItemView.layout(paddingLeft, getPaddingTop(), i14, (i10 - i8) - getPaddingBottom());
                C6370h c6370h = (C6370h) c4226d.m6032b(i13);
                int i15 = c6370h.f10413b;
                int i16 = c6370h.f10412a;
                if (tabSegment.f4944p == 1 && tabSegment.f4938j) {
                    TextView textView = tabItemView.getTextView();
                    paddingLeft += textView.getLeft();
                    measuredWidth = textView.getWidth();
                }
                if (i15 != paddingLeft || i16 != measuredWidth) {
                    c6370h.f10413b = paddingLeft;
                    c6370h.f10412a = measuredWidth;
                }
                paddingLeft = i14 + (tabSegment.f4944p == 0 ? tabSegment.f4945q : 0);
            }
            i13++;
        }
        int i17 = tabSegment.f4931c;
        if (i17 != -1 && tabSegment.f4947s == null && tabSegment.f4946r == 0) {
            tabSegment.m3591e((C6370h) c4226d.m6032b(i17), false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i8);
        ArrayList arrayList = this.f4986a.f10442c;
        int size3 = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size3; i11++) {
            if (((View) arrayList.get(i11)).getVisibility() == 0) {
                i10++;
            }
        }
        if (size3 == 0 || i10 == 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        TabSegment tabSegment = this.f4987b;
        if (tabSegment.f4944p == 1) {
            int i12 = size / i10;
            while (i9 < size3) {
                View view = (View) arrayList.get(i9);
                if (view.getVisibility() == 0) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(paddingTop, BasicMeasure.EXACTLY));
                }
                i9++;
            }
        } else {
            int measuredWidth = 0;
            while (i9 < size3) {
                View view2 = (View) arrayList.get(i9);
                if (view2.getVisibility() == 0) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingTop, BasicMeasure.EXACTLY));
                    measuredWidth = view2.getMeasuredWidth() + tabSegment.f4945q + measuredWidth;
                }
                i9++;
            }
            size = measuredWidth - tabSegment.f4945q;
        }
        setMeasuredDimension(size, size2);
    }
}
