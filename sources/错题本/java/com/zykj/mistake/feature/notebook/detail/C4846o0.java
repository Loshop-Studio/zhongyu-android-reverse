package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.o0 */
/* loaded from: classes3.dex */
public final class C4846o0 {

    /* renamed from: a */
    public final String f7215a;

    /* renamed from: b */
    public final MistakeDetailNewContract$AnswerDisplayType f7216b;

    /* renamed from: c */
    public final boolean f7217c;

    /* renamed from: d */
    public final List f7218d;

    /* renamed from: e */
    public final List f7219e;

    /* renamed from: f */
    public final List f7220f;

    /* renamed from: g */
    public final List f7221g;

    /* renamed from: h */
    public final MistakeDetailNewContract$AnswerVisualState f7222h;

    /* renamed from: i */
    public final MistakeDetailNewContract$AnswerVisualState f7223i;

    public C4846o0(String index, MistakeDetailNewContract$AnswerDisplayType displayType, boolean z8, List originalAnswers, List originalComments, List revisedAnswers, List revisedComments, MistakeDetailNewContract$AnswerVisualState originalState, MistakeDetailNewContract$AnswerVisualState revisedState) {
        AbstractC5830k.m5330g(index, "index");
        AbstractC5830k.m5330g(displayType, "displayType");
        AbstractC5830k.m5330g(originalAnswers, "originalAnswers");
        AbstractC5830k.m5330g(originalComments, "originalComments");
        AbstractC5830k.m5330g(revisedAnswers, "revisedAnswers");
        AbstractC5830k.m5330g(revisedComments, "revisedComments");
        AbstractC5830k.m5330g(originalState, "originalState");
        AbstractC5830k.m5330g(revisedState, "revisedState");
        this.f7215a = index;
        this.f7216b = displayType;
        this.f7217c = z8;
        this.f7218d = originalAnswers;
        this.f7219e = originalComments;
        this.f7220f = revisedAnswers;
        this.f7221g = revisedComments;
        this.f7222h = originalState;
        this.f7223i = revisedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4846o0)) {
            return false;
        }
        C4846o0 c4846o0 = (C4846o0) obj;
        return AbstractC5830k.m5325b(this.f7215a, c4846o0.f7215a) && this.f7216b == c4846o0.f7216b && this.f7217c == c4846o0.f7217c && AbstractC5830k.m5325b(this.f7218d, c4846o0.f7218d) && AbstractC5830k.m5325b(this.f7219e, c4846o0.f7219e) && AbstractC5830k.m5325b(this.f7220f, c4846o0.f7220f) && AbstractC5830k.m5325b(this.f7221g, c4846o0.f7221g) && this.f7222h == c4846o0.f7222h && this.f7223i == c4846o0.f7223i;
    }

    public final int hashCode() {
        return this.f7223i.hashCode() + ((this.f7222h.hashCode() + AbstractC0584a.m907h(this.f7221g, AbstractC0584a.m907h(this.f7220f, AbstractC0584a.m907h(this.f7219e, AbstractC0584a.m907h(this.f7218d, AbstractC0584a.m908i(this.f7217c, (this.f7216b.hashCode() + (this.f7215a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AnswerEntryUiState(index=" + this.f7215a + ", displayType=" + this.f7216b + ", isCustomMistake=" + this.f7217c + ", originalAnswers=" + this.f7218d + ", originalComments=" + this.f7219e + ", revisedAnswers=" + this.f7220f + ", revisedComments=" + this.f7221g + ", originalState=" + this.f7222h + ", revisedState=" + this.f7223i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4846o0(String str, MistakeDetailNewContract$AnswerDisplayType mistakeDetailNewContract$AnswerDisplayType, boolean z8, List list, List list2, List list3, List list4) {
        MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState = MistakeDetailNewContract$AnswerVisualState.EMPTY;
        this(str, mistakeDetailNewContract$AnswerDisplayType, z8, list, list2, list3, list4, mistakeDetailNewContract$AnswerVisualState, mistakeDetailNewContract$AnswerVisualState);
    }
}
