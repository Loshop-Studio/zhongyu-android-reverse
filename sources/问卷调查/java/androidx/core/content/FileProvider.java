package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p031h.p033c.C0192a;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: c */
    public static final String[] f3139c = {"_display_name", "_size"};

    /* renamed from: d */
    public static final File f3140d = new File("/");

    /* renamed from: e */
    public static HashMap<String, InterfaceC0511a> f3141e = new HashMap<>();

    /* renamed from: b */
    public InterfaceC0511a f3142b;

    /* renamed from: androidx.core.content.FileProvider$a */
    public interface InterfaceC0511a {
        /* renamed from: a */
        File mo1696a(Uri uri);

        /* renamed from: b */
        Uri mo1697b(File file);
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public static class C0512b implements InterfaceC0511a {

        /* renamed from: a */
        public final String f3143a;

        /* renamed from: b */
        public final HashMap<String, File> f3144b = new HashMap<>();

        public C0512b(String str) {
            this.f3143a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0511a
        /* renamed from: a */
        public File mo1696a(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f3144b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0511a
        /* renamed from: b */
        public Uri mo1697b(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f3144b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(C0561a.m2076d("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                boolean zEndsWith = path2.endsWith("/");
                int length = path2.length();
                if (!zEndsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f3143a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC0511a m1694a(Context context, String str) {
        InterfaceC0511a interfaceC0511aM1695b;
        synchronized (f3141e) {
            interfaceC0511aM1695b = f3141e.get(str);
            if (interfaceC0511aM1695b == null) {
                try {
                    interfaceC0511aM1695b = m1695b(context, str);
                    f3141e.put(str, interfaceC0511aM1695b);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return interfaceC0511aM1695b;
    }

    /* renamed from: b */
    public static InterfaceC0511a m1695b(Context context, String str) {
        C0512b c0512b = new C0512b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(C0561a.m2076d("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0512b;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f3140d;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = C0192a.f1425a;
                    File[] fileArrM736b = C0192a.b.m736b(context, null);
                    if (fileArrM736b.length > 0) {
                        externalStorageDirectory = fileArrM736b[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = C0192a.f1425a;
                    File[] fileArrM735a = C0192a.b.m735a(context);
                    if (fileArrM735a.length > 0) {
                        externalStorageDirectory = fileArrM735a[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    String[] strArr = {attributeValue2};
                    for (int i = 0; i < 1; i++) {
                        String str2 = strArr[i];
                        if (str2 != null) {
                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                        }
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        c0512b.f3144b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e2);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f3142b = m1694a(context, providerInfo.authority.split(";")[0]);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f3142b.mo1696a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileMo1696a = this.f3142b.mo1696a(uri);
        int iLastIndexOf = fileMo1696a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo1696a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileMo1696a = this.f3142b.mo1696a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C0561a.m2076d("Invalid mode: ", str));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileMo1696a, i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileMo1696a = this.f3142b.mo1696a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f3139c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileMo1696a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileMo1696a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
