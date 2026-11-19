package com.zykj.paint.util;

import androidx.camera.video.AudioStats;
import com.zykj.paint.Actions;

/* loaded from: classes5.dex */
public class LineUtils {
    public static double lineSpace(int i10, int i11, int i12, int i13) {
        int i14 = i10 - i12;
        int i15 = i11 - i13;
        return Math.sqrt((i14 * i14) + (i15 * i15));
    }

    public static double point2Line(Actions.EzyPoint ezyPoint, Actions.EzyPoint ezyPoint2, double d10, double d11) {
        return pointToLine((int) ezyPoint.getX(), (int) ezyPoint.getY(), (int) ezyPoint2.getX(), (int) ezyPoint2.getY(), (int) d10, (int) d11);
    }

    public static double point2Polyline(Actions.NewPolylineData newPolylineData, double d10, double d11) {
        int pointsCount = newPolylineData.getPointsCount();
        int i10 = 0;
        double d12 = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (i10 < pointsCount - 1) {
            Actions.EzyPoint points = newPolylineData.getPoints(i10);
            i10++;
            Actions.EzyPoint points2 = newPolylineData.getPoints(i10);
            double dPointToLine = pointToLine((int) points.getX(), (int) points.getY(), (int) points2.getX(), (int) points2.getY(), (int) d10, (int) d11);
            if (d12 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                d12 = dPointToLine;
            }
            if (d12 > dPointToLine) {
                d12 = dPointToLine;
            }
        }
        return d12;
    }

    public static double pointToLine(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dLineSpace = lineSpace(i10, i11, i12, i13);
        double dLineSpace2 = lineSpace(i10, i11, i14, i15);
        double dLineSpace3 = lineSpace(i12, i13, i14, i15);
        if (dLineSpace3 + dLineSpace2 == dLineSpace) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (dLineSpace > 1.0E-6d) {
            double d10 = dLineSpace3 * dLineSpace3;
            double d11 = dLineSpace * dLineSpace;
            double d12 = dLineSpace2 * dLineSpace2;
            if (d10 < d11 + d12) {
                if (d12 >= d11 + d10) {
                    return dLineSpace3;
                }
                double d13 = ((dLineSpace + dLineSpace2) + dLineSpace3) / 2.0d;
                return (Math.sqrt((((d13 - dLineSpace) * d13) * (d13 - dLineSpace2)) * (d13 - dLineSpace3)) * 2.0d) / dLineSpace;
            }
        }
        return dLineSpace2;
    }
}
