package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p237l8.AbstractC10159a;
import p237l8.C10160b;

/* loaded from: classes5.dex */
public class FlowTagLayout extends ViewGroup {

    /* renamed from: c */
    public C8118b f15942c;

    /* renamed from: d */
    public AbstractC10159a f15943d;

    /* renamed from: e */
    public int f15944e;

    /* renamed from: f */
    public boolean f15945f;

    /* renamed from: g */
    public SparseBooleanArray f15946g;

    /* renamed from: h */
    public int f15947h;

    /* renamed from: com.xuexiang.xui.widget.flowlayout.FlowTagLayout$a */
    public class ViewOnClickListenerC8117a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ View f15948c;

        /* renamed from: d */
        public final /* synthetic */ int f15949d;

        public ViewOnClickListenerC8117a(View view, int i10) {
            this.f15948c = view;
            this.f15949d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FlowTagLayout.this.f15944e == 0) {
                FlowTagLayout.this.getClass();
                return;
            }
            if (FlowTagLayout.this.f15944e != 1) {
                if (FlowTagLayout.this.f15944e == 2) {
                    if (FlowTagLayout.this.f15946g.get(this.f15949d)) {
                        FlowTagLayout.this.f15946g.put(this.f15949d, false);
                        this.f15948c.setSelected(false);
                    } else {
                        FlowTagLayout.this.f15946g.put(this.f15949d, true);
                        this.f15948c.setSelected(true);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < FlowTagLayout.this.f15943d.getCount(); i10++) {
                        if (FlowTagLayout.this.f15946g.get(i10)) {
                            arrayList.add(Integer.valueOf(i10));
                        }
                    }
                    FlowTagLayout.this.m12636m(arrayList);
                    FlowTagLayout.this.getClass();
                    return;
                }
                return;
            }
            if (FlowTagLayout.this.f15946g.get(this.f15949d)) {
                if (FlowTagLayout.this.f15945f) {
                    FlowTagLayout.this.f15946g.put(this.f15949d, false);
                    this.f15948c.setSelected(false);
                    FlowTagLayout.this.m12636m(new ArrayList());
                    FlowTagLayout.this.getClass();
                    return;
                }
                return;
            }
            for (int i11 = 0; i11 < FlowTagLayout.this.f15943d.getCount(); i11++) {
                FlowTagLayout.this.f15946g.put(i11, false);
                FlowTagLayout.this.getChildAt(i11).setSelected(false);
            }
            FlowTagLayout.this.f15946g.put(this.f15949d, true);
            this.f15948c.setSelected(true);
            FlowTagLayout.this.m12636m(Collections.singletonList(Integer.valueOf(this.f15949d)));
            FlowTagLayout.this.getClass();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.flowlayout.FlowTagLayout$b */
    public class C8118b extends DataSetObserver {
        public C8118b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            FlowTagLayout.this.m12631h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    public FlowTagLayout(Context context) {
        super(context);
        this.f15944e = 0;
        this.f15946g = new SparseBooleanArray();
    }

    /* renamed from: f */
    public final void m12629f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlowTagLayout);
        this.f15944e = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowTagLayout_ftl_check_mode, 0);
        this.f15945f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FlowTagLayout_ftl_single_cancelable, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.FlowTagLayout_ftl_entries, 0);
        if (resourceId != 0) {
            AbstractC10159a abstractC10159aM12635l = m12635l(AbstractC8040f.m12210k(resourceId));
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.FlowTagLayout_ftl_selecteds, 0);
            if (resourceId2 != 0) {
                abstractC10159aM12635l.m21203q(AbstractC8040f.m12207h(resourceId2));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final boolean m12630g() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public AbstractC10159a getAdapter() {
        return this.f15943d;
    }

    @Deprecated
    public int getSelectedIndex() {
        AbstractC10159a abstractC10159a = this.f15943d;
        if (abstractC10159a != null) {
            return abstractC10159a.m21198l();
        }
        return -1;
    }

    @Nullable
    @Deprecated
    public List<Integer> getSelectedIndexs() {
        AbstractC10159a abstractC10159a = this.f15943d;
        if (abstractC10159a != null) {
            return abstractC10159a.m21199m();
        }
        return null;
    }

    @Nullable
    @Deprecated
    public <T> T getSelectedItem() {
        AbstractC10159a abstractC10159a = this.f15943d;
        if (abstractC10159a != null) {
            return (T) abstractC10159a.m21200n();
        }
        return null;
    }

    public int getTagCheckMode() {
        return this.f15944e;
    }

    /* renamed from: h */
    public final void m12631h() {
        removeAllViews();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i10 = this.f15947h;
        if (i10 != 0) {
            marginLayoutParams.width = i10;
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < this.f15943d.getCount(); i11++) {
            this.f15946g.put(i11, false);
            View view = this.f15943d.getView(i11, null, this);
            addView(view, marginLayoutParams);
            if (this.f15943d != null) {
                boolean zM21201o = this.f15943d.m21201o(i11);
                int i12 = this.f15944e;
                if (i12 == 1) {
                    if (zM21201o && !z10) {
                        this.f15946g.put(i11, true);
                        view.setSelected(true);
                        z10 = true;
                    }
                } else if (i12 == 2) {
                    if (zM21201o) {
                        this.f15946g.put(i11, true);
                        view.setSelected(true);
                    }
                } else if (i12 == 3) {
                    this.f15946g.put(i11, true);
                    view.setSelected(true);
                    view.setEnabled(false);
                }
            }
            m12636m(null);
            m12633j(i11, view);
        }
    }

    /* renamed from: i */
    public FlowTagLayout m12632i(AbstractC10159a abstractC10159a) {
        C8118b c8118b;
        AbstractC10159a abstractC10159a2 = this.f15943d;
        if (abstractC10159a2 != null && (c8118b = this.f15942c) != null) {
            abstractC10159a2.unregisterDataSetObserver(c8118b);
        }
        removeAllViews();
        this.f15943d = abstractC10159a;
        if (abstractC10159a != null) {
            C8118b c8118b2 = new C8118b();
            this.f15942c = c8118b2;
            this.f15943d.registerDataSetObserver(c8118b2);
        }
        return this;
    }

    /* renamed from: j */
    public final void m12633j(int i10, View view) {
        view.setOnClickListener(new ViewOnClickListenerC8117a(view, i10));
    }

    /* renamed from: k */
    public AbstractC10159a m12634k(List list) {
        AbstractC10159a abstractC10159a = this.f15943d;
        if (abstractC10159a != null) {
            abstractC10159a.m21196j(list);
        } else {
            C10160b c10160b = new C10160b(getContext());
            m12632i(c10160b);
            c10160b.m21195i(list);
        }
        return this.f15943d;
    }

    /* renamed from: l */
    public final AbstractC10159a m12635l(Object... objArr) {
        return m12634k(Arrays.asList(objArr));
    }

    /* renamed from: m */
    public final FlowTagLayout m12636m(List list) {
        AbstractC10159a abstractC10159a = this.f15943d;
        if (abstractC10159a != null) {
            abstractC10159a.m21202p(list);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width = getWidth();
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i15 = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                int i16 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                if (paddingStart + i15 > (width - getPaddingLeft()) - getPaddingRight()) {
                    paddingTop += i16;
                    paddingStart = getPaddingStart();
                }
                if (m12630g()) {
                    int marginStart = width - (marginLayoutParams.getMarginStart() + paddingStart);
                    int i17 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart - measuredWidth, i17, marginStart, measuredHeight + i17);
                } else {
                    int marginStart2 = marginLayoutParams.getMarginStart() + paddingStart;
                    int i18 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart2, i18, measuredWidth + marginStart2, measuredHeight + i18);
                }
                paddingStart += i15;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            measureChild(childAt, i10, i11);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i15 = size;
            int i16 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i17 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i18 = i13 + i16;
            if (i18 > (i15 - getPaddingLeft()) - getPaddingRight()) {
                iMax2 = Math.max(i13, i16);
                i14 += i17;
                i13 = i16;
                iMax = i17;
            } else {
                iMax = Math.max(iMax, i17);
                i13 = i18;
            }
            if (i12 == childCount - 1) {
                i14 += iMax;
                iMax2 = Math.max(i13, iMax2);
            }
            setMeasuredDimension(mode == 1073741824 ? i15 : iMax2, mode2 == 1073741824 ? size2 : i14);
            i12++;
            size = i15;
        }
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15944e = 0;
        this.f15946g = new SparseBooleanArray();
        m12629f(context, attributeSet);
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15944e = 0;
        this.f15946g = new SparseBooleanArray();
        m12629f(context, attributeSet);
    }
}
