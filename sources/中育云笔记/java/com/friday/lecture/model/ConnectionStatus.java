package com.friday.lecture.model;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConnectionStatus {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ ConnectionStatus[] $VALUES;
    public static final ConnectionStatus DISCONNECTED = new ConnectionStatus("DISCONNECTED", 0);
    public static final ConnectionStatus CONNECTING = new ConnectionStatus("CONNECTING", 1);
    public static final ConnectionStatus CONNECTED = new ConnectionStatus("CONNECTED", 2);
    public static final ConnectionStatus CONNECTION_FAILED = new ConnectionStatus("CONNECTION_FAILED", 3);

    private static final /* synthetic */ ConnectionStatus[] $values() {
        return new ConnectionStatus[]{DISCONNECTED, CONNECTING, CONNECTED, CONNECTION_FAILED};
    }

    static {
        ConnectionStatus[] connectionStatusArr$values = $values();
        $VALUES = connectionStatusArr$values;
        $ENTRIES = AbstractC9953a.m20230a(connectionStatusArr$values);
    }

    private ConnectionStatus(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) $VALUES.clone();
    }
}
