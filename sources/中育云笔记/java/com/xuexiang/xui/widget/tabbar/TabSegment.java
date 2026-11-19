package com.xuexiang.xui.widget.tabbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8036b;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p212k.AbstractC9764r;
import p222k9.AbstractC9829a;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class TabSegment extends HorizontalScrollView {

    /* renamed from: A */
    public InterfaceC8273g f17088A;

    /* renamed from: B */
    public C8270d f17089B;

    /* renamed from: C */
    public boolean f17090C;

    /* renamed from: c */
    public final ArrayList f17091c;

    /* renamed from: d */
    public C8271e f17092d;

    /* renamed from: e */
    public int f17093e;

    /* renamed from: f */
    public int f17094f;

    /* renamed from: g */
    public int f17095g;

    /* renamed from: h */
    public boolean f17096h;

    /* renamed from: i */
    public int f17097i;

    /* renamed from: j */
    public boolean f17098j;

    /* renamed from: k */
    public Drawable f17099k;

    /* renamed from: l */
    public boolean f17100l;

    /* renamed from: m */
    public Rect f17101m;

    /* renamed from: n */
    public Paint f17102n;

    /* renamed from: o */
    public int f17103o;

    /* renamed from: p */
    public int f17104p;

    /* renamed from: q */
    public int f17105q;

    /* renamed from: r */
    public int f17106r;

    /* renamed from: s */
    public int f17107s;

    /* renamed from: t */
    public int f17108t;

    /* renamed from: u */
    public Animator f17109u;

    /* renamed from: v */
    public View.OnClickListener f17110v;

    /* renamed from: w */
    public ViewPager f17111w;

    /* renamed from: x */
    public PagerAdapter f17112x;

    /* renamed from: y */
    public DataSetObserver f17113y;

    /* renamed from: z */
    public ViewPager.OnPageChangeListener f17114z;

    public class TabItemView extends RelativeLayout {

        /* renamed from: c */
        public AppCompatTextView f17115c;

        /* renamed from: d */
        public GestureDetector f17116d;

        /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$TabItemView$a */
        public class C8266a extends GestureDetector.SimpleOnGestureListener {

            /* renamed from: c */
            public final /* synthetic */ TabSegment f17118c;

            public C8266a(TabSegment tabSegment) {
                this.f17118c = tabSegment;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (TabSegment.this.f17091c.isEmpty()) {
                    return false;
                }
                int iIntValue = ((Integer) TabItemView.this.getTag()).intValue();
                if (((C8275i) TabSegment.this.getAdapter().m19931f(iIntValue)) == null) {
                    return false;
                }
                TabSegment.this.m13328K(iIntValue);
                return true;
            }
        }

        public TabItemView(Context context) {
            super(context);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f17115c = appCompatTextView;
            appCompatTextView.setSingleLine(true);
            this.f17115c.setGravity(17);
            this.f17115c.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f17115c.setTypeface(AbstractC11916b.m26459c());
            this.f17115c.setId(R$id.xui_tab_segment_item_id);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15, -1);
            addView(this.f17115c, layoutParams);
            this.f17116d = new GestureDetector(getContext(), new C8266a(TabSegment.this));
        }

        /* renamed from: a */
        public void m13351a(C8275i c8275i, int i10) {
            Drawable drawable;
            this.f17115c.setTextColor(i10);
            if (!c8275i.m13372n() || (drawable = this.f17115c.getCompoundDrawables()[TabSegment.this.m13333P(c8275i)]) == null) {
                return;
            }
            AbstractC8042h.m12238l(drawable, i10);
            TabSegment tabSegment = TabSegment.this;
            tabSegment.m13345b0(this.f17115c, drawable, tabSegment.m13333P(c8275i));
        }

        /* renamed from: b */
        public void m13352b(C8275i c8275i, boolean z10) {
            TabSegment tabSegment = TabSegment.this;
            int iM13335R = z10 ? tabSegment.m13335R(c8275i) : tabSegment.m13334Q(c8275i);
            this.f17115c.setTextColor(iM13335R);
            Drawable drawableM13367i = c8275i.m13367i();
            if (z10) {
                if (c8275i.m13372n()) {
                    if (drawableM13367i != null) {
                        drawableM13367i = drawableM13367i.mutate();
                        AbstractC8042h.m12238l(drawableM13367i, iM13335R);
                    }
                } else if (c8275i.m13369k() != null) {
                    drawableM13367i = c8275i.m13369k();
                }
            }
            if (drawableM13367i == null) {
                this.f17115c.setCompoundDrawablePadding(0);
                this.f17115c.setCompoundDrawables(null, null, null, null);
            } else {
                this.f17115c.setCompoundDrawablePadding(AbstractC8037c.m12188b(getContext(), 4.0f));
                TabSegment tabSegment2 = TabSegment.this;
                tabSegment2.m13345b0(this.f17115c, drawableM13367i, tabSegment2.m13333P(c8275i));
            }
        }

        public TextView getTextView() {
            return this.f17115c;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f17116d.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: c */
        public final WeakReference f17120c;

        public TabLayoutOnPageChangeListener(TabSegment tabSegment) {
            this.f17120c = new WeakReference(tabSegment);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            TabSegment tabSegment = (TabSegment) this.f17120c.get();
            if (tabSegment != null) {
                tabSegment.setViewPagerScrollState(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            TabSegment tabSegment = (TabSegment) this.f17120c.get();
            if (tabSegment != null) {
                tabSegment.m13350g0(i10, f10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            TabSegment tabSegment = (TabSegment) this.f17120c.get();
            if (tabSegment == null || tabSegment.getSelectedIndex() == i10 || i10 >= tabSegment.getTabCount()) {
                return;
            }
            tabSegment.m13344a0(i10, true, false);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$a */
    public class ViewOnClickListenerC8267a implements View.OnClickListener {
        public ViewOnClickListenerC8267a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TabSegment.this.f17109u == null && TabSegment.this.f17108t == 0) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                C8275i c8275i = (C8275i) TabSegment.this.getAdapter().m19931f(iIntValue);
                if (c8275i != null) {
                    TabSegment tabSegment = TabSegment.this;
                    tabSegment.m13344a0(iIntValue, (tabSegment.f17096h || c8275i.m13372n()) ? false : true, true);
                }
                TabSegment.m13293B(TabSegment.this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$b */
    public class C8268b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C8275i f17122a;

        /* renamed from: b */
        public final /* synthetic */ C8275i f17123b;

        /* renamed from: c */
        public final /* synthetic */ TabItemView f17124c;

        /* renamed from: d */
        public final /* synthetic */ TabItemView f17125d;

        public C8268b(C8275i c8275i, C8275i c8275i2, TabItemView tabItemView, TabItemView tabItemView2) {
            this.f17122a = c8275i;
            this.f17123b = c8275i2;
            this.f17124c = tabItemView;
            this.f17125d = tabItemView2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int iM12186a = AbstractC8036b.m12186a(TabSegment.this.m13335R(this.f17122a), TabSegment.this.m13334Q(this.f17122a), fFloatValue);
            int iM12186a2 = AbstractC8036b.m12186a(TabSegment.this.m13334Q(this.f17123b), TabSegment.this.m13335R(this.f17123b), fFloatValue);
            this.f17124c.m13351a(this.f17122a, iM12186a);
            this.f17125d.m13351a(this.f17123b, iM12186a2);
            TabSegment.this.m13339V(this.f17122a, this.f17123b, fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$c */
    public class C8269c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ TabItemView f17127a;

        /* renamed from: b */
        public final /* synthetic */ C8275i f17128b;

        /* renamed from: c */
        public final /* synthetic */ TabItemView f17129c;

        /* renamed from: d */
        public final /* synthetic */ C8275i f17130d;

        /* renamed from: e */
        public final /* synthetic */ int f17131e;

        /* renamed from: f */
        public final /* synthetic */ int f17132f;

        public C8269c(TabItemView tabItemView, C8275i c8275i, TabItemView tabItemView2, C8275i c8275i2, int i10, int i11) {
            this.f17127a = tabItemView;
            this.f17128b = c8275i;
            this.f17129c = tabItemView2;
            this.f17130d = c8275i2;
            this.f17131e = i10;
            this.f17132f = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            TabSegment.this.f17109u = null;
            this.f17127a.m13352b(this.f17128b, true);
            this.f17129c.m13352b(this.f17130d, false);
            TabSegment.this.m13338U(this.f17128b, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TabSegment.this.f17109u = null;
            this.f17127a.m13352b(this.f17128b, false);
            this.f17129c.m13352b(this.f17130d, true);
            TabSegment.this.m13330M(this.f17131e);
            TabSegment.this.m13331N(this.f17132f);
            TabSegment.this.m13347d0(this.f17127a.getTextView(), false);
            TabSegment.this.m13347d0(this.f17129c.getTextView(), true);
            TabSegment.this.f17093e = this.f17131e;
            if (TabSegment.this.f17094f == -1 || TabSegment.this.f17108t != 0) {
                return;
            }
            TabSegment tabSegment = TabSegment.this;
            tabSegment.m13344a0(tabSegment.f17094f, true, false);
            TabSegment.this.f17094f = -1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TabSegment.this.f17109u = animator;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$d */
    public class C8270d implements ViewPager.OnAdapterChangeListener {

        /* renamed from: c */
        public boolean f17134c;

        /* renamed from: d */
        public final boolean f17135d;

        public C8270d(boolean z10) {
            this.f17135d = z10;
        }

        /* renamed from: a */
        public void m13353a(boolean z10) {
            this.f17134c = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabSegment.this.f17111w == viewPager) {
                TabSegment.this.m13346c0(pagerAdapter2, this.f17135d, this.f17134c);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$e */
    public final class C8271e extends ViewGroup {

        /* renamed from: c */
        public C8276j f17137c;

        public C8271e(Context context) {
            super(context);
            this.f17137c = TabSegment.this.new C8276j(this);
        }

        /* renamed from: a */
        public C8276j m13354a() {
            return this.f17137c;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (!TabSegment.this.f17096h || TabSegment.this.f17101m == null) {
                return;
            }
            if (TabSegment.this.f17098j) {
                TabSegment.this.f17101m.top = getPaddingTop();
                TabSegment.this.f17101m.bottom = TabSegment.this.f17101m.top + TabSegment.this.f17097i;
            } else {
                TabSegment.this.f17101m.bottom = getHeight() - getPaddingBottom();
                TabSegment.this.f17101m.top = TabSegment.this.f17101m.bottom - TabSegment.this.f17097i;
            }
            if (TabSegment.this.f17099k == null) {
                canvas.drawRect(TabSegment.this.f17101m, TabSegment.this.f17102n);
            } else {
                TabSegment.this.f17099k.setBounds(TabSegment.this.f17101m);
                TabSegment.this.f17099k.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            List listM19934i = this.f17137c.m19934i();
            int size = listM19934i.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                if (((View) listM19934i.get(i15)).getVisibility() == 0) {
                    i14++;
                }
            }
            if (size == 0 || i14 == 0) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            for (int i16 = 0; i16 < size; i16++) {
                TabItemView tabItemView = (TabItemView) listM19934i.get(i16);
                if (tabItemView.getVisibility() == 0) {
                    int measuredWidth = tabItemView.getMeasuredWidth();
                    int i17 = paddingLeft + measuredWidth;
                    tabItemView.layout(paddingLeft, getPaddingTop(), i17, (i13 - i11) - getPaddingBottom());
                    C8275i c8275i = (C8275i) this.f17137c.m19931f(i16);
                    int iM13361c = c8275i.m13361c();
                    int iM13362d = c8275i.m13362d();
                    if (TabSegment.this.f17106r == 1 && TabSegment.this.f17100l) {
                        TextView textView = tabItemView.getTextView();
                        paddingLeft += textView.getLeft();
                        measuredWidth = textView.getWidth();
                    }
                    if (iM13361c != paddingLeft || iM13362d != measuredWidth) {
                        c8275i.m13373o(paddingLeft);
                        c8275i.m13374p(measuredWidth);
                    }
                    paddingLeft = i17 + (TabSegment.this.f17106r == 0 ? TabSegment.this.f17107s : 0);
                }
            }
            if (TabSegment.this.f17093e != -1 && TabSegment.this.f17109u == null && TabSegment.this.f17108t == 0) {
                TabSegment tabSegment = TabSegment.this;
                tabSegment.m13338U((C8275i) this.f17137c.m19931f(tabSegment.f17093e), false);
            }
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            List listM19934i = this.f17137c.m19934i();
            int size3 = listM19934i.size();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size3; i14++) {
                if (((View) listM19934i.get(i14)).getVisibility() == 0) {
                    i13++;
                }
            }
            if (size3 == 0 || i13 == 0) {
                setMeasuredDimension(size, size2);
                return;
            }
            int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            if (TabSegment.this.f17106r == 1) {
                int i15 = size / i13;
                while (i12 < size3) {
                    View view = (View) listM19934i.get(i12);
                    if (view.getVisibility() == 0) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    }
                    i12++;
                }
            } else {
                int measuredWidth = 0;
                while (i12 < size3) {
                    View view2 = (View) listM19934i.get(i12);
                    if (view2.getVisibility() == 0) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        measuredWidth += view2.getMeasuredWidth() + TabSegment.this.f17107s;
                    }
                    i12++;
                }
                size = measuredWidth - TabSegment.this.f17107s;
            }
            setMeasuredDimension(size, size2);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$f */
    public interface InterfaceC8272f {
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$g */
    public interface InterfaceC8273g {
        /* renamed from: a */
        void mo13355a(int i10);

        /* renamed from: b */
        void mo13356b(int i10);

        /* renamed from: c */
        void mo13357c(int i10);

        /* renamed from: d */
        void mo13358d(int i10);
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$h */
    public class C8274h extends DataSetObserver {

        /* renamed from: a */
        public final boolean f17139a;

        public C8274h(boolean z10) {
            this.f17139a = z10;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabSegment.this.m13341X(this.f17139a);
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabSegment.this.m13341X(this.f17139a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$i */
    public static class C8275i {

        /* renamed from: j */
        public CharSequence f17150j;

        /* renamed from: k */
        public List f17151k;

        /* renamed from: a */
        public int f17141a = Integer.MIN_VALUE;

        /* renamed from: b */
        public int f17142b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f17143c = Integer.MIN_VALUE;

        /* renamed from: d */
        public Drawable f17144d = null;

        /* renamed from: e */
        public Drawable f17145e = null;

        /* renamed from: f */
        public int f17146f = 0;

        /* renamed from: g */
        public int f17147g = 0;

        /* renamed from: h */
        public int f17148h = Integer.MIN_VALUE;

        /* renamed from: i */
        public int f17149i = 17;

        /* renamed from: l */
        public int f17152l = 2;

        /* renamed from: m */
        public int f17153m = 0;

        /* renamed from: n */
        public int f17154n = 0;

        /* renamed from: o */
        public boolean f17155o = true;

        public C8275i(CharSequence charSequence) {
            this.f17150j = charSequence;
        }

        /* renamed from: c */
        public int m13361c() {
            return this.f17147g;
        }

        /* renamed from: d */
        public int m13362d() {
            return this.f17146f;
        }

        /* renamed from: e */
        public List m13363e() {
            return this.f17151k;
        }

        /* renamed from: f */
        public int m13364f() {
            return this.f17149i;
        }

        /* renamed from: g */
        public int m13365g() {
            return this.f17148h;
        }

        /* renamed from: h */
        public int m13366h() {
            return this.f17142b;
        }

        /* renamed from: i */
        public Drawable m13367i() {
            return this.f17144d;
        }

        /* renamed from: j */
        public int m13368j() {
            return this.f17143c;
        }

        /* renamed from: k */
        public Drawable m13369k() {
            return this.f17145e;
        }

        /* renamed from: l */
        public CharSequence m13370l() {
            return this.f17150j;
        }

        /* renamed from: m */
        public int m13371m() {
            return this.f17141a;
        }

        /* renamed from: n */
        public boolean m13372n() {
            return this.f17155o;
        }

        /* renamed from: o */
        public void m13373o(int i10) {
            this.f17147g = i10;
        }

        /* renamed from: p */
        public void m13374p(int i10) {
            this.f17146f = i10;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$j */
    public class C8276j extends AbstractC9829a {
        public C8276j(ViewGroup viewGroup) {
            super(viewGroup);
        }

        @Override // p222k9.AbstractC9829a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo13375b(C8275i c8275i, TabItemView tabItemView, int i10) {
            TextView textView = tabItemView.getTextView();
            TabSegment.this.m13347d0(textView, false);
            List<View> listM13363e = c8275i.m13363e();
            if (listM13363e != null && listM13363e.size() > 0) {
                tabItemView.setTag(R$id.xui_view_can_not_cache_tag, Boolean.TRUE);
                for (View view : listM13363e) {
                    if (view.getParent() == null) {
                        tabItemView.addView(view);
                    }
                }
            }
            if (TabSegment.this.f17106r == 1) {
                int iM13364f = c8275i.m13364f();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.addRule(9, (iM13364f & 3) == 3 ? -1 : 0);
                layoutParams.addRule(14, (iM13364f & 17) == 17 ? -1 : 0);
                layoutParams.addRule(11, (iM13364f & 5) != 5 ? 0 : -1);
                textView.setLayoutParams(layoutParams);
            }
            textView.setText(c8275i.m13370l());
            textView.setTextSize(0, TabSegment.this.m13336S(c8275i));
            tabItemView.m13352b(c8275i, TabSegment.this.f17093e == i10);
            tabItemView.setTag(Integer.valueOf(i10));
            tabItemView.setOnClickListener(TabSegment.this.f17110v);
        }

        @Override // p222k9.AbstractC9829a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public TabItemView mo13376d(ViewGroup viewGroup) {
            TabSegment tabSegment = TabSegment.this;
            return tabSegment.new TabItemView(tabSegment.getContext());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$k */
    public interface InterfaceC8277k {
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.TabSegment$l */
    public static class C8278l implements InterfaceC8273g {

        /* renamed from: a */
        public final ViewPager f17157a;

        public C8278l(ViewPager viewPager) {
            this.f17157a = viewPager;
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.InterfaceC8273g
        /* renamed from: a */
        public void mo13355a(int i10) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.InterfaceC8273g
        /* renamed from: b */
        public void mo13356b(int i10) throws Resources.NotFoundException {
            this.f17157a.setCurrentItem(i10, false);
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.InterfaceC8273g
        /* renamed from: c */
        public void mo13357c(int i10) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.InterfaceC8273g
        /* renamed from: d */
        public void mo13358d(int i10) {
        }
    }

    public TabSegment(Context context) {
        this(context, null);
    }

    /* renamed from: B */
    public static /* synthetic */ InterfaceC8272f m13293B(TabSegment tabSegment) {
        tabSegment.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C8276j getAdapter() {
        return this.f17092d.m13354a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        return getAdapter().m19932g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPagerScrollState(int i10) {
        int i11;
        this.f17108t = i10;
        if (i10 == 0 && (i11 = this.f17094f) != -1 && this.f17109u == null) {
            m13344a0(i11, true, false);
            this.f17094f = -1;
        }
    }

    /* renamed from: H */
    public void m13325H(InterfaceC8273g interfaceC8273g) {
        if (this.f17091c.contains(interfaceC8273g)) {
            return;
        }
        this.f17091c.add(interfaceC8273g);
    }

    /* renamed from: I */
    public TabSegment m13326I(C8275i c8275i) {
        this.f17092d.m13354a().m19928a(c8275i);
        return this;
    }

    /* renamed from: J */
    public final void m13327J(Context context, String str) throws NoSuchMethodException, SecurityException {
        if (AbstractC8042h.m12235i(str)) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return;
        }
        String strM13332O = m13332O(context, strTrim);
        try {
            try {
                Constructor constructor = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strM13332O).asSubclass(InterfaceC8277k.class).getConstructor(null);
                constructor.setAccessible(true);
                AbstractC9764r.m19682a(constructor.newInstance(null));
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("Error creating TypefaceProvider " + strM13332O, e10);
            }
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Class is not a TypefaceProvider " + strM13332O, e11);
        } catch (ClassNotFoundException e12) {
            throw new IllegalStateException("Unable to find TypefaceProvider " + strM13332O, e12);
        } catch (IllegalAccessException e13) {
            throw new IllegalStateException("Cannot access non-public constructor " + strM13332O, e13);
        } catch (InstantiationException e14) {
            throw new IllegalStateException("Could not instantiate the TypefaceProvider: " + strM13332O, e14);
        } catch (InvocationTargetException e15) {
            throw new IllegalStateException("Could not instantiate the TypefaceProvider: " + strM13332O, e15);
        }
    }

    /* renamed from: K */
    public final void m13328K(int i10) {
        for (int size = this.f17091c.size() - 1; size >= 0; size--) {
            ((InterfaceC8273g) this.f17091c.get(size)).mo13355a(i10);
        }
    }

    /* renamed from: L */
    public final void m13329L(int i10) {
        for (int size = this.f17091c.size() - 1; size >= 0; size--) {
            ((InterfaceC8273g) this.f17091c.get(size)).mo13357c(i10);
        }
    }

    /* renamed from: M */
    public final void m13330M(int i10) {
        for (int size = this.f17091c.size() - 1; size >= 0; size--) {
            ((InterfaceC8273g) this.f17091c.get(size)).mo13356b(i10);
        }
    }

    /* renamed from: N */
    public final void m13331N(int i10) {
        for (int size = this.f17091c.size() - 1; size >= 0; size--) {
            ((InterfaceC8273g) this.f17091c.get(size)).mo13358d(i10);
        }
    }

    /* renamed from: O */
    public final String m13332O(Context context, String str) {
        if (str.charAt(0) != '.') {
            return str;
        }
        return context.getPackageName() + str;
    }

    /* renamed from: P */
    public final int m13333P(C8275i c8275i) {
        int iM13365g = c8275i.m13365g();
        return iM13365g == Integer.MIN_VALUE ? this.f17105q : iM13365g;
    }

    /* renamed from: Q */
    public final int m13334Q(C8275i c8275i) {
        int iM13366h = c8275i.m13366h();
        return iM13366h == Integer.MIN_VALUE ? this.f17103o : iM13366h;
    }

    /* renamed from: R */
    public final int m13335R(C8275i c8275i) {
        int iM13368j = c8275i.m13368j();
        return iM13368j == Integer.MIN_VALUE ? this.f17104p : iM13368j;
    }

    /* renamed from: S */
    public final int m13336S(C8275i c8275i) {
        int iM13371m = c8275i.m13371m();
        return iM13371m == Integer.MIN_VALUE ? this.f17095g : iM13371m;
    }

    /* renamed from: T */
    public final void m13337T(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabSegment, i10, 0);
        this.f17104p = typedArrayObtainStyledAttributes.getColor(R$styleable.TabSegment_ts_selected_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f17103o = typedArrayObtainStyledAttributes.getColor(R$styleable.TabSegment_ts_normal_color, ContextCompat.getColor(context, R$color.xui_config_color_gray_5));
        this.f17096h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabSegment_ts_has_indicator, true);
        this.f17097i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_ts_indicator_height, getResources().getDimensionPixelSize(R$dimen.xui_tab_segment_indicator_height));
        this.f17095g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_android_textSize, getResources().getDimensionPixelSize(R$dimen.xui_tab_segment_text_size));
        this.f17098j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabSegment_ts_indicator_top, false);
        this.f17105q = typedArrayObtainStyledAttributes.getInt(R$styleable.TabSegment_ts_icon_position, 0);
        this.f17106r = typedArrayObtainStyledAttributes.getInt(R$styleable.TabSegment_ts_mode, 1);
        this.f17107s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_ts_space, AbstractC8037c.m12188b(context, 10.0f));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.TabSegment_ts_typeface_provider);
        typedArrayObtainStyledAttributes.recycle();
        C8271e c8271e = new C8271e(context);
        this.f17092d = c8271e;
        addView(c8271e, new FrameLayout.LayoutParams(-2, -1));
        m13327J(context, string);
    }

    /* renamed from: U */
    public final void m13338U(C8275i c8275i, boolean z10) {
        if (c8275i == null) {
            return;
        }
        Rect rect = this.f17101m;
        if (rect == null) {
            this.f17101m = new Rect(c8275i.f17147g, 0, c8275i.f17147g + c8275i.f17146f, 0);
        } else {
            rect.left = c8275i.f17147g;
            this.f17101m.right = c8275i.f17147g + c8275i.f17146f;
        }
        if (this.f17102n == null) {
            Paint paint = new Paint();
            this.f17102n = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        this.f17102n.setColor(m13335R(c8275i));
        if (z10) {
            this.f17092d.invalidate();
        }
    }

    /* renamed from: V */
    public final void m13339V(C8275i c8275i, C8275i c8275i2, float f10) {
        int iM13361c = c8275i2.m13361c() - c8275i.m13361c();
        int iM13361c2 = (int) (c8275i.m13361c() + (iM13361c * f10));
        int iM13362d = (int) (c8275i.m13362d() + ((c8275i2.m13362d() - c8275i.m13362d()) * f10));
        Rect rect = this.f17101m;
        if (rect == null) {
            this.f17101m = new Rect(iM13361c2, 0, iM13362d + iM13361c2, 0);
        } else {
            rect.left = iM13361c2;
            rect.right = iM13361c2 + iM13362d;
        }
        if (this.f17102n == null) {
            Paint paint = new Paint();
            this.f17102n = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        this.f17102n.setColor(AbstractC8036b.m12186a(m13335R(c8275i), m13335R(c8275i2), f10));
        this.f17092d.invalidate();
    }

    /* renamed from: W */
    public void m13340W() {
        getAdapter().m19935j();
        m13341X(false);
    }

    /* renamed from: X */
    public void m13341X(boolean z10) {
        PagerAdapter pagerAdapter = this.f17112x;
        if (pagerAdapter == null) {
            if (z10) {
                m13343Z();
                return;
            }
            return;
        }
        int count = pagerAdapter.getCount();
        if (z10) {
            m13343Z();
            for (int i10 = 0; i10 < count; i10++) {
                m13326I(new C8275i(this.f17112x.getPageTitle(i10)));
            }
            m13340W();
        }
        ViewPager viewPager = this.f17111w;
        if (viewPager == null || count <= 0) {
            return;
        }
        m13344a0(viewPager.getCurrentItem(), true, false);
    }

    /* renamed from: Y */
    public void m13342Y(InterfaceC8273g interfaceC8273g) {
        this.f17091c.remove(interfaceC8273g);
    }

    /* renamed from: Z */
    public void m13343Z() {
        this.f17092d.m13354a().m19929c();
        this.f17093e = -1;
        Animator animator = this.f17109u;
        if (animator != null) {
            animator.cancel();
            this.f17109u = null;
        }
    }

    /* renamed from: a0 */
    public void m13344a0(int i10, boolean z10, boolean z11) {
        if (this.f17090C) {
            return;
        }
        this.f17090C = true;
        C8276j adapter = getAdapter();
        List listM19934i = adapter.m19934i();
        if (listM19934i.size() != adapter.m19932g()) {
            adapter.m19935j();
            listM19934i = adapter.m19934i();
        }
        if (listM19934i.size() == 0 || listM19934i.size() <= i10) {
            this.f17090C = false;
            return;
        }
        if (this.f17109u != null || this.f17108t != 0) {
            this.f17094f = i10;
            this.f17090C = false;
            return;
        }
        int i11 = this.f17093e;
        if (i11 == i10) {
            if (z11) {
                m13329L(i10);
            }
            this.f17090C = false;
            this.f17092d.invalidate();
            return;
        }
        if (i11 > listM19934i.size()) {
            Log.i("TabSegment", "selectTab: current selected index is bigger than views size.");
            this.f17093e = -1;
        }
        int i12 = this.f17093e;
        if (i12 == -1) {
            C8275i c8275i = (C8275i) adapter.m19931f(i10);
            m13338U(c8275i, true);
            m13347d0(((TabItemView) listM19934i.get(i10)).getTextView(), true);
            ((TabItemView) listM19934i.get(i10)).m13352b(c8275i, true);
            m13330M(i10);
            this.f17093e = i10;
            this.f17090C = false;
            return;
        }
        C8275i c8275i2 = (C8275i) adapter.m19931f(i12);
        TabItemView tabItemView = (TabItemView) listM19934i.get(i12);
        C8275i c8275i3 = (C8275i) adapter.m19931f(i10);
        TabItemView tabItemView2 = (TabItemView) listM19934i.get(i10);
        if (!z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C8268b(c8275i2, c8275i3, tabItemView, tabItemView2));
            valueAnimatorOfFloat.addListener(new C8269c(tabItemView, c8275i2, tabItemView2, c8275i3, i10, i12));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            this.f17090C = false;
            return;
        }
        m13331N(i12);
        m13330M(i10);
        m13347d0(tabItemView.getTextView(), false);
        m13347d0(tabItemView2.getTextView(), true);
        tabItemView.m13352b(c8275i2, false);
        tabItemView2.m13352b(c8275i3, true);
        if (getScrollX() > tabItemView2.getLeft()) {
            smoothScrollTo(tabItemView2.getLeft(), 0);
        } else {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            if (getScrollX() + width < tabItemView2.getRight()) {
                smoothScrollBy((tabItemView2.getRight() - width) - getScrollX(), 0);
            }
        }
        this.f17093e = i10;
        this.f17090C = false;
        m13338U(c8275i3, true);
    }

    /* renamed from: b0 */
    public final void m13345b0(TextView textView, Drawable drawable, int i10) {
        Drawable drawable2 = i10 == 0 ? drawable : null;
        Drawable drawable3 = i10 == 1 ? drawable : null;
        Drawable drawable4 = i10 == 2 ? drawable : null;
        if (i10 != 3) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, drawable3, drawable4, drawable);
    }

    /* renamed from: c0 */
    public void m13346c0(PagerAdapter pagerAdapter, boolean z10, boolean z11) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f17112x;
        if (pagerAdapter2 != null && (dataSetObserver = this.f17113y) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f17112x = pagerAdapter;
        if (z11 && pagerAdapter != null) {
            if (this.f17113y == null) {
                this.f17113y = new C8274h(z10);
            }
            pagerAdapter.registerDataSetObserver(this.f17113y);
        }
        m13341X(z10);
    }

    /* renamed from: d0 */
    public final void m13347d0(TextView textView, boolean z10) {
    }

    /* renamed from: e0 */
    public void m13348e0(ViewPager viewPager, boolean z10) {
        m13349f0(viewPager, z10, true);
    }

    /* renamed from: f0 */
    public void m13349f0(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f17111w;
        if (viewPager2 != null) {
            ViewPager.OnPageChangeListener onPageChangeListener = this.f17114z;
            if (onPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(onPageChangeListener);
            }
            C8270d c8270d = this.f17089B;
            if (c8270d != null) {
                this.f17111w.removeOnAdapterChangeListener(c8270d);
            }
        }
        InterfaceC8273g interfaceC8273g = this.f17088A;
        if (interfaceC8273g != null) {
            m13342Y(interfaceC8273g);
            this.f17088A = null;
        }
        if (viewPager == null) {
            this.f17111w = null;
            m13346c0(null, false, false);
            return;
        }
        this.f17111w = viewPager;
        if (this.f17114z == null) {
            this.f17114z = new TabLayoutOnPageChangeListener(this);
        }
        viewPager.addOnPageChangeListener(this.f17114z);
        C8278l c8278l = new C8278l(viewPager);
        this.f17088A = c8278l;
        m13325H(c8278l);
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter != null) {
            m13346c0(adapter, z10, z11);
        }
        if (this.f17089B == null) {
            this.f17089B = new C8270d(z10);
        }
        this.f17089B.m13353a(z11);
        viewPager.addOnAdapterChangeListener(this.f17089B);
    }

    /* renamed from: g0 */
    public void m13350g0(int i10, float f10) {
        int i11;
        if (this.f17109u != null || this.f17090C || f10 == 0.0f) {
            return;
        }
        if (f10 < 0.0f) {
            i11 = i10 - 1;
            f10 = -f10;
        } else {
            i11 = i10 + 1;
        }
        C8276j adapter = getAdapter();
        List listM19934i = adapter.m19934i();
        if (listM19934i.size() <= i10 || listM19934i.size() <= i11) {
            return;
        }
        C8275i c8275i = (C8275i) adapter.m19931f(i10);
        C8275i c8275i2 = (C8275i) adapter.m19931f(i11);
        TabItemView tabItemView = (TabItemView) listM19934i.get(i10);
        TabItemView tabItemView2 = (TabItemView) listM19934i.get(i11);
        int iM12186a = AbstractC8036b.m12186a(m13335R(c8275i), m13334Q(c8275i), f10);
        int iM12186a2 = AbstractC8036b.m12186a(m13334Q(c8275i2), m13335R(c8275i2), f10);
        tabItemView.m13351a(c8275i, iM12186a);
        tabItemView2.m13351a(c8275i2, iM12186a2);
        m13339V(c8275i, c8275i2, f10);
    }

    public int getMode() {
        return this.f17106r;
    }

    public int getSelectedIndex() {
        return this.f17093e;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f17093e == -1 || this.f17106r != 0) {
            return;
        }
        TabItemView tabItemView = (TabItemView) getAdapter().m19934i().get(this.f17093e);
        if (getScrollX() > tabItemView.getLeft()) {
            scrollTo(tabItemView.getLeft(), 0);
            return;
        }
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        if (getScrollX() + width < tabItemView.getRight()) {
            scrollBy((tabItemView.getRight() - width) - getScrollX(), 0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size - paddingLeft, 1073741824), i11);
            if (mode == Integer.MIN_VALUE) {
                setMeasuredDimension(Math.min(size, childAt.getMeasuredWidth() + paddingLeft), i11);
                return;
            }
        }
        setMeasuredDimension(i10, i11);
    }

    public void setDefaultNormalColor(@ColorInt int i10) {
        this.f17103o = i10;
    }

    public void setDefaultSelectedColor(@ColorInt int i10) {
        this.f17104p = i10;
    }

    public void setDefaultTabIconPosition(int i10) {
        this.f17105q = i10;
    }

    public void setHasIndicator(boolean z10) {
        if (this.f17096h != z10) {
            this.f17096h = z10;
            invalidate();
        }
    }

    public void setIndicatorDrawable(Drawable drawable) {
        this.f17099k = drawable;
        if (drawable != null) {
            this.f17097i = drawable.getIntrinsicHeight();
        }
        this.f17092d.invalidate();
    }

    public void setIndicatorPosition(boolean z10) {
        if (this.f17098j != z10) {
            this.f17098j = z10;
            this.f17092d.invalidate();
        }
    }

    public void setIndicatorWidthAdjustContent(boolean z10) {
        if (this.f17100l != z10) {
            this.f17100l = z10;
            this.f17092d.requestLayout();
        }
    }

    public void setItemSpaceInScrollMode(int i10) {
        this.f17107s = i10;
    }

    public void setMode(int i10) {
        if (this.f17106r != i10) {
            this.f17106r = i10;
            this.f17092d.invalidate();
        }
    }

    public void setOnTabClickListener(InterfaceC8272f interfaceC8272f) {
    }

    public void setTabTextSize(int i10) {
        this.f17095g = i10;
    }

    public void setTypefaceProvider(InterfaceC8277k interfaceC8277k) {
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m13348e0(viewPager, true);
    }

    public TabSegment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TabSegmentStyle);
    }

    public TabSegment(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.f17091c = new ArrayList();
        this.f17093e = -1;
        this.f17094f = -1;
        this.f17096h = true;
        this.f17098j = false;
        this.f17100l = true;
        this.f17101m = null;
        this.f17102n = null;
        this.f17106r = 1;
        this.f17108t = 0;
        this.f17110v = new ViewOnClickListenerC8267a();
        this.f17090C = false;
        m13337T(context, attributeSet, i10);
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
    }
}
