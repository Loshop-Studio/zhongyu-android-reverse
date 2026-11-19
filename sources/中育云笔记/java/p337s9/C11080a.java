package p337s9;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10343f;
import na.C10356s;
import p307q9.C10762b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p337s9.AbstractC11082c;
import p348t9.C11257d;

/* renamed from: s9.a */
/* loaded from: classes5.dex */
public final class C11080a {

    /* renamed from: c */
    public static final a f26738c = new a(null);

    /* renamed from: a */
    public final C10762b f26739a;

    /* renamed from: b */
    public final Paint f26740b;

    /* renamed from: s9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C11080a(C10762b boardConfig) {
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        this.f26739a = boardConfig;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f26740b = paint;
    }

    /* renamed from: a */
    public final void m24630a(Canvas canvas, C11257d c11257d, Paint paint, int i10, List list, int i11) {
        float fM22861E = (this.f26739a.m22861E() - 38.0f) / 2;
        RectF rectF = new RectF(((RectF) AbstractC10947g0.m23944m0(c11257d.m25169a())).left - 23.0f, ((RectF) AbstractC10947g0.m23944m0(c11257d.m25169a())).top - fM22861E, ((RectF) AbstractC10947g0.m23956y0(c11257d.m25169a())).right + 23.0f, ((RectF) AbstractC10947g0.m23956y0(c11257d.m25169a())).bottom + fM22861E);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC10978w.m24145w();
            }
            int iIntValue = ((Number) obj).intValue();
            paint.setStyle(Paint.Style.FILL);
            int i14 = ViewCompat.MEASURED_STATE_MASK;
            paint.setColor((16777215 & iIntValue) | ViewCompat.MEASURED_STATE_MASK);
            RectF rectF2 = new RectF(((RectF) c11257d.m25169a().get(i12)).left, ((RectF) c11257d.m25169a().get(i12)).top, ((RectF) c11257d.m25169a().get(i12)).right, ((RectF) c11257d.m25169a().get(i12)).bottom);
            canvas.drawRoundRect(rectF2, 6.0f, 6.0f, paint);
            if (iIntValue == i11) {
                Path pathM21683f = C10356s.f24665a.m21683f(rectF2);
                if (!C10343f.f24649a.m21631a(i11)) {
                    i14 = -1;
                }
                paint.setColor(i14);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(3.0f);
                canvas.drawPath(pathM21683f, paint);
            }
            i12 = i13;
        }
    }

    /* renamed from: b */
    public final void m24631b(Canvas canvas, boolean z10, Path path, C11257d functionRectF, List typeList, PointF pointF) {
        List listM22865I;
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : typeList) {
            if (((AbstractC11082c) obj).m24640a().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = z10 ? -1090519040 : 872415231;
        this.f26740b.setStrokeWidth(3.0f);
        this.f26740b.setColor(z10 ? -12085261 : -3355444);
        Paint paint = this.f26740b;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Object obj2 = null;
        this.f26740b.setPathEffect(null);
        canvas.drawPath(path, this.f26740b);
        if (pointF != null) {
            this.f26740b.setStyle(Paint.Style.FILL);
            this.f26740b.setColor(-39424);
            canvas.drawCircle(pointF.x, pointF.y, this.f26739a.m22864H() / 8, this.f26740b);
        }
        this.f26740b.setTextSize(25.0f);
        this.f26740b.setStyle(style);
        RectF rectF = new RectF();
        rectF.union(functionRectF.m25176h());
        rectF.union(functionRectF.m25173e());
        rectF.union(functionRectF.m25171c());
        rectF.union(functionRectF.m25172d());
        rectF.union(functionRectF.m25170b());
        rectF.left -= 8.0f;
        rectF.right += 8.0f;
        Paint paint2 = this.f26740b;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f26740b.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, this.f26740b);
        this.f26740b.setStyle(style2);
        this.f26740b.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f26740b.setTextSize(25.0f);
        float fHeight = (rectF.bottom - ((rectF.height() - (this.f26740b.getFontMetrics().bottom - this.f26740b.getFontMetrics().top)) / 2)) - this.f26740b.getFontMetrics().bottom;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList.get(i12);
            i12++;
            AbstractC11082c abstractC11082c = (AbstractC11082c) obj3;
            float f10 = (abstractC11082c instanceof AbstractC11082c.g ? functionRectF.m25176h().left : abstractC11082c instanceof AbstractC11082c.f ? functionRectF.m25173e().left : abstractC11082c instanceof AbstractC11082c.b ? functionRectF.m25171c().left : abstractC11082c instanceof AbstractC11082c.c ? functionRectF.m25172d().left : abstractC11082c instanceof AbstractC11082c.a ? functionRectF.m25170b().left : 8.0f) + 15.0f;
            this.f26740b.setColor(abstractC11082c.m24641b() ? -15370497 : -1);
            canvas.drawText(abstractC11082c.m24640a(), f10, fHeight, this.f26740b);
        }
        int size2 = arrayList.size();
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj4 = arrayList.get(i11);
            i11++;
            if (((AbstractC11082c) obj4).m24641b()) {
                obj2 = obj4;
                break;
            }
        }
        AbstractC11082c abstractC11082c2 = (AbstractC11082c) obj2;
        if (!(abstractC11082c2 instanceof AbstractC11082c.g)) {
            if (abstractC11082c2 instanceof AbstractC11082c.f) {
                m24634e(canvas, functionRectF, this.f26740b, i10);
                m24630a(canvas, functionRectF, this.f26740b, i10, this.f26739a.m22865I(), ((AbstractC11082c.f) abstractC11082c2).m24647d());
                return;
            } else {
                if (abstractC11082c2 instanceof AbstractC11082c.b) {
                    m24630a(canvas, functionRectF, this.f26740b, i10, this.f26739a.m22865I(), ((AbstractC11082c.b) abstractC11082c2).m24643d());
                    return;
                }
                return;
            }
        }
        AbstractC11082c.g gVar = (AbstractC11082c.g) abstractC11082c2;
        m24635f(canvas, functionRectF, this.f26740b, i10, gVar.m24653f() ? this.f26739a.m22863G() : this.f26739a.m22866J(), gVar.m24652e());
        Paint paint3 = this.f26740b;
        if (gVar.m24653f()) {
            List listM22865I2 = this.f26739a.m22865I();
            listM22865I = new ArrayList(AbstractC10980x.m24153x(listM22865I2, 10));
            Iterator it = listM22865I2.iterator();
            while (it.hasNext()) {
                listM22865I.add(Integer.valueOf((((Number) it.next()).intValue() & ViewCompat.MEASURED_SIZE_MASK) | (((int) (this.f26739a.m22915v() * 255)) << 24)));
            }
        } else {
            listM22865I = this.f26739a.m22865I();
        }
        m24630a(canvas, functionRectF, paint3, i10, listM22865I, gVar.m24651d());
    }

    /* renamed from: c */
    public final Paint m24632c(boolean z10) {
        this.f26740b.setStrokeWidth(3.0f);
        this.f26740b.setColor(z10 ? ViewCompat.MEASURED_STATE_MASK : -3355444);
        this.f26740b.setStyle(Paint.Style.STROKE);
        this.f26740b.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        return this.f26740b;
    }

    /* renamed from: d */
    public final Path m24633d(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.addRect(f10, f11, f12, f13, Path.Direction.CW);
        path.close();
        return path;
    }

    /* renamed from: e */
    public final void m24634e(Canvas canvas, C11257d c11257d, Paint paint, int i10) {
        RectF rectF = new RectF(c11257d.m25175g().left, c11257d.m25175g().top, c11257d.m25174f().right, c11257d.m25174f().bottom);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        canvas.drawLine(c11257d.m25175g().centerX() - 12.0f, c11257d.m25175g().centerY(), c11257d.m25175g().centerX() + 12.0f, c11257d.m25175g().centerY(), paint);
        canvas.drawLine(c11257d.m25174f().centerX() - 12.0f, rectF.centerY(), c11257d.m25174f().centerX() + 12.0f, rectF.centerY(), paint);
        canvas.drawLine(c11257d.m25174f().centerX(), rectF.centerY() - 12.0f, c11257d.m25174f().centerX(), rectF.centerY() + 12.0f, paint);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-2130706433);
        canvas.drawLine(rectF.centerX(), rectF.centerY() - 12.0f, rectF.centerX(), rectF.centerY() + 12.0f, paint);
    }

    /* renamed from: f */
    public final void m24635f(Canvas canvas, C11257d c11257d, Paint paint, int i10, List list, float f10) {
        RectF rectF = new RectF(((RectF) AbstractC10947g0.m23944m0(c11257d.m25177i())).left - 16.0f, ((RectF) AbstractC10947g0.m23944m0(c11257d.m25177i())).top, ((RectF) AbstractC10947g0.m23956y0(c11257d.m25177i())).right + 16.0f, ((RectF) AbstractC10947g0.m23944m0(c11257d.m25177i())).bottom);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            paint.setColor(((Number) obj).floatValue() == f10 ? -15370497 : -3552823);
            canvas.drawCircle(((RectF) c11257d.m25177i().get(i11)).centerX(), ((RectF) c11257d.m25177i().get(i11)).centerY(), ((i11 * 3.0f) + 8.0f) / 2, paint);
            i11 = i12;
        }
    }

    /* renamed from: g */
    public final Path m24636g(RectF selectRectF, List typeList, Matrix matrix) {
        Object obj;
        Object next;
        boolean z10;
        boolean z11;
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        AbstractC9979u.m20294g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = AbstractC10351n.m21660b(matrix).mapRadius(this.f26739a.m22864H());
        float f10 = 2;
        float f11 = fMapRadius / f10;
        float f12 = 4;
        float f13 = f11 / f12;
        float fWidth = selectRectF.width() / f10;
        float fHeight = selectRectF.height() / f10;
        List list = typeList;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC11082c) next) instanceof AbstractC11082c.b) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) next;
        boolean zM24644e = abstractC11082c != null ? ((AbstractC11082c.b) abstractC11082c).m24644e() : false;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AbstractC11082c) next2) instanceof AbstractC11082c.f) {
                obj = next2;
                break;
            }
        }
        AbstractC11082c abstractC11082c2 = (AbstractC11082c) obj;
        boolean zM24648e = abstractC11082c2 != null ? ((AbstractC11082c.f) abstractC11082c2).m24648e() : zM24644e;
        boolean z12 = list instanceof Collection;
        if (z12 && list.isEmpty()) {
            z10 = false;
        } else {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((AbstractC11082c) it3.next()) instanceof AbstractC11082c.d) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (z12 && list.isEmpty()) {
            z11 = false;
        } else {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (((AbstractC11082c) it4.next()) instanceof AbstractC11082c.e) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        path.moveTo(selectRectF.left, selectRectF.top);
        path.lineTo(selectRectF.left, (selectRectF.top + fHeight) - f13);
        if (zM24644e) {
            float f14 = selectRectF.left;
            float f15 = selectRectF.top;
            path.addRect(f14 - f13, (f15 + fHeight) - f13, f14 + f13, f15 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left, selectRectF.top + fHeight + f13);
        } else {
            path.lineTo(selectRectF.left, selectRectF.top + fHeight + f13);
        }
        path.lineTo(selectRectF.left, selectRectF.bottom);
        path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.bottom);
        if (zM24644e) {
            float f16 = selectRectF.left;
            float f17 = selectRectF.bottom;
            path.addRect((f16 + fWidth) - f13, f17 - f13, f16 + fWidth + f13, f17 + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        } else {
            path.lineTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        }
        path.lineTo(selectRectF.right - f11, selectRectF.bottom);
        if (z11) {
            C10356s.f24665a.m21680c(path, selectRectF.right, selectRectF.bottom, f11);
        } else {
            path.lineTo(selectRectF.right, selectRectF.bottom);
            path.lineTo(selectRectF.right, selectRectF.bottom - f11);
        }
        path.moveTo(selectRectF.right, selectRectF.bottom - f11);
        path.lineTo(selectRectF.right, selectRectF.top + fHeight + f13);
        if (zM24648e) {
            float f18 = selectRectF.right;
            float f19 = selectRectF.top;
            path.addRect(f18 - f13, (f19 + fHeight) - f13, f18 + f13, f19 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.right, (selectRectF.top + fHeight) - f13);
        } else {
            path.lineTo(selectRectF.right, (selectRectF.top + fHeight) - f13);
        }
        path.lineTo(selectRectF.right, selectRectF.top);
        path.moveTo(selectRectF.right, selectRectF.top);
        path.lineTo(selectRectF.left + fWidth + f13, selectRectF.top);
        if (zM24644e) {
            float f20 = selectRectF.left;
            float f21 = selectRectF.top;
            path.addRect((f20 + fWidth) - f13, f21 - f13, f20 + fWidth + f13, f21 + f13, Path.Direction.CW);
            path.moveTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        } else {
            path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        }
        path.lineTo(selectRectF.left, selectRectF.top);
        if (z10) {
            float f22 = (fMapRadius * 5) / f12;
            path.moveTo(selectRectF.left + fWidth, (selectRectF.top - f13) - f22);
            path.lineTo(selectRectF.left + fWidth, selectRectF.top - f13);
            if (!zM24644e) {
                path.lineTo(selectRectF.left + fWidth, selectRectF.top);
            }
            C10356s.f24665a.m21679b(path, selectRectF.left + fWidth, ((selectRectF.top - f13) - f22) - f11, f11);
        }
        path.transform(matrix);
        return path;
    }
}
