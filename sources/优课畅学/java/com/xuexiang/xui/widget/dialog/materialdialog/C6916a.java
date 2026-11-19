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
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.ArrayList;
import p316z1.AbstractC10702b;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a */
/* loaded from: classes4.dex */
public class C6916a extends RecyclerView.Adapter {

    /* renamed from: a */
    public final MaterialDialog f7580a;

    /* renamed from: b */
    public final int f7581b;

    /* renamed from: c */
    public final GravityEnum f7582c;

    /* renamed from: d */
    public c f7583d;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7584a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f7584a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7584a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$b */
    public static class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a */
        public final CompoundButton f7585a;

        /* renamed from: b */
        public final TextView f7586b;

        /* renamed from: c */
        public final C6916a f7587c;

        public b(View view, C6916a c6916a) {
            super(view);
            this.f7585a = (CompoundButton) view.findViewById(R$id.md_control);
            this.f7586b = (TextView) view.findViewById(R$id.md_title);
            this.f7587c = c6916a;
            view.setOnClickListener(this);
            c6916a.f7580a.f7449c.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f7587c.f7583d == null || getAdapterPosition() == -1) {
                return;
            }
            this.f7587c.f7583d.mo6709a(this.f7587c.f7580a, view, getAdapterPosition(), (this.f7587c.f7580a.f7449c.f7543l == null || getAdapterPosition() >= this.f7587c.f7580a.f7449c.f7543l.size()) ? null : (CharSequence) this.f7587c.f7580a.f7449c.f7543l.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f7587c.f7583d == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.f7587c.f7583d.mo6709a(this.f7587c.f7580a, view, getAdapterPosition(), (this.f7587c.f7580a.f7449c.f7543l == null || getAdapterPosition() >= this.f7587c.f7580a.f7449c.f7543l.size()) ? null : (CharSequence) this.f7587c.f7580a.f7449c.f7543l.get(getAdapterPosition()), true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.a$c */
    public interface c {
        /* renamed from: a */
        boolean mo6709a(MaterialDialog materialDialog, View view, int i10, CharSequence charSequence, boolean z10);
    }

    public C6916a(MaterialDialog materialDialog, int i10) {
        this.f7580a = materialDialog;
        this.f7581b = i10;
        this.f7582c = materialDialog.f7449c.f7531f;
    }

    /* renamed from: e */
    public final boolean m6768e() {
        return this.f7580a.m6712g().m6752m().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        View view = bVar.itemView;
        boolean zM6475i = AbstractC6877g.m6475i(Integer.valueOf(i10), this.f7580a.f7449c.f7507M);
        int iM6467a = zM6475i ? AbstractC6877g.m6467a(this.f7580a.f7449c.f7528d0, 0.4f) : this.f7580a.f7449c.f7528d0;
        bVar.itemView.setEnabled(!zM6475i);
        int i11 = a.f7584a[this.f7580a.f7466t.ordinal()];
        if (i11 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f7585a;
            MaterialDialog.C6913g c6913g = this.f7580a.f7449c;
            boolean z10 = c6913g.f7503K == i10;
            ColorStateList colorStateList = c6913g.f7561u;
            if (colorStateList != null) {
                AbstractC10702b.m20015g(radioButton, colorStateList);
            } else {
                AbstractC10702b.m20014f(radioButton, c6913g.f7559t);
            }
            radioButton.setChecked(z10);
            radioButton.setEnabled(!zM6475i);
        } else if (i11 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f7585a;
            boolean zContains = this.f7580a.f7467u.contains(Integer.valueOf(i10));
            MaterialDialog.C6913g c6913g2 = this.f7580a.f7449c;
            ColorStateList colorStateList2 = c6913g2.f7561u;
            if (colorStateList2 != null) {
                AbstractC10702b.m20012d(checkBox, colorStateList2);
            } else {
                AbstractC10702b.m20011c(checkBox, c6913g2.f7559t);
            }
            checkBox.setChecked(zContains);
            checkBox.setEnabled(!zM6475i);
        }
        bVar.f7586b.setText((CharSequence) this.f7580a.f7449c.f7543l.get(i10));
        bVar.f7586b.setTextColor(iM6467a);
        MaterialDialog materialDialog = this.f7580a;
        materialDialog.m6726u(bVar.f7586b, materialDialog.f7449c.f7509O);
        ViewGroup viewGroup = (ViewGroup) view;
        m6772i(viewGroup);
        int[] iArr = this.f7580a.f7449c.f7556r0;
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
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f7581b, viewGroup, false);
        AbstractC6877g.m6489w(viewInflate, this.f7580a.m6716k());
        return new b(viewInflate, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f7580a.f7449c.f7543l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: h */
    public void m6771h(c cVar) {
        this.f7583d = cVar;
    }

    /* renamed from: i */
    public final void m6772i(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f7582c.m6706a() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.f7582c == GravityEnum.END && !m6768e() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.f7582c == GravityEnum.START && m6768e() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
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
