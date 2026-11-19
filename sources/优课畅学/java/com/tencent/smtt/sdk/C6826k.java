package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.sdk.TbsReaderView;

/* renamed from: com.tencent.smtt.sdk.k */
/* loaded from: classes4.dex */
public class C6826k {

    /* renamed from: a */
    private DexLoader f6900a;

    /* renamed from: b */
    private TbsReaderView.ReaderCallback f6901b;

    public C6826k(TbsReaderView.ReaderCallback readerCallback) {
        this.f6900a = null;
        this.f6901b = null;
        this.f6900a = m6204b();
        this.f6901b = readerCallback;
    }

    /* renamed from: a */
    public static Drawable m6201a(int i10) {
        DexLoader dexLoaderM6204b = m6204b();
        if (dexLoaderM6204b == null) {
            return null;
        }
        Object objInvokeStaticMethod = dexLoaderM6204b.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "getResDrawable", new Class[]{Integer.class}, Integer.valueOf(i10));
        if (objInvokeStaticMethod instanceof Drawable) {
            return (Drawable) objInvokeStaticMethod;
        }
        return null;
    }

    /* renamed from: b */
    private static DexLoader m6204b() {
        C6805bd c6805bdM6224c = C6827l.m6214a(true).m6224c();
        if (c6805bdM6224c != null) {
            return c6805bdM6224c.m6147b();
        }
        return null;
    }

    /* renamed from: b */
    public static String m6205b(int i10) {
        DexLoader dexLoaderM6204b = m6204b();
        if (dexLoaderM6204b == null) {
            return "";
        }
        Object objInvokeStaticMethod = dexLoaderM6204b.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "getResString", new Class[]{Integer.class}, Integer.valueOf(i10));
        return objInvokeStaticMethod instanceof String ? (String) objInvokeStaticMethod : "";
    }

    /* renamed from: a */
    public Object m6206a() {
        return this.f6900a.newInstance("com.tencent.tbs.reader.TbsReader", new Class[0], new Object[0]);
    }

    /* renamed from: a */
    public void m6207a(Object obj) {
        this.f6901b = null;
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null || obj == null) {
            Log.e("ReaderWizard", "destroy:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "destroy", new Class[0], new Object[0]);
        }
    }

    /* renamed from: a */
    public void m6208a(Object obj, int i10, int i11) {
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "onSizeChanged:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "onSizeChanged", new Class[]{Integer.class, Integer.class}, new Integer(i10), new Integer(i11));
        }
    }

    /* renamed from: a */
    public void m6209a(Object obj, Integer num, Object obj2, Object obj3) {
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "doCommand:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "doCommand", new Class[]{Integer.class, Object.class, Object.class}, new Integer(num.intValue()), obj2, obj3);
        }
    }

    /* renamed from: a */
    public void m6210a(Object obj, String str) {
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "userStatistics:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "userStatistics", new Class[]{String.class}, str);
        }
    }

    /* renamed from: a */
    public static boolean m6202a(Context context) {
        DexLoader dexLoaderM6204b = m6204b();
        if (dexLoaderM6204b == null) {
            return false;
        }
        Object objInvokeStaticMethod = dexLoaderM6204b.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "isSupportCurrentPlatform", new Class[]{Context.class}, context);
        if (objInvokeStaticMethod instanceof Boolean) {
            return ((Boolean) objInvokeStaticMethod).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6211a(Object obj, Context context) {
        String str;
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null || obj == null) {
            str = "initTbsReader:Unexpect null object!";
        } else {
            Object objInvokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "init", new Class[]{Context.class, DexLoader.class, Object.class}, context, dexLoader, this);
            if (objInvokeMethod instanceof Boolean) {
                return ((Boolean) objInvokeMethod).booleanValue();
            }
            str = "Unexpect return value type of call initTbsReader!";
        }
        Log.e("ReaderWizard", str);
        return false;
    }

    /* renamed from: a */
    public boolean m6212a(Object obj, Context context, Bundle bundle, FrameLayout frameLayout) {
        String str;
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null) {
            str = "openFile:Unexpect null object!";
        } else {
            Object objInvokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "openFile", new Class[]{Context.class, Bundle.class, FrameLayout.class}, context, bundle, frameLayout);
            if (objInvokeMethod instanceof Boolean) {
                return ((Boolean) objInvokeMethod).booleanValue();
            }
            str = "Unexpect return value type of call openFile!";
        }
        Log.e("ReaderWizard", str);
        return false;
    }

    /* renamed from: a */
    public boolean m6213a(Object obj, Context context, String str, boolean z10) {
        String str2;
        DexLoader dexLoader = this.f6900a;
        if (dexLoader == null) {
            str2 = "checkPlugin:Unexpect null object!";
        } else {
            Object objInvokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "checkPlugin", new Class[]{Context.class, String.class, Boolean.class}, context, str, Boolean.valueOf(z10));
            if (objInvokeMethod instanceof Boolean) {
                return ((Boolean) objInvokeMethod).booleanValue();
            }
            str2 = "Unexpect return value type of call checkPlugin!";
        }
        Log.e("ReaderWizard", str2);
        return false;
    }

    /* renamed from: a */
    public static boolean m6203a(String str) {
        DexLoader dexLoaderM6204b = m6204b();
        if (dexLoaderM6204b == null) {
            return false;
        }
        Object objInvokeStaticMethod = dexLoaderM6204b.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "isSupportExt", new Class[]{String.class}, str);
        if (objInvokeStaticMethod instanceof Boolean) {
            return ((Boolean) objInvokeStaticMethod).booleanValue();
        }
        return false;
    }
}
