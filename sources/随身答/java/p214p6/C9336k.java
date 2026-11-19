package p214p6;

import com.blankj.utilcode.util.Utils;
import com.zykj.board.EzyPageRouter;
import com.zykj.sketch.core.record.RecordControl;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.Tab;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p161io.CloseableKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* renamed from: p6.k */
/* loaded from: classes5.dex */
public final class C9336k {

    /* renamed from: a */
    public final Object f16209a;

    /* renamed from: b */
    public final int f16210b;

    /* renamed from: c */
    public final boolean f16211c;

    /* renamed from: d */
    public final Tab f16212d;

    /* renamed from: e */
    public final long f16213e;

    /* renamed from: f */
    public final boolean f16214f;

    public C9336k(Object obj, int i9, boolean z9, Tab tab, long j9, boolean z10) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f16209a = obj;
        this.f16210b = i9;
        this.f16211c = z9;
        this.f16212d = tab;
        this.f16213e = j9;
        this.f16214f = z10;
    }

    /* renamed from: b */
    public static /* synthetic */ C9336k m15226b(C9336k c9336k, Result result, int i9, boolean z9, Tab tab, long j9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = Result.m24757boximpl(c9336k.f16209a);
        }
        if ((i10 & 2) != 0) {
            i9 = c9336k.f16210b;
        }
        int i11 = i9;
        if ((i10 & 4) != 0) {
            z9 = c9336k.f16211c;
        }
        boolean z11 = z9;
        if ((i10 & 8) != 0) {
            tab = c9336k.f16212d;
        }
        Tab tab2 = tab;
        if ((i10 & 16) != 0) {
            j9 = c9336k.f16213e;
        }
        long j10 = j9;
        if ((i10 & 32) != 0) {
            z10 = c9336k.f16214f;
        }
        return c9336k.m15227a(result.getValue(), i11, z11, tab2, j10, z10);
    }

    /* renamed from: a */
    public final C9336k m15227a(Object obj, int i9, boolean z9, Tab tab, long j9, boolean z10) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        return new C9336k(obj, i9, z9, tab, j9, z10);
    }

    /* renamed from: c */
    public final boolean m15228c() {
        String strM15234i = m15234i();
        if (strM15234i != null) {
            File file = new File(strM15234i);
            if (file.isDirectory() && file.exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m15229d() {
        String strM15235j = m15235j();
        if (strM15235j == null) {
            return false;
        }
        File file = new File(strM15235j);
        return (file.isDirectory() && file.exists()) ? false : true;
    }

    /* renamed from: e */
    public final boolean m15230e() {
        String strM15237l = m15237l();
        if (strM15237l == null) {
            return false;
        }
        File file = new File(strM15237l);
        return (file.isDirectory() && file.exists()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9336k)) {
            return false;
        }
        C9336k c9336k = (C9336k) obj;
        return Result.m24760equalsimpl0(this.f16209a, c9336k.f16209a) && this.f16210b == c9336k.f16210b && this.f16211c == c9336k.f16211c && this.f16212d == c9336k.f16212d && this.f16213e == c9336k.f16213e && this.f16214f == c9336k.f16214f;
    }

    /* renamed from: f */
    public final String m15231f() {
        if (!m15228c()) {
            return null;
        }
        if (m15245t()) {
            return m15240o() + File.separator + "screenshot.png";
        }
        return m15234i() + File.separator + RecordControl.thumbnailFileName;
    }

    /* renamed from: g */
    public final MessageResponse m15232g() {
        Object obj = this.f16209a;
        if (Result.m24764isFailureimpl(obj)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List listM15246u = m15246u(list);
            Tab tab = this.f16212d;
            Tab tab2 = Tab.f11245a;
            IntRange indices = tab == tab2 ? CollectionsKt.getIndices(list) : CollectionsKt.getIndices(listM15246u);
            int first = indices.getFirst();
            int last = indices.getLast();
            int i9 = this.f16210b;
            if (first <= i9 && i9 <= last) {
                return (MessageResponse) (this.f16212d == tab2 ? list.get(i9) : listM15246u.get(i9));
            }
        }
        return null;
    }

    /* renamed from: h */
    public final long m15233h() {
        return this.f16213e;
    }

    public int hashCode() {
        return (((((((((Result.m24763hashCodeimpl(this.f16209a) * 31) + Integer.hashCode(this.f16210b)) * 31) + Boolean.hashCode(this.f16211c)) * 31) + this.f16212d.hashCode()) * 31) + Long.hashCode(this.f16213e)) * 31) + Boolean.hashCode(this.f16214f);
    }

    /* renamed from: i */
    public final String m15234i() {
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        String str = (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/Dialogue/lesson/";
        MessageResponse messageResponseM15232g = m15232g();
        if (messageResponseM15232g == null) {
            return null;
        }
        return new File(str + StringsKt.substringBeforeLast$default(StringsKt.substringAfterLast$default(messageResponseM15232g.getContent(), "/", (String) null, 2, (Object) null), ".zip", (String) null, 2, (Object) null)).getAbsolutePath();
    }

    /* renamed from: j */
    public final String m15235j() {
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        String str = (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/Dialogue/lesson/";
        MessageResponse messageResponseM15236k = m15236k();
        if (messageResponseM15236k == null) {
            return null;
        }
        return new File(str + StringsKt.substringBeforeLast$default(StringsKt.substringAfterLast$default(messageResponseM15236k.getContent(), "/", (String) null, 2, (Object) null), ".zip", (String) null, 2, (Object) null)).getAbsolutePath();
    }

    /* renamed from: k */
    public final MessageResponse m15236k() {
        int i9 = this.f16210b + 1;
        Object obj = this.f16209a;
        if (Result.m24764isFailureimpl(obj)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List listM15246u = m15246u(list);
            Tab tab = this.f16212d;
            Tab tab2 = Tab.f11245a;
            IntRange indices = tab == tab2 ? CollectionsKt.getIndices(list) : CollectionsKt.getIndices(listM15246u);
            int first = indices.getFirst();
            if (i9 <= indices.getLast() && first <= i9) {
                return (MessageResponse) (this.f16212d == tab2 ? list.get(i9) : listM15246u.get(i9));
            }
        }
        return null;
    }

    /* renamed from: l */
    public final String m15237l() {
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        String str = (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/Dialogue/lesson/";
        MessageResponse messageResponseM15238m = m15238m();
        if (messageResponseM15238m == null) {
            return null;
        }
        return new File(str + StringsKt.substringBeforeLast$default(StringsKt.substringAfterLast$default(messageResponseM15238m.getContent(), "/", (String) null, 2, (Object) null), ".zip", (String) null, 2, (Object) null)).getAbsolutePath();
    }

    /* renamed from: m */
    public final MessageResponse m15238m() {
        int i9 = this.f16210b - 1;
        Object obj = this.f16209a;
        if (Result.m24764isFailureimpl(obj)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List listM15246u = m15246u(list);
            Tab tab = this.f16212d;
            Tab tab2 = Tab.f11245a;
            IntRange indices = tab == tab2 ? CollectionsKt.getIndices(list) : CollectionsKt.getIndices(listM15246u);
            int first = indices.getFirst();
            if (i9 <= indices.getLast() && first <= i9) {
                return (MessageResponse) (this.f16212d == tab2 ? list.get(i9) : listM15246u.get(i9));
            }
        }
        return null;
    }

    /* renamed from: n */
    public final Object m15239n() {
        return this.f16209a;
    }

    /* renamed from: o */
    public final String m15240o() {
        if (!m15228c()) {
            return null;
        }
        String strM15234i = m15234i();
        File file = new File(strM15234i, "page_router.bin");
        if (!file.exists()) {
            return strM15234i;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            List listM8906q = EzyPageRouter.PageRouter.m8903w(fileInputStream).m8906q();
            Intrinsics.checkNotNullExpressionValue(listM8906q, "getPageInfoList(...)");
            EzyPageRouter.PageRouter.PageInfo pageInfo = (EzyPageRouter.PageRouter.PageInfo) CollectionsKt.firstOrNull(listM8906q);
            String str = strM15234i + "/" + (pageInfo != null ? pageInfo.getName() : null);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            return str;
        } finally {
        }
    }

    /* renamed from: p */
    public final int m15241p() {
        return this.f16210b;
    }

    /* renamed from: q */
    public final Tab m15242q() {
        return this.f16212d;
    }

    /* renamed from: r */
    public final boolean m15243r() {
        return this.f16214f;
    }

    /* renamed from: s */
    public final boolean m15244s() {
        return this.f16211c;
    }

    /* renamed from: t */
    public final boolean m15245t() {
        return new File(m15234i(), "page_router.bin").exists();
    }

    public String toString() {
        return "ViewState(questionResult=" + Result.m24766toStringimpl(this.f16209a) + ", selectedPosition=" + this.f16210b + ", isFullscreen=" + this.f16211c + ", tab=" + this.f16212d + ", lastSwitchFullscreen=" + this.f16213e + ", underStoodOrCollected=" + this.f16214f + ")";
    }

    /* renamed from: u */
    public final List m15246u(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MessageResponse) obj).isPrimary()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9336k(Result result, int i9, boolean z9, Tab tab, long j9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            Result.Companion companion = Result.INSTANCE;
            result = Result.m24757boximpl(Result.m24758constructorimpl(CollectionsKt.emptyList()));
        }
        this(result.getValue(), (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? Tab.f11245a : tab, (i10 & 16) != 0 ? 0L : j9, (i10 & 32) != 0 ? false : z10);
    }
}
