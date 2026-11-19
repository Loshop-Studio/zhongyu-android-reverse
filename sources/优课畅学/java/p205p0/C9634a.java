package p205p0;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: p0.a */
/* loaded from: classes3.dex */
public final class C9634a {

    /* renamed from: a */
    public final BaseQuickAdapter f19278a;

    /* renamed from: b */
    public final C9635b f19279b;

    /* renamed from: c */
    public final ListUpdateCallback f19280c;

    /* renamed from: d */
    public Executor f19281d;

    /* renamed from: e */
    public final Executor f19282e;

    /* renamed from: f */
    public final List f19283f;

    /* renamed from: p0.a$a */
    public static final class a implements Executor {

        /* renamed from: a */
        public final Handler f19284a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC9133u.m16133g(command, "command");
            this.f19284a.post(command);
        }
    }

    public C9634a(BaseQuickAdapter adapter, C9635b config) {
        AbstractC9133u.m16133g(adapter, "adapter");
        AbstractC9133u.m16133g(config, "config");
        this.f19278a = adapter;
        this.f19279b = config;
        this.f19280c = new BrvahListUpdateCallback(adapter);
        Executor aVar = new a();
        this.f19282e = aVar;
        Executor executorM18199b = config.m18199b();
        this.f19281d = executorM18199b != null ? executorM18199b : aVar;
        this.f19283f = new CopyOnWriteArrayList();
    }
}
