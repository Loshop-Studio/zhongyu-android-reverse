package com.zykj.merge.sketch.view;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.MoveProxy;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10216d;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public final class MergeSketchPlayView extends RelativeLayout {
    public Map<Integer, View> _$_findViewCache;
    private final AttributeSet attributeSet;
    private Play mRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeSketchPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.attributeSet = attributeSet;
    }

    public static /* synthetic */ void areaMoveEnd$default(MergeSketchPlayView mergeSketchPlayView, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        mergeSketchPlayView.areaMoveEnd(f10, f11);
    }

    public static /* synthetic */ void areaMoving$default(MergeSketchPlayView mergeSketchPlayView, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        mergeSketchPlayView.areaMoving(f10, f11);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    public final void addPlayActionListener(PlayStatusListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        Play play = this.mRecord;
        if (play != null) {
            play.addPlayActionListener(listener);
        }
    }

    public final void areaMoveEnd(Float f10, Float f11) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoveEnd(f10, f11);
        }
    }

    public final void areaMoveStart() {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoveStart();
        }
    }

    public final void areaMoving(Float f10, Float f11) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).areaMoving(f10, f11);
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
        AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveHorizontalProgress();
    }

    public final int getMoveMaxHeightTimes() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0;
        }
        AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveMaxHeightTimes();
    }

    public final int getMoveMaxWidthTimes() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0;
        }
        AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveMaxWidthTimes();
    }

    public final float getMoveVerticalProgress() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return 0.0f;
        }
        AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getMoveVerticalProgress();
    }

    public final String getPath() {
        Play play = this.mRecord;
        if (play != null) {
            return play.getPath();
        }
        return null;
    }

    public final Bitmap getScreenBitmap() {
        Play play = this.mRecord;
        if (!(play instanceof MoveProxy)) {
            return null;
        }
        AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((MoveProxy) play).getCurrentScreenBitmap();
    }

    public final void isRend(boolean z10) {
        Play play = this.mRecord;
        if (play != null) {
            play.isRend(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:14:0x0063, B:16:0x0069, B:18:0x0070, B:20:0x0085, B:24:0x00a4, B:23:0x0096), top: B:67:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadData(java.lang.String r8, p181hd.InterfaceC9540l r9, p181hd.InterfaceC9540l r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.merge.sketch.view.MergeSketchPlayView.loadData(java.lang.String, hd.l, hd.l):void"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/merge/sketch/view/MergeSketchPlayView.smali:644
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

    public final void removePlayActionListener(PlayStatusListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
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

    public final void seekTo(int i10, InterfaceC9540l onSuccess, InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        Play play = this.mRecord;
        if (play != null) {
            play.seekTo(i10, onSuccess, onFailure);
        }
    }

    public final void setAreaMoveListener(InterfaceC10216d interfaceC10216d) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setAreaMoveListener(interfaceC10216d);
        }
    }

    public final boolean setRate(double d10) {
        Play play = this.mRecord;
        if (play != null) {
            return play.setRate(d10);
        }
        return false;
    }

    public final void setScaleEnable(boolean z10) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setScaleEnable(z10);
        }
    }

    public final void setTranslateEnable(boolean z10) {
        Play play = this.mRecord;
        if (play instanceof MoveProxy) {
            AbstractC9979u.m20292e(play, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((MoveProxy) play).setTranslateEnable(z10);
        }
    }

    public final void start() {
        Play play = this.mRecord;
        if (play != null) {
            play.start();
        }
    }

    public final PlayStatus status() {
        Play play = this.mRecord;
        if (play != null) {
            return play.status();
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
