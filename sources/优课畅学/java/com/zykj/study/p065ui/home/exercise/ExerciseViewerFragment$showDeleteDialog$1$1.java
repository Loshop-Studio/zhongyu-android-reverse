package com.zykj.study.p065ui.home.exercise;

import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$showDeleteDialog$1$1", m17801f = "ExerciseViewerFragment.kt", m17802l = {201}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerFragment$showDeleteDialog$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11964a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerFragment f11965b;

    /* renamed from: c */
    public final /* synthetic */ int f11966c;

    /* renamed from: d */
    public final /* synthetic */ String f11967d;

    /* renamed from: e */
    public final /* synthetic */ MicroBean f11968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerFragment$showDeleteDialog$1$1(ExerciseViewerFragment exerciseViewerFragment, int i10, String str, MicroBean microBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11965b = exerciseViewerFragment;
        this.f11966c = i10;
        this.f11967d = str;
        this.f11968e = microBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerFragment$showDeleteDialog$1$1(this.f11965b, this.f11966c, this.f11967d, this.f11968e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerFragment$showDeleteDialog$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11964a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseViewerViewModel exerciseViewerViewModelM10692I = this.f11965b.m10692I();
            int i11 = this.f11966c;
            String str = this.f11967d;
            int id = this.f11968e.getId();
            this.f11964a = 1;
            obj = exerciseViewerViewModelM10692I.m12167r(i11, str, id, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (AbstractC9133u.m16128b(obj, AbstractC9536a.m17796a(true))) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f11965b.getString(R$string.delete_exercise_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            this.f11965b.m10696a0();
        } else {
            XToastUtils xToastUtils2 = XToastUtils.INSTANCE;
            String string2 = this.f11965b.getString(R$string.delete_exercise_fail);
            AbstractC9133u.m16132f(string2, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils2, string2);
        }
        return C8736p.f16368a;
    }
}
