package p175u4;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode;
import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import com.zykj.view.board.play.C5353b;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p061g.AbstractC5535a;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: u4.g */
/* loaded from: classes3.dex */
public final class C6620g {

    @NotNull
    public static final C6619f Companion = new C6619f();

    /* renamed from: s */
    public static final InterfaceC5429e[] f11071s;

    /* renamed from: a */
    public final int f11072a;

    /* renamed from: b */
    public final int f11073b;

    /* renamed from: c */
    public final long f11074c;

    /* renamed from: d */
    public final String f11075d;

    /* renamed from: e */
    public final String f11076e;

    /* renamed from: f */
    public final String f11077f;

    /* renamed from: g */
    public final String f11078g;

    /* renamed from: h */
    public final boolean f11079h;

    /* renamed from: i */
    public final boolean f11080i;

    /* renamed from: j */
    public final boolean f11081j;

    /* renamed from: k */
    public final List f11082k;

    /* renamed from: l */
    public final String f11083l;

    /* renamed from: m */
    public final int f11084m;

    /* renamed from: n */
    public final MistakeDetailNewContract$EntryMode f11085n;

    /* renamed from: o */
    public final String f11086o;

    /* renamed from: p */
    public final String f11087p;

    /* renamed from: q */
    public final ReviewContract$PracticeScene f11088q;

    /* renamed from: r */
    public final ReviewContract$PracticePoolType f11089r;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f11071s = new InterfaceC5429e[]{null, null, null, null, null, null, null, null, null, null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(27)), null, null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(28)), null, null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(29)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C6617d(0))};
    }

    public C6620g(int i, int i8, int i9, long j7, String str, String str2, String str3, String str4, boolean z8, boolean z9, boolean z10, List list, String str5, int i10, MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode, String str6, String str7, ReviewContract$PracticeScene reviewContract$PracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType) {
        if ((i & 1) == 0) {
            this.f11072a = 0;
        } else {
            this.f11072a = i8;
        }
        if ((i & 2) == 0) {
            this.f11073b = 0;
        } else {
            this.f11073b = i9;
        }
        if ((i & 4) == 0) {
            this.f11074c = 0L;
        } else {
            this.f11074c = j7;
        }
        if ((i & 8) == 0) {
            this.f11075d = "";
        } else {
            this.f11075d = str;
        }
        if ((i & 16) == 0) {
            this.f11076e = "";
        } else {
            this.f11076e = str2;
        }
        if ((i & 32) == 0) {
            this.f11077f = "";
        } else {
            this.f11077f = str3;
        }
        if ((i & 64) == 0) {
            this.f11078g = "";
        } else {
            this.f11078g = str4;
        }
        if ((i & 128) == 0) {
            this.f11079h = true;
        } else {
            this.f11079h = z8;
        }
        if ((i & 256) == 0) {
            this.f11080i = false;
        } else {
            this.f11080i = z9;
        }
        if ((i & 512) == 0) {
            this.f11081j = false;
        } else {
            this.f11081j = z10;
        }
        if ((i & 1024) == 0) {
            this.f11082k = EmptyList.INSTANCE;
        } else {
            this.f11082k = list;
        }
        if ((i & 2048) == 0) {
            this.f11083l = "";
        } else {
            this.f11083l = str5;
        }
        if ((i & 4096) == 0) {
            this.f11084m = 0;
        } else {
            this.f11084m = i10;
        }
        this.f11085n = (i & 8192) == 0 ? MistakeDetailNewContract$EntryMode.NORMAL : mistakeDetailNewContract$EntryMode;
        if ((i & 16384) == 0) {
            this.f11086o = "";
        } else {
            this.f11086o = str6;
        }
        if ((32768 & i) == 0) {
            this.f11087p = "";
        } else {
            this.f11087p = str7;
        }
        this.f11088q = (65536 & i) == 0 ? ReviewContract$PracticeScene.RECOMMEND : reviewContract$PracticeScene;
        this.f11089r = (i & 131072) == 0 ? null : reviewContract$PracticePoolType;
    }

    /* renamed from: a */
    public static C6620g m6261a(C6620g c6620g, String str) {
        int i = c6620g.f11072a;
        int i8 = c6620g.f11073b;
        long j7 = c6620g.f11074c;
        String subject = c6620g.f11075d;
        String examName = c6620g.f11076e;
        String title = c6620g.f11077f;
        String stemShoot = c6620g.f11078g;
        boolean z8 = c6620g.f11079h;
        boolean z9 = c6620g.f11080i;
        boolean z10 = c6620g.f11081j;
        List tags = c6620g.f11082k;
        int i9 = c6620g.f11084m;
        MistakeDetailNewContract$EntryMode entryMode = c6620g.f11085n;
        String reviewPracticeSessionId = c6620g.f11086o;
        String reviewPracticeRoundId = c6620g.f11087p;
        ReviewContract$PracticeScene reviewPracticeScene = c6620g.f11088q;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = c6620g.f11089r;
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(tags, "tags");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        AbstractC5830k.m5330g(reviewPracticeSessionId, "reviewPracticeSessionId");
        AbstractC5830k.m5330g(reviewPracticeRoundId, "reviewPracticeRoundId");
        AbstractC5830k.m5330g(reviewPracticeScene, "reviewPracticeScene");
        return new C6620g(i, i8, j7, subject, examName, title, stemShoot, z8, z9, z10, tags, str, i9, entryMode, reviewPracticeSessionId, reviewPracticeRoundId, reviewPracticeScene, reviewContract$PracticePoolType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6620g)) {
            return false;
        }
        C6620g c6620g = (C6620g) obj;
        return this.f11072a == c6620g.f11072a && this.f11073b == c6620g.f11073b && this.f11074c == c6620g.f11074c && AbstractC5830k.m5325b(this.f11075d, c6620g.f11075d) && AbstractC5830k.m5325b(this.f11076e, c6620g.f11076e) && AbstractC5830k.m5325b(this.f11077f, c6620g.f11077f) && AbstractC5830k.m5325b(this.f11078g, c6620g.f11078g) && this.f11079h == c6620g.f11079h && this.f11080i == c6620g.f11080i && this.f11081j == c6620g.f11081j && AbstractC5830k.m5325b(this.f11082k, c6620g.f11082k) && AbstractC5830k.m5325b(this.f11083l, c6620g.f11083l) && this.f11084m == c6620g.f11084m && this.f11085n == c6620g.f11085n && AbstractC5830k.m5325b(this.f11086o, c6620g.f11086o) && AbstractC5830k.m5325b(this.f11087p, c6620g.f11087p) && this.f11088q == c6620g.f11088q && this.f11089r == c6620g.f11089r;
    }

    public final int hashCode() {
        int iHashCode = (this.f11088q.hashCode() + AbstractC0584a.m903d(AbstractC0584a.m903d((this.f11085n.hashCode() + AbstractC0584a.m902c(this.f11084m, AbstractC0584a.m903d(AbstractC0584a.m907h(this.f11082k, AbstractC0584a.m908i(this.f11081j, AbstractC0584a.m908i(this.f11080i, AbstractC0584a.m908i(this.f11079h, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m897B(this.f11074c, AbstractC0584a.m902c(this.f11073b, Integer.hashCode(this.f11072a) * 31, 31), 31), 31, this.f11075d), 31, this.f11076e), 31, this.f11077f), 31, this.f11078g), 31), 31), 31), 31), 31, this.f11083l), 31)) * 31, 31, this.f11086o), 31, this.f11087p)) * 31;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = this.f11089r;
        return iHashCode + (reviewContract$PracticePoolType == null ? 0 : reviewContract$PracticePoolType.hashCode());
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("MistakeDetailRouteArgs(bookId=", ", itemId=", this.f11072a, ", topicId=", this.f11073b);
        sbM99x.append(this.f11074c);
        sbM99x.append(", subject=");
        sbM99x.append(this.f11075d);
        AbstractC1923c.m1060x(sbM99x, ", examName=", this.f11076e, ", title=", this.f11077f);
        sbM99x.append(", stemShoot=");
        sbM99x.append(this.f11078g);
        sbM99x.append(", hasStem=");
        sbM99x.append(this.f11079h);
        AbstractC5535a.m4900g(", isCustomMistake=", ", isRelatedQstGroup=", sbM99x, this.f11080i, this.f11081j);
        sbM99x.append(", tags=");
        sbM99x.append(this.f11082k);
        sbM99x.append(", navigationKey=");
        sbM99x.append(this.f11083l);
        sbM99x.append(", navIndex=");
        sbM99x.append(this.f11084m);
        sbM99x.append(", entryMode=");
        sbM99x.append(this.f11085n);
        AbstractC1923c.m1060x(sbM99x, ", reviewPracticeSessionId=", this.f11086o, ", reviewPracticeRoundId=", this.f11087p);
        sbM99x.append(", reviewPracticeScene=");
        sbM99x.append(this.f11088q);
        sbM99x.append(", reviewPracticePoolType=");
        sbM99x.append(this.f11089r);
        sbM99x.append(")");
        return sbM99x.toString();
    }

    public C6620g(int i, int i8, long j7, String str, String str2, String str3, String str4, boolean z8, boolean z9, boolean z10, List list, int i9, MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode, ReviewContract$PracticeScene reviewContract$PracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType, int i10) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i8, (i10 & 4) != 0 ? 0L : j7, (i10 & 8) != 0 ? "" : str, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? "" : str4, (i10 & 128) != 0 ? true : z8, (i10 & 256) != 0 ? false : z9, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? EmptyList.INSTANCE : list, "", (i10 & 4096) != 0 ? 0 : i9, (i10 & 8192) != 0 ? MistakeDetailNewContract$EntryMode.NORMAL : mistakeDetailNewContract$EntryMode, "", "", (65536 & i10) != 0 ? ReviewContract$PracticeScene.RECOMMEND : reviewContract$PracticeScene, (i10 & 131072) != 0 ? null : reviewContract$PracticePoolType);
    }

    public C6620g(int i, int i8, long j7, String subject, String examName, String title, String stemShoot, boolean z8, boolean z9, boolean z10, List tags, String str, int i9, MistakeDetailNewContract$EntryMode entryMode, String str2, String str3, ReviewContract$PracticeScene reviewPracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType) {
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(tags, "tags");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        AbstractC5830k.m5330g(reviewPracticeScene, "reviewPracticeScene");
        this.f11072a = i;
        this.f11073b = i8;
        this.f11074c = j7;
        this.f11075d = subject;
        this.f11076e = examName;
        this.f11077f = title;
        this.f11078g = stemShoot;
        this.f11079h = z8;
        this.f11080i = z9;
        this.f11081j = z10;
        this.f11082k = tags;
        this.f11083l = str;
        this.f11084m = i9;
        this.f11085n = entryMode;
        this.f11086o = str2;
        this.f11087p = str3;
        this.f11088q = reviewPracticeScene;
        this.f11089r = reviewContract$PracticePoolType;
    }
}
