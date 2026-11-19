package p177n4;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.util.List;
import p035c5.InterfaceC5119b;
import p035c5.InterfaceC5120c;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p035c5.InterfaceC5124g;
import p035c5.InterfaceC5126i;
import p035c5.InterfaceC5127j;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* renamed from: n4.i */
/* loaded from: classes4.dex */
public interface InterfaceC8629i {

    /* renamed from: n4.i$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ ImageGraph m14205a(InterfaceC8629i interfaceC8629i, Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 16) != 0) {
                z9 = false;
            }
            boolean z11 = z9;
            if ((i10 & 32) != 0) {
                z10 = true;
            }
            return interfaceC8629i.mo6706C(bitmap, str, positionEnum, scaleTypeEnum, z11, z10);
        }

        /* renamed from: b */
        public static /* synthetic */ ImageGraph m14206b(InterfaceC8629i interfaceC8629i, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 8) != 0) {
                z9 = false;
            }
            return interfaceC8629i.mo6713f(str, positionEnum, scaleTypeEnum, z9);
        }

        /* renamed from: c */
        public static /* synthetic */ C9008d m14207c(InterfaceC8629i interfaceC8629i, String str, EzyPositionEnum.PositionEnum positionEnum, int i10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return interfaceC8629i.mo6728r(str, positionEnum, i10);
        }

        /* renamed from: d */
        public static /* synthetic */ void m14208d(InterfaceC8629i interfaceC8629i, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            interfaceC8629i.areaMoveEnd(f10, f11);
        }

        /* renamed from: e */
        public static /* synthetic */ void m14209e(InterfaceC8629i interfaceC8629i, InterfaceC8888c interfaceC8888c, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanPage");
            }
            if ((i10 & 1) != 0) {
                interfaceC8888c = null;
            }
            interfaceC8629i.mo6716i(interfaceC8888c);
        }

        /* renamed from: f */
        public static /* synthetic */ Bitmap m14210f(InterfaceC8629i interfaceC8629i, int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11, InterfaceC8888c interfaceC8888c, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minScreenshot");
            }
            if ((i14 & 16) != 0) {
                z9 = false;
            }
            if ((i14 & 32) != 0) {
                z10 = false;
            }
            if ((i14 & 64) != 0) {
                z11 = false;
            }
            if ((i14 & 128) != 0) {
                interfaceC8888c = null;
            }
            return interfaceC8629i.mo6721l(i10, i11, i12, i13, z9, z10, z11, interfaceC8888c);
        }
    }

    /* renamed from: A */
    ImageGraph mo6704A(String str);

    /* renamed from: B */
    void mo6705B(InterfaceC5119b interfaceC5119b);

    /* renamed from: C */
    ImageGraph mo6706C(Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, boolean z10);

    /* renamed from: D */
    void mo6707D(InterfaceC5123f interfaceC5123f);

    /* renamed from: E */
    void mo6708E(List list);

    /* renamed from: a */
    void mo6709a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    ImageGraph mo6710c(Bitmap bitmap);

    /* renamed from: d */
    void mo6711d(InterfaceC5120c interfaceC5120c);

    /* renamed from: e */
    void mo6712e();

    /* renamed from: f */
    ImageGraph mo6713f(String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9);

    /* renamed from: g */
    void mo6714g(InterfaceC5124g interfaceC5124g);

    int getBackgroundColor();

    float getMoveHorizontalProgress();

    float getMoveVerticalProgress();

    /* renamed from: h */
    void mo6715h(InterfaceC5127j interfaceC5127j);

    /* renamed from: i */
    void mo6716i(InterfaceC8888c interfaceC8888c);

    /* renamed from: j */
    void mo6718j(int i10, BackgroundLineConfig backgroundLineConfig);

    /* renamed from: k */
    void mo6719k(InterfaceC5119b interfaceC5119b);

    /* renamed from: l */
    Bitmap mo6721l(int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11, InterfaceC8888c interfaceC8888c);

    /* renamed from: m */
    boolean mo6722m();

    /* renamed from: n */
    boolean mo6724n();

    /* renamed from: o */
    float mo6725o();

    /* renamed from: p */
    void mo6726p(InterfaceC5126i interfaceC5126i);

    /* renamed from: q */
    boolean mo6727q();

    /* renamed from: r */
    C9008d mo6728r(String str, EzyPositionEnum.PositionEnum positionEnum, int i10);

    /* renamed from: s */
    void mo6729s(float f10, float f11, float f12);

    void setAreaMoveListener(InterfaceC5121d interfaceC5121d);

    void stopRecord();

    /* renamed from: t */
    void mo6730t(boolean z9);

    /* renamed from: u */
    void mo6731u();

    /* renamed from: v */
    void mo6732v(InterfaceC5122e interfaceC5122e);

    /* renamed from: w */
    boolean mo6733w();

    /* renamed from: y */
    int mo6734y();

    /* renamed from: z */
    boolean mo6735z();
}
