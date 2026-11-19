package p098g4;

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
import p035c5.InterfaceC5119b;

/* renamed from: g4.e */
/* loaded from: classes4.dex */
public final class C7525e implements InterfaceC5119b {

    /* renamed from: a */
    public final WritingAction f12409a = new WritingAction();

    /* renamed from: b */
    public final WriteBeelineAction f12410b = new WriteBeelineAction();

    /* renamed from: c */
    public final SelectAction f12411c = new SelectAction();

    /* renamed from: d */
    public final EraseWritingAction f12412d = new EraseWritingAction();

    /* renamed from: e */
    public final C7524d f12413e = new C7524d();

    /* renamed from: f */
    public final TextAction f12414f = new TextAction();

    /* renamed from: g */
    public final CursorAction f12415g = new CursorAction();

    /* renamed from: h */
    public final NewSelectAction f12416h = new NewSelectAction();

    /* renamed from: i */
    public final GeometryAction f12417i = new GeometryAction();

    /* renamed from: g4.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12418a;

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
            f12418a = iArr;
        }
    }

    @Override // p035c5.InterfaceC5119b
    /* renamed from: a */
    public void mo2774a(CommandInfoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
    }

    /* renamed from: b */
    public final InterfaceC7523c m12288b(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        switch (a.f12418a[listener.mo12246k().getMode().ordinal()]) {
            case 1:
                this.f12411c.m6067W();
                return this.f12411c;
            case 2:
                this.f12409a.m6020e0();
                return this.f12409a;
            case 3:
                this.f12410b.m6020e0();
                return this.f12410b;
            case 4:
                this.f12412d.m6047T();
                return this.f12412d;
            case 5:
                this.f12413e.m12277I();
                return this.f12413e;
            case 6:
                this.f12414f.m6095i0();
                return this.f12414f;
            case 7:
                this.f12415g.m6035P();
                return this.f12415g;
            case 8:
                this.f12416h.m6130U();
                return this.f12416h;
            case 9:
                this.f12417i.m6048I();
                return this.f12417i;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final InterfaceC7523c m12289c(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        switch (a.f12418a[listener.mo12246k().getMode().ordinal()]) {
            case 1:
                return this.f12411c;
            case 2:
                return this.f12409a;
            case 3:
                return this.f12410b;
            case 4:
                return this.f12412d;
            case 5:
                return this.f12413e;
            case 6:
                return this.f12414f;
            case 7:
                return this.f12415g;
            case 8:
                return this.f12416h;
            case 9:
                return this.f12417i;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public final void m12290d(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12409a.mo5992k(listener);
        this.f12410b.mo5992k(listener);
        this.f12411c.mo5992k(listener);
        this.f12412d.mo5992k(listener);
        this.f12413e.mo5992k(listener);
        this.f12414f.mo5992k(listener);
        this.f12415g.mo5992k(listener);
        this.f12416h.mo5992k(listener);
        this.f12417i.mo5992k(listener);
    }
}
