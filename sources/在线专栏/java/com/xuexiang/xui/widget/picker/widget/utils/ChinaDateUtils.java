package com.xuexiang.xui.widget.picker.widget.utils;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.taobao.accs.data.Message;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ChinaDateUtils {
    private static final long[] LUNAR_INFO = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};
    private static final String[] NUMBER_MONTH = {"", "正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊"};
    private static final String[] NUMBER_1 = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
    private static final String[] NUMBER_2 = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    private static final String[] ANIMALS = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 EEEEE");

    private ChinaDateUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String AnimalsYear(int i4) {
        return ANIMALS[(i4 - 4) % 12];
    }

    public static long[] calElement(int i4, int i5, int i6) {
        long j4;
        long j5;
        long[] jArr = new long[7];
        int i7 = LunarCalendarUtils.MIN_YEAR;
        long time = (new GregorianCalendar(i4, i5 - 1, i6).getTime().getTime() - new GregorianCalendar(LunarCalendarUtils.MIN_YEAR, 0, 31).getTime().getTime()) / 86400000;
        jArr[5] = 40 + time;
        jArr[4] = 14;
        int iMonthDays = 0;
        while (i7 < 2100 && time > 0) {
            iMonthDays = lYearDays(i7);
            time -= iMonthDays;
            jArr[4] = jArr[4] + 12;
            i7++;
        }
        if (time < 0) {
            time += iMonthDays;
            i7--;
            jArr[4] = jArr[4] - 12;
        }
        jArr[0] = i7;
        jArr[3] = i7 - 1864;
        int iLeapMonth = leapMonth(i7);
        jArr[6] = 0;
        int i8 = 1;
        while (i8 < 13 && time > 0) {
            if (iLeapMonth > 0 && i8 == iLeapMonth + 1 && jArr[6] == 0) {
                i8--;
                jArr[6] = 1;
                j5 = time;
                iMonthDays = leapDays((int) jArr[0]);
            } else {
                j5 = time;
                iMonthDays = monthDays((int) jArr[0], i8);
            }
            if (jArr[6] == 1 && i8 == iLeapMonth + 1) {
                jArr[6] = 0;
            }
            time = j5 - iMonthDays;
            if (jArr[6] == 0) {
                jArr[4] = jArr[4] + 1;
            }
            i8++;
        }
        long j6 = time;
        if (j6 == 0 && iLeapMonth > 0 && i8 == iLeapMonth + 1) {
            if (jArr[6] == 1) {
                jArr[6] = 0;
            } else {
                jArr[6] = 1;
                i8--;
                jArr[4] = jArr[4] - 1;
            }
        }
        if (j6 < 0) {
            j4 = j6 + iMonthDays;
            i8--;
            jArr[4] = jArr[4] - 1;
        } else {
            j4 = j6;
        }
        jArr[1] = i8;
        jArr[2] = j4 + 1;
        return jArr;
    }

    public static String cyclical(int i4) {
        return cyclicalm((i4 - 1900) + 36);
    }

    private static String cyclicalm(int i4) {
        return NUMBER_1[i4 % 10] + NUMBER_2[i4 % 12];
    }

    public static String getChinaDate(int i4) {
        if (i4 == 10) {
            return "初十";
        }
        if (i4 == 20) {
            return "二十";
        }
        if (i4 == 30) {
            return "三十";
        }
        int i5 = i4 / 10;
        String str = i5 == 0 ? "初" : "";
        if (i5 == 1) {
            str = "十";
        }
        if (i5 == 2) {
            str = "廿";
        }
        if (i5 == 3) {
            str = "三";
        }
        switch (i4 % 10) {
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

    public static String getCurrentLunarDate() {
        Calendar calendar = Calendar.getInstance(Locale.SIMPLIFIED_CHINESE);
        int i4 = calendar.get(1);
        long[] jArrCalElement = calElement(i4, calendar.get(2) + 1, calendar.get(5));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sdf.format(calendar.getTime()));
        stringBuffer.append(" 农历");
        stringBuffer.append(cyclical(i4));
        stringBuffer.append('(');
        stringBuffer.append(AnimalsYear(i4));
        stringBuffer.append(")年");
        stringBuffer.append(NUMBER_MONTH[(int) jArrCalElement[1]]);
        stringBuffer.append("月");
        stringBuffer.append(getChinaDate((int) jArrCalElement[2]));
        return stringBuffer.toString();
    }

    public static ArrayList<String> getLunarDays(int i4) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i5 = 1; i5 <= i4; i5++) {
            arrayList.add(getChinaDate(i5));
        }
        return arrayList;
    }

    public static String getLunarYearText(int i4) {
        StringBuilder sb = new StringBuilder();
        int i5 = i4 - 4;
        sb.append(NUMBER_1[i5 % 10]);
        sb.append(NUMBER_2[i5 % 12]);
        sb.append("年");
        return sb.toString();
    }

    public static ArrayList<String> getMonths(int i4) {
        String[] strArr;
        ArrayList<String> arrayList = new ArrayList<>();
        int i5 = 1;
        while (true) {
            strArr = NUMBER_MONTH;
            if (i5 >= strArr.length) {
                break;
            }
            arrayList.add(strArr[i5] + "月");
            i5++;
        }
        if (leapMonth(i4) != 0) {
            arrayList.add(leapMonth(i4), "闰" + strArr[leapMonth(i4)] + "月");
        }
        return arrayList;
    }

    public static ArrayList<String> getYears(int i4, int i5) {
        ArrayList<String> arrayList = new ArrayList<>();
        while (i4 < i5) {
            arrayList.add(String.format("%s(%d)", getLunarYearText(i4), Integer.valueOf(i4)));
            i4++;
        }
        return arrayList;
    }

    private static int lYearDays(int i4) {
        int i5 = 348;
        for (int i6 = Message.FLAG_DATA_TYPE; i6 > 8; i6 >>= 1) {
            if ((LUNAR_INFO[i4 - 1900] & i6) != 0) {
                i5++;
            }
        }
        return i5 + leapDays(i4);
    }

    public static int leapDays(int i4) {
        if (leapMonth(i4) != 0) {
            return (LUNAR_INFO[i4 + (-1900)] & PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) != 0 ? 30 : 29;
        }
        return 0;
    }

    public static int leapMonth(int i4) {
        return (int) (LUNAR_INFO[i4 - 1900] & 15);
    }

    public static int monthDays(int i4, int i5) {
        return (((long) (ArrayPool.STANDARD_BUFFER_SIZE_BYTES >> i5)) & LUNAR_INFO[i4 + (-1900)]) == 0 ? 29 : 30;
    }

    public static String oneDay(int i4, int i5, int i6) {
        long[] jArrCalElement = calElement(i4, i5, i6);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 农历");
        stringBuffer.append(cyclical(i4));
        stringBuffer.append('(');
        stringBuffer.append(AnimalsYear(i4));
        stringBuffer.append(")年");
        stringBuffer.append(NUMBER_MONTH[(int) jArrCalElement[1]]);
        stringBuffer.append("月");
        stringBuffer.append(getChinaDate((int) jArrCalElement[2]));
        return stringBuffer.toString();
    }
}
