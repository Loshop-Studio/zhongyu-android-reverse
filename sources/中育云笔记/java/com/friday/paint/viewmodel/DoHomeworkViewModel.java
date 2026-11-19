package com.friday.paint.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.friday.common.base.BaseViewModel;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.dao.UserDao;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DoHomeworkViewModel extends BaseViewModel {

    /* renamed from: b */
    public final UserDao f10290b;

    /* renamed from: c */
    public MqttResponse f10291c;

    /* renamed from: d */
    public int f10292d;

    /* renamed from: e */
    public int f10293e;

    /* renamed from: f */
    public boolean f10294f;

    /* renamed from: g */
    public int f10295g;

    /* renamed from: h */
    public boolean f10296h;

    /* renamed from: i */
    public boolean f10297i;

    /* renamed from: j */
    public final MutableLiveData f10298j;

    /* renamed from: k */
    public ArrayList f10299k;

    /* renamed from: l */
    public boolean f10300l;

    /* renamed from: m */
    public ArrayList f10301m;

    /* renamed from: n */
    public final InterfaceC11603l f10302n;

    /* renamed from: o */
    public final InterfaceC11612u f10303o;

    public DoHomeworkViewModel(UserDao userDao) {
        AbstractC9979u.m20294g(userDao, "userDao");
        this.f10290b = userDao;
        this.f10294f = true;
        this.f10298j = new MutableLiveData(Boolean.FALSE);
        this.f10299k = new ArrayList();
        this.f10301m = new ArrayList();
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this.f10302n = interfaceC11603lM25602a;
        this.f10303o = interfaceC11603lM25602a;
    }

    /* renamed from: A */
    public final void m7622A(MqttResponse mqttResponse) {
        Object value;
        InterfaceC11603l interfaceC11603l = this.f10302n;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, mqttResponse));
    }

    /* renamed from: f */
    public final ArrayList m7623f() {
        return this.f10299k;
    }

    /* renamed from: g */
    public final boolean m7624g() {
        return this.f10300l;
    }

    /* renamed from: h */
    public final ArrayList m7625h() {
        return this.f10301m;
    }

    /* renamed from: i */
    public final boolean m7626i() {
        return this.f10296h;
    }

    /* renamed from: j */
    public final MutableLiveData m7627j() {
        return this.f10298j;
    }

    /* renamed from: k */
    public final boolean m7628k() {
        return this.f10297i;
    }

    /* renamed from: l */
    public final MqttResponse m7629l() {
        return this.f10291c;
    }

    /* renamed from: m */
    public final InterfaceC11612u m7630m() {
        return this.f10303o;
    }

    /* renamed from: n */
    public final int m7631n() {
        return this.f10295g;
    }

    /* renamed from: o */
    public final int m7632o() {
        return this.f10292d;
    }

    /* renamed from: p */
    public final int m7633p() {
        return this.f10293e;
    }

    /* renamed from: q */
    public final Object m7634q(InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new DoHomeworkViewModel$getScreensPermission$2(this, null), interfaceC11588c);
    }

    /* renamed from: r */
    public final boolean m7635r() {
        return this.f10294f;
    }

    /* renamed from: s */
    public final void m7636s(ArrayList arrayList) {
        AbstractC9979u.m20294g(arrayList, "<set-?>");
        this.f10299k = arrayList;
    }

    /* renamed from: t */
    public final void m7637t(boolean z10) {
        this.f10300l = z10;
    }

    /* renamed from: u */
    public final void m7638u(boolean z10) {
        this.f10296h = z10;
    }

    /* renamed from: v */
    public final void m7639v(boolean z10) {
        this.f10297i = z10;
    }

    /* renamed from: w */
    public final void m7640w(MqttResponse mqttResponse) {
        this.f10291c = mqttResponse;
    }

    /* renamed from: x */
    public final void m7641x(int i10) {
        this.f10292d = i10;
    }

    /* renamed from: y */
    public final void m7642y(int i10) {
        this.f10293e = i10;
    }

    /* renamed from: z */
    public final void m7643z(boolean z10) {
        this.f10294f = z10;
    }
}
