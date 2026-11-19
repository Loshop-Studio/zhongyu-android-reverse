package na;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.AbstractC9979u;
import p307q9.C10764d;

/* renamed from: na.g */
/* loaded from: classes5.dex */
public abstract class AbstractC10344g {
    /* renamed from: a */
    public static final BackgroundLineConfig.BackgroundLineType m21632a(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        AbstractC9979u.m20294g(backgroundLineTypeEnum, "<this>");
        return BackgroundLineConfig.BackgroundLineType.values()[backgroundLineTypeEnum.getNumber()];
    }

    /* renamed from: b */
    public static final BackgroundLineConfig m21633b(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        AbstractC9979u.m20294g(backgroundLineConfigEntity, "<this>");
        return new BackgroundLineConfig(backgroundLineConfigEntity.m14030b(), backgroundLineConfigEntity.m14031c(), m21632a(backgroundLineConfigEntity.m14032d()), backgroundLineConfigEntity.m14033e());
    }

    /* renamed from: c */
    public static final BackgroundLineConfig m21634c(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(backgroundLineConfig, "<this>");
        int iM15290m = backgroundLineConfig.m15290m();
        float fM15291n = backgroundLineConfig.m15291n();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType = backgroundLineConfig.m15292o();
        AbstractC9979u.m20293f(lineType, "lineType");
        return new BackgroundLineConfig(iM15290m, fM15291n, m21632a(lineType), backgroundLineConfig.m15294r());
    }

    /* renamed from: d */
    public static final BackgroundLineConfigEntity m21635d(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(backgroundLineConfig, "<this>");
        return new BackgroundLineConfigEntity(0L, backgroundLineConfig.m13711a(), backgroundLineConfig.m13712b(), m21637f(backgroundLineConfig.m13713c()), backgroundLineConfig.m13714d(), 1, null);
    }

    /* renamed from: e */
    public static final MoveConfigEntity m21636e(C10764d c10764d) {
        AbstractC9979u.m20294g(c10764d, "<this>");
        return new MoveConfigEntity(0L, c10764d.m22928g(), c10764d.m22927f(), c10764d.m22922a(), c10764d.m22926e(), c10764d.m22925d(), c10764d.m22923b(), c10764d.m22924c(), 1, null);
    }

    /* renamed from: f */
    public static final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m21637f(BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        AbstractC9979u.m20294g(backgroundLineType, "<this>");
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM14644a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m14644a(backgroundLineType.ordinal());
        AbstractC9979u.m20293f(backgroundLineTypeEnumM14644a, "forNumber(ordinal)");
        return backgroundLineTypeEnumM14644a;
    }

    /* renamed from: g */
    public static final EzyHeader.BackgroundLineConfig m21638g(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(backgroundLineConfig, "<this>");
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = EzyHeader.BackgroundLineConfig.m15288t().m15314r(backgroundLineConfig.m13712b()).m15313q(backgroundLineConfig.m13711a()).m15317u(backgroundLineConfig.m13714d()).m15315s(m21637f(backgroundLineConfig.m13713c())).build();
        AbstractC9979u.m20293f(backgroundLineConfigBuild, "newBuilder()\n        .se…eEnum())\n        .build()");
        return backgroundLineConfigBuild;
    }
}
