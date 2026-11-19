package p008a7;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import p219k6.AbstractC9820b;
import p235l6.AbstractC10149c;
import p273o6.C10446b;
import p304q6.InterfaceC10742b;

/* renamed from: a7.h */
/* loaded from: classes5.dex */
public abstract class AbstractC0075h {

    /* renamed from: a7.h$a */
    public class a extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ Context f62h;

        /* renamed from: i */
        public final /* synthetic */ String f63i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC10742b f64j;

        public a(Context context, String str, InterfaceC10742b interfaceC10742b) {
            this.f62h = context;
            this.f63i = str;
            this.f64j = interfaceC10742b;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C10446b mo192d() {
            return AbstractC0075h.m188k(this.f62h, this.f63i);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(C10446b c10446b) {
            PictureThreadUtils.m9580d(this);
            InterfaceC10742b interfaceC10742b = this.f64j;
            if (interfaceC10742b != null) {
                interfaceC10742b.mo9094a(c10446b);
            }
        }
    }

    /* renamed from: a */
    public static Bundle m178a(String str, String[] strArr, int i10, int i11, String str2) {
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (AbstractC0077j.m218f()) {
                bundle.putString("android:query-arg-sql-limit", i10 + " offset " + i11);
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static void m179b(Context context, String str) {
        try {
            if (AbstractC10149c.m21174c(str)) {
                context.getContentResolver().delete(Uri.parse(str), null, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: c */
    public static String m180c(String str) {
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : "Camera";
    }

    /* renamed from: d */
    public static C10446b m181d(Context context, String str) throws IOException {
        C10446b c10446b = new C10446b();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                if (AbstractC10149c.m21174c(str)) {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                c10446b.m21830d(AbstractC0084q.m240e(mediaMetadataRetriever.extractMetadata(9)));
                mediaMetadataRetriever.release();
                return c10446b;
            } catch (Exception e10) {
                e10.printStackTrace();
                mediaMetadataRetriever.release();
                return c10446b;
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* renamed from: e */
    public static int m182e(Context context, String str) {
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {"%" + str + "%"};
                cursorQuery = AbstractC0077j.m218f() ? context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, m178a("_data like ?", strArr, 1, 0, "_id DESC"), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery == null || cursorQuery.getCount() <= 0 || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                int i10 = AbstractC0071d.m152a(cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"))) <= 1 ? cursorQuery.getInt(cursorQuery.getColumnIndex("_id")) : -1;
                cursorQuery.close();
                return i10;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return -1;
            }
        } finally {
        }
    }

    /* renamed from: f */
    public static C10446b m183f(Context context, String str) {
        BitmapFactory.Options options;
        InputStream inputStreamM19892a;
        C10446b c10446b = new C10446b();
        InputStream inputStream = null;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                inputStreamM19892a = AbstractC10149c.m21174c(str) ? AbstractC9820b.m19892a(context, Uri.parse(str)) : new FileInputStream(str);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            BitmapFactory.decodeStream(inputStreamM19892a, null, options);
            c10446b.m21833g(options.outWidth);
            c10446b.m21831e(options.outHeight);
            AbstractC0076i.m196a(inputStreamM19892a);
            return c10446b;
        } catch (Exception e11) {
            inputStream = inputStreamM19892a;
            e = e11;
            e.printStackTrace();
            AbstractC0076i.m196a(inputStream);
            return c10446b;
        } catch (Throwable th2) {
            inputStream = inputStreamM19892a;
            th = th2;
            AbstractC0076i.m196a(inputStream);
            throw th;
        }
    }

    /* renamed from: g */
    public static String m184g(File file) {
        return URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    /* renamed from: h */
    public static String m185h(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = m184g(new File(str));
        }
        return TextUtils.isEmpty(mimeTypeFromExtension) ? "image/jpeg" : mimeTypeFromExtension;
    }

    /* renamed from: i */
    public static Long[] m186i(Context context, String str) {
        Long[] lArr = {0L, 0L};
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {"%" + str + "%"};
                cursorQuery = AbstractC0077j.m218f() ? context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, m178a("_data like ?", strArr, 1, 0, "_id DESC"), null) : context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                    lArr[0] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                    lArr[1] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id")));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return lArr;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return lArr;
        } finally {
        }
    }

    /* renamed from: j */
    public static String m187j(long j10, String str) {
        return ContentUris.withAppendedId(AbstractC10149c.m21179h(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : AbstractC10149c.m21180i(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : AbstractC10149c.m21175d(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external"), j10).toString();
    }

    /* renamed from: k */
    public static C10446b m188k(Context context, String str) {
        int iM238c;
        int iM238c2;
        C10446b c10446b = new C10446b();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                if (AbstractC10149c.m21174c(str)) {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                if (TextUtils.equals("90", strExtractMetadata) || TextUtils.equals("270", strExtractMetadata)) {
                    int iM238c3 = AbstractC0084q.m238c(mediaMetadataRetriever.extractMetadata(18));
                    iM238c = iM238c3;
                    iM238c2 = AbstractC0084q.m238c(mediaMetadataRetriever.extractMetadata(19));
                } else {
                    iM238c2 = AbstractC0084q.m238c(mediaMetadataRetriever.extractMetadata(18));
                    iM238c = AbstractC0084q.m238c(mediaMetadataRetriever.extractMetadata(19));
                }
                c10446b.m21833g(iM238c2);
                c10446b.m21831e(iM238c);
                c10446b.m21832f(strExtractMetadata);
                c10446b.m21830d(AbstractC0084q.m240e(mediaMetadataRetriever.extractMetadata(9)));
                mediaMetadataRetriever.release();
                return c10446b;
            } catch (Exception e10) {
                e10.printStackTrace();
                mediaMetadataRetriever.release();
                return c10446b;
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* renamed from: l */
    public static void m189l(Context context, String str, InterfaceC10742b interfaceC10742b) {
        PictureThreadUtils.m9584h(new a(context, str, interfaceC10742b));
    }

    /* renamed from: m */
    public static boolean m190m(int i10, int i11) {
        return i10 > 0 && i11 > 0 && i11 > i10 * 3;
    }

    /* renamed from: n */
    public static void m191n(Context context, int i10) {
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{Long.toString(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
