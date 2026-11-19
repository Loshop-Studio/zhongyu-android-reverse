package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.k3 */
/* loaded from: classes3.dex */
public final class C4825k3 {

    /* renamed from: a */
    public final long f7077a;

    /* renamed from: b */
    public final String f7078b;

    /* renamed from: c */
    public final String f7079c;

    /* renamed from: d */
    public final long f7080d;

    /* renamed from: e */
    public final List f7081e;

    /* renamed from: f */
    public final boolean f7082f;

    /* renamed from: g */
    public final int f7083g;

    public C4825k3(long j7, String boardNoteUrl, String str, long j8, List pictureNotes, boolean z8, int i) {
        AbstractC5830k.m5330g(boardNoteUrl, "boardNoteUrl");
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        this.f7077a = j7;
        this.f7078b = boardNoteUrl;
        this.f7079c = str;
        this.f7080d = j8;
        this.f7081e = pictureNotes;
        this.f7082f = z8;
        this.f7083g = i;
    }

    /* renamed from: a */
    public static C4825k3 m4202a(C4825k3 c4825k3, String str, long j7, List list, boolean z8, int i) {
        long j8 = c4825k3.f7077a;
        String boardNoteUrl = c4825k3.f7078b;
        if ((i & 4) != 0) {
            str = c4825k3.f7079c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j7 = c4825k3.f7080d;
        }
        long j9 = j7;
        if ((i & 16) != 0) {
            list = c4825k3.f7081e;
        }
        List pictureNotes = list;
        if ((i & 32) != 0) {
            z8 = c4825k3.f7082f;
        }
        int i8 = c4825k3.f7083g;
        AbstractC5830k.m5330g(boardNoteUrl, "boardNoteUrl");
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        return new C4825k3(j8, boardNoteUrl, str2, j9, pictureNotes, z8, i8);
    }

    /* renamed from: b */
    public final boolean m4203b() {
        return this.f7082f;
    }

    /* renamed from: c */
    public final int m4204c() {
        return this.f7083g;
    }

    /* renamed from: d */
    public final List m4205d() {
        return this.f7081e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825k3)) {
            return false;
        }
        C4825k3 c4825k3 = (C4825k3) obj;
        return this.f7077a == c4825k3.f7077a && AbstractC5830k.m5325b(this.f7078b, c4825k3.f7078b) && AbstractC5830k.m5325b(this.f7079c, c4825k3.f7079c) && this.f7080d == c4825k3.f7080d && AbstractC5830k.m5325b(this.f7081e, c4825k3.f7081e) && this.f7082f == c4825k3.f7082f && this.f7083g == c4825k3.f7083g;
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(Long.hashCode(this.f7077a) * 31, 31, this.f7078b);
        String str = this.f7079c;
        return Integer.hashCode(this.f7083g) + AbstractC0584a.m908i(this.f7082f, AbstractC0584a.m907h(this.f7081e, AbstractC0584a.m897B(this.f7080d, (iM903d + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NoteUiState(itemId=" + this.f7077a + ", boardNoteUrl=" + this.f7078b + ", boardThumbnailPath=" + this.f7079c + ", boardThumbnailRefreshKey=" + this.f7080d + ", pictureNotes=" + this.f7081e + ", canOpenCamera=" + this.f7082f + ", maxImageCount=" + this.f7083g + ")";
    }

    public C4825k3(long j7, String str, List list, boolean z8, int i) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? "" : str, null, 0L, (i & 16) != 0 ? EmptyList.INSTANCE : list, (i & 32) != 0 ? false : z8, 4);
    }
}
