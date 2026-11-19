package p292x4;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p253t5.InterfaceC9615a;
import p263u5.AbstractC9695n;
import p263u5.C9700s;
import p272v4.C9763b;
import p292x4.AbstractC9879c;
import p292x4.AbstractC9882f;
import p302y4.C9950c;
import p302y4.C9952e;

/* renamed from: x4.a */
/* loaded from: classes4.dex */
public final class C9877a {

    /* renamed from: c */
    public static final a f17631c = new a(null);

    /* renamed from: a */
    public final C9763b f17632a;

    /* renamed from: b */
    public final Paint f17633b;

    /* renamed from: x4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C9877a(C9763b boardConfig) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f17632a = boardConfig;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f17633b = paint;
    }

    /* renamed from: a */
    public final boolean m16879a(int i9) {
        return ((((double) ((i9 >> 16) & 255)) * 0.299d) + (((double) ((i9 >> 8) & 255)) * 0.578d)) + (((double) (i9 & 255)) * 0.114d) >= 192.0d;
    }

    /* renamed from: b */
    public final void m16880b(Canvas canvas, C9952e c9952e, C9950c c9950c, Paint paint, int i9, List list) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i9);
        canvas.drawRoundRect(c9950c.m17195a(), 6.0f, 6.0f, paint);
        int i10 = 0;
        boolean zM16925e = false;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AbstractC9882f abstractC9882f = (AbstractC9882f) obj;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(abstractC9882f.m16921a());
            RectF rectF = new RectF(((RectF) c9952e.m17215a().get(i10)).left, ((RectF) c9952e.m17215a().get(i10)).top, ((RectF) c9952e.m17215a().get(i10)).right, ((RectF) c9952e.m17215a().get(i10)).bottom);
            Path path = new Path();
            path.addRoundRect(rectF, 6.0f, 6.0f, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                Result.Companion companion = Result.INSTANCE;
                canvas.drawColor(abstractC9882f.m16921a());
                if (abstractC9882f instanceof AbstractC9882f.b) {
                    zM16925e = ((AbstractC9882f.b) abstractC9882f).m16925e();
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(Utils.getApp().getResources(), abstractC9882f.m16921a() != 0 ? R$drawable.blackboard_icon_custom_color_selected : R$drawable.blackboard_icon_custom_color);
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), rectF, (Paint) null);
                }
                if (abstractC9882f.m16922b()) {
                    Path pathM16218f = C9700s.f17138a.m16218f(rectF);
                    paint.setColor(m16879a(abstractC9882f.m16921a()) ? ViewCompat.MEASURED_STATE_MASK : -1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    canvas.drawPath(pathM16218f, paint);
                }
                Result.m24758constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            canvas.restoreToCount(iSave);
            i10 = i11;
        }
        if (zM16925e) {
            m16881c(canvas, c9952e, paint, i9, c9950c.m17196b());
        }
    }

    /* renamed from: c */
    public final void m16881c(Canvas canvas, C9952e c9952e, Paint paint, int i9, RectF rectF) {
        RectF rectFM17216b = c9952e.m17216b();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i9);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int iSave = canvas.save();
        canvas.translate(rectFM17216b.left, rectFM17216b.top);
        InterfaceC9615a interfaceC9615aM16456G = this.f17632a.m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* renamed from: d */
    public final void m16882d(Canvas canvas, int i9, Path path, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : typeList) {
            if (((AbstractC9879c) obj).m16891a().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM16879a = m16879a(i9);
        int i10 = zM16879a ? -1090519040 : 872415231;
        this.f17633b.setStrokeWidth(3.0f);
        this.f17633b.setColor(zM16879a ? -12085261 : -3355444);
        Paint paint = this.f17633b;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Object obj2 = null;
        this.f17633b.setPathEffect(null);
        canvas.drawPath(path, this.f17633b);
        if (pointF != null) {
            this.f17633b.setStyle(Paint.Style.FILL);
            this.f17633b.setColor(-39424);
            canvas.drawCircle(pointF.x, pointF.y, this.f17632a.m16459J() / 8, this.f17633b);
        }
        this.f17633b.setTextSize(25.0f);
        this.f17633b.setStyle(style);
        RectF rectFM17197c = functionBackgroundRectF.m17197c();
        Paint paint2 = this.f17633b;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f17633b.setColor(i10);
        canvas.drawRoundRect(rectFM17197c, 6.0f, 6.0f, this.f17633b);
        this.f17633b.setStyle(style2);
        this.f17633b.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f17633b.setTextSize(25.0f);
        float fHeight = (rectFM17197c.bottom - ((rectFM17197c.height() - (this.f17633b.getFontMetrics().bottom - this.f17633b.getFontMetrics().top)) / 2)) - this.f17633b.getFontMetrics().bottom;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList.get(i12);
            i12++;
            AbstractC9879c abstractC9879c = (AbstractC9879c) obj3;
            float f10 = (abstractC9879c instanceof AbstractC9879c.g ? functionRectF.m17223i().left : abstractC9879c instanceof AbstractC9879c.f ? functionRectF.m17220f().left : abstractC9879c instanceof AbstractC9879c.b ? functionRectF.m17218d().left : abstractC9879c instanceof AbstractC9879c.c ? functionRectF.m17219e().left : abstractC9879c instanceof AbstractC9879c.a ? functionRectF.m17217c().left : 8.0f) + 15.0f;
            this.f17633b.setColor(abstractC9879c.m16892b() ? -15370497 : -1);
            canvas.drawText(abstractC9879c.m16891a(), f10, fHeight, this.f17633b);
        }
        int size2 = arrayList.size();
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj4 = arrayList.get(i11);
            i11++;
            if (((AbstractC9879c) obj4).m16892b()) {
                obj2 = obj4;
                break;
            }
        }
        AbstractC9879c abstractC9879c2 = (AbstractC9879c) obj2;
        if (abstractC9879c2 instanceof AbstractC9879c.g) {
            AbstractC9879c.g gVar = (AbstractC9879c.g) abstractC9879c2;
            int i13 = i10;
            m16886h(canvas, functionRectF, this.f17633b, i13, functionBackgroundRectF.m17199e(), this.f17632a.m16462M(gVar.m16904f()), gVar.m16903e());
            m16880b(canvas, functionRectF, functionBackgroundRectF, this.f17633b, i13, gVar.m16902d());
            return;
        }
        int i14 = i10;
        if (abstractC9879c2 instanceof AbstractC9879c.f) {
            m16885g(canvas, functionRectF, this.f17633b, i14, functionBackgroundRectF.m17198d());
            m16880b(canvas, functionRectF, functionBackgroundRectF, this.f17633b, i14, ((AbstractC9879c.f) abstractC9879c2).m16898d());
        } else if (abstractC9879c2 instanceof AbstractC9879c.b) {
            m16880b(canvas, functionRectF, functionBackgroundRectF, this.f17633b, i14, ((AbstractC9879c.b) abstractC9879c2).m16894d());
        }
    }

    /* renamed from: e */
    public final Paint m16883e(int i9) {
        this.f17633b.setStrokeWidth(3.0f);
        this.f17633b.setColor(m16879a(i9) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
        this.f17633b.setStyle(Paint.Style.STROKE);
        this.f17633b.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        return this.f17633b;
    }

    /* renamed from: f */
    public final Path m16884f(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.addRect(f10, f11, f12, f13, Path.Direction.CW);
        path.close();
        return path;
    }

    /* renamed from: g */
    public final void m16885g(Canvas canvas, C9952e c9952e, Paint paint, int i9, RectF rectF) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i9);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        canvas.drawLine(c9952e.m17222h().centerX() - 12.0f, c9952e.m17222h().centerY(), c9952e.m17222h().centerX() + 12.0f, c9952e.m17222h().centerY(), paint);
        canvas.drawLine(c9952e.m17221g().centerX() - 12.0f, rectF.centerY(), c9952e.m17221g().centerX() + 12.0f, rectF.centerY(), paint);
        canvas.drawLine(c9952e.m17221g().centerX(), rectF.centerY() - 12.0f, c9952e.m17221g().centerX(), rectF.centerY() + 12.0f, paint);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-2130706433);
        canvas.drawLine(rectF.centerX(), rectF.centerY() - 12.0f, rectF.centerX(), rectF.centerY() + 12.0f, paint);
    }

    /* renamed from: h */
    public final void m16886h(Canvas canvas, C9952e c9952e, Paint paint, int i9, RectF rectF, List list, float f10) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i9);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            paint.setColor(((Number) obj).floatValue() == f10 ? -15370497 : -3552823);
            canvas.drawCircle(((RectF) c9952e.m17224j().get(i10)).centerX(), ((RectF) c9952e.m17224j().get(i10)).centerY(), ((i10 * 3.0f) + 8.0f) / 2, paint);
            i10 = i11;
        }
    }

    /* renamed from: i */
    public final Path m16887i(RectF selectRectF, List typeList, Matrix matrix) {
        Object obj;
        Object next;
        boolean z9;
        boolean z10;
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = AbstractC9695n.m16200b(matrix).mapRadius(this.f17632a.m16459J());
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
            if (((AbstractC9879c) next) instanceof AbstractC9879c.b) {
                break;
            }
        }
        AbstractC9879c abstractC9879c = (AbstractC9879c) next;
        boolean zM16895e = abstractC9879c != null ? ((AbstractC9879c.b) abstractC9879c).m16895e() : false;
        Iterator it2 = typeList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AbstractC9879c) next2) instanceof AbstractC9879c.f) {
                obj = next2;
                break;
            }
        }
        AbstractC9879c abstractC9879c2 = (AbstractC9879c) obj;
        boolean zM16899e = abstractC9879c2 != null ? ((AbstractC9879c.f) abstractC9879c2).m16899e() : zM16895e;
        if (typeList == null || !typeList.isEmpty()) {
            Iterator it3 = typeList.iterator();
            while (it3.hasNext()) {
                if (((AbstractC9879c) it3.next()) instanceof AbstractC9879c.d) {
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
                if (((AbstractC9879c) it4.next()) instanceof AbstractC9879c.e) {
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
        if (zM16895e) {
            float f14 = selectRectF.left;
            float f15 = selectRectF.top;
            path.addRect(f14 - f13, (f15 + fHeight) - f13, f14 + f13, f15 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left, selectRectF.top + fHeight + f13);
        } else {
            path.lineTo(selectRectF.left, selectRectF.top + fHeight + f13);
        }
        path.lineTo(selectRectF.left, selectRectF.bottom);
        path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.bottom);
        if (zM16895e) {
            float f16 = selectRectF.left;
            float f17 = selectRectF.bottom;
            path.addRect((f16 + fWidth) - f13, f17 - f13, f16 + fWidth + f13, f17 + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        } else {
            path.lineTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        }
        path.lineTo(selectRectF.right - f11, selectRectF.bottom);
        if (z10) {
            C9700s.f17138a.m16215c(path, selectRectF.right, selectRectF.bottom, f11);
        } else {
            path.lineTo(selectRectF.right, selectRectF.bottom);
            path.lineTo(selectRectF.right, selectRectF.bottom - f11);
        }
        path.moveTo(selectRectF.right, selectRectF.bottom - f11);
        path.lineTo(selectRectF.right, selectRectF.top + fHeight + f13);
        if (zM16899e) {
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
        if (zM16895e) {
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
            if (!zM16895e) {
                path.lineTo(selectRectF.left + fWidth, selectRectF.top);
            }
            C9700s.f17138a.m16214b(path, selectRectF.left + fWidth, ((selectRectF.top - f13) - f22) - f11, f11);
        }
        path.transform(matrix);
        return path;
    }
}
