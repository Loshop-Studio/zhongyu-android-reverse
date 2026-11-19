package com.friday.common.entity;

import androidx.annotation.Keep;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes3.dex */
public final class MqttType {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ MqttType[] $VALUES;
    public static final MqttType IS_STUDENT_ONLINE = new MqttType("IS_STUDENT_ONLINE", 0);
    public static final MqttType STUDENT_ONLINE_NOW = new MqttType("STUDENT_ONLINE_NOW", 1);
    public static final MqttType NONE = new MqttType("NONE", 2);
    public static final MqttType ARRANGE_HOMEWORK = new MqttType("ARRANGE_HOMEWORK", 3);
    public static final MqttType REQUEST_SUBMIT_HOMEWORK = new MqttType("REQUEST_SUBMIT_HOMEWORK", 4);
    public static final MqttType SUBMIT_HOMEWORK_REPLY = new MqttType("SUBMIT_HOMEWORK_REPLY", 5);
    public static final MqttType OFFLINE = new MqttType("OFFLINE", 6);
    public static final MqttType TIME_UP = new MqttType("TIME_UP", 7);
    public static final MqttType END_CLASS = new MqttType("END_CLASS", 8);
    public static final MqttType REQUEST_HOMEWORK_STATUS = new MqttType("REQUEST_HOMEWORK_STATUS", 9);
    public static final MqttType REQUEST_HOMEWORK_STATUS_REPLY = new MqttType("REQUEST_HOMEWORK_STATUS_REPLY", 10);
    public static final MqttType GET_TOPIC = new MqttType("GET_TOPIC", 11);
    public static final MqttType STUDENT_SCREEN_OFF = new MqttType("STUDENT_SCREEN_OFF", 12);
    public static final MqttType STOP_SCREENCAST_BY_PC = new MqttType("STOP_SCREENCAST_BY_PC", 13);
    public static final MqttType STOP_APPLICATION_BY_PC = new MqttType("STOP_APPLICATION_BY_PC", 14);
    public static final MqttType REQUEST_SCREEN_CAPTURE = new MqttType("REQUEST_SCREEN_CAPTURE", 15);

    private static final /* synthetic */ MqttType[] $values() {
        return new MqttType[]{IS_STUDENT_ONLINE, STUDENT_ONLINE_NOW, NONE, ARRANGE_HOMEWORK, REQUEST_SUBMIT_HOMEWORK, SUBMIT_HOMEWORK_REPLY, OFFLINE, TIME_UP, END_CLASS, REQUEST_HOMEWORK_STATUS, REQUEST_HOMEWORK_STATUS_REPLY, GET_TOPIC, STUDENT_SCREEN_OFF, STOP_SCREENCAST_BY_PC, STOP_APPLICATION_BY_PC, REQUEST_SCREEN_CAPTURE};
    }

    static {
        MqttType[] mqttTypeArr$values = $values();
        $VALUES = mqttTypeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(mqttTypeArr$values);
    }

    private MqttType(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static MqttType valueOf(String str) {
        return (MqttType) Enum.valueOf(MqttType.class, str);
    }

    public static MqttType[] values() {
        return (MqttType[]) $VALUES.clone();
    }
}
