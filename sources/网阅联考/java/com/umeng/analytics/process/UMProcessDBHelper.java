package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.InterfaceC3415a;
import com.umeng.common.C3421a;
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

/* loaded from: classes2.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();
    private InsertEventCallback ekvCallBack = new InsertEventCallback();

    public class InsertEventCallback implements FileLockCallback {
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
            if (str.startsWith(InterfaceC3415a.f2371c)) {
                str = str.replaceFirst(InterfaceC3415a.f2371c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(InterfaceC3415a.f2372d, ""), (JSONArray) obj);
            return true;
        }
    }

    public class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i4) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(InterfaceC3415a.f2371c)) {
                str = str.replaceFirst(InterfaceC3415a.f2371c, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(InterfaceC3415a.f2372d, ""));
            return true;
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    public class C3414a implements Serializable {

        /* renamed from: a */
        int f2360a;

        /* renamed from: b */
        String f2361b;

        /* renamed from: c */
        String f2362c;

        /* renamed from: d */
        String f2363d;

        /* renamed from: e */
        int f2364e;

        /* renamed from: f */
        String f2365f;

        /* renamed from: g */
        String f2366g;

        /* renamed from: h */
        String f2367h;

        private C3414a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private List<C3414a> datasAdapter(String str, JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                C3414a c3414a = new C3414a();
                c3414a.f2362c = jSONObject.optString("id");
                c3414a.f2366g = UMUtils.getAppVersionName(this.mContext);
                c3414a.f2367h = UMUtils.getAppVersionCode(this.mContext);
                c3414a.f2361b = jSONObject.optString("__i");
                c3414a.f2364e = jSONObject.optInt("__t");
                c3414a.f2365f = str;
                if (jSONObject.has("ds")) {
                    jSONObject.remove("ds");
                }
                jSONObject.put("ds", getDataSource());
                jSONObject.remove("__i");
                jSONObject.remove("__t");
                c3414a.f2363d = C3421a.m3377a().m3379a(jSONObject.toString());
                jSONObject.remove("ds");
                arrayList.add(c3414a);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(C3416b.m3368b(this.mContext, str)).exists();
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

    private boolean insertEvents_(String str, List<C3414a> list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM3371a = C3417c.m3369a(this.mContext).m3371a(str);
            try {
                try {
                    sQLiteDatabaseM3371a.beginTransaction();
                    for (C3414a c3414a : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", c3414a.f2361b);
                            contentValues.put("__e", c3414a.f2362c);
                            contentValues.put("__t", Integer.valueOf(c3414a.f2364e));
                            contentValues.put(InterfaceC3415a.a.f2382f, c3414a.f2365f);
                            contentValues.put("__av", c3414a.f2366g);
                            contentValues.put("__vc", c3414a.f2367h);
                            contentValues.put("__s", c3414a.f2363d);
                            sQLiteDatabaseM3371a.insert(InterfaceC3415a.a.f2377a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseM3371a.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseM3371a.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    C3417c.m3369a(this.mContext).m3372b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseM3371a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    C3417c.m3369a(this.mContext).m3372b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM3371a;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C3417c.m3369a(this.mContext).m3372b(str);
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
            List<C3414a> eventByProcess = readEventByProcess(str);
            if (!eventByProcess.isEmpty() && insertEvents_(InterfaceC3415a.f2376h, eventByProcess)) {
                deleteEventDatas(str, null, eventByProcess);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private List<C3414a> readEventByProcess(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM3371a;
        Exception e4;
        Cursor cursorRawQuery;
        ArrayList arrayList = new ArrayList();
        ?? r22 = 0;
        r22 = 0;
        try {
            try {
                try {
                    sQLiteDatabaseM3371a = C3417c.m3369a(this.mContext).m3371a(str);
                } catch (Throwable th) {
                    th = th;
                    r22 = "select *  from __et_p";
                }
                try {
                    sQLiteDatabaseM3371a.beginTransaction();
                    cursorRawQuery = sQLiteDatabaseM3371a.rawQuery("select *  from __et_p", null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                C3414a c3414a = new C3414a();
                                c3414a.f2360a = cursorRawQuery.getInt(0);
                                c3414a.f2361b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__i"));
                                c3414a.f2362c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__e"));
                                c3414a.f2363d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__s"));
                                c3414a.f2364e = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("__t"));
                                c3414a.f2365f = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(InterfaceC3415a.a.f2382f));
                                c3414a.f2366g = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__av"));
                                c3414a.f2367h = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__vc"));
                                arrayList.add(c3414a);
                            } catch (Exception e5) {
                                e4 = e5;
                                e4.printStackTrace();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (sQLiteDatabaseM3371a != null) {
                                    sQLiteDatabaseM3371a.endTransaction();
                                }
                                C3417c.m3369a(this.mContext).m3372b(str);
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
                            C3417c.m3369a(this.mContext).m3372b(str);
                            throw th;
                        }
                    }
                    if (sQLiteDatabaseM3371a != null) {
                        sQLiteDatabaseM3371a.endTransaction();
                    }
                    C3417c.m3369a(this.mContext).m3372b(str);
                    throw th;
                }
            } catch (Exception e7) {
                sQLiteDatabaseM3371a = null;
                e4 = e7;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabaseM3371a = null;
            }
            sQLiteDatabaseM3371a.endTransaction();
        } catch (Exception unused2) {
        }
        C3417c.m3369a(this.mContext).m3372b(str);
        return arrayList;
    }

    public void createDBByProcess(String str) {
        try {
            C3417c.m3369a(this.mContext).m3371a(str);
            C3417c.m3369a(this.mContext).m3372b(str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void deleteEventDatas(String str, String str2, List<C3414a> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM3371a;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM3371a = C3417c.m3369a(this.mContext).m3371a(str);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sQLiteDatabaseM3371a = null;
            th = th2;
        }
        try {
            sQLiteDatabaseM3371a.beginTransaction();
            int size = list.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    sQLiteDatabaseM3371a.execSQL("delete from __et_p where rowid=" + list.get(i4).f2360a);
                }
            } else {
                sQLiteDatabaseM3371a.delete(InterfaceC3415a.a.f2377a, null, null);
            }
            sQLiteDatabaseM3371a.setTransactionSuccessful();
            sQLiteDatabaseM3371a.endTransaction();
        } catch (Exception unused2) {
            sQLiteDatabase = sQLiteDatabaseM3371a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            C3417c.m3369a(this.mContext).m3372b(str);
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabaseM3371a != null) {
                sQLiteDatabaseM3371a.endTransaction();
            }
            C3417c.m3369a(this.mContext).m3372b(str);
            throw th;
        }
        C3417c.m3369a(this.mContext).m3372b(str);
    }

    public void deleteMainProcessEventDatasByIds(List<Integer> list) {
        SQLiteDatabase sQLiteDatabaseM3371a = null;
        try {
            sQLiteDatabaseM3371a = C3417c.m3369a(this.mContext).m3371a(InterfaceC3415a.f2376h);
            sQLiteDatabaseM3371a.beginTransaction();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseM3371a.delete(InterfaceC3415a.a.f2377a, "id=?", new String[]{String.valueOf(it.next())});
            }
            sQLiteDatabaseM3371a.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseM3371a != null) {
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseM3371a != null) {
                sQLiteDatabaseM3371a.endTransaction();
            }
            C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
            throw th;
        }
        sQLiteDatabaseM3371a.endTransaction();
        C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
    }

    public void insertEvents(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(C3416b.m3368b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(C3416b.m3366a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.InterfaceC3411a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.InterfaceC3411a
                /* renamed from: a */
                public void mo3364a() {
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
        SQLiteDatabase sQLiteDatabaseM3371a;
        JSONObject jSONObject;
        String str = "select *  from __et_p where rowid=" + num;
        Cursor cursor = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            sQLiteDatabaseM3371a = C3417c.m3369a(this.mContext).m3371a(InterfaceC3415a.f2376h);
            try {
                try {
                    sQLiteDatabaseM3371a.beginTransaction();
                    Cursor cursorRawQuery = sQLiteDatabaseM3371a.rawQuery(str, null);
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
                                                C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
                                                return jSONObject;
                                            }
                                        }
                                        if (sQLiteDatabaseM3371a != null) {
                                            sQLiteDatabaseM3371a.endTransaction();
                                        }
                                        C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
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
                                    C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
                                    throw th;
                                }
                            }
                            if (sQLiteDatabaseM3371a != null) {
                                sQLiteDatabaseM3371a.endTransaction();
                            }
                            C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
                            throw th;
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused3) {
                        }
                    }
                    sQLiteDatabaseM3371a.endTransaction();
                    C3417c.m3369a(this.mContext).m3372b(InterfaceC3415a.f2376h);
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
            sQLiteDatabaseM3371a = null;
            jSONObject = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseM3371a = null;
        }
    }

    private UMProcessDBHelper(Context context) {
        C3421a.m3377a().m3380a(context);
    }
}
