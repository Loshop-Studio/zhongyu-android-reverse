package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.OssFileResource;
import com.zykj.study.bean.OssFileType;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p179m7.InterfaceC9324c;
import p253t4.C10102k;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class OssTokenViewModel extends BaseViewModel {

    /* renamed from: a */
    public final C10102k f14315a;

    /* renamed from: b */
    public final DataStore f14316b;

    public OssTokenViewModel(C10102k tokenRepository, DataStore userDataStore) {
        AbstractC9133u.m16133g(tokenRepository, "tokenRepository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f14315a = tokenRepository;
        this.f14316b = userDataStore;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m12237b(OssTokenViewModel ossTokenViewModel, OssFileType ossFileType, String str, OssFileResource ossFileResource, String str2, String str3, long j10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        String strM14101I;
        long jCurrentTimeMillis;
        OssTokenViewModel ossTokenViewModel2;
        OssFileType ossFileType2;
        OssFileResource ossFileResource2;
        InterfaceC9324c interfaceC9324c2;
        if ((i10 & 2) != 0) {
            str = "";
        }
        String str4 = str;
        String str5 = (i10 & 8) != 0 ? "0" : str2;
        if ((i10 & 16) != 0) {
            String string = UUID.randomUUID().toString();
            AbstractC9133u.m16132f(string, "toString(...)");
            strM14101I = AbstractC8687z.m14101I(string, "-", "", false, 4, null);
        } else {
            strM14101I = str3;
        }
        if ((i10 & 32) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            ossFileResource2 = ossFileResource;
            interfaceC9324c2 = interfaceC9324c;
            ossTokenViewModel2 = ossTokenViewModel;
            ossFileType2 = ossFileType;
        } else {
            jCurrentTimeMillis = j10;
            ossTokenViewModel2 = ossTokenViewModel;
            ossFileType2 = ossFileType;
            ossFileResource2 = ossFileResource;
            interfaceC9324c2 = interfaceC9324c;
        }
        return ossTokenViewModel2.m12238a(ossFileType2, str4, ossFileResource2, str5, strM14101I, jCurrentTimeMillis, interfaceC9324c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12238a(com.zykj.study.bean.OssFileType r22, java.lang.String r23, com.zykj.study.bean.OssFileResource r24, java.lang.String r25, java.lang.String r26, long r27, p179m7.InterfaceC9324c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.OssTokenViewModel.m12238a(com.zykj.study.bean.OssFileType, java.lang.String, com.zykj.study.bean.OssFileResource, java.lang.String, java.lang.String, long, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/OssTokenViewModel.smali:244
    }
}
