package com.zykj.mistake.feature.home;

import android.view.ViewModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/home/MainHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMainHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainHomeViewModel.kt\ncom/zykj/mistake/feature/home/MainHomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,46:1\n230#2,5:47\n230#2,5:52\n*S KotlinDebug\n*F\n+ 1 MainHomeViewModel.kt\ncom/zykj/mistake/feature/home/MainHomeViewModel\n*L\n23#1:47,5\n33#1:52,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MainHomeViewModel extends ViewModel {

    /* renamed from: a */
    public final C5946n0 f6810a;

    /* renamed from: b */
    public final C5901a0 f6811b;

    public MainHomeViewModel() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4742o(HomeTab.MISTAKE_NOTEBOOK, false));
        this.f6810a = c5946n0M5546b;
        this.f6811b = new C5901a0(c5946n0M5546b);
    }

    /* renamed from: a */
    public final void m4100a(AbstractC4738k abstractC4738k) {
        Object value;
        C4742o c4742o;
        Object value2;
        C4742o c4742o2;
        boolean z8 = abstractC4738k instanceof C4741n;
        C5946n0 c5946n0 = this.f6810a;
        if (z8) {
            HomeTab selectedTab = ((C4741n) abstractC4738k).f6845a;
            do {
                value2 = c5946n0.getValue();
                HomeTab selectedTab2 = ((C4742o) value2).f6846a;
                if (selectedTab2 == selectedTab) {
                    AbstractC5830k.m5330g(selectedTab2, "selectedTab");
                    c4742o2 = new C4742o(selectedTab2, true);
                } else {
                    AbstractC5830k.m5330g(selectedTab, "selectedTab");
                    c4742o2 = new C4742o(selectedTab, true);
                }
            } while (!c5946n0.m5569i(value2, c4742o2));
            return;
        }
        if (!(abstractC4738k instanceof C4740m)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z9 = ((C4740m) abstractC4738k).f6844a;
        do {
            value = c5946n0.getValue();
            c4742o = (C4742o) value;
            if (!c4742o.f6847b) {
                HomeTab selectedTab3 = z9 ? HomeTab.REVIEW : HomeTab.MISTAKE_NOTEBOOK;
                AbstractC5830k.m5330g(selectedTab3, "selectedTab");
                c4742o = new C4742o(selectedTab3, true);
            }
        } while (!c5946n0.m5569i(value, c4742o));
    }
}
