package p106l4;

import androidx.collection.AbstractC0584a;
import com.zykj.mistake.activity.C4468f;
import com.zykj.view.board.play.C5353b;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;

/* renamed from: l4.c */
/* loaded from: classes3.dex */
public final class C6052c {

    /* renamed from: a */
    public final String f9643a;

    /* renamed from: b */
    public final C4468f f9644b;

    /* renamed from: c */
    public final String f9645c;

    /* renamed from: d */
    public final InterfaceC6469a f9646d;

    public C6052c(String str, C4468f c4468f) {
        C5353b c5353b = new C5353b(8);
        this.f9643a = str;
        this.f9644b = c4468f;
        this.f9645c = "";
        this.f9646d = c5353b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6052c)) {
            return false;
        }
        C6052c c6052c = (C6052c) obj;
        return AbstractC5830k.m5325b(this.f9643a, c6052c.f9643a) && this.f9644b.equals(c6052c.f9644b) && this.f9645c.equals(c6052c.f9645c) && this.f9646d.equals(c6052c.f9646d);
    }

    public final int hashCode() {
        String str = this.f9643a;
        return this.f9646d.hashCode() + AbstractC0584a.m903d((this.f9644b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f9645c);
    }

    public final String toString() {
        return "ButtonInfo(confirmText=" + this.f9643a + ", confirmCallback=" + this.f9644b + ", cancelText=" + this.f9645c + ", cancelCallback=" + this.f9646d + ")";
    }
}
