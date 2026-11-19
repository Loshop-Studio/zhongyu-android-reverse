package p155l4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.zykj.blackboard.bean.BackgroundLineConfig;

/* renamed from: l4.c */
/* loaded from: classes4.dex */
public interface InterfaceC8498c {
    /* renamed from: a */
    void mo6249a(Canvas canvas, Matrix matrix);

    BackgroundLineConfig getBackgroundLineConfig();

    int getMyBackgroundColor();

    void refresh();

    void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig);

    void setMatrix(Matrix matrix);

    void setMyBackgroundColor(int i10);
}
