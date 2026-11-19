package com.zykj.evaluation.p057ui.sheet;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.GetTaskListKt;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.p057ui.sheet.AbstractC6934b;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;
import p026b7.C4997c1;
import p101g7.C7589e;
import p267v6.C9692k0;
import p267v6.C9705v;
import p267v6.C9709z;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH$¢\u0006\u0004\b \u0010\u001dJ-\u0010\"\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0017J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R+\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00107\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u001dR+\u0010>\u001a\u0002082\u0006\u0010+\u001a\u0002088D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010-\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010F\u001a\u00020?2\u0006\u0010+\u001a\u00020?8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010M\u001a\u00020G2\u0006\u0010+\u001a\u00020G8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010T\u001a\u00020N2\u0006\u0010+\u001a\u00020N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010[\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\\8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010mR$\u0010r\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010m\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bw\u0010qR\u0011\u0010z\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\by\u00105R\u0011\u0010|\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b{\u0010qR\u0014\u0010~\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b}\u0010q¨\u0006\u007f"}, m13558d2 = {"Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;", "answerSheetBundle", "", "H", "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z", "Lb7/c1;", "result", "Lkotlin/Function0;", "", "callback", "G", "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V", "F", "Q", "()V", "n", "N", "", "index", "o", "(I)V", "s", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "failedCallback", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "I", "O", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lcom/zykj/evaluation/upload/OssTaskManger;", "", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()J", "U", "(J)V", "mTaskId", "f", "B", "()I", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "mTaskState", "", "g", "z", "()F", ExifInterface.GPS_DIRECTION_TRUE, "(F)V", "mScaleSize", "Lv6/v;", "h", "Landroidx/compose/runtime/MutableState;", "u", "()Lv6/v;", "P", "(Lv6/v;)V", "answerSheetState", "Lcom/zykj/evaluation/ui/sheet/a;", "i", "D", "()Lcom/zykj/evaluation/ui/sheet/a;", "X", "(Lcom/zykj/evaluation/ui/sheet/a;)V", "previewState", "Lv6/k0;", "j", "C", "()Lv6/k0;", ExifInterface.LONGITUDE_WEST, "(Lv6/k0;)V", "manualPointState", "k", "Lb7/c1;", ExifInterface.LONGITUDE_EAST, "()Lb7/c1;", "setScanResult", "(Lb7/c1;)V", "scanResult", "", "", "l", "[Ljava/lang/String;", "y", "()[Ljava/lang/String;", ExifInterface.LATITUDE_SOUTH, "([Ljava/lang/String;)V", "mPicArray", "Lg7/e;", "m", "Lg7/e;", "x", "()Lg7/e;", "R", "(Lg7/e;)V", "mPathManager", "Z", "isIndexChange", "value", "L", "()Z", "isFirstIn", "Landroid/graphics/Bitmap;", "w", "()Landroid/graphics/Bitmap;", "defaultImage", "M", "isInitialized", "v", "currentIndex", "K", "isDataEmpty", "J", "isAllComplete", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAnswerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n88#2:282\n85#3:283\n113#3,2:284\n85#3:286\n113#3,2:287\n85#3:289\n113#3,2:290\n360#4,7:292\n12434#5,2:299\n12434#5,2:301\n*S KotlinDebug\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel\n*L\n76#1:282\n85#1:283\n85#1:284,2\n88#1:286\n88#1:287,2\n91#1:289\n91#1:290,2\n109#1:292,7\n115#1:299,2\n118#1:301,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class AnswerSheetViewModel extends BaseViewModel {

    /* renamed from: p */
    public static final /* synthetic */ KProperty[] f9918p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AnswerSheetViewModel.class, "mTaskId", "getMTaskId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AnswerSheetViewModel.class, "mTaskState", "getMTaskState()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AnswerSheetViewModel.class, "mScaleSize", "getMScaleSize()F", 0))};

    /* renamed from: q */
    public static final int f9919q = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: d, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: e, reason: from kotlin metadata */
    public final ReadWriteProperty mTaskId;

    /* renamed from: f, reason: from kotlin metadata */
    public final ReadWriteProperty mTaskState;

    /* renamed from: g, reason: from kotlin metadata */
    public final ReadWriteProperty mScaleSize;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableState answerSheetState;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableState previewState;

    /* renamed from: j, reason: from kotlin metadata */
    public final MutableState manualPointState;

    /* renamed from: k, reason: from kotlin metadata */
    public C4997c1 scanResult;

    /* renamed from: l, reason: from kotlin metadata */
    public String[] mPicArray;

    /* renamed from: m, reason: from kotlin metadata */
    public C7589e mPathManager;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean isIndexChange;

    /* renamed from: o, reason: from kotlin metadata */
    public boolean isFirstIn;

    public AnswerSheetViewModel(MutableStateFlow userInfo, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.userInfo = userInfo;
        this.ossTaskManger = ossTaskManger;
        Delegates delegates = Delegates.INSTANCE;
        this.mTaskId = delegates.notNull();
        this.mTaskState = delegates.notNull();
        this.mScaleSize = delegates.notNull();
        this.answerSheetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9705v(null, 0, 3, null), null, 2, null);
        this.previewState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C6933a(null, null, null, null, null, false, 63, null), null, 2, null);
        this.manualPointState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9692k0(null, null, 3, null), null, 2, null);
        this.mPicArray = new String[20];
        this.isFirstIn = true;
    }

    /* renamed from: p */
    public static /* synthetic */ void m10171p(AnswerSheetViewModel answerSheetViewModel, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeIndex");
        }
        if ((i11 & 1) != 0) {
            i10 = answerSheetViewModel.m10203v() + 1;
        }
        answerSheetViewModel.m10198o(i10);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m10172t(AnswerSheetViewModel answerSheetViewModel, Continuation continuation) {
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final long m10173A() {
        return ((Number) this.mTaskId.getValue(this, f9918p[0])).longValue();
    }

    /* renamed from: B */
    public final int m10174B() {
        return ((Number) this.mTaskState.getValue(this, f9918p[1])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final C9692k0 m10175C() {
        return (C9692k0) this.manualPointState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public final C6933a m10176D() {
        return (C6933a) this.previewState.getValue();
    }

    /* renamed from: E, reason: from getter */
    public final C4997c1 getScanResult() {
        return this.scanResult;
    }

    /* renamed from: F */
    public final void m10178F(C4997c1 result, Function0 callback) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.scanResult = result;
        m10196X(C6933a.m10208b(m10176D(), result.m2473a(), null, null, new AbstractC6934b.c(false, false, false, 7, null), null, false, 54, null));
        m10195W(C9692k0.m16203b(m10175C(), null, result.m2474b(), 1, null));
        callback.invoke();
    }

    /* renamed from: G */
    public void mo10179G(C4997c1 result, Function0 callback) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.scanResult = result;
    }

    /* renamed from: H */
    public boolean mo10180H(AnswerSheetBundle answerSheetBundle) {
        Intrinsics.checkNotNullParameter(answerSheetBundle, "answerSheetBundle");
        if (m10185M()) {
            return false;
        }
        m10193U(answerSheetBundle.getTaskId());
        m10194V(answerSheetBundle.getTaskState());
        TaskState taskStateConvertToTaskState = GetTaskListKt.convertToTaskState(answerSheetBundle.getTaskState());
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m10190R(new C7589e(taskStateConvertToTaskState, lM10602a.longValue(), m10173A()));
        return true;
    }

    /* renamed from: I */
    public final void m10181I() {
        C9692k0 c9692k0M10175C = m10175C();
        Bitmap bitmapCopy = m10176D().m10213f().copy(Bitmap.Config.RGB_565, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCopy, "copy(...)");
        m10195W(C9692k0.m16203b(c9692k0M10175C, bitmapCopy, null, 2, null));
    }

    /* renamed from: J */
    public final boolean m10182J() {
        String[] strArr = this.mPicArray;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            boolean z9 = true;
            if (i10 >= length) {
                return true;
            }
            String str = strArr[i10];
            if (str != null && str.length() != 0) {
                z9 = false;
            }
            if (z9) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: K */
    public final boolean m10183K() {
        for (String str : this.mPicArray) {
            if (str != null && str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L, reason: from getter */
    public final boolean getIsFirstIn() {
        return this.isFirstIn;
    }

    /* renamed from: M */
    public final boolean m10185M() {
        return this.mPathManager != null;
    }

    /* renamed from: N */
    public final void m10186N() {
        this.isIndexChange = true;
    }

    /* renamed from: O */
    public final void m10187O() {
        BaseViewModel.m8644f(this, null, null, new AnswerSheetViewModel$reportError$1(null), new AnswerSheetViewModel$reportError$2(null), null, new AnswerSheetViewModel$reportError$3(this, null), 19, null);
    }

    /* renamed from: P */
    public final void m10188P(C9705v c9705v) {
        Intrinsics.checkNotNullParameter(c9705v, "<set-?>");
        this.answerSheetState.setValue(c9705v);
    }

    /* renamed from: Q */
    public final void m10189Q() {
        this.isFirstIn = false;
    }

    /* renamed from: R */
    public final void m10190R(C7589e c7589e) {
        Intrinsics.checkNotNullParameter(c7589e, "<set-?>");
        this.mPathManager = c7589e;
    }

    /* renamed from: S */
    public final void m10191S(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.mPicArray = strArr;
    }

    /* renamed from: T */
    public final void m10192T(float f10) {
        this.mScaleSize.setValue(this, f9918p[2], Float.valueOf(f10));
    }

    /* renamed from: U */
    public final void m10193U(long j10) {
        this.mTaskId.setValue(this, f9918p[0], Long.valueOf(j10));
    }

    /* renamed from: V */
    public final void m10194V(int i10) {
        this.mTaskState.setValue(this, f9918p[1], Integer.valueOf(i10));
    }

    /* renamed from: W */
    public final void m10195W(C9692k0 c9692k0) {
        Intrinsics.checkNotNullParameter(c9692k0, "<set-?>");
        this.manualPointState.setValue(c9692k0);
    }

    /* renamed from: X */
    public final void m10196X(C6933a c6933a) {
        Intrinsics.checkNotNullParameter(c6933a, "<set-?>");
        this.previewState.setValue(c6933a);
    }

    /* renamed from: n */
    public final void m10197n() {
        if (this.isIndexChange) {
            m10198o(m10203v() - 1);
            this.isIndexChange = false;
        }
    }

    /* renamed from: o */
    public final void m10198o(int index) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new AnswerSheetViewModel$changeIndex$1(this, index, null), 31, null);
    }

    /* renamed from: q */
    public abstract void mo10199q(int index);

    /* renamed from: r */
    public abstract void mo10200r(Function0 callback, Function0 failedCallback);

    /* renamed from: s */
    public Object mo10201s(Continuation continuation) {
        return m10172t(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final C9705v m10202u() {
        return (C9705v) this.answerSheetState.getValue();
    }

    /* renamed from: v */
    public final int m10203v() {
        Iterator it = m10176D().m10212e().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((C9709z) it.next()).m16226d() instanceof AbstractC6935c.a) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: w */
    public final Bitmap m10204w() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    }

    /* renamed from: x */
    public final C7589e m10205x() {
        C7589e c7589e = this.mPathManager;
        if (c7589e != null) {
            return c7589e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPathManager");
        return null;
    }

    /* renamed from: y, reason: from getter */
    public final String[] getMPicArray() {
        return this.mPicArray;
    }

    /* renamed from: z */
    public final float m10207z() {
        return ((Number) this.mScaleSize.getValue(this, f9918p[2])).floatValue();
    }
}
