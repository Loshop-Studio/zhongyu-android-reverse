package com.zykj.sketch.permission;

import android.annotation.TargetApi;
import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class RxPermissions {
    static final String TAG = "RxPermissions";
    static final Object TRIGGER = new Object();

    @VisibleForTesting
    Lazy<RxPermissionsFragment> mRxPermissionsFragment;

    @FunctionalInterface
    public interface Lazy<V> {
        V get();
    }

    public RxPermissions(@NonNull FragmentActivity fragmentActivity) {
        this.mRxPermissionsFragment = getLazySingleton(fragmentActivity.getSupportFragmentManager());
    }

    private RxPermissionsFragment findRxPermissionsFragment(@NonNull FragmentManager fragmentManager) {
        return (RxPermissionsFragment) fragmentManager.findFragmentByTag(TAG);
    }

    @NonNull
    private Lazy<RxPermissionsFragment> getLazySingleton(@NonNull final FragmentManager fragmentManager) {
        return new Lazy<RxPermissionsFragment>() { // from class: com.zykj.sketch.permission.RxPermissions.1
            private RxPermissionsFragment rxPermissionsFragment;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.zykj.sketch.permission.RxPermissions.Lazy
            public synchronized RxPermissionsFragment get() {
                try {
                    if (this.rxPermissionsFragment == null) {
                        this.rxPermissionsFragment = RxPermissions.this.getRxPermissionsFragment(fragmentManager);
                    }
                } catch (Throwable th) {
                    throw th;
                }
                return this.rxPermissionsFragment;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RxPermissionsFragment getRxPermissionsFragment(@NonNull FragmentManager fragmentManager) {
        RxPermissionsFragment rxPermissionsFragmentFindRxPermissionsFragment = findRxPermissionsFragment(fragmentManager);
        if (rxPermissionsFragmentFindRxPermissionsFragment != null) {
            return rxPermissionsFragmentFindRxPermissionsFragment;
        }
        RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
        fragmentManager.beginTransaction().add(rxPermissionsFragment, TAG).commitNow();
        return rxPermissionsFragment;
    }

    private Observable<?> oneOf(Observable<?> observable, Observable<?> observable2) {
        return observable == null ? Observable.just(TRIGGER) : Observable.merge(observable, observable2);
    }

    private Observable<?> pending(String... strArr) {
        for (String str : strArr) {
            if (!this.mRxPermissionsFragment.get().containsByPermission(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(TRIGGER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public Observable<Permission> requestImplementation(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.mRxPermissionsFragment.get().log("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(Observable.just(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(Observable.just(new Permission(str, false, false)));
            } else {
                PublishSubject<Permission> subjectByPermission = this.mRxPermissionsFragment.get().getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = PublishSubject.create();
                    this.mRxPermissionsFragment.get().setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            requestPermissionsFromFragment((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    @TargetApi(23)
    private boolean shouldShowRequestPermissionRationaleImplementation(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (!isGranted(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    public <T> ObservableTransformer<T, Boolean> ensure(final String... strArr) {
        return new ObservableTransformer<T, Boolean>() { // from class: com.zykj.sketch.permission.RxPermissions.2
            @Override // io.reactivex.ObservableTransformer
            public ObservableSource<Boolean> apply(Observable<T> observable) {
                return RxPermissions.this.request(observable, strArr).buffer(strArr.length).flatMap(new Function<List<Permission>, ObservableSource<Boolean>>() { // from class: com.zykj.sketch.permission.RxPermissions.2.1
                    @Override // io.reactivex.functions.Function
                    public ObservableSource<Boolean> apply(List<Permission> list) {
                        if (list.isEmpty()) {
                            return Observable.empty();
                        }
                        Iterator<Permission> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().granted) {
                                return Observable.just(Boolean.FALSE);
                            }
                        }
                        return Observable.just(Boolean.TRUE);
                    }
                });
            }
        };
    }

    public <T> ObservableTransformer<T, Permission> ensureEach(final String... strArr) {
        return new ObservableTransformer<T, Permission>() { // from class: com.zykj.sketch.permission.RxPermissions.3
            @Override // io.reactivex.ObservableTransformer
            public ObservableSource<Permission> apply(Observable<T> observable) {
                return RxPermissions.this.request(observable, strArr);
            }
        };
    }

    public <T> ObservableTransformer<T, Permission> ensureEachCombined(final String... strArr) {
        return new ObservableTransformer<T, Permission>() { // from class: com.zykj.sketch.permission.RxPermissions.4
            @Override // io.reactivex.ObservableTransformer
            public ObservableSource<Permission> apply(Observable<T> observable) {
                return RxPermissions.this.request(observable, strArr).buffer(strArr.length).flatMap(new Function<List<Permission>, ObservableSource<Permission>>() { // from class: com.zykj.sketch.permission.RxPermissions.4.1
                    @Override // io.reactivex.functions.Function
                    public ObservableSource<Permission> apply(List<Permission> list) {
                        return list.isEmpty() ? Observable.empty() : Observable.just(new Permission(list));
                    }
                });
            }
        };
    }

    public boolean isGranted(String str) {
        return !isMarshmallow() || this.mRxPermissionsFragment.get().isGranted(str);
    }

    public boolean isMarshmallow() {
        return true;
    }

    public boolean isRevoked(String str) {
        return isMarshmallow() && this.mRxPermissionsFragment.get().isRevoked(str);
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        this.mRxPermissionsFragment.get().onRequestPermissionsResult(strArr, iArr, new boolean[strArr.length]);
    }

    public Observable<Boolean> request(String... strArr) {
        return Observable.just(TRIGGER).compose(ensure(strArr));
    }

    public Observable<Permission> requestEach(String... strArr) {
        return Observable.just(TRIGGER).compose(ensureEach(strArr));
    }

    public Observable<Permission> requestEachCombined(String... strArr) {
        return Observable.just(TRIGGER).compose(ensureEachCombined(strArr));
    }

    @TargetApi(23)
    public void requestPermissionsFromFragment(String[] strArr) {
        this.mRxPermissionsFragment.get().log("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.mRxPermissionsFragment.get().requestPermissions(strArr);
    }

    public void setLogging(boolean z9) {
        this.mRxPermissionsFragment.get().setLogging(z9);
    }

    public Observable<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        return !isMarshmallow() ? Observable.just(Boolean.FALSE) : Observable.just(Boolean.valueOf(shouldShowRequestPermissionRationaleImplementation(activity, strArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Permission> request(Observable<?> observable, final String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return oneOf(observable, pending(strArr)).flatMap(new Function<Object, Observable<Permission>>() { // from class: com.zykj.sketch.permission.RxPermissions.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.functions.Function
            public Observable<Permission> apply(Object obj) {
                return RxPermissions.this.requestImplementation(strArr);
            }
        });
    }

    public RxPermissions(@NonNull Fragment fragment) {
        this.mRxPermissionsFragment = getLazySingleton(fragment.getChildFragmentManager());
    }
}
