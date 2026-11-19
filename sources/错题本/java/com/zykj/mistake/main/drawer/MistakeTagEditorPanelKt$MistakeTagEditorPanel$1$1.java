package com.zykj.mistake.main.drawer;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.navigation.C2861i;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.main.C5021a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.main.drawer.MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1", m5303f = "MistakeTagEditorPanel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeTagEditorPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeTagEditorPanel.kt\ncom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n1563#2:410\n1634#2,3:411\n774#2:414\n865#2,2:415\n1869#2:417\n2746#2,3:418\n1870#2:421\n*S KotlinDebug\n*F\n+ 1 MistakeTagEditorPanel.kt\ncom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1\n*L\n78#1:410\n78#1:411,3\n83#1:414\n83#1:415,2\n83#1:417\n85#1:418,3\n83#1:421\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ SnapshotStateSet<Long> $knownCustomTagIds;
    final /* synthetic */ SnapshotStateList<CustomTagInfo> $selectedTags;
    final /* synthetic */ C5021a1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1(C5021a1 c5021a1, SnapshotStateList<CustomTagInfo> snapshotStateList, SnapshotStateSet<Long> snapshotStateSet, InterfaceC5631c<? super MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$state = c5021a1;
        this.$selectedTags = snapshotStateList;
        this.$knownCustomTagIds = snapshotStateSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1(this.$state, this.$selectedTags, this.$knownCustomTagIds, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        List list = this.$state.f7829b;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((CustomTagInfo) it.next()).getId()));
        }
        Set setM5221H0 = AbstractC5805t.m5221H0(arrayList);
        AbstractC5810y.m5298Z(this.$selectedTags, new C2861i(setM5221H0, 17));
        if (!this.$knownCustomTagIds.isEmpty()) {
            SnapshotStateSet<Long> snapshotStateSet = this.$knownCustomTagIds;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!snapshotStateSet.contains(new Long(((CustomTagInfo) obj2).getId()))) {
                    arrayList2.add(obj2);
                }
            }
            SnapshotStateList<CustomTagInfo> snapshotStateList = this.$selectedTags;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList2.get(i);
                i++;
                CustomTagInfo customTagInfo = (CustomTagInfo) obj3;
                if (snapshotStateList.size() < 6) {
                    if (!snapshotStateList.isEmpty()) {
                        for (CustomTagInfo customTagInfo2 : snapshotStateList) {
                            if (customTagInfo2.getId() != customTagInfo.getId() || customTagInfo2.getLocalType() != -1) {
                            }
                        }
                    }
                    snapshotStateList.add(customTagInfo);
                }
            }
        }
        this.$knownCustomTagIds.clear();
        this.$knownCustomTagIds.addAll(setM5221H0);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
