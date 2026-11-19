package p176z;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.umeng.analytics.pro.C1855am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: z.c */
/* loaded from: classes.dex */
class C3501c {

    /* renamed from: a */
    private static final Comparator<byte[]> f12249a = new a();

    /* renamed from: z.c$a */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    if (bArr[i4] != bArr2[i4]) {
                        length = bArr[i4];
                        length2 = bArr2[i4];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m10643a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m10644b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m10645c(C3502d c3502d, Resources resources) {
        return c3502d.m10651b() != null ? c3502d.m10651b() : C3365c.m10206c(resources, c3502d.m10652c());
    }

    /* renamed from: d */
    static C3504f.a m10646d(Context context, C3502d c3502d, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM10647e = m10647e(context.getPackageManager(), c3502d, context.getResources());
        return providerInfoM10647e == null ? C3504f.a.m10668a(1, null) : C3504f.a.m10668a(0, m10648f(context, c3502d, providerInfoM10647e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m10647e(PackageManager packageManager, C3502d c3502d, Resources resources) throws PackageManager.NameNotFoundException {
        String strM10654e = c3502d.m10654e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM10654e, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM10654e);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c3502d.m10655f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM10654e + ", but package was not " + c3502d.m10655f());
        }
        List<byte[]> listM10643a = m10643a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM10643a, f12249a);
        List<List<byte[]>> listM10645c = m10645c(c3502d, resources);
        for (int i4 = 0; i4 < listM10645c.size(); i4++) {
            ArrayList arrayList = new ArrayList(listM10645c.get(i4));
            Collections.sort(arrayList, f12249a);
            if (m10644b(listM10643a, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: f */
    static C3504f.b[] m10648f(Context context, C3502d c3502d, String str, CancellationSignal cancellationSignal) {
        int i4;
        Uri uriWithAppendedId;
        int i5;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uriBuild, new String[]{C1855am.f8398d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c3502d.m10656g()}, null, cancellationSignal);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex(C1855am.f8398d);
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    int i6 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    int i7 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i4 = i6;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                    } else {
                        i4 = i6;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                    }
                    int i8 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursorQuery.getInt(columnIndex6) != 1) {
                        i5 = i4;
                        z3 = false;
                    } else {
                        i5 = i4;
                        z3 = true;
                    }
                    arrayList2.add(C3504f.b.m10671a(uriWithAppendedId, i7, i8, z3, i5));
                }
                arrayList = arrayList2;
            }
            return (C3504f.b[]) arrayList.toArray(new C3504f.b[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
