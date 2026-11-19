package p008a7;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import com.huawei.hms.framework.common.BundleUtil;
import com.luck.picture.lib.config.PictureSelectionConfig;
import java.io.File;

/* renamed from: a7.g */
/* loaded from: classes5.dex */
public abstract class AbstractC0074g {
    /* renamed from: a */
    public static ContentValues m172a(String str, String str2) {
        String strM242g = AbstractC0084q.m242g(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(Consts.DOT) == -1) {
            contentValues.put("_display_name", AbstractC0071d.m154c("IMG_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(Consts.DOT)), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("video")) {
            str2 = "image/jpeg";
        }
        contentValues.put("mime_type", str2);
        if (AbstractC0077j.m217e()) {
            contentValues.put("datetaken", strM242g);
            contentValues.put("relative_path", "DCIM/Camera");
        }
        return contentValues;
    }

    /* renamed from: b */
    public static ContentValues m173b(String str, String str2) {
        String strM242g = AbstractC0084q.m242g(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(Consts.DOT) == -1) {
            contentValues.put("_display_name", AbstractC0071d.m154c("VID_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(Consts.DOT)), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("image")) {
            str2 = "video/mp4";
        }
        contentValues.put("mime_type", str2);
        if (AbstractC0077j.m217e()) {
            contentValues.put("datetaken", strM242g);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
        }
        return contentValues;
    }

    /* renamed from: c */
    public static Uri m174c(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        if (TextUtils.isEmpty(pictureSelectionConfig.f12331U)) {
            str = "";
        } else if (pictureSelectionConfig.f12338d) {
            str = pictureSelectionConfig.f12331U;
        } else {
            str = System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG + pictureSelectionConfig.f12331U;
        }
        if (AbstractC0077j.m217e() && TextUtils.isEmpty(pictureSelectionConfig.f12334X)) {
            Uri uriM176e = m176e(context, str, pictureSelectionConfig.f12345h);
            pictureSelectionConfig.f12342f0 = uriM176e != null ? uriM176e.toString() : null;
            return uriM176e;
        }
        File fileM197b = AbstractC0076i.m197b(context, 1, str, pictureSelectionConfig.f12341f, pictureSelectionConfig.f12334X);
        pictureSelectionConfig.f12342f0 = fileM197b.getAbsolutePath();
        return AbstractC0076i.m211p(context, fileM197b);
    }

    /* renamed from: d */
    public static Uri m175d(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        if (TextUtils.isEmpty(pictureSelectionConfig.f12332V)) {
            str = "";
        } else if (pictureSelectionConfig.f12338d) {
            str = pictureSelectionConfig.f12332V;
        } else {
            str = System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG + pictureSelectionConfig.f12332V;
        }
        if (AbstractC0077j.m217e() && TextUtils.isEmpty(pictureSelectionConfig.f12334X)) {
            Uri uriM177f = m177f(context, str, pictureSelectionConfig.f12347i);
            pictureSelectionConfig.f12342f0 = uriM177f != null ? uriM177f.toString() : "";
            return uriM177f;
        }
        File fileM197b = AbstractC0076i.m197b(context, 2, str, pictureSelectionConfig.f12343g, pictureSelectionConfig.f12334X);
        pictureSelectionConfig.f12342f0 = fileM197b.getAbsolutePath();
        return AbstractC0076i.m211p(context, fileM197b);
    }

    /* renamed from: e */
    public static Uri m176e(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesM172a = m172a(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValuesM172a);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValuesM172a);
        }
        return uriArr[0];
    }

    /* renamed from: f */
    public static Uri m177f(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesM173b = m173b(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValuesM173b);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, contentValuesM173b);
        }
        return uriArr[0];
    }
}
