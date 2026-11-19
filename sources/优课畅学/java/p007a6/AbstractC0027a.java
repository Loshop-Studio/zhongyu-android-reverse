package p007a6;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.view.widget.SketchProgressView;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: a6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC0027a {

    /* renamed from: a6.a$a */
    public static final class a implements SketchProgressView.InterfaceC8263b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10559a f74a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10570l f75b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10570l f76c;

        public a(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            this.f74a = interfaceC10559a;
            this.f75b = interfaceC10570l;
            this.f76c = interfaceC10570l2;
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: a */
        public void mo67a(float f10) {
            this.f76c.invoke(Float.valueOf(f10));
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: b */
        public void mo68b() {
            this.f74a.invoke();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        public void onProgress(float f10) {
            this.f75b.invoke(Float.valueOf(f10));
        }
    }

    /* renamed from: a */
    public static final void m62a(RadioGroup radioGroup, int i10) {
        AbstractC9133u.m16133g(radioGroup, "<this>");
        View childAt = radioGroup.getChildAt(i10);
        AbstractC9133u.m16131e(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    /* renamed from: b */
    public static final void m63b(SketchProgressView sketchProgressView, InterfaceC10559a onTouchStart, InterfaceC10570l onProgress, InterfaceC10570l onTouchEnd) {
        AbstractC9133u.m16133g(sketchProgressView, "<this>");
        AbstractC9133u.m16133g(onTouchStart, "onTouchStart");
        AbstractC9133u.m16133g(onProgress, "onProgress");
        AbstractC9133u.m16133g(onTouchEnd, "onTouchEnd");
        sketchProgressView.setProgressListener(new a(onTouchStart, onProgress, onTouchEnd));
    }

    /* renamed from: c */
    public static final void m64c(View view, long j10, View.OnClickListener listener) {
        AbstractC9133u.m16133g(view, "<this>");
        AbstractC9133u.m16133g(listener, "listener");
        AbstractC5361f.m2454e(view, j10, listener);
    }

    /* renamed from: d */
    public static /* synthetic */ void m65d(View view, long j10, View.OnClickListener onClickListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        m64c(view, j10, onClickListener);
    }

    /* renamed from: e */
    public static final int m66e(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f10 * 255)) << 24);
    }
}
