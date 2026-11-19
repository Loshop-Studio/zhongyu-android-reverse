package com.zykj.blackboard.core.graphBuilder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p157k5.InterfaceC8276d;
import p169l5.InterfaceC8891e;

@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, m13413d2 = {"Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "graphData", "Ll5/e;", "sourceLoad", "Lg5/a;", "c", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ll5/e;)Lg5/a;", "a", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public enum GraphBuildFactory {
    INSTANCE { // from class: com.zykj.blackboard.core.graphBuilder.GraphBuildFactory.INSTANCE

        /* renamed from: c, reason: from kotlin metadata */
        public final Map buildMap;

        @Override // com.zykj.blackboard.core.graphBuilder.GraphBuildFactory
        /* renamed from: c */
        public AbstractC8053a mo7873c(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC8891e sourceLoad) {
            Intrinsics.checkNotNullParameter(graphData, "graphData");
            Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
            InterfaceC8276d interfaceC8276d = (InterfaceC8276d) this.buildMap.get(graphData.m8379E());
            if (interfaceC8276d != null) {
                return interfaceC8276d.mo13375a(graphData, sourceLoad);
            }
            return null;
        }
    };

    /* synthetic */ GraphBuildFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public abstract AbstractC8053a mo7873c(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC8891e sourceLoad);
}
