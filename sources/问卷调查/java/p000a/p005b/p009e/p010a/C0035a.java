package p000a.p005b.p009e.p010a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import p000a.p005b.p009e.p010a.C0036b;
import p000a.p005b.p009e.p010a.C0038d;
import p000a.p021e.C0133e;
import p000a.p021e.C0137i;
import p000a.p064r.p065a.p066a.C0437b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.e.a.a */
/* loaded from: classes.dex */
public class C0035a extends C0038d {

    /* renamed from: q */
    public c f214q;

    /* renamed from: r */
    public g f215r;

    /* renamed from: s */
    public int f216s;

    /* renamed from: t */
    public int f217t;

    /* renamed from: u */
    public boolean f218u;

    /* renamed from: a.b.e.a.a$b */
    public static class b extends g {

        /* renamed from: a */
        public final Animatable f219a;

        public b(Animatable animatable) {
            super(null);
            this.f219a = animatable;
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: c */
        public void mo134c() {
            this.f219a.start();
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: d */
        public void mo135d() {
            this.f219a.stop();
        }
    }

    /* renamed from: a.b.e.a.a$c */
    public static class c extends C0038d.a {

        /* renamed from: K */
        public C0133e<Long> f220K;

        /* renamed from: L */
        public C0137i<Integer> f221L;

        public c(c cVar, C0035a c0035a, Resources resources) {
            C0137i<Integer> c0137i;
            super(cVar, c0035a, resources);
            if (cVar != null) {
                this.f220K = cVar.f220K;
                c0137i = cVar.f221L;
            } else {
                this.f220K = new C0133e<>();
                c0137i = new C0137i<>();
            }
            this.f221L = c0137i;
        }

        /* renamed from: h */
        public static long m136h(int i, int i2) {
            return i2 | (i << 32);
        }

        @Override // p000a.p005b.p009e.p010a.C0038d.a, p000a.p005b.p009e.p010a.C0036b.c
        /* renamed from: e */
        public void mo137e() {
            this.f220K = this.f220K.clone();
            this.f221L = this.f221L.clone();
        }

        /* renamed from: i */
        public int m138i(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f221L.m521d(i, 0).intValue();
        }

        @Override // p000a.p005b.p009e.p010a.C0038d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0035a(this, null);
        }

        @Override // p000a.p005b.p009e.p010a.C0038d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0035a(this, resources);
        }
    }

    /* renamed from: a.b.e.a.a$d */
    public static class d extends g {

        /* renamed from: a */
        public final C0437b f222a;

        public d(C0437b c0437b) {
            super(null);
            this.f222a = c0437b;
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: c */
        public void mo134c() {
            this.f222a.start();
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: d */
        public void mo135d() {
            this.f222a.stop();
        }
    }

    /* renamed from: a.b.e.a.a$e */
    public static class e extends g {

        /* renamed from: a */
        public final ObjectAnimator f223a;

        /* renamed from: b */
        public final boolean f224b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.f227c);
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f224b = z2;
            this.f223a = objectAnimatorOfInt;
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: a */
        public boolean mo139a() {
            return this.f224b;
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: b */
        public void mo140b() {
            this.f223a.reverse();
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: c */
        public void mo134c() {
            this.f223a.start();
        }

        @Override // p000a.p005b.p009e.p010a.C0035a.g
        /* renamed from: d */
        public void mo135d() {
            this.f223a.cancel();
        }
    }

    /* renamed from: a.b.e.a.a$f */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f225a;

        /* renamed from: b */
        public int f226b;

        /* renamed from: c */
        public int f227c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f226b = numberOfFrames;
            int[] iArr = this.f225a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f225a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f225a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f227c = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i = (int) ((f2 * this.f227c) + 0.5f);
            int i2 = this.f226b;
            int[] iArr = this.f225a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f227c : 0.0f);
        }
    }

    /* renamed from: a.b.e.a.a$g */
    public static abstract class g {
        public g(a aVar) {
        }

        /* renamed from: a */
        public boolean mo139a() {
            return false;
        }

        /* renamed from: b */
        public void mo140b() {
        }

        /* renamed from: c */
        public abstract void mo134c();

        /* renamed from: d */
        public abstract void mo135d();
    }

    public C0035a() {
        this(null, null);
    }

    public C0035a(c cVar, Resources resources) {
        super(null);
        this.f216s = -1;
        this.f217t = -1;
        c cVar2 = new c(cVar, this, resources);
        super.mo132e(cVar2);
        this.f214q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0216, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021d, code lost:
    
        return r5;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p005b.p009e.p010a.C0035a m130g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009e.p010a.C0035a.m130g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.e.a.a");
    }

    @Override // p000a.p005b.p009e.p010a.C0038d, p000a.p005b.p009e.p010a.C0036b
    /* renamed from: b */
    public C0036b.c mo131b() {
        return new c(this.f214q, this, null);
    }

    @Override // p000a.p005b.p009e.p010a.C0038d, p000a.p005b.p009e.p010a.C0036b
    /* renamed from: e */
    public void mo132e(C0036b.c cVar) {
        super.mo132e(cVar);
        if (cVar instanceof c) {
            this.f214q = (c) cVar;
        }
    }

    @Override // p000a.p005b.p009e.p010a.C0038d
    /* renamed from: f */
    public C0038d.a mo131b() {
        return new c(this.f214q, this, null);
    }

    @Override // p000a.p005b.p009e.p010a.C0038d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f215r;
        if (gVar != null) {
            gVar.mo135d();
            this.f215r = null;
            m143d(this.f216s);
            this.f216s = -1;
            this.f217t = -1;
        }
    }

    @Override // p000a.p005b.p009e.p010a.C0038d, p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f218u) {
            super.mutate();
            if (this == this) {
                this.f214q.mo137e();
                this.f218u = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    @Override // p000a.p005b.p009e.p010a.C0038d, p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009e.p010a.C0035a.onStateChange(int[]):boolean");
    }

    @Override // p000a.p005b.p009e.p010a.C0036b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.f215r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo134c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
