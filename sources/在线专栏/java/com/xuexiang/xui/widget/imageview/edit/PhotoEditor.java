package com.xuexiang.xui.widget.imageview.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.imageview.edit.MultiTouchListener;
import com.xuexiang.xui.widget.imageview.edit.SaveSettings;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PhotoEditor implements BrushViewChangeListener {
    private List<View> mAddedViews;
    private BrushDrawingView mBrushDrawingView;
    private Typeface mDefaultEmojiTypeface;
    private Typeface mDefaultTextTypeface;
    private View mDeleteView;
    private ImageView mImageView;
    private boolean mIsTextPinchZoomable;
    private final LayoutInflater mLayoutInflater;
    private OnPhotoEditorListener mOnPhotoEditorListener;
    private PhotoEditorView mParentView;
    private List<View> mRedoViews;

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.PhotoEditor$7 */
    static /* synthetic */ class C21897 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType;

        static {
            int[] iArr = new int[ViewType.values().length];
            $SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType = iArr;
            try {
                iArr[ViewType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType[ViewType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType[ViewType.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Builder {
        private BrushDrawingView brushDrawingView;
        private Context context;
        private View deleteView;
        private Typeface emojiTypeface;
        private ImageView imageView;
        private boolean isTextPinchZoomable = true;
        private PhotoEditorView parentView;
        private Typeface textTypeface;

        public Builder(Context context, PhotoEditorView photoEditorView) {
            this.context = context;
            this.parentView = photoEditorView;
            this.imageView = photoEditorView.getSource();
            this.brushDrawingView = photoEditorView.getBrushDrawingView();
        }

        public PhotoEditor build() {
            return new PhotoEditor(this);
        }

        public Builder setDefaultEmojiTypeface(Typeface typeface) {
            this.emojiTypeface = typeface;
            return this;
        }

        public Builder setDefaultTextTypeface(Typeface typeface) {
            this.textTypeface = typeface;
            return this;
        }

        Builder setDeleteView(View view) {
            this.deleteView = view;
            return this;
        }

        public Builder setPinchTextScalable(boolean z3) {
            this.isTextPinchZoomable = z3;
            return this;
        }
    }

    public interface OnSaveListener {
        void onFailure(Exception exc);

        void onSuccess(String str);
    }

    private void addViewToParent(View view, ViewType viewType) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.mParentView.addView(view, layoutParams);
        this.mAddedViews.add(view);
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onAddViewListener(viewType, this.mAddedViews.size());
        }
    }

    private void clearBrushAllViews() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.clearAll();
        }
    }

    private static String convertEmoji(String str) {
        try {
            return new String(Character.toChars(Integer.parseInt(str.substring(2), 16)));
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public static ArrayList<String> getEmojis(Context context) throws Resources.NotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : context.getResources().getStringArray(C2042R.array.photo_editor_emoji)) {
            arrayList.add(convertEmoji(str));
        }
        return arrayList;
    }

    private View getLayout(final ViewType viewType) {
        int i4 = C21897.$SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType[viewType.ordinal()];
        final View viewInflate = null;
        if (i4 == 1) {
            viewInflate = this.mLayoutInflater.inflate(C2042R.layout.xui_layout_photo_editor_text, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(C2042R.id.tv_editor_text);
            if (textView != null && this.mDefaultTextTypeface != null) {
                textView.setGravity(17);
                if (this.mDefaultEmojiTypeface != null) {
                    textView.setTypeface(this.mDefaultTextTypeface);
                }
            }
        } else if (i4 == 2) {
            viewInflate = this.mLayoutInflater.inflate(C2042R.layout.xui_layout_photo_editor_image, (ViewGroup) null);
        } else if (i4 == 3) {
            View viewInflate2 = this.mLayoutInflater.inflate(C2042R.layout.xui_layout_photo_editor_text, (ViewGroup) null);
            TextView textView2 = (TextView) viewInflate2.findViewById(C2042R.id.tv_editor_text);
            if (textView2 != null) {
                Typeface typeface = this.mDefaultEmojiTypeface;
                if (typeface != null) {
                    textView2.setTypeface(typeface);
                }
                textView2.setGravity(17);
                textView2.setLayerType(1, null);
            }
            viewInflate = viewInflate2;
        }
        if (viewInflate != null) {
            viewInflate.setTag(viewType);
            ImageView imageView = (ImageView) viewInflate.findViewById(C2042R.id.iv_editor_close);
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        PhotoEditor.this.viewUndo(viewInflate, viewType);
                    }
                });
            }
        }
        return viewInflate;
    }

    private MultiTouchListener getMultiTouchListener() {
        return new MultiTouchListener(this.mDeleteView, this.mParentView, this.mImageView, this.mIsTextPinchZoomable, this.mOnPhotoEditorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void viewUndo(View view, ViewType viewType) {
        if (this.mAddedViews.size() <= 0 || !this.mAddedViews.contains(view)) {
            return;
        }
        this.mParentView.removeView(view);
        this.mAddedViews.remove(view);
        this.mRedoViews.add(view);
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onRemoveViewListener(viewType, this.mAddedViews.size());
        }
    }

    public void addEmoji(String str) {
        addEmoji(null, str);
    }

    public void addImage(Bitmap bitmap) {
        ViewType viewType = ViewType.IMAGE;
        View layout = getLayout(viewType);
        ImageView imageView = (ImageView) layout.findViewById(C2042R.id.iv_editor_image);
        final FrameLayout frameLayout = (FrameLayout) layout.findViewById(C2042R.id.fl_border);
        final ImageView imageView2 = (ImageView) layout.findViewById(C2042R.id.iv_editor_close);
        imageView.setImageBitmap(bitmap);
        MultiTouchListener multiTouchListener = getMultiTouchListener();
        multiTouchListener.setOnGestureControl(new MultiTouchListener.OnGestureControl() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.1
            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onClick() {
                boolean z3 = frameLayout.getTag() != null && ((Boolean) frameLayout.getTag()).booleanValue();
                frameLayout.setBackgroundResource(z3 ? 0 : C2042R.drawable.pe_rounded_border_tv);
                imageView2.setVisibility(z3 ? 8 : 0);
                frameLayout.setTag(Boolean.valueOf(!z3));
            }

            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onLongClick() {
            }
        });
        layout.setOnTouchListener(multiTouchListener);
        addViewToParent(layout, viewType);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void addText(String str, int i4) {
        addText(null, str, i4);
    }

    public PhotoEditor brushEraser() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.brushEraser();
        }
        return this;
    }

    public void clearAllViews() {
        for (int i4 = 0; i4 < this.mAddedViews.size(); i4++) {
            this.mParentView.removeView(this.mAddedViews.get(i4));
        }
        if (this.mAddedViews.contains(this.mBrushDrawingView)) {
            this.mParentView.addView(this.mBrushDrawingView);
        }
        this.mAddedViews.clear();
        this.mRedoViews.clear();
        clearBrushAllViews();
    }

    public void clearHelperBox() {
        for (int i4 = 0; i4 < this.mParentView.getChildCount(); i4++) {
            View childAt = this.mParentView.getChildAt(i4);
            FrameLayout frameLayout = (FrameLayout) childAt.findViewById(C2042R.id.fl_border);
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(0);
            }
            ImageView imageView = (ImageView) childAt.findViewById(C2042R.id.iv_editor_close);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    public void editText(View view, String str, int i4) {
        editText(view, null, str, i4);
    }

    public int getBrushColor() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            return brushDrawingView.getBrushColor();
        }
        return 0;
    }

    public Boolean getBrushDrawableMode() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        return Boolean.valueOf(brushDrawingView != null && brushDrawingView.getBrushDrawingMode());
    }

    public float getBrushSize() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        return brushDrawingView != null ? brushDrawingView.getBrushSize() : IGoodView.DEFAULT_TO_ALPHA;
    }

    public float getEraserSize() {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        return brushDrawingView != null ? brushDrawingView.getEraserSize() : IGoodView.DEFAULT_TO_ALPHA;
    }

    public boolean isCacheEmpty() {
        return this.mAddedViews.size() == 0 && this.mRedoViews.size() == 0;
    }

    @Override // com.xuexiang.xui.widget.imageview.edit.BrushViewChangeListener
    public void onStartDrawing() {
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onStartViewChangeListener(ViewType.BRUSH_DRAWING);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.edit.BrushViewChangeListener
    public void onStopDrawing() {
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onStopViewChangeListener(ViewType.BRUSH_DRAWING);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.edit.BrushViewChangeListener
    public void onViewAdd(BrushDrawingView brushDrawingView) {
        if (this.mRedoViews.size() > 0) {
            this.mRedoViews.remove(r0.size() - 1);
        }
        this.mAddedViews.add(brushDrawingView);
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onAddViewListener(ViewType.BRUSH_DRAWING, this.mAddedViews.size());
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.edit.BrushViewChangeListener
    public void onViewRemoved(BrushDrawingView brushDrawingView) {
        if (this.mAddedViews.size() > 0) {
            View viewRemove = this.mAddedViews.remove(r3.size() - 1);
            if (!(viewRemove instanceof BrushDrawingView)) {
                this.mParentView.removeView(viewRemove);
            }
            this.mRedoViews.add(viewRemove);
        }
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onRemoveViewListener(ViewType.BRUSH_DRAWING, this.mAddedViews.size());
        }
    }

    public boolean redo() {
        if (this.mRedoViews.size() > 0) {
            List<View> list = this.mRedoViews;
            View view = list.get(list.size() - 1);
            if (view instanceof BrushDrawingView) {
                BrushDrawingView brushDrawingView = this.mBrushDrawingView;
                return brushDrawingView != null && brushDrawingView.redo();
            }
            List<View> list2 = this.mRedoViews;
            list2.remove(list2.size() - 1);
            this.mParentView.addView(view);
            this.mAddedViews.add(view);
            Object tag = view.getTag();
            OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
            if (onPhotoEditorListener != null && tag != null && (tag instanceof ViewType)) {
                onPhotoEditorListener.onAddViewListener((ViewType) tag, this.mAddedViews.size());
            }
        }
        return this.mRedoViews.size() != 0;
    }

    @SuppressLint({"StaticFieldLeak"})
    public void saveAsBitmap(OnBitmapSaveListener onBitmapSaveListener) {
        saveAsBitmap(new SaveSettings.Builder().build(), onBitmapSaveListener);
    }

    public void saveAsFile(String str, OnSaveListener onSaveListener) {
        saveAsFile(str, new SaveSettings.Builder().build(), onSaveListener);
    }

    public PhotoEditor setBrushColor(int i4) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setBrushColor(i4);
        }
        return this;
    }

    public PhotoEditor setBrushDrawingMode(boolean z3) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setBrushDrawingMode(z3);
        }
        return this;
    }

    void setBrushEraserColor(int i4) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setBrushEraserColor(i4);
        }
    }

    public PhotoEditor setBrushEraserSize(float f4) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setBrushEraserSize(f4);
        }
        return this;
    }

    public PhotoEditor setBrushSize(float f4) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setBrushSize(f4);
        }
        return this;
    }

    public PhotoEditor setFilterEffect(CustomEffect customEffect) {
        this.mParentView.setFilterEffect(customEffect);
        return this;
    }

    public PhotoEditor setOnPhotoEditorListener(OnPhotoEditorListener onPhotoEditorListener) {
        this.mOnPhotoEditorListener = onPhotoEditorListener;
        return this;
    }

    public PhotoEditor setOpacity(int i4) {
        BrushDrawingView brushDrawingView = this.mBrushDrawingView;
        if (brushDrawingView != null) {
            brushDrawingView.setOpacity((int) ((i4 / 100.0d) * 255.0d));
        }
        return this;
    }

    public boolean undo() {
        Object tag;
        if (this.mAddedViews.size() > 0) {
            List<View> list = this.mAddedViews;
            View view = list.get(list.size() - 1);
            if (view instanceof BrushDrawingView) {
                BrushDrawingView brushDrawingView = this.mBrushDrawingView;
                return brushDrawingView != null && brushDrawingView.undo();
            }
            List<View> list2 = this.mAddedViews;
            list2.remove(list2.size() - 1);
            this.mParentView.removeView(view);
            this.mRedoViews.add(view);
            if (this.mOnPhotoEditorListener != null && (tag = view.getTag()) != null && (tag instanceof ViewType)) {
                this.mOnPhotoEditorListener.onRemoveViewListener((ViewType) tag, this.mAddedViews.size());
            }
        }
        return this.mAddedViews.size() != 0;
    }

    private PhotoEditor(Builder builder) {
        this.mParentView = builder.parentView;
        this.mImageView = builder.imageView;
        this.mDeleteView = builder.deleteView;
        this.mBrushDrawingView = builder.brushDrawingView;
        this.mIsTextPinchZoomable = builder.isTextPinchZoomable;
        this.mDefaultTextTypeface = builder.textTypeface;
        this.mDefaultEmojiTypeface = builder.emojiTypeface;
        this.mLayoutInflater = (LayoutInflater) builder.context.getSystemService("layout_inflater");
        this.mBrushDrawingView.setBrushViewChangeListener(this);
        this.mAddedViews = new ArrayList();
        this.mRedoViews = new ArrayList();
    }

    public void addEmoji(Typeface typeface, String str) {
        this.mBrushDrawingView.setBrushDrawingMode(false);
        ViewType viewType = ViewType.EMOJI;
        View layout = getLayout(viewType);
        TextView textView = (TextView) layout.findViewById(C2042R.id.tv_editor_text);
        final FrameLayout frameLayout = (FrameLayout) layout.findViewById(C2042R.id.fl_border);
        final ImageView imageView = (ImageView) layout.findViewById(C2042R.id.iv_editor_close);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        textView.setTextSize(56.0f);
        textView.setText(str);
        MultiTouchListener multiTouchListener = getMultiTouchListener();
        multiTouchListener.setOnGestureControl(new MultiTouchListener.OnGestureControl() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.3
            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onClick() {
                boolean z3 = frameLayout.getTag() != null && ((Boolean) frameLayout.getTag()).booleanValue();
                frameLayout.setBackgroundResource(z3 ? 0 : C2042R.drawable.pe_rounded_border_tv);
                imageView.setVisibility(z3 ? 8 : 0);
                frameLayout.setTag(Boolean.valueOf(!z3));
            }

            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onLongClick() {
            }
        });
        layout.setOnTouchListener(multiTouchListener);
        addViewToParent(layout, viewType);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void addText(Typeface typeface, String str, int i4) {
        TextStyleBuilder textStyleBuilder = new TextStyleBuilder();
        textStyleBuilder.withTextColor(i4);
        if (typeface != null) {
            textStyleBuilder.withTextFont(typeface);
        }
        addText(str, textStyleBuilder);
    }

    public void editText(View view, Typeface typeface, String str, int i4) {
        TextStyleBuilder textStyleBuilder = new TextStyleBuilder();
        textStyleBuilder.withTextColor(i4);
        if (typeface != null) {
            textStyleBuilder.withTextFont(typeface);
        }
        editText(view, str, textStyleBuilder);
    }

    @SuppressLint({"StaticFieldLeak"})
    public void saveAsBitmap(final SaveSettings saveSettings, final OnBitmapSaveListener onBitmapSaveListener) {
        this.mParentView.saveFilter(new OnBitmapSaveListener() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.6
            @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
            public void onBitmapReady(Bitmap bitmap) {
                new AsyncTask<String, String, Bitmap>() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.6.1
                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                        super.onPreExecute();
                        PhotoEditor.this.clearHelperBox();
                        PhotoEditor.this.mParentView.setDrawingCacheEnabled(false);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public Bitmap doInBackground(String... strArr) {
                        if (PhotoEditor.this.mParentView == null) {
                            return null;
                        }
                        PhotoEditor.this.mParentView.setDrawingCacheEnabled(true);
                        return saveSettings.isTransparencyEnabled() ? BitmapUtil.removeTransparency(PhotoEditor.this.mParentView.getDrawingCache()) : PhotoEditor.this.mParentView.getDrawingCache();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Bitmap bitmap2) {
                        super.onPostExecute((AnonymousClass1) bitmap2);
                        if (bitmap2 == null) {
                            onBitmapSaveListener.onFailure(new Exception("Failed to load the bitmap"));
                            return;
                        }
                        if (saveSettings.isClearViewsEnabled()) {
                            PhotoEditor.this.clearAllViews();
                        }
                        onBitmapSaveListener.onBitmapReady(bitmap2);
                    }
                }.execute(new String[0]);
            }

            @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
            public void onFailure(Exception exc) {
                onBitmapSaveListener.onFailure(exc);
            }
        });
    }

    @SuppressLint({"StaticFieldLeak"})
    public void saveAsFile(final String str, final SaveSettings saveSettings, final OnSaveListener onSaveListener) {
        this.mParentView.saveFilter(new OnBitmapSaveListener() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.5
            @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
            public void onBitmapReady(Bitmap bitmap) {
                new AsyncTask<String, String, Exception>() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.5.1
                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                        super.onPreExecute();
                        PhotoEditor.this.clearHelperBox();
                        PhotoEditor.this.mParentView.setDrawingCacheEnabled(false);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    @SuppressLint({"MissingPermission"})
                    public Exception doInBackground(String... strArr) throws IOException {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(str), false);
                            if (PhotoEditor.this.mParentView != null) {
                                PhotoEditor.this.mParentView.setDrawingCacheEnabled(true);
                                (saveSettings.isTransparencyEnabled() ? BitmapUtil.removeTransparency(PhotoEditor.this.mParentView.getDrawingCache()) : PhotoEditor.this.mParentView.getDrawingCache()).compress(saveSettings.getCompressFormat(), saveSettings.getCompressQuality(), fileOutputStream);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            return null;
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            return e4;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Exception exc) {
                        super.onPostExecute((AnonymousClass1) exc);
                        if (exc != null) {
                            onSaveListener.onFailure(exc);
                            return;
                        }
                        if (saveSettings.isClearViewsEnabled()) {
                            PhotoEditor.this.clearAllViews();
                        }
                        C21875 c21875 = C21875.this;
                        onSaveListener.onSuccess(str);
                    }
                }.execute(new String[0]);
            }

            @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
            public void onFailure(Exception exc) {
                onSaveListener.onFailure(exc);
            }
        });
    }

    public PhotoEditor setFilterEffect(PhotoFilter photoFilter) {
        this.mParentView.setFilterEffect(photoFilter);
        return this;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void addText(String str, TextStyleBuilder textStyleBuilder) {
        this.mBrushDrawingView.setBrushDrawingMode(false);
        ViewType viewType = ViewType.TEXT;
        final View layout = getLayout(viewType);
        final TextView textView = (TextView) layout.findViewById(C2042R.id.tv_editor_text);
        final ImageView imageView = (ImageView) layout.findViewById(C2042R.id.iv_editor_close);
        final FrameLayout frameLayout = (FrameLayout) layout.findViewById(C2042R.id.fl_border);
        textView.setText(str);
        if (textStyleBuilder != null) {
            textStyleBuilder.applyStyle(textView);
        }
        MultiTouchListener multiTouchListener = getMultiTouchListener();
        multiTouchListener.setOnGestureControl(new MultiTouchListener.OnGestureControl() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditor.2
            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onClick() {
                boolean z3 = frameLayout.getTag() != null && ((Boolean) frameLayout.getTag()).booleanValue();
                frameLayout.setBackgroundResource(z3 ? 0 : C2042R.drawable.pe_rounded_border_tv);
                imageView.setVisibility(z3 ? 8 : 0);
                frameLayout.setTag(Boolean.valueOf(!z3));
            }

            @Override // com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.OnGestureControl
            public void onLongClick() {
                String string = textView.getText().toString();
                int currentTextColor = textView.getCurrentTextColor();
                if (PhotoEditor.this.mOnPhotoEditorListener != null) {
                    PhotoEditor.this.mOnPhotoEditorListener.onEditTextChangeListener(layout, string, currentTextColor);
                }
            }
        });
        layout.setOnTouchListener(multiTouchListener);
        addViewToParent(layout, viewType);
    }

    public void editText(View view, String str, TextStyleBuilder textStyleBuilder) {
        TextView textView = (TextView) view.findViewById(C2042R.id.tv_editor_text);
        if (textView == null || !this.mAddedViews.contains(view) || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
        if (textStyleBuilder != null) {
            textStyleBuilder.applyStyle(textView);
        }
        this.mParentView.updateViewLayout(view, view.getLayoutParams());
        int iIndexOf = this.mAddedViews.indexOf(view);
        if (iIndexOf > -1) {
            this.mAddedViews.set(iIndexOf, view);
        }
    }
}
