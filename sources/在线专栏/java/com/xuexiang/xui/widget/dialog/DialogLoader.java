package com.xuexiang.xui.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy;
import com.xuexiang.xui.widget.dialog.strategy.InputCallback;
import com.xuexiang.xui.widget.dialog.strategy.InputInfo;
import com.xuexiang.xui.widget.dialog.strategy.impl.MaterialDialogStrategy;

/* loaded from: classes.dex */
public class DialogLoader implements IDialogStrategy {
    private static volatile DialogLoader sInstance;
    private IDialogStrategy mStrategy = new MaterialDialogStrategy();

    private DialogLoader() {
    }

    public static DialogLoader getInstance() {
        if (sInstance == null) {
            synchronized (DialogLoader.class) {
                if (sInstance == null) {
                    sInstance = new DialogLoader();
                }
            }
        }
        return sInstance;
    }

    public DialogLoader setIDialogStrategy(IDialogStrategy iDialogStrategy) {
        this.mStrategy = iDialogStrategy;
        return this;
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        return this.mStrategy.showConfirmDialog(context, str, str2, str3, onClickListener, str4, onClickListener2);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, String[] strArr, DialogInterface.OnClickListener onClickListener) {
        return this.mStrategy.showContextMenuDialog(context, str, strArr, onClickListener);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showInputDialog(Context context, int i4, String str, String str2, InputInfo inputInfo, InputCallback inputCallback, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        return this.mStrategy.showInputDialog(context, i4, str, str2, inputInfo, inputCallback, str3, onClickListener, str4, onClickListener2);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, String[] strArr, int i4, DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return this.mStrategy.showSingleChoiceDialog(context, str, strArr, i4, onClickListener, str2, str3);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, int i4, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        return this.mStrategy.showTipDialog(context, i4, str, str2, str3, onClickListener);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        return this.mStrategy.showConfirmDialog(context, str, str2, onClickListener, str3, onClickListener2);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showContextMenuDialog(Context context, String str, int i4, DialogInterface.OnClickListener onClickListener) {
        return this.mStrategy.showContextMenuDialog(context, str, i4, onClickListener);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showSingleChoiceDialog(Context context, String str, int i4, int i5, DialogInterface.OnClickListener onClickListener, String str2, String str3) {
        return this.mStrategy.showSingleChoiceDialog(context, str, i4, i5, onClickListener, str2, str3);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showTipDialog(Context context, String str, String str2, String str3) {
        return this.mStrategy.showTipDialog(context, str, str2, str3);
    }

    @Override // com.xuexiang.xui.widget.dialog.strategy.IDialogStrategy
    public Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3) {
        return this.mStrategy.showConfirmDialog(context, str, str2, onClickListener, str3);
    }
}
