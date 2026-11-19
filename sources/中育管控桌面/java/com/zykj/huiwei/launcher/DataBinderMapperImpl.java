package com.zykj.huiwei.launcher;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.databinding.DialogCrashHintBindingImpl;
import com.zykj.huiwei.launcher.databinding.DiscoveryActivityFileBindingImpl;
import com.zykj.huiwei.launcher.databinding.DiscoveryFragmentImageBindingImpl;
import com.zykj.huiwei.launcher.databinding.DiscoveryFragmentPdfBindingImpl;
import com.zykj.huiwei.launcher.databinding.DiscoveryIncludePdfPageBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwActivityMainBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogAppUpdateBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogChangeAvatarBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogCustomerServiceBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogModifyGestureBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogTipsBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwDialogUnauthorBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentAppBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentHomeBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentMainBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentNotificationBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwFragmentNotificationDetailBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwIncludeHomeAppBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwIncludeHomeHomeworkBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwIncludeHomeSidebarBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwIncludeHomeTitleBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwItemAppBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwItemAvatarBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwItemHomeworkBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwItemNotificationBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwMenuItemViewBindingImpl;
import com.zykj.huiwei.launcher.databinding.HwStateViewBindingImpl;
import com.zykj.manage.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f5957a;

    /* renamed from: com.zykj.huiwei.launcher.DataBinderMapperImpl$a */
    public static class C6041a {

        /* renamed from: a */
        public static final SparseArray f5958a;

        static {
            SparseArray sparseArray = new SparseArray(8);
            f5958a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "backClickListener");
            sparseArray.put(2, "clickListener");
            sparseArray.put(3, "homeworkAdapter");
            sparseArray.put(4, "mainViewModel");
            sparseArray.put(5, "messageInfo");
            sparseArray.put(6, "onClickListener");
            sparseArray.put(7, "vm");
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.DataBinderMapperImpl$b */
    public static class C6042b {

        /* renamed from: a */
        public static final HashMap f5959a;

        static {
            HashMap map = new HashMap(29);
            f5959a = map;
            map.put("layout/dialog_crash_hint_0", Integer.valueOf(R.layout.dialog_crash_hint));
            map.put("layout/discovery_activity_file_0", Integer.valueOf(R.layout.discovery_activity_file));
            map.put("layout/discovery_fragment_image_0", Integer.valueOf(R.layout.discovery_fragment_image));
            map.put("layout/discovery_fragment_pdf_0", Integer.valueOf(R.layout.discovery_fragment_pdf));
            map.put("layout/discovery_include_pdf_page_0", Integer.valueOf(R.layout.discovery_include_pdf_page));
            map.put("layout/hw_activity_main_0", Integer.valueOf(R.layout.hw_activity_main));
            map.put("layout/hw_dialog_app_update_0", Integer.valueOf(R.layout.hw_dialog_app_update));
            map.put("layout/hw_dialog_change_avatar_0", Integer.valueOf(R.layout.hw_dialog_change_avatar));
            map.put("layout/hw_dialog_customer_service_0", Integer.valueOf(R.layout.hw_dialog_customer_service));
            map.put("layout/hw_dialog_modify_gesture_0", Integer.valueOf(R.layout.hw_dialog_modify_gesture));
            map.put("layout/hw_dialog_modify_password_0", Integer.valueOf(R.layout.hw_dialog_modify_password));
            map.put("layout/hw_dialog_tips_0", Integer.valueOf(R.layout.hw_dialog_tips));
            map.put("layout/hw_dialog_unauthor_0", Integer.valueOf(R.layout.hw_dialog_unauthor));
            map.put("layout/hw_fragment_app_0", Integer.valueOf(R.layout.hw_fragment_app));
            map.put("layout/hw_fragment_home_0", Integer.valueOf(R.layout.hw_fragment_home));
            map.put("layout/hw_fragment_login_0", Integer.valueOf(R.layout.hw_fragment_login));
            map.put("layout/hw_fragment_main_0", Integer.valueOf(R.layout.hw_fragment_main));
            map.put("layout/hw_fragment_notification_0", Integer.valueOf(R.layout.hw_fragment_notification));
            map.put("layout/hw_fragment_notification_detail_0", Integer.valueOf(R.layout.hw_fragment_notification_detail));
            map.put("layout/hw_include_home_app_0", Integer.valueOf(R.layout.hw_include_home_app));
            map.put("layout/hw_include_home_homework_0", Integer.valueOf(R.layout.hw_include_home_homework));
            map.put("layout/hw_include_home_sidebar_0", Integer.valueOf(R.layout.hw_include_home_sidebar));
            map.put("layout/hw_include_home_title_0", Integer.valueOf(R.layout.hw_include_home_title));
            map.put("layout/hw_item_app_0", Integer.valueOf(R.layout.hw_item_app));
            map.put("layout/hw_item_avatar_0", Integer.valueOf(R.layout.hw_item_avatar));
            map.put("layout/hw_item_homework_0", Integer.valueOf(R.layout.hw_item_homework));
            map.put("layout/hw_item_notification_0", Integer.valueOf(R.layout.hw_item_notification));
            map.put("layout/hw_menu_item_view_0", Integer.valueOf(R.layout.hw_menu_item_view));
            map.put("layout/hw_state_view_0", Integer.valueOf(R.layout.hw_state_view));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(29);
        f5957a = sparseIntArray;
        sparseIntArray.put(R.layout.dialog_crash_hint, 1);
        sparseIntArray.put(R.layout.discovery_activity_file, 2);
        sparseIntArray.put(R.layout.discovery_fragment_image, 3);
        sparseIntArray.put(R.layout.discovery_fragment_pdf, 4);
        sparseIntArray.put(R.layout.discovery_include_pdf_page, 5);
        sparseIntArray.put(R.layout.hw_activity_main, 6);
        sparseIntArray.put(R.layout.hw_dialog_app_update, 7);
        sparseIntArray.put(R.layout.hw_dialog_change_avatar, 8);
        sparseIntArray.put(R.layout.hw_dialog_customer_service, 9);
        sparseIntArray.put(R.layout.hw_dialog_modify_gesture, 10);
        sparseIntArray.put(R.layout.hw_dialog_modify_password, 11);
        sparseIntArray.put(R.layout.hw_dialog_tips, 12);
        sparseIntArray.put(R.layout.hw_dialog_unauthor, 13);
        sparseIntArray.put(R.layout.hw_fragment_app, 14);
        sparseIntArray.put(R.layout.hw_fragment_home, 15);
        sparseIntArray.put(R.layout.hw_fragment_login, 16);
        sparseIntArray.put(R.layout.hw_fragment_main, 17);
        sparseIntArray.put(R.layout.hw_fragment_notification, 18);
        sparseIntArray.put(R.layout.hw_fragment_notification_detail, 19);
        sparseIntArray.put(R.layout.hw_include_home_app, 20);
        sparseIntArray.put(R.layout.hw_include_home_homework, 21);
        sparseIntArray.put(R.layout.hw_include_home_sidebar, 22);
        sparseIntArray.put(R.layout.hw_include_home_title, 23);
        sparseIntArray.put(R.layout.hw_item_app, 24);
        sparseIntArray.put(R.layout.hw_item_avatar, 25);
        sparseIntArray.put(R.layout.hw_item_homework, 26);
        sparseIntArray.put(R.layout.hw_item_notification, 27);
        sparseIntArray.put(R.layout.hw_menu_item_view, 28);
        sparseIntArray.put(R.layout.hw_state_view, 29);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.chad.library.DataBinderMapperImpl());
        arrayList.add(new com.zykj.base.DataBinderMapperImpl());
        arrayList.add(new com.zykj.download.DataBinderMapperImpl());
        arrayList.add(new com.zykj.policy.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i6) {
        return (String) C6041a.f5958a.get(i6);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i6) {
        int i7 = f5957a.get(i6);
        if (i7 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i7) {
            case 1:
                if ("layout/dialog_crash_hint_0".equals(tag)) {
                    return new DialogCrashHintBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_crash_hint is invalid. Received: " + tag);
            case 2:
                if ("layout/discovery_activity_file_0".equals(tag)) {
                    return new DiscoveryActivityFileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for discovery_activity_file is invalid. Received: " + tag);
            case 3:
                if ("layout/discovery_fragment_image_0".equals(tag)) {
                    return new DiscoveryFragmentImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for discovery_fragment_image is invalid. Received: " + tag);
            case 4:
                if ("layout/discovery_fragment_pdf_0".equals(tag)) {
                    return new DiscoveryFragmentPdfBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for discovery_fragment_pdf is invalid. Received: " + tag);
            case 5:
                if ("layout/discovery_include_pdf_page_0".equals(tag)) {
                    return new DiscoveryIncludePdfPageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for discovery_include_pdf_page is invalid. Received: " + tag);
            case 6:
                if ("layout/hw_activity_main_0".equals(tag)) {
                    return new HwActivityMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_activity_main is invalid. Received: " + tag);
            case 7:
                if ("layout/hw_dialog_app_update_0".equals(tag)) {
                    return new HwDialogAppUpdateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_app_update is invalid. Received: " + tag);
            case 8:
                if ("layout/hw_dialog_change_avatar_0".equals(tag)) {
                    return new HwDialogChangeAvatarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_change_avatar is invalid. Received: " + tag);
            case 9:
                if ("layout/hw_dialog_customer_service_0".equals(tag)) {
                    return new HwDialogCustomerServiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_customer_service is invalid. Received: " + tag);
            case 10:
                if ("layout/hw_dialog_modify_gesture_0".equals(tag)) {
                    return new HwDialogModifyGestureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_modify_gesture is invalid. Received: " + tag);
            case 11:
                if ("layout/hw_dialog_modify_password_0".equals(tag)) {
                    return new HwDialogModifyPasswordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_modify_password is invalid. Received: " + tag);
            case 12:
                if ("layout/hw_dialog_tips_0".equals(tag)) {
                    return new HwDialogTipsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_tips is invalid. Received: " + tag);
            case 13:
                if ("layout/hw_dialog_unauthor_0".equals(tag)) {
                    return new HwDialogUnauthorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_dialog_unauthor is invalid. Received: " + tag);
            case 14:
                if ("layout/hw_fragment_app_0".equals(tag)) {
                    return new HwFragmentAppBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_app is invalid. Received: " + tag);
            case 15:
                if ("layout/hw_fragment_home_0".equals(tag)) {
                    return new HwFragmentHomeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_home is invalid. Received: " + tag);
            case 16:
                if ("layout/hw_fragment_login_0".equals(tag)) {
                    return new HwFragmentLoginBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_login is invalid. Received: " + tag);
            case 17:
                if ("layout/hw_fragment_main_0".equals(tag)) {
                    return new HwFragmentMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_main is invalid. Received: " + tag);
            case 18:
                if ("layout/hw_fragment_notification_0".equals(tag)) {
                    return new HwFragmentNotificationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_notification is invalid. Received: " + tag);
            case 19:
                if ("layout/hw_fragment_notification_detail_0".equals(tag)) {
                    return new HwFragmentNotificationDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_fragment_notification_detail is invalid. Received: " + tag);
            case 20:
                if ("layout/hw_include_home_app_0".equals(tag)) {
                    return new HwIncludeHomeAppBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for hw_include_home_app is invalid. Received: " + tag);
            case 21:
                if ("layout/hw_include_home_homework_0".equals(tag)) {
                    return new HwIncludeHomeHomeworkBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for hw_include_home_homework is invalid. Received: " + tag);
            case 22:
                if ("layout/hw_include_home_sidebar_0".equals(tag)) {
                    return new HwIncludeHomeSidebarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_include_home_sidebar is invalid. Received: " + tag);
            case 23:
                if ("layout/hw_include_home_title_0".equals(tag)) {
                    return new HwIncludeHomeTitleBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for hw_include_home_title is invalid. Received: " + tag);
            case 24:
                if ("layout/hw_item_app_0".equals(tag)) {
                    return new HwItemAppBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_item_app is invalid. Received: " + tag);
            case 25:
                if ("layout/hw_item_avatar_0".equals(tag)) {
                    return new HwItemAvatarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_item_avatar is invalid. Received: " + tag);
            case 26:
                if ("layout/hw_item_homework_0".equals(tag)) {
                    return new HwItemHomeworkBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_item_homework is invalid. Received: " + tag);
            case 27:
                if ("layout/hw_item_notification_0".equals(tag)) {
                    return new HwItemNotificationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for hw_item_notification is invalid. Received: " + tag);
            case 28:
                if ("layout/hw_menu_item_view_0".equals(tag)) {
                    return new HwMenuItemViewBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for hw_menu_item_view is invalid. Received: " + tag);
            case 29:
                if ("layout/hw_state_view_0".equals(tag)) {
                    return new HwStateViewBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for hw_state_view is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C6042b.f5959a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i6) {
        int i7;
        if (viewArr != null && viewArr.length != 0 && (i7 = f5957a.get(i6)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i7 == 20) {
                if ("layout/hw_include_home_app_0".equals(tag)) {
                    return new HwIncludeHomeAppBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for hw_include_home_app is invalid. Received: " + tag);
            }
            if (i7 == 21) {
                if ("layout/hw_include_home_homework_0".equals(tag)) {
                    return new HwIncludeHomeHomeworkBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for hw_include_home_homework is invalid. Received: " + tag);
            }
            if (i7 == 23) {
                if ("layout/hw_include_home_title_0".equals(tag)) {
                    return new HwIncludeHomeTitleBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for hw_include_home_title is invalid. Received: " + tag);
            }
            if (i7 == 28) {
                if ("layout/hw_menu_item_view_0".equals(tag)) {
                    return new HwMenuItemViewBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for hw_menu_item_view is invalid. Received: " + tag);
            }
            if (i7 == 29) {
                if ("layout/hw_state_view_0".equals(tag)) {
                    return new HwStateViewBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for hw_state_view is invalid. Received: " + tag);
            }
        }
        return null;
    }
}
