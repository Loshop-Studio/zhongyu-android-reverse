package com.xuexiang.xui.widget.picker.widget;

import android.graphics.Typeface;
import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener;
import com.xuexiang.xui.widget.picker.widget.adapter.ArrayWheelAdapter;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectChangeListener;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.List;

/* loaded from: classes.dex */
public class WheelOptions<T> implements HasTypeface {
    private int dividerColor;
    private WheelView.DividerType dividerType;
    private boolean isRestoreItem;
    private float lineSpacingMultiplier;
    private boolean linkage = true;
    private List<T> mOptions1Items;
    private List<List<T>> mOptions2Items;
    private List<List<List<T>>> mOptions3Items;
    private OnOptionsSelectChangeListener optionsSelectChangeListener;
    private int textColorCenter;
    private int textColorOut;
    private View view;
    private OnItemSelectedListener wheelListenerOption2;
    private WheelView wvOption1;
    private WheelView wvOption2;
    private WheelView wvOption3;

    public WheelOptions(View view, boolean z3) {
        this.isRestoreItem = z3;
        this.view = view;
        this.wvOption1 = (WheelView) view.findViewById(C2042R.id.options1);
        this.wvOption2 = (WheelView) view.findViewById(C2042R.id.options2);
        this.wvOption3 = (WheelView) view.findViewById(C2042R.id.options3);
    }

    private void itemSelected(int i4, int i5, int i6) {
        if (this.mOptions1Items != null) {
            this.wvOption1.setCurrentItem(i4);
        }
        List<List<T>> list = this.mOptions2Items;
        if (list != null) {
            this.wvOption2.setAdapter(new ArrayWheelAdapter(list.get(i4)));
            this.wvOption2.setCurrentItem(i5);
        }
        List<List<List<T>>> list2 = this.mOptions3Items;
        if (list2 != null) {
            this.wvOption3.setAdapter(new ArrayWheelAdapter(list2.get(i4).get(i5)));
            this.wvOption3.setCurrentItem(i6);
        }
    }

    private void setDividerColor() {
        this.wvOption1.setDividerColor(this.dividerColor);
        this.wvOption2.setDividerColor(this.dividerColor);
        this.wvOption3.setDividerColor(this.dividerColor);
    }

    private void setDividerType() {
        this.wvOption1.setDividerType(this.dividerType);
        this.wvOption2.setDividerType(this.dividerType);
        this.wvOption3.setDividerType(this.dividerType);
    }

    private void setLineSpacingMultiplier() {
        this.wvOption1.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wvOption2.setLineSpacingMultiplier(this.lineSpacingMultiplier);
        this.wvOption3.setLineSpacingMultiplier(this.lineSpacingMultiplier);
    }

    private void setTextColorCenter() {
        this.wvOption1.setTextColorCenter(this.textColorCenter);
        this.wvOption2.setTextColorCenter(this.textColorCenter);
        this.wvOption3.setTextColorCenter(this.textColorCenter);
    }

    private void setTextColorOut() {
        this.wvOption1.setTextColorOut(this.textColorOut);
        this.wvOption2.setTextColorOut(this.textColorOut);
        this.wvOption3.setTextColorOut(this.textColorOut);
    }

    public int[] getCurrentItems() {
        int[] iArr = new int[3];
        iArr[0] = this.wvOption1.getCurrentItem();
        List<List<T>> list = this.mOptions2Items;
        if (list == null || list.size() <= 0) {
            iArr[1] = this.wvOption2.getCurrentItem();
        } else {
            iArr[1] = this.wvOption2.getCurrentItem() > this.mOptions2Items.get(iArr[0]).size() - 1 ? 0 : this.wvOption2.getCurrentItem();
        }
        List<List<List<T>>> list2 = this.mOptions3Items;
        if (list2 == null || list2.size() <= 0) {
            iArr[2] = this.wvOption3.getCurrentItem();
        } else {
            iArr[2] = this.wvOption3.getCurrentItem() <= this.mOptions3Items.get(iArr[0]).get(iArr[1]).size() - 1 ? this.wvOption3.getCurrentItem() : 0;
        }
        return iArr;
    }

    public View getView() {
        return this.view;
    }

    public void isCenterLabel(boolean z3) {
        this.wvOption1.isCenterLabel(z3);
        this.wvOption2.isCenterLabel(z3);
        this.wvOption3.isCenterLabel(z3);
    }

    public void setCurrentItems(int i4, int i5, int i6) {
        if (this.linkage) {
            itemSelected(i4, i5, i6);
            return;
        }
        this.wvOption1.setCurrentItem(i4);
        this.wvOption2.setCurrentItem(i5);
        this.wvOption3.setCurrentItem(i6);
    }

    public void setCyclic(boolean z3) {
        this.wvOption1.setCyclic(z3);
        this.wvOption2.setCyclic(z3);
        this.wvOption3.setCyclic(z3);
    }

    public void setLabels(String str, String str2, String str3) {
        if (str != null) {
            this.wvOption1.setLabel(str);
        }
        if (str2 != null) {
            this.wvOption2.setLabel(str2);
        }
        if (str3 != null) {
            this.wvOption3.setLabel(str3);
        }
    }

    public void setLinkage(boolean z3) {
        this.linkage = z3;
    }

    public void setNPicker(List<T> list, List<T> list2, List<T> list3) {
        this.wvOption1.setAdapter(new ArrayWheelAdapter(list));
        this.wvOption1.setCurrentItem(0);
        if (list2 != null) {
            this.wvOption2.setAdapter(new ArrayWheelAdapter(list2));
        }
        WheelView wheelView = this.wvOption2;
        wheelView.setCurrentItem(wheelView.getCurrentItem());
        if (list3 != null) {
            this.wvOption3.setAdapter(new ArrayWheelAdapter(list3));
        }
        WheelView wheelView2 = this.wvOption3;
        wheelView2.setCurrentItem(wheelView2.getCurrentItem());
        this.wvOption1.setIsOptions(true);
        this.wvOption2.setIsOptions(true);
        this.wvOption3.setIsOptions(true);
        if (this.optionsSelectChangeListener != null) {
            this.wvOption1.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.4
                @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
                public void onItemSelected(int i4) {
                    WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(i4, WheelOptions.this.wvOption2.getCurrentItem(), WheelOptions.this.wvOption3.getCurrentItem());
                }
            });
        }
        if (list2 == null) {
            this.wvOption2.setVisibility(8);
        } else {
            this.wvOption2.setVisibility(0);
            if (this.optionsSelectChangeListener != null) {
                this.wvOption2.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.5
                    @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
                    public void onItemSelected(int i4) {
                        WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), i4, WheelOptions.this.wvOption3.getCurrentItem());
                    }
                });
            }
        }
        if (list3 == null) {
            this.wvOption3.setVisibility(8);
            return;
        }
        this.wvOption3.setVisibility(0);
        if (this.optionsSelectChangeListener != null) {
            this.wvOption3.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.6
                @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
                public void onItemSelected(int i4) {
                    WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), WheelOptions.this.wvOption2.getCurrentItem(), i4);
                }
            });
        }
    }

    public void setOptionsSelectChangeListener(OnOptionsSelectChangeListener onOptionsSelectChangeListener) {
        this.optionsSelectChangeListener = onOptionsSelectChangeListener;
    }

    public void setPicker(List<T> list, List<List<T>> list2, List<List<List<T>>> list3) {
        this.mOptions1Items = list;
        this.mOptions2Items = list2;
        this.mOptions3Items = list3;
        this.wvOption1.setAdapter(new ArrayWheelAdapter(list));
        this.wvOption1.setCurrentItem(0);
        List<List<T>> list4 = this.mOptions2Items;
        if (list4 != null) {
            this.wvOption2.setAdapter(new ArrayWheelAdapter(list4.get(0)));
        }
        WheelView wheelView = this.wvOption2;
        wheelView.setCurrentItem(wheelView.getCurrentItem());
        List<List<List<T>>> list5 = this.mOptions3Items;
        if (list5 != null) {
            this.wvOption3.setAdapter(new ArrayWheelAdapter(list5.get(0).get(0)));
        }
        WheelView wheelView2 = this.wvOption3;
        wheelView2.setCurrentItem(wheelView2.getCurrentItem());
        this.wvOption1.setIsOptions(true);
        this.wvOption2.setIsOptions(true);
        this.wvOption3.setIsOptions(true);
        if (this.mOptions2Items == null) {
            this.wvOption2.setVisibility(8);
        } else {
            this.wvOption2.setVisibility(0);
        }
        if (this.mOptions3Items == null) {
            this.wvOption3.setVisibility(8);
        } else {
            this.wvOption3.setVisibility(0);
        }
        OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.1
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i4) {
                if (WheelOptions.this.mOptions2Items == null) {
                    if (WheelOptions.this.optionsSelectChangeListener != null) {
                        WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), 0, 0);
                    }
                } else {
                    if (i4 >= WheelOptions.this.mOptions2Items.size()) {
                        return;
                    }
                    int iMin = !WheelOptions.this.isRestoreItem ? Math.min(WheelOptions.this.wvOption2.getCurrentItem(), ((List) WheelOptions.this.mOptions2Items.get(i4)).size() - 1) : 0;
                    WheelOptions.this.wvOption2.setAdapter(new ArrayWheelAdapter((List) WheelOptions.this.mOptions2Items.get(i4)));
                    WheelOptions.this.wvOption2.setCurrentItem(iMin);
                    if (WheelOptions.this.mOptions3Items != null) {
                        WheelOptions.this.wheelListenerOption2.onItemSelected(iMin);
                    } else if (WheelOptions.this.optionsSelectChangeListener != null) {
                        WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(i4, iMin, 0);
                    }
                }
            }
        };
        this.wheelListenerOption2 = new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.2
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i4) {
                if (WheelOptions.this.mOptions3Items == null) {
                    if (WheelOptions.this.optionsSelectChangeListener != null) {
                        WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), i4, 0);
                        return;
                    }
                    return;
                }
                int currentItem = WheelOptions.this.wvOption1.getCurrentItem();
                if (currentItem >= WheelOptions.this.mOptions2Items.size()) {
                    return;
                }
                int iMin = Math.min(currentItem, WheelOptions.this.mOptions3Items.size() - 1);
                int iMin2 = Math.min(i4, ((List) WheelOptions.this.mOptions2Items.get(iMin)).size() - 1);
                int iMin3 = WheelOptions.this.isRestoreItem ? 0 : Math.min(WheelOptions.this.wvOption3.getCurrentItem(), ((List) ((List) WheelOptions.this.mOptions3Items.get(iMin)).get(iMin2)).size() - 1);
                WheelOptions.this.wvOption3.setAdapter(new ArrayWheelAdapter((List) ((List) WheelOptions.this.mOptions3Items.get(WheelOptions.this.wvOption1.getCurrentItem())).get(iMin2)));
                WheelOptions.this.wvOption3.setCurrentItem(iMin3);
                if (WheelOptions.this.optionsSelectChangeListener != null) {
                    WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), iMin2, iMin3);
                }
            }
        };
        if (list != null && this.linkage) {
            this.wvOption1.setOnItemSelectedListener(onItemSelectedListener);
        }
        if (list2 != null && this.linkage) {
            this.wvOption2.setOnItemSelectedListener(this.wheelListenerOption2);
        }
        if (list3 == null || !this.linkage || this.optionsSelectChangeListener == null) {
            return;
        }
        this.wvOption3.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.xuexiang.xui.widget.picker.widget.WheelOptions.3
            @Override // com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener
            public void onItemSelected(int i4) {
                WheelOptions.this.optionsSelectChangeListener.onOptionsSelectChanged(WheelOptions.this.wvOption1.getCurrentItem(), WheelOptions.this.wvOption2.getCurrentItem(), i4);
            }
        });
    }

    public void setTextContentSize(int i4) {
        float f4 = i4;
        this.wvOption1.setTextSize(f4);
        this.wvOption2.setTextSize(f4);
        this.wvOption3.setTextSize(f4);
    }

    public void setTextXOffset(int i4, int i5, int i6) {
        this.wvOption1.setTextXOffset(i4);
        this.wvOption2.setTextXOffset(i5);
        this.wvOption3.setTextXOffset(i6);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        WheelView wheelView = this.wvOption1;
        if (wheelView != null) {
            wheelView.setTypeface(typeface);
        }
        WheelView wheelView2 = this.wvOption2;
        if (wheelView2 != null) {
            wheelView2.setTypeface(typeface);
        }
        WheelView wheelView3 = this.wvOption3;
        if (wheelView3 != null) {
            wheelView3.setTypeface(typeface);
        }
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setCyclic(boolean z3, boolean z4, boolean z5) {
        this.wvOption1.setCyclic(z3);
        this.wvOption2.setCyclic(z4);
        this.wvOption3.setCyclic(z5);
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
