package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.tencent.smtt.sdk.p058a.C6774d;
import com.tencent.smtt.utils.Apn;

/* loaded from: classes4.dex */
public class TbsReaderView extends FrameLayout {
    public static final String IS_BAR_ANIMATING = "is_bar_animating";
    public static final String IS_BAR_SHOWING = "is_bar_show";
    public static final String IS_INTO_DOWNLOADING = "into_downloading";
    public static final String KEY_FILE_PATH = "filePath";
    public static final String KEY_TEMP_PATH = "tempPath";
    public static final int READER_CHANNEL_DOC_ID = 10965;
    public static final int READER_CHANNEL_PDF_ID = 10834;
    public static final int READER_CHANNEL_PPT_ID = 10833;
    public static final int READER_CHANNEL_TXT_ID = 10835;
    public static final String READER_STATISTICS_COUNT_CANCEL_LOADED_BTN = "AHNG802";
    public static final String READER_STATISTICS_COUNT_CLICK_LOADED_BTN = "AHNG801";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_BROWSER = "AHNG829";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DIALOG = "AHNG827";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DOWNLOAD = "AHNG828";
    public static final String READER_STATISTICS_COUNT_DOC_SEARCH_BTN = "AHNG826";
    public static final String READER_STATISTICS_COUNT_PDF_FOLDER_BTN = "AHNG810";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_BROWSER = "AHNG813";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DIALOG = "AHNG811";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DOWNLOAD = "AHNG812";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_BROWSER = "AHNG809";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DIALOG = "AHNG807";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DOWNLOAD = "AHNG808";
    public static final String READER_STATISTICS_COUNT_PPT_PLAY_BTN = "AHNG806";
    public static final String READER_STATISTICS_COUNT_RETRY_BTN = "AHNG803";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_BROWSER = "AHNG817";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DIALOG = "AHNG815";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DOWNLOAD = "AHNG816";
    public static final String READER_STATISTICS_COUNT_TXT_NOVEL_BTN = "AHNG814";
    public static final String TAG = "TbsReaderView";

    /* renamed from: f */
    static boolean f6668f = false;
    public static String gReaderPackName = "";
    public static String gReaderPackVersion = "";

    /* renamed from: a */
    Context f6669a;

    /* renamed from: b */
    C6826k f6670b;

    /* renamed from: c */
    Object f6671c;

    /* renamed from: d */
    ReaderCallback f6672d;

    /* renamed from: e */
    ReaderCallback f6673e;

    public interface ReaderCallback {
        public static final int COPY_SELECT_TEXT = 5003;
        public static final int GET_BAR_ANIMATING = 5000;
        public static final int GET_BAR_ISSHOWING = 5024;
        public static final int HIDDEN_BAR = 5001;
        public static final int INSTALL_QB = 5011;
        public static final int NOTIFY_CANDISPLAY = 12;
        public static final int NOTIFY_ERRORCODE = 19;
        public static final int READER_OPEN_QQ_FILE_LIST = 5031;
        public static final int READER_PDF_LIST = 5008;
        public static final int READER_PLUGIN_ACTIVITY_PAUSE = 5032;
        public static final int READER_PLUGIN_CANLOAD = 5013;
        public static final int READER_PLUGIN_COMMAND_FIXSCREEN = 5015;
        public static final int READER_PLUGIN_COMMAND_PDF_LIST = 5036;
        public static final int READER_PLUGIN_COMMAND_PPT_PLAYER = 5035;
        public static final int READER_PLUGIN_COMMAND_ROTATESCREEN = 5018;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND = 5038;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_CLEAR = 5041;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_NEXT = 5039;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_PREV = 5040;
        public static final int READER_PLUGIN_DOWNLOADING = 5014;
        public static final int READER_PLUGIN_RES_DOC_GUIDE = 5029;
        public static final int READER_PLUGIN_RES_FIXSCREEN_NORMAL = 5016;
        public static final int READER_PLUGIN_RES_FIXSCREEN_PRESS = 5017;
        public static final int READER_PLUGIN_RES_PDF_GUIDE = 5023;
        public static final int READER_PLUGIN_RES_PPT_GUIDE = 5021;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_NORMAL = 5019;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_PRESS = 5020;
        public static final int READER_PLUGIN_RES_TXT_GUIDE = 5022;
        public static final int READER_PLUGIN_SO_ERR = 5025;
        public static final int READER_PLUGIN_SO_INTO_START = 5027;
        public static final int READER_PLUGIN_SO_PROGRESS = 5028;
        public static final int READER_PLUGIN_SO_VERSION = 5030;
        public static final int READER_PLUGIN_STATUS = 5012;
        public static final int READER_PLUGIN_TEXT_FIND_RESULT = 5042;
        public static final int READER_PPT_PLAY_MODEL = 5009;
        public static final int READER_SEARCH_IN_DOCUMENT = 5026;
        public static final int READER_TOAST = 5005;
        public static final int READER_TXT_READING_MODEL = 5010;
        public static final int SEARCH_SELECT_TEXT = 5004;
        public static final int SHOW_BAR = 5002;
        public static final int SHOW_DIALOG = 5006;

        void onCallBackAction(Integer num, Object obj, Object obj2);
    }

    public TbsReaderView(Context context, ReaderCallback readerCallback) {
        super(context.getApplicationContext());
        this.f6669a = null;
        this.f6670b = null;
        this.f6671c = null;
        this.f6672d = null;
        this.f6673e = null;
        if (!(context instanceof Activity)) {
            throw new RuntimeException("error: unexpect context(none Activity)");
        }
        this.f6672d = readerCallback;
        this.f6669a = context;
        this.f6673e = new C6799ay(this);
    }

    public static Drawable getResDrawable(Context context, int i10) {
        if (m5921a(context)) {
            return C6826k.m6201a(i10);
        }
        return null;
    }

    public static String getResString(Context context, int i10) {
        return m5921a(context) ? C6826k.m6205b(i10) : "";
    }

    public static boolean isSupportExt(Context context, String str) {
        return m5921a(context) && C6826k.m6202a(context) && C6826k.m6203a(str);
    }

    /* renamed from: a */
    public boolean m5922a() {
        try {
            if (this.f6670b == null) {
                this.f6670b = new C6826k(this.f6673e);
            }
            if (this.f6671c == null) {
                this.f6671c = this.f6670b.m6206a();
            }
            Object obj = this.f6671c;
            if (obj != null) {
                return this.f6670b.m6211a(obj, this.f6669a);
            }
            return false;
        } catch (NullPointerException unused) {
            Log.e(TAG, "Unexpect null object!");
            return false;
        }
    }

    public void doCommand(Integer num, Object obj, Object obj2) {
        Object obj3;
        C6826k c6826k = this.f6670b;
        if (c6826k == null || (obj3 = this.f6671c) == null) {
            return;
        }
        c6826k.m6209a(obj3, num, obj, obj2);
    }

    public boolean downloadPlugin(String str) {
        Object obj = this.f6671c;
        if (obj != null) {
            return this.f6670b.m6213a(obj, this.f6669a, str, true);
        }
        Log.e(TAG, "downloadPlugin failed!");
        return false;
    }

    public void onSizeChanged(int i10, int i11) {
        Object obj;
        C6826k c6826k = this.f6670b;
        if (c6826k == null || (obj = this.f6671c) == null) {
            return;
        }
        c6826k.m6208a(obj, i10, i11);
    }

    public void onStop() {
        C6826k c6826k = this.f6670b;
        if (c6826k != null) {
            c6826k.m6207a(this.f6671c);
            this.f6671c = null;
        }
        this.f6669a = null;
        f6668f = false;
    }

    public void openFile(Bundle bundle) {
        String str;
        if (this.f6671c == null || bundle == null) {
            str = "init failed!";
        } else {
            bundle.putBoolean("browser6.0", C6774d.m6003c(this.f6669a) | (!C6774d.m6002b(this.f6669a)));
            bundle.putBoolean("browser6.1", C6774d.m5998a(this.f6669a, 6101625L, 610000L) | (!C6774d.m6002b(this.f6669a)));
            if (this.f6670b.m6212a(this.f6671c, this.f6669a, bundle, this)) {
                return;
            } else {
                str = "OpenFile failed!";
            }
        }
        Log.e(TAG, str);
    }

    public boolean preOpen(String str, boolean z10) {
        if (!isSupportExt(this.f6669a, str)) {
            Log.e(TAG, "not supported by:" + str);
            return false;
        }
        boolean zM5921a = m5921a(this.f6669a);
        if (zM5921a) {
            zM5921a = m5922a();
            if (z10 && zM5921a) {
                return this.f6670b.m6213a(this.f6671c, this.f6669a, str, Apn.getApnType(this.f6669a) == 3);
            }
        }
        return zM5921a;
    }

    public void userStatistics(String str) {
        C6826k c6826k = this.f6670b;
        if (c6826k != null) {
            c6826k.m6210a(this.f6671c, str);
        }
    }

    /* renamed from: a */
    public static boolean m5921a(Context context) {
        if (!f6668f) {
            C6827l.m6214a(true).m6220a(context.getApplicationContext(), true, false, null);
            f6668f = C6827l.m6214a(false).m6222b();
        }
        return f6668f;
    }
}
