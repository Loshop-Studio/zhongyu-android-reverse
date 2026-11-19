package com.friday.common.helper;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material3.MenuKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.helper.OssUploadHelper", m26211f = "OssUploadHelper.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 116, MenuKt.InTransitionDuration}, m26213m = "putObject")
/* loaded from: classes3.dex */
public final class OssUploadHelper$putObject$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6071c;

    /* renamed from: d */
    public Object f6072d;

    /* renamed from: e */
    public /* synthetic */ Object f6073e;

    /* renamed from: f */
    public final /* synthetic */ OssUploadHelper f6074f;

    /* renamed from: g */
    public int f6075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssUploadHelper$putObject$1(OssUploadHelper ossUploadHelper, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6074f = ossUploadHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6073e = obj;
        this.f6075g |= Integer.MIN_VALUE;
        return this.f6074f.m5252e(null, null, this);
    }
}
