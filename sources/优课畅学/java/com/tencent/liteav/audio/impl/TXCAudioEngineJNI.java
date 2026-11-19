package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.liteav.audio.InterfaceC6545e;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.structs.C6585a;
import com.tencent.liteav.basic.util.C6592e;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class TXCAudioEngineJNI {
    private static final String TAG = "TXCAudioEngineJNI";
    private static WeakReference<InterfaceC6545e> mAudioCaptureDataListener;
    private static InterfaceC6551a mAudioDumpingListener;

    /* renamed from: com.tencent.liteav.audio.impl.TXCAudioEngineJNI$a */
    public interface InterfaceC6551a {
        /* renamed from: a */
        void m4755a();
    }

    static {
        C6592e.m5058f();
        nativeCacheClassForNative();
        mAudioDumpingListener = null;
        mAudioCaptureDataListener = null;
    }

    public static void InitTraeEngineLibrary(Context context) {
        if (context == null) {
            TXCLog.m4991e(TAG, "InitTraeEngineLibrary failed, context is null!");
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            String str2 = applicationInfo.dataDir + "/lib";
            String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
            String strM5059g = C6592e.m5059g();
            if (strM5059g == null) {
                strM5059g = "";
            }
            nativeAppendLibraryPath("add_libpath:" + str);
            nativeAppendLibraryPath("add_libpath:" + str2);
            nativeAppendLibraryPath("add_libpath:" + str3);
            nativeAppendLibraryPath("add_libpath:" + strM5059g);
        } catch (UnsatisfiedLinkError e10) {
            TXCLog.m4992e(TAG, "init trae engine library failed.", e10);
        }
    }

    public static void SetAudioDumpingListener(InterfaceC6551a interfaceC6551a) {
        mAudioDumpingListener = interfaceC6551a;
    }

    public static StatusBucket getStatus(int i10) {
        return nativeGetStatus(i10);
    }

    public static native void nativeAppendLibraryPath(String str);

    public static native void nativeCacheClassForNative();

    public static boolean nativeCheckTraeEngine(Context context) {
        if (context == null) {
            TXCLog.m4991e(TAG, "nativeCheckTraeEngine failed, context is null!");
            return false;
        }
        if (C6592e.m5044a("traeimp-rtmp")) {
            TXCLog.m4991e(TAG, "link traeimp-rtmp success !");
            return true;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str = applicationInfo.nativeLibraryDir;
        String str2 = applicationInfo.dataDir + "/lib";
        String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
        String strM5059g = C6592e.m5059g();
        if (strM5059g == null) {
            strM5059g = "";
        }
        if (!new File(str + "/libtraeimp-rtmp.so").exists()) {
            TXCLog.m4998w(TAG, "nativeCheckTraeEngine load so error " + str + "/libtraeimp-rtmp.so");
            if (!new File(str2 + "/libtraeimp-rtmp.so").exists()) {
                TXCLog.m4998w(TAG, "nativeCheckTraeEngine load so error " + str2 + "/libtraeimp-rtmp.so");
                if (!new File(str3 + "/libtraeimp-rtmp.so").exists()) {
                    TXCLog.m4998w(TAG, "nativeCheckTraeEngine load so error " + str3 + "/libtraeimp-rtmp.so");
                    if (!new File(strM5059g + "/libtraeimp-rtmp.so").exists()) {
                        TXCLog.m4998w(TAG, "nativeCheckTraeEngine load so error " + strM5059g + "/libtraeimp-rtmp.so");
                        TXCLog.m4991e(TAG, "nativeCheckTraeEngine failed, can not find trae libs !");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static native void nativeClean();

    public static native void nativeDeleteAudioSessionDuplicate();

    public static native void nativeEnableAudioEarMonitoring(boolean z10);

    public static native void nativeEnableAudioVolumeEvaluation(boolean z10, int i10);

    public static native void nativeEnableAutoRestartDevice(boolean z10);

    public static native void nativeEnableCaptureEOSMode(boolean z10);

    public static native void nativeEnableEncodedDataCallback(boolean z10);

    public static native void nativeEnableEncodedDataPackWithTRAEHeaderCallback(boolean z10);

    public static native void nativeEnableMixMode(boolean z10);

    public static native void nativeForceCallbackMixedPlayAudioFrame(boolean z10);

    public static native int nativeGetEncoderChannels();

    public static native TXCAudioEncoderConfig nativeGetEncoderConfig();

    public static native int nativeGetEncoderSampleRate();

    public static native int nativeGetMixingPlayoutVolumeLevel();

    public static native int nativeGetRemotePlayoutVolumeLevel(String str);

    public static native int nativeGetSoftwareCaptureVolumeLevel();

    public static native StatusBucket nativeGetStatus(int i10);

    public static native void nativeInitAudioDevice();

    public static native void nativeInitBeforeEngineCreate(Context context);

    public static native boolean nativeIsAudioDeviceCapturing();

    public static native boolean nativeIsAudioDevicePlaying();

    public static native boolean nativeIsRemoteAudioPlaying(String str);

    public static native void nativeMuteLocalAudio(boolean z10);

    public static native void nativeMuteRemoteAudio(String str, boolean z10);

    public static native void nativeMuteRemoteAudioInSpeaker(String str, boolean z10);

    public static native void nativeNewAudioSessionDuplicate(Context context);

    public static native void nativePauseAudioCapture(boolean z10);

    public static native void nativePauseLocalAudio();

    public static native void nativeResumeAudioCapture();

    public static native void nativeResumeLocalAudio();

    public static native void nativeSendCustomPCMData(byte[] bArr, int i10, long j10, int i11, int i12);

    public static native void nativeSetAudioEarMonitoringVolume(int i10);

    public static native void nativeSetAudioEncoderParam(int i10, int i11);

    public static native void nativeSetAudioEngineCaptureDataCallback(boolean z10);

    public static native void nativeSetAudioEngineCaptureRawDataCallback(boolean z10);

    public static native void nativeSetAudioEngineEncodedDataCallback(boolean z10);

    public static native void nativeSetAudioEngineRemoteStreamDataListener(String str, boolean z10);

    public static native void nativeSetAudioPlayoutTunnelEnabled(boolean z10);

    public static native void nativeSetAudioQuality(int i10, int i11);

    public static native void nativeSetAudioRoute(int i10);

    public static native void nativeSetCaptureDataCallbackFormat(int i10, int i11, int i12);

    public static native void nativeSetCaptureVoiceChanger(int i10);

    public static native void nativeSetEncoderChannels(int i10);

    public static native void nativeSetEncoderFECPercent(float f10);

    public static native void nativeSetEncoderSampleRate(int i10);

    public static native void nativeSetEventCallbackEnabled(boolean z10);

    public static native void nativeSetMaxSelectedPlayStreams(int i10);

    public static native void nativeSetMixingPlayoutVolume(float f10);

    public static native void nativeSetPlayoutDataCallbackFormat(int i10, int i11, int i12);

    public static native void nativeSetPlayoutDataListener(boolean z10);

    public static native void nativeSetPlayoutDevice(int i10);

    public static native void nativeSetRecordReverb(int i10);

    public static native void nativeSetRemoteAudioBlockThreshold(String str, long j10);

    public static native void nativeSetRemoteAudioCacheParams(String str, boolean z10, int i10, int i11, int i12);

    public static native void nativeSetRemoteAudioJitterCycle(String str, long j10);

    public static native void nativeSetRemotePlayoutVolume(String str, int i10);

    public static native void nativeSetRemoteStreamDataCallbackFormat(String str, int i10, int i11, int i12);

    public static native void nativeSetSoftAEC(int i10);

    public static native void nativeSetSoftAGC(int i10);

    public static native void nativeSetSoftANS(int i10);

    public static native void nativeSetSoftwareCaptureVolume(float f10);

    public static native void nativeSetSystemVolumeType(int i10);

    public static native void nativeSetTRAEConfig(String str);

    public static native void nativeStartLocalAudio(int i10, boolean z10);

    public static native int nativeStartLocalAudioDumping(int i10, int i11, String str);

    public static native String nativeStartRemoteAudio(TXCAudioEngine tXCAudioEngine, boolean z10, String str);

    public static native void nativeStopLocalAudio();

    public static native void nativeStopLocalAudioDumping();

    public static native void nativeStopRemoteAudio(String str);

    public static native void nativeUnInitEngine();

    public static native void nativeUseSysAudioDevice(boolean z10);

    public static void onError(String str, int i10, String str2, String str3) {
        TXCAudioEngine.getInstance().onError(str, i10, str2, str3);
    }

    public static void onEvent(String str, int i10, String str2, String str3) {
        TXCAudioEngine.getInstance().onEvent(str, i10, str2, str3);
    }

    public static void onLocalAudioWriteFail() {
        InterfaceC6551a interfaceC6551a = mAudioDumpingListener;
        if (interfaceC6551a != null) {
            interfaceC6551a.m4755a();
        }
    }

    public static void onRecordEncData(byte[] bArr, long j10, int i10, int i11) {
        WeakReference<InterfaceC6545e> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().mo4721b(bArr, j10, i10, i11, 16);
    }

    public static void onRecordError(int i10, String str) {
        TXCLog.m4991e(TAG, "onRecordError: " + i10 + ", " + str);
        WeakReference<InterfaceC6545e> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().mo4712a(i10, str);
    }

    public static void onRecordPcmData(byte[] bArr, long j10, int i10, int i11, int i12) {
        WeakReference<InterfaceC6545e> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().mo4718a(bArr, j10, i10, i11, i12);
    }

    public static void onRecordRawPcmData(byte[] bArr, long j10, int i10, int i11, int i12) {
        WeakReference<InterfaceC6545e> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().mo4719a(bArr, j10, i10, i11, i12, false);
    }

    public static void pauseAudioCapture(boolean z10) {
        nativePauseAudioCapture(z10);
    }

    public static void resumeAudioCapture() {
        nativeResumeAudioCapture();
    }

    public static void sendCustomPCMData(byte[] bArr, int i10, int i11) {
        nativeSendCustomPCMData(bArr, bArr.length, 0L, i10, i11);
    }

    public static void setAudioCaptureDataListener(WeakReference<InterfaceC6545e> weakReference) {
        mAudioCaptureDataListener = weakReference;
        nativeSetAudioEngineCaptureDataCallback(weakReference != null);
        nativeSetAudioEngineCaptureRawDataCallback(mAudioCaptureDataListener != null);
        nativeSetAudioEngineEncodedDataCallback(mAudioCaptureDataListener != null);
    }

    public static void sendCustomPCMData(C6585a c6585a) {
        byte[] bArr = c6585a.f5492f;
        nativeSendCustomPCMData(bArr, bArr.length, c6585a.f5491e, c6585a.f5487a, c6585a.f5488b);
    }
}
