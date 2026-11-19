package p000a.p005b.p009e.p010a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p000a.p005b.p009e.p010a.C0036b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.e.a.d */
/* loaded from: classes.dex */
public class C0038d extends C0036b {

    /* renamed from: o */
    public a f279o;

    /* renamed from: p */
    public boolean f280p;

    /* renamed from: a.b.e.a.d$a */
    public static class a extends C0036b.c {

        /* renamed from: J */
        public int[][] f281J;

        public a(a aVar, C0038d c0038d, Resources resources) {
            super(aVar, c0038d, resources);
            if (aVar != null) {
                this.f281J = aVar.f281J;
            } else {
                this.f281J = new int[this.f258g.length][];
            }
        }

        @Override // p000a.p005b.p009e.p010a.C0036b.c
        /* renamed from: e */
        public void mo137e() {
            int[][] iArr = this.f281J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f281J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f281J = iArr2;
        }

        /* renamed from: g */
        public int m149g(int[] iArr) {
            int[][] iArr2 = this.f281J;
            int i = this.f259h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0038d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0038d(this, resources);
        }
    }

    public C0038d(a aVar) {
    }

    public C0038d(a aVar, Resources resources) {
        mo132e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p000a.p005b.p009e.p010a.C0036b
    /* renamed from: e */
    public void mo132e(C0036b.c cVar) {
        this.f229b = cVar;
        int i = this.f235h;
        if (i >= 0) {
            Drawable drawableM147d = cVar.m147d(i);
            this.f231d = drawableM147d;
            if (drawableM147d != null) {
                m142c(drawableM147d);
            }
        }
        this.f232e = null;
        if (cVar instanceof a) {
            this.f279o = (a) cVar;
        }
    }

    @Override // p000a.p005b.p009e.p010a.C0036b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo131b() {
        return new a(this.f279o, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f280p) {
            super.mutate();
            if (this == this) {
                this.f279o.mo137e();
                this.f280p = true;
            }
        }
        return this;
    }

    @Override // p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM149g = this.f279o.m149g(iArr);
        if (iM149g < 0) {
            iM149g = this.f279o.m149g(StateSet.WILD_CARD);
        }
        return m143d(iM149g) || zOnStateChange;
    }
}
