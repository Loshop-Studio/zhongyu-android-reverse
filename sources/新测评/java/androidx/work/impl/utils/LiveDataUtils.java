package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1 */
    public class C48451<In> implements Observer<In> {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ Function val$mappingMethod;
        final /* synthetic */ MediatorLiveData val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        public C48451(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = function;
            this.val$outputLiveData = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable final In in) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C48451.this.val$lock) {
                        try {
                            ?? Apply = C48451.this.val$mappingMethod.apply(in);
                            C48451 c48451 = C48451.this;
                            Out out = c48451.mCurrentOutput;
                            if (out == 0 && Apply != 0) {
                                c48451.mCurrentOutput = Apply;
                                c48451.val$outputLiveData.postValue(Apply);
                            } else if (out != 0 && !out.equals(Apply)) {
                                C48451 c484512 = C48451.this;
                                c484512.mCurrentOutput = Apply;
                                c484512.val$outputLiveData.postValue(Apply);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C48451(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
