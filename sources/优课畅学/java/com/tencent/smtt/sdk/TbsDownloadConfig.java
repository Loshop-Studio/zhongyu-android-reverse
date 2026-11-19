package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.internal.CalendarModelKt;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class TbsDownloadConfig {
    public static final int CMD_ID_DOWNLOAD_FILE = 101;
    public static final int CMD_ID_FILE_UPLOAD = 100;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 86400;
    public static final int ERROR_DOWNLOAD = 2;
    public static final int ERROR_INSTALL = 5;
    public static final int ERROR_LOAD = 6;
    public static final int ERROR_NONE = 1;
    public static final int ERROR_REPORTED = 0;
    public static final int ERROR_UNZIP = 4;
    public static final int ERROR_VERIFY = 3;

    /* renamed from: b */
    private static TbsDownloadConfig f6624b;

    /* renamed from: a */
    Map<String, Object> f6625a = new HashMap();

    /* renamed from: c */
    private Context f6626c;
    public SharedPreferences mPreferences;

    public interface TbsConfigKey {
        public static final String KEY_APP_METADATA = "app_metadata";
        public static final String KEY_APP_VERSIONCODE = "app_versioncode";
        public static final String KEY_APP_VERSIONCODE_FOR_SWITCH = "app_versioncode_for_switch";
        public static final String KEY_APP_VERSIONNAME = "app_versionname";
        public static final String KEY_BACKUPCORE_DELFILELIST = "backupcore_delfilelist";
        public static final String KEY_DECOUPLECOREVERSION = "tbs_decouplecoreversion";
        public static final String KEY_DESkEY_TOKEN = "tbs_deskey_token";
        public static final String KEY_DEVICE_CPUABI = "device_cpuabi";
        public static final String KEY_DOWNLOADDECOUPLECORE = "tbs_downloaddecouplecore";
        public static final String KEY_DOWNLOADURL_LIST = "tbs_downloadurl_list";
        public static final String KEY_DOWNLOAD_FAILED_MAX_RETRYTIMES = "tbs_download_failed_max_retrytimes";
        public static final String KEY_DOWNLOAD_FAILED_RETRYTIMES = "tbs_download_failed_retrytimes";
        public static final String KEY_DOWNLOAD_INTERRUPT_CODE = "tbs_download_interrupt_code";
        public static final String KEY_DOWNLOAD_INTERRUPT_CODE_REASON = "tbs_download_interrupt_code_reason";
        public static final String KEY_DOWNLOAD_INTERRUPT_TIME = "tbs_download_interrupt_time";
        public static final String KEY_DOWNLOAD_MAXFLOW = "tbs_download_maxflow";
        public static final String KEY_DOWNLOAD_MIN_FREE_SPACE = "tbs_download_min_free_space";
        public static final String KEY_DOWNLOAD_SINGLE_TIMEOUT = "tbs_single_timeout";
        public static final String KEY_DOWNLOAD_SUCCESS_MAX_RETRYTIMES = "tbs_download_success_max_retrytimes";
        public static final String KEY_DOWNLOAD_SUCCESS_RETRYTIMES = "tbs_download_success_retrytimes";
        public static final String KEY_FULL_PACKAGE = "request_full_package";
        public static final String KEY_INSTALL_INTERRUPT_CODE = "tbs_install_interrupt_code";
        public static final String KEY_IS_OVERSEA = "is_oversea";
        public static final String KEY_LAST_CHECK = "last_check";
        public static final String KEY_LAST_DOWNLOAD_DECOUPLE_CORE = "last_download_decouple_core";
        public static final String KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION = "last_thirdapp_sendrequest_coreversion";
        public static final String KEY_NEEDDOWNLOAD = "tbs_needdownload";
        public static final String KEY_RESPONSECODE = "tbs_responsecode";
        public static final String KEY_RETRY_INTERVAL = "retry_interval";
        public static final String KEY_STOP_PRE_OAT = "tbs_stop_preoat";
        public static final String KEY_SWITCH_BACKUPCORE_ENABLE = "switch_backupcore_enable";
        public static final String KEY_TBSAPKFILESIZE = "tbs_apkfilesize";
        public static final String KEY_TBSAPK_MD5 = "tbs_apk_md5";
        public static final String KEY_TBSDOWNLOADURL = "tbs_downloadurl";
        public static final String KEY_TBSDOWNLOAD_FLOW = "tbs_downloadflow";
        public static final String KEY_TBSDOWNLOAD_STARTTIME = "tbs_downloadstarttime";
        public static final String KEY_TBS_DOWNLOAD_V = "tbs_download_version";
        public static final String KEY_TBS_DOWNLOAD_V_TYPE = "tbs_download_version_type";
        public static final String KEY_USE_BACKUP_VERSION = "use_backup_version";
        public static final String KEY_USE_BUGLY = "tbs_use_bugly";
    }

    private TbsDownloadConfig(Context context) {
        this.mPreferences = context.getSharedPreferences("tbs_download_config", 4);
        this.f6626c = context.getApplicationContext();
    }

    public static synchronized TbsDownloadConfig getInstance() {
        return f6624b;
    }

    public void clear() {
        try {
            this.f6625a.clear();
            SharedPreferences.Editor editorEdit = this.mPreferences.edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public synchronized void commit() {
        try {
            try {
                SharedPreferences.Editor editorEdit = this.mPreferences.edit();
                for (String str : this.f6625a.keySet()) {
                    Object obj = this.f6625a.get(str);
                    if (obj instanceof String) {
                        editorEdit.putString(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Long) {
                        editorEdit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        editorEdit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Float) {
                        editorEdit.putFloat(str, ((Float) obj).floatValue());
                    }
                }
                editorEdit.commit();
                this.f6625a.clear();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int getDownloadFailedMaxRetrytimes() {
        int i10;
        i10 = this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_FAILED_MAX_RETRYTIMES, 0);
        if (i10 == 0) {
            i10 = 100;
        }
        return i10;
    }

    public synchronized int getDownloadInterruptCode() {
        int i10;
        if (this.mPreferences.contains(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE)) {
            i10 = this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE, -99);
            if (i10 == -119 || i10 == -121) {
                i10 = this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE_REASON, -119);
            }
            if (System.currentTimeMillis() - this.mPreferences.getLong(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_TIME, 0L) > CalendarModelKt.MillisecondsIn24Hours) {
                i10 -= 98000;
            }
        } else {
            try {
                i10 = !new File(new File(this.f6626c.getFilesDir(), "shared_prefs"), "tbs_download_config").exists() ? -97 : !this.mPreferences.contains(TbsConfigKey.KEY_NEEDDOWNLOAD) ? -96 : TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
            } catch (Throwable unused) {
                i10 = -95;
            }
        }
        Context context = this.f6626c;
        if (context == null || !TbsConfig.APP_QQ.equals(context.getApplicationInfo().packageName) || "CN".equals(Locale.getDefault().getCountry())) {
            return (i10 * 1000) + this.mPreferences.getInt(TbsConfigKey.KEY_INSTALL_INTERRUPT_CODE, -1);
        }
        return -320;
    }

    public synchronized long getDownloadMaxflow() {
        int i10;
        i10 = this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_MAXFLOW, 0);
        if (i10 == 0) {
            i10 = 20;
        }
        return i10 * 1024 * 1024;
    }

    public synchronized long getDownloadMinFreeSpace() {
        return (this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_MIN_FREE_SPACE, 0) != 0 ? r0 : 0) * 1024 * 1024;
    }

    public synchronized long getDownloadSingleTimeout() {
        long j10;
        j10 = this.mPreferences.getLong(TbsConfigKey.KEY_DOWNLOAD_SINGLE_TIMEOUT, 0L);
        if (j10 == 0) {
            j10 = 1200000;
        }
        return j10;
    }

    public synchronized int getDownloadSuccessMaxRetrytimes() {
        int i10;
        i10 = this.mPreferences.getInt(TbsConfigKey.KEY_DOWNLOAD_SUCCESS_MAX_RETRYTIMES, 0);
        if (i10 == 0) {
            i10 = 3;
        }
        return i10;
    }

    public synchronized long getRetryInterval() {
        if (TbsDownloader.getRetryIntervalInSeconds() >= 0) {
            return TbsDownloader.getRetryIntervalInSeconds();
        }
        return this.mPreferences.getLong(TbsConfigKey.KEY_RETRY_INTERVAL, DEFAULT_RETRY_INTERVAL_SEC);
    }

    public synchronized boolean isOverSea() {
        return this.mPreferences.getBoolean(TbsConfigKey.KEY_IS_OVERSEA, false);
    }

    public synchronized void setDownloadInterruptCode(int i10) {
        try {
            SharedPreferences.Editor editorEdit = this.mPreferences.edit();
            editorEdit.putInt(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE, i10);
            editorEdit.putLong(TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_TIME, System.currentTimeMillis());
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public synchronized void setInstallInterruptCode(int i10) {
        SharedPreferences.Editor editorEdit = this.mPreferences.edit();
        editorEdit.putInt(TbsConfigKey.KEY_INSTALL_INTERRUPT_CODE, i10);
        editorEdit.commit();
    }

    public static synchronized TbsDownloadConfig getInstance(Context context) {
        try {
            if (f6624b == null) {
                f6624b = new TbsDownloadConfig(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6624b;
    }
}
