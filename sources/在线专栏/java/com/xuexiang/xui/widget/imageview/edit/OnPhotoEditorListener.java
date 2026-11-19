package com.xuexiang.xui.widget.imageview.edit;

import android.view.View;

/* loaded from: classes.dex */
public interface OnPhotoEditorListener {
    void onAddViewListener(ViewType viewType, int i4);

    void onEditTextChangeListener(View view, String str, int i4);

    void onRemoveViewListener(ViewType viewType, int i4);

    void onStartViewChangeListener(ViewType viewType);

    void onStopViewChangeListener(ViewType viewType);
}
