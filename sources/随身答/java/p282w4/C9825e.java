package p282w4;

import com.zykj.blackboard.core.action.CursorAction;
import com.zykj.blackboard.core.action.EraseWritingAction;
import com.zykj.blackboard.core.action.GeometryAction;
import com.zykj.blackboard.core.action.SelectAction;
import com.zykj.blackboard.core.action.TextAction;
import com.zykj.blackboard.core.action.WriteBeelineAction;
import com.zykj.blackboard.core.action.WritingAction;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyModeEnum;
import kotlin.jvm.internal.Intrinsics;
import p243s5.InterfaceC9474b;

/* renamed from: w4.e */
/* loaded from: classes4.dex */
public final class C9825e implements InterfaceC9474b {

    /* renamed from: a */
    public final WritingAction f17521a = new WritingAction();

    /* renamed from: b */
    public final WriteBeelineAction f17522b = new WriteBeelineAction();

    /* renamed from: c */
    public final SelectAction f17523c = new SelectAction();

    /* renamed from: d */
    public final EraseWritingAction f17524d = new EraseWritingAction();

    /* renamed from: e */
    public final C9824d f17525e = new C9824d();

    /* renamed from: f */
    public final TextAction f17526f = new TextAction();

    /* renamed from: g */
    public final CursorAction f17527g = new CursorAction();

    /* renamed from: h */
    public final NewSelectAction f17528h = new NewSelectAction();

    /* renamed from: i */
    public final GeometryAction f17529i = new GeometryAction();

    /* renamed from: w4.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17530a;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_SEE.ordinal()] = 5;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 6;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 7;
            iArr[EzyModeEnum.ModeEnum.ACTION_NEW_SELECT.ordinal()] = 8;
            iArr[EzyModeEnum.ModeEnum.ACTION_GEOMETRY.ordinal()] = 9;
            f17530a = iArr;
        }
    }

    @Override // p243s5.InterfaceC9474b
    /* renamed from: a */
    public void mo2219a(CommandInfoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
    }

    /* renamed from: b */
    public final InterfaceC9823c m16734b(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        switch (a.f17530a[listener.mo16692k().m16518y().ordinal()]) {
            case 1:
                this.f17523c.m7163W();
                return this.f17523c;
            case 2:
                this.f17521a.m7116f0();
                return this.f17521a;
            case 3:
                this.f17522b.m7116f0();
                return this.f17522b;
            case 4:
                this.f17524d.m7143T();
                return this.f17524d;
            case 5:
                this.f17525e.m16723I();
                return this.f17525e;
            case 6:
                this.f17526f.m7191i0();
                return this.f17526f;
            case 7:
                this.f17527g.m7131P();
                return this.f17527g;
            case 8:
                this.f17528h.m7226U();
                return this.f17528h;
            case 9:
                this.f17529i.m7144I();
                return this.f17529i;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final InterfaceC9823c m16735c(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        switch (a.f17530a[listener.mo16692k().m16518y().ordinal()]) {
            case 1:
                return this.f17523c;
            case 2:
                return this.f17521a;
            case 3:
                return this.f17522b;
            case 4:
                return this.f17524d;
            case 5:
                return this.f17525e;
            case 6:
                return this.f17526f;
            case 7:
                return this.f17527g;
            case 8:
                return this.f17528h;
            case 9:
                return this.f17529i;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public final WritingAction m16736d() {
        return this.f17521a;
    }

    /* renamed from: e */
    public final void m16737e(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17521a.mo7087k(listener);
        this.f17522b.mo7087k(listener);
        this.f17523c.mo7087k(listener);
        this.f17524d.mo7087k(listener);
        this.f17525e.mo7087k(listener);
        this.f17526f.mo7087k(listener);
        this.f17527g.mo7087k(listener);
        this.f17528h.mo7087k(listener);
        this.f17529i.mo7087k(listener);
    }
}
