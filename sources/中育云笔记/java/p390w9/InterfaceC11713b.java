package p390w9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.zykj.blackboard.bean.BackgroundLineConfig;

/* renamed from: w9.b */
/* loaded from: classes5.dex */
public interface InterfaceC11713b {
    /* renamed from: a */
    void mo13961a(Canvas canvas, Matrix matrix);

    BackgroundLineConfig getBackgroundLineConfig();

    int getMyBackgroundColor();

    void refresh();

    void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig);

    void setMatrix(Matrix matrix);

    void setMyBackgroundColor(int i10);
}
