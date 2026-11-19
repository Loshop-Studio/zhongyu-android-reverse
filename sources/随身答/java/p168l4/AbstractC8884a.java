package p168l4;

import android.support.v4.media.session.PlaybackStateCompat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* renamed from: l4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8884a {

    /* renamed from: a */
    public static final long[] f14680a = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};

    /* renamed from: b */
    public static final String[] f14681b = {"", "正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊"};

    /* renamed from: c */
    public static final String[] f14682c = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* renamed from: d */
    public static final String[] f14683d = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* renamed from: e */
    public static final String[] f14684e = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};

    /* renamed from: f */
    public static SimpleDateFormat f14685f = new SimpleDateFormat("yyyy年M月d日 EEEEE");

    /* renamed from: a */
    public static String m13798a(int i9) {
        if (i9 == 10) {
            return "初十";
        }
        if (i9 == 20) {
            return "二十";
        }
        if (i9 == 30) {
            return "三十";
        }
        int i10 = i9 / 10;
        String str = i10 == 0 ? "初" : "";
        if (i10 == 1) {
            str = "十";
        }
        if (i10 == 2) {
            str = "廿";
        }
        if (i10 == 3) {
            str = "三";
        }
        switch (i9 % 10) {
            case 1:
                return str + "一";
            case 2:
                return str + "二";
            case 3:
                return str + "三";
            case 4:
                return str + "四";
            case 5:
                return str + "五";
            case 6:
                return str + "六";
            case 7:
                return str + "七";
            case 8:
                return str + "八";
            case 9:
                return str + "九";
            default:
                return str;
        }
    }

    /* renamed from: b */
    public static ArrayList m13799b(int i9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 <= i9; i10++) {
            arrayList.add(m13798a(i10));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m13800c(int i9) {
        StringBuilder sb = new StringBuilder();
        int i10 = i9 - 4;
        sb.append(f14682c[i10 % 10]);
        sb.append(f14683d[i10 % 12]);
        sb.append("年");
        return sb.toString();
    }

    /* renamed from: d */
    public static ArrayList m13801d(int i9) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            strArr = f14681b;
            if (i10 >= strArr.length) {
                break;
            }
            arrayList.add(strArr[i10] + "月");
            i10++;
        }
        if (m13804g(i9) != 0) {
            arrayList.add(m13804g(i9), "闰" + strArr[m13804g(i9)] + "月");
        }
        return arrayList;
    }

    /* renamed from: e */
    public static ArrayList m13802e(int i9, int i10) {
        ArrayList arrayList = new ArrayList();
        while (i9 < i10) {
            arrayList.add(String.format("%s(%d)", m13800c(i9), Integer.valueOf(i9)));
            i9++;
        }
        return arrayList;
    }

    /* renamed from: f */
    public static int m13803f(int i9) {
        if (m13804g(i9) != 0) {
            return (f14680a[i9 + (-1900)] & PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) != 0 ? 30 : 29;
        }
        return 0;
    }

    /* renamed from: g */
    public static int m13804g(int i9) {
        return (int) (f14680a[i9 - 1900] & 15);
    }

    /* renamed from: h */
    public static int m13805h(int i9, int i10) {
        return (((long) (65536 >> i10)) & f14680a[i9 + (-1900)]) == 0 ? 29 : 30;
    }
}
