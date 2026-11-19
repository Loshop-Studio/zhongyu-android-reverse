package androidx.compose.p011ui.graphics;

import android.app.job.JobWorkItem;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.FileDescriptor;

/* renamed from: androidx.compose.ui.graphics.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2117e {
    /* renamed from: d */
    public static /* synthetic */ JobWorkItem m1294d(Intent intent) {
        return new JobWorkItem(intent);
    }

    /* renamed from: h */
    public static /* synthetic */ Typeface.Builder m1298h(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    /* renamed from: j */
    public static /* synthetic */ Typeface.Builder m1300j(File file) {
        return new Typeface.Builder(file);
    }

    /* renamed from: k */
    public static /* synthetic */ Typeface.Builder m1301k(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ AutofillId m1305o(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: p */
    public static /* synthetic */ void m1306p() {
    }
}
