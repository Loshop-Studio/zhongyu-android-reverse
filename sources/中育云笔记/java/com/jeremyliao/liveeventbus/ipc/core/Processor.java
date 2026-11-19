package com.jeremyliao.liveeventbus.ipc.core;

import android.os.Bundle;

/* loaded from: classes5.dex */
public interface Processor {
    Object createFromBundle(Bundle bundle);

    boolean writeToBundle(Bundle bundle, Object obj);
}
