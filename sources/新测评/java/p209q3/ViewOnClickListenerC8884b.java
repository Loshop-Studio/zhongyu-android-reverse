package p209q3;

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
import p242t3.C9381a;

/* renamed from: q3.b */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC8884b extends AbstractC8883a implements View.OnClickListener {

    /* renamed from: p */
    public C8885c f15150p;

    public ViewOnClickListenerC8884b(C9381a c9381a) {
        super(c9381a.f16293C);
        this.f15133e = c9381a;
        m14950y(c9381a.f16293C);
    }

    /* renamed from: A */
    public void m14945A() throws ParseException {
        if (this.f15133e.f16315a != null) {
            try {
                this.f15133e.f16315a.mo15975a(C8885c.f15151y.parse(this.f15150p.m14980o()), this.f15140l);
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: B */
    public final void m14946B() {
        C8885c c8885c = this.f15150p;
        C9381a c9381a = this.f15133e;
        c8885c.m14969E(c9381a.f16322h, c9381a.f16323i);
        m14949x();
    }

    /* renamed from: C */
    public final void m14947C() {
        this.f15150p.m14972H(this.f15133e.f16324j);
        this.f15150p.m14989x(this.f15133e.f16325k);
    }

    /* renamed from: D */
    public final void m14948D() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = this.f15133e.f16321g;
        if (calendar2 == null) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            i10 = calendar.get(1);
            i11 = calendar.get(2);
            i12 = calendar.get(5);
            i13 = calendar.get(11);
            i14 = calendar.get(12);
            i15 = calendar.get(13);
        } else {
            i10 = calendar2.get(1);
            i11 = this.f15133e.f16321g.get(2);
            i12 = this.f15133e.f16321g.get(5);
            i13 = this.f15133e.f16321g.get(11);
            i14 = this.f15133e.f16321g.get(12);
            i15 = this.f15133e.f16321g.get(13);
        }
        this.f15150p.m14968D(i10, i11, i12, i13, i14, i15);
    }

    @Override // p209q3.AbstractC8883a
    /* renamed from: o */
    public boolean mo14936o() {
        return this.f15133e.f16310T;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws ParseException {
        if (((String) view.getTag()).equals("submit")) {
            m14945A();
        }
        m14927f();
    }

    /* renamed from: x */
    public final void m14949x() {
        C9381a c9381a = this.f15133e;
        Calendar calendar = c9381a.f16322h;
        if (calendar == null || c9381a.f16323i == null) {
            if (calendar != null) {
                c9381a.f16321g = calendar;
                return;
            }
            Calendar calendar2 = c9381a.f16323i;
            if (calendar2 != null) {
                c9381a.f16321g = calendar2;
                return;
            }
            return;
        }
        Calendar calendar3 = c9381a.f16321g;
        if (calendar3 == null || calendar3.getTimeInMillis() < this.f15133e.f16322h.getTimeInMillis() || this.f15133e.f16321g.getTimeInMillis() > this.f15133e.f16323i.getTimeInMillis()) {
            C9381a c9381a2 = this.f15133e;
            c9381a2.f16321g = c9381a2.f16322h;
        }
    }

    /* renamed from: y */
    public final void m14950y(Context context) {
        m14939r();
        m14935n();
        m14934m();
        this.f15133e.getClass();
        if (mo14936o()) {
            LayoutInflater.from(context).inflate(R$layout.xui_layout_picker_view_time_dialog, this.f15130b);
        } else {
            LayoutInflater.from(context).inflate(R$layout.xui_layout_picker_view_time, this.f15130b);
        }
        TextView textView = (TextView) m14930i(R$id.tvTitle);
        LinearLayout linearLayout = (LinearLayout) m14930i(R$id.ll_content);
        Button button = (Button) m14930i(R$id.btnSubmit);
        Button button2 = (Button) m14930i(R$id.btnCancel);
        button.setTag("submit");
        button2.setTag("cancel");
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setText(TextUtils.isEmpty(this.f15133e.f16294D) ? context.getResources().getString(R$string.xui_picker_view_submit) : this.f15133e.f16294D);
        button2.setText(TextUtils.isEmpty(this.f15133e.f16295E) ? context.getResources().getString(R$string.xui_picker_view_cancel) : this.f15133e.f16295E);
        textView.setText(TextUtils.isEmpty(this.f15133e.f16296F) ? "" : this.f15133e.f16296F);
        button.setTextColor(this.f15133e.f16297G);
        button2.setTextColor(this.f15133e.f16298H);
        textView.setTextColor(this.f15133e.f16299I);
        if (mo14936o() && TextUtils.isEmpty(textView.getText().toString())) {
            textView.setVisibility(8);
        }
        linearLayout.setBackgroundColor(this.f15133e.f16301K);
        button.setTextSize(this.f15133e.f16302L);
        button2.setTextSize(this.f15133e.f16302L);
        textView.setTextSize(this.f15133e.f16303M);
        LinearLayout linearLayout2 = (LinearLayout) m14930i(R$id.time_picker);
        linearLayout2.setBackgroundColor(this.f15133e.f16300J);
        m14951z(linearLayout2);
    }

    /* renamed from: z */
    public final void m14951z(LinearLayout linearLayout) {
        int i10;
        C9381a c9381a = this.f15133e;
        this.f15150p = new C8885c(linearLayout, c9381a.f16320f, c9381a.f16292B, c9381a.f16304N);
        this.f15133e.getClass();
        this.f15150p.m14967C(this.f15133e.f16327m);
        C9381a c9381a2 = this.f15133e;
        int i11 = c9381a2.f16324j;
        if (i11 != 0 && (i10 = c9381a2.f16325k) != 0 && i11 <= i10) {
            m14947C();
        }
        C9381a c9381a3 = this.f15133e;
        Calendar calendar = c9381a3.f16322h;
        if (calendar == null || c9381a3.f16323i == null) {
            if (calendar == null) {
                Calendar calendar2 = c9381a3.f16323i;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    throw new IllegalArgumentException("The endDate should not be later than 2100");
                }
                m14946B();
            } else {
                if (calendar.get(1) < 1900) {
                    throw new IllegalArgumentException("The startDate can not as early as 1900");
                }
                m14946B();
            }
        } else {
            if (calendar.getTimeInMillis() > this.f15133e.f16323i.getTimeInMillis()) {
                throw new IllegalArgumentException("startDate can't be later than endDate");
            }
            m14946B();
        }
        m14948D();
        C8885c c8885c = this.f15150p;
        C9381a c9381a4 = this.f15133e;
        c8885c.m14990y(c9381a4.f16328n, c9381a4.f16329o, c9381a4.f16330p, c9381a4.f16331q, c9381a4.f16332r, c9381a4.f16333s);
        C8885c c8885c2 = this.f15150p;
        C9381a c9381a5 = this.f15133e;
        c8885c2.m14977M(c9381a5.f16334t, c9381a5.f16335u, c9381a5.f16336v, c9381a5.f16337w, c9381a5.f16338x, c9381a5.f16339y);
        m14941t(this.f15133e.f16311U);
        this.f15150p.m14984s(this.f15133e.f16326l);
        this.f15150p.m14986u(this.f15133e.f16307Q);
        this.f15150p.m14988w(this.f15133e.f16314X);
        this.f15150p.m14965A(this.f15133e.f16309S);
        this.f15150p.m14976L(this.f15133e.f16305O);
        this.f15150p.m14974J(this.f15133e.f16306P);
        this.f15150p.m14981p(this.f15133e.f16312V);
    }
}
