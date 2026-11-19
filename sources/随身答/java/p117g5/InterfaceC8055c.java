package p117g5;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.List;

/* renamed from: g5.c */
/* loaded from: classes4.dex */
public interface InterfaceC8055c extends InterfaceC8056d, InterfaceC8054b {
    /* renamed from: b */
    Matrix mo12794b();

    /* renamed from: c */
    RectF mo12795c();

    AbstractC8053a copy();

    /* renamed from: e */
    List mo12796e();

    /* renamed from: f */
    RectF mo12797f();

    /* renamed from: g */
    EzyCommand.CommandSource.CommandInfo.GraphData.C7084b mo12798g();

    String getId();

    InterfaceC8055c getParent();

    EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot();

    EzyGraphEnum.GraphEnum graphType();

    /* renamed from: i */
    RectF mo12799i(Matrix matrix);

    boolean isInRect(float f10, float f11, float f12);

    /* renamed from: j */
    void mo12800j(List list);

    /* renamed from: m */
    AbstractC8053a mo12801m(String str);

    /* renamed from: o */
    boolean mo12802o(float f10, float f11, float f12);

    void onDestroy();

    /* renamed from: q */
    void mo12803q(InterfaceC8055c interfaceC8055c);
}
