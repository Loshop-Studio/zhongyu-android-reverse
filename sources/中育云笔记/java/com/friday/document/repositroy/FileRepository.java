package com.friday.document.repositroy;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FileRepository {

    /* renamed from: a */
    public final ResourceDao f6705a;

    /* renamed from: b */
    public final FileDao f6706b;

    /* renamed from: c */
    public final InterfaceC5308v0 f6707c;

    /* renamed from: com.friday.document.repositroy.FileRepository$a */
    public static final class C5991a extends TypeToken<ArrayList<String>> {
    }

    public FileRepository(ResourceDao resourceDao, FileDao fileDao, InterfaceC5308v0 imageSafetyDao) {
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        this.f6705a = resourceDao;
        this.f6706b = fileDao;
        this.f6707c = imageSafetyDao;
    }

    /* renamed from: d */
    public final Object m5582d(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileRepository$clearNoteCacheInternal$2(fileEntity, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5583e(java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.List r20, vc.InterfaceC11588c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.repositroy.FileRepository.m5583e(java.lang.String, java.lang.String, java.util.List, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/repositroy/FileRepository.smali:168
    }
}
