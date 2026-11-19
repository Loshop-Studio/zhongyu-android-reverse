package p136i4;

import android.content.Context;
import android.view.ViewGroup;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import java.util.Calendar;
import p116g4.ViewOnClickListenerC8051b;
import p146j4.C8213a;
import p156k4.InterfaceC8272c;

/* renamed from: i4.a */
/* loaded from: classes4.dex */
public class C8133a {

    /* renamed from: a */
    public C8213a f13904a;

    public C8133a(Context context, InterfaceC8272c interfaceC8272c) {
        C8213a c8213a = new C8213a(2);
        this.f13904a = c8213a;
        c8213a.f14236C = context;
        c8213a.f14258a = interfaceC8272c;
        c8213a.f14240G = AbstractC6801g.m6479l(context, R$attr.colorAccent);
        this.f13904a.f14241H = AbstractC6801g.m6479l(context, R$attr.colorAccent);
    }

    /* renamed from: a */
    public ViewOnClickListenerC8051b m13028a() {
        return new ViewOnClickListenerC8051b(this.f13904a);
    }

    /* renamed from: b */
    public C8133a m13029b(ViewGroup viewGroup) {
        this.f13904a.f14234A = viewGroup;
        return this;
    }

    /* renamed from: c */
    public C8133a m13030c(Calendar calendar, Calendar calendar2) {
        C8213a c8213a = this.f13904a;
        c8213a.f14265h = calendar;
        c8213a.f14266i = calendar2;
        return this;
    }

    /* renamed from: d */
    public C8133a m13031d(String str) {
        this.f13904a.f14239F = str;
        return this;
    }

    /* renamed from: e */
    public C8133a m13032e(TimePickerType timePickerType) {
        this.f13904a.f14263f = timePickerType.m6966a();
        return this;
    }
}
