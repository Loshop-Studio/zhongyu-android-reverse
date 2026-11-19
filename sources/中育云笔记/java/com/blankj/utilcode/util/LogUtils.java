package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.UtilsBridge;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LogUtils {

    /* renamed from: A */
    public static final int f4550A = 7;
    private static final String ARGS = "args";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_CORNER = "└";

    /* renamed from: D */
    public static final int f4551D = 3;

    /* renamed from: E */
    public static final int f4552E = 6;
    private static final int FILE = 16;

    /* renamed from: I */
    public static final int f4553I = 4;
    private static final int JSON = 32;
    private static final String LEFT_BORDER = "│ ";
    private static final int MAX_LEN = 1100;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String MIDDLE_CORNER = "├";
    private static final String MIDDLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String NOTHING = "log nothing";
    private static final String NULL = "null";
    private static final String PLACEHOLDER = " ";
    private static final String SIDE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String TOP_CORNER = "┌";

    /* renamed from: V */
    public static final int f4555V = 2;

    /* renamed from: W */
    public static final int f4556W = 5;
    private static final int XML = 48;
    private static SimpleDateFormat simpleDateFormat;

    /* renamed from: T */
    private static final char[] f4554T = {'V', 'D', 'I', 'W', 'E', 'A'};
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static final Config CONFIG = new Config();
    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    private static final SimpleArrayMap<Class, IFormatter> I_FORMATTER_MAP = new SimpleArrayMap<>();

    public static final class Config {
        private int mConsoleFilter;
        private String mDefaultDir;
        private String mDir;
        private String mFileExtension;
        private int mFileFilter;
        private UtilsBridge.FileHead mFileHead;
        private String mFilePrefix;
        private IFileWriter mFileWriter;
        private String mGlobalTag;
        private boolean mLog2ConsoleSwitch;
        private boolean mLog2FileSwitch;
        private boolean mLogBorderSwitch;
        private boolean mLogHeadSwitch;
        private boolean mLogSwitch;
        private OnConsoleOutputListener mOnConsoleOutputListener;
        private OnFileOutputListener mOnFileOutputListener;
        private String mProcessName;
        private int mSaveDays;
        private boolean mSingleTagSwitch;
        private int mStackDeep;
        private int mStackOffset;
        private boolean mTagIsSpace;

        public final Config addFileExtraHead(Map<String, String> map) {
            this.mFileHead.append(map);
            return this;
        }

        public final <T> Config addFormatter(IFormatter<T> iFormatter) {
            if (iFormatter != null) {
                LogUtils.I_FORMATTER_MAP.put(LogUtils.getTypeClassFromParadigm(iFormatter), iFormatter);
            }
            return this;
        }

        public final char getConsoleFilter() {
            return LogUtils.f4554T[this.mConsoleFilter - 2];
        }

        public final String getDefaultDir() {
            return this.mDefaultDir;
        }

        public final String getDir() {
            String str = this.mDir;
            return str == null ? this.mDefaultDir : str;
        }

        public final String getFileExtension() {
            return this.mFileExtension;
        }

        public final char getFileFilter() {
            return LogUtils.f4554T[this.mFileFilter - 2];
        }

        public final String getFilePrefix() {
            return this.mFilePrefix;
        }

        public final String getGlobalTag() {
            return UtilsBridge.isSpace(this.mGlobalTag) ? "" : this.mGlobalTag;
        }

        public final String getProcessName() {
            String str = this.mProcessName;
            return str == null ? "" : str.replace(":", BundleUtil.UNDERLINE_TAG);
        }

        public final int getSaveDays() {
            return this.mSaveDays;
        }

        public final int getStackDeep() {
            return this.mStackDeep;
        }

        public final int getStackOffset() {
            return this.mStackOffset;
        }

        public final boolean haveSetOnConsoleOutputListener() {
            return this.mOnConsoleOutputListener != null;
        }

        public final boolean haveSetOnFileOutputListener() {
            return this.mOnFileOutputListener != null;
        }

        public final boolean isLog2ConsoleSwitch() {
            return this.mLog2ConsoleSwitch;
        }

        public final boolean isLog2FileSwitch() {
            return this.mLog2FileSwitch;
        }

        public final boolean isLogBorderSwitch() {
            return this.mLogBorderSwitch;
        }

        public final boolean isLogHeadSwitch() {
            return this.mLogHeadSwitch;
        }

        public final boolean isLogSwitch() {
            return this.mLogSwitch;
        }

        public final boolean isSingleTagSwitch() {
            return this.mSingleTagSwitch;
        }

        public final Config setBorderSwitch(boolean z10) {
            this.mLogBorderSwitch = z10;
            return this;
        }

        public final Config setConsoleFilter(int i10) {
            this.mConsoleFilter = i10;
            return this;
        }

        public final Config setConsoleSwitch(boolean z10) {
            this.mLog2ConsoleSwitch = z10;
            return this;
        }

        public final Config setDir(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mDir = null;
                return this;
            }
            if (!str.endsWith(LogUtils.FILE_SEP)) {
                str = str + LogUtils.FILE_SEP;
            }
            this.mDir = str;
            return this;
        }

        public final Config setFileExtension(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mFileExtension = ".txt";
                return this;
            }
            if (str.startsWith(Consts.DOT)) {
                this.mFileExtension = str;
                return this;
            }
            this.mFileExtension = Consts.DOT + str;
            return this;
        }

        public final Config setFileFilter(int i10) {
            this.mFileFilter = i10;
            return this;
        }

        public final Config setFilePrefix(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mFilePrefix = "util";
                return this;
            }
            this.mFilePrefix = str;
            return this;
        }

        public final Config setFileWriter(IFileWriter iFileWriter) {
            this.mFileWriter = iFileWriter;
            return this;
        }

        public final Config setGlobalTag(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mGlobalTag = "";
                this.mTagIsSpace = true;
                return this;
            }
            this.mGlobalTag = str;
            this.mTagIsSpace = false;
            return this;
        }

        public final Config setLog2FileSwitch(boolean z10) {
            this.mLog2FileSwitch = z10;
            return this;
        }

        public final Config setLogHeadSwitch(boolean z10) {
            this.mLogHeadSwitch = z10;
            return this;
        }

        public final Config setLogSwitch(boolean z10) {
            this.mLogSwitch = z10;
            return this;
        }

        public final Config setOnConsoleOutputListener(OnConsoleOutputListener onConsoleOutputListener) {
            this.mOnConsoleOutputListener = onConsoleOutputListener;
            return this;
        }

        public final Config setOnFileOutputListener(OnFileOutputListener onFileOutputListener) {
            this.mOnFileOutputListener = onFileOutputListener;
            return this;
        }

        public final Config setSaveDays(@IntRange(from = 1) int i10) {
            this.mSaveDays = i10;
            return this;
        }

        public final Config setSingleTagSwitch(boolean z10) {
            this.mSingleTagSwitch = z10;
            return this;
        }

        public final Config setStackDeep(@IntRange(from = 1) int i10) {
            this.mStackDeep = i10;
            return this;
        }

        public final Config setStackOffset(@IntRange(from = 0) int i10) {
            this.mStackOffset = i10;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("process: ");
            sb2.append(getProcessName());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("logSwitch: ");
            sb2.append(isLogSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("consoleSwitch: ");
            sb2.append(isLog2ConsoleSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("tag: ");
            sb2.append(getGlobalTag().equals("") ? LogUtils.NULL : getGlobalTag());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("headSwitch: ");
            sb2.append(isLogHeadSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("fileSwitch: ");
            sb2.append(isLog2FileSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("dir: ");
            sb2.append(getDir());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("filePrefix: ");
            sb2.append(getFilePrefix());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("borderSwitch: ");
            sb2.append(isLogBorderSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("singleTagSwitch: ");
            sb2.append(isSingleTagSwitch());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("consoleFilter: ");
            sb2.append(getConsoleFilter());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("fileFilter: ");
            sb2.append(getFileFilter());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("stackDeep: ");
            sb2.append(getStackDeep());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("stackOffset: ");
            sb2.append(getStackOffset());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("saveDays: ");
            sb2.append(getSaveDays());
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("formatter: ");
            sb2.append(LogUtils.I_FORMATTER_MAP);
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("fileWriter: ");
            sb2.append(this.mFileWriter);
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("onConsoleOutputListener: ");
            sb2.append(this.mOnConsoleOutputListener);
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("onFileOutputListener: ");
            sb2.append(this.mOnFileOutputListener);
            sb2.append(LogUtils.LINE_SEP);
            sb2.append("fileExtraHeader: ");
            sb2.append(this.mFileHead.getAppended());
            return sb2.toString();
        }

        private Config() {
            this.mFilePrefix = "util";
            this.mFileExtension = ".txt";
            this.mLogSwitch = true;
            this.mLog2ConsoleSwitch = true;
            this.mGlobalTag = "";
            this.mTagIsSpace = true;
            this.mLogHeadSwitch = true;
            this.mLog2FileSwitch = false;
            this.mLogBorderSwitch = true;
            this.mSingleTagSwitch = true;
            this.mConsoleFilter = 2;
            this.mFileFilter = 2;
            this.mStackDeep = 1;
            this.mStackOffset = 0;
            this.mSaveDays = -1;
            this.mProcessName = UtilsBridge.getCurrentProcessName();
            this.mFileHead = new UtilsBridge.FileHead("Log");
            if (!UtilsBridge.isSDCardEnableByEnvironment() || Utils.getApp().getExternalFilesDir(null) == null) {
                this.mDefaultDir = Utils.getApp().getFilesDir() + LogUtils.FILE_SEP + "log" + LogUtils.FILE_SEP;
                return;
            }
            this.mDefaultDir = Utils.getApp().getExternalFilesDir(null) + LogUtils.FILE_SEP + "log" + LogUtils.FILE_SEP;
        }

        public final Config addFileExtraHead(String str, String str2) {
            this.mFileHead.append(str, str2);
            return this;
        }

        public final Config setDir(File file) {
            String str;
            if (file == null) {
                str = null;
            } else {
                str = file.getAbsolutePath() + LogUtils.FILE_SEP;
            }
            this.mDir = str;
            return this;
        }
    }

    public interface IFileWriter {
        void write(String str, String str2);
    }

    public static abstract class IFormatter<T> {
        public abstract String format(T t10);
    }

    public static final class LogFormatter {
        private LogFormatter() {
        }

        private static String array2String(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        private static String bundle2String(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb2.append(next);
                sb2.append('=');
                if (obj instanceof Bundle) {
                    sb2.append(obj == bundle ? "(this Bundle)" : bundle2String((Bundle) obj));
                } else {
                    sb2.append(LogUtils.formatObject(obj));
                }
                if (!it.hasNext()) {
                    sb2.append(" }");
                    return sb2.toString();
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }

        @RequiresApi(api = 16)
        private static void clipData2String(ClipData clipData, StringBuilder sb2) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb2.append("ClipData.Item {}");
                return;
            }
            sb2.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb2.append("H:");
                sb2.append(htmlText);
                sb2.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb2.append("T:");
                sb2.append(text);
                sb2.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb2.append("U:");
                sb2.append(uri);
                sb2.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb2.append("NULL");
                sb2.append("}");
            } else {
                sb2.append("I:");
                sb2.append(intent2String(intent));
                sb2.append("}");
            }
        }

        private static String formatJson(String str) {
            try {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '{') {
                        return new JSONObject(str).toString(2);
                    }
                    if (cCharAt == '[') {
                        return new JSONArray(str).toString(2);
                    }
                    if (!Character.isWhitespace(cCharAt)) {
                        return str;
                    }
                }
                return str;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return str;
            }
        }

        private static String formatXml(String str) throws TransformerException, IllegalArgumentException {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + LogUtils.LINE_SEP);
            } catch (Exception e10) {
                e10.printStackTrace();
                return str;
            }
        }

        private static String intent2String(Intent intent) {
            boolean z10;
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Intent { ");
            String action = intent.getAction();
            boolean z11 = false;
            boolean z12 = true;
            if (action != null) {
                sb2.append("act=");
                sb2.append(action);
                z10 = false;
            } else {
                z10 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("cat=[");
                for (String str : categories) {
                    if (!z12) {
                        sb2.append(',');
                    }
                    sb2.append(str);
                    z12 = false;
                }
                sb2.append("]");
                z10 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("dat=");
                sb2.append(data);
                z10 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("typ=");
                sb2.append(type);
                z10 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("flg=0x");
                sb2.append(Integer.toHexString(flags));
                z10 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("pkg=");
                sb2.append(str2);
                z10 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("cmp=");
                sb2.append(component.flattenToShortString());
                z10 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("bnds=");
                sb2.append(sourceBounds.toShortString());
                z10 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                clipData2String(clipData, sb2);
                z10 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z10) {
                    sb2.append(' ');
                }
                sb2.append("extras={");
                sb2.append(bundle2String(extras));
                sb2.append('}');
            } else {
                z11 = z10;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("sel={");
                sb2.append(selector == intent ? "(this Intent)" : intent2String(selector));
                sb2.append("}");
            }
            sb2.append(" }");
            return sb2.toString();
        }

        private static String object2Json(Object obj) {
            if (obj instanceof CharSequence) {
                return UtilsBridge.formatJson(obj.toString());
            }
            try {
                return UtilsBridge.getGson4LogUtils().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        public static String object2String(Object obj) {
            return object2String(obj, -1);
        }

        public static String object2String(Object obj, int i10) {
            return obj.getClass().isArray() ? array2String(obj) : obj instanceof Throwable ? UtilsBridge.getFullStackTrace((Throwable) obj) : obj instanceof Bundle ? bundle2String((Bundle) obj) : obj instanceof Intent ? intent2String((Intent) obj) : i10 == 32 ? object2Json(obj) : i10 == 48 ? formatXml(obj.toString()) : obj.toString();
        }
    }

    public interface OnConsoleOutputListener {
        void onConsoleOutput(int i10, String str, String str2);
    }

    public interface OnFileOutputListener {
        void onFileOutput(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TYPE {
    }

    public static final class TagHead {
        String[] consoleHead;
        String fileHead;
        String tag;

        public TagHead(String str, String[] strArr, String str2) {
            this.tag = str;
            this.consoleHead = strArr;
            this.fileHead = str2;
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* renamed from: a */
    public static void m3885a(Object... objArr) {
        log(7, CONFIG.getGlobalTag(), objArr);
    }

    public static void aTag(String str, Object... objArr) {
        log(7, str, objArr);
    }

    private static boolean createOrExistsFile(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!UtilsBridge.createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            deleteDueLogs(str, str2);
            boolean zCreateNewFile = file.createNewFile();
            if (!zCreateNewFile) {
                return zCreateNewFile;
            }
            printDeviceInfo(str, str2);
            return zCreateNewFile;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static void m3886d(Object... objArr) {
        log(3, CONFIG.getGlobalTag(), objArr);
    }

    public static void dTag(String str, Object... objArr) {
        log(3, str, objArr);
    }

    private static void deleteDueLogs(String str, String str2) {
        File[] fileArrListFiles;
        if (CONFIG.getSaveDays() > 0 && (fileArrListFiles = new File(str).getParentFile().listFiles(new FilenameFilter() { // from class: com.blankj.utilcode.util.LogUtils.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str3) {
                return LogUtils.isMatchLogFileName(str3);
            }
        })) != null && fileArrListFiles.length > 0) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat2.parse(str2).getTime() - (r0.getSaveDays() * 86400000);
                for (final File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (simpleDateFormat2.parse(findDate(name)).getTime() <= time) {
                        EXECUTOR.execute(new Runnable() { // from class: com.blankj.utilcode.util.LogUtils.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (file.delete()) {
                                    return;
                                }
                                Log.e("LogUtils", "delete " + file + " failed!");
                            }
                        });
                    }
                }
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m3887e(Object... objArr) {
        log(6, CONFIG.getGlobalTag(), objArr);
    }

    public static void eTag(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public static void file(Object obj) {
        log(19, CONFIG.getGlobalTag(), obj);
    }

    private static String findDate(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    private static String formatObject(int i10, Object obj) {
        return obj == null ? NULL : i10 == 32 ? LogFormatter.object2String(obj, 32) : i10 == 48 ? LogFormatter.object2String(obj, 48) : formatObject(obj);
    }

    private static Class getClassFromObject(Object obj) {
        String string;
        Class<?> cls = obj.getClass();
        if (!cls.isAnonymousClass() && !cls.isSynthetic()) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces.length == 1) {
            Type rawType = genericInterfaces[0];
            while (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            }
            string = rawType.toString();
        } else {
            Type genericSuperclass = cls.getGenericSuperclass();
            while (genericSuperclass instanceof ParameterizedType) {
                genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
            }
            string = genericSuperclass.toString();
        }
        if (string.startsWith("class ")) {
            string = string.substring(6);
        } else if (string.startsWith("interface ")) {
            string = string.substring(10);
        }
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return cls;
        }
    }

    public static Config getConfig() {
        return CONFIG;
    }

    public static String getCurrentLogFilePath() {
        return getCurrentLogFilePath(new Date());
    }

    private static String getFileName(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return className + ".java";
    }

    public static List<File> getLogFiles() {
        File file = new File(CONFIG.getDir());
        if (!file.exists()) {
            return new ArrayList();
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.blankj.utilcode.util.LogUtils.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return LogUtils.isMatchLogFileName(str);
            }
        });
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fileArrListFiles);
        return arrayList;
    }

    private static SimpleDateFormat getSdf() {
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Class getTypeClassFromParadigm(IFormatter<T> iFormatter) {
        Type[] genericInterfaces = iFormatter.getClass().getGenericInterfaces();
        Type rawType = ((ParameterizedType) (genericInterfaces.length == 1 ? genericInterfaces[0] : iFormatter.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
        while (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        String string = rawType.toString();
        if (string.startsWith("class ")) {
            string = string.substring(6);
        } else if (string.startsWith("interface ")) {
            string = string.substring(10);
        }
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static void m3888i(Object... objArr) {
        log(4, CONFIG.getGlobalTag(), objArr);
    }

    public static void iTag(String str, Object... objArr) {
        log(4, str, objArr);
    }

    private static void input2File(String str, String str2) {
        Config config = CONFIG;
        if (config.mFileWriter == null) {
            UtilsBridge.writeFileFromString(str, str2, true);
        } else {
            config.mFileWriter.write(str, str2);
        }
        if (config.mOnFileOutputListener != null) {
            config.mOnFileOutputListener.onFileOutput(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMatchLogFileName(String str) {
        return str.matches("^" + CONFIG.getFilePrefix() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    public static void json(Object obj) {
        log(35, CONFIG.getGlobalTag(), obj);
    }

    public static void log(int i10, String str, Object... objArr) {
        Config config = CONFIG;
        if (config.isLogSwitch()) {
            final int i11 = i10 & 15;
            int i12 = i10 & 240;
            if (config.isLog2ConsoleSwitch() || config.isLog2FileSwitch() || i12 == 16) {
                if (i11 >= config.mConsoleFilter || i11 >= config.mFileFilter) {
                    final TagHead tagHeadProcessTagAndHead = processTagAndHead(str);
                    final String strProcessBody = processBody(i12, objArr);
                    if (config.isLog2ConsoleSwitch() && i12 != 16 && i11 >= config.mConsoleFilter) {
                        print2Console(i11, tagHeadProcessTagAndHead.tag, tagHeadProcessTagAndHead.consoleHead, strProcessBody);
                    }
                    if ((config.isLog2FileSwitch() || i12 == 16) && i11 >= config.mFileFilter) {
                        EXECUTOR.execute(new Runnable() { // from class: com.blankj.utilcode.util.LogUtils.1
                            @Override // java.lang.Runnable
                            public void run() {
                                LogUtils.print2File(i11, tagHeadProcessTagAndHead.tag, tagHeadProcessTagAndHead.fileHead + strProcessBody);
                            }
                        });
                    }
                }
            }
        }
    }

    private static void print2Console(int i10, String str, String[] strArr, String str2) {
        if (CONFIG.isSingleTagSwitch()) {
            printSingleTagMsg(i10, str, processSingleTagMsg(i10, str, strArr, str2));
            return;
        }
        printBorder(i10, str, true);
        printHead(i10, str, strArr);
        printMsg(i10, str, str2);
        printBorder(i10, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print2File(int i10, String str, String str2) {
        Date date = new Date();
        String str3 = getSdf().format(date);
        String strSubstring = str3.substring(0, 10);
        String currentLogFilePath = getCurrentLogFilePath(date);
        if (!createOrExistsFile(currentLogFilePath, strSubstring)) {
            Log.e("LogUtils", "create " + currentLogFilePath + " failed!");
            return;
        }
        input2File(currentLogFilePath, str3.substring(11) + f4554T[i10 - 2] + MqttTopic.TOPIC_LEVEL_SEPARATOR + str + str2 + LINE_SEP);
    }

    private static void printBorder(int i10, String str, boolean z10) {
        if (CONFIG.isLogBorderSwitch()) {
            print2Console(i10, str, z10 ? TOP_BORDER : BOTTOM_BORDER);
        }
    }

    private static void printDeviceInfo(String str, String str2) {
        Config config = CONFIG;
        config.mFileHead.addFirst("Date of Log", str2);
        input2File(str, config.mFileHead.toString());
    }

    private static void printHead(int i10, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (CONFIG.isLogBorderSwitch()) {
                    str2 = LEFT_BORDER + str2;
                }
                print2Console(i10, str, str2);
            }
            if (CONFIG.isLogBorderSwitch()) {
                print2Console(i10, str, MIDDLE_BORDER);
            }
        }
    }

    private static void printMsg(int i10, String str, String str2) {
        int length = str2.length();
        int i11 = length / MAX_LEN;
        if (i11 <= 0) {
            printSubMsg(i10, str, str2);
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i13 + MAX_LEN;
            printSubMsg(i10, str, str2.substring(i13, i14));
            i12++;
            i13 = i14;
        }
        if (i13 != length) {
            printSubMsg(i10, str, str2.substring(i13, length));
        }
    }

    private static void printSingleTagMsg(int i10, String str, String str2) {
        int length = str2.length();
        Config config = CONFIG;
        boolean zIsLogBorderSwitch = config.isLogBorderSwitch();
        int i11 = MAX_LEN;
        int i12 = zIsLogBorderSwitch ? (length - 113) / MAX_LEN : length / MAX_LEN;
        if (i12 <= 0) {
            print2Console(i10, str, str2);
            return;
        }
        int i13 = 1;
        if (!config.isLogBorderSwitch()) {
            print2Console(i10, str, str2.substring(0, MAX_LEN));
            while (i13 < i12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(PLACEHOLDER);
                sb2.append(LINE_SEP);
                int i14 = i11 + MAX_LEN;
                sb2.append(str2.substring(i11, i14));
                print2Console(i10, str, sb2.toString());
                i13++;
                i11 = i14;
            }
            if (i11 != length) {
                print2Console(i10, str, PLACEHOLDER + LINE_SEP + str2.substring(i11, length));
                return;
            }
            return;
        }
        print2Console(i10, str, str2.substring(0, MAX_LEN) + LINE_SEP + BOTTOM_BORDER);
        while (i13 < i12) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PLACEHOLDER);
            String str3 = LINE_SEP;
            sb3.append(str3);
            sb3.append(TOP_BORDER);
            sb3.append(str3);
            sb3.append(LEFT_BORDER);
            int i15 = i11 + MAX_LEN;
            sb3.append(str2.substring(i11, i15));
            sb3.append(str3);
            sb3.append(BOTTOM_BORDER);
            print2Console(i10, str, sb3.toString());
            i13++;
            i11 = i15;
        }
        if (i11 != length - 113) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PLACEHOLDER);
            String str4 = LINE_SEP;
            sb4.append(str4);
            sb4.append(TOP_BORDER);
            sb4.append(str4);
            sb4.append(LEFT_BORDER);
            sb4.append(str2.substring(i11, length));
            print2Console(i10, str, sb4.toString());
        }
    }

    private static void printSubMsg(int i10, String str, String str2) {
        if (!CONFIG.isLogBorderSwitch()) {
            print2Console(i10, str, str2);
            return;
        }
        for (String str3 : str2.split(LINE_SEP)) {
            print2Console(i10, str, LEFT_BORDER + str3);
        }
    }

    private static String processBody(int i10, Object... objArr) {
        String string;
        if (objArr != null) {
            if (objArr.length == 1) {
                string = formatObject(i10, objArr[0]);
            } else {
                StringBuilder sb2 = new StringBuilder();
                int length = objArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = objArr[i11];
                    sb2.append(ARGS);
                    sb2.append("[");
                    sb2.append(i11);
                    sb2.append("]");
                    sb2.append(" = ");
                    sb2.append(formatObject(obj));
                    sb2.append(LINE_SEP);
                }
                string = sb2.toString();
            }
        } else {
            string = NULL;
        }
        return string.length() == 0 ? NOTHING : string;
    }

    private static String processSingleTagMsg(int i10, String str, String[] strArr, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (CONFIG.isLogBorderSwitch()) {
            sb2.append(PLACEHOLDER);
            String str3 = LINE_SEP;
            sb2.append(str3);
            sb2.append(TOP_BORDER);
            sb2.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb2.append(LEFT_BORDER);
                    sb2.append(str4);
                    sb2.append(LINE_SEP);
                }
                sb2.append(MIDDLE_BORDER);
                sb2.append(LINE_SEP);
            }
            String[] strArrSplit = str2.split(LINE_SEP);
            int length = strArrSplit.length;
            while (i11 < length) {
                String str5 = strArrSplit[i11];
                sb2.append(LEFT_BORDER);
                sb2.append(str5);
                sb2.append(LINE_SEP);
                i11++;
            }
            sb2.append(BOTTOM_BORDER);
        } else {
            if (strArr != null) {
                sb2.append(PLACEHOLDER);
                sb2.append(LINE_SEP);
                int length2 = strArr.length;
                while (i11 < length2) {
                    sb2.append(strArr[i11]);
                    sb2.append(LINE_SEP);
                    i11++;
                }
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    private static TagHead processTagAndHead(String str) {
        Config config = CONFIG;
        if (config.mTagIsSpace || config.isLogHeadSwitch()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int stackOffset = config.getStackOffset() + 3;
            if (stackOffset >= stackTrace.length) {
                String fileName = getFileName(stackTrace[3]);
                if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                    int iIndexOf = fileName.indexOf(46);
                    str = iIndexOf == -1 ? fileName : fileName.substring(0, iIndexOf);
                }
                return new TagHead(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[stackOffset];
            String fileName2 = getFileName(stackTraceElement);
            if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                int iIndexOf2 = fileName2.indexOf(46);
                str = iIndexOf2 == -1 ? fileName2 : fileName2.substring(0, iIndexOf2);
            }
            if (config.isLogHeadSwitch()) {
                String name = Thread.currentThread().getName();
                String string = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), fileName2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + string + "]: ";
                if (config.getStackDeep() <= 1) {
                    return new TagHead(str, new String[]{string}, str2);
                }
                int iMin = Math.min(config.getStackDeep(), stackTrace.length - stackOffset);
                String[] strArr = new String[iMin];
                strArr[0] = string;
                int length = name.length() + 2;
                String string2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i10 = 1; i10 < iMin; i10++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i10 + stackOffset];
                    strArr[i10] = new Formatter().format("%s%s.%s(%s:%d)", string2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), getFileName(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new TagHead(str, strArr, str2);
            }
        } else {
            str = config.getGlobalTag();
        }
        return new TagHead(str, null, ": ");
    }

    /* renamed from: v */
    public static void m3889v(Object... objArr) {
        log(2, CONFIG.getGlobalTag(), objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    /* renamed from: w */
    public static void m3890w(Object... objArr) {
        log(5, CONFIG.getGlobalTag(), objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void xml(String str) {
        log(51, CONFIG.getGlobalTag(), str);
    }

    public static void file(int i10, Object obj) {
        log(i10 | 16, CONFIG.getGlobalTag(), obj);
    }

    private static String getCurrentLogFilePath(Date date) {
        String strSubstring = getSdf().format(date).substring(0, 10);
        StringBuilder sb2 = new StringBuilder();
        Config config = CONFIG;
        sb2.append(config.getDir());
        sb2.append(config.getFilePrefix());
        sb2.append(BundleUtil.UNDERLINE_TAG);
        sb2.append(strSubstring);
        sb2.append(BundleUtil.UNDERLINE_TAG);
        sb2.append(config.getProcessName());
        sb2.append(config.getFileExtension());
        return sb2.toString();
    }

    public static void json(int i10, Object obj) {
        log(i10 | 32, CONFIG.getGlobalTag(), obj);
    }

    public static void xml(int i10, String str) {
        log(i10 | 48, CONFIG.getGlobalTag(), str);
    }

    public static void file(String str, Object obj) {
        log(19, str, obj);
    }

    public static void json(String str, Object obj) {
        log(35, str, obj);
    }

    public static void xml(String str, String str2) {
        log(51, str, str2);
    }

    public static void file(int i10, String str, Object obj) {
        log(i10 | 16, str, obj);
    }

    public static void json(int i10, String str, Object obj) {
        log(i10 | 32, str, obj);
    }

    public static void xml(int i10, String str, String str2) {
        log(i10 | 48, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatObject(Object obj) {
        IFormatter iFormatter;
        if (obj == null) {
            return NULL;
        }
        SimpleArrayMap<Class, IFormatter> simpleArrayMap = I_FORMATTER_MAP;
        if (!simpleArrayMap.isEmpty() && (iFormatter = simpleArrayMap.get(getClassFromObject(obj))) != null) {
            return iFormatter.format(obj);
        }
        return LogFormatter.object2String(obj);
    }

    private static void print2Console(int i10, String str, String str2) {
        Log.println(i10, str, str2);
        Config config = CONFIG;
        if (config.mOnConsoleOutputListener != null) {
            config.mOnConsoleOutputListener.onConsoleOutput(i10, str, str2);
        }
    }
}
