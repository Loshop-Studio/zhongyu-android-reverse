package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C0247a;
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p148s.C3364b;
import p148s.C3368f;
import p148s.C3369g;
import p152t.C3387f;
import p156u.C3403a;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
/* loaded from: classes.dex */
public class C0762h extends AbstractC0761g {

    /* renamed from: k */
    static final PorterDuff.Mode f4526k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private h f4527b;

    /* renamed from: c */
    private PorterDuffColorFilter f4528c;

    /* renamed from: d */
    private ColorFilter f4529d;

    /* renamed from: e */
    private boolean f4530e;

    /* renamed from: f */
    private boolean f4531f;

    /* renamed from: g */
    private Drawable.ConstantState f4532g;

    /* renamed from: h */
    private final float[] f4533h;

    /* renamed from: i */
    private final Matrix f4534i;

    /* renamed from: j */
    private final Rect f4535j;

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    private static class b extends f {
        b() {
        }

        /* renamed from: f */
        private void m3964f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4562b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4561a = C3387f.m10312d(string2);
            }
            this.f4563c = C3369g.m10251g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0762h.f
        /* renamed from: c */
        public boolean mo3965c() {
            return true;
        }

        /* renamed from: e */
        public void m3966e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C3369g.m10254j(xmlPullParser, "pathData")) {
                TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4501d);
                m3964f(typedArrayM10255k, xmlPullParser);
                typedArrayM10255k.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    private static abstract class e {
        private e() {
        }

        /* renamed from: a */
        public boolean mo3970a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo3971b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f4582a;

        /* renamed from: b */
        g f4583b;

        /* renamed from: c */
        ColorStateList f4584c;

        /* renamed from: d */
        PorterDuff.Mode f4585d;

        /* renamed from: e */
        boolean f4586e;

        /* renamed from: f */
        Bitmap f4587f;

        /* renamed from: g */
        ColorStateList f4588g;

        /* renamed from: h */
        PorterDuff.Mode f4589h;

        /* renamed from: i */
        int f4590i;

        /* renamed from: j */
        boolean f4591j;

        /* renamed from: k */
        boolean f4592k;

        /* renamed from: l */
        Paint f4593l;

        public h(h hVar) {
            this.f4584c = null;
            this.f4585d = C0762h.f4526k;
            if (hVar != null) {
                this.f4582a = hVar.f4582a;
                g gVar = new g(hVar.f4583b);
                this.f4583b = gVar;
                if (hVar.f4583b.f4570e != null) {
                    gVar.f4570e = new Paint(hVar.f4583b.f4570e);
                }
                if (hVar.f4583b.f4569d != null) {
                    this.f4583b.f4569d = new Paint(hVar.f4583b.f4569d);
                }
                this.f4584c = hVar.f4584c;
                this.f4585d = hVar.f4585d;
                this.f4586e = hVar.f4586e;
            }
        }

        /* renamed from: a */
        public boolean m3984a(int i4, int i5) {
            return i4 == this.f4587f.getWidth() && i5 == this.f4587f.getHeight();
        }

        /* renamed from: b */
        public boolean m3985b() {
            return !this.f4592k && this.f4588g == this.f4584c && this.f4589h == this.f4585d && this.f4591j == this.f4586e && this.f4590i == this.f4583b.getRootAlpha();
        }

        /* renamed from: c */
        public void m3986c(int i4, int i5) {
            if (this.f4587f == null || !m3984a(i4, i5)) {
                this.f4587f = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                this.f4592k = true;
            }
        }

        /* renamed from: d */
        public void m3987d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4587f, (Rect) null, rect, m3988e(colorFilter));
        }

        /* renamed from: e */
        public Paint m3988e(ColorFilter colorFilter) {
            if (!m3989f() && colorFilter == null) {
                return null;
            }
            if (this.f4593l == null) {
                Paint paint = new Paint();
                this.f4593l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4593l.setAlpha(this.f4583b.getRootAlpha());
            this.f4593l.setColorFilter(colorFilter);
            return this.f4593l;
        }

        /* renamed from: f */
        public boolean m3989f() {
            return this.f4583b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m3990g() {
            return this.f4583b.m3982f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4582a;
        }

        /* renamed from: h */
        public boolean m3991h(int[] iArr) {
            boolean zM3983g = this.f4583b.m3983g(iArr);
            this.f4592k |= zM3983g;
            return zM3983g;
        }

        /* renamed from: i */
        public void m3992i() {
            this.f4588g = this.f4584c;
            this.f4589h = this.f4585d;
            this.f4590i = this.f4583b.getRootAlpha();
            this.f4591j = this.f4586e;
            this.f4592k = false;
        }

        /* renamed from: j */
        public void m3993j(int i4, int i5) {
            this.f4587f.eraseColor(0);
            this.f4583b.m3981b(new Canvas(this.f4587f), i4, i5, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0762h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0762h(this);
        }

        public h() {
            this.f4584c = null;
            this.f4585d = C0762h.f4526k;
            this.f4583b = new g();
        }
    }

    C0762h() {
        this.f4531f = true;
        this.f4533h = new float[9];
        this.f4534i = new Matrix();
        this.f4535j = new Rect();
        this.f4527b = new h();
    }

    /* renamed from: a */
    static int m3954a(int i4, float f4) {
        return (i4 & 16777215) | (((int) (Color.alpha(i4) * f4)) << 24);
    }

    /* renamed from: b */
    public static C0762h m3955b(Resources resources, int i4, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0762h c0762h = new C0762h();
            c0762h.f4525a = C3368f.m10233d(resources, i4, theme);
            c0762h.f4532g = new i(c0762h.f4525a.getConstantState());
            return c0762h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i4);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m3956c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e4) {
            Log.e("VectorDrawableCompat", "parser error", e4);
            return null;
        } catch (XmlPullParserException e5) {
            Log.e("VectorDrawableCompat", "parser error", e5);
            return null;
        }
    }

    /* renamed from: c */
    public static C0762h m3956c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0762h c0762h = new C0762h();
        c0762h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0762h;
    }

    /* renamed from: e */
    private void m3957e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f4527b;
        g gVar = hVar.f4583b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4573h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m3972g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4549b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4581p.put(cVar.getPathName(), cVar);
                    }
                    z3 = false;
                    hVar.f4582a = cVar.f4564d | hVar.f4582a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m3966e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4549b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4581p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4582a = bVar.f4564d | hVar.f4582a;
                } else if (AgooMessageReceiver.NOTIFICATION_GROUP.equals(name)) {
                    d dVar2 = new d();
                    dVar2.m3975c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4549b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4581p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4582a = dVar2.f4558k | hVar.f4582a;
                }
            } else if (eventType == 3 && AgooMessageReceiver.NOTIFICATION_GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m3958f() {
        return isAutoMirrored() && C3403a.m10389f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m3959g(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m3960i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f4527b;
        g gVar = hVar.f4583b;
        hVar.f4585d = m3959g(C3369g.m10251g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM10247c = C3369g.m10247c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM10247c != null) {
            hVar.f4584c = colorStateListM10247c;
        }
        hVar.f4586e = C3369g.m10245a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4586e);
        gVar.f4576k = C3369g.m10250f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4576k);
        float fM10250f = C3369g.m10250f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4577l);
        gVar.f4577l = fM10250f;
        if (gVar.f4576k <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM10250f <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f4574i = typedArray.getDimension(3, gVar.f4574i);
        float dimension = typedArray.getDimension(2, gVar.f4575j);
        gVar.f4575j = dimension;
        if (gVar.f4574i <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C3369g.m10250f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f4579n = string;
            gVar.f4581p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4525a;
        if (drawable == null) {
            return false;
        }
        C3403a.m10385b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    Object m3961d(String str) {
        return this.f4527b.f4583b.f4581p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4535j);
        if (this.f4535j.width() <= 0 || this.f4535j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4529d;
        if (colorFilter == null) {
            colorFilter = this.f4528c;
        }
        canvas.getMatrix(this.f4534i);
        this.f4534i.getValues(this.f4533h);
        float fAbs = Math.abs(this.f4533h[0]);
        float fAbs2 = Math.abs(this.f4533h[4]);
        float fAbs3 = Math.abs(this.f4533h[1]);
        float fAbs4 = Math.abs(this.f4533h[3]);
        if (fAbs3 != IGoodView.DEFAULT_TO_ALPHA || fAbs4 != IGoodView.DEFAULT_TO_ALPHA) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f4535j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f4535j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f4535j;
        canvas.translate(rect.left, rect.top);
        if (m3958f()) {
            canvas.translate(this.f4535j.width(), IGoodView.DEFAULT_TO_ALPHA);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4535j.offsetTo(0, 0);
        this.f4527b.m3986c(iMin, iMin2);
        if (!this.f4531f) {
            this.f4527b.m3993j(iMin, iMin2);
        } else if (!this.f4527b.m3985b()) {
            this.f4527b.m3993j(iMin, iMin2);
            this.f4527b.m3992i();
        }
        this.f4527b.m3987d(canvas, colorFilter, this.f4535j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10387d(drawable) : this.f4527b.f4583b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4527b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10388e(drawable) : this.f4529d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4525a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4525a.getConstantState());
        }
        this.f4527b.f4582a = getChangingConfigurations();
        return this.f4527b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4527b.f4583b.f4575j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4527b.f4583b.f4574i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    void m3962h(boolean z3) {
        this.f4531f = z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10391h(drawable) : this.f4527b.f4586e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f4527b) != null && (hVar.m3990g() || ((colorStateList = this.f4527b.f4584c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m3963j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4530e && super.mutate() == this) {
            this.f4527b = new h(this.f4527b);
            this.f4530e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z3 = false;
        h hVar = this.f4527b;
        ColorStateList colorStateList = hVar.f4584c;
        if (colorStateList != null && (mode = hVar.f4585d) != null) {
            this.f4528c = m3963j(this.f4528c, colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        if (!hVar.m3990g() || !hVar.m3991h(iArr)) {
            return z3;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f4527b.f4583b.getRootAlpha() != i4) {
            this.f4527b.f4583b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10393j(drawable, z3);
        } else {
            this.f4527b.f4586e = z3;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10397n(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10398o(drawable, colorStateList);
            return;
        }
        h hVar = this.f4527b;
        if (hVar.f4584c != colorStateList) {
            hVar.f4584c = colorStateList;
            this.f4528c = m3963j(this.f4528c, colorStateList, hVar.f4585d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10399p(drawable, mode);
            return;
        }
        h hVar = this.f4527b;
        if (hVar.f4585d != mode) {
            hVar.f4585d = mode;
            this.f4528c = m3963j(this.f4528c, hVar.f4584c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4594a;

        public i(Drawable.ConstantState constantState) {
            this.f4594a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4594a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4594a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0762h c0762h = new C0762h();
            c0762h.f4525a = (VectorDrawable) this.f4594a.newDrawable();
            return c0762h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0762h c0762h = new C0762h();
            c0762h.f4525a = (VectorDrawable) this.f4594a.newDrawable(resources);
            return c0762h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0762h c0762h = new C0762h();
            c0762h.f4525a = (VectorDrawable) this.f4594a.newDrawable(resources, theme);
            return c0762h;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4529d = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    private static abstract class f extends e {

        /* renamed from: a */
        protected C3387f.b[] f4561a;

        /* renamed from: b */
        String f4562b;

        /* renamed from: c */
        int f4563c;

        /* renamed from: d */
        int f4564d;

        public f() {
            super();
            this.f4561a = null;
            this.f4563c = 0;
        }

        /* renamed from: c */
        public boolean mo3965c() {
            return false;
        }

        /* renamed from: d */
        public void m3976d(Path path) {
            path.reset();
            C3387f.b[] bVarArr = this.f4561a;
            if (bVarArr != null) {
                C3387f.b.m10322e(bVarArr, path);
            }
        }

        public C3387f.b[] getPathData() {
            return this.f4561a;
        }

        public String getPathName() {
            return this.f4562b;
        }

        public void setPathData(C3387f.b[] bVarArr) {
            if (C3387f.m10310b(this.f4561a, bVarArr)) {
                C3387f.m10318j(this.f4561a, bVarArr);
            } else {
                this.f4561a = C3387f.m10314f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4561a = null;
            this.f4563c = 0;
            this.f4562b = fVar.f4562b;
            this.f4564d = fVar.f4564d;
            this.f4561a = C3387f.m10314f(fVar.f4561a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10390g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4527b;
        hVar.f4583b = new g();
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4498a);
        m3960i(typedArrayM10255k, xmlPullParser, theme);
        typedArrayM10255k.recycle();
        hVar.f4582a = getChangingConfigurations();
        hVar.f4592k = true;
        m3957e(resources, xmlPullParser, attributeSet, theme);
        this.f4528c = m3963j(this.f4528c, hVar.f4584c, hVar.f4585d);
    }

    C0762h(h hVar) {
        this.f4531f = true;
        this.f4533h = new float[9];
        this.f4534i = new Matrix();
        this.f4535j = new Rect();
        this.f4527b = hVar;
        this.f4528c = m3963j(this.f4528c, hVar.f4584c, hVar.f4585d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    private static class c extends f {

        /* renamed from: e */
        private int[] f4536e;

        /* renamed from: f */
        C3364b f4537f;

        /* renamed from: g */
        float f4538g;

        /* renamed from: h */
        C3364b f4539h;

        /* renamed from: i */
        float f4540i;

        /* renamed from: j */
        float f4541j;

        /* renamed from: k */
        float f4542k;

        /* renamed from: l */
        float f4543l;

        /* renamed from: m */
        float f4544m;

        /* renamed from: n */
        Paint.Cap f4545n;

        /* renamed from: o */
        Paint.Join f4546o;

        /* renamed from: p */
        float f4547p;

        c() {
            this.f4538g = IGoodView.DEFAULT_TO_ALPHA;
            this.f4540i = 1.0f;
            this.f4541j = 1.0f;
            this.f4542k = IGoodView.DEFAULT_TO_ALPHA;
            this.f4543l = 1.0f;
            this.f4544m = IGoodView.DEFAULT_TO_ALPHA;
            this.f4545n = Paint.Cap.BUTT;
            this.f4546o = Paint.Join.MITER;
            this.f4547p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m3967e(int i4, Paint.Cap cap) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m3968f(int i4, Paint.Join join) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m3969h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4536e = null;
            if (C3369g.m10254j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4562b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4561a = C3387f.m10312d(string2);
                }
                this.f4539h = C3369g.m10249e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4541j = C3369g.m10250f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4541j);
                this.f4545n = m3967e(C3369g.m10251g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4545n);
                this.f4546o = m3968f(C3369g.m10251g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4546o);
                this.f4547p = C3369g.m10250f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4547p);
                this.f4537f = C3369g.m10249e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4540i = C3369g.m10250f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4540i);
                this.f4538g = C3369g.m10250f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4538g);
                this.f4543l = C3369g.m10250f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4543l);
                this.f4544m = C3369g.m10250f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4544m);
                this.f4542k = C3369g.m10250f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4542k);
                this.f4563c = C3369g.m10251g(typedArray, xmlPullParser, "fillType", 13, this.f4563c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0762h.e
        /* renamed from: a */
        public boolean mo3970a() {
            return this.f4539h.m10200i() || this.f4537f.m10200i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0762h.e
        /* renamed from: b */
        public boolean mo3971b(int[] iArr) {
            return this.f4537f.m10201j(iArr) | this.f4539h.m10201j(iArr);
        }

        /* renamed from: g */
        public void m3972g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4500c);
            m3969h(typedArrayM10255k, xmlPullParser, theme);
            typedArrayM10255k.recycle();
        }

        float getFillAlpha() {
            return this.f4541j;
        }

        int getFillColor() {
            return this.f4539h.m10197e();
        }

        float getStrokeAlpha() {
            return this.f4540i;
        }

        int getStrokeColor() {
            return this.f4537f.m10197e();
        }

        float getStrokeWidth() {
            return this.f4538g;
        }

        float getTrimPathEnd() {
            return this.f4543l;
        }

        float getTrimPathOffset() {
            return this.f4544m;
        }

        float getTrimPathStart() {
            return this.f4542k;
        }

        void setFillAlpha(float f4) {
            this.f4541j = f4;
        }

        void setFillColor(int i4) {
            this.f4539h.m10202k(i4);
        }

        void setStrokeAlpha(float f4) {
            this.f4540i = f4;
        }

        void setStrokeColor(int i4) {
            this.f4537f.m10202k(i4);
        }

        void setStrokeWidth(float f4) {
            this.f4538g = f4;
        }

        void setTrimPathEnd(float f4) {
            this.f4543l = f4;
        }

        void setTrimPathOffset(float f4) {
            this.f4544m = f4;
        }

        void setTrimPathStart(float f4) {
            this.f4542k = f4;
        }

        c(c cVar) {
            super(cVar);
            this.f4538g = IGoodView.DEFAULT_TO_ALPHA;
            this.f4540i = 1.0f;
            this.f4541j = 1.0f;
            this.f4542k = IGoodView.DEFAULT_TO_ALPHA;
            this.f4543l = 1.0f;
            this.f4544m = IGoodView.DEFAULT_TO_ALPHA;
            this.f4545n = Paint.Cap.BUTT;
            this.f4546o = Paint.Join.MITER;
            this.f4547p = 4.0f;
            this.f4536e = cVar.f4536e;
            this.f4537f = cVar.f4537f;
            this.f4538g = cVar.f4538g;
            this.f4540i = cVar.f4540i;
            this.f4539h = cVar.f4539h;
            this.f4563c = cVar.f4563c;
            this.f4541j = cVar.f4541j;
            this.f4542k = cVar.f4542k;
            this.f4543l = cVar.f4543l;
            this.f4544m = cVar.f4544m;
            this.f4545n = cVar.f4545n;
            this.f4546o = cVar.f4546o;
            this.f4547p = cVar.f4547p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    private static class g {

        /* renamed from: q */
        private static final Matrix f4565q = new Matrix();

        /* renamed from: a */
        private final Path f4566a;

        /* renamed from: b */
        private final Path f4567b;

        /* renamed from: c */
        private final Matrix f4568c;

        /* renamed from: d */
        Paint f4569d;

        /* renamed from: e */
        Paint f4570e;

        /* renamed from: f */
        private PathMeasure f4571f;

        /* renamed from: g */
        private int f4572g;

        /* renamed from: h */
        final d f4573h;

        /* renamed from: i */
        float f4574i;

        /* renamed from: j */
        float f4575j;

        /* renamed from: k */
        float f4576k;

        /* renamed from: l */
        float f4577l;

        /* renamed from: m */
        int f4578m;

        /* renamed from: n */
        String f4579n;

        /* renamed from: o */
        Boolean f4580o;

        /* renamed from: p */
        final C0247a<String, Object> f4581p;

        public g() {
            this.f4568c = new Matrix();
            this.f4574i = IGoodView.DEFAULT_TO_ALPHA;
            this.f4575j = IGoodView.DEFAULT_TO_ALPHA;
            this.f4576k = IGoodView.DEFAULT_TO_ALPHA;
            this.f4577l = IGoodView.DEFAULT_TO_ALPHA;
            this.f4578m = 255;
            this.f4579n = null;
            this.f4580o = null;
            this.f4581p = new C0247a<>();
            this.f4573h = new d();
            this.f4566a = new Path();
            this.f4567b = new Path();
        }

        /* renamed from: a */
        private static float m3977a(float f4, float f5, float f6, float f7) {
            return (f4 * f7) - (f5 * f6);
        }

        /* renamed from: c */
        private void m3978c(d dVar, Matrix matrix, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            dVar.f4548a.set(matrix);
            dVar.f4548a.preConcat(dVar.f4557j);
            canvas.save();
            for (int i6 = 0; i6 < dVar.f4549b.size(); i6++) {
                e eVar = dVar.f4549b.get(i6);
                if (eVar instanceof d) {
                    m3978c((d) eVar, dVar.f4548a, canvas, i4, i5, colorFilter);
                } else if (eVar instanceof f) {
                    m3979d(dVar, (f) eVar, canvas, i4, i5, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m3979d(d dVar, f fVar, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            float f4 = i4 / this.f4576k;
            float f5 = i5 / this.f4577l;
            float fMin = Math.min(f4, f5);
            Matrix matrix = dVar.f4548a;
            this.f4568c.set(matrix);
            this.f4568c.postScale(f4, f5);
            float fM3980e = m3980e(matrix);
            if (fM3980e == IGoodView.DEFAULT_TO_ALPHA) {
                return;
            }
            fVar.m3976d(this.f4566a);
            Path path = this.f4566a;
            this.f4567b.reset();
            if (fVar.mo3965c()) {
                this.f4567b.setFillType(fVar.f4563c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f4567b.addPath(path, this.f4568c);
                canvas.clipPath(this.f4567b);
                return;
            }
            c cVar = (c) fVar;
            float f6 = cVar.f4542k;
            if (f6 != IGoodView.DEFAULT_TO_ALPHA || cVar.f4543l != 1.0f) {
                float f7 = cVar.f4544m;
                float f8 = (f6 + f7) % 1.0f;
                float f9 = (cVar.f4543l + f7) % 1.0f;
                if (this.f4571f == null) {
                    this.f4571f = new PathMeasure();
                }
                this.f4571f.setPath(this.f4566a, false);
                float length = this.f4571f.getLength();
                float f10 = f8 * length;
                float f11 = f9 * length;
                path.reset();
                if (f10 > f11) {
                    this.f4571f.getSegment(f10, length, path, true);
                    this.f4571f.getSegment(IGoodView.DEFAULT_TO_ALPHA, f11, path, true);
                } else {
                    this.f4571f.getSegment(f10, f11, path, true);
                }
                path.rLineTo(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
            }
            this.f4567b.addPath(path, this.f4568c);
            if (cVar.f4539h.m10203l()) {
                C3364b c3364b = cVar.f4539h;
                if (this.f4570e == null) {
                    Paint paint = new Paint(1);
                    this.f4570e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f4570e;
                if (c3364b.m10199h()) {
                    Shader shaderM10198f = c3364b.m10198f();
                    shaderM10198f.setLocalMatrix(this.f4568c);
                    paint2.setShader(shaderM10198f);
                    paint2.setAlpha(Math.round(cVar.f4541j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0762h.m3954a(c3364b.m10197e(), cVar.f4541j));
                }
                paint2.setColorFilter(colorFilter);
                this.f4567b.setFillType(cVar.f4563c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f4567b, paint2);
            }
            if (cVar.f4537f.m10203l()) {
                C3364b c3364b2 = cVar.f4537f;
                if (this.f4569d == null) {
                    Paint paint3 = new Paint(1);
                    this.f4569d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f4569d;
                Paint.Join join = cVar.f4546o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f4545n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f4547p);
                if (c3364b2.m10199h()) {
                    Shader shaderM10198f2 = c3364b2.m10198f();
                    shaderM10198f2.setLocalMatrix(this.f4568c);
                    paint4.setShader(shaderM10198f2);
                    paint4.setAlpha(Math.round(cVar.f4540i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0762h.m3954a(c3364b2.m10197e(), cVar.f4540i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f4538g * fMin * fM3980e);
                canvas.drawPath(this.f4567b, paint4);
            }
        }

        /* renamed from: e */
        private float m3980e(Matrix matrix) {
            float[] fArr = {IGoodView.DEFAULT_TO_ALPHA, 1.0f, 1.0f, IGoodView.DEFAULT_TO_ALPHA};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM3977a = m3977a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            return fMax > IGoodView.DEFAULT_TO_ALPHA ? Math.abs(fM3977a) / fMax : IGoodView.DEFAULT_TO_ALPHA;
        }

        /* renamed from: b */
        public void m3981b(Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            m3978c(this.f4573h, f4565q, canvas, i4, i5, colorFilter);
        }

        /* renamed from: f */
        public boolean m3982f() {
            if (this.f4580o == null) {
                this.f4580o = Boolean.valueOf(this.f4573h.mo3970a());
            }
            return this.f4580o.booleanValue();
        }

        /* renamed from: g */
        public boolean m3983g(int[] iArr) {
            return this.f4573h.mo3971b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4578m;
        }

        public void setAlpha(float f4) {
            setRootAlpha((int) (f4 * 255.0f));
        }

        public void setRootAlpha(int i4) {
            this.f4578m = i4;
        }

        public g(g gVar) {
            this.f4568c = new Matrix();
            this.f4574i = IGoodView.DEFAULT_TO_ALPHA;
            this.f4575j = IGoodView.DEFAULT_TO_ALPHA;
            this.f4576k = IGoodView.DEFAULT_TO_ALPHA;
            this.f4577l = IGoodView.DEFAULT_TO_ALPHA;
            this.f4578m = 255;
            this.f4579n = null;
            this.f4580o = null;
            C0247a<String, Object> c0247a = new C0247a<>();
            this.f4581p = c0247a;
            this.f4573h = new d(gVar.f4573h, c0247a);
            this.f4566a = new Path(gVar.f4566a);
            this.f4567b = new Path(gVar.f4567b);
            this.f4574i = gVar.f4574i;
            this.f4575j = gVar.f4575j;
            this.f4576k = gVar.f4576k;
            this.f4577l = gVar.f4577l;
            this.f4572g = gVar.f4572g;
            this.f4578m = gVar.f4578m;
            this.f4579n = gVar.f4579n;
            String str = gVar.f4579n;
            if (str != null) {
                c0247a.put(str, this);
            }
            this.f4580o = gVar.f4580o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    private static class d extends e {

        /* renamed from: a */
        final Matrix f4548a;

        /* renamed from: b */
        final ArrayList<e> f4549b;

        /* renamed from: c */
        float f4550c;

        /* renamed from: d */
        private float f4551d;

        /* renamed from: e */
        private float f4552e;

        /* renamed from: f */
        private float f4553f;

        /* renamed from: g */
        private float f4554g;

        /* renamed from: h */
        private float f4555h;

        /* renamed from: i */
        private float f4556i;

        /* renamed from: j */
        final Matrix f4557j;

        /* renamed from: k */
        int f4558k;

        /* renamed from: l */
        private int[] f4559l;

        /* renamed from: m */
        private String f4560m;

        public d(d dVar, C0247a<String, Object> c0247a) {
            f bVar;
            super();
            this.f4548a = new Matrix();
            this.f4549b = new ArrayList<>();
            this.f4550c = IGoodView.DEFAULT_TO_ALPHA;
            this.f4551d = IGoodView.DEFAULT_TO_ALPHA;
            this.f4552e = IGoodView.DEFAULT_TO_ALPHA;
            this.f4553f = 1.0f;
            this.f4554g = 1.0f;
            this.f4555h = IGoodView.DEFAULT_TO_ALPHA;
            this.f4556i = IGoodView.DEFAULT_TO_ALPHA;
            Matrix matrix = new Matrix();
            this.f4557j = matrix;
            this.f4560m = null;
            this.f4550c = dVar.f4550c;
            this.f4551d = dVar.f4551d;
            this.f4552e = dVar.f4552e;
            this.f4553f = dVar.f4553f;
            this.f4554g = dVar.f4554g;
            this.f4555h = dVar.f4555h;
            this.f4556i = dVar.f4556i;
            this.f4559l = dVar.f4559l;
            String str = dVar.f4560m;
            this.f4560m = str;
            this.f4558k = dVar.f4558k;
            if (str != null) {
                c0247a.put(str, this);
            }
            matrix.set(dVar.f4557j);
            ArrayList<e> arrayList = dVar.f4549b;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                e eVar = arrayList.get(i4);
                if (eVar instanceof d) {
                    this.f4549b.add(new d((d) eVar, c0247a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f4549b.add(bVar);
                    String str2 = bVar.f4562b;
                    if (str2 != null) {
                        c0247a.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m3973d() {
            this.f4557j.reset();
            this.f4557j.postTranslate(-this.f4551d, -this.f4552e);
            this.f4557j.postScale(this.f4553f, this.f4554g);
            this.f4557j.postRotate(this.f4550c, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
            this.f4557j.postTranslate(this.f4555h + this.f4551d, this.f4556i + this.f4552e);
        }

        /* renamed from: e */
        private void m3974e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4559l = null;
            this.f4550c = C3369g.m10250f(typedArray, xmlPullParser, "rotation", 5, this.f4550c);
            this.f4551d = typedArray.getFloat(1, this.f4551d);
            this.f4552e = typedArray.getFloat(2, this.f4552e);
            this.f4553f = C3369g.m10250f(typedArray, xmlPullParser, "scaleX", 3, this.f4553f);
            this.f4554g = C3369g.m10250f(typedArray, xmlPullParser, "scaleY", 4, this.f4554g);
            this.f4555h = C3369g.m10250f(typedArray, xmlPullParser, "translateX", 6, this.f4555h);
            this.f4556i = C3369g.m10250f(typedArray, xmlPullParser, "translateY", 7, this.f4556i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4560m = string;
            }
            m3973d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0762h.e
        /* renamed from: a */
        public boolean mo3970a() {
            for (int i4 = 0; i4 < this.f4549b.size(); i4++) {
                if (this.f4549b.get(i4).mo3970a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0762h.e
        /* renamed from: b */
        public boolean mo3971b(int[] iArr) {
            boolean zMo3971b = false;
            for (int i4 = 0; i4 < this.f4549b.size(); i4++) {
                zMo3971b |= this.f4549b.get(i4).mo3971b(iArr);
            }
            return zMo3971b;
        }

        /* renamed from: c */
        public void m3975c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4499b);
            m3974e(typedArrayM10255k, xmlPullParser);
            typedArrayM10255k.recycle();
        }

        public String getGroupName() {
            return this.f4560m;
        }

        public Matrix getLocalMatrix() {
            return this.f4557j;
        }

        public float getPivotX() {
            return this.f4551d;
        }

        public float getPivotY() {
            return this.f4552e;
        }

        public float getRotation() {
            return this.f4550c;
        }

        public float getScaleX() {
            return this.f4553f;
        }

        public float getScaleY() {
            return this.f4554g;
        }

        public float getTranslateX() {
            return this.f4555h;
        }

        public float getTranslateY() {
            return this.f4556i;
        }

        public void setPivotX(float f4) {
            if (f4 != this.f4551d) {
                this.f4551d = f4;
                m3973d();
            }
        }

        public void setPivotY(float f4) {
            if (f4 != this.f4552e) {
                this.f4552e = f4;
                m3973d();
            }
        }

        public void setRotation(float f4) {
            if (f4 != this.f4550c) {
                this.f4550c = f4;
                m3973d();
            }
        }

        public void setScaleX(float f4) {
            if (f4 != this.f4553f) {
                this.f4553f = f4;
                m3973d();
            }
        }

        public void setScaleY(float f4) {
            if (f4 != this.f4554g) {
                this.f4554g = f4;
                m3973d();
            }
        }

        public void setTranslateX(float f4) {
            if (f4 != this.f4555h) {
                this.f4555h = f4;
                m3973d();
            }
        }

        public void setTranslateY(float f4) {
            if (f4 != this.f4556i) {
                this.f4556i = f4;
                m3973d();
            }
        }

        public d() {
            super();
            this.f4548a = new Matrix();
            this.f4549b = new ArrayList<>();
            this.f4550c = IGoodView.DEFAULT_TO_ALPHA;
            this.f4551d = IGoodView.DEFAULT_TO_ALPHA;
            this.f4552e = IGoodView.DEFAULT_TO_ALPHA;
            this.f4553f = 1.0f;
            this.f4554g = 1.0f;
            this.f4555h = IGoodView.DEFAULT_TO_ALPHA;
            this.f4556i = IGoodView.DEFAULT_TO_ALPHA;
            this.f4557j = new Matrix();
            this.f4560m = null;
        }
    }
}
