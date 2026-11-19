package com.zykj.blackboard.core.graphBuilder;

import ba.AbstractC5179a;
import com.zykj.board.EzyCommand;
import ga.InterfaceC9284d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p149fa.InterfaceC9212d;

/* loaded from: classes5.dex */
public enum GraphBuildFactory {
    INSTANCE { // from class: com.zykj.blackboard.core.graphBuilder.GraphBuildFactory.INSTANCE

        /* renamed from: e */
        public final Map f18560e;

        @Override // com.zykj.blackboard.core.graphBuilder.GraphBuildFactory
        /* renamed from: c */
        public AbstractC5179a mo14497c(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9284d sourceLoad) {
            AbstractC9979u.m20294g(graphData, "graphData");
            AbstractC9979u.m20294g(sourceLoad, "sourceLoad");
            InterfaceC9212d interfaceC9212d = (InterfaceC9212d) this.f18560e.get(graphData.m14996A());
            if (interfaceC9212d != null) {
                return interfaceC9212d.mo18118a(graphData, sourceLoad);
            }
            return null;
        }
    };

    /* synthetic */ GraphBuildFactory(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: c */
    public abstract AbstractC5179a mo14497c(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9284d interfaceC9284d);
}
