package com.google.zxing.client.result;

import androidx.camera.video.AudioStats;
import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class GeoResultParser extends ResultParser {
    private static final Pattern GEO_URL_PATTERN = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // com.google.zxing.client.result.ResultParser
    public GeoParsedResult parse(Result result) throws NumberFormatException {
        Matcher matcher = GEO_URL_PATTERN.matcher(ResultParser.getMassagedText(result));
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(4);
        try {
            double d10 = Double.parseDouble(matcher.group(1));
            if (d10 <= 90.0d && d10 >= -90.0d) {
                double d11 = Double.parseDouble(matcher.group(2));
                if (d11 <= 180.0d && d11 >= -180.0d) {
                    String strGroup2 = matcher.group(3);
                    double d12 = AudioStats.AUDIO_AMPLITUDE_NONE;
                    if (strGroup2 != null) {
                        double d13 = Double.parseDouble(matcher.group(3));
                        if (d13 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                            return null;
                        }
                        d12 = d13;
                    }
                    return new GeoParsedResult(d10, d11, d12, strGroup);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
