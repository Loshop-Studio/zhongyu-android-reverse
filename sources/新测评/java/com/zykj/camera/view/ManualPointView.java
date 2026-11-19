package com.zykj.camera.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p132j5.RunnableC7796a;

/* loaded from: classes4.dex */
public final class ManualPointView extends View {

    /* renamed from: i */
    public static final C6847a f8599i = new C6847a(null);

    /* renamed from: a */
    public Map f8600a;

    /* renamed from: b */
    public Map f8601b;

    /* renamed from: c */
    public final Map f8602c;

    /* renamed from: d */
    public final Paint f8603d;

    /* renamed from: e */
    public PointType f8604e;

    /* renamed from: f */
    public Bitmap f8605f;

    /* renamed from: g */
    public float f8606g;

    /* renamed from: h */
    public float f8607h;

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcom/zykj/camera/view/ManualPointView$PointType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "camera_release"}, m13559k = 1, m13560mv = {1, 4, 0})
    public enum PointType {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    /* renamed from: com.zykj.camera.view.ManualPointView$a */
    public static final class C6847a {
        public C6847a() {
        }

        public /* synthetic */ C6847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.zykj.camera.view.ManualPointView$b */
    public static final class RunnableC6848b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Bitmap f8614b;

        public RunnableC6848b(Bitmap bitmap) {
            this.f8614b = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ManualPointView.this.f8605f = this.f8614b;
            ManualPointView.this.invalidate();
        }
    }

    /* renamed from: com.zykj.camera.view.ManualPointView$c */
    public static final class RunnableC6849c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f8616b;

        public RunnableC6849c(String str) {
            this.f8616b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f8616b, null);
            ManualPointView manualPointView = ManualPointView.this;
            manualPointView.f8605f = Bitmap.createScaledBitmap(bitmapDecodeFile, manualPointView.getWidth(), ManualPointView.this.getHeight(), true);
            ManualPointView.this.invalidate();
        }
    }

    public ManualPointView(Context context) {
        super(context);
        this.f8600a = new LinkedHashMap();
        this.f8601b = new LinkedHashMap();
        this.f8602c = new LinkedHashMap();
        Paint paint = new Paint();
        this.f8603d = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
        paint.setStrokeWidth(10.0f);
        post(new RunnableC7796a(this));
    }

    /* renamed from: e */
    public final PointType m8640e(float f10, float f11) {
        for (PointType pointType : this.f8601b.keySet()) {
            Object obj = this.f8601b.get(pointType);
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            Point point = (Point) obj;
            int i10 = point.x;
            int i11 = point.y;
            if (((i10 - f10) * (i10 - f10)) + ((i11 - f11) * (i11 - f11)) <= 5000.0f) {
                return pointType;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[PHI: r6
      0x004f: PHI (r6v9 float) = (r6v4 float), (r6v5 float) binds: [B:16:0x004d, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8641f(com.zykj.camera.view.ManualPointView.PointType r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f8601b
            java.lang.Object r0 = r0.get(r5)
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        Lb:
            android.graphics.Point r0 = (android.graphics.Point) r0
            java.util.Map r1 = r4.f8600a
            java.lang.Object r1 = r1.get(r5)
            if (r1 != 0) goto L18
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L18:
            android.graphics.Point r1 = (android.graphics.Point) r1
            java.util.Map r2 = r4.f8602c
            java.lang.Object r5 = r2.get(r5)
            if (r5 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L25:
            android.graphics.RectF r5 = (android.graphics.RectF) r5
            int r2 = r1.x
            float r2 = (float) r2
            float r3 = r6.getX()
            float r2 = r2 + r3
            float r3 = r4.f8606g
            float r2 = r2 - r3
            int r1 = r1.y
            float r1 = (float) r1
            float r6 = r6.getY()
            float r1 = r1 + r6
            float r6 = r4.f8607h
            float r1 = r1 - r6
            boolean r6 = r5.contains(r2, r1)
            if (r6 == 0) goto L49
            int r5 = (int) r2
            int r6 = (int) r1
            r0.set(r5, r6)
            return
        L49:
            float r6 = r5.left
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto L51
        L4f:
            r2 = r6
            goto L58
        L51:
            float r6 = r5.right
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 <= 0) goto L58
            goto L4f
        L58:
            float r6 = r5.top
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L60
            r1 = r6
            goto L67
        L60:
            float r5 = r5.bottom
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L67
            r1 = r5
        L67:
            int r5 = (int) r2
            int r6 = (int) r1
            r0.set(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.camera.view.ManualPointView.m8641f(com.zykj.camera.view.ManualPointView$PointType, android.view.MotionEvent):void"); // DEX body: android/新测评/smali_classes4/com/zykj/camera/view/ManualPointView.smali:347
    }

    public final PointType getCurrentClickPointType() {
        return this.f8604e;
    }

    public final Map<PointType, Point> getPointMap() {
        return this.f8600a;
    }

    public final Map<PointType, RectF> getRangeRectMap() {
        return this.f8602c;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f8605f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f8605f;
        if (bitmap != null && canvas != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        for (Point point : this.f8601b.values()) {
            if (canvas != null) {
                canvas.drawCircle(point.x, point.y, 10.0f, this.f8603d);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PointType pointType;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f8606g = motionEvent.getX();
                this.f8607h = motionEvent.getY();
                this.f8604e = m8640e(motionEvent.getX(), motionEvent.getY());
            } else if (action == 1) {
                PointType pointType2 = this.f8604e;
                if (pointType2 != null) {
                    Object obj = this.f8601b.get(pointType2);
                    if (obj == null) {
                        Intrinsics.throwNpe();
                    }
                    this.f8600a.put(pointType2, new Point((Point) obj));
                }
            } else if (action == 2 && (pointType = this.f8604e) != null) {
                m8641f(pointType, motionEvent);
            }
            invalidate();
        }
        return true;
    }

    public final void setBackBitmap(Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        post(new RunnableC6848b(bitmap));
    }

    public final void setCurrentClickPointType(PointType pointType) {
        this.f8604e = pointType;
    }

    public final void setImagePath(String imagePath) {
        Intrinsics.checkParameterIsNotNull(imagePath, "imagePath");
        post(new RunnableC6849c(imagePath));
    }

    public final void setPointMap(Map<PointType, Point> points) {
        Intrinsics.checkParameterIsNotNull(points, "points");
        PointType pointType = PointType.LEFT_TOP;
        Point point = points.get(pointType);
        if (point != null) {
            this.f8600a.put(pointType, new Point(point.x, point.y));
            this.f8601b.put(pointType, new Point(point.x, point.y));
        }
        PointType pointType2 = PointType.RIGHT_TOP;
        Point point2 = points.get(pointType2);
        if (point2 != null) {
            this.f8600a.put(pointType2, new Point(point2.x, point2.y));
            this.f8601b.put(pointType2, new Point(point2.x, point2.y));
        }
        PointType pointType3 = PointType.LEFT_BOTTOM;
        Point point3 = points.get(pointType3);
        if (point3 != null) {
            this.f8600a.put(pointType3, new Point(point3.x, point3.y));
            this.f8601b.put(pointType3, new Point(point3.x, point3.y));
        }
        PointType pointType4 = PointType.RIGHT_BOTTOM;
        Point point4 = points.get(pointType4);
        if (point4 != null) {
            this.f8600a.put(pointType4, new Point(point4.x, point4.y));
            this.f8601b.put(pointType4, new Point(point4.x, point4.y));
        }
    }
}
