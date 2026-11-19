package com.friday.common.helper;

import com.friday.common.entity.ResourceEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9168e;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10980x;
import p364uc.AbstractC11382b;

/* loaded from: classes3.dex */
public final class NotePageOrder {

    /* renamed from: a */
    public static final NotePageOrder f6040a = new NotePageOrder();

    /* renamed from: b */
    public static final ConcurrentHashMap f6041b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final int f6042c = 8;

    /* renamed from: com.friday.common.helper.NotePageOrder$a */
    public static final class C5955a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    /* renamed from: com.friday.common.helper.NotePageOrder$b */
    public static final class C5956b implements Comparator {

        /* renamed from: c */
        public final /* synthetic */ Comparator f6043c;

        public C5956b(Comparator comparator) {
            this.f6043c = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f6043c.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC11382b.m25330d(((ResourceEntity) obj).getPageName(), ((ResourceEntity) obj2).getPageName());
        }
    }

    /* renamed from: com.friday.common.helper.NotePageOrder$c */
    public static final class C5957c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            NotePageOrder notePageOrder = NotePageOrder.f6040a;
            return AbstractC11382b.m25330d(Integer.valueOf(notePageOrder.m5245c((ResourceEntity) obj)), Integer.valueOf(notePageOrder.m5245c((ResourceEntity) obj2)));
        }
    }

    /* renamed from: com.friday.common.helper.NotePageOrder$d */
    public static final class C5958d implements Comparator {

        /* renamed from: c */
        public final /* synthetic */ Comparator f6044c;

        public C5958d(Comparator comparator) {
            this.f6044c = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f6044c.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC11382b.m25330d(((ResourceEntity) obj).getId(), ((ResourceEntity) obj2).getId());
        }
    }

    /* renamed from: com.friday.common.helper.NotePageOrder$e */
    public static final class C5959e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(((ResourceEntity) obj).getId(), ((ResourceEntity) obj2).getId());
        }
    }

    /* b chooses one live resource per page and sorts representatives by stored pageIndex, then pageName. */
    public final List m5244b(List resources) {
        AbstractC9979u.m20294g(resources, "resources");
        ArrayList arrayList = new ArrayList();
        for (Object obj : resources) {
            if (!((ResourceEntity) obj).getWasDeleted()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            String pageName = ((ResourceEntity) obj2).getPageName();
            Object arrayList2 = linkedHashMap.get(pageName);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pageName, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!C9168e.f21413a.m18067a(new File((String) entry.getKey()))) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap2.values();
        ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList3.add((ResourceEntity) AbstractC10947g0.m23903E0((List) it.next(), new C5958d(new C5957c())));
        }
        return AbstractC10947g0.m23914P0(arrayList3, new C5956b(new C5955a()));
    }

    /* c ranks each local resource: data.mdb, lock.mdb, screenshot.png, snapshot.bin, then other files. */
    public final int m5245c(ResourceEntity resourceEntity) {
        File file = new File(resourceEntity.getId());
        File parentFile = file.getParentFile();
        if (AbstractC9979u.m20289b(parentFile != null ? parentFile.getName() : null, "page_mdb") && AbstractC9979u.m20289b(file.getName(), "data.mdb")) {
            return 0;
        }
        File parentFile2 = file.getParentFile();
        if (AbstractC9979u.m20289b(parentFile2 != null ? parentFile2.getName() : null, "page_mdb") && AbstractC9979u.m20289b(file.getName(), "lock.mdb")) {
            return 1;
        }
        if (AbstractC9979u.m20289b(file.getName(), "screenshot.png")) {
            return 2;
        }
        return AbstractC9979u.m20289b(file.getName(), "snapshot.bin") ? 3 : 4;
    }

    /* renamed from: d */
    public final List m5246d(List resources) {
        AbstractC9979u.m20294g(resources, "resources");
        ArrayList arrayList = new ArrayList();
        for (Object obj : resources) {
            ResourceEntity resourceEntity = (ResourceEntity) obj;
            if (!resourceEntity.getWasDeleted() && AbstractC10819z.m23229B(resourceEntity.getId(), "screenshot.png", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        List listM23914P0 = AbstractC10947g0.m23914P0(arrayList, new C5959e());
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10410o.m21752e(AbstractC10967q0.m24038e(AbstractC10980x.m24153x(listM23914P0, 10)), 16));
        for (Object obj2 : listM23914P0) {
            linkedHashMap.put(((ResourceEntity) obj2).getPageName(), obj2);
        }
        List listM5244b = m5244b(resources);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM5244b.iterator();
        while (it.hasNext()) {
            ResourceEntity resourceEntity2 = (ResourceEntity) linkedHashMap.get(((ResourceEntity) it.next()).getPageName());
            File file = resourceEntity2 != null ? new File(resourceEntity2.getId()) : null;
            if (file != null) {
                arrayList2.add(file);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5247e(java.lang.String r9, p181hd.InterfaceC9540l r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.friday.common.helper.NotePageOrder$withNoteLock$1
            if (r0 == 0) goto L13
            r0 = r11
            com.friday.common.helper.NotePageOrder$withNoteLock$1 r0 = (com.friday.common.helper.NotePageOrder$withNoteLock$1) r0
            int r1 = r0.f6052j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6052j = r1
            goto L18
        L13:
            com.friday.common.helper.NotePageOrder$withNoteLock$1 r0 = new com.friday.common.helper.NotePageOrder$withNoteLock$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f6050h
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6052j
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5a
            if (r2 == r5) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r9 = r0.f6047e
            be.a r9 = (be.InterfaceC5189a) r9
            java.lang.Object r10 = r0.f6046d
            hd.l r10 = (p181hd.InterfaceC9540l) r10
            java.lang.Object r10 = r0.f6045c
            java.lang.String r10 = (java.lang.String) r10
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L3b
            goto Lad
        L3b:
            r10 = move-exception
            goto Lb5
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L46:
            int r9 = r0.f6048f
            java.lang.Object r10 = r0.f6047e
            be.a r10 = (be.InterfaceC5189a) r10
            java.lang.Object r2 = r0.f6046d
            hd.l r2 = (p181hd.InterfaceC9540l) r2
            java.lang.Object r5 = r0.f6045c
            java.lang.String r5 = (java.lang.String) r5
            kotlin.AbstractC9924b.m20071b(r11)
            r11 = r9
            r9 = r5
            goto L91
        L5a:
            kotlin.AbstractC9924b.m20071b(r11)
            java.util.concurrent.ConcurrentHashMap r11 = com.friday.common.helper.NotePageOrder.f6041b
            java.lang.Object r2 = r11.get(r9)
            if (r2 != 0) goto L71
            be.a r2 = be.AbstractC5194f.m2745b(r4, r5, r6)
            java.lang.Object r11 = r11.putIfAbsent(r9, r2)
            if (r11 != 0) goto L70
            goto L71
        L70:
            r2 = r11
        L71:
            java.lang.String r11 = "getOrPut(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r2, r11)
            be.a r2 = (be.InterfaceC5189a) r2
            java.lang.Object r11 = p409xc.AbstractC11833h.m26224a(r9)
            r0.f6045c = r11
            r0.f6046d = r10
            r0.f6047e = r2
            r0.f6048f = r4
            r0.f6052j = r5
            java.lang.Object r11 = r2.lock(r6, r0)
            if (r11 != r1) goto L8d
            goto Lab
        L8d:
            r11 = r2
            r2 = r10
            r10 = r11
            r11 = r4
        L91:
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r9)     // Catch: java.lang.Throwable -> Lb1
            r0.f6045c = r9     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r2)     // Catch: java.lang.Throwable -> Lb1
            r0.f6046d = r9     // Catch: java.lang.Throwable -> Lb1
            r0.f6047e = r10     // Catch: java.lang.Throwable -> Lb1
            r0.f6048f = r11     // Catch: java.lang.Throwable -> Lb1
            r0.f6049g = r4     // Catch: java.lang.Throwable -> Lb1
            r0.f6052j = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r11 = r2.invoke(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r9 = r10
        Lad:
            r9.unlock(r6)
            return r11
        Lb1:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        Lb5:
            r9.unlock(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.helper.NotePageOrder.m5247e(java.lang.String, hd.l, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/helper/NotePageOrder.smali:1098
    }
}
