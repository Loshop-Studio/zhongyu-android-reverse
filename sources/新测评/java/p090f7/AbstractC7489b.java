package p090f7;

import com.zykj.evaluation.upload.OssToken;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f7.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7489b {
    /* renamed from: a */
    public static final boolean m12120a(OssToken ossToken) throws ParseException {
        Intrinsics.checkNotNullParameter(ossToken, "<this>");
        if (ossToken.getExpiration().length() == 0) {
            return true;
        }
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ossToken.getExpiration());
        return date != null && date.getTime() - ((long) 300000) < System.currentTimeMillis();
    }
}
