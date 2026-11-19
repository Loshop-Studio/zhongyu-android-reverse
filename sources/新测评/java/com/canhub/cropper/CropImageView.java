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
import p139k1.AnimationAnimationListenerC7861g;

@Metadata(m13557d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 ¥\u00022\u00020\u00012\u00020\u0002:\u0012¦\u0002§\u0002¨\u0002©\u0002ª\u0002\u0081\u0001=WX\u0014\u001fuB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b*\u0010&J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010&J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J/\u00107\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108JK\u0010=\u001a\u00020\u00112\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u0002062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010F¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010L¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00112\b\u0010Q\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0011¢\u0006\u0004\bW\u0010\u0015J\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010\u0015J\u0017\u0010[\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020]H\u0000¢\u0006\u0004\b^\u0010_J?\u0010`\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010.\u001a\u0002062\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020bH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000bH\u0014¢\u0006\u0004\bj\u0010kJ7\u0010n\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bn\u0010oJ/\u0010s\u001a\u00020\u00112\u0006\u0010p\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u000bH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bu\u0010&R\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010wR\u0016\u0010{\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010zR\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010}R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010}R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010\u0085\u0001R\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0089\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b^\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u008e\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u008e\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u008e\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0098\u0001R.\u0010\u009a\u0001\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b`\u0010\u0091\u0001\u0012\u0005\b\u009d\u0001\u0010\u0015\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0005\b\u009c\u0001\u0010&R\u0018\u0010\u009e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0091\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0091\u0001R\u001a\u0010£\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u008e\u0001R\u0019\u0010©\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0091\u0001R\u0019\u0010«\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0091\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u008e\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010´\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010º\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u008e\u0001R\u0019\u0010¼\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¥\u0001R\u0019\u0010½\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¥\u0001R\u0019\u0010¿\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¥\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008e\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010\u0091\u0001R#\u0010Ë\u0001\u001a\f\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R#\u0010Î\u0001\u001a\f\u0012\u0005\u0012\u00030Ì\u0001\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ê\u0001R)\u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÏ\u0001\u0010¶\u0001\u001a\u0006\bÐ\u0001\u0010¸\u0001\"\u0005\bÑ\u0001\u0010SR,\u0010Ò\u0001\u001a\u00030\u0097\u00012\b\u0010Ò\u0001\u001a\u00030\u0097\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R0\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00012\n\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R0\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R)\u0010ä\u0001\u001a\u00020\u00162\u0007\u0010ã\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bä\u0001\u0010\u009b\u0001\"\u0005\bå\u0001\u0010&R)\u0010æ\u0001\u001a\u00020\u000b2\u0007\u0010æ\u0001\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bç\u0001\u0010è\u0001\"\u0005\bé\u0001\u0010VR(\u0010ì\u0001\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bê\u0001\u0010è\u0001\"\u0005\bë\u0001\u0010VR)\u0010î\u0001\u001a\u00020\u00162\u0007\u0010í\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bî\u0001\u0010\u009b\u0001\"\u0005\bï\u0001\u0010&R)\u0010ñ\u0001\u001a\u00020\u00162\u0007\u0010ð\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bñ\u0001\u0010\u009b\u0001\"\u0005\bò\u0001\u0010&R0\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00012\n\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R!\u0010ü\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0ù\u00018F¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R)\u0010þ\u0001\u001a\u00020\u00162\u0007\u0010ý\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bþ\u0001\u0010\u009b\u0001\"\u0005\bÿ\u0001\u0010&R)\u0010\u0081\u0002\u001a\u00020\u00162\u0007\u0010\u0080\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0081\u0002\u0010\u009b\u0001\"\u0005\b\u0082\u0002\u0010&R)\u0010\u0084\u0002\u001a\u00020\u00162\u0007\u0010\u0083\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0002\u0010\u009b\u0001\"\u0005\b\u0085\u0002\u0010&R,\u0010\u0086\u0002\u001a\u00030 \u00012\b\u0010\u0086\u0002\u001a\u00030 \u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R)\u0010\u008f\u0002\u001a\u00020\u001b2\u0007\u0010\u008b\u0002\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0005\b\u008e\u0002\u00103R)\u0010\u0090\u0002\u001a\u00020\u000b2\u0007\u0010\u0090\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0091\u0002\u0010è\u0001\"\u0005\b\u0092\u0002\u0010VR(\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0093\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0094\u0002\u0010è\u0001\"\u0005\b\u0095\u0002\u0010VR\u0017\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R0\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u0096\u00022\n\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0096\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0002\u0010\u0098\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010¡\u0002\u001a\u0005\u0018\u00010À\u00018F¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0015\u0010¤\u0002\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002¨\u0006«\u0002"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "imageResource", "Landroid/net/Uri;", "imageUri", "loadSampleSize", "degreesRotated", "", "o", "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V", "c", "()V", "", "inProgress", "animate", "j", "(ZZ)V", "", "width", "height", "center", "b", "(FFZZ)V", "k", "p", "q", "clear", "s", "(Z)V", "multiTouchEnabled", "setMultiTouchEnabled", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "snapRadius", "setSnapRadius", "(F)V", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "h", "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", "d", "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView$e;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$e;)V", "Lcom/canhub/cropper/CropImageView$d;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "Lcom/canhub/cropper/CropImageView$g;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$c;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$c;)V", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "degrees", "n", "(I)V", "f", "g", "Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;", "result", "m", "(Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;)V", "Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;", "l", "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;)V", "r", "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "onLayout", "(ZIIII)V", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", "a", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "Lcom/canhub/cropper/CropOverlayView;", "mCropOverlayView", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mImageMatrix", "mImageInverseMatrix", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "mProgressBar", "", "[F", "mImagePoints", "mScaleImagePoints", "Lk1/g;", "Lk1/g;", "mAnimation", "i", "Landroid/graphics/Bitmap;", "originalBitmap", "I", "mInitialDegreesRotated", "mDegreesRotated", "Z", "mFlipHorizontally", "mFlipVertically", "mLayoutWidth", "mLayoutHeight", "mImageResource", "Lcom/canhub/cropper/CropImageView$ScaleType;", "Lcom/canhub/cropper/CropImageView$ScaleType;", "mScaleType", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "mShowCropOverlay", "mShowCropLabel", "", "u", "Ljava/lang/String;", "mCropTextLabel", "v", "F", "mCropLabelTextSize", "mCropLabelTextColor", "x", "mShowProgressBar", "y", "mAutoZoomEnabled", "z", "mMaxZoom", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/canhub/cropper/CropImageView$g;", "mOnSetImageUriCompleteListener", "B", "Lcom/canhub/cropper/CropImageView$c;", "mOnCropImageCompleteListener", "value", "C", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "D", "loadedSampleSize", ExifInterface.LONGITUDE_EAST, "mZoom", "mZoomOffsetX", "G", "mZoomOffsetY", "Landroid/graphics/RectF;", "H", "Landroid/graphics/RectF;", "mRestoreCropWindowRect", "mRestoreDegreesRotated", "J", "mSizeChanged", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/BitmapLoadingWorkerJob;", "K", "Ljava/lang/ref/WeakReference;", "bitmapLoadingWorkerJob", "Lcom/canhub/cropper/BitmapCroppingWorkerJob;", "L", "bitmapCroppingWorkerJob", "M", "getCustomOutputUri", "setCustomOutputUri", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$ScaleType;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$ScaleType;)V", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "aspectRatio", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "getCropPoints", "()[F", "cropPoints", "N", "CropShape", "CropCornerShape", "ScaleType", "Guidelines", "RequestSizeOptions", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"})
/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.InterfaceC5430b {

    /* renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: from kotlin metadata */
    public InterfaceC5428g mOnSetImageUriCompleteListener;

    /* renamed from: B, reason: from kotlin metadata */
    public InterfaceC5424c mOnCropImageCompleteListener;

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
    public AnimationAnimationListenerC7861g mAnimation;

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
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView$CropCornerShape;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class CropCornerShape {

        /* renamed from: a */
        public static final CropCornerShape f4058a = new CropCornerShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropCornerShape f4059b = new CropCornerShape("OVAL", 1);

        /* renamed from: c */
        public static final /* synthetic */ CropCornerShape[] f4060c;

        /* renamed from: d */
        public static final /* synthetic */ EnumEntries f4061d;

        static {
            CropCornerShape[] cropCornerShapeArrM3850a = m3850a();
            f4060c = cropCornerShapeArrM3850a;
            f4061d = EnumEntriesKt.enumEntries(cropCornerShapeArrM3850a);
        }

        public CropCornerShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropCornerShape[] m3850a() {
            return new CropCornerShape[]{f4058a, f4059b};
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) f4060c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView$CropShape;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class CropShape {

        /* renamed from: a */
        public static final CropShape f4062a = new CropShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropShape f4063b = new CropShape("OVAL", 1);

        /* renamed from: c */
        public static final CropShape f4064c = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);

        /* renamed from: d */
        public static final CropShape f4065d = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);

        /* renamed from: e */
        public static final /* synthetic */ CropShape[] f4066e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f4067f;

        static {
            CropShape[] cropShapeArrM3851a = m3851a();
            f4066e = cropShapeArrM3851a;
            f4067f = EnumEntriesKt.enumEntries(cropShapeArrM3851a);
        }

        public CropShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropShape[] m3851a() {
            return new CropShape[]{f4062a, f4063b, f4064c, f4065d};
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) f4066e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView$Guidelines;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Guidelines {

        /* renamed from: a */
        public static final Guidelines f4068a = new Guidelines("OFF", 0);

        /* renamed from: b */
        public static final Guidelines f4069b = new Guidelines("ON_TOUCH", 1);

        /* renamed from: c */
        public static final Guidelines f4070c = new Guidelines("ON", 2);

        /* renamed from: d */
        public static final /* synthetic */ Guidelines[] f4071d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f4072e;

        static {
            Guidelines[] guidelinesArrM3852a = m3852a();
            f4071d = guidelinesArrM3852a;
            f4072e = EnumEntriesKt.enumEntries(guidelinesArrM3852a);
        }

        public Guidelines(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Guidelines[] m3852a() {
            return new Guidelines[]{f4068a, f4069b, f4070c};
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) f4071d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class RequestSizeOptions {

        /* renamed from: a */
        public static final RequestSizeOptions f4073a = new RequestSizeOptions("NONE", 0);

        /* renamed from: b */
        public static final RequestSizeOptions f4074b = new RequestSizeOptions("SAMPLING", 1);

        /* renamed from: c */
        public static final RequestSizeOptions f4075c = new RequestSizeOptions("RESIZE_INSIDE", 2);

        /* renamed from: d */
        public static final RequestSizeOptions f4076d = new RequestSizeOptions("RESIZE_FIT", 3);

        /* renamed from: e */
        public static final RequestSizeOptions f4077e = new RequestSizeOptions("RESIZE_EXACT", 4);

        /* renamed from: f */
        public static final /* synthetic */ RequestSizeOptions[] f4078f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f4079g;

        static {
            RequestSizeOptions[] requestSizeOptionsArrM3853a = m3853a();
            f4078f = requestSizeOptionsArrM3853a;
            f4079g = EnumEntriesKt.enumEntries(requestSizeOptionsArrM3853a);
        }

        public RequestSizeOptions(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ RequestSizeOptions[] m3853a() {
            return new RequestSizeOptions[]{f4073a, f4074b, f4075c, f4076d, f4077e};
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) f4078f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcom/canhub/cropper/CropImageView$ScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class ScaleType {

        /* renamed from: a */
        public static final ScaleType f4080a = new ScaleType("FIT_CENTER", 0);

        /* renamed from: b */
        public static final ScaleType f4081b = new ScaleType("CENTER", 1);

        /* renamed from: c */
        public static final ScaleType f4082c = new ScaleType("CENTER_CROP", 2);

        /* renamed from: d */
        public static final ScaleType f4083d = new ScaleType("CENTER_INSIDE", 3);

        /* renamed from: e */
        public static final /* synthetic */ ScaleType[] f4084e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f4085f;

        static {
            ScaleType[] scaleTypeArrM3854a = m3854a();
            f4084e = scaleTypeArrM3854a;
            f4085f = EnumEntriesKt.enumEntries(scaleTypeArrM3854a);
        }

        public ScaleType(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ ScaleType[] m3854a() {
            return new ScaleType[]{f4080a, f4081b, f4082c, f4083d};
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f4084e.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m3855a(int i10, int i11, int i12) {
            return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i12 : i11 : Math.min(i12, i11);
        }

        public Companion() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$b */
    public static class C5423b {

        /* renamed from: a */
        public final Bitmap f4086a;

        /* renamed from: b */
        public final Uri f4087b;

        /* renamed from: c */
        public final Bitmap f4088c;

        /* renamed from: d */
        public final Uri f4089d;

        /* renamed from: e */
        public final Exception f4090e;

        /* renamed from: f */
        public final float[] f4091f;

        /* renamed from: g */
        public final Rect f4092g;

        /* renamed from: h */
        public final Rect f4093h;

        /* renamed from: i */
        public final int f4094i;

        /* renamed from: j */
        public final int f4095j;

        public C5423b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
            this.f4086a = bitmap;
            this.f4087b = uri;
            this.f4088c = bitmap2;
            this.f4089d = uri2;
            this.f4090e = exc;
            this.f4091f = cropPoints;
            this.f4092g = rect;
            this.f4093h = rect2;
            this.f4094i = i10;
            this.f4095j = i11;
        }

        /* renamed from: a */
        public final float[] m3856a() {
            return this.f4091f;
        }

        /* renamed from: b */
        public final Rect m3857b() {
            return this.f4092g;
        }

        /* renamed from: c */
        public final Exception m3858c() {
            return this.f4090e;
        }

        /* renamed from: d */
        public final Uri m3859d() {
            return this.f4087b;
        }

        /* renamed from: e */
        public final int m3860e() {
            return this.f4094i;
        }

        /* renamed from: g */
        public final int m3861g() {
            return this.f4095j;
        }

        /* renamed from: h */
        public final Uri m3862h() {
            return this.f4089d;
        }

        /* renamed from: i */
        public final Rect m3863i() {
            return this.f4093h;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$c */
    public interface InterfaceC5424c {
        /* renamed from: a */
        void mo3815a(CropImageView cropImageView, C5423b c5423b);
    }

    /* renamed from: com.canhub.cropper.CropImageView$d */
    public interface InterfaceC5425d {
    }

    /* renamed from: com.canhub.cropper.CropImageView$e */
    public interface InterfaceC5426e {
    }

    /* renamed from: com.canhub.cropper.CropImageView$f */
    public interface InterfaceC5427f {
    }

    /* renamed from: com.canhub.cropper.CropImageView$g */
    public interface InterfaceC5428g {
        /* renamed from: b */
        void mo3816b(CropImageView cropImageView, Uri uri, Exception exc);
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
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: e */
    public static /* synthetic */ void m3831e(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i10, int i11, int i12, RequestSizeOptions requestSizeOptions, Uri uri, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i13 & 2) != 0) {
            i10 = 90;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        if ((i13 & 16) != 0) {
            requestSizeOptions = RequestSizeOptions.f4075c;
        }
        if ((i13 & 32) != 0) {
            uri = null;
        }
        cropImageView.m3836d(compressFormat, i10, i11, i12, requestSizeOptions, uri);
    }

    /* renamed from: i */
    public static /* synthetic */ Bitmap m3832i(CropImageView cropImageView, int i10, int i11, RequestSizeOptions requestSizeOptions, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            requestSizeOptions = RequestSizeOptions.f4075c;
        }
        return cropImageView.m3839h(i10, i11, requestSizeOptions);
    }

    @Override // com.canhub.cropper.CropOverlayView.InterfaceC5430b
    /* renamed from: a */
    public void mo3833a(boolean inProgress) {
        m3840j(inProgress, true);
    }

    /* renamed from: b */
    public final void m3834b(float width, float height, boolean center, boolean animate) {
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
            m3841k();
            int i10 = this.mDegreesRotated;
            if (i10 > 0) {
                C5435a c5435a = C5435a.f4159a;
                this.mImageMatrix.postRotate(i10, c5435a.m3944w(this.mImagePoints), c5435a.m3945x(this.mImagePoints));
                m3841k();
            }
            C5435a c5435a2 = C5435a.f4159a;
            float fMin = Math.min(width / c5435a2.m3914D(this.mImagePoints), height / c5435a2.m3947z(this.mImagePoints));
            ScaleType scaleType = this.mScaleType;
            if (scaleType == ScaleType.f4080a || ((scaleType == ScaleType.f4083d && fMin < 1.0f) || (fMin > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(fMin, fMin, c5435a2.m3944w(this.mImagePoints), c5435a2.m3945x(this.mImagePoints));
                m3841k();
            } else if (scaleType == ScaleType.f4082c) {
                this.mZoom = Math.max(getWidth() / c5435a2.m3914D(this.mImagePoints), getHeight() / c5435a2.m3947z(this.mImagePoints));
            }
            float f11 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f12 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f11, f12, c5435a2.m3944w(this.mImagePoints), c5435a2.m3945x(this.mImagePoints));
            m3841k();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == ScaleType.f4082c && center && !animate) {
                this.mZoomOffsetX = 0.0f;
                this.mZoomOffsetY = 0.0f;
            } else if (center) {
                this.mZoomOffsetX = width > c5435a2.m3914D(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f10) - cropWindowRect.centerX(), -c5435a2.m3911A(this.mImagePoints)), getWidth() - c5435a2.m3912B(this.mImagePoints)) / f11;
                this.mZoomOffsetY = height <= c5435a2.m3947z(this.mImagePoints) ? Math.max(Math.min((height / f10) - cropWindowRect.centerY(), -c5435a2.m3913C(this.mImagePoints)), getHeight() - c5435a2.m3943v(this.mImagePoints)) / f12 : 0.0f;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f11, -cropWindowRect.left), (-cropWindowRect.right) + width) / f11;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f12;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            cropWindowRect.offset(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            m3841k();
            this.mCropOverlayView.invalidate();
            if (animate) {
                AnimationAnimationListenerC7861g animationAnimationListenerC7861g = this.mAnimation;
                Intrinsics.checkNotNull(animationAnimationListenerC7861g);
                animationAnimationListenerC7861g.m13379b(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            m3849s(false);
        }
    }

    /* renamed from: c */
    public final void m3835c() {
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
        m3846p();
    }

    /* renamed from: d */
    public final void m3836d(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, RequestSizeOptions options, Uri customOutputUri) {
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m3848r(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    /* renamed from: f */
    public final void m3837f() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        m3834b(getWidth(), getHeight(), true, false);
    }

    /* renamed from: g */
    public final void m3838g() {
        this.mFlipVertically = !this.mFlipVertically;
        m3834b(getWidth(), getHeight(), true, false);
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
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        C5435a c5435a = C5435a.f4159a;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return c5435a.m3946y(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
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
        return m3832i(this, 0, 0, null, 7, null);
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
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    /* renamed from: h */
    public final Bitmap m3839h(int reqWidth, int reqHeight, RequestSizeOptions options) {
        int i10;
        Bitmap bitmapM3948a;
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.f4073a;
        int i11 = options != requestSizeOptions ? reqWidth : 0;
        int i12 = options != requestSizeOptions ? reqHeight : 0;
        if (this.imageUri == null || (this.loadedSampleSize <= 1 && options != RequestSizeOptions.f4074b)) {
            i10 = i12;
            C5435a c5435a = C5435a.f4159a;
            float[] cropPoints = getCropPoints();
            int i13 = this.mDegreesRotated;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            bitmapM3948a = c5435a.m3928g(bitmap, cropPoints, i13, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).m3948a();
        } else {
            C5435a c5435a2 = C5435a.f4159a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Uri uri = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i14 = this.mDegreesRotated;
            Bitmap bitmap2 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap2);
            int width = bitmap2.getWidth() * this.loadedSampleSize;
            Bitmap bitmap3 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap3);
            int height = bitmap3.getHeight() * this.loadedSampleSize;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView2);
            i10 = i12;
            bitmapM3948a = c5435a2.m3925d(context, uri, cropPoints2, i14, width, height, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i11, i12, this.mFlipHorizontally, this.mFlipVertically).m3948a();
        }
        return C5435a.f4159a.m3917G(bitmapM3948a, i11, i10, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3840j(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3840j(boolean, boolean):void");
    }

    /* renamed from: k */
    public final void m3841k() {
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
    public final void m3842l(BitmapCroppingWorkerJob.C5408a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapCroppingWorkerJob = null;
        m3847q();
        InterfaceC5424c interfaceC5424c = this.mOnCropImageCompleteListener;
        if (interfaceC5424c != null) {
            interfaceC5424c.mo3815a(this, new C5423b(this.originalBitmap, this.imageUri, result.m3773a(), result.m3776d(), result.m3774b(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.m3775c()));
        }
    }

    /* renamed from: m */
    public final void m3843m(BitmapLoadingWorkerJob.C5410a result) {
        CropImageView cropImageView;
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapLoadingWorkerJob = null;
        m3847q();
        if (result.m3788c() == null) {
            this.mInitialDegreesRotated = result.m3787b();
            this.mFlipHorizontally = result.m3789d();
            this.mFlipVertically = result.m3790e();
            cropImageView = this;
            cropImageView.m3845o(result.m3786a(), 0, result.m3792g(), result.m3791f(), result.m3787b());
        } else {
            cropImageView = this;
        }
        InterfaceC5428g interfaceC5428g = cropImageView.mOnSetImageUriCompleteListener;
        if (interfaceC5428g != null) {
            interfaceC5428g.mo3816b(this, result.m3792g(), result.m3788c());
        }
    }

    /* renamed from: n */
    public final void m3844n(int degrees) {
        if (this.originalBitmap != null) {
            int i10 = degrees < 0 ? (degrees % 360) + 360 : degrees % 360;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            boolean z9 = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i10 && i10 < 135) || (216 <= i10 && i10 < 305));
            C5435a c5435a = C5435a.f4159a;
            c5435a.m3942u().set(this.mCropOverlayView.getCropWindowRect());
            RectF rectFM3942u = c5435a.m3942u();
            float fHeight = (z9 ? rectFM3942u.height() : rectFM3942u.width()) / 2.0f;
            RectF rectFM3942u2 = c5435a.m3942u();
            float fWidth = (z9 ? rectFM3942u2.width() : rectFM3942u2.height()) / 2.0f;
            if (z9) {
                boolean z10 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z10;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            c5435a.m3940s()[0] = c5435a.m3942u().centerX();
            c5435a.m3940s()[1] = c5435a.m3942u().centerY();
            c5435a.m3940s()[2] = 0.0f;
            c5435a.m3940s()[3] = 0.0f;
            c5435a.m3940s()[4] = 1.0f;
            c5435a.m3940s()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(c5435a.m3940s());
            this.mDegreesRotated = (this.mDegreesRotated + i10) % 360;
            m3834b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(c5435a.m3941t(), c5435a.m3940s());
            float fSqrt = this.mZoom / ((float) Math.sqrt(Math.pow(c5435a.m3941t()[4] - c5435a.m3941t()[2], 2.0d) + Math.pow(c5435a.m3941t()[5] - c5435a.m3941t()[3], 2.0d)));
            this.mZoom = fSqrt;
            this.mZoom = Math.max(fSqrt, 1.0f);
            m3834b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(c5435a.m3941t(), c5435a.m3940s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(c5435a.m3941t()[4] - c5435a.m3941t()[2], 2.0d) + Math.pow(c5435a.m3941t()[5] - c5435a.m3941t()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            c5435a.m3942u().set(c5435a.m3941t()[0] - f10, c5435a.m3941t()[1] - f11, c5435a.m3941t()[0] + f10, c5435a.m3941t()[1] + f11);
            this.mCropOverlayView.m3883t();
            this.mCropOverlayView.setCropWindowRect(c5435a.m3942u());
            m3834b(getWidth(), getHeight(), true, false);
            m3840j(false, false);
            this.mCropOverlayView.m3876m();
        }
    }

    /* renamed from: o */
    public final void m3845o(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !Intrinsics.areEqual(bitmap2, bitmap)) {
            m3835c();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            m3834b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.m3883t();
                m3846p();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        super.onLayout(changed, l10, t10, r10, b10);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            m3849s(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.mLayoutWidth;
        layoutParams.height = this.mLayoutHeight;
        setLayoutParams(layoutParams);
        if (this.originalBitmap == null) {
            m3849s(true);
            return;
        }
        float f10 = r10 - l10;
        float f11 = b10 - t10;
        m3834b(f10, f11, true, false);
        RectF rectF = this.mRestoreCropWindowRect;
        if (rectF == null) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
                m3840j(false, false);
                return;
            }
            return;
        }
        int i10 = this.mRestoreDegreesRotated;
        if (i10 != this.mInitialDegreesRotated) {
            this.mDegreesRotated = i10;
            m3834b(f10, f11, true, false);
            this.mRestoreDegreesRotated = 0;
        }
        this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        m3840j(false, false);
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m3876m();
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
        int iM3855a = companion.m3855a(mode, size, width);
        int iM3855a2 = companion.m3855a(mode2, size2, height);
        this.mLayoutWidth = iM3855a;
        this.mLayoutHeight = iM3855a2;
        setMeasuredDimension(iM3855a, iM3855a2);
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
        Uri uriM3921K;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            C5435a c5435a = C5435a.f4159a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uriM3921K = c5435a.m3921K(context, this.originalBitmap, this.customOutputUri);
        } else {
            uriM3921K = this.imageUri;
        }
        if (uriM3921K != null && this.originalBitmap != null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            C5435a.f4159a.m3919I(new Pair(string, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.bitmapLoadingWorkerJob;
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob = weakReference != null ? (BitmapLoadingWorkerJob) weakReference.get() : null;
        if (bitmapLoadingWorkerJob != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerJob.m3783g());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriM3921K);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        C5435a c5435a2 = C5435a.f4159a;
        c5435a2.m3942u().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(c5435a2.m3942u());
        bundle.putParcelable("CROP_WINDOW_RECT", c5435a2.m3942u());
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
    public void onSizeChanged(int w9, int h10, int oldw, int oldh) {
        super.onSizeChanged(w9, h10, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /* renamed from: p */
    public final void m3846p() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    /* renamed from: q */
    public final void m3847q() {
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
    public final void m3848r(int r22, int r23, com.canhub.cropper.CropImageView.RequestSizeOptions r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3848r(int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    /* renamed from: s */
    public final void m3849s(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            C5435a c5435a = C5435a.f4159a;
            float fM3914D = (this.loadedSampleSize * 100.0f) / c5435a.m3914D(this.mScaleImagePoints);
            float fM3947z = (this.loadedSampleSize * 100.0f) / c5435a.m3947z(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.m3886w(getWidth(), getHeight(), fM3914D, fM3947z);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView2);
        cropOverlayView2.m3884u(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    public final void setAutoZoomEnabled(boolean z9) {
        if (this.mAutoZoomEnabled != z9) {
            this.mAutoZoomEnabled = z9;
            m3840j(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.m3885v(centerMoveEnabled)) {
            m3840j(false, false);
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

    public final void setCropLabelTextColor(int i10) {
        this.mCropLabelTextColor = i10;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
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
            m3834b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z9) {
        if (this.mFlipVertically != z9) {
            this.mFlipVertically = z9;
            m3834b(getWidth(), getHeight(), true, false);
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
        m3845o(bitmap, 0, null, 1, 0);
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

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m3845o(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob;
        if (uri != null) {
            WeakReference weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null && (bitmapLoadingWorkerJob = (BitmapLoadingWorkerJob) weakReference.get()) != null) {
                bitmapLoadingWorkerJob.m3782f();
            }
            m3835c();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new BitmapLoadingWorkerJob(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            BitmapLoadingWorkerJob bitmapLoadingWorkerJob2 = (BitmapLoadingWorkerJob) weakReference2.get();
            if (bitmapLoadingWorkerJob2 != null) {
                bitmapLoadingWorkerJob2.m3785i();
            }
            m3847q();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.mMaxZoom == i10 || i10 <= 0) {
            return;
        }
        this.mMaxZoom = i10;
        m3840j(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.m3887x(multiTouchEnabled)) {
            m3840j(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(InterfaceC5424c listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setOnCropWindowChangedListener(InterfaceC5427f listener) {
    }

    public final void setOnSetCropOverlayMovedListener(InterfaceC5425d listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(InterfaceC5426e listener) {
    }

    public final void setOnSetImageUriCompleteListener(InterfaceC5428g listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.mDegreesRotated;
        if (i11 != i10) {
            m3844n(i10 - i11);
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
                cropOverlayView.m3883t();
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
            m3846p();
        }
    }

    public final void setShowProgressBar(boolean z9) {
        if (this.mShowProgressBar != z9) {
            this.mShowProgressBar = z9;
            m3847q();
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
