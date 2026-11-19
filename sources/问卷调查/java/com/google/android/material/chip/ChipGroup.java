package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p096r.C0650e;
import p070b.p074b.p075a.p076a.p096r.C0655j;

/* loaded from: classes.dex */
public class ChipGroup extends C0650e {

    /* renamed from: f */
    public int f4923f;

    /* renamed from: g */
    public int f4924g;

    /* renamed from: h */
    public boolean f4925h;

    /* renamed from: i */
    public boolean f4926i;

    /* renamed from: j */
    public InterfaceC0932d f4927j;

    /* renamed from: k */
    public final C0930b f4928k;

    /* renamed from: l */
    public ViewGroupOnHierarchyChangeListenerC0933e f4929l;

    /* renamed from: m */
    public int f4930m;

    /* renamed from: n */
    public boolean f4931n;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C0930b implements CompoundButton.OnCheckedChangeListener {
        public C0930b(C0929a c0929a) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.f4931n) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f4926i) {
                    chipGroup2.m2658c(compoundButton.getId(), true);
                    ChipGroup chipGroup3 = ChipGroup.this;
                    chipGroup3.f4930m = compoundButton.getId();
                    InterfaceC0932d interfaceC0932d = chipGroup3.f4927j;
                    return;
                }
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.f4930m == id) {
                    chipGroup4.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup5 = ChipGroup.this;
            int i = chipGroup5.f4930m;
            if (i != -1 && i != id && chipGroup5.f4925h) {
                chipGroup5.m2658c(i, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C0931c extends ViewGroup.MarginLayoutParams {
        public C0931c(int i, int i2) {
            super(i, i2);
        }

        public C0931c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0931c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC0932d {
        /* renamed from: a */
        void m2659a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class ViewGroupOnHierarchyChangeListenerC0933e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f4933b;

        public ViewGroupOnHierarchyChangeListenerC0933e(C0929a c0929a) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f4928k);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4933b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4933b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.chipGroupStyle, C1088R.style.Widget_MaterialComponents_ChipGroup), attributeSet, C1088R.attr.chipGroupStyle);
        this.f4928k = new C0930b(null);
        this.f4929l = new ViewGroupOnHierarchyChangeListenerC0933e(null);
        this.f4930m = -1;
        this.f4931n = false;
        TypedArray typedArrayM2269d = C0655j.m2269d(getContext(), attributeSet, C0564b.f3509d, C1088R.attr.chipGroupStyle, C1088R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM2269d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM2269d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM2269d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM2269d.getBoolean(5, false));
        setSingleSelection(typedArrayM2269d.getBoolean(6, false));
        setSelectionRequired(typedArrayM2269d.getBoolean(4, false));
        int resourceId = typedArrayM2269d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f4930m = resourceId;
        }
        typedArrayM2269d.recycle();
        super.setOnHierarchyChangeListener(this.f4929l);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f4930m = i;
        InterfaceC0932d interfaceC0932d = this.f4927j;
        if (interfaceC0932d == null || !this.f4925h) {
            return;
        }
        interfaceC0932d.m2659a(this, i);
    }

    @Override // p070b.p074b.p075a.p076a.p096r.C0650e
    /* renamed from: a */
    public boolean mo2261a() {
        return this.f3925d;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f4930m;
                if (i2 != -1 && this.f4925h) {
                    m2658c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public final void m2658c(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.f4931n = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.f4931n = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0931c);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0931c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0931c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0931c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f4925h) {
            return this.f4930m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f4925h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f4923f;
    }

    public int getChipSpacingVertical() {
        return this.f4924g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f4930m;
        if (i != -1) {
            m2658c(i, true);
            setCheckedId(this.f4930m);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.f3925d ? getChipCount() : -1, false, this.f4925h ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f4923f != i) {
            this.f4923f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f4924g != i) {
            this.f4924g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC0932d interfaceC0932d) {
        this.f4927j = interfaceC0932d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4929l.f4933b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f4926i = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // p070b.p074b.p075a.p076a.p096r.C0650e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f4925h != z) {
            this.f4925h = z;
            this.f4931n = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f4931n = false;
            setCheckedId(-1);
        }
    }
}
