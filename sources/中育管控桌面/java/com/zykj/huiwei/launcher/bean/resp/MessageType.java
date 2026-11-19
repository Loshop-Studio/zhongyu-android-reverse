package com.zykj.huiwei.launcher.bean.resp;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/MessageType;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "CommentAndReplies", "PagePublish", "NoticePublish", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class MessageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;
    private final int type;
    public static final MessageType CommentAndReplies = new MessageType("CommentAndReplies", 0, 1);
    public static final MessageType PagePublish = new MessageType("PagePublish", 1, 2);
    public static final MessageType NoticePublish = new MessageType("NoticePublish", 2, 3);

    private static final /* synthetic */ MessageType[] $values() {
        return new MessageType[]{CommentAndReplies, PagePublish, NoticePublish};
    }

    static {
        MessageType[] messageTypeArr$values = $values();
        $VALUES = messageTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(messageTypeArr$values);
    }

    private MessageType(String str, int i6, int i7) {
        this.type = i7;
    }

    public static EnumEntries<MessageType> getEntries() {
        return $ENTRIES;
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
