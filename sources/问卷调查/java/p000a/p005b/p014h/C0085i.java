package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p014h.C0090k0;
import p000a.p031h.p035d.C0202a;

/* renamed from: a.b.h.i */
/* loaded from: classes.dex */
public final class C0085i {

    /* renamed from: b */
    public static final PorterDuff.Mode f675b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0085i f676c;

    /* renamed from: a */
    public C0090k0 f677a;

    /* renamed from: a.b.h.i$a */
    public class a implements C0090k0.f {

        /* renamed from: a */
        public final int[] f678a = {C1088R.drawable.abc_textfield_search_default_mtrl_alpha, C1088R.drawable.abc_textfield_default_mtrl_alpha, C1088R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f679b = {C1088R.drawable.abc_ic_commit_search_api_mtrl_alpha, C1088R.drawable.abc_seekbar_tick_mark_material, C1088R.drawable.abc_ic_menu_share_mtrl_alpha, C1088R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C1088R.drawable.abc_ic_menu_cut_mtrl_alpha, C1088R.drawable.abc_ic_menu_selectall_mtrl_alpha, C1088R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f680c = {C1088R.drawable.abc_textfield_activated_mtrl_alpha, C1088R.drawable.abc_textfield_search_activated_mtrl_alpha, C1088R.drawable.abc_cab_background_top_mtrl_alpha, C1088R.drawable.abc_text_cursor_material, C1088R.drawable.abc_text_select_handle_left_mtrl, C1088R.drawable.abc_text_select_handle_middle_mtrl, C1088R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f681d = {C1088R.drawable.abc_popup_background_mtrl_mult, C1088R.drawable.abc_cab_background_internal_bg, C1088R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f682e = {C1088R.drawable.abc_tab_indicator_material, C1088R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f683f = {C1088R.drawable.abc_btn_check_material, C1088R.drawable.abc_btn_radio_material, C1088R.drawable.abc_btn_check_material_anim, C1088R.drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public final boolean m339a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final ColorStateList m340b(Context context, int i) {
            int iM378c = C0100p0.m378c(context, C1088R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{C0100p0.f745b, C0100p0.f747d, C0100p0.f746c, C0100p0.f749f}, new int[]{C0100p0.m377b(context, C1088R.attr.colorButtonNormal), C0202a.m755a(iM378c, i), C0202a.m755a(iM378c, i), i});
        }

        /* renamed from: c */
        public final LayerDrawable m341c(C0090k0 c0090k0, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM356f = c0090k0.m356f(context, C1088R.drawable.abc_star_black_48dp);
            Drawable drawableM356f2 = c0090k0.m356f(context, C1088R.drawable.abc_star_half_black_48dp);
            if ((drawableM356f instanceof BitmapDrawable) && drawableM356f.getIntrinsicWidth() == dimensionPixelSize && drawableM356f.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM356f;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM356f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM356f.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM356f2 instanceof BitmapDrawable) && drawableM356f2.getIntrinsicWidth() == dimensionPixelSize && drawableM356f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM356f2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM356f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM356f2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: d */
        public ColorStateList m342d(Context context, int i) {
            if (i == C1088R.drawable.abc_edit_text_material) {
                ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
                return context.getColorStateList(C1088R.color.abc_tint_edittext);
            }
            if (i == C1088R.drawable.abc_switch_track_mtrl_alpha) {
                ThreadLocal<TypedValue> threadLocal2 = C0034a.f211a;
                return context.getColorStateList(C1088R.color.abc_tint_switch_track);
            }
            if (i == C1088R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListM379d = C0100p0.m379d(context, C1088R.attr.colorSwitchThumbNormal);
                if (colorStateListM379d == null || !colorStateListM379d.isStateful()) {
                    iArr[0] = C0100p0.f745b;
                    iArr2[0] = C0100p0.m377b(context, C1088R.attr.colorSwitchThumbNormal);
                    iArr[1] = C0100p0.f748e;
                    iArr2[1] = C0100p0.m378c(context, C1088R.attr.colorControlActivated);
                    iArr[2] = C0100p0.f749f;
                    iArr2[2] = C0100p0.m378c(context, C1088R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = C0100p0.f745b;
                    iArr2[0] = colorStateListM379d.getColorForState(iArr[0], 0);
                    iArr[1] = C0100p0.f748e;
                    iArr2[1] = C0100p0.m378c(context, C1088R.attr.colorControlActivated);
                    iArr[2] = C0100p0.f749f;
                    iArr2[2] = colorStateListM379d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == C1088R.drawable.abc_btn_default_mtrl_shape) {
                return m340b(context, C0100p0.m378c(context, C1088R.attr.colorButtonNormal));
            }
            if (i == C1088R.drawable.abc_btn_borderless_material) {
                return m340b(context, 0);
            }
            if (i == C1088R.drawable.abc_btn_colored_material) {
                return m340b(context, C0100p0.m378c(context, C1088R.attr.colorAccent));
            }
            if (i == C1088R.drawable.abc_spinner_mtrl_am_alpha || i == C1088R.drawable.abc_spinner_textfield_background_material) {
                ThreadLocal<TypedValue> threadLocal3 = C0034a.f211a;
                return context.getColorStateList(C1088R.color.abc_tint_spinner);
            }
            if (m339a(this.f679b, i)) {
                return C0100p0.m379d(context, C1088R.attr.colorControlNormal);
            }
            if (m339a(this.f682e, i)) {
                ThreadLocal<TypedValue> threadLocal4 = C0034a.f211a;
                return context.getColorStateList(C1088R.color.abc_tint_default);
            }
            if (m339a(this.f683f, i)) {
                ThreadLocal<TypedValue> threadLocal5 = C0034a.f211a;
                return context.getColorStateList(C1088R.color.abc_tint_btn_checkable);
            }
            if (i != C1088R.drawable.abc_seekbar_thumb_material) {
                return null;
            }
            ThreadLocal<TypedValue> threadLocal6 = C0034a.f211a;
            return context.getColorStateList(C1088R.color.abc_tint_seek_thumb);
        }

        /* renamed from: e */
        public final void m343e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0071b0.m282a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0085i.f675b;
            }
            drawable.setColorFilter(C0085i.m334c(i, mode));
        }
    }

    /* renamed from: a */
    public static synchronized C0085i m333a() {
        if (f676c == null) {
            m335e();
        }
        return f676c;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m334c(int i, PorterDuff.Mode mode) {
        return C0090k0.m350h(i, mode);
    }

    /* renamed from: e */
    public static synchronized void m335e() {
        if (f676c == null) {
            C0085i c0085i = new C0085i();
            f676c = c0085i;
            c0085i.f677a = C0090k0.m349d();
            C0090k0 c0090k0 = f676c.f677a;
            a aVar = new a();
            synchronized (c0090k0) {
                c0090k0.f704g = aVar;
            }
        }
    }

    /* renamed from: f */
    public static void m336f(Drawable drawable, C0106s0 c0106s0, int[] iArr) {
        PorterDuff.Mode mode = C0090k0.f695h;
        if (C0071b0.m282a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c0106s0.f789d;
        if (z || c0106s0.f788c) {
            PorterDuffColorFilter porterDuffColorFilterM350h = null;
            ColorStateList colorStateList = z ? c0106s0.f786a : null;
            PorterDuff.Mode mode2 = c0106s0.f788c ? c0106s0.f787b : C0090k0.f695h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM350h = C0090k0.m350h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM350h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: b */
    public synchronized Drawable m337b(Context context, int i) {
        return this.f677a.m356f(context, i);
    }

    /* renamed from: d */
    public synchronized ColorStateList m338d(Context context, int i) {
        return this.f677a.m358i(context, i);
    }
}
