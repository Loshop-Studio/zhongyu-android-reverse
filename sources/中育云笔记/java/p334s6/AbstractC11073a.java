package p334s6;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.ContainerUtils;
import com.luck.picture.lib.config.PictureSelectionConfig;
import java.util.Locale;
import p304q6.AbstractC10747g;
import p304q6.InterfaceC10745e;
import p304q6.InterfaceC10746f;

/* renamed from: s6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11073a {

    /* renamed from: c */
    public static final String f26710c = "a";

    /* renamed from: d */
    public static final Uri f26711d = MediaStore.Files.getContentUri("external");

    /* renamed from: e */
    public static final String[] f26712e = {"_id", "_data", "mime_type", "width", "height", TypedValues.TransitionType.S_DURATION, "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation"};

    /* renamed from: f */
    public static final String[] f26713f = {"_id", "_data", "mime_type", "width", "height", TypedValues.TransitionType.S_DURATION, "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation", "COUNT(*) AS count"};

    /* renamed from: a */
    public Context f26714a;

    /* renamed from: b */
    public PictureSelectionConfig f26715b;

    /* renamed from: a */
    public PictureSelectionConfig m24565a() {
        return this.f26715b;
    }

    /* renamed from: b */
    public Context m24566b() {
        return this.f26714a;
    }

    /* renamed from: c */
    public String m24567c() {
        return String.format(Locale.CHINA, "%d <%s duration and duration <= %d", Long.valueOf(Math.max(0L, m24565a().f12369t)), ContainerUtils.KEY_VALUE_DELIMITER, Long.valueOf(m24565a().f12367s == 0 ? Long.MAX_VALUE : m24565a().f12367s));
    }

    /* renamed from: d */
    public String m24568d() {
        return String.format(Locale.CHINA, "%d <%s _size and _size <= %d", Long.valueOf(Math.max(0L, m24565a().f12298A)), ContainerUtils.KEY_VALUE_DELIMITER, Long.valueOf(m24565a().f12381z == 0 ? Long.MAX_VALUE : m24565a().f12381z));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m24569e() {
        /*
            r10 = this;
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.m24565a()
            java.util.List r0 = r0.f12328R
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = -1
        L15:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L28
            goto L15
        L28:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.m24565a()
            int r5 = r5.f12337c
            int r6 = p235l6.AbstractC10150d.m21193d()
            java.lang.String r7 = "audio"
            java.lang.String r8 = "image"
            if (r5 != r6) goto L45
            boolean r5 = r4.startsWith(r8)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r7)
            if (r5 == 0) goto L79
            goto L15
        L45:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.m24565a()
            int r5 = r5.f12337c
            int r6 = p235l6.AbstractC10150d.m21192c()
            java.lang.String r9 = "video"
            if (r5 != r6) goto L60
            boolean r5 = r4.startsWith(r7)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r9)
            if (r5 == 0) goto L79
            goto L15
        L60:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.m24565a()
            int r5 = r5.f12337c
            int r6 = p235l6.AbstractC10150d.m21191b()
            if (r5 != r6) goto L79
            boolean r5 = r4.startsWith(r9)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r8)
            if (r5 == 0) goto L79
            goto L15
        L79:
            int r3 = r3 + 1
            if (r3 != 0) goto L80
            java.lang.String r5 = " AND "
            goto L82
        L80:
            java.lang.String r5 = " OR "
        L82:
            r2.append(r5)
            java.lang.String r5 = "mime_type"
            r2.append(r5)
            java.lang.String r5 = "='"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "'"
            r2.append(r4)
            goto L15
        L99:
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.m24565a()
            int r0 = r0.f12337c
            int r3 = p235l6.AbstractC10150d.m21193d()
            if (r0 == r3) goto Lbc
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.m24565a()
            boolean r0 = r0.f12308F
            if (r0 != 0) goto Lbc
            java.lang.String r0 = p235l6.AbstractC10149c.m21185n()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = " AND (mime_type!='image/gif')"
            r2.append(r0)
        Lbc:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p334s6.AbstractC11073a.m24569e():java.lang.String");
    }

    /* renamed from: f */
    public void m24570f(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f26714a = context;
        this.f26715b = pictureSelectionConfig;
    }

    /* renamed from: g */
    public abstract void mo24571g(InterfaceC10746f interfaceC10746f);

    /* renamed from: h */
    public abstract void mo24572h(InterfaceC10745e interfaceC10745e);

    /* renamed from: i */
    public abstract void mo24573i(long j10, int i10, int i11, AbstractC10747g abstractC10747g);
}
