package com.zykj.merge.sketch.view;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.MoveProxy;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001bJ[\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000f0\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u001bJ\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u001bJ\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u001bJ\u0015\u00100\u001a\u00020(2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u000104¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u0010\u001bJ%\u0010;\u001a\u00020\u000f2\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\u000f2\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u000108¢\u0006\u0004\b=\u0010<J\r\u0010>\u001a\u000208¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000208¢\u0006\u0004\b@\u0010?J\r\u0010A\u001a\u00020\u000b¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u000b¢\u0006\u0004\bC\u0010BJ\u0015\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020(¢\u0006\u0004\bE\u0010*J\u0015\u0010F\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020(¢\u0006\u0004\bF\u0010*J\u000f\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bH\u0010IR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, m5110d2 = {"Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "path", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "Ld6/s;", "onSucceed", "", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "removePlayActionListener", "start", "()V", "pause", "waiting", RequestParameters.POSITION, "progress", "onSuccess", "throwable", "seekTo", "(ILr6/c;Lr6/c;)V", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "resume", "", "isRend", "(Z)V", "reset", "release", "destroy", "", "rate", "setRate", "(D)Z", "getPath", "()Ljava/lang/String;", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "getMoveMaxHeightTimes", "()I", "getMoveMaxWidthTimes", "isEnable", "setTranslateEnable", "setScaleEnable", "Landroid/graphics/Bitmap;", "getScreenBitmap", "()Landroid/graphics/Bitmap;", "Landroid/util/AttributeSet;", "Lcom/zykj/merge/sketch/listener/Play;", "mRecord", "Lcom/zykj/merge/sketch/listener/Play;", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MergeSketchPlayView extends RelativeLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private final AttributeSet attributeSet;

    @Nullable
    private Play mRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeSketchPlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.attributeSet = attributeSet;
    }

    public static /* synthetic */ void areaMoveEnd$default(MergeSketchPlayView mergeSketchPlayView, Float f, Float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f7 = null;
        }
        mergeSketchPlayView.areaMoveEnd(f, f7);
    }

    public static /* synthetic */ void areaMoving$default(MergeSketchPlayView mergeSketchPlayView, Float f, Float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f7 = null;
        }
        mergeSketchPlayView.areaMoving(f, f7);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void addPlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        Play play = this.mRecord;
        if (play != null) {
            play.addPlayActionListener(listener);
        }
    }

    public final void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    public final void areaMoveStart() {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoveStart();
        }
    }

    public final void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoving(horizontalProgress, verticalProgress);
        }
    }

    public final void destroy() {
        Play play = this.mRecord;
        if (play != null) {
            play.destroy();
        }
    }

    public final float getMoveHorizontalProgress() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0.0f;
        }
        AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveHorizontalProgress();
    }

    public final int getMoveMaxHeightTimes() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0;
        }
        AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveMaxHeightTimes();
    }

    public final int getMoveMaxWidthTimes() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0;
        }
        AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveMaxWidthTimes();
    }

    public final float getMoveVerticalProgress() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0.0f;
        }
        AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveVerticalProgress();
    }

    @Nullable
    public final String getPath() {
        Play play = this.mRecord;
        if (play != null) {
            return play.getPath();
        }
        return null;
    }

    @Nullable
    public final Bitmap getScreenBitmap() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return null;
        }
        AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getCurrentScreenBitmap();
    }

    public final void isRend(boolean isRend) {
        Play play = this.mRecord;
        if (play != null) {
            play.isRend(isRend);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:14:0x0065, B:16:0x006b, B:18:0x0072, B:20:0x0087, B:24:0x00a6, B:23:0x0098), top: B:67:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadData(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r10, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.merge.sketch.view.MergeSketchPlayView.loadData(java.lang.String, r6.c, r6.c):void"); // DEX body: android/错题本/smali_classes3/com/zykj/merge/sketch/view/MergeSketchPlayView.smali:783
    }

    public final void pause() {
        Play play = this.mRecord;
        if (play != null) {
            play.pause();
        }
    }

    public final void release() {
        Play play = this.mRecord;
        if (play != null) {
            play.release();
        }
    }

    public final void removePlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        Play play = this.mRecord;
        if (play != null) {
            play.removePlayActionListener(listener);
        }
    }

    public final void reset() {
        Play play = this.mRecord;
        if (play != null) {
            play.reset();
        }
    }

    public final void resume() {
        Play play = this.mRecord;
        if (play != null) {
            play.resume();
        }
    }

    public final void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        Play play = this.mRecord;
        if (play != null) {
            play.seekTo(position, onSuccess, onFailure);
        }
    }

    public final void setAreaMoveListener(@Nullable IAreaMoveListener listener) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setAreaMoveListener(listener);
        }
    }

    public final boolean setRate(double rate) {
        Play play = this.mRecord;
        if (play != null) {
            return play.setRate(rate);
        }
        return false;
    }

    public final void setScaleEnable(boolean isEnable) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setScaleEnable(isEnable);
        }
    }

    public final void setTranslateEnable(boolean isEnable) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC5830k.m5328e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setTranslateEnable(isEnable);
        }
    }

    public final void start() {
        Play play = this.mRecord;
        if (play != null) {
            play.start();
        }
    }

    @Nullable
    public final PlayStatus status() {
        Play play = this.mRecord;
        if (play != null) {
            return play.getPlayStatus();
        }
        return null;
    }

    public final void waiting() {
        Play play = this.mRecord;
        if (play != null) {
            play.waiting();
        }
    }
}
