package p263u5;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.Intrinsics;
import p272v4.C9765d;

/* renamed from: u5.g */
/* loaded from: classes4.dex */
public abstract class AbstractC9688g {
    /* renamed from: a */
    public static final BackgroundLineConfig.BackgroundLineType m16171a(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        Intrinsics.checkNotNullParameter(backgroundLineTypeEnum, "<this>");
        return BackgroundLineConfig.BackgroundLineType.values()[backgroundLineTypeEnum.getNumber()];
    }

    /* renamed from: b */
    public static final BackgroundLineConfig m16172b(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        Intrinsics.checkNotNullParameter(backgroundLineConfigEntity, "<this>");
        return new BackgroundLineConfig(backgroundLineConfigEntity.getLineColor(), backgroundLineConfigEntity.getLineSpace(), m16171a(backgroundLineConfigEntity.getLineType()), backgroundLineConfigEntity.getLineWidth());
    }

    /* renamed from: c */
    public static final BackgroundLineConfig m16173c(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        int iM8677u = backgroundLineConfig.m8677u();
        float fM8678v = backgroundLineConfig.m8678v();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType = backgroundLineConfig.m8679w();
        Intrinsics.checkNotNullExpressionValue(lineType, "lineType");
        return new BackgroundLineConfig(iM8677u, fM8678v, m16171a(lineType), backgroundLineConfig.m8681y());
    }

    /* renamed from: d */
    public static final BackgroundLineConfigEntity m16174d(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        return new BackgroundLineConfigEntity(0L, backgroundLineConfig.m7069a(), backgroundLineConfig.m7070b(), m16176f(backgroundLineConfig.m7071c()), backgroundLineConfig.m7072d(), 1, null);
    }

    /* renamed from: e */
    public static final MoveConfigEntity m16175e(C9765d c9765d) {
        Intrinsics.checkNotNullParameter(c9765d, "<this>");
        return new MoveConfigEntity(0L, c9765d.m16528g(), c9765d.m16527f(), c9765d.m16522a(), c9765d.m16526e(), c9765d.m16525d(), c9765d.m16523b(), c9765d.m16524c(), 1, null);
    }

    /* renamed from: f */
    public static final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m16176f(BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        Intrinsics.checkNotNullParameter(backgroundLineType, "<this>");
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM8025c = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m8025c(backgroundLineType.ordinal());
        Intrinsics.checkNotNullExpressionValue(backgroundLineTypeEnumM8025c, "forNumber(ordinal)");
        return backgroundLineTypeEnumM8025c;
    }

    /* renamed from: g */
    public static final EzyHeader.BackgroundLineConfig m16177g(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "<this>");
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = EzyHeader.BackgroundLineConfig.m8672z().m8698s(backgroundLineConfig.m7070b()).m8697r(backgroundLineConfig.m7069a()).m8701v(backgroundLineConfig.m7072d()).m8699t(m16176f(backgroundLineConfig.m7071c())).build();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigBuild, "newBuilder()\n        .se…eEnum())\n        .build()");
        return backgroundLineConfigBuild;
    }
}
