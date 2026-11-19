package androidx.navigation;

import android.view.OnBackPressedCallback;
import android.view.serialization.ClassDiscriminatorModeKt;
import android.widget.FrameLayout;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.navigation.internal.NavGraphImpl;
import coil3.disk.C3288f;
import com.canhub.cropper.CropImageActivity;
import com.zykj.mistake.data.C4494c;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeBookFilterOptionsResp;
import com.zykj.mistake.entity.resp.MistakeCollectionListResp;
import com.zykj.mistake.entity.resp.MistakeCollectionResp;
import com.zykj.mistake.feature.collection.detail.C4607n;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel;
import com.zykj.mistake.feature.collection.filter.C4676s0;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel;
import com.zykj.mistake.feature.home.C4741n;
import com.zykj.mistake.feature.home.HomeTab;
import com.zykj.mistake.feature.home.MainHomeViewModel;
import com.zykj.mistake.feature.notebook.detail.AbstractC4874s4;
import com.zykj.mistake.feature.notebook.detail.AbstractC4903x3;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4831l3;
import com.zykj.mistake.feature.notebook.detail.C4837m3;
import com.zykj.mistake.feature.notebook.detail.C4889v1;
import com.zykj.mistake.feature.notebook.detail.HandlerC4778c5;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$CreateCollectionEntry;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.list.C4927a;
import com.zykj.mistake.main.AbstractC5057l;
import com.zykj.mistake.main.C5019a;
import com.zykj.mistake.main.C5021a1;
import com.zykj.mistake.main.C5066p;
import com.zykj.mistake.main.C5083x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5775a;
import kotlin.collections.AbstractC5790h;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5836q;
import kotlin.jvm.internal.C5823d;
import kotlin.jvm.internal.C5837r;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KVariance;
import kotlin.text.C5851l;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.sync.C6001a;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p076h7.C5639b;
import p084i7.C5687c;
import p084i7.InterfaceC5686b;
import p101k7.C5759a;
import p101k7.C5768j;
import p101k7.InterfaceC5765g;
import p118m7.C6156m1;
import p118m7.C6159n1;
import p118m7.C6190y;
import p137p4.C6382a;
import p137p4.C6386e;
import p152r6.InterfaceC6471c;
import p169t6.AbstractC6600a;
import p207y6.C6795s;
import p207y6.InterfaceC6793q;

/* renamed from: androidx.navigation.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2861i implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1314a;

    /* renamed from: b */
    public final /* synthetic */ Object f1315b;

    public /* synthetic */ C2861i(Object obj, int i) {
        this.f1314a = i;
        this.f1315b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        Object value;
        String strM5362c;
        int i = this.f1314a;
        int i8 = 0;
        z = false;
        boolean z8 = false;
        C5443s c5443s = C5443s.f8405a;
        Object obj2 = this.f1315b;
        switch (i) {
            case 0:
                return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6((Ref$ObjectRef) obj2, (String) obj));
            case 1:
                return NavGraphImpl.setStartDestination$lambda$14(obj2, (NavDestination) obj);
            case 2:
                ((C3288f) obj2).f1961l = true;
                return c5443s;
            case 3:
                CropImageActivity this$0 = (CropImageActivity) obj2;
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i9 = CropImageActivity.f2361h;
                AbstractC5830k.m5330g(this$0, "this$0");
                AbstractC5830k.m5330g(addCallback, "$this$addCallback");
                this$0.m2435q();
                return c5443s;
            case 4:
                MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = (MistakeCollectionDetailViewModel) obj2;
                MistakeBookFilterOptionsResp resp = (MistakeBookFilterOptionsResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                List<MistakeBookFilterOptionsResp.FilterTopic> topics = resp.getResult().getTopics();
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(topics, 10));
                for (MistakeBookFilterOptionsResp.FilterTopic filterTopic : topics) {
                    arrayList.add(new C6382a(filterTopic.getTopicId(), filterTopic.getTopicName()));
                }
                List<CustomTagInfo> tags = resp.getResult().getTags();
                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(tags, 10));
                for (CustomTagInfo customTagInfo : tags) {
                    arrayList2.add(new C4607n(customTagInfo.getId(), customTagInfo.getName()));
                }
                C5946n0 c5946n0 = mistakeCollectionDetailViewModel.f6437c;
                while (true) {
                    Object value2 = c5946n0.getValue();
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = arrayList;
                    if (c5946n0.m5569i(value2, C4632z0.m4054a((C4632z0) value2, null, null, 0, null, false, null, null, false, false, false, false, false, arrayList4, arrayList3, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -268460033, 31))) {
                        return c5443s;
                    }
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                }
            case 5:
                MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = (MistakeCollectionFilterResultViewModel) obj2;
                MistakeBookFilterOptionsResp resp2 = (MistakeBookFilterOptionsResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                List<MistakeBookFilterOptionsResp.FilterTopic> topics2 = resp2.getResult().getTopics();
                ArrayList arrayList5 = new ArrayList(AbstractC5806u.m5277p(topics2, 10));
                for (MistakeBookFilterOptionsResp.FilterTopic filterTopic2 : topics2) {
                    arrayList5.add(new C6382a(filterTopic2.getTopicId(), filterTopic2.getTopicName()));
                }
                List<CustomTagInfo> tags2 = resp2.getResult().getTags();
                ArrayList arrayList6 = new ArrayList(AbstractC5806u.m5277p(tags2, 10));
                for (CustomTagInfo customTagInfo2 : tags2) {
                    arrayList6.add(new C4607n(customTagInfo2.getId(), customTagInfo2.getName()));
                }
                C5946n0 c5946n02 = mistakeCollectionFilterResultViewModel.f6578c;
                while (true) {
                    Object value3 = c5946n02.getValue();
                    ArrayList arrayList7 = arrayList6;
                    ArrayList arrayList8 = arrayList5;
                    if (c5946n02.m5569i(value3, C4676s0.m4080a((C4676s0) value3, null, null, 0, 0, null, 0, null, 0, null, null, null, false, false, false, false, false, false, false, arrayList8, arrayList7, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -786433, 3))) {
                        return c5443s;
                    }
                    arrayList5 = arrayList8;
                    arrayList6 = arrayList7;
                }
            case 6:
                HomeTab tab = (HomeTab) obj;
                AbstractC5830k.m5330g(tab, "tab");
                ((MainHomeViewModel) obj2).m4100a(new C4741n(tab));
                return c5443s;
            case 7:
                C4764a5 c4764a5 = (C4764a5) obj2;
                FrameLayout frame = (FrameLayout) obj;
                AbstractC5830k.m5330g(frame, "frame");
                c4764a5.getClass();
                c4764a5.f6895b = frame;
                c4764a5.m4173i();
                return c5443s;
            case 8:
                final HandlerC4778c5 handlerC4778c5 = (HandlerC4778c5) obj2;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                AbstractC5830k.m5330g(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: com.zykj.mistake.feature.notebook.detail.MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        HandlerC4778c5 handlerC4778c52 = handlerC4778c5;
                        handlerC4778c52.f6945a = null;
                        handlerC4778c52.removeCallbacksAndMessages(null);
                    }
                };
            case 9:
                C4831l3 c4831l3 = (C4831l3) obj2;
                DrawScope Canvas = (DrawScope) obj;
                AbstractC5830k.m5330g(Canvas, "$this$Canvas");
                Stroke stroke = new Stroke(Canvas.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(16)), 0.0f, StrokeCap.INSTANCE.m11036getRoundKaPHkGw(), 0, null, 26, null);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() & 4294967295L)) * 0.6f;
                AbstractC4903x3.m4278h(fIntBitsToFloat, fIntBitsToFloat2, Canvas, stroke, Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) * 0.44f, ColorKt.Color(4294962928L), ColorKt.Color(4294932597L), c4831l3.f7101c, c4831l3.f7099a);
                AbstractC4903x3.m4278h(fIntBitsToFloat, fIntBitsToFloat2, Canvas, stroke, Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) * 0.33f, ColorKt.Color(4293523700L), ColorKt.Color(4284602299L), c4831l3.f7100b, c4831l3.f7099a);
                AbstractC4903x3.m4278h(fIntBitsToFloat, fIntBitsToFloat2, Canvas, stroke, Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) * 0.22f, ColorKt.Color(4293915639L), ColorKt.Color(4284128767L), c4831l3.f7099a, c4831l3.f7104f);
                return c5443s;
            case 10:
                Rect it = (Rect) obj;
                AbstractC5830k.m5330g(it, "it");
                ((MutableState) obj2).setValue(it);
                return c5443s;
            case 11:
                Rect rect = (Rect) obj2;
                Density offset = (Density) obj;
                AbstractC5830k.m5330g(offset, "$this$offset");
                return IntOffset.m13424boximpl(IntOffset.m13427constructorimpl((AbstractC6600a.m6241q(rect.getBottom()) & 4294967295L) | (AbstractC6600a.m6241q(rect.getRight() - offset.mo6903toPx0680j_4(AbstractC4874s4.f7299a)) << 32)));
            case 12:
                C4837m3 c4837m3 = (C4837m3) obj2;
                MistakeCollectionListResp response = (MistakeCollectionListResp) obj;
                AbstractC5830k.m5330g(response, "response");
                List<MistakeCollectionResp> items = response.getResult().getItems();
                ArrayList arrayList9 = new ArrayList(AbstractC5806u.m5277p(items, 10));
                for (MistakeCollectionResp mistakeCollectionResp : items) {
                    arrayList9.add(new C4494c(String.valueOf(mistakeCollectionResp.getId()), mistakeCollectionResp.getName(), mistakeCollectionResp.getItemCount(), c4837m3.f7142V.contains(Integer.valueOf(mistakeCollectionResp.getId())), 8));
                }
                return arrayList9;
            case 13:
                C5946n0 c5946n03 = ((MistakeDetailNewViewModel) obj2).f6876e;
                List<C4494c> collections = (List) obj;
                AbstractC5830k.m5330g(collections, "collections");
                if (collections.isEmpty()) {
                    do {
                        value = c5946n03.getValue();
                    } while (!c5946n03.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, true, "", "", false, MistakeDetailNewContract$CreateCollectionEntry.EMPTY_DIRECT, false, false, false, false, false, null, 0, -1, -48234497, 1)));
                } else {
                    ArrayList arrayList10 = new ArrayList(AbstractC5806u.m5277p(collections, 10));
                    for (C4494c c4494c : collections) {
                        String str = c4494c.f6007a;
                        String str2 = c4494c.f6008b;
                        int i10 = c4494c.f6009c;
                        int i11 = c4494c.f6010d;
                        arrayList10.add(new C4927a(str, str2, i10, i11, i10 >= i11, c4494c.f6011e));
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int size = arrayList10.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList10.get(i12);
                        i12++;
                        if (((C4927a) obj3).f7461f) {
                            arrayList11.add(obj3);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList(AbstractC5806u.m5277p(arrayList11, 10));
                    int size2 = arrayList11.size();
                    while (i8 < size2) {
                        Object obj4 = arrayList11.get(i8);
                        i8++;
                        arrayList12.add(((C4927a) obj4).f7456a);
                    }
                    Set setM5221H0 = AbstractC5805t.m5221H0(arrayList12);
                    while (true) {
                        Object value4 = c5946n03.getValue();
                        ArrayList arrayList13 = arrayList10;
                        if (!c5946n03.m5569i(value4, C4837m3.m4207a((C4837m3) value4, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, true, arrayList13, null, setM5221H0, setM5221H0, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -221185, 1))) {
                            arrayList10 = arrayList13;
                        }
                    }
                }
                return c5443s;
            case 14:
                C6386e it2 = (C6386e) obj;
                AbstractC5830k.m5330g(it2, "it");
                return C6386e.m6034a(it2, 0L, null, null, null, null, ((C4889v1) obj2).f7360e, 1023);
            case 15:
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                return C5066p.m4379a(draft, null, null, ((C5083x0) ((AbstractC5057l) obj2)).f7973a, null, null, false, null, null, null, null, false, null, 4091);
            case 16:
                C5021a1 state = (C5021a1) obj;
                AbstractC5830k.m5330g(state, "state");
                return C5021a1.m4360a(state, null, C5019a.m4359a((C5019a) obj2, null, "请输入标签名称", false, 23), 7);
            case 17:
                Set set = (Set) obj2;
                CustomTagInfo customTagInfo3 = (CustomTagInfo) obj;
                if (customTagInfo3.getLocalType() == -1 && !set.contains(Long.valueOf(customTagInfo3.getId()))) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            case 18:
                return Boolean.valueOf(((ArrayList) obj2).addAll((List) obj));
            case 19:
                ((C6001a) obj2).m5617g(null);
                return c5443s;
            case 20:
                C5687c c5687c = (C5687c) obj2;
                C5759a buildSerialDescriptor = (C5759a) obj;
                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C5759a.m5098a(buildSerialDescriptor, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, C6156m1.f9830b);
                C5759a.m5098a(buildSerialDescriptor, "value", AbstractC0000a.m7h("kotlinx.serialization.Polymorphic<" + ((C5823d) c5687c.f8861a).m5320e() + '>', C5768j.f9144b, new InterfaceC5765g[0]));
                EmptyList emptyList = c5687c.f8862b;
                AbstractC5830k.m5330g(emptyList, "<set-?>");
                buildSerialDescriptor.f9110b = emptyList;
                return c5443s;
            case 21:
                return obj == ((AbstractC5775a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 22:
                AbstractC5790h abstractC5790h = (AbstractC5790h) obj2;
                Map.Entry it3 = (Map.Entry) obj;
                AbstractC5830k.m5330g(it3, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it3.getKey();
                sb.append(key == abstractC5790h ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value5 = it3.getValue();
                sb.append(value5 != abstractC5790h ? String.valueOf(value5) : "(this Map)");
                return sb.toString();
            case 23:
                C6795s it4 = (C6795s) obj;
                AbstractC5830k.m5330g(it4, "it");
                ((C5837r) obj2).getClass();
                KVariance kVariance = it4.f11462a;
                InterfaceC6793q interfaceC6793q = it4.f11463b;
                if (kVariance == null) {
                    return "*";
                }
                C5837r c5837r = interfaceC6793q instanceof C5837r ? (C5837r) interfaceC6793q : null;
                String strValueOf = (c5837r == null || (strM5362c = c5837r.m5362c(true)) == null) ? String.valueOf(interfaceC6793q) : strM5362c;
                int i13 = AbstractC5836q.f9225a[kVariance.ordinal()];
                if (i13 == 1) {
                    return strValueOf;
                }
                if (i13 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i13 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                return ((C5851l) obj2).m5369a(((Integer) obj).intValue());
            case 25:
                C5759a buildSerialDescriptor2 = (C5759a) obj;
                AbstractC5830k.m5330g(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                EmptyList emptyList2 = (EmptyList) ((C6190y) obj2).f9894b;
                AbstractC5830k.m5330g(emptyList2, "<set-?>");
                buildSerialDescriptor2.f9110b = emptyList2;
                return c5443s;
            case 26:
                InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return interfaceC5765g.mo5102e(iIntValue) + ": " + interfaceC5765g.mo5104g(iIntValue).mo5105h();
            case 27:
                C6159n1 c6159n1 = (C6159n1) obj2;
                C5759a buildClassSerialDescriptor = (C5759a) obj;
                AbstractC5830k.m5330g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C5759a.m5098a(buildClassSerialDescriptor, "first", c6159n1.f9834a.getDescriptor());
                C5759a.m5098a(buildClassSerialDescriptor, "second", c6159n1.f9835b.getDescriptor());
                C5759a.m5098a(buildClassSerialDescriptor, "third", c6159n1.f9836c.getDescriptor());
                return c5443s;
            default:
                InterfaceC5686b interfaceC5686b = (InterfaceC5686b) obj2;
                AbstractC5830k.m5330g((List) obj, "it");
                return interfaceC5686b;
        }
    }

    public /* synthetic */ C2861i(C6001a c6001a, C5639b c5639b) {
        this.f1314a = 19;
        this.f1315b = c6001a;
    }
}
