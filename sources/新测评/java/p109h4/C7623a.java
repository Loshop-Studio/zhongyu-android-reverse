package p109h4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.Utils;
import com.zykj.blackboard.R$drawable;
import com.zykj.blackboard.bean.BoardConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p066d5.InterfaceC7289a;
import p077e5.AbstractC7352m;
import p077e5.C7357r;
import p109h4.AbstractC7625c;
import p109h4.AbstractC7628f;
import p120i4.C7663c;
import p120i4.C7665e;

/* renamed from: h4.a */
/* loaded from: classes4.dex */
public final class C7623a {

    /* renamed from: c */
    public static final a f12782c = new a(null);

    /* renamed from: a */
    public final BoardConfig f12783a;

    /* renamed from: b */
    public final Paint f12784b;

    /* renamed from: h4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7623a(BoardConfig boardConfig) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f12783a = boardConfig;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f12784b = paint;
    }

    /* renamed from: a */
    public final boolean m12552a(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }

    /* renamed from: b */
    public final void m12553b(Canvas canvas, C7665e c7665e, C7663c c7663c, Paint paint, int i10, List list) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(c7663c.m12773a(), 6.0f, 6.0f, paint);
        int i11 = 0;
        boolean zM12598e = false;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AbstractC7628f abstractC7628f = (AbstractC7628f) obj;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(abstractC7628f.m12594a());
            RectF rectF = new RectF(((RectF) c7665e.m12793a().get(i11)).left, ((RectF) c7665e.m12793a().get(i11)).top, ((RectF) c7665e.m12793a().get(i11)).right, ((RectF) c7665e.m12793a().get(i11)).bottom);
            Path path = new Path();
            path.addRoundRect(rectF, 6.0f, 6.0f, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                Result.Companion companion = Result.INSTANCE;
                canvas.drawColor(abstractC7628f.m12594a());
                if (abstractC7628f instanceof AbstractC7628f.b) {
                    zM12598e = ((AbstractC7628f.b) abstractC7628f).m12598e();
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(Utils.getApp().getResources(), abstractC7628f.m12594a() != 0 ? R$drawable.blackboard_icon_custom_color_selected : R$drawable.blackboard_icon_custom_color);
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), rectF, (Paint) null);
                }
                if (abstractC7628f.m12595b()) {
                    Path pathM11794f = C7357r.f11925a.m11794f(rectF);
                    paint.setColor(m12552a(abstractC7628f.m12594a()) ? ViewCompat.MEASURED_STATE_MASK : -1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    canvas.drawPath(pathM11794f, paint);
                }
                Result.m24299constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            canvas.restoreToCount(iSave);
            i11 = i12;
        }
        if (zM12598e) {
            m12554c(canvas, c7665e, paint, i10, c7663c.m12774b());
        }
    }

    /* renamed from: c */
    public final void m12554c(Canvas canvas, C7665e c7665e, Paint paint, int i10, RectF rectF) {
        RectF rectFM12794b = c7665e.m12794b();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int iSave = canvas.save();
        canvas.translate(rectFM12794b.left, rectFM12794b.top);
        InterfaceC7289a selectCustomColorView = this.f12783a.getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* renamed from: d */
    public final void m12555d(Canvas canvas, int i10, Path path, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : typeList) {
            if (((AbstractC7625c) obj).m12564a().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM12552a = m12552a(i10);
        int i11 = zM12552a ? -1090519040 : 872415231;
        this.f12784b.setStrokeWidth(3.0f);
        this.f12784b.setColor(zM12552a ? -12085261 : -3355444);
        Paint paint = this.f12784b;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Object obj2 = null;
        this.f12784b.setPathEffect(null);
        canvas.drawPath(path, this.f12784b);
        if (pointF != null) {
            this.f12784b.setStyle(Paint.Style.FILL);
            this.f12784b.setColor(-39424);
            canvas.drawCircle(pointF.x, pointF.y, this.f12783a.getSelectIconWidth() / 8, this.f12784b);
        }
        this.f12784b.setTextSize(25.0f);
        this.f12784b.setStyle(style);
        RectF rectFM12775c = functionBackgroundRectF.m12775c();
        Paint paint2 = this.f12784b;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f12784b.setColor(i11);
        canvas.drawRoundRect(rectFM12775c, 6.0f, 6.0f, this.f12784b);
        this.f12784b.setStyle(style2);
        this.f12784b.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12784b.setTextSize(25.0f);
        float fHeight = (rectFM12775c.bottom - ((rectFM12775c.height() - (this.f12784b.getFontMetrics().bottom - this.f12784b.getFontMetrics().top)) / 2)) - this.f12784b.getFontMetrics().bottom;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList.get(i13);
            i13++;
            AbstractC7625c abstractC7625c = (AbstractC7625c) obj3;
            float f10 = (abstractC7625c instanceof AbstractC7625c.g ? functionRectF.m12801i().left : abstractC7625c instanceof AbstractC7625c.f ? functionRectF.m12798f().left : abstractC7625c instanceof AbstractC7625c.b ? functionRectF.m12796d().left : abstractC7625c instanceof AbstractC7625c.c ? functionRectF.m12797e().left : abstractC7625c instanceof AbstractC7625c.a ? functionRectF.m12795c().left : 8.0f) + 15.0f;
            this.f12784b.setColor(abstractC7625c.m12565b() ? -15370497 : -1);
            canvas.drawText(abstractC7625c.m12564a(), f10, fHeight, this.f12784b);
        }
        int size2 = arrayList.size();
        while (true) {
            if (i12 >= size2) {
                break;
            }
            Object obj4 = arrayList.get(i12);
            i12++;
            if (((AbstractC7625c) obj4).m12565b()) {
                obj2 = obj4;
                break;
            }
        }
        AbstractC7625c abstractC7625c2 = (AbstractC7625c) obj2;
        if (abstractC7625c2 instanceof AbstractC7625c.g) {
            AbstractC7625c.g gVar = (AbstractC7625c.g) abstractC7625c2;
            int i14 = i11;
            m12559h(canvas, functionRectF, this.f12784b, i14, functionBackgroundRectF.m12777e(), this.f12783a.getSelectStrokeWidthList(gVar.m12577f()), gVar.m12576e());
            m12553b(canvas, functionRectF, functionBackgroundRectF, this.f12784b, i14, gVar.m12575d());
            return;
        }
        int i15 = i11;
        if (abstractC7625c2 instanceof AbstractC7625c.f) {
            m12558g(canvas, functionRectF, this.f12784b, i15, functionBackgroundRectF.m12776d());
            m12553b(canvas, functionRectF, functionBackgroundRectF, this.f12784b, i15, ((AbstractC7625c.f) abstractC7625c2).m12571d());
        } else if (abstractC7625c2 instanceof AbstractC7625c.b) {
            m12553b(canvas, functionRectF, functionBackgroundRectF, this.f12784b, i15, ((AbstractC7625c.b) abstractC7625c2).m12567d());
        }
    }

    /* renamed from: e */
    public final Paint m12556e(int i10) {
        this.f12784b.setStrokeWidth(3.0f);
        this.f12784b.setColor(m12552a(i10) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
        this.f12784b.setStyle(Paint.Style.STROKE);
        this.f12784b.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        return this.f12784b;
    }

    /* renamed from: f */
    public final Path m12557f(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.addRect(f10, f11, f12, f13, Path.Direction.CW);
        path.close();
        return path;
    }

    /* renamed from: g */
    public final void m12558g(Canvas canvas, C7665e c7665e, Paint paint, int i10, RectF rectF) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        canvas.drawLine(c7665e.m12800h().centerX() - 12.0f, c7665e.m12800h().centerY(), c7665e.m12800h().centerX() + 12.0f, c7665e.m12800h().centerY(), paint);
        canvas.drawLine(c7665e.m12799g().centerX() - 12.0f, rectF.centerY(), c7665e.m12799g().centerX() + 12.0f, rectF.centerY(), paint);
        canvas.drawLine(c7665e.m12799g().centerX(), rectF.centerY() - 12.0f, c7665e.m12799g().centerX(), rectF.centerY() + 12.0f, paint);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-2130706433);
        canvas.drawLine(rectF.centerX(), rectF.centerY() - 12.0f, rectF.centerX(), rectF.centerY() + 12.0f, paint);
    }

    /* renamed from: h */
    public final void m12559h(Canvas canvas, C7665e c7665e, Paint paint, int i10, RectF rectF, List list, float f10) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            paint.setColor(((Number) obj).floatValue() == f10 ? -15370497 : -3552823);
            canvas.drawCircle(((RectF) c7665e.m12802j().get(i11)).centerX(), ((RectF) c7665e.m12802j().get(i11)).centerY(), ((i11 * 3.0f) + 8.0f) / 2, paint);
            i11 = i12;
        }
    }

    /* renamed from: i */
    public final Path m12560i(RectF selectRectF, List typeList, Matrix matrix) {
        Object obj;
        Object next;
        boolean z9;
        boolean z10;
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = AbstractC7352m.m11777b(matrix).mapRadius(this.f12783a.getSelectIconWidth());
        float f10 = 2;
        float f11 = fMapRadius / f10;
        float f12 = 4;
        float f13 = f11 / f12;
        float fWidth = selectRectF.width() / f10;
        float fHeight = selectRectF.height() / f10;
        Iterator it = typeList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC7625c) next) instanceof AbstractC7625c.b) {
                break;
            }
        }
        AbstractC7625c abstractC7625c = (AbstractC7625c) next;
        boolean zM12568e = abstractC7625c != null ? ((AbstractC7625c.b) abstractC7625c).m12568e() : false;
        Iterator it2 = typeList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AbstractC7625c) next2) instanceof AbstractC7625c.f) {
                obj = next2;
                break;
            }
        }
        AbstractC7625c abstractC7625c2 = (AbstractC7625c) obj;
        boolean zM12572e = abstractC7625c2 != null ? ((AbstractC7625c.f) abstractC7625c2).m12572e() : zM12568e;
        if (typeList == null || !typeList.isEmpty()) {
            Iterator it3 = typeList.iterator();
            while (it3.hasNext()) {
                if (((AbstractC7625c) it3.next()) instanceof AbstractC7625c.d) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        } else {
            z9 = false;
        }
        if (typeList == null || !typeList.isEmpty()) {
            Iterator it4 = typeList.iterator();
            while (it4.hasNext()) {
                if (((AbstractC7625c) it4.next()) instanceof AbstractC7625c.e) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        path.moveTo(selectRectF.left, selectRectF.top);
        path.lineTo(selectRectF.left, (selectRectF.top + fHeight) - f13);
        if (zM12568e) {
            float f14 = selectRectF.left;
            float f15 = selectRectF.top;
            path.addRect(f14 - f13, (f15 + fHeight) - f13, f14 + f13, f15 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left, selectRectF.top + fHeight + f13);
        } else {
            path.lineTo(selectRectF.left, selectRectF.top + fHeight + f13);
        }
        path.lineTo(selectRectF.left, selectRectF.bottom);
        path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.bottom);
        if (zM12568e) {
            float f16 = selectRectF.left;
            float f17 = selectRectF.bottom;
            path.addRect((f16 + fWidth) - f13, f17 - f13, f16 + fWidth + f13, f17 + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        } else {
            path.lineTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        }
        path.lineTo(selectRectF.right - f11, selectRectF.bottom);
        if (z10) {
            C7357r.f11925a.m11791c(path, selectRectF.right, selectRectF.bottom, f11);
        } else {
            path.lineTo(selectRectF.right, selectRectF.bottom);
            path.lineTo(selectRectF.right, selectRectF.bottom - f11);
        }
        path.moveTo(selectRectF.right, selectRectF.bottom - f11);
        path.lineTo(selectRectF.right, selectRectF.top + fHeight + f13);
        if (zM12572e) {
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
        if (zM12568e) {
            float f20 = selectRectF.left;
            float f21 = selectRectF.top;
            path.addRect((f20 + fWidth) - f13, f21 - f13, f20 + fWidth + f13, f21 + f13, Path.Direction.CW);
            path.moveTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        } else {
            path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        }
        path.lineTo(selectRectF.left, selectRectF.top);
        if (z9) {
            float f22 = (fMapRadius * 5) / f12;
            path.moveTo(selectRectF.left + fWidth, (selectRectF.top - f13) - f22);
            path.lineTo(selectRectF.left + fWidth, selectRectF.top - f13);
            if (!zM12568e) {
                path.lineTo(selectRectF.left + fWidth, selectRectF.top);
            }
            C7357r.f11925a.m11790b(path, selectRectF.left + fWidth, ((selectRectF.top - f13) - f22) - f11, f11);
        }
        path.transform(matrix);
        return path;
    }
}
