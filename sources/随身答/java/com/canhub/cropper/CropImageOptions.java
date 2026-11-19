package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.CropImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;

@Parcelize
@Metadata(m13412d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0005\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u001f\u001a\u00020\t\u0012\b\b\u0003\u0010 \u001a\u00020\u0014\u0012\b\b\u0003\u0010!\u001a\u00020\t\u0012\b\b\u0003\u0010\"\u001a\u00020\t\u0012\b\b\u0003\u0010#\u001a\u00020\t\u0012\b\b\u0003\u0010$\u001a\u00020\u0014\u0012\b\b\u0003\u0010%\u001a\u00020\u0014\u0012\b\b\u0003\u0010&\u001a\u00020\t\u0012\b\b\u0003\u0010'\u001a\u00020\u0014\u0012\b\b\u0003\u0010(\u001a\u00020\u0014\u0012\b\b\u0003\u0010)\u001a\u00020\u0014\u0012\b\b\u0003\u0010*\u001a\u00020\u0014\u0012\b\b\u0003\u0010+\u001a\u00020\u0014\u0012\b\b\u0003\u0010,\u001a\u00020\u0014\u0012\b\b\u0003\u0010-\u001a\u00020\u0014\u0012\b\b\u0003\u0010.\u001a\u00020\u0014\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0003\u00101\u001a\u00020\u0014\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u00107\u001a\u00020\u0014\u0012\b\b\u0003\u00108\u001a\u00020\u0014\u0012\b\b\u0003\u00109\u001a\u00020\u0014\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u0014\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u0014\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010/\u0012\b\b\u0003\u0010G\u001a\u00020\u0014\u0012\b\b\u0002\u0010H\u001a\u00020\u0002\u0012\b\b\u0002\u0010I\u001a\u00020\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L\u0012\b\b\u0003\u0010N\u001a\u00020\t\u0012\b\b\u0003\u0010O\u001a\u00020\u0014\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010J\u0012\b\b\u0003\u0010Q\u001a\u00020\u0014\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bV\u0010WJ\u001d\u0010\\\u001a\u00020[2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020\u0014¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020\u0014¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020JHÖ\u0001¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bb\u0010_J\u001a\u0010e\u001a\u00020\u00022\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\be\u0010fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bv\u0010hR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bw\u0010hR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bx\u0010hR\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b{\u0010hR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b|\u0010hR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b}\u0010hR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b~\u0010hR\u0016\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010zR\u0017\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u0017\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010hR\u0017\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010zR\u0017\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010zR\u0017\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010oR\u0017\u0010 \u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010zR\u0017\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010oR\u0017\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010oR\u0017\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010oR\u0017\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR\u0017\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010zR\u0017\u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010oR\u0017\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010zR\u0016\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bo\u0010zR\u0017\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010zR\u0017\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010zR\u0016\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bz\u0010zR\u0017\u0010,\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010zR\u0017\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010zR\u0017\u0010.\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010zR\u0018\u00100\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u00101\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010zR\u001a\u00102\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u00106\u001a\u0002058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u00107\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010zR\u0017\u00108\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010zR\u0017\u00109\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010zR\u0018\u0010;\u001a\u00020:8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010hR\u001a\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010zR\u0017\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010hR\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bh\u0010hR\u0017\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010hR\u0017\u0010C\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010zR\u0017\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010hR\u0017\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010hR\u001a\u0010F\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u0093\u0001R\u0017\u0010G\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010zR\u0017\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010hR\u0017\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010hR\u001a\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R \u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010N\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010oR\u0017\u0010O\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010zR\u001a\u0010P\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b³\u0001\u0010®\u0001R\u0017\u0010Q\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010zR\u001a\u0010R\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0096\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u0096\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u0096\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0096\u0001¨\u0006¹\u0001"}, m13413d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "", "imageSourceIncludeGallery", "imageSourceIncludeCamera", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "", "cropCornerRadius", "snapRadius", "touchRadius", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "Lcom/canhub/cropper/CropImageView$ScaleType;", "scaleType", "showCropOverlay", "showCropLabel", "showProgressBar", "", "progressBarColor", "autoZoomEnabled", "multiTouchEnabled", "centerMoveEnabled", "canChangeCropWindow", "maxZoom", "initialCropWindowPaddingRatio", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "borderLineThickness", "borderLineColor", "borderCornerThickness", "borderCornerOffset", "borderCornerLength", "borderCornerColor", "circleCornerFillColorHexValue", "guidelinesThickness", "guidelinesColor", "backgroundColor", "minCropWindowWidth", "minCropWindowHeight", "minCropResultWidth", "minCropResultHeight", "maxCropResultWidth", "maxCropResultHeight", "", "activityTitle", "activityMenuIconColor", "activityMenuTextColor", "Landroid/net/Uri;", "customOutputUri", "Landroid/graphics/Bitmap$CompressFormat;", "outputCompressFormat", "outputCompressQuality", "outputRequestWidth", "outputRequestHeight", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "outputRequestSizeOptions", "noOutputImage", "Landroid/graphics/Rect;", "initialCropWindowRectangle", "initialRotation", "allowRotation", "allowFlipping", "allowCounterRotation", "rotationDegrees", "flipHorizontally", "flipVertically", "cropMenuCropButtonTitle", "cropMenuCropButtonIcon", "skipEditing", "showIntentChooser", "", "intentChooserTitle", "", "intentChooserPriorityList", "cropperLabelTextSize", "cropperLabelTextColor", "cropperLabelText", "activityBackgroundColor", "toolbarColor", "toolbarTitleColor", "toolbarBackButtonColor", "toolbarTintColor", "<init>", "(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "c", "Lcom/canhub/cropper/CropImageView$CropShape;", "d", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "e", "F", "f", "g", "h", "Lcom/canhub/cropper/CropImageView$Guidelines;", "i", "Lcom/canhub/cropper/CropImageView$ScaleType;", "j", "k", "l", "m", "I", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "G", "H", "J", "K", "L", "M", "Ljava/lang/CharSequence;", "N", "O", "Ljava/lang/Integer;", "P", "Landroid/net/Uri;", "Q", "Landroid/graphics/Bitmap$CompressFormat;", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "Landroid/graphics/Rect;", "X", "Y", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "Ljava/lang/String;", "l0", "Ljava/util/List;", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C5526a();

    /* renamed from: A, reason: from kotlin metadata and from toString */
    public float borderCornerLength;

    /* renamed from: B, reason: from kotlin metadata and from toString */
    public int borderCornerColor;

    /* renamed from: C, reason: from kotlin metadata and from toString */
    public int circleCornerFillColorHexValue;

    /* renamed from: D, reason: from kotlin metadata and from toString */
    public float guidelinesThickness;

    /* renamed from: E, reason: from kotlin metadata and from toString */
    public int guidelinesColor;

    /* renamed from: F, reason: from kotlin metadata and from toString */
    public int backgroundColor;

    /* renamed from: G, reason: from kotlin metadata and from toString */
    public int minCropWindowWidth;

    /* renamed from: H, reason: from kotlin metadata and from toString */
    public int minCropWindowHeight;

    /* renamed from: I, reason: from kotlin metadata and from toString */
    public int minCropResultWidth;

    /* renamed from: J, reason: from kotlin metadata and from toString */
    public int minCropResultHeight;

    /* renamed from: K, reason: from kotlin metadata and from toString */
    public int maxCropResultWidth;

    /* renamed from: L, reason: from kotlin metadata and from toString */
    public int maxCropResultHeight;

    /* renamed from: M, reason: from kotlin metadata and from toString */
    public CharSequence activityTitle;

    /* renamed from: N, reason: from kotlin metadata and from toString */
    public int activityMenuIconColor;

    /* renamed from: O, reason: from kotlin metadata and from toString */
    public Integer activityMenuTextColor;

    /* renamed from: P, reason: from kotlin metadata and from toString */
    public Uri customOutputUri;

    /* renamed from: Q, reason: from kotlin metadata and from toString */
    public Bitmap.CompressFormat outputCompressFormat;

    /* renamed from: R, reason: from kotlin metadata and from toString */
    public int outputCompressQuality;

    /* renamed from: S, reason: from kotlin metadata and from toString */
    public int outputRequestWidth;

    /* renamed from: T, reason: from kotlin metadata and from toString */
    public int outputRequestHeight;

    /* renamed from: U, reason: from kotlin metadata and from toString */
    public CropImageView.RequestSizeOptions outputRequestSizeOptions;

    /* renamed from: V, reason: from kotlin metadata and from toString */
    public boolean noOutputImage;

    /* renamed from: W, reason: from kotlin metadata and from toString */
    public Rect initialCropWindowRectangle;

    /* renamed from: X, reason: from kotlin metadata and from toString */
    public int initialRotation;

    /* renamed from: Y, reason: from kotlin metadata and from toString */
    public boolean allowRotation;

    /* renamed from: Z, reason: from kotlin metadata and from toString */
    public boolean allowFlipping;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public boolean imageSourceIncludeGallery;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public boolean imageSourceIncludeCamera;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public CropImageView.CropShape cropShape;

    /* renamed from: c0, reason: from kotlin metadata and from toString */
    public boolean allowCounterRotation;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public CropImageView.CropCornerShape cornerShape;

    /* renamed from: d0, reason: from kotlin metadata and from toString */
    public int rotationDegrees;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public float cropCornerRadius;

    /* renamed from: e0, reason: from kotlin metadata and from toString */
    public boolean flipHorizontally;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public float snapRadius;

    /* renamed from: f0, reason: from kotlin metadata and from toString */
    public boolean flipVertically;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    public float touchRadius;

    /* renamed from: g0, reason: from kotlin metadata and from toString */
    public CharSequence cropMenuCropButtonTitle;

    /* renamed from: h, reason: from kotlin metadata and from toString */
    public CropImageView.Guidelines guidelines;

    /* renamed from: h0, reason: from kotlin metadata and from toString */
    public int cropMenuCropButtonIcon;

    /* renamed from: i, reason: from kotlin metadata and from toString */
    public CropImageView.ScaleType scaleType;

    /* renamed from: i0, reason: from kotlin metadata and from toString */
    public boolean skipEditing;

    /* renamed from: j, reason: from kotlin metadata and from toString */
    public boolean showCropOverlay;

    /* renamed from: j0, reason: from kotlin metadata and from toString */
    public boolean showIntentChooser;

    /* renamed from: k, reason: from kotlin metadata and from toString */
    public boolean showCropLabel;

    /* renamed from: k0, reason: from kotlin metadata and from toString */
    public String intentChooserTitle;

    /* renamed from: l, reason: from kotlin metadata and from toString */
    public boolean showProgressBar;

    /* renamed from: l0, reason: from kotlin metadata and from toString */
    public List intentChooserPriorityList;

    /* renamed from: m, reason: from kotlin metadata and from toString */
    public int progressBarColor;

    /* renamed from: m0, reason: from kotlin metadata and from toString */
    public float cropperLabelTextSize;

    /* renamed from: n, reason: from kotlin metadata and from toString */
    public boolean autoZoomEnabled;

    /* renamed from: n0, reason: from kotlin metadata and from toString */
    public int cropperLabelTextColor;

    /* renamed from: o, reason: from kotlin metadata and from toString */
    public boolean multiTouchEnabled;

    /* renamed from: o0, reason: from kotlin metadata and from toString */
    public String cropperLabelText;

    /* renamed from: p, reason: from kotlin metadata and from toString */
    public boolean centerMoveEnabled;

    /* renamed from: p0, reason: from kotlin metadata and from toString */
    public int activityBackgroundColor;

    /* renamed from: q, reason: from kotlin metadata and from toString */
    public boolean canChangeCropWindow;

    /* renamed from: q0, reason: from kotlin metadata and from toString */
    public Integer toolbarColor;

    /* renamed from: r, reason: from kotlin metadata and from toString */
    public int maxZoom;

    /* renamed from: r0, reason: from kotlin metadata and from toString */
    public Integer toolbarTitleColor;

    /* renamed from: s, reason: from kotlin metadata and from toString */
    public float initialCropWindowPaddingRatio;

    /* renamed from: s0, reason: from kotlin metadata and from toString */
    public Integer toolbarBackButtonColor;

    /* renamed from: t, reason: from kotlin metadata and from toString */
    public boolean fixAspectRatio;

    /* renamed from: t0, reason: from kotlin metadata and from toString */
    public Integer toolbarTintColor;

    /* renamed from: u, reason: from kotlin metadata and from toString */
    public int aspectRatioX;

    /* renamed from: v, reason: from kotlin metadata and from toString */
    public int aspectRatioY;

    /* renamed from: w, reason: from kotlin metadata and from toString */
    public float borderLineThickness;

    /* renamed from: x, reason: from kotlin metadata and from toString */
    public int borderLineColor;

    /* renamed from: y, reason: from kotlin metadata and from toString */
    public float borderCornerThickness;

    /* renamed from: z, reason: from kotlin metadata and from toString */
    public float borderCornerOffset;

    /* renamed from: com.canhub.cropper.CropImageOptions$a */
    public static final class C5526a implements Parcelable.Creator {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.canhub.cropper.CropImageOptions createFromParcel(android.os.Parcel r74) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageOptions.C5526a.createFromParcel(android.os.Parcel):com.canhub.cropper.CropImageOptions");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CropImageOptions[] newArray(int i9) {
            return new CropImageOptions[i9];
        }
    }

    public CropImageOptions(boolean z9, boolean z10, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z11, boolean z12, boolean z13, int i9, boolean z14, boolean z15, boolean z16, boolean z17, int i10, float f13, boolean z18, int i11, int i12, float f14, int i13, float f15, float f16, float f17, int i14, int i15, float f18, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, CharSequence activityTitle, int i24, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i25, int i26, int i27, CropImageView.RequestSizeOptions outputRequestSizeOptions, boolean z19, Rect rect, int i28, boolean z20, boolean z21, boolean z22, int i29, boolean z23, boolean z24, CharSequence charSequence, int i30, boolean z25, boolean z26, String str, List list, float f19, int i31, String str2, int i32, Integer num2, Integer num3, Integer num4, Integer num5) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        Intrinsics.checkNotNullParameter(cornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(activityTitle, "activityTitle");
        Intrinsics.checkNotNullParameter(outputCompressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.imageSourceIncludeGallery = z9;
        this.imageSourceIncludeCamera = z10;
        this.cropShape = cropShape;
        this.cornerShape = cornerShape;
        this.cropCornerRadius = f10;
        this.snapRadius = f11;
        this.touchRadius = f12;
        this.guidelines = guidelines;
        this.scaleType = scaleType;
        this.showCropOverlay = z11;
        this.showCropLabel = z12;
        this.showProgressBar = z13;
        this.progressBarColor = i9;
        this.autoZoomEnabled = z14;
        this.multiTouchEnabled = z15;
        this.centerMoveEnabled = z16;
        this.canChangeCropWindow = z17;
        this.maxZoom = i10;
        this.initialCropWindowPaddingRatio = f13;
        this.fixAspectRatio = z18;
        this.aspectRatioX = i11;
        this.aspectRatioY = i12;
        this.borderLineThickness = f14;
        this.borderLineColor = i13;
        this.borderCornerThickness = f15;
        this.borderCornerOffset = f16;
        this.borderCornerLength = f17;
        this.borderCornerColor = i14;
        this.circleCornerFillColorHexValue = i15;
        this.guidelinesThickness = f18;
        this.guidelinesColor = i16;
        this.backgroundColor = i17;
        this.minCropWindowWidth = i18;
        this.minCropWindowHeight = i19;
        this.minCropResultWidth = i20;
        this.minCropResultHeight = i21;
        this.maxCropResultWidth = i22;
        this.maxCropResultHeight = i23;
        this.activityTitle = activityTitle;
        this.activityMenuIconColor = i24;
        this.activityMenuTextColor = num;
        this.customOutputUri = uri;
        this.outputCompressFormat = outputCompressFormat;
        this.outputCompressQuality = i25;
        this.outputRequestWidth = i26;
        this.outputRequestHeight = i27;
        this.outputRequestSizeOptions = outputRequestSizeOptions;
        this.noOutputImage = z19;
        this.initialCropWindowRectangle = rect;
        this.initialRotation = i28;
        this.allowRotation = z20;
        this.allowFlipping = z21;
        this.allowCounterRotation = z22;
        this.rotationDegrees = i29;
        this.flipHorizontally = z23;
        this.flipVertically = z24;
        this.cropMenuCropButtonTitle = charSequence;
        this.cropMenuCropButtonIcon = i30;
        this.skipEditing = z25;
        this.showIntentChooser = z26;
        this.intentChooserTitle = str;
        this.intentChooserPriorityList = list;
        this.cropperLabelTextSize = f19;
        this.cropperLabelTextColor = i31;
        this.cropperLabelText = str2;
        this.activityBackgroundColor = i32;
        this.toolbarColor = num2;
        this.toolbarTitleColor = num3;
        this.toolbarBackButtonColor = num4;
        this.toolbarTintColor = num5;
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f13 < 0.0f || f13 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f14 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f15 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f18 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i19 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i20 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i21 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i22 < i20) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i23 < i21) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i26 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i27 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i29 < 0 || i29 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) other;
        return this.imageSourceIncludeGallery == cropImageOptions.imageSourceIncludeGallery && this.imageSourceIncludeCamera == cropImageOptions.imageSourceIncludeCamera && this.cropShape == cropImageOptions.cropShape && this.cornerShape == cropImageOptions.cornerShape && Float.compare(this.cropCornerRadius, cropImageOptions.cropCornerRadius) == 0 && Float.compare(this.snapRadius, cropImageOptions.snapRadius) == 0 && Float.compare(this.touchRadius, cropImageOptions.touchRadius) == 0 && this.guidelines == cropImageOptions.guidelines && this.scaleType == cropImageOptions.scaleType && this.showCropOverlay == cropImageOptions.showCropOverlay && this.showCropLabel == cropImageOptions.showCropLabel && this.showProgressBar == cropImageOptions.showProgressBar && this.progressBarColor == cropImageOptions.progressBarColor && this.autoZoomEnabled == cropImageOptions.autoZoomEnabled && this.multiTouchEnabled == cropImageOptions.multiTouchEnabled && this.centerMoveEnabled == cropImageOptions.centerMoveEnabled && this.canChangeCropWindow == cropImageOptions.canChangeCropWindow && this.maxZoom == cropImageOptions.maxZoom && Float.compare(this.initialCropWindowPaddingRatio, cropImageOptions.initialCropWindowPaddingRatio) == 0 && this.fixAspectRatio == cropImageOptions.fixAspectRatio && this.aspectRatioX == cropImageOptions.aspectRatioX && this.aspectRatioY == cropImageOptions.aspectRatioY && Float.compare(this.borderLineThickness, cropImageOptions.borderLineThickness) == 0 && this.borderLineColor == cropImageOptions.borderLineColor && Float.compare(this.borderCornerThickness, cropImageOptions.borderCornerThickness) == 0 && Float.compare(this.borderCornerOffset, cropImageOptions.borderCornerOffset) == 0 && Float.compare(this.borderCornerLength, cropImageOptions.borderCornerLength) == 0 && this.borderCornerColor == cropImageOptions.borderCornerColor && this.circleCornerFillColorHexValue == cropImageOptions.circleCornerFillColorHexValue && Float.compare(this.guidelinesThickness, cropImageOptions.guidelinesThickness) == 0 && this.guidelinesColor == cropImageOptions.guidelinesColor && this.backgroundColor == cropImageOptions.backgroundColor && this.minCropWindowWidth == cropImageOptions.minCropWindowWidth && this.minCropWindowHeight == cropImageOptions.minCropWindowHeight && this.minCropResultWidth == cropImageOptions.minCropResultWidth && this.minCropResultHeight == cropImageOptions.minCropResultHeight && this.maxCropResultWidth == cropImageOptions.maxCropResultWidth && this.maxCropResultHeight == cropImageOptions.maxCropResultHeight && Intrinsics.areEqual(this.activityTitle, cropImageOptions.activityTitle) && this.activityMenuIconColor == cropImageOptions.activityMenuIconColor && Intrinsics.areEqual(this.activityMenuTextColor, cropImageOptions.activityMenuTextColor) && Intrinsics.areEqual(this.customOutputUri, cropImageOptions.customOutputUri) && this.outputCompressFormat == cropImageOptions.outputCompressFormat && this.outputCompressQuality == cropImageOptions.outputCompressQuality && this.outputRequestWidth == cropImageOptions.outputRequestWidth && this.outputRequestHeight == cropImageOptions.outputRequestHeight && this.outputRequestSizeOptions == cropImageOptions.outputRequestSizeOptions && this.noOutputImage == cropImageOptions.noOutputImage && Intrinsics.areEqual(this.initialCropWindowRectangle, cropImageOptions.initialCropWindowRectangle) && this.initialRotation == cropImageOptions.initialRotation && this.allowRotation == cropImageOptions.allowRotation && this.allowFlipping == cropImageOptions.allowFlipping && this.allowCounterRotation == cropImageOptions.allowCounterRotation && this.rotationDegrees == cropImageOptions.rotationDegrees && this.flipHorizontally == cropImageOptions.flipHorizontally && this.flipVertically == cropImageOptions.flipVertically && Intrinsics.areEqual(this.cropMenuCropButtonTitle, cropImageOptions.cropMenuCropButtonTitle) && this.cropMenuCropButtonIcon == cropImageOptions.cropMenuCropButtonIcon && this.skipEditing == cropImageOptions.skipEditing && this.showIntentChooser == cropImageOptions.showIntentChooser && Intrinsics.areEqual(this.intentChooserTitle, cropImageOptions.intentChooserTitle) && Intrinsics.areEqual(this.intentChooserPriorityList, cropImageOptions.intentChooserPriorityList) && Float.compare(this.cropperLabelTextSize, cropImageOptions.cropperLabelTextSize) == 0 && this.cropperLabelTextColor == cropImageOptions.cropperLabelTextColor && Intrinsics.areEqual(this.cropperLabelText, cropImageOptions.cropperLabelText) && this.activityBackgroundColor == cropImageOptions.activityBackgroundColor && Intrinsics.areEqual(this.toolbarColor, cropImageOptions.toolbarColor) && Intrinsics.areEqual(this.toolbarTitleColor, cropImageOptions.toolbarTitleColor) && Intrinsics.areEqual(this.toolbarBackButtonColor, cropImageOptions.toolbarBackButtonColor) && Intrinsics.areEqual(this.toolbarTintColor, cropImageOptions.toolbarTintColor);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.imageSourceIncludeGallery) * 31) + Boolean.hashCode(this.imageSourceIncludeCamera)) * 31) + this.cropShape.hashCode()) * 31) + this.cornerShape.hashCode()) * 31) + Float.hashCode(this.cropCornerRadius)) * 31) + Float.hashCode(this.snapRadius)) * 31) + Float.hashCode(this.touchRadius)) * 31) + this.guidelines.hashCode()) * 31) + this.scaleType.hashCode()) * 31) + Boolean.hashCode(this.showCropOverlay)) * 31) + Boolean.hashCode(this.showCropLabel)) * 31) + Boolean.hashCode(this.showProgressBar)) * 31) + Integer.hashCode(this.progressBarColor)) * 31) + Boolean.hashCode(this.autoZoomEnabled)) * 31) + Boolean.hashCode(this.multiTouchEnabled)) * 31) + Boolean.hashCode(this.centerMoveEnabled)) * 31) + Boolean.hashCode(this.canChangeCropWindow)) * 31) + Integer.hashCode(this.maxZoom)) * 31) + Float.hashCode(this.initialCropWindowPaddingRatio)) * 31) + Boolean.hashCode(this.fixAspectRatio)) * 31) + Integer.hashCode(this.aspectRatioX)) * 31) + Integer.hashCode(this.aspectRatioY)) * 31) + Float.hashCode(this.borderLineThickness)) * 31) + Integer.hashCode(this.borderLineColor)) * 31) + Float.hashCode(this.borderCornerThickness)) * 31) + Float.hashCode(this.borderCornerOffset)) * 31) + Float.hashCode(this.borderCornerLength)) * 31) + Integer.hashCode(this.borderCornerColor)) * 31) + Integer.hashCode(this.circleCornerFillColorHexValue)) * 31) + Float.hashCode(this.guidelinesThickness)) * 31) + Integer.hashCode(this.guidelinesColor)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.minCropWindowWidth)) * 31) + Integer.hashCode(this.minCropWindowHeight)) * 31) + Integer.hashCode(this.minCropResultWidth)) * 31) + Integer.hashCode(this.minCropResultHeight)) * 31) + Integer.hashCode(this.maxCropResultWidth)) * 31) + Integer.hashCode(this.maxCropResultHeight)) * 31) + this.activityTitle.hashCode()) * 31) + Integer.hashCode(this.activityMenuIconColor)) * 31;
        Integer num = this.activityMenuTextColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.customOutputUri;
        int iHashCode3 = (((((((((((((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + this.outputCompressFormat.hashCode()) * 31) + Integer.hashCode(this.outputCompressQuality)) * 31) + Integer.hashCode(this.outputRequestWidth)) * 31) + Integer.hashCode(this.outputRequestHeight)) * 31) + this.outputRequestSizeOptions.hashCode()) * 31) + Boolean.hashCode(this.noOutputImage)) * 31;
        Rect rect = this.initialCropWindowRectangle;
        int iHashCode4 = (((((((((((((((iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.initialRotation)) * 31) + Boolean.hashCode(this.allowRotation)) * 31) + Boolean.hashCode(this.allowFlipping)) * 31) + Boolean.hashCode(this.allowCounterRotation)) * 31) + Integer.hashCode(this.rotationDegrees)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
        CharSequence charSequence = this.cropMenuCropButtonTitle;
        int iHashCode5 = (((((((iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.cropMenuCropButtonIcon)) * 31) + Boolean.hashCode(this.skipEditing)) * 31) + Boolean.hashCode(this.showIntentChooser)) * 31;
        String str = this.intentChooserTitle;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.intentChooserPriorityList;
        int iHashCode7 = (((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.cropperLabelTextSize)) * 31) + Integer.hashCode(this.cropperLabelTextColor)) * 31;
        String str2 = this.cropperLabelText;
        int iHashCode8 = (((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.activityBackgroundColor)) * 31;
        Integer num2 = this.toolbarColor;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.toolbarTitleColor;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.toolbarBackButtonColor;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toolbarTintColor;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        boolean z9 = this.imageSourceIncludeGallery;
        boolean z10 = this.imageSourceIncludeCamera;
        CropImageView.CropShape cropShape = this.cropShape;
        CropImageView.CropCornerShape cropCornerShape = this.cornerShape;
        float f10 = this.cropCornerRadius;
        float f11 = this.snapRadius;
        float f12 = this.touchRadius;
        CropImageView.Guidelines guidelines = this.guidelines;
        CropImageView.ScaleType scaleType = this.scaleType;
        boolean z11 = this.showCropOverlay;
        boolean z12 = this.showCropLabel;
        boolean z13 = this.showProgressBar;
        int i9 = this.progressBarColor;
        boolean z14 = this.autoZoomEnabled;
        boolean z15 = this.multiTouchEnabled;
        boolean z16 = this.centerMoveEnabled;
        boolean z17 = this.canChangeCropWindow;
        int i10 = this.maxZoom;
        float f13 = this.initialCropWindowPaddingRatio;
        boolean z18 = this.fixAspectRatio;
        int i11 = this.aspectRatioX;
        int i12 = this.aspectRatioY;
        float f14 = this.borderLineThickness;
        int i13 = this.borderLineColor;
        float f15 = this.borderCornerThickness;
        float f16 = this.borderCornerOffset;
        float f17 = this.borderCornerLength;
        int i14 = this.borderCornerColor;
        int i15 = this.circleCornerFillColorHexValue;
        float f18 = this.guidelinesThickness;
        int i16 = this.guidelinesColor;
        int i17 = this.backgroundColor;
        int i18 = this.minCropWindowWidth;
        int i19 = this.minCropWindowHeight;
        int i20 = this.minCropResultWidth;
        int i21 = this.minCropResultHeight;
        int i22 = this.maxCropResultWidth;
        int i23 = this.maxCropResultHeight;
        CharSequence charSequence = this.activityTitle;
        int i24 = this.activityMenuIconColor;
        Integer num = this.activityMenuTextColor;
        Uri uri = this.customOutputUri;
        Bitmap.CompressFormat compressFormat = this.outputCompressFormat;
        int i25 = this.outputCompressQuality;
        int i26 = this.outputRequestWidth;
        int i27 = this.outputRequestHeight;
        CropImageView.RequestSizeOptions requestSizeOptions = this.outputRequestSizeOptions;
        boolean z19 = this.noOutputImage;
        Rect rect = this.initialCropWindowRectangle;
        int i28 = this.initialRotation;
        boolean z20 = this.allowRotation;
        boolean z21 = this.allowFlipping;
        boolean z22 = this.allowCounterRotation;
        int i29 = this.rotationDegrees;
        boolean z23 = this.flipHorizontally;
        boolean z24 = this.flipVertically;
        CharSequence charSequence2 = this.cropMenuCropButtonTitle;
        return "CropImageOptions(imageSourceIncludeGallery=" + z9 + ", imageSourceIncludeCamera=" + z10 + ", cropShape=" + cropShape + ", cornerShape=" + cropCornerShape + ", cropCornerRadius=" + f10 + ", snapRadius=" + f11 + ", touchRadius=" + f12 + ", guidelines=" + guidelines + ", scaleType=" + scaleType + ", showCropOverlay=" + z11 + ", showCropLabel=" + z12 + ", showProgressBar=" + z13 + ", progressBarColor=" + i9 + ", autoZoomEnabled=" + z14 + ", multiTouchEnabled=" + z15 + ", centerMoveEnabled=" + z16 + ", canChangeCropWindow=" + z17 + ", maxZoom=" + i10 + ", initialCropWindowPaddingRatio=" + f13 + ", fixAspectRatio=" + z18 + ", aspectRatioX=" + i11 + ", aspectRatioY=" + i12 + ", borderLineThickness=" + f14 + ", borderLineColor=" + i13 + ", borderCornerThickness=" + f15 + ", borderCornerOffset=" + f16 + ", borderCornerLength=" + f17 + ", borderCornerColor=" + i14 + ", circleCornerFillColorHexValue=" + i15 + ", guidelinesThickness=" + f18 + ", guidelinesColor=" + i16 + ", backgroundColor=" + i17 + ", minCropWindowWidth=" + i18 + ", minCropWindowHeight=" + i19 + ", minCropResultWidth=" + i20 + ", minCropResultHeight=" + i21 + ", maxCropResultWidth=" + i22 + ", maxCropResultHeight=" + i23 + ", activityTitle=" + ((Object) charSequence) + ", activityMenuIconColor=" + i24 + ", activityMenuTextColor=" + num + ", customOutputUri=" + uri + ", outputCompressFormat=" + compressFormat + ", outputCompressQuality=" + i25 + ", outputRequestWidth=" + i26 + ", outputRequestHeight=" + i27 + ", outputRequestSizeOptions=" + requestSizeOptions + ", noOutputImage=" + z19 + ", initialCropWindowRectangle=" + rect + ", initialRotation=" + i28 + ", allowRotation=" + z20 + ", allowFlipping=" + z21 + ", allowCounterRotation=" + z22 + ", rotationDegrees=" + i29 + ", flipHorizontally=" + z23 + ", flipVertically=" + z24 + ", cropMenuCropButtonTitle=" + ((Object) charSequence2) + ", cropMenuCropButtonIcon=" + this.cropMenuCropButtonIcon + ", skipEditing=" + this.skipEditing + ", showIntentChooser=" + this.showIntentChooser + ", intentChooserTitle=" + this.intentChooserTitle + ", intentChooserPriorityList=" + this.intentChooserPriorityList + ", cropperLabelTextSize=" + this.cropperLabelTextSize + ", cropperLabelTextColor=" + this.cropperLabelTextColor + ", cropperLabelText=" + this.cropperLabelText + ", activityBackgroundColor=" + this.activityBackgroundColor + ", toolbarColor=" + this.toolbarColor + ", toolbarTitleColor=" + this.toolbarTitleColor + ", toolbarBackButtonColor=" + this.toolbarBackButtonColor + ", toolbarTintColor=" + this.toolbarTintColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.imageSourceIncludeGallery ? 1 : 0);
        dest.writeInt(this.imageSourceIncludeCamera ? 1 : 0);
        dest.writeString(this.cropShape.name());
        dest.writeString(this.cornerShape.name());
        dest.writeFloat(this.cropCornerRadius);
        dest.writeFloat(this.snapRadius);
        dest.writeFloat(this.touchRadius);
        dest.writeString(this.guidelines.name());
        dest.writeString(this.scaleType.name());
        dest.writeInt(this.showCropOverlay ? 1 : 0);
        dest.writeInt(this.showCropLabel ? 1 : 0);
        dest.writeInt(this.showProgressBar ? 1 : 0);
        dest.writeInt(this.progressBarColor);
        dest.writeInt(this.autoZoomEnabled ? 1 : 0);
        dest.writeInt(this.multiTouchEnabled ? 1 : 0);
        dest.writeInt(this.centerMoveEnabled ? 1 : 0);
        dest.writeInt(this.canChangeCropWindow ? 1 : 0);
        dest.writeInt(this.maxZoom);
        dest.writeFloat(this.initialCropWindowPaddingRatio);
        dest.writeInt(this.fixAspectRatio ? 1 : 0);
        dest.writeInt(this.aspectRatioX);
        dest.writeInt(this.aspectRatioY);
        dest.writeFloat(this.borderLineThickness);
        dest.writeInt(this.borderLineColor);
        dest.writeFloat(this.borderCornerThickness);
        dest.writeFloat(this.borderCornerOffset);
        dest.writeFloat(this.borderCornerLength);
        dest.writeInt(this.borderCornerColor);
        dest.writeInt(this.circleCornerFillColorHexValue);
        dest.writeFloat(this.guidelinesThickness);
        dest.writeInt(this.guidelinesColor);
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.minCropWindowWidth);
        dest.writeInt(this.minCropWindowHeight);
        dest.writeInt(this.minCropResultWidth);
        dest.writeInt(this.minCropResultHeight);
        dest.writeInt(this.maxCropResultWidth);
        dest.writeInt(this.maxCropResultHeight);
        TextUtils.writeToParcel(this.activityTitle, dest, flags);
        dest.writeInt(this.activityMenuIconColor);
        Integer num = this.activityMenuTextColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.customOutputUri, flags);
        dest.writeString(this.outputCompressFormat.name());
        dest.writeInt(this.outputCompressQuality);
        dest.writeInt(this.outputRequestWidth);
        dest.writeInt(this.outputRequestHeight);
        dest.writeString(this.outputRequestSizeOptions.name());
        dest.writeInt(this.noOutputImage ? 1 : 0);
        dest.writeParcelable(this.initialCropWindowRectangle, flags);
        dest.writeInt(this.initialRotation);
        dest.writeInt(this.allowRotation ? 1 : 0);
        dest.writeInt(this.allowFlipping ? 1 : 0);
        dest.writeInt(this.allowCounterRotation ? 1 : 0);
        dest.writeInt(this.rotationDegrees);
        dest.writeInt(this.flipHorizontally ? 1 : 0);
        dest.writeInt(this.flipVertically ? 1 : 0);
        TextUtils.writeToParcel(this.cropMenuCropButtonTitle, dest, flags);
        dest.writeInt(this.cropMenuCropButtonIcon);
        dest.writeInt(this.skipEditing ? 1 : 0);
        dest.writeInt(this.showIntentChooser ? 1 : 0);
        dest.writeString(this.intentChooserTitle);
        dest.writeStringList(this.intentChooserPriorityList);
        dest.writeFloat(this.cropperLabelTextSize);
        dest.writeInt(this.cropperLabelTextColor);
        dest.writeString(this.cropperLabelText);
        dest.writeInt(this.activityBackgroundColor);
        Integer num2 = this.toolbarColor;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.toolbarTitleColor;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.toolbarBackButtonColor;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.toolbarTintColor;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(boolean z9, boolean z10, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cropCornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z11, boolean z12, boolean z13, int i9, boolean z14, boolean z15, boolean z16, boolean z17, int i10, float f13, boolean z18, int i11, int i12, float f14, int i13, float f15, float f16, float f17, int i14, int i15, float f18, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, CharSequence charSequence, int i24, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i25, int i26, int i27, CropImageView.RequestSizeOptions requestSizeOptions, boolean z19, Rect rect, int i28, boolean z20, boolean z21, boolean z22, int i29, boolean z23, boolean z24, CharSequence charSequence2, int i30, boolean z25, boolean z26, String str, List list, float f19, int i31, String str2, int i32, Integer num2, Integer num3, Integer num4, Integer num5, int i33, int i34, int i35, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z27;
        int i36;
        float fApplyDimension;
        float f20;
        int i37;
        int i38;
        float fApplyDimension2;
        float f21;
        float fApplyDimension3;
        float f22;
        float fApplyDimension4;
        float f23;
        int i39;
        float fApplyDimension5;
        float f24;
        int iArgb;
        int i40;
        int i41;
        int i42;
        int iApplyDimension;
        int i43;
        int iApplyDimension2;
        CropImageView.RequestSizeOptions requestSizeOptions2;
        int i44;
        float fApplyDimension6;
        boolean z28 = (i33 & 1) != 0 ? true : z9;
        boolean z29 = (i33 & 2) != 0 ? true : z10;
        CropImageView.CropShape cropShape2 = (i33 & 4) != 0 ? CropImageView.CropShape.f3850a : cropShape;
        CropImageView.CropCornerShape cropCornerShape2 = (i33 & 8) != 0 ? CropImageView.CropCornerShape.f3846a : cropCornerShape;
        float fApplyDimension7 = (i33 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f10;
        float fApplyDimension8 = (i33 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        float fApplyDimension9 = (i33 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f12;
        CropImageView.Guidelines guidelines2 = (i33 & 128) != 0 ? CropImageView.Guidelines.f3858c : guidelines;
        CropImageView.ScaleType scaleType2 = (i33 & 256) != 0 ? CropImageView.ScaleType.f3868a : scaleType;
        boolean z30 = (i33 & 512) != 0 ? true : z11;
        boolean z31 = (i33 & 1024) != 0 ? false : z12;
        boolean z32 = (i33 & 2048) != 0 ? true : z13;
        int iRgb = (i33 & 4096) != 0 ? Color.rgb(153, 51, 153) : i9;
        boolean z33 = (i33 & 8192) != 0 ? true : z14;
        boolean z34 = z28;
        boolean z35 = (i33 & 16384) != 0 ? false : z15;
        boolean z36 = (i33 & 32768) != 0 ? true : z16;
        boolean z37 = (i33 & 65536) != 0 ? true : z17;
        int i45 = (i33 & 131072) != 0 ? 4 : i10;
        float f25 = (i33 & 262144) != 0 ? 0.0f : f13;
        boolean z38 = (i33 & 524288) != 0 ? false : z18;
        int i46 = (i33 & 1048576) != 0 ? 1 : i11;
        int i47 = (i33 & 2097152) != 0 ? 1 : i12;
        if ((i33 & 4194304) != 0) {
            z27 = z35;
            i36 = iRgb;
            fApplyDimension = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            z27 = z35;
            i36 = iRgb;
            fApplyDimension = f14;
        }
        int iArgb2 = (i33 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i13;
        if ((i33 & 16777216) != 0) {
            f20 = fApplyDimension;
            i37 = iArgb2;
            i38 = 1;
            fApplyDimension2 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f20 = fApplyDimension;
            i37 = iArgb2;
            i38 = 1;
            fApplyDimension2 = f15;
        }
        if ((i33 & 33554432) != 0) {
            f21 = fApplyDimension2;
            fApplyDimension3 = TypedValue.applyDimension(i38, 5.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f21 = fApplyDimension2;
            fApplyDimension3 = f16;
        }
        if ((i33 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            f22 = fApplyDimension3;
            fApplyDimension4 = TypedValue.applyDimension(i38, 14.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f22 = fApplyDimension3;
            fApplyDimension4 = f17;
        }
        int i48 = (i33 & 134217728) != 0 ? -1 : i14;
        int i49 = (i33 & 268435456) != 0 ? -1 : i15;
        if ((i33 & 536870912) != 0) {
            f23 = fApplyDimension4;
            i39 = i48;
            fApplyDimension5 = TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f23 = fApplyDimension4;
            i39 = i48;
            fApplyDimension5 = f18;
        }
        int iArgb3 = (i33 & 1073741824) != 0 ? Color.argb(170, 255, 255, 255) : i16;
        if ((i33 & Integer.MIN_VALUE) != 0) {
            f24 = fApplyDimension5;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            f24 = fApplyDimension5;
            iArgb = i17;
        }
        if ((i34 & 1) != 0) {
            i40 = iArgb3;
            i41 = iArgb;
            i42 = 1;
            iApplyDimension = (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i40 = iArgb3;
            i41 = iArgb;
            i42 = 1;
            iApplyDimension = i18;
        }
        if ((i34 & 2) != 0) {
            i43 = iApplyDimension;
            iApplyDimension2 = (int) TypedValue.applyDimension(i42, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i43 = iApplyDimension;
            iApplyDimension2 = i19;
        }
        int i50 = (i34 & 4) != 0 ? 40 : i20;
        int i51 = (i34 & 8) != 0 ? 40 : i21;
        int i52 = (i34 & 16) != 0 ? 99999 : i22;
        int i53 = (i34 & 32) != 0 ? 99999 : i23;
        CharSequence charSequence3 = (i34 & 64) != 0 ? "" : charSequence;
        int i54 = (i34 & 128) != 0 ? 0 : i24;
        int i55 = iApplyDimension2;
        Integer num6 = (i34 & 256) != 0 ? null : num;
        Uri uri2 = (i34 & 512) != 0 ? null : uri;
        Bitmap.CompressFormat compressFormat2 = (i34 & 1024) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat;
        int i56 = (i34 & 2048) != 0 ? 90 : i25;
        int i57 = (i34 & 4096) != 0 ? 0 : i26;
        int i58 = (i34 & 8192) != 0 ? 0 : i27;
        CropImageView.RequestSizeOptions requestSizeOptions3 = (i34 & 16384) != 0 ? CropImageView.RequestSizeOptions.f3861a : requestSizeOptions;
        boolean z39 = (i34 & 32768) != 0 ? false : z19;
        Rect rect2 = (i34 & 65536) != 0 ? null : rect;
        int i59 = (i34 & 131072) != 0 ? -1 : i28;
        boolean z40 = (i34 & 262144) != 0 ? true : z20;
        boolean z41 = (i34 & 524288) != 0 ? true : z21;
        boolean z42 = (i34 & 1048576) != 0 ? false : z22;
        int i60 = (i34 & 2097152) != 0 ? 90 : i29;
        boolean z43 = (i34 & 4194304) != 0 ? false : z23;
        boolean z44 = (i34 & 8388608) != 0 ? false : z24;
        CharSequence charSequence4 = (i34 & 16777216) != 0 ? null : charSequence2;
        int i61 = (i34 & 33554432) != 0 ? 0 : i30;
        boolean z45 = (i34 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? false : z25;
        boolean z46 = (i34 & 134217728) != 0 ? false : z26;
        String str3 = (i34 & 268435456) != 0 ? null : str;
        List listEmptyList = (i34 & 536870912) != 0 ? CollectionsKt.emptyList() : list;
        if ((i34 & 1073741824) != 0) {
            requestSizeOptions2 = requestSizeOptions3;
            i44 = i50;
            fApplyDimension6 = TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            requestSizeOptions2 = requestSizeOptions3;
            i44 = i50;
            fApplyDimension6 = f19;
        }
        this(z34, z29, cropShape2, cropCornerShape2, fApplyDimension7, fApplyDimension8, fApplyDimension9, guidelines2, scaleType2, z30, z31, z32, i36, z33, z27, z36, z37, i45, f25, z38, i46, i47, f20, i37, f21, f22, f23, i39, i49, f24, i40, i41, i43, i55, i44, i51, i52, i53, charSequence3, i54, num6, uri2, compressFormat2, i56, i57, i58, requestSizeOptions2, z39, rect2, i59, z40, z41, z42, i60, z43, z44, charSequence4, i61, z45, z46, str3, listEmptyList, fApplyDimension6, (i34 & Integer.MIN_VALUE) != 0 ? -1 : i31, (i35 & 1) != 0 ? "" : str2, (i35 & 2) != 0 ? -1 : i32, (i35 & 4) != 0 ? null : num2, (i35 & 8) != 0 ? null : num3, (i35 & 16) != 0 ? null : num4, (i35 & 32) != 0 ? null : num5);
    }
}
