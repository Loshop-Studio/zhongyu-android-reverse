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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001eJ]\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\r0\u000b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00109¨\u0006:"}, m5110d2 = {"Lcom/zykj/merge/sketch/view/NewSketchProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "path", "Lkotlin/Function1;", "", "Ld6/s;", "onSuccess", "", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "getPath", "()Ljava/lang/String;", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "removePlayActionListener", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "start", "()V", "pause", "waiting", RequestParameters.POSITION, "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "throwable", "seekTo", "(ILr6/c;Lr6/c;)V", "resume", "reset", "release", "destroy", "", "isRend", "(Z)V", "", "rate", "setRate", "(D)Z", "Lcom/zykj/sketch/core/player/SketchPlayerView;", "sketchPlayView", "Lcom/zykj/sketch/core/player/SketchPlayerView;", "", "playListener", "Ljava/util/List;", "Ljava/lang/String;", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewSketchProxyView extends RelativeLayout implements Play {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private String path;

    @NotNull
    private final List<PlayStatusListener> playListener;

    @NotNull
    private final SketchPlayerView sketchPlayView;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public NewSketchProxyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
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

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playListener.add(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.sketchPlayView.destroy();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @Nullable
    public String getPath() {
        return this.path;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
        this.sketchPlayView.isRend(isRend);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(@NotNull String path, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) throws Exception {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
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
    public void removePlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() {
        this.sketchPlayView.start();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        this.sketchPlayView.seekTo(position, onSuccess, onFailure);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() {
        this.sketchPlayView.start();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @NotNull
    /* renamed from: status */
    public com.zykj.merge.sketch.constant.PlayStatus getPlayStatus() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.sketchPlayView.getPlayStatus().ordinal()];
        if (i == 1) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
        }
        if (i == 2) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE;
        }
        if (i == 3) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME;
        }
        if (i == 4) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_END;
        }
        if (i == 5) {
            return com.zykj.merge.sketch.constant.PlayStatus.RECORD_WAIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        this.sketchPlayView.waiting();
    }
}
