package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0114b;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.graphics.drawable.d */
/* loaded from: classes.dex */
class C0116d extends C0114b {

    /* renamed from: m */
    private a f488m;

    /* renamed from: n */
    private boolean f489n;

    /* renamed from: androidx.appcompat.graphics.drawable.d$a */
    static class a extends C0114b.d {

        /* renamed from: J */
        int[][] f490J;

        a(a aVar, C0116d c0116d, Resources resources) {
            super(aVar, c0116d, resources);
            if (aVar != null) {
                this.f490J = aVar.f490J;
            } else {
                this.f490J = new int[m387f()][];
            }
        }

        /* renamed from: A */
        int m406A(int[] iArr) {
            int[][] iArr2 = this.f490J;
            int iM389h = m389h();
            for (int i4 = 0; i4 < iM389h; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                    return i4;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0116d(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.C0114b.d
        /* renamed from: o */
        public void mo396o(int i4, int i5) {
            super.mo396o(i4, i5);
            int[][] iArr = new int[i5][];
            System.arraycopy(this.f490J, 0, iArr, 0, i4);
            this.f490J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.C0114b.d
        /* renamed from: r */
        void mo364r() {
            int[][] iArr = this.f490J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f490J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f490J = iArr2;
        }

        /* renamed from: z */
        int m407z(int[] iArr, Drawable drawable) {
            int iM383a = m383a(drawable);
            this.f490J[iM383a] = iArr;
            return iM383a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0116d(this, resources);
        }
    }

    C0116d(a aVar, Resources resources) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        mo350h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b
    /* renamed from: h */
    void mo350h(C0114b.d dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.mo350h(dVar);
        if (dVar instanceof a) {
            this.f488m = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.C0114b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo349b() {
        return new a(this.f488m, this, null);
    }

    /* renamed from: k */
    int[] m405k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i6 = i4 + 1;
                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i4] = attributeNameResource;
                i4 = i6;
            }
        }
        return StateSet.trimStateSet(iArr, i4);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f489n && super.mutate() == this) {
            this.f488m.mo364r();
            this.f489n = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM406A = this.f488m.m406A(iArr);
        if (iM406A < 0) {
            iM406A = this.f488m.m406A(StateSet.WILD_CARD);
        }
        return m374g(iM406A) || zOnStateChange;
    }

    C0116d(a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (aVar != null) {
            mo350h(aVar);
        }
    }
}
