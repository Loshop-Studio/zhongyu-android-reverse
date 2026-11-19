package p116g4;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import java.text.ParseException;
import java.util.Calendar;
import p146j4.C8213a;

/* renamed from: g4.b */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC8051b extends AbstractC8050a implements View.OnClickListener {

    /* renamed from: p */
    public C8052c f13662p;

    public ViewOnClickListenerC8051b(C8213a c8213a) {
        super(c8213a.f14236C);
        this.f13645e = c8213a;
        m12751y(c8213a.f14236C);
    }

    /* renamed from: A */
    public void m12746A() throws ParseException {
        if (this.f13645e.f14258a != null) {
            try {
                this.f13645e.f14258a.mo13374a(C8052c.f13663y.parse(this.f13662p.m12781o()), this.f13652l);
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: B */
    public final void m12747B() {
        C8052c c8052c = this.f13662p;
        C8213a c8213a = this.f13645e;
        c8052c.m12770E(c8213a.f14265h, c8213a.f14266i);
        m12750x();
    }

    /* renamed from: C */
    public final void m12748C() {
        this.f13662p.m12773H(this.f13645e.f14267j);
        this.f13662p.m12790x(this.f13645e.f14268k);
    }

    /* renamed from: D */
    public final void m12749D() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = this.f13645e.f14264g;
        if (calendar2 == null) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            i9 = calendar.get(1);
            i10 = calendar.get(2);
            i11 = calendar.get(5);
            i12 = calendar.get(11);
            i13 = calendar.get(12);
            i14 = calendar.get(13);
        } else {
            i9 = calendar2.get(1);
            i10 = this.f13645e.f14264g.get(2);
            i11 = this.f13645e.f14264g.get(5);
            i12 = this.f13645e.f14264g.get(11);
            i13 = this.f13645e.f14264g.get(12);
            i14 = this.f13645e.f14264g.get(13);
        }
        this.f13662p.m12769D(i9, i10, i11, i12, i13, i14);
    }

    @Override // p116g4.AbstractC8050a
    /* renamed from: o */
    public boolean mo12737o() {
        return this.f13645e.f14253T;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws ParseException {
        if (((String) view.getTag()).equals("submit")) {
            m12746A();
        }
        m12728f();
    }

    /* renamed from: x */
    public final void m12750x() {
        C8213a c8213a = this.f13645e;
        Calendar calendar = c8213a.f14265h;
        if (calendar == null || c8213a.f14266i == null) {
            if (calendar != null) {
                c8213a.f14264g = calendar;
                return;
            }
            Calendar calendar2 = c8213a.f14266i;
            if (calendar2 != null) {
                c8213a.f14264g = calendar2;
                return;
            }
            return;
        }
        Calendar calendar3 = c8213a.f14264g;
        if (calendar3 == null || calendar3.getTimeInMillis() < this.f13645e.f14265h.getTimeInMillis() || this.f13645e.f14264g.getTimeInMillis() > this.f13645e.f14266i.getTimeInMillis()) {
            C8213a c8213a2 = this.f13645e;
            c8213a2.f14264g = c8213a2.f14265h;
        }
    }

    /* renamed from: y */
    public final void m12751y(Context context) {
        m12740r();
        m12736n();
        m12735m();
        this.f13645e.getClass();
        if (mo12737o()) {
            LayoutInflater.from(context).inflate(R$layout.xui_layout_picker_view_time_dialog, this.f13642b);
        } else {
            LayoutInflater.from(context).inflate(R$layout.xui_layout_picker_view_time, this.f13642b);
        }
        TextView textView = (TextView) m12731i(R$id.tvTitle);
        LinearLayout linearLayout = (LinearLayout) m12731i(R$id.ll_content);
        Button button = (Button) m12731i(R$id.btnSubmit);
        Button button2 = (Button) m12731i(R$id.btnCancel);
        button.setTag("submit");
        button2.setTag("cancel");
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setText(TextUtils.isEmpty(this.f13645e.f14237D) ? context.getResources().getString(R$string.xui_picker_view_submit) : this.f13645e.f14237D);
        button2.setText(TextUtils.isEmpty(this.f13645e.f14238E) ? context.getResources().getString(R$string.xui_picker_view_cancel) : this.f13645e.f14238E);
        textView.setText(TextUtils.isEmpty(this.f13645e.f14239F) ? "" : this.f13645e.f14239F);
        button.setTextColor(this.f13645e.f14240G);
        button2.setTextColor(this.f13645e.f14241H);
        textView.setTextColor(this.f13645e.f14242I);
        if (mo12737o() && TextUtils.isEmpty(textView.getText().toString())) {
            textView.setVisibility(8);
        }
        linearLayout.setBackgroundColor(this.f13645e.f14244K);
        button.setTextSize(this.f13645e.f14245L);
        button2.setTextSize(this.f13645e.f14245L);
        textView.setTextSize(this.f13645e.f14246M);
        LinearLayout linearLayout2 = (LinearLayout) m12731i(R$id.time_picker);
        linearLayout2.setBackgroundColor(this.f13645e.f14243J);
        m12752z(linearLayout2);
    }

    /* renamed from: z */
    public final void m12752z(LinearLayout linearLayout) {
        int i9;
        C8213a c8213a = this.f13645e;
        this.f13662p = new C8052c(linearLayout, c8213a.f14263f, c8213a.f14235B, c8213a.f14247N);
        this.f13645e.getClass();
        this.f13662p.m12768C(this.f13645e.f14270m);
        C8213a c8213a2 = this.f13645e;
        int i10 = c8213a2.f14267j;
        if (i10 != 0 && (i9 = c8213a2.f14268k) != 0 && i10 <= i9) {
            m12748C();
        }
        C8213a c8213a3 = this.f13645e;
        Calendar calendar = c8213a3.f14265h;
        if (calendar == null || c8213a3.f14266i == null) {
            if (calendar == null) {
                Calendar calendar2 = c8213a3.f14266i;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    throw new IllegalArgumentException("The endDate should not be later than 2100");
                }
                m12747B();
            } else {
                if (calendar.get(1) < 1900) {
                    throw new IllegalArgumentException("The startDate can not as early as 1900");
                }
                m12747B();
            }
        } else {
            if (calendar.getTimeInMillis() > this.f13645e.f14266i.getTimeInMillis()) {
                throw new IllegalArgumentException("startDate can't be later than endDate");
            }
            m12747B();
        }
        m12749D();
        C8052c c8052c = this.f13662p;
        C8213a c8213a4 = this.f13645e;
        c8052c.m12791y(c8213a4.f14271n, c8213a4.f14272o, c8213a4.f14273p, c8213a4.f14274q, c8213a4.f14275r, c8213a4.f14276s);
        C8052c c8052c2 = this.f13662p;
        C8213a c8213a5 = this.f13645e;
        c8052c2.m12778M(c8213a5.f14277t, c8213a5.f14278u, c8213a5.f14279v, c8213a5.f14280w, c8213a5.f14281x, c8213a5.f14282y);
        m12742t(this.f13645e.f14254U);
        this.f13662p.m12785s(this.f13645e.f14269l);
        this.f13662p.m12787u(this.f13645e.f14250Q);
        this.f13662p.m12789w(this.f13645e.f14257X);
        this.f13662p.m12766A(this.f13645e.f14252S);
        this.f13662p.m12777L(this.f13645e.f14248O);
        this.f13662p.m12775J(this.f13645e.f14249P);
        this.f13662p.m12782p(this.f13645e.f14255V);
    }
}
