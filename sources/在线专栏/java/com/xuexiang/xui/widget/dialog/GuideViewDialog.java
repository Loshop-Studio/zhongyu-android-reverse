package com.xuexiang.xui.widget.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class GuideViewDialog extends AlertDialog {
    private LinearLayout mGuideViewLayout;
    private ImageView mImageView;
    private int mIndex;
    private int[] mResourceIdList;

    public GuideViewDialog(Context context) {
        super(context);
        this.mIndex = 0;
    }

    static /* synthetic */ int access$008(GuideViewDialog guideViewDialog) {
        int i4 = guideViewDialog.mIndex;
        guideViewDialog.mIndex = i4 + 1;
        return i4;
    }

    private void initView() {
        ImageView imageView = new ImageView(getContext());
        this.mImageView = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int[] iArr = this.mResourceIdList;
        if (iArr != null && iArr.length > 0) {
            this.mImageView.setImageResource(iArr[this.mIndex]);
            this.mImageView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.GuideViewDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (GuideViewDialog.this.mIndex == GuideViewDialog.this.mResourceIdList.length - 1) {
                        GuideViewDialog.this.dismiss();
                    } else {
                        GuideViewDialog.access$008(GuideViewDialog.this);
                        GuideViewDialog.this.mImageView.setImageResource(GuideViewDialog.this.mResourceIdList[GuideViewDialog.this.mIndex]);
                    }
                }
            });
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mGuideViewLayout = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.mGuideViewLayout.setOrientation(1);
        this.mGuideViewLayout.setGravity(17);
        this.mGuideViewLayout.addView(this.mImageView);
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        int i4 = this.mIndex;
        int[] iArr = this.mResourceIdList;
        if (i4 == iArr.length - 1) {
            super.dismiss();
            return;
        }
        int i5 = i4 + 1;
        this.mIndex = i5;
        this.mImageView.setImageResource(iArr[i5]);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setContentView(this.mGuideViewLayout);
    }

    public GuideViewDialog setDialogSize(int i4, int i5) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = i4;
            attributes.height = i5;
            window.setAttributes(attributes);
        }
        return this;
    }

    public GuideViewDialog setGravity(int i4) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = i4;
            window.setAttributes(attributes);
        }
        return this;
    }

    public void setResourseId(int[] iArr) {
        this.mResourceIdList = iArr;
    }

    public void show(int i4, int i5) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = i4;
        attributes.y = i5;
        window.setAttributes(attributes);
        show();
    }

    public GuideViewDialog(Context context, int i4) {
        super(context, i4);
        this.mIndex = 0;
    }

    public GuideViewDialog(Context context, int i4, int[] iArr) {
        super(context, i4);
        this.mIndex = 0;
        this.mResourceIdList = iArr;
    }

    public GuideViewDialog(Context context, int[] iArr) {
        super(context);
        this.mIndex = 0;
        this.mResourceIdList = iArr;
    }
}
