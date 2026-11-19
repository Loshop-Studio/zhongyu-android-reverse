package com.zykj.paint.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class PcmToWav {
    private static void clearFiles(List<String> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            File file = new File(list.get(i9));
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static boolean makePCMFileToWAVFile(String str, String str2, boolean z9) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        int length = (int) file.length();
        WaveHeader waveHeader = new WaveHeader();
        waveHeader.fileLength = length + 36;
        waveHeader.FmtHdrLeth = 16;
        waveHeader.BitsPerSample = (short) 16;
        waveHeader.Channels = (short) 2;
        waveHeader.FormatTag = (short) 1;
        waveHeader.SamplesPerSec = 8000;
        short s9 = (short) ((2 * 16) / 8);
        waveHeader.BlockAlign = s9;
        waveHeader.AvgBytesPerSec = s9 * 8000;
        waveHeader.DataHdrLeth = length;
        try {
            byte[] header = waveHeader.getHeader();
            if (header.length != 44) {
                return false;
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                file2.delete();
            }
            try {
                byte[] bArr = new byte[4096];
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                bufferedOutputStream.write(header, 0, header.length);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                for (int i9 = bufferedInputStream.read(bArr); i9 != -1; i9 = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                if (z9) {
                    file.delete();
                }
                Log.i("PcmToWav", "makePCMFileToWAVFile  success!" + new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
                return true;
            } catch (FileNotFoundException e10) {
                Log.e("PcmToWav", e10.getMessage());
                return false;
            } catch (IOException e11) {
                Log.e("PcmToWav", e11.getMessage());
                return false;
            }
        } catch (IOException e12) {
            Log.e("PcmToWav", e12.getMessage());
            return false;
        }
    }

    public static boolean mergePCMFilesToWAVFile(List<String> list, String str, boolean z9) throws IOException {
        File[] fileArr = new File[list.size()];
        int size = list.size();
        int length = 0;
        for (int i9 = 0; i9 < size; i9++) {
            File file = new File(list.get(i9));
            fileArr[i9] = file;
            length = (int) (length + file.length());
        }
        byte[] bArrWavFileHeader = wavFileHeader(length - 44, length - 8, 16000L, 1, ((16 * 16000) * 1) / 8, (byte) 16);
        if (bArrWavFileHeader.length != 44) {
            return false;
        }
        File file2 = new File(str);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            byte[] bArr = new byte[4096];
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            bufferedOutputStream.write(bArrWavFileHeader, 0, bArrWavFileHeader.length);
            for (int i10 = 0; i10 < size; i10++) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileArr[i10]));
                for (int i11 = bufferedInputStream.read(bArr); i11 != -1; i11 = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr);
                }
                bufferedInputStream.close();
            }
            bufferedOutputStream.close();
            if (!z9) {
                clearFiles(list);
            }
            Log.i("PcmToWav", "mergePCMFilesToWAVFile  success!" + new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
            return true;
        } catch (FileNotFoundException e10) {
            Log.e("PcmToWav", e10.getMessage());
            return false;
        } catch (IOException e11) {
            Log.e("PcmToWav", e11.getMessage());
            return false;
        }
    }

    private static byte[] wavFileHeader(long j9, long j10, long j11, int i9, long j12, byte b10) {
        return new byte[]{82, 73, 70, 70, (byte) (j10 & 255), (byte) ((j10 >> 8) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i9, 0, (byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) (j12 & 255), (byte) ((j12 >> 8) & 255), (byte) ((j12 >> 16) & 255), (byte) ((j12 >> 24) & 255), (byte) (i9 * (b10 / 8)), 0, b10, 0, 100, 97, 116, 97, (byte) (j9 & 255), (byte) ((j9 >> 8) & 255), (byte) ((j9 >> 16) & 255), (byte) ((j9 >> 24) & 255)};
    }
}
