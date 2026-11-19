package p284w2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.HasTypeface;

/* renamed from: w2.a */
/* loaded from: classes4.dex */
public class C10273a extends LinearLayout implements HasTypeface {

    /* renamed from: a */
    public Context f20500a;

    /* renamed from: b */
    public TextView f20501b;

    /* renamed from: c */
    public TextView f20502c;

    /* renamed from: d */
    public TextView f20503d;

    /* renamed from: e */
    public LinearLayout.LayoutParams f20504e;

    /* renamed from: f */
    public LinearLayout.LayoutParams f20505f;

    /* renamed from: g */
    public LinearLayout.LayoutParams f20506g;

    public C10273a(Context context) {
        super(context);
        m19253c(context);
    }

    /* renamed from: c */
    private void m19253c(Context context) {
        setOrientation(1);
        this.f20500a = context;
        m19254h();
    }

    /* renamed from: h */
    private void m19254h() {
        m19260g();
        m19258e();
        m19257d();
    }

    /* renamed from: a */
    public LinearLayout.LayoutParams m19255a(LinearLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams;
    }

    /* renamed from: b */
    public TextView m19256b(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(this.f20500a);
        textView2.setLayoutParams(layoutParams);
        textView2.setVisibility(8);
        return textView2;
    }

    /* renamed from: d */
    public final void m19257d() {
        LinearLayout.LayoutParams layoutParams = this.f20506g;
        if (layoutParams == null) {
            this.f20506g = m19255a(layoutParams);
        }
        TextView textView = this.f20503d;
        if (textView == null) {
            this.f20503d = m19259f(this.f20506g, textView);
        }
    }

    /* renamed from: e */
    public final void m19258e() {
        LinearLayout.LayoutParams layoutParams = this.f20505f;
        if (layoutParams == null) {
            this.f20505f = m19255a(layoutParams);
        }
        TextView textView = this.f20502c;
        if (textView == null) {
            this.f20502c = m19259f(this.f20505f, textView);
        }
    }

    /* renamed from: f */
    public final TextView m19259f(LinearLayout.LayoutParams layoutParams, TextView textView) {
        TextView textViewM19256b = m19256b(textView, layoutParams);
        textViewM19256b.setGravity(17);
        addView(textViewM19256b);
        return textViewM19256b;
    }

    /* renamed from: g */
    public final void m19260g() {
        LinearLayout.LayoutParams layoutParams = this.f20504e;
        if (layoutParams == null) {
            this.f20504e = m19255a(layoutParams);
        }
        TextView textView = this.f20501b;
        if (textView == null) {
            this.f20501b = m19259f(this.f20504e, textView);
        }
    }

    public TextView getBottomTextView() {
        return this.f20503d;
    }

    public TextView getCenterTextView() {
        return this.f20502c;
    }

    public TextView getTopTextView() {
        return this.f20501b;
    }

    /* renamed from: i */
    public void m19261i(int i10, int i11, int i12) {
        TextView textView = this.f20501b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f20502c.setEllipsize(truncateAt);
        this.f20503d.setEllipsize(truncateAt);
        this.f20501b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        this.f20502c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
        this.f20503d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i12)});
    }

    /* renamed from: j */
    public final void m19262j(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    public void setBottomTextString(CharSequence charSequence) {
        m19262j(this.f20503d, charSequence);
    }

    public void setCenterSpaceHeight(int i10) {
        int i11 = i10 / 2;
        this.f20504e.setMargins(0, 0, 0, i11);
        this.f20505f.setMargins(0, i11, 0, i11);
        this.f20506g.setMargins(0, i11, 0, 0);
    }

    public void setCenterTextString(CharSequence charSequence) {
        m19262j(this.f20502c, charSequence);
    }

    public void setTopTextString(CharSequence charSequence) {
        m19262j(this.f20501b, charSequence);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f20501b;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f20502c;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.f20503d;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
    }
}
