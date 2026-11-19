package com.xuexiang.xui.widget.dialog.strategy;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public interface IDialogStrategy {
    public static final int NO_ICON = -1;

    Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3);

    Dialog showConfirmDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2);

    Dialog showConfirmDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2);

    Dialog showContextMenuDialog(Context context, String str, int i4, DialogInterface.OnClickListener onClickListener);

    Dialog showContextMenuDialog(Context context, String str, String[] strArr, DialogInterface.OnClickListener onClickListener);

    Dialog showInputDialog(Context context, int i4, String str, String str2, InputInfo inputInfo, InputCallback inputCallback, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2);

    Dialog showSingleChoiceDialog(Context context, String str, int i4, int i5, DialogInterface.OnClickListener onClickListener, String str2, String str3);

    Dialog showSingleChoiceDialog(Context context, String str, String[] strArr, int i4, DialogInterface.OnClickListener onClickListener, String str2, String str3);

    Dialog showTipDialog(Context context, int i4, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener);

    Dialog showTipDialog(Context context, String str, String str2, String str3);
}
