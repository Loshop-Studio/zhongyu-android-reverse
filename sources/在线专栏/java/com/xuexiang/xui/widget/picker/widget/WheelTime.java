package com.xuexiang.xui.widget.picker.widget;

import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener;
import com.xuexiang.xui.widget.picker.widget.adapter.ArrayWheelAdapter;
import com.xuexiang.xui.widget.picker.widget.adapter.NumericWheelAdapter;
import com.xuexiang.xui.widget.picker.widget.listener.ISelectTimeCallback;
import com.xuexiang.xui.widget.picker.widget.utils.ChinaDateUtils;
import com.xuexiang.xui.widget.picker.widget.utils.LunarCalendarUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class WheelTime {
    private static final int DEFAULT_END_DAY = 31;
    private static final int DEFAULT_END_MONTH = 12;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_DAY = 1;
    private static final int DEFAULT_START_MONTH = 1;
    private static final int DEFAULT_START_YEAR = 1900;
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int currentYear;
    private int dividerColor;
    private WheelView.DividerType dividerType;
    private int gravity;
    private float lineSpacingMultiplier;
    private ISelectTimeCallback mSelectChangeCallback;
    private int textColorCenter;
    private int textColorOut;
    private int textSize;
    private boolean[] type;
    private View view;
    private WheelView wv_day;
    private WheelView wv_hours;
    private WheelView wv_minutes;
    private WheelView wv_month;
    private WheelView wv_seconds;
    private WheelView wv_year;
    private int startYear = 1900;
    private int endYear = DEFAULT_END_YEAR;
    private int startMonth = 1;
    private int endMonth = 12;
    private int startDay = 1;
    private int endDay = 31;
    private boolean isLunarCalendar = false;

    public WheelTime(View view, boolean[] zArr, int i4, int i5) {
        this.view = view;
        this.type = zArr;
        this.gravity = i4;
        this.textSize = i5;
        setView(view);
    }

    private String getLunarTime() {
        int currentItem;
        boolean z3;
        StringBuilder sb = new StringBuilder();
        int currentItem2 = this.wv_year.getCurrentItem() + this.startYear;
        if (ChinaDateUtils.leapMonth(currentItem2) == 0 || (this.wv_month.getCurrentItem() + 1) - ChinaDateUtils.leapMonth(currentItem2) <= 0) {
            int currentItem3 = this.wv_month.getCurrentItem();
            currentItem = currentItem3 + 1;
            z3 = false;
            int[] iArrLunarToSolar = LunarCalendarUtils.lunarToSolar(currentItem2, currentItem, this.wv_day.getCurrentItem() + 1, z3);
            sb.append(iArrLunarToSolar[0]);
            sb.append("-");
            sb.append(iArrLunarToSolar[1]);
            sb.append("-");
            sb.append(iArrLunarToSolar[2]);
            sb.append(" ");
            sb.append(this.wv_hours.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_minutes.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_seconds.getCurrentItem());
            return sb.toString();
        }
        if ((this.wv_month.getCurrentItem() + 1) - ChinaDateUtils.leapMonth(currentItem2) == 1) {
            currentItem = this.wv_month.getCurrentItem();
            z3 = true;
            int[] iArrLunarToSolar2 = LunarCalendarUtils.lunarToSolar(currentItem2, currentItem, this.wv_day.getCurrentItem() + 1, z3);
            sb.append(iArrLunarToSolar2[0]);
            sb.append("-");
            sb.append(iArrLunarToSolar2[1]);
            sb.append("-");
            sb.append(iArrLunarToSolar2[2]);
            sb.append(" ");
            sb.append(this.wv_hours.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_minutes.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_seconds.getCurrentItem());
            return sb.toString();
        }
        currentItem = this.wv_month.getCurrentItem();
        z3 = false;
        int[] iArrLunarToSolar22 = LunarCalendarUtils.lunarToSolar(currentItem2, currentItem, this.wv_day.getCurrentItem() + 1, z3);
        sb.append(iArrLunarToSolar22[0]);
        sb.append("-");
        sb.append(iArrLunarToSolar22[1]);
        sb.append("-");
        sb.append(iArrLunarToSolar22[2]);
        sb.append(" ");
        sb.append(this.wv_hours.getCurrentItem());
        sb.append(":");
        sb.append(this.wv_minutes.getCurrentItem());
        sb.append(":");
        sb.append(this.wv_seconds.getCurrentItem());
        return sb.toString();
    }

    private void setChangedListener(WheelView wheelView) {
        if (this.mSelectChangeCallback != null) {
            wheelView.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelTime.5
                @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
                public void onItemSelected(int i4) {
                    WheelTime.this.mSelectChangeCallback.onTimeSelectChanged();
                }
            });
        }
    }

    private void setContentTextSize() {
        this.wv_day.setTextSize(this.textSize);
        this.wv_month.setTextSize(this.textSize);
        this.wv_year.setTextSize(this.textSize);
        this.wv_hours.setTextSize(this.textSize);
        this.wv_minutes.setTextSize(this.textSize);
        this.wv_seconds.setTextSize(this.textSize);
    }

    private void setDividerColor() {
        this.wv_day.setDividerColor(this.dividerColor);
        this.wv_month.setDividerColor(this.dividerColor);
        this.wv_year.setDividerColor(this.dividerColor);
        this.wv_hours.setDividerColor(this.dividerColor);
        this.wv_minutes.setDividerColor(this.dividerColor);
        this.wv_seconds.setDividerColor(this.dividerColor);
    }

    private void setDividerType() {
        this.wv_day.setDividerType(this.dividerType);
        this.wv_month.setDividerType(this.dividerType);
        this.wv_year.setDividerType(this.dividerType);
        this.wv_hours.setDividerType(this.dividerType);
        this.wv_minutes.setDividerType(this.dividerType);
        this.wv_seconds.setDividerType(this.dividerType);
    }

    private void setLineSpacingMultiplier() {
        this.wv_day.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wv_month.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wv_year.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wv_hours.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wv_minutes.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wv_seconds.setLineSpacingMultiplier(this.lineSpacingMultiplier);
    }

    private void setLunar(int i4, int i5, int i6, boolean z3, int i7, int i8, int i9) {
        WheelView wheelView = (WheelView) this.view.findViewById(C2042R.id.year);
        this.wv_year = wheelView;
        wheelView.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getYears(this.startYear, this.endYear)));
        this.wv_year.setLabel("");
        this.wv_year.setCurrentItem(i4 - this.startYear);
        this.wv_year.setGravity(this.gravity);
        WheelView wheelView2 = (WheelView) this.view.findViewById(C2042R.id.month);
        this.wv_month = wheelView2;
        wheelView2.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getMonths(i4)));
        this.wv_month.setLabel("");
        int iLeapMonth = ChinaDateUtils.leapMonth(i4);
        if (iLeapMonth == 0 || (i5 <= iLeapMonth - 1 && !z3)) {
            this.wv_month.setCurrentItem(i5);
        } else {
            this.wv_month.setCurrentItem(i5 + 1);
        }
        this.wv_month.setGravity(this.gravity);
        this.wv_day = (WheelView) this.view.findViewById(C2042R.id.day);
        if (ChinaDateUtils.leapMonth(i4) == 0) {
            this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.monthDays(i4, i5))));
        } else {
            this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.leapDays(i4))));
        }
        this.wv_day.setLabel("");
        this.wv_day.setCurrentItem(i6 - 1);
        this.wv_day.setGravity(this.gravity);
        WheelView wheelView3 = (WheelView) this.view.findViewById(C2042R.id.hour);
        this.wv_hours = wheelView3;
        wheelView3.setAdapter(new NumericWheelAdapter(0, 23));
        this.wv_hours.setCurrentItem(i7);
        this.wv_hours.setGravity(this.gravity);
        WheelView wheelView4 = (WheelView) this.view.findViewById(C2042R.id.min);
        this.wv_minutes = wheelView4;
        wheelView4.setAdapter(new NumericWheelAdapter(0, 59));
        this.wv_minutes.setCurrentItem(i8);
        this.wv_minutes.setGravity(this.gravity);
        WheelView wheelView5 = (WheelView) this.view.findViewById(C2042R.id.second);
        this.wv_seconds = wheelView5;
        wheelView5.setAdapter(new NumericWheelAdapter(0, 59));
        this.wv_seconds.setCurrentItem(i8);
        this.wv_seconds.setGravity(this.gravity);
        this.wv_year.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelTime.1
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i10) {
                int iMonthDays;
                int i11 = i10 + WheelTime.this.startYear;
                WheelTime.this.wv_month.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getMonths(i11)));
                if (ChinaDateUtils.leapMonth(i11) == 0 || WheelTime.this.wv_month.getCurrentItem() <= ChinaDateUtils.leapMonth(i11) - 1) {
                    WheelTime.this.wv_month.setCurrentItem(WheelTime.this.wv_month.getCurrentItem());
                } else {
                    WheelTime.this.wv_month.setCurrentItem(WheelTime.this.wv_month.getCurrentItem() + 1);
                }
                if (ChinaDateUtils.leapMonth(i11) == 0 || WheelTime.this.wv_month.getCurrentItem() <= ChinaDateUtils.leapMonth(i11) - 1) {
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.monthDays(i11, WheelTime.this.wv_month.getCurrentItem() + 1))));
                    iMonthDays = ChinaDateUtils.monthDays(i11, WheelTime.this.wv_month.getCurrentItem() + 1);
                } else if (WheelTime.this.wv_month.getCurrentItem() == ChinaDateUtils.leapMonth(i11) + 1) {
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.leapDays(i11))));
                    iMonthDays = ChinaDateUtils.leapDays(i11);
                } else {
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.monthDays(i11, WheelTime.this.wv_month.getCurrentItem()))));
                    iMonthDays = ChinaDateUtils.monthDays(i11, WheelTime.this.wv_month.getCurrentItem());
                }
                int i12 = iMonthDays - 1;
                if (WheelTime.this.wv_day.getCurrentItem() > i12) {
                    WheelTime.this.wv_day.setCurrentItem(i12);
                }
                if (WheelTime.this.mSelectChangeCallback != null) {
                    WheelTime.this.mSelectChangeCallback.onTimeSelectChanged();
                }
            }
        });
        this.wv_month.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelTime.2
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i10) {
                int iMonthDays;
                int currentItem = WheelTime.this.wv_year.getCurrentItem() + WheelTime.this.startYear;
                if (ChinaDateUtils.leapMonth(currentItem) == 0 || i10 <= ChinaDateUtils.leapMonth(currentItem) - 1) {
                    int i11 = i10 + 1;
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.monthDays(currentItem, i11))));
                    iMonthDays = ChinaDateUtils.monthDays(currentItem, i11);
                } else if (WheelTime.this.wv_month.getCurrentItem() == ChinaDateUtils.leapMonth(currentItem) + 1) {
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.leapDays(currentItem))));
                    iMonthDays = ChinaDateUtils.leapDays(currentItem);
                } else {
                    WheelTime.this.wv_day.setAdapter(new ArrayWheelAdapter(ChinaDateUtils.getLunarDays(ChinaDateUtils.monthDays(currentItem, i10))));
                    iMonthDays = ChinaDateUtils.monthDays(currentItem, i10);
                }
                int i12 = iMonthDays - 1;
                if (WheelTime.this.wv_day.getCurrentItem() > i12) {
                    WheelTime.this.wv_day.setCurrentItem(i12);
                }
                if (WheelTime.this.mSelectChangeCallback != null) {
                    WheelTime.this.mSelectChangeCallback.onTimeSelectChanged();
                }
            }
        });
        setChangedListener(this.wv_day);
        setChangedListener(this.wv_hours);
        setChangedListener(this.wv_minutes);
        setChangedListener(this.wv_seconds);
        boolean[] zArr = this.type;
        if (zArr.length != 6) {
            throw new RuntimeException("type[] length is not 6");
        }
        this.wv_year.setVisibility(zArr[0] ? 0 : 8);
        this.wv_month.setVisibility(this.type[1] ? 0 : 8);
        this.wv_day.setVisibility(this.type[2] ? 0 : 8);
        this.wv_hours.setVisibility(this.type[3] ? 0 : 8);
        this.wv_minutes.setVisibility(this.type[4] ? 0 : 8);
        this.wv_seconds.setVisibility(this.type[5] ? 0 : 8);
        setContentTextSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReDay(int i4, int i5, int i6, int i7, List<String> list, List<String> list2) {
        int currentItem = this.wv_day.getCurrentItem();
        if (list.contains(String.valueOf(i5))) {
            if (i7 > 31) {
                i7 = 31;
            }
            this.wv_day.setAdapter(new NumericWheelAdapter(i6, i7));
        } else if (list2.contains(String.valueOf(i5))) {
            if (i7 > 30) {
                i7 = 30;
            }
            this.wv_day.setAdapter(new NumericWheelAdapter(i6, i7));
        } else if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
            if (i7 > 28) {
                i7 = 28;
            }
            this.wv_day.setAdapter(new NumericWheelAdapter(i6, i7));
        } else {
            if (i7 > 29) {
                i7 = 29;
            }
            this.wv_day.setAdapter(new NumericWheelAdapter(i6, i7));
        }
        if (currentItem > this.wv_day.getAdapter().getItemsCount() - 1) {
            this.wv_day.setCurrentItem(this.wv_day.getAdapter().getItemsCount() - 1);
        }
    }

    private void setSolar(int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        String[] strArr = {"1", MessageService.MSG_DB_NOTIFY_DISMISS, "5", "7", MessageService.MSG_ACCS_NOTIFY_CLICK, AgooConstants.ACK_REMOVE_PACKAGE, AgooConstants.ACK_PACK_NULL};
        String[] strArr2 = {MessageService.MSG_ACCS_READY_REPORT, "6", MessageService.MSG_ACCS_NOTIFY_DISMISS, AgooConstants.ACK_BODY_NULL};
        final List listAsList = Arrays.asList(strArr);
        final List listAsList2 = Arrays.asList(strArr2);
        this.currentYear = i4;
        WheelView wheelView = (WheelView) this.view.findViewById(C2042R.id.year);
        this.wv_year = wheelView;
        wheelView.setAdapter(new NumericWheelAdapter(this.startYear, this.endYear));
        this.wv_year.setCurrentItem(i4 - this.startYear);
        this.wv_year.setGravity(this.gravity);
        WheelView wheelView2 = (WheelView) this.view.findViewById(C2042R.id.month);
        this.wv_month = wheelView2;
        int i12 = this.startYear;
        int i13 = this.endYear;
        if (i12 == i13) {
            wheelView2.setAdapter(new NumericWheelAdapter(this.startMonth, this.endMonth));
            this.wv_month.setCurrentItem((i5 + 1) - this.startMonth);
        } else if (i4 == i12) {
            wheelView2.setAdapter(new NumericWheelAdapter(this.startMonth, 12));
            this.wv_month.setCurrentItem((i5 + 1) - this.startMonth);
        } else if (i4 == i13) {
            wheelView2.setAdapter(new NumericWheelAdapter(1, this.endMonth));
            this.wv_month.setCurrentItem(i5);
        } else {
            wheelView2.setAdapter(new NumericWheelAdapter(1, 12));
            this.wv_month.setCurrentItem(i5);
        }
        this.wv_month.setGravity(this.gravity);
        this.wv_day = (WheelView) this.view.findViewById(C2042R.id.day);
        int i14 = this.startYear;
        int i15 = this.endYear;
        if (i14 == i15 && this.startMonth == this.endMonth) {
            int i16 = i5 + 1;
            if (listAsList.contains(String.valueOf(i16))) {
                if (this.endDay > 31) {
                    this.endDay = 31;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, this.endDay));
            } else if (listAsList2.contains(String.valueOf(i16))) {
                if (this.endDay > 30) {
                    this.endDay = 30;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, this.endDay));
            } else if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
                if (this.endDay > 28) {
                    this.endDay = 28;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, this.endDay));
            } else {
                if (this.endDay > 29) {
                    this.endDay = 29;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, this.endDay));
            }
            this.wv_day.setCurrentItem(i6 - this.startDay);
        } else if (i4 == i14 && (i11 = i5 + 1) == this.startMonth) {
            if (listAsList.contains(String.valueOf(i11))) {
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, 31));
            } else if (listAsList2.contains(String.valueOf(i11))) {
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, 30));
            } else if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, 28));
            } else {
                this.wv_day.setAdapter(new NumericWheelAdapter(this.startDay, 29));
            }
            this.wv_day.setCurrentItem(i6 - this.startDay);
        } else if (i4 == i15 && (i10 = i5 + 1) == this.endMonth) {
            if (listAsList.contains(String.valueOf(i10))) {
                if (this.endDay > 31) {
                    this.endDay = 31;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(1, this.endDay));
            } else if (listAsList2.contains(String.valueOf(i10))) {
                if (this.endDay > 30) {
                    this.endDay = 30;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(1, this.endDay));
            } else if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
                if (this.endDay > 28) {
                    this.endDay = 28;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(1, this.endDay));
            } else {
                if (this.endDay > 29) {
                    this.endDay = 29;
                }
                this.wv_day.setAdapter(new NumericWheelAdapter(1, this.endDay));
            }
            this.wv_day.setCurrentItem(i6 - 1);
        } else {
            int i17 = i5 + 1;
            if (listAsList.contains(String.valueOf(i17))) {
                this.wv_day.setAdapter(new NumericWheelAdapter(1, 31));
            } else if (listAsList2.contains(String.valueOf(i17))) {
                this.wv_day.setAdapter(new NumericWheelAdapter(1, 30));
            } else if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
                this.wv_day.setAdapter(new NumericWheelAdapter(1, 28));
            } else {
                this.wv_day.setAdapter(new NumericWheelAdapter(1, 29));
            }
            this.wv_day.setCurrentItem(i6 - 1);
        }
        this.wv_day.setGravity(this.gravity);
        WheelView wheelView3 = (WheelView) this.view.findViewById(C2042R.id.hour);
        this.wv_hours = wheelView3;
        wheelView3.setAdapter(new NumericWheelAdapter(0, 23));
        this.wv_hours.setCurrentItem(i7);
        this.wv_hours.setGravity(this.gravity);
        WheelView wheelView4 = (WheelView) this.view.findViewById(C2042R.id.min);
        this.wv_minutes = wheelView4;
        wheelView4.setAdapter(new NumericWheelAdapter(0, 59));
        this.wv_minutes.setCurrentItem(i8);
        this.wv_minutes.setGravity(this.gravity);
        WheelView wheelView5 = (WheelView) this.view.findViewById(C2042R.id.second);
        this.wv_seconds = wheelView5;
        wheelView5.setAdapter(new NumericWheelAdapter(0, 59));
        this.wv_seconds.setCurrentItem(i9);
        this.wv_seconds.setGravity(this.gravity);
        this.wv_year.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelTime.3
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i18) {
                int i19 = i18 + WheelTime.this.startYear;
                WheelTime.this.currentYear = i19;
                int currentItem = WheelTime.this.wv_month.getCurrentItem();
                if (WheelTime.this.startYear == WheelTime.this.endYear) {
                    WheelTime.this.wv_month.setAdapter(new NumericWheelAdapter(WheelTime.this.startMonth, WheelTime.this.endMonth));
                    if (currentItem > WheelTime.this.wv_month.getAdapter().getItemsCount() - 1) {
                        currentItem = WheelTime.this.wv_month.getAdapter().getItemsCount() - 1;
                        WheelTime.this.wv_month.setCurrentItem(currentItem);
                    }
                    int i20 = currentItem + WheelTime.this.startMonth;
                    if (WheelTime.this.startMonth == WheelTime.this.endMonth) {
                        WheelTime wheelTime = WheelTime.this;
                        wheelTime.setReDay(i19, i20, wheelTime.startDay, WheelTime.this.endDay, listAsList, listAsList2);
                    } else if (i20 == WheelTime.this.startMonth) {
                        WheelTime wheelTime2 = WheelTime.this;
                        wheelTime2.setReDay(i19, i20, wheelTime2.startDay, 31, listAsList, listAsList2);
                    } else if (i20 == WheelTime.this.endMonth) {
                        WheelTime wheelTime3 = WheelTime.this;
                        wheelTime3.setReDay(i19, i20, 1, wheelTime3.endDay, listAsList, listAsList2);
                    } else {
                        WheelTime.this.setReDay(i19, i20, 1, 31, listAsList, listAsList2);
                    }
                } else if (i19 == WheelTime.this.startYear) {
                    WheelTime.this.wv_month.setAdapter(new NumericWheelAdapter(WheelTime.this.startMonth, 12));
                    if (currentItem > WheelTime.this.wv_month.getAdapter().getItemsCount() - 1) {
                        currentItem = WheelTime.this.wv_month.getAdapter().getItemsCount() - 1;
                        WheelTime.this.wv_month.setCurrentItem(currentItem);
                    }
                    int i21 = currentItem + WheelTime.this.startMonth;
                    if (i21 == WheelTime.this.startMonth) {
                        WheelTime wheelTime4 = WheelTime.this;
                        wheelTime4.setReDay(i19, i21, wheelTime4.startDay, 31, listAsList, listAsList2);
                    } else {
                        WheelTime.this.setReDay(i19, i21, 1, 31, listAsList, listAsList2);
                    }
                } else if (i19 == WheelTime.this.endYear) {
                    WheelTime.this.wv_month.setAdapter(new NumericWheelAdapter(1, WheelTime.this.endMonth));
                    if (currentItem > WheelTime.this.wv_month.getAdapter().getItemsCount() - 1) {
                        currentItem = WheelTime.this.wv_month.getAdapter().getItemsCount() - 1;
                        WheelTime.this.wv_month.setCurrentItem(currentItem);
                    }
                    int i22 = 1 + currentItem;
                    if (i22 == WheelTime.this.endMonth) {
                        WheelTime wheelTime5 = WheelTime.this;
                        wheelTime5.setReDay(i19, i22, 1, wheelTime5.endDay, listAsList, listAsList2);
                    } else {
                        WheelTime.this.setReDay(i19, i22, 1, 31, listAsList, listAsList2);
                    }
                } else {
                    WheelTime.this.wv_month.setAdapter(new NumericWheelAdapter(1, 12));
                    WheelTime wheelTime6 = WheelTime.this;
                    wheelTime6.setReDay(i19, 1 + wheelTime6.wv_month.getCurrentItem(), 1, 31, listAsList, listAsList2);
                }
                if (WheelTime.this.mSelectChangeCallback != null) {
                    WheelTime.this.mSelectChangeCallback.onTimeSelectChanged();
                }
            }
        });
        this.wv_month.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelTime.4
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i18) {
                int i19 = i18 + 1;
                if (WheelTime.this.startYear == WheelTime.this.endYear) {
                    int i20 = (i19 + WheelTime.this.startMonth) - 1;
                    if (WheelTime.this.startMonth == WheelTime.this.endMonth) {
                        WheelTime wheelTime = WheelTime.this;
                        wheelTime.setReDay(wheelTime.currentYear, i20, WheelTime.this.startDay, WheelTime.this.endDay, listAsList, listAsList2);
                    } else if (WheelTime.this.startMonth == i20) {
                        WheelTime wheelTime2 = WheelTime.this;
                        wheelTime2.setReDay(wheelTime2.currentYear, i20, WheelTime.this.startDay, 31, listAsList, listAsList2);
                    } else if (WheelTime.this.endMonth == i20) {
                        WheelTime wheelTime3 = WheelTime.this;
                        wheelTime3.setReDay(wheelTime3.currentYear, i20, 1, WheelTime.this.endDay, listAsList, listAsList2);
                    } else {
                        WheelTime wheelTime4 = WheelTime.this;
                        wheelTime4.setReDay(wheelTime4.currentYear, i20, 1, 31, listAsList, listAsList2);
                    }
                } else if (WheelTime.this.currentYear == WheelTime.this.startYear) {
                    int i21 = (i19 + WheelTime.this.startMonth) - 1;
                    if (i21 == WheelTime.this.startMonth) {
                        WheelTime wheelTime5 = WheelTime.this;
                        wheelTime5.setReDay(wheelTime5.currentYear, i21, WheelTime.this.startDay, 31, listAsList, listAsList2);
                    } else {
                        WheelTime wheelTime6 = WheelTime.this;
                        wheelTime6.setReDay(wheelTime6.currentYear, i21, 1, 31, listAsList, listAsList2);
                    }
                } else if (WheelTime.this.currentYear != WheelTime.this.endYear) {
                    WheelTime wheelTime7 = WheelTime.this;
                    wheelTime7.setReDay(wheelTime7.currentYear, i19, 1, 31, listAsList, listAsList2);
                } else if (i19 == WheelTime.this.endMonth) {
                    WheelTime wheelTime8 = WheelTime.this;
                    wheelTime8.setReDay(wheelTime8.currentYear, WheelTime.this.wv_month.getCurrentItem() + 1, 1, WheelTime.this.endDay, listAsList, listAsList2);
                } else {
                    WheelTime wheelTime9 = WheelTime.this;
                    wheelTime9.setReDay(wheelTime9.currentYear, WheelTime.this.wv_month.getCurrentItem() + 1, 1, 31, listAsList, listAsList2);
                }
                if (WheelTime.this.mSelectChangeCallback != null) {
                    WheelTime.this.mSelectChangeCallback.onTimeSelectChanged();
                }
            }
        });
        setChangedListener(this.wv_day);
        setChangedListener(this.wv_hours);
        setChangedListener(this.wv_minutes);
        setChangedListener(this.wv_seconds);
        boolean[] zArr = this.type;
        if (zArr.length != 6) {
            throw new IllegalArgumentException("type[] length is not 6");
        }
        this.wv_year.setVisibility(zArr[0] ? 0 : 8);
        this.wv_month.setVisibility(this.type[1] ? 0 : 8);
        this.wv_day.setVisibility(this.type[2] ? 0 : 8);
        this.wv_hours.setVisibility(this.type[3] ? 0 : 8);
        this.wv_minutes.setVisibility(this.type[4] ? 0 : 8);
        this.wv_seconds.setVisibility(this.type[5] ? 0 : 8);
        setContentTextSize();
    }

    private void setTextColorCenter() {
        this.wv_day.setTextColorCenter(this.textColorCenter);
        this.wv_month.setTextColorCenter(this.textColorCenter);
        this.wv_year.setTextColorCenter(this.textColorCenter);
        this.wv_hours.setTextColorCenter(this.textColorCenter);
        this.wv_minutes.setTextColorCenter(this.textColorCenter);
        this.wv_seconds.setTextColorCenter(this.textColorCenter);
    }

    private void setTextColorOut() {
        this.wv_day.setTextColorOut(this.textColorOut);
        this.wv_month.setTextColorOut(this.textColorOut);
        this.wv_year.setTextColorOut(this.textColorOut);
        this.wv_hours.setTextColorOut(this.textColorOut);
        this.wv_minutes.setTextColorOut(this.textColorOut);
        this.wv_seconds.setTextColorOut(this.textColorOut);
    }

    public int getEndYear() {
        return this.endYear;
    }

    public int getStartYear() {
        return this.startYear;
    }

    public String getTime() {
        if (this.isLunarCalendar) {
            return getLunarTime();
        }
        StringBuilder sb = new StringBuilder();
        if (this.currentYear == this.startYear) {
            int currentItem = this.wv_month.getCurrentItem();
            int i4 = this.startMonth;
            if (currentItem + i4 == i4) {
                sb.append(this.wv_year.getCurrentItem() + this.startYear);
                sb.append("-");
                sb.append(this.wv_month.getCurrentItem() + this.startMonth);
                sb.append("-");
                sb.append(this.wv_day.getCurrentItem() + this.startDay);
                sb.append(" ");
                sb.append(this.wv_hours.getCurrentItem());
                sb.append(":");
                sb.append(this.wv_minutes.getCurrentItem());
                sb.append(":");
                sb.append(this.wv_seconds.getCurrentItem());
            } else {
                sb.append(this.wv_year.getCurrentItem() + this.startYear);
                sb.append("-");
                sb.append(this.wv_month.getCurrentItem() + this.startMonth);
                sb.append("-");
                sb.append(this.wv_day.getCurrentItem() + 1);
                sb.append(" ");
                sb.append(this.wv_hours.getCurrentItem());
                sb.append(":");
                sb.append(this.wv_minutes.getCurrentItem());
                sb.append(":");
                sb.append(this.wv_seconds.getCurrentItem());
            }
        } else {
            sb.append(this.wv_year.getCurrentItem() + this.startYear);
            sb.append("-");
            sb.append(this.wv_month.getCurrentItem() + 1);
            sb.append("-");
            sb.append(this.wv_day.getCurrentItem() + 1);
            sb.append(" ");
            sb.append(this.wv_hours.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_minutes.getCurrentItem());
            sb.append(":");
            sb.append(this.wv_seconds.getCurrentItem());
        }
        return sb.toString();
    }

    public View getView() {
        return this.view;
    }

    public void isCenterLabel(boolean z3) {
        this.wv_day.isCenterLabel(z3);
        this.wv_month.isCenterLabel(z3);
        this.wv_year.isCenterLabel(z3);
        this.wv_hours.isCenterLabel(z3);
        this.wv_minutes.isCenterLabel(z3);
        this.wv_seconds.isCenterLabel(z3);
    }

    public boolean isLunarMode() {
        return this.isLunarCalendar;
    }

    public void setCyclic(boolean z3) {
        this.wv_year.setCyclic(z3);
        this.wv_month.setCyclic(z3);
        this.wv_day.setCyclic(z3);
        this.wv_hours.setCyclic(z3);
        this.wv_minutes.setCyclic(z3);
        this.wv_seconds.setCyclic(z3);
    }

    public void setEndYear(int i4) {
        this.endYear = i4;
    }

    public void setLabels(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.isLunarCalendar) {
            return;
        }
        if (str != null) {
            this.wv_year.setLabel(str);
        } else {
            this.wv_year.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_year));
        }
        if (str2 != null) {
            this.wv_month.setLabel(str2);
        } else {
            this.wv_month.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_month));
        }
        if (str3 != null) {
            this.wv_day.setLabel(str3);
        } else {
            this.wv_day.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_day));
        }
        if (str4 != null) {
            this.wv_hours.setLabel(str4);
        } else {
            this.wv_hours.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_hours));
        }
        if (str5 != null) {
            this.wv_minutes.setLabel(str5);
        } else {
            this.wv_minutes.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_minutes));
        }
        if (str6 != null) {
            this.wv_seconds.setLabel(str6);
        } else {
            this.wv_seconds.setLabel(this.view.getContext().getString(C2042R.string.xui_picker_view_seconds));
        }
    }

    public void setLunarMode(boolean z3) {
        this.isLunarCalendar = z3;
    }

    public void setPicker(int i4, int i5, int i6) {
        setPicker(i4, i5, i6, 0, 0, 0);
    }

    public void setRangDate(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i4 = calendar2.get(1);
            int i5 = calendar2.get(2) + 1;
            int i6 = calendar2.get(5);
            int i7 = this.startYear;
            if (i4 > i7) {
                this.endYear = i4;
                this.endMonth = i5;
                this.endDay = i6;
                return;
            } else {
                if (i4 == i7) {
                    int i8 = this.startMonth;
                    if (i5 > i8) {
                        this.endYear = i4;
                        this.endMonth = i5;
                        this.endDay = i6;
                        return;
                    } else {
                        if (i5 != i8 || i6 <= this.startDay) {
                            return;
                        }
                        this.endYear = i4;
                        this.endMonth = i5;
                        this.endDay = i6;
                        return;
                    }
                }
                return;
            }
        }
        if (calendar == null || calendar2 != null) {
            if (calendar == null || calendar2 == null) {
                return;
            }
            this.startYear = calendar.get(1);
            this.endYear = calendar2.get(1);
            this.startMonth = calendar.get(2) + 1;
            this.endMonth = calendar2.get(2) + 1;
            this.startDay = calendar.get(5);
            this.endDay = calendar2.get(5);
            return;
        }
        int i9 = calendar.get(1);
        int i10 = calendar.get(2) + 1;
        int i11 = calendar.get(5);
        int i12 = this.endYear;
        if (i9 < i12) {
            this.startMonth = i10;
            this.startDay = i11;
            this.startYear = i9;
        } else if (i9 == i12) {
            int i13 = this.endMonth;
            if (i10 < i13) {
                this.startMonth = i10;
                this.startDay = i11;
                this.startYear = i9;
            } else {
                if (i10 != i13 || i11 >= this.endDay) {
                    return;
                }
                this.startMonth = i10;
                this.startDay = i11;
                this.startYear = i9;
            }
        }
    }

    public void setSelectChangeCallback(ISelectTimeCallback iSelectTimeCallback) {
        this.mSelectChangeCallback = iSelectTimeCallback;
    }

    public void setStartYear(int i4) {
        this.startYear = i4;
    }

    public void setTextXOffset(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.wv_day.setTextXOffset(i4);
        this.wv_month.setTextXOffset(i5);
        this.wv_year.setTextXOffset(i6);
        this.wv_hours.setTextXOffset(i7);
        this.wv_minutes.setTextXOffset(i8);
        this.wv_seconds.setTextXOffset(i9);
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setPicker(int i4, int i5, int i6, int i7, int i8, int i9) {
        if (!this.isLunarCalendar) {
            setSolar(i4, i5, i6, i7, i8, i9);
        } else {
            int[] iArrSolarToLunar = LunarCalendarUtils.solarToLunar(i4, i5 + 1, i6);
            setLunar(iArrSolarToLunar[0], iArrSolarToLunar[1] - 1, iArrSolarToLunar[2], iArrSolarToLunar[3] == 1, i7, i8, i9);
        }
    }

    public void setDividerColor(int i4) {
        this.dividerColor = i4;
        setDividerColor();
    }

    public void setDividerType(WheelView.DividerType dividerType) {
        this.dividerType = dividerType;
        setDividerType();
    }

    public void setLineSpacingMultiplier(float f4) {
        this.lineSpacingMultiplier = f4;
        setLineSpacingMultiplier();
    }

    public void setTextColorCenter(int i4) {
        this.textColorCenter = i4;
        setTextColorCenter();
    }

    public void setTextColorOut(int i4) {
        this.textColorOut = i4;
        setTextColorOut();
    }
}
