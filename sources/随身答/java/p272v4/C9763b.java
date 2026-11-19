package p272v4;

import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import p223q5.AbstractC9361a;
import p253t5.InterfaceC9615a;
import p253t5.InterfaceC9616b;
import p253t5.InterfaceC9617c;
import p263u5.C9690i;

/* renamed from: v4.b */
/* loaded from: classes4.dex */
public final class C9763b {

    /* renamed from: C */
    public boolean f17304C;

    /* renamed from: D */
    public boolean f17305D;

    /* renamed from: E */
    public InterfaceC9616b f17306E;

    /* renamed from: Q */
    public List f17318Q;

    /* renamed from: R */
    public Function1 f17319R;

    /* renamed from: S */
    public InterfaceC9615a f17320S;

    /* renamed from: a */
    public final int f17321a;

    /* renamed from: b */
    public final int f17322b;

    /* renamed from: j */
    public boolean f17330j;

    /* renamed from: n */
    public InterfaceC9617c f17334n;

    /* renamed from: u */
    public int f17341u;

    /* renamed from: c */
    public int f17323c = 3;

    /* renamed from: d */
    public boolean f17324d = true;

    /* renamed from: e */
    public int f17325e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f */
    public int f17326f = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: g */
    public float f17327g = 5.0f;

    /* renamed from: h */
    public float f17328h = 5.0f;

    /* renamed from: i */
    public float f17329i = 40.0f;

    /* renamed from: k */
    public float f17331k = 30.0f;

    /* renamed from: l */
    public float f17332l = 15.0f;

    /* renamed from: m */
    public EzyModeEnum.ModeEnum f17333m = EzyModeEnum.ModeEnum.ACTION_WRITING;

    /* renamed from: o */
    public RectF f17335o = new RectF(0.0f, 0.0f, 400.0f, 100.0f);

    /* renamed from: p */
    public String f17336p = "请输入文字";

    /* renamed from: q */
    public float f17337q = 28.0f;

    /* renamed from: r */
    public float f17338r = 20.0f;

    /* renamed from: s */
    public float f17339s = 48.0f;

    /* renamed from: t */
    public int f17340t = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: v */
    public final BackgroundLineConfig f17342v = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);

    /* renamed from: w */
    public int f17343w = -1;

    /* renamed from: x */
    public int f17344x = SupportMenu.CATEGORY_MASK;

    /* renamed from: y */
    public float f17345y = 20.0f;

    /* renamed from: z */
    public float f17346z = 50.0f;

    /* renamed from: A */
    public final C9765d f17302A = new C9765d(false, false, false, false, false, 0, 0, WorkQueueKt.MASK, null);

    /* renamed from: B */
    public float f17303B = 50.0f;

    /* renamed from: F */
    public List f17307F = AbstractC9361a.m15336b();

    /* renamed from: G */
    public List f17308G = AbstractC9361a.m15336b();

    /* renamed from: H */
    public final float f17309H = 60.0f;

    /* renamed from: I */
    public float f17310I = 36.0f;

    /* renamed from: J */
    public float f17311J = 0.5f;

    /* renamed from: K */
    public GeometryActionEnum f17312K = GeometryActionEnum.RECTANGLE;

    /* renamed from: L */
    public float f17313L = 3.0f;

    /* renamed from: M */
    public int f17314M = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: N */
    public float f17315N = 36.0f;

    /* renamed from: O */
    public List f17316O = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)});

    /* renamed from: P */
    public List f17317P = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)});

    /* renamed from: v4.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17347a;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 5;
            f17347a = iArr;
        }
    }

    public C9763b(int i9, int i10) {
        this.f17321a = i9;
        this.f17322b = i10;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m16449d0(C9763b c9763b, boolean z9, float f10, float f11, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            f10 = 30.0f;
        }
        if ((i9 & 4) != 0) {
            f11 = 15.0f;
        }
        c9763b.m16481c0(z9, f10, f11);
    }

    /* renamed from: A */
    public final float m16450A() {
        return this.f17303B;
    }

    /* renamed from: B */
    public final int m16451B() {
        return this.f17325e;
    }

    /* renamed from: C */
    public final float m16452C() {
        return this.f17331k;
    }

    /* renamed from: D */
    public final float m16453D() {
        return this.f17332l;
    }

    /* renamed from: E */
    public final float m16454E() {
        return this.f17328h;
    }

    /* renamed from: F */
    public final float m16455F() {
        return this.f17309H;
    }

    /* renamed from: G */
    public final InterfaceC9615a m16456G() {
        return this.f17320S;
    }

    /* renamed from: H */
    public final Function1 m16457H() {
        return this.f17319R;
    }

    /* renamed from: I */
    public final List m16458I() {
        return this.f17318Q;
    }

    /* renamed from: J */
    public final float m16459J() {
        return this.f17310I;
    }

    /* renamed from: K */
    public final List m16460K() {
        return this.f17307F;
    }

    /* renamed from: L */
    public final List m16461L() {
        return this.f17308G;
    }

    /* renamed from: M */
    public final List m16462M(boolean z9) {
        return z9 ? this.f17317P : this.f17316O;
    }

    /* renamed from: N */
    public final List m16463N() {
        return this.f17316O;
    }

    /* renamed from: O */
    public final InterfaceC9617c m16464O() {
        return this.f17334n;
    }

    /* renamed from: P */
    public final int m16465P() {
        return this.f17321a;
    }

    /* renamed from: Q */
    public final boolean m16466Q() {
        return this.f17330j;
    }

    /* renamed from: R */
    public final boolean m16467R() {
        return this.f17324d;
    }

    /* renamed from: S */
    public final boolean m16468S() {
        return this.f17305D;
    }

    /* renamed from: T */
    public final boolean m16469T() {
        return this.f17304C;
    }

    /* renamed from: U */
    public final void m16470U(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17336p = str;
    }

    /* renamed from: V */
    public final void m16471V(int i9) {
        this.f17340t = i9;
    }

    /* renamed from: W */
    public final void m16472W(float f10) {
        this.f17339s = f10;
    }

    /* renamed from: X */
    public final void m16473X(float f10) {
        this.f17338r = f10;
    }

    /* renamed from: Y */
    public final void m16474Y(float f10) {
        this.f17337q = f10;
    }

    /* renamed from: Z */
    public final void m16475Z(int i9) {
        this.f17341u = i9;
    }

    /* renamed from: a */
    public final String m16476a() {
        return this.f17336p;
    }

    /* renamed from: a0 */
    public final void m16477a0(int i9) {
        this.f17326f = i9;
    }

    /* renamed from: b */
    public final int m16478b() {
        return this.f17340t;
    }

    /* renamed from: b0 */
    public final void m16479b0(float f10) {
        this.f17327g = f10;
    }

    /* renamed from: c */
    public final float m16480c() {
        return this.f17339s;
    }

    /* renamed from: c0 */
    public final void m16481c0(boolean z9, float f10, float f11) {
        if (this.f17330j != z9) {
            C9690i.f17127a.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f17330j = z9;
        this.f17331k = f10;
        this.f17332l = f11;
    }

    /* renamed from: d */
    public final float m16482d() {
        return this.f17338r;
    }

    /* renamed from: e */
    public final float m16483e() {
        return this.f17337q;
    }

    /* renamed from: e0 */
    public final void m16484e0(float f10) {
        this.f17329i = f10;
    }

    /* renamed from: f */
    public final RectF m16485f() {
        return this.f17335o;
    }

    /* renamed from: f0 */
    public final void m16486f0(boolean z9) {
        if (this.f17324d != z9) {
            C9690i c9690i = C9690i.f17127a;
            c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
            c9690i.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f17324d = z9;
    }

    /* renamed from: g */
    public final AbstractC9762a m16487g() {
        return null;
    }

    /* renamed from: g0 */
    public final void m16488g0(GeometryActionEnum geometryActionEnum) {
        Intrinsics.checkNotNullParameter(geometryActionEnum, "<set-?>");
        this.f17312K = geometryActionEnum;
    }

    /* renamed from: h */
    public final int m16489h() {
        return this.f17341u;
    }

    /* renamed from: h0 */
    public final void m16490h0(int i9) {
        this.f17314M = i9;
    }

    /* renamed from: i */
    public final int m16491i() {
        return this.f17343w;
    }

    /* renamed from: i0 */
    public final void m16492i0(boolean z9) {
        this.f17304C = z9;
    }

    /* renamed from: j */
    public final BackgroundLineConfig m16493j() {
        return this.f17342v;
    }

    /* renamed from: j0 */
    public final void m16494j0(InterfaceC9616b interfaceC9616b) {
        this.f17306E = interfaceC9616b;
    }

    /* renamed from: k */
    public final int m16495k() {
        return this.f17326f;
    }

    /* renamed from: k0 */
    public final void m16496k0(int i9) {
        this.f17323c = i9;
    }

    /* renamed from: l */
    public final float m16497l() {
        return this.f17327g;
    }

    /* renamed from: l0 */
    public final void m16498l0(EzyModeEnum.ModeEnum mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i9 = a.f17347a[mode.ordinal()];
        if (i9 == 1) {
            C9690i c9690i = C9690i.f17127a;
            c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
            c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
        } else if (i9 != 2) {
            if (i9 == 3) {
                C9690i c9690i2 = C9690i.f17127a;
                c9690i2.m16179b(EventKey.DELETE_ACTION);
                c9690i2.m16179b(EventKey.WRITE_NEW_GROUP);
            } else if (i9 == 4) {
                C9690i c9690i3 = C9690i.f17127a;
                c9690i3.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                c9690i3.m16179b(EventKey.WRITE_NEW_GROUP);
            } else if (i9 == 5) {
                C9690i.f17127a.m16179b(EventKey.WRITE_NEW_GROUP);
            }
        } else if (this.f17333m != mode) {
            C9690i.f17127a.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f17333m = mode;
    }

    /* renamed from: m */
    public final int m16499m() {
        return this.f17344x;
    }

    /* renamed from: m0 */
    public final void m16500m0(int i9) {
        if (this.f17325e != i9) {
            C9690i c9690i = C9690i.f17127a;
            c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
            c9690i.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f17325e = i9;
    }

    /* renamed from: n */
    public final float m16501n() {
        return this.f17346z;
    }

    /* renamed from: n0 */
    public final void m16502n0(float f10) {
        if (this.f17328h != f10) {
            C9690i c9690i = C9690i.f17127a;
            c9690i.m16179b(EventKey.WRITE_NEW_GROUP);
            c9690i.m16179b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.f17328h = f10;
    }

    /* renamed from: o */
    public final float m16503o() {
        return this.f17345y;
    }

    /* renamed from: o0 */
    public final void m16504o0(InterfaceC9615a interfaceC9615a) {
        this.f17320S = interfaceC9615a;
    }

    /* renamed from: p */
    public final float m16505p() {
        return this.f17329i;
    }

    /* renamed from: p0 */
    public final void m16506p0(List list) {
        this.f17318Q = list;
    }

    /* renamed from: q */
    public final GeometryActionEnum m16507q() {
        return this.f17312K;
    }

    /* renamed from: q0 */
    public final void m16508q0(float f10) {
        this.f17310I = f10;
    }

    /* renamed from: r */
    public final float m16509r() {
        return this.f17315N;
    }

    /* renamed from: r0 */
    public final void m16510r0(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f17308G = list;
    }

    /* renamed from: s */
    public final int m16511s() {
        return this.f17314M;
    }

    /* renamed from: s0 */
    public final void m16512s0(InterfaceC9617c interfaceC9617c) {
        this.f17334n = interfaceC9617c;
    }

    /* renamed from: t */
    public final float m16513t() {
        return this.f17313L;
    }

    /* renamed from: u */
    public final int m16514u() {
        return this.f17322b;
    }

    /* renamed from: v */
    public final float m16515v() {
        return this.f17311J;
    }

    /* renamed from: w */
    public final InterfaceC9616b m16516w() {
        return this.f17306E;
    }

    /* renamed from: x */
    public final int m16517x() {
        return this.f17323c;
    }

    /* renamed from: y */
    public final EzyModeEnum.ModeEnum m16518y() {
        return this.f17333m;
    }

    /* renamed from: z */
    public final C9765d m16519z() {
        return this.f17302A;
    }
}
