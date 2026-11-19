package androidx.core.content.p014pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.p014pm.ShortcutInfoCompat;
import androidx.core.content.p014pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ShortcutManagerCompat {

    @VisibleForTesting
    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;

    @VisibleForTesting
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    @RequiresApi(25)
    public static class Api25Impl {
        private Api25Impl() {
        }

        public static String getShortcutInfoWithLowestRank(List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean addDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
        return true;
    }

    @VisibleForTesting
    public static boolean convertUriIconToBitmapIcon(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = shortcutInfoCompat.mIcon;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.mType;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat.getUriInputStream(context);
        if (uriInputStream == null || (bitmapDecodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        shortcutInfoCompat.mIcon = i10 == 6 ? IconCompat.createWithAdaptiveBitmap(bitmapDecodeStream) : IconCompat.createWithBitmap(bitmapDecodeStream);
        return true;
    }

    @VisibleForTesting
    public static void convertUriIconsToBitmapIcons(Context context, List<ShortcutInfoCompat> list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) obj;
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Intent intentCreateShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return shortcutInfoCompat.addToIntent(intentCreateShortcutResultIntent);
    }

    public static void disableShortcuts(Context context, List<String> list, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).disableShortcuts(list, charSequence);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void enableShortcuts(Context context, List<ShortcutInfoCompat> list) {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mId);
            }
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).enableShortcuts(arrayList);
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
    }

    public static List<ShortcutInfoCompat> getDynamicShortcuts(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return getShortcutInfoSaverInstance(context).getShortcuts();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List dynamicShortcuts = AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShortcutInfoCompat.Builder(context, AbstractC3344f.m1617a(it.next())).build());
        }
        return arrayList;
    }

    private static int getIconDimensionInternal(Context context, boolean z9) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z9 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int getIconMaxHeight(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 25 ? AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).getIconMaxHeight() : getIconDimensionInternal(context, false);
    }

    public static int getIconMaxWidth(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 25 ? AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).getIconMaxWidth() : getIconDimensionInternal(context, true);
    }

    public static int getMaxShortcutCountPerActivity(Context context) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @VisibleForTesting
    public static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        return sShortcutInfoChangeListeners;
    }

    private static String getShortcutInfoCompatWithLowestRank(List<ShortcutInfoCompat> list) {
        int rank = -1;
        String id = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > rank) {
                id = shortcutInfoCompat.getId();
                rank = shortcutInfoCompat.getRank();
            }
        }
        return id;
    }

    private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context context) {
        Bundle bundle;
        String string;
        if (sShortcutInfoChangeListeners == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(SHORTCUT_LISTENER_INTENT_FILTER_ACTION);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(SHORTCUT_LISTENER_META_DATA_KEY)) != null) {
                    try {
                        arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (sShortcutInfoChangeListeners == null) {
                sShortcutInfoChangeListeners = arrayList;
            }
        }
        return sShortcutInfoChangeListeners;
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            try {
                sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    public static List<ShortcutInfoCompat> getShortcuts(Context context, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            return ShortcutInfoCompat.fromShortcuts(context, AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).getShortcuts(i10));
        }
        if (i11 < 25) {
            if ((i10 & 2) != 0) {
                try {
                    return getShortcutInfoSaverInstance(context).getShortcuts();
                } catch (Exception unused) {
                }
            }
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManagerM1658a = AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a()));
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.addAll(shortcutManagerM1658a.getManifestShortcuts());
        }
        if ((i10 & 2) != 0) {
            arrayList.addAll(shortcutManagerM1658a.getDynamicShortcuts());
        }
        if ((i10 & 4) != 0) {
            arrayList.addAll(shortcutManagerM1658a.getPinnedShortcuts());
        }
        return ShortcutInfoCompat.fromShortcuts(context, arrayList);
    }

    public static boolean isRateLimitingActive(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 25 ? AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).isRateLimitingActive() : getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context);
    }

    public static boolean isRequestPinShortcutSupported(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).isRequestPinShortcutSupported();
        }
        if (ContextCompat.checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(ACTION_INSTALL_SHORTCUT), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || INSTALL_SHORTCUT_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean pushDynamicShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (i10 <= 29) {
            convertUriIconToBitmapIcon(context, shortcutInfoCompat);
        }
        if (i10 >= 30) {
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManagerM1658a = AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a()));
            if (shortcutManagerM1658a.isRateLimitingActive()) {
                return false;
            }
            List dynamicShortcuts = shortcutManagerM1658a.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManagerM1658a.removeDynamicShortcuts(Arrays.asList(Api25Impl.getShortcutInfoWithLowestRank(dynamicShortcuts)));
            }
            shortcutManagerM1658a.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            List<ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(Arrays.asList(shortcutInfoCompat));
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return true;
        } catch (Exception unused) {
            Iterator<ShortcutInfoChangeListener> it3 = getShortcutInfoListeners(context).iterator();
            while (it3.hasNext()) {
                it3.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return false;
        } catch (Throwable th) {
            Iterator<ShortcutInfoChangeListener> it4 = getShortcutInfoListeners(context).iterator();
            while (it4.hasNext()) {
                it4.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            throw th;
        }
    }

    public static void removeAllDynamicShortcuts(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onAllShortcutsRemoved();
        }
    }

    public static void removeDynamicShortcuts(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void removeLongLivedShortcuts(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
            return;
        }
        AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).removeLongLivedShortcuts(list);
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(List<ShortcutInfoCompat> list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i10)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    public static void reportShortcutUsed(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).reportShortcutUsed(str);
        }
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutUsageReported(Collections.singletonList(str));
        }
    }

    public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, final IntentSender intentSender) throws PackageManager.NameNotFoundException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        if (i10 >= 26) {
            return AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        Intent intentAddToIntent = shortcutInfoCompat.addToIntent(new Intent(ACTION_INSTALL_SHORTCUT));
        if (intentSender == null) {
            context.sendBroadcast(intentAddToIntent);
            return true;
        }
        context.sendOrderedBroadcast(intentAddToIntent, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) throws IntentSender.SendIntentException {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static boolean setDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(listRemoveShortcutsExcludedFromSurface.size());
            Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    @VisibleForTesting
    public static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> list) {
        sShortcutInfoChangeListeners = list;
    }

    @VisibleForTesting
    public static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> shortcutInfoCompatSaver) {
        sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
    }

    public static boolean updateShortcuts(Context context, List<ShortcutInfoCompat> list) {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!AbstractC3385x0.m1658a(context.getSystemService(AbstractC3363m0.m1636a())).updateShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutUpdated(list);
        }
        return true;
    }
}
