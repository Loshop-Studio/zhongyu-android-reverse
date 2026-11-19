package com.zykj.blackboard.core.graphBuilder;

import com.zykj.board.EzyCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p210q4.AbstractC8886a;
import p254u4.InterfaceC9544d;
import p265v4.InterfaceC9668d;

@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, m13558d2 = {"Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "graphData", "Lv4/d;", "sourceLoad", "Lq4/a;", "f", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;", "a", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public enum GraphBuildFactory {
    INSTANCE { // from class: com.zykj.blackboard.core.graphBuilder.GraphBuildFactory.INSTANCE

        /* renamed from: c, reason: from kotlin metadata */
        public final Map buildMap;

        @Override // com.zykj.blackboard.core.graphBuilder.GraphBuildFactory
        /* renamed from: f */
        public AbstractC8886a mo6761f(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9668d sourceLoad) {
            Intrinsics.checkNotNullParameter(graphData, "graphData");
            Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
            InterfaceC9544d interfaceC9544d = (InterfaceC9544d) this.buildMap.get(graphData.m7261B());
            if (interfaceC9544d != null) {
                return interfaceC9544d.mo15976a(graphData, sourceLoad);
            }
            return null;
        }
    };

    /* synthetic */ GraphBuildFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: f */
    public abstract AbstractC8886a mo6761f(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9668d sourceLoad);
}
