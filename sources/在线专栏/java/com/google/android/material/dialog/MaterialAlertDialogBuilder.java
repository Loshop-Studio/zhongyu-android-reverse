package com.google.android.material.dialog;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogC0101b;
import androidx.core.view.C0358u;
import com.google.android.material.C1371R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p088g.C2622d;

/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends DialogC0101b.a {
    private static final int DEF_STYLE_ATTR = C1371R.attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = C1371R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = C1371R.attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextWrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? contextWrap : new C2622d(contextWrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int getOverridingThemeResId(Context context, int i4) {
        return i4 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i4;
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public DialogC0101b create() {
        DialogC0101b dialogC0101bCreate = super.create();
        Window window = dialogC0101bCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(C0358u.m2058u(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(dialogC0101bCreate, this.backgroundInsets));
        return dialogC0101bCreate;
    }

    public Drawable getBackground() {
        return this.background;
    }

    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i4) {
        this.backgroundInsets.bottom = i4;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i4) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i4;
        } else {
            this.backgroundInsets.right = i4;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i4) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i4;
        } else {
            this.backgroundInsets.left = i4;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i4) {
        this.backgroundInsets.top = i4;
        return this;
    }

    public MaterialAlertDialogBuilder(Context context, int i4) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i4));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i5 = DEF_STYLE_ATTR;
        int i6 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i5, i6);
        int color = MaterialColors.getColor(context2, C1371R.attr.colorSurface, getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i5, i6);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= IGoodView.DEFAULT_TO_ALPHA) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setCancelable(boolean z3) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z3);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setIconAttribute(int i4) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i4);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setIcon(int i4) {
        return (MaterialAlertDialogBuilder) super.setIcon(i4);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setItems(int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setMessage(int i4) {
        return (MaterialAlertDialogBuilder) super.setMessage(i4);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNegativeButton(int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNeutralButton(int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setPositiveButton(int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setTitle(int i4) {
        return (MaterialAlertDialogBuilder) super.setTitle(i4);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setView(int i4) {
        return (MaterialAlertDialogBuilder) super.setView(i4);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setMultiChoiceItems(int i4, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i4, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setSingleChoiceItems(int i4, int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i4, i5, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i4, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i4, str, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogC0101b.a
    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i4, onClickListener);
    }
}
