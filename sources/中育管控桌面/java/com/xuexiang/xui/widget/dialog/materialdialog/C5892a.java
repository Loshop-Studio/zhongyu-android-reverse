package com.xuexiang.xui.widget.dialog.materialdialog;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.ArrayList;
import p017b2.AbstractC4411b;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a */
/* loaded from: classes3.dex */
public class C5892a extends RecyclerView.Adapter {

    /* renamed from: a */
    public final MaterialDialog f4918a;

    /* renamed from: b */
    public final int f4919b;

    /* renamed from: c */
    public final GravityEnum f4920c;

    /* renamed from: d */
    public c f4921d;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4922a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f4922a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4922a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$b */
    public static class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a */
        public final CompoundButton f4923a;

        /* renamed from: b */
        public final TextView f4924b;

        /* renamed from: c */
        public final C5892a f4925c;

        public b(View view, C5892a c5892a) {
            super(view);
            this.f4923a = (CompoundButton) view.findViewById(R$id.md_control);
            this.f4924b = (TextView) view.findViewById(R$id.md_title);
            this.f4925c = c5892a;
            view.setOnClickListener(this);
            c5892a.f4918a.f4792c.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f4925c.f4921d == null || getAdapterPosition() == -1) {
                return;
            }
            this.f4925c.f4921d.mo4586a(this.f4925c.f4918a, view, getAdapterPosition(), (this.f4925c.f4918a.f4792c.f4881l == null || getAdapterPosition() >= this.f4925c.f4918a.f4792c.f4881l.size()) ? null : (CharSequence) this.f4925c.f4918a.f4792c.f4881l.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f4925c.f4921d == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.f4925c.f4921d.mo4586a(this.f4925c.f4918a, view, getAdapterPosition(), (this.f4925c.f4918a.f4792c.f4881l == null || getAdapterPosition() >= this.f4925c.f4918a.f4792c.f4881l.size()) ? null : (CharSequence) this.f4925c.f4918a.f4792c.f4881l.get(getAdapterPosition()), true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$c */
    public interface c {
        /* renamed from: a */
        boolean mo4586a(MaterialDialog materialDialog, View view, int i6, CharSequence charSequence, boolean z6);
    }

    public C5892a(MaterialDialog materialDialog, int i6) {
        this.f4918a = materialDialog;
        this.f4919b = i6;
        this.f4920c = materialDialog.f4792c.f4869f;
    }

    /* renamed from: d */
    public final boolean m4624d() {
        return this.f4918a.m4589g().m4612f().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i6) {
        View view = bVar.itemView;
        boolean zM4383i = AbstractC5859g.m4383i(Integer.valueOf(i6), this.f4918a.f4792c.f4841I);
        int iM4375a = zM4383i ? AbstractC5859g.m4375a(this.f4918a.f4792c.f4858Z, 0.4f) : this.f4918a.f4792c.f4858Z;
        bVar.itemView.setEnabled(!zM4383i);
        int i7 = a.f4922a[this.f4918a.f4809t.ordinal()];
        if (i7 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f4923a;
            MaterialDialog.C5891g c5891g = this.f4918a.f4792c;
            boolean z6 = c5891g.f4838G == i6;
            ColorStateList colorStateList = c5891g.f4899u;
            if (colorStateList != null) {
                AbstractC4411b.m1470g(radioButton, colorStateList);
            } else {
                AbstractC4411b.m1469f(radioButton, c5891g.f4897t);
            }
            radioButton.setChecked(z6);
            radioButton.setEnabled(!zM4383i);
        } else if (i7 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f4923a;
            boolean zContains = this.f4918a.f4810u.contains(Integer.valueOf(i6));
            MaterialDialog.C5891g c5891g2 = this.f4918a.f4792c;
            ColorStateList colorStateList2 = c5891g2.f4899u;
            if (colorStateList2 != null) {
                AbstractC4411b.m1467d(checkBox, colorStateList2);
            } else {
                AbstractC4411b.m1466c(checkBox, c5891g2.f4897t);
            }
            checkBox.setChecked(zContains);
            checkBox.setEnabled(!zM4383i);
        }
        bVar.f4924b.setText((CharSequence) this.f4918a.f4792c.f4881l.get(i6));
        bVar.f4924b.setTextColor(iM4375a);
        MaterialDialog materialDialog = this.f4918a;
        materialDialog.m4603u(bVar.f4924b, materialDialog.f4792c.f4843K);
        ViewGroup viewGroup = (ViewGroup) view;
        m4628h(viewGroup);
        int[] iArr = this.f4918a.f4792c.f4884m0;
        if (iArr != null) {
            if (i6 < iArr.length) {
                view.setId(iArr[i6]);
            } else {
                view.setId(-1);
            }
        }
        if (viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground(null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground(null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i6) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f4919b, viewGroup, false);
        AbstractC5859g.m4396v(viewInflate, this.f4918a.m4593k());
        return new b(viewInflate, this);
    }

    /* renamed from: g */
    public void m4627g(c cVar) {
        this.f4921d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f4918a.f4792c.f4881l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final void m4628h(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f4920c.m4583a() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.f4920c == GravityEnum.END && !m4624d() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.f4920c == GravityEnum.START && m4624d() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                View view2 = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(view2);
                TextView textView2 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView2);
                textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                viewGroup.addView(view2);
                viewGroup.addView(textView2);
            }
        }
    }
}
