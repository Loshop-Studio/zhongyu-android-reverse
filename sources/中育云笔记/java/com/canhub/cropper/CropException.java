package com.canhub.cropper;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public abstract class CropException extends Exception {

    /* renamed from: c */
    public static final C5882a f5132c = new C5882a(null);

    public static final class Cancellation extends CropException {

        /* renamed from: d */
        public static final C5879a f5133d = new C5879a(null);

        /* renamed from: com.canhub.cropper.CropException$Cancellation$a */
        public static final class C5879a {
            public /* synthetic */ C5879a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C5879a() {
            }
        }

        public Cancellation() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    public static final class FailedToDecodeImage extends CropException {

        /* renamed from: d */
        public static final C5880a f5134d = new C5880a(null);

        /* renamed from: com.canhub.cropper.CropException$FailedToDecodeImage$a */
        public static final class C5880a {
            public /* synthetic */ C5880a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C5880a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToDecodeImage(Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            AbstractC9979u.m20294g(uri, "uri");
        }
    }

    public static final class FailedToLoadBitmap extends CropException {

        /* renamed from: d */
        public static final C5881a f5135d = new C5881a(null);

        /* renamed from: com.canhub.cropper.CropException$FailedToLoadBitmap$a */
        public static final class C5881a {
            public /* synthetic */ C5881a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C5881a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToLoadBitmap(Uri uri, String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            AbstractC9979u.m20294g(uri, "uri");
        }
    }

    /* renamed from: com.canhub.cropper.CropException$a */
    public static final class C5882a {
        public /* synthetic */ C5882a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5882a() {
        }
    }

    public /* synthetic */ CropException(String str, AbstractC9972n abstractC9972n) {
        this(str);
    }

    public CropException(String str) {
        super(str);
    }
}
