package com.zykj.paint.util;

import androidx.camera.video.AudioStats;
import com.zykj.paint.Actions;

/* loaded from: classes3.dex */
public class LineUtils {
    public static double lineSpace(int i, int i8, int i9, int i10) {
        int i11 = i - i9;
        int i12 = i8 - i10;
        return Math.sqrt((i12 * i12) + (i11 * i11));
    }

    public static double point2Line(Actions.EzyPoint ezyPoint, Actions.EzyPoint ezyPoint2, double d9, double d10) {
        return pointToLine((int) ezyPoint.getX(), (int) ezyPoint.getY(), (int) ezyPoint2.getX(), (int) ezyPoint2.getY(), (int) d9, (int) d10);
    }

    public static double point2Polyline(Actions.NewPolylineData newPolylineData, double d9, double d10) {
        int pointsCount = newPolylineData.getPointsCount();
        int i = 0;
        double d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (i < pointsCount - 1) {
            Actions.EzyPoint points = newPolylineData.getPoints(i);
            i++;
            Actions.EzyPoint points2 = newPolylineData.getPoints(i);
            double dPointToLine = pointToLine((int) points.getX(), (int) points.getY(), (int) points2.getX(), (int) points2.getY(), (int) d9, (int) d10);
            if (d11 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                d11 = dPointToLine;
            }
            if (d11 > dPointToLine) {
                d11 = dPointToLine;
            }
        }
        return d11;
    }

    public static double pointToLine(int i, int i8, int i9, int i10, int i11, int i12) {
        double dLineSpace = lineSpace(i, i8, i9, i10);
        double dLineSpace2 = lineSpace(i, i8, i11, i12);
        double dLineSpace3 = lineSpace(i9, i10, i11, i12);
        if (dLineSpace3 + dLineSpace2 == dLineSpace) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (dLineSpace > 1.0E-6d) {
            double d9 = dLineSpace3 * dLineSpace3;
            double d10 = dLineSpace * dLineSpace;
            double d11 = dLineSpace2 * dLineSpace2;
            if (d9 < d10 + d11) {
                if (d11 >= d10 + d9) {
                    return dLineSpace3;
                }
                double d12 = ((dLineSpace + dLineSpace2) + dLineSpace3) / 2.0d;
                return (Math.sqrt((d12 - dLineSpace3) * ((d12 - dLineSpace2) * ((d12 - dLineSpace) * d12))) * 2.0d) / dLineSpace;
            }
        }
        return dLineSpace2;
    }
}
