package p210q4;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.List;

/* renamed from: q4.c */
/* loaded from: classes4.dex */
public interface InterfaceC8888c extends InterfaceC8889d, InterfaceC8887b {
    /* renamed from: b */
    Matrix mo14993b();

    /* renamed from: c */
    AbstractC8886a mo6746c();

    /* renamed from: d */
    RectF mo14994d();

    /* renamed from: f */
    List mo14995f();

    /* renamed from: g */
    RectF mo14996g();

    String getId();

    InterfaceC8888c getParent();

    EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot();

    EzyGraphEnum.GraphEnum graphType();

    /* renamed from: h */
    EzyCommand.CommandSource.CommandInfo.GraphData.C6765b mo14997h();

    /* renamed from: i */
    void mo14998i(InterfaceC8888c interfaceC8888c);

    boolean isInRect(float f10, float f11, float f12);

    /* renamed from: j */
    RectF mo14999j(Matrix matrix);

    /* renamed from: k */
    void mo15000k(List list);

    /* renamed from: n */
    AbstractC8886a mo15001n(String str);

    void onDestroy();

    /* renamed from: p */
    boolean mo15002p(float f10, float f11, float f12);
}
