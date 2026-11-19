package p001a0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: a0.a */
/* loaded from: classes2.dex */
public final class C0001a implements InterfaceC0003c {

    /* renamed from: c */
    public static final String[] f0c = {"_data"};

    /* renamed from: d */
    public static final String[] f1d = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f2a;

    /* renamed from: b */
    public final ContentResolver f3b;

    public /* synthetic */ C0001a(ContentResolver contentResolver, int i) {
        this.f2a = i;
        this.f3b = contentResolver;
    }

    @Override // p001a0.InterfaceC0003c
    /* renamed from: a */
    public final Cursor mo17a(Uri uri) {
        switch (this.f2a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f3b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f0c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f3b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f1d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
