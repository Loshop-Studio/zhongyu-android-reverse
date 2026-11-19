package p307q9;

import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10218f;
import ma.InterfaceC10222j;
import na.C10346i;
import p325rc.AbstractC10978w;

/* renamed from: q9.b */
/* loaded from: classes5.dex */
public final class C10762b {

    /* renamed from: B */
    public boolean f25909B;

    /* renamed from: C */
    public boolean f25910C;

    /* renamed from: P */
    public InterfaceC10218f f25923P;

    /* renamed from: a */
    public final int f25925a;

    /* renamed from: b */
    public final int f25926b;

    /* renamed from: j */
    public boolean f25934j;

    /* renamed from: n */
    public InterfaceC10222j f25938n;

    /* renamed from: u */
    public int f25945u;

    /* renamed from: c */
    public int f25927c = 3;

    /* renamed from: d */
    public boolean f25928d = true;

    /* renamed from: e */
    public int f25929e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f */
    public int f25930f = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: g */
    public float f25931g = 5.0f;

    /* renamed from: h */
    public float f25932h = 5.0f;

    /* renamed from: i */
    public float f25933i = 40.0f;

    /* renamed from: k */
    public float f25935k = 30.0f;

    /* renamed from: l */
    public float f25936l = 15.0f;

    /* renamed from: m */
    public EzyModeEnum.ModeEnum f25937m = EzyModeEnum.ModeEnum.ACTION_WRITING;

    /* renamed from: o */
    public RectF f25939o = new RectF(0.0f, 0.0f, 400.0f, 100.0f);

    /* renamed from: p */
    public String f25940p = "请输入文字";

    /* renamed from: q */
    public float f25941q = 28.0f;

    /* renamed from: r */
    public float f25942r = 20.0f;

    /* renamed from: s */
    public float f25943s = 48.0f;

    /* renamed from: t */
    public int f25944t = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: v */
    public final BackgroundLineConfig f25946v = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);

    /* renamed from: w */
    public int f25947w = SupportMenu.CATEGORY_MASK;

    /* renamed from: x */
    public float f25948x = 20.0f;

    /* renamed from: y */
    public float f25949y = 50.0f;

    /* renamed from: z */
    public final C10764d f25950z = new C10764d(false, false, false, false, false, 0, 0, 127, null);

    /* renamed from: A */
    public float f25908A = 50.0f;

    /* renamed from: D */
    public List f25911D = AbstractC10978w.m24136n();

    /* renamed from: E */
    public int f25912E = -1;

    /* renamed from: F */
    public final float f25913F = 60.0f;

    /* renamed from: G */
    public float f25914G = 36.0f;

    /* renamed from: H */
    public List f25915H = AbstractC10978w.m24139q(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f));

    /* renamed from: I */
    public List f25916I = AbstractC10978w.m24139q(Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), -1118482, -46799, -18386, -12531200, -13395457, -3782145, -43567);

    /* renamed from: J */
    public List f25917J = AbstractC10978w.m24139q(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f));

    /* renamed from: K */
    public float f25918K = 0.5f;

    /* renamed from: L */
    public GeometryActionEnum f25919L = GeometryActionEnum.RECTANGLE;

    /* renamed from: M */
    public float f25920M = 3.0f;

    /* renamed from: N */
    public int f25921N = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: O */
    public float f25922O = 36.0f;

    /* renamed from: Q */
    public boolean f25924Q = true;

    /* renamed from: q9.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25951a;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 5;
            f25951a = iArr;
        }
    }

    public C10762b(int i10, int i11) {
        this.f25925a = i10;
        this.f25926b = i11;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m22856a0(C10762b c10762b, boolean z10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 30.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 15.0f;
        }
        c10762b.m22882Z(z10, f10, f11);
    }

    /* renamed from: A */
    public final int m22857A() {
        return this.f25929e;
    }

    /* renamed from: B */
    public final float m22858B() {
        return this.f25935k;
    }

    /* renamed from: C */
    public final float m22859C() {
        return this.f25936l;
    }

    /* renamed from: D */
    public final float m22860D() {
        return this.f25932h;
    }

    /* renamed from: E */
    public final float m22861E() {
        return this.f25913F;
    }

    /* renamed from: F */
    public final List m22862F() {
        return this.f25911D;
    }

    /* renamed from: G */
    public final List m22863G() {
        return this.f25917J;
    }

    /* renamed from: H */
    public final float m22864H() {
        return this.f25914G;
    }

    /* renamed from: I */
    public final List m22865I() {
        return this.f25916I;
    }

    /* renamed from: J */
    public final List m22866J() {
        return this.f25915H;
    }

    /* renamed from: K */
    public final InterfaceC10222j m22867K() {
        return this.f25938n;
    }

    /* renamed from: L */
    public final boolean m22868L() {
        return this.f25924Q;
    }

    /* renamed from: M */
    public final int m22869M() {
        return this.f25925a;
    }

    /* renamed from: N */
    public final boolean m22870N() {
        return this.f25934j;
    }

    /* renamed from: O */
    public final boolean m22871O() {
        return this.f25928d;
    }

    /* renamed from: P */
    public final boolean m22872P() {
        return this.f25910C;
    }

    /* renamed from: Q */
    public final boolean m22873Q() {
        return this.f25909B;
    }

    /* renamed from: R */
    public final void m22874R(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f25940p = str;
    }

    /* renamed from: S */
    public final void m22875S(int i10) {
        this.f25944t = i10;
    }

    /* renamed from: T */
    public final void m22876T(float f10) {
        this.f25943s = f10;
    }

    /* renamed from: U */
    public final void m22877U(float f10) {
        this.f25942r = f10;
    }

    /* renamed from: V */
    public final void m22878V(float f10) {
        this.f25941q = f10;
    }

    /* renamed from: W */
    public final void m22879W(int i10) {
        this.f25945u = i10;
    }

    /* renamed from: X */
    public final void m22880X(int i10) {
        this.f25930f = i10;
    }

    /* renamed from: Y */
    public final void m22881Y(float f10) {
        this.f25931g = f10;
    }

    /* renamed from: Z */
    public final void m22882Z(boolean z10, float f10, float f11) {
        if (this.f25934j != z10) {
            C10346i.f24652a.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f25934j = z10;
        this.f25935k = f10;
        this.f25936l = f11;
    }

    /* renamed from: a */
    public final String m22883a() {
        return this.f25940p;
    }

    /* renamed from: b */
    public final int m22884b() {
        return this.f25944t;
    }

    /* renamed from: b0 */
    public final void m22885b0(float f10) {
        this.f25933i = f10;
    }

    /* renamed from: c */
    public final float m22886c() {
        return this.f25943s;
    }

    /* renamed from: c0 */
    public final void m22887c0(boolean z10) {
        if (this.f25928d != z10) {
            C10346i c10346i = C10346i.f24652a;
            c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
            c10346i.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f25928d = z10;
    }

    /* renamed from: d */
    public final float m22888d() {
        return this.f25942r;
    }

    /* renamed from: d0 */
    public final void m22889d0(GeometryActionEnum geometryActionEnum) {
        AbstractC9979u.m20294g(geometryActionEnum, "<set-?>");
        this.f25919L = geometryActionEnum;
    }

    /* renamed from: e */
    public final float m22890e() {
        return this.f25941q;
    }

    /* renamed from: e0 */
    public final void m22891e0(boolean z10) {
        this.f25909B = z10;
    }

    /* renamed from: f */
    public final RectF m22892f() {
        return this.f25939o;
    }

    /* renamed from: f0 */
    public final void m22893f0(InterfaceC10218f interfaceC10218f) {
        this.f25923P = interfaceC10218f;
    }

    /* renamed from: g */
    public final AbstractC10761a m22894g() {
        return null;
    }

    /* renamed from: g0 */
    public final void m22895g0(int i10) {
        this.f25927c = i10;
    }

    /* renamed from: h */
    public final int m22896h() {
        return this.f25945u;
    }

    /* renamed from: h0 */
    public final void m22897h0(EzyModeEnum.ModeEnum mode) {
        AbstractC9979u.m20294g(mode, "mode");
        int i10 = a.f25951a[mode.ordinal()];
        if (i10 == 1) {
            C10346i c10346i = C10346i.f24652a;
            c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
            c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
        } else if (i10 != 2) {
            if (i10 == 3) {
                C10346i c10346i2 = C10346i.f24652a;
                c10346i2.m21640b(EventKey.DELETE_ACTION);
                c10346i2.m21640b(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 4) {
                C10346i c10346i3 = C10346i.f24652a;
                c10346i3.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                c10346i3.m21640b(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 5) {
                C10346i.f24652a.m21640b(EventKey.WRITE_NEW_GROUP);
            }
        } else if (this.f25937m != mode) {
            C10346i.f24652a.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f25937m = mode;
    }

    /* renamed from: i */
    public final int m22898i() {
        return this.f25912E;
    }

    /* renamed from: i0 */
    public final void m22899i0(int i10) {
        if (i10 != this.f25929e) {
            C10346i c10346i = C10346i.f24652a;
            c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
            c10346i.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f25929e = i10;
    }

    /* renamed from: j */
    public final BackgroundLineConfig m22900j() {
        return this.f25946v;
    }

    /* renamed from: j0 */
    public final void m22901j0(float f10) {
        if (f10 != this.f25932h) {
            C10346i c10346i = C10346i.f24652a;
            c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
            c10346i.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f25932h = f10;
    }

    /* renamed from: k */
    public final int m22902k() {
        return this.f25930f;
    }

    /* renamed from: k0 */
    public final void m22903k0(float f10) {
        this.f25914G = f10;
    }

    /* renamed from: l */
    public final float m22904l() {
        return this.f25931g;
    }

    /* renamed from: l0 */
    public final void m22905l0(InterfaceC10222j interfaceC10222j) {
        this.f25938n = interfaceC10222j;
    }

    /* renamed from: m */
    public final int m22906m() {
        return this.f25947w;
    }

    /* renamed from: n */
    public final float m22907n() {
        return this.f25949y;
    }

    /* renamed from: o */
    public final float m22908o() {
        return this.f25948x;
    }

    /* renamed from: p */
    public final float m22909p() {
        return this.f25933i;
    }

    /* renamed from: q */
    public final GeometryActionEnum m22910q() {
        return this.f25919L;
    }

    /* renamed from: r */
    public final float m22911r() {
        return this.f25922O;
    }

    /* renamed from: s */
    public final int m22912s() {
        return this.f25921N;
    }

    /* renamed from: t */
    public final float m22913t() {
        return this.f25920M;
    }

    /* renamed from: u */
    public final int m22914u() {
        return this.f25926b;
    }

    /* renamed from: v */
    public final float m22915v() {
        return this.f25918K;
    }

    /* renamed from: w */
    public final InterfaceC10218f m22916w() {
        return this.f25923P;
    }

    /* renamed from: x */
    public final int m22917x() {
        return this.f25927c;
    }

    /* renamed from: y */
    public final EzyModeEnum.ModeEnum m22918y() {
        return this.f25937m;
    }

    /* renamed from: z */
    public final C10764d m22919z() {
        return this.f25950z;
    }
}
