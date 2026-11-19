package p422y9;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.util.List;
import ma.InterfaceC10214b;
import ma.InterfaceC10215c;
import ma.InterfaceC10216d;
import ma.InterfaceC10217e;
import ma.InterfaceC10219g;
import ma.InterfaceC10221i;
import ma.InterfaceC10223k;
import p181hd.InterfaceC9540l;

/* renamed from: y9.n */
/* loaded from: classes5.dex */
public interface InterfaceC11935n {

    /* renamed from: y9.n$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ ImageGraph m26488a(InterfaceC11935n interfaceC11935n, Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            boolean z12 = z10;
            if ((i10 & 32) != 0) {
                z11 = true;
            }
            return interfaceC11935n.mo14454E(bitmap, str, positionEnum, scaleTypeEnum, z12, z11);
        }

        /* renamed from: b */
        public static /* synthetic */ ImageGraph m26489b(InterfaceC11935n interfaceC11935n, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return interfaceC11935n.mo14459e(str, positionEnum, scaleTypeEnum, z10);
        }

        /* renamed from: c */
        public static /* synthetic */ C5414d m26490c(InterfaceC11935n interfaceC11935n, String str, EzyPositionEnum.PositionEnum positionEnum, int i10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return interfaceC11935n.mo14472o(str, positionEnum, i10);
        }

        /* renamed from: d */
        public static /* synthetic */ void m26491d(InterfaceC11935n interfaceC11935n, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            interfaceC11935n.areaMoveEnd(f10, f11);
        }

        /* renamed from: e */
        public static /* synthetic */ void m26492e(InterfaceC11935n interfaceC11935n, InterfaceC5181c interfaceC5181c, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanPage");
            }
            if ((i10 & 1) != 0) {
                interfaceC5181c = null;
            }
            interfaceC11935n.mo14480v(interfaceC5181c);
        }
    }

    /* renamed from: A */
    ImageGraph mo14450A(String str);

    /* renamed from: B */
    void mo14451B(InterfaceC10214b interfaceC10214b);

    /* renamed from: C */
    void mo14452C(InterfaceC10217e interfaceC10217e);

    /* renamed from: D */
    void mo14453D(InterfaceC10214b interfaceC10214b);

    /* renamed from: E */
    ImageGraph mo14454E(Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11);

    /* renamed from: F */
    void mo14455F(List list);

    /* renamed from: a */
    void mo14456a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    List mo14457c();

    /* renamed from: d */
    void mo14458d();

    /* renamed from: e */
    ImageGraph mo14459e(String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10);

    /* renamed from: f */
    void mo14460f();

    /* renamed from: g */
    void mo14461g(int i10, BackgroundLineConfig backgroundLineConfig);

    int getBackgroundColor();

    float getMoveHorizontalProgress();

    float getMoveVerticalProgress();

    /* renamed from: h */
    void mo14462h(InterfaceC10219g interfaceC10219g);

    /* renamed from: i */
    boolean mo14463i();

    /* renamed from: j */
    float mo14464j();

    /* renamed from: k */
    void mo14466k(InterfaceC10221i interfaceC10221i);

    /* renamed from: l */
    void mo14467l(InterfaceC10215c interfaceC10215c);

    /* renamed from: m */
    boolean mo14469m();

    /* renamed from: n */
    void mo14470n(InterfaceC9540l interfaceC9540l);

    /* renamed from: o */
    C5414d mo14472o(String str, EzyPositionEnum.PositionEnum positionEnum, int i10);

    /* renamed from: p */
    void mo14474p(float f10, float f11, float f12);

    /* renamed from: q */
    void mo14475q(boolean z10);

    /* renamed from: r */
    void mo14476r();

    /* renamed from: s */
    void mo14477s();

    void save();

    void setAreaMoveListener(InterfaceC10216d interfaceC10216d);

    void stopRecord();

    /* renamed from: t */
    boolean mo14478t();

    /* renamed from: u */
    boolean mo14479u();

    /* renamed from: v */
    void mo14480v(InterfaceC5181c interfaceC5181c);

    /* renamed from: x */
    void mo14481x(InterfaceC10223k interfaceC10223k);

    /* renamed from: y */
    int mo14482y();

    /* renamed from: z */
    boolean mo14483z();
}
