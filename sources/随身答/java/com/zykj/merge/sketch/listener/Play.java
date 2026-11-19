package com.zykj.merge.sketch.listener;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.merge.sketch.constant.PlayStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&JV\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00030\u000eH&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&JV\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00030\u000eH&J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\u0003H&¨\u0006%"}, m13413d2 = {"Lcom/zykj/merge/sketch/listener/Play;", "", "addPlayActionListener", "", "listener", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "destroy", "getPath", "", "isRend", "", "loadData", "path", "onSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "onFailure", "", "throwable", "pause", "release", "removePlayActionListener", "reset", "resume", "seekTo", RequestParameters.POSITION, "progress", "setRate", "rate", "", "start", NotificationCompat.CATEGORY_STATUS, "Lcom/zykj/merge/sketch/constant/PlayStatus;", "waiting", "merge_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public interface Play {
    void addPlayActionListener(PlayStatusListener listener);

    void destroy();

    String getPath();

    void isRend(boolean isRend);

    void loadData(String path, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure);

    void pause();

    void release();

    void removePlayActionListener(PlayStatusListener listener);

    void reset();

    void resume();

    void seekTo(int position, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure);

    boolean setRate(double rate);

    void start();

    PlayStatus status();

    void waiting();
}
