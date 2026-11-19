package com.canhub.cropper;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public abstract class CropException extends Exception {

    /* renamed from: a */
    public static final C5463a f3362a = new C5463a(null);

    public static final class Cancellation extends CropException {

        /* renamed from: b */
        public static final C5460a f3363b = new C5460a(null);

        /* renamed from: com.canhub.cropper.CropException$Cancellation$a */
        public static final class C5460a {
            public /* synthetic */ C5460a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C5460a() {
            }
        }

        public Cancellation() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    public static final class FailedToDecodeImage extends CropException {

        /* renamed from: b */
        public static final C5461a f3364b = new C5461a(null);

        /* renamed from: com.canhub.cropper.CropException$FailedToDecodeImage$a */
        public static final class C5461a {
            public /* synthetic */ C5461a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C5461a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToDecodeImage(Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            AbstractC9133u.m16133g(uri, "uri");
        }
    }

    public static final class FailedToLoadBitmap extends CropException {

        /* renamed from: b */
        public static final C5462a f3365b = new C5462a(null);

        /* renamed from: com.canhub.cropper.CropException$FailedToLoadBitmap$a */
        public static final class C5462a {
            public /* synthetic */ C5462a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C5462a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToLoadBitmap(Uri uri, String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            AbstractC9133u.m16133g(uri, "uri");
        }
    }

    /* renamed from: com.canhub.cropper.CropException$a */
    public static final class C5463a {
        public /* synthetic */ C5463a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C5463a() {
        }
    }

    public /* synthetic */ CropException(String str, AbstractC9126n abstractC9126n) {
        this(str);
    }

    public CropException(String str) {
        super(str);
    }
}
