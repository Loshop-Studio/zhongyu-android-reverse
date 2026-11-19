package com.zykj.sketch.core.listener;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.sketch.core.data.PlayStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&JV\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\r2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JV\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000e2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\r2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&¨\u0006\u001b"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/IUserPlay;", "", "addPlayActionListener", "", "listener", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "destroy", "getPlayStatus", "Lcom/zykj/sketch/core/data/PlayStatus;", "loadData", "path", "", "onSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "onFailure", "", "throwable", "pause", "removePlayActionListener", "seekTo", RequestParameters.POSITION, "start", "waiting", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface IUserPlay {
    void addPlayActionListener(PlayActionListener listener);

    void destroy();

    PlayStatus getPlayStatus();

    void loadData(String path, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure);

    void pause();

    void removePlayActionListener(PlayActionListener listener);

    void seekTo(int position, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure);

    void start();

    void waiting();
}
