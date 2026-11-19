package p231s3;

import android.content.Context;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import java.util.Calendar;
import p209q3.ViewOnClickListenerC8884b;
import p242t3.C9381a;
import p253u3.InterfaceC9540c;

/* renamed from: s3.a */
/* loaded from: classes4.dex */
public class C9135a {

    /* renamed from: a */
    public C9381a f15863a;

    public C9135a(Context context, InterfaceC9540c interfaceC9540c) {
        C9381a c9381a = new C9381a(2);
        this.f15863a = c9381a;
        c9381a.f16293C = context;
        c9381a.f16315a = interfaceC9540c;
        c9381a.f16297G = AbstractC6482g.m5375f(context);
        this.f15863a.f16298H = AbstractC6482g.m5375f(context);
    }

    /* renamed from: a */
    public ViewOnClickListenerC8884b m15517a() {
        return new ViewOnClickListenerC8884b(this.f15863a);
    }

    /* renamed from: b */
    public C9135a m15518b(ViewGroup viewGroup) {
        this.f15863a.f16291A = viewGroup;
        return this;
    }

    /* renamed from: c */
    public C9135a m15519c(Calendar calendar, Calendar calendar2) {
        C9381a c9381a = this.f15863a;
        c9381a.f16322h = calendar;
        c9381a.f16323i = calendar2;
        return this;
    }

    /* renamed from: d */
    public C9135a m15520d(String str) {
        this.f15863a.f16296F = str;
        return this;
    }

    /* renamed from: e */
    public C9135a m15521e(TimePickerType timePickerType) {
        this.f15863a.f16320f = timePickerType.m5868a();
        return this;
    }
}
