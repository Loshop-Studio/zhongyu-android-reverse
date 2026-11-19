package com.friday.paint.view.six;

import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.paint.view.six.AbstractC6320i;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10772c;

/* renamed from: com.friday.paint.view.six.i */
/* loaded from: classes4.dex */
public abstract class AbstractC6320i {

    /* renamed from: com.friday.paint.view.six.i$a */
    public static final class a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f10285c;

        public a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f10285c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f10285c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10285c.invoke(obj);
        }
    }

    /* renamed from: b */
    public static final void m7619b(View view, final InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(view, "<this>");
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: d4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC6320i.m7620c(ref$LongRef, interfaceC9540l, view2);
            }
        });
    }

    /* renamed from: c */
    public static final void m7620c(Ref$LongRef ref$LongRef, InterfaceC9540l interfaceC9540l, View view) {
        if (SystemClock.uptimeMillis() - ref$LongRef.f23401c <= 1000) {
            ToastUtils.showShort("请勿连续操作，稍后重试", new Object[0]);
            return;
        }
        ref$LongRef.f23401c = SystemClock.uptimeMillis();
        if (interfaceC9540l != null) {
            AbstractC9979u.m20291d(view);
            interfaceC9540l.invoke(view);
        }
    }
}
