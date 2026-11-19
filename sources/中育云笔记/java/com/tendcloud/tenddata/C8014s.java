package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.View;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.asm.Opcodes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONObject;

@TargetApi(16)
/* renamed from: com.tendcloud.tenddata.s */
/* loaded from: classes5.dex */
class C8014s {

    /* renamed from: b */
    private static final int f15098b = 1;

    /* renamed from: c */
    private static final int f15099c = 2;

    /* renamed from: k */
    private static final int f15103k = 255;

    /* renamed from: i */
    private final AbstractC8010n f15107i;

    /* renamed from: d */
    private static final List<String> f15100d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private static CountDownLatch f15101e = null;

    /* renamed from: a */
    static c f15097a = new c();

    /* renamed from: j */
    private static String f15102j = "";

    /* renamed from: h */
    private final Handler f15106h = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final d f15104f = new d();

    /* renamed from: g */
    private final b f15105g = new b(255);

    /* renamed from: com.tendcloud.tenddata.s$a */
    public static class a {
        private final Paint mPaint = new Paint(2);
        private Bitmap mCached = null;

        public synchronized void recreate(int i10, int i11, int i12, Bitmap bitmap) {
            try {
                Bitmap bitmap2 = this.mCached;
                if (bitmap2 == null || bitmap2.getWidth() != i10 || this.mCached.getHeight() != i11) {
                    try {
                        this.mCached = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                    } catch (OutOfMemoryError unused) {
                        this.mCached = null;
                    }
                    Bitmap bitmap3 = this.mCached;
                    if (bitmap3 != null) {
                        bitmap3.setDensity(i12);
                    }
                }
                if (this.mCached != null) {
                    new Canvas(this.mCached).drawBitmap(bitmap, 0.0f, 0.0f, this.mPaint);
                }
            } catch (Throwable unused2) {
            }
        }

        public synchronized String writeBitmapJSON(Bitmap.CompressFormat compressFormat, int i10, OutputStream outputStream) {
            Bitmap bitmap = this.mCached;
            if (bitmap != null && bitmap.getWidth() != 0 && this.mCached.getHeight() != 0) {
                outputStream.write("\"data:image/jpeg;base64,".getBytes());
                Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                this.mCached.compress(compressFormat, i10, base64OutputStream);
                base64OutputStream.flush();
                outputStream.write(34);
                return C8014s.m12080a(this.mCached);
            }
            outputStream.write("null".getBytes());
            return "";
        }
    }

    /* renamed from: com.tendcloud.tenddata.s$b */
    public static class b extends LruCache<Class<?>, String> {
        public b(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public String create(Class<?> cls) {
            return cls.getCanonicalName();
        }
    }

    /* renamed from: com.tendcloud.tenddata.s$c */
    public static class c {
        @JavascriptInterface
        public void callback(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    C8014s.f15100d.add(str);
                }
                if (C8014s.f15101e != null) {
                    C8014s.f15101e.countDown();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tendcloud.tenddata.s$d */
    public static class d implements Callable<List<e>> {
        private C8003g mLiveActivities;
        private final int mClientDensity = Opcodes.IF_ICMPNE;
        private final DisplayMetrics mDisplayMetrics = new DisplayMetrics();
        private final List<e> mRootViews = new ArrayList();
        private final a mCachedBitmap = new a();

        private void takeScreenshot(e eVar) {
            Bitmap bitmapM11821a;
            try {
                View view = eVar.rootView;
                try {
                    Method declaredMethod = View.class.getDeclaredMethod("createSnapshot", Bitmap.Config.class, Integer.TYPE, Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    bitmapM11821a = (Bitmap) declaredMethod.invoke(view, Bitmap.Config.RGB_565, -1, Boolean.FALSE);
                } catch (NoSuchMethodException | Exception unused) {
                    bitmapM11821a = null;
                }
                if (bitmapM11821a == null) {
                    try {
                        bitmapM11821a = C7949e.m11821a(view, true);
                    } catch (RuntimeException unused2) {
                    }
                }
                if (bitmapM11821a != null) {
                    int density = bitmapM11821a.getDensity();
                    f = density != 0 ? 160.0f / density : 1.0f;
                    int width = bitmapM11821a.getWidth();
                    int height = bitmapM11821a.getHeight();
                    int width2 = (int) ((bitmapM11821a.getWidth() * f) + 0.5d);
                    int height2 = (int) ((bitmapM11821a.getHeight() * f) + 0.5d);
                    if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                        this.mCachedBitmap.recreate(width2, height2, Opcodes.IF_ICMPNE, bitmapM11821a);
                    }
                }
                eVar.scale = f;
                eVar.screenshot = this.mCachedBitmap;
            } catch (Throwable unused3) {
            }
        }

        public void findInActivities(C8003g c8003g) {
            this.mLiveActivities = c8003g;
        }

        @Override // java.util.concurrent.Callable
        public List<e> call() {
            try {
                this.mRootViews.clear();
                for (Activity activity : this.mLiveActivities.m12027a()) {
                    String canonicalName = activity.getClass().getCanonicalName();
                    View rootView = activity.getWindow().getDecorView().getRootView();
                    activity.getWindowManager().getDefaultDisplay().getMetrics(this.mDisplayMetrics);
                    this.mRootViews.add(new e(canonicalName, rootView));
                }
                int size = this.mRootViews.size();
                for (int i10 = 0; i10 < size; i10++) {
                    takeScreenshot(this.mRootViews.get(i10));
                }
            } catch (Throwable unused) {
            }
            return this.mRootViews;
        }
    }

    /* renamed from: com.tendcloud.tenddata.s$e */
    public static class e {
        final String activityName;
        final View rootView;
        a screenshot = null;
        float scale = 1.0f;

        public e(String str, View view) {
            this.activityName = str;
            this.rootView = view;
        }
    }

    public C8014s(AbstractC8010n abstractC8010n) {
        this.f15107i = abstractC8010n;
    }

    /* renamed from: a */
    public void m12088a(C8003g c8003g, OutputStream outputStream) throws InterruptedException, IOException {
        String string;
        String str;
        this.f15104f.findInActivities(c8003g);
        FutureTask futureTask = new FutureTask(this.f15104f);
        this.f15106h.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List list = Collections.EMPTY_LIST;
        try {
            list = (List) futureTask.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
        System.currentTimeMillis();
        if (list.size() <= 0) {
            outputStreamWriter.write("\"\"");
            outputStreamWriter.flush();
            return;
        }
        int i10 = 0;
        e eVar = (e) list.get(0);
        float f10 = eVar.scale;
        JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
        outputStreamWriter.write("{");
        outputStreamWriter.write("\"page\":");
        outputStreamWriter.write(JSONObject.quote(eVar.activityName));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"scale\":");
        outputStreamWriter.write(String.format("%s", Float.valueOf(f10)));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"app\":");
        outputStreamWriter.write("{");
        outputStreamWriter.write("\"platform\":\"android\"");
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"app_version\":");
        outputStreamWriter.write(JSONObject.quote(C7897cb.m11400k()));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"width\":");
        outputStreamWriter.write(JSONObject.quote(String.valueOf(eVar.screenshot.mCached != null ? eVar.screenshot.mCached.getWidth() : 0)));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"height\":");
        outputStreamWriter.write(JSONObject.quote(String.valueOf(eVar.screenshot.mCached != null ? eVar.screenshot.mCached.getHeight() : 0)));
        outputStreamWriter.write("}");
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"native\":");
        jsonWriter.beginObject();
        jsonWriter.name("elements");
        m12086a(jsonWriter, eVar);
        jsonWriter.endObject();
        jsonWriter.flush();
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"hybrid\":");
        outputStreamWriter.write("{");
        CountDownLatch countDownLatch = f15101e;
        if (countDownLatch != null) {
            countDownLatch.await();
        }
        List<String> list2 = f15100d;
        String string2 = "";
        if (list2.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(list2.get(0));
                string = jSONObject.getString("page");
                try {
                    i10 = jSONObject.getInt("webviewY");
                    string2 = jSONObject.getString("elements");
                } catch (Throwable th) {
                    th = th;
                    C7896ca.eForInternal(th);
                    String str2 = string2;
                    string2 = string;
                    str = str2;
                    outputStreamWriter.write("\"page\":");
                    outputStreamWriter.write(JSONObject.quote(string2));
                    outputStreamWriter.write(",");
                    outputStreamWriter.write("\"webviewY\":");
                    outputStreamWriter.write(String.format("%s", Integer.valueOf(i10)));
                    outputStreamWriter.write(",");
                    outputStreamWriter.write("\"elements\":");
                    outputStreamWriter.write(JSONObject.quote(str));
                    outputStreamWriter.write("}");
                    outputStreamWriter.write(",");
                    outputStreamWriter.write("\"screenshot\":");
                    outputStreamWriter.flush();
                    eVar.screenshot.writeBitmapJSON(Bitmap.CompressFormat.JPEG, 60, outputStream);
                    outputStreamWriter.write(",");
                    outputStreamWriter.write("\"image_hash\":");
                    outputStreamWriter.write(JSONObject.quote(f15102j));
                    outputStreamWriter.write("}");
                    f15100d.clear();
                    f15101e = null;
                    outputStreamWriter.flush();
                }
            } catch (Throwable th2) {
                th = th2;
                string = "";
            }
            String str22 = string2;
            string2 = string;
            str = str22;
        } else {
            str = "";
        }
        outputStreamWriter.write("\"page\":");
        outputStreamWriter.write(JSONObject.quote(string2));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"webviewY\":");
        outputStreamWriter.write(String.format("%s", Integer.valueOf(i10)));
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"elements\":");
        outputStreamWriter.write(JSONObject.quote(str));
        outputStreamWriter.write("}");
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"screenshot\":");
        outputStreamWriter.flush();
        eVar.screenshot.writeBitmapJSON(Bitmap.CompressFormat.JPEG, 60, outputStream);
        outputStreamWriter.write(",");
        outputStreamWriter.write("\"image_hash\":");
        outputStreamWriter.write(JSONObject.quote(f15102j));
        outputStreamWriter.write("}");
        f15100d.clear();
        f15101e = null;
        outputStreamWriter.flush();
    }

    /* renamed from: a */
    private void m12086a(JsonWriter jsonWriter, e eVar) throws IOException {
        jsonWriter.beginArray();
        m12085a(jsonWriter, eVar.rootView, null, "0", eVar.scale, eVar.activityName);
        jsonWriter.endArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m12085a(android.util.JsonWriter r15, android.view.View r16, java.lang.String r17, java.lang.String r18, float r19, java.lang.String r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8014s.m12085a(android.util.JsonWriter, android.view.View, java.lang.String, java.lang.String, float, java.lang.String):void");
    }

    /* renamed from: a */
    private String m12081a(View view) {
        return view.getTag(1413742593) != null ? (String) view.getTag(1413742593) : "";
    }

    /* renamed from: a */
    private String m12082a(View view, String str, int i10, String str2) {
        int childAdapterPosition;
        ViewParent parent = view.getParent();
        if (C7976f.m11935e() && (parent instanceof ViewPager)) {
            i10 = ((ViewPager) parent).getCurrentItem();
        } else if (C7976f.m11936f() && (parent instanceof ViewPager)) {
            i10 = ((ViewPager) parent).getCurrentItem();
        } else if (parent instanceof AdapterView) {
            i10 = ((AdapterView) parent).getPositionForView(view);
        } else if (!C7976f.m11931a() || !(parent instanceof RecyclerView) ? !(!C7976f.m11932b() || !(parent instanceof RecyclerView) || (childAdapterPosition = ((RecyclerView) parent).getChildAdapterPosition(view)) < 0) : (childAdapterPosition = ((RecyclerView) parent).getChildAdapterPosition(view)) >= 0) {
            i10 = childAdapterPosition;
        }
        String simpleName = view.getClass().getSimpleName();
        if (view.getTag(1413742594) != null) {
            simpleName = (String) view.getTag(1413742594);
        } else if (view.getId() == 16908290) {
            simpleName = "MainContentView";
        }
        if (MqttTopic.TOPIC_LEVEL_SEPARATOR.equals(str)) {
            str = "";
        }
        String str3 = str + MqttTopic.TOPIC_LEVEL_SEPARATOR + simpleName + "[" + i10 + "]";
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + MqttTopic.MULTI_LEVEL_WILDCARD + str2;
    }

    /* renamed from: a */
    public static String m12080a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return C7912cq.m11589a(MessageDigest.getInstance("MD5").digest(byteArrayOutputStream.toByteArray()));
        } catch (Throwable unused) {
            return "";
        }
    }
}
