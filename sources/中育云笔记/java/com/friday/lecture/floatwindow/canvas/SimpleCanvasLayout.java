package com.friday.lecture.floatwindow.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.CacheMemoryStaticUtils;
import com.blankj.utilcode.util.FileUtils;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.widget.TouchSwitchView;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.adapter.PaintColorAdapter;
import com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout;
import com.friday.lecture.model.PaintColorEntity;
import com.friday.lecture.widget.GlobalCanvasView;
import com.github.chrisbanes.photoview.PhotoView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p268o1.InterfaceC10427d;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class SimpleCanvasLayout extends FrameLayout {

    /* renamed from: q */
    public static final C6141a f8692q = new C6141a(null);

    /* renamed from: r */
    public static final int f8693r = 8;

    /* renamed from: c */
    public final boolean f8694c;

    /* renamed from: d */
    public PaintColorAdapter f8695d;

    /* renamed from: e */
    public boolean f8696e;

    /* renamed from: f */
    public ImageView f8697f;

    /* renamed from: g */
    public ImageView f8698g;

    /* renamed from: h */
    public ImageView f8699h;

    /* renamed from: i */
    public ImageView f8700i;

    /* renamed from: j */
    public GlobalCanvasView f8701j;

    /* renamed from: k */
    public View f8702k;

    /* renamed from: l */
    public PhotoView f8703l;

    /* renamed from: m */
    public ImageView f8704m;

    /* renamed from: n */
    public ImageView f8705n;

    /* renamed from: o */
    public ImageView f8706o;

    /* renamed from: p */
    public InterfaceC9529a f8707p;

    /* renamed from: com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$a */
    public static final class C6141a {
        public /* synthetic */ C6141a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6141a() {
        }
    }

    /* renamed from: com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$b */
    public static final class C6142b {

        /* renamed from: a */
        public final boolean f8708a;

        /* renamed from: b */
        public final float f8709b;

        /* renamed from: c */
        public final int f8710c;

        /* renamed from: d */
        public final int f8711d;

        /* renamed from: e */
        public final boolean f8712e;

        public C6142b(boolean z10, float f10, int i10, int i11, boolean z11) {
            this.f8708a = z10;
            this.f8709b = f10;
            this.f8710c = i10;
            this.f8711d = i11;
            this.f8712e = z11;
        }

        /* renamed from: a */
        public final boolean m6556a() {
            return this.f8708a;
        }

        /* renamed from: b */
        public final int m6557b() {
            return this.f8711d;
        }

        /* renamed from: c */
        public final int m6558c() {
            return this.f8710c;
        }

        /* renamed from: d */
        public final float m6559d() {
            return this.f8709b;
        }

        /* renamed from: e */
        public final boolean m6560e() {
            return this.f8712e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6142b)) {
                return false;
            }
            C6142b c6142b = (C6142b) obj;
            return this.f8708a == c6142b.f8708a && Float.compare(this.f8709b, c6142b.f8709b) == 0 && this.f8710c == c6142b.f8710c && this.f8711d == c6142b.f8711d && this.f8712e == c6142b.f8712e;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.f8708a) * 31) + Float.hashCode(this.f8709b)) * 31) + Integer.hashCode(this.f8710c)) * 31) + Integer.hashCode(this.f8711d)) * 31) + Boolean.hashCode(this.f8712e);
        }

        public String toString() {
            return "GcvPaintEntity(fingerMode=" + this.f8708a + ", paintWidth=" + this.f8709b + ", paintColor=" + this.f8710c + ", mode=" + this.f8711d + ", showOptions=" + this.f8712e + ")";
        }
    }

    public /* synthetic */ SimpleCanvasLayout(Context context, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(context, (i10 & 2) != 0 ? false : z10);
    }

    private final C6142b getGcvPaintEntity() {
        C6142b c6142b = (C6142b) CacheMemoryStaticUtils.get("SimpleCanvasFingerMode");
        if (c6142b != null) {
            return c6142b;
        }
        ImageView imageView = this.f8699h;
        View view = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivFinger");
            imageView = null;
        }
        boolean zIsSelected = imageView.isSelected();
        GlobalCanvasView globalCanvasView = this.f8701j;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        float paintSize = globalCanvasView.getPaintSize();
        GlobalCanvasView globalCanvasView2 = this.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView2 = null;
        }
        int paintColor = globalCanvasView2.getPaintColor();
        GlobalCanvasView globalCanvasView3 = this.f8701j;
        if (globalCanvasView3 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView3 = null;
        }
        int mode = globalCanvasView3.getMode();
        View view2 = this.f8702k;
        if (view2 == null) {
            AbstractC9979u.m20312y("llDetail");
        } else {
            view = view2;
        }
        return new C6142b(zIsSelected, paintSize, paintColor, mode, view.getVisibility() == 0);
    }

    /* renamed from: o */
    public static final void m6541o(SimpleCanvasLayout simpleCanvasLayout, View view) {
        GlobalCanvasView globalCanvasView = simpleCanvasLayout.f8701j;
        GlobalCanvasView globalCanvasView2 = null;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.setMode(2);
        ImageView imageView = simpleCanvasLayout.f8697f;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivPencil");
            imageView = null;
        }
        imageView.setSelected(false);
        ImageView imageView2 = simpleCanvasLayout.f8698g;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivEraser");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        ImageView imageView3 = simpleCanvasLayout.f8700i;
        if (imageView3 == null) {
            AbstractC9979u.m20312y("ivScale");
            imageView3 = null;
        }
        imageView3.setSelected(true);
        View view2 = simpleCanvasLayout.f8702k;
        if (view2 == null) {
            AbstractC9979u.m20312y("llDetail");
            view2 = null;
        }
        view2.setVisibility(8);
        GlobalCanvasView globalCanvasView3 = simpleCanvasLayout.f8701j;
        if (globalCanvasView3 == null) {
            AbstractC9979u.m20312y("gcvPaint");
        } else {
            globalCanvasView2 = globalCanvasView3;
        }
        globalCanvasView2.setEnabled(true);
    }

    /* renamed from: p */
    public static final void m6542p(View view, TouchSwitchView touchSwitchView, View view2) {
        view.setVisibility(8);
        touchSwitchView.setCanTouch(true);
    }

    /* renamed from: q */
    public static final void m6543q(SimpleCanvasLayout simpleCanvasLayout, View view) {
        view.setSelected(!view.isSelected());
        simpleCanvasLayout.f8696e = view.isSelected();
        ((TouchSwitchView) simpleCanvasLayout.findViewById(R$id.fm_view)).setCanTouch(simpleCanvasLayout.f8696e);
    }

    /* renamed from: r */
    public static final void m6544r(SimpleCanvasLayout simpleCanvasLayout, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        PaintColorAdapter paintColorAdapter = simpleCanvasLayout.f8695d;
        PaintColorAdapter paintColorAdapter2 = null;
        if (paintColorAdapter == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter = null;
        }
        PaintColorEntity paintColorEntity = paintColorAdapter.getData().get(i10);
        PaintColorAdapter paintColorAdapter3 = simpleCanvasLayout.f8695d;
        if (paintColorAdapter3 == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter3 = null;
        }
        for (PaintColorEntity paintColorEntity2 : paintColorAdapter3.getData()) {
            paintColorEntity2.setSelected(false);
            if (paintColorEntity2.getColor() == paintColorEntity.getColor()) {
                paintColorEntity2.setSelected(true);
            }
        }
        GlobalCanvasView globalCanvasView = simpleCanvasLayout.f8701j;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.setPaintColor(paintColorEntity.getColor());
        PaintColorAdapter paintColorAdapter4 = simpleCanvasLayout.f8695d;
        if (paintColorAdapter4 == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
        } else {
            paintColorAdapter2 = paintColorAdapter4;
        }
        paintColorAdapter2.notifyDataSetChanged();
    }

    /* renamed from: s */
    public static final void m6545s(SimpleCanvasLayout simpleCanvasLayout, TouchSwitchView touchSwitchView, View view, View view2) {
        GlobalCanvasView globalCanvasView = simpleCanvasLayout.f8701j;
        View view3 = null;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.m6854a();
        touchSwitchView.setCanTouch(true);
        View view4 = simpleCanvasLayout.f8702k;
        if (view4 == null) {
            AbstractC9979u.m20312y("llDetail");
        } else {
            view3 = view4;
        }
        view3.setVisibility(8);
        view.setVisibility(8);
    }

    /* renamed from: t */
    public static final void m6546t(SimpleCanvasLayout simpleCanvasLayout, View view) {
        InterfaceC9529a interfaceC9529a = simpleCanvasLayout.f8707p;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
        simpleCanvasLayout.m6553A();
    }

    /* renamed from: u */
    public static final void m6547u(View view, TouchSwitchView touchSwitchView, View view2) {
        view.setVisibility(0);
        touchSwitchView.setCanTouch(false);
    }

    /* renamed from: v */
    public static final void m6548v(SimpleCanvasLayout simpleCanvasLayout, View view) {
        GlobalCanvasView globalCanvasView = simpleCanvasLayout.f8701j;
        GlobalCanvasView globalCanvasView2 = null;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.setMode(1);
        ImageView imageView = simpleCanvasLayout.f8697f;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivPencil");
            imageView = null;
        }
        imageView.setSelected(false);
        ImageView imageView2 = simpleCanvasLayout.f8698g;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivEraser");
            imageView2 = null;
        }
        imageView2.setSelected(true);
        View view2 = simpleCanvasLayout.f8702k;
        if (view2 == null) {
            AbstractC9979u.m20312y("llDetail");
            view2 = null;
        }
        view2.setVisibility(8);
        ImageView imageView3 = simpleCanvasLayout.f8700i;
        if (imageView3 == null) {
            AbstractC9979u.m20312y("ivScale");
            imageView3 = null;
        }
        imageView3.setSelected(false);
        GlobalCanvasView globalCanvasView3 = simpleCanvasLayout.f8701j;
        if (globalCanvasView3 == null) {
            AbstractC9979u.m20312y("gcvPaint");
        } else {
            globalCanvasView2 = globalCanvasView3;
        }
        globalCanvasView2.setEnabled(true);
    }

    /* renamed from: w */
    public static final void m6549w(SimpleCanvasLayout simpleCanvasLayout, View view) {
        GlobalCanvasView globalCanvasView = simpleCanvasLayout.f8701j;
        View view2 = null;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.setMode(0);
        ImageView imageView = simpleCanvasLayout.f8697f;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivPencil");
            imageView = null;
        }
        imageView.setSelected(true);
        ImageView imageView2 = simpleCanvasLayout.f8698g;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivEraser");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        ImageView imageView3 = simpleCanvasLayout.f8700i;
        if (imageView3 == null) {
            AbstractC9979u.m20312y("ivScale");
            imageView3 = null;
        }
        imageView3.setSelected(false);
        GlobalCanvasView globalCanvasView2 = simpleCanvasLayout.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView2 = null;
        }
        globalCanvasView2.setEnabled(true);
        View view3 = simpleCanvasLayout.f8702k;
        if (view3 == null) {
            AbstractC9979u.m20312y("llDetail");
            view3 = null;
        }
        if (view3.getVisibility() != 0) {
            View view4 = simpleCanvasLayout.f8702k;
            if (view4 == null) {
                AbstractC9979u.m20312y("llDetail");
            } else {
                view2 = view4;
            }
            view2.setVisibility(0);
            return;
        }
        View view5 = simpleCanvasLayout.f8702k;
        if (view5 == null) {
            AbstractC9979u.m20312y("llDetail");
        } else {
            view2 = view5;
        }
        view2.setVisibility(8);
    }

    /* renamed from: x */
    public static final void m6550x(SimpleCanvasLayout simpleCanvasLayout, View view) {
        view.setSelected(true);
        ImageView imageView = simpleCanvasLayout.f8705n;
        GlobalCanvasView globalCanvasView = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivLevel2");
            imageView = null;
        }
        imageView.setSelected(false);
        ImageView imageView2 = simpleCanvasLayout.f8706o;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivLevel3");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        GlobalCanvasView globalCanvasView2 = simpleCanvasLayout.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
        } else {
            globalCanvasView = globalCanvasView2;
        }
        globalCanvasView.setPaintSize(3.0f);
    }

    /* renamed from: y */
    public static final void m6551y(SimpleCanvasLayout simpleCanvasLayout, View view) {
        view.setSelected(true);
        ImageView imageView = simpleCanvasLayout.f8704m;
        GlobalCanvasView globalCanvasView = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivLevel1");
            imageView = null;
        }
        imageView.setSelected(false);
        ImageView imageView2 = simpleCanvasLayout.f8706o;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivLevel3");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        GlobalCanvasView globalCanvasView2 = simpleCanvasLayout.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
        } else {
            globalCanvasView = globalCanvasView2;
        }
        globalCanvasView.setPaintSize(8.0f);
    }

    /* renamed from: z */
    public static final void m6552z(SimpleCanvasLayout simpleCanvasLayout, View view) {
        view.setSelected(true);
        ImageView imageView = simpleCanvasLayout.f8705n;
        GlobalCanvasView globalCanvasView = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivLevel2");
            imageView = null;
        }
        imageView.setSelected(false);
        ImageView imageView2 = simpleCanvasLayout.f8704m;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivLevel1");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        GlobalCanvasView globalCanvasView2 = simpleCanvasLayout.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
        } else {
            globalCanvasView = globalCanvasView2;
        }
        globalCanvasView.setPaintSize(15.0f);
    }

    /* renamed from: A */
    public final void m6553A() {
        ImageView imageView = this.f8699h;
        View view = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivFinger");
            imageView = null;
        }
        boolean zIsSelected = imageView.isSelected();
        GlobalCanvasView globalCanvasView = this.f8701j;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        float paintSize = globalCanvasView.getPaintSize();
        GlobalCanvasView globalCanvasView2 = this.f8701j;
        if (globalCanvasView2 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView2 = null;
        }
        int paintColor = globalCanvasView2.getPaintColor();
        GlobalCanvasView globalCanvasView3 = this.f8701j;
        if (globalCanvasView3 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView3 = null;
        }
        int mode = globalCanvasView3.getMode();
        View view2 = this.f8702k;
        if (view2 == null) {
            AbstractC9979u.m20312y("llDetail");
        } else {
            view = view2;
        }
        CacheMemoryStaticUtils.put("SimpleCanvasFingerMode", new C6142b(zIsSelected, paintSize, paintColor, mode, view.getVisibility() == 0));
    }

    /* renamed from: B */
    public final void m6554B() {
        C6142b gcvPaintEntity = getGcvPaintEntity();
        ImageView imageView = this.f8699h;
        View view = null;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivFinger");
            imageView = null;
        }
        imageView.setSelected(gcvPaintEntity.m6556a());
        ImageView imageView2 = this.f8699h;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivFinger");
            imageView2 = null;
        }
        this.f8696e = imageView2.isSelected();
        ((TouchSwitchView) findViewById(R$id.fm_view)).setCanTouch(this.f8696e);
        float fM6559d = gcvPaintEntity.m6559d();
        if (fM6559d == 3.0f) {
            ImageView imageView3 = this.f8704m;
            if (imageView3 == null) {
                AbstractC9979u.m20312y("ivLevel1");
                imageView3 = null;
            }
            imageView3.setSelected(true);
            ImageView imageView4 = this.f8705n;
            if (imageView4 == null) {
                AbstractC9979u.m20312y("ivLevel2");
                imageView4 = null;
            }
            imageView4.setSelected(false);
            ImageView imageView5 = this.f8706o;
            if (imageView5 == null) {
                AbstractC9979u.m20312y("ivLevel3");
                imageView5 = null;
            }
            imageView5.setSelected(false);
        } else if (fM6559d == 8.0f) {
            ImageView imageView6 = this.f8705n;
            if (imageView6 == null) {
                AbstractC9979u.m20312y("ivLevel2");
                imageView6 = null;
            }
            imageView6.setSelected(true);
            ImageView imageView7 = this.f8704m;
            if (imageView7 == null) {
                AbstractC9979u.m20312y("ivLevel1");
                imageView7 = null;
            }
            imageView7.setSelected(false);
            ImageView imageView8 = this.f8706o;
            if (imageView8 == null) {
                AbstractC9979u.m20312y("ivLevel3");
                imageView8 = null;
            }
            imageView8.setSelected(false);
        } else if (fM6559d == 15.0f) {
            ImageView imageView9 = this.f8706o;
            if (imageView9 == null) {
                AbstractC9979u.m20312y("ivLevel3");
                imageView9 = null;
            }
            imageView9.setSelected(true);
            ImageView imageView10 = this.f8705n;
            if (imageView10 == null) {
                AbstractC9979u.m20312y("ivLevel2");
                imageView10 = null;
            }
            imageView10.setSelected(false);
            ImageView imageView11 = this.f8704m;
            if (imageView11 == null) {
                AbstractC9979u.m20312y("ivLevel1");
                imageView11 = null;
            }
            imageView11.setSelected(false);
        }
        GlobalCanvasView globalCanvasView = this.f8701j;
        if (globalCanvasView == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView = null;
        }
        globalCanvasView.setPaintSize(gcvPaintEntity.m6559d());
        PaintColorAdapter paintColorAdapter = this.f8695d;
        if (paintColorAdapter == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter = null;
        }
        for (PaintColorEntity paintColorEntity : paintColorAdapter.getData()) {
            paintColorEntity.setSelected(false);
            if (paintColorEntity.getColor() == gcvPaintEntity.m6558c()) {
                paintColorEntity.setSelected(true);
                GlobalCanvasView globalCanvasView2 = this.f8701j;
                if (globalCanvasView2 == null) {
                    AbstractC9979u.m20312y("gcvPaint");
                    globalCanvasView2 = null;
                }
                globalCanvasView2.setPaintColor(gcvPaintEntity.m6558c());
            }
        }
        PaintColorAdapter paintColorAdapter2 = this.f8695d;
        if (paintColorAdapter2 == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter2 = null;
        }
        paintColorAdapter2.notifyDataSetChanged();
        GlobalCanvasView globalCanvasView3 = this.f8701j;
        if (globalCanvasView3 == null) {
            AbstractC9979u.m20312y("gcvPaint");
            globalCanvasView3 = null;
        }
        globalCanvasView3.setEnabled(true);
        int iM6557b = gcvPaintEntity.m6557b();
        if (iM6557b == 0) {
            ImageView imageView12 = this.f8697f;
            if (imageView12 == null) {
                AbstractC9979u.m20312y("ivPencil");
                imageView12 = null;
            }
            if (!imageView12.isSelected()) {
                GlobalCanvasView globalCanvasView4 = this.f8701j;
                if (globalCanvasView4 == null) {
                    AbstractC9979u.m20312y("gcvPaint");
                    globalCanvasView4 = null;
                }
                globalCanvasView4.setMode(0);
                ImageView imageView13 = this.f8697f;
                if (imageView13 == null) {
                    AbstractC9979u.m20312y("ivPencil");
                    imageView13 = null;
                }
                imageView13.setSelected(true);
                ImageView imageView14 = this.f8698g;
                if (imageView14 == null) {
                    AbstractC9979u.m20312y("ivEraser");
                    imageView14 = null;
                }
                imageView14.setSelected(false);
                ImageView imageView15 = this.f8700i;
                if (imageView15 == null) {
                    AbstractC9979u.m20312y("ivScale");
                    imageView15 = null;
                }
                imageView15.setSelected(false);
            }
        } else if (iM6557b == 1) {
            GlobalCanvasView globalCanvasView5 = this.f8701j;
            if (globalCanvasView5 == null) {
                AbstractC9979u.m20312y("gcvPaint");
                globalCanvasView5 = null;
            }
            globalCanvasView5.setMode(1);
            ImageView imageView16 = this.f8697f;
            if (imageView16 == null) {
                AbstractC9979u.m20312y("ivPencil");
                imageView16 = null;
            }
            imageView16.setSelected(false);
            ImageView imageView17 = this.f8698g;
            if (imageView17 == null) {
                AbstractC9979u.m20312y("ivEraser");
                imageView17 = null;
            }
            imageView17.setSelected(true);
            ImageView imageView18 = this.f8700i;
            if (imageView18 == null) {
                AbstractC9979u.m20312y("ivScale");
                imageView18 = null;
            }
            imageView18.setSelected(false);
        } else if (iM6557b == 2) {
            GlobalCanvasView globalCanvasView6 = this.f8701j;
            if (globalCanvasView6 == null) {
                AbstractC9979u.m20312y("gcvPaint");
                globalCanvasView6 = null;
            }
            globalCanvasView6.setMode(2);
            ImageView imageView19 = this.f8697f;
            if (imageView19 == null) {
                AbstractC9979u.m20312y("ivPencil");
                imageView19 = null;
            }
            imageView19.setSelected(false);
            ImageView imageView20 = this.f8698g;
            if (imageView20 == null) {
                AbstractC9979u.m20312y("ivEraser");
                imageView20 = null;
            }
            imageView20.setSelected(false);
            ImageView imageView21 = this.f8700i;
            if (imageView21 == null) {
                AbstractC9979u.m20312y("ivScale");
                imageView21 = null;
            }
            imageView21.setSelected(true);
        }
        View view2 = this.f8702k;
        if (view2 == null) {
            AbstractC9979u.m20312y("llDetail");
        } else {
            view = view2;
        }
        view.setVisibility(gcvPaintEntity.m6560e() ? 0 : 8);
    }

    /* renamed from: n */
    public final void m6555n() {
        addView(View.inflate(getContext(), R$layout.layout_simple_canvas, null));
        View viewFindViewById = findViewById(R$id.iv_picture);
        AbstractC9979u.m20293f(viewFindViewById, "findViewById(...)");
        this.f8703l = (PhotoView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.gcv_paint);
        AbstractC9979u.m20293f(viewFindViewById2, "findViewById(...)");
        this.f8701j = (GlobalCanvasView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_pencil);
        AbstractC9979u.m20293f(viewFindViewById3, "findViewById(...)");
        this.f8697f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.iv_scale);
        AbstractC9979u.m20293f(viewFindViewById4, "findViewById(...)");
        this.f8700i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.iv_eraser);
        AbstractC9979u.m20293f(viewFindViewById5, "findViewById(...)");
        this.f8698g = (ImageView) viewFindViewById5;
        ImageView imageView = (ImageView) findViewById(R$id.iv_delete);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_close_simple_canvas);
        View viewFindViewById6 = findViewById(R$id.iv_finger);
        AbstractC9979u.m20293f(viewFindViewById6, "findViewById(...)");
        this.f8699h = (ImageView) viewFindViewById6;
        Button button = (Button) findViewById(R$id.mBtnNegative);
        Button button2 = (Button) findViewById(R$id.mBtnPositive);
        final View viewFindViewById7 = findViewById(R$id.layout_confirm);
        final TouchSwitchView touchSwitchView = (TouchSwitchView) findViewById(R$id.cl_content);
        View viewFindViewById8 = findViewById(R$id.iv_level1);
        AbstractC9979u.m20293f(viewFindViewById8, "findViewById(...)");
        this.f8704m = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.iv_level2);
        AbstractC9979u.m20293f(viewFindViewById9, "findViewById(...)");
        this.f8705n = (ImageView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.iv_level3);
        AbstractC9979u.m20293f(viewFindViewById10, "findViewById(...)");
        this.f8706o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.ll_detail);
        AbstractC9979u.m20293f(viewFindViewById11, "findViewById(...)");
        this.f8702k = viewFindViewById11;
        ImageView imageView3 = this.f8697f;
        if (imageView3 == null) {
            AbstractC9979u.m20312y("ivPencil");
            imageView3 = null;
        }
        imageView3.setSelected(true);
        ImageView imageView4 = this.f8704m;
        if (imageView4 == null) {
            AbstractC9979u.m20312y("ivLevel1");
            imageView4 = null;
        }
        imageView4.setSelected(true);
        touchSwitchView.setCanTouch(true);
        ImageView imageView5 = this.f8700i;
        if (imageView5 == null) {
            AbstractC9979u.m20312y("ivScale");
            imageView5 = null;
        }
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: e3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6541o(this.f21246c, view);
            }
        });
        if (this.f8694c) {
            ImageView imageView6 = this.f8700i;
            if (imageView6 == null) {
                AbstractC9979u.m20312y("ivScale");
                imageView6 = null;
            }
            imageView6.setVisibility(0);
        } else {
            ImageView imageView7 = this.f8700i;
            if (imageView7 == null) {
                AbstractC9979u.m20312y("ivScale");
                imageView7 = null;
            }
            imageView7.setVisibility(8);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: e3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6542p(viewFindViewById7, touchSwitchView, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: e3.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6545s(this.f21253c, touchSwitchView, viewFindViewById7, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: e3.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6546t(this.f21256c, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: e3.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6547u(viewFindViewById7, touchSwitchView, view);
            }
        });
        ImageView imageView8 = this.f8698g;
        if (imageView8 == null) {
            AbstractC9979u.m20312y("ivEraser");
            imageView8 = null;
        }
        imageView8.setOnClickListener(new View.OnClickListener() { // from class: e3.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6548v(this.f21259c, view);
            }
        });
        ImageView imageView9 = this.f8697f;
        if (imageView9 == null) {
            AbstractC9979u.m20312y("ivPencil");
            imageView9 = null;
        }
        imageView9.setOnClickListener(new View.OnClickListener() { // from class: e3.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6549w(this.f21260c, view);
            }
        });
        ImageView imageView10 = this.f8704m;
        if (imageView10 == null) {
            AbstractC9979u.m20312y("ivLevel1");
            imageView10 = null;
        }
        imageView10.setOnClickListener(new View.OnClickListener() { // from class: e3.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6550x(this.f21261c, view);
            }
        });
        ImageView imageView11 = this.f8705n;
        if (imageView11 == null) {
            AbstractC9979u.m20312y("ivLevel2");
            imageView11 = null;
        }
        imageView11.setOnClickListener(new View.OnClickListener() { // from class: e3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6551y(this.f21247c, view);
            }
        });
        ImageView imageView12 = this.f8706o;
        if (imageView12 == null) {
            AbstractC9979u.m20312y("ivLevel3");
            imageView12 = null;
        }
        imageView12.setOnClickListener(new View.OnClickListener() { // from class: e3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6552z(this.f21248c, view);
            }
        });
        ImageView imageView13 = this.f8699h;
        if (imageView13 == null) {
            AbstractC9979u.m20312y("ivFinger");
            imageView13 = null;
        }
        imageView13.setOnClickListener(new View.OnClickListener() { // from class: e3.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleCanvasLayout.m6543q(this.f21249c, view);
            }
        });
        final RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_paint_color);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$initView$12$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = (int) recyclerView.getResources().getDimension(R$dimen.view_5);
            }
        });
        PaintColorAdapter paintColorAdapter = new PaintColorAdapter(R$layout.item_paint_color);
        this.f8695d = paintColorAdapter;
        recyclerView.setAdapter(paintColorAdapter);
        PaintColorAdapter paintColorAdapter2 = this.f8695d;
        if (paintColorAdapter2 == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter2 = null;
        }
        paintColorAdapter2.setOnItemClickListener(new InterfaceC10427d() { // from class: e3.g
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                SimpleCanvasLayout.m6544r(this.f21250a, baseQuickAdapter, view, i10);
            }
        });
        PaintColorAdapter paintColorAdapter3 = this.f8695d;
        if (paintColorAdapter3 == null) {
            AbstractC9979u.m20312y("paintColorAdapter");
            paintColorAdapter3 = null;
        }
        ArrayList arrayListM24129g = AbstractC10978w.m24129g(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#FF4931")), Integer.valueOf(Color.parseColor("#FFB82E")), Integer.valueOf(Color.parseColor("#40CA00")), Integer.valueOf(Color.parseColor("#6581FF")), Integer.valueOf(Color.parseColor("#C649FF")));
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(arrayListM24129g, 10));
        int size = arrayListM24129g.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM24129g.get(i10);
            i10++;
            int iIntValue = ((Number) obj).intValue();
            arrayList.add(iIntValue == Color.parseColor("#FF4931") ? new PaintColorEntity(iIntValue, true) : new PaintColorEntity(iIntValue, false, 2, null));
        }
        paintColorAdapter3.setList(AbstractC10947g0.m23925a1(arrayList));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6554B();
    }

    public final void setImage(String str) {
        if (str != null) {
            PhotoView photoView = this.f8703l;
            PhotoView photoView2 = null;
            if (photoView == null) {
                AbstractC9979u.m20312y("image");
                photoView = null;
            }
            photoView.setBackgroundColor(-1);
            if (!FileUtils.isFileExists(str)) {
                AbstractC11117h.m24726d(AbstractC10006d.m20745b(), null, null, new SimpleCanvasLayout$setImage$1$1(str, this, null), 3, null);
                return;
            }
            C5815g c5815gM4016t = ComponentCallbacks2C5810b.m3946t(getContext()).m4016t(str);
            PhotoView photoView3 = this.f8703l;
            if (photoView3 == null) {
                AbstractC9979u.m20312y("image");
            } else {
                photoView2 = photoView3;
            }
            AbstractC9979u.m20291d(c5815gM4016t.m3981A0(photoView2));
        }
    }

    public final void setOnClose(InterfaceC9529a interfaceC9529a) {
        this.f8707p = interfaceC9529a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleCanvasLayout(Context context, boolean z10) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f8694c = z10;
        m6555n();
    }
}
