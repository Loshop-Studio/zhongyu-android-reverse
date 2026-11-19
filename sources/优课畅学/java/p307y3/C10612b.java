package p307y3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
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
import kotlin.jvm.internal.AbstractC9133u;
import p296x3.InterfaceC10494b;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10570l;

/* renamed from: y3.b */
/* loaded from: classes4.dex */
public final class C10612b extends RelativeLayout implements InterfaceC10494b {

    /* renamed from: a */
    public final SketchPlayerView f21038a;

    /* renamed from: b */
    public final List f21039b;

    /* renamed from: c */
    public String f21040c;

    /* renamed from: d */
    public Map f21041d;

    /* renamed from: y3.b$a */
    public static final class a implements PlayActionListener {
        public a() {
        }

        @Override // com.zykj.sketch.core.listener.PlayActionListener
        public void onPlayEnd() {
            Iterator it = C10612b.this.f21039b.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayEnd();
            }
            C10612b.this.m19811e();
        }

        @Override // com.zykj.sketch.core.listener.PlayActionListener
        public void onPlayPause() {
            Iterator it = C10612b.this.f21039b.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayPause();
            }
        }

        @Override // com.zykj.sketch.core.listener.PlayActionListener
        public void onPlayStart() {
            Iterator it = C10612b.this.f21039b.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayStart();
            }
        }

        @Override // com.zykj.sketch.core.listener.PlayActionListener
        public void onProgress(long j10) {
            Iterator it = C10612b.this.f21039b.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onProgress(j10);
            }
        }

        @Override // com.zykj.sketch.core.listener.PlayActionListener
        public void onWaitPlay() {
            Iterator it = C10612b.this.f21039b.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).mo13003a();
            }
        }
    }

    /* renamed from: y3.b$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21043a;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 2;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            iArr[PlayStatus.RECORD_WAIT.ordinal()] = 5;
            f21043a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10612b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f21041d = new LinkedHashMap();
        SketchPlayerView sketchPlayerView = new SketchPlayerView(context, attributeSet);
        this.f21038a = sketchPlayerView;
        this.f21039b = new ArrayList();
        addView(sketchPlayerView);
        sketchPlayerView.addPlayActionListener(new a());
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: a */
    public void mo9508a(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f21039b.add(listener);
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: b */
    public void mo9509b(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f21039b.remove(listener);
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: c */
    public boolean mo9510c(double d10) {
        return false;
    }

    @Override // p296x3.InterfaceC10494b
    public void destroy() {
        this.f21038a.destroy();
    }

    @Override // p296x3.InterfaceC10494b
    public String getPath() {
        return this.f21040c;
    }

    @Override // p296x3.InterfaceC10494b
    public void loadData(String path, InterfaceC10570l onSuccess, InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        this.f21040c = path;
        this.f21038a.loadData(path, onSuccess, onFailure);
    }

    @Override // p296x3.InterfaceC10494b
    public void pause() {
        this.f21038a.pause();
    }

    @Override // p296x3.InterfaceC10494b
    public void resume() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        this.f21038a.start();
    }

    @Override // p296x3.InterfaceC10494b
    public void seekTo(int i10, InterfaceC10570l onSuccess, InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        this.f21038a.seekTo(i10, onSuccess, onFailure);
    }

    @Override // p296x3.InterfaceC10494b
    public void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        this.f21038a.start();
    }

    @Override // p296x3.InterfaceC10494b
    public com.zykj.merge.sketch.constant.PlayStatus status() {
        int i10 = b.f21043a[this.f21038a.getPlayStatus().ordinal()];
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

    @Override // p296x3.InterfaceC10494b
    public void waiting() {
        this.f21038a.waiting();
    }

    /* renamed from: e */
    public void m19811e() {
    }

    @Override // p296x3.InterfaceC10494b
    public void release() {
    }
}
