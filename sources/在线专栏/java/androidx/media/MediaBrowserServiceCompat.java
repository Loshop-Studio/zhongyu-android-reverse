package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0247a;
import androidx.core.app.C0324e;
import androidx.media.C0538b;
import androidx.media.C0539c;
import androidx.media.C0540d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p011b0.C1021d;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: f */
    static final boolean f3487f = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    private InterfaceC0527g f3488a;

    /* renamed from: c */
    C0526f f3490c;

    /* renamed from: e */
    MediaSessionCompat.Token f3492e;

    /* renamed from: b */
    final C0247a<IBinder, C0526f> f3489b = new C0247a<>();

    /* renamed from: d */
    final HandlerC0536p f3491d = new HandlerC0536p();

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    class C0521a extends C0532l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C0526f f3493f;

        /* renamed from: g */
        final /* synthetic */ String f3494g;

        /* renamed from: h */
        final /* synthetic */ Bundle f3495h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3496i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0521a(Object obj, C0526f c0526f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3493f = c0526f;
            this.f3494g = str;
            this.f3495h = bundle;
            this.f3496i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C0532l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo2953d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f3489b.get(this.f3493f.f3509f.asBinder()) != this.f3493f) {
                if (MediaBrowserServiceCompat.f3487f) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f3493f.f3504a + " id=" + this.f3494g);
                    return;
                }
                return;
            }
            if ((m2966a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m2938b(list, this.f3495h);
            }
            try {
                this.f3493f.f3509f.mo2981b(this.f3494g, list, this.f3495h, this.f3496i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f3494g + " package=" + this.f3493f.f3504a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    class C0522b extends C0532l<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3498f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0522b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3498f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C0532l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo2953d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m2966a() & 2) != 0) {
                this.f3498f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3498f.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    class C0523c extends C0532l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3500f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0523c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3500f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C0532l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo2953d(List<MediaBrowserCompat.MediaItem> list) {
            if ((m2966a() & 4) != 0 || list == null) {
                this.f3500f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3500f.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    class C0524d extends C0532l<Bundle> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3502f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0524d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3502f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0532l
        /* renamed from: c */
        void mo2957c(Bundle bundle) {
            this.f3502f.send(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C0532l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo2953d(Bundle bundle) {
            this.f3502f.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0525e {
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    private class C0526f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f3504a;

        /* renamed from: b */
        public final int f3505b;

        /* renamed from: c */
        public final int f3506c;

        /* renamed from: d */
        public final C0541e f3507d;

        /* renamed from: e */
        public final Bundle f3508e;

        /* renamed from: f */
        public final InterfaceC0534n f3509f;

        /* renamed from: g */
        public final HashMap<String, List<C1021d<IBinder, Bundle>>> f3510g = new HashMap<>();

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = C0526f.this;
                MediaBrowserServiceCompat.this.f3489b.remove(c0526f.f3509f.asBinder());
            }
        }

        C0526f(String str, int i4, int i5, Bundle bundle, InterfaceC0534n interfaceC0534n) {
            this.f3504a = str;
            this.f3505b = i4;
            this.f3506c = i5;
            this.f3507d = new C0541e(str, i4, i5);
            this.f3508e = bundle;
            this.f3509f = interfaceC0534n;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f3491d.post(new a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    interface InterfaceC0527g {
        IBinder onBind(Intent intent);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    class C0528h implements InterfaceC0527g, C0538b.d {

        /* renamed from: a */
        final List<Bundle> f3513a = new ArrayList();

        /* renamed from: b */
        Object f3514b;

        /* renamed from: c */
        Messenger f3515c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        class a extends C0532l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0538b.c f3517f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C0538b.c cVar) {
                super(obj);
                this.f3517f = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C0532l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo2953d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3517f.m2989b(arrayList);
            }
        }

        C0528h() {
        }

        @Override // androidx.media.C0538b.d
        /* renamed from: a */
        public void mo2959a(String str, C0538b.c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.m2942f(str, new a(str, cVar));
        }

        @Override // androidx.media.C0538b.d
        /* renamed from: d */
        public C0538b.a mo2960d(String str, int i4, Bundle bundle) {
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.f3515c = new Messenger(MediaBrowserServiceCompat.this.f3491d);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C0324e.m1778b(bundle2, "extra_messenger", this.f3515c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f3492e;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    C0324e.m1778b(bundle2, "extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f3513a.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3490c = mediaBrowserServiceCompat.new C0526f(str, -1, i4, bundle, null);
            MediaBrowserServiceCompat.this.m2941e(str, i4, bundle);
            MediaBrowserServiceCompat.this.f3490c = null;
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0527g
        public IBinder onBind(Intent intent) {
            return C0538b.m2986b(this.f3514b, intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0527g
        public void onCreate() {
            Object objM2985a = C0538b.m2985a(MediaBrowserServiceCompat.this, this);
            this.f3514b = objM2985a;
            C0538b.m2987c(objM2985a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    class C0529i extends C0528h implements C0539c.b {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        class a extends C0532l<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            final /* synthetic */ C0538b.c f3520f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C0538b.c cVar) {
                super(obj);
                this.f3520f = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C0532l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo2953d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3520f.m2989b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f3520f.m2989b(parcelObtain);
            }
        }

        C0529i() {
            super();
        }

        @Override // androidx.media.C0539c.b
        /* renamed from: b */
        public void mo2962b(String str, C0538b.c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.m2944h(str, new a(str, cVar));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0528h, androidx.media.MediaBrowserServiceCompat.InterfaceC0527g
        public void onCreate() {
            Object objM2990a = C0539c.m2990a(MediaBrowserServiceCompat.this, this);
            this.f3514b = objM2990a;
            C0538b.m2987c(objM2990a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    class C0530j extends C0529i implements C0540d.c {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        class a extends C0532l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0540d.b f3523f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C0540d.b bVar) {
                super(obj);
                this.f3523f = bVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C0532l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo2953d(List<MediaBrowserCompat.MediaItem> list) throws IllegalAccessException, IllegalArgumentException {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3523f.m2993b(arrayList, m2966a());
            }
        }

        C0530j() {
            super();
        }

        @Override // androidx.media.C0540d.c
        /* renamed from: c */
        public void mo2964c(String str, C0540d.b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.m2943g(str, new a(str, bVar), bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0529i, androidx.media.MediaBrowserServiceCompat.C0528h, androidx.media.MediaBrowserServiceCompat.InterfaceC0527g
        public void onCreate() {
            Object objM2991a = C0540d.m2991a(MediaBrowserServiceCompat.this, this);
            this.f3514b = objM2991a;
            C0538b.m2987c(objM2991a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    class C0531k extends C0530j {
        C0531k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public static class C0532l<T> {

        /* renamed from: a */
        private final Object f3526a;

        /* renamed from: b */
        private boolean f3527b;

        /* renamed from: c */
        private boolean f3528c;

        /* renamed from: d */
        private boolean f3529d;

        /* renamed from: e */
        private int f3530e;

        C0532l(Object obj) {
            this.f3526a = obj;
        }

        /* renamed from: a */
        int m2966a() {
            return this.f3530e;
        }

        /* renamed from: b */
        boolean m2967b() {
            return this.f3527b || this.f3528c || this.f3529d;
        }

        /* renamed from: c */
        void mo2957c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3526a);
        }

        /* renamed from: d */
        void mo2953d(T t3) {
            throw null;
        }

        /* renamed from: e */
        public void m2968e(Bundle bundle) {
            if (!this.f3528c && !this.f3529d) {
                this.f3529d = true;
                mo2957c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3526a);
            }
        }

        /* renamed from: f */
        public void m2969f(T t3) {
            if (!this.f3528c && !this.f3529d) {
                this.f3528c = true;
                mo2953d(t3);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3526a);
            }
        }

        /* renamed from: g */
        void m2970g(int i4) {
            this.f3530e = i4;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    private class C0533m {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$a */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3532a;

            /* renamed from: b */
            final /* synthetic */ String f3533b;

            /* renamed from: c */
            final /* synthetic */ int f3534c;

            /* renamed from: d */
            final /* synthetic */ int f3535d;

            /* renamed from: e */
            final /* synthetic */ Bundle f3536e;

            a(InterfaceC0534n interfaceC0534n, String str, int i4, int i5, Bundle bundle) {
                this.f3532a = interfaceC0534n;
                this.f3533b = str;
                this.f3534c = i4;
                this.f3535d = i5;
                this.f3536e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceCompat.this.f3489b.remove(this.f3532a.asBinder());
                C0526f c0526f = MediaBrowserServiceCompat.this.new C0526f(this.f3533b, this.f3534c, this.f3535d, this.f3536e, this.f3532a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3490c = c0526f;
                mediaBrowserServiceCompat.m2941e(this.f3533b, this.f3535d, this.f3536e);
                MediaBrowserServiceCompat.this.f3490c = null;
                Log.i("MBServiceCompat", "No root for client " + this.f3533b + " from service " + getClass().getName());
                try {
                    this.f3532a.mo2980a();
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f3533b);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$b */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3538a;

            b(InterfaceC0534n interfaceC0534n) {
                this.f3538a = interfaceC0534n;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526fRemove = MediaBrowserServiceCompat.this.f3489b.remove(this.f3538a.asBinder());
                if (c0526fRemove != null) {
                    c0526fRemove.f3509f.asBinder().unlinkToDeath(c0526fRemove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$c */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3540a;

            /* renamed from: b */
            final /* synthetic */ String f3541b;

            /* renamed from: c */
            final /* synthetic */ IBinder f3542c;

            /* renamed from: d */
            final /* synthetic */ Bundle f3543d;

            c(InterfaceC0534n interfaceC0534n, String str, IBinder iBinder, Bundle bundle) {
                this.f3540a = interfaceC0534n;
                this.f3541b = str;
                this.f3542c = iBinder;
                this.f3543d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = MediaBrowserServiceCompat.this.f3489b.get(this.f3540a.asBinder());
                if (c0526f != null) {
                    MediaBrowserServiceCompat.this.m2937a(this.f3541b, c0526f, this.f3542c, this.f3543d);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3541b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$d */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3545a;

            /* renamed from: b */
            final /* synthetic */ String f3546b;

            /* renamed from: c */
            final /* synthetic */ IBinder f3547c;

            d(InterfaceC0534n interfaceC0534n, String str, IBinder iBinder) {
                this.f3545a = interfaceC0534n;
                this.f3546b = str;
                this.f3547c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = MediaBrowserServiceCompat.this.f3489b.get(this.f3545a.asBinder());
                if (c0526f == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f3546b);
                    return;
                }
                if (MediaBrowserServiceCompat.this.m2952p(this.f3546b, c0526f, this.f3547c)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.f3546b + " which is not subscribed");
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$e */
        class e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3549a;

            /* renamed from: b */
            final /* synthetic */ String f3550b;

            /* renamed from: c */
            final /* synthetic */ ResultReceiver f3551c;

            e(InterfaceC0534n interfaceC0534n, String str, ResultReceiver resultReceiver) {
                this.f3549a = interfaceC0534n;
                this.f3550b = str;
                this.f3551c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = MediaBrowserServiceCompat.this.f3489b.get(this.f3549a.asBinder());
                if (c0526f != null) {
                    MediaBrowserServiceCompat.this.m2950n(this.f3550b, c0526f, this.f3551c);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3550b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$f */
        class f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3553a;

            /* renamed from: b */
            final /* synthetic */ String f3554b;

            /* renamed from: c */
            final /* synthetic */ int f3555c;

            /* renamed from: d */
            final /* synthetic */ int f3556d;

            /* renamed from: e */
            final /* synthetic */ Bundle f3557e;

            f(InterfaceC0534n interfaceC0534n, String str, int i4, int i5, Bundle bundle) {
                this.f3553a = interfaceC0534n;
                this.f3554b = str;
                this.f3555c = i4;
                this.f3556d = i5;
                this.f3557e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() throws RemoteException {
                IBinder iBinderAsBinder = this.f3553a.asBinder();
                MediaBrowserServiceCompat.this.f3489b.remove(iBinderAsBinder);
                C0526f c0526f = MediaBrowserServiceCompat.this.new C0526f(this.f3554b, this.f3555c, this.f3556d, this.f3557e, this.f3553a);
                MediaBrowserServiceCompat.this.f3489b.put(iBinderAsBinder, c0526f);
                try {
                    iBinderAsBinder.linkToDeath(c0526f, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$g */
        class g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3559a;

            g(InterfaceC0534n interfaceC0534n) {
                this.f3559a = interfaceC0534n;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f3559a.asBinder();
                C0526f c0526fRemove = MediaBrowserServiceCompat.this.f3489b.remove(iBinderAsBinder);
                if (c0526fRemove != null) {
                    iBinderAsBinder.unlinkToDeath(c0526fRemove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$h */
        class h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3561a;

            /* renamed from: b */
            final /* synthetic */ String f3562b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3563c;

            /* renamed from: d */
            final /* synthetic */ ResultReceiver f3564d;

            h(InterfaceC0534n interfaceC0534n, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3561a = interfaceC0534n;
                this.f3562b = str;
                this.f3563c = bundle;
                this.f3564d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = MediaBrowserServiceCompat.this.f3489b.get(this.f3561a.asBinder());
                if (c0526f != null) {
                    MediaBrowserServiceCompat.this.m2951o(this.f3562b, this.f3563c, c0526f, this.f3564d);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3562b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$i */
        class i implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0534n f3566a;

            /* renamed from: b */
            final /* synthetic */ String f3567b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3568c;

            /* renamed from: d */
            final /* synthetic */ ResultReceiver f3569d;

            i(InterfaceC0534n interfaceC0534n, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3566a = interfaceC0534n;
                this.f3567b = str;
                this.f3568c = bundle;
                this.f3569d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0526f c0526f = MediaBrowserServiceCompat.this.f3489b.get(this.f3566a.asBinder());
                if (c0526f != null) {
                    MediaBrowserServiceCompat.this.m2948l(this.f3567b, this.f3568c, c0526f, this.f3569d);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3567b + ", extras=" + this.f3568c);
            }
        }

        C0533m() {
        }

        /* renamed from: a */
        public void m2971a(String str, IBinder iBinder, Bundle bundle, InterfaceC0534n interfaceC0534n) {
            MediaBrowserServiceCompat.this.f3491d.m2983a(new c(interfaceC0534n, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m2972b(String str, int i4, int i5, Bundle bundle, InterfaceC0534n interfaceC0534n) {
            if (MediaBrowserServiceCompat.this.m2939c(str, i5)) {
                MediaBrowserServiceCompat.this.f3491d.m2983a(new a(interfaceC0534n, str, i4, i5, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i5 + " package=" + str);
        }

        /* renamed from: c */
        public void m2973c(InterfaceC0534n interfaceC0534n) {
            MediaBrowserServiceCompat.this.f3491d.m2983a(new b(interfaceC0534n));
        }

        /* renamed from: d */
        public void m2974d(String str, ResultReceiver resultReceiver, InterfaceC0534n interfaceC0534n) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3491d.m2983a(new e(interfaceC0534n, str, resultReceiver));
        }

        /* renamed from: e */
        public void m2975e(InterfaceC0534n interfaceC0534n, String str, int i4, int i5, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3491d.m2983a(new f(interfaceC0534n, str, i4, i5, bundle));
        }

        /* renamed from: f */
        public void m2976f(String str, IBinder iBinder, InterfaceC0534n interfaceC0534n) {
            MediaBrowserServiceCompat.this.f3491d.m2983a(new d(interfaceC0534n, str, iBinder));
        }

        /* renamed from: g */
        public void m2977g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0534n interfaceC0534n) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3491d.m2983a(new h(interfaceC0534n, str, bundle, resultReceiver));
        }

        /* renamed from: h */
        public void m2978h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0534n interfaceC0534n) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3491d.m2983a(new i(interfaceC0534n, str, bundle, resultReceiver));
        }

        /* renamed from: i */
        public void m2979i(InterfaceC0534n interfaceC0534n) {
            MediaBrowserServiceCompat.this.f3491d.m2983a(new g(interfaceC0534n));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    private interface InterfaceC0534n {
        /* renamed from: a */
        void mo2980a() throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo2981b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    private static class C0535o implements InterfaceC0534n {

        /* renamed from: a */
        final Messenger f3571a;

        C0535o(Messenger messenger) {
            this.f3571a = messenger;
        }

        /* renamed from: c */
        private void m2982c(int i4, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i4;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f3571a.send(messageObtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0534n
        /* renamed from: a */
        public void mo2980a() throws RemoteException {
            m2982c(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0534n
        public IBinder asBinder() {
            return this.f3571a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0534n
        /* renamed from: b */
        public void mo2981b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m2982c(3, bundle3);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    private final class HandlerC0536p extends Handler {

        /* renamed from: a */
        private final C0533m f3572a;

        HandlerC0536p() {
            this.f3572a = MediaBrowserServiceCompat.this.new C0533m();
        }

        /* renamed from: a */
        public void m2983a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f3572a.m2972b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0535o(message.replyTo));
                    break;
                case 2:
                    this.f3572a.m2973c(new C0535o(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f3572a.m2971a(data.getString("data_media_item_id"), C0324e.m1777a(data, "data_callback_token"), bundle2, new C0535o(message.replyTo));
                    break;
                case 4:
                    this.f3572a.m2976f(data.getString("data_media_item_id"), C0324e.m1777a(data, "data_callback_token"), new C0535o(message.replyTo));
                    break;
                case 5:
                    this.f3572a.m2974d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0535o(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f3572a.m2975e(new C0535o(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f3572a.m2979i(new C0535o(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f3572a.m2977g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0535o(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f3572a.m2978h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0535o(message.replyTo));
                    break;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j4) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j4);
        }
    }

    /* renamed from: a */
    void m2937a(String str, C0526f c0526f, IBinder iBinder, Bundle bundle) {
        List<C1021d<IBinder, Bundle>> arrayList = c0526f.f3510g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (C1021d<IBinder, Bundle> c1021d : arrayList) {
            if (iBinder == c1021d.f5698a && C0537a.m2984a(bundle, c1021d.f5699b)) {
                return;
            }
        }
        arrayList.add(new C1021d<>(iBinder, bundle));
        c0526f.f3510g.put(str, arrayList);
        m2949m(str, c0526f, bundle, null);
        this.f3490c = c0526f;
        m2946j(str, bundle);
        this.f3490c = null;
    }

    /* renamed from: b */
    List<MediaBrowserCompat.MediaItem> m2938b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i4 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i5 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i4 == -1 && i5 == -1) {
            return list;
        }
        int i6 = i5 * i4;
        int size = i6 + i5;
        if (i4 < 0 || i5 < 1 || i6 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i6, size);
    }

    /* renamed from: c */
    boolean m2939c(String str, int i4) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i4)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m2940d(String str, Bundle bundle, C0532l<Bundle> c0532l) {
        c0532l.m2968e(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract C0525e m2941e(String str, int i4, Bundle bundle);

    /* renamed from: f */
    public abstract void m2942f(String str, C0532l<List<MediaBrowserCompat.MediaItem>> c0532l);

    /* renamed from: g */
    public void m2943g(String str, C0532l<List<MediaBrowserCompat.MediaItem>> c0532l, Bundle bundle) {
        c0532l.m2970g(1);
        m2942f(str, c0532l);
    }

    /* renamed from: h */
    public void m2944h(String str, C0532l<MediaBrowserCompat.MediaItem> c0532l) {
        c0532l.m2970g(2);
        c0532l.m2969f(null);
    }

    /* renamed from: i */
    public void m2945i(String str, Bundle bundle, C0532l<List<MediaBrowserCompat.MediaItem>> c0532l) {
        c0532l.m2970g(4);
        c0532l.m2969f(null);
    }

    /* renamed from: j */
    public void m2946j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void m2947k(String str) {
    }

    /* renamed from: l */
    void m2948l(String str, Bundle bundle, C0526f c0526f, ResultReceiver resultReceiver) {
        C0524d c0524d = new C0524d(str, resultReceiver);
        this.f3490c = c0526f;
        m2940d(str, bundle, c0524d);
        this.f3490c = null;
        if (c0524d.m2967b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    /* renamed from: m */
    void m2949m(String str, C0526f c0526f, Bundle bundle, Bundle bundle2) {
        C0521a c0521a = new C0521a(str, c0526f, str, bundle, bundle2);
        this.f3490c = c0526f;
        if (bundle == null) {
            m2942f(str, c0521a);
        } else {
            m2943g(str, c0521a, bundle);
        }
        this.f3490c = null;
        if (c0521a.m2967b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0526f.f3504a + " id=" + str);
    }

    /* renamed from: n */
    void m2950n(String str, C0526f c0526f, ResultReceiver resultReceiver) {
        C0522b c0522b = new C0522b(str, resultReceiver);
        this.f3490c = c0526f;
        m2944h(str, c0522b);
        this.f3490c = null;
        if (c0522b.m2967b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    /* renamed from: o */
    void m2951o(String str, Bundle bundle, C0526f c0526f, ResultReceiver resultReceiver) {
        C0523c c0523c = new C0523c(str, resultReceiver);
        this.f3490c = c0526f;
        m2945i(str, bundle, c0523c);
        this.f3490c = null;
        if (c0523c.m2967b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3488a.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            this.f3488a = new C0531k();
        } else if (i4 >= 26) {
            this.f3488a = new C0530j();
        } else if (i4 >= 23) {
            this.f3488a = new C0529i();
        } else {
            this.f3488a = new C0528h();
        }
        this.f3488a.onCreate();
    }

    /* renamed from: p */
    boolean m2952p(String str, C0526f c0526f, IBinder iBinder) {
        boolean z3 = false;
        try {
            if (iBinder == null) {
                return c0526f.f3510g.remove(str) != null;
            }
            List<C1021d<IBinder, Bundle>> list = c0526f.f3510g.get(str);
            if (list != null) {
                Iterator<C1021d<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f5698a) {
                        it.remove();
                        z3 = true;
                    }
                }
                if (list.size() == 0) {
                    c0526f.f3510g.remove(str);
                }
            }
            return z3;
        } finally {
            this.f3490c = c0526f;
            m2947k(str);
            this.f3490c = null;
        }
    }
}
