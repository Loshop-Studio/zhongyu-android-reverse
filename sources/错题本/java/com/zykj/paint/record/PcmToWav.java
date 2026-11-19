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

/* loaded from: classes3.dex */
public class PcmToWav {
    private static void clearFiles(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            File file = new File(list.get(i));
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static boolean makePCMFileToWAVFile(String str, String str2, boolean z8) throws IOException {
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
        short s8 = (short) ((2 * 16) / 8);
        waveHeader.BlockAlign = s8;
        waveHeader.AvgBytesPerSec = s8 * 8000;
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
                for (int i = bufferedInputStream.read(bArr); i != -1; i = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                if (z8) {
                    file.delete();
                }
                Log.i("PcmToWav", "makePCMFileToWAVFile  success!" + new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
                return true;
            } catch (FileNotFoundException e) {
                Log.e("PcmToWav", e.getMessage());
                return false;
            } catch (IOException e4) {
                Log.e("PcmToWav", e4.getMessage());
                return false;
            }
        } catch (IOException e8) {
            Log.e("PcmToWav", e8.getMessage());
            return false;
        }
    }

    public static boolean mergePCMFilesToWAVFile(List<String> list, String str, boolean z8) throws IOException {
        File[] fileArr = new File[list.size()];
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            File file = new File(list.get(i));
            fileArr[i] = file;
            length = (int) (file.length() + length);
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
            for (int i8 = 0; i8 < size; i8++) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileArr[i8]));
                for (int i9 = bufferedInputStream.read(bArr); i9 != -1; i9 = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr);
                }
                bufferedInputStream.close();
            }
            bufferedOutputStream.close();
            if (!z8) {
                clearFiles(list);
            }
            Log.i("PcmToWav", "mergePCMFilesToWAVFile  success!" + new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
            return true;
        } catch (FileNotFoundException e) {
            Log.e("PcmToWav", e.getMessage());
            return false;
        } catch (IOException e4) {
            Log.e("PcmToWav", e4.getMessage());
            return false;
        }
    }

    private static byte[] wavFileHeader(long j7, long j8, long j9, int i, long j10, byte b6) {
        return new byte[]{82, 73, 70, 70, (byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i, 0, (byte) (j9 & 255), (byte) ((j9 >> 8) & 255), (byte) ((j9 >> 16) & 255), (byte) ((j9 >> 24) & 255), (byte) (j10 & 255), (byte) ((j10 >> 8) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 24) & 255), (byte) ((b6 / 8) * i), 0, b6, 0, 100, 97, 116, 97, (byte) (j7 & 255), (byte) ((j7 >> 8) & 255), (byte) ((j7 >> 16) & 255), (byte) ((j7 >> 24) & 255)};
    }
}
