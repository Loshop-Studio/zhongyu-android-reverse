package p118g6;

import androidx.hilt.work.HiltWorkerFactory;
import com.zykj.student.dialogue.App;
import com.zykj.student.dialogue.upload.OssTaskManger;

/* renamed from: g6.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8063g {
    /* renamed from: a */
    public static void m12809a(App app, OssTaskManger ossTaskManger) {
        app.ossTaskManger = ossTaskManger;
    }

    /* renamed from: b */
    public static void m12810b(App app, HiltWorkerFactory hiltWorkerFactory) {
        app.workerFactory = hiltWorkerFactory;
    }
}
