package p077e5;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.Intrinsics;
import p087f4.C7438c;

/* renamed from: e5.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7345f {
    /* renamed from: a */
    public static final BackgroundLineConfig.BackgroundLineType m11750a(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        Intrinsics.checkNotNullParameter(backgroundLineTypeEnum, "<this>");
        return BackgroundLineConfig.BackgroundLineType.values()[backgroundLineTypeEnum.getNumber()];
    }

    /* renamed from: b */
    public static final BackgroundLineConfig m11751b(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        Intrinsics.checkNotNullParameter(backgroundLineConfigEntity, "<this>");
        return new BackgroundLineConfig(backgroundLineConfigEntity.getLineColor(), backgroundLineConfigEntity.getLineSpace(), m11750a(backgroundLineConfigEntity.getLineType()), backgroundLineConfigEntity.getLineWidth());
    }

    /* renamed from: c */
    public static final BackgroundLineConfig m11752c(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        int iM7550r = backgroundLineConfig.m7550r();
        float fM7551s = backgroundLineConfig.m7551s();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType = backgroundLineConfig.m7552t();
        Intrinsics.checkNotNullExpressionValue(lineType, "lineType");
        return new BackgroundLineConfig(iM7550r, fM7551s, m11750a(lineType), backgroundLineConfig.m7554v());
    }

    /* renamed from: d */
    public static final BackgroundLineConfigEntity m11753d(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        return new BackgroundLineConfigEntity(0L, backgroundLineConfig.m5974a(), backgroundLineConfig.m5975b(), m11755f(backgroundLineConfig.m5976c()), backgroundLineConfig.m5977d(), 1, null);
    }

    /* renamed from: e */
    public static final MoveConfigEntity m11754e(C7438c c7438c) {
        Intrinsics.checkNotNullParameter(c7438c, "<this>");
        return new MoveConfigEntity(0L, c7438c.m11999g(), c7438c.m11998f(), c7438c.m11993a(), c7438c.m11997e(), c7438c.m11996d(), c7438c.m11994b(), c7438c.m11995c(), 1, null);
    }

    /* renamed from: f */
    public static final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m11755f(BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        Intrinsics.checkNotNullParameter(backgroundLineType, "<this>");
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM6909f = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m6909f(backgroundLineType.ordinal());
        Intrinsics.checkNotNullExpressionValue(backgroundLineTypeEnumM6909f, "forNumber(ordinal)");
        return backgroundLineTypeEnumM6909f;
    }

    /* renamed from: g */
    public static final EzyHeader.BackgroundLineConfig m11756g(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = EzyHeader.BackgroundLineConfig.m7548w().m7574s(backgroundLineConfig.m5975b()).m7573r(backgroundLineConfig.m5974a()).m7577v(backgroundLineConfig.m5977d()).m7575t(m11755f(backgroundLineConfig.m5976c())).build();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigBuild, "newBuilder()\n        .se…eEnum())\n        .build()");
        return backgroundLineConfigBuild;
    }
}
