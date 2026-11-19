package com.xuexiang.xui.widget.dialog.materialdialog;

import android.annotation.TargetApi;
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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDTintHelper;
import java.util.ArrayList;

/* loaded from: classes.dex */
class DefaultRvAdapter extends RecyclerView.AbstractC0562g<DefaultVH> {
    private InternalListCallback callback;
    private final MaterialDialog dialog;
    private final GravityEnum itemGravity;
    private final int layout;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.DefaultRvAdapter$1 */
    static /* synthetic */ class C21271 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$MaterialDialog$ListType */
        static final /* synthetic */ int[] f9684x106dfa0c;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f9684x106dfa0c = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9684x106dfa0c[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class DefaultVH extends RecyclerView.AbstractC0557b0 implements View.OnClickListener, View.OnLongClickListener {
        final DefaultRvAdapter adapter;
        final CompoundButton control;
        final TextView title;

        DefaultVH(View view, DefaultRvAdapter defaultRvAdapter) {
            super(view);
            this.control = (CompoundButton) view.findViewById(C2042R.id.md_control);
            this.title = (TextView) view.findViewById(C2042R.id.md_title);
            this.adapter = defaultRvAdapter;
            view.setOnClickListener(this);
            if (defaultRvAdapter.dialog.builder.listLongCallback != null) {
                view.setOnLongClickListener(this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.adapter.callback == null || getAdapterPosition() == -1) {
                return;
            }
            CharSequence charSequence = null;
            if (this.adapter.dialog.builder.items != null && getAdapterPosition() < this.adapter.dialog.builder.items.size()) {
                charSequence = this.adapter.dialog.builder.items.get(getAdapterPosition());
            }
            this.adapter.callback.onItemSelected(this.adapter.dialog, view, getAdapterPosition(), charSequence, false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.adapter.callback == null || getAdapterPosition() == -1) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.adapter.dialog.builder.items != null && getAdapterPosition() < this.adapter.dialog.builder.items.size()) {
                charSequence = this.adapter.dialog.builder.items.get(getAdapterPosition());
            }
            return this.adapter.callback.onItemSelected(this.adapter.dialog, view, getAdapterPosition(), charSequence, true);
        }
    }

    interface InternalListCallback {
        boolean onItemSelected(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence, boolean z3);
    }

    DefaultRvAdapter(MaterialDialog materialDialog, int i4) {
        this.dialog = materialDialog;
        this.layout = i4;
        this.itemGravity = materialDialog.builder.itemsGravity;
    }

    @TargetApi(17)
    private boolean isRTL() {
        return this.dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @TargetApi(17)
    private void setupGravity(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.itemGravity.getGravityInt() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.itemGravity == GravityEnum.END && !isRTL() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.itemGravity == GravityEnum.START && isRTL() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public int getItemCount() {
        ArrayList<CharSequence> arrayList = this.dialog.builder.items;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void setCallback(InternalListCallback internalListCallback) {
        this.callback = internalListCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public void onBindViewHolder(DefaultVH defaultVH, int i4) {
        View view = defaultVH.itemView;
        boolean zIsIn = ThemeUtils.isIn(Integer.valueOf(i4), this.dialog.builder.disabledIndices);
        int iAdjustAlpha = zIsIn ? ThemeUtils.adjustAlpha(this.dialog.builder.itemColor, 0.4f) : this.dialog.builder.itemColor;
        defaultVH.itemView.setEnabled(!zIsIn);
        int i5 = C21271.f9684x106dfa0c[this.dialog.listType.ordinal()];
        if (i5 == 1) {
            RadioButton radioButton = (RadioButton) defaultVH.control;
            MaterialDialog.Builder builder = this.dialog.builder;
            boolean z3 = builder.selectedIndex == i4;
            ColorStateList colorStateList = builder.choiceWidgetColor;
            if (colorStateList != null) {
                MDTintHelper.setTint(radioButton, colorStateList);
            } else {
                MDTintHelper.setTint(radioButton, builder.widgetColor);
            }
            radioButton.setChecked(z3);
            radioButton.setEnabled(!zIsIn);
        } else if (i5 == 2) {
            CheckBox checkBox = (CheckBox) defaultVH.control;
            boolean zContains = this.dialog.selectedIndicesList.contains(Integer.valueOf(i4));
            MaterialDialog.Builder builder2 = this.dialog.builder;
            ColorStateList colorStateList2 = builder2.choiceWidgetColor;
            if (colorStateList2 != null) {
                MDTintHelper.setTint(checkBox, colorStateList2);
            } else {
                MDTintHelper.setTint(checkBox, builder2.widgetColor);
            }
            checkBox.setChecked(zContains);
            checkBox.setEnabled(!zIsIn);
        }
        defaultVH.title.setText(this.dialog.builder.items.get(i4));
        defaultVH.title.setTextColor(iAdjustAlpha);
        MaterialDialog materialDialog = this.dialog;
        materialDialog.setTypeface(defaultVH.title, materialDialog.builder.regularFont);
        ViewGroup viewGroup = (ViewGroup) view;
        setupGravity(viewGroup);
        int[] iArr = this.dialog.builder.itemIds;
        if (iArr != null) {
            if (i4 < iArr.length) {
                view.setId(iArr[i4]);
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public DefaultVH onCreateViewHolder(ViewGroup viewGroup, int i4) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.layout, viewGroup, false);
        ThemeUtils.setBackgroundCompat(viewInflate, this.dialog.getListSelector());
        return new DefaultVH(viewInflate, this);
    }
}
