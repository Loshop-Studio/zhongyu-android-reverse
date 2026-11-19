package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7880d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "(Ljava/lang/String;I)V", "BoundReached", "Finished", "animation-core_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class AnimationEndReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimationEndReason[] $VALUES;
    public static final AnimationEndReason BoundReached = new AnimationEndReason("BoundReached", 0);
    public static final AnimationEndReason Finished = new AnimationEndReason("Finished", 1);

    private static final /* synthetic */ AnimationEndReason[] $values() {
        return new AnimationEndReason[]{BoundReached, Finished};
    }

    static {
        AnimationEndReason[] animationEndReasonArr$values = $values();
        $VALUES = animationEndReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(animationEndReasonArr$values);
    }

    private AnimationEndReason(String str, int i6) {
    }

    public static EnumEntries<AnimationEndReason> getEntries() {
        return $ENTRIES;
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) $VALUES.clone();
    }
}
