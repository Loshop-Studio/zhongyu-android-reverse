package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p073d.C2443a;

/* loaded from: classes.dex */
public class BottomSheet extends Dialog {
    private static final int ANIMATION_DURATION = 200;
    private View mContentView;
    private boolean mIsAnimating;
    private OnBottomSheetShowListener mOnBottomSheetShowListener;

    public static class BottomGridSheetBuilder {
        public static final int FIRST_LINE = 0;
        public static final int SECOND_LINE = 1;
        private Context mContext;
        private BottomSheet mDialog;
        private OnSheetItemClickListener mOnSheetItemClickListener;
        private int mMiniItemWidth = -1;
        private Typeface mItemTextTypeFace = null;
        private Typeface mBottomButtonTypeFace = null;
        private boolean mIsShowButton = true;
        private CharSequence mButtonText = null;
        private View.OnClickListener mButtonClickListener = null;
        private SparseArray<View> mFirstLineViews = new SparseArray<>();
        private SparseArray<View> mSecondLineViews = new SparseArray<>();

        public interface OnSheetItemClickListener {
            void onClick(BottomSheet bottomSheet, BottomSheetItemView bottomSheetItemView);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface Style {
        }

        public BottomGridSheetBuilder(Context context) {
            this.mContext = context;
        }

        private void addViewsInSection(SparseArray<View> sparseArray, LinearLayout linearLayout, int i4) {
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                View view = sparseArray.get(i5);
                setItemWidth(view, i4);
                linearLayout.addView(view);
            }
        }

        private View buildViews() {
            LinearLayout linearLayout = (LinearLayout) View.inflate(this.mContext, getContentViewLayoutId(), null);
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(C2042R.id.bottom_sheet_first_linear_layout);
            LinearLayout linearLayout3 = (LinearLayout) linearLayout.findViewById(C2042R.id.bottom_sheet_second_linear_layout);
            ViewGroup viewGroup = (ViewGroup) linearLayout.findViewById(C2042R.id.bottom_sheet_button_container);
            TextView textView = (TextView) linearLayout.findViewById(C2042R.id.bottom_sheet_close_button);
            int iCalculateItemWidth = calculateItemWidth(Math.min(Utils.getScreenWidth(this.mContext), Utils.getScreenHeight(this.mContext)), Math.max(this.mFirstLineViews.size(), this.mSecondLineViews.size()), linearLayout2.getPaddingLeft(), linearLayout2.getPaddingRight());
            addViewsInSection(this.mFirstLineViews, linearLayout2, iCalculateItemWidth);
            addViewsInSection(this.mSecondLineViews, linearLayout3, iCalculateItemWidth);
            boolean z3 = this.mFirstLineViews.size() > 0;
            boolean z4 = this.mSecondLineViews.size() > 0;
            if (!z3) {
                linearLayout2.setVisibility(8);
            }
            if (!z4) {
                if (z3) {
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), 0);
                }
                linearLayout3.setVisibility(8);
            }
            if (viewGroup != null) {
                if (this.mIsShowButton) {
                    viewGroup.setVisibility(0);
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
                } else {
                    viewGroup.setVisibility(8);
                }
                Typeface typeface = this.mBottomButtonTypeFace;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                CharSequence charSequence = this.mButtonText;
                if (charSequence != null) {
                    textView.setText(charSequence);
                }
                View.OnClickListener onClickListener = this.mButtonClickListener;
                if (onClickListener != null) {
                    textView.setOnClickListener(onClickListener);
                } else {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.BottomGridSheetBuilder.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            BottomGridSheetBuilder.this.mDialog.dismiss();
                        }
                    });
                }
            }
            return linearLayout;
        }

        private int calculateItemWidth(int i4, int i5, int i6, int i7) {
            int i8;
            if (this.mMiniItemWidth == -1) {
                this.mMiniItemWidth = ThemeUtils.resolveDimension(this.mContext, C2042R.attr.xui_bottom_sheet_grid_item_mini_width);
            }
            int i9 = i4 - i6;
            int i10 = i9 - i7;
            int i11 = this.mMiniItemWidth;
            if (i5 >= 3 && (i8 = i10 - (i5 * i11)) > 0 && i8 < i11) {
                i11 = i10 / (i10 / i11);
            }
            return i5 * i11 > i10 ? (int) (i9 / ((i9 / i11) + 0.5f)) : i11;
        }

        private void setItemWidth(View view, int i4) {
            LinearLayout.LayoutParams layoutParams;
            if (view.getLayoutParams() != null) {
                layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = i4;
            } else {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, -2);
                view.setLayoutParams(layoutParams2);
                layoutParams = layoutParams2;
            }
            layoutParams.gravity = 48;
        }

        public BottomGridSheetBuilder addItem(int i4, CharSequence charSequence, int i5) {
            return addItem(i4, charSequence, charSequence, i5, 0);
        }

        public BottomSheet build() {
            this.mDialog = new BottomSheet(this.mContext);
            this.mDialog.setContentView(buildViews(), new ViewGroup.LayoutParams(-1, -2));
            return this.mDialog;
        }

        public BottomSheetItemView createItemView(Drawable drawable, CharSequence charSequence, Object obj, int i4) {
            BottomSheetItemView bottomSheetItemView = (BottomSheetItemView) LayoutInflater.from(this.mContext).inflate(getItemViewLayoutId(), (ViewGroup) null, false);
            TextView textView = (TextView) bottomSheetItemView.findViewById(C2042R.id.grid_item_title);
            Typeface typeface = this.mItemTextTypeFace;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            textView.setText(charSequence);
            bottomSheetItemView.setTag(obj);
            bottomSheetItemView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.BottomGridSheetBuilder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (BottomGridSheetBuilder.this.mOnSheetItemClickListener != null) {
                        BottomGridSheetBuilder.this.mOnSheetItemClickListener.onClick(BottomGridSheetBuilder.this.mDialog, (BottomSheetItemView) view);
                    }
                }
            });
            ((AppCompatImageView) bottomSheetItemView.findViewById(C2042R.id.grid_item_image)).setImageDrawable(drawable);
            if (i4 != 0) {
                ((ImageView) ((ViewStub) bottomSheetItemView.findViewById(C2042R.id.grid_item_subscript)).inflate()).setImageResource(i4);
            }
            return bottomSheetItemView;
        }

        protected int getContentViewLayoutId() {
            return C2042R.layout.xui_bottom_sheet_grid;
        }

        protected int getItemViewLayoutId() {
            return C2042R.layout.xui_bottom_sheet_grid_item;
        }

        public BottomGridSheetBuilder setBottomButtonTypeFace(Typeface typeface) {
            this.mBottomButtonTypeFace = typeface;
            return this;
        }

        public BottomGridSheetBuilder setButtonClickListener(View.OnClickListener onClickListener) {
            this.mButtonClickListener = onClickListener;
            return this;
        }

        public BottomGridSheetBuilder setButtonText(CharSequence charSequence) {
            this.mButtonText = charSequence;
            return this;
        }

        public BottomGridSheetBuilder setIsShowButton(boolean z3) {
            this.mIsShowButton = z3;
            return this;
        }

        public BottomGridSheetBuilder setItemTextTypeFace(Typeface typeface) {
            this.mItemTextTypeFace = typeface;
            return this;
        }

        public void setItemVisibility(Object obj, int i4) {
            View view = null;
            for (int i5 = 0; i5 < this.mFirstLineViews.size(); i5++) {
                View view2 = this.mFirstLineViews.get(i5);
                if (view2 != null && view2.getTag().equals(obj)) {
                    view = view2;
                }
            }
            for (int i6 = 0; i6 < this.mSecondLineViews.size(); i6++) {
                View view3 = this.mSecondLineViews.get(i6);
                if (view3 != null && view3.getTag().equals(obj)) {
                    view = view3;
                }
            }
            if (view != null) {
                view.setVisibility(i4);
            }
        }

        public BottomGridSheetBuilder setOnSheetItemClickListener(OnSheetItemClickListener onSheetItemClickListener) {
            this.mOnSheetItemClickListener = onSheetItemClickListener;
            return this;
        }

        public BottomGridSheetBuilder addItem(int i4, CharSequence charSequence, Object obj, int i5) {
            return addItem(i4, charSequence, obj, i5, 0);
        }

        public BottomGridSheetBuilder addItem(int i4, CharSequence charSequence, Object obj, int i5, int i6) {
            return addItem(createItemView(C2443a.m8169d(this.mContext, i4), charSequence, obj, i6), i5);
        }

        public BottomGridSheetBuilder addItem(View view, int i4) {
            if (i4 == 0) {
                SparseArray<View> sparseArray = this.mFirstLineViews;
                sparseArray.append(sparseArray.size(), view);
            } else if (i4 == 1) {
                SparseArray<View> sparseArray2 = this.mSecondLineViews;
                sparseArray2.append(sparseArray2.size(), view);
            }
            return this;
        }
    }

    public static class BottomListSheetBuilder {
        private BaseAdapter mAdapter;
        private int mCheckedIndex;
        private ListView mContainerView;
        private Context mContext;
        private BottomSheet mDialog;
        private List<View> mHeaderViews;
        private boolean mIsCenter;
        private List<BottomSheetListItemData> mItems;
        private boolean mNeedRightMark;
        private DialogInterface.OnDismissListener mOnBottomDialogDismissListener;
        private OnSheetItemClickListener mOnSheetItemClickListener;
        private String mTitle;
        private TextView mTitleTv;

        private class ListAdapter extends BaseAdapter {
            private boolean mIsCenter;

            public ListAdapter(boolean z3) {
                this.mIsCenter = z3;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return BottomListSheetBuilder.this.mItems.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return 0L;
            }

            @Override // android.widget.Adapter
            public View getView(final int i4, View view, ViewGroup viewGroup) {
                final ViewHolder viewHolder;
                final BottomSheetListItemData item = getItem(i4);
                if (view == null) {
                    view = LayoutInflater.from(BottomListSheetBuilder.this.mContext).inflate(C2042R.layout.xui_bottom_sheet_list_item, viewGroup, false);
                    viewHolder = new ViewHolder();
                    viewHolder.imageView = (ImageView) view.findViewById(C2042R.id.bottom_dialog_list_item_img);
                    TextView textView = (TextView) view.findViewById(C2042R.id.bottom_dialog_list_item_title);
                    viewHolder.textView = textView;
                    if (this.mIsCenter) {
                        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        viewHolder.textView.setGravity(17);
                    }
                    viewHolder.markView = view.findViewById(C2042R.id.bottom_dialog_list_item_mark_view_stub);
                    viewHolder.redPoint = view.findViewById(C2042R.id.bottom_dialog_list_item_point);
                    view.setTag(viewHolder);
                } else {
                    viewHolder = (ViewHolder) view.getTag();
                }
                if (item.image != null) {
                    viewHolder.imageView.setVisibility(0);
                    viewHolder.imageView.setImageDrawable(item.image);
                } else {
                    viewHolder.imageView.setVisibility(8);
                }
                viewHolder.textView.setText(item.text);
                if (item.hasRedPoint) {
                    viewHolder.redPoint.setVisibility(0);
                } else {
                    viewHolder.redPoint.setVisibility(8);
                }
                if (item.isDisabled) {
                    viewHolder.textView.setEnabled(false);
                    view.setEnabled(false);
                } else {
                    viewHolder.textView.setEnabled(true);
                    view.setEnabled(true);
                }
                if (BottomListSheetBuilder.this.mNeedRightMark) {
                    View view2 = viewHolder.markView;
                    if (view2 instanceof ViewStub) {
                        viewHolder.markView = ((ViewStub) view2).inflate();
                    }
                    if (BottomListSheetBuilder.this.mCheckedIndex == i4) {
                        viewHolder.markView.setVisibility(0);
                    } else {
                        viewHolder.markView.setVisibility(8);
                    }
                } else {
                    viewHolder.markView.setVisibility(8);
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.BottomListSheetBuilder.ListAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        BottomSheetListItemData bottomSheetListItemData = item;
                        if (bottomSheetListItemData.hasRedPoint) {
                            bottomSheetListItemData.hasRedPoint = false;
                            viewHolder.redPoint.setVisibility(8);
                        }
                        if (BottomListSheetBuilder.this.mNeedRightMark) {
                            BottomListSheetBuilder.this.setCheckedIndex(i4);
                            ListAdapter.this.notifyDataSetChanged();
                        }
                        if (BottomListSheetBuilder.this.mOnSheetItemClickListener != null) {
                            BottomListSheetBuilder.this.mOnSheetItemClickListener.onClick(BottomListSheetBuilder.this.mDialog, view3, i4, item.tag);
                        }
                    }
                });
                return view;
            }

            @Override // android.widget.Adapter
            public BottomSheetListItemData getItem(int i4) {
                return (BottomSheetListItemData) BottomListSheetBuilder.this.mItems.get(i4);
            }
        }

        public interface OnSheetItemClickListener {
            void onClick(BottomSheet bottomSheet, View view, int i4, String str);
        }

        private static class ViewHolder {
            ImageView imageView;
            View markView;
            View redPoint;
            TextView textView;

            private ViewHolder() {
            }
        }

        public BottomListSheetBuilder(Context context) {
            this(context, false);
        }

        private View buildViews() {
            View viewInflate = View.inflate(this.mContext, getContentViewLayoutId(), null);
            this.mTitleTv = (TextView) viewInflate.findViewById(C2042R.id.title);
            this.mContainerView = (ListView) viewInflate.findViewById(C2042R.id.listview);
            String str = this.mTitle;
            if (str == null || str.length() == 0) {
                this.mTitleTv.setVisibility(8);
            } else {
                this.mTitleTv.setVisibility(0);
                this.mTitleTv.setText(this.mTitle);
            }
            if (this.mIsCenter) {
                this.mTitleTv.setGravity(17);
            }
            if (this.mHeaderViews.size() > 0) {
                Iterator<View> it = this.mHeaderViews.iterator();
                while (it.hasNext()) {
                    this.mContainerView.addHeaderView(it.next());
                }
            }
            if (needToScroll()) {
                this.mContainerView.getLayoutParams().height = getListMaxHeight();
                this.mDialog.setOnBottomSheetShowListener(new OnBottomSheetShowListener() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.BottomListSheetBuilder.1
                    @Override // com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.OnBottomSheetShowListener
                    public void onShow() {
                        BottomListSheetBuilder.this.mContainerView.setSelection(BottomListSheetBuilder.this.mCheckedIndex);
                    }
                });
            }
            ListAdapter listAdapter = new ListAdapter(this.mIsCenter);
            this.mAdapter = listAdapter;
            this.mContainerView.setAdapter((android.widget.ListAdapter) listAdapter);
            return viewInflate;
        }

        private boolean needToScroll() {
            int size = this.mItems.size() * ThemeUtils.resolveDimension(this.mContext, C2042R.attr.xui_bottom_sheet_list_item_height);
            if (this.mHeaderViews.size() > 0) {
                for (View view : this.mHeaderViews) {
                    if (view.getMeasuredHeight() == 0) {
                        view.measure(0, 0);
                    }
                    size += view.getMeasuredHeight();
                }
            }
            if (this.mTitleTv != null && !Utils.isNullOrEmpty(this.mTitle)) {
                size += ThemeUtils.resolveDimension(this.mContext, C2042R.attr.xui_bottom_sheet_title_height);
            }
            return size > getListMaxHeight();
        }

        public BottomListSheetBuilder addHeaderView(View view) {
            if (view != null) {
                this.mHeaderViews.add(view);
            }
            return this;
        }

        public BottomListSheetBuilder addItem(String str) {
            this.mItems.add(new BottomSheetListItemData(str, str));
            return this;
        }

        public BottomSheet build() {
            this.mDialog = new BottomSheet(this.mContext);
            this.mDialog.setContentView(buildViews(), new ViewGroup.LayoutParams(-1, -2));
            DialogInterface.OnDismissListener onDismissListener = this.mOnBottomDialogDismissListener;
            if (onDismissListener != null) {
                this.mDialog.setOnDismissListener(onDismissListener);
            }
            return this.mDialog;
        }

        protected int getContentViewLayoutId() {
            return C2042R.layout.xui_bottom_sheet_list;
        }

        protected int getListMaxHeight() {
            return (int) (Utils.getScreenHeight(this.mContext) * 0.5d);
        }

        public void notifyDataSetChanged() {
            BaseAdapter baseAdapter = this.mAdapter;
            if (baseAdapter != null) {
                baseAdapter.notifyDataSetChanged();
            }
            if (needToScroll()) {
                this.mContainerView.getLayoutParams().height = getListMaxHeight();
                this.mContainerView.setSelection(this.mCheckedIndex);
            }
        }

        public BottomListSheetBuilder setCheckedIndex(int i4) {
            this.mCheckedIndex = i4;
            return this;
        }

        public BottomListSheetBuilder setIsCenter(boolean z3) {
            this.mIsCenter = z3;
            return this;
        }

        public BottomListSheetBuilder setOnBottomDialogDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.mOnBottomDialogDismissListener = onDismissListener;
            return this;
        }

        public BottomListSheetBuilder setOnSheetItemClickListener(OnSheetItemClickListener onSheetItemClickListener) {
            this.mOnSheetItemClickListener = onSheetItemClickListener;
            return this;
        }

        public BottomListSheetBuilder setTitle(String str) {
            this.mTitle = str;
            return this;
        }

        public BottomListSheetBuilder(Context context, boolean z3) {
            this.mContext = context;
            this.mItems = new ArrayList();
            this.mHeaderViews = new ArrayList();
            this.mNeedRightMark = z3;
            this.mIsCenter = false;
        }

        public BottomListSheetBuilder addItem(Drawable drawable, String str) {
            this.mItems.add(new BottomSheetListItemData(drawable, str, str));
            return this;
        }

        public BottomListSheetBuilder setTitle(int i4) {
            this.mTitle = this.mContext.getResources().getString(i4);
            return this;
        }

        public BottomListSheetBuilder addItem(String str, String str2) {
            this.mItems.add(new BottomSheetListItemData(str, str2));
            return this;
        }

        public BottomListSheetBuilder addItem(int i4, String str, String str2) {
            this.mItems.add(new BottomSheetListItemData(i4 != 0 ? C0332a.m1806d(this.mContext, i4) : null, str, str2));
            return this;
        }

        private static class BottomSheetListItemData {
            boolean hasRedPoint;
            Drawable image;
            boolean isDisabled;
            String tag;
            String text;

            public BottomSheetListItemData(String str, String str2) {
                this.image = null;
                this.hasRedPoint = false;
                this.isDisabled = false;
                this.text = str;
                this.tag = str2;
            }

            public BottomSheetListItemData(Drawable drawable, String str, String str2) {
                this.hasRedPoint = false;
                this.isDisabled = false;
                this.image = drawable;
                this.text = str;
                this.tag = str2;
            }

            public BottomSheetListItemData(Drawable drawable, String str, String str2, boolean z3) {
                this.isDisabled = false;
                this.image = drawable;
                this.text = str;
                this.tag = str2;
                this.hasRedPoint = z3;
            }

            public BottomSheetListItemData(Drawable drawable, String str, String str2, boolean z3, boolean z4) {
                this.image = drawable;
                this.text = str;
                this.tag = str2;
                this.hasRedPoint = z3;
                this.isDisabled = z4;
            }
        }

        public BottomListSheetBuilder addItem(int i4, String str, String str2, boolean z3) {
            this.mItems.add(new BottomSheetListItemData(i4 != 0 ? C0332a.m1806d(this.mContext, i4) : null, str, str2, z3));
            return this;
        }

        public BottomListSheetBuilder addItem(int i4, String str, String str2, boolean z3, boolean z4) {
            this.mItems.add(new BottomSheetListItemData(i4 != 0 ? C0332a.m1806d(this.mContext, i4) : null, str, str2, z3, z4));
            return this;
        }
    }

    public interface OnBottomSheetShowListener {
        void onShow();
    }

    public BottomSheet(Context context) {
        super(context, C2042R.style.BottomSheet);
        this.mIsAnimating = false;
    }

    private void animateDown() {
        if (this.mContentView == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, IGoodView.DEFAULT_TO_ALPHA);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setDuration(200L);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                BottomSheet.this.mIsAnimating = false;
                BottomSheet.this.mContentView.post(new Runnable() { // from class: com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            BottomSheet.super.dismiss();
                        } catch (Exception e4) {
                            UILog.m7967w("dismiss error\n" + Log.getStackTraceString(e4));
                        }
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                BottomSheet.this.mIsAnimating = true;
            }
        });
        this.mContentView.startAnimation(animationSet);
    }

    private void animateUp() {
        if (this.mContentView == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, 1.0f, 1, IGoodView.DEFAULT_TO_ALPHA);
        AlphaAnimation alphaAnimation = new AlphaAnimation(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setDuration(200L);
        animationSet.setFillAfter(true);
        this.mContentView.startAnimation(animationSet);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.mIsAnimating) {
            return;
        }
        animateDown();
    }

    public View getContentView() {
        return this.mContentView;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 81;
        attributes.width = Math.min(Utils.getScreenWidth(getContext()), Utils.getScreenHeight(getContext()));
        getWindow().setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i4, (ViewGroup) null);
        this.mContentView = viewInflate;
        super.setContentView(viewInflate);
    }

    public void setOnBottomSheetShowListener(OnBottomSheetShowListener onBottomSheetShowListener) {
        this.mOnBottomSheetShowListener = onBottomSheetShowListener;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        animateUp();
        OnBottomSheetShowListener onBottomSheetShowListener = this.mOnBottomSheetShowListener;
        if (onBottomSheetShowListener != null) {
            onBottomSheetShowListener.onShow();
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mContentView = view;
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        this.mContentView = view;
        super.setContentView(view);
    }
}
