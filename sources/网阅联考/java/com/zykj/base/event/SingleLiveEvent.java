package com.zykj.base.event;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.base.event.SingleLiveEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000eH\u0017J\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m5175d2 = {"Lcom/zykj/base/event/SingleLiveEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "value", "(Ljava/lang/Object;)V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", NotificationCompat.CATEGORY_CALL, "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", C3335ai.f1665aF, "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    private final AtomicBoolean mPending;

    public SingleLiveEvent() {
        this.mPending = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observe$lambda-0, reason: not valid java name */
    public static final void m11781observe$lambda0(SingleLiveEvent this$0, Observer observer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        if (this$0.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @MainThread
    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(LifecycleOwner owner, final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, new Observer() { // from class: o1.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvent.m11781observe$lambda0(this.f5024a, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(T t3) {
        this.mPending.set(true);
        super.setValue(t3);
    }

    public SingleLiveEvent(T t3) {
        super(t3);
        this.mPending = new AtomicBoolean(false);
    }
}
