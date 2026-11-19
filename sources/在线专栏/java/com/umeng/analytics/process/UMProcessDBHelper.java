package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.InterfaceC1931a;
import com.umeng.common.C1937a;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();
    private InsertEventCallback ekvCallBack = new InsertEventCallback();

    private class InsertEventCallback implements FileLockCallback {
        private InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i4) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(InterfaceC1931a.f8963c)) {
                str = str.replaceFirst(InterfaceC1931a.f8963c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(InterfaceC1931a.f8964d, ""), (JSONArray) obj);
            return true;
        }
    }

    private class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i4) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(InterfaceC1931a.f8963c)) {
                str = str.replaceFirst(InterfaceC1931a.f8963c, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(InterfaceC1931a.f8964d, ""));
            return true;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    private class C1930a implements Serializable {

        /* renamed from: a */
        int f8952a;

        /* renamed from: b */
        String f8953b;

        /* renamed from: c */
        String f8954c;

        /* renamed from: d */
        String f8955d;

        /* renamed from: e */
        int f8956e;

        /* renamed from: f */
        String f8957f;

        /* renamed from: g */
        String f8958g;

        /* renamed from: h */
        String f8959h;

        private C1930a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private List<C1930a> datasAdapter(String str, JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                C1930a c1930a = new C1930a();
                c1930a.f8954c = jSONObject.optString("id");
                c1930a.f8958g = UMUtils.getAppVersionName(this.mContext);
                c1930a.f8959h = UMUtils.getAppVersionCode(this.mContext);
                c1930a.f8953b = jSONObject.optString("__i");
                c1930a.f8956e = jSONObject.optInt("__t");
                c1930a.f8957f = str;
                if (jSONObject.has("ds")) {
                    jSONObject.remove("ds");
                }
                jSONObject.put("ds", getDataSource());
                jSONObject.remove("__i");
                jSONObject.remove("__t");
                c1930a.f8955d = C1937a.m7300a().m7302a(jSONObject.toString());
                jSONObject.remove("ds");
                arrayList.add(c1930a);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(C1932b.m7291b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    private boolean insertEvents_(String str, List<C1930a> list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM7294a = C1933c.m7292a(this.mContext).m7294a(str);
            try {
                try {
                    sQLiteDatabaseM7294a.beginTransaction();
                    for (C1930a c1930a : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", c1930a.f8953b);
                            contentValues.put("__e", c1930a.f8954c);
                            contentValues.put("__t", Integer.valueOf(c1930a.f8956e));
                            contentValues.put(InterfaceC1931a.a.f8974f, c1930a.f8957f);
                            contentValues.put("__av", c1930a.f8958g);
                            contentValues.put("__vc", c1930a.f8959h);
                            contentValues.put("__s", c1930a.f8955d);
                            sQLiteDatabaseM7294a.insert(InterfaceC1931a.a.f8969a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseM7294a.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseM7294a.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    C1933c.m7292a(this.mContext).m7295b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseM7294a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    C1933c.m7292a(this.mContext).m7295b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM7294a;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C1933c.m7292a(this.mContext).m7295b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean processIsService(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) throws Throwable {
        if (dbIsExists(str)) {
            List<C1930a> eventByProcess = readEventByProcess(str);
            if (!eventByProcess.isEmpty() && insertEvents_(InterfaceC1931a.f8968h, eventByProcess)) {
                deleteEventDatas(str, null, eventByProcess);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private List<C1930a> readEventByProcess(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM7294a;
        Exception e4;
        Cursor cursorRawQuery;
        ArrayList arrayList = new ArrayList();
        ?? r22 = 0;
        r22 = 0;
        try {
            try {
                try {
                    sQLiteDatabaseM7294a = C1933c.m7292a(this.mContext).m7294a(str);
                } catch (Throwable th) {
                    th = th;
                    r22 = "select *  from __et_p";
                }
                try {
                    sQLiteDatabaseM7294a.beginTransaction();
                    cursorRawQuery = sQLiteDatabaseM7294a.rawQuery("select *  from __et_p", null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                C1930a c1930a = new C1930a();
                                c1930a.f8952a = cursorRawQuery.getInt(0);
                                c1930a.f8953b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__i"));
                                c1930a.f8954c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__e"));
                                c1930a.f8955d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__s"));
                                c1930a.f8956e = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("__t"));
                                c1930a.f8957f = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(InterfaceC1931a.a.f8974f));
                                c1930a.f8958g = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__av"));
                                c1930a.f8959h = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__vc"));
                                arrayList.add(c1930a);
                            } catch (Exception e5) {
                                e4 = e5;
                                e4.printStackTrace();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (sQLiteDatabaseM7294a != null) {
                                    sQLiteDatabaseM7294a.endTransaction();
                                }
                                C1933c.m7292a(this.mContext).m7295b(str);
                                return arrayList;
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e6) {
                    e4 = e6;
                    cursorRawQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r22 != 0) {
                        try {
                            r22.close();
                        } catch (Exception unused) {
                            C1933c.m7292a(this.mContext).m7295b(str);
                            throw th;
                        }
                    }
                    if (sQLiteDatabaseM7294a != null) {
                        sQLiteDatabaseM7294a.endTransaction();
                    }
                    C1933c.m7292a(this.mContext).m7295b(str);
                    throw th;
                }
            } catch (Exception e7) {
                sQLiteDatabaseM7294a = null;
                e4 = e7;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabaseM7294a = null;
            }
            sQLiteDatabaseM7294a.endTransaction();
        } catch (Exception unused2) {
        }
        C1933c.m7292a(this.mContext).m7295b(str);
        return arrayList;
    }

    public void createDBByProcess(String str) {
        try {
            C1933c.m7292a(this.mContext).m7294a(str);
            C1933c.m7292a(this.mContext).m7295b(str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void deleteEventDatas(String str, String str2, List<C1930a> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM7294a;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM7294a = C1933c.m7292a(this.mContext).m7294a(str);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sQLiteDatabaseM7294a = null;
            th = th2;
        }
        try {
            sQLiteDatabaseM7294a.beginTransaction();
            int size = list.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    sQLiteDatabaseM7294a.execSQL("delete from __et_p where rowid=" + list.get(i4).f8952a);
                }
            } else {
                sQLiteDatabaseM7294a.delete(InterfaceC1931a.a.f8969a, null, null);
            }
            sQLiteDatabaseM7294a.setTransactionSuccessful();
            sQLiteDatabaseM7294a.endTransaction();
        } catch (Exception unused2) {
            sQLiteDatabase = sQLiteDatabaseM7294a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            C1933c.m7292a(this.mContext).m7295b(str);
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabaseM7294a != null) {
                sQLiteDatabaseM7294a.endTransaction();
            }
            C1933c.m7292a(this.mContext).m7295b(str);
            throw th;
        }
        C1933c.m7292a(this.mContext).m7295b(str);
    }

    public void deleteMainProcessEventDatasByIds(List<Integer> list) {
        SQLiteDatabase sQLiteDatabaseM7294a = null;
        try {
            sQLiteDatabaseM7294a = C1933c.m7292a(this.mContext).m7294a(InterfaceC1931a.f8968h);
            sQLiteDatabaseM7294a.beginTransaction();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseM7294a.delete(InterfaceC1931a.a.f8969a, "id=?", new String[]{String.valueOf(it.next())});
            }
            sQLiteDatabaseM7294a.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseM7294a != null) {
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseM7294a != null) {
                sQLiteDatabaseM7294a.endTransaction();
            }
            C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
            throw th;
        }
        sQLiteDatabaseM7294a.endTransaction();
        C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
    }

    public void insertEvents(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(C1932b.m7291b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(C1932b.m7289a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.InterfaceC1927a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.InterfaceC1927a
                /* renamed from: a */
                public void mo7287a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject readMainEvents(long r20, java.util.List<java.lang.Integer> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readMainEvents(long, java.util.List):org.json.JSONObject");
    }

    public JSONObject readVersionInfoFromColumId(Integer num) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM7294a;
        JSONObject jSONObject;
        String str = "select *  from __et_p where rowid=" + num;
        Cursor cursor = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            sQLiteDatabaseM7294a = C1933c.m7292a(this.mContext).m7294a(InterfaceC1931a.f8968h);
            try {
                try {
                    sQLiteDatabaseM7294a.beginTransaction();
                    Cursor cursorRawQuery = sQLiteDatabaseM7294a.rawQuery(str, null);
                    if (cursorRawQuery != null) {
                        try {
                            try {
                                if (cursorRawQuery.moveToNext()) {
                                    jSONObject = new JSONObject();
                                    try {
                                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__av"));
                                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__vc"));
                                        if (!TextUtils.isEmpty(string)) {
                                            jSONObject.put("__av", string);
                                        }
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject.put("__vc", string2);
                                        }
                                        jSONObject2 = jSONObject;
                                    } catch (Exception e4) {
                                        e = e4;
                                        cursor = cursorRawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused) {
                                                C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
                                                return jSONObject;
                                            }
                                        }
                                        if (sQLiteDatabaseM7294a != null) {
                                            sQLiteDatabaseM7294a.endTransaction();
                                        }
                                        C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
                                        return jSONObject;
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                jSONObject = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                    C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
                                    throw th;
                                }
                            }
                            if (sQLiteDatabaseM7294a != null) {
                                sQLiteDatabaseM7294a.endTransaction();
                            }
                            C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
                            throw th;
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused3) {
                        }
                    }
                    sQLiteDatabaseM7294a.endTransaction();
                    C1933c.m7292a(this.mContext).m7295b(InterfaceC1931a.f8968h);
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e6) {
                e = e6;
                jSONObject = null;
            }
        } catch (Exception e7) {
            e = e7;
            sQLiteDatabaseM7294a = null;
            jSONObject = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseM7294a = null;
        }
    }

    private UMProcessDBHelper(Context context) {
        C1937a.m7300a().m7303a(context);
    }
}
