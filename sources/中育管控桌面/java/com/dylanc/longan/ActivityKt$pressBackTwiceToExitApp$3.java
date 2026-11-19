package com.dylanc.longan;

import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m7880d2 = {"com/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "()V", "", "a", "J", "lastBackTime", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ActivityKt$pressBackTwiceToExitApp$3 extends OnBackPressedCallback {

    /* renamed from: a, reason: from kotlin metadata */
    public long lastBackTime;

    /* renamed from: b */
    public final /* synthetic */ long f3255b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f3256c;

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastBackTime <= this.f3255b) {
            ActivityKt.m3323b();
        } else {
            this.f3256c.invoke();
            this.lastBackTime = jCurrentTimeMillis;
        }
    }
}
