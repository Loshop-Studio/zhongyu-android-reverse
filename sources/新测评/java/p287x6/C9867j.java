package p287x6;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.j */
/* loaded from: classes4.dex */
public final class C9867j {

    /* renamed from: a */
    public final List f17448a;

    /* renamed from: b */
    public final String[] f17449b;

    /* renamed from: c */
    public final Bitmap[] f17450c;

    /* renamed from: d */
    public final Bitmap[] f17451d;

    public C9867j(List questionAnswerList, String[] selectArray, Bitmap[] blankArray, Bitmap[] handArray) {
        Intrinsics.checkNotNullParameter(questionAnswerList, "questionAnswerList");
        Intrinsics.checkNotNullParameter(selectArray, "selectArray");
        Intrinsics.checkNotNullParameter(blankArray, "blankArray");
        Intrinsics.checkNotNullParameter(handArray, "handArray");
        this.f17448a = questionAnswerList;
        this.f17449b = selectArray;
        this.f17450c = blankArray;
        this.f17451d = handArray;
    }

    /* renamed from: a */
    public final Bitmap[] m16542a() {
        return this.f17450c;
    }

    /* renamed from: b */
    public final Bitmap[] m16543b() {
        return this.f17451d;
    }

    /* renamed from: c */
    public final List m16544c() {
        return this.f17448a;
    }

    /* renamed from: d */
    public final String[] m16545d() {
        return this.f17449b;
    }
}
