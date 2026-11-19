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
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;
import com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper;

/* loaded from: classes5.dex */
public class BannerLayout extends FrameLayout {

    /* renamed from: c */
    public RecyclerView f15366c;

    /* renamed from: d */
    public IndicatorAdapter f15367d;

    /* renamed from: e */
    public int f15368e;

    /* renamed from: f */
    public Drawable f15369f;

    /* renamed from: g */
    public Drawable f15370g;

    /* renamed from: h */
    public RecyclerView f15371h;

    /* renamed from: i */
    public BannerLayoutManager f15372i;

    /* renamed from: j */
    public boolean f15373j;

    /* renamed from: k */
    public int f15374k;

    /* renamed from: l */
    public int f15375l;

    /* renamed from: m */
    public boolean f15376m;

    /* renamed from: n */
    public boolean f15377n;

    /* renamed from: o */
    public int f15378o;

    /* renamed from: p */
    public boolean f15379p;

    /* renamed from: q */
    public int f15380q;

    /* renamed from: r */
    public float f15381r;

    /* renamed from: s */
    public float f15382s;

    /* renamed from: t */
    public Handler f15383t;

    public class IndicatorAdapter extends RecyclerView.Adapter {

        /* renamed from: a */
        public int f15384a = 0;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.BannerLayout$IndicatorAdapter$a */
        public class C8049a extends RecyclerView.ViewHolder {
            public C8049a(View view) {
                super(view);
            }
        }

        public IndicatorAdapter() {
        }

        /* renamed from: a */
        public void m12293a(int i10) {
            this.f15384a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return BannerLayout.this.f15374k;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f15384a == i10 ? BannerLayout.this.f15369f : BannerLayout.this.f15370g);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            ImageView imageView = new ImageView(BannerLayout.this.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            layoutParams.setMargins(BannerLayout.this.f15368e, BannerLayout.this.f15368e, BannerLayout.this.f15368e, BannerLayout.this.f15368e);
            imageView.setLayoutParams(layoutParams);
            return new C8049a(imageView);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.BannerLayout$a */
    public class C8050a implements Handler.Callback {
        public C8050a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1000 || BannerLayout.this.f15375l != BannerLayout.this.f15372i.m12322g()) {
                return false;
            }
            BannerLayout.m12283c(BannerLayout.this);
            BannerLayout.this.f15371h.smoothScrollToPosition(BannerLayout.this.f15375l);
            BannerLayout.this.f15383t.sendEmptyMessageDelayed(1000, r5.f15378o);
            BannerLayout.this.m12292l();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.BannerLayout$b */
    public class C8051b extends RecyclerView.OnScrollListener {
        public C8051b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            int iM12322g = BannerLayout.this.f15372i.m12322g();
            if (BannerLayout.this.f15375l != iM12322g) {
                BannerLayout.this.f15375l = iM12322g;
            }
            if (i10 == 0) {
                BannerLayout.this.setPlaying(true);
            }
            BannerLayout.this.m12292l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0) {
                BannerLayout.this.setPlaying(false);
            }
        }
    }

    public BannerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public static /* synthetic */ int m12283c(BannerLayout bannerLayout) {
        int i10 = bannerLayout.f15375l + 1;
        bannerLayout.f15375l = i10;
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setPlaying(false);
        } else if (action == 1 || action == 3) {
            setPlaying(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: k */
    public void m12291k(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BannerLayout, i10, 0);
        this.f15379p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BannerLayout_bl_showIndicator, true);
        this.f15378o = typedArrayObtainStyledAttributes.getInt(R$styleable.BannerLayout_bl_interval, 4000);
        this.f15377n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BannerLayout_bl_autoPlaying, true);
        this.f15380q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_itemSpace, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_itemSpace));
        this.f15381r = typedArrayObtainStyledAttributes.getFloat(R$styleable.BannerLayout_bl_centerScale, 1.2f);
        this.f15382s = typedArrayObtainStyledAttributes.getFloat(R$styleable.BannerLayout_bl_moveSpeed, 1.0f);
        this.f15369f = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.BannerLayout_bl_indicatorSelectedSrc);
        this.f15370g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.BannerLayout_bl_indicatorUnselectedSrc);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_indicatorSize, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorSize));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BannerLayout_bl_indicatorSelectedColor, AbstractC8040f.m12202c(R$color.xui_config_color_red));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BannerLayout_bl_indicatorUnselectedColor, AbstractC8040f.m12202c(R$color.xui_config_color_gray_2));
        if (this.f15369f == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(color);
            gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable.setCornerRadius(dimensionPixelSize >> 1);
            this.f15369f = new LayerDrawable(new Drawable[]{gradientDrawable});
        }
        if (this.f15370g == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(color2);
            gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable2.setCornerRadius(dimensionPixelSize >> 1);
            this.f15370g = new LayerDrawable(new Drawable[]{gradientDrawable2});
        }
        this.f15368e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_indicatorSpace, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorSpace));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_indicatorMarginLeft, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginLeft));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_indicatorMarginRight, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginRight));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BannerLayout_bl_indicatorMarginBottom, AbstractC8040f.m12204e(R$dimen.default_recycler_banner_indicatorMarginBottom));
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.BannerLayout_bl_indicatorGravity, 0);
        int i12 = i11 == 0 ? GravityCompat.START : i11 == 2 ? GravityCompat.END : 17;
        int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.BannerLayout_bl_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f15371h = new RecyclerView(context);
        addView(this.f15371h, new FrameLayout.LayoutParams(-1, -1));
        BannerLayoutManager bannerLayoutManager = new BannerLayoutManager(getContext(), i13);
        this.f15372i = bannerLayoutManager;
        bannerLayoutManager.m12314C(this.f15380q);
        this.f15372i.m12333y(this.f15381r);
        this.f15372i.m12317F(this.f15382s);
        this.f15371h.setLayoutManager(this.f15372i);
        new CenterSnapHelper().attachToRecyclerView(this.f15371h);
        this.f15366c = new RecyclerView(context);
        this.f15366c.setLayoutManager(new LinearLayoutManager(context, i13, false));
        IndicatorAdapter indicatorAdapter = new IndicatorAdapter();
        this.f15367d = indicatorAdapter;
        this.f15366c.setAdapter(indicatorAdapter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i12 | 80;
        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize3, dimensionPixelSize4);
        layoutParams.setMarginStart(dimensionPixelSize2);
        layoutParams.setMarginEnd(dimensionPixelSize3);
        addView(this.f15366c, layoutParams);
        if (this.f15379p) {
            return;
        }
        this.f15366c.setVisibility(8);
    }

    /* renamed from: l */
    public synchronized void m12292l() {
        int i10 = this.f15374k;
        if (i10 > 1) {
            int i11 = this.f15375l % i10;
            if (this.f15379p) {
                this.f15367d.m12293a(i11);
                this.f15367d.notifyDataSetChanged();
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

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            setPlaying(true);
        } else {
            setPlaying(false);
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.f15373j = false;
        this.f15371h.setAdapter(adapter);
        int itemCount = adapter.getItemCount();
        this.f15374k = itemCount;
        this.f15372i.m12312A(itemCount >= 3);
        setPlaying(true);
        this.f15371h.addOnScrollListener(new C8051b());
        this.f15373j = true;
    }

    public synchronized void setPlaying(boolean z10) {
        try {
            if (this.f15377n && this.f15373j) {
                boolean z11 = this.f15376m;
                if (!z11 && z10) {
                    this.f15383t.sendEmptyMessageDelayed(1000, this.f15378o);
                    this.f15376m = true;
                } else if (z11 && !z10) {
                    this.f15383t.removeMessages(1000);
                    this.f15376m = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public BannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.BannerLayoutStyle);
    }

    public BannerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15374k = 1;
        this.f15376m = false;
        this.f15377n = true;
        this.f15383t = new Handler(new C8050a());
        m12291k(context, attributeSet, i10);
    }
}
