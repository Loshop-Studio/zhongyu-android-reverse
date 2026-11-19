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
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.UtilsBridge;
import com.umeng.analytics.pro.C3335ai;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LogUtils {

    /* renamed from: A */
    public static final int f530A = 7;
    private static final String ARGS = "args";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_CORNER = "└";

    /* renamed from: D */
    public static final int f531D = 3;

    /* renamed from: E */
    public static final int f532E = 6;
    private static final int FILE = 16;

    /* renamed from: I */
    public static final int f533I = 4;
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
    public static final int f535V = 2;

    /* renamed from: W */
    public static final int f536W = 5;
    private static final int XML = 48;
    private static SimpleDateFormat simpleDateFormat;

    /* renamed from: T */
    private static final char[] f534T = {'V', 'D', 'I', 'W', 'E', 'A'};
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
            return LogUtils.f534T[this.mConsoleFilter - 2];
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
            return LogUtils.f534T[this.mFileFilter - 2];
        }

        public final String getFilePrefix() {
            return this.mFilePrefix;
        }

        public final String getGlobalTag() {
            return UtilsBridge.isSpace(this.mGlobalTag) ? "" : this.mGlobalTag;
        }

        public final String getProcessName() {
            String str = this.mProcessName;
            return str == null ? "" : str.replace(":", "_");
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

        public final Config setBorderSwitch(boolean z3) {
            this.mLogBorderSwitch = z3;
            return this;
        }

        public final Config setConsoleFilter(int i4) {
            this.mConsoleFilter = i4;
            return this;
        }

        public final Config setConsoleSwitch(boolean z3) {
            this.mLog2ConsoleSwitch = z3;
            return this;
        }

        public final Config setDir(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mDir = null;
            } else {
                if (!str.endsWith(LogUtils.FILE_SEP)) {
                    str = str + LogUtils.FILE_SEP;
                }
                this.mDir = str;
            }
            return this;
        }

        public final Config setFileExtension(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mFileExtension = ".txt";
            } else if (str.startsWith(".")) {
                this.mFileExtension = str;
            } else {
                this.mFileExtension = "." + str;
            }
            return this;
        }

        public final Config setFileFilter(int i4) {
            this.mFileFilter = i4;
            return this;
        }

        public final Config setFilePrefix(String str) {
            if (UtilsBridge.isSpace(str)) {
                this.mFilePrefix = "util";
            } else {
                this.mFilePrefix = str;
            }
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
            } else {
                this.mGlobalTag = str;
                this.mTagIsSpace = false;
            }
            return this;
        }

        public final Config setLog2FileSwitch(boolean z3) {
            this.mLog2FileSwitch = z3;
            return this;
        }

        public final Config setLogHeadSwitch(boolean z3) {
            this.mLogHeadSwitch = z3;
            return this;
        }

        public final Config setLogSwitch(boolean z3) {
            this.mLogSwitch = z3;
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

        public final Config setSaveDays(@IntRange(from = 1) int i4) {
            this.mSaveDays = i4;
            return this;
        }

        public final Config setSingleTagSwitch(boolean z3) {
            this.mSingleTagSwitch = z3;
            return this;
        }

        public final Config setStackDeep(@IntRange(from = 1) int i4) {
            this.mStackDeep = i4;
            return this;
        }

        public final Config setStackOffset(@IntRange(from = 0) int i4) {
            this.mStackOffset = i4;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(getProcessName());
            sb.append(LogUtils.LINE_SEP);
            sb.append("logSwitch: ");
            sb.append(isLogSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("consoleSwitch: ");
            sb.append(isLog2ConsoleSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("tag: ");
            sb.append(getGlobalTag().equals("") ? LogUtils.NULL : getGlobalTag());
            sb.append(LogUtils.LINE_SEP);
            sb.append("headSwitch: ");
            sb.append(isLogHeadSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("fileSwitch: ");
            sb.append(isLog2FileSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("dir: ");
            sb.append(getDir());
            sb.append(LogUtils.LINE_SEP);
            sb.append("filePrefix: ");
            sb.append(getFilePrefix());
            sb.append(LogUtils.LINE_SEP);
            sb.append("borderSwitch: ");
            sb.append(isLogBorderSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("singleTagSwitch: ");
            sb.append(isSingleTagSwitch());
            sb.append(LogUtils.LINE_SEP);
            sb.append("consoleFilter: ");
            sb.append(getConsoleFilter());
            sb.append(LogUtils.LINE_SEP);
            sb.append("fileFilter: ");
            sb.append(getFileFilter());
            sb.append(LogUtils.LINE_SEP);
            sb.append("stackDeep: ");
            sb.append(getStackDeep());
            sb.append(LogUtils.LINE_SEP);
            sb.append("stackOffset: ");
            sb.append(getStackOffset());
            sb.append(LogUtils.LINE_SEP);
            sb.append("saveDays: ");
            sb.append(getSaveDays());
            sb.append(LogUtils.LINE_SEP);
            sb.append("formatter: ");
            sb.append(LogUtils.I_FORMATTER_MAP);
            sb.append(LogUtils.LINE_SEP);
            sb.append("fileWriter: ");
            sb.append(this.mFileWriter);
            sb.append(LogUtils.LINE_SEP);
            sb.append("onConsoleOutputListener: ");
            sb.append(this.mOnConsoleOutputListener);
            sb.append(LogUtils.LINE_SEP);
            sb.append("onFileOutputListener: ");
            sb.append(this.mOnFileOutputListener);
            sb.append(LogUtils.LINE_SEP);
            sb.append("fileExtraHeader: ");
            sb.append(this.mFileHead.getAppended());
            return sb.toString();
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
        public abstract String format(T t3);
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
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                if (obj instanceof Bundle) {
                    sb.append(obj == bundle ? "(this Bundle)" : bundle2String((Bundle) obj));
                } else {
                    sb.append(LogUtils.formatObject(obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        @RequiresApi(api = 16)
        private static void clipData2String(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb.append("NULL");
                sb.append("}");
            } else {
                sb.append("I:");
                sb.append(intent2String(intent));
                sb.append("}");
            }
        }

        private static String formatJson(String str) {
            try {
                int length = str.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = str.charAt(i4);
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
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            return str;
        }

        private static String formatXml(String str) throws TransformerException, IllegalArgumentException {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", ExifInterface.GPS_MEASUREMENT_2D);
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + LogUtils.LINE_SEP);
            } catch (Exception e4) {
                e4.printStackTrace();
                return str;
            }
        }

        private static String intent2String(Intent intent) {
            boolean z3;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z4 = false;
            boolean z5 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z3 = false;
            } else {
                z3 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z5) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z5 = false;
                }
                sb.append("]");
                z3 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z3 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z3 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z3 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z3 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z3 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z3 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z3) {
                    sb.append(' ');
                }
                clipData2String(clipData, sb);
                z3 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(bundle2String(extras));
                sb.append('}');
            } else {
                z4 = z3;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : intent2String(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
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

        public static String object2String(Object obj, int i4) {
            return obj.getClass().isArray() ? array2String(obj) : obj instanceof Throwable ? UtilsBridge.getFullStackTrace((Throwable) obj) : obj instanceof Bundle ? bundle2String((Bundle) obj) : obj instanceof Intent ? intent2String((Intent) obj) : i4 == 32 ? object2Json(obj) : i4 == 48 ? formatXml(obj.toString()) : obj.toString();
        }
    }

    public interface OnConsoleOutputListener {
        void onConsoleOutput(int i4, String str, String str2);
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
    public static void m1626a(Object... objArr) {
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
            if (zCreateNewFile) {
                printDeviceInfo(str, str2);
            }
            return zCreateNewFile;
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static void m1627d(Object... objArr) {
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
                    name.length();
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
            } catch (ParseException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m1628e(Object... objArr) {
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

    private static String formatObject(int i4, Object obj) {
        return obj == null ? NULL : i4 == 32 ? LogFormatter.object2String(obj, 32) : i4 == 48 ? LogFormatter.object2String(obj, 48) : formatObject(obj);
    }

    private static Class getClassFromObject(Object obj) {
        String string;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
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
            } catch (ClassNotFoundException e4) {
                e4.printStackTrace();
            }
        }
        return cls;
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
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static void m1629i(Object... objArr) {
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

    public static void log(int i4, String str, Object... objArr) {
        Config config = CONFIG;
        if (config.isLogSwitch()) {
            final int i5 = i4 & 15;
            int i6 = i4 & 240;
            if (config.isLog2ConsoleSwitch() || config.isLog2FileSwitch() || i6 == 16) {
                if (i5 >= config.mConsoleFilter || i5 >= config.mFileFilter) {
                    final TagHead tagHeadProcessTagAndHead = processTagAndHead(str);
                    final String strProcessBody = processBody(i6, objArr);
                    if (config.isLog2ConsoleSwitch() && i6 != 16 && i5 >= config.mConsoleFilter) {
                        print2Console(i5, tagHeadProcessTagAndHead.tag, tagHeadProcessTagAndHead.consoleHead, strProcessBody);
                    }
                    if ((config.isLog2FileSwitch() || i6 == 16) && i5 >= config.mFileFilter) {
                        EXECUTOR.execute(new Runnable() { // from class: com.blankj.utilcode.util.LogUtils.1
                            @Override // java.lang.Runnable
                            public void run() {
                                LogUtils.print2File(i5, tagHeadProcessTagAndHead.tag, tagHeadProcessTagAndHead.fileHead + strProcessBody);
                            }
                        });
                    }
                }
            }
        }
    }

    private static void print2Console(int i4, String str, String[] strArr, String str2) {
        if (CONFIG.isSingleTagSwitch()) {
            printSingleTagMsg(i4, str, processSingleTagMsg(i4, str, strArr, str2));
            return;
        }
        printBorder(i4, str, true);
        printHead(i4, str, strArr);
        printMsg(i4, str, str2);
        printBorder(i4, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print2File(int i4, String str, String str2) {
        Date date = new Date();
        String str3 = getSdf().format(date);
        String strSubstring = str3.substring(0, 10);
        String currentLogFilePath = getCurrentLogFilePath(date);
        if (!createOrExistsFile(currentLogFilePath, strSubstring)) {
            Log.e("LogUtils", "create " + currentLogFilePath + " failed!");
            return;
        }
        input2File(currentLogFilePath, str3.substring(11) + f534T[i4 - 2] + "/" + str + str2 + LINE_SEP);
    }

    private static void printBorder(int i4, String str, boolean z3) {
        if (CONFIG.isLogBorderSwitch()) {
            print2Console(i4, str, z3 ? TOP_BORDER : BOTTOM_BORDER);
        }
    }

    private static void printDeviceInfo(String str, String str2) {
        Config config = CONFIG;
        config.mFileHead.addFirst("Date of Log", str2);
        input2File(str, config.mFileHead.toString());
    }

    private static void printHead(int i4, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (CONFIG.isLogBorderSwitch()) {
                    str2 = LEFT_BORDER + str2;
                }
                print2Console(i4, str, str2);
            }
            if (CONFIG.isLogBorderSwitch()) {
                print2Console(i4, str, MIDDLE_BORDER);
            }
        }
    }

    private static void printMsg(int i4, String str, String str2) {
        int length = str2.length();
        int i5 = length / MAX_LEN;
        if (i5 <= 0) {
            printSubMsg(i4, str, str2);
            return;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i7 + MAX_LEN;
            printSubMsg(i4, str, str2.substring(i7, i8));
            i6++;
            i7 = i8;
        }
        if (i7 != length) {
            printSubMsg(i4, str, str2.substring(i7, length));
        }
    }

    private static void printSingleTagMsg(int i4, String str, String str2) {
        int length = str2.length();
        Config config = CONFIG;
        boolean zIsLogBorderSwitch = config.isLogBorderSwitch();
        int i5 = MAX_LEN;
        int i6 = zIsLogBorderSwitch ? (length - 113) / MAX_LEN : length / MAX_LEN;
        if (i6 <= 0) {
            print2Console(i4, str, str2);
            return;
        }
        int i7 = 1;
        if (!config.isLogBorderSwitch()) {
            print2Console(i4, str, str2.substring(0, MAX_LEN));
            while (i7 < i6) {
                StringBuilder sb = new StringBuilder();
                sb.append(PLACEHOLDER);
                sb.append(LINE_SEP);
                int i8 = i5 + MAX_LEN;
                sb.append(str2.substring(i5, i8));
                print2Console(i4, str, sb.toString());
                i7++;
                i5 = i8;
            }
            if (i5 != length) {
                print2Console(i4, str, PLACEHOLDER + LINE_SEP + str2.substring(i5, length));
                return;
            }
            return;
        }
        print2Console(i4, str, str2.substring(0, MAX_LEN) + LINE_SEP + BOTTOM_BORDER);
        while (i7 < i6) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PLACEHOLDER);
            String str3 = LINE_SEP;
            sb2.append(str3);
            sb2.append(TOP_BORDER);
            sb2.append(str3);
            sb2.append(LEFT_BORDER);
            int i9 = i5 + MAX_LEN;
            sb2.append(str2.substring(i5, i9));
            sb2.append(str3);
            sb2.append(BOTTOM_BORDER);
            print2Console(i4, str, sb2.toString());
            i7++;
            i5 = i9;
        }
        if (i5 != length - 113) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PLACEHOLDER);
            String str4 = LINE_SEP;
            sb3.append(str4);
            sb3.append(TOP_BORDER);
            sb3.append(str4);
            sb3.append(LEFT_BORDER);
            sb3.append(str2.substring(i5, length));
            print2Console(i4, str, sb3.toString());
        }
    }

    private static void printSubMsg(int i4, String str, String str2) {
        if (!CONFIG.isLogBorderSwitch()) {
            print2Console(i4, str, str2);
            return;
        }
        for (String str3 : str2.split(LINE_SEP)) {
            print2Console(i4, str, LEFT_BORDER + str3);
        }
    }

    private static String processBody(int i4, Object... objArr) {
        String string;
        if (objArr != null) {
            if (objArr.length == 1) {
                string = formatObject(i4, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    Object obj = objArr[i5];
                    sb.append(ARGS);
                    sb.append("[");
                    sb.append(i5);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(formatObject(obj));
                    sb.append(LINE_SEP);
                }
                string = sb.toString();
            }
        } else {
            string = NULL;
        }
        return string.length() == 0 ? NOTHING : string;
    }

    private static String processSingleTagMsg(int i4, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        if (CONFIG.isLogBorderSwitch()) {
            sb.append(PLACEHOLDER);
            String str3 = LINE_SEP;
            sb.append(str3);
            sb.append(TOP_BORDER);
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append(LEFT_BORDER);
                    sb.append(str4);
                    sb.append(LINE_SEP);
                }
                sb.append(MIDDLE_BORDER);
                sb.append(LINE_SEP);
            }
            String[] strArrSplit = str2.split(LINE_SEP);
            int length = strArrSplit.length;
            while (i5 < length) {
                String str5 = strArrSplit[i5];
                sb.append(LEFT_BORDER);
                sb.append(str5);
                sb.append(LINE_SEP);
                i5++;
            }
            sb.append(BOTTOM_BORDER);
        } else {
            if (strArr != null) {
                sb.append(PLACEHOLDER);
                sb.append(LINE_SEP);
                int length2 = strArr.length;
                while (i5 < length2) {
                    sb.append(strArr[i5]);
                    sb.append(LINE_SEP);
                    i5++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static TagHead processTagAndHead(String str) {
        String strSubstring;
        String globalTag;
        String strSubstring2;
        Config config = CONFIG;
        if (config.mTagIsSpace || config.isLogHeadSwitch()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int stackOffset = config.getStackOffset() + 3;
            if (stackOffset >= stackTrace.length) {
                String fileName = getFileName(stackTrace[3]);
                if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                    int iIndexOf = fileName.indexOf(46);
                    strSubstring2 = iIndexOf == -1 ? fileName : fileName.substring(0, iIndexOf);
                } else {
                    strSubstring2 = str;
                }
                return new TagHead(strSubstring2, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[stackOffset];
            String fileName2 = getFileName(stackTraceElement);
            if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                int iIndexOf2 = fileName2.indexOf(46);
                strSubstring = iIndexOf2 == -1 ? fileName2 : fileName2.substring(0, iIndexOf2);
            } else {
                strSubstring = str;
            }
            if (config.isLogHeadSwitch()) {
                String name = Thread.currentThread().getName();
                String string = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), fileName2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + string + "]: ";
                if (config.getStackDeep() <= 1) {
                    return new TagHead(strSubstring, new String[]{string}, str2);
                }
                int iMin = Math.min(config.getStackDeep(), stackTrace.length - stackOffset);
                String[] strArr = new String[iMin];
                strArr[0] = string;
                int length = name.length() + 2;
                String string2 = new Formatter().format("%" + length + C3335ai.f1711az, "").toString();
                for (int i4 = 1; i4 < iMin; i4++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i4 + stackOffset];
                    strArr[i4] = new Formatter().format("%s%s.%s(%s:%d)", string2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), getFileName(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new TagHead(strSubstring, strArr, str2);
            }
            globalTag = strSubstring;
        } else {
            globalTag = config.getGlobalTag();
        }
        return new TagHead(globalTag, null, ": ");
    }

    /* renamed from: v */
    public static void m1630v(Object... objArr) {
        log(2, CONFIG.getGlobalTag(), objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    /* renamed from: w */
    public static void m1631w(Object... objArr) {
        log(5, CONFIG.getGlobalTag(), objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void xml(String str) {
        log(51, CONFIG.getGlobalTag(), str);
    }

    public static void file(int i4, Object obj) {
        log(i4 | 16, CONFIG.getGlobalTag(), obj);
    }

    private static String getCurrentLogFilePath(Date date) {
        String strSubstring = getSdf().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        Config config = CONFIG;
        sb.append(config.getDir());
        sb.append(config.getFilePrefix());
        sb.append("_");
        sb.append(strSubstring);
        sb.append("_");
        sb.append(config.getProcessName());
        sb.append(config.getFileExtension());
        return sb.toString();
    }

    public static void json(int i4, Object obj) {
        log(i4 | 32, CONFIG.getGlobalTag(), obj);
    }

    public static void xml(int i4, String str) {
        log(i4 | 48, CONFIG.getGlobalTag(), str);
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

    public static void file(int i4, String str, Object obj) {
        log(i4 | 16, str, obj);
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

    public static void json(int i4, String str, Object obj) {
        log(i4 | 32, str, obj);
    }

    public static void xml(int i4, String str, String str2) {
        log(i4 | 48, str, str2);
    }

    private static void print2Console(int i4, String str, String str2) {
        Log.println(i4, str, str2);
        Config config = CONFIG;
        if (config.mOnConsoleOutputListener != null) {
            config.mOnConsoleOutputListener.onConsoleOutput(i4, str, str2);
        }
    }
}
