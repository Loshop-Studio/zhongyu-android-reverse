package com.xuexiang.xui.widget.dialog.strategy.impl;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy;
import com.xuexiang.xui.widget.dialog.strategy.InputCallback;
import com.xuexiang.xui.widget.dialog.strategy.InputInfo;

/* loaded from: classes.dex */
public class AlertDialogStrategy implements IDialogStrategy {
    private int mThemeStyle;

    public AlertDialogStrategy() {
        this.mThemeStyle = C2042R.style.XUITheme_AlertDialog;
    }

    private AlertDialog.Builder getBuilder(Context context, int i4) {
        return i4 == -1 ? new AlertDialog.Builder(context, this.mThemeStyle) : new AlertDialog.Builder(context, this.mThemeStyle).setIcon(i4);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setMessage(str2).setPositiveButton(str3, onClickListener).setNegativeButton(str4, onClickListener2).setCancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, String[] strArr, DialogInterface.OnClickListener onClickListener) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setItems(strArr, onClickListener).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showInputDialog(Context context, int i4, String str, String str2, InputInfo inputInfo, final InputCallback inputCallback, String str3, final DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        FrameLayout frameLayout = new FrameLayout(context);
        final EditText editText = new EditText(context);
        editText.setInputType(inputInfo.getInputType());
        editText.setHint(inputInfo.getHint());
        editText.setText(inputInfo.getPreFill());
        frameLayout.addView(editText);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) editText.getLayoutParams();
        layoutParams.setMargins(DensityUtils.dp2px(context, 15.0f), 0, DensityUtils.dp2px(context, 15.0f), 0);
        editText.setLayoutParams(layoutParams);
        return getBuilder(context, i4).setTitle(str).setMessage(str2).setView(frameLayout).setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.AlertDialogStrategy.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(dialogInterface, i5);
                }
                InputCallback inputCallback2 = inputCallback;
                if (inputCallback2 != null) {
                    inputCallback2.onInput(dialogInterface, editText.getText().toString());
                }
            }
        }).setNegativeButton(str4, onClickListener2).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, String[] strArr, int i4, final DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setSingleChoiceItems(strArr, i4, new DialogInterface.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.AlertDialogStrategy.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i5);
                }
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, int i4, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        return getBuilder(context, i4).setTitle(str).setMessage(str2).setPositiveButton(str3, onClickListener).setCancelable(false).show();
    }

    public AlertDialogStrategy(int i4) {
        this.mThemeStyle = i4;
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, int i4, DialogInterface.OnClickListener onClickListener) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setItems(i4, onClickListener).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, int i4, int i5, final DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setSingleChoiceItems(i4, i5, new DialogInterface.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.AlertDialogStrategy.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i6) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i6);
                }
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, String str, String str2, String str3) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setTitle(str).setMessage(str2).setPositiveButton(str3, (DialogInterface.OnClickListener) null).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setMessage(str).setPositiveButton(str2, onClickListener).setNegativeButton(str3, onClickListener2).setCancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3) {
        return new AlertDialog.Builder(context, this.mThemeStyle).setMessage(str).setPositiveButton(str2, onClickListener).setNegativeButton(str3, (DialogInterface.OnClickListener) null).setCancelable(false).show();
    }
}
