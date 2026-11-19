package p008a7;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.content.FileProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Objects;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: a7.i */
/* loaded from: classes5.dex */
public abstract class AbstractC0076i {
    /* renamed from: a */
    public static void m196a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static File m197b(Context context, int i10, String str, String str2, String str3) {
        return m198c(context, i10, str, str2, str3);
    }

    /* renamed from: c */
    public static File m198c(Context context, int i10, String str, String str2, String str3) {
        return m199d(context, i10, str, str2, str3);
    }

    /* renamed from: d */
    public static File m199d(Context context, int i10, String str, String str2, String str3) {
        File file;
        File fileM204i;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
                fileM204i = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileM204i.getAbsolutePath());
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append("Camera");
                sb2.append(str4);
                file = new File(sb2.toString());
            } else {
                fileM204i = m204i(applicationContext, i10);
                file = new File(fileM204i.getAbsolutePath() + File.separator);
            }
            if (!fileM204i.exists()) {
                fileM204i.mkdirs();
            }
        } else {
            File file2 = new File(str3);
            File parentFile = file2.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (i10 == 2) {
            if (zIsEmpty) {
                str = AbstractC0071d.m154c("VID_") + ".mp4";
            }
            return new File(file, str);
        }
        if (i10 == 3) {
            if (zIsEmpty) {
                str = AbstractC0071d.m154c("AUD_") + ".amr";
            }
            return new File(file, str);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ".jpg";
        }
        if (zIsEmpty) {
            str = AbstractC0071d.m154c("IMG_") + str2;
        }
        return new File(file, str);
    }

    /* renamed from: e */
    public static String m200e(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1000) {
            Object objValueOf = String.format("%.2f", Double.valueOf(j10));
            double dM236a = AbstractC0084q.m236a(objValueOf);
            long jRound = Math.round(dM236a);
            StringBuilder sb2 = new StringBuilder();
            if (jRound - dM236a == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf = Long.valueOf(jRound);
            }
            sb2.append(objValueOf);
            sb2.append("B");
            return sb2.toString();
        }
        if (j10 < AnimationKt.MillisToNanos) {
            Object objValueOf2 = String.format("%.2f", Double.valueOf(j10 / 1000.0d));
            double dM236a2 = AbstractC0084q.m236a(objValueOf2);
            long jRound2 = Math.round(dM236a2);
            StringBuilder sb3 = new StringBuilder();
            if (jRound2 - dM236a2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf2 = Long.valueOf(jRound2);
            }
            sb3.append(objValueOf2);
            sb3.append("KB");
            return sb3.toString();
        }
        if (j10 < 1000000000) {
            Object objValueOf3 = String.format("%.2f", Double.valueOf(j10 / 1000000.0d));
            double dM236a3 = AbstractC0084q.m236a(objValueOf3);
            long jRound3 = Math.round(dM236a3);
            StringBuilder sb4 = new StringBuilder();
            if (jRound3 - dM236a3 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf3 = Long.valueOf(jRound3);
            }
            sb4.append(objValueOf3);
            sb4.append("MB");
            return sb4.toString();
        }
        Object objValueOf4 = String.format("%.2f", Double.valueOf(j10 / 1.0E9d));
        double dM236a4 = AbstractC0084q.m236a(objValueOf4);
        long jRound4 = Math.round(dM236a4);
        StringBuilder sb5 = new StringBuilder();
        if (jRound4 - dM236a4 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            objValueOf4 = Long.valueOf(jRound4);
        }
        sb5.append(objValueOf4);
        sb5.append("GB");
        return sb5.toString();
    }

    /* renamed from: f */
    public static String m201f(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1024) {
            Object objValueOf = String.format("%.2f", Double.valueOf(j10));
            double dM236a = AbstractC0084q.m236a(objValueOf);
            long jRound = Math.round(dM236a);
            StringBuilder sb2 = new StringBuilder();
            if (jRound - dM236a == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf = Long.valueOf(jRound);
            }
            sb2.append(objValueOf);
            sb2.append("B");
            return sb2.toString();
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            Object objValueOf2 = String.format("%.2f", Double.valueOf(j10 / 1024.0d));
            double dM236a2 = AbstractC0084q.m236a(objValueOf2);
            long jRound2 = Math.round(dM236a2);
            StringBuilder sb3 = new StringBuilder();
            if (jRound2 - dM236a2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf2 = Long.valueOf(jRound2);
            }
            sb3.append(objValueOf2);
            sb3.append("KB");
            return sb3.toString();
        }
        if (j10 < IjkMediaMeta.AV_CH_STEREO_RIGHT) {
            Object objValueOf3 = String.format("%.2f", Double.valueOf(j10 / 1048576.0d));
            double dM236a3 = AbstractC0084q.m236a(objValueOf3);
            long jRound3 = Math.round(dM236a3);
            StringBuilder sb4 = new StringBuilder();
            if (jRound3 - dM236a3 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                objValueOf3 = Long.valueOf(jRound3);
            }
            sb4.append(objValueOf3);
            sb4.append("MB");
            return sb4.toString();
        }
        Object objValueOf4 = String.format("%.2f", Double.valueOf(j10 / 1.073741824E9d));
        double dM236a4 = AbstractC0084q.m236a(objValueOf4);
        long jRound4 = Math.round(dM236a4);
        StringBuilder sb5 = new StringBuilder();
        if (jRound4 - dM236a4 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            objValueOf4 = Long.valueOf(jRound4);
        }
        sb5.append(objValueOf4);
        sb5.append("GB");
        return sb5.toString();
    }

    /* renamed from: g */
    public static String m202g(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            } catch (IllegalArgumentException e10) {
                Log.i("PictureFileUtils", String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e10.getMessage()));
                if (cursorQuery == null) {
                    return "";
                }
            }
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                cursorQuery.close();
                return string;
            }
            if (cursorQuery == null) {
                return "";
            }
            cursorQuery.close();
            return "";
        } finally {
        }
    }

    /* renamed from: h */
    public static String m203h(Context context, Uri uri) {
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (!DocumentsContract.isDocumentUri(applicationContext, uri)) {
            return "content".equalsIgnoreCase(uri.getScheme()) ? m208m(uri) ? uri.getLastPathSegment() : m202g(applicationContext, uri, null, null) : "file".equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : "";
        }
        if (!m206k(uri)) {
            if (m205j(uri)) {
                return m202g(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), AbstractC0084q.m240e(DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (!m210o(uri)) {
                return "";
            }
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m202g(applicationContext, uri2, "_id=?", new String[]{strArrSplit[1]});
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        if (!"primary".equalsIgnoreCase(strArrSplit2[0])) {
            return "";
        }
        if (AbstractC0077j.m217e()) {
            return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + MqttTopic.TOPIC_LEVEL_SEPARATOR + strArrSplit2[1];
        }
        return Environment.getExternalStorageDirectory() + MqttTopic.TOPIC_LEVEL_SEPARATOR + strArrSplit2[1];
    }

    /* renamed from: i */
    public static File m204i(Context context, int i10) {
        return i10 != 2 ? i10 != 3 ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : context.getExternalFilesDir(Environment.DIRECTORY_MUSIC) : context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
    }

    /* renamed from: j */
    public static boolean m205j(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: k */
    public static boolean m206k(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: l */
    public static boolean m207l(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    /* renamed from: m */
    public static boolean m208m(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: n */
    public static boolean m209n(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 2;
        BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    /* renamed from: o */
    public static boolean m210o(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: p */
    public static Uri m211p(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".luckProvider", file);
    }

    /* renamed from: q */
    public static boolean m212q(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e10) {
                e = e10;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = bufferedInputStream2.read(bArr);
                    if (i10 == -1) {
                        outputStream.flush();
                        m196a(bufferedInputStream2);
                        m196a(bufferedOutputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, i10);
                }
            } catch (Exception e11) {
                e = e11;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    m196a(bufferedInputStream);
                    m196a(bufferedOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    m196a(bufferedInputStream);
                    m196a(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                m196a(bufferedInputStream);
                m196a(bufferedOutputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
