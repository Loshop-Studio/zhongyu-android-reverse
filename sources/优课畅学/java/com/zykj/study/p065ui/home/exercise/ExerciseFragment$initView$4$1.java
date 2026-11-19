package com.zykj.study.p065ui.home.exercise;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.ExerciseType;
import com.zykj.study.p065ui.home.exercise.AbstractC7841a;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseFragment$initView$4$1", m17801f = "ExerciseFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseFragment$initView$4$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11783a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseBean f11784b;

    /* renamed from: c */
    public final /* synthetic */ ExerciseFragment f11785c;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseFragment$initView$4$1$a */
    public static final /* synthetic */ class C7785a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11786a;

        static {
            int[] iArr = new int[ExerciseType.values().length];
            try {
                iArr[ExerciseType.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExerciseType.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExerciseType.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11786a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseFragment$initView$4$1(ExerciseBean exerciseBean, ExerciseFragment exerciseFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11784b = exerciseBean;
        this.f11785c = exerciseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseFragment$initView$4$1(this.f11784b, this.f11785c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseFragment$initView$4$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11783a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ExerciseType status = this.f11784b.getStatus();
        int i10 = status == null ? -1 : C7785a.f11786a[status.ordinal()];
        if (i10 == 1 || i10 == 2) {
            FragmentKt.findNavController(this.f11785c).navigate(AbstractC7841a.f12090a.m10779c(this.f11785c.m10537l().m10541b(), this.f11785c.m10537l().m10540a(), this.f11785c.m10537l().m10542c()));
        } else if (i10 == 3) {
            FragmentKt.findNavController(this.f11785c).navigate(AbstractC7841a.c.m10777b(AbstractC7841a.f12090a, this.f11785c.m10537l().m10541b(), this.f11785c.m10537l().m10540a(), this.f11785c.m10537l().m10542c(), 0, 8, null));
        }
        return C8736p.f16368a;
    }
}
