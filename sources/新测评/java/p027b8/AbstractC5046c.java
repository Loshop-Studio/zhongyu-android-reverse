package p027b8;

import android.graphics.Color;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.ClickUtils;
import com.zykj.view.board.board.AbstractC7229p;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC5046c {

    /* renamed from: b8.c$a */
    public static final class a implements SketchProgressView.InterfaceC7272b {

        /* renamed from: a */
        public final /* synthetic */ Function0 f2583a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f2584b;

        /* renamed from: c */
        public final /* synthetic */ Function1 f2585c;

        public a(Function0 function0, Function1 function1, Function1 function12) {
            this.f2583a = function0;
            this.f2584b = function1;
            this.f2585c = function12;
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: a */
        public void mo2533a(float f10) {
            this.f2585c.invoke(Float.valueOf(f10));
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: b */
        public void mo2534b() {
            this.f2583a.invoke();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        public void onProgress(float f10) {
            this.f2584b.invoke(Float.valueOf(f10));
        }
    }

    /* renamed from: a */
    public static final void m2525a(RadioGroup radioGroup, int i10) {
        Intrinsics.checkNotNullParameter(radioGroup, "<this>");
        View childAt = radioGroup.getChildAt(i10);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    /* renamed from: b */
    public static final void m2526b(CustomColorRadioButton customColorRadioButton, String str) {
        Intrinsics.checkNotNullParameter(customColorRadioButton, "<this>");
        customColorRadioButton.setColor(str != null ? Color.parseColor(str) : 0);
    }

    /* renamed from: c */
    public static final void m2527c(CustomColorFrameLayout customColorFrameLayout, Boolean bool) {
        Intrinsics.checkNotNullParameter(customColorFrameLayout, "<this>");
        customColorFrameLayout.setBackgroundLight(bool != null ? bool.booleanValue() : true);
    }

    /* renamed from: d */
    public static final void m2528d(SketchProgressView sketchProgressView, Function0 onTouchStart, Function1 onProgress, Function1 onTouchEnd) {
        Intrinsics.checkNotNullParameter(sketchProgressView, "<this>");
        Intrinsics.checkNotNullParameter(onTouchStart, "onTouchStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onTouchEnd, "onTouchEnd");
        sketchProgressView.setProgressListener(new a(onTouchStart, onProgress, onTouchEnd));
    }

    /* renamed from: e */
    public static final void m2529e(View view, long j10, View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ClickUtils.applySingleDebouncing(view, j10, listener);
    }

    /* renamed from: f */
    public static /* synthetic */ void m2530f(View view, long j10, View.OnClickListener onClickListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        m2529e(view, j10, onClickListener);
    }

    /* renamed from: g */
    public static final AbstractC7229p m2531g(int i10) {
        AbstractC7229p.a aVar = AbstractC7229p.a.f11084c;
        if (i10 == aVar.m11021a()) {
            return aVar;
        }
        AbstractC7229p.d dVar = AbstractC7229p.d.f11086c;
        if (i10 == dVar.m11021a()) {
            return dVar;
        }
        AbstractC7229p.c cVar = AbstractC7229p.c.f11085c;
        if (i10 == cVar.m11021a()) {
            return cVar;
        }
        if (!C5045b.f2579a.m2522b(i10)) {
            i10 = 0;
        }
        return new AbstractC7229p.b(i10);
    }

    /* renamed from: h */
    public static final int m2532h(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }
}
