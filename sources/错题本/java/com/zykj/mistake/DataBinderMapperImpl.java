package com.zykj.mistake;

import android.support.v4.media.AbstractC0037f;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zykj.mistake.databinding.ActivityLegacyMistakeBindingImpl;
import com.zykj.mistake.databinding.ActivityLessonPlayerBindingImpl;
import com.zykj.mistake.databinding.ActivityMistakeCollectionDetailBindingImpl;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBindingImpl;
import com.zykj.mistake.databinding.ActivityMistakeDetailBindingImpl;
import com.zykj.mistake.databinding.ActivityMistakeListBindingImpl;
import com.zykj.mistake.databinding.ActivitySketchBindingImpl;
import com.zykj.mistake.databinding.DialogConvertBindingImpl;
import com.zykj.mistake.databinding.DialogFragmentAnswerBindingImpl;
import com.zykj.mistake.databinding.DialogFragmentImageBindingImpl;
import com.zykj.mistake.databinding.DialogFragmentPictureNoteDeleteBindingImpl;
import com.zykj.mistake.databinding.DialogMistakeTagAddBindingImpl;
import com.zykj.mistake.databinding.DialogWebviewShotBindingImpl;
import com.zykj.mistake.databinding.FragmentComposePageBindingImpl;
import com.zykj.mistake.databinding.FragmentEmptyBindingImpl;
import com.zykj.mistake.databinding.FragmentMicroClassBindingImpl;
import com.zykj.mistake.databinding.FragmentMistakeNotebookBindingImpl;
import com.zykj.mistake.databinding.FragmentNoteBindingImpl;
import com.zykj.mistake.databinding.FragmentOriginalAnswerBindingImpl;
import com.zykj.mistake.databinding.FragmentRevisedAnswerBindingImpl;
import com.zykj.mistake.databinding.FragmentTypicalAnswerBindingImpl;
import com.zykj.mistake.databinding.IncludeMistakeDetailEndBinding;
import com.zykj.mistake.databinding.IncludeMistakeDetailEndBindingImpl;
import com.zykj.mistake.databinding.ItemListNoteImageBindingImpl;
import com.zykj.mistake.databinding.ItemMicroSessionsBindingImpl;
import com.zykj.mistake.widget.CustomViewPager;
import com.zykj.mistake.widget.FlowLayout;
import com.zykj.mistake.widget.IntrinsicWidthImageView;
import com.zykj.mistake.widget.LineBottomProView;
import com.zykj.mistake.widget.StemWebView;
import java.util.ArrayList;
import java.util.List;
import org.angmarch.views.NiceSpinner;
import p058f4.AbstractC5525a;
import p058f4.AbstractC5526b;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f5741a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(24);
        f5741a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_legacy_mistake, 1);
        sparseIntArray.put(R.layout.activity_lesson_player, 2);
        sparseIntArray.put(R.layout.activity_mistake_collection_detail, 3);
        sparseIntArray.put(R.layout.activity_mistake_create_or_edit, 4);
        sparseIntArray.put(R.layout.activity_mistake_detail, 5);
        sparseIntArray.put(R.layout.activity_mistake_list, 6);
        sparseIntArray.put(R.layout.activity_sketch, 7);
        sparseIntArray.put(R.layout.dialog_convert, 8);
        sparseIntArray.put(R.layout.dialog_fragment_answer, 9);
        sparseIntArray.put(R.layout.dialog_fragment_image, 10);
        sparseIntArray.put(R.layout.dialog_fragment_picture_note_delete, 11);
        sparseIntArray.put(R.layout.dialog_mistake_tag_add, 12);
        sparseIntArray.put(R.layout.dialog_webview_shot, 13);
        sparseIntArray.put(R.layout.fragment_compose_page, 14);
        sparseIntArray.put(R.layout.fragment_empty, 15);
        sparseIntArray.put(R.layout.fragment_micro_class, 16);
        sparseIntArray.put(R.layout.fragment_mistake_notebook, 17);
        sparseIntArray.put(R.layout.fragment_note, 18);
        sparseIntArray.put(R.layout.fragment_original_answer, 19);
        sparseIntArray.put(R.layout.fragment_revised_answer, 20);
        sparseIntArray.put(R.layout.fragment_typical_answer, 21);
        sparseIntArray.put(R.layout.include_mistake_detail_end, 22);
        sparseIntArray.put(R.layout.item_list_note_image, 23);
        sparseIntArray.put(R.layout.item_micro_sessions, 24);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i) {
        return (String) AbstractC5525a.f8560a.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i8 = f5741a.get(i);
        if (i8 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i8) {
                case 1:
                    if (!"layout/activity_legacy_mistake_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_legacy_mistake is invalid. Received: "));
                    }
                    Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.IncludedLayouts) null, ActivityLegacyMistakeBindingImpl.f6012b);
                    ActivityLegacyMistakeBindingImpl activityLegacyMistakeBindingImpl = new ActivityLegacyMistakeBindingImpl(dataBindingComponent, view, 0);
                    activityLegacyMistakeBindingImpl.f6013a = -1L;
                    ((ConstraintLayout) objArrMapBindings[0]).setTag(null);
                    activityLegacyMistakeBindingImpl.setRootTag(view);
                    activityLegacyMistakeBindingImpl.invalidateAll();
                    return activityLegacyMistakeBindingImpl;
                case 2:
                    if (!"layout/activity_lesson_player_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_lesson_player is invalid. Received: "));
                    }
                    Object[] objArrMapBindings2 = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.IncludedLayouts) null, ActivityLessonPlayerBindingImpl.f6014b);
                    ActivityLessonPlayerBindingImpl activityLessonPlayerBindingImpl = new ActivityLessonPlayerBindingImpl(dataBindingComponent, view, 0);
                    activityLessonPlayerBindingImpl.f6015a = -1L;
                    ((RelativeLayout) objArrMapBindings2[0]).setTag(null);
                    activityLessonPlayerBindingImpl.setRootTag(view);
                    activityLessonPlayerBindingImpl.invalidateAll();
                    return activityLessonPlayerBindingImpl;
                case 3:
                    if (!"layout/activity_mistake_collection_detail_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_mistake_collection_detail is invalid. Received: "));
                    }
                    ActivityMistakeCollectionDetailBindingImpl activityMistakeCollectionDetailBindingImpl = new ActivityMistakeCollectionDetailBindingImpl(dataBindingComponent, view, (ComposeView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.IncludedLayouts) null, (SparseIntArray) null)[0]);
                    activityMistakeCollectionDetailBindingImpl.f6017b = -1L;
                    activityMistakeCollectionDetailBindingImpl.f6016a.setTag(null);
                    activityMistakeCollectionDetailBindingImpl.setRootTag(view);
                    activityMistakeCollectionDetailBindingImpl.invalidateAll();
                    return activityMistakeCollectionDetailBindingImpl;
                case 4:
                    if (!"layout/activity_mistake_create_or_edit_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_mistake_create_or_edit is invalid. Received: "));
                    }
                    Object[] objArrMapBindings3 = ViewDataBinding.mapBindings(dataBindingComponent, view, 39, ActivityMistakeCreateOrEditBindingImpl.f6043A, ActivityMistakeCreateOrEditBindingImpl.f6044B);
                    TextView textView = (TextView) objArrMapBindings3[37];
                    TextView textView2 = (TextView) objArrMapBindings3[38];
                    DrawerLayout drawerLayout = (DrawerLayout) objArrMapBindings3[0];
                    EditText editText = (EditText) objArrMapBindings3[14];
                    FlowLayout flowLayout = (FlowLayout) objArrMapBindings3[35];
                    Group group = (Group) objArrMapBindings3[23];
                    Group group2 = (Group) objArrMapBindings3[31];
                    ImageButton imageButton = (ImageButton) objArrMapBindings3[3];
                    IncludeMistakeDetailEndBinding includeMistakeDetailEndBinding = (IncludeMistakeDetailEndBinding) objArrMapBindings3[1];
                    ImageView imageView = (ImageView) objArrMapBindings3[26];
                    AppCompatImageView appCompatImageView = (AppCompatImageView) objArrMapBindings3[27];
                    ImageView imageView2 = (ImageView) objArrMapBindings3[18];
                    ImageView imageView3 = (ImageView) objArrMapBindings3[17];
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrMapBindings3[19];
                    ImageView imageView4 = (ImageView) objArrMapBindings3[29];
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) objArrMapBindings3[30];
                    ImageView imageView5 = (ImageView) objArrMapBindings3[21];
                    ImageView imageView6 = (ImageView) objArrMapBindings3[20];
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) objArrMapBindings3[22];
                    NiceSpinner niceSpinner = (NiceSpinner) objArrMapBindings3[9];
                    ActivityMistakeCreateOrEditBindingImpl activityMistakeCreateOrEditBindingImpl = new ActivityMistakeCreateOrEditBindingImpl(dataBindingComponent, view, textView, textView2, drawerLayout, editText, flowLayout, group, group2, imageButton, includeMistakeDetailEndBinding, imageView, appCompatImageView, imageView2, imageView3, appCompatImageView2, imageView4, appCompatImageView3, imageView5, imageView6, appCompatImageView4, niceSpinner, (TextView) objArrMapBindings3[4], (AppCompatTextView) objArrMapBindings3[11], (View) objArrMapBindings3[5], (View) objArrMapBindings3[2], (View) objArrMapBindings3[10]);
                    activityMistakeCreateOrEditBindingImpl.f6045z = -1L;
                    activityMistakeCreateOrEditBindingImpl.f6020c.setTag(null);
                    activityMistakeCreateOrEditBindingImpl.setContainedBinding(activityMistakeCreateOrEditBindingImpl.f6026i);
                    activityMistakeCreateOrEditBindingImpl.setRootTag(view);
                    activityMistakeCreateOrEditBindingImpl.invalidateAll();
                    return activityMistakeCreateOrEditBindingImpl;
                case 5:
                    if (!"layout/activity_mistake_detail_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_mistake_detail is invalid. Received: "));
                    }
                    Object[] objArrMapBindings4 = ViewDataBinding.mapBindings(dataBindingComponent, view, 24, ActivityMistakeDetailBindingImpl.f6063s, ActivityMistakeDetailBindingImpl.f6064t);
                    DrawerLayout drawerLayout2 = (DrawerLayout) objArrMapBindings4[0];
                    FlowLayout flowLayout2 = (FlowLayout) objArrMapBindings4[7];
                    IncludeMistakeDetailEndBinding includeMistakeDetailEndBinding2 = (IncludeMistakeDetailEndBinding) objArrMapBindings4[1];
                    ImageView imageView7 = (ImageView) objArrMapBindings4[2];
                    ImageView imageView8 = (ImageView) objArrMapBindings4[8];
                    ImageView imageView9 = (ImageView) objArrMapBindings4[4];
                    LinearLayout linearLayout = (LinearLayout) objArrMapBindings4[10];
                    RelativeLayout relativeLayout = (RelativeLayout) objArrMapBindings4[16];
                    ScrollView scrollView = (ScrollView) objArrMapBindings4[9];
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) objArrMapBindings4[14];
                    TextView textView3 = (TextView) objArrMapBindings4[22];
                    TextView textView4 = (TextView) objArrMapBindings4[23];
                    ActivityMistakeDetailBindingImpl activityMistakeDetailBindingImpl = new ActivityMistakeDetailBindingImpl(dataBindingComponent, view, drawerLayout2, flowLayout2, includeMistakeDetailEndBinding2, imageView7, imageView8, imageView9, linearLayout, relativeLayout, scrollView, slidingTabLayout, textView3, textView4, (TextView) objArrMapBindings4[18], (TextView) objArrMapBindings4[3], (View) objArrMapBindings4[20], (CustomViewPager) objArrMapBindings4[15], (StemWebView) objArrMapBindings4[11]);
                    activityMistakeDetailBindingImpl.f6065r = -1L;
                    activityMistakeDetailBindingImpl.f6046a.setTag(null);
                    activityMistakeDetailBindingImpl.setContainedBinding(activityMistakeDetailBindingImpl.f6048c);
                    activityMistakeDetailBindingImpl.setRootTag(view);
                    activityMistakeDetailBindingImpl.invalidateAll();
                    return activityMistakeDetailBindingImpl;
                case 6:
                    if (!"layout/activity_mistake_list_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_mistake_list is invalid. Received: "));
                    }
                    Object[] objArrMapBindings5 = ViewDataBinding.mapBindings(dataBindingComponent, view, 20, ActivityMistakeListBindingImpl.f6084t, ActivityMistakeListBindingImpl.f6085u);
                    DrawerLayout drawerLayout3 = (DrawerLayout) objArrMapBindings5[0];
                    IncludeMistakeDetailEndBinding includeMistakeDetailEndBinding3 = (IncludeMistakeDetailEndBinding) objArrMapBindings5[1];
                    ImageView imageView10 = (ImageView) objArrMapBindings5[3];
                    ImageView imageView11 = (ImageView) objArrMapBindings5[10];
                    ImageView imageView12 = (ImageView) objArrMapBindings5[13];
                    LinearLayout linearLayout2 = (LinearLayout) objArrMapBindings5[9];
                    LinearLayout linearLayout3 = (LinearLayout) objArrMapBindings5[12];
                    LinearLayout linearLayout4 = (LinearLayout) objArrMapBindings5[8];
                    LinearLayout linearLayout5 = (LinearLayout) objArrMapBindings5[15];
                    LinearLayout linearLayout6 = (LinearLayout) objArrMapBindings5[18];
                    RecyclerView recyclerView = (RecyclerView) objArrMapBindings5[17];
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) objArrMapBindings5[16];
                    TextView textView5 = (TextView) objArrMapBindings5[11];
                    TextView textView6 = (TextView) objArrMapBindings5[14];
                    ActivityMistakeListBindingImpl activityMistakeListBindingImpl = new ActivityMistakeListBindingImpl(dataBindingComponent, view, drawerLayout3, includeMistakeDetailEndBinding3, imageView10, imageView11, imageView12, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, recyclerView, swipeRefreshLayout, textView5, textView6, (TextView) objArrMapBindings5[5], (TextView) objArrMapBindings5[6], (TextView) objArrMapBindings5[7], (TextView) objArrMapBindings5[4]);
                    activityMistakeListBindingImpl.f6086s = -1L;
                    activityMistakeListBindingImpl.f6066a.setTag(null);
                    activityMistakeListBindingImpl.setContainedBinding(activityMistakeListBindingImpl.f6067b);
                    activityMistakeListBindingImpl.setRootTag(view);
                    activityMistakeListBindingImpl.invalidateAll();
                    return activityMistakeListBindingImpl;
                case 7:
                    if (!"layout/activity_sketch_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for activity_sketch is invalid. Received: "));
                    }
                    Object[] objArrMapBindings6 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.IncludedLayouts) null, ActivitySketchBindingImpl.f6088c);
                    ImageView imageView13 = (ImageView) objArrMapBindings6[2];
                    ActivitySketchBindingImpl activitySketchBindingImpl = new ActivitySketchBindingImpl(dataBindingComponent, view, imageView13);
                    activitySketchBindingImpl.f6089b = -1L;
                    ((ConstraintLayout) objArrMapBindings6[0]).setTag(null);
                    activitySketchBindingImpl.setRootTag(view);
                    activitySketchBindingImpl.invalidateAll();
                    return activitySketchBindingImpl;
                case 8:
                    if (!"layout/dialog_convert_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_convert is invalid. Received: "));
                    }
                    Object[] objArrMapBindings7 = ViewDataBinding.mapBindings(dataBindingComponent, view, 8, (ViewDataBinding.IncludedLayouts) null, DialogConvertBindingImpl.f6097i);
                    DialogConvertBindingImpl dialogConvertBindingImpl = new DialogConvertBindingImpl(dataBindingComponent, view, (LinearLayout) objArrMapBindings7[5], (LineBottomProView) objArrMapBindings7[3], (TextView) objArrMapBindings7[6], (TextView) objArrMapBindings7[7], (TextView) objArrMapBindings7[2], (TextView) objArrMapBindings7[4], (TextView) objArrMapBindings7[1]);
                    dialogConvertBindingImpl.f6098h = -1L;
                    ((ConstraintLayout) objArrMapBindings7[0]).setTag(null);
                    dialogConvertBindingImpl.setRootTag(view);
                    dialogConvertBindingImpl.invalidateAll();
                    return dialogConvertBindingImpl;
                case 9:
                    if (!"layout/dialog_fragment_answer_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_fragment_answer is invalid. Received: "));
                    }
                    Object[] objArrMapBindings8 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.IncludedLayouts) null, DialogFragmentAnswerBindingImpl.f6102e);
                    DialogFragmentAnswerBindingImpl dialogFragmentAnswerBindingImpl = new DialogFragmentAnswerBindingImpl(dataBindingComponent, view, (ImageView) objArrMapBindings8[3], (IntrinsicWidthImageView) objArrMapBindings8[2], (IntrinsicWidthImageView) objArrMapBindings8[1]);
                    dialogFragmentAnswerBindingImpl.f6103d = -1L;
                    ((RelativeLayout) objArrMapBindings8[0]).setTag(null);
                    dialogFragmentAnswerBindingImpl.setRootTag(view);
                    dialogFragmentAnswerBindingImpl.invalidateAll();
                    return dialogFragmentAnswerBindingImpl;
                case 10:
                    if (!"layout/dialog_fragment_image_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_fragment_image is invalid. Received: "));
                    }
                    Object[] objArrMapBindings9 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.IncludedLayouts) null, DialogFragmentImageBindingImpl.f6107e);
                    DialogFragmentImageBindingImpl dialogFragmentImageBindingImpl = new DialogFragmentImageBindingImpl(dataBindingComponent, view, (ImageView) objArrMapBindings9[2], (ImageView) objArrMapBindings9[3], (ImageView) objArrMapBindings9[1]);
                    dialogFragmentImageBindingImpl.f6108d = -1L;
                    ((ConstraintLayout) objArrMapBindings9[0]).setTag(null);
                    dialogFragmentImageBindingImpl.setRootTag(view);
                    dialogFragmentImageBindingImpl.invalidateAll();
                    return dialogFragmentImageBindingImpl;
                case 11:
                    if (!"layout/dialog_fragment_picture_note_delete_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_fragment_picture_note_delete is invalid. Received: "));
                    }
                    Object[] objArrMapBindings10 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.IncludedLayouts) null, DialogFragmentPictureNoteDeleteBindingImpl.f6111d);
                    DialogFragmentPictureNoteDeleteBindingImpl dialogFragmentPictureNoteDeleteBindingImpl = new DialogFragmentPictureNoteDeleteBindingImpl(dataBindingComponent, view, (TextView) objArrMapBindings10[2], (TextView) objArrMapBindings10[1]);
                    dialogFragmentPictureNoteDeleteBindingImpl.f6112c = -1L;
                    ((LinearLayout) objArrMapBindings10[0]).setTag(null);
                    dialogFragmentPictureNoteDeleteBindingImpl.setRootTag(view);
                    dialogFragmentPictureNoteDeleteBindingImpl.invalidateAll();
                    return dialogFragmentPictureNoteDeleteBindingImpl;
                case 12:
                    if (!"layout/dialog_mistake_tag_add_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_mistake_tag_add is invalid. Received: "));
                    }
                    Object[] objArrMapBindings11 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.IncludedLayouts) null, DialogMistakeTagAddBindingImpl.f6118g);
                    DialogMistakeTagAddBindingImpl dialogMistakeTagAddBindingImpl = new DialogMistakeTagAddBindingImpl(dataBindingComponent, view, (EditText) objArrMapBindings11[2], (TextView) objArrMapBindings11[3], (TextView) objArrMapBindings11[4], (TextView) objArrMapBindings11[1]);
                    dialogMistakeTagAddBindingImpl.f6119f = -1L;
                    ((ConstraintLayout) objArrMapBindings11[0]).setTag(null);
                    dialogMistakeTagAddBindingImpl.setRootTag(view);
                    dialogMistakeTagAddBindingImpl.invalidateAll();
                    return dialogMistakeTagAddBindingImpl;
                case 13:
                    if (!"layout/dialog_webview_shot_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for dialog_webview_shot is invalid. Received: "));
                    }
                    Object[] objArrMapBindings12 = ViewDataBinding.mapBindings(dataBindingComponent, view, 7, (ViewDataBinding.IncludedLayouts) null, DialogWebviewShotBindingImpl.f6126h);
                    DialogWebviewShotBindingImpl dialogWebviewShotBindingImpl = new DialogWebviewShotBindingImpl(dataBindingComponent, view, (ImageView) objArrMapBindings12[6], (ImageView) objArrMapBindings12[4], (ImageView) objArrMapBindings12[5], (ImageView) objArrMapBindings12[3], (TextView) objArrMapBindings12[2], (WebView) objArrMapBindings12[1]);
                    dialogWebviewShotBindingImpl.f6127g = -1L;
                    ((RelativeLayout) objArrMapBindings12[0]).setTag(null);
                    dialogWebviewShotBindingImpl.setRootTag(view);
                    dialogWebviewShotBindingImpl.invalidateAll();
                    return dialogWebviewShotBindingImpl;
                case 14:
                    if (!"layout/fragment_compose_page_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_compose_page is invalid. Received: "));
                    }
                    FragmentComposePageBindingImpl fragmentComposePageBindingImpl = new FragmentComposePageBindingImpl(dataBindingComponent, view, (ComposeView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.IncludedLayouts) null, (SparseIntArray) null)[0]);
                    fragmentComposePageBindingImpl.f6129b = -1L;
                    fragmentComposePageBindingImpl.f6128a.setTag(null);
                    fragmentComposePageBindingImpl.setRootTag(view);
                    fragmentComposePageBindingImpl.invalidateAll();
                    return fragmentComposePageBindingImpl;
                case 15:
                    if (!"layout/fragment_empty_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_empty is invalid. Received: "));
                    }
                    Object[] objArrMapBindings13 = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.IncludedLayouts) null, FragmentEmptyBindingImpl.f6131c);
                    FragmentEmptyBindingImpl fragmentEmptyBindingImpl = new FragmentEmptyBindingImpl(dataBindingComponent, view, (TextView) objArrMapBindings13[1]);
                    fragmentEmptyBindingImpl.f6132b = -1L;
                    ((RelativeLayout) objArrMapBindings13[0]).setTag(null);
                    fragmentEmptyBindingImpl.setRootTag(view);
                    fragmentEmptyBindingImpl.invalidateAll();
                    return fragmentEmptyBindingImpl;
                case 16:
                    if (!"layout/fragment_micro_class_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_micro_class is invalid. Received: "));
                    }
                    Object[] objArrMapBindings14 = ViewDataBinding.mapBindings(dataBindingComponent, view, 9, (ViewDataBinding.IncludedLayouts) null, FragmentMicroClassBindingImpl.f6133b);
                    FragmentMicroClassBindingImpl fragmentMicroClassBindingImpl = new FragmentMicroClassBindingImpl(dataBindingComponent, view, 0);
                    fragmentMicroClassBindingImpl.f6134a = -1L;
                    ((RelativeLayout) objArrMapBindings14[0]).setTag(null);
                    fragmentMicroClassBindingImpl.setRootTag(view);
                    fragmentMicroClassBindingImpl.invalidateAll();
                    return fragmentMicroClassBindingImpl;
                case 17:
                    if (!"layout/fragment_mistake_notebook_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_mistake_notebook is invalid. Received: "));
                    }
                    Object[] objArrMapBindings15 = ViewDataBinding.mapBindings(dataBindingComponent, view, 6, (ViewDataBinding.IncludedLayouts) null, FragmentMistakeNotebookBindingImpl.f6139f);
                    FloatingActionButton floatingActionButton = (FloatingActionButton) objArrMapBindings15[5];
                    LinearLayout linearLayout7 = (LinearLayout) objArrMapBindings15[3];
                    RecyclerView recyclerView2 = (RecyclerView) objArrMapBindings15[2];
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) objArrMapBindings15[1];
                    FragmentMistakeNotebookBindingImpl fragmentMistakeNotebookBindingImpl = new FragmentMistakeNotebookBindingImpl(dataBindingComponent, view, floatingActionButton, linearLayout7, recyclerView2, swipeRefreshLayout2);
                    fragmentMistakeNotebookBindingImpl.f6140e = -1L;
                    ((ConstraintLayout) objArrMapBindings15[0]).setTag(null);
                    fragmentMistakeNotebookBindingImpl.setRootTag(view);
                    fragmentMistakeNotebookBindingImpl.invalidateAll();
                    return fragmentMistakeNotebookBindingImpl;
                case 18:
                    if (!"layout/fragment_note_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_note is invalid. Received: "));
                    }
                    Object[] objArrMapBindings16 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.IncludedLayouts) null, FragmentNoteBindingImpl.f6143d);
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) objArrMapBindings16[2];
                    FragmentNoteBindingImpl fragmentNoteBindingImpl = new FragmentNoteBindingImpl(dataBindingComponent, view, appCompatImageView5, (RecyclerView) objArrMapBindings16[3]);
                    fragmentNoteBindingImpl.f6144c = -1L;
                    ((ScrollView) objArrMapBindings16[0]).setTag(null);
                    fragmentNoteBindingImpl.setRootTag(view);
                    fragmentNoteBindingImpl.invalidateAll();
                    return fragmentNoteBindingImpl;
                case 19:
                    if (!"layout/fragment_original_answer_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_original_answer is invalid. Received: "));
                    }
                    Object[] objArrMapBindings17 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.IncludedLayouts) null, FragmentOriginalAnswerBindingImpl.f6145b);
                    FragmentOriginalAnswerBindingImpl fragmentOriginalAnswerBindingImpl = new FragmentOriginalAnswerBindingImpl(dataBindingComponent, view, 0);
                    fragmentOriginalAnswerBindingImpl.f6146a = -1L;
                    ((RelativeLayout) objArrMapBindings17[0]).setTag(null);
                    fragmentOriginalAnswerBindingImpl.setRootTag(view);
                    fragmentOriginalAnswerBindingImpl.invalidateAll();
                    return fragmentOriginalAnswerBindingImpl;
                case 20:
                    if (!"layout/fragment_revised_answer_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_revised_answer is invalid. Received: "));
                    }
                    Object[] objArrMapBindings18 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.IncludedLayouts) null, FragmentRevisedAnswerBindingImpl.f6147b);
                    FragmentRevisedAnswerBindingImpl fragmentRevisedAnswerBindingImpl = new FragmentRevisedAnswerBindingImpl(dataBindingComponent, view, 0);
                    fragmentRevisedAnswerBindingImpl.f6148a = -1L;
                    ((RelativeLayout) objArrMapBindings18[0]).setTag(null);
                    fragmentRevisedAnswerBindingImpl.setRootTag(view);
                    fragmentRevisedAnswerBindingImpl.invalidateAll();
                    return fragmentRevisedAnswerBindingImpl;
                case 21:
                    if (!"layout/fragment_typical_answer_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for fragment_typical_answer is invalid. Received: "));
                    }
                    Object[] objArrMapBindings19 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.IncludedLayouts) null, FragmentTypicalAnswerBindingImpl.f6149b);
                    FragmentTypicalAnswerBindingImpl fragmentTypicalAnswerBindingImpl = new FragmentTypicalAnswerBindingImpl(dataBindingComponent, view, 0);
                    fragmentTypicalAnswerBindingImpl.f6150a = -1L;
                    ((RelativeLayout) objArrMapBindings19[0]).setTag(null);
                    fragmentTypicalAnswerBindingImpl.setRootTag(view);
                    fragmentTypicalAnswerBindingImpl.invalidateAll();
                    return fragmentTypicalAnswerBindingImpl;
                case 22:
                    if (!"layout/include_mistake_detail_end_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for include_mistake_detail_end is invalid. Received: "));
                    }
                    Object[] objArrMapBindings20 = ViewDataBinding.mapBindings(dataBindingComponent, view, 17, (ViewDataBinding.IncludedLayouts) null, IncludeMistakeDetailEndBindingImpl.f6161l);
                    TextView textView7 = (TextView) objArrMapBindings20[15];
                    TextView textView8 = (TextView) objArrMapBindings20[16];
                    FlowLayout flowLayout3 = (FlowLayout) objArrMapBindings20[9];
                    FlowLayout flowLayout4 = (FlowLayout) objArrMapBindings20[13];
                    FlowLayout flowLayout5 = (FlowLayout) objArrMapBindings20[10];
                    FlowLayout flowLayout6 = (FlowLayout) objArrMapBindings20[12];
                    FlowLayout flowLayout7 = (FlowLayout) objArrMapBindings20[11];
                    TextView textView9 = (TextView) objArrMapBindings20[3];
                    TextView textView10 = (TextView) objArrMapBindings20[8];
                    IncludeMistakeDetailEndBindingImpl includeMistakeDetailEndBindingImpl = new IncludeMistakeDetailEndBindingImpl(dataBindingComponent, view, textView7, textView8, flowLayout3, flowLayout4, flowLayout5, flowLayout6, flowLayout7, textView9, textView10, (TextView) objArrMapBindings20[1]);
                    includeMistakeDetailEndBindingImpl.f6162k = -1L;
                    ((ConstraintLayout) objArrMapBindings20[0]).setTag(null);
                    includeMistakeDetailEndBindingImpl.setRootTag(view);
                    includeMistakeDetailEndBindingImpl.invalidateAll();
                    return includeMistakeDetailEndBindingImpl;
                case 23:
                    if (!"layout/item_list_note_image_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for item_list_note_image is invalid. Received: "));
                    }
                    Object[] objArrMapBindings21 = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.IncludedLayouts) null, ItemListNoteImageBindingImpl.f6163b);
                    ItemListNoteImageBindingImpl itemListNoteImageBindingImpl = new ItemListNoteImageBindingImpl(dataBindingComponent, view, 0);
                    itemListNoteImageBindingImpl.f6164a = -1L;
                    ((FrameLayout) objArrMapBindings21[0]).setTag(null);
                    itemListNoteImageBindingImpl.setRootTag(view);
                    itemListNoteImageBindingImpl.invalidateAll();
                    return itemListNoteImageBindingImpl;
                case 24:
                    if (!"layout/item_micro_sessions_0".equals(tag)) {
                        throw new IllegalArgumentException(AbstractC0037f.m84i(tag, "The tag for item_micro_sessions is invalid. Received: "));
                    }
                    Object[] objArrMapBindings22 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.IncludedLayouts) null, ItemMicroSessionsBindingImpl.f6167d);
                    ImageView imageView14 = (ImageView) objArrMapBindings22[2];
                    ItemMicroSessionsBindingImpl itemMicroSessionsBindingImpl = new ItemMicroSessionsBindingImpl(dataBindingComponent, view, imageView14, (TextView) objArrMapBindings22[4]);
                    itemMicroSessionsBindingImpl.f6168c = -1L;
                    ((CardView) objArrMapBindings22[0]).setTag(null);
                    itemMicroSessionsBindingImpl.setRootTag(view);
                    itemMicroSessionsBindingImpl.invalidateAll();
                    return itemMicroSessionsBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) AbstractC5526b.f8561a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f5741a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
