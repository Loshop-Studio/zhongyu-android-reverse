package com.xuexiang.xui.widget.banner.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class RecyclerViewBannerBase<L extends RecyclerView.LayoutManager, A extends RecyclerView.Adapter> extends FrameLayout {

    /* renamed from: c */
    public RecyclerView f15389c;

    /* renamed from: d */
    public IndicatorAdapter f15390d;

    /* renamed from: e */
    public int f15391e;

    /* renamed from: f */
    public boolean f15392f;

    /* renamed from: g */
    public Drawable f15393g;

    /* renamed from: h */
    public Drawable f15394h;

    /* renamed from: i */
    public RecyclerView f15395i;

    /* renamed from: j */
    public RecyclerView.LayoutManager f15396j;

    /* renamed from: k */
    public boolean f15397k;

    /* renamed from: l */
    public int f15398l;

    /* renamed from: m */
    public boolean f15399m;

    /* renamed from: n */
    public int f15400n;

    /* renamed from: o */
    public int f15401o;

    /* renamed from: p */
    public boolean f15402p;

    /* renamed from: q */
    public List f15403q;

    /* renamed from: r */
    public Handler f15404r;

    public class IndicatorAdapter extends RecyclerView.Adapter {

        /* renamed from: a */
        public int f15405a = 0;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase$IndicatorAdapter$a */
        public class C8052a extends RecyclerView.ViewHolder {
            public C8052a(View view) {
                super(view);
            }
        }

        public IndicatorAdapter() {
        }

        /* renamed from: a */
        public void m12299a(int i10) {
            this.f15405a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return RecyclerViewBannerBase.this.f15400n;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f15405a == i10 ? RecyclerViewBannerBase.this.f15393g : RecyclerViewBannerBase.this.f15394h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            ImageView imageView = new ImageView(RecyclerViewBannerBase.this.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            int i11 = RecyclerViewBannerBase.this.f15391e;
            layoutParams.setMargins(i11, i11, i11, i11);
            imageView.setLayoutParams(layoutParams);
            return new C8052a(imageView);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase$a */
    public class C8053a implements Handler.Callback {
        public C8053a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1000) {
                return false;
            }
            RecyclerViewBannerBase recyclerViewBannerBase = RecyclerViewBannerBase.this;
            RecyclerView recyclerView = recyclerViewBannerBase.f15395i;
            int i10 = recyclerViewBannerBase.f15401o + 1;
            recyclerViewBannerBase.f15401o = i10;
            recyclerView.smoothScrollToPosition(i10);
            RecyclerViewBannerBase.this.m12298e();
            RecyclerViewBannerBase.this.f15404r.sendEmptyMessageDelayed(1000, r5.f15398l);
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase$b */
    public class C8054b extends RecyclerView.OnScrollListener {
        public C8054b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            RecyclerViewBannerBase.this.m12296c(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            RecyclerViewBannerBase.this.m12297d(recyclerView, i10, i11);
        }
    }

    public RecyclerViewBannerBase(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public abstract RecyclerView.LayoutManager m12294a(Context context, int i10);

    /* renamed from: b */
    public void m12295b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerViewBannerBase);
        this.f15392f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerViewBannerBase_rvbb_showIndicator, true);
        this.f15398l = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerViewBannerBase_rvbb_interval, 4000);
        this.f15397k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerViewBannerBase_rvbb_autoPlaying, true);
        this.f15393g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.RecyclerViewBannerBase_rvbb_indicatorSelectedSrc);
        this.f15394h = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.RecyclerViewBannerBase_rvbb_indicatorUnselectedSrc);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RecyclerViewBannerBase_rvbb_indicatorSize, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorSize));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.RecyclerViewBannerBase_rvbb_indicatorSelectedColor, SupportMenu.CATEGORY_MASK);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.RecyclerViewBannerBase_rvbb_indicatorUnselectedColor, -7829368);
        if (this.f15393g == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(color);
            gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable.setCornerRadius(dimensionPixelSize >> 1);
            this.f15393g = new LayerDrawable(new Drawable[]{gradientDrawable});
        }
        if (this.f15394h == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(color2);
            gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable2.setCornerRadius(dimensionPixelSize >> 1);
            this.f15394h = new LayerDrawable(new Drawable[]{gradientDrawable2});
        }
        this.f15391e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RecyclerViewBannerBase_rvbb_indicatorSpace, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorSpace));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RecyclerViewBannerBase_rvbb_indicatorMarginLeft, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginLeft));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RecyclerViewBannerBase_rvbb_indicatorMarginRight, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginRight));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RecyclerViewBannerBase_rvbb_indicatorMarginBottom, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginBottom));
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerViewBannerBase_rvbb_indicatorGravity, 0);
        int i11 = i10 == 0 ? GravityCompat.START : i10 == 2 ? GravityCompat.END : 17;
        int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerViewBannerBase_rvbb_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f15395i = new RecyclerView(context);
        new PagerSnapHelper().attachToRecyclerView(this.f15395i);
        RecyclerView.LayoutManager layoutManagerM12294a = m12294a(context, i12);
        this.f15396j = layoutManagerM12294a;
        this.f15395i.setLayoutManager(layoutManagerM12294a);
        this.f15395i.addOnScrollListener(new C8054b());
        addView(this.f15395i, new FrameLayout.LayoutParams(-1, -1));
        this.f15389c = new RecyclerView(context);
        this.f15389c.setLayoutManager(new LinearLayoutManager(context, i12, false));
        IndicatorAdapter indicatorAdapter = new IndicatorAdapter();
        this.f15390d = indicatorAdapter;
        this.f15389c.setAdapter(indicatorAdapter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i11 | 80;
        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize3, dimensionPixelSize4);
        addView(this.f15389c, layoutParams);
        if (this.f15392f) {
            return;
        }
        this.f15389c.setVisibility(8);
    }

    /* renamed from: c */
    public void m12296c(RecyclerView recyclerView, int i10) {
    }

    /* renamed from: d */
    public void m12297d(RecyclerView recyclerView, int i10, int i11) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setPlaying(false);
        } else if (action == 1 || action == 3) {
            setPlaying(true);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public synchronized void m12298e() {
        int i10 = this.f15400n;
        if (i10 > 1) {
            int i11 = this.f15401o % i10;
            if (this.f15392f) {
                this.f15390d.m12299a(i11);
                this.f15390d.notifyDataSetChanged();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPlaying(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setPlaying(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            setPlaying(true);
        } else {
            setPlaying(false);
        }
    }

    public void setAutoPlaying(boolean z10) {
        this.f15397k = z10;
        setPlaying(z10);
    }

    public void setIndicatorInterval(int i10) {
        this.f15398l = i10;
    }

    public synchronized void setPlaying(boolean z10) {
        try {
            if (this.f15397k && this.f15399m) {
                boolean z11 = this.f15402p;
                if (!z11 && z10) {
                    this.f15404r.sendEmptyMessageDelayed(1000, this.f15398l);
                    this.f15402p = true;
                } else if (z11 && !z10) {
                    this.f15404r.removeMessages(1000);
                    this.f15402p = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setShowIndicator(boolean z10) {
        this.f15392f = z10;
        this.f15389c.setVisibility(z10 ? 0 : 8);
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15398l = 4000;
        this.f15400n = 1;
        this.f15403q = new ArrayList();
        this.f15404r = new Handler(new C8053a());
        m12295b(context, attributeSet);
    }
}
