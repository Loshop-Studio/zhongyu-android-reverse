package com.zykj.mistake.feature.review;

import android.view.ViewModel;
import android.view.ViewModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nReviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,134:1\n230#2,5:135\n*S KotlinDebug\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel\n*L\n39#1:135,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ReviewViewModel extends ViewModel {

    /* renamed from: a */
    public final C5010r f7632a = new C5010r();

    /* renamed from: b */
    public final C5946n0 f7633b;

    /* renamed from: c */
    public final C5901a0 f7634c;

    /* renamed from: d */
    public final C5873b f7635d;

    /* renamed from: e */
    public final C5904c f7636e;

    /* renamed from: f */
    public C5976k1 f7637f;

    /* renamed from: g */
    public int f7638g;

    public ReviewViewModel() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C5001i(null, 8388607));
        this.f7633b = c5946n0M5546b;
        this.f7634c = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f7635d = c5873bM5511a;
        this.f7636e = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: a */
    public final void m4319a(AbstractC5000h abstractC5000h) {
        boolean z8;
        int i;
        Object value;
        boolean z9 = abstractC5000h instanceof C4996d;
        C5946n0 c5946n0 = this.f7633b;
        if (z9) {
            C4996d c4996d = (C4996d) abstractC5000h;
            int i8 = c4996d.f7642a;
            String str = c4996d.f7643b;
            if (this.f7638g == i8) {
                return;
            }
            this.f7638g = i8;
            C5976k1 c5976k1 = this.f7637f;
            if (c5976k1 != null) {
                c5976k1.cancel(null);
            }
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, new C5001i(str, 6291454)));
            m4320b(str);
            return;
        }
        if (abstractC5000h.equals(C4997e.f7644a)) {
            m4320b(((C5001i) c5946n0.getValue()).f7647a);
            return;
        }
        if (abstractC5000h.equals(C4999g.f7646a)) {
            ((C5001i) c5946n0.getValue()).getClass();
            if (!((C5001i) c5946n0.getValue()).f7651e || ((C5001i) c5946n0.getValue()).f7650d <= 0) {
                AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new ReviewViewModel$startRecommendPractice$1(this, null), 3);
                return;
            } else {
                AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new ReviewViewModel$startRecommendPractice$2(this, null), 3);
                return;
            }
        }
        if (!(abstractC5000h instanceof C4998f)) {
            throw new NoWhenBranchMatchedException();
        }
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = ((C4998f) abstractC5000h).f7645a;
        ((C5001i) c5946n0.getValue()).getClass();
        C5001i c5001i = (C5001i) c5946n0.getValue();
        int[] iArr = AbstractC5018z.f7768a;
        int i9 = iArr[reviewContract$PracticePoolType.ordinal()];
        if (i9 == 1) {
            z8 = c5001i.f7654h;
        } else if (i9 == 2) {
            z8 = c5001i.f7657k;
        } else {
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z8 = c5001i.f7660n;
        }
        int i10 = iArr[reviewContract$PracticePoolType.ordinal()];
        if (i10 == 1) {
            i = c5001i.f7653g;
        } else if (i10 == 2) {
            i = c5001i.f7656j;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = c5001i.f7659m;
        }
        if (!z8 || i <= 0) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new ReviewViewModel$startPoolPractice$1(this, null), 3);
        } else {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new ReviewViewModel$startPoolPractice$2(this, reviewContract$PracticePoolType, null), 3);
        }
    }

    /* renamed from: b */
    public final void m4320b(String str) {
        C5976k1 c5976k1 = this.f7637f;
        if (c5976k1 != null) {
            c5976k1.cancel(null);
        }
        if (this.f7638g == 0) {
            return;
        }
        this.f7637f = AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new ReviewViewModel$loadHome$1(this, str, null), 3);
    }
}
