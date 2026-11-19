package androidx.compose.material3;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateReaderKt;
import android.view.SavedStateWriter;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.vector.PathBuilder;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.DescriptorProtos;
import com.zykj.sketch.EzyDrawBoard;
import io.objectbox.C5699c;
import io.objectbox.C5701e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5833n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* renamed from: androidx.compose.material3.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1923c {
    /* renamed from: A */
    public static PathBuilder m1033A(float f, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f7);
        pathBuilder.lineTo(f8, f9);
        return pathBuilder;
    }

    /* renamed from: B */
    public static Object m1034B(int i) {
        return EzyDrawBoard.getDescriptor().getMessageTypes().get(i);
    }

    /* renamed from: C */
    public static KotlinNothingValueException m1035C(String str) {
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        return new KotlinNothingValueException();
    }

    /* renamed from: D */
    public static float m1036D(float f, float f7, float f8, float f9) {
        return f9 - ((f * f7) / f8);
    }

    /* renamed from: a */
    public static float m1037a(float f, float f7, float f8, float f9) {
        return (f8 - (f * f7)) / f9;
    }

    /* renamed from: b */
    public static int m1038b(int i, int i8, int i9, int i10) {
        return ((i * i8) + i9) * i10;
    }

    /* renamed from: c */
    public static int m1039c(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    /* renamed from: d */
    public static long m1040d(Placeable.PlacementScope placementScope, Placeable placeable, Placeable placeable2, long j7) {
        placementScope.handleMotionFrameOfReferencePlacement(placeable);
        return IntOffset.m13437plusqkQi6aY(j7, placeable2.apparentToRealOffset);
    }

    /* renamed from: e */
    public static Bundle m1041e(Bundle bundle, String str, String str2, String str3, Bundle bundle2) {
        AbstractC5830k.m5330g(bundle, str);
        AbstractC5830k.m5330g(str2, str3);
        return SavedStateWriter.m13683constructorimpl(bundle2);
    }

    /* renamed from: f */
    public static Modifier m1042f(float f, Modifier modifier, long j7) {
        return BackgroundKt.m6753backgroundbw27NRU(modifier, j7, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f)));
    }

    /* renamed from: g */
    public static PathBuilder m1043g(float f, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f7);
        pathBuilder.lineToRelative(f8, f9);
        return pathBuilder;
    }

    /* renamed from: h */
    public static C5699c m1044h(C5701e c5701e, C5701e c5701e2, String str) {
        c5701e.getClass();
        return new C5699c(c5701e2, str);
    }

    /* renamed from: i */
    public static Object m1045i(int i) {
        return DescriptorProtos.getDescriptor().getMessageTypes().get(i);
    }

    /* renamed from: j */
    public static Object m1046j(MutableVector mutableVector, int i) {
        return mutableVector.removeAt(mutableVector.getSize() - i);
    }

    /* renamed from: k */
    public static String m1047k(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* renamed from: l */
    public static String m1048l(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* renamed from: m */
    public static String m1049m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: n */
    public static LinkedHashMap m1050n(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static List m1051o(PathBuilder pathBuilder, float f, float f7, float f8, float f9) {
        pathBuilder.lineToRelative(f, f7);
        pathBuilder.lineToRelative(f8, f9);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    /* renamed from: p */
    public static KotlinNothingValueException m1052p() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    /* renamed from: q */
    public static KotlinNothingValueException m1053q(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    /* renamed from: r */
    public static MutablePropertyReference1Impl m1054r(Class cls, String str, String str2, int i, C5833n c5833n) {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls, str, str2, i);
        c5833n.getClass();
        return mutablePropertyReference1Impl;
    }

    /* renamed from: s */
    public static void m1055s(float f, Modifier.Companion companion, Composer composer, int i) {
        SpacerKt.Spacer(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(f)), composer, i);
    }

    /* renamed from: t */
    public static /* synthetic */ void m1056t(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z8 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z8) {
                    executorService.shutdownNow();
                    z8 = true;
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: u */
    public static void m1057u(String str, Object obj, ArrayList arrayList) {
        arrayList.add(new Pair(str, obj));
    }

    /* renamed from: v */
    public static void m1058v(String str, String str2, StringBuilder sb, boolean z8, boolean z9) {
        sb.append(z8);
        sb.append(str);
        sb.append(z9);
        sb.append(str2);
    }

    /* renamed from: w */
    public static void m1059w(StringBuilder sb, int i, String str, int i8, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i8);
        sb.append(str2);
    }

    /* renamed from: x */
    public static void m1060x(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: y */
    public static float m1061y(float f, float f7, float f8, float f9) {
        return (f8 - (f * f7)) * f9;
    }

    /* renamed from: z */
    public static Bundle m1062z(Bundle bundle, String str, String str2, String str3, Bundle bundle2) {
        AbstractC5830k.m5330g(bundle, str);
        AbstractC5830k.m5330g(str2, str3);
        return SavedStateReader.m13597constructorimpl(bundle2);
    }
}
