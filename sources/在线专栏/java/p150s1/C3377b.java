package p150s1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147rx.Observable;
import p147rx.functions.Func1;
import p147rx.subjects.PublishSubject;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public class C3377b {

    /* renamed from: a */
    FragmentC3378c f11855a;

    /* renamed from: s1.b$a */
    class a implements Observable.Transformer<Object, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String[] f11856a;

        /* renamed from: s1.b$a$a, reason: collision with other inner class name */
        class C3548a implements Func1<List<C3376a>, Observable<Boolean>> {
            C3548a() {
            }

            @Override // p147rx.functions.Func1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Observable<Boolean> call(List<C3376a> list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                Iterator<C3376a> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().f11853b) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        a(String[] strArr) {
            this.f11856a = strArr;
        }

        @Override // p147rx.functions.Func1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<Boolean> call(Observable<Object> observable) {
            return C3377b.this.m10272k(observable, this.f11856a).buffer(this.f11856a.length).flatMap(new C3548a());
        }
    }

    /* renamed from: s1.b$b */
    class b implements Func1<Object, Observable<C3376a>> {

        /* renamed from: a */
        final /* synthetic */ String[] f11859a;

        b(String[] strArr) {
            this.f11859a = strArr;
        }

        @Override // p147rx.functions.Func1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<C3376a> call(Object obj) {
            return C3377b.this.m10273m(this.f11859a);
        }
    }

    public C3377b(Activity activity) {
        this.f11855a = m10269e(activity);
    }

    /* renamed from: d */
    private FragmentC3378c m10268d(Activity activity) {
        return (FragmentC3378c) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: e */
    private FragmentC3378c m10269e(Activity activity) {
        FragmentC3378c fragmentC3378cM10268d = m10268d(activity);
        if (!(fragmentC3378cM10268d == null)) {
            return fragmentC3378cM10268d;
        }
        FragmentC3378c fragmentC3378c = new FragmentC3378c();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(fragmentC3378c, "RxPermissions").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return fragmentC3378c;
    }

    /* renamed from: i */
    private Observable<?> m10270i(Observable<?> observable, Observable<?> observable2) {
        return observable == null ? Observable.just(null) : Observable.merge(observable, observable2);
    }

    /* renamed from: j */
    private Observable<?> m10271j(String... strArr) {
        for (String str : strArr) {
            if (!this.f11855a.m10283a(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public Observable<C3376a> m10272k(Observable<?> observable, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return m10270i(observable, m10271j(strArr)).flatMap(new b(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: m */
    public Observable<C3376a> m10273m(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f11855a.m10287e("Requesting permission " + str);
            if (m10275f(str)) {
                arrayList.add(Observable.just(new C3376a(str, true, false)));
            } else if (m10277h(str)) {
                arrayList.add(Observable.just(new C3376a(str, false, false)));
            } else {
                PublishSubject<C3376a> publishSubjectM10284b = this.f11855a.m10284b(str);
                if (publishSubjectM10284b == null) {
                    arrayList2.add(str);
                    publishSubjectM10284b = PublishSubject.create();
                    this.f11855a.m10290h(str, publishSubjectM10284b);
                }
                arrayList.add(publishSubjectM10284b);
            }
        }
        if (!arrayList2.isEmpty()) {
            m10279n((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.from(arrayList));
    }

    /* renamed from: c */
    public Observable.Transformer<Object, Boolean> m10274c(String... strArr) {
        return new a(strArr);
    }

    /* renamed from: f */
    public boolean m10275f(String str) {
        return !m10276g() || this.f11855a.m10285c(str);
    }

    /* renamed from: g */
    boolean m10276g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: h */
    public boolean m10277h(String str) {
        return m10276g() && this.f11855a.m10286d(str);
    }

    /* renamed from: l */
    public Observable<Boolean> m10278l(String... strArr) {
        return Observable.just(null).compose(m10274c(strArr));
    }

    @TargetApi(23)
    /* renamed from: n */
    void m10279n(String[] strArr) {
        this.f11855a.m10287e("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f11855a.m10289g(strArr);
    }
}
