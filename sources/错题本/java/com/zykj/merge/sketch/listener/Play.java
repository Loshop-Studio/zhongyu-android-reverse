package com.zykj.merge.sketch.listener;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.merge.sketch.constant.PlayStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J]\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001bJ]\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\t0\u00042!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0004H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH&¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\tH&¢\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\tH&¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010'\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,¨\u0006-"}, m5110d2 = {"Lcom/zykj/merge/sketch/listener/Play;", "", "", "path", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "Ld6/s;", "onSuccess", "", "throwable", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "getPath", "()Ljava/lang/String;", "removePlayActionListener", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "start", "()V", "pause", "waiting", "resume", RequestParameters.POSITION, "progress", "seekTo", "(ILr6/c;Lr6/c;)V", "reset", "release", "destroy", "", "isRend", "(Z)V", "", "rate", "setRate", "(D)Z", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface Play {
    void addPlayActionListener(@NotNull PlayStatusListener listener);

    void destroy();

    @Nullable
    String getPath();

    void isRend(boolean isRend);

    void loadData(@NotNull String path, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure);

    void pause();

    void release();

    void removePlayActionListener(@NotNull PlayStatusListener listener);

    void reset();

    void resume();

    void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure);

    boolean setRate(double rate);

    void start();

    @NotNull
    /* renamed from: status */
    PlayStatus getPlayStatus();

    void waiting();
}
