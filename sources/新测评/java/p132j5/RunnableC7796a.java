package p132j5;

import android.graphics.Point;
import android.graphics.RectF;
import com.zykj.camera.view.ManualPointView;
import java.util.Map;

/* renamed from: j5.a */
/* loaded from: classes4.dex */
public final class RunnableC7796a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ManualPointView f13456a;

    public RunnableC7796a(ManualPointView manualPointView) {
        this.f13456a = manualPointView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = ((this.f13456a.getWidth() / 10) * 2) / 2;
        int height = (this.f13456a.getHeight() / 10) / 2;
        float width2 = (this.f13456a.getWidth() / 2) - 20.0f;
        float height2 = (this.f13456a.getHeight() / 2) - 20.0f;
        Map map = this.f13456a.f8600a;
        ManualPointView.PointType pointType = ManualPointView.PointType.LEFT_TOP;
        if (map.get(pointType) == null) {
            this.f13456a.f8600a.put(pointType, new Point(width, height));
        }
        Map map2 = this.f13456a.f8600a;
        ManualPointView.PointType pointType2 = ManualPointView.PointType.RIGHT_TOP;
        if (map2.get(pointType2) == null) {
            this.f13456a.f8600a.put(pointType2, new Point(this.f13456a.getWidth() - width, height));
        }
        Map map3 = this.f13456a.f8600a;
        ManualPointView.PointType pointType3 = ManualPointView.PointType.LEFT_BOTTOM;
        if (map3.get(pointType3) == null) {
            this.f13456a.f8600a.put(pointType3, new Point(width, this.f13456a.getHeight() - height));
        }
        Map map4 = this.f13456a.f8600a;
        ManualPointView.PointType pointType4 = ManualPointView.PointType.RIGHT_BOTTOM;
        if (map4.get(pointType4) == null) {
            this.f13456a.f8600a.put(pointType4, new Point(this.f13456a.getWidth() - width, this.f13456a.getHeight() - height));
        }
        Point point = (Point) this.f13456a.f8600a.get(pointType);
        if (point != null) {
            this.f13456a.f8601b.put(pointType, new Point(point.x, point.y));
        }
        Point point2 = (Point) this.f13456a.f8600a.get(pointType2);
        if (point2 != null) {
            this.f13456a.f8601b.put(pointType2, new Point(point2.x, point2.y));
        }
        Point point3 = (Point) this.f13456a.f8600a.get(pointType3);
        if (point3 != null) {
            this.f13456a.f8601b.put(pointType3, new Point(point3.x, point3.y));
        }
        Point point4 = (Point) this.f13456a.f8600a.get(pointType4);
        if (point4 != null) {
            this.f13456a.f8601b.put(pointType4, new Point(point4.x, point4.y));
        }
        float f10 = width2 + 10.0f;
        float f11 = height2 + 10.0f;
        this.f13456a.f8602c.put(pointType, new RectF(10.0f, 10.0f, f10, f11));
        float f12 = width2 + 30.0f;
        this.f13456a.f8602c.put(pointType2, new RectF(f12, 10.0f, this.f13456a.getWidth() - 10.0f, f11));
        float f13 = height2 + 30.0f;
        this.f13456a.f8602c.put(pointType4, new RectF(f12, f13, this.f13456a.getWidth() - 10.0f, this.f13456a.getHeight() - 10.0f));
        this.f13456a.f8602c.put(pointType3, new RectF(10.0f, f13, f10, this.f13456a.getHeight() - 10.0f));
    }
}
