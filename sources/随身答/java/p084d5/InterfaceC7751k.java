package p084d5;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.util.List;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p243s5.InterfaceC9474b;
import p243s5.InterfaceC9475c;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p243s5.InterfaceC9479g;
import p243s5.InterfaceC9481i;
import p243s5.InterfaceC9482j;

/* renamed from: d5.k */
/* loaded from: classes4.dex */
public interface InterfaceC7751k {

    /* renamed from: d5.k$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ ImageGraph m12097a(InterfaceC7751k interfaceC7751k, Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, boolean z10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 16) != 0) {
                z9 = false;
            }
            boolean z11 = z9;
            if ((i9 & 32) != 0) {
                z10 = true;
            }
            return interfaceC7751k.mo7816D(bitmap, str, positionEnum, scaleTypeEnum, z11, z10);
        }

        /* renamed from: b */
        public static /* synthetic */ ImageGraph m12098b(InterfaceC7751k interfaceC7751k, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 8) != 0) {
                z9 = false;
            }
            return interfaceC7751k.mo7821d(str, positionEnum, scaleTypeEnum, z9);
        }

        /* renamed from: c */
        public static /* synthetic */ C8101d m12099c(InterfaceC7751k interfaceC7751k, String str, EzyPositionEnum.PositionEnum positionEnum, int i9, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
            }
            if ((i10 & 4) != 0) {
                i9 = 0;
            }
            return interfaceC7751k.mo7838q(str, positionEnum, i9);
        }

        /* renamed from: d */
        public static /* synthetic */ void m12100d(InterfaceC7751k interfaceC7751k, Float f10, Float f11, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i9 & 1) != 0) {
                f10 = null;
            }
            if ((i9 & 2) != 0) {
                f11 = null;
            }
            interfaceC7751k.areaMoveEnd(f10, f11);
        }

        /* renamed from: e */
        public static /* synthetic */ void m12101e(InterfaceC7751k interfaceC7751k, InterfaceC8055c interfaceC8055c, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanPage");
            }
            if ((i9 & 1) != 0) {
                interfaceC8055c = null;
            }
            interfaceC7751k.mo7837p(interfaceC8055c);
        }
    }

    /* renamed from: A */
    List mo7813A(List list, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum);

    /* renamed from: B */
    boolean mo7814B();

    /* renamed from: C */
    ImageGraph mo7815C(String str);

    /* renamed from: D */
    ImageGraph mo7816D(Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, boolean z10);

    /* renamed from: E */
    void mo7817E(InterfaceC9479g interfaceC9479g);

    /* renamed from: F */
    void mo7818F(List list);

    /* renamed from: a */
    void mo7819a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    void mo7820c();

    /* renamed from: d */
    ImageGraph mo7821d(String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9);

    /* renamed from: e */
    void mo7822e(InterfaceC9482j interfaceC9482j);

    /* renamed from: f */
    void mo7823f(InterfaceC9481i interfaceC9481i);

    /* renamed from: g */
    void mo7824g(int i9, BackgroundLineConfig backgroundLineConfig);

    int getBackgroundColor();

    float getMoveHorizontalProgress();

    float getMoveVerticalProgress();

    /* renamed from: h */
    void mo7825h(InterfaceC9474b interfaceC9474b);

    /* renamed from: i */
    void mo7826i(InterfaceC9474b interfaceC9474b);

    /* renamed from: j */
    void mo7827j(InterfaceC9477e interfaceC9477e);

    /* renamed from: k */
    void mo7829k(InterfaceC9478f interfaceC9478f);

    /* renamed from: l */
    List mo7830l();

    /* renamed from: m */
    boolean mo7832m();

    /* renamed from: n */
    float mo7833n();

    /* renamed from: o */
    boolean mo7835o();

    /* renamed from: p */
    void mo7837p(InterfaceC8055c interfaceC8055c);

    /* renamed from: q */
    C8101d mo7838q(String str, EzyPositionEnum.PositionEnum positionEnum, int i9);

    /* renamed from: r */
    void mo7839r(float f10, float f11, float f12);

    /* renamed from: s */
    void mo7840s(boolean z9);

    void save();

    void setAreaMoveListener(InterfaceC9476d interfaceC9476d);

    void stopRecord();

    /* renamed from: t */
    void mo7841t();

    /* renamed from: u */
    void mo7842u();

    /* renamed from: v */
    boolean mo7843v();

    /* renamed from: w */
    boolean mo7844w();

    /* renamed from: y */
    int mo7845y();

    /* renamed from: z */
    void mo7846z(InterfaceC9475c interfaceC9475c);
}
