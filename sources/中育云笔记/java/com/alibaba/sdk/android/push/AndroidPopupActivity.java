package com.alibaba.sdk.android.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.sdk.android.push.popup.OnPushParseFailedListener;
import com.alibaba.sdk.android.push.popup.PopupNotifyClick;
import com.alibaba.sdk.android.push.popup.PopupNotifyClickListener;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AndroidPopupActivity extends Activity implements OnPushParseFailedListener {
    private final PopupNotifyClick mPopupNotifyClick = new PopupNotifyClick(new MyPopupNotifyClickListener());

    public class MyPopupNotifyClickListener implements PopupNotifyClickListener, OnPushParseFailedListener {
        private MyPopupNotifyClickListener() {
        }

        @Override // com.alibaba.sdk.android.push.popup.OnPushParseFailedListener
        public void onNotPushData(Intent intent) {
            AndroidPopupActivity.this.onNotPushData(intent);
        }

        @Override // com.alibaba.sdk.android.push.popup.OnPushParseFailedListener
        public void onParseFailed(Intent intent) {
            AndroidPopupActivity.this.onParseFailed(intent);
        }

        @Override // com.alibaba.sdk.android.push.popup.PopupNotifyClickListener
        public void onSysNoticeOpened(String str, String str2, Map<String, String> map) {
            AndroidPopupActivity.this.onSysNoticeOpened(str, str2, map);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPopupNotifyClick.onCreate(this, getIntent());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mPopupNotifyClick.onNewIntent(intent);
    }

    @Override // com.alibaba.sdk.android.push.popup.OnPushParseFailedListener
    public void onNotPushData(Intent intent) {
    }

    @Override // com.alibaba.sdk.android.push.popup.OnPushParseFailedListener
    public void onParseFailed(Intent intent) {
    }

    public abstract void onSysNoticeOpened(String str, String str2, Map<String, String> map);
}
