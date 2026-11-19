package com.xuexiang.xui.widget.dialog.strategy.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy;
import com.xuexiang.xui.widget.dialog.strategy.InputCallback;
import com.xuexiang.xui.widget.dialog.strategy.InputInfo;

/* loaded from: classes.dex */
public class MaterialDialogStrategy implements IDialogStrategy {
    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, String str3, final DialogInterface.OnClickListener onClickListener, String str4, final DialogInterface.OnClickListener onClickListener2) {
        return new MaterialDialog.Builder(context).title(str).content(str2).positiveText(str3).onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.3
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).negativeText(str4).onNegative(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).cancelable(false).autoDismiss(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, String[] strArr, final DialogInterface.OnClickListener onClickListener) {
        return new MaterialDialog.Builder(context).title(str).items(strArr).itemsCallback(new MaterialDialog.ListCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.11
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.ListCallback
            public void onSelection(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(materialDialog, i4);
                }
            }
        }).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showInputDialog(Context context, int i4, String str, String str2, InputInfo inputInfo, final InputCallback inputCallback, String str3, final DialogInterface.OnClickListener onClickListener, String str4, final DialogInterface.OnClickListener onClickListener2) {
        return new MaterialDialog.Builder(context).iconRes(i4).title(str).content(str2).inputType(inputInfo.getInputType()).input(inputInfo.getHint(), inputInfo.getPreFill(), inputInfo.isAllowEmptyInput(), new MaterialDialog.InputCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.10
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InputCallback
            public void onInput(MaterialDialog materialDialog, CharSequence charSequence) {
                InputCallback inputCallback2 = inputCallback;
                if (inputCallback2 != null) {
                    inputCallback2.onInput(materialDialog, charSequence);
                }
            }
        }).positiveText(str3).onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.9
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).negativeText(str4).onNegative(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.8
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).cancelable(false).autoDismiss(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, String[] strArr, int i4, final DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return new MaterialDialog.Builder(context).title(str).items(strArr).itemsCallbackSingleChoice(i4, new MaterialDialog.ListCallbackSingleChoice() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.13
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.ListCallbackSingleChoice
            public boolean onSelection(MaterialDialog materialDialog, View view, int i5, CharSequence charSequence) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 == null) {
                    return true;
                }
                onClickListener2.onClick(materialDialog, i5);
                return true;
            }
        }).positiveText(str2).negativeText(str3).cancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, int i4, String str, String str2, String str3, final DialogInterface.OnClickListener onClickListener) {
        return new MaterialDialog.Builder(context).iconRes(i4).title(str).content(str2).positiveText(str3).onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.1
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).cancelable(false).autoDismiss(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, int i4, final DialogInterface.OnClickListener onClickListener) {
        return new MaterialDialog.Builder(context).title(str).items(i4).itemsCallback(new MaterialDialog.ListCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.12
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.ListCallback
            public void onSelection(MaterialDialog materialDialog, View view, int i5, CharSequence charSequence) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(materialDialog, i5);
                }
            }
        }).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, int i4, int i5, final DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return new MaterialDialog.Builder(context).title(str).items(i4).itemsCallbackSingleChoice(i5, new MaterialDialog.ListCallbackSingleChoice() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.14
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.ListCallbackSingleChoice
            public boolean onSelection(MaterialDialog materialDialog, View view, int i6, CharSequence charSequence) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 == null) {
                    return true;
                }
                onClickListener2.onClick(materialDialog, i6);
                return true;
            }
        }).positiveText(str2).negativeText(str3).cancelable(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, String str, String str2, String str3) {
        return new MaterialDialog.Builder(context).title(str).content(str2).positiveText(str3).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, final DialogInterface.OnClickListener onClickListener, String str3, final DialogInterface.OnClickListener onClickListener2) {
        return new MaterialDialog.Builder(context).content(str).positiveText(str2).onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.5
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).negativeText(str3).onNegative(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.4
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).cancelable(false).autoDismiss(false).show();
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, final DialogInterface.OnClickListener onClickListener, String str3) {
        return new MaterialDialog.Builder(context).content(str).positiveText(str2).onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.7
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(materialDialog, dialogAction.ordinal());
                } else {
                    materialDialog.dismiss();
                }
            }
        }).negativeText(str3).onNegative(new MaterialDialog.SingleButtonCallback() { // from class: com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy.6
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
            public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                materialDialog.dismiss();
            }
        }).cancelable(false).autoDismiss(false).show();
    }
}
