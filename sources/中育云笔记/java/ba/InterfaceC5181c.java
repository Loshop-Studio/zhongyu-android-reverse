package ba;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.List;

/* renamed from: ba.c */
/* loaded from: classes5.dex */
public interface InterfaceC5181c extends InterfaceC5182d, InterfaceC5180b {
    /* renamed from: b */
    Matrix mo2714b();

    /* renamed from: c */
    AbstractC5179a mo2733c();

    /* renamed from: d */
    RectF mo2715d();

    /* renamed from: f */
    List mo2717f();

    /* renamed from: g */
    RectF mo2718g();

    String getId();

    InterfaceC5181c getParent();

    EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot();

    EzyGraphEnum.GraphEnum graphType();

    /* renamed from: h */
    EzyCommand.CommandSource.CommandInfo.GraphData.C8462b mo2719h();

    boolean isInRect(float f10, float f11, float f12);

    /* renamed from: j */
    RectF mo2721j(Matrix matrix);

    /* renamed from: k */
    void mo2722k(List list);

    /* renamed from: n */
    AbstractC5179a mo2723n(String str);

    void onDestroy();

    /* renamed from: q */
    boolean mo2725q(float f10, float f11, float f12);

    /* renamed from: r */
    void mo2726r(InterfaceC5181c interfaceC5181c);
}
