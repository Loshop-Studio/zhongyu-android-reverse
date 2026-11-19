package p026b7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.camera.view.ManualPointView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;

/* renamed from: b7.b1 */
/* loaded from: classes4.dex */
public abstract class AbstractC4994b1 {
    /* renamed from: e */
    public static final void m2467e(Modifier modifier, final C5037w0 functions, final Bitmap initBitmap, final List initPointList, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(initBitmap, "initBitmap");
        Intrinsics.checkNotNullParameter(initPointList, "initPointList");
        Composer composerStartRestartGroup = composer.startRestartGroup(2097079831);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(functions) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(initBitmap) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(initPointList) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2097079831, i12, -1, "com.zykj.evaluation.ui.sheet.widget.ManualPointView (ManualPointView.kt:24)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(functions) | composerStartRestartGroup.changedInstance(initBitmap) | composerStartRestartGroup.changedInstance(initPointList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: b7.x0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC4994b1.m2468f(functions, initBitmap, initPointList, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, null, composerStartRestartGroup, (i12 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: b7.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4994b1.m2471i(modifier2, functions, initBitmap, initPointList, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final ManualPointView m2468f(C5037w0 c5037w0, final Bitmap bitmap, final List list, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final ManualPointView manualPointView = new ManualPointView(context);
        manualPointView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        final Matrix matrix = new Matrix();
        c5037w0.m2519d(new Function0() { // from class: b7.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC4994b1.m2469g(manualPointView, matrix);
            }
        });
        manualPointView.post(new Runnable() { // from class: b7.a1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4994b1.m2470h(manualPointView, matrix, bitmap, list);
            }
        });
        return manualPointView;
    }

    /* renamed from: g */
    public static final List m2469g(ManualPointView manualPointView, Matrix matrix) {
        Point pointM2472j;
        ArrayList arrayList = new ArrayList();
        Map<ManualPointView.PointType, Point> pointMap = manualPointView.getPointMap();
        Iterator it = CollectionsKt.listOf((Object[]) new ManualPointView.PointType[]{ManualPointView.PointType.LEFT_TOP, ManualPointView.PointType.RIGHT_TOP, ManualPointView.PointType.RIGHT_BOTTOM, ManualPointView.PointType.LEFT_BOTTOM}).iterator();
        while (it.hasNext()) {
            Point point = pointMap.get((ManualPointView.PointType) it.next());
            if (point != null && (pointM2472j = m2472j(point, AbstractC7352m.m11777b(matrix))) != null) {
                arrayList.add(pointM2472j);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final void m2470h(ManualPointView manualPointView, Matrix matrix, Bitmap bitmap, List list) {
        int width = manualPointView.getWidth();
        int height = manualPointView.getHeight();
        matrix.setScale(width / bitmap.getWidth(), height / bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        manualPointView.setBackBitmap(bitmapCreateScaledBitmap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<ManualPointView.PointType, RectF> rangeRectMap = manualPointView.getRangeRectMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Point pointM2472j = m2472j((Point) it.next(), matrix);
            for (ManualPointView.PointType pointType : rangeRectMap.keySet()) {
                RectF rectF = rangeRectMap.get(pointType);
                if (rectF != null && rectF.contains(pointM2472j.x, pointM2472j.y)) {
                    linkedHashMap.put(pointType, pointM2472j);
                }
            }
        }
        manualPointView.setPointMap(linkedHashMap);
    }

    /* renamed from: i */
    public static final Unit m2471i(Modifier modifier, C5037w0 c5037w0, Bitmap bitmap, List list, int i10, int i11, Composer composer, int i12) {
        m2467e(modifier, c5037w0, bitmap, list, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Point m2472j(Point point, Matrix matrix) {
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{point.x, point.y});
        return new Point((int) fArr[0], (int) fArr[1]);
    }
}
