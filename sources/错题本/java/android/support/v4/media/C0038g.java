package android.support.v4.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.session.AbstractC0048f;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import com.canhub.cropper.CropImage$ActivityResult;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p015b.BinderC3058c;
import p015b.C3056a;
import p015b.InterfaceC3057b;

/* renamed from: android.support.v4.media.g */
/* loaded from: classes.dex */
public final class C0038g implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f94a;

    public /* synthetic */ C0038g(int i) {
        this.f94a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        Uri mediaUri;
        Bundle bundle;
        InterfaceC3057b interfaceC3057b = null;
        switch (this.f94a) {
            case 0:
                return new MediaBrowserCompat$MediaItem(in);
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(in);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    AbstractC0048f.m134a(extras);
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f80i = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(in);
            case 3:
                return new RatingCompat(in.readInt(), in.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(in);
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f104a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(in);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                return new MediaSessionCompat$Token(in.readParcelable(null), null);
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f107a = in.readInt();
                parcelableVolumeInfo.f109c = in.readInt();
                parcelableVolumeInfo.f110d = in.readInt();
                parcelableVolumeInfo.f111e = in.readInt();
                parcelableVolumeInfo.f108b = in.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(in);
            case 9:
                android.support.v4.os.ResultReceiver resultReceiver = new android.support.v4.os.ResultReceiver();
                IBinder strongBinder = in.readStrongBinder();
                int i = BinderC3058c.f1378d;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC3057b.f1377b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3057b)) {
                        C3056a c3056a = new C3056a();
                        c3056a.f1376c = strongBinder;
                        interfaceC3057b = c3056a;
                    } else {
                        interfaceC3057b = (InterfaceC3057b) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f135a = interfaceC3057b;
                return resultReceiver;
            case 10:
                AbstractC5830k.m5330g(in, "in");
                Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
                Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
                Exception exc = (Exception) in.readSerializable();
                float[] fArrCreateFloatArray = in.createFloatArray();
                AbstractC5830k.m5327d(fArrCreateFloatArray);
                return new CropImage$ActivityResult(uri, uri2, exc, fArrCreateFloatArray, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
            case 11:
                ServerInfo serverInfo = new ServerInfo();
                int i8 = in.readInt();
                serverInfo.f5728a = i8 != -1 ? Status.values()[i8] : null;
                serverInfo.f5729b = in.readString();
                serverInfo.f5730c = in.readString();
                serverInfo.f5731d = in.readString();
                serverInfo.f5732e = in.readString();
                return serverInfo;
            case 12:
                return Status.valueOf(in.readString());
            case 13:
                UserInfo userInfo = new UserInfo();
                userInfo.f5734a = (Long) in.readValue(Long.class.getClassLoader());
                userInfo.f5735b = in.readString();
                userInfo.f5736c = in.readString();
                userInfo.f5737d = in.readString();
                userInfo.f5738e = in.readString();
                userInfo.f5739f = in.readString();
                userInfo.f5740g = Integer.valueOf(in.readInt());
                return userInfo;
            case 14:
                return new UserInfoBean(in);
            case 15:
                return new PlugInBean(in);
            case 16:
                return new StrategyBean(in);
            default:
                return new CrashDetailBean(in);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f94a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new android.support.v4.os.ResultReceiver[i];
            case 10:
                return new CropImage$ActivityResult[i];
            case 11:
                return new ServerInfo[i];
            case 12:
                return new Status[i];
            case 13:
                return new UserInfo[i];
            case 14:
                return new UserInfoBean[i];
            case 15:
                return new PlugInBean[i];
            case 16:
                return new StrategyBean[i];
            default:
                return new CrashDetailBean[i];
        }
    }
}
