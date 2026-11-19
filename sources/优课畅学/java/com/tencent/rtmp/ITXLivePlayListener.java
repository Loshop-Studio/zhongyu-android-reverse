package com.tencent.rtmp;

import android.os.Bundle;

/* loaded from: classes4.dex */
public interface ITXLivePlayListener {
    void onNetStatus(Bundle bundle);

    void onPlayEvent(int i10, Bundle bundle);
}
