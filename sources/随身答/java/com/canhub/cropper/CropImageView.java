package com.canhub.cropper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.BitmapLoadingWorkerJob;
import com.canhub.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p113g1.AnimationAnimationListenerC7994g;

@Metadata(m13412d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 ¥\u00022\u00020\u00012\u00020\u0002:\u0012¦\u0002§\u0002¨\u0002©\u0002ª\u0002\u0081\u0001=WX\u0014\u001fuB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b*\u0010&J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010&J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J/\u00107\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108JK\u0010=\u001a\u00020\u00112\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u0002062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010F¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010L¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00112\b\u0010Q\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0011¢\u0006\u0004\bW\u0010\u0015J\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010\u0015J\u0017\u0010[\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020]H\u0000¢\u0006\u0004\b^\u0010_J?\u0010`\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010.\u001a\u0002062\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020bH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000bH\u0014¢\u0006\u0004\bj\u0010kJ7\u0010n\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bn\u0010oJ/\u0010s\u001a\u00020\u00112\u0006\u0010p\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u000bH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bu\u0010&R\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010wR\u0016\u0010{\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010zR\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010}R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010}R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010\u0085\u0001R\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0089\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b^\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u008e\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u008e\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u008e\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0098\u0001R.\u0010\u009a\u0001\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b`\u0010\u0091\u0001\u0012\u0005\b\u009d\u0001\u0010\u0015\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0005\b\u009c\u0001\u0010&R\u0018\u0010\u009e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0091\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0091\u0001R\u001a\u0010£\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u008e\u0001R\u0019\u0010©\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0091\u0001R\u0019\u0010«\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0091\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u008e\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010´\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010º\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u008e\u0001R\u0019\u0010¼\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¥\u0001R\u0019\u0010½\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¥\u0001R\u0019\u0010¿\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¥\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008e\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010\u0091\u0001R#\u0010Ë\u0001\u001a\f\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R#\u0010Î\u0001\u001a\f\u0012\u0005\u0012\u00030Ì\u0001\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ê\u0001R)\u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÏ\u0001\u0010¶\u0001\u001a\u0006\bÐ\u0001\u0010¸\u0001\"\u0005\bÑ\u0001\u0010SR,\u0010Ò\u0001\u001a\u00030\u0097\u00012\b\u0010Ò\u0001\u001a\u00030\u0097\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R0\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00012\n\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R0\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R)\u0010ä\u0001\u001a\u00020\u00162\u0007\u0010ã\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bä\u0001\u0010\u009b\u0001\"\u0005\bå\u0001\u0010&R)\u0010æ\u0001\u001a\u00020\u000b2\u0007\u0010æ\u0001\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bç\u0001\u0010è\u0001\"\u0005\bé\u0001\u0010VR(\u0010ì\u0001\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bê\u0001\u0010è\u0001\"\u0005\bë\u0001\u0010VR)\u0010î\u0001\u001a\u00020\u00162\u0007\u0010í\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bî\u0001\u0010\u009b\u0001\"\u0005\bï\u0001\u0010&R)\u0010ñ\u0001\u001a\u00020\u00162\u0007\u0010ð\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bñ\u0001\u0010\u009b\u0001\"\u0005\bò\u0001\u0010&R0\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00012\n\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R!\u0010ü\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0ù\u00018F¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R)\u0010þ\u0001\u001a\u00020\u00162\u0007\u0010ý\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bþ\u0001\u0010\u009b\u0001\"\u0005\bÿ\u0001\u0010&R)\u0010\u0081\u0002\u001a\u00020\u00162\u0007\u0010\u0080\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0081\u0002\u0010\u009b\u0001\"\u0005\b\u0082\u0002\u0010&R)\u0010\u0084\u0002\u001a\u00020\u00162\u0007\u0010\u0083\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0002\u0010\u009b\u0001\"\u0005\b\u0085\u0002\u0010&R,\u0010\u0086\u0002\u001a\u00030 \u00012\b\u0010\u0086\u0002\u001a\u00030 \u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R)\u0010\u008f\u0002\u001a\u00020\u001b2\u0007\u0010\u008b\u0002\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0005\b\u008e\u0002\u00103R)\u0010\u0090\u0002\u001a\u00020\u000b2\u0007\u0010\u0090\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0091\u0002\u0010è\u0001\"\u0005\b\u0092\u0002\u0010VR(\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0093\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0094\u0002\u0010è\u0001\"\u0005\b\u0095\u0002\u0010VR\u0017\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R0\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u0096\u00022\n\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0096\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0002\u0010\u0098\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010¡\u0002\u001a\u0005\u0018\u00010À\u00018F¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0015\u0010¤\u0002\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002¨\u0006«\u0002"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "imageResource", "Landroid/net/Uri;", "imageUri", "loadSampleSize", "degreesRotated", "", "o", "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V", "c", "()V", "", "inProgress", "animate", "j", "(ZZ)V", "", "width", "height", "center", "b", "(FFZZ)V", "k", "p", "q", "clear", "s", "(Z)V", "multiTouchEnabled", "setMultiTouchEnabled", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "snapRadius", "setSnapRadius", "(F)V", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "h", "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", "d", "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView$e;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$e;)V", "Lcom/canhub/cropper/CropImageView$d;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "Lcom/canhub/cropper/CropImageView$g;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$c;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$c;)V", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "degrees", "n", "(I)V", "f", "g", "Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;", "result", "m", "(Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;)V", "Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;", "l", "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;)V", "r", "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "onLayout", "(ZIIII)V", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", "a", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "Lcom/canhub/cropper/CropOverlayView;", "mCropOverlayView", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mImageMatrix", "mImageInverseMatrix", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "mProgressBar", "", "[F", "mImagePoints", "mScaleImagePoints", "Lg1/g;", "Lg1/g;", "mAnimation", "i", "Landroid/graphics/Bitmap;", "originalBitmap", "I", "mInitialDegreesRotated", "mDegreesRotated", "Z", "mFlipHorizontally", "mFlipVertically", "mLayoutWidth", "mLayoutHeight", "mImageResource", "Lcom/canhub/cropper/CropImageView$ScaleType;", "Lcom/canhub/cropper/CropImageView$ScaleType;", "mScaleType", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "mShowCropOverlay", "mShowCropLabel", "", "u", "Ljava/lang/String;", "mCropTextLabel", "v", "F", "mCropLabelTextSize", "mCropLabelTextColor", "x", "mShowProgressBar", "y", "mAutoZoomEnabled", "z", "mMaxZoom", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/canhub/cropper/CropImageView$g;", "mOnSetImageUriCompleteListener", "B", "Lcom/canhub/cropper/CropImageView$c;", "mOnCropImageCompleteListener", "value", "C", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "D", "loadedSampleSize", ExifInterface.LONGITUDE_EAST, "mZoom", "mZoomOffsetX", "G", "mZoomOffsetY", "Landroid/graphics/RectF;", "H", "Landroid/graphics/RectF;", "mRestoreCropWindowRect", "mRestoreDegreesRotated", "J", "mSizeChanged", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/BitmapLoadingWorkerJob;", "K", "Ljava/lang/ref/WeakReference;", "bitmapLoadingWorkerJob", "Lcom/canhub/cropper/BitmapCroppingWorkerJob;", "L", "bitmapCroppingWorkerJob", "M", "getCustomOutputUri", "setCustomOutputUri", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$ScaleType;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$ScaleType;)V", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "aspectRatio", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "getCropPoints", "()[F", "cropPoints", "N", "CropShape", "CropCornerShape", "ScaleType", "Guidelines", "RequestSizeOptions", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"})
/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.InterfaceC5535b {

    /* renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: from kotlin metadata */
    public InterfaceC5533g mOnSetImageUriCompleteListener;

    /* renamed from: B, reason: from kotlin metadata */
    public InterfaceC5529c mOnCropImageCompleteListener;

    /* renamed from: C, reason: from kotlin metadata */
    public Uri imageUri;

    /* renamed from: D, reason: from kotlin metadata */
    public int loadedSampleSize;

    /* renamed from: E, reason: from kotlin metadata */
    public float mZoom;

    /* renamed from: F, reason: from kotlin metadata */
    public float mZoomOffsetX;

    /* renamed from: G, reason: from kotlin metadata */
    public float mZoomOffsetY;

    /* renamed from: H, reason: from kotlin metadata */
    public RectF mRestoreCropWindowRect;

    /* renamed from: I, reason: from kotlin metadata */
    public int mRestoreDegreesRotated;

    /* renamed from: J, reason: from kotlin metadata */
    public boolean mSizeChanged;

    /* renamed from: K, reason: from kotlin metadata */
    public WeakReference bitmapLoadingWorkerJob;

    /* renamed from: L, reason: from kotlin metadata */
    public WeakReference bitmapCroppingWorkerJob;

    /* renamed from: M, reason: from kotlin metadata */
    public Uri customOutputUri;

    /* renamed from: a, reason: from kotlin metadata */
    public final ImageView imageView;

    /* renamed from: b, reason: from kotlin metadata */
    public final CropOverlayView mCropOverlayView;

    /* renamed from: c, reason: from kotlin metadata */
    public final Matrix mImageMatrix;

    /* renamed from: d, reason: from kotlin metadata */
    public final Matrix mImageInverseMatrix;

    /* renamed from: e, reason: from kotlin metadata */
    public final ProgressBar mProgressBar;

    /* renamed from: f, reason: from kotlin metadata */
    public final float[] mImagePoints;

    /* renamed from: g, reason: from kotlin metadata */
    public final float[] mScaleImagePoints;

    /* renamed from: h, reason: from kotlin metadata */
    public AnimationAnimationListenerC7994g mAnimation;

    /* renamed from: i, reason: from kotlin metadata */
    public Bitmap originalBitmap;

    /* renamed from: j, reason: from kotlin metadata */
    public int mInitialDegreesRotated;

    /* renamed from: k, reason: from kotlin metadata */
    public int mDegreesRotated;

    /* renamed from: l, reason: from kotlin metadata */
    public boolean mFlipHorizontally;

    /* renamed from: m, reason: from kotlin metadata */
    public boolean mFlipVertically;

    /* renamed from: n, reason: from kotlin metadata */
    public int mLayoutWidth;

    /* renamed from: o, reason: from kotlin metadata */
    public int mLayoutHeight;

    /* renamed from: p, reason: from kotlin metadata */
    public int mImageResource;

    /* renamed from: q, reason: from kotlin metadata */
    public ScaleType mScaleType;

    /* renamed from: r, reason: from kotlin metadata */
    public boolean isSaveBitmapToInstanceState;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean mShowCropOverlay;

    /* renamed from: t, reason: from kotlin metadata */
    public boolean mShowCropLabel;

    /* renamed from: u, reason: from kotlin metadata */
    public String mCropTextLabel;

    /* renamed from: v, reason: from kotlin metadata */
    public float mCropLabelTextSize;

    /* renamed from: w, reason: from kotlin metadata */
    public int mCropLabelTextColor;

    /* renamed from: x, reason: from kotlin metadata */
    public boolean mShowProgressBar;

    /* renamed from: y, reason: from kotlin metadata */
    public boolean mAutoZoomEnabled;

    /* renamed from: z, reason: from kotlin metadata */
    public int mMaxZoom;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView$CropCornerShape;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CropCornerShape {

        /* renamed from: a */
        public static final CropCornerShape f3846a = new CropCornerShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropCornerShape f3847b = new CropCornerShape("OVAL", 1);

        /* renamed from: c */
        public static final /* synthetic */ CropCornerShape[] f3848c;

        /* renamed from: d */
        public static final /* synthetic */ EnumEntries f3849d;

        static {
            CropCornerShape[] cropCornerShapeArrM3476a = m3476a();
            f3848c = cropCornerShapeArrM3476a;
            f3849d = EnumEntriesKt.enumEntries(cropCornerShapeArrM3476a);
        }

        public CropCornerShape(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropCornerShape[] m3476a() {
            return new CropCornerShape[]{f3846a, f3847b};
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) f3848c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView$CropShape;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CropShape {

        /* renamed from: a */
        public static final CropShape f3850a = new CropShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropShape f3851b = new CropShape("OVAL", 1);

        /* renamed from: c */
        public static final CropShape f3852c = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);

        /* renamed from: d */
        public static final CropShape f3853d = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);

        /* renamed from: e */
        public static final /* synthetic */ CropShape[] f3854e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f3855f;

        static {
            CropShape[] cropShapeArrM3477a = m3477a();
            f3854e = cropShapeArrM3477a;
            f3855f = EnumEntriesKt.enumEntries(cropShapeArrM3477a);
        }

        public CropShape(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropShape[] m3477a() {
            return new CropShape[]{f3850a, f3851b, f3852c, f3853d};
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) f3854e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView$Guidelines;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Guidelines {

        /* renamed from: a */
        public static final Guidelines f3856a = new Guidelines("OFF", 0);

        /* renamed from: b */
        public static final Guidelines f3857b = new Guidelines("ON_TOUCH", 1);

        /* renamed from: c */
        public static final Guidelines f3858c = new Guidelines("ON", 2);

        /* renamed from: d */
        public static final /* synthetic */ Guidelines[] f3859d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f3860e;

        static {
            Guidelines[] guidelinesArrM3478a = m3478a();
            f3859d = guidelinesArrM3478a;
            f3860e = EnumEntriesKt.enumEntries(guidelinesArrM3478a);
        }

        public Guidelines(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Guidelines[] m3478a() {
            return new Guidelines[]{f3856a, f3857b, f3858c};
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) f3859d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class RequestSizeOptions {

        /* renamed from: a */
        public static final RequestSizeOptions f3861a = new RequestSizeOptions("NONE", 0);

        /* renamed from: b */
        public static final RequestSizeOptions f3862b = new RequestSizeOptions("SAMPLING", 1);

        /* renamed from: c */
        public static final RequestSizeOptions f3863c = new RequestSizeOptions("RESIZE_INSIDE", 2);

        /* renamed from: d */
        public static final RequestSizeOptions f3864d = new RequestSizeOptions("RESIZE_FIT", 3);

        /* renamed from: e */
        public static final RequestSizeOptions f3865e = new RequestSizeOptions("RESIZE_EXACT", 4);

        /* renamed from: f */
        public static final /* synthetic */ RequestSizeOptions[] f3866f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f3867g;

        static {
            RequestSizeOptions[] requestSizeOptionsArrM3479a = m3479a();
            f3866f = requestSizeOptionsArrM3479a;
            f3867g = EnumEntriesKt.enumEntries(requestSizeOptionsArrM3479a);
        }

        public RequestSizeOptions(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ RequestSizeOptions[] m3479a() {
            return new RequestSizeOptions[]{f3861a, f3862b, f3863c, f3864d, f3865e};
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) f3866f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13413d2 = {"Lcom/canhub/cropper/CropImageView$ScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ScaleType {

        /* renamed from: a */
        public static final ScaleType f3868a = new ScaleType("FIT_CENTER", 0);

        /* renamed from: b */
        public static final ScaleType f3869b = new ScaleType("CENTER", 1);

        /* renamed from: c */
        public static final ScaleType f3870c = new ScaleType("CENTER_CROP", 2);

        /* renamed from: d */
        public static final ScaleType f3871d = new ScaleType("CENTER_INSIDE", 3);

        /* renamed from: e */
        public static final /* synthetic */ ScaleType[] f3872e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f3873f;

        static {
            ScaleType[] scaleTypeArrM3480a = m3480a();
            f3872e = scaleTypeArrM3480a;
            f3873f = EnumEntriesKt.enumEntries(scaleTypeArrM3480a);
        }

        public ScaleType(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ ScaleType[] m3480a() {
            return new ScaleType[]{f3868a, f3869b, f3870c, f3871d};
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f3872e.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m3481a(int i9, int i10, int i11) {
            return i9 != Integer.MIN_VALUE ? i9 != 1073741824 ? i11 : i10 : Math.min(i11, i10);
        }

        public Companion() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$b */
    public static class C5528b {

        /* renamed from: a */
        public final Bitmap f3874a;

        /* renamed from: b */
        public final Uri f3875b;

        /* renamed from: c */
        public final Bitmap f3876c;

        /* renamed from: d */
        public final Uri f3877d;

        /* renamed from: e */
        public final Exception f3878e;

        /* renamed from: f */
        public final float[] f3879f;

        /* renamed from: g */
        public final Rect f3880g;

        /* renamed from: h */
        public final Rect f3881h;

        /* renamed from: i */
        public final int f3882i;

        /* renamed from: j */
        public final int f3883j;

        public C5528b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i9, int i10) {
            Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
            this.f3874a = bitmap;
            this.f3875b = uri;
            this.f3876c = bitmap2;
            this.f3877d = uri2;
            this.f3878e = exc;
            this.f3879f = cropPoints;
            this.f3880g = rect;
            this.f3881h = rect2;
            this.f3882i = i9;
            this.f3883j = i10;
        }

        /* renamed from: a */
        public final float[] m3482a() {
            return this.f3879f;
        }

        /* renamed from: b */
        public final Rect m3483b() {
            return this.f3880g;
        }

        /* renamed from: c */
        public final Exception m3484c() {
            return this.f3878e;
        }

        /* renamed from: d */
        public final Uri m3485d() {
            return this.f3875b;
        }

        /* renamed from: e */
        public final int m3486e() {
            return this.f3882i;
        }

        /* renamed from: f */
        public final int m3487f() {
            return this.f3883j;
        }

        /* renamed from: h */
        public final Uri m3488h() {
            return this.f3877d;
        }

        /* renamed from: i */
        public final Rect m3489i() {
            return this.f3881h;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$c */
    public interface InterfaceC5529c {
        /* renamed from: a */
        void mo3441a(CropImageView cropImageView, C5528b c5528b);
    }

    /* renamed from: com.canhub.cropper.CropImageView$d */
    public interface InterfaceC5530d {
    }

    /* renamed from: com.canhub.cropper.CropImageView$e */
    public interface InterfaceC5531e {
    }

    /* renamed from: com.canhub.cropper.CropImageView$f */
    public interface InterfaceC5532f {
    }

    /* renamed from: com.canhub.cropper.CropImageView$g */
    public interface InterfaceC5533g {
        /* renamed from: b */
        void mo3442b(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CropImageView(android.content.Context r84, android.util.AttributeSet r85) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: e */
    public static /* synthetic */ void m3457e(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i9, int i10, int i11, RequestSizeOptions requestSizeOptions, Uri uri, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i12 & 2) != 0) {
            i9 = 90;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            requestSizeOptions = RequestSizeOptions.f3863c;
        }
        if ((i12 & 32) != 0) {
            uri = null;
        }
        cropImageView.m3462d(compressFormat, i9, i10, i11, requestSizeOptions, uri);
    }

    /* renamed from: i */
    public static /* synthetic */ Bitmap m3458i(CropImageView cropImageView, int i9, int i10, RequestSizeOptions requestSizeOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            requestSizeOptions = RequestSizeOptions.f3863c;
        }
        return cropImageView.m3465h(i9, i10, requestSizeOptions);
    }

    @Override // com.canhub.cropper.CropOverlayView.InterfaceC5535b
    /* renamed from: a */
    public void mo3459a(boolean inProgress) {
        m3466j(inProgress, true);
    }

    /* renamed from: b */
    public final void m3460b(float width, float height, boolean center, boolean animate) {
        if (this.originalBitmap != null) {
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            float f10 = 2;
            this.mImageMatrix.postTranslate((width - r0.getWidth()) / f10, (height - r0.getHeight()) / f10);
            m3467k();
            int i9 = this.mDegreesRotated;
            if (i9 > 0) {
                C5540a c5540a = C5540a.f3947a;
                this.mImageMatrix.postRotate(i9, c5540a.m3570w(this.mImagePoints), c5540a.m3571x(this.mImagePoints));
                m3467k();
            }
            C5540a c5540a2 = C5540a.f3947a;
            float fMin = Math.min(width / c5540a2.m3540D(this.mImagePoints), height / c5540a2.m3573z(this.mImagePoints));
            ScaleType scaleType = this.mScaleType;
            if (scaleType == ScaleType.f3868a || ((scaleType == ScaleType.f3871d && fMin < 1.0f) || (fMin > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(fMin, fMin, c5540a2.m3570w(this.mImagePoints), c5540a2.m3571x(this.mImagePoints));
                m3467k();
            } else if (scaleType == ScaleType.f3870c) {
                this.mZoom = Math.max(getWidth() / c5540a2.m3540D(this.mImagePoints), getHeight() / c5540a2.m3573z(this.mImagePoints));
            }
            float f11 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f12 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f11, f12, c5540a2.m3570w(this.mImagePoints), c5540a2.m3571x(this.mImagePoints));
            m3467k();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == ScaleType.f3870c && center && !animate) {
                this.mZoomOffsetX = 0.0f;
                this.mZoomOffsetY = 0.0f;
            } else if (center) {
                this.mZoomOffsetX = width > c5540a2.m3540D(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f10) - cropWindowRect.centerX(), -c5540a2.m3537A(this.mImagePoints)), getWidth() - c5540a2.m3538B(this.mImagePoints)) / f11;
                this.mZoomOffsetY = height <= c5540a2.m3573z(this.mImagePoints) ? Math.max(Math.min((height / f10) - cropWindowRect.centerY(), -c5540a2.m3539C(this.mImagePoints)), getHeight() - c5540a2.m3569v(this.mImagePoints)) / f12 : 0.0f;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f11, -cropWindowRect.left), (-cropWindowRect.right) + width) / f11;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f12;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            cropWindowRect.offset(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            m3467k();
            this.mCropOverlayView.invalidate();
            if (animate) {
                AnimationAnimationListenerC7994g animationAnimationListenerC7994g = this.mAnimation;
                Intrinsics.checkNotNull(animationAnimationListenerC7994g);
                animationAnimationListenerC7994g.m12549b(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            m3475s(false);
        }
    }

    /* renamed from: c */
    public final void m3461c() {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.imageUri != null)) {
            Intrinsics.checkNotNull(bitmap);
            bitmap.recycle();
        }
        this.originalBitmap = null;
        this.mImageResource = 0;
        this.imageUri = null;
        this.loadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mImageMatrix.reset();
        this.mRestoreCropWindowRect = null;
        this.mRestoreDegreesRotated = 0;
        this.imageView.setImageBitmap(null);
        m3472p();
    }

    /* renamed from: d */
    public final void m3462d(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, RequestSizeOptions options, Uri customOutputUri) {
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m3474r(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    /* renamed from: f */
    public final void m3463f() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        m3460b(getWidth(), getHeight(), true, false);
    }

    /* renamed from: g */
    public final void m3464g() {
        this.mFlipVertically = !this.mFlipVertically;
        m3460b(getWidth(), getHeight(), true, false);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getMAspectRatioX()), Integer.valueOf(this.mCropOverlayView.getMAspectRatioY()));
    }

    public final CropCornerShape getCornerShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    /* renamed from: getCropLabelText, reason: from getter */
    public final String getMCropTextLabel() {
        return this.mCropTextLabel;
    }

    /* renamed from: getCropLabelTextColor, reason: from getter */
    public final int getMCropLabelTextColor() {
        return this.mCropLabelTextColor;
    }

    /* renamed from: getCropLabelTextSize, reason: from getter */
    public final float getMCropLabelTextSize() {
        return this.mCropLabelTextSize;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i9 = 0; i9 < 8; i9++) {
            fArr2[i9] = fArr[i9] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i9 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i9;
        int height = bitmap.getHeight() * i9;
        C5540a c5540a = C5540a.f3947a;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return c5540a.m3572y(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
    }

    public final CropShape getCropShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    @JvmOverloads
    public final Bitmap getCroppedImage() {
        return m3458i(this, 0, 0, null, 7, null);
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final Guidelines getGuidelines() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* renamed from: getImageResource, reason: from getter */
    public final int getMImageResource() {
        return this.mImageResource;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final int getMMaxZoom() {
        return this.mMaxZoom;
    }

    /* renamed from: getRotatedDegrees, reason: from getter */
    public final int getMDegreesRotated() {
        return this.mDegreesRotated;
    }

    /* renamed from: getScaleType, reason: from getter */
    public final ScaleType getMScaleType() {
        return this.mScaleType;
    }

    public final Rect getWholeImageRect() {
        int i9 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i9, bitmap.getHeight() * i9);
    }

    /* renamed from: h */
    public final Bitmap m3465h(int reqWidth, int reqHeight, RequestSizeOptions options) {
        int i9;
        Bitmap bitmapM3574a;
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.f3861a;
        int i10 = options != requestSizeOptions ? reqWidth : 0;
        int i11 = options != requestSizeOptions ? reqHeight : 0;
        if (this.imageUri == null || (this.loadedSampleSize <= 1 && options != RequestSizeOptions.f3862b)) {
            i9 = i11;
            C5540a c5540a = C5540a.f3947a;
            float[] cropPoints = getCropPoints();
            int i12 = this.mDegreesRotated;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            bitmapM3574a = c5540a.m3554g(bitmap, cropPoints, i12, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).m3574a();
        } else {
            C5540a c5540a2 = C5540a.f3947a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Uri uri = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i13 = this.mDegreesRotated;
            Bitmap bitmap2 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap2);
            int width = bitmap2.getWidth() * this.loadedSampleSize;
            Bitmap bitmap3 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap3);
            int height = bitmap3.getHeight() * this.loadedSampleSize;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView2);
            i9 = i11;
            bitmapM3574a = c5540a2.m3551d(context, uri, cropPoints2, i13, width, height, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i10, i11, this.mFlipHorizontally, this.mFlipVertically).m3574a();
        }
        return C5540a.f3947a.m3543G(bitmapM3574a, i10, i9, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3466j(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3466j(boolean, boolean):void");
    }

    /* renamed from: k */
    public final void m3467k() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.mImagePoints;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.mImagePoints;
        fArr4[6] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr4[7] = r9.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
        float[] fArr5 = this.mScaleImagePoints;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.mImageMatrix.mapPoints(fArr5);
    }

    /* renamed from: l */
    public final void m3468l(BitmapCroppingWorkerJob.C5513a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapCroppingWorkerJob = null;
        m3473q();
        InterfaceC5529c interfaceC5529c = this.mOnCropImageCompleteListener;
        if (interfaceC5529c != null) {
            interfaceC5529c.mo3441a(this, new C5528b(this.originalBitmap, this.imageUri, result.m3399a(), result.m3402d(), result.m3400b(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.m3401c()));
        }
    }

    /* renamed from: m */
    public final void m3469m(BitmapLoadingWorkerJob.C5515a result) {
        CropImageView cropImageView;
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapLoadingWorkerJob = null;
        m3473q();
        if (result.m3414c() == null) {
            this.mInitialDegreesRotated = result.m3413b();
            this.mFlipHorizontally = result.m3415d();
            this.mFlipVertically = result.m3416e();
            cropImageView = this;
            cropImageView.m3471o(result.m3412a(), 0, result.m3418g(), result.m3417f(), result.m3413b());
        } else {
            cropImageView = this;
        }
        InterfaceC5533g interfaceC5533g = cropImageView.mOnSetImageUriCompleteListener;
        if (interfaceC5533g != null) {
            interfaceC5533g.mo3442b(this, result.m3418g(), result.m3414c());
        }
    }

    /* renamed from: n */
    public final void m3470n(int degrees) {
        if (this.originalBitmap != null) {
            int i9 = degrees < 0 ? (degrees % 360) + 360 : degrees % 360;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            boolean z9 = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i9 && i9 < 135) || (216 <= i9 && i9 < 305));
            C5540a c5540a = C5540a.f3947a;
            c5540a.m3568u().set(this.mCropOverlayView.getCropWindowRect());
            RectF rectFM3568u = c5540a.m3568u();
            float fHeight = (z9 ? rectFM3568u.height() : rectFM3568u.width()) / 2.0f;
            RectF rectFM3568u2 = c5540a.m3568u();
            float fWidth = (z9 ? rectFM3568u2.width() : rectFM3568u2.height()) / 2.0f;
            if (z9) {
                boolean z10 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z10;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            c5540a.m3566s()[0] = c5540a.m3568u().centerX();
            c5540a.m3566s()[1] = c5540a.m3568u().centerY();
            c5540a.m3566s()[2] = 0.0f;
            c5540a.m3566s()[3] = 0.0f;
            c5540a.m3566s()[4] = 1.0f;
            c5540a.m3566s()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(c5540a.m3566s());
            this.mDegreesRotated = (this.mDegreesRotated + i9) % 360;
            m3460b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(c5540a.m3567t(), c5540a.m3566s());
            float fSqrt = this.mZoom / ((float) Math.sqrt(Math.pow(c5540a.m3567t()[4] - c5540a.m3567t()[2], 2.0d) + Math.pow(c5540a.m3567t()[5] - c5540a.m3567t()[3], 2.0d)));
            this.mZoom = fSqrt;
            this.mZoom = Math.max(fSqrt, 1.0f);
            m3460b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(c5540a.m3567t(), c5540a.m3566s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(c5540a.m3567t()[4] - c5540a.m3567t()[2], 2.0d) + Math.pow(c5540a.m3567t()[5] - c5540a.m3567t()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            c5540a.m3568u().set(c5540a.m3567t()[0] - f10, c5540a.m3567t()[1] - f11, c5540a.m3567t()[0] + f10, c5540a.m3567t()[1] + f11);
            this.mCropOverlayView.m3509t();
            this.mCropOverlayView.setCropWindowRect(c5540a.m3568u());
            m3460b(getWidth(), getHeight(), true, false);
            m3466j(false, false);
            this.mCropOverlayView.m3502m();
        }
    }

    /* renamed from: o */
    public final void m3471o(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !Intrinsics.areEqual(bitmap2, bitmap)) {
            m3461c();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            m3460b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.m3509t();
                m3472p();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l9, int t9, int r9, int b10) {
        super.onLayout(changed, l9, t9, r9, b10);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            m3475s(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.mLayoutWidth;
        layoutParams.height = this.mLayoutHeight;
        setLayoutParams(layoutParams);
        if (this.originalBitmap == null) {
            m3475s(true);
            return;
        }
        float f10 = r9 - l9;
        float f11 = b10 - t9;
        m3460b(f10, f11, true, false);
        RectF rectF = this.mRestoreCropWindowRect;
        if (rectF == null) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
                m3466j(false, false);
                return;
            }
            return;
        }
        int i9 = this.mRestoreDegreesRotated;
        if (i9 != this.mInitialDegreesRotated) {
            this.mDegreesRotated = i9;
            m3460b(f10, f11, true, false);
            this.mRestoreDegreesRotated = 0;
        }
        this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        m3466j(false, false);
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m3502m();
        }
        this.mRestoreCropWindowRect = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int height;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? size / bitmap.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? size2 / bitmap.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (bitmap.getHeight() * width2);
            width = size;
        } else {
            width = (int) (bitmap.getWidth() * height2);
            height = size2;
        }
        Companion companion = INSTANCE;
        int iM3481a = companion.m3481a(mode, size, width);
        int iM3481a2 = companion.m3481a(mode2, size2, height);
        this.mLayoutWidth = iM3481a;
        this.mLayoutHeight = iM3481a2;
        setMeasuredDimension(iM3481a, iM3481a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRestoreInstanceState(android.os.Parcelable r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uriM3547K;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            C5540a c5540a = C5540a.f3947a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uriM3547K = c5540a.m3547K(context, this.originalBitmap, this.customOutputUri);
        } else {
            uriM3547K = this.imageUri;
        }
        if (uriM3547K != null && this.originalBitmap != null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            C5540a.f3947a.m3545I(new Pair(string, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.bitmapLoadingWorkerJob;
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob = weakReference != null ? (BitmapLoadingWorkerJob) weakReference.get() : null;
        if (bitmapLoadingWorkerJob != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerJob.m3409g());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriM3547K);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        C5540a c5540a2 = C5540a.f3947a;
        c5540a2.m3568u().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(c5540a2.m3568u());
        bundle.putParcelable("CROP_WINDOW_RECT", c5540a2.m3568u());
        CropShape cropShape = this.mCropOverlayView.getCropShape();
        Intrinsics.checkNotNull(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.mFlipHorizontally);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.mFlipVertically);
        bundle.putBoolean("SHOW_CROP_LABEL", this.mShowCropLabel);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int w9, int h9, int oldw, int oldh) {
        super.onSizeChanged(w9, h9, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /* renamed from: p */
    public final void m3472p() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    /* renamed from: q */
    public final void m3473q() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.originalBitmap == null && this.bitmapLoadingWorkerJob != null) || this.bitmapCroppingWorkerJob != null) ? 0 : 4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: r */
    public final void m3474r(int r22, int r23, com.canhub.cropper.CropImageView.RequestSizeOptions r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3474r(int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    /* renamed from: s */
    public final void m3475s(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            C5540a c5540a = C5540a.f3947a;
            float fM3540D = (this.loadedSampleSize * 100.0f) / c5540a.m3540D(this.mScaleImagePoints);
            float fM3573z = (this.loadedSampleSize * 100.0f) / c5540a.m3573z(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.m3512w(getWidth(), getHeight(), fM3540D, fM3573z);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView2);
        cropOverlayView2.m3510u(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    public final void setAutoZoomEnabled(boolean z9) {
        if (this.mAutoZoomEnabled != z9) {
            this.mAutoZoomEnabled = z9;
            m3466j(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.m3511v(centerMoveEnabled)) {
            m3466j(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(CropCornerShape cropCornerShape) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(cropCornerShape);
        cropOverlayView.setCropCornerShape(cropCornerShape);
    }

    public final void setCropLabelText(String cropLabelText) {
        Intrinsics.checkNotNullParameter(cropLabelText, "cropLabelText");
        this.mCropTextLabel = cropLabelText;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i9) {
        this.mCropLabelTextColor = i9;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i9);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.mCropLabelTextSize = getMCropLabelTextSize();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(CropShape cropShape) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(cropShape);
        cropOverlayView.setCropShape(cropShape);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z9) {
        if (this.mFlipHorizontally != z9) {
            this.mFlipHorizontally = z9;
            m3460b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z9) {
        if (this.mFlipVertically != z9) {
            this.mFlipVertically = z9;
            m3460b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(Guidelines guidelines) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(guidelines);
        cropOverlayView.setGuidelines(guidelines);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        m3471o(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        setScaleType(options.scaleType);
        this.customOutputUri = options.customOutputUri;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.multiTouchEnabled);
        setCenterMoveEnabled(options.centerMoveEnabled);
        setShowCropOverlay(options.showCropOverlay);
        setShowProgressBar(options.showProgressBar);
        setAutoZoomEnabled(options.autoZoomEnabled);
        setMaxZoom(options.maxZoom);
        setFlippedHorizontally(options.flipHorizontally);
        setFlippedVertically(options.flipVertically);
        this.mAutoZoomEnabled = options.autoZoomEnabled;
        this.mShowCropOverlay = options.showCropOverlay;
        this.mShowProgressBar = options.showProgressBar;
        this.mProgressBar.setIndeterminateTintList(ColorStateList.valueOf(options.progressBarColor));
    }

    public final void setImageResource(int i9) {
        if (i9 != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m3471o(BitmapFactory.decodeResource(getResources(), i9), i9, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob;
        if (uri != null) {
            WeakReference weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null && (bitmapLoadingWorkerJob = (BitmapLoadingWorkerJob) weakReference.get()) != null) {
                bitmapLoadingWorkerJob.m3408f();
            }
            m3461c();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new BitmapLoadingWorkerJob(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            BitmapLoadingWorkerJob bitmapLoadingWorkerJob2 = (BitmapLoadingWorkerJob) weakReference2.get();
            if (bitmapLoadingWorkerJob2 != null) {
                bitmapLoadingWorkerJob2.m3411i();
            }
            m3473q();
        }
    }

    public final void setMaxZoom(int i9) {
        if (this.mMaxZoom == i9 || i9 <= 0) {
            return;
        }
        this.mMaxZoom = i9;
        m3466j(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.m3513x(multiTouchEnabled)) {
            m3466j(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(InterfaceC5529c listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setOnCropWindowChangedListener(InterfaceC5532f listener) {
    }

    public final void setOnSetCropOverlayMovedListener(InterfaceC5530d listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(InterfaceC5531e listener) {
    }

    public final void setOnSetImageUriCompleteListener(InterfaceC5533g listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setRotatedDegrees(int i9) {
        int i10 = this.mDegreesRotated;
        if (i10 != i9) {
            m3470n(i9 - i10);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z9) {
        this.isSaveBitmapToInstanceState = z9;
    }

    public final void setScaleType(ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = 0.0f;
            this.mZoomOffsetX = 0.0f;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.m3509t();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z9) {
        if (this.mShowCropLabel != z9) {
            this.mShowCropLabel = z9;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z9);
            }
        }
    }

    public final void setShowCropOverlay(boolean z9) {
        if (this.mShowCropOverlay != z9) {
            this.mShowCropOverlay = z9;
            m3472p();
        }
    }

    public final void setShowProgressBar(boolean z9) {
        if (this.mShowProgressBar != z9) {
            this.mShowProgressBar = z9;
            m3473q();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }
}
