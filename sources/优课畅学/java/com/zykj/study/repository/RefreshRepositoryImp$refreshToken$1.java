package com.zykj.study.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.RefreshRepositoryImp", m17801f = "RefreshRepositoryImp.kt", m17802l = {47, 50, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, 69, 90, 92, TbsListener.ErrorCode.READ_RESPONSE_ERROR}, m17803m = "refreshToken")
/* loaded from: classes3.dex */
public final class RefreshRepositoryImp$refreshToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11487a;

    /* renamed from: b */
    public Object f11488b;

    /* renamed from: c */
    public Object f11489c;

    /* renamed from: d */
    public Object f11490d;

    /* renamed from: e */
    public Object f11491e;

    /* renamed from: f */
    public Object f11492f;

    /* renamed from: g */
    public int f11493g;

    /* renamed from: h */
    public int f11494h;

    /* renamed from: i */
    public /* synthetic */ Object f11495i;

    /* renamed from: j */
    public final /* synthetic */ RefreshRepositoryImp f11496j;

    /* renamed from: k */
    public int f11497k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImp$refreshToken$1(RefreshRepositoryImp refreshRepositoryImp, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11496j = refreshRepositoryImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11495i = obj;
        this.f11497k |= Integer.MIN_VALUE;
        return this.f11496j.mo10386a(null, this);
    }
}
