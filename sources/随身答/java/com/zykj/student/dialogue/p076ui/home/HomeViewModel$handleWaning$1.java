package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel", m13451f = "HomeViewModel.kt", m13452i = {0, 0, 1, 1, 1}, m13453l = {366, 368}, m13454m = "handleWaning", m13455n = {"showDialog", "isAvailable", "showDialog", "cameraPermission", "isAvailable"}, m13456s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
/* loaded from: classes5.dex */
public final class HomeViewModel$handleWaning$1 extends ContinuationImpl {

    /* renamed from: a */
    public boolean f11670a;

    /* renamed from: b */
    public Object f11671b;

    /* renamed from: c */
    public Object f11672c;

    /* renamed from: d */
    public /* synthetic */ Object f11673d;

    /* renamed from: e */
    public final /* synthetic */ HomeViewModel f11674e;

    /* renamed from: f */
    public int f11675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$handleWaning$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.f11674e = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11673d = obj;
        this.f11675f |= Integer.MIN_VALUE;
        return this.f11674e.m10857G(false, null, this);
    }
}
