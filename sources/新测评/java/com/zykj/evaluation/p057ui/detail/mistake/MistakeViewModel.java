package com.zykj.evaluation.p057ui.detail.mistake;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.MistakeDataBundle;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;
import p306z5.C10013l1;
import p306z5.C10037t1;
import p306z5.C9993f;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\r2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0,¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000b¢\u0006\u0004\b5\u0010\u000fJ\u0015\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u0011J\u0015\u0010:\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b:\u00108J\u0015\u0010;\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b;\u00108J\u0015\u0010<\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b<\u00108J\u0015\u0010=\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b=\u00108J\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u0010\u0011J\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010\u0010R+\u0010O\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR+\u0010U\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010Y\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010J\u001a\u0004\bW\u0010L\"\u0004\bX\u0010NR+\u0010]\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010R\"\u0004\b\\\u0010TR+\u0010a\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010J\u001a\u0004\b_\u0010L\"\u0004\b`\u0010NR+\u0010f\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010J\u001a\u0004\bc\u0010d\"\u0004\be\u0010\u000fR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020k0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010AR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020k0n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006t"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "", "stemLocalPath", "", "J", "(Ljava/lang/String;)V", "I", "()V", "", "Lcom/zykj/evaluation/ui/detail/mistake/TagData;", "list", "", "v", "(Ljava/util/List;)Z", "Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;", "mistakeDataBundle", "H", "(Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;)V", "", "tagId", "newName", "y", "(JLjava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "index", "startTime", "L", "(Landroid/graphics/Bitmap;IJ)V", "Lz5/f;", "deleteStem", "z", "(Lz5/f;)V", "Lkotlin/Function0;", "callback", "a0", "(Lkotlin/jvm/functions/Function0;)V", "Lz5/t1;", "topicData", "Z", "(Lz5/t1;)V", "title", "Y", "tag", "x", "(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_WEST, "U", "K", "X", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lp5/j;", "e", "Lcom/zykj/evaluation/upload/OssTaskManger;", "f", "mMaxSelectedTagNum", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()J", "M", "(J)V", "mExamId", "h", "C", "()Z", "O", "(Z)V", "mIsRelatedGroup", "i", ExifInterface.LONGITUDE_EAST, "Q", "mQuestionId", "j", "D", "P", "mIsStem", "k", "F", "R", "mTopicId", "l", "B", "()Ljava/lang/String;", "N", "mExamName", "Lg7/e;", "m", "Lg7/e;", "mPathManager", "Lz5/l1;", "n", "_mistakeUiState", "Lkotlinx/coroutines/flow/StateFlow;", "o", "Lkotlinx/coroutines/flow/StateFlow;", "G", "()Lkotlinx/coroutines/flow/StateFlow;", "mistakeUiState", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,5:586\n230#2,5:597\n230#2,5:602\n230#2,3:607\n233#2,2:612\n230#2,3:614\n233#2,2:645\n230#2,3:647\n233#2,2:654\n230#2,3:656\n233#2,2:663\n230#2,3:665\n233#2,2:672\n230#2,3:674\n233#2,2:681\n230#2,3:683\n233#2,2:702\n230#2,3:704\n233#2,2:715\n1563#3:591\n1634#3,3:592\n1869#3,2:595\n1869#3,2:610\n1563#3:617\n1634#3,2:618\n1761#3,3:620\n1636#3:623\n1563#3:624\n1634#3,2:625\n1761#3,3:627\n1636#3:630\n1563#3:631\n1634#3,2:632\n1761#3,3:634\n1636#3:637\n1563#3:638\n1634#3,2:639\n1761#3,3:641\n1636#3:644\n1563#3:650\n1634#3,3:651\n1563#3:659\n1634#3,3:660\n1563#3:668\n1634#3,3:669\n1563#3:677\n1634#3,3:678\n1563#3:686\n1634#3,3:687\n1563#3:690\n1634#3,3:691\n1563#3:694\n1634#3,3:695\n1563#3:698\n1634#3,3:699\n1869#3,2:707\n1869#3,2:709\n1869#3,2:711\n1869#3,2:713\n1869#3,2:717\n1869#3,2:719\n1869#3,2:721\n1869#3,2:723\n1740#3,3:725\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel\n*L\n87#1:586,5\n333#1:597,5\n345#1:602,5\n357#1:607,3\n357#1:612,2\n378#1:614,3\n378#1:645,2\n427#1:647,3\n427#1:654,2\n450#1:656,3\n450#1:663,2\n473#1:665,3\n473#1:672,2\n494#1:674,3\n494#1:681,2\n511#1:683,3\n511#1:702,2\n534#1:704,3\n534#1:715,2\n269#1:591\n269#1:592,3\n270#1:595,2\n361#1:610,2\n382#1:617\n382#1:618,2\n383#1:620,3\n382#1:623\n389#1:624\n389#1:625,2\n390#1:627,3\n389#1:630\n396#1:631\n396#1:632,2\n397#1:634,3\n396#1:637\n403#1:638\n403#1:639,2\n404#1:641,3\n403#1:644\n429#1:650\n429#1:651,3\n452#1:659\n452#1:660,3\n475#1:668\n475#1:669,3\n496#1:677\n496#1:678,3\n513#1:686\n513#1:687,3\n516#1:690\n516#1:691,3\n519#1:694\n519#1:695,3\n522#1:698\n522#1:699,3\n537#1:707,2\n540#1:709,2\n544#1:711,2\n547#1:713,2\n569#1:717,2\n572#1:719,2\n575#1:721,2\n578#1:723,2\n581#1:725,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MistakeViewModel extends BaseViewModel {

    /* renamed from: p */
    public static final /* synthetic */ KProperty[] f9289p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mExamId", "getMExamId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mIsRelatedGroup", "getMIsRelatedGroup()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mQuestionId", "getMQuestionId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mIsStem", "getMIsStem()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mTopicId", "getMTopicId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MistakeViewModel.class, "mExamName", "getMExamName()Ljava/lang/String;", 0))};

    /* renamed from: q */
    public static final int f9290q = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: d, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: e, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: f, reason: from kotlin metadata */
    public final int mMaxSelectedTagNum;

    /* renamed from: g, reason: from kotlin metadata */
    public final ReadWriteProperty mExamId;

    /* renamed from: h, reason: from kotlin metadata */
    public final ReadWriteProperty mIsRelatedGroup;

    /* renamed from: i, reason: from kotlin metadata */
    public final ReadWriteProperty mQuestionId;

    /* renamed from: j, reason: from kotlin metadata */
    public final ReadWriteProperty mIsStem;

    /* renamed from: k, reason: from kotlin metadata */
    public final ReadWriteProperty mTopicId;

    /* renamed from: l, reason: from kotlin metadata */
    public final ReadWriteProperty mExamName;

    /* renamed from: m, reason: from kotlin metadata */
    public C7589e mPathManager;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableStateFlow _mistakeUiState;

    /* renamed from: o, reason: from kotlin metadata */
    public final StateFlow mistakeUiState;

    public MistakeViewModel(MutableStateFlow userInfo, InterfaceC8843j service, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.userInfo = userInfo;
        this.service = service;
        this.ossTaskManger = ossTaskManger;
        this.mMaxSelectedTagNum = 5;
        Delegates delegates = Delegates.INSTANCE;
        this.mExamId = delegates.notNull();
        this.mIsRelatedGroup = delegates.notNull();
        this.mQuestionId = delegates.notNull();
        this.mIsStem = delegates.notNull();
        this.mTopicId = delegates.notNull();
        this.mExamName = delegates.notNull();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C10013l1(null, 0L, false, null, null, false, null, null, null, null, null, 2047, null));
        this._mistakeUiState = MutableStateFlow;
        this.mistakeUiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final long m9560A() {
        return ((Number) this.mExamId.getValue(this, f9289p[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final String m9561B() {
        return (String) this.mExamName.getValue(this, f9289p[5]);
    }

    /* renamed from: F */
    private final long m9562F() {
        return ((Number) this.mTopicId.getValue(this, f9289p[4])).longValue();
    }

    /* renamed from: M */
    private final void m9563M(long j10) {
        this.mExamId.setValue(this, f9289p[0], Long.valueOf(j10));
    }

    /* renamed from: N */
    private final void m9564N(String str) {
        this.mExamName.setValue(this, f9289p[5], str);
    }

    /* renamed from: R */
    private final void m9565R(long j10) {
        this.mTopicId.setValue(this, f9289p[4], Long.valueOf(j10));
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m9575w(MistakeViewModel mistakeViewModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return mistakeViewModel.m9597v(list);
    }

    /* renamed from: C */
    public final boolean m9576C() {
        return ((Boolean) this.mIsRelatedGroup.getValue(this, f9289p[1])).booleanValue();
    }

    /* renamed from: D */
    public final boolean m9577D() {
        return ((Boolean) this.mIsStem.getValue(this, f9289p[3])).booleanValue();
    }

    /* renamed from: E */
    public final long m9578E() {
        return ((Number) this.mQuestionId.getValue(this, f9289p[2])).longValue();
    }

    /* renamed from: G, reason: from getter */
    public final StateFlow getMistakeUiState() {
        return this.mistakeUiState;
    }

    /* renamed from: H */
    public final void m9580H(MistakeDataBundle mistakeDataBundle) {
        Intrinsics.checkNotNullParameter(mistakeDataBundle, "mistakeDataBundle");
        if (this.mPathManager != null) {
            return;
        }
        m9563M(mistakeDataBundle.getExamId());
        m9585O(mistakeDataBundle.isRelatedGroup());
        m9587Q(mistakeDataBundle.getQuestionId());
        m9586P(mistakeDataBundle.getStemLocalPath().length() > 0);
        m9565R(mistakeDataBundle.getTopicId());
        m9564N(mistakeDataBundle.getExamName());
        TaskState.Done done = TaskState.Done.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        this.mPathManager = new C7589e(done, lM10602a.longValue(), mistakeDataBundle.getTaskId());
        m9582J(mistakeDataBundle.getStemLocalPath());
        m9581I();
    }

    /* renamed from: I */
    public final void m9581I() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new MistakeViewModel$initServerData$1(this, null), 31, null);
    }

    /* renamed from: J */
    public final void m9582J(String stemLocalPath) {
        Object value;
        C10013l1 c10013l1;
        String strM9561B;
        long jM9562F;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            strM9561B = m9561B();
            jM9562F = m9562F();
            arrayList = new ArrayList();
            if (stemLocalPath.length() > 0) {
                arrayList.add(new C9993f(true, stemLocalPath, "", false));
            } else {
                arrayList.add(new C9993f(false, null, null, false, 15, null));
                arrayList.add(new C9993f(false, null, null, false, 15, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, jM9562F, false, strM9561B, arrayList, false, null, null, null, null, CollectionsKt.listOf(new TagData(0L, null, false, 7, null)), 993, null)));
    }

    /* renamed from: K */
    public final void m9583K() {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            List listM16850f = c10013l1.m16850f();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16850f, 10));
            Iterator it = listM16850f.iterator();
            while (it.hasNext()) {
                arrayList.add(TagData.copy$default((TagData) it.next(), 0L, null, false, 3, null));
            }
            List listM16847c = c10013l1.m16847c();
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16847c, 10));
            Iterator it2 = listM16847c.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TagData.copy$default((TagData) it2.next(), 0L, null, false, 3, null));
            }
            List listM16851g = c10013l1.m16851g();
            arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16851g, 10));
            Iterator it3 = listM16851g.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TagData.copy$default((TagData) it3.next(), 0L, null, false, 3, null));
            }
            List listM16849e = c10013l1.m16849e();
            arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16849e, 10));
            Iterator it4 = listM16849e.iterator();
            while (it4.hasNext()) {
                arrayList4.add(TagData.copy$default((TagData) it4.next(), 0L, null, false, 3, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, arrayList, arrayList2, arrayList3, arrayList4, null, 1087, null)));
    }

    /* renamed from: L */
    public final void m9584L(Bitmap bitmap, int index, long startTime) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        BaseViewModel.m8644f(this, null, null, null, null, null, new MistakeViewModel$saveBitmap$1(this, index, bitmap, startTime, null), 31, null);
    }

    /* renamed from: O */
    public final void m9585O(boolean z9) {
        this.mIsRelatedGroup.setValue(this, f9289p[1], Boolean.valueOf(z9));
    }

    /* renamed from: P */
    public final void m9586P(boolean z9) {
        this.mIsStem.setValue(this, f9289p[3], Boolean.valueOf(z9));
    }

    /* renamed from: Q */
    public final void m9587Q(long j10) {
        this.mQuestionId.setValue(this, f9289p[2], Long.valueOf(j10));
    }

    /* renamed from: S */
    public final void m9588S() {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TagData tagDataCopy$default;
        TagData tagDataCopy$default2;
        TagData tagDataCopy$default3;
        TagData tagDataCopy$default4;
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            List<TagData> listM16852h = c10013l1.m16852h();
            List<TagData> listM16850f = c10013l1.m16850f();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16850f, 10));
            for (TagData tagData : listM16850f) {
                if (listM16852h == null || !listM16852h.isEmpty()) {
                    for (TagData tagData2 : listM16852h) {
                        if (tagData.getId() == tagData2.getId() && Intrinsics.areEqual(tagData.getName(), tagData2.getName())) {
                            tagDataCopy$default4 = TagData.copy$default(tagData, 0L, null, true, 3, null);
                            break;
                        }
                    }
                    tagDataCopy$default4 = TagData.copy$default(tagData, 0L, null, false, 3, null);
                } else {
                    tagDataCopy$default4 = TagData.copy$default(tagData, 0L, null, false, 3, null);
                }
                arrayList.add(tagDataCopy$default4);
            }
            List<TagData> listM16847c = c10013l1.m16847c();
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16847c, 10));
            for (TagData tagData3 : listM16847c) {
                if (listM16852h == null || !listM16852h.isEmpty()) {
                    for (TagData tagData4 : listM16852h) {
                        if (tagData3.getId() == tagData4.getId() && Intrinsics.areEqual(tagData3.getName(), tagData4.getName())) {
                            tagDataCopy$default3 = TagData.copy$default(tagData3, 0L, null, true, 3, null);
                            break;
                        }
                    }
                    tagDataCopy$default3 = TagData.copy$default(tagData3, 0L, null, false, 3, null);
                } else {
                    tagDataCopy$default3 = TagData.copy$default(tagData3, 0L, null, false, 3, null);
                }
                arrayList2.add(tagDataCopy$default3);
            }
            List<TagData> listM16851g = c10013l1.m16851g();
            arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16851g, 10));
            for (TagData tagData5 : listM16851g) {
                if (listM16852h == null || !listM16852h.isEmpty()) {
                    for (TagData tagData6 : listM16852h) {
                        if (tagData5.getId() == tagData6.getId() && Intrinsics.areEqual(tagData5.getName(), tagData6.getName())) {
                            tagDataCopy$default2 = TagData.copy$default(tagData5, 0L, null, true, 3, null);
                            break;
                        }
                    }
                    tagDataCopy$default2 = TagData.copy$default(tagData5, 0L, null, false, 3, null);
                } else {
                    tagDataCopy$default2 = TagData.copy$default(tagData5, 0L, null, false, 3, null);
                }
                arrayList3.add(tagDataCopy$default2);
            }
            List<TagData> listM16849e = c10013l1.m16849e();
            arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16849e, 10));
            for (TagData tagData7 : listM16849e) {
                if (tagData7.getId() == 0 || (listM16852h != null && listM16852h.isEmpty())) {
                    tagDataCopy$default = TagData.copy$default(tagData7, 0L, null, false, 3, null);
                } else {
                    for (TagData tagData8 : listM16852h) {
                        if (tagData7.getId() == tagData8.getId() && Intrinsics.areEqual(tagData7.getName(), tagData8.getName())) {
                            tagDataCopy$default = TagData.copy$default(tagData7, 0L, null, true, 3, null);
                            break;
                        }
                    }
                    tagDataCopy$default = TagData.copy$default(tagData7, 0L, null, false, 3, null);
                }
                arrayList4.add(tagDataCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, arrayList, arrayList2, arrayList3, arrayList4, null, 1087, null)));
    }

    /* renamed from: T */
    public final void m9589T(TagData tag) {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        C10013l1 c10013l12 = (C10013l1) this._mistakeUiState.getValue();
        if (tag.isSelected() || !m9597v(c10013l12.m16847c())) {
            MutableStateFlow mutableStateFlow = this._mistakeUiState;
            do {
                value = mutableStateFlow.getValue();
                c10013l1 = (C10013l1) value;
                List<TagData> listM16847c = c10013l1.m16847c();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16847c, 10));
                for (TagData tagData : listM16847c) {
                    arrayList.add(tag.getId() == tagData.getId() ? TagData.copy$default(tagData, 0L, null, !tag.isSelected(), 3, null) : TagData.copy$default(tagData, 0L, null, false, 3, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, arrayList, null, null, null, 1919, null)));
        }
    }

    /* renamed from: U */
    public final void m9590U(TagData tag) {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.isSelected() || !m9575w(this, null, 1, null)) {
            MutableStateFlow mutableStateFlow = this._mistakeUiState;
            do {
                value = mutableStateFlow.getValue();
                c10013l1 = (C10013l1) value;
                List<TagData> listM16849e = c10013l1.m16849e();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16849e, 10));
                for (TagData tagDataCopy$default : listM16849e) {
                    if (tag.getId() == tagDataCopy$default.getId()) {
                        tagDataCopy$default = TagData.copy$default(tagDataCopy$default, 0L, null, !tag.isSelected(), 3, null);
                    }
                    arrayList.add(tagDataCopy$default);
                }
            } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, null, null, arrayList, null, 1535, null)));
        }
    }

    /* renamed from: V */
    public final void m9591V(TagData tag) {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        C10013l1 c10013l12 = (C10013l1) this._mistakeUiState.getValue();
        if (tag.isSelected() || !m9597v(c10013l12.m16850f())) {
            MutableStateFlow mutableStateFlow = this._mistakeUiState;
            do {
                value = mutableStateFlow.getValue();
                c10013l1 = (C10013l1) value;
                List<TagData> listM16850f = c10013l12.m16850f();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16850f, 10));
                for (TagData tagData : listM16850f) {
                    arrayList.add(tag.getId() == tagData.getId() ? TagData.copy$default(tagData, 0L, null, !tag.isSelected(), 3, null) : TagData.copy$default(tagData, 0L, null, false, 3, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, arrayList, null, null, null, null, 1983, null)));
        }
    }

    /* renamed from: W */
    public final void m9592W(TagData tag) {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        C10013l1 c10013l12 = (C10013l1) this._mistakeUiState.getValue();
        if (tag.isSelected() || !m9597v(c10013l12.m16851g())) {
            MutableStateFlow mutableStateFlow = this._mistakeUiState;
            do {
                value = mutableStateFlow.getValue();
                c10013l1 = (C10013l1) value;
                List<TagData> listM16851g = c10013l1.m16851g();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16851g, 10));
                for (TagData tagData : listM16851g) {
                    arrayList.add(tag.getId() == tagData.getId() ? TagData.copy$default(tagData, 0L, null, !tag.isSelected(), 3, null) : TagData.copy$default(tagData, 0L, null, false, 3, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, null, arrayList, null, null, 1791, null)));
        }
    }

    /* renamed from: X */
    public final void m9593X() {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            arrayList = new ArrayList();
            for (TagData tagData : c10013l1.m16850f()) {
                if (tagData.isSelected()) {
                    arrayList.add(tagData);
                }
            }
            for (TagData tagData2 : c10013l1.m16847c()) {
                if (tagData2.isSelected()) {
                    arrayList.add(tagData2);
                }
            }
            for (TagData tagData3 : c10013l1.m16851g()) {
                if (tagData3.isSelected()) {
                    arrayList.add(tagData3);
                }
            }
            for (TagData tagData4 : c10013l1.m16849e()) {
                if (tagData4.isSelected()) {
                    arrayList.add(tagData4);
                }
            }
            if (arrayList.size() < this.mMaxSelectedTagNum) {
                arrayList.add(0, new TagData(0L, null, false, 7, null));
            }
            Unit unit = Unit.INSTANCE;
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, null, null, null, arrayList, 1023, null)));
    }

    /* renamed from: Y */
    public final void m9594Y(String title) {
        String title2 = title;
        Intrinsics.checkNotNullParameter(title2, "title");
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, C10013l1.m16845b((C10013l1) value, null, 0L, false, title2, null, false, null, null, null, null, null, 2039, null))) {
                return;
            }
            title2 = title;
            mutableStateFlow = mutableStateFlow2;
        }
    }

    /* renamed from: Z */
    public final void m9595Z(C10037t1 topicData) {
        Object value;
        Intrinsics.checkNotNullParameter(topicData, "topicData");
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b((C10013l1) value, null, topicData.m16896a(), topicData.m16896a() != m9562F(), null, null, false, null, null, null, null, null, 2041, null)));
    }

    /* renamed from: a0 */
    public final void m9596a0(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10013l1 c10013l1 = (C10013l1) this._mistakeUiState.getValue();
        m8653k();
        List listM16854j = c10013l1.m16854j();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16854j, 10));
        Iterator it = listM16854j.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9993f) it.next()).m16803c());
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            OssTaskManger.m10470v(this.ossTaskManger, (String) obj, 0, null, 6, null);
        }
        BaseViewModel.m8644f(this, null, null, new MistakeViewModel$uploadFileAndAddMistake$2(null), new MistakeViewModel$uploadFileAndAddMistake$3(null), null, new MistakeViewModel$uploadFileAndAddMistake$4(this, arrayList, c10013l1, callback, null), 19, null);
    }

    /* renamed from: v */
    public final boolean m9597v(List list) {
        C10013l1 c10013l1 = (C10013l1) this._mistakeUiState.getValue();
        Iterator it = c10013l1.m16850f().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((TagData) it.next()).isSelected()) {
                i10++;
            }
        }
        Iterator it2 = c10013l1.m16847c().iterator();
        while (it2.hasNext()) {
            if (((TagData) it2.next()).isSelected()) {
                i10++;
            }
        }
        Iterator it3 = c10013l1.m16851g().iterator();
        while (it3.hasNext()) {
            if (((TagData) it3.next()).isSelected()) {
                i10++;
            }
        }
        Iterator it4 = c10013l1.m16849e().iterator();
        while (it4.hasNext()) {
            if (((TagData) it4.next()).isSelected()) {
                i10++;
            }
        }
        if (i10 >= this.mMaxSelectedTagNum) {
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                if (((TagData) it5.next()).isSelected()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m9598x(TagData tag) {
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        MutableStateFlow mutableStateFlow = this._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            arrayList = new ArrayList();
            for (TagData tagData : c10013l1.m16852h()) {
                if (tagData.getId() != tag.getId() || !Intrinsics.areEqual(tagData.getName(), tag.getName())) {
                    arrayList.add(TagData.copy$default(tagData, 0L, null, false, 7, null));
                }
            }
            if (arrayList.size() < this.mMaxSelectedTagNum && ((TagData) arrayList.get(0)).getId() != 0) {
                arrayList.add(0, new TagData(0L, null, false, 7, null));
            }
            Unit unit = Unit.INSTANCE;
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, null, null, null, arrayList, 1023, null)));
    }

    /* renamed from: y */
    public final void m9599y(long tagId, String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        BaseViewModel.m8644f(this, null, null, null, null, null, new MistakeViewModel$createOrUpdateTag$1(this, tagId, newName, null), 31, null);
    }

    /* renamed from: z */
    public final void m9600z(C9993f deleteStem) {
        Intrinsics.checkNotNullParameter(deleteStem, "deleteStem");
        BaseViewModel.m8644f(this, null, null, null, null, null, new MistakeViewModel$deleteStem$1(deleteStem, this, null), 31, null);
    }
}
