package com.zykj.blackboard.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.zykj.board.EzyHeader$Author;
import com.zykj.board.EzyHeader$Header;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p020b4.C3171u;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/blackboard/utils/BoardDataFactory;", "", "()V", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardDataFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int supportLastVersion = 6;
    public static final int version = 6;

    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;", "", "()V", "supportLastVersion", "", "version", "buildHead", "Lcom/zykj/board/EzyHeader$Header;", "width", "height", "updateTime", "", TypedValues.TransitionType.S_DURATION, "author", "Lcom/zykj/board/EzyHeader$Author;", "provider", "", "(IILjava/lang/Long;JLcom/zykj/board/EzyHeader$Author;Ljava/util/List;)Lcom/zykj/board/EzyHeader$Header;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzyHeader$Header buildHead(int width, int height, @Nullable Long updateTime, long duration, @Nullable EzyHeader$Author author, @Nullable List<EzyHeader$Author> provider) {
            C3171u c3171uNewBuilder = EzyHeader$Header.newBuilder();
            c3171uNewBuilder.f1647b = 6;
            c3171uNewBuilder.f1646a |= 1;
            c3171uNewBuilder.onChanged();
            c3171uNewBuilder.f1648c = width;
            c3171uNewBuilder.f1646a |= 2;
            c3171uNewBuilder.onChanged();
            c3171uNewBuilder.f1649d = height;
            c3171uNewBuilder.f1646a |= 4;
            c3171uNewBuilder.onChanged();
            c3171uNewBuilder.f1650e = new Date().getTime();
            c3171uNewBuilder.f1646a |= 8;
            c3171uNewBuilder.onChanged();
            c3171uNewBuilder.f1652g = duration;
            c3171uNewBuilder.f1646a |= 32;
            c3171uNewBuilder.onChanged();
            if (updateTime != null) {
                c3171uNewBuilder.f1651f = updateTime.longValue();
                c3171uNewBuilder.f1646a |= 16;
                c3171uNewBuilder.onChanged();
            }
            if (author != null) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = c3171uNewBuilder.f1654i;
                if (singleFieldBuilderV3 == null) {
                    c3171uNewBuilder.f1653h = author;
                } else {
                    singleFieldBuilderV3.setMessage(author);
                }
                c3171uNewBuilder.f1646a |= 64;
                c3171uNewBuilder.onChanged();
            }
            if (provider != null) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c3171uNewBuilder.f1657l;
                if (repeatedFieldBuilderV3 == null) {
                    c3171uNewBuilder.m2117g();
                    AbstractMessageLite.Builder.addAll((Iterable) provider, c3171uNewBuilder.f1656k);
                    c3171uNewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(provider);
                }
            }
            return c3171uNewBuilder.build();
        }

        private Companion() {
        }
    }
}
