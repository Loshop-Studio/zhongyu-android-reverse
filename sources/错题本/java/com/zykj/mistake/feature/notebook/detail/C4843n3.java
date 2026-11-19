package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.n3 */
/* loaded from: classes3.dex */
public final class C4843n3 {

    /* renamed from: a */
    public final List f7199a;

    /* renamed from: b */
    public final List f7200b;

    /* renamed from: c */
    public final List f7201c;

    /* renamed from: d */
    public final List f7202d;

    /* renamed from: e */
    public final List f7203e;

    public C4843n3(List questionMicroLessons, List oneToOneMicroLessons, List revisedMicroLessons, List typicalRightAnswers, List typicalErrorAnswers) {
        AbstractC5830k.m5330g(questionMicroLessons, "questionMicroLessons");
        AbstractC5830k.m5330g(oneToOneMicroLessons, "oneToOneMicroLessons");
        AbstractC5830k.m5330g(revisedMicroLessons, "revisedMicroLessons");
        AbstractC5830k.m5330g(typicalRightAnswers, "typicalRightAnswers");
        AbstractC5830k.m5330g(typicalErrorAnswers, "typicalErrorAnswers");
        this.f7199a = questionMicroLessons;
        this.f7200b = oneToOneMicroLessons;
        this.f7201c = revisedMicroLessons;
        this.f7202d = typicalRightAnswers;
        this.f7203e = typicalErrorAnswers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4843n3)) {
            return false;
        }
        C4843n3 c4843n3 = (C4843n3) obj;
        return AbstractC5830k.m5325b(this.f7199a, c4843n3.f7199a) && AbstractC5830k.m5325b(this.f7200b, c4843n3.f7200b) && AbstractC5830k.m5325b(this.f7201c, c4843n3.f7201c) && AbstractC5830k.m5325b(this.f7202d, c4843n3.f7202d) && AbstractC5830k.m5325b(this.f7203e, c4843n3.f7203e);
    }

    public final int hashCode() {
        return this.f7203e.hashCode() + AbstractC0584a.m907h(this.f7202d, AbstractC0584a.m907h(this.f7201c, AbstractC0584a.m907h(this.f7200b, this.f7199a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SupplementUiState(questionMicroLessons=" + this.f7199a + ", oneToOneMicroLessons=" + this.f7200b + ", revisedMicroLessons=" + this.f7201c + ", typicalRightAnswers=" + this.f7202d + ", typicalErrorAnswers=" + this.f7203e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4843n3() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this(emptyList, emptyList, emptyList, emptyList, emptyList);
    }
}
