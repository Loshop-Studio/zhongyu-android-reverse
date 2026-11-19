package com.lljjcoder.style.citylist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.lljjcoder.style.citylist.bean.CityInfoBean;
import com.lljjcoder.style.citylist.sortlistview.CharacterParser;
import com.lljjcoder.style.citylist.sortlistview.PinyinComparator;
import com.lljjcoder.style.citylist.sortlistview.SideBar;
import com.lljjcoder.style.citylist.sortlistview.SortAdapter;
import com.lljjcoder.style.citylist.sortlistview.SortModel;
import com.lljjcoder.style.citylist.utils.CityListLoader;
import com.lljjcoder.style.citylist.widget.CleanableEditView;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p112n1.AbstractC7450b;

/* loaded from: classes3.dex */
public class CityListSelectActivity extends Activity {
    public static final int CITY_SELECT_RESULT_FRAG = 50;
    public static List<CityInfoBean> sCityInfoBeanList = new ArrayList();
    public SortAdapter adapter;
    private CharacterParser characterParser;
    ImageView imgBack;
    CleanableEditView mCityTextSearch;
    TextView mCurrentCity;
    TextView mCurrentCityTag;
    TextView mDialog;
    TextView mLocalCity;
    TextView mLocalCityTag;
    SideBar mSidrbar;
    private PinyinComparator pinyinComparator;
    ListView sortListView;
    private List<SortModel> sourceDateList;
    private List<CityInfoBean> cityListInfo = new ArrayList();
    private CityInfoBean cityInfoBean = new CityInfoBean();

    private List<SortModel> filledData(List<CityInfoBean> list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            CityInfoBean cityInfoBean = list.get(i6);
            if (cityInfoBean != null) {
                SortModel sortModel = new SortModel();
                String name = cityInfoBean.getName();
                if (!TextUtils.isEmpty(name) && name.length() > 0) {
                    String lowerCase = AbstractC7450b.m8503e(name.substring(0, 1), "").toLowerCase();
                    if (!TextUtils.isEmpty(lowerCase)) {
                        sortModel.setName(name);
                        String upperCase = lowerCase.substring(0, 1).toUpperCase();
                        if (upperCase.matches("[A-Z]")) {
                            sortModel.setSortLetters(upperCase.toUpperCase());
                        } else {
                            sortModel.setSortLetters("#");
                        }
                        arrayList.add(sortModel);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterData(String str) {
        List<SortModel> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            arrayList = this.sourceDateList;
        } else {
            arrayList.clear();
            for (SortModel sortModel : this.sourceDateList) {
                String name = sortModel.getName();
                if (name.contains(str) || this.characterParser.getSelling(name).startsWith(str)) {
                    arrayList.add(sortModel);
                }
            }
        }
        Collections.sort(arrayList, this.pinyinComparator);
        this.adapter.updateListView(arrayList);
    }

    private void initList() {
        this.sourceDateList = new ArrayList();
        SortAdapter sortAdapter = new SortAdapter(this, this.sourceDateList);
        this.adapter = sortAdapter;
        this.sortListView.setAdapter((ListAdapter) sortAdapter);
        this.characterParser = CharacterParser.getInstance();
        this.pinyinComparator = new PinyinComparator();
        this.mSidrbar.setTextView(this.mDialog);
        this.mSidrbar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() { // from class: com.lljjcoder.style.citylist.CityListSelectActivity.2
            @Override // com.lljjcoder.style.citylist.sortlistview.SideBar.OnTouchingLetterChangedListener
            public void onTouchingLetterChanged(String str) {
                int positionForSection = CityListSelectActivity.this.adapter.getPositionForSection(str.charAt(0));
                if (positionForSection != -1) {
                    CityListSelectActivity.this.sortListView.setSelection(positionForSection);
                }
            }
        });
        this.sortListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.lljjcoder.style.citylist.CityListSelectActivity.3
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
                String name = ((SortModel) CityListSelectActivity.this.adapter.getItem(i6)).getName();
                CityListSelectActivity cityListSelectActivity = CityListSelectActivity.this;
                cityListSelectActivity.cityInfoBean = CityInfoBean.findCity(cityListSelectActivity.cityListInfo, name);
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putParcelable("cityinfo", CityListSelectActivity.this.cityInfoBean);
                intent.putExtras(bundle);
                CityListSelectActivity.this.setResult(-1, intent);
                CityListSelectActivity.this.finish();
            }
        });
        this.mCityTextSearch.addTextChangedListener(new TextWatcher() { // from class: com.lljjcoder.style.citylist.CityListSelectActivity.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                CityListSelectActivity.this.filterData(charSequence.toString());
            }
        });
    }

    private void initView() {
        this.mCityTextSearch = (CleanableEditView) findViewById(C5752R.id.cityInputText);
        this.mCurrentCityTag = (TextView) findViewById(C5752R.id.currentCityTag);
        this.mCurrentCity = (TextView) findViewById(C5752R.id.currentCity);
        this.mLocalCityTag = (TextView) findViewById(C5752R.id.localCityTag);
        this.mLocalCity = (TextView) findViewById(C5752R.id.localCity);
        this.sortListView = (ListView) findViewById(C5752R.id.country_lvcountry);
        this.mDialog = (TextView) findViewById(C5752R.id.dialog);
        this.mSidrbar = (SideBar) findViewById(C5752R.id.sidrbar);
        ImageView imageView = (ImageView) findViewById(C5752R.id.imgBack);
        this.imgBack = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.lljjcoder.style.citylist.CityListSelectActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CityListSelectActivity.this.finish();
            }
        });
    }

    private void setCityData(List<CityInfoBean> list) {
        this.cityListInfo = list;
        if (list == null) {
            return;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr[i6] = list.get(i6).getName();
        }
        this.sourceDateList.addAll(filledData(list));
        Collections.sort(this.sourceDateList, this.pinyinComparator);
        this.adapter.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5752R.layout.activity_city_list_select);
        initView();
        initList();
        setCityData(CityListLoader.getInstance().getCityListData());
    }
}
