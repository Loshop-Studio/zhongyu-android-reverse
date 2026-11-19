package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* loaded from: classes5.dex */
public class BaseException extends Exception {

    /* renamed from: c */
    public final int f11683c;

    /* renamed from: d */
    public final ErrorEnum f11684d;

    public BaseException(int i10) {
        ErrorEnum errorEnumM8224a = ErrorEnum.m8224a(i10);
        this.f11684d = errorEnumM8224a;
        this.f11683c = errorEnumM8224a.m8225c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f11684d.m8227e();
    }
}
