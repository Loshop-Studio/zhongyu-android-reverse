package com.friday.document.adapter;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RecycleBinPayloadKeys {

    /* renamed from: c */
    public static final RecycleBinPayloadKeys f6256c = new RecycleBinPayloadKeys("BACKGROUND", 0);

    /* renamed from: d */
    public static final RecycleBinPayloadKeys f6257d = new RecycleBinPayloadKeys("EXPIRED_TIME", 1);

    /* renamed from: e */
    public static final /* synthetic */ RecycleBinPayloadKeys[] f6258e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC11943a f6259f;

    static {
        RecycleBinPayloadKeys[] recycleBinPayloadKeysArrM5489a = m5489a();
        f6258e = recycleBinPayloadKeysArrM5489a;
        f6259f = AbstractC9953a.m20230a(recycleBinPayloadKeysArrM5489a);
    }

    public RecycleBinPayloadKeys(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ RecycleBinPayloadKeys[] m5489a() {
        return new RecycleBinPayloadKeys[]{f6256c, f6257d};
    }

    public static RecycleBinPayloadKeys valueOf(String str) {
        return (RecycleBinPayloadKeys) Enum.valueOf(RecycleBinPayloadKeys.class, str);
    }

    public static RecycleBinPayloadKeys[] values() {
        return (RecycleBinPayloadKeys[]) f6258e.clone();
    }
}
