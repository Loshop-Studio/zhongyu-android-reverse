package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.CropImageView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 Î\u00012\u00020\u0001:\u0003i(\u0014B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u001f\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ'\u00104\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\u0015\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020'¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u000201¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020'¢\u0006\u0004\bQ\u0010AJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0018¢\u0006\u0004\bS\u0010HJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u0018¢\u0006\u0004\bU\u0010HJ\u0015\u0010\"\u001a\u00020'2\u0006\u0010V\u001a\u00020'¢\u0006\u0004\b\"\u0010WJ\u0015\u0010Y\u001a\u00020'2\u0006\u0010X\u001a\u00020'¢\u0006\u0004\bY\u0010WJ-\u0010^\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\b2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bd\u0010\u0013J\u0017\u0010g\u001a\u00020'2\u0006\u0010f\u001a\u00020eH\u0017¢\u0006\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010qR\u0016\u0010t\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010sR\u0016\u0010u\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010sR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010wR\u0018\u0010z\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010yR\u0014\u0010|\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010~R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010~R\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010~R\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010~R\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010~R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u008b\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010{R\u0018\u0010\u008d\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010jR\u0017\u0010\u0090\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010jR\u0017\u0010\u0091\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010jR\u0017\u0010\u0092\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010jR\u0017\u0010\u0093\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010jR\u001b\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0095\u0001R)\u0010\u009a\u0001\u001a\u00020'2\u0007\u0010\u0097\u0001\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010s\u001a\u0006\b\u0085\u0001\u0010\u0099\u0001R\u0019\u0010\u009c\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008c\u0001R\u0019\u0010\u009e\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008c\u0001R\u0018\u0010 \u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010jR-\u0010M\u001a\u0004\u0018\u00010L2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R-\u00108\u001a\u0004\u0018\u0001072\t\u0010\u0097\u0001\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R-\u0010¬\u0001\u001a\u0004\u0018\u00010;2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010;8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bj\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010®\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010sR\u0019\u0010±\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010jR\u0019\u0010´\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u008c\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¹\u0001\u0010sR\u0016\u0010¼\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b»\u0001\u0010jR\u0017\u0010½\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0099\u0001R(\u0010Á\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0005\bÀ\u0001\u0010\u000eR)\u0010Â\u0001\u001a\u0002012\u0007\u0010Â\u0001\u001a\u0002018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0005\bÅ\u0001\u0010KR)\u0010Æ\u0001\u001a\u0002012\u0007\u0010Æ\u0001\u001a\u0002018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÇ\u0001\u0010Ä\u0001\"\u0005\bÈ\u0001\u0010KR/\u0010Í\u0001\u001a\u0005\u0018\u00010µ\u00012\t\u0010\f\u001a\u0005\u0018\u00010µ\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001¨\u0006Ï\u0001"}, m13413d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "n", "()V", "Landroid/graphics/RectF;", "rect", "l", "(Landroid/graphics/RectF;)V", "y", "Landroid/graphics/Canvas;", "canvas", "i", "(Landroid/graphics/Canvas;)V", "c", "j", "d", "h", "", "cornerOffset", "cornerExtension", "f", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FF)V", "k", "radius", "g", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFF)V", "e", "x", "q", "(FF)V", "s", "r", "", "b", "(Landroid/graphics/RectF;)Z", "Lcom/canhub/cropper/CropOverlayView$b;", "listener", "setCropWindowChangeListener", "(Lcom/canhub/cropper/CropOverlayView$b;)V", "m", "", "boundsPoints", "", "viewWidth", "viewHeight", "u", "([FII)V", "t", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", "", "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "setCropLabelTextSize", "(F)V", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "multiTouchEnabled", "(Z)Z", "centerMoveEnabled", "v", "maxWidth", "maxHeight", "scaleFactorWidth", "scaleFactorHeight", "w", "(FFFF)V", "Lcom/canhub/cropper/CropImageOptions;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/CropImageOptions;)V", "onDraw", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "F", "mCropCornerRadius", "Ljava/lang/Integer;", "mCircleCornerFillColor", "Lcom/canhub/cropper/CropImageOptions;", "mOptions", "Landroid/view/ScaleGestureDetector;", "Landroid/view/ScaleGestureDetector;", "mScaleDetector", "Z", "mMultiTouchEnabled", "mCenterMoveEnabled", "Lcom/canhub/cropper/d;", "Lcom/canhub/cropper/d;", "mCropWindowHandler", "Lcom/canhub/cropper/CropOverlayView$b;", "mCropWindowChangeListener", "Landroid/graphics/RectF;", "mDrawRect", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBorderPaint", "mBorderCornerPaint", "mGuidelinePaint", "mBackgroundPaint", "textLabelPaint", "Landroid/graphics/Path;", "o", "Landroid/graphics/Path;", "mPath", "p", "[F", "mBoundsPoints", "mCalcBounds", "I", "mViewWidth", "mViewHeight", "mBorderCornerOffset", "mBorderCornerLength", "mInitialCropWindowPaddingRatio", "mTouchRadius", "mSnapRadius", "Lcom/canhub/cropper/CropWindowMoveHandler;", "Lcom/canhub/cropper/CropWindowMoveHandler;", "mMoveHandler", "value", "z", "()Z", "isFixAspectRatio", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mAspectRatioX", "B", "mAspectRatioY", "C", "mTargetAspectRatio", "D", "Lcom/canhub/cropper/CropImageView$Guidelines;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", ExifInterface.LONGITUDE_EAST, "Lcom/canhub/cropper/CropImageView$CropShape;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "G", "isCropLabelEnabled", "H", "Ljava/lang/String;", "cropLabelText", "cropLabelTextSize", "J", "cropLabelTextColor", "Landroid/graphics/Rect;", "K", "Landroid/graphics/Rect;", "mInitialCropWindowRect", "L", "initializedCropWindow", "M", "maxVerticalGestureExclusion", "isNonStraightAngleRotated", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "N", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropOverlayView.kt\ncom/canhub/cropper/CropOverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1304:1\n1#2:1305\n*E\n"})
/* loaded from: classes3.dex */
public final class CropOverlayView extends View {

    /* renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: from kotlin metadata */
    public int mAspectRatioX;

    /* renamed from: B, reason: from kotlin metadata */
    public int mAspectRatioY;

    /* renamed from: C, reason: from kotlin metadata */
    public float mTargetAspectRatio;

    /* renamed from: D, reason: from kotlin metadata */
    public CropImageView.Guidelines guidelines;

    /* renamed from: E, reason: from kotlin metadata */
    public CropImageView.CropShape cropShape;

    /* renamed from: F, reason: from kotlin metadata */
    public CropImageView.CropCornerShape cornerShape;

    /* renamed from: G, reason: from kotlin metadata */
    public boolean isCropLabelEnabled;

    /* renamed from: H, reason: from kotlin metadata */
    public String cropLabelText;

    /* renamed from: I, reason: from kotlin metadata */
    public float cropLabelTextSize;

    /* renamed from: J, reason: from kotlin metadata */
    public int cropLabelTextColor;

    /* renamed from: K, reason: from kotlin metadata */
    public final Rect mInitialCropWindowRect;

    /* renamed from: L, reason: from kotlin metadata */
    public boolean initializedCropWindow;

    /* renamed from: M, reason: from kotlin metadata */
    public final float maxVerticalGestureExclusion;

    /* renamed from: a, reason: from kotlin metadata */
    public float mCropCornerRadius;

    /* renamed from: b, reason: from kotlin metadata */
    public Integer mCircleCornerFillColor;

    /* renamed from: c, reason: from kotlin metadata */
    public CropImageOptions mOptions;

    /* renamed from: d, reason: from kotlin metadata */
    public ScaleGestureDetector mScaleDetector;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean mMultiTouchEnabled;

    /* renamed from: f, reason: from kotlin metadata */
    public boolean mCenterMoveEnabled;

    /* renamed from: g, reason: from kotlin metadata */
    public final C5543d mCropWindowHandler;

    /* renamed from: h, reason: from kotlin metadata */
    public InterfaceC5535b mCropWindowChangeListener;

    /* renamed from: i, reason: from kotlin metadata */
    public final RectF mDrawRect;

    /* renamed from: j, reason: from kotlin metadata */
    public Paint mBorderPaint;

    /* renamed from: k, reason: from kotlin metadata */
    public Paint mBorderCornerPaint;

    /* renamed from: l, reason: from kotlin metadata */
    public Paint mGuidelinePaint;

    /* renamed from: m, reason: from kotlin metadata */
    public Paint mBackgroundPaint;

    /* renamed from: n, reason: from kotlin metadata */
    public Paint textLabelPaint;

    /* renamed from: o, reason: from kotlin metadata */
    public final Path mPath;

    /* renamed from: p, reason: from kotlin metadata */
    public final float[] mBoundsPoints;

    /* renamed from: q, reason: from kotlin metadata */
    public final RectF mCalcBounds;

    /* renamed from: r, reason: from kotlin metadata */
    public int mViewWidth;

    /* renamed from: s, reason: from kotlin metadata */
    public int mViewHeight;

    /* renamed from: t, reason: from kotlin metadata */
    public float mBorderCornerOffset;

    /* renamed from: u, reason: from kotlin metadata */
    public float mBorderCornerLength;

    /* renamed from: v, reason: from kotlin metadata */
    public float mInitialCropWindowPaddingRatio;

    /* renamed from: w, reason: from kotlin metadata */
    public float mTouchRadius;

    /* renamed from: x, reason: from kotlin metadata */
    public float mSnapRadius;

    /* renamed from: y, reason: from kotlin metadata */
    public CropWindowMoveHandler mMoveHandler;

    /* renamed from: z, reason: from kotlin metadata */
    public boolean isFixAspectRatio;

    /* renamed from: com.canhub.cropper.CropOverlayView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Paint m3515a(int i9) {
            Paint paint = new Paint();
            paint.setColor(i9);
            return paint;
        }

        /* renamed from: b */
        public final Paint m3516b(float f10, int i9) {
            if (f10 <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i9);
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        /* renamed from: c */
        public final Paint m3517c(int i9) {
            Paint paint = new Paint();
            paint.setColor(i9);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        /* renamed from: d */
        public final Paint m3518d(CropImageOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(options.cropperLabelTextSize);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(options.cropperLabelTextColor);
            return paint;
        }

        public Companion() {
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$b */
    public interface InterfaceC5535b {
        /* renamed from: a */
        void mo3459a(boolean z9);
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$c */
    public final class C5536c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C5536c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            RectF rectFM3597i = CropOverlayView.this.mCropWindowHandler.m3597i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < 0.0f || f13 > CropOverlayView.this.mCropWindowHandler.m3592d() || f11 < 0.0f || f14 > CropOverlayView.this.mCropWindowHandler.m3591c()) {
                return true;
            }
            rectFM3597i.set(f12, f11, f13, f14);
            CropOverlayView.this.mCropWindowHandler.m3611w(rectFM3597i);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$d */
    public /* synthetic */ class C5537d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3925a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3926b;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f3850a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f3852c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f3853d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f3851b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3925a = iArr;
            int[] iArr2 = new int[CropImageView.CropCornerShape.values().length];
            try {
                iArr2[CropImageView.CropCornerShape.f3847b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.CropCornerShape.f3846a.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f3926b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCenterMoveEnabled = true;
        this.mCropWindowHandler = new C5543d();
        this.mDrawRect = new RectF();
        this.mPath = new Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new RectF();
        this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
        this.cropLabelText = "";
        this.cropLabelTextSize = 20.0f;
        this.cropLabelTextColor = -1;
        this.mInitialCropWindowRect = new Rect();
        this.maxVerticalGestureExclusion = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public final boolean m3491b(RectF rect) {
        float f10;
        float f11;
        C5540a c5540a = C5540a.f3947a;
        float fM3537A = c5540a.m3537A(this.mBoundsPoints);
        float fM3539C = c5540a.m3539C(this.mBoundsPoints);
        float fM3538B = c5540a.m3538B(this.mBoundsPoints);
        float fM3569v = c5540a.m3569v(this.mBoundsPoints);
        if (!m3505p()) {
            this.mCalcBounds.set(fM3537A, fM3539C, fM3538B, fM3569v);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                f14 = fArr[2];
                f12 = f14;
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f19 = (f13 - f10) / (f12 - f11);
        float f20 = (-1.0f) / f19;
        float f21 = f10 - (f19 * f11);
        float f22 = f10 - (f11 * f20);
        float f23 = f15 - (f19 * f14);
        float f24 = f15 - (f14 * f20);
        float fCenterY = rect.centerY() - rect.top;
        float fCenterX = rect.centerX();
        float f25 = rect.left;
        float f26 = fCenterY / (fCenterX - f25);
        float f27 = -f26;
        float f28 = rect.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rect.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        float fMax = Math.max(fM3537A, f33 < f30 ? f33 : fM3537A);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rect.right) {
            f34 = fMax;
        }
        float fMax2 = Math.max(fMax, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        float fMax3 = Math.max(fMax2, f36 < rect.right ? f36 : fMax2);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rect.left) {
            f37 = fM3538B;
        }
        float fMin = Math.min(fM3538B, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rect.left) {
            f38 = fMin;
        }
        float fMin2 = Math.min(fMin, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rect.left) {
            f39 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f39);
        float fMax4 = Math.max(fM3539C, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fM3569v, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF = this.mCalcBounds;
        rectF.left = fMax3;
        rectF.top = fMax4;
        rectF.right = fMin3;
        rectF.bottom = fMin4;
        return true;
    }

    /* renamed from: c */
    public final void m3492c(Canvas canvas) {
        RectF rectFM3597i = this.mCropWindowHandler.m3597i();
        C5540a c5540a = C5540a.f3947a;
        float fMax = Math.max(c5540a.m3537A(this.mBoundsPoints), 0.0f);
        float fMax2 = Math.max(c5540a.m3539C(this.mBoundsPoints), 0.0f);
        float fMin = Math.min(c5540a.m3538B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(c5540a.m3569v(this.mBoundsPoints), getHeight());
        CropImageView.CropShape cropShape = this.cropShape;
        int i9 = cropShape == null ? -1 : C5537d.f3925a[cropShape.ordinal()];
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            if (i9 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.mPath.reset();
            this.mDrawRect.set(rectFM3597i.left, rectFM3597i.top, rectFM3597i.right, rectFM3597i.bottom);
            this.mPath.addOval(this.mDrawRect, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.XOR);
            }
            Paint paint = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!m3505p()) {
            float f10 = rectFM3597i.top;
            Paint paint2 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f10, paint2);
            float f11 = rectFM3597i.bottom;
            Paint paint3 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint3);
            canvas.drawRect(fMax, f11, fMin, fMin2, paint3);
            float f12 = rectFM3597i.top;
            float f13 = rectFM3597i.left;
            float f14 = rectFM3597i.bottom;
            Paint paint4 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint4);
            canvas.drawRect(fMax, f12, f13, f14, paint4);
            float f15 = rectFM3597i.right;
            float f16 = rectFM3597i.top;
            float f17 = rectFM3597i.bottom;
            Paint paint5 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint5);
            canvas.drawRect(f15, f16, fMin, f17, paint5);
            return;
        }
        this.mPath.reset();
        Path path = this.mPath;
        float[] fArr = this.mBoundsPoints;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.mPath;
        float[] fArr2 = this.mBoundsPoints;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.mPath;
        float[] fArr3 = this.mBoundsPoints;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.mPath;
        float[] fArr4 = this.mBoundsPoints;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.mPath.close();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.mPath);
        } else {
            canvas.clipPath(this.mPath, Region.Op.INTERSECT);
        }
        Paint paint6 = this.mBackgroundPaint;
        Intrinsics.checkNotNull(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    /* renamed from: d */
    public final void m3493d(Canvas canvas) {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            Intrinsics.checkNotNull(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            float f10 = strokeWidth / 2;
            rectFM3597i.inset(f10, f10);
            CropImageView.CropShape cropShape = this.cropShape;
            int i9 = cropShape == null ? -1 : C5537d.f3925a[cropShape.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                Paint paint2 = this.mBorderPaint;
                Intrinsics.checkNotNull(paint2);
                canvas.drawRect(rectFM3597i, paint2);
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.mBorderPaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawOval(rectFM3597i, paint3);
            }
        }
    }

    /* renamed from: e */
    public final void m3494e(Canvas canvas, RectF rect, float cornerExtension, float radius) {
        float f10 = rect.left - cornerExtension;
        float f11 = rect.top - cornerExtension;
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(f10, f11, radius, paint);
        float f12 = rect.right + cornerExtension;
        float f13 = rect.top - cornerExtension;
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawCircle(f12, f13, radius, paint2);
        float f14 = rect.left - cornerExtension;
        float f15 = rect.bottom + cornerExtension;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawCircle(f14, f15, radius, paint3);
        float f16 = rect.right + cornerExtension;
        float f17 = rect.bottom + cornerExtension;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawCircle(f16, f17, radius, paint4);
    }

    /* renamed from: f */
    public final void m3495f(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        CropImageView.CropShape cropShape = this.cropShape;
        int i9 = cropShape == null ? -1 : C5537d.f3925a[cropShape.ordinal()];
        if (i9 == 1) {
            m3496g(canvas, rect, cornerOffset, cornerExtension, this.mCropCornerRadius);
            return;
        }
        if (i9 == 2) {
            float fCenterX = rect.centerX() - this.mBorderCornerLength;
            float f10 = rect.top - cornerOffset;
            float fCenterX2 = rect.centerX() + this.mBorderCornerLength;
            float f11 = rect.top - cornerOffset;
            Paint paint = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint);
            canvas.drawLine(fCenterX, f10, fCenterX2, f11, paint);
            float fCenterX3 = rect.centerX() - this.mBorderCornerLength;
            float f12 = rect.bottom + cornerOffset;
            float fCenterX4 = rect.centerX() + this.mBorderCornerLength;
            float f13 = rect.bottom + cornerOffset;
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawLine(fCenterX3, f12, fCenterX4, f13, paint2);
            return;
        }
        if (i9 != 3) {
            if (i9 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            m3500k(canvas, rect, cornerOffset, cornerExtension);
            return;
        }
        float f14 = rect.left - cornerOffset;
        float fCenterY = rect.centerY() - this.mBorderCornerLength;
        float f15 = rect.left - cornerOffset;
        float fCenterY2 = rect.centerY() + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f14, fCenterY, f15, fCenterY2, paint3);
        float f16 = rect.right + cornerOffset;
        float fCenterY3 = rect.centerY() - this.mBorderCornerLength;
        float f17 = rect.right + cornerOffset;
        float fCenterY4 = rect.centerY() + this.mBorderCornerLength;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(f16, fCenterY3, f17, fCenterY4, paint4);
    }

    /* renamed from: g */
    public final void m3496g(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension, float radius) {
        CropImageView.CropCornerShape cropCornerShape = this.cornerShape;
        int i9 = cropCornerShape == null ? -1 : C5537d.f3926b[cropCornerShape.ordinal()];
        if (i9 != -1) {
            if (i9 == 1) {
                m3494e(canvas, rect, cornerOffset, radius);
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m3500k(canvas, rect, cornerOffset, cornerExtension);
            }
        }
    }

    /* renamed from: getAspectRatioX, reason: from getter */
    public final int getMAspectRatioX() {
        return this.mAspectRatioX;
    }

    /* renamed from: getAspectRatioY, reason: from getter */
    public final int getMAspectRatioY() {
        return this.mAspectRatioY;
    }

    public final CropImageView.CropCornerShape getCornerShape() {
        return this.cornerShape;
    }

    public final CropImageView.CropShape getCropShape() {
        return this.cropShape;
    }

    public final RectF getCropWindowRect() {
        return this.mCropWindowHandler.m3597i();
    }

    public final CropImageView.Guidelines getGuidelines() {
        return this.guidelines;
    }

    /* renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getMInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    /* renamed from: h */
    public final void m3497h(Canvas canvas) {
        float strokeWidth;
        if (this.mBorderCornerPaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f10 = 2;
            float f11 = (strokeWidth2 - strokeWidth) / f10;
            float f12 = strokeWidth2 / f10;
            float f13 = f12 + f11;
            CropImageView.CropShape cropShape = this.cropShape;
            int i9 = cropShape == null ? -1 : C5537d.f3925a[cropShape.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                f12 += this.mBorderCornerOffset;
            } else if (i9 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            rectFM3597i.inset(f12, f12);
            m3495f(canvas, rectFM3597i, f11, f13);
            if (this.cornerShape == CropImageView.CropCornerShape.f3847b) {
                Integer num = this.mCircleCornerFillColor;
                this.mBorderCornerPaint = num != null ? INSTANCE.m3517c(num.intValue()) : null;
                m3495f(canvas, rectFM3597i, f11, f13);
            }
        }
    }

    /* renamed from: i */
    public final void m3498i(Canvas canvas) {
        if (this.isCropLabelEnabled) {
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            float f10 = (rectFM3597i.left + rectFM3597i.right) / 2;
            float f11 = rectFM3597i.top - 50;
            Paint paint = this.textLabelPaint;
            if (paint != null) {
                paint.setTextSize(this.cropLabelTextSize);
                paint.setColor(this.cropLabelTextColor);
            }
            String str = this.cropLabelText;
            Paint paint2 = this.textLabelPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    /* renamed from: j */
    public final void m3499j(Canvas canvas) {
        float strokeWidth;
        if (this.mGuidelinePaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            rectFM3597i.inset(strokeWidth, strokeWidth);
            float f10 = 3;
            float fWidth = rectFM3597i.width() / f10;
            float fHeight = rectFM3597i.height() / f10;
            CropImageView.CropShape cropShape = this.cropShape;
            int i9 = cropShape == null ? -1 : C5537d.f3925a[cropShape.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                float f11 = rectFM3597i.left + fWidth;
                float f12 = rectFM3597i.right - fWidth;
                float f13 = rectFM3597i.top;
                float f14 = rectFM3597i.bottom;
                Paint paint2 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint2);
                canvas.drawLine(f11, f13, f11, f14, paint2);
                float f15 = rectFM3597i.top;
                float f16 = rectFM3597i.bottom;
                Paint paint3 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawLine(f12, f15, f12, f16, paint3);
                float f17 = rectFM3597i.top + fHeight;
                float f18 = rectFM3597i.bottom - fHeight;
                float f19 = rectFM3597i.left;
                float f20 = rectFM3597i.right;
                Paint paint4 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint4);
                canvas.drawLine(f19, f17, f20, f17, paint4);
                float f21 = rectFM3597i.left;
                float f22 = rectFM3597i.right;
                Paint paint5 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint5);
                canvas.drawLine(f21, f18, f22, f18, paint5);
                return;
            }
            if (i9 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f23 = 2;
            float fWidth2 = (rectFM3597i.width() / f23) - strokeWidth;
            float fHeight2 = (rectFM3597i.height() / f23) - strokeWidth;
            float f24 = rectFM3597i.left + fWidth;
            float f25 = rectFM3597i.right - fWidth;
            float fSin = (float) (fHeight2 * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f26 = (rectFM3597i.top + fHeight2) - fSin;
            float f27 = (rectFM3597i.bottom - fHeight2) + fSin;
            Paint paint6 = this.mGuidelinePaint;
            Intrinsics.checkNotNull(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = (rectFM3597i.top + fHeight2) - fSin;
            float f29 = (rectFM3597i.bottom - fHeight2) + fSin;
            Paint paint7 = this.mGuidelinePaint;
            Intrinsics.checkNotNull(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = rectFM3597i.top + fHeight;
            float f31 = rectFM3597i.bottom - fHeight;
            float fCos = (float) (fWidth2 * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f32 = (rectFM3597i.left + fWidth2) - fCos;
            float f33 = (rectFM3597i.right - fWidth2) + fCos;
            Paint paint8 = this.mGuidelinePaint;
            Intrinsics.checkNotNull(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = (rectFM3597i.left + fWidth2) - fCos;
            float f35 = (rectFM3597i.right - fWidth2) + fCos;
            Paint paint9 = this.mGuidelinePaint;
            Intrinsics.checkNotNull(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    /* renamed from: k */
    public final void m3500k(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = f11 + this.mBorderCornerLength;
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawLine(f10 - cornerOffset, f11 - cornerExtension, f10 - cornerOffset, f12, paint);
        float f13 = rect.left;
        float f14 = rect.top;
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawLine(f13 - cornerExtension, f14 - cornerOffset, f13 + this.mBorderCornerLength, f14 - cornerOffset, paint2);
        float f15 = rect.right;
        float f16 = rect.top;
        float f17 = f16 + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f15 + cornerOffset, f16 - cornerExtension, f15 + cornerOffset, f17, paint3);
        float f18 = rect.right;
        float f19 = rect.top;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(f18 + cornerExtension, f19 - cornerOffset, f18 - this.mBorderCornerLength, f19 - cornerOffset, paint4);
        float f20 = rect.left;
        float f21 = rect.bottom;
        float f22 = f21 - this.mBorderCornerLength;
        Paint paint5 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint5);
        canvas.drawLine(f20 - cornerOffset, f21 + cornerExtension, f20 - cornerOffset, f22, paint5);
        float f23 = rect.left;
        float f24 = rect.bottom;
        Paint paint6 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint6);
        canvas.drawLine(f23 - cornerExtension, f24 + cornerOffset, f23 + this.mBorderCornerLength, f24 + cornerOffset, paint6);
        float f25 = rect.right;
        float f26 = rect.bottom;
        float f27 = f26 - this.mBorderCornerLength;
        Paint paint7 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint7);
        canvas.drawLine(f25 + cornerOffset, f26 + cornerExtension, f25 + cornerOffset, f27, paint7);
        float f28 = rect.right;
        float f29 = rect.bottom;
        Paint paint8 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint8);
        canvas.drawLine(f28 + cornerExtension, f29 + cornerOffset, f28 - this.mBorderCornerLength, f29 + cornerOffset, paint8);
    }

    /* renamed from: l */
    public final void m3501l(RectF rect) {
        if (rect.width() < this.mCropWindowHandler.m3594f()) {
            float fM3594f = (this.mCropWindowHandler.m3594f() - rect.width()) / 2;
            rect.left -= fM3594f;
            rect.right += fM3594f;
        }
        if (rect.height() < this.mCropWindowHandler.m3593e()) {
            float fM3593e = (this.mCropWindowHandler.m3593e() - rect.height()) / 2;
            rect.top -= fM3593e;
            rect.bottom += fM3593e;
        }
        if (rect.width() > this.mCropWindowHandler.m3592d()) {
            float fWidth = (rect.width() - this.mCropWindowHandler.m3592d()) / 2;
            rect.left += fWidth;
            rect.right -= fWidth;
        }
        if (rect.height() > this.mCropWindowHandler.m3591c()) {
            float fHeight = (rect.height() - this.mCropWindowHandler.m3591c()) / 2;
            rect.top += fHeight;
            rect.bottom -= fHeight;
        }
        m3491b(rect);
        if (this.mCalcBounds.width() > 0.0f && this.mCalcBounds.height() > 0.0f) {
            float fMax = Math.max(this.mCalcBounds.left, 0.0f);
            float fMax2 = Math.max(this.mCalcBounds.top, 0.0f);
            float fMin = Math.min(this.mCalcBounds.right, getWidth());
            float fMin2 = Math.min(this.mCalcBounds.bottom, getHeight());
            if (rect.left < fMax) {
                rect.left = fMax;
            }
            if (rect.top < fMax2) {
                rect.top = fMax2;
            }
            if (rect.right > fMin) {
                rect.right = fMin;
            }
            if (rect.bottom > fMin2) {
                rect.bottom = fMin2;
            }
        }
        if (!this.isFixAspectRatio || Math.abs(rect.width() - (rect.height() * this.mTargetAspectRatio)) <= 0.1d) {
            return;
        }
        if (rect.width() > rect.height() * this.mTargetAspectRatio) {
            float fAbs = Math.abs((rect.height() * this.mTargetAspectRatio) - rect.width()) / 2;
            rect.left += fAbs;
            rect.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rect.width() / this.mTargetAspectRatio) - rect.height()) / 2;
            rect.top += fAbs2;
            rect.bottom -= fAbs2;
        }
    }

    /* renamed from: m */
    public final void m3502m() {
        RectF cropWindowRect = getCropWindowRect();
        m3501l(cropWindowRect);
        this.mCropWindowHandler.m3611w(cropWindowRect);
    }

    /* renamed from: n */
    public final void m3503n() {
        C5540a c5540a = C5540a.f3947a;
        float fMax = Math.max(c5540a.m3537A(this.mBoundsPoints), 0.0f);
        float fMax2 = Math.max(c5540a.m3539C(this.mBoundsPoints), 0.0f);
        float fMin = Math.min(c5540a.m3538B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(c5540a.m3569v(this.mBoundsPoints), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.initializedCropWindow = true;
        float f10 = this.mInitialCropWindowPaddingRatio;
        float f11 = fMin - fMax;
        float f12 = f10 * f11;
        float f13 = fMin2 - fMax2;
        float f14 = f10 * f13;
        if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
            rectF.left = (this.mInitialCropWindowRect.left / this.mCropWindowHandler.m3602n()) + fMax;
            rectF.top = (this.mInitialCropWindowRect.top / this.mCropWindowHandler.m3601m()) + fMax2;
            rectF.right = rectF.left + (this.mInitialCropWindowRect.width() / this.mCropWindowHandler.m3602n());
            rectF.bottom = rectF.top + (this.mInitialCropWindowRect.height() / this.mCropWindowHandler.m3601m());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.isFixAspectRatio || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f12;
            rectF.top = fMax2 + f14;
            rectF.right = fMin - f12;
            rectF.bottom = fMin2 - f14;
        } else if (f11 / f13 > this.mTargetAspectRatio) {
            rectF.top = fMax2 + f14;
            rectF.bottom = fMin2 - f14;
            float width = getWidth() / 2.0f;
            this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
            float fMax3 = Math.max(this.mCropWindowHandler.m3594f(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f12;
            rectF.right = fMin - f12;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.mCropWindowHandler.m3593e(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        m3501l(rectF);
        this.mCropWindowHandler.m3611w(rectF);
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsFixAspectRatio() {
        return this.isFixAspectRatio;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m3492c(canvas);
        if (this.mCropWindowHandler.m3612x()) {
            CropImageView.Guidelines guidelines = this.guidelines;
            if (guidelines == CropImageView.Guidelines.f3858c) {
                m3499j(canvas);
            } else if (guidelines == CropImageView.Guidelines.f3857b && this.mMoveHandler != null) {
                m3499j(canvas);
            }
        }
        Companion companion = INSTANCE;
        CropImageOptions cropImageOptions = this.mOptions;
        this.mBorderCornerPaint = companion.m3516b(cropImageOptions != null ? cropImageOptions.borderCornerThickness : 0.0f, cropImageOptions != null ? cropImageOptions.borderCornerColor : -1);
        m3498i(canvas);
        m3493d(canvas);
        m3497h(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            m3514y();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled && (scaleGestureDetector = this.mScaleDetector) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            m3506q(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m3507r(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m3508s();
        return true;
    }

    /* renamed from: p */
    public final boolean m3505p() {
        float[] fArr = this.mBoundsPoints;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: q */
    public final void m3506q(float x9, float y9) {
        C5543d c5543d = this.mCropWindowHandler;
        float f10 = this.mTouchRadius;
        CropImageView.CropShape cropShape = this.cropShape;
        Intrinsics.checkNotNull(cropShape);
        CropWindowMoveHandler cropWindowMoveHandlerM3595g = c5543d.m3595g(x9, y9, f10, cropShape, this.mCenterMoveEnabled);
        this.mMoveHandler = cropWindowMoveHandlerM3595g;
        if (cropWindowMoveHandlerM3595g != null) {
            invalidate();
        }
    }

    /* renamed from: r */
    public final void m3507r(float x9, float y9) {
        if (this.mMoveHandler != null) {
            float f10 = this.mSnapRadius;
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            if (m3491b(rectFM3597i)) {
                f10 = 0.0f;
            }
            CropWindowMoveHandler cropWindowMoveHandler = this.mMoveHandler;
            Intrinsics.checkNotNull(cropWindowMoveHandler);
            cropWindowMoveHandler.m3530l(rectFM3597i, x9, y9, this.mCalcBounds, this.mViewWidth, this.mViewHeight, f10, this.isFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.m3611w(rectFM3597i);
            InterfaceC5535b interfaceC5535b = this.mCropWindowChangeListener;
            if (interfaceC5535b != null) {
                interfaceC5535b.mo3459a(true);
            }
            invalidate();
        }
    }

    /* renamed from: s */
    public final void m3508s() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            InterfaceC5535b interfaceC5535b = this.mCropWindowChangeListener;
            if (interfaceC5535b != null) {
                interfaceC5535b.mo3459a(false);
            }
            invalidate();
        }
    }

    public final void setAspectRatioX(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioX != i9) {
            this.mAspectRatioX = i9;
            this.mTargetAspectRatio = i9 / this.mAspectRatioY;
            if (this.initializedCropWindow) {
                m3503n();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioY != i9) {
            this.mAspectRatioY = i9;
            this.mTargetAspectRatio = this.mAspectRatioX / i9;
            if (this.initializedCropWindow) {
                m3503n();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.mCropCornerRadius = cornerRadius;
    }

    public final void setCropCornerShape(CropImageView.CropCornerShape cropCornerShape) {
        Intrinsics.checkNotNullParameter(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String textLabel) {
        if (textLabel != null) {
            this.cropLabelText = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.cropLabelTextColor = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.cropLabelTextSize = textSize;
        invalidate();
    }

    public final void setCropShape(CropImageView.CropShape cropShape) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(InterfaceC5535b listener) {
        this.mCropWindowChangeListener = listener;
    }

    public final void setCropWindowRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.mCropWindowHandler.m3611w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.isCropLabelEnabled = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.isFixAspectRatio != fixAspectRatio) {
            this.isFixAspectRatio = fixAspectRatio;
            if (this.initializedCropWindow) {
                m3503n();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.Guidelines guidelines) {
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        InterfaceC5535b interfaceC5535b;
        Intrinsics.checkNotNullParameter(options, "options");
        boolean zAreEqual = Intrinsics.areEqual(this.mOptions, options);
        CropImageOptions cropImageOptions = this.mOptions;
        boolean z9 = cropImageOptions == null || options.fixAspectRatio != cropImageOptions.fixAspectRatio || cropImageOptions == null || options.aspectRatioX != cropImageOptions.aspectRatioX || cropImageOptions == null || options.aspectRatioY != cropImageOptions.aspectRatioY;
        this.mOptions = options;
        this.mCropWindowHandler.m3610v(options.minCropResultWidth, options.minCropResultHeight);
        this.mCropWindowHandler.m3609u(options.maxCropResultWidth, options.maxCropResultHeight);
        if (zAreEqual) {
            return;
        }
        this.mCropWindowHandler.m3608t(options);
        this.cropLabelTextColor = options.cropperLabelTextColor;
        this.cropLabelTextSize = options.cropperLabelTextSize;
        String str = options.cropperLabelText;
        if (str == null) {
            str = "";
        }
        this.cropLabelText = str;
        this.isCropLabelEnabled = options.showCropLabel;
        this.mCropCornerRadius = options.cropCornerRadius;
        this.cornerShape = options.cornerShape;
        this.cropShape = options.cropShape;
        this.mSnapRadius = options.snapRadius;
        setEnabled(options.canChangeCropWindow);
        this.guidelines = options.guidelines;
        this.isFixAspectRatio = options.fixAspectRatio;
        setAspectRatioX(options.aspectRatioX);
        setAspectRatioY(options.aspectRatioY);
        boolean z10 = options.multiTouchEnabled;
        this.mMultiTouchEnabled = z10;
        if (z10 && this.mScaleDetector == null) {
            this.mScaleDetector = new ScaleGestureDetector(getContext(), new C5536c());
        }
        this.mCenterMoveEnabled = options.centerMoveEnabled;
        this.mTouchRadius = options.touchRadius;
        this.mInitialCropWindowPaddingRatio = options.initialCropWindowPaddingRatio;
        Companion companion = INSTANCE;
        this.mBorderPaint = companion.m3516b(options.borderLineThickness, options.borderLineColor);
        this.mBorderCornerOffset = options.borderCornerOffset;
        this.mBorderCornerLength = options.borderCornerLength;
        this.mCircleCornerFillColor = Integer.valueOf(options.circleCornerFillColorHexValue);
        this.mBorderCornerPaint = companion.m3516b(options.borderCornerThickness, options.borderCornerColor);
        this.mGuidelinePaint = companion.m3516b(options.guidelinesThickness, options.guidelinesColor);
        this.mBackgroundPaint = companion.m3515a(options.backgroundColor);
        this.textLabelPaint = companion.m3518d(options);
        if (z9) {
            m3503n();
        }
        invalidate();
        if (!z9 || (interfaceC5535b = this.mCropWindowChangeListener) == null) {
            return;
        }
        interfaceC5535b.mo3459a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = C5540a.f3947a.m3562o();
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            m3503n();
            invalidate();
            InterfaceC5535b interfaceC5535b = this.mCropWindowChangeListener;
            if (interfaceC5535b != null) {
                interfaceC5535b.mo3459a(false);
            }
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.mSnapRadius = snapRadius;
    }

    /* renamed from: t */
    public final void m3509t() {
        if (this.initializedCropWindow) {
            setCropWindowRect(C5540a.f3947a.m3563p());
            m3503n();
            invalidate();
        }
    }

    /* renamed from: u */
    public final void m3510u(float[] boundsPoints, int viewWidth, int viewHeight) {
        if (boundsPoints == null || !Arrays.equals(this.mBoundsPoints, boundsPoints)) {
            if (boundsPoints == null) {
                Arrays.fill(this.mBoundsPoints, 0.0f);
            } else {
                System.arraycopy(boundsPoints, 0, this.mBoundsPoints, 0, boundsPoints.length);
            }
            this.mViewWidth = viewWidth;
            this.mViewHeight = viewHeight;
            RectF rectFM3597i = this.mCropWindowHandler.m3597i();
            if (rectFM3597i.width() == 0.0f || rectFM3597i.height() == 0.0f) {
                m3503n();
            }
        }
    }

    /* renamed from: v */
    public final boolean m3511v(boolean centerMoveEnabled) {
        if (this.mCenterMoveEnabled == centerMoveEnabled) {
            return false;
        }
        this.mCenterMoveEnabled = centerMoveEnabled;
        return true;
    }

    /* renamed from: w */
    public final void m3512w(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mCropWindowHandler.m3607s(maxWidth, maxHeight, scaleFactorWidth, scaleFactorHeight);
    }

    /* renamed from: x */
    public final boolean m3513x(boolean multiTouchEnabled) {
        if (this.mMultiTouchEnabled == multiTouchEnabled) {
            return false;
        }
        this.mMultiTouchEnabled = multiTouchEnabled;
        if (!multiTouchEnabled || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new C5536c());
        return true;
    }

    /* renamed from: y */
    public final void m3514y() {
        RectF rectFM3597i = this.mCropWindowHandler.m3597i();
        List systemGestureExclusionRects = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
        List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
        List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect3 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
        float f10 = rectFM3597i.left;
        float f11 = this.mTouchRadius;
        int i9 = (int) (f10 - f11);
        rect.left = i9;
        int i10 = (int) (rectFM3597i.right + f11);
        rect.right = i10;
        float f12 = rectFM3597i.top;
        int i11 = (int) (f12 - f11);
        rect.top = i11;
        float f13 = this.maxVerticalGestureExclusion;
        rect.bottom = (int) (i11 + (f13 * 0.3f));
        rect2.left = i9;
        rect2.right = i10;
        float f14 = rectFM3597i.bottom;
        int i12 = (int) (((f12 + f14) / 2.0f) - (0.2f * f13));
        rect2.top = i12;
        rect2.bottom = (int) (i12 + (0.4f * f13));
        rect3.left = rect.left;
        rect3.right = rect.right;
        int i13 = (int) (f14 + f11);
        rect3.bottom = i13;
        rect3.top = (int) (i13 - (f13 * 0.3f));
        setSystemGestureExclusionRects(CollectionsKt.listOf((Object[]) new Rect[]{rect, rect2, rect3}));
    }
}
