package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import p000a.p005b.C0014b;
import p000a.p005b.p006c.AbstractC0015a;

/* renamed from: a.b.h.n0 */
/* loaded from: classes.dex */
public class C0096n0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public boolean f717b;

    /* renamed from: c */
    public int f718c;

    /* renamed from: d */
    public int f719d;

    /* renamed from: e */
    public int f720e;

    /* renamed from: a.b.h.n0$a */
    public class a extends LinearLayout {

        /* renamed from: b */
        public AbstractC0015a.c f721b;

        /* renamed from: c */
        public final /* synthetic */ C0096n0 f722c;

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            Objects.requireNonNull(this.f722c);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0014b.f26a, C1088R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C1088R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1088R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f718c = context.getResources().getDimensionPixelSize(C1088R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((a) view).f721b.m18a();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f717b = z;
    }

    public void setContentHeight(int i) {
        this.f719d = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f720e = i;
        throw null;
    }
}
