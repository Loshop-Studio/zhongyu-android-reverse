package com.zykj.study;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.C3721BR;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.databinding.ActivityMainBindingImpl;
import com.zykj.study.databinding.DialogBatchSubscribeDeleteBindingImpl;
import com.zykj.study.databinding.DialogCatalogBindingImpl;
import com.zykj.study.databinding.DialogCourseManageBindingImpl;
import com.zykj.study.databinding.DialogDateSearchBindingImpl;
import com.zykj.study.databinding.DialogExerciseFinishBindingImpl;
import com.zykj.study.databinding.DialogFragmentMicroPlayBindingImpl;
import com.zykj.study.databinding.DialogShowBigImageBindingImpl;
import com.zykj.study.databinding.DialogSingleSubscribeDeleteBindingImpl;
import com.zykj.study.databinding.DialogStatisticBindingImpl;
import com.zykj.study.databinding.FragmentCourseBindingImpl;
import com.zykj.study.databinding.FragmentCourseContentBindingImpl;
import com.zykj.study.databinding.FragmentCourseDetailsBindingImpl;
import com.zykj.study.databinding.FragmentCourseViewBindingImpl;
import com.zykj.study.databinding.FragmentCourseViewCatalogBindingImpl;
import com.zykj.study.databinding.FragmentCourseViewStatisticsBindingImpl;
import com.zykj.study.databinding.FragmentEditCourseBindingImpl;
import com.zykj.study.databinding.FragmentEditUserBindingImpl;
import com.zykj.study.databinding.FragmentExerciseBindingImpl;
import com.zykj.study.databinding.FragmentExerciseFinishDetailBindingImpl;
import com.zykj.study.databinding.FragmentExerciseHistoryBindingImpl;
import com.zykj.study.databinding.FragmentExerciseStatisticsBindingImpl;
import com.zykj.study.databinding.FragmentExerciseStatisticsResultBindingImpl;
import com.zykj.study.databinding.FragmentExerciseStatisticsSingleDetailBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerAreaBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainSingleChoiceBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainSingleChoiceResultFailBindingImpl;
import com.zykj.study.databinding.FragmentExerciseTrainSingleChoiceResultSuccessBindingImpl;
import com.zykj.study.databinding.FragmentExerciseViewerBindingImpl;
import com.zykj.study.databinding.FragmentFindBindingImpl;
import com.zykj.study.databinding.FragmentGuideBindingImpl;
import com.zykj.study.databinding.FragmentHomeBindingImpl;
import com.zykj.study.databinding.FragmentImageShowBindingImpl;
import com.zykj.study.databinding.FragmentMainBindingImpl;
import com.zykj.study.databinding.FragmentManagementSubscribeBindingImpl;
import com.zykj.study.databinding.FragmentMessageBindingImpl;
import com.zykj.study.databinding.FragmentMicroBindingImpl;
import com.zykj.study.databinding.FragmentMicroCropBindingImpl;
import com.zykj.study.databinding.FragmentMicroCropExtraBindingImpl;
import com.zykj.study.databinding.FragmentMicroEditBindingImpl;
import com.zykj.study.databinding.FragmentMicroPlayBindingImpl;
import com.zykj.study.databinding.FragmentMyBindingImpl;
import com.zykj.study.databinding.FragmentMyCourseDetailsBindingImpl;
import com.zykj.study.databinding.FragmentMyProductBindingImpl;
import com.zykj.study.databinding.FragmentOpenFileBindingImpl;
import com.zykj.study.databinding.FragmentPdfBindingImpl;
import com.zykj.study.databinding.FragmentSearchBindingImpl;
import com.zykj.study.databinding.FragmentSearchHistoryBindingImpl;
import com.zykj.study.databinding.FragmentSearchResultBindingImpl;
import com.zykj.study.databinding.FragmentSettingBindingImpl;
import com.zykj.study.databinding.FragmentStudentExercisesBindingImpl;
import com.zykj.study.databinding.FragmentStudentViewBindingImpl;
import com.zykj.study.databinding.FragmentStudentViewContentBindingImpl;
import com.zykj.study.databinding.FragmentStudentViewMemberBindingImpl;
import com.zykj.study.databinding.FragmentStudyBindingImpl;
import com.zykj.study.databinding.FragmentStudyListBindingImpl;
import com.zykj.study.databinding.FragmentStudyProgressBindingImpl;
import com.zykj.study.databinding.FragmentTeachDetailsBindingImpl;
import com.zykj.study.databinding.FragmentTeacherBindingImpl;
import com.zykj.study.databinding.FragmentTeacherCourseAddBindingImpl;
import com.zykj.study.databinding.ItemCatalogGradeBindingImpl;
import com.zykj.study.databinding.ItemCatalogPeriodBindingImpl;
import com.zykj.study.databinding.ItemCatalogSubjectBindingImpl;
import com.zykj.study.databinding.ItemChapterBindingImpl;
import com.zykj.study.databinding.ItemChapterCompleteBindingImpl;
import com.zykj.study.databinding.ItemChapterEditBindingImpl;
import com.zykj.study.databinding.ItemChapterManageBindingImpl;
import com.zykj.study.databinding.ItemChapterProgressBindingImpl;
import com.zykj.study.databinding.ItemChoiceByOptionsBindingImpl;
import com.zykj.study.databinding.ItemCourseBindingImpl;
import com.zykj.study.databinding.ItemCourseDetailsCatalogBindingImpl;
import com.zykj.study.databinding.ItemCourseStatusBindingImpl;
import com.zykj.study.databinding.ItemCourseStatusBtnBindingImpl;
import com.zykj.study.databinding.ItemCourseTeachAddBindingImpl;
import com.zykj.study.databinding.ItemCourseTitleBindingImpl;
import com.zykj.study.databinding.ItemCoverBindingImpl;
import com.zykj.study.databinding.ItemExerciseHistoryBindingImpl;
import com.zykj.study.databinding.ItemExerciseStudentHistoryBindingImpl;
import com.zykj.study.databinding.ItemFreeSubscribeBindingImpl;
import com.zykj.study.databinding.ItemGroupStatisticBindingImpl;
import com.zykj.study.databinding.ItemHistorySearchBindingImpl;
import com.zykj.study.databinding.ItemKnowledgeBindingImpl;
import com.zykj.study.databinding.ItemKnowledgeCompleteBindingImpl;
import com.zykj.study.databinding.ItemKnowledgeEditBindingImpl;
import com.zykj.study.databinding.ItemKnowledgeManageBindingImpl;
import com.zykj.study.databinding.ItemKnowledgeProgressBindingImpl;
import com.zykj.study.databinding.ItemMicroAddBindingImpl;
import com.zykj.study.databinding.ItemMicroBindingImpl;
import com.zykj.study.databinding.ItemMicroEditBindingImpl;
import com.zykj.study.databinding.ItemMicroViewBindingImpl;
import com.zykj.study.databinding.ItemMyCourseBindingImpl;
import com.zykj.study.databinding.ItemMyCourseDetailsCatalogBindingImpl;
import com.zykj.study.databinding.ItemMyTeachCourseBindingImpl;
import com.zykj.study.databinding.ItemStatisticsBindingImpl;
import com.zykj.study.databinding.ItemStuNameBindingImpl;
import com.zykj.study.databinding.ItemStuTabBindingImpl;
import com.zykj.study.databinding.ItemStudentAchievementBindingImpl;
import com.zykj.study.databinding.ItemStudyBindingImpl;
import com.zykj.study.databinding.ItemSubscribeTabBindingImpl;
import com.zykj.study.databinding.ItemSuperviseGroupAddBindingImpl;
import com.zykj.study.databinding.ItemSuperviseGroupMemberBindingImpl;
import com.zykj.study.databinding.ItemSuperviseGroupMemberItemBindingImpl;
import com.zykj.study.databinding.ItemSuperviseGroupMemberSearchBindingImpl;
import com.zykj.study.databinding.ItemTitleListBindingImpl;
import com.zykj.study.databinding.ItemTitleListHeaderBindingImpl;
import com.zykj.study.databinding.LayoutBindViewModelBindingImpl;
import com.zykj.study.databinding.LayoutCourseDetailsCatalogBindingImpl;
import com.zykj.study.databinding.LayoutCourseSynopsisBindingImpl;
import com.zykj.study.databinding.LayoutExerciseAnswerBindingImpl;
import com.zykj.study.databinding.LayoutExerciseAnswerHistoryBindingImpl;
import com.zykj.study.databinding.LayoutExerciseAnswerViewerBindingImpl;
import com.zykj.study.databinding.LayoutExerciseSubjectBindingImpl;
import com.zykj.study.databinding.LayoutFreeSubscriberListBindingImpl;
import com.zykj.study.databinding.LayoutFreeSubscriberListEmptyBindingImpl;
import com.zykj.study.databinding.LayoutMyCourseDetailsCatalogBindingImpl;
import com.zykj.study.databinding.LayoutMyCourseSynopsisBindingImpl;
import com.zykj.study.databinding.LayoutOtherCourseSubscriberListBindingImpl;
import com.zykj.study.databinding.LayoutSelfCourseSubscriberListBindingImpl;
import com.zykj.study.databinding.LayoutStatusErrorBindingImpl;
import com.zykj.study.databinding.ViewAnalysisBindingImpl;
import com.zykj.study.databinding.ViewAnswerMicroBindingImpl;
import com.zykj.study.databinding.ViewChoiceBindingImpl;
import com.zykj.study.databinding.ViewEditAnswerMicroBindingImpl;
import com.zykj.study.databinding.ViewEditAnswerMicroButtonBindingImpl;
import com.zykj.study.databinding.ViewEditChoiceBindingImpl;
import com.zykj.study.databinding.ViewEditChoiceButtonBindingImpl;
import com.zykj.study.databinding.ViewMicroBindingImpl;
import com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBindingImpl;
import com.zykj.study.databinding.ViewMultipleChoiceViewerBindingImpl;
import com.zykj.study.databinding.ViewRightKeyBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f10705a;

    /* renamed from: com.zykj.study.DataBinderMapperImpl$a */
    public static class C7594a {

        /* renamed from: a */
        public static final SparseArray f10706a;

        static {
            SparseArray sparseArray = new SparseArray(61);
            f10706a = sparseArray;
            sparseArray.put(1, "OnClick");
            sparseArray.put(0, "_all");
            sparseArray.put(2, "addClick");
            sparseArray.put(3, "answerStandard");
            sparseArray.put(4, "bean");
            sparseArray.put(5, "clickListener");
            sparseArray.put(6, "closeListener");
            sparseArray.put(7, "data");
            sparseArray.put(8, "deleteClick");
            sparseArray.put(9, "deleteClickListener");
            sparseArray.put(10, "detailsEntity");
            sparseArray.put(11, "dictViewModel");
            sparseArray.put(12, "editCourseViewModel");
            sparseArray.put(13, "enable");
            sparseArray.put(14, "enlargeListener");
            sparseArray.put(15, "entity");
            sparseArray.put(16, "errorMessage");
            sparseArray.put(17, "examClickListener");
            sparseArray.put(18, "exerciseBean");
            sparseArray.put(19, "exerciseTrainViewModel");
            sparseArray.put(20, "fromScore");
            sparseArray.put(21, "group");
            sparseArray.put(22, "index");
            sparseArray.put(23, "isChild");
            sparseArray.put(24, "isDataEmpty");
            sparseArray.put(25, "isDialogVisible");
            sparseArray.put(26, "isEmpty");
            sparseArray.put(27, "isLeaf");
            sparseArray.put(28, "isSelected");
            sparseArray.put(29, "isTeacher");
            sparseArray.put(30, "loginViewModel");
            sparseArray.put(31, "menuClick");
            sparseArray.put(32, "microViewModel");
            sparseArray.put(33, "mobile");
            sparseArray.put(34, "narrowListener");
            sparseArray.put(35, "needShowPatch");
            sparseArray.put(36, "onArrowClick");
            sparseArray.put(37, "onClick");
            sparseArray.put(38, "onClickManage");
            sparseArray.put(39, "onclick");
            sparseArray.put(40, "people");
            sparseArray.put(41, "playClick");
            sparseArray.put(42, "questionType");
            sparseArray.put(43, "searchViewModel");
            sparseArray.put(44, "settingViewModel");
            sparseArray.put(45, "silence");
            sparseArray.put(46, "snapshotUrl");
            sparseArray.put(47, "tailoringListener");
            sparseArray.put(48, "text");
            sparseArray.put(49, "tinkerId");
            sparseArray.put(50, "title");
            sparseArray.put(51, "toastLiveData");
            sparseArray.put(52, "totalMember");
            sparseArray.put(53, "trainViewModel");
            sparseArray.put(54, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            sparseArray.put(55, "userBean");
            sparseArray.put(56, "userInfo");
            sparseArray.put(57, "versionName");
            sparseArray.put(58, "versionViewModel");
            sparseArray.put(59, "viewModel");
            sparseArray.put(60, "webViewControlViewModel");
        }
    }

    /* renamed from: com.zykj.study.DataBinderMapperImpl$b */
    public static class C7595b {

        /* renamed from: a */
        public static final HashMap f10707a;

        static {
            HashMap map = new HashMap(136);
            f10707a = map;
            map.put("layout/activity_main_0", Integer.valueOf(R$layout.activity_main));
            map.put("layout/dialog_batch_subscribe_delete_0", Integer.valueOf(R$layout.dialog_batch_subscribe_delete));
            map.put("layout/dialog_catalog_0", Integer.valueOf(R$layout.dialog_catalog));
            map.put("layout/dialog_course_manage_0", Integer.valueOf(R$layout.dialog_course_manage));
            map.put("layout/dialog_date_search_0", Integer.valueOf(R$layout.dialog_date_search));
            map.put("layout/dialog_exercise_finish_0", Integer.valueOf(R$layout.dialog_exercise_finish));
            map.put("layout/dialog_fragment_micro_play_0", Integer.valueOf(R$layout.dialog_fragment_micro_play));
            map.put("layout/dialog_show_big_image_0", Integer.valueOf(R$layout.dialog_show_big_image));
            map.put("layout/dialog_single_subscribe_delete_0", Integer.valueOf(R$layout.dialog_single_subscribe_delete));
            map.put("layout/dialog_statistic_0", Integer.valueOf(R$layout.dialog_statistic));
            map.put("layout/fragment_course_0", Integer.valueOf(R$layout.fragment_course));
            map.put("layout/fragment_course_content_0", Integer.valueOf(R$layout.fragment_course_content));
            map.put("layout/fragment_course_details_0", Integer.valueOf(R$layout.fragment_course_details));
            map.put("layout/fragment_course_view_0", Integer.valueOf(R$layout.fragment_course_view));
            map.put("layout/fragment_course_view_catalog_0", Integer.valueOf(R$layout.fragment_course_view_catalog));
            map.put("layout/fragment_course_view_statistics_0", Integer.valueOf(R$layout.fragment_course_view_statistics));
            map.put("layout/fragment_edit_course_0", Integer.valueOf(R$layout.fragment_edit_course));
            map.put("layout/fragment_edit_user_0", Integer.valueOf(R$layout.fragment_edit_user));
            map.put("layout/fragment_exercise_0", Integer.valueOf(R$layout.fragment_exercise));
            map.put("layout/fragment_exercise_finish_detail_0", Integer.valueOf(R$layout.fragment_exercise_finish_detail));
            map.put("layout/fragment_exercise_history_0", Integer.valueOf(R$layout.fragment_exercise_history));
            map.put("layout/fragment_exercise_statistics_0", Integer.valueOf(R$layout.fragment_exercise_statistics));
            map.put("layout/fragment_exercise_statistics_result_0", Integer.valueOf(R$layout.fragment_exercise_statistics_result));
            map.put("layout/fragment_exercise_statistics_single_detail_0", Integer.valueOf(R$layout.fragment_exercise_statistics_single_detail));
            map.put("layout/fragment_exercise_train_0", Integer.valueOf(R$layout.fragment_exercise_train));
            map.put("layout/fragment_exercise_train_answer_0", Integer.valueOf(R$layout.fragment_exercise_train_answer));
            map.put("layout/fragment_exercise_train_answer_area_0", Integer.valueOf(R$layout.fragment_exercise_train_answer_area));
            map.put("layout/fragment_exercise_train_answer_result_0", Integer.valueOf(R$layout.fragment_exercise_train_answer_result));
            map.put("layout/fragment_exercise_train_multiple_choice_0", Integer.valueOf(R$layout.fragment_exercise_train_multiple_choice));
            map.put("layout/fragment_exercise_train_multiple_choice_result_fail_0", Integer.valueOf(R$layout.fragment_exercise_train_multiple_choice_result_fail));
            map.put("layout/fragment_exercise_train_multiple_choice_result_success_0", Integer.valueOf(R$layout.fragment_exercise_train_multiple_choice_result_success));
            map.put("layout/fragment_exercise_train_single_choice_0", Integer.valueOf(R$layout.fragment_exercise_train_single_choice));
            map.put("layout/fragment_exercise_train_single_choice_result_fail_0", Integer.valueOf(R$layout.fragment_exercise_train_single_choice_result_fail));
            map.put("layout/fragment_exercise_train_single_choice_result_success_0", Integer.valueOf(R$layout.fragment_exercise_train_single_choice_result_success));
            map.put("layout/fragment_exercise_viewer_0", Integer.valueOf(R$layout.fragment_exercise_viewer));
            map.put("layout/fragment_find_0", Integer.valueOf(R$layout.fragment_find));
            map.put("layout/fragment_guide_0", Integer.valueOf(R$layout.fragment_guide));
            map.put("layout/fragment_home_0", Integer.valueOf(R$layout.fragment_home));
            map.put("layout/fragment_image_show_0", Integer.valueOf(R$layout.fragment_image_show));
            map.put("layout/fragment_main_0", Integer.valueOf(R$layout.fragment_main));
            map.put("layout/fragment_management_subscribe_0", Integer.valueOf(R$layout.fragment_management_subscribe));
            map.put("layout/fragment_message_0", Integer.valueOf(R$layout.fragment_message));
            map.put("layout/fragment_micro_0", Integer.valueOf(R$layout.fragment_micro));
            map.put("layout/fragment_micro_crop_0", Integer.valueOf(R$layout.fragment_micro_crop));
            map.put("layout/fragment_micro_crop_extra_0", Integer.valueOf(R$layout.fragment_micro_crop_extra));
            map.put("layout/fragment_micro_edit_0", Integer.valueOf(R$layout.fragment_micro_edit));
            map.put("layout/fragment_micro_play_0", Integer.valueOf(R$layout.fragment_micro_play));
            map.put("layout/fragment_my_0", Integer.valueOf(R$layout.fragment_my));
            map.put("layout/fragment_my_course_details_0", Integer.valueOf(R$layout.fragment_my_course_details));
            map.put("layout/fragment_my_product_0", Integer.valueOf(R$layout.fragment_my_product));
            map.put("layout/fragment_open_file_0", Integer.valueOf(R$layout.fragment_open_file));
            map.put("layout/fragment_pdf_0", Integer.valueOf(R$layout.fragment_pdf));
            map.put("layout/fragment_search_0", Integer.valueOf(R$layout.fragment_search));
            map.put("layout/fragment_search_history_0", Integer.valueOf(R$layout.fragment_search_history));
            map.put("layout/fragment_search_result_0", Integer.valueOf(R$layout.fragment_search_result));
            map.put("layout/fragment_setting_0", Integer.valueOf(R$layout.fragment_setting));
            map.put("layout/fragment_student_exercises_0", Integer.valueOf(R$layout.fragment_student_exercises));
            map.put("layout/fragment_student_view_0", Integer.valueOf(R$layout.fragment_student_view));
            map.put("layout/fragment_student_view_content_0", Integer.valueOf(R$layout.fragment_student_view_content));
            map.put("layout/fragment_student_view_member_0", Integer.valueOf(R$layout.fragment_student_view_member));
            map.put("layout/fragment_study_0", Integer.valueOf(R$layout.fragment_study));
            map.put("layout/fragment_study_list_0", Integer.valueOf(R$layout.fragment_study_list));
            map.put("layout/fragment_study_progress_0", Integer.valueOf(R$layout.fragment_study_progress));
            map.put("layout/fragment_teach_details_0", Integer.valueOf(R$layout.fragment_teach_details));
            map.put("layout/fragment_teacher_0", Integer.valueOf(R$layout.fragment_teacher));
            map.put("layout/fragment_teacher_course_add_0", Integer.valueOf(R$layout.fragment_teacher_course_add));
            map.put("layout/item_catalog_grade_0", Integer.valueOf(R$layout.item_catalog_grade));
            map.put("layout/item_catalog_period_0", Integer.valueOf(R$layout.item_catalog_period));
            map.put("layout/item_catalog_subject_0", Integer.valueOf(R$layout.item_catalog_subject));
            map.put("layout/item_chapter_0", Integer.valueOf(R$layout.item_chapter));
            map.put("layout/item_chapter_complete_0", Integer.valueOf(R$layout.item_chapter_complete));
            map.put("layout/item_chapter_edit_0", Integer.valueOf(R$layout.item_chapter_edit));
            map.put("layout/item_chapter_manage_0", Integer.valueOf(R$layout.item_chapter_manage));
            map.put("layout/item_chapter_progress_0", Integer.valueOf(R$layout.item_chapter_progress));
            map.put("layout/item_choice_by_options_0", Integer.valueOf(R$layout.item_choice_by_options));
            map.put("layout/item_course_0", Integer.valueOf(R$layout.item_course));
            map.put("layout/item_course_details_catalog_0", Integer.valueOf(R$layout.item_course_details_catalog));
            map.put("layout/item_course_status_0", Integer.valueOf(R$layout.item_course_status));
            map.put("layout/item_course_status_btn_0", Integer.valueOf(R$layout.item_course_status_btn));
            map.put("layout/item_course_teach_add_0", Integer.valueOf(R$layout.item_course_teach_add));
            map.put("layout/item_course_title_0", Integer.valueOf(R$layout.item_course_title));
            map.put("layout/item_cover_0", Integer.valueOf(R$layout.item_cover));
            map.put("layout/item_exercise_history_0", Integer.valueOf(R$layout.item_exercise_history));
            map.put("layout/item_exercise_student_history_0", Integer.valueOf(R$layout.item_exercise_student_history));
            map.put("layout/item_free_subscribe_0", Integer.valueOf(R$layout.item_free_subscribe));
            map.put("layout/item_group_statistic_0", Integer.valueOf(R$layout.item_group_statistic));
            map.put("layout/item_history_search_0", Integer.valueOf(R$layout.item_history_search));
            map.put("layout/item_knowledge_0", Integer.valueOf(R$layout.item_knowledge));
            map.put("layout/item_knowledge_complete_0", Integer.valueOf(R$layout.item_knowledge_complete));
            map.put("layout/item_knowledge_edit_0", Integer.valueOf(R$layout.item_knowledge_edit));
            map.put("layout/item_knowledge_manage_0", Integer.valueOf(R$layout.item_knowledge_manage));
            map.put("layout/item_knowledge_progress_0", Integer.valueOf(R$layout.item_knowledge_progress));
            map.put("layout/item_micro_0", Integer.valueOf(R$layout.item_micro));
            map.put("layout/item_micro_add_0", Integer.valueOf(R$layout.item_micro_add));
            map.put("layout/item_micro_edit_0", Integer.valueOf(R$layout.item_micro_edit));
            map.put("layout/item_micro_view_0", Integer.valueOf(R$layout.item_micro_view));
            map.put("layout/item_my_course_0", Integer.valueOf(R$layout.item_my_course));
            map.put("layout/item_my_course_details_catalog_0", Integer.valueOf(R$layout.item_my_course_details_catalog));
            map.put("layout/item_my_teach_course_0", Integer.valueOf(R$layout.item_my_teach_course));
            map.put("layout/item_statistics_0", Integer.valueOf(R$layout.item_statistics));
            map.put("layout/item_stu_name_0", Integer.valueOf(R$layout.item_stu_name));
            map.put("layout/item_stu_tab_0", Integer.valueOf(R$layout.item_stu_tab));
            map.put("layout/item_student_achievement_0", Integer.valueOf(R$layout.item_student_achievement));
            map.put("layout/item_study_0", Integer.valueOf(R$layout.item_study));
            map.put("layout/item_subscribe_tab_0", Integer.valueOf(R$layout.item_subscribe_tab));
            map.put("layout/item_supervise_group_add_0", Integer.valueOf(R$layout.item_supervise_group_add));
            map.put("layout/item_supervise_group_member_0", Integer.valueOf(R$layout.item_supervise_group_member));
            map.put("layout/item_supervise_group_member_item_0", Integer.valueOf(R$layout.item_supervise_group_member_item));
            map.put("layout/item_supervise_group_member_search_0", Integer.valueOf(R$layout.item_supervise_group_member_search));
            map.put("layout/item_title_list_0", Integer.valueOf(R$layout.item_title_list));
            map.put("layout/item_title_list_header_0", Integer.valueOf(R$layout.item_title_list_header));
            map.put("layout/layout_bind_view_model_0", Integer.valueOf(R$layout.layout_bind_view_model));
            map.put("layout/layout_course_details_catalog_0", Integer.valueOf(R$layout.layout_course_details_catalog));
            map.put("layout/layout_course_synopsis_0", Integer.valueOf(R$layout.layout_course_synopsis));
            map.put("layout/layout_exercise_answer_0", Integer.valueOf(R$layout.layout_exercise_answer));
            map.put("layout/layout_exercise_answer_history_0", Integer.valueOf(R$layout.layout_exercise_answer_history));
            map.put("layout/layout_exercise_answer_viewer_0", Integer.valueOf(R$layout.layout_exercise_answer_viewer));
            map.put("layout/layout_exercise_subject_0", Integer.valueOf(R$layout.layout_exercise_subject));
            map.put("layout/layout_free_subscriber_list_0", Integer.valueOf(R$layout.layout_free_subscriber_list));
            map.put("layout/layout_free_subscriber_list_empty_0", Integer.valueOf(R$layout.layout_free_subscriber_list_empty));
            map.put("layout/layout_my_course_details_catalog_0", Integer.valueOf(R$layout.layout_my_course_details_catalog));
            map.put("layout/layout_my_course_synopsis_0", Integer.valueOf(R$layout.layout_my_course_synopsis));
            map.put("layout/layout_other_course_subscriber_list_0", Integer.valueOf(R$layout.layout_other_course_subscriber_list));
            map.put("layout/layout_self_course_subscriber_list_0", Integer.valueOf(R$layout.layout_self_course_subscriber_list));
            map.put("layout/layout_status_error_0", Integer.valueOf(R$layout.layout_status_error));
            map.put("layout/view_analysis_0", Integer.valueOf(R$layout.view_analysis));
            map.put("layout/view_answer_micro_0", Integer.valueOf(R$layout.view_answer_micro));
            map.put("layout/view_choice_0", Integer.valueOf(R$layout.view_choice));
            map.put("layout/view_edit_answer_micro_0", Integer.valueOf(R$layout.view_edit_answer_micro));
            map.put("layout/view_edit_answer_micro_button_0", Integer.valueOf(R$layout.view_edit_answer_micro_button));
            map.put("layout/view_edit_choice_0", Integer.valueOf(R$layout.view_edit_choice));
            map.put("layout/view_edit_choice_button_0", Integer.valueOf(R$layout.view_edit_choice_button));
            map.put("layout/view_micro_0", Integer.valueOf(R$layout.view_micro));
            map.put("layout/view_multiple_choice_animation_viewer_0", Integer.valueOf(R$layout.view_multiple_choice_animation_viewer));
            map.put("layout/view_multiple_choice_viewer_0", Integer.valueOf(R$layout.view_multiple_choice_viewer));
            map.put("layout/view_right_key_0", Integer.valueOf(R$layout.view_right_key));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(136);
        f10705a = sparseIntArray;
        sparseIntArray.put(R$layout.activity_main, 1);
        sparseIntArray.put(R$layout.dialog_batch_subscribe_delete, 2);
        sparseIntArray.put(R$layout.dialog_catalog, 3);
        sparseIntArray.put(R$layout.dialog_course_manage, 4);
        sparseIntArray.put(R$layout.dialog_date_search, 5);
        sparseIntArray.put(R$layout.dialog_exercise_finish, 6);
        sparseIntArray.put(R$layout.dialog_fragment_micro_play, 7);
        sparseIntArray.put(R$layout.dialog_show_big_image, 8);
        sparseIntArray.put(R$layout.dialog_single_subscribe_delete, 9);
        sparseIntArray.put(R$layout.dialog_statistic, 10);
        sparseIntArray.put(R$layout.fragment_course, 11);
        sparseIntArray.put(R$layout.fragment_course_content, 12);
        sparseIntArray.put(R$layout.fragment_course_details, 13);
        sparseIntArray.put(R$layout.fragment_course_view, 14);
        sparseIntArray.put(R$layout.fragment_course_view_catalog, 15);
        sparseIntArray.put(R$layout.fragment_course_view_statistics, 16);
        sparseIntArray.put(R$layout.fragment_edit_course, 17);
        sparseIntArray.put(R$layout.fragment_edit_user, 18);
        sparseIntArray.put(R$layout.fragment_exercise, 19);
        sparseIntArray.put(R$layout.fragment_exercise_finish_detail, 20);
        sparseIntArray.put(R$layout.fragment_exercise_history, 21);
        sparseIntArray.put(R$layout.fragment_exercise_statistics, 22);
        sparseIntArray.put(R$layout.fragment_exercise_statistics_result, 23);
        sparseIntArray.put(R$layout.fragment_exercise_statistics_single_detail, 24);
        sparseIntArray.put(R$layout.fragment_exercise_train, 25);
        sparseIntArray.put(R$layout.fragment_exercise_train_answer, 26);
        sparseIntArray.put(R$layout.fragment_exercise_train_answer_area, 27);
        sparseIntArray.put(R$layout.fragment_exercise_train_answer_result, 28);
        sparseIntArray.put(R$layout.fragment_exercise_train_multiple_choice, 29);
        sparseIntArray.put(R$layout.fragment_exercise_train_multiple_choice_result_fail, 30);
        sparseIntArray.put(R$layout.fragment_exercise_train_multiple_choice_result_success, 31);
        sparseIntArray.put(R$layout.fragment_exercise_train_single_choice, 32);
        sparseIntArray.put(R$layout.fragment_exercise_train_single_choice_result_fail, 33);
        sparseIntArray.put(R$layout.fragment_exercise_train_single_choice_result_success, 34);
        sparseIntArray.put(R$layout.fragment_exercise_viewer, 35);
        sparseIntArray.put(R$layout.fragment_find, 36);
        sparseIntArray.put(R$layout.fragment_guide, 37);
        sparseIntArray.put(R$layout.fragment_home, 38);
        sparseIntArray.put(R$layout.fragment_image_show, 39);
        sparseIntArray.put(R$layout.fragment_main, 40);
        sparseIntArray.put(R$layout.fragment_management_subscribe, 41);
        sparseIntArray.put(R$layout.fragment_message, 42);
        sparseIntArray.put(R$layout.fragment_micro, 43);
        sparseIntArray.put(R$layout.fragment_micro_crop, 44);
        sparseIntArray.put(R$layout.fragment_micro_crop_extra, 45);
        sparseIntArray.put(R$layout.fragment_micro_edit, 46);
        sparseIntArray.put(R$layout.fragment_micro_play, 47);
        sparseIntArray.put(R$layout.fragment_my, 48);
        sparseIntArray.put(R$layout.fragment_my_course_details, 49);
        sparseIntArray.put(R$layout.fragment_my_product, 50);
        sparseIntArray.put(R$layout.fragment_open_file, 51);
        sparseIntArray.put(R$layout.fragment_pdf, 52);
        sparseIntArray.put(R$layout.fragment_search, 53);
        sparseIntArray.put(R$layout.fragment_search_history, 54);
        sparseIntArray.put(R$layout.fragment_search_result, 55);
        sparseIntArray.put(R$layout.fragment_setting, 56);
        sparseIntArray.put(R$layout.fragment_student_exercises, 57);
        sparseIntArray.put(R$layout.fragment_student_view, 58);
        sparseIntArray.put(R$layout.fragment_student_view_content, 59);
        sparseIntArray.put(R$layout.fragment_student_view_member, 60);
        sparseIntArray.put(R$layout.fragment_study, 61);
        sparseIntArray.put(R$layout.fragment_study_list, 62);
        sparseIntArray.put(R$layout.fragment_study_progress, 63);
        sparseIntArray.put(R$layout.fragment_teach_details, 64);
        sparseIntArray.put(R$layout.fragment_teacher, 65);
        sparseIntArray.put(R$layout.fragment_teacher_course_add, 66);
        sparseIntArray.put(R$layout.item_catalog_grade, 67);
        sparseIntArray.put(R$layout.item_catalog_period, 68);
        sparseIntArray.put(R$layout.item_catalog_subject, 69);
        sparseIntArray.put(R$layout.item_chapter, 70);
        sparseIntArray.put(R$layout.item_chapter_complete, 71);
        sparseIntArray.put(R$layout.item_chapter_edit, 72);
        sparseIntArray.put(R$layout.item_chapter_manage, 73);
        sparseIntArray.put(R$layout.item_chapter_progress, 74);
        sparseIntArray.put(R$layout.item_choice_by_options, 75);
        sparseIntArray.put(R$layout.item_course, 76);
        sparseIntArray.put(R$layout.item_course_details_catalog, 77);
        sparseIntArray.put(R$layout.item_course_status, 78);
        sparseIntArray.put(R$layout.item_course_status_btn, 79);
        sparseIntArray.put(R$layout.item_course_teach_add, 80);
        sparseIntArray.put(R$layout.item_course_title, 81);
        sparseIntArray.put(R$layout.item_cover, 82);
        sparseIntArray.put(R$layout.item_exercise_history, 83);
        sparseIntArray.put(R$layout.item_exercise_student_history, 84);
        sparseIntArray.put(R$layout.item_free_subscribe, 85);
        sparseIntArray.put(R$layout.item_group_statistic, 86);
        sparseIntArray.put(R$layout.item_history_search, 87);
        sparseIntArray.put(R$layout.item_knowledge, 88);
        sparseIntArray.put(R$layout.item_knowledge_complete, 89);
        sparseIntArray.put(R$layout.item_knowledge_edit, 90);
        sparseIntArray.put(R$layout.item_knowledge_manage, 91);
        sparseIntArray.put(R$layout.item_knowledge_progress, 92);
        sparseIntArray.put(R$layout.item_micro, 93);
        sparseIntArray.put(R$layout.item_micro_add, 94);
        sparseIntArray.put(R$layout.item_micro_edit, 95);
        sparseIntArray.put(R$layout.item_micro_view, 96);
        sparseIntArray.put(R$layout.item_my_course, 97);
        sparseIntArray.put(R$layout.item_my_course_details_catalog, 98);
        sparseIntArray.put(R$layout.item_my_teach_course, 99);
        sparseIntArray.put(R$layout.item_statistics, 100);
        sparseIntArray.put(R$layout.item_stu_name, 101);
        sparseIntArray.put(R$layout.item_stu_tab, 102);
        sparseIntArray.put(R$layout.item_student_achievement, TbsListener.ErrorCode.READ_RESPONSE_ERROR);
        sparseIntArray.put(R$layout.item_study, 104);
        sparseIntArray.put(R$layout.item_subscribe_tab, TbsListener.ErrorCode.DISK_FULL);
        sparseIntArray.put(R$layout.item_supervise_group_add, TbsListener.ErrorCode.FILE_DELETED);
        sparseIntArray.put(R$layout.item_supervise_group_member, TbsListener.ErrorCode.UNKNOWN_ERROR);
        sparseIntArray.put(R$layout.item_supervise_group_member_item, 108);
        sparseIntArray.put(R$layout.item_supervise_group_member_search, 109);
        sparseIntArray.put(R$layout.item_title_list, 110);
        sparseIntArray.put(R$layout.item_title_list_header, TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR);
        sparseIntArray.put(R$layout.layout_bind_view_model, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW);
        sparseIntArray.put(R$layout.layout_course_details_catalog, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH);
        sparseIntArray.put(R$layout.layout_course_synopsis, 114);
        sparseIntArray.put(R$layout.layout_exercise_answer, 115);
        sparseIntArray.put(R$layout.layout_exercise_answer_history, 116);
        sparseIntArray.put(R$layout.layout_exercise_answer_viewer, 117);
        sparseIntArray.put(R$layout.layout_exercise_subject, 118);
        sparseIntArray.put(R$layout.layout_free_subscriber_list, 119);
        sparseIntArray.put(R$layout.layout_free_subscriber_list_empty, 120);
        sparseIntArray.put(R$layout.layout_my_course_details_catalog, TbsListener.ErrorCode.THREAD_INIT_ERROR);
        sparseIntArray.put(R$layout.layout_my_course_synopsis, 122);
        sparseIntArray.put(R$layout.layout_other_course_subscriber_list, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED);
        sparseIntArray.put(R$layout.layout_self_course_subscriber_list, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY);
        sparseIntArray.put(R$layout.layout_status_error, TbsListener.ErrorCode.DOWNLOAD_THROWABLE);
        sparseIntArray.put(R$layout.view_analysis, 126);
        sparseIntArray.put(R$layout.view_answer_micro, 127);
        sparseIntArray.put(R$layout.view_choice, 128);
        sparseIntArray.put(R$layout.view_edit_answer_micro, 129);
        sparseIntArray.put(R$layout.view_edit_answer_micro_button, 130);
        sparseIntArray.put(R$layout.view_edit_choice, 131);
        sparseIntArray.put(R$layout.view_edit_choice_button, 132);
        sparseIntArray.put(R$layout.view_micro, 133);
        sparseIntArray.put(R$layout.view_multiple_choice_animation_viewer, 134);
        sparseIntArray.put(R$layout.view_multiple_choice_viewer, 135);
        sparseIntArray.put(R$layout.view_right_key, 136);
    }

    /* renamed from: a */
    public final ViewDataBinding m9797a(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_main_0".equals(obj)) {
                    return new ActivityMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + obj);
            case 2:
                if ("layout/dialog_batch_subscribe_delete_0".equals(obj)) {
                    return new DialogBatchSubscribeDeleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_batch_subscribe_delete is invalid. Received: " + obj);
            case 3:
                if ("layout/dialog_catalog_0".equals(obj)) {
                    return new DialogCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_catalog is invalid. Received: " + obj);
            case 4:
                if ("layout/dialog_course_manage_0".equals(obj)) {
                    return new DialogCourseManageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_course_manage is invalid. Received: " + obj);
            case 5:
                if ("layout/dialog_date_search_0".equals(obj)) {
                    return new DialogDateSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_date_search is invalid. Received: " + obj);
            case 6:
                if ("layout/dialog_exercise_finish_0".equals(obj)) {
                    return new DialogExerciseFinishBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_exercise_finish is invalid. Received: " + obj);
            case 7:
                if ("layout/dialog_fragment_micro_play_0".equals(obj)) {
                    return new DialogFragmentMicroPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_micro_play is invalid. Received: " + obj);
            case 8:
                if ("layout/dialog_show_big_image_0".equals(obj)) {
                    return new DialogShowBigImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_show_big_image is invalid. Received: " + obj);
            case 9:
                if ("layout/dialog_single_subscribe_delete_0".equals(obj)) {
                    return new DialogSingleSubscribeDeleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_single_subscribe_delete is invalid. Received: " + obj);
            case 10:
                if ("layout/dialog_statistic_0".equals(obj)) {
                    return new DialogStatisticBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_statistic is invalid. Received: " + obj);
            case 11:
                if ("layout/fragment_course_0".equals(obj)) {
                    return new FragmentCourseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course is invalid. Received: " + obj);
            case 12:
                if ("layout/fragment_course_content_0".equals(obj)) {
                    return new FragmentCourseContentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course_content is invalid. Received: " + obj);
            case 13:
                if ("layout/fragment_course_details_0".equals(obj)) {
                    return new FragmentCourseDetailsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course_details is invalid. Received: " + obj);
            case 14:
                if ("layout/fragment_course_view_0".equals(obj)) {
                    return new FragmentCourseViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course_view is invalid. Received: " + obj);
            case 15:
                if ("layout/fragment_course_view_catalog_0".equals(obj)) {
                    return new FragmentCourseViewCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course_view_catalog is invalid. Received: " + obj);
            case 16:
                if ("layout/fragment_course_view_statistics_0".equals(obj)) {
                    return new FragmentCourseViewStatisticsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_course_view_statistics is invalid. Received: " + obj);
            case 17:
                if ("layout/fragment_edit_course_0".equals(obj)) {
                    return new FragmentEditCourseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_edit_course is invalid. Received: " + obj);
            case 18:
                if ("layout/fragment_edit_user_0".equals(obj)) {
                    return new FragmentEditUserBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_edit_user is invalid. Received: " + obj);
            case 19:
                if ("layout/fragment_exercise_0".equals(obj)) {
                    return new FragmentExerciseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise is invalid. Received: " + obj);
            case 20:
                if ("layout/fragment_exercise_finish_detail_0".equals(obj)) {
                    return new FragmentExerciseFinishDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_finish_detail is invalid. Received: " + obj);
            case 21:
                if ("layout/fragment_exercise_history_0".equals(obj)) {
                    return new FragmentExerciseHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_history is invalid. Received: " + obj);
            case 22:
                if ("layout/fragment_exercise_statistics_0".equals(obj)) {
                    return new FragmentExerciseStatisticsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_statistics is invalid. Received: " + obj);
            case 23:
                if ("layout/fragment_exercise_statistics_result_0".equals(obj)) {
                    return new FragmentExerciseStatisticsResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_statistics_result is invalid. Received: " + obj);
            case 24:
                if ("layout/fragment_exercise_statistics_single_detail_0".equals(obj)) {
                    return new FragmentExerciseStatisticsSingleDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_statistics_single_detail is invalid. Received: " + obj);
            case 25:
                if ("layout/fragment_exercise_train_0".equals(obj)) {
                    return new FragmentExerciseTrainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train is invalid. Received: " + obj);
            case 26:
                if ("layout/fragment_exercise_train_answer_0".equals(obj)) {
                    return new FragmentExerciseTrainAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_answer is invalid. Received: " + obj);
            case 27:
                if ("layout/fragment_exercise_train_answer_area_0".equals(obj)) {
                    return new FragmentExerciseTrainAnswerAreaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_answer_area is invalid. Received: " + obj);
            case 28:
                if ("layout/fragment_exercise_train_answer_result_0".equals(obj)) {
                    return new FragmentExerciseTrainAnswerResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_answer_result is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_exercise_train_multiple_choice_0".equals(obj)) {
                    return new FragmentExerciseTrainMultipleChoiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_multiple_choice is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_exercise_train_multiple_choice_result_fail_0".equals(obj)) {
                    return new FragmentExerciseTrainMultipleChoiceResultFailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_multiple_choice_result_fail is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_exercise_train_multiple_choice_result_success_0".equals(obj)) {
                    return new FragmentExerciseTrainMultipleChoiceResultSuccessBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_multiple_choice_result_success is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_exercise_train_single_choice_0".equals(obj)) {
                    return new FragmentExerciseTrainSingleChoiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_single_choice is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_exercise_train_single_choice_result_fail_0".equals(obj)) {
                    return new FragmentExerciseTrainSingleChoiceResultFailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_single_choice_result_fail is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_exercise_train_single_choice_result_success_0".equals(obj)) {
                    return new FragmentExerciseTrainSingleChoiceResultSuccessBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_train_single_choice_result_success is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_exercise_viewer_0".equals(obj)) {
                    return new FragmentExerciseViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_exercise_viewer is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_find_0".equals(obj)) {
                    return new FragmentFindBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_find is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_guide_0".equals(obj)) {
                    return new FragmentGuideBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_guide is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_home_0".equals(obj)) {
                    return new FragmentHomeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_image_show_0".equals(obj)) {
                    return new FragmentImageShowBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_image_show is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_main_0".equals(obj)) {
                    return new FragmentMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_management_subscribe_0".equals(obj)) {
                    return new FragmentManagementSubscribeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_management_subscribe is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_message_0".equals(obj)) {
                    return new FragmentMessageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_message is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_micro_0".equals(obj)) {
                    return new FragmentMicroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_micro is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_micro_crop_0".equals(obj)) {
                    return new FragmentMicroCropBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_micro_crop is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_micro_crop_extra_0".equals(obj)) {
                    return new FragmentMicroCropExtraBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_micro_crop_extra is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_micro_edit_0".equals(obj)) {
                    return new FragmentMicroEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_micro_edit is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_micro_play_0".equals(obj)) {
                    return new FragmentMicroPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_micro_play is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_my_0".equals(obj)) {
                    return new FragmentMyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_my is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_my_course_details_0".equals(obj)) {
                    return new FragmentMyCourseDetailsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_my_course_details is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_my_product_0".equals(obj)) {
                    return new FragmentMyProductBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_my_product is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public final ViewDataBinding m9798b(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/fragment_open_file_0".equals(obj)) {
                    return new FragmentOpenFileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_open_file is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_pdf_0".equals(obj)) {
                    return new FragmentPdfBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pdf is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_search_0".equals(obj)) {
                    return new FragmentSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_search_history_0".equals(obj)) {
                    return new FragmentSearchHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_search_history is invalid. Received: " + obj);
            case 55:
                if ("layout/fragment_search_result_0".equals(obj)) {
                    return new FragmentSearchResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_search_result is invalid. Received: " + obj);
            case C3721BR.userInfo /* 56 */:
                if ("layout/fragment_setting_0".equals(obj)) {
                    return new FragmentSettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + obj);
            case C3721BR.versionName /* 57 */:
                if ("layout/fragment_student_exercises_0".equals(obj)) {
                    return new FragmentStudentExercisesBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_student_exercises is invalid. Received: " + obj);
            case C3721BR.versionViewModel /* 58 */:
                if ("layout/fragment_student_view_0".equals(obj)) {
                    return new FragmentStudentViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_student_view is invalid. Received: " + obj);
            case C3721BR.viewModel /* 59 */:
                if ("layout/fragment_student_view_content_0".equals(obj)) {
                    return new FragmentStudentViewContentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_student_view_content is invalid. Received: " + obj);
            case C3721BR.webViewControlViewModel /* 60 */:
                if ("layout/fragment_student_view_member_0".equals(obj)) {
                    return new FragmentStudentViewMemberBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_student_view_member is invalid. Received: " + obj);
            case 61:
                if ("layout/fragment_study_0".equals(obj)) {
                    return new FragmentStudyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_study is invalid. Received: " + obj);
            case 62:
                if ("layout/fragment_study_list_0".equals(obj)) {
                    return new FragmentStudyListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_study_list is invalid. Received: " + obj);
            case 63:
                if ("layout/fragment_study_progress_0".equals(obj)) {
                    return new FragmentStudyProgressBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_study_progress is invalid. Received: " + obj);
            case 64:
                if ("layout/fragment_teach_details_0".equals(obj)) {
                    return new FragmentTeachDetailsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_teach_details is invalid. Received: " + obj);
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                if ("layout/fragment_teacher_0".equals(obj)) {
                    return new FragmentTeacherBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_teacher is invalid. Received: " + obj);
            case 66:
                if ("layout/fragment_teacher_course_add_0".equals(obj)) {
                    return new FragmentTeacherCourseAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_teacher_course_add is invalid. Received: " + obj);
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if ("layout/item_catalog_grade_0".equals(obj)) {
                    return new ItemCatalogGradeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_catalog_grade is invalid. Received: " + obj);
            case 68:
                if ("layout/item_catalog_period_0".equals(obj)) {
                    return new ItemCatalogPeriodBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_catalog_period is invalid. Received: " + obj);
            case 69:
                if ("layout/item_catalog_subject_0".equals(obj)) {
                    return new ItemCatalogSubjectBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_catalog_subject is invalid. Received: " + obj);
            case 70:
                if ("layout/item_chapter_0".equals(obj)) {
                    return new ItemChapterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chapter is invalid. Received: " + obj);
            case 71:
                if ("layout/item_chapter_complete_0".equals(obj)) {
                    return new ItemChapterCompleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chapter_complete is invalid. Received: " + obj);
            case 72:
                if ("layout/item_chapter_edit_0".equals(obj)) {
                    return new ItemChapterEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chapter_edit is invalid. Received: " + obj);
            case 73:
                if ("layout/item_chapter_manage_0".equals(obj)) {
                    return new ItemChapterManageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chapter_manage is invalid. Received: " + obj);
            case 74:
                if ("layout/item_chapter_progress_0".equals(obj)) {
                    return new ItemChapterProgressBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chapter_progress is invalid. Received: " + obj);
            case 75:
                if ("layout/item_choice_by_options_0".equals(obj)) {
                    return new ItemChoiceByOptionsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_choice_by_options is invalid. Received: " + obj);
            case 76:
                if ("layout/item_course_0".equals(obj)) {
                    return new ItemCourseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course is invalid. Received: " + obj);
            case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                if ("layout/item_course_details_catalog_0".equals(obj)) {
                    return new ItemCourseDetailsCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course_details_catalog is invalid. Received: " + obj);
            case 78:
                if ("layout/item_course_status_0".equals(obj)) {
                    return new ItemCourseStatusBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course_status is invalid. Received: " + obj);
            case 79:
                if ("layout/item_course_status_btn_0".equals(obj)) {
                    return new ItemCourseStatusBtnBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course_status_btn is invalid. Received: " + obj);
            case 80:
                if ("layout/item_course_teach_add_0".equals(obj)) {
                    return new ItemCourseTeachAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course_teach_add is invalid. Received: " + obj);
            case 81:
                if ("layout/item_course_title_0".equals(obj)) {
                    return new ItemCourseTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_course_title is invalid. Received: " + obj);
            case 82:
                if ("layout/item_cover_0".equals(obj)) {
                    return new ItemCoverBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_cover is invalid. Received: " + obj);
            case 83:
                if ("layout/item_exercise_history_0".equals(obj)) {
                    return new ItemExerciseHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_exercise_history is invalid. Received: " + obj);
            case 84:
                if ("layout/item_exercise_student_history_0".equals(obj)) {
                    return new ItemExerciseStudentHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_exercise_student_history is invalid. Received: " + obj);
            case 85:
                if ("layout/item_free_subscribe_0".equals(obj)) {
                    return new ItemFreeSubscribeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_free_subscribe is invalid. Received: " + obj);
            case 86:
                if ("layout/item_group_statistic_0".equals(obj)) {
                    return new ItemGroupStatisticBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_group_statistic is invalid. Received: " + obj);
            case 87:
                if ("layout/item_history_search_0".equals(obj)) {
                    return new ItemHistorySearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_history_search is invalid. Received: " + obj);
            case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                if ("layout/item_knowledge_0".equals(obj)) {
                    return new ItemKnowledgeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_knowledge is invalid. Received: " + obj);
            case 89:
                if ("layout/item_knowledge_complete_0".equals(obj)) {
                    return new ItemKnowledgeCompleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_knowledge_complete is invalid. Received: " + obj);
            case 90:
                if ("layout/item_knowledge_edit_0".equals(obj)) {
                    return new ItemKnowledgeEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_knowledge_edit is invalid. Received: " + obj);
            case 91:
                if ("layout/item_knowledge_manage_0".equals(obj)) {
                    return new ItemKnowledgeManageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_knowledge_manage is invalid. Received: " + obj);
            case 92:
                if ("layout/item_knowledge_progress_0".equals(obj)) {
                    return new ItemKnowledgeProgressBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_knowledge_progress is invalid. Received: " + obj);
            case 93:
                if ("layout/item_micro_0".equals(obj)) {
                    return new ItemMicroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_micro is invalid. Received: " + obj);
            case 94:
                if ("layout/item_micro_add_0".equals(obj)) {
                    return new ItemMicroAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_micro_add is invalid. Received: " + obj);
            case 95:
                if ("layout/item_micro_edit_0".equals(obj)) {
                    return new ItemMicroEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_micro_edit is invalid. Received: " + obj);
            case 96:
                if ("layout/item_micro_view_0".equals(obj)) {
                    return new ItemMicroViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_micro_view is invalid. Received: " + obj);
            case 97:
                if ("layout/item_my_course_0".equals(obj)) {
                    return new ItemMyCourseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_my_course is invalid. Received: " + obj);
            case 98:
                if ("layout/item_my_course_details_catalog_0".equals(obj)) {
                    return new ItemMyCourseDetailsCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_my_course_details_catalog is invalid. Received: " + obj);
            case 99:
                if ("layout/item_my_teach_course_0".equals(obj)) {
                    return new ItemMyTeachCourseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_my_teach_course is invalid. Received: " + obj);
            case 100:
                if ("layout/item_statistics_0".equals(obj)) {
                    return new ItemStatisticsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_statistics is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final ViewDataBinding m9799c(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 101:
                if ("layout/item_stu_name_0".equals(obj)) {
                    return new ItemStuNameBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_stu_name is invalid. Received: " + obj);
            case 102:
                if ("layout/item_stu_tab_0".equals(obj)) {
                    return new ItemStuTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_stu_tab is invalid. Received: " + obj);
            case TbsListener.ErrorCode.READ_RESPONSE_ERROR /* 103 */:
                if ("layout/item_student_achievement_0".equals(obj)) {
                    return new ItemStudentAchievementBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_student_achievement is invalid. Received: " + obj);
            case 104:
                if ("layout/item_study_0".equals(obj)) {
                    return new ItemStudyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_study is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DISK_FULL /* 105 */:
                if ("layout/item_subscribe_tab_0".equals(obj)) {
                    return new ItemSubscribeTabBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_subscribe_tab is invalid. Received: " + obj);
            case TbsListener.ErrorCode.FILE_DELETED /* 106 */:
                if ("layout/item_supervise_group_add_0".equals(obj)) {
                    return new ItemSuperviseGroupAddBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_supervise_group_add is invalid. Received: " + obj);
            case TbsListener.ErrorCode.UNKNOWN_ERROR /* 107 */:
                if ("layout/item_supervise_group_member_0".equals(obj)) {
                    return new ItemSuperviseGroupMemberBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_supervise_group_member is invalid. Received: " + obj);
            case 108:
                if ("layout/item_supervise_group_member_item_0".equals(obj)) {
                    return new ItemSuperviseGroupMemberItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_supervise_group_member_item is invalid. Received: " + obj);
            case 109:
                if ("layout/item_supervise_group_member_search_0".equals(obj)) {
                    return new ItemSuperviseGroupMemberSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_supervise_group_member_search is invalid. Received: " + obj);
            case 110:
                if ("layout/item_title_list_0".equals(obj)) {
                    return new ItemTitleListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_title_list is invalid. Received: " + obj);
            case TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR /* 111 */:
                if ("layout/item_title_list_header_0".equals(obj)) {
                    return new ItemTitleListHeaderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_title_list_header is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW /* 112 */:
                if ("layout/layout_bind_view_model_0".equals(obj)) {
                    return new LayoutBindViewModelBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_bind_view_model is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH /* 113 */:
                if ("layout/layout_course_details_catalog_0".equals(obj)) {
                    return new LayoutCourseDetailsCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_course_details_catalog is invalid. Received: " + obj);
            case 114:
                if ("layout/layout_course_synopsis_0".equals(obj)) {
                    return new LayoutCourseSynopsisBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_course_synopsis is invalid. Received: " + obj);
            case 115:
                if ("layout/layout_exercise_answer_0".equals(obj)) {
                    return new LayoutExerciseAnswerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_exercise_answer is invalid. Received: " + obj);
            case 116:
                if ("layout/layout_exercise_answer_history_0".equals(obj)) {
                    return new LayoutExerciseAnswerHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_exercise_answer_history is invalid. Received: " + obj);
            case 117:
                if ("layout/layout_exercise_answer_viewer_0".equals(obj)) {
                    return new LayoutExerciseAnswerViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_exercise_answer_viewer is invalid. Received: " + obj);
            case 118:
                if ("layout/layout_exercise_subject_0".equals(obj)) {
                    return new LayoutExerciseSubjectBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_exercise_subject is invalid. Received: " + obj);
            case 119:
                if ("layout/layout_free_subscriber_list_0".equals(obj)) {
                    return new LayoutFreeSubscriberListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_free_subscriber_list is invalid. Received: " + obj);
            case 120:
                if ("layout/layout_free_subscriber_list_empty_0".equals(obj)) {
                    return new LayoutFreeSubscriberListEmptyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_free_subscriber_list_empty is invalid. Received: " + obj);
            case TbsListener.ErrorCode.THREAD_INIT_ERROR /* 121 */:
                if ("layout/layout_my_course_details_catalog_0".equals(obj)) {
                    return new LayoutMyCourseDetailsCatalogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_my_course_details_catalog is invalid. Received: " + obj);
            case 122:
                if ("layout/layout_my_course_synopsis_0".equals(obj)) {
                    return new LayoutMyCourseSynopsisBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_my_course_synopsis is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED /* 123 */:
                if ("layout/layout_other_course_subscriber_list_0".equals(obj)) {
                    return new LayoutOtherCourseSubscriberListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_other_course_subscriber_list is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY /* 124 */:
                if ("layout/layout_self_course_subscriber_list_0".equals(obj)) {
                    return new LayoutSelfCourseSubscriberListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_self_course_subscriber_list is invalid. Received: " + obj);
            case TbsListener.ErrorCode.DOWNLOAD_THROWABLE /* 125 */:
                if ("layout/layout_status_error_0".equals(obj)) {
                    return new LayoutStatusErrorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_status_error is invalid. Received: " + obj);
            case 126:
                if ("layout/view_analysis_0".equals(obj)) {
                    return new ViewAnalysisBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_analysis is invalid. Received: " + obj);
            case 127:
                if ("layout/view_answer_micro_0".equals(obj)) {
                    return new ViewAnswerMicroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_answer_micro is invalid. Received: " + obj);
            case 128:
                if ("layout/view_choice_0".equals(obj)) {
                    return new ViewChoiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_choice is invalid. Received: " + obj);
            case 129:
                if ("layout/view_edit_answer_micro_0".equals(obj)) {
                    return new ViewEditAnswerMicroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_edit_answer_micro is invalid. Received: " + obj);
            case 130:
                if ("layout/view_edit_answer_micro_button_0".equals(obj)) {
                    return new ViewEditAnswerMicroButtonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_edit_answer_micro_button is invalid. Received: " + obj);
            case 131:
                if ("layout/view_edit_choice_0".equals(obj)) {
                    return new ViewEditChoiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_edit_choice is invalid. Received: " + obj);
            case 132:
                if ("layout/view_edit_choice_button_0".equals(obj)) {
                    return new ViewEditChoiceButtonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_edit_choice_button is invalid. Received: " + obj);
            case 133:
                if ("layout/view_micro_0".equals(obj)) {
                    return new ViewMicroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_micro is invalid. Received: " + obj);
            case 134:
                if ("layout/view_multiple_choice_animation_viewer_0".equals(obj)) {
                    return new ViewMultipleChoiceAnimationViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_multiple_choice_animation_viewer is invalid. Received: " + obj);
            case 135:
                if ("layout/view_multiple_choice_viewer_0".equals(obj)) {
                    return new ViewMultipleChoiceViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_multiple_choice_viewer is invalid. Received: " + obj);
            case 136:
                if ("layout/view_right_key_0".equals(obj)) {
                    return new ViewRightKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_right_key is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.image.DataBinderMapperImpl());
        arrayList.add(new com.zykj.lib.login.DataBinderMapperImpl());
        arrayList.add(new com.zykj.lib.ota.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        arrayList.add(new com.zykj.view.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return (String) C7594a.f10706a.get(i10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f10705a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i12 = (i11 - 1) / 50;
        if (i12 == 0) {
            return m9797a(dataBindingComponent, view, i11, tag);
        }
        if (i12 == 1) {
            return m9798b(dataBindingComponent, view, i11, tag);
        }
        if (i12 != 2) {
            return null;
        }
        return m9799c(dataBindingComponent, view, i11, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C7595b.f10707a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f10705a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
