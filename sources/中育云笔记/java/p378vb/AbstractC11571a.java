package p378vb;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.ClickUtils;
import com.zykj.view.widget.SketchProgressView;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: vb.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11571a {

    /* renamed from: vb.a$a */
    public static final class a implements SketchProgressView.InterfaceC8895b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9529a f27453a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9540l f27454b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f27455c;

        public a(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            this.f27453a = interfaceC9529a;
            this.f27454b = interfaceC9540l;
            this.f27455c = interfaceC9540l2;
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: a */
        public void mo17220a(float f10) {
            this.f27455c.invoke(Float.valueOf(f10));
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: b */
        public void mo17221b() {
            this.f27453a.invoke();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        public void onProgress(float f10) {
            this.f27454b.invoke(Float.valueOf(f10));
        }
    }

    /* renamed from: a */
    public static final void m25472a(RadioGroup radioGroup, int i10) {
        AbstractC9979u.m20294g(radioGroup, "<this>");
        View childAt = radioGroup.getChildAt(i10);
        AbstractC9979u.m20292e(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    /* renamed from: b */
    public static final void m25473b(SketchProgressView sketchProgressView, InterfaceC9529a onTouchStart, InterfaceC9540l onProgress, InterfaceC9540l onTouchEnd) {
        AbstractC9979u.m20294g(sketchProgressView, "<this>");
        AbstractC9979u.m20294g(onTouchStart, "onTouchStart");
        AbstractC9979u.m20294g(onProgress, "onProgress");
        AbstractC9979u.m20294g(onTouchEnd, "onTouchEnd");
        sketchProgressView.setProgressListener(new a(onTouchStart, onProgress, onTouchEnd));
    }

    /* renamed from: c */
    public static final void m25474c(View view, long j10, View.OnClickListener listener) {
        AbstractC9979u.m20294g(view, "<this>");
        AbstractC9979u.m20294g(listener, "listener");
        ClickUtils.applySingleDebouncing(view, j10, listener);
    }

    /* renamed from: d */
    public static /* synthetic */ void m25475d(View view, long j10, View.OnClickListener onClickListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        m25474c(view, j10, onClickListener);
    }

    /* renamed from: e */
    public static final int m25476e(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }
}
