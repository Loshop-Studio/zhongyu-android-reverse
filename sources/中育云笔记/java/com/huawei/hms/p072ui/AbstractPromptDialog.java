package com.huawei.hms.p072ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes5.dex */
public abstract class AbstractPromptDialog extends AbstractDialog {
    @Override // com.huawei.hms.p072ui.AbstractDialog
    /* renamed from: f */
    public String mo8735f(Context context) {
        return null;
    }

    @Override // com.huawei.hms.p072ui.AbstractDialog
    public String onGetTitleString(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        return ResourceLoaderUtil.getString("hms_bindfaildlg_title");
    }
}
