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
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.ArrayList;
import p005a3.AbstractC0019b;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a */
/* loaded from: classes4.dex */
public class C6513a extends RecyclerView.Adapter {

    /* renamed from: a */
    public final MaterialDialog f6193a;

    /* renamed from: b */
    public final int f6194b;

    /* renamed from: c */
    public final GravityEnum f6195c;

    /* renamed from: d */
    public c f6196d;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6197a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f6197a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6197a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$b */
    public static class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a */
        public final CompoundButton f6198a;

        /* renamed from: b */
        public final TextView f6199b;

        /* renamed from: c */
        public final C6513a f6200c;

        public b(View view, C6513a c6513a) {
            super(view);
            this.f6198a = (CompoundButton) view.findViewById(R$id.md_control);
            this.f6199b = (TextView) view.findViewById(R$id.md_title);
            this.f6200c = c6513a;
            view.setOnClickListener(this);
            c6513a.f6193a.f6068c.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f6200c.f6196d == null || getAdapterPosition() == -1) {
                return;
            }
            this.f6200c.f6196d.mo5576a(this.f6200c.f6193a, view, getAdapterPosition(), (this.f6200c.f6193a.f6068c.f6156l == null || getAdapterPosition() >= this.f6200c.f6193a.f6068c.f6156l.size()) ? null : (CharSequence) this.f6200c.f6193a.f6068c.f6156l.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f6200c.f6196d == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.f6200c.f6196d.mo5576a(this.f6200c.f6193a, view, getAdapterPosition(), (this.f6200c.f6193a.f6068c.f6156l == null || getAdapterPosition() >= this.f6200c.f6193a.f6068c.f6156l.size()) ? null : (CharSequence) this.f6200c.f6193a.f6068c.f6156l.get(getAdapterPosition()), true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$c */
    public interface c {
        /* renamed from: a */
        boolean mo5576a(MaterialDialog materialDialog, View view, int i10, CharSequence charSequence, boolean z9);
    }

    public C6513a(MaterialDialog materialDialog, int i10) {
        this.f6193a = materialDialog;
        this.f6194b = i10;
        this.f6195c = materialDialog.f6068c.f6144f;
    }

    /* renamed from: d */
    public final boolean m5605d() {
        return this.f6193a.m5579g().m5597d().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        View view = bVar.itemView;
        boolean zM5378i = AbstractC6482g.m5378i(Integer.valueOf(i10), this.f6193a.f6068c.f6116I);
        int iM5370a = zM5378i ? AbstractC6482g.m5370a(this.f6193a.f6068c.f6133Z, 0.4f) : this.f6193a.f6068c.f6133Z;
        bVar.itemView.setEnabled(!zM5378i);
        int i11 = a.f6197a[this.f6193a.f6085t.ordinal()];
        if (i11 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f6198a;
            MaterialDialog.C6512f c6512f = this.f6193a.f6068c;
            boolean z9 = c6512f.f6113G == i10;
            ColorStateList colorStateList = c6512f.f6174u;
            if (colorStateList != null) {
                AbstractC0019b.m59g(radioButton, colorStateList);
            } else {
                AbstractC0019b.m58f(radioButton, c6512f.f6172t);
            }
            radioButton.setChecked(z9);
            radioButton.setEnabled(!zM5378i);
        } else if (i11 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f6198a;
            boolean zContains = this.f6193a.f6086u.contains(Integer.valueOf(i10));
            MaterialDialog.C6512f c6512f2 = this.f6193a.f6068c;
            ColorStateList colorStateList2 = c6512f2.f6174u;
            if (colorStateList2 != null) {
                AbstractC0019b.m56d(checkBox, colorStateList2);
            } else {
                AbstractC0019b.m55c(checkBox, c6512f2.f6172t);
            }
            checkBox.setChecked(zContains);
            checkBox.setEnabled(!zM5378i);
        }
        bVar.f6199b.setText((CharSequence) this.f6193a.f6068c.f6156l.get(i10));
        bVar.f6199b.setTextColor(iM5370a);
        MaterialDialog materialDialog = this.f6193a;
        materialDialog.m5590r(bVar.f6199b, materialDialog.f6068c.f6118K);
        ViewGroup viewGroup = (ViewGroup) view;
        m5609h(viewGroup);
        int[] iArr = this.f6193a.f6068c.f6159m0;
        if (iArr != null) {
            if (i10 < iArr.length) {
                view.setId(iArr[i10]);
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
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f6194b, viewGroup, false);
        AbstractC6482g.m5391v(viewInflate, this.f6193a.m5582j());
        return new b(viewInflate, this);
    }

    /* renamed from: g */
    public void m5608g(c cVar) {
        this.f6196d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f6193a.f6068c.f6156l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final void m5609h(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f6195c.m5573a() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.f6195c == GravityEnum.END && !m5605d() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.f6195c == GravityEnum.START && m5605d() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
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
