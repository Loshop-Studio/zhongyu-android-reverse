package com.zykj.image;

import androidx.camera.core.ImageCaptureException;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.image.ImagePickFragment$takePic$1$onError$1", m17801f = "ImagePickFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImagePickFragment$takePic$1$onError$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9757a;

    /* renamed from: b */
    public final /* synthetic */ ImageCaptureException f9758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onError$1(ImageCaptureException imageCaptureException, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9758b = imageCaptureException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ImagePickFragment$takePic$1$onError$1(this.f9758b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImagePickFragment$takePic$1$onError$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer messageResId;
        AbstractC9434a.m17291f();
        if (this.f9757a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        int imageCaptureError = this.f9758b.getImageCaptureError();
        if (imageCaptureError == 0) {
            Integer messageResId2 = ErrorCode.IMAGE_CAPTURE_ERROR_UNKNOWN.getErrorCodeInfo().getMessageResId();
            if (messageResId2 != null) {
                XToastUtils.INSTANCE.error(messageResId2.intValue());
            }
        } else if (imageCaptureError == 1) {
            Integer messageResId3 = ErrorCode.IMAGE_CAPTURE_ERROR_FILE_IO.getErrorCodeInfo().getMessageResId();
            if (messageResId3 != null) {
                XToastUtils.INSTANCE.error(messageResId3.intValue());
            }
        } else if (imageCaptureError == 2) {
            Integer messageResId4 = ErrorCode.IMAGE_CAPTURE_CAPTURE_FAILED.getErrorCodeInfo().getMessageResId();
            if (messageResId4 != null) {
                XToastUtils.INSTANCE.error(messageResId4.intValue());
            }
        } else if (imageCaptureError == 3) {
            Integer messageResId5 = ErrorCode.IMAGE_CAPTURE_ERROR_CAMERA_CLOSED.getErrorCodeInfo().getMessageResId();
            if (messageResId5 != null) {
                XToastUtils.INSTANCE.error(messageResId5.intValue());
            }
        } else if (imageCaptureError == 4 && (messageResId = ErrorCode.IMAGE_CAPTURE_ERROR_INVALID_CAMERA.getErrorCodeInfo().getMessageResId()) != null) {
            XToastUtils.INSTANCE.error(messageResId.intValue());
        }
        return C8736p.f16368a;
    }
}
