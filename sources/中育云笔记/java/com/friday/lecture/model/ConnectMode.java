package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.friday.common.entity.FileType;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class ConnectMode {
    public static final int $stable = 8;
    private final List<String> keyboardList;
    private final int passwordMaxSize;

    @StabilityInferred(parameters = 0)
    public static final class Code extends ConnectMode {
        public static final Code INSTANCE = new Code();
        public static final int $stable = 8;

        private Code() {
            super(4, AbstractC10978w.m24139q("1", "2", "3", "4", FileType.PDF, FileType.TXT, FileType.PICTURE, "8", "9", "0"), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Code);
        }

        public int hashCode() {
            return 1959999525;
        }

        public String toString() {
            return "Code";
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.friday.lecture.model.ConnectMode$IP */
    public static final class C6153IP extends ConnectMode {
        public static final C6153IP INSTANCE = new C6153IP();
        public static final int $stable = 8;

        private C6153IP() {
            super(6, AbstractC10978w.m24139q("1", "2", "3", "4", FileType.PDF, FileType.TXT, FileType.PICTURE, "8", "9", "0", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F"), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C6153IP);
        }

        public int hashCode() {
            return 976340287;
        }

        public String toString() {
            return "IP";
        }
    }

    public /* synthetic */ ConnectMode(int i10, List list, AbstractC9972n abstractC9972n) {
        this(i10, list);
    }

    public final List<String> getKeyboardList() {
        return this.keyboardList;
    }

    public final int getPasswordMaxSize() {
        return this.passwordMaxSize;
    }

    private ConnectMode(int i10, List<String> list) {
        this.passwordMaxSize = i10;
        this.keyboardList = list;
    }
}
