package com.zykj.merge.sketch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public final class NewSketchProxyView extends RelativeLayout implements Play {
    public Map<Integer, View> _$_findViewCache;
    private String path;
    private final List<PlayStatusListener> playListener;
    private final SketchPlayerView sketchPlayView;

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
        AbstractC9979u.m20294g(context, "context");
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
            public void onProgress(long j10) {
                Iterator it = NewSketchProxyView.this.playListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onProgress(j10);
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

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(PlayStatusListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
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
    public void isRend(boolean z10) {
        this.sketchPlayView.isRend(z10);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(String path, InterfaceC9540l onSuccess, InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
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
        AbstractC9979u.m20294g(listener, "listener");
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
    public void seekTo(int i10, InterfaceC9540l onSuccess, InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        this.sketchPlayView.seekTo(i10, onSuccess, onFailure);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double d10) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        this.sketchPlayView.start();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public com.zykj.merge.sketch.constant.PlayStatus status() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.sketchPlayView.getPlayStatus().ordinal()];
        if (i10 == 1) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
        }
        if (i10 == 2) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE;
        }
        if (i10 == 3) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME;
        }
        if (i10 == 4) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_END;
        }
        if (i10 == 5) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_WAIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        this.sketchPlayView.waiting();
    }
}
