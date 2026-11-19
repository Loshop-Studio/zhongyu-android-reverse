package com.tencent.liteav.audio;

/* loaded from: classes4.dex */
public interface TXAudioEffectManager {

    public static class AudioMusicParam {

        /* renamed from: id */
        public int f5086id;
        public String path;
        public int loopCount = 0;
        public boolean publish = false;
        public boolean isShortFile = false;
        public long startTimeMS = 0;
        public long endTimeMS = -1;

        public AudioMusicParam(int i10, String str) {
            this.path = str;
            this.f5086id = i10;
        }
    }

    public interface TXMusicPlayObserver {
        void onComplete(int i10, int i11);

        void onPlayProgress(int i10, long j10, long j11);

        void onStart(int i10, int i11);
    }

    public enum TXVoiceChangerType {
        TXLiveVoiceChangerType_0(0),
        TXLiveVoiceChangerType_1(1),
        TXLiveVoiceChangerType_2(2),
        TXLiveVoiceChangerType_3(3),
        TXLiveVoiceChangerType_4(4),
        TXLiveVoiceChangerType_5(5),
        TXLiveVoiceChangerType_6(6),
        TXLiveVoiceChangerType_7(7),
        TXLiveVoiceChangerType_8(8),
        TXLiveVoiceChangerType_9(9),
        TXLiveVoiceChangerType_10(10),
        TXLiveVoiceChangerType_11(11);

        private int nativeValue;

        TXVoiceChangerType(int i10) {
            this.nativeValue = i10;
        }

        public int getNativeValue() {
            return this.nativeValue;
        }
    }

    public enum TXVoiceReverbType {
        TXLiveVoiceReverbType_0(0),
        TXLiveVoiceReverbType_1(1),
        TXLiveVoiceReverbType_2(2),
        TXLiveVoiceReverbType_3(3),
        TXLiveVoiceReverbType_4(4),
        TXLiveVoiceReverbType_5(5),
        TXLiveVoiceReverbType_6(6),
        TXLiveVoiceReverbType_7(7);

        private int nativeValue;

        TXVoiceReverbType(int i10) {
            this.nativeValue = i10;
        }

        public int getNativeValue() {
            return this.nativeValue;
        }
    }

    void enableVoiceEarMonitor(boolean z10);

    long getMusicCurrentPosInMS(int i10);

    long getMusicDurationInMS(String str);

    void pausePlayMusic(int i10);

    void resumePlayMusic(int i10);

    void seekMusicToPosInMS(int i10, int i11);

    void setAllMusicVolume(int i10);

    void setMusicObserver(int i10, TXMusicPlayObserver tXMusicPlayObserver);

    void setMusicPitch(int i10, float f10);

    void setMusicPlayoutVolume(int i10, int i11);

    void setMusicPublishVolume(int i10, int i11);

    void setMusicSpeedRate(int i10, float f10);

    void setVoiceCaptureVolume(int i10);

    void setVoiceChangerType(TXVoiceChangerType tXVoiceChangerType);

    void setVoiceEarMonitorVolume(int i10);

    void setVoiceReverbType(TXVoiceReverbType tXVoiceReverbType);

    boolean startPlayMusic(AudioMusicParam audioMusicParam);

    void stopPlayMusic(int i10);
}
