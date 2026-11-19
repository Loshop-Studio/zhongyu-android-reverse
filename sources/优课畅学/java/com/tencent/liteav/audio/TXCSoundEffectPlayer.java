package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6590c;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class TXCSoundEffectPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final String TAG = "AudioCenter:TXCSoundEffectPlayer";
    private static WeakReference<InterfaceC6542b> mWeakSoundEffectListener;
    private List<Integer> mShortEffectorIDList = new ArrayList();

    /* renamed from: com.tencent.liteav.audio.TXCSoundEffectPlayer$a */
    public static class C6538a {

        /* renamed from: a */
        private static final TXCSoundEffectPlayer f5097a = new TXCSoundEffectPlayer();
    }

    static {
        C6592e.m5058f();
    }

    private String checkIfAssetsFile(String str) throws Throwable {
        long length;
        if (!TextUtils.isEmpty(str) && TXCCommonUtil.getAppContext() != null) {
            if (!str.startsWith("/assets/")) {
                return str;
            }
            String strSubstring = str.substring(8);
            try {
                try {
                    length = TXCCommonUtil.getAppContext().getAssets().openFd(strSubstring).getLength();
                } catch (Exception e10) {
                    TXCLog.m4991e(TAG, "playAudioEffect openFd error " + e10.toString());
                    length = 0;
                }
                String effectCachePath = getEffectCachePath();
                File file = new File(effectCachePath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.isFile()) {
                    file.delete();
                    file.mkdirs();
                }
                int iLastIndexOf = strSubstring.lastIndexOf(File.separatorChar);
                if (iLastIndexOf != -1) {
                    str = effectCachePath + File.separator + length + "_" + strSubstring.substring(iLastIndexOf + 1);
                } else {
                    str = effectCachePath + File.separator + length + "_" + strSubstring;
                }
                if (!C6590c.m5033a(str)) {
                    C6590c.m5026a(TXCCommonUtil.getAppContext(), strSubstring, str);
                }
            } catch (Exception e11) {
                TXCLog.m4991e(TAG, "playAudioEffect error " + e11.toString());
            }
        }
        return str;
    }

    private String getEffectCachePath() {
        if (TXCCommonUtil.getAppContext() == null) {
            return "";
        }
        return TXCCommonUtil.getAppContext().getCacheDir() + File.separator + "liteav_effect";
    }

    public static TXCSoundEffectPlayer getInstance() {
        return C6538a.f5097a;
    }

    public void clearCache() {
        if (TXCCommonUtil.getAppContext() == null) {
            return;
        }
        try {
            File file = new File(getEffectCachePath());
            if (file.exists() && file.isDirectory() && C6590c.m5024a(file) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e10) {
            TXCLog.m4998w(TAG, "clearCache error " + e10.toString());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i10, int i11) {
        TXCLog.m4994i(TAG, "onMusicPlayFinish -> effect id = " + i10);
        WeakReference<InterfaceC6542b> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().m4733a(i10);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i10, long j10, long j11) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i10, int i11) {
        TXCLog.m4994i(TAG, "onStart -> effect id = " + i10 + ", errCode = " + i11);
        WeakReference<InterfaceC6542b> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().m4734a(i10, i11);
    }

    public void pauseEffectWithId(int i10) {
        TXCLog.m4994i(TAG, "pauseEffectWithId -> effect id = " + i10);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(i10);
    }

    public boolean playEffectWithId(int i10, String str, boolean z10, int i11) {
        TXCLog.m4994i(TAG, "playEffectWithId -> effect id = " + i10 + ", path = " + str + ", loop = " + i11);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i10, checkIfAssetsFile(str));
        audioMusicParam.publish = z10;
        audioMusicParam.loopCount = i11;
        audioMusicParam.isShortFile = true;
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i10, this);
        this.mShortEffectorIDList.add(Integer.valueOf(i10));
        TXCLog.m4994i(TAG, "playEffectWithId ->effect id = " + i10 + ", startPlayMusic result = " + zStartPlayMusic);
        return zStartPlayMusic;
    }

    public void resumeEffectWithId(int i10) {
        TXCLog.m4994i(TAG, "resumeEffectWithId -> effect id = " + i10);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(i10);
    }

    public void setEffectsVolume(float f10) {
        TXCLog.m4994i(TAG, "setEffectsVolume -> volume = " + f10);
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(it.next().intValue(), (int) (100.0f * f10));
        }
    }

    public void setSoundEffectListener(InterfaceC6542b interfaceC6542b) {
        if (interfaceC6542b == null) {
            mWeakSoundEffectListener = null;
        } else {
            mWeakSoundEffectListener = new WeakReference<>(interfaceC6542b);
        }
    }

    public void setVolumeOfEffect(int i10, float f10) {
        TXCLog.m4994i(TAG, "setVolumeOfEffect -> effect id = " + i10 + ", volume = " + f10);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(i10, (int) (f10 * 100.0f));
    }

    public void stopAllEffect() {
        TXCLog.m4994i(TAG, "stopAllEffect -> start");
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(it.next().intValue());
        }
        this.mShortEffectorIDList.clear();
        TXCLog.m4994i(TAG, "stopAllEffect -> finish");
    }

    public void stopEffectWithId(int i10) {
        TXCLog.m4994i(TAG, "stopEffectWithId -> effect id = " + i10);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i10, null);
        TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(i10);
        int iIndexOf = this.mShortEffectorIDList.indexOf(Integer.valueOf(i10));
        if (iIndexOf >= 0) {
            this.mShortEffectorIDList.remove(iIndexOf);
        }
    }
}
