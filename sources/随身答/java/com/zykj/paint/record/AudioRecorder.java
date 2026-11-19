package com.zykj.paint.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AudioRecorder {
    private static final int AUDIO_CHANNEL = 16;
    private static final int AUDIO_ENCODING = 2;
    private static final int AUDIO_INPUT = 1;
    private static final int AUDIO_SAMPLE_RATE = 16000;
    private static final String TAG = "AudioRecorder";
    private static AudioRecorder audioRecorder;
    private AudioRecord audioRecord;
    private int bufferSizeInBytes;
    private String fileName;
    private List<String> filesName;
    private String path;
    private Status status;

    public static class AudioRecordHolder {
        private static final AudioRecorder INSTANCE = new AudioRecorder();

        private AudioRecordHolder() {
        }
    }

    public enum Status {
        STATUS_NO_READY,
        STATUS_READY,
        STATUS_START,
        STATUS_PAUSE,
        STATUS_STOP
    }

    public static AudioRecorder getInstance() {
        return AudioRecordHolder.INSTANCE;
    }

    private void makePCMFile2Amr(final String str, String str2) throws MediaCodec.CryptoException, IOException {
        final AmrEncoder amrEncoder = new AmrEncoder(str2);
        new Thread() { // from class: com.zykj.paint.record.AudioRecorder.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws MediaCodec.CryptoException, IOException {
                amrEncoder.init(16000, AudioRecorder.this.audioRecord.getChannelCount() * 256000, AudioRecorder.this.audioRecord.getChannelCount());
                amrEncoder.encode(str);
            }
        }.run();
    }

    private void makePCMFileToWAVFile() {
        new Thread(new Runnable() { // from class: com.zykj.paint.record.AudioRecorder.5
            @Override // java.lang.Runnable
            public void run() {
                if (PcmToWav.makePCMFileToWAVFile(AudioFileUtils.getPcmFileAbsolutePath(AudioRecorder.this.fileName), AudioFileUtils.getWavFileAbsolutePath(AudioRecorder.this.path, AudioRecorder.this.fileName), true)) {
                    AudioRecorder.this.fileName = null;
                } else {
                    Log.e(AudioRecorder.TAG, "makePCMFileToWAVFile fail");
                    throw new IllegalStateException("makePCMFileToWAVFile fail");
                }
            }
        }).start();
    }

    private void mergePCMFilesToWAVFile(final List<String> list, final boolean z9) {
        new Thread(new Runnable() { // from class: com.zykj.paint.record.AudioRecorder.4
            @Override // java.lang.Runnable
            public void run() {
                if (PcmToWav.mergePCMFilesToWAVFile(list, AudioFileUtils.getWavFileAbsolutePath(AudioRecorder.this.path, AudioRecorder.this.fileName), z9)) {
                    Log.e(AudioRecorder.TAG, "录音合成成功");
                } else {
                    Log.e(AudioRecorder.TAG, "mergePCMFilesToWAVFile fail");
                    throw new IllegalStateException("mergePCMFilesToWAVFile fail");
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeDataTOFile(RecordStreamListener recordStreamListener) throws IOException {
        FileOutputStream fileOutputStream;
        int i9 = this.bufferSizeInBytes;
        byte[] bArr = new byte[i9];
        try {
            String str = this.fileName + "--" + System.currentTimeMillis();
            this.filesName.add(str);
            File file = new File(AudioFileUtils.getPcmFileAbsolutePath(str));
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e10) {
            Log.e(TAG, e10.getMessage());
            fileOutputStream = null;
        } catch (IllegalStateException e11) {
            Log.e(TAG, e11.getMessage());
            throw new IllegalStateException(e11.getMessage());
        }
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            if (-3 != this.audioRecord.read(bArr, 0, this.bufferSizeInBytes) && fileOutputStream != null) {
                try {
                    fileOutputStream.write(bArr);
                    if (recordStreamListener != null) {
                        recordStreamListener.recordOfByte(bArr, 0, i9);
                    }
                } catch (IOException e12) {
                    Log.e(TAG, e12.getMessage());
                }
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e13) {
                Log.e(TAG, e13.getMessage());
            }
        }
    }

    public void canel() {
        this.filesName.clear();
        this.fileName = null;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    public void clearTempRecord() {
        AudioFileUtils.clearPcmFiles();
    }

    public void createAudio(String str, int i9, int i10, int i11, int i12) {
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i10, i11, i12);
        this.audioRecord = new AudioRecord(i9, i10, i11, i12, this.bufferSizeInBytes);
        this.fileName = str;
    }

    public void createDefaultAudio(String str, String str2, String str3) {
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.audioRecord = new AudioRecord(1, 16000, 16, 2, this.bufferSizeInBytes);
        this.fileName = str3;
        this.path = str2;
        AudioFileUtils.setFilePath(str);
        this.status = Status.STATUS_READY;
    }

    public int getPcmFilesCount() {
        return this.filesName.size();
    }

    public Status getStatus() {
        return this.status;
    }

    public void pauseRecord() throws IllegalStateException {
        Log.e(TAG, "===pauseRecord===");
        if (this.status != Status.STATUS_START) {
            Log.e(TAG, "[已暂停]");
            return;
        }
        this.status = Status.STATUS_PAUSE;
        this.audioRecord.stop();
        preview();
    }

    public void preview() {
        Log.e(TAG, "===release===");
        try {
            if (this.filesName.size() > 0) {
                Log.e(TAG, "[fileName.size()]-->>>>" + this.filesName.size());
                ArrayList arrayList = new ArrayList();
                for (String str : this.filesName) {
                    Log.i(TAG, "[fileName]-->>>>" + str);
                    arrayList.add(AudioFileUtils.getPcmFileAbsolutePath(str));
                }
                mergePCMFilesToWAVFile(arrayList, true);
            }
            this.status = Status.STATUS_NO_READY;
        } catch (IllegalStateException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    public void release() {
        Log.e(TAG, "===release===");
        try {
            try {
                if (this.filesName.size() > 0) {
                    this.filesName.clear();
                }
            } catch (IllegalStateException e10) {
                throw new IllegalStateException(e10.getMessage());
            }
        } finally {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.release();
                this.audioRecord = null;
            }
            this.status = Status.STATUS_NO_READY;
        }
    }

    public void resume() throws IllegalStateException {
        if (this.audioRecord == null) {
            Log.e(TAG, "===resumeRecord===" + this.audioRecord);
            this.bufferSizeInBytes = AudioRecord.getMinBufferSize(16000, 16, 2);
            this.audioRecord = new AudioRecord(1, 16000, 16, 2, this.bufferSizeInBytes);
        }
        Log.e(TAG, "===resumeRecord===" + this.audioRecord.getState());
        this.audioRecord.startRecording();
        this.status = Status.STATUS_START;
        new Thread(new Runnable() { // from class: com.zykj.paint.record.AudioRecorder.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                AudioRecorder.this.writeDataTOFile(null);
            }
        }).start();
    }

    public void startRecord() throws IllegalStateException {
        this.filesName.clear();
        if (this.status != Status.STATUS_NO_READY) {
            TextUtils.isEmpty(this.fileName);
        }
        Log.e(TAG, "===startRecord===" + this.audioRecord.getState());
        this.audioRecord.startRecording();
        new Thread(new Runnable() { // from class: com.zykj.paint.record.AudioRecorder.2
            @Override // java.lang.Runnable
            public void run() throws IOException {
                AudioRecorder.this.writeDataTOFile(null);
            }
        }).start();
    }

    public void stopRecord() throws IllegalStateException {
        Log.e(TAG, "===stopRecord===");
        Status status = this.status;
        if (status != Status.STATUS_NO_READY && status != Status.STATUS_READY) {
            this.status = Status.STATUS_STOP;
            this.audioRecord.stop();
        }
        release();
    }

    private AudioRecorder() {
        this.bufferSizeInBytes = 0;
        this.status = Status.STATUS_NO_READY;
        this.filesName = new ArrayList();
    }
}
