package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioManager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.impl.C6552a;
import com.tencent.liteav.audio.impl.InterfaceC6553b;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.p047b.InterfaceC6558a;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.structs.C6585a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class TXCAudioEngine implements InterfaceC6553b {
    private static final int EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE = 10056;
    private static final int EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE = 10055;
    private static final String TAG = "AudioEngine :TXCAudioEngine_java";
    static TXCAudioEngine sInstance = new TXCAudioEngine();
    protected static Context mContext = null;
    private static boolean has_trae = false;
    private static WeakReference<InterfaceC6544d> mAudioCoreDataListener = null;
    protected static final HashMap<String, WeakReference<InterfaceC6544d>> mJitterDataListenerMap = new HashMap<>();
    private static final Object mJitterDataListenerMapLock = new Object();
    protected static final HashMap<String, WeakReference<InterfaceC6543c>> mJitterEventListenerMap = new HashMap<>();
    private static final Object mJitterEventListenerMapLock = new Object();
    private static volatile boolean has_init = false;
    private final ArrayList<WeakReference<InterfaceC6558a>> mCallbackList = new ArrayList<>();
    protected boolean mDeviceIsRecording = false;
    protected boolean mIsCustomRecord = false;
    protected boolean mIsCallComed = false;

    private TXCAudioEngine() {
    }

    public static synchronized void CreateInstance(Context context, String str) {
        CreateInstanceWithoutInitDevice(context, str);
        TXCAudioEngineJNI.nativeInitAudioDevice();
    }

    public static synchronized void CreateInstanceWithoutInitDevice(Context context, String str) {
        TXCLog.m4994i(TAG, "CreateInstance: ");
        mContext = context.getApplicationContext();
        if (has_init) {
            TXCLog.m4994i(TAG, "CreateInstance already created~ ");
            return;
        }
        if (TXCAudioEngineJNI.nativeCheckTraeEngine(context)) {
            has_trae = true;
        }
        TXCAudioEngineJNI.nativeUseSysAudioDevice(!has_trae);
        if (has_trae) {
            TXCAudioEngineJNI.InitTraeEngineLibrary(context);
            TXCAudioEngineJNI.nativeSetTRAEConfig(str);
            TXCAudioEngineJNI.nativeInitBeforeEngineCreate(context);
            C6552a.m4758a().m4762a(context.getApplicationContext());
            C6552a.m4758a().m4763a(sInstance);
            TXCAudioEngineJNI.nativeNewAudioSessionDuplicate(mContext);
        } else {
            TXCMultAudioTrackPlayer.getInstance();
            TXCAudioSysRecord.getInstance();
        }
        has_init = true;
    }

    public static String buildTRAEConfig(Context context, Boolean bool, boolean z10, long j10) {
        String string = ((("sharp {\n") + "  os android\n") + "  trae {\n") + "    dev {\n";
        if (bool != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("  closeOpensl ");
            sb.append(bool.booleanValue() ? "n" : "y");
            sb.append(SignParameters.NEW_LINE);
            string = sb.toString();
        }
        boolean z11 = System.currentTimeMillis() - C6541a.m4727a().m4731b("timestamp_rollback_to_stable_samplerate", 0L) < j10;
        TXCLog.m4995i(TAG, "low latency samplerate, enable: %b, isBlocked: %b, blockTime: %d", Boolean.valueOf(z10), Boolean.valueOf(z11), Long.valueOf(j10));
        if (!z11 && z10 && getLowLatencySampleRate(context) == 48000) {
            string = ((((((string + "  component 1\n") + "  cap {\n") + "    hw_sr 48000\n") + "  }\n") + "  play {\n") + "    hw_sr 48000\n") + "  }";
        }
        return ((string + "    }\n") + "  }\n") + "}";
    }

    public static void enableAudioEarMonitoring(boolean z10) {
        TXCLog.m4994i(TAG, "enableAudioEarMonitoring: " + z10);
        TXCAudioEngineJNI.nativeEnableAudioEarMonitoring(z10);
    }

    public static boolean enableAudioVolumeEvaluation(boolean z10, int i10) {
        TXCLog.m4994i(TAG, "enableAudioVolumeEvaluation : " + z10 + "interval:" + i10);
        TXCAudioEngineJNI.nativeEnableAudioVolumeEvaluation(z10, i10);
        return true;
    }

    public static TXCAudioEngine getInstance() {
        return sInstance;
    }

    private static int getLowLatencySampleRate(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        try {
            return Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (NumberFormatException e10) {
            TXCLog.m4992e(TAG, "can't parse low latency samplerate", e10);
            return -1;
        }
    }

    public static int getMixingPlayoutVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetMixingPlayoutVolumeLevel();
    }

    private void handleAudioEvent(String str, int i10, String str2, String str3) {
        if (i10 == EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE) {
            C6541a.m4727a().m4730a("timestamp_rollback_to_stable_samplerate", System.currentTimeMillis());
        } else if (i10 == EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE) {
            C6541a.m4727a().m4730a("timestamp_rollback_to_stable_samplerate", 0L);
            TXCLog.m4994i(TAG, "audio device restart when using stable samplerate");
        }
    }

    public static boolean hasTrae() {
        return has_trae;
    }

    public static void onAudioJitterBufferNotify(String str, int i10, String str2) {
        InterfaceC6543c interfaceC6543c;
        synchronized (mJitterEventListenerMapLock) {
            try {
                HashMap<String, WeakReference<InterfaceC6543c>> map = mJitterEventListenerMap;
                interfaceC6543c = map.get(str) != null ? map.get(str).get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6543c != null) {
            TXCLog.m4994i(TAG, "onAudioJitterBufferNotify  cur state " + i10);
            interfaceC6543c.mo4735a(str, i10, str2);
        }
    }

    public static void onAudioPlayPcmData(String str, byte[] bArr, long j10, int i10, int i11) {
        InterfaceC6544d interfaceC6544d;
        synchronized (mJitterDataListenerMapLock) {
            try {
                HashMap<String, WeakReference<InterfaceC6544d>> map = mJitterDataListenerMap;
                interfaceC6544d = map.get(str) != null ? map.get(str).get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6544d != null) {
            interfaceC6544d.mo4736a(str, bArr, j10, i10, i11);
        }
    }

    public static void onCorePlayPcmData(byte[] bArr, long j10, int i10, int i11) {
        InterfaceC6544d interfaceC6544d;
        WeakReference<InterfaceC6544d> weakReference = mAudioCoreDataListener;
        if (weakReference == null || (interfaceC6544d = weakReference.get()) == null) {
            return;
        }
        interfaceC6544d.mo4736a(null, bArr, j10, i10, i11);
    }

    public static void setAudioEarMonitoringVolume(int i10) {
        TXCLog.m4994i(TAG, "setAudioEarMonitoringVolume: " + i10);
        TXCAudioEngineJNI.nativeSetAudioEarMonitoringVolume(i10);
    }

    public static void setAudioRoute(int i10) {
        TXCLog.m4994i(TAG, "setAudioRoute: " + i10);
        TXCAudioEngineJNI.nativeSetAudioRoute(i10);
    }

    public static void setPlayoutDataListener(InterfaceC6544d interfaceC6544d) {
        mAudioCoreDataListener = new WeakReference<>(interfaceC6544d);
        TXCAudioEngineJNI.nativeSetPlayoutDataListener(interfaceC6544d != null);
    }

    public static void setSystemVolumeType(int i10) {
        TXCLog.m4994i(TAG, "setSystemVolumeType: " + i10);
        TXCAudioEngineJNI.nativeSetSystemVolumeType(i10);
    }

    public void EnableMixMode(boolean z10) {
        TXCAudioEngineJNI.nativeEnableMixMode(z10);
    }

    public void addEventCallback(WeakReference<InterfaceC6558a> weakReference) {
        if (weakReference == null) {
            return;
        }
        synchronized (this.mCallbackList) {
            this.mCallbackList.add(weakReference);
            TXCAudioEngineJNI.nativeSetEventCallbackEnabled(true);
        }
    }

    public void clean() {
        TXCAudioEngineJNI.nativeClean();
    }

    public void enableAutoRestartDevice(boolean z10) {
        TXCAudioEngineJNI.nativeEnableAutoRestartDevice(z10);
    }

    public boolean enableCaptureEOSMode(boolean z10) {
        TXCLog.m4994i(TAG, "enableEosMode " + z10);
        TXCAudioEngineJNI.nativeEnableCaptureEOSMode(z10);
        return true;
    }

    public void enableEncodedDataCallback(boolean z10) {
        TXCAudioEngineJNI.nativeEnableEncodedDataCallback(z10);
    }

    public void enableEncodedDataPackWithTRAEHeaderCallback(boolean z10) {
        TXCAudioEngineJNI.nativeEnableEncodedDataPackWithTRAEHeaderCallback(z10);
    }

    public void enableSoftAEC(boolean z10, int i10) {
        TXCLog.m4994i(TAG, "enableSoftAEC: enable = " + z10 + " level = " + i10);
        if (!z10) {
            i10 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAEC(i10);
    }

    public void enableSoftAGC(boolean z10, int i10) {
        TXCLog.m4994i(TAG, "enableSoftAGC: enable = " + z10 + " level = " + i10);
        if (!z10) {
            i10 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAGC(i10);
    }

    public void enableSoftANS(boolean z10, int i10) {
        TXCLog.m4994i(TAG, "enableSoftANS: enable = " + z10 + " level = " + i10);
        if (!z10) {
            i10 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftANS(i10);
    }

    public void forceCallbackMixedPlayAudioFrame(boolean z10) {
        TXCAudioEngineJNI.nativeForceCallbackMixedPlayAudioFrame(z10);
    }

    public int getAECType() {
        return 2;
    }

    public TXCAudioEncoderConfig getAudioEncoderConfig() {
        return TXCAudioEngineJNI.nativeGetEncoderConfig();
    }

    public int getEncoderChannels() {
        return TXCAudioEngineJNI.nativeGetEncoderChannels();
    }

    public int getEncoderSampleRate() {
        return TXCAudioEngineJNI.nativeGetEncoderSampleRate();
    }

    public int getPlayAECType() {
        return has_trae ? 2 : 0;
    }

    public int getPlayChannels() {
        return 2;
    }

    public int getPlaySampleRate() {
        return 48000;
    }

    public int getRemotePlayoutVolumeLevel(String str) {
        if (str == null) {
            return 0;
        }
        return TXCAudioEngineJNI.nativeGetRemotePlayoutVolumeLevel(str);
    }

    public int getSoftwareCaptureVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetSoftwareCaptureVolumeLevel();
    }

    public StatusBucket getStatus(int i10) {
        return TXCAudioEngineJNI.getStatus(i10);
    }

    public boolean isAudioDeviceCapturing() {
        boolean zNativeIsAudioDeviceCapturing = TXCAudioEngineJNI.nativeIsAudioDeviceCapturing();
        TXCLog.m4994i(TAG, "isRecording: " + zNativeIsAudioDeviceCapturing);
        return zNativeIsAudioDeviceCapturing;
    }

    public boolean isRemoteAudioPlaying(String str) {
        if (str == null) {
            return false;
        }
        return TXCAudioEngineJNI.nativeIsRemoteAudioPlaying(str);
    }

    public boolean muteLocalAudio(boolean z10) {
        TXCLog.m4994i(TAG, "setRecordMute: " + z10);
        TXCAudioEngineJNI.nativeMuteLocalAudio(z10);
        return true;
    }

    public void muteRemoteAudio(String str, boolean z10) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudio(str, z10);
    }

    public void muteRemoteAudioInSpeaker(String str, boolean z10) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudioInSpeaker(str, z10);
    }

    @Override // com.tencent.liteav.audio.impl.InterfaceC6553b
    public void onCallStateChanged(int i10) {
        if (i10 == 0) {
            TXCLog.m4994i(TAG, "TelephonyManager.CALL_STATE_IDLE!");
            if (this.mIsCallComed) {
                this.mIsCallComed = false;
                TXCAudioEngineJNI.resumeAudioCapture();
                TXAudioEffectManagerImpl.getInstance().recoverAllMusics();
                return;
            }
            return;
        }
        if (i10 == 1) {
            TXCLog.m4994i(TAG, "TelephonyManager.CALL_STATE_RINGING!");
        } else {
            if (i10 != 2) {
                return;
            }
            TXCLog.m4994i(TAG, "TelephonyManager.CALL_STATE_OFFHOOK!");
            TXCAudioEngineJNI.pauseAudioCapture(true);
            TXAudioEffectManagerImpl.getInstance().interruptAllMusics();
            this.mIsCallComed = true;
        }
    }

    public void onError(String str, int i10, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<InterfaceC6558a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    InterfaceC6558a interfaceC6558a = it.next().get();
                    if (interfaceC6558a != null) {
                        arrayList.add(interfaceC6558a);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC6558a) it2.next()).mo4787b(str, i10, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onEvent(String str, int i10, String str2, String str3) {
        handleAudioEvent(str, i10, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<InterfaceC6558a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    InterfaceC6558a interfaceC6558a = it.next().get();
                    if (interfaceC6558a != null) {
                        arrayList.add(interfaceC6558a);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC6558a) it2.next()).mo4786a(str, i10, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int pauseAudioCapture(boolean z10) {
        TXCLog.m4994i(TAG, "pauseAudioCapture: " + z10);
        TXCAudioEngineJNI.pauseAudioCapture(z10);
        return 0;
    }

    public void pauseLocalAudio() {
        TXCAudioEngineJNI.nativePauseLocalAudio();
    }

    public int resumeAudioCapture() {
        TXCLog.m4994i(TAG, "resumeRecord");
        TXCAudioEngineJNI.resumeAudioCapture();
        return 0;
    }

    public void resumeLocalAudio() {
        TXCAudioEngineJNI.nativeResumeLocalAudio();
    }

    public void sendCustomPCMData(byte[] bArr, int i10, int i11) {
        TXCAudioEngineJNI.sendCustomPCMData(bArr, i10, i11);
    }

    public boolean setAudioCaptureDataListener(InterfaceC6545e interfaceC6545e) {
        TXCLog.m4994i(TAG, "setRecordListener ");
        if (interfaceC6545e == null) {
            TXCAudioEngineJNI.setAudioCaptureDataListener(null);
            return true;
        }
        TXCAudioEngineJNI.setAudioCaptureDataListener(new WeakReference(interfaceC6545e));
        return true;
    }

    public void setAudioDumpingListener(TXCAudioEngineJNI.InterfaceC6551a interfaceC6551a) {
        TXCAudioEngineJNI.SetAudioDumpingListener(interfaceC6551a);
    }

    public boolean setAudioEncoderParam(int i10, int i11) {
        TXCAudioEngineJNI.nativeSetAudioEncoderParam(i10, i11);
        return true;
    }

    public void setAudioQuality(int i10, int i11) {
        TXCAudioEngineJNI.nativeSetAudioQuality(i10, i11);
    }

    public void setCaptureDataCallbackFormat(int i10, int i11, int i12) {
        TXCLog.m4994i(TAG, "setCaptureDataCallbackFormat: sampleRate-" + i10 + " channels-" + i11 + " length-" + i12);
        TXCAudioEngineJNI.nativeSetCaptureDataCallbackFormat(i10, i11, i12);
    }

    public void setEncoderChannels(int i10) {
        TXCAudioEngineJNI.nativeSetEncoderChannels(i10);
    }

    public boolean setEncoderFECPercent(float f10) {
        TXCAudioEngineJNI.nativeSetEncoderFECPercent(f10);
        return true;
    }

    public void setEncoderSampleRate(int i10) {
        TXCAudioEngineJNI.nativeSetEncoderSampleRate(i10);
    }

    public void setMaxSelectedPlayStreams(int i10) {
        TXCAudioEngineJNI.nativeSetMaxSelectedPlayStreams(i10);
    }

    public boolean setMixingPlayoutVolume(float f10) {
        TXCLog.m4994i(TAG, "setPlayoutVolume: " + f10);
        TXCAudioEngineJNI.nativeSetMixingPlayoutVolume(f10);
        return true;
    }

    public void setPlayoutDataCallbackFormat(int i10, int i11, int i12) {
        TXCLog.m4994i(TAG, "setPlayoutDataCallbackFormat: sampleRate-" + i10 + " channels-" + i11 + " length-" + i12);
        TXCAudioEngineJNI.nativeSetPlayoutDataCallbackFormat(i10, i11, i12);
    }

    public void setRemoteAudioCacheParams(String str, boolean z10, int i10, int i11, int i12) {
        TXCAudioEngineJNI.nativeSetRemoteAudioCacheParams(str, z10, i10, i11, i12);
    }

    public void setRemoteAudioStreamEventListener(String str, InterfaceC6543c interfaceC6543c) {
        if (str == null) {
            return;
        }
        synchronized (mJitterEventListenerMapLock) {
            mJitterEventListenerMap.put(str, new WeakReference<>(interfaceC6543c));
        }
    }

    public void setRemotePlayoutVolume(String str, int i10) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeSetRemotePlayoutVolume(str, i10);
    }

    public void setRemoteStreamDataCallbackFormat(String str, int i10, int i11, int i12) {
        TXCLog.m4994i(TAG, "setRemoteStreamDataCallbackFormat: id-" + str + " sampleRate-" + i10 + " channels-" + i11 + " length-" + i12);
        TXCAudioEngineJNI.nativeSetRemoteStreamDataCallbackFormat(str, i10, i11, i12);
    }

    public boolean setReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCLog.m4994i(TAG, "setReverbType: " + tXVoiceReverbType.getNativeValue());
        TXCAudioEngineJNI.nativeSetRecordReverb(tXVoiceReverbType.getNativeValue());
        return true;
    }

    public void setSetAudioEngineRemoteStreamDataListener(String str, InterfaceC6544d interfaceC6544d) {
        if (str == null) {
            return;
        }
        synchronized (mJitterDataListenerMapLock) {
            mJitterDataListenerMap.put(str, new WeakReference<>(interfaceC6544d));
        }
        TXCAudioEngineJNI.nativeSetAudioEngineRemoteStreamDataListener(str, interfaceC6544d != null);
    }

    public boolean setSoftwareCaptureVolume(float f10) {
        TXCLog.m4994i(TAG, "setRecordVolume: " + f10);
        TXCAudioEngineJNI.nativeSetSoftwareCaptureVolume(f10);
        return true;
    }

    public boolean setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCLog.m4994i(TAG, "setVoiceChangerType " + tXVoiceChangerType.getNativeValue());
        TXCAudioEngineJNI.nativeSetCaptureVoiceChanger(tXVoiceChangerType.getNativeValue());
        return true;
    }

    public int startLocalAudio(int i10, boolean z10) {
        TXCLog.m4994i(TAG, "startLocalAudio audioFormat:" + i10);
        Context context = mContext;
        if (context == null) {
            TXCLog.m4994i(TAG, "Please call CreateInstance fisrt!!!");
            return TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        }
        TXCAudioEngineJNI.InitTraeEngineLibrary(context);
        TXCAudioEngineJNI.nativeStartLocalAudio(i10, z10);
        this.mDeviceIsRecording = true;
        return 0;
    }

    public int startLocalAudioDumping(int i10, int i11, String str) {
        return TXCAudioEngineJNI.nativeStartLocalAudioDumping(i10, i11, str);
    }

    public void startRemoteAudio(String str, boolean z10) {
        TXCAudioEngineJNI.nativeStartRemoteAudio(sInstance, z10, str);
        TXCAudioEngineJNI.nativeSetRemoteAudioJitterCycle(str, C6573c.m4883a().m4908a("Audio", "LIVE_JitterCycle"));
        TXCAudioEngineJNI.nativeSetRemoteAudioBlockThreshold(str, C6573c.m4883a().m4908a("Audio", "LoadingThreshold"));
    }

    public int stopLocalAudio() {
        TXCLog.m4994i(TAG, "stopLocalAudio");
        TXCAudioEngineJNI.nativeStopLocalAudio();
        this.mDeviceIsRecording = false;
        return 0;
    }

    public void stopLocalAudioDumping() {
        TXCAudioEngineJNI.nativeStopLocalAudioDumping();
    }

    public void stopRemoteAudio(String str) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeStopRemoteAudio(str);
    }

    public void sendCustomPCMData(C6585a c6585a) {
        TXCAudioEngineJNI.sendCustomPCMData(c6585a);
    }
}
