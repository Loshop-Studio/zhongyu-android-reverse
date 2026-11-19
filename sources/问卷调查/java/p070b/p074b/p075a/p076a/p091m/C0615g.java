package p070b.p074b.p075a.p076a.p091m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.List;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p060o.p061b.C0393p;

/* renamed from: b.b.a.a.m.g */
/* loaded from: classes.dex */
public final class C0615g<S> extends AbstractC0632x<S> {

    /* renamed from: g0 */
    public static final /* synthetic */ int f3738g0 = 0;

    /* renamed from: W */
    public int f3739W;

    /* renamed from: X */
    public InterfaceC0612d<S> f3740X;

    /* renamed from: Y */
    public C0606a f3741Y;

    /* renamed from: Z */
    public C0627s f3742Z;

    /* renamed from: a0 */
    public e f3743a0;

    /* renamed from: b0 */
    public C0610c f3744b0;

    /* renamed from: c0 */
    public RecyclerView f3745c0;

    /* renamed from: d0 */
    public RecyclerView f3746d0;

    /* renamed from: e0 */
    public View f3747e0;

    /* renamed from: f0 */
    public View f3748f0;

    /* renamed from: b.b.a.a.m.g$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f3749b;

        public a(int i) {
            this.f3749b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0615g.this.f3746d0.m1870m0(this.f3749b);
        }
    }

    /* renamed from: b.b.a.a.m.g$b */
    public class b extends C0243a {
        public b(C0615g c0615g) {
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
            c0245b.m824i(null);
        }
    }

    /* renamed from: b.b.a.a.m.g$c */
    public class c extends C0633y {

        /* renamed from: G */
        public final /* synthetic */ int f3751G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f3751G = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: a1 */
        public void mo1780a1(RecyclerView.C0549w c0549w, int[] iArr) {
            if (this.f3751G == 0) {
                iArr[0] = C0615g.this.f3746d0.getWidth();
                iArr[1] = C0615g.this.f3746d0.getWidth();
            } else {
                iArr[0] = C0615g.this.f3746d0.getHeight();
                iArr[1] = C0615g.this.f3746d0.getHeight();
            }
        }
    }

    /* renamed from: b.b.a.a.m.g$d */
    public class d implements f {
        public d() {
        }
    }

    /* renamed from: b.b.a.a.m.g$e */
    public enum e {
        DAY,
        YEAR
    }

    /* renamed from: b.b.a.a.m.g$f */
    public interface f {
    }

    /* renamed from: A0 */
    public void m2194A0(e eVar) {
        this.f3743a0 = eVar;
        if (eVar == e.YEAR) {
            this.f3745c0.getLayoutManager().mo1775N0(((C0611c0) this.f3745c0.getAdapter()).m2185e(this.f3742Z.f3797e));
            this.f3747e0.setVisibility(0);
            this.f3748f0.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.f3747e0.setVisibility(8);
            this.f3748f0.setVisibility(0);
            m2197z0(this.f3742Z);
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: M */
    public void mo1114M(Bundle bundle) {
        super.mo1114M(bundle);
        if (bundle == null) {
            bundle = this.f1983h;
        }
        this.f3739W = bundle.getInt("THEME_RES_ID_KEY");
        this.f3740X = (InterfaceC0612d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f3741Y = (C0606a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3742Z = (C0627s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: P */
    public View mo1143P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        C0393p c0393p;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1164k(), this.f3739W);
        this.f3744b0 = new C0610c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0627s c0627s = this.f3741Y.f3702b;
        if (C0623o.m2199B0(contextThemeWrapper)) {
            i = C1088R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C1088R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(C1088R.id.mtrl_calendar_days_of_week);
        C0266o.m875n(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new C0614f());
        gridView.setNumColumns(c0627s.f3798f);
        gridView.setEnabled(false);
        this.f3746d0 = (RecyclerView) viewInflate.findViewById(C1088R.id.mtrl_calendar_months);
        this.f3746d0.setLayoutManager(new c(m1164k(), i2, false, i2));
        this.f3746d0.setTag("MONTHS_VIEW_GROUP_TAG");
        C0630v c0630v = new C0630v(contextThemeWrapper, this.f3740X, this.f3741Y, new d());
        this.f3746d0.setAdapter(c0630v);
        int integer = contextThemeWrapper.getResources().getInteger(C1088R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(C1088R.id.mtrl_calendar_year_selector_frame);
        this.f3745c0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3745c0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f3745c0.setAdapter(new C0611c0(this));
            this.f3745c0.m1858g(new C0616h(this));
        }
        if (viewInflate.findViewById(C1088R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(C1088R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C0266o.m875n(materialButton, new C0617i(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(C1088R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(C1088R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f3747e0 = viewInflate.findViewById(C1088R.id.mtrl_calendar_year_selector_frame);
            this.f3748f0 = viewInflate.findViewById(C1088R.id.mtrl_calendar_day_selector_frame);
            m2194A0(e.DAY);
            materialButton.setText(this.f3742Z.f3795c);
            this.f3746d0.m1860h(new C0618j(this, c0630v, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0619k(this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC0620l(this, c0630v));
            materialButton2.setOnClickListener(new ViewOnClickListenerC0621m(this, c0630v));
        }
        if (!C0623o.m2199B0(contextThemeWrapper) && (recyclerView2 = (c0393p = new C0393p()).f2348a) != (recyclerView = this.f3746d0)) {
            if (recyclerView2 != null) {
                RecyclerView.AbstractC0542p abstractC0542p = c0393p.f2350c;
                List<RecyclerView.AbstractC0542p> list = recyclerView2.f3302h0;
                if (list != null) {
                    list.remove(abstractC0542p);
                }
                c0393p.f2348a.setOnFlingListener(null);
            }
            c0393p.f2348a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0393p.f2348a.m1860h(c0393p.f2350c);
                c0393p.f2348a.setOnFlingListener(c0393p);
                c0393p.f2349b = new Scroller(c0393p.f2348a.getContext(), new DecelerateInterpolator());
                c0393p.m1417c();
            }
        }
        this.f3746d0.m1863i0(c0630v.m2216f(this.f3742Z));
        return viewInflate;
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: b0 */
    public void mo1119b0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3739W);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3740X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3741Y);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3742Z);
    }

    /* renamed from: x0 */
    public LinearLayoutManager m2195x0() {
        return (LinearLayoutManager) this.f3746d0.getLayoutManager();
    }

    /* renamed from: y0 */
    public final void m2196y0(int i) {
        this.f3746d0.post(new a(i));
    }

    /* renamed from: z0 */
    public void m2197z0(C0627s c0627s) {
        RecyclerView recyclerView;
        int i;
        C0630v c0630v = (C0630v) this.f3746d0.getAdapter();
        int iM2211s = c0630v.f3808c.f3702b.m2211s(c0627s);
        int iM2216f = iM2211s - c0630v.m2216f(this.f3742Z);
        boolean z = Math.abs(iM2216f) > 3;
        boolean z2 = iM2216f > 0;
        this.f3742Z = c0627s;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f3746d0;
                i = iM2211s + 3;
            }
            m2196y0(iM2211s);
        }
        recyclerView = this.f3746d0;
        i = iM2211s - 3;
        recyclerView.m1863i0(i);
        m2196y0(iM2211s);
    }
}
