package p181m7;

import android.graphics.Color;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.ClickUtils;
import com.zykj.view.board.board.AbstractC7678u;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9026c {

    /* renamed from: m7.c$a */
    public static final class a implements SketchProgressView.InterfaceC7728b {

        /* renamed from: a */
        public final /* synthetic */ Function0 f15181a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f15182b;

        /* renamed from: c */
        public final /* synthetic */ Function1 f15183c;

        public a(Function0 function0, Function1 function1, Function1 function12) {
            this.f15181a = function0;
            this.f15182b = function1;
            this.f15183c = function12;
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: a */
        public void mo11756a(float f10) {
            this.f15183c.invoke(Float.valueOf(f10));
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: b */
        public void mo11757b() {
            this.f15181a.invoke();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        public void onProgress(float f10) {
            this.f15182b.invoke(Float.valueOf(f10));
        }
    }

    /* renamed from: a */
    public static final void m14388a(RadioGroup radioGroup, int i9) {
        Intrinsics.checkNotNullParameter(radioGroup, "<this>");
        View childAt = radioGroup.getChildAt(i9);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    /* renamed from: b */
    public static final void m14389b(CustomColorRadioButton customColorRadioButton, String str) {
        Intrinsics.checkNotNullParameter(customColorRadioButton, "<this>");
        customColorRadioButton.setColor(str != null ? Color.parseColor(str) : 0);
    }

    /* renamed from: c */
    public static final void m14390c(CustomColorFrameLayout customColorFrameLayout, Boolean bool) {
        Intrinsics.checkNotNullParameter(customColorFrameLayout, "<this>");
        customColorFrameLayout.setBackgroundLight(bool != null ? bool.booleanValue() : true);
    }

    /* renamed from: d */
    public static final void m14391d(SketchProgressView sketchProgressView, Function0 onTouchStart, Function1 onProgress, Function1 onTouchEnd) {
        Intrinsics.checkNotNullParameter(sketchProgressView, "<this>");
        Intrinsics.checkNotNullParameter(onTouchStart, "onTouchStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onTouchEnd, "onTouchEnd");
        sketchProgressView.setProgressListener(new a(onTouchStart, onProgress, onTouchEnd));
    }

    /* renamed from: e */
    public static final void m14392e(View view, long j9, View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ClickUtils.applySingleDebouncing(view, j9, listener);
    }

    /* renamed from: f */
    public static /* synthetic */ void m14393f(View view, long j9, View.OnClickListener onClickListener, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = 500;
        }
        m14392e(view, j9, onClickListener);
    }

    /* renamed from: g */
    public static final AbstractC7678u m14394g(int i9) {
        AbstractC7678u.a aVar = AbstractC7678u.a.f12303c;
        if (i9 == aVar.m11451a()) {
            return aVar;
        }
        AbstractC7678u.d dVar = AbstractC7678u.d.f12305c;
        if (i9 == dVar.m11451a()) {
            return dVar;
        }
        AbstractC7678u.c cVar = AbstractC7678u.c.f12304c;
        if (i9 == cVar.m11451a()) {
            return cVar;
        }
        if (!C9025b.f15177a.m14385b(i9)) {
            i9 = 0;
        }
        return new AbstractC7678u.b(i9);
    }

    /* renamed from: h */
    public static final int m14395h(int i9, float f10) {
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }
}
