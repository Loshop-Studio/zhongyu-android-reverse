package p143k5;

import androidx.hilt.work.HiltWorkerFactory;
import com.zykj.evaluation.App;
import com.zykj.evaluation.upload.OssTaskManger;

/* renamed from: k5.g */
/* loaded from: classes4.dex */
public abstract class AbstractC7887g {
    /* renamed from: a */
    public static void m13467a(App app, OssTaskManger ossTaskManger) {
        app.ossTaskManger = ossTaskManger;
    }

    /* renamed from: b */
    public static void m13468b(App app, HiltWorkerFactory hiltWorkerFactory) {
        app.workerFactory = hiltWorkerFactory;
    }
}
