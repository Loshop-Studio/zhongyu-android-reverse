package com.zykj.sketch.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/sketch/widgets/TempView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Region;", "rectConvertRegion", "(Landroid/graphics/Path;)Landroid/graphics/Region;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TempView extends View {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas != null) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        }
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(15.0f);
        Path path = new Path();
        path.moveTo(10.0f, 10.0f);
        path.lineTo(20.0f, 20.0f);
        path.lineTo(30.0f, 30.0f);
        path.lineTo(40.0f, 40.0f);
        path.lineTo(200.0f, 200.0f);
        Path path2 = new Path();
        path.offset(0.0f, 1.0f, path2);
        path.addPath(path2);
        path2.close();
        RegionIterator regionIterator = new RegionIterator(rectConvertRegion(path));
        Rect rect = new Rect();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        while (regionIterator.next(rect)) {
            if (canvas != null) {
                canvas.drawRect(rect, paint);
            }
        }
        super.onDraw(canvas);
    }

    @NotNull
    public final Region rectConvertRegion(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "path");
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom)));
        return region;
    }
}
