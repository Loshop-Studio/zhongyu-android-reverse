package com.friday.lecture.viewmodel.offline;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.friday.common.activity.PusherService;
import com.friday.common.base.BaseViewModel;
import com.friday.common.entity.FromPage;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.helper.C5965e;
import com.friday.lecture.model.ConnectMode;
import com.friday.lecture.model.ConnectionStatus;
import com.friday.lecture.model.ConnectionStatusKt;
import com.friday.lecture.model.KeyboardData;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9979u;
import p126e2.C9072a;
import p181hd.InterfaceC9540l;
import p186i2.C9568a;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LectureDialogViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11603l f8925b;

    /* renamed from: c */
    public final InterfaceC11612u f8926c;

    /* renamed from: d */
    public final InterfaceC11603l f8927d;

    /* renamed from: e */
    public final InterfaceC11612u f8928e;

    /* renamed from: f */
    public final InterfaceC11603l f8929f;

    /* renamed from: g */
    public final InterfaceC11612u f8930g;

    /* renamed from: h */
    public final MutableLiveData f8931h;

    /* renamed from: i */
    public final MutableLiveData f8932i;

    /* renamed from: j */
    public Intent f8933j;

    public LectureDialogViewModel() {
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(ConnectMode.Code.INSTANCE);
        this.f8925b = interfaceC11603lM25602a;
        this.f8926c = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8927d = interfaceC11603lM25602a2;
        this.f8928e = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11603l interfaceC11603lM25602a3 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8929f = interfaceC11603lM25602a3;
        this.f8930g = AbstractC11596e.m25552b(interfaceC11603lM25602a3);
        this.f8931h = new MutableLiveData();
        this.f8932i = new MutableLiveData();
        m6836i(ConnectionStatusKt.convert2ConnectMode(SPUtils.getInstance().getInt("ConnectMode")));
    }

    /* renamed from: A */
    public final void m6835A() {
        m6852y(true);
        C5963c.f6084a.m5311g("", "0", "课堂笔记", FromPage.FROM_CLASS);
    }

    /* renamed from: i */
    public final void m6836i(ConnectMode mode) {
        AbstractC9979u.m20294g(mode, "mode");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new LectureDialogViewModel$changeConnectMode$1(this, mode, null), 3, null);
    }

    /* renamed from: j */
    public final void m6837j(final InterfaceC9540l successCallback) throws SocketException, NumberFormatException {
        AbstractC9979u.m20294g(successCallback, "successCallback");
        m6849v();
        List list = (List) this.f8928e.getValue();
        final String strM23954w0 = AbstractC10947g0.m23954w0(list, "", null, null, 0, null, null, 62, null);
        if (AbstractC9979u.m20289b(this.f8926c.getValue(), ConnectMode.C6153IP.INSTANCE)) {
            C5962b.f6082a.m5299a().m5265C(m6838k(list));
            successCallback.invoke(strM23954w0);
        } else {
            String strM6839l = m6839l(list);
            C5965e.a aVar = C5965e.f6091k;
            aVar.m5353a().m5349i(strM6839l);
            aVar.m5353a().m5352o(new C5965e.b() { // from class: com.friday.lecture.viewmodel.offline.LectureDialogViewModel$connectClass$1
                @Override // com.friday.common.helper.C5965e.b
                /* renamed from: a */
                public void mo5354a(C9568a info) {
                    AbstractC9979u.m20294g(info, "info");
                    AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this.f8937a), null, null, new LectureDialogViewModel$connectClass$1$onReceive$1(info, successCallback, strM23954w0, this.f8937a, null), 3, null);
                }
            });
        }
    }

    /* renamed from: k */
    public final String m6838k(List list) throws SocketException, NumberFormatException {
        String iPAddress = NetworkUtils.getIPAddress(true);
        AbstractC9979u.m20291d(iPAddress);
        List listM23091I0 = AbstractC10793c0.m23091I0(iPAddress, new String[]{Consts.DOT}, false, 0, 6, null);
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        int i10 = Integer.parseInt(sb2.toString(), AbstractC10788a.m23073a(16));
        Object obj3 = list.get(2);
        Object obj4 = list.get(3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj3);
        sb3.append(obj4);
        int i11 = ((Integer.parseInt(sb3.toString(), AbstractC10788a.m23073a(16)) - i10) + 256) % 256;
        Object obj5 = list.get(4);
        Object obj6 = list.get(5);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj5);
        sb4.append(obj6);
        int i12 = ((Integer.parseInt(sb4.toString(), AbstractC10788a.m23073a(16)) + i10) + 256) % 256;
        return listM23091I0.get(0) + Consts.DOT + listM23091I0.get(1) + Consts.DOT + i11 + Consts.DOT + i12;
    }

    /* renamed from: l */
    public final String m6839l(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
        }
        String string = stringBuffer.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: m */
    public final void m6840m() {
        m6852y(false);
    }

    /* renamed from: n */
    public final InterfaceC11612u m6841n() {
        return this.f8926c;
    }

    /* renamed from: o */
    public final MutableLiveData m6842o() {
        return this.f8932i;
    }

    /* renamed from: p */
    public final InterfaceC11612u m6843p() {
        return this.f8930g;
    }

    /* renamed from: q */
    public final MutableLiveData m6844q() {
        return this.f8931h;
    }

    /* renamed from: r */
    public final InterfaceC11612u m6845r() {
        return this.f8928e;
    }

    /* renamed from: s */
    public final void m6846s() {
        if (ServiceUtils.isServiceRunning((Class<?>) PusherService.class)) {
            ServiceUtils.stopService((Class<?>) PusherService.class);
        }
        m6840m();
    }

    /* renamed from: t */
    public final void m6847t(Intent intent) {
        this.f8933j = intent;
    }

    /* renamed from: u */
    public final void m6848u() {
        if (this.f8931h.hasActiveObservers()) {
            this.f8931h.postValue(new C9072a(ConnectionStatus.CONNECTED));
            return;
        }
        MutableLiveData mutableLiveData = this.f8931h;
        C9072a c9072a = new C9072a(ConnectionStatus.CONNECTED);
        c9072a.m17875c(true);
        mutableLiveData.postValue(c9072a);
    }

    /* renamed from: v */
    public final void m6849v() {
        if (this.f8931h.hasActiveObservers()) {
            this.f8931h.postValue(new C9072a(ConnectionStatus.CONNECTING));
            return;
        }
        MutableLiveData mutableLiveData = this.f8931h;
        C9072a c9072a = new C9072a(ConnectionStatus.CONNECTING);
        c9072a.m17875c(true);
        mutableLiveData.postValue(c9072a);
    }

    /* renamed from: w */
    public final void m6850w() {
        if (this.f8931h.hasActiveObservers()) {
            this.f8931h.postValue(new C9072a(ConnectionStatus.CONNECTION_FAILED));
            return;
        }
        MutableLiveData mutableLiveData = this.f8931h;
        C9072a c9072a = new C9072a(ConnectionStatus.CONNECTION_FAILED);
        c9072a.m17875c(true);
        mutableLiveData.postValue(c9072a);
    }

    /* renamed from: x */
    public final void m6851x() {
        if (this.f8931h.hasActiveObservers()) {
            this.f8931h.setValue(new C9072a(ConnectionStatus.DISCONNECTED));
            return;
        }
        MutableLiveData mutableLiveData = this.f8931h;
        C9072a c9072a = new C9072a(ConnectionStatus.DISCONNECTED);
        c9072a.m17875c(true);
        mutableLiveData.setValue(c9072a);
    }

    /* renamed from: y */
    public final void m6852y(boolean z10) {
        if (z10) {
            m6848u();
        } else {
            m6851x();
        }
    }

    /* renamed from: z */
    public final void m6853z(KeyboardData keyboardData) {
        Object value;
        List listM23925a1;
        int iNextIndex;
        Object value2;
        ArrayList arrayList;
        AbstractC9979u.m20294g(keyboardData, "keyboardData");
        if (keyboardData.isValue()) {
            InterfaceC11603l interfaceC11603l = this.f8927d;
            do {
                value2 = interfaceC11603l.getValue();
                List<String> list = (List) value2;
                arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                boolean z10 = false;
                for (String value3 : list) {
                    if (!z10 && value3.length() == 0) {
                        value3 = keyboardData.getValue();
                        z10 = true;
                    }
                    arrayList.add(value3);
                }
            } while (!interfaceC11603l.mo20870e(value2, arrayList));
            return;
        }
        InterfaceC11603l interfaceC11603l2 = this.f8927d;
        do {
            value = interfaceC11603l2.getValue();
            listM23925a1 = (List) value;
            ListIterator listIterator = listM23925a1.listIterator(listM23925a1.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() > 0) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            if (iNextIndex != -1) {
                listM23925a1 = AbstractC10947g0.m23925a1(listM23925a1);
                listM23925a1.set(iNextIndex, "");
            }
        } while (!interfaceC11603l2.mo20870e(value, listM23925a1));
    }
}
