package com.zykj.sketch.core.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/sketch/core/data/BoardDataFactory;", "", "()V", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardDataFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int flag = 0;
    public static final int supportLastVersion = 2;
    public static final int version = 5;

    @Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006)"}, m5110d2 = {"Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;", "", "<init>", "()V", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "filterData", "", "deleteSnapShot", "(Ljava/util/List;)Ljava/lang/Iterable;", "content", "newContentList", "Ld6/s;", "parseEventAsTask", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V", "list", "(Ljava/util/List;)Ljava/util/List;", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "path", "parse", "(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;)Ljava/util/List;", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "buildHead", "()Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "data", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;", "head", "buildCommon", "(Ljava/util/List;Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "boardHead", "Lcom/zykj/sketch/SketchHeader$Header;", "(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/SketchHeader$Header;", "", "flag", "I", "getFlag", "()I", "setFlag", "(I)V", "supportLastVersion", "version", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 1;
                iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> filterData) {
            setFlag(0);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = filterData.iterator();
            while (it.hasNext()) {
                BoardDataFactory.INSTANCE.parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
            }
            return arrayList;
        }

        private final List<EzyDrawBoard.ActionContent> filterData(List<EzyDrawBoard.ActionContent> list) {
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(list);
            ListIterator listIterator = arrayListM5218E0.listIterator();
            while (true) {
                boolean z8 = false;
                while (listIterator.hasNext()) {
                    EzyDrawBoard.ActionContent actionContent = (EzyDrawBoard.ActionContent) listIterator.next();
                    EzyDrawBoard.ActionEnum type = actionContent.getType();
                    int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i == 1) {
                        z8 = true;
                    } else if (i != 2) {
                        if (!z8 && actionContent.hasGraphSnapshot()) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                if (((EzyDrawBoard.ActionContent) listIterator.previous()).getType() != EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP) {
                                    listIterator.remove();
                                } else {
                                    if (listIterator.hasNext()) {
                                        listIterator.next();
                                    }
                                    if (listIterator.hasNext()) {
                                        listIterator.next();
                                    }
                                }
                            }
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                        }
                    }
                }
                return arrayListM5218E0;
            }
        }

        private final void parseEventAsTask(EzyDrawBoard.ActionContent content, List<EzyDrawBoard.ActionContent> newContentList) {
            EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
            builderNewBuilder.setType(content.getType());
            EzyDrawBoard.ActionEnum type = content.getType();
            EzyDrawBoard.ActionEnum actionEnum = EzyDrawBoard.ActionEnum.ACTION_TOUCH;
            if (type == actionEnum) {
                builderNewBuilder.setResetData(content.getResetData());
            }
            if (content.hasGraphSnapshot() && (getFlag() == 0 || content.getType() != actionEnum)) {
                System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + getFlag() + "   " + content.getType()));
                builderNewBuilder.setGraphSnapshot(content.getGraphSnapshot());
                builderNewBuilder.setResetData(content.getResetData());
                setFlag(getFlag() + 1);
            }
            builderNewBuilder.setAction(content.getAction());
            StringBuilder sb = new StringBuilder();
            sb.append(builderNewBuilder.getType());
            sb.append(' ');
            sb.append(content.hasGraphSnapshot());
            System.out.println((Object) sb.toString());
            EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
            AbstractC5830k.m5329f(actionContentBuild, "builder.build()");
            newContentList.add(actionContentBuild);
        }

        @NotNull
        public final EzyDrawBoard.DrawBoard buildCommon(@NotNull List<EzyDrawBoard.ActionContent> data, @NotNull EzyDrawBoard.BoardHead head) {
            AbstractC5830k.m5330g(data, "data");
            AbstractC5830k.m5330g(head, "head");
            EzyDrawBoard.BoardBody.Builder builderNewBuilder = EzyDrawBoard.BoardBody.newBuilder();
            builderNewBuilder.addAllActionContent(data);
            EzyDrawBoard.BoardBody boardBodyBuild = builderNewBuilder.build();
            EzyDrawBoard.DrawBoard.Builder builderNewBuilder2 = EzyDrawBoard.DrawBoard.newBuilder();
            builderNewBuilder2.setBoardHead(head);
            builderNewBuilder2.setBoardBody(boardBodyBuild);
            EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder2.build();
            AbstractC5830k.m5329f(drawBoardBuild, "drawBoard.build()");
            return drawBoardBuild;
        }

        @NotNull
        public final EzyDrawBoard.BoardHead.Builder buildHead() {
            EzyDrawBoard.BoardHead.Builder builderNewBuilder = EzyDrawBoard.BoardHead.newBuilder();
            builderNewBuilder.setVersion(5);
            builderNewBuilder.setType(1);
            builderNewBuilder.setCreateDate(new Date().getTime());
            builderNewBuilder.setAuthor("");
            return builderNewBuilder;
        }

        public final int getFlag() {
            return BoardDataFactory.flag;
        }

        @Nullable
        public final List<EzyDrawBoard.ActionContent> parse(@NotNull EzyDrawBoard.DrawBoard path) {
            AbstractC5830k.m5330g(path, "path");
            return path.getBoardBody().getActionContentList();
        }

        public final void setFlag(int i) {
            BoardDataFactory.flag = i;
        }

        private Companion() {
        }

        @NotNull
        public final SketchHeader.Header buildCommon(@NotNull EzyDrawBoard.BoardHead boardHead) {
            AbstractC5830k.m5330g(boardHead, "boardHead");
            SketchHeader.Header.Builder builderNewBuilder = SketchHeader.Header.newBuilder();
            builderNewBuilder.setVersion(boardHead.getVersion());
            builderNewBuilder.setWidth(boardHead.getWidth());
            builderNewBuilder.setHeight(boardHead.getHeight());
            builderNewBuilder.setCreateDate(boardHead.getCreateDate());
            builderNewBuilder.setUpdateDate(boardHead.getUpdateDate());
            builderNewBuilder.setAuthor(boardHead.getAuthor());
            builderNewBuilder.setType(builderNewBuilder.getType());
            SketchHeader.Header headerBuild = builderNewBuilder.build();
            AbstractC5830k.m5329f(headerBuild, "header.build()");
            return headerBuild;
        }
    }
}
