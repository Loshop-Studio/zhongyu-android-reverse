package p296x3;

import com.zykj.merge.sketch.constant.PlayStatus;
import p300x7.InterfaceC10570l;

/* renamed from: x3.b */
/* loaded from: classes4.dex */
public interface InterfaceC10494b {
    /* renamed from: a */
    void mo9508a(InterfaceC10495c interfaceC10495c);

    /* renamed from: b */
    void mo9509b(InterfaceC10495c interfaceC10495c);

    /* renamed from: c */
    boolean mo9510c(double d10);

    void destroy();

    String getPath();

    void loadData(String str, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void pause();

    void release();

    void resume();

    void seekTo(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void start();

    PlayStatus status();

    void waiting();
}
