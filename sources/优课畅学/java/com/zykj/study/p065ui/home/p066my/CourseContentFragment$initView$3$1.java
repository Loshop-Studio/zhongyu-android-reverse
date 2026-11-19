package com.zykj.study.p065ui.home.p066my;

import android.view.View;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$string;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$initView$3$1", m17801f = "CourseContentFragment.kt", m17802l = {96}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$initView$3$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12849a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentFragment f12850b;

    /* renamed from: c */
    public final /* synthetic */ TitleBar f12851c;

    /* renamed from: com.zykj.study.ui.home.my.CourseContentFragment$initView$3$1$a */
    public static final class C7989a extends TitleBar.AbstractC6883c {

        /* renamed from: b */
        public final /* synthetic */ CourseContentFragment f12852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7989a(CourseContentFragment courseContentFragment, int i10) {
            super(i10);
            this.f12852b = courseContentFragment;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: a */
        public void mo6542a(View view) {
            this.f12852b.m11226r().loadUrl("javascript:window.location.reload(true)");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$initView$3$1(CourseContentFragment courseContentFragment, TitleBar titleBar, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12850b = courseContentFragment;
        this.f12851c = titleBar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$initView$3$1(this.f12850b, this.f12851c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$initView$3$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12849a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CourseContentFragment courseContentFragment = this.f12850b;
            this.f12849a = 1;
            obj = courseContentFragment.m11228v(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f12851c.m6523a(new C7989a(this.f12850b, R$string.refresh));
        }
        return C8736p.f16368a;
    }
}
