package com.zykj.merge.sketch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.core.player.SketchPlayerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J8\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016JV\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00192!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00100\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00100\u0018H\u0016J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m13413d2 = {"Lcom/zykj/merge/sketch/view/NewSketchProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "path", "", "playListener", "", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "sketchPlayView", "Lcom/zykj/sketch/core/player/SketchPlayerView;", "addPlayActionListener", "", "listener", "destroy", "getPath", "isRend", "", "loadData", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "", "pause", "release", "removePlayActionListener", "reset", "resume", "seekTo", RequestParameters.POSITION, "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "throwable", "setRate", "rate", "", "start", NotificationCompat.CATEGORY_STATUS, "Lcom/zykj/merge/sketch/constant/PlayStatus;", "waiting", "merge_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class NewSketchProxyView extends RelativeLayout implements Play {
    public Map<Integer, View> _$_findViewCache;
    private String path;
    private final List<PlayStatusListener> playListener;
    private final SketchPlayerView sketchPlayView;

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 2;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            iArr[PlayStatus.RECORD_WAIT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewSketchProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        SketchPlayerView sketchPlayerView = new SketchPlayerView(context, attributeSet);
        this.sketchPlayView = sketchPlayerView;
        this.playListener = new ArrayList();
        addView(sketchPlayerView);
        sketchPlayerView.addPlayActionListener(new PlayActionListener() { // from class: com.zykj.merge.sketch.view.NewSketchProxyView.1
            @Override // com.zykj.sketch.core.listener.PlayActionListener
            public void onPlayEnd() {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayEnd();
                }
                NewSketchProxyView.this.reset();
            }

            @Override // com.zykj.sketch.core.listener.PlayActionListener
            public void onPlayPause() {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayPause();
                }
            }

            @Override // com.zykj.sketch.core.listener.PlayActionListener
            public void onPlayStart() {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayStart();
                }
            }

            @Override // com.zykj.sketch.core.listener.PlayActionListener
            public void onProgress(long progress) {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onProgress(progress);
                }
            }

            @Override // com.zykj.sketch.core.listener.PlayActionListener
            public void onWaitPlay() {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayWait();
                }
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i9) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playListener.add(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.sketchPlayView.destroy();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public String getPath() {
        return this.path;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
        this.sketchPlayView.isRend(isRend);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(String path, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure) throws Exception {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.path = path;
        this.sketchPlayView.loadData(path, onSuccess, onFailure);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() {
        this.sketchPlayView.pause();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        this.sketchPlayView.start();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int position, Function1<? super Integer, Unit> onSuccess, Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.sketchPlayView.seekTo(position, onSuccess, onFailure);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        this.sketchPlayView.start();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public com.zykj.merge.sketch.constant.PlayStatus status() {
        int i9 = WhenMappings.$EnumSwitchMapping$0[this.sketchPlayView.getPlayStatus().ordinal()];
        if (i9 == 1) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
        }
        if (i9 == 2) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE;
        }
        if (i9 == 3) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME;
        }
        if (i9 == 4) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_END;
        }
        if (i9 == 5) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_WAIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        this.sketchPlayView.waiting();
    }
}
