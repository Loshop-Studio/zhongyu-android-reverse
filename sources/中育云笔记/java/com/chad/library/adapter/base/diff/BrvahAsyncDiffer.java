package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9764r;
import p230l1.C10106c;

/* loaded from: classes3.dex */
public final class BrvahAsyncDiffer {

    /* renamed from: a */
    public final BaseQuickAdapter f5422a;

    /* renamed from: b */
    public final C10106c f5423b;

    /* renamed from: c */
    public final ListUpdateCallback f5424c;

    /* renamed from: d */
    public Executor f5425d;

    /* renamed from: e */
    public final Executor f5426e;

    /* renamed from: f */
    public final List f5427f;

    /* renamed from: g */
    public int f5428g;

    /* renamed from: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$a */
    public static final class ExecutorC5911a implements Executor {

        /* renamed from: c */
        public final Handler f5429c = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC9979u.m20294g(command, "command");
            this.f5429c.post(command);
        }
    }

    public BrvahAsyncDiffer(BaseQuickAdapter adapter, C10106c config) {
        AbstractC9979u.m20294g(adapter, "adapter");
        AbstractC9979u.m20294g(config, "config");
        this.f5422a = adapter;
        this.f5423b = config;
        this.f5424c = new BrvahListUpdateCallback(adapter);
        Executor executorC5911a = new ExecutorC5911a();
        this.f5426e = executorC5911a;
        Executor executorM21136c = config.m21136c();
        this.f5425d = executorM21136c != null ? executorM21136c : executorC5911a;
        this.f5427f = new CopyOnWriteArrayList();
    }

    /* renamed from: g */
    public static final void m4695g(final BrvahAsyncDiffer this$0, final List oldList, final List list, final int i10, final Runnable runnable) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(oldList, "$oldList");
        final DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i11, int i12) {
                Object obj = oldList.get(i11);
                Object obj2 = list.get(i12);
                if (obj != null && obj2 != null) {
                    return this$0.f5423b.m21135b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i11, int i12) {
                Object obj = oldList.get(i11);
                Object obj2 = list.get(i12);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : this$0.f5423b.m21135b().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i11, int i12) {
                Object obj = oldList.get(i11);
                Object obj2 = list.get(i12);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return this$0.f5423b.m21135b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return oldList.size();
            }
        });
        AbstractC9979u.m20293f(diffResultCalculateDiff, "@JvmOverloads\n    fun su…        }\n        }\n    }");
        this$0.f5425d.execute(new Runnable() { // from class: l1.b
            @Override // java.lang.Runnable
            public final void run() {
                BrvahAsyncDiffer.m4696h(this.f24154c, i10, list, diffResultCalculateDiff, runnable);
            }
        });
    }

    /* renamed from: h */
    public static final void m4696h(BrvahAsyncDiffer this$0, int i10, List list, DiffUtil.DiffResult result, Runnable runnable) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(result, "$result");
        if (this$0.f5428g == i10) {
            this$0.m4697d(list, result, runnable);
        }
    }

    /* renamed from: d */
    public final void m4697d(List list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List data = this.f5422a.getData();
        this.f5422a.setData$com_github_CymChad_brvah(list);
        diffResult.dispatchUpdatesTo(this.f5424c);
        m4698e(data, runnable);
    }

    /* renamed from: e */
    public final void m4698e(List list, Runnable runnable) {
        Iterator it = this.f5427f.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            this.f5422a.getData();
            throw null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: f */
    public final void m4699f(final List list, final Runnable runnable) {
        final int i10 = this.f5428g + 1;
        this.f5428g = i10;
        if (list == this.f5422a.getData()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final List data = this.f5422a.getData();
        if (list == null) {
            int size = this.f5422a.getData().size();
            this.f5422a.setData$com_github_CymChad_brvah(new ArrayList());
            this.f5424c.onRemoved(0, size);
            m4698e(data, runnable);
            return;
        }
        if (!this.f5422a.getData().isEmpty()) {
            this.f5423b.m21134a().execute(new Runnable() { // from class: l1.a
                @Override // java.lang.Runnable
                public final void run() {
                    BrvahAsyncDiffer.m4695g(this.f24149c, data, list, i10, runnable);
                }
            });
            return;
        }
        this.f5422a.setData$com_github_CymChad_brvah(list);
        this.f5424c.onInserted(0, list.size());
        m4698e(data, runnable);
    }
}
