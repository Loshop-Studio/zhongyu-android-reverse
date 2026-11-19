package com.zykj.study.p065ui;

import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.work.WorkInfo;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$3", m17801f = "OpenFileFragment.kt", m17802l = {194}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class OpenFileFragment$downloadFile$2$1$1$3 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11690a;

    /* renamed from: b */
    public final /* synthetic */ OpenFileFragment f11691b;

    /* renamed from: c */
    public final /* synthetic */ WorkInfo f11692c;

    /* renamed from: d */
    public final /* synthetic */ DialogInterface f11693d;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$3$1", m17801f = "OpenFileFragment.kt", m17802l = {195}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$3$1 */
    public static final class C77671 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11694a;

        /* renamed from: b */
        public final /* synthetic */ WorkInfo f11695b;

        /* renamed from: c */
        public final /* synthetic */ DialogInterface f11696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77671(WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11695b = workInfo;
            this.f11696c = dialogInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77671(this.f11695b, this.f11696c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77671) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11694a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                WorkInfo workInfo = this.f11695b;
                DialogInterface dialogInterface = this.f11696c;
                AbstractC9133u.m16130d(dialogInterface);
                this.f11694a = 1;
                if (OpenFileFragment.m10476t(workInfo, dialogInterface, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFileFragment$downloadFile$2$1$1$3(OpenFileFragment openFileFragment, WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11691b = openFileFragment;
        this.f11692c = workInfo;
        this.f11693d = dialogInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new OpenFileFragment$downloadFile$2$1$1$3(this.f11691b, this.f11692c, this.f11693d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((OpenFileFragment$downloadFile$2$1$1$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11690a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f11691b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C77671 c77671 = new C77671(this.f11692c, this.f11693d, null);
            this.f11690a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c77671, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
