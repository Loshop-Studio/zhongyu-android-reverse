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
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.ArrayList;
import p221q3.AbstractC9358b;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a */
/* loaded from: classes4.dex */
public class C6833a extends RecyclerView.Adapter {

    /* renamed from: a */
    public final MaterialDialog f7451a;

    /* renamed from: b */
    public final int f7452b;

    /* renamed from: c */
    public final GravityEnum f7453c;

    /* renamed from: d */
    public c f7454d;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7455a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f7455a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7455a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$b */
    public static class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a */
        public final CompoundButton f7456a;

        /* renamed from: b */
        public final TextView f7457b;

        /* renamed from: c */
        public final C6833a f7458c;

        public b(View view, C6833a c6833a) {
            super(view);
            this.f7456a = (CompoundButton) view.findViewById(R$id.md_control);
            this.f7457b = (TextView) view.findViewById(R$id.md_title);
            this.f7458c = c6833a;
            view.setOnClickListener(this);
            c6833a.f7451a.f7321c.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f7458c.f7454d == null || getAdapterPosition() == -1) {
                return;
            }
            this.f7458c.f7454d.mo6670a(this.f7458c.f7451a, view, getAdapterPosition(), (this.f7458c.f7451a.f7321c.f7414l == null || getAdapterPosition() >= this.f7458c.f7451a.f7321c.f7414l.size()) ? null : (CharSequence) this.f7458c.f7451a.f7321c.f7414l.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f7458c.f7454d == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.f7458c.f7454d.mo6670a(this.f7458c.f7451a, view, getAdapterPosition(), (this.f7458c.f7451a.f7321c.f7414l == null || getAdapterPosition() >= this.f7458c.f7451a.f7321c.f7414l.size()) ? null : (CharSequence) this.f7458c.f7451a.f7321c.f7414l.get(getAdapterPosition()), true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$c */
    public interface c {
        /* renamed from: a */
        boolean mo6670a(MaterialDialog materialDialog, View view, int i9, CharSequence charSequence, boolean z9);
    }

    public C6833a(MaterialDialog materialDialog, int i9) {
        this.f7451a = materialDialog;
        this.f7452b = i9;
        this.f7453c = materialDialog.f7321c.f7402f;
    }

    /* renamed from: d */
    public final boolean m6710d() {
        return this.f7451a.m6673g().m6698h().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i9) {
        View view = bVar.itemView;
        boolean zM6475h = AbstractC6801g.m6475h(Integer.valueOf(i9), this.f7451a.f7321c.f7378M);
        int iM6468a = zM6475h ? AbstractC6801g.m6468a(this.f7451a.f7321c.f7399d0, 0.4f) : this.f7451a.f7321c.f7399d0;
        bVar.itemView.setEnabled(!zM6475h);
        int i10 = a.f7455a[this.f7451a.f7338t.ordinal()];
        if (i10 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f7456a;
            MaterialDialog.C6831g c6831g = this.f7451a.f7321c;
            boolean z9 = c6831g.f7375K == i9;
            ColorStateList colorStateList = c6831g.f7432u;
            if (colorStateList != null) {
                AbstractC9358b.m15332g(radioButton, colorStateList);
            } else {
                AbstractC9358b.m15331f(radioButton, c6831g.f7430t);
            }
            radioButton.setChecked(z9);
            radioButton.setEnabled(!zM6475h);
        } else if (i10 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f7456a;
            boolean zContains = this.f7451a.f7339u.contains(Integer.valueOf(i9));
            MaterialDialog.C6831g c6831g2 = this.f7451a.f7321c;
            ColorStateList colorStateList2 = c6831g2.f7432u;
            if (colorStateList2 != null) {
                AbstractC9358b.m15329d(checkBox, colorStateList2);
            } else {
                AbstractC9358b.m15328c(checkBox, c6831g2.f7430t);
            }
            checkBox.setChecked(zContains);
            checkBox.setEnabled(!zM6475h);
        }
        bVar.f7457b.setText((CharSequence) this.f7451a.f7321c.f7414l.get(i9));
        bVar.f7457b.setTextColor(iM6468a);
        MaterialDialog materialDialog = this.f7451a;
        materialDialog.m6687u(bVar.f7457b, materialDialog.f7321c.f7380O);
        ViewGroup viewGroup = (ViewGroup) view;
        m6714h(viewGroup);
        int[] iArr = this.f7451a.f7321c.f7425q0;
        if (iArr != null) {
            if (i9 < iArr.length) {
                view.setId(iArr[i9]);
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
    public b onCreateViewHolder(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f7452b, viewGroup, false);
        AbstractC6801g.m6488u(viewInflate, this.f7451a.m6677k());
        return new b(viewInflate, this);
    }

    /* renamed from: g */
    public void m6713g(c cVar) {
        this.f7454d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f7451a.f7321c.f7414l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final void m6714h(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f7453c.m6667a() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.f7453c == GravityEnum.END && !m6710d() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.f7453c == GravityEnum.START && m6710d() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
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
