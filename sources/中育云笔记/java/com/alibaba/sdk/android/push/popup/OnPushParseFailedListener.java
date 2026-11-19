package com.alibaba.sdk.android.push.popup;

import android.content.Intent;

/* loaded from: classes3.dex */
public interface OnPushParseFailedListener {
    void onNotPushData(Intent intent);

    void onParseFailed(Intent intent);
}
