package com.alibaba.sdk.android.emas;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.alibaba.sdk.android.tbrest.utils.AppUtils;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.alibaba.sdk.android.tbrest.utils.MD5Utils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.emas.c */
/* loaded from: classes3.dex */
public class C5594c implements Cache<C5595d> {

    /* renamed from: a */
    private long f4045a;

    /* renamed from: a */
    private String f4046a;

    /* renamed from: a */
    private Set<String> f4047a;

    /* renamed from: b */
    private String f4048b;
    private int diskCacheLimitCapacity;
    private int diskCacheLimitCount;

    public C5594c(Context context, String str, String str2, String str3) {
        this.f4048b = str2;
        String str4 = str + BundleUtil.UNDERLINE_TAG + str2;
        str3 = TextUtils.isEmpty(str3) ? "common" : str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir());
        String str5 = File.separator;
        sb2.append(str5);
        sb2.append("emas-rest-log");
        sb2.append(str5);
        sb2.append(str4);
        sb2.append(str5);
        sb2.append(str3);
        this.f4046a = sb2.toString();
        File file = new File(this.f4046a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: a */
    public void m3494a(int i10, int i11, int i12) {
        this.diskCacheLimitCount = i10;
        this.diskCacheLimitCapacity = i11;
        this.f4045a = i12 * 86400000;
    }

    /* renamed from: b */
    public synchronized void m3497b(C5595d c5595d) {
        Set<String> set = this.f4047a;
        if (set != null && !set.isEmpty()) {
            if (TextUtils.isEmpty(c5595d.getLocation())) {
                return;
            }
            this.f4047a.remove(c5595d.getLocation());
        }
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    public synchronized void clear() {
        File file = new File(this.f4046a);
        if (file.exists()) {
            if (!file.isDirectory()) {
                file.delete();
                return;
            }
            List<File> listM3491a = m3491a(file, new ArrayList());
            LogUtil.m3869d("DiskCacheManager num: " + listM3491a.size());
            if (listM3491a.size() > 0) {
                Collections.sort(listM3491a, new Comparator<File>() { // from class: com.alibaba.sdk.android.emas.c.2
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        if (file2 == null && file3 == null) {
                            return 0;
                        }
                        if (file2 == null) {
                            return -1;
                        }
                        if (file3 == null) {
                            return 1;
                        }
                        if (file2 == file3) {
                            return 0;
                        }
                        if (file2.lastModified() < file3.lastModified()) {
                            return -1;
                        }
                        return file2.lastModified() == file3.lastModified() ? 0 : 1;
                    }
                });
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<File> it = listM3491a.iterator();
                int i10 = 0;
                long length = 0;
                int i11 = 0;
                while (it.hasNext()) {
                    File next = it.next();
                    if (jCurrentTimeMillis - next.lastModified() >= this.f4045a) {
                        it.remove();
                        next.delete();
                    } else {
                        i11++;
                        length += next.length();
                    }
                }
                if (i11 > this.diskCacheLimitCount || length > this.diskCacheLimitCapacity) {
                    LogUtil.m3869d("DiskCacheManager exceed limit. start clear.");
                    int i12 = (int) (this.diskCacheLimitCount * 0.8d);
                    int i13 = (int) (this.diskCacheLimitCapacity * 0.8d);
                    while (true) {
                        if ((i11 <= i12 && length <= i13) || i10 >= listM3491a.size()) {
                            break;
                        }
                        File file2 = listM3491a.get(i10);
                        if (file2.delete()) {
                            i11--;
                            length -= file2.length();
                        }
                        i10++;
                    }
                }
            }
        }
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void add(C5595d c5595d) {
        if (c5595d != null) {
            try {
                if (c5595d.m3500a() != EnumC5593b.DISK_CACHE) {
                    List<C5596e> listM3501a = c5595d.m3501a();
                    if (listM3501a != null && !listM3501a.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 != listM3501a.size(); i10++) {
                            JSONObject jSONObjectM3503a = listM3501a.get(i10).m3503a();
                            if (jSONObjectM3503a != null) {
                                jSONArray.put(jSONObjectM3503a);
                            }
                        }
                        String strM3504a = C5597f.m3504a(this.f4048b, jSONArray.toString());
                        if (!TextUtils.isEmpty(strM3504a)) {
                            LogUtil.m3869d("DiskCacheManager putting into cache.");
                            File file = new File(this.f4046a, MD5Utils.getMd5Hex(strM3504a.getBytes(Charset.forName(Request.DEFAULT_CHARSET))) + BundleUtil.UNDERLINE_TAG + System.currentTimeMillis() + ".log");
                            if (file.exists()) {
                                file.delete();
                            }
                            m3492a(file, strM3504a);
                            LogUtil.m3869d("DiskCacheManager success put into " + file.getAbsolutePath());
                        } else {
                            LogUtil.m3869d("DiskCacheManager failed put into cache.");
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5595d == null) {
            LogUtil.m3869d("DiskCacheManager add failed. data is null");
        } else {
            LogUtil.m3869d("DiskCacheManager add failed. cache type: " + c5595d.m3500a().name());
        }
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized C5595d get() {
        File file;
        File file2 = new File(this.f4046a);
        if (!file2.exists()) {
            return null;
        }
        if (!file2.isDirectory()) {
            file2.delete();
            return null;
        }
        List<File> listM3491a = m3491a(file2, new ArrayList());
        if (listM3491a.size() <= 0) {
            return null;
        }
        Collections.sort(listM3491a, new Comparator<File>() { // from class: com.alibaba.sdk.android.emas.c.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return -1;
                }
                if (file4 == null) {
                    return 1;
                }
                if (file3 == file4) {
                    return 0;
                }
                if (file3.lastModified() < file4.lastModified()) {
                    return -1;
                }
                return file3.lastModified() == file4.lastModified() ? 0 : 1;
            }
        });
        Set<String> set = this.f4047a;
        if (set == null || set.isEmpty()) {
            file = listM3491a.get(0);
        } else {
            int i10 = 0;
            while (true) {
                if (i10 == listM3491a.size()) {
                    file = null;
                    break;
                }
                if (!this.f4047a.contains(listM3491a.get(i10).getAbsolutePath())) {
                    file = listM3491a.get(i10);
                    break;
                }
                LogUtil.m3869d("DiskCacheManager disk cache is in the Sending Queue. skip location: " + listM3491a.get(i10).getAbsolutePath());
                i10++;
            }
        }
        if (file == null) {
            return null;
        }
        String strM3508b = C5597f.m3508b(this.f4048b, m3490a(file));
        if (TextUtils.isEmpty(strM3508b)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM3508b);
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 != jSONArray.length(); i11++) {
                C5596e c5596eM3502a = C5596e.m3502a(jSONArray.getJSONObject(i11));
                if (c5596eM3502a != null) {
                    arrayList.add(c5596eM3502a);
                }
            }
            if (this.f4047a == null) {
                this.f4047a = new HashSet();
            }
            this.f4047a.add(file.getAbsolutePath());
            return new C5595d(arrayList, EnumC5593b.DISK_CACHE, file.getAbsolutePath());
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized boolean remove(C5595d c5595d) {
        if (c5595d != null) {
            try {
                if (c5595d.m3500a() == EnumC5593b.DISK_CACHE && !TextUtils.isEmpty(c5595d.getLocation())) {
                    LogUtil.m3869d("DiskCacheManager removing. cache type: " + c5595d.m3500a().name());
                    Set<String> set = this.f4047a;
                    if (set != null) {
                        set.remove(c5595d.getLocation());
                    }
                    File file = new File(c5595d.getLocation());
                    if (!file.exists()) {
                        return false;
                    }
                    return file.delete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5595d == null) {
            LogUtil.m3869d("DiskCacheManager remove failed. data is null");
        } else {
            LogUtil.m3869d("DiskCacheManager remove failed. cache type: " + c5595d.m3500a().name());
        }
        return false;
    }

    /* renamed from: a */
    private List<File> m3491a(File file, List<File> list) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m3491a(file2, list);
                } else if (!list.contains(file2)) {
                    list.add(file2);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0026: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:8:0x0026 */
    /* renamed from: a */
    private String m3490a(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Closeable closeable;
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = new byte[4096];
        Closeable closeable2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        int i10 = bufferedInputStream.read(bArr);
                        if (i10 != -1) {
                            sb2.append(new String(bArr, 0, i10));
                        } else {
                            String string = sb2.toString();
                            AppUtils.closeQuietly(bufferedInputStream);
                            return string;
                        }
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        e.printStackTrace();
                        AppUtils.closeQuietly(bufferedInputStream);
                        return null;
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        AppUtils.closeQuietly(bufferedInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                AppUtils.closeQuietly(closeable2);
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            bufferedInputStream = null;
        } catch (IOException e13) {
            e = e13;
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AppUtils.closeQuietly(closeable2);
            throw th;
        }
    }

    /* renamed from: a */
    private void m3492a(File file, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
        } catch (UnsupportedEncodingException e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        }
        try {
            bufferedOutputStream.write(str.getBytes("utf-8"));
            AppUtils.closeQuietly(bufferedOutputStream);
        } catch (FileNotFoundException e13) {
            e = e13;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            AppUtils.closeQuietly(bufferedOutputStream2);
        } catch (UnsupportedEncodingException e14) {
            e = e14;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            AppUtils.closeQuietly(bufferedOutputStream2);
        } catch (IOException e15) {
            e = e15;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            AppUtils.closeQuietly(bufferedOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            AppUtils.closeQuietly(bufferedOutputStream2);
            throw th;
        }
    }
}
